package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f33496a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f33497b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f33498c = 0;
    private static int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f33499e = 0;
    private static int f = 0;
    public static volatile boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f33500h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static InputManager f33501i;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f33502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f33503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f33504c;

        public a(String str, Context context, int i2) {
            this.f33502a = str;
            this.f33503b = context;
            this.f33504c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f33502a);
            }
            InputManager inputManagerB = y.b(this.f33503b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f33504c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    public static /* synthetic */ int b() {
        int i2 = f33498c;
        f33498c = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int c() {
        int i2 = f;
        f = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int d() {
        int i2 = f33496a;
        f33496a = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int e() {
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int f() {
        int i2 = f33497b;
        f33497b = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int g() {
        int i2 = f33499e;
        f33499e = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f33500h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                f = sharedPreferencesA.getInt("nihc", 0);
                f33499e = sharedPreferencesA.getInt("eihc", 0);
                d = sharedPreferencesA.getInt("vihc", 0);
                f33500h = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.getClass();
        switch (str) {
            case "eic":
                return f33497b;
            case "nic":
                return f33498c;
            case "vic":
                return f33496a;
            case "eihc":
                return f33499e;
            case "nihc":
                return f;
            case "vihc":
                return d;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public static void a(MotionEvent motionEvent, Context context) {
        String string;
        if (motionEvent == null || context == null) {
            return;
        }
        if (g) {
            try {
                if (motionEvent.getToolType(0) == 0 || motionEvent.getSource() == 0 || motionEvent.getSource() == 2) {
                    string = Arrays.toString(new Exception().getStackTrace());
                    if (string.contains("android.view.InputEventReceiver") || string.contains("android.view.ViewRootImpl$WindowInputEventReceiver") || string.contains("android.view.ViewRootImpl$InputStage")) {
                        string = null;
                    }
                } else {
                    string = null;
                }
            } catch (Throwable unused) {
            }
        } else {
            string = null;
        }
        ar.b(new a(string, context, motionEvent.getDeviceId()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f33501i == null) {
            f33501i = (InputManager) context.getSystemService("input");
        }
        return f33501i;
    }
}
