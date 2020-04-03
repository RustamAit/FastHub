package kz.example.android.fasthub.repository.feedEvent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkz/example/android/fasthub/repository/feedEvent/FeedEventRepositoryImpl;", "Lkz/example/android/fasthub/repository/feedEvent/FeedEventRepository;", "feedService", "Lkz/example/android/fasthub/datasource/api/FeedService;", "sharedPref", "Lkz/example/android/fasthub/datasource/sharedPref/LocalSharedPref;", "(Lkz/example/android/fasthub/datasource/api/FeedService;Lkz/example/android/fasthub/datasource/sharedPref/LocalSharedPref;)V", "getCurrentUserFeed", "Lio/reactivex/Single;", "", "Lkz/example/android/fasthub/data/domain/FeedEvent;", "app_debug"})
public final class FeedEventRepositoryImpl implements kz.example.android.fasthub.repository.feedEvent.FeedEventRepository {
    private final kz.example.android.fasthub.datasource.api.FeedService feedService = null;
    private final kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref sharedPref = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<kz.example.android.fasthub.data.domain.FeedEvent>> getCurrentUserFeed() {
        return null;
    }
    
    public FeedEventRepositoryImpl(@org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.datasource.api.FeedService feedService, @org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref sharedPref) {
        super();
    }
}