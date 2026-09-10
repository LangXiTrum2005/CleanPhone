package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.smartdigimkt.v0.k;

/* JADX INFO: loaded from: classes.dex */
public final class ljh {
    private static Resources lnr = null;
    private static String mml = null;
    private static boolean mo = false;
    private static boolean mzz = false;
    private static Context qdl;
    private static String ud;

    public static int jpc(Context context, String str) {
        return qdl(context, str, "color");
    }

    public static Drawable lnr(Context context, String str) {
        try {
            return ud(context).getDrawable(mml(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static String mml(Context context) {
        if (mml == null) {
            mml = context.getPackageName();
        }
        return mml;
    }

    public static int mo(Context context, String str) {
        return qdl(context, str, "style");
    }

    public static int mzz(Context context, String str) {
        return qdl(context, str, "id");
    }

    public static void qdl(Context context) {
        qdl = context;
    }

    public static int tvp(Context context, String str) {
        return qdl(context, str, k.g);
    }

    public static int ud(Context context, String str) {
        return qdl(context, str, k.f38992h);
    }

    public static int wd(Context context, String str) {
        return ud(context).getColor(jpc(context, str));
    }

    public static void qdl(String str) {
        mml = str;
    }

    public static Resources ud(Context context) {
        Resources resources = lnr;
        if (resources == null) {
            resources = null;
        }
        Context context2 = qdl;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static synchronized void lnr(Context context) {
        try {
            if (TextUtils.isEmpty(ud)) {
                return;
            }
            mzz = true;
        } catch (Throwable th) {
            Log.e("ResourceHelp", "makePluginResources failed", th);
        }
    }

    private static int qdl(Context context, String str, String str2) {
        int identifier = ud(context).getIdentifier(str, str2, mml(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!mzz) {
            lnr(context);
            return ud(context).getIdentifier(str, str2, mml(context));
        }
        return context.getResources().getIdentifier(str, str2, mml(context));
    }

    public static int mml(Context context, String str) {
        try {
            return qdl(context, str, k.d);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String qdl(Context context, String str) {
        return ud(context).getString(ud(context, str));
    }
}
