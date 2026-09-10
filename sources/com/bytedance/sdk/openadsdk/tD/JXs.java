package com.bytedance.sdk.openadsdk.tD;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import com.hjq.permissions.Permission;

/* JADX INFO: loaded from: classes2.dex */
public class JXs {
    public static int JVA = 16;
    protected static long JXs = 15360;
    protected static String LD = null;
    protected static String Lxb = "images";
    public static int OY = 2;
    public static int QAg = 4;
    protected static int ZU = 30;
    public static int ebl = 1;
    public static int lc = 0;
    protected static int lk = 1;
    public static int nBu = 8;
    public static int sLN = 32;

    public static boolean LD(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    public static boolean Lxb(Context context, String str) {
        return false;
    }

    public static float LD(Context context) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static Bitmap Lxb(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean Lxb(Context context, int i) {
        boolean zLxb;
        boolean zLxb2;
        if (lc == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zLxb = Lxb(context, Permission.READ_MEDIA_IMAGES);
                zLxb2 = true;
            } else {
                zLxb = Lxb(context, Permission.READ_EXTERNAL_STORAGE);
                zLxb2 = Lxb(context, Permission.WRITE_EXTERNAL_STORAGE);
            }
            boolean zLxb3 = Lxb(context, Permission.CAMERA);
            boolean zLxb4 = Lxb(context, Permission.RECORD_AUDIO);
            PackageManager packageManager = context.getPackageManager();
            if (zLxb && zLxb2) {
                lc |= ebl;
            }
            if (zLxb3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                lc |= OY;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                lc |= QAg;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                lc |= nBu;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                lc |= JVA;
            }
            if (zLxb4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                lc |= sLN;
            }
        }
        return (lc & i) != 0;
    }

    public static boolean Lxb(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission(Permission.READ_MEDIA_IMAGES) == 0;
        } else {
            z = context.checkSelfPermission(Permission.READ_EXTERNAL_STORAGE) == 0;
            if (context.checkSelfPermission(Permission.WRITE_EXTERNAL_STORAGE) != 0) {
                z2 = false;
            }
            return !z2 && z;
        }
        z2 = true;
        if (z2) {
        }
    }
}
