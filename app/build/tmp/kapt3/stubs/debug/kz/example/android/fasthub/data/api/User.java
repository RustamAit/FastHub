package kz.example.android.fasthub.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b_\b\u0086\b\u0018\u00002\u00020\u0001B\u00b5\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0007\u0012\u0006\u0010(\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u00a2\u0006\u0002\u0010,J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0001H\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010b\u001a\u00020\u0001H\u00c6\u0003J\t\u0010c\u001a\u00020\u0001H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0001H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u0007H\u00c6\u0003J\t\u0010i\u001a\u00020\u001dH\u00c6\u0003J\t\u0010j\u001a\u00020\u0007H\u00c6\u0003J\t\u0010k\u001a\u00020\u0007H\u00c6\u0003J\t\u0010l\u001a\u00020\u0007H\u00c6\u0003J\t\u0010m\u001a\u00020\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020$H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0007H\u00c6\u0003J\t\u0010t\u001a\u00020$H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\t\u0010x\u001a\u00020\u0007H\u00c6\u0003J\t\u0010y\u001a\u00020\u0001H\u00c6\u0003J\t\u0010z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010{\u001a\u00020\u0007H\u00c6\u0003J\t\u0010|\u001a\u00020\u0003H\u00c6\u0003J\t\u0010}\u001a\u00020\u0003H\u00c6\u0003J\u0085\u0003\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00072\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u007f\u001a\u00020$2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0007H\u00d6\u0001J\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010.R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010.R\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0011\u0010\u0013\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010.R\u0011\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0011\u0010\u0016\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010.R\u0011\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010.R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0011\u0010\u001b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0011\u0010\u001e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0011\u0010\u001f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0011\u0010 \u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010.R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010.R\u0011\u0010#\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010.R\u0011\u0010&\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010.R\u0011\u0010\'\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0011\u0010(\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010PR\u0011\u0010)\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010.R\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010.R\u0011\u0010+\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010.\u00a8\u0006\u0083\u0001"}, d2 = {"Lkz/example/android/fasthub/data/api/User;", "", "avatar_url", "", "bio", "blog", "collaborators", "", "company", "created_at", "disk_usage", "email", "events_url", "followers", "followers_url", "following", "following_url", "gists_url", "gravatar_id", "hireable", "html_url", "id", "location", "login", "name", "node_id", "organizations_url", "owned_private_repos", "plan", "Lkz/example/android/fasthub/data/api/Plan;", "private_gists", "public_gists", "public_repos", "received_events_url", "repos_url", "site_admin", "", "starred_url", "subscriptions_url", "total_private_repos", "two_factor_authentication", "type", "updated_at", "url", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILkz/example/android/fasthub/data/api/Plan;IIILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar_url", "()Ljava/lang/String;", "getBio", "()Ljava/lang/Object;", "getBlog", "getCollaborators", "()I", "getCompany", "getCreated_at", "getDisk_usage", "getEmail", "getEvents_url", "getFollowers", "getFollowers_url", "getFollowing", "getFollowing_url", "getGists_url", "getGravatar_id", "getHireable", "getHtml_url", "getId", "getLocation", "getLogin", "getName", "getNode_id", "getOrganizations_url", "getOwned_private_repos", "getPlan", "()Lkz/example/android/fasthub/data/api/Plan;", "getPrivate_gists", "getPublic_gists", "getPublic_repos", "getReceived_events_url", "getRepos_url", "getSite_admin", "()Z", "getStarred_url", "getSubscriptions_url", "getTotal_private_repos", "getTwo_factor_authentication", "getType", "getUpdated_at", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class User {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String avatar_url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object bio = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String blog = null;
    private final int collaborators = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object company = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_at = null;
    private final int disk_usage = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String events_url = null;
    private final int followers = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String followers_url = null;
    private final int following = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String following_url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gists_url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gravatar_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object hireable = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String html_url = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object location = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String login = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String node_id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String organizations_url = null;
    private final int owned_private_repos = 0;
    @org.jetbrains.annotations.NotNull()
    private final kz.example.android.fasthub.data.api.Plan plan = null;
    private final int private_gists = 0;
    private final int public_gists = 0;
    private final int public_repos = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String received_events_url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String repos_url = null;
    private final boolean site_admin = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String starred_url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subscriptions_url = null;
    private final int total_private_repos = 0;
    private final boolean two_factor_authentication = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updated_at = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatar_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBio() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlog() {
        return null;
    }
    
    public final int getCollaborators() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    public final int getDisk_usage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEvents_url() {
        return null;
    }
    
    public final int getFollowers() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFollowers_url() {
        return null;
    }
    
    public final int getFollowing() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFollowing_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGists_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGravatar_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getHireable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHtml_url() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNode_id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrganizations_url() {
        return null;
    }
    
    public final int getOwned_private_repos() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kz.example.android.fasthub.data.api.Plan getPlan() {
        return null;
    }
    
    public final int getPrivate_gists() {
        return 0;
    }
    
    public final int getPublic_gists() {
        return 0;
    }
    
    public final int getPublic_repos() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceived_events_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRepos_url() {
        return null;
    }
    
    public final boolean getSite_admin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStarred_url() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubscriptions_url() {
        return null;
    }
    
    public final int getTotal_private_repos() {
        return 0;
    }
    
    public final boolean getTwo_factor_authentication() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    public User(@org.jetbrains.annotations.NotNull()
    java.lang.String avatar_url, @org.jetbrains.annotations.NotNull()
    java.lang.Object bio, @org.jetbrains.annotations.NotNull()
    java.lang.String blog, int collaborators, @org.jetbrains.annotations.NotNull()
    java.lang.Object company, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, int disk_usage, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String events_url, int followers, @org.jetbrains.annotations.NotNull()
    java.lang.String followers_url, int following, @org.jetbrains.annotations.NotNull()
    java.lang.String following_url, @org.jetbrains.annotations.NotNull()
    java.lang.String gists_url, @org.jetbrains.annotations.NotNull()
    java.lang.String gravatar_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object hireable, @org.jetbrains.annotations.NotNull()
    java.lang.String html_url, int id, @org.jetbrains.annotations.NotNull()
    java.lang.Object location, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.Object name, @org.jetbrains.annotations.NotNull()
    java.lang.String node_id, @org.jetbrains.annotations.NotNull()
    java.lang.String organizations_url, int owned_private_repos, @org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.data.api.Plan plan, int private_gists, int public_gists, int public_repos, @org.jetbrains.annotations.NotNull()
    java.lang.String received_events_url, @org.jetbrains.annotations.NotNull()
    java.lang.String repos_url, boolean site_admin, @org.jetbrains.annotations.NotNull()
    java.lang.String starred_url, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriptions_url, int total_private_repos, boolean two_factor_authentication, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    public final int component24() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kz.example.android.fasthub.data.api.Plan component25() {
        return null;
    }
    
    public final int component26() {
        return 0;
    }
    
    public final int component27() {
        return 0;
    }
    
    public final int component28() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    public final boolean component31() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final boolean component35() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kz.example.android.fasthub.data.api.User copy(@org.jetbrains.annotations.NotNull()
    java.lang.String avatar_url, @org.jetbrains.annotations.NotNull()
    java.lang.Object bio, @org.jetbrains.annotations.NotNull()
    java.lang.String blog, int collaborators, @org.jetbrains.annotations.NotNull()
    java.lang.Object company, @org.jetbrains.annotations.NotNull()
    java.lang.String created_at, int disk_usage, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String events_url, int followers, @org.jetbrains.annotations.NotNull()
    java.lang.String followers_url, int following, @org.jetbrains.annotations.NotNull()
    java.lang.String following_url, @org.jetbrains.annotations.NotNull()
    java.lang.String gists_url, @org.jetbrains.annotations.NotNull()
    java.lang.String gravatar_id, @org.jetbrains.annotations.NotNull()
    java.lang.Object hireable, @org.jetbrains.annotations.NotNull()
    java.lang.String html_url, int id, @org.jetbrains.annotations.NotNull()
    java.lang.Object location, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.Object name, @org.jetbrains.annotations.NotNull()
    java.lang.String node_id, @org.jetbrains.annotations.NotNull()
    java.lang.String organizations_url, int owned_private_repos, @org.jetbrains.annotations.NotNull()
    kz.example.android.fasthub.data.api.Plan plan, int private_gists, int public_gists, int public_repos, @org.jetbrains.annotations.NotNull()
    java.lang.String received_events_url, @org.jetbrains.annotations.NotNull()
    java.lang.String repos_url, boolean site_admin, @org.jetbrains.annotations.NotNull()
    java.lang.String starred_url, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriptions_url, int total_private_repos, boolean two_factor_authentication, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_at, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}