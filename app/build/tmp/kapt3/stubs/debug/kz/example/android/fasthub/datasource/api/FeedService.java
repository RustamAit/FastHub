package kz.example.android.fasthub.datasource.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lkz/example/android/fasthub/datasource/api/FeedService;", "", "getUserFeed", "Lio/reactivex/Single;", "", "Lkz/example/android/fasthub/data/api/FeedEventFromApi;", "app_debug"})
public abstract interface FeedService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/RustamAit/received_events")
    public abstract io.reactivex.Single<java.util.List<kz.example.android.fasthub.data.api.FeedEventFromApi>> getUserFeed();
}