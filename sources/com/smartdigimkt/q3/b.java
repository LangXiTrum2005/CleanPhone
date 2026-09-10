package com.smartdigimkt.q3;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static boolean a(String str) {
        try {
            String str2 = Build.MANUFACTURER;
            String str3 = Build.FINGERPRINT;
            String str4 = Build.BRAND;
            if (!TextUtils.isEmpty(str4) && str4.toLowerCase().contains(str)) {
                return true;
            }
            if (!TextUtils.isEmpty(str2) && str2.toLowerCase().contains(str)) {
                return true;
            }
            if (!TextUtils.isEmpty(str3) && str3.toLowerCase().contains(str)) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean b() {
        return a("oppo") || a("oneplus") || a("realme");
    }

    public static boolean c() {
        return a("xiaomi");
    }

    public static boolean a() {
        return a("honor");
    }
}
