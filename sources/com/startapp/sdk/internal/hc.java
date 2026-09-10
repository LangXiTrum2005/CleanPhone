package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f41051c;
    public final Boolean d;

    public hc(Context applicationContext) {
        Intrinsics.f(applicationContext, "applicationContext");
        this.f41050b = true;
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo(applicationContext.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                Intrinsics.c(applicationInfo);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    String string = obj != null ? obj.toString() : null;
                    this.f41049a = string;
                    if (string != null) {
                        Log.i("StartAppSDK", "appId is ".concat(string));
                    } else {
                        Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CONSENT_ENABLED")) {
                        this.f41050b = applicationInfo.metaData.getBoolean("com.startapp.sdk.CONSENT_ENABLED");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.MIXED_AUDIENCE")) {
                        Boolean boolValueOf = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.MIXED_AUDIENCE"));
                        this.f41051c = boolValueOf;
                        Log.i("StartAppSDK", "is mixed audience: " + boolValueOf);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CHILD_DIRECTED")) {
                        Boolean boolValueOf2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.CHILD_DIRECTED"));
                        this.d = boolValueOf2;
                        Log.i("StartAppSDK", "is child directed: " + boolValueOf2);
                    }
                }
            } catch (Throwable th) {
                g9.a(th);
            }
        }
    }
}
