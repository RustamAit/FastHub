package kz.example.android.fasthub.repository.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\n\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH&\u00a8\u0006\u000e"}, d2 = {"Lkz/example/android/fasthub/repository/session/SessionRepository;", "", "checkAuthCredetials", "Lio/reactivex/Single;", "Lkz/example/android/fasthub/core/AuthStatus;", "clearUserData", "", "getUserPassword", "", "getUsername", "setUserPassword", "password", "setUsername", "username", "app_debug"})
public abstract interface SessionRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<kz.example.android.fasthub.core.AuthStatus> checkAuthCredetials();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUsername();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUserPassword();
    
    public abstract void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract void setUserPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    public abstract void clearUserData();
}