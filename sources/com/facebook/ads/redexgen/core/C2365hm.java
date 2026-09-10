package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2365hm implements QP {
    public static byte[] A01;
    public final /* synthetic */ C7M A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, 15, 15, 8, 7, -61, 4, 23, 23, 4, 6, 11, -61, 18, 17, -61, 4, -61, 6, 11, 12, 15, 7, -61, 26, 11, 12, 6, 11, -61, 12, 22, -61, 17, 18, 23, -61, 7, 8, 23, 4, 6, 11, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C2365hm(C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void A4K(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        RK rkA0F = C7M.A0F(view);
        if (rkA0F != null) {
            if (rkA0F.A0i() || rkA0F.A0l()) {
                rkA0F.A0V();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + rkA0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i2, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void A5w(int i2) {
        RK rkA0F;
        View view = A7H(i2);
        if (view != null && (rkA0F = C7M.A0F(view)) != null) {
            if (!rkA0F.A0i() || rkA0F.A0l()) {
                rkA0F.A0Z(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + rkA0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i2);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final View A7H(int i2) {
        return this.A00.getChildAt(i2);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final int A7I() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final RK A7L(View view) {
        return C7M.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final int AA7(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void ADo(View view) {
        RK rkA0F = C7M.A0F(view);
        if (rkA0F != null) {
            rkA0F.A0D(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AEa(View view) {
        RK rkA0F = C7M.A0F(view);
        if (rkA0F != null) {
            rkA0F.A0E(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AIQ() {
        int iA7I = A7I();
        for (int i2 = 0; i2 < iA7I; i2++) {
            View viewA7H = A7H(i2);
            this.A00.A1g(viewA7H);
            viewA7H.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void AIW(int i2) {
        View childAt = this.A00.getChildAt(i2);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i2);
    }

    @Override // com.facebook.ads.redexgen.core.QP
    public final void addView(View view, int i2) {
        this.A00.addView(view, i2);
        this.A00.A1f(view);
    }
}
