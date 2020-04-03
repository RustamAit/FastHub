package kz.example.android.fasthub.core.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lkz/example/android/fasthub/core/session/SessionControllerImpl;", "Lkz/example/android/fasthub/core/session/SessionController;", "()V", "authorizationListener", "Lkz/example/android/fasthub/core/session/AuthorizationListener;", "invalidate", "", "invalidateAuthListener", "onInternetUnavailable", "onRequestLimitExceed", "onServerError", "setAuthListener", "authListener", "app_debug"})
public final class SessionControllerImpl implements kz.example.android.fasthub.core.session.SessionController {
    private kz.example.android.fasthub.core.session.AuthorizationListener authorizationListener;
    
    @java.lang.Override()
    public void setAuthListener(@org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.core.session.AuthorizationListener authListener) {
    }
    
    @java.lang.Override()
    public void invalidateAuthListener() {
    }
    
    @java.lang.Override()
    public void onInternetUnavailable() {
    }
    
    @java.lang.Override()
    public void invalidate() {
    }
    
    @java.lang.Override()
    public void onRequestLimitExceed() {
    }
    
    @java.lang.Override()
    public void onServerError() {
    }
    
    public SessionControllerImpl() {
        super();
    }
}