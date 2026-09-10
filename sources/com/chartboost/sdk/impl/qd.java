package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qd {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14933a;

        static {
            int[] iArr = new int[pd.values().length];
            try {
                iArr[pd.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pd.PORTRAIT_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pd.PORTRAIT_REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pd.PORTRAIT_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[pd.LANDSCAPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[pd.LANDSCAPE_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[pd.LANDSCAPE_REVERSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[pd.LANDSCAPE_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f14933a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r5 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.chartboost.sdk.impl.pd a(android.content.Context r5, com.chartboost.sdk.impl.f6 r6) {
        /*
            if (r5 != 0) goto L5
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.PORTRAIT
            return r5
        L5:
            com.chartboost.sdk.impl.g6 r6 = r6.a()     // Catch: java.lang.Exception -> L6b
            int r0 = a(r5)     // Catch: java.lang.Exception -> L6b
            int r1 = r6.b()     // Catch: java.lang.Exception -> L6b
            int r2 = r6.a()     // Catch: java.lang.Exception -> L6b
            r3 = 1
            r4 = 2
            if (r1 != r2) goto L26
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Exception -> L6b
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch: java.lang.Exception -> L6b
            int r5 = r5.orientation     // Catch: java.lang.Exception -> L6b
            if (r5 == r4) goto L32
            goto L30
        L26:
            int r5 = r6.b()     // Catch: java.lang.Exception -> L6b
            int r6 = r6.a()     // Catch: java.lang.Exception -> L6b
            if (r5 >= r6) goto L32
        L30:
            r5 = r3
            goto L33
        L32:
            r5 = 0
        L33:
            r6 = 3
            if (r0 == 0) goto L3b
            if (r0 == r4) goto L3b
            if (r5 != 0) goto L54
            goto L3d
        L3b:
            if (r5 == 0) goto L54
        L3d:
            if (r0 == 0) goto L51
            if (r0 == r3) goto L4e
            if (r0 == r4) goto L4b
            if (r0 == r6) goto L48
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.PORTRAIT     // Catch: java.lang.Exception -> L6b
            return r5
        L48:
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.LANDSCAPE_RIGHT     // Catch: java.lang.Exception -> L6b
            return r5
        L4b:
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.PORTRAIT_REVERSE     // Catch: java.lang.Exception -> L6b
            return r5
        L4e:
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.LANDSCAPE_LEFT     // Catch: java.lang.Exception -> L6b
            return r5
        L51:
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.PORTRAIT     // Catch: java.lang.Exception -> L6b
            return r5
        L54:
            if (r0 == 0) goto L68
            if (r0 == r3) goto L65
            if (r0 == r4) goto L62
            if (r0 == r6) goto L5f
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.LANDSCAPE     // Catch: java.lang.Exception -> L6b
            return r5
        L5f:
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.PORTRAIT_RIGHT     // Catch: java.lang.Exception -> L6b
            return r5
        L62:
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.LANDSCAPE_REVERSE     // Catch: java.lang.Exception -> L6b
            return r5
        L65:
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.PORTRAIT_LEFT     // Catch: java.lang.Exception -> L6b
            return r5
        L68:
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.LANDSCAPE     // Catch: java.lang.Exception -> L6b
            return r5
        L6b:
            r5 = move-exception
            java.lang.String r6 = "Cannot getOrientation"
            com.chartboost.sdk.impl.za.b(r6, r5)
            com.chartboost.sdk.impl.pd r5 = com.chartboost.sdk.impl.pd.LANDSCAPE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.qd.a(android.content.Context, com.chartboost.sdk.impl.f6):com.chartboost.sdk.impl.pd");
    }

    public static final String b(Context context, f6 displayMeasurement) {
        Intrinsics.f(displayMeasurement, "displayMeasurement");
        switch (a.f14933a[a(context, displayMeasurement).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return com.ironsource.d9.h.D;
            case 5:
            case 6:
            case 7:
            case 8:
                return com.ironsource.d9.h.C;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean c(Context context, f6 displayMeasurement) {
        Intrinsics.f(displayMeasurement, "displayMeasurement");
        pd pdVarA = a(context, displayMeasurement);
        return pdVarA == pd.PORTRAIT || pdVarA == pd.PORTRAIT_REVERSE || pdVarA == pd.PORTRAIT_LEFT || pdVarA == pd.PORTRAIT_RIGHT;
    }

    public static final int a(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    public static final void a(Activity activity, qf qfVar, f6 displayMeasurement) {
        Intrinsics.f(displayMeasurement, "displayMeasurement");
        if (activity == null || a(activity) || qfVar == null) {
            return;
        }
        int i2 = 1;
        if (qfVar.h() && qfVar.j()) {
            switch (a.f14933a[a(activity, displayMeasurement).ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                    i2 = 9;
                    break;
                case 5:
                case 6:
                    i2 = 0;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            activity.setRequestedOrientation(i2);
        }
    }

    public static final boolean a(Activity activity) {
        View decorView;
        Drawable background;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26) {
            return false;
        }
        Window window = activity.getWindow();
        return window == null || (decorView = window.getDecorView()) == null || (background = decorView.getBackground()) == null || background.getAlpha() != 255;
    }

    public static final void a(Activity activity, qf qfVar) {
        if (activity == null || a(activity) || qfVar == null || !qfVar.h() || !qfVar.j()) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }
}
