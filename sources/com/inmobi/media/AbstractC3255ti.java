package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import androidx.core.view.hardpan;
import com.inmobi.media.AbstractC3255ti;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import frenchy.dern;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3255ti {
    public static final taiyuan a = saneness.saneness(new Function0() { // from class: adsuki.liquory
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3255ti.a();
        }
    });

    public static final JSONObject a(String str, int i) throws JSONException {
        JSONObject jSONObjectA = Si.a(str, "targetViewId", "id", str);
        jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        return jSONObjectA;
    }

    public static final vo b(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        vo voVarE = e(windowInsets);
        vo voVarC = c(windowInsets);
        vo voVarD = d(windowInsets);
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        Insets insets = windowInsets.getInsets(hardpan.triweekly.marial());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return a(voVarE, voVarC, voVarD, new vo(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final vo c(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        C3342x5.a.getClass();
        if (C3342x5.r()) {
            Insets insets = windowInsets.getInsets(hardpan.triweekly.attabal());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            return new vo(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!C3342x5.p()) {
            return (vo) a.getValue();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new vo(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final vo d(WindowInsets windowInsets) {
        int iSin;
        int iSin2;
        int iSin3;
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        C3342x5.a.getClass();
        if (!C3342x5.s()) {
            return (vo) a.getValue();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int iSin4 = 0;
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
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
        return new vo(Math.max(iSin, iSin2), Math.max(iSin2, iSin3), Math.max(iSin4, iSin3), Math.max(iSin, iSin4));
    }

    public static final vo e(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        C3342x5.a.getClass();
        if (!C3342x5.r()) {
            return C3342x5.q() ? new vo(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (vo) a.getValue();
        }
        Insets insets = windowInsets.getInsets(hardpan.triweekly.impromptu());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return new vo(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final vo a() {
        return new vo(0, 0, 0, 0);
    }

    public static final vo a(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (vo) a.getValue());
    }

    public static final vo a(vo area, vo display, vo roundedCorner, vo navigationBar) {
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(roundedCorner, "roundedCorner");
        Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        return new vo(dern.impromptu(area.a, display.a, roundedCorner.a, navigationBar.a), dern.impromptu(area.b, display.b, roundedCorner.b, navigationBar.b), dern.impromptu(area.c, display.c, roundedCorner.c, navigationBar.c), dern.impromptu(area.d, display.d, roundedCorner.d, navigationBar.d));
    }
}
