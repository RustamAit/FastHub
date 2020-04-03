package kz.example.android.fasthub.core.interceptors;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkz/example/android/fasthub/core/interceptors/AuthorizationInterceptor;", "Lokhttp3/Interceptor;", "session", "Lkz/example/android/fasthub/core/session/SessionController;", "(Lkz/example/android/fasthub/core/session/SessionController;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isInternetAvailable", "", "app_debug"})
public abstract class AuthorizationInterceptor implements okhttp3.Interceptor {
    private final kz.example.android.fasthub.core.session.SessionController session = null;
    
    public abstract boolean isInternetAvailable();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    public AuthorizationInterceptor(@org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.core.session.SessionController session) {
        super();
    }
}