package com.facebook;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.Utility;
import com.p004ironsource.m5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/ProfileManager;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ProfileManager {
    public static volatile ProfileManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f15957e = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Profile f15958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalBroadcastManager f15959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProfileCache f15960c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/ProfileManager$Companion;", "", "", "ACTION_CURRENT_PROFILE_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_PROFILE", "EXTRA_OLD_PROFILE", "Lcom/facebook/ProfileManager;", m5.f25675p, "Lcom/facebook/ProfileManager;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public final ProfileManager a() {
            if (ProfileManager.d == null) {
                synchronized (this) {
                    if (ProfileManager.d == null) {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.b());
                        Intrinsics.e(localBroadcastManager, "LocalBroadcastManager.ge…tance(applicationContext)");
                        ProfileManager.d = new ProfileManager(localBroadcastManager, new ProfileCache());
                    }
                }
            }
            ProfileManager profileManager = ProfileManager.d;
            if (profileManager != null) {
                return profileManager;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public ProfileManager(LocalBroadcastManager localBroadcastManager, ProfileCache profileCache) {
        this.f15959b = localBroadcastManager;
        this.f15960c = profileCache;
    }

    public final void a(Profile profile, boolean z2) {
        Profile profile2 = this.f15958a;
        this.f15958a = profile;
        if (z2) {
            SharedPreferences sharedPreferences = this.f15960c.f15956a;
            if (profile != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.X);
                    jSONObject.put("first_name", profile.f15955Y);
                    jSONObject.put("middle_name", profile.Z);
                    jSONObject.put("last_name", profile.e0);
                    jSONObject.put("name", profile.f0);
                    Uri uri = profile.g0;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.h0;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (Utility.a(profile2, profile)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        this.f15959b.sendBroadcast(intent);
    }
}
