package kz.example.android.fasthub.data.api

data class IssueFromApi(
    val title: String?,
    val created_at: String?,
    val repository: RepoFromApi,
    val pull_request: PullRequest?
)

data class PullRequest(
    val diff_url: String,
    val html_url: String,
    val patch_url: String,
    val url: String
)