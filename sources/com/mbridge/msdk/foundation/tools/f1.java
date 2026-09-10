package com.mbridge.msdk.foundation.tools;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f34108a = new AtomicInteger(1);

    public static void a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public static void b(Window window) {
        if (window != null) {
            try {
                window.getDecorView().setSystemUiVisibility(4098);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void c(Window window) {
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 3;
                window.setAttributes(attributes);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void d(Window window) {
        if (window != null) {
            try {
                window.requestFeature(1);
                window.setFlags(1024, 1024);
                window.addFlags(512);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void a(Window window) {
        if (window != null) {
            try {
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(4098);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }
}
