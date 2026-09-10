package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2354ha extends AbstractC1656Qy {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(RK rk);

    public abstract boolean A0Y(RK rk);

    public abstract boolean A0Z(RK rk, int i2, int i3, int i4, int i5);

    public abstract boolean A0a(RK rk, RK rk2, int i2, int i3, int i4, int i5);

    @Override // com.facebook.ads.redexgen.core.AbstractC1656Qy
    public final boolean A0N(RK rk) {
        return !this.A00 || rk.A0f();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1656Qy
    public final boolean A0O(RK rk, C1655Qx c1655Qx, C1655Qx c1655Qx2) {
        if (c1655Qx != null && (c1655Qx.A01 != c1655Qx2.A01 || c1655Qx.A03 != c1655Qx2.A03)) {
            return A0Z(rk, c1655Qx.A01, c1655Qx.A03, c1655Qx2.A01, c1655Qx2.A03);
        }
        return A0X(rk);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1656Qy
    public final boolean A0P(RK rk, C1655Qx c1655Qx, C1655Qx c1655Qx2) {
        int i2 = c1655Qx.A01;
        int oldLeft = c1655Qx.A03;
        View view = rk.A0H;
        int oldTop = c1655Qx2 == null ? view.getLeft() : c1655Qx2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top2 = c1655Qx2 == null ? view.getTop() : c1655Qx2.A03;
        if (!rk.A0g() && (i2 != oldTop || oldLeft != top2)) {
            view.layout(oldTop, top2, view.getWidth() + oldTop, view.getHeight() + top2);
            return A0Z(rk, i2, oldLeft, oldTop, top2);
        }
        return A0Y(rk);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1656Qy
    public final boolean A0Q(RK rk, C1655Qx c1655Qx, C1655Qx c1655Qx2) {
        if (c1655Qx.A01 != c1655Qx2.A01 || c1655Qx.A03 != c1655Qx2.A03) {
            return A0Z(rk, c1655Qx.A01, c1655Qx.A03, c1655Qx2.A01, c1655Qx2.A03);
        }
        A0U(rk);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1656Qy
    public final boolean A0R(RK rk, RK rk2, C1655Qx c1655Qx, C1655Qx c1655Qx2) {
        int i2;
        int i3;
        int i4 = c1655Qx.A01;
        int i5 = c1655Qx.A03;
        if (rk2.A0l()) {
            i2 = c1655Qx.A01;
            i3 = c1655Qx.A03;
        } else {
            i2 = c1655Qx2.A01;
            i3 = c1655Qx2.A03;
        }
        return A0a(rk, rk2, i4, i5, i2, i3);
    }

    public final void A0T(RK rk) {
        A0K(rk);
    }

    public final void A0U(RK rk) {
        A0K(rk);
    }

    public final void A0V(RK rk) {
        A0K(rk);
    }

    public final void A0W(RK rk, boolean z2) {
        A0K(rk);
    }
}
