package com.bytedance.sdk.component.adexpress.ZU;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tD;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class OY {
    private static boolean Lxb;

    public static int LD(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().LD();
        }
        float fZU = ZU(context);
        if (fZU <= 0.0f) {
            fZU = 1.0f;
        }
        return (int) ((f / fZU) + 0.5f);
    }

    public static int Lxb(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    private static float ZU(Context context) {
        try {
            if (Lxb) {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.DisplayMetrics");
                Method declaredMethod = clsLoadClass.getDeclaredMethod("getDeviceDensity", new Class[0]);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(clsLoadClass, new Object[0])).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static float lk(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().LD();
        }
        return f * ZU(context);
    }

    public static float Lxb(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().LD();
        }
        return (f * ZU(context)) + 0.5f;
    }

    public static int LD(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().LD();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String lk(@NonNull Context context) {
        String language;
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = tD.LD(context).getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
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
        return Lxb(language);
    }

    public static int Lxb(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().lk().LD();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static String Lxb(String str) {
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
