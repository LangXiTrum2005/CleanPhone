package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1431dT extends FrameLayout implements DS {
    public static byte[] A0B;
    public static final RelativeLayout.LayoutParams A0C;
    public C04946e A00;
    public Intent A01;
    public Bundle A02;
    public DS A03;
    public final AbstractC1984md A04;
    public final AbstractC1984md A05;
    public final C04946e A06;
    public final C1828k1 A07;
    public final A7 A08;
    public final ViewOnSystemUiVisibilityChangeListenerC0642Cq A09;
    public final DR A0A;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0B = new byte[]{117, 105, 100, 102, 96, 104, 96, 107, 113};
    }

    static {
        A0A();
        A0C = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1431dT(C1828k1 c1828k1, A7 a7, AbstractC1984md abstractC1984md, AbstractC1984md abstractC1984md2, DR dr, C04946e c04946e) {
        super(c1828k1);
        this.A07 = c1828k1;
        this.A08 = a7;
        this.A05 = abstractC1984md;
        this.A04 = abstractC1984md2;
        this.A0A = dr;
        this.A06 = c04946e;
        this.A09 = new ViewOnSystemUiVisibilityChangeListenerC0642Cq(this);
        this.A09.A05(EnumC0641Cp.A02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1669hM A05(C0770Ho c0770Ho, EC ec) {
        return new C1669hM(this.A07, this.A08, this.A0A, this.A04, this.A04.A0s(), ec, true, c0770Ho);
    }

    private C0843Kj A06() {
        if (this.A04.A1b().A0F().A07() != null) {
            this.A05.A14(this.A04.A1b().A0F().A07().A0N());
            this.A05.A15(this.A04.A1b().A0F().A07().A0P());
        }
        C1664hH c1664hH = new C1664hH();
        C0770Ho c0770HoA07 = A07(c1664hH, this.A04);
        C0843Kj c0843Kj = new C0843Kj(this.A07, c1664hH, this.A08, this.A05, new C05357t(this.A07), this.A0A);
        c0843Kj.setVideoLeadingPlayableAdListener(new C1432dU(this, c0770HoA07, c1664hH));
        return c0843Kj;
    }

    private C0770Ho A07(EC ec, AbstractC1984md abstractC1984md) {
        C04042p c04042pA07 = abstractC1984md.A1b().A0F().A07();
        if (c04042pA07 == null || !c04042pA07.A0M()) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(A08(0, 9, 37), ec.A8b());
        return new C0770Ho(this.A07, abstractC1984md, c04042pA07, this.A08, null, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        if (this.A03 != null) {
            this.A03.onDestroy();
            if (this.A03 instanceof View) {
                ((View) this.A03).setVisibility(8);
                removeView((View) this.A03);
            }
        }
    }

    private final void A0B(Intent intent, Bundle bundle, C04946e c04946e) {
        this.A03 = A06();
        this.A03.AAj(intent, bundle, c04946e);
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AAj(Intent intent, Bundle bundle, C04946e c04946e) {
        this.A01 = intent;
        this.A02 = bundle;
        this.A00 = c04946e;
        this.A0A.A3v(this, A0C);
        A0B(intent, bundle, c04946e);
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEP(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEs(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AI1(Bundle bundle) {
    }

    public DS getContentView() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public String getCurrentClientToken() {
        return this.A05.A1g();
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void onDestroy() {
    }

    public void setListener(DR dr) {
    }
}
