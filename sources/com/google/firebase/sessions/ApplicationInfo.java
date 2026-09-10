package com.google.firebase.sessions;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/ApplicationInfo;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidApplicationInfo f21020b;

    public ApplicationInfo(String appId, AndroidApplicationInfo androidApplicationInfo) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.f(appId, "appId");
        Intrinsics.f(deviceModel, "deviceModel");
        Intrinsics.f(osVersion, "osVersion");
        this.f21019a = appId;
        this.f21020b = androidApplicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        if (!Intrinsics.a(this.f21019a, applicationInfo.f21019a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        if (!Intrinsics.a(str2, str2)) {
            return false;
        }
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        return this.f21020b.equals(applicationInfo.f21020b);
    }

    public final int hashCode() {
        return this.f21020b.hashCode() + ((LogEnvironment.LOG_ENVIRONMENT_PROD.hashCode() + androidx.datastore.preferences.protobuf.a.b(Build.VERSION.RELEASE, (((Build.MODEL.hashCode() + (this.f21019a.hashCode() * 31)) * 31) + 48517562) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f21019a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + LogEnvironment.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f21020b + ')';
    }
}
