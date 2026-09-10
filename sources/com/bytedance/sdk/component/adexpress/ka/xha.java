package com.bytedance.sdk.component.adexpress.ka;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.uq;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class xha {
    public static float ik(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().lr();
        }
        return f * ka(context);
    }

    private static float ka(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int lr(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().lr();
        }
        float fKa = ka(context);
        if (fKa <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fKa = 1.0f;
        }
        return (int) ((f / fKa) + 0.5f);
    }

    public static int ri(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static float ri(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().lr();
        }
        return (f * ka(context)) + 0.5f;
    }

    public static String ik(Context context) {
        String language;
        try {
            Locale locale = uq.lr(context).getConfiguration().getLocales().get(0);
            language = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    language = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            language = "";
        }
        return ri(language);
    }

    public static int lr(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().lr();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int ri(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.ri.ri.ri.ri().ik().lr();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String ri(String str) {
        str.getClass();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
