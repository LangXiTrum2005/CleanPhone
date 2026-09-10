package com.bytedance.adsdk.ugeno.ebl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class ZU {
    private static Resources LD;
    private static String Lxb;

    @SuppressLint({"StaticFieldLeak"})
    private static Context lk;

    public static void Lxb(String str) {
        Lxb = str;
    }

    private static String Lxb(Context context) {
        if (Lxb == null) {
            Lxb = context.getPackageName();
        }
        return Lxb;
    }

    private static int Lxb(Context context, String str, String str2) {
        if (LD == null) {
            LD = context.getResources();
        }
        return LD.getIdentifier(str, str2, Lxb(context));
    }

    public static int Lxb(Context context, String str) {
        return Lxb(context, str, "drawable");
    }
}
