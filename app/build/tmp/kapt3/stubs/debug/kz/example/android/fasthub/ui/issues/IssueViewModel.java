package kz.example.android.fasthub.ui.issues;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\t\u00a8\u0006\u001b"}, d2 = {"Lkz/example/android/fasthub/ui/issues/IssueViewModel;", "Landroidx/lifecycle/ViewModel;", "issueRepository", "Lkz/example/android/fasthub/repository/issue/IssueRepository;", "(Lkz/example/android/fasthub/repository/issue/IssueRepository;)V", "assignedIssuesCountLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAssignedIssuesCountLiveData", "()Landroidx/lifecycle/MutableLiveData;", "assignedIssuesLiveData", "", "Lkz/example/android/fasthub/data/domain/Issue;", "getAssignedIssuesLiveData", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "createdIssuesCountLiveData", "getCreatedIssuesCountLiveData", "createdIssuesLiveData", "getCreatedIssuesLiveData", "mentionedIssuesCountLiveData", "getMentionedIssuesCountLiveData", "mentionedIssuesLiveData", "getMentionedIssuesLiveData", "fetchData", "", "onCleared", "app_debug"})
public final class IssueViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<kz.example.android.fasthub.data.domain.Issue>> createdIssuesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<kz.example.android.fasthub.data.domain.Issue>> assignedIssuesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<kz.example.android.fasthub.data.domain.Issue>> mentionedIssuesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> createdIssuesCountLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> assignedIssuesCountLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> mentionedIssuesCountLiveData = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final kz.example.android.fasthub.repository.issue.IssueRepository issueRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<kz.example.android.fasthub.data.domain.Issue>> getCreatedIssuesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<kz.example.android.fasthub.data.domain.Issue>> getAssignedIssuesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<kz.example.android.fasthub.data.domain.Issue>> getMentionedIssuesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCreatedIssuesCountLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAssignedIssuesCountLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getMentionedIssuesCountLiveData() {
        return null;
    }
    
    public final void fetchData() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public IssueViewModel(@org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.repository.issue.IssueRepository issueRepository) {
        super();
    }
}