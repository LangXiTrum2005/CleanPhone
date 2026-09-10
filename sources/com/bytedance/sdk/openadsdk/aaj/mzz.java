package com.bytedance.sdk.openadsdk.aaj;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class mzz {
    public static int fs = 32;
    public static int jpc = 2;
    protected static int lnr = 1;
    protected static int mml = 30;
    public static int mo = 0;
    protected static long mzz = 15360;
    protected static String qdl = "images";
    public static int rq = 16;
    public static int to = 8;
    public static int tvp = 4;
    protected static String ud = null;
    public static int wd = 1;

    public static boolean qdl(Context context, String str) {
        return false;
    }

    public static boolean ud(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static Bitmap qdl(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static float ud(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static boolean qdl(Context context, int i2) {
        boolean zQdl;
        boolean zQdl2;
        if (mo == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zQdl = qdl(context, "android.permission.READ_MEDIA_IMAGES");
                zQdl2 = true;
            } else {
                zQdl = qdl(context, "android.permission.READ_EXTERNAL_STORAGE");
                zQdl2 = qdl(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zQdl3 = qdl(context, "android.permission.CAMERA");
            boolean zQdl4 = qdl(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zQdl && zQdl2) {
                mo |= wd;
            }
            if (zQdl3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                mo |= jpc;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                mo |= tvp;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                mo |= to;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                mo |= rq;
            }
            if (zQdl4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                mo |= fs;
            }
        }
        return (mo & i2) != 0;
    }

    public static boolean qdl(Context context) {
        boolean z2;
        boolean z3;
        if (Build.VERSION.SDK_INT >= 33) {
            z2 = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z2 = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z3 = false;
            }
            return !z3 && z2;
        }
        z3 = true;
        if (z3) {
        }
    }
}
