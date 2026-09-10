package com.pgl.ssdk;

import android.content.Context;
import android.content.res.Configuration;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes5.dex */
public class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f33401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f33402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f33403c;
    public static int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f33404e;
    private static int f;
    private static int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f33405h;

    public static int a(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.touchscreen;
            }
            return 666666;
        } catch (Throwable unused) {
            return 666666;
        }
    }

    private static void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            f = (int) displayMetrics.density;
            f33404e = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            g = (int) displayMetrics.xdpi;
            f33405h = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void d(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f33401a = displayMetrics.widthPixels;
            f33402b = displayMetrics.heightPixels;
            Display.Mode mode = defaultDisplay.getMode();
            f33403c = mode.getPhysicalWidth();
            d = mode.getPhysicalHeight();
        } catch (Throwable unused) {
        }
    }

    public static String e(Context context) {
        int i2 = -1;
        if (context != null) {
            try {
                i2 = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i2);
    }

    public static String f(Context context) {
        try {
            d(context);
            b(context);
            c(context);
        } catch (Throwable unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f33404e);
        sb.append("[<!>]");
        sb.append(f33401a);
        sb.append(",");
        sb.append(f33402b);
        sb.append("[<!>]");
        sb.append(f33403c);
        sb.append("x");
        return android.support.v4.media.a.i(d, "[<!>]", sb);
    }
}
