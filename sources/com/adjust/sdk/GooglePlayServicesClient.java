package com.adjust.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesClient {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class GooglePlayServicesInfo {
        private final String gpsAdid;
        private final Boolean trackingEnabled;

        public GooglePlayServicesInfo(String str, Boolean bool) {
            this.gpsAdid = str;
            this.trackingEnabled = bool;
        }

        public String getGpsAdid() {
            return this.gpsAdid;
        }

        public Boolean isTrackingEnabled() {
            return this.trackingEnabled;
        }
    }

    public static GooglePlayServicesInfo getGooglePlayServicesInfo(Context context, long j10) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Google Play Services info can't be accessed from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        r0 r0Var = new r0(j10);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, r0Var, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                s0 s0Var = new s0(r0Var.a());
                GooglePlayServicesInfo googlePlayServicesInfo = new GooglePlayServicesInfo(s0Var.q(), s0Var.r());
                context.unbindService(r0Var);
                return googlePlayServicesInfo;
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            context.unbindService(r0Var);
            throw th2;
        }
    }
}
