package kz.example.android.fasthub.ui.signIn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_sign_in_actvity.*
import kz.example.android.fasthub.R
import kz.example.android.fasthub.core.AuthStatus
import kz.example.android.fasthub.ui.MainScreen.MainScreenActivity
import org.koin.android.viewmodel.ext.android.viewModel

class SignInActivity : AppCompatActivity() {

    val authViewModel: AuthViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_actvity)
        showSendBtn()
        sendBtn?.setOnClickListener {
            authViewModel.checkAuthCredetials(usernameEditText.text.toString(),passwordEditText.text.toString())
            showProgressBar()
        }

        authViewModel.getAuthStatusLiveData().observe(this, Observer {
            if(it == AuthStatus.UNATHORIZED){
                showAlert("Что то пошло не так","Пожалуйста проверьте заполненые данные либо интернет(не хватило времени на проверку интернета)")
                showSendBtn()
            }else{
                startActivity(Intent(this, MainScreenActivity::class.java).addFlags(
                    Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK))
            }
        })
    }

    private fun showProgressBar(){
        sendBtn?.visibility = Button.GONE
        progressBar?.visibility = ProgressBar.VISIBLE
    }

    private fun showSendBtn(){
        sendBtn?.visibility = Button.VISIBLE
        progressBar?.visibility = ProgressBar.GONE
    }

    private fun showAlert(title: String, message: String){
        AlertDialog.Builder(this)
            .apply {
                setTitle(title)
                setMessage(message)
                setNegativeButton("Ок") { dialog, _ ->
                    dialog.cancel()
                }
                show()
            }
    }
}
