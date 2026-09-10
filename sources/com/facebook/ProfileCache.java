package com.facebook;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/ProfileCache;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ProfileCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15956a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/facebook/ProfileCache$Companion;", "", "", "CACHED_PROFILE_KEY", "Ljava/lang/String;", "SHARED_PREFERENCES_NAME", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public ProfileCache() {
        SharedPreferences sharedPreferences = FacebookSdk.b().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.e(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this.f15956a = sharedPreferences;
    }
}
