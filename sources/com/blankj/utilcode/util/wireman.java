package com.blankj.utilcode.util;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: AppUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wireman {
    public static String attabal() {
        return adultoid.attabal().getPackageName();
    }

    public static String dern(String str) {
        if (rotuma.adultoid(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = adultoid.attabal().getPackageManager().getPackageInfo(str, 0);
            return packageInfo == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String saneness() {
        return dern(adultoid.attabal().getPackageName());
    }

    public static boolean wireman() {
        return rotuma.monoploid();
    }
}
