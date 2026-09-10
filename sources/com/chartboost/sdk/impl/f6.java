package com.chartboost.sdk.impl;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f13859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f13860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f13861c;
    public final DisplayMetrics d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13862e;
    public final int f;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f13863b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public f6(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 androidVersion, DisplayMetrics realDisplayMetrics) {
        Intrinsics.f(windowManager, "windowManager");
        Intrinsics.f(displayMetrics, "displayMetrics");
        Intrinsics.f(androidVersion, "androidVersion");
        Intrinsics.f(realDisplayMetrics, "realDisplayMetrics");
        this.f13859a = windowManager;
        this.f13860b = displayMetrics;
        this.f13861c = androidVersion;
        this.d = realDisplayMetrics;
        this.f13862e = displayMetrics.density;
        this.f = displayMetrics.densityDpi;
    }

    public final g6 a(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.e(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.e(windowInsets, "getWindowInsets(...)");
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        Intrinsics.e(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        int i2 = insetsIgnoringVisibility.left + insetsIgnoringVisibility.right;
        int i3 = insetsIgnoringVisibility.bottom + insetsIgnoringVisibility.top;
        Rect bounds = currentWindowMetrics.getBounds();
        Intrinsics.e(bounds, "getBounds(...)");
        return new g6(bounds.width() - i2, bounds.height() - i3);
    }

    public final float b() {
        return this.f13862e;
    }

    public final int c() {
        return this.f;
    }

    public final g6 d() {
        try {
            if (((Number) this.f13861c.invoke()).intValue() >= 30) {
                Rect bounds = this.f13859a.getCurrentWindowMetrics().getBounds();
                return new g6(bounds.width(), bounds.height());
            }
            this.d.setTo(this.f13860b);
            Display defaultDisplay = this.f13859a.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(this.d);
            }
            DisplayMetrics displayMetrics = this.d;
            return new g6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e2) {
            za.b("Cannot create size", e2);
            return new g6(0, 0);
        }
    }

    public /* synthetic */ f6(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 function0, DisplayMetrics displayMetrics2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowManager, displayMetrics, (i2 & 4) != 0 ? a.f13863b : function0, (i2 & 8) != 0 ? new DisplayMetrics() : displayMetrics2);
    }

    public final g6 a() {
        try {
            if (((Number) this.f13861c.invoke()).intValue() >= 30) {
                return a(this.f13859a);
            }
            DisplayMetrics displayMetrics = this.f13860b;
            return new g6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e2) {
            za.b("Cannot create device size", e2);
            return new g6(0, 0);
        }
    }
}
