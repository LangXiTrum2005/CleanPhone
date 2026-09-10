package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes5.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f33392a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f33393b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f33394c = null;
    private static String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f33395e = null;
    private static volatile boolean f = false;
    private static volatile boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static DisplayManager f33396h;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
            aa.b(i2, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            aa.b(i2, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
            aa.b(i2, 2);
        }
    }

    public static void b(Context context) {
        Handler handlerB;
        if (f33393b) {
            return;
        }
        if (f33392a == null) {
            f33392a = new a();
        }
        if (f33396h == null) {
            f33396h = (DisplayManager) context.getSystemService(d9.h.d);
        }
        if (f33396h == null || (handlerB = ar.b()) == null) {
            return;
        }
        try {
            f33396h.registerDisplayListener(f33392a, handlerB);
            f33393b = true;
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        boolean z2 = false;
        Object objA = av.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = av.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = av.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        if (objA != null && objA3 != null && ((Integer) objA).intValue() == ((Integer) objA3).intValue()) {
            z2 = true;
        }
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf(z2));
    }

    private static String a(int i2) {
        Display display = f33396h.getDisplay(i2);
        return display != null ? a(display) : "pd";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i2, int i3) {
        if (i2 == 0) {
            return;
        }
        try {
            String strA = a(i2);
            if (i3 == 1) {
                if (strA.equals(f33394c)) {
                    return;
                }
                f33394c = strA;
            } else {
                if (i3 != 2) {
                    if (i3 != 3 || strA.equals(f33395e)) {
                        return;
                    }
                    f33395e = strA;
                    return;
                }
                if (strA.equals(d)) {
                    return;
                }
                d = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean a(Context context) {
        Display[] displays;
        if (f33393b && (f33394c != null || d != null || f33395e != null)) {
            return true;
        }
        if (f33393b && f) {
            return g;
        }
        if (context == null) {
            return false;
        }
        if (f33396h == null) {
            f33396h = (DisplayManager) context.getSystemService(d9.h.d);
        }
        DisplayManager displayManager = f33396h;
        if (displayManager != null && (displays = displayManager.getDisplays()) != null) {
            for (Display display : displays) {
                if (display != null && display.getDisplayId() != 0) {
                    g = true;
                    break;
                }
            }
        }
        f = true;
        return g;
    }
}
