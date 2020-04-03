package kz.example.android.fasthub.datasource.sharedPref;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&\u00a8\u0006\f"}, d2 = {"Lkz/example/android/fasthub/datasource/sharedPref/LocalSharedPref;", "", "clearPassword", "", "clearUsername", "getPassword", "", "getUsername", "setPassword", "password", "setUsername", "username", "app_debug"})
public abstract interface LocalSharedPref {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUsername();
    
    public abstract void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract void clearUsername();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getPassword();
    
    public abstract void setPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    public abstract void clearPassword();
}