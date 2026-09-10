package com.blankj.utilcode.util;

import android.content.res.Resources;

/* JADX INFO: compiled from: BarUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class marial {
    public static int attabal() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier != 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int saneness() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }
}
