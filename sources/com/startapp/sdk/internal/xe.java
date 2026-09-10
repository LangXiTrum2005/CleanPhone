package com.startapp.sdk.internal;

import android.content.pm.PackageManager;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xe {
    public static boolean a(String str) {
        String[] strArr = ye.f41711c;
        boolean z2 = false;
        for (int i2 = 0; i2 < 14; i2++) {
            if (new File(strArr[i2], str).exists()) {
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean a(PackageManager packageManager, String[] strArr) {
        boolean z2 = false;
        for (String str : strArr) {
            try {
                packageManager.getPackageInfo(str, 0);
                z2 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z2;
    }
}
