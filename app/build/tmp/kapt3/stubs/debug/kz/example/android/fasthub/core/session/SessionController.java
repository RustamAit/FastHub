package kz.example.android.fasthub.core.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lkz/example/android/fasthub/core/session/SessionController;", "", "invalidate", "", "invalidateAuthListener", "onInternetUnavailable", "onRequestLimitExceed", "onServerError", "setAuthListener", "authListener", "Lkz/example/android/fasthub/core/session/AuthorizationListener;", "app_debug"})
public abstract interface SessionController {
    
    public abstract void setAuthListener(@org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.core.session.AuthorizationListener authListener);
    
    public abstract void invalidateAuthListener();
    
    public abstract void onInternetUnavailable();
    
    public abstract void invalidate();
    
    public abstract void onServerError();
    
    public abstract void onRequestLimitExceed();
}