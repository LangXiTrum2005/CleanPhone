package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11094x extends AbstractC1387Gj {
    public static byte[] A07;
    public static String[] A08 = {"opNTFb7MfNeLnBf1OFt8H8u3IMVbRu1d", "IWQCWQwp5ID5RPcOdaIzYqbwlbVDrClG", "KvkPuVSJhScWrt17epNc", "F0ODCmRg5uMMagWpVfR8fmvJ1OUGt5pq", "F5r", "wG3QjEZJL94bFBL8PiZK", "A8E1xGSXICDDUeWE8x490gS0hcqgXwJC", "2T9PYA9x4VF1QbksNYikemvLXt0jGXOu"};
    public AbstractC2013c3 A00;
    public DZ A01;
    public final ImageView A02;
    public final InterfaceC1668Rk A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;
    public final AtomicBoolean A06;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{-17, -25, -27, -20};
    }

    static {
        A07();
    }

    public C11094x(C2300gi c2300gi, ZU zu, VA va, AbstractC2465jd abstractC2465jd, C1706Sx c1706Sx, InterfaceC1841Yh interfaceC1841Yh) {
        super(c2300gi, zu, va, abstractC2465jd, c1706Sx, interfaceC1841Yh);
        this.A03 = new C1380Gc(this);
        this.A05 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
        this.A06 = new AtomicBoolean(false);
        this.A02 = new ImageView(getContext());
        if (abstractC2465jd.A29().A0H().A04() > 0) {
            this.A01 = new DZ(c2300gi, abstractC2465jd.A29().A0H().A04() * 1000);
        }
        this.A02.setScaleType(ImageView.ScaleType.CENTER);
        this.A02.setAdjustViewBounds(true);
        new LM(this.A02, super.A05).A05(super.A03.A29().A0H().A00(), super.A03.A29().A0H().A01()).A06(new C1379Gb(this)).A07(super.A03.A29().A0H().A08());
    }

    private AbstractC2013c3 A01(int i2) {
        if (this.A02.getParent() != null) {
            YB.A0J(this.A02);
        }
        C2016c6 c2016c6A0M = new C2016c6(super.A05, super.A06, this.A0A, super.A03, this.A02, this.A0C, this.A08).A0J(this.A09.getToolbarHeight()).A0P(this.A09).A0I(i2).A0M(this.A07);
        if (this.A01 != null) {
            c2016c6A0M.A0R(this.A01);
        }
        c2016c6A0M.A0L(C1553Mu.A00(super.A05, super.A06, A03(0, 0, 52), XB.A00(super.A03.A29().A0J().A05()), new HashMap(), super.A03.A2A()));
        C2017c7 params = c2016c6A0M.A0U();
        return AbstractC2014c4.A00(params, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06() {
        if (this.A05.get() && this.A04.get()) {
            A0e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    private void A08(int i2) {
        boolean z2;
        YB.A0J(this.A00);
        this.A00 = A01(i2);
        this.A00.setAccidentalClickCappingListener(new InterfaceC1550Mr() { // from class: com.facebook.ads.redexgen.X.Gd
            @Override // com.facebook.ads.redexgen.core.InterfaceC1550Mr
            public final void ACk() {
                this.A00.A0n();
            }
        });
        C1558Na colors = this.A00.getColors();
        Integer backgroundColorForToolbar = getBackgroundColorForToolbar();
        boolean z3 = true;
        if (backgroundColorForToolbar == null) {
            if (this.A00 != null) {
                if (!this.A00.A1O()) {
                    AbstractC2013c3 abstractC2013c3 = this.A00;
                    if (A08[4].length() == 3) {
                        String[] strArr = A08;
                        strArr[2] = "fKHhGKaWmtnLqlWg01lC";
                        strArr[5] = "lG6mBbCbmu9ZuvMubYOS";
                        if (!(abstractC2013c3 instanceof AbstractC1481Ka)) {
                            z2 = false;
                        }
                        YB.A0N(this, colors.A08(z2));
                    }
                }
                z2 = true;
                YB.A0N(this, colors.A08(z2));
            } else {
                z2 = false;
                YB.A0N(this, colors.A08(z2));
            }
            throw new RuntimeException();
        }
        int iIntValue = backgroundColorForToolbar.intValue();
        String[] strArr2 = A08;
        if (strArr2[2].length() != strArr2[5].length()) {
            YB.A0N(this, iIntValue);
        } else {
            A08[0] = "OBMiQo8I4Ts7yjqshk6bkpwsmCqa0sTm";
            YB.A0N(this, iIntValue);
        }
        AbstractC1835Yb abstractC1835Yb = this.A09;
        String[] strArr3 = A08;
        if (strArr3[2].length() == strArr3[5].length()) {
            String[] strArr4 = A08;
            strArr4[2] = "a7i0pPPxGgijq0ih0stJ";
            strArr4[5] = "yYRdNfPwhLNXT50Mgldr";
            abstractC1835Yb.setFullscreen(this.A00.A1O());
            this.A09.A0D(colors, ViewOnClickListenerC1498Kr.A05(super.A03));
            A0j(this.A00);
            if (super.A01 != null) {
                addView(super.A01, 0, AbstractC1387Gj.A0H);
            }
            if (this.A00 == null || !this.A00.A1O()) {
                z3 = false;
            }
            setUpFullscreenMode(z3);
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final AbstractC1835Yb A0c() {
        AbstractC1835Yb abstractC1835YbA0c = super.A0c();
        if (super.A03.A2T()) {
            abstractC1835YbA0c.setOnClickListener(new ViewOnClickListenerC2121dn(this));
        }
        return abstractC1835YbA0c;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final void A0g() {
        if (this.A00 != null) {
            this.A07.A04(VH.A0Y, null);
            EnumC1549Mq enumC1549MqA1B = this.A00.A1B(A03(0, 4, 63));
            if (super.A03.A2N()) {
                return;
            }
            EnumC1549Mq actionOutcome = EnumC1549Mq.A09;
            if (enumC1549MqA1B != actionOutcome) {
                EnumC1549Mq actionOutcome2 = EnumC1549Mq.A06;
                if (enumC1549MqA1B != actionOutcome2) {
                    A0f();
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final void A0h() {
        YB.A0L(this.A00);
        YB.A0L(this.A09);
        this.A04.set(true);
        A06();
        int iA04 = super.A03.A29().A0H().A04();
        int secondsForNextCta = super.A03.A29().A0H().A02();
        if (iA04 > 0) {
            if (this.A00 != null) {
                this.A00.A1G();
            }
            A0i(iA04, new C1378Ga(this), this.A01);
            if (secondsForNextCta == 0 || secondsForNextCta >= iA04) {
                super.A02 = true;
                this.A09.setToolbarActionMode(8);
                return;
            } else {
                if (secondsForNextCta <= 0) {
                    return;
                }
                this.A09.setProgressSpinnerInvisible(true);
                A0i(secondsForNextCta, new GZ(this), null);
                return;
            }
        }
        this.A06.set(true);
        AbstractC1835Yb abstractC1835Yb = this.A09;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC1835Yb.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final void A0k(C1662Re c1662Re) {
        FrameLayout.LayoutParams layoutParams;
        c1662Re.A0A(this.A03);
        int orientation = c1662Re.A05().getResources().getConfiguration().orientation;
        A08(orientation);
        if (A0m()) {
            YB.A0J(this.A09);
        }
        if (A0m()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Rect requestedMargins = this.A09.getRequestedMargins();
            if (requestedMargins == null) {
                layoutParams.setMargins(0, XV.A0r, 0, 0);
            } else {
                int i2 = requestedMargins.left;
                int i3 = requestedMargins.top;
                int i4 = requestedMargins.right;
                int i5 = requestedMargins.bottom;
                if (A08[4].length() != 3) {
                    throw new RuntimeException();
                }
                A08[0] = "j24x2xTHwZJixq019qlFmxSWfXtsmamW";
                layoutParams.setMargins(i2, i3, i4, i5);
            }
        } else {
            int orientation2 = this.A09.getToolbarHeight();
            layoutParams = new FrameLayout.LayoutParams(-1, orientation2);
        }
        addView(this.A09, layoutParams);
        YB.A0H(this.A00);
        YB.A0H(this.A09);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final boolean A0l() {
        if (this.A00 == null) {
            return false;
        }
        AbstractC2013c3 abstractC2013c3 = this.A00;
        if (A08[4].length() != 3) {
            throw new RuntimeException();
        }
        A08[4] = "kMg";
        return abstractC2013c3.A1P(false);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final boolean A0m() {
        return super.A03.A1j() || super.A03.A1y();
    }

    public final /* synthetic */ void A0n() {
        A0f();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFA(boolean z2) {
        if (this.A00 != null) {
            this.A00.A1L(z2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFi(boolean z2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        if (this.A00 != null) {
            return this.A00.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A03.A29().A0T() && !A0m()) {
            A08(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj, com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void onDestroy() {
        if (C1750Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A02);
        }
        if (this.A00 != null) {
            AbstractC2013c3 abstractC2013c3 = this.A00;
            String[] strArr = A08;
            if (strArr[6].charAt(10) != strArr[1].charAt(10)) {
                throw new RuntimeException();
            }
            A08[4] = "hIQ";
            abstractC2013c3.A1C();
        }
        super.onDestroy();
    }
}
