package kz.example.android.fasthub.repository.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lkz/example/android/fasthub/repository/session/SessionRepositoryImpl;", "Lkz/example/android/fasthub/repository/session/SessionRepository;", "userService", "Lkz/example/android/fasthub/datasource/api/UserService;", "sharedPref", "Lkz/example/android/fasthub/datasource/sharedPref/LocalSharedPref;", "(Lkz/example/android/fasthub/datasource/api/UserService;Lkz/example/android/fasthub/datasource/sharedPref/LocalSharedPref;)V", "checkAuthCredetials", "Lio/reactivex/Single;", "Lkz/example/android/fasthub/core/AuthStatus;", "clearUserData", "", "getUserPassword", "", "getUsername", "setUserPassword", "password", "setUsername", "username", "app_debug"})
public final class SessionRepositoryImpl implements kz.example.android.fasthub.repository.session.SessionRepository {
    private final kz.example.android.fasthub.datasource.api.UserService userService = null;
    private final kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref sharedPref = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kz.example.android.fasthub.core.AuthStatus> checkAuthCredetials() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserPassword() {
        return null;
    }
    
    @java.lang.Override()
    public void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @java.lang.Override()
    public void setUserPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @java.lang.Override()
    public void clearUserData() {
    }
    
    public SessionRepositoryImpl(@org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.datasource.api.UserService userService, @org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref sharedPref) {
        super();
    }
}