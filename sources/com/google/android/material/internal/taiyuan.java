package com.google.android.material.internal;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: ManufacturerUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class taiyuan {
    public static String attabal() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean dern() {
        return attabal().equals("lge");
    }

    public static boolean marial() {
        return attabal().equals("samsung");
    }

    public static boolean saneness() {
        return dern() || marial();
    }

    public static boolean wireman() {
        return attabal().equals("meizu");
    }
}
