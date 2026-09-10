package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes3.dex */
public class lnr {
    public static int qdl = -1;

    public static int qdl(Context context, int i2, int i3) {
        int iRound;
        int iQdl = qdl(context, i3);
        if (iQdl == -1) {
            return qdl;
        }
        int iMin = Math.min(90, Math.round(iQdl * 0.15f));
        if (i2 > 655) {
            iRound = Math.round((i2 / 728.0f) * 90.0f);
        } else if (i2 > 632) {
            iRound = 81;
        } else if (i2 > 526) {
            iRound = Math.round((i2 / 468.0f) * 60.0f);
        } else {
            iRound = i2 > 432 ? 68 : Math.round((i2 / 320.0f) * 50.0f);
        }
        return Math.max(Math.min(iRound, iMin), 50);
    }

    public static int qdl(Context context, int i2) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context != null) {
            try {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (configuration = resources.getConfiguration()) != null) {
                    int i3 = configuration.orientation;
                    if (i2 == 0) {
                        i2 = i3;
                    }
                    if (i2 == i3) {
                        return Math.round(displayMetrics.heightPixels / displayMetrics.density);
                    }
                    return Math.round(displayMetrics.widthPixels / displayMetrics.density);
                }
            } catch (Throwable unused) {
                return qdl;
            }
        }
        return qdl;
    }
}
