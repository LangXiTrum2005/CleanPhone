package com.bytedance.sdk.openadsdk.uq;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class fi {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    public static int f18166co = 32;
    public static int di = 0;
    protected static long fi = 15360;
    protected static int ik = 1;
    public static int jbs = 4;
    protected static int ka = 30;
    protected static String lr = null;
    public static int mj = 2;
    public static int qt = 8;
    protected static String ri = "images";
    public static int sf = 16;
    public static int xha = 1;

    public static boolean lr(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static boolean ri(Context context, String str) {
        return false;
    }

    public static float lr(Context context) {
        return context == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : context.getResources().getDisplayMetrics().density;
    }

    public static Bitmap ri(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean ri(Context context, int i) {
        boolean zRi;
        boolean zRi2;
        if (di == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zRi = ri(context, "android.permission.READ_MEDIA_IMAGES");
                zRi2 = true;
            } else {
                zRi = ri(context, "android.permission.READ_EXTERNAL_STORAGE");
                zRi2 = ri(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zRi3 = ri(context, "android.permission.CAMERA");
            boolean zRi4 = ri(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zRi && zRi2) {
                di |= xha;
            }
            if (zRi3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                di |= mj;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                di |= jbs;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                di |= qt;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                di |= sf;
            }
            if (zRi4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                di |= f18166co;
            }
        }
        return (di & i) != 0;
    }

    public static boolean ri(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
            }
            return !z2 && z;
        }
        z2 = true;
        if (z2) {
        }
    }
}
