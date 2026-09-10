package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0850Kq extends AbstractC1476eD {
    public static byte[] A06;
    public static String[] A07 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC0723Ft A00;
    public final ImageView A01;
    public final InterfaceC05006k A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{-28, -36, -38, -31};
    }

    static {
        A07();
    }

    public C0850Kq(C1828k1 c1828k1, EC ec, A7 a7, AbstractC1984md abstractC1984md, C05357t c05357t, DR dr) {
        super(c1828k1, ec, a7, abstractC1984md, c05357t, dr);
        this.A02 = new C1461dy(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        this.A01 = new ImageView(getContext());
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setAdjustViewBounds(true);
        new AsyncTaskC1623gc(this.A01, super.A04).A05(super.A02.A1b().A0F().A00(), super.A02.A1b().A0F().A01()).A06(new C1460dx(this)).A07(super.A02.A1b().A0F().A08());
    }

    private AbstractC0723Ft A01(int i) {
        if (this.A01.getParent() != null) {
            D3.A0H(this.A01);
        }
        return AbstractC0724Fu.A00(new C0726Fw(super.A04, super.A05, this.A09, super.A02, this.A01, this.A0B, this.A07).A0H(this.A08.getToolbarHeight()).A0N(this.A08).A0G(i).A0Q(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A04.get() && this.A03.get()) {
            A0a();
        }
    }

    private void A08(int i) {
        D3.A0H(this.A00);
        this.A00 = A01(i);
        C03912c colors = this.A00.getColors();
        D3.A0K(this, colors.A08(this.A00 != null && (this.A00.A17() || (this.A00 instanceof AbstractC1603gH))));
        this.A08.setFullscreen(this.A00.A17());
        this.A08.A0A(colors, ViewOnClickListenerC1617gW.A09(super.A02));
        addView(this.A00, 0, AbstractC1476eD.A0E);
        setUpFullscreenMode(this.A00 != null && this.A00.A17());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final DQ A0Z() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(super.A04, this.A09, this.A06, 1, super.A02.A1V(), super.A02.A1M());
        if (super.A02.A1p()) {
            fullScreenAdToolbar.setOnClickListener(new HJ(this));
        }
        return fullScreenAdToolbar;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final void A0b() {
        if (this.A00 != null) {
            this.A06.A04(AE.A0Y, null);
            this.A00.A18(A03(0, 4, 52));
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final void A0c() {
        D3.A0J(this.A00);
        D3.A0J(this.A08);
        this.A03.set(true);
        A06();
        int secondsForNextCta = super.A02.A1b().A0F().A04();
        int iA02 = super.A02.A1b().A0F().A02();
        if (secondsForNextCta > 0) {
            if (this.A00 != null) {
                this.A00.A13();
            }
            A0d(secondsForNextCta, new C1459dw(this));
            if (iA02 == 0 || iA02 >= secondsForNextCta) {
                super.A01 = true;
                this.A08.setToolbarActionMode(8);
                return;
            } else {
                if (iA02 <= 0) {
                    return;
                }
                this.A08.setProgressSpinnerInvisible(true);
                A0d(iA02, new C1456dt(this));
                return;
            }
        }
        this.A05.set(true);
        DQ dq = this.A08;
        int unskippableSeconds = getCloseButtonStyle();
        dq.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final void A0e(C04946e c04946e) {
        c04946e.A0A(this.A02);
        int orientation = c04946e.A05().getResources().getConfiguration().orientation;
        A08(orientation);
        addView(this.A08, new FrameLayout.LayoutParams(-1, this.A08.getToolbarHeight()));
        D3.A0F(this.A00);
        D3.A0F(this.A08);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final boolean A0f() {
        if (this.A00 == null) {
            return false;
        }
        AbstractC0723Ft abstractC0723Ft = this.A00;
        if (A07[4].length() != 3) {
            throw new RuntimeException();
        }
        A07[4] = "kMg";
        return abstractC0723Ft.A19(false);
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEP(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEs(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A02.A1b().A0Q()) {
            A08(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD, com.facebook.ads.redexgen.core.DS
    public final void onDestroy() {
        if (C05789m.A1s(super.A04)) {
            super.A04.A0B().AJZ(this.A01);
        }
        if (this.A00 != null) {
            AbstractC0723Ft abstractC0723Ft = this.A00;
            String[] strArr = A07;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A07[4] = "hIQ";
            abstractC0723Ft.A0z();
        }
        super.onDestroy();
    }
}
