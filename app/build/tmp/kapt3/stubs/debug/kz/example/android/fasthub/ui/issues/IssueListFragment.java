package kz.example.android.fasthub.ui.issues;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0016\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lkz/example/android/fasthub/ui/issues/IssueListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "issueListObserver", "Landroidx/lifecycle/Observer;", "", "Lkz/example/android/fasthub/data/domain/Issue;", "issueType", "", "issueViewModel", "Lkz/example/android/fasthub/ui/issues/IssueViewModel;", "getIssueViewModel", "()Lkz/example/android/fasthub/ui/issues/IssueViewModel;", "issueViewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "showEmptyState", "showList", "list", "Companion", "app_debug"})
public final class IssueListFragment extends androidx.fragment.app.Fragment {
    private java.lang.String issueType;
    private final kotlin.Lazy issueViewModel$delegate = null;
    private final androidx.lifecycle.Observer<java.util.List<kz.example.android.fasthub.data.domain.Issue>> issueListObserver = null;
    public static final kz.example.android.fasthub.ui.issues.IssueListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final kz.example.android.fasthub.ui.issues.IssueViewModel getIssueViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showEmptyState() {
    }
    
    private final void showList(java.util.List<kz.example.android.fasthub.data.domain.Issue> list) {
    }
    
    public IssueListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kz.example.android.fasthub.ui.issues.IssueListFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.lang.String issueType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lkz/example/android/fasthub/ui/issues/IssueListFragment$Companion;", "", "()V", "newInstance", "Lkz/example/android/fasthub/ui/issues/IssueListFragment;", "issueType", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final kz.example.android.fasthub.ui.issues.IssueListFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String issueType) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}