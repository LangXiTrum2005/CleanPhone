package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: ServiceStarter.java */
/* JADX INFO: loaded from: classes3.dex */
public class splinterproof {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static splinterproof f22748marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f22749attabal = null;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Boolean f22751saneness = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Boolean f22750dern = null;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Queue<Intent> f22752wireman = new ArrayDeque();

    public static synchronized splinterproof saneness() {
        try {
            if (f22748marial == null) {
                f22748marial = new splinterproof();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22748marial;
    }

    public final int attabal(Context context, Intent intent) {
        String strBeachfront = beachfront(context, intent);
        if (strBeachfront != null) {
            Log.isLoggable("FirebaseMessaging", 3);
            intent.setClassName(context.getPackageName(), strBeachfront);
        }
        try {
            return (marial(context) ? coffeecake.competently(context, intent) : context.startService(intent)) == null ? 404 : -1;
        } catch (IllegalStateException e) {
            e.toString();
            return TTAdConstant.AD_ID_IS_NULL_CODE;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    public final synchronized String beachfront(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f22749attabal;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f22749attabal = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f22749attabal = serviceInfo.name;
                    }
                    return this.f22749attabal;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int competently(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        this.f22752wireman.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return attabal(context, intent2);
    }

    public Intent dern() {
        return this.f22752wireman.poll();
    }

    public boolean marial(Context context) {
        if (this.f22751saneness == null) {
            this.f22751saneness = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f22751saneness.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f22751saneness.booleanValue();
    }

    public boolean wireman(Context context) {
        if (this.f22750dern == null) {
            this.f22750dern = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f22751saneness.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.f22750dern.booleanValue();
    }
}
