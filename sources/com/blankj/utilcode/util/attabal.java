package com.blankj.utilcode.util;

import android.app.Activity;

/* JADX INFO: compiled from: ActivityUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal {
    public static void attabal(Class<? extends Activity> cls) {
        saneness(cls, false);
    }

    public static boolean dern(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static void saneness(Class<? extends Activity> cls, boolean z) {
        for (Activity activity : rotuma.beachfront()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                if (!z) {
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }
}
