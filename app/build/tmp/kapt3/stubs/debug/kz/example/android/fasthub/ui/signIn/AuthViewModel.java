package kz.example.android.fasthub.ui.signIn;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0006\u0010\u0010\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u000bH\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lkz/example/android/fasthub/ui/signIn/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "sessionRepository", "Lkz/example/android/fasthub/repository/session/SessionRepository;", "(Lkz/example/android/fasthub/repository/session/SessionRepository;)V", "authStatusLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkz/example/android/fasthub/core/AuthStatus;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "checkAuthCredetials", "", "username", "", "password", "getAuthStatusLiveData", "logout", "onCleared", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<kz.example.android.fasthub.core.AuthStatus> authStatusLiveData = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final kz.example.android.fasthub.repository.session.SessionRepository sessionRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kz.example.android.fasthub.core.AuthStatus> getAuthStatusLiveData() {
        return null;
    }
    
    public final void checkAuthCredetials(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void checkAuthCredetials() {
    }
    
    public final void logout() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.repository.session.SessionRepository sessionRepository) {
        super();
    }
}