package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3181pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f23897a = LazyKt.b(C3165oc.f23875a);

    public static final JSONObject a(String str, int i2) throws JSONException {
        JSONObject jSONObjectA = AbstractC2938ad.a(str, "targetViewId", "id", str);
        jSONObjectA.put("errorCode", i2);
        return jSONObjectA;
    }

    public static final Bf b(WindowInsets windowInsets) {
        Intrinsics.f(windowInsets, "<this>");
        Bf bfE = e(windowInsets);
        Bf bfC = c(windowInsets);
        Bf bfD = d(windowInsets);
        Insets insets = windowInsets.getInsets(2);
        Intrinsics.e(insets, "getInsets(...)");
        return a(bfE, bfC, bfD, new Bf(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final Bf c(WindowInsets windowInsets) {
        Intrinsics.f(windowInsets, "<this>");
        L3 l3 = L3.f22938a;
        if (l3.z()) {
            Insets insets = windowInsets.getInsets(128);
            Intrinsics.e(insets, "getInsets(...)");
            return new Bf(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!l3.x()) {
            return (Bf) f23897a.getX();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new Bf(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final Bf d(WindowInsets windowInsets) {
        int iSin;
        int iSin2;
        int iSin3;
        Intrinsics.f(windowInsets, "<this>");
        if (!L3.f22938a.A()) {
            return (Bf) f23897a.getX();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        int iSin4 = 0;
        if (roundedCorner != null) {
            iSin = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner.getRadius()));
        } else {
            iSin = 0;
        }
        if (roundedCorner2 != null) {
            iSin2 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner2.getRadius()));
        } else {
            iSin2 = 0;
        }
        if (roundedCorner3 != null) {
            iSin3 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner3.getRadius()));
        } else {
            iSin3 = 0;
        }
        if (roundedCorner4 != null) {
            iSin4 = (int) (Math.sin(Math.toRadians(45.0d)) * ((double) roundedCorner4.getRadius()));
        }
        return new Bf(Math.max(iSin, iSin2), Math.max(iSin2, iSin3), Math.max(iSin4, iSin3), Math.max(iSin, iSin4));
    }

    public static final Bf e(WindowInsets windowInsets) {
        Intrinsics.f(windowInsets, "<this>");
        L3 l3 = L3.f22938a;
        if (!l3.z()) {
            return l3.y() ? new Bf(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (Bf) f23897a.getX();
        }
        Insets insets = windowInsets.getInsets(16);
        Intrinsics.e(insets, "getInsets(...)");
        return new Bf(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final Bf a(WindowInsets windowInsets) {
        Intrinsics.f(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (Bf) f23897a.getX());
    }

    public static final Bf a(Bf area, Bf display, Bf roundedCorner, Bf navigationBar) {
        Intrinsics.f(area, "area");
        Intrinsics.f(display, "display");
        Intrinsics.f(roundedCorner, "roundedCorner");
        Intrinsics.f(navigationBar, "navigationBar");
        return new Bf(ComparisonsKt.b(area.f22728a, display.f22728a, roundedCorner.f22728a, navigationBar.f22728a), ComparisonsKt.b(area.f22729b, display.f22729b, roundedCorner.f22729b, navigationBar.f22729b), ComparisonsKt.b(area.f22730c, display.f22730c, roundedCorner.f22730c, navigationBar.f22730c), ComparisonsKt.b(area.d, display.d, roundedCorner.d, navigationBar.d));
    }
}
