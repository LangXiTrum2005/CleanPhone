package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes2.dex */
public final class uq {
    private static boolean di = false;
    private static boolean fi = false;
    private static Resources ik;
    private static String ka;
    private static String lr;
    private static Context ri;

    public static int di(Context context, String str) {
        return ri(context, str, TtmlNode.TAG_STYLE);
    }

    public static int fi(Context context, String str) {
        return ri(context, str, "id");
    }

    public static Drawable ik(Context context, String str) {
        try {
            return lr(context).getDrawable(ka(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int jbs(Context context, String str) {
        return ri(context, str, "anim");
    }

    private static String ka(Context context) {
        if (ka == null) {
            ka = context.getPackageName();
        }
        return ka;
    }

    public static int lr(Context context, String str) {
        return ri(context, str, "string");
    }

    public static int mj(Context context, String str) {
        return ri(context, str, "color");
    }

    public static void ri(Context context) {
        ri = context;
    }

    public static int xha(Context context, String str) {
        return lr(context).getColor(mj(context, str));
    }

    public static Resources lr(Context context) {
        Resources resources = ik;
        if (resources == null) {
            resources = null;
        }
        Context context2 = ri;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static void ri(String str) {
        ka = str;
    }

    public static synchronized void ik(Context context) {
        try {
            if (TextUtils.isEmpty(lr)) {
                return;
            }
            fi = true;
        } catch (Throwable unused) {
        }
    }

    private static int ri(Context context, String str, String str2) {
        int identifier = lr(context).getIdentifier(str, str2, ka(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!fi) {
            ik(context);
            return lr(context).getIdentifier(str, str2, ka(context));
        }
        return context.getResources().getIdentifier(str, str2, ka(context));
    }

    public static int ka(Context context, String str) {
        try {
            return ri(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String ri(Context context, String str) {
        return lr(context).getString(lr(context, str));
    }
}
