package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1894l6 implements C5P {
    public static byte[] A01;
    public final /* synthetic */ MG A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-26, 4, cw.m, cw.m, 8, 7, -61, 4, 23, 23, 4, 6, 11, -61, 18, 17, -61, 4, -61, 6, 11, 12, cw.m, 7, -61, 26, 11, 12, 6, 11, -61, 12, 22, -61, 17, 18, 23, -61, 7, 8, 23, 4, 6, 11, 8, 7, -35, -61, -53, -55, -44, -44, -51, -52, -120, -52, -51, -36, -55, -53, -48, -120, -41, -42, -120, -55, -42, -120, -55, -44, -38, -51, -55, -52, -31, -120, -52, -51, -36, -55, -53, -48, -51, -52, -120, -53, -48, -47, -44, -52, -120};
    }

    public C1894l6(MG mg) {
        this.A00 = mg;
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final void A4A(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C6K c6kA0F = MG.A0F(view);
        if (c6kA0F != null) {
            if (c6kA0F.A0c() || c6kA0F.A0f()) {
                c6kA0F.A0P();
            } else {
                throw new IllegalArgumentException(A00(0, 48, 91) + c6kA0F + this.A00.A1J());
            }
        }
        this.A00.attachViewToParent(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final void A5m(int i) {
        C6K c6kA0F;
        View view = A77(i);
        if (view != null && (c6kA0F = MG.A0F(view)) != null) {
            if (!c6kA0F.A0c() || c6kA0F.A0f()) {
                c6kA0F.A0T(256);
            } else {
                throw new IllegalArgumentException(A00(48, 43, 32) + c6kA0F + this.A00.A1J());
            }
        }
        this.A00.detachViewFromParent(i);
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final View A77(int i) {
        return this.A00.getChildAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final int A78() {
        return this.A00.getChildCount();
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final C6K A7B(View view) {
        return MG.A0F(view);
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final int A9x(View view) {
        return this.A00.indexOfChild(view);
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final void AD3(View view) {
        C6K c6kA0F = MG.A0F(view);
        if (c6kA0F != null) {
            c6kA0F.A07(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final void ADo(View view) {
        C6K c6kA0F = MG.A0F(view);
        if (c6kA0F != null) {
            c6kA0F.A08(this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final void AHW() {
        int iA78 = A78();
        for (int i = 0; i < iA78; i++) {
            View viewA77 = A77(i);
            this.A00.A1g(viewA77);
            viewA77.clearAnimation();
        }
        this.A00.removeAllViews();
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final void AHc(int i) {
        View childAt = this.A00.getChildAt(i);
        if (childAt != null) {
            this.A00.A1g(childAt);
            childAt.clearAnimation();
        }
        this.A00.removeViewAt(i);
    }

    @Override // com.facebook.ads.redexgen.core.C5P
    public final void addView(View view, int i) {
        this.A00.addView(view, i);
        this.A00.A1f(view);
    }
}
