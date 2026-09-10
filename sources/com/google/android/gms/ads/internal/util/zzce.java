package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import i9.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzce {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zzce f11108b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11109a;

    public static zzce zza() {
        if (f11108b == null) {
            f11108b = new zzce();
        }
        return f11108b;
    }

    public final void zzb(Context context) {
        Context contextCreatePackageContext;
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f11109a)) {
            int i10 = h.f42935e;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            this.f11109a = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
