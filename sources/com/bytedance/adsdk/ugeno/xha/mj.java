package com.bytedance.adsdk.ugeno.xha;

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
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private static TypedValue ik;
    private static final Object lr = new Object();
    public static Handler ri = new Handler(Looper.getMainLooper());

    public static int lr(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public static float ri(Context context, String str) {
        float f;
        float f2 = context.getResources().getDisplayMetrics().density;
        try {
            f = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (f * f2) + 0.5f;
    }

    public static float ri(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static Bitmap ri(Context context, Bitmap bitmap, int i) {
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

    public static Drawable ri(Context context, int i) {
        return context.getDrawable(i);
    }

    public static boolean ri() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void ri(Runnable runnable) {
        if (ri()) {
            runnable.run();
        } else {
            ri.post(runnable);
        }
    }
}
