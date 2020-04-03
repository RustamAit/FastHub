package kz.example.android.fasthub.ui.signIn

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kz.example.android.fasthub.core.AuthStatus
import kz.example.android.fasthub.repository.session.SessionRepository

class AuthViewModel(private val sessionRepository: SessionRepository): ViewModel(){

    private val authStatusLiveData: MutableLiveData<AuthStatus> = MutableLiveData()

    private val compositeDisposable = CompositeDisposable()

    fun getAuthStatusLiveData(): MutableLiveData<AuthStatus> {
        return authStatusLiveData
    }

    fun checkAuthCredetials(username: String, password: String) {
        sessionRepository.setUsername(username)
        sessionRepository.setUserPassword(password)

        compositeDisposable.add(
            sessionRepository.checkAuthCredetials()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { status ->
                    authStatusLiveData.value = status
                }
        )

    }

    fun checkAuthCredetials() {
        compositeDisposable.add(
            sessionRepository.checkAuthCredetials()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { status ->
                    authStatusLiveData.value = status
                }
        )
    }

    fun logout(){
        sessionRepository.clearUserData()
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }



}