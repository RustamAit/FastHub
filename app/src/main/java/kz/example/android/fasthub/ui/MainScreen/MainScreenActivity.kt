package kz.example.android.fasthub.ui.MainScreen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.ui.*
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main_screen.*
import kotlinx.android.synthetic.main.app_bar_main_screen.*
import kz.example.android.fasthub.R
import kz.example.android.fasthub.core.session.AuthorizationListener
import kz.example.android.fasthub.core.setupWithNavController
import kz.example.android.fasthub.ui.BottomSheets.LayoutBottomSheetInteractionListener
import kz.example.android.fasthub.ui.BottomSheets.LogoutBottomSheetFragment
import kz.example.android.fasthub.ui.signIn.AuthViewModel
import kz.example.android.fasthub.ui.signIn.SignInActivity
import org.koin.android.viewmodel.ext.android.viewModel

class MainScreenActivity : AppCompatActivity(), LayoutBottomSheetInteractionListener,
    AuthorizationListener {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private var currentNavController: LiveData<NavController>? = null

    private val authViewModel: AuthViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        setSupportActionBar(toolbar)
        setupButtomNav()
        setupDrawer()

    }

    private fun setupButtomNav(){
        val navGraphIds = listOf(
            R.navigation.feeds_navigation,R.navigation.issues_navigation,R.navigation.pull_requests_navigation
        )

        val controllerLiveData = bottom_navigation.setupWithNavController(
            navGraphIds,supportFragmentManager,R.id.fragmentContainer,intent
        )

        controllerLiveData.observe(this, Observer {
            appBarConfiguration = AppBarConfiguration(
                it.graph,
                drawer_layout
            )
            setupActionBarWithNavController(it, drawer_layout)
        })

        currentNavController = controllerLiveData
    }

    private fun setupDrawer(){
        navTabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
                Log.d("tab_position",tab?.position.toString())
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Log.d("tab_position",tab?.position.toString())
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(tab?.position == 0){
                    nestedNavView.menu.clear()
                    nestedNavView.inflateMenu(R.menu.activity_main_screen_bottom_nav)
                }else{
                    nestedNavView.menu.clear()
                    nestedNavView.inflateMenu(R.menu.profile_menu)
                }
            }
        }
        )
        nestedNavView?.setNavigationItemSelectedListener {
            if(it.itemId == R.id.navExit){
                showLogoutFragment()
            }
            false
        }
    }

    override fun logout() {
        authViewModel.logout()
        startActivity(
            Intent(this, SignInActivity::class.java).addFlags(
                Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK))
    }

    private fun showLogoutFragment(){
        val bottomSheetFragment = LogoutBottomSheetFragment()
        bottomSheetFragment.show(supportFragmentManager, "aaaaa")
        bottomSheetFragment.tag
    }

    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false
    }

    override fun onUserLoggedOut() {
        AlertDialog.Builder(this)
            .apply {
                setTitle("401")
                setMessage("Ошибка авторизации")
                setNegativeButton("Ок") { dialog, _ ->
                    dialog.cancel()
                    logout()

                }
                show()
            }
    }

    override fun onNetworkFail() {
        AlertDialog.Builder(this)
            .apply {
                setTitle("No internet")
                setMessage("Нет интернета")
                setNegativeButton("Ок") { dialog, _ ->
                    dialog.cancel()
                }
                show()
            }
    }

    override fun onServerError() {
        AlertDialog.Builder(this)
            .apply {
                setTitle("500")
                setMessage("ошибка на сервере")
                setNegativeButton("Ок") { dialog, _ ->
                    dialog.cancel()
                }
                show()
            }
    }

    override fun onRequestLimitExceed() {
        AlertDialog.Builder(this)
            .apply {
                setTitle("Превышен лимит запросов")
                setMessage("У апишки стоит лимит на basic auth, максимум 60 запросов в час")
                setNegativeButton("Ок") { dialog, _ ->
                    dialog.cancel()
                    logout()
                }
                show()
            }
    }
}
