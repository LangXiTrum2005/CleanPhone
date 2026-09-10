package com.startapp.sdk.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class dg extends z1 {
    public final te j0;
    public final String k0;

    public dg(Context context) {
        ServiceInfo serviceInfo;
        String string;
        super(1);
        if (me.f41253a == null) {
            try {
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = listQueryIntentServices.get(0).serviceInfo) != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if ("com.android.vending".equals(str) && str2 != null && context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                        Intent intent2 = new Intent(intent);
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        le leVar = new le(context.getPackageName(), countDownLatch);
                        if (context.bindService(intent2, leVar, 1)) {
                            try {
                                countDownLatch.await(1L, TimeUnit.SECONDS);
                            } catch (InterruptedException unused) {
                            }
                            int i2 = q0.f41381a;
                            context.unbindService(leVar);
                        }
                    }
                }
            } catch (Throwable th) {
                g9.a(th);
            }
        }
        this.j0 = me.f41253a;
        int i3 = q0.f41381a;
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                string = null;
            } else if (signatureArr.length == 1) {
                string = signatureArr[0].toCharsString();
            } else {
                Arrays.sort(signatureArr, new p0());
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < signatureArr.length; i4++) {
                    sb.append(signatureArr[i4].toCharsString());
                    if (i4 < signatureArr.length - 1) {
                        sb.append(';');
                    }
                }
                string = sb.toString();
            }
        } catch (Throwable unused2) {
        }
        this.k0 = string;
    }

    @Override // com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        veVar.a("placement", "INAPP_DOWNLOAD", true, true);
        te teVar = this.j0;
        if (teVar != null) {
            veVar.a("install_referrer", teVar.f41524a.getString("install_referrer"), true, true);
            veVar.a("referrer_click_timestamp_seconds", Long.valueOf(this.j0.f41524a.getLong("referrer_click_timestamp_seconds")), true, true);
            veVar.a("install_begin_timestamp_seconds", Long.valueOf(this.j0.f41524a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        veVar.a("apkSig", this.k0, true, true);
        long j = com.startapp.sdk.adsbase.g.f40661c;
        if (j != 0) {
            veVar.a("firstInstalledAppTS", Long.valueOf(j), false, true);
        }
    }
}
