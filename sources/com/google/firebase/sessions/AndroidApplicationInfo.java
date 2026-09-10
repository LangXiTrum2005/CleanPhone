package com.google.firebase.sessions;

import android.os.Build;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/AndroidApplicationInfo;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AndroidApplicationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21017c;
    public final ProcessDetails d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21018e;

    public AndroidApplicationInfo(String str, String versionName, String appBuildVersion, ProcessDetails processDetails, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        Intrinsics.f(versionName, "versionName");
        Intrinsics.f(appBuildVersion, "appBuildVersion");
        Intrinsics.f(deviceManufacturer, "deviceManufacturer");
        this.f21015a = str;
        this.f21016b = versionName;
        this.f21017c = appBuildVersion;
        this.d = processDetails;
        this.f21018e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        if (!this.f21015a.equals(androidApplicationInfo.f21015a) || !Intrinsics.a(this.f21016b, androidApplicationInfo.f21016b) || !Intrinsics.a(this.f21017c, androidApplicationInfo.f21017c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return Intrinsics.a(str, str) && this.d.equals(androidApplicationInfo.d) && this.f21018e.equals(androidApplicationInfo.f21018e);
    }

    public final int hashCode() {
        return this.f21018e.hashCode() + ((this.d.hashCode() + androidx.datastore.preferences.protobuf.a.b(Build.MANUFACTURER, androidx.datastore.preferences.protobuf.a.b(this.f21017c, androidx.datastore.preferences.protobuf.a.b(this.f21016b, this.f21015a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f21015a + ", versionName=" + this.f21016b + ", appBuildVersion=" + this.f21017c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f21018e + ')';
    }
}
