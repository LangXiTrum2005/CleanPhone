package com.bytedance.adsdk.ugeno.ebl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class OY {
    private static final Object LD = new Object();
    public static Handler Lxb = new Handler(Looper.getMainLooper());
    private static TypedValue lk;

    public static int LD(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public static float Lxb(Context context, String str) {
        float f;
        float f2 = context.getResources().getDisplayMetrics().density;
        try {
            f = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f = 0.0f;
        }
        return (f * f2) + 0.5f;
    }

    public static float Lxb(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static Bitmap Lxb(Context context, Bitmap bitmap, int i) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            if (renderScriptCreate == null) {
                return null;
            }
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Drawable Lxb(Context context, int i) {
        return context.getDrawable(i);
    }

    public static boolean Lxb() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void Lxb(Runnable runnable) {
        if (Lxb()) {
            runnable.run();
        } else {
            Lxb.post(runnable);
        }
    }
}
