package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class tD {
    private static boolean JXs = false;
    private static String LD = null;

    @SuppressLint({"StaticFieldLeak"})
    private static Context Lxb = null;
    private static String ZU = null;
    private static boolean lc = false;
    private static Resources lk;

    public static int JXs(Context context, String str) {
        return Lxb(context, str, "id");
    }

    public static int LD(Context context, String str) {
        return Lxb(context, str, TypedValues.Custom.S_STRING);
    }

    public static void Lxb(Context context) {
        Lxb = context;
    }

    public static int OY(Context context, String str) {
        return Lxb(context, str, "color");
    }

    public static int QAg(Context context, String str) {
        return Lxb(context, str, "anim");
    }

    private static String ZU(Context context) {
        if (ZU == null) {
            ZU = context.getPackageName();
        }
        return ZU;
    }

    public static int ebl(Context context, String str) {
        return LD(context).getColor(OY(context, str));
    }

    public static int lc(Context context, String str) {
        return Lxb(context, str, TtmlNode.TAG_STYLE);
    }

    public static Drawable lk(Context context, String str) {
        try {
            return LD(context).getDrawable(ZU(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Resources LD(Context context) {
        Resources resources = lk;
        if (resources == null) {
            resources = null;
        }
        Context context2 = Lxb;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static void Lxb(String str) {
        ZU = str;
    }

    private static int Lxb(Context context, String str, String str2) {
        int identifier = LD(context).getIdentifier(str, str2, ZU(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!JXs) {
            lk(context);
            return LD(context).getIdentifier(str, str2, ZU(context));
        }
        return context.getResources().getIdentifier(str, str2, ZU(context));
    }

    public static synchronized void lk(Context context) {
        try {
            if (TextUtils.isEmpty(LD)) {
                return;
            }
            Resources resources = context.getResources();
            lk = new Resources(LD(resources.getAssets(), LD + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
            ZU = context.getPackageName();
            JXs = true;
        } catch (Throwable unused) {
        }
    }

    public static int ZU(Context context, String str) {
        try {
            return Lxb(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    private static AssetManager LD(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            Lxb(assetManager2, str);
            assetManager = assetManager2;
        } catch (Exception unused) {
            Lxb(assetManager, str);
        }
        try {
            CSn.Lxb(assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception unused2) {
        }
        return assetManager;
    }

    public static String Lxb(Context context, String str) {
        return LD(context).getString(LD(context, str));
    }

    public static boolean Lxb(AssetManager assetManager, String str) {
        Method methodLxb = CSn.Lxb((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (methodLxb == null) {
            methodLxb = CSn.Lxb((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }
        if (methodLxb != null) {
            int i = 3;
            while (true) {
                int i2 = i - 1;
                if (i < 0) {
                    break;
                }
                try {
                    if (((Integer) methodLxb.invoke(assetManager, str)).intValue() != 0) {
                        return true;
                    }
                    i = i2;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }
}
