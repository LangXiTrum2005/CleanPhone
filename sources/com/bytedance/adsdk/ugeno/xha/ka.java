package com.bytedance.adsdk.ugeno.xha;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public final class ka {
    private static Context ik;
    private static Resources lr;
    private static String ri;

    public static int lr(Context context, String str) {
        return ri(context, str, "drawable");
    }

    public static void ri(String str) {
        ri = str;
    }

    private static String ri(Context context) {
        if (ri == null) {
            ri = context.getPackageName();
        }
        return ri;
    }

    private static int ri(Context context, String str, String str2) {
        if (lr == null) {
            lr = context.getResources();
        }
        return lr.getIdentifier(str, str2, ri(context));
    }

    public static int ri(Context context, String str) {
        return ri(context, str, "raw");
    }
}
