package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1879kq extends AbstractC04885y {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0R(C6K c6k);

    public abstract boolean A0S(C6K c6k);

    public abstract boolean A0T(C6K c6k, int i, int i2, int i3, int i4);

    public abstract boolean A0U(C6K c6k, C6K c6k2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.core.AbstractC04885y
    public final boolean A0D(C6K c6k) {
        return !this.A00 || c6k.A0Z();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04885y
    public final boolean A0E(C6K c6k, C04875x c04875x, C04875x c04875x2) {
        if (c04875x != null && (c04875x.A01 != c04875x2.A01 || c04875x.A03 != c04875x2.A03)) {
            return A0T(c6k, c04875x.A01, c04875x.A03, c04875x2.A01, c04875x2.A03);
        }
        return A0R(c6k);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04885y
    public final boolean A0F(C6K c6k, C04875x c04875x, C04875x c04875x2) {
        int i = c04875x.A01;
        int oldLeft = c04875x.A03;
        View view = c6k.A0H;
        int oldTop = c04875x2 == null ? view.getLeft() : c04875x2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c04875x2 == null ? view.getTop() : c04875x2.A03;
        if (!c6k.A0a() && (i != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0T(c6k, i, oldLeft, oldTop, top);
        }
        return A0S(c6k);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04885y
    public final boolean A0G(C6K c6k, C04875x c04875x, C04875x c04875x2) {
        if (c04875x.A01 != c04875x2.A01 || c04875x.A03 != c04875x2.A03) {
            return A0T(c6k, c04875x.A01, c04875x.A03, c04875x2.A01, c04875x2.A03);
        }
        A0O(c6k);
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC04885y
    public final boolean A0H(C6K c6k, C6K c6k2, C04875x c04875x, C04875x c04875x2) {
        int i;
        int i2;
        int i3 = c04875x.A01;
        int i4 = c04875x.A03;
        if (c6k2.A0f()) {
            i = c04875x.A01;
            i2 = c04875x.A03;
        } else {
            i = c04875x2.A01;
            i2 = c04875x2.A03;
        }
        return A0U(c6k, c6k2, i3, i4, i, i2);
    }

    public final void A0N(C6K c6k) {
        A0C(c6k);
    }

    public final void A0O(C6K c6k) {
        A0C(c6k);
    }

    public final void A0P(C6K c6k) {
        A0C(c6k);
    }

    public final void A0Q(C6K c6k, boolean z) {
        A0C(c6k);
    }
}
