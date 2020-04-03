package kz.example.android.fasthub.repository.feedEvent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lkz/example/android/fasthub/repository/feedEvent/FeedEventRepository;", "", "getCurrentUserFeed", "Lio/reactivex/Single;", "", "Lkz/example/android/fasthub/data/domain/FeedEvent;", "app_debug"})
public abstract interface FeedEventRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract io.reactivex.Single<java.util.List<kz.example.android.fasthub.data.domain.FeedEvent>> getCurrentUserFeed();
}