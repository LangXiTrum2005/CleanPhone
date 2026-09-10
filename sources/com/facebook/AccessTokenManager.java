package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.applovin.impl.Z;
import com.facebook.internal.Utility;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/AccessTokenManager;", "", "Companion", "FacebookRefreshTokenInfo", "InstagramRefreshTokenInfo", "RefreshResult", "RefreshTokenInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AccessTokenManager {
    public static AccessTokenManager f;
    public static final Companion g = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AccessToken f15879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f15880b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Date f15881c = new Date(0);
    public final LocalBroadcastManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AccessTokenCache f15882e;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/facebook/AccessTokenManager$Companion;", "", "", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "", "TOKEN_EXTEND_RETRY_SECONDS", "I", "TOKEN_EXTEND_THRESHOLD_SECONDS", "Lcom/facebook/AccessTokenManager;", "instanceField", "Lcom/facebook/AccessTokenManager;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public final AccessTokenManager a() {
            AccessTokenManager accessTokenManager;
            AccessTokenManager accessTokenManager2 = AccessTokenManager.f;
            if (accessTokenManager2 != null) {
                return accessTokenManager2;
            }
            synchronized (this) {
                accessTokenManager = AccessTokenManager.f;
                if (accessTokenManager == null) {
                    LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.b());
                    Intrinsics.e(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
                    AccessTokenManager accessTokenManager3 = new AccessTokenManager(localBroadcastManager, new AccessTokenCache());
                    AccessTokenManager.f = accessTokenManager3;
                    accessTokenManager = accessTokenManager3;
                }
            }
            return accessTokenManager;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/AccessTokenManager$FacebookRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class FacebookRefreshTokenInfo implements RefreshTokenInfo {
        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public final String a() {
            return "fb_extend_sso_token";
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public final String b() {
            return "oauth/access_token";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/AccessTokenManager$InstagramRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class InstagramRefreshTokenInfo implements RefreshTokenInfo {
        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public final String a() {
            return "ig_refresh_token";
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        public final String b() {
            return "refresh_access_token";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshResult;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class RefreshResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15885c;
        public Long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f15886e;
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface RefreshTokenInfo {
        String a();

        String b();
    }

    public AccessTokenManager(LocalBroadcastManager localBroadcastManager, AccessTokenCache accessTokenCache) {
        this.d = localBroadcastManager;
        this.f15882e = accessTokenCache;
    }

    public final void a() {
        final AccessToken accessToken = this.f15879a;
        if (accessToken != null && this.f15880b.compareAndSet(false, true)) {
            this.f15881c = new Date();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            final HashSet hashSet3 = new HashSet();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final RefreshResult refreshResult = new RefreshResult();
            GraphRequest.Callback callback = new GraphRequest.Callback() { // from class: com.facebook.AccessTokenManager$refreshCurrentAccessTokenImpl$batch$1
                /* JADX WARN: Code duplicated, block: B:30:0x0082  */
                @Override // com.facebook.GraphRequest.Callback
                public final void a(GraphResponse graphResponse) {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = graphResponse.f15950a;
                    if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) == null) {
                        return;
                    }
                    atomicBoolean.set(true);
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("permission");
                            String status = jSONObjectOptJSONObject.optString("status");
                            if (!Utility.C(strOptString) && !Utility.C(status)) {
                                Intrinsics.e(status, "status");
                                Locale locale = Locale.US;
                                String strP = Z.p(locale, "Locale.US", status, locale, "(this as java.lang.String).toLowerCase(locale)");
                                int iHashCode = strP.hashCode();
                                if (iHashCode != -1309235419) {
                                    if (iHashCode != 280295099) {
                                        if (iHashCode == 568196142 && strP.equals("declined")) {
                                            hashSet2.add(strOptString);
                                        } else {
                                            Log.w("AccessTokenManager", "Unexpected status: ".concat(strP));
                                        }
                                    } else if (strP.equals("granted")) {
                                        hashSet.add(strOptString);
                                    } else {
                                        Log.w("AccessTokenManager", "Unexpected status: ".concat(strP));
                                    }
                                } else if (strP.equals("expired")) {
                                    hashSet3.add(strOptString);
                                } else {
                                    Log.w("AccessTokenManager", "Unexpected status: ".concat(strP));
                                }
                            }
                        }
                    }
                }
            };
            Bundle bundle = new Bundle();
            HttpMethod httpMethod = HttpMethod.X;
            GraphRequest graphRequest = new GraphRequest(accessToken, "me/permissions", bundle, httpMethod, callback, 32);
            GraphRequest.Callback callback2 = new GraphRequest.Callback() { // from class: com.facebook.AccessTokenManager$refreshCurrentAccessTokenImpl$batch$2
                @Override // com.facebook.GraphRequest.Callback
                public final void a(GraphResponse graphResponse) {
                    JSONObject jSONObject = graphResponse.f15950a;
                    if (jSONObject != null) {
                        String strOptString = jSONObject.optString("access_token");
                        AccessTokenManager.RefreshResult refreshResult2 = refreshResult;
                        refreshResult2.f15883a = strOptString;
                        refreshResult2.f15884b = jSONObject.optInt("expires_at");
                        refreshResult2.f15885c = jSONObject.optInt("expires_in");
                        refreshResult2.d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
                        refreshResult2.f15886e = jSONObject.optString("graph_domain", null);
                    }
                }
            };
            String str = accessToken.l0;
            if (str == null) {
                str = "facebook";
            }
            RefreshTokenInfo instagramRefreshTokenInfo = (str.hashCode() == 28903346 && str.equals("instagram")) ? new InstagramRefreshTokenInfo() : new FacebookRefreshTokenInfo();
            Bundle bundle2 = new Bundle();
            bundle2.putString("grant_type", instagramRefreshTokenInfo.a());
            bundle2.putString("client_id", accessToken.i0);
            GraphRequestBatch graphRequestBatch = new GraphRequestBatch(graphRequest, new GraphRequest(accessToken, instagramRefreshTokenInfo.b(), bundle2, httpMethod, callback2, 32));
            graphRequestBatch.c(new GraphRequestBatch.Callback() { // from class: com.facebook.AccessTokenManager$refreshCurrentAccessTokenImpl$1
                @Override // com.facebook.GraphRequestBatch.Callback
                public final void a(GraphRequestBatch it) throws Throwable {
                    boolean z2;
                    long j;
                    Date date;
                    AccessTokenManager accessTokenManager = this.f15887a;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AccessToken accessToken2 = accessToken;
                    Intrinsics.f(it, "it");
                    AccessTokenManager.RefreshResult refreshResult2 = refreshResult;
                    String str2 = refreshResult2.f15883a;
                    int i2 = refreshResult2.f15884b;
                    Long l2 = refreshResult2.d;
                    String str3 = refreshResult2.f15886e;
                    try {
                        AccessTokenManager.Companion companion = AccessTokenManager.g;
                        if (companion.a().f15879a != null) {
                            try {
                                AccessToken accessToken3 = companion.a().f15879a;
                                if ((accessToken3 != null ? accessToken3.j0 : null) == accessToken2.j0) {
                                    if (!atomicBoolean2.get() && str2 == null && i2 == 0) {
                                        accessTokenManager.f15880b.set(false);
                                        return;
                                    }
                                    Date date2 = accessToken2.X;
                                    if (refreshResult2.f15884b != 0) {
                                        date = new Date(((long) refreshResult2.f15884b) * 1000);
                                        j = 1000;
                                    } else {
                                        if (refreshResult2.f15885c != 0) {
                                            j = 1000;
                                            date2 = new Date((((long) refreshResult2.f15885c) * 1000) + new Date().getTime());
                                        } else {
                                            j = 1000;
                                        }
                                        date = date2;
                                    }
                                    if (str2 == null) {
                                        str2 = accessToken2.f0;
                                    }
                                    String str4 = str2;
                                    String str5 = accessToken2.i0;
                                    String str6 = accessToken2.j0;
                                    Collection collection = atomicBoolean2.get() ? hashSet : accessToken2.f15877Y;
                                    Collection collection2 = atomicBoolean2.get() ? hashSet2 : accessToken2.Z;
                                    Collection collection3 = atomicBoolean2.get() ? hashSet3 : accessToken2.e0;
                                    AccessTokenSource accessTokenSource = accessToken2.g0;
                                    Date date3 = new Date();
                                    Date date4 = l2 != null ? new Date(l2.longValue() * j) : accessToken2.k0;
                                    if (str3 == null) {
                                        str3 = accessToken2.l0;
                                    }
                                    companion.a().c(new AccessToken(str4, str5, str6, collection, collection2, collection3, accessTokenSource, date, date3, date4, str3), true);
                                    accessTokenManager.f15880b.set(false);
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                z2 = false;
                                accessTokenManager.f15880b.set(z2);
                                throw th;
                            }
                        }
                        accessTokenManager.f15880b.set(false);
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = false;
                    }
                }
            });
            graphRequestBatch.d();
        }
    }

    public final void b(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(FacebookSdk.b(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.d.sendBroadcast(intent);
    }

    public final void c(AccessToken accessToken, boolean z2) {
        AccessToken accessToken2 = this.f15879a;
        this.f15879a = accessToken;
        this.f15880b.set(false);
        this.f15881c = new Date(0L);
        if (z2) {
            SharedPreferences sharedPreferences = this.f15882e.f15878a;
            if (accessToken != null) {
                try {
                    sharedPreferences.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.c().toString()).apply();
                } catch (JSONException unused) {
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                Utility.d(FacebookSdk.b());
            }
        }
        if (Utility.a(accessToken2, accessToken)) {
            return;
        }
        b(accessToken2, accessToken);
        Context contextB = FacebookSdk.b();
        Date date = AccessToken.m0;
        AccessToken accessTokenB = AccessToken.Companion.b();
        AlarmManager alarmManager = (AlarmManager) contextB.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (AccessToken.Companion.c()) {
            if ((accessTokenB != null ? accessTokenB.X : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextB, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessTokenB.X.getTime(), PendingIntent.getBroadcast(contextB, 0, intent, 67108864));
            } catch (Exception unused2) {
            }
        }
    }
}
