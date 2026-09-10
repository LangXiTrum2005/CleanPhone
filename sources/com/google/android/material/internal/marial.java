package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.czestochowa;

/* JADX INFO: compiled from: EdgeToEdgeUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class marial {
    public static void attabal(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = num == null || num.intValue() == 0;
        boolean z3 = num2 == null || num2.intValue() == 0;
        if (z2 || z3) {
            int iSaneness = pyrope.attabal.saneness(window.getContext(), R.attr.colorBackground, -16777216);
            if (z2) {
                num = Integer.valueOf(iSaneness);
            }
            if (z3) {
                num2 = Integer.valueOf(iSaneness);
            }
        }
        czestochowa.saneness(window, !z);
        int iDern = dern(window.getContext(), z);
        int iSaneness2 = saneness(window.getContext(), z);
        window.setStatusBarColor(iDern);
        window.setNavigationBarColor(iSaneness2);
        beachfront(window, wireman(iDern, pyrope.attabal.impromptu(num.intValue())));
        marial(window, wireman(iSaneness2, pyrope.attabal.impromptu(num2.intValue())));
    }

    public static void beachfront(Window window, boolean z) {
        czestochowa.attabal(window, window.getDecorView()).wireman(z);
    }

    public static int dern(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return pyrope.attabal.saneness(context, R.attr.statusBarColor, -16777216);
    }

    public static void marial(Window window, boolean z) {
        czestochowa.attabal(window, window.getDecorView()).dern(z);
    }

    public static int saneness(Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT < 27) {
            return monroe.dern.apical(pyrope.attabal.saneness(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return pyrope.attabal.saneness(context, R.attr.navigationBarColor, -16777216);
    }

    public static boolean wireman(int i, boolean z) {
        if (pyrope.attabal.impromptu(i)) {
            return true;
        }
        return i == 0 && z;
    }
}
