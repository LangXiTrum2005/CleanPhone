package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f2425a;
    public static int b;
    public static int c;
    private static int d;
    private static int e;
    private static int f;

    private static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            d = (int) displayMetrics.density;
            c = displayMetrics.densityDpi;
        } catch (Throwable unused) {
        }
    }

    private static void b(Context context) {
        try {
            new DisplayMetrics();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            e = (int) displayMetrics.xdpi;
            f = (int) displayMetrics.ydpi;
        } catch (Throwable unused) {
        }
    }

    private static void c(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            f2425a = point.x;
            b = point.y;
        } catch (Throwable unused) {
        }
    }

    public static String d(Context context) {
        int i = -1;
        if (context != null) {
            try {
                i = Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
            } catch (Throwable unused) {
            }
        }
        return String.valueOf(i);
    }

    public static String e(Context context) {
        try {
            c(context);
            a(context);
            b(context);
        } catch (Throwable unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append("[<!>]");
        sb.append(f2425a);
        sb.append(",");
        return AbstractC5044xl.o(sb, b, "[<!>]");
    }
}
