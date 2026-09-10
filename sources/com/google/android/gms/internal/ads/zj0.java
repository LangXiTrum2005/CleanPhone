package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qa f22640b;

    public zj0(Context context) {
        this.f22639a = context;
    }

    public final void a(so0 so0Var) {
        ServiceInfo serviceInfo;
        qa qaVar = this.f22640b;
        Context context = qaVar.f19008r;
        if (qaVar.I()) {
            v71.k("Service connection is valid. No need to re-initialize.");
            so0Var.c(0);
            return;
        }
        int i10 = qaVar.f19007q;
        if (i10 == 1) {
            v71.q("Client is already in the process of connecting to the service.");
            so0Var.c(3);
            return;
        }
        if (i10 == 3) {
            v71.q("Client was already closed and can't be reused. Please create another instance.");
            so0Var.c(3);
            return;
        }
        v71.k("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            qaVar.f19007q = 0;
            v71.k("Install Referrer service unavailable on device.");
            so0Var.c(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    pa paVar = new pa(qaVar, so0Var);
                    qaVar.f19011u = paVar;
                    try {
                        if (context.bindService(intent2, paVar, 1)) {
                            v71.k("Service was bonded successfully.");
                            return;
                        }
                        v71.q("Connection to service is blocked.");
                        qaVar.f19007q = 0;
                        so0Var.c(1);
                        return;
                    } catch (SecurityException unused) {
                        v71.q("No permission to connect to service.");
                        qaVar.f19007q = 0;
                        so0Var.c(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        v71.q("Play Store missing or incompatible. Version 8.3.73 or later required.");
        qaVar.f19007q = 0;
        so0Var.c(2);
    }
}
