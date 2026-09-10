package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: compiled from: Metadata.java */
/* JADX INFO: loaded from: classes3.dex */
public class merc {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f22668attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f22669dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f22670marial = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f22671saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f22672wireman;

    public merc(Context context) {
        this.f22668attabal = context;
    }

    public static String dern(iiion.beachfront beachfrontVar) {
        String strWireman = beachfrontVar.kowloon().wireman();
        if (strWireman != null) {
            return strWireman;
        }
        String strDern = beachfrontVar.kowloon().dern();
        if (!strDern.startsWith("1:")) {
            return strDern;
        }
        String[] strArrSplit = strDern.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public synchronized String attabal() {
        try {
            if (this.f22671saneness == null) {
                impromptu();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f22671saneness;
    }

    public final PackageInfo beachfront(String str) {
        try {
            return this.f22668attabal.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            return null;
        }
    }

    public boolean competently() {
        return marial() != 0;
    }

    public final synchronized void impromptu() {
        PackageInfo packageInfoBeachfront = beachfront(this.f22668attabal.getPackageName());
        if (packageInfoBeachfront != null) {
            this.f22671saneness = Integer.toString(packageInfoBeachfront.versionCode);
            this.f22669dern = packageInfoBeachfront.versionName;
        }
    }

    public synchronized int marial() {
        int i = this.f22670marial;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f22668attabal.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                this.f22670marial = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
            this.f22670marial = 2;
            return 2;
        }
        if (PlatformVersion.isAtLeastO()) {
            this.f22670marial = 2;
        } else {
            this.f22670marial = 1;
        }
        return this.f22670marial;
    }

    public synchronized String saneness() {
        try {
            if (this.f22669dern == null) {
                impromptu();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f22669dern;
    }

    public synchronized int wireman() {
        PackageInfo packageInfoBeachfront;
        try {
            if (this.f22672wireman == 0 && (packageInfoBeachfront = beachfront("com.google.android.gms")) != null) {
                this.f22672wireman = packageInfoBeachfront.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f22672wireman;
    }
}
