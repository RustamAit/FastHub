package kz.example.android.fasthub.repository.issue;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lkz/example/android/fasthub/repository/issue/IssueRepositoryImpl;", "Lkz/example/android/fasthub/repository/issue/IssueRepository;", "issuesService", "Lkz/example/android/fasthub/datasource/api/IssuesService;", "sharedPref", "Lkz/example/android/fasthub/datasource/sharedPref/LocalSharedPref;", "(Lkz/example/android/fasthub/datasource/api/IssuesService;Lkz/example/android/fasthub/datasource/sharedPref/LocalSharedPref;)V", "getIssuesService", "()Lkz/example/android/fasthub/datasource/api/IssuesService;", "getSharedPref", "()Lkz/example/android/fasthub/datasource/sharedPref/LocalSharedPref;", "getIssues", "Lio/reactivex/Single;", "", "Lkz/example/android/fasthub/data/domain/Issue;", "filter", "", "getPullRequests", "app_debug"})
public final class IssueRepositoryImpl implements kz.example.android.fasthub.repository.issue.IssueRepository {
    @org.jetbrains.annotations.NotNull()
    private final kz.example.android.fasthub.datasource.api.IssuesService issuesService = null;
    @org.jetbrains.annotations.NotNull()
    private final kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref sharedPref = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<kz.example.android.fasthub.data.domain.Issue>> getIssues(@org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<kz.example.android.fasthub.data.domain.Issue>> getPullRequests(@org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kz.example.android.fasthub.datasource.api.IssuesService getIssuesService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref getSharedPref() {
        return null;
    }
    
    public IssueRepositoryImpl(@org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.datasource.api.IssuesService issuesService, @org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.datasource.sharedPref.LocalSharedPref sharedPref) {
        super();
    }
}