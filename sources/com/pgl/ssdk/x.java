package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes5.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f33495a = -1;

    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            x.f33495a = x.b(z.a());
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt("camera_count", x.f33495a).apply();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(Context context) {
        int i2 = f33495a;
        if (i2 != -1) {
            return i2;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                f33495a = cameraManager.getCameraIdList().length;
            } catch (Throwable unused) {
                f33495a = -1;
            }
        } else {
            f33495a = -2;
        }
        return f33495a;
    }

    public static int a() {
        int i2;
        int i3 = f33495a;
        if (i3 != -1) {
            return i3;
        }
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA == null || (i2 = sharedPreferencesA.getInt("camera_count", -1)) == -1) {
            ar.b(new a());
            return -1;
        }
        f33495a = i2;
        return i2;
    }
}
