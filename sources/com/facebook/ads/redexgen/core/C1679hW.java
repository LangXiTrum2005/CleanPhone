package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1679hW extends AbstractC0659Dh {
    public C0835Kb A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A03;
    public final C05357t A04;
    public final A7 A05;
    public final C1361cL A06;
    public final AbstractC1343c3 A07;
    public final AbstractC1341c1 A08;
    public final C1315bb A09;
    public final ViewOnClickListenerC1308bU A0A;
    public final C1307bT A0B;
    public final JK A0C;
    public final JL A0D;

    public C1679hW(C1828k1 c1828k1, A7 a7, C05357t c05357t, AF af, View.OnClickListener onClickListener) {
        super(c1828k1, onClickListener);
        this.A02 = false;
        this.A01 = false;
        this.A07 = new C0873Lo(this);
        this.A08 = new C0872Ln(this);
        this.A05 = a7;
        this.A04 = c05357t;
        this.A0C = A00();
        this.A0D = A07();
        this.A03 = new FrameLayout(c1828k1);
        addView(this.A03, new RelativeLayout.LayoutParams(-1, -1));
        this.A06 = A01(af);
        this.A0A = A04();
        this.A09 = A03();
        this.A0B = A06(af);
        A0C();
    }

    private C1685hc A00() {
        return new C1685hc(this);
    }

    private C1361cL A01(AF af) {
        C1361cL c1361cL = new C1361cL(super.A01);
        D3.A0I(c1361cL);
        c1361cL.setFunnelLoggingHandler(af);
        c1361cL.getEventBus().A03(this.A07, this.A08);
        if (C05789m.A1S(super.A01)) {
            c1361cL.setVolume(0.0f);
        }
        if (!C05789m.A1N(super.A01)) {
            c1361cL.setOnClickListener(new ViewOnClickListenerC0661Dj(this));
        }
        RelativeLayout.LayoutParams videoLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(c1361cL, videoLayoutParams);
        return c1361cL;
    }

    private C1315bb A03() {
        C1315bb c1315bb = new C1315bb(super.A01);
        c1315bb.setTextColor(-1);
        D3.A0W(c1315bb, false, 12);
        c1315bb.setGravity(17);
        this.A06.A0h(c1315bb);
        return c1315bb;
    }

    private ViewOnClickListenerC1308bU A04() {
        ViewOnClickListenerC1308bU viewOnClickListenerC1308bU = new ViewOnClickListenerC1308bU(super.A01);
        this.A06.A0h(viewOnClickListenerC1308bU);
        return viewOnClickListenerC1308bU;
    }

    private C1307bT A06(AF af) {
        C1307bT c1307bT = new C1307bT(super.A01, af, true);
        c1307bT.setBackgroundPaintColor(855638016);
        this.A06.A0h(c1307bT);
        return c1307bT;
    }

    private JL A07() {
        return new JL(this, 50, true, new WeakReference(this.A0C), super.A01);
    }

    private void A08() {
        if (getVisibility() == 0 && this.A01 && hasWindowFocus()) {
            this.A0D.A0U();
        } else {
            this.A0D.A0V();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0659Dh
    public final void A0A() {
        this.A0D.A0V();
        this.A06.getEventBus().A04(this.A07, this.A08);
        this.A06.A0Y();
        D3.A0H(this.A06);
        if (this.A00 != null) {
            this.A00.A0p();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0659Dh
    public final void A0B() {
        this.A0B.A09();
        this.A02 = true;
        this.A0D.A0U();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0659Dh
    public final void A0C() {
        super.A0C();
        if (C05789m.A1T(super.A01)) {
            D3.A0H(this.A0A);
            this.A0A.setLayoutParams(A00(true, false));
            addView(this.A0A);
        }
        if (C05789m.A1P(super.A01)) {
            D3.A0H(this.A09);
            this.A09.setLayoutParams(A00(true, true));
            addView(this.A09);
        }
        if (C05789m.A1R(super.A01)) {
            D3.A0H(this.A0B);
            this.A0B.setLayoutParams(A00(false, false));
            addView(this.A0B);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0659Dh
    public final boolean A0D() {
        return this.A06.A0n();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0659Dh
    public final boolean A0E() {
        if (getMeasuredWidth() <= 0 || this.A06.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) (((double) (getMeasuredWidth() - this.A06.getMeasuredWidth())) / 2.0d);
        int i = AbstractC0659Dh.A05;
        int widthGap = AbstractC0659Dh.A04;
        return measuredWidth > i + (widthGap * 2);
    }

    public final C1679hW A0F(String str, String str2, String str3, String str4, String str5) {
        this.A06.setVideoURI(this.A04.A0S(str2));
        this.A00 = new C0835Kb(super.A01, this.A05, this.A06, str);
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            new AsyncTaskC1623gc(this.A03, super.A01).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1680hX(this)).A07(str3);
        }
        if (str5 != null) {
            this.A0A.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0A.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0659Dh
    public int getMediaViewId() {
        return this.A06.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01 = true;
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = false;
        A08();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A08();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A08();
    }
}
