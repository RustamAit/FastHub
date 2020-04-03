package kz.example.android.fasthub.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import kz.example.android.fasthub.R
import kz.example.android.fasthub.core.AuthStatus
import kz.example.android.fasthub.ui.signIn.AuthViewModel
import kz.example.android.fasthub.ui.signIn.SignInActivity
import kz.example.android.fasthub.ui.MainScreen.MainScreenActivity
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    val authViewModel: AuthViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        authViewModel.checkAuthCredetials()
        authViewModel.getAuthStatusLiveData().observe(this, Observer {
            if(it == AuthStatus.AUTHORIZED){
                startActivity(Intent(this, MainScreenActivity::class.java).addFlags(
                    Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK))
            }else{
                startActivity(Intent(this, SignInActivity::class.java).addFlags(
                    Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK))
                //startActivity(Intent(this, SignInActivity::class.java))

            }
            finish()
        })

    }
}
