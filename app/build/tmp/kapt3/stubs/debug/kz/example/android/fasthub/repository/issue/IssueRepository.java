package kz.example.android.fasthub.repository.issue;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lkz/example/android/fasthub/repository/issue/IssueRepository;", "", "getIssues", "Lio/reactivex/Single;", "", "Lkz/example/android/fasthub/data/domain/Issue;", "filter", "", "getPullRequests", "app_debug"})
public abstract interface IssueRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<kz.example.android.fasthub.data.domain.Issue>> getIssues(@org.jetbrains.annotations.NotNull()
    java.lang.String filter);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<kz.example.android.fasthub.data.domain.Issue>> getPullRequests(@org.jetbrains.annotations.NotNull()
    java.lang.String filter);
}