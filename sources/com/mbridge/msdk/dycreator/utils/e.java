package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static int a(Context context, float f10) {
        return (int) ((f10 * a(context).density) + 0.5f);
    }

    public static int b(Context context, int i10) {
        return (int) TypedValue.applyDimension(2, i10, context.getResources().getDisplayMetrics());
    }

    public static int c(Context context, float f10) {
        return (int) TypedValue.applyDimension(5, f10, context.getResources().getDisplayMetrics());
    }

    public static int d(Context context, float f10) {
        return (int) TypedValue.applyDimension(3, f10, context.getResources().getDisplayMetrics());
    }

    public static int e(Context context, float f10) {
        return (int) ((f10 / a(context).density) + 0.5f);
    }

    public static DisplayMetrics a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int b(Context context, float f10) {
        return (int) TypedValue.applyDimension(4, f10, context.getResources().getDisplayMetrics());
    }

    public static int a(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }
}
