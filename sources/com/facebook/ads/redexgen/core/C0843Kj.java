package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0843Kj extends AbstractC1476eD {
    public static byte[] A0U;
    public static String[] A0V = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public AE A01;
    public DQ A02;
    public AbstractC0723Ft A03;
    public HU A04;
    public I7 A05;
    public IP A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G;
    public final View A0H;
    public final InterfaceC05006k A0I;
    public final HT A0J;
    public final C1366cQ A0K;
    public final C1361cL A0L;
    public final C0835Kb A0M;
    public final AbstractC1343c3 A0N;
    public final AbstractC1341c1 A0O;
    public final AbstractC1337bx A0P;
    public final AbstractC1335bv A0Q;
    public final AbstractC1333bt A0R;
    public final AbstractC1332bs A0S;
    public final C1283b5 A0T;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0U, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0U = new byte[]{23, 63, 41, 47, 63, 17, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 61, 42, 56, 46, 61, 43, 42, 43, cw.n, 57, 38, 43, 42, 32, 49, 41, 43, 50};
    }

    static {
        A0F();
    }

    public C0843Kj(C1828k1 c1828k1, EC ec, A7 a7, AbstractC1984md abstractC1984md, C05357t c05357t, DR dr) {
        super(c1828k1, ec, a7, abstractC1984md, c05357t, dr);
        this.A0I = new C1438da(this);
        this.A0R = new C0849Kp(this);
        this.A0Q = new C0848Ko(this);
        this.A0P = new C0847Kn(this);
        this.A0S = new C0846Km(this);
        this.A0N = new C0845Kl(this);
        this.A0O = new C0844Kk(this);
        boolean z = false;
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A0C = false;
        this.A0A = false;
        this.A00 = 0;
        this.A07 = false;
        this.A09 = false;
        this.A01 = AE.A0c;
        this.A0G = new Handler(Looper.getMainLooper());
        this.A0J = new C1433dV(this);
        this.A0L = new C1361cL(super.A04);
        this.A0L.setFunnelLoggingHandler(super.A06);
        this.A0L.getEventBus().A03(this.A0R, this.A0Q, this.A0P, this.A0S, this.A0N, this.A0O);
        this.A0B = abstractC1984md.A1N();
        this.A0M = new C0835Kb(super.A04, super.A05, this.A0L, super.A02.A1g());
        if (C05789m.A1t(super.A04)) {
            this.A0K = new C1366cQ(super.A04, super.A05, this.A0L, super.A02.A1g(), this.A0M, null);
        } else {
            this.A0K = null;
        }
        this.A05 = new I7(super.A04, super.A0A, super.A02.A0s(), dr);
        if (!super.A02.A1P()) {
            this.A0H = new C1307bT(super.A04, super.A06);
        } else {
            this.A0H = new C1306bS(super.A04, super.A06);
        }
        int iA02 = (super.A02.A1G() || super.A02.A1P()) ? A02(super.A02) * 1000 : -1;
        if (!super.A02.A1P()) {
            this.A0T = new C1283b5(super.A04, iA02);
        } else {
            this.A0T = new C1283b5(super.A04, iA02, C1283b5.A0B);
        }
        if (this.A0B || super.A02.A1H()) {
            this.A0T.setVisibility(8);
        }
        A0E();
        this.A0L.setVideoURI(super.A03.A0S(super.A02.A1b().A0F().A09()));
        A0C();
        int iA04 = super.A02.A1b().A0F().A04();
        if (C05789m.A2H(super.A04)) {
            this.A0C = iA04 == 0;
        } else {
            this.A0C = iA04 <= 0;
        }
        if (super.A02.A1b().A0P() && super.A02.A1b().A0F().A03() > 0) {
            z = true;
        }
        this.A08 = z;
        D3.A0K(this, super.A02.A1a().A01().A08(true));
        if (C05789m.A2B(super.A04) || super.A02.A1G()) {
            super.A08.setProgressSpinnerInvisible(true);
        }
        if (super.A02.A1O()) {
            super.A04.A0F().ADm();
        }
    }

    private float A00() {
        float fA04 = super.A02.A1b().A0F().A04();
        boolean isRV = super.A0A.A8b().equals(AdPlacementType.REWARDED_VIDEO.toString());
        if (fA04 == -1.0f && isRV && super.A02.A1K()) {
            float videoDuration = this.A0L.getDuration();
            if (videoDuration <= 0.0f) {
                return 0.0f;
            }
            return videoDuration;
        }
        if (!this.A0B) {
            float serverUnskippableSeconds = this.A0L.getDuration();
            return Math.min(1000.0f * fA04, serverUnskippableSeconds);
        }
        return 1000.0f * fA04;
    }

    private int A01(int i, int i2, int i3) {
        int i4 = 0;
        if (this.A0B) {
            int i5 = this.A00;
            if (A0V[4].charAt(26) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[0] = "";
            strArr[1] = "GEJnt8SXHB7Z";
            i4 = i3 * i5;
        }
        int completedVideoCycleDuration = i / 1000;
        return (i2 - i4) - completedVideoCycleDuration;
    }

    private int A02(AbstractC1984md abstractC1984md) {
        if (abstractC1984md.A0i().equals(A09(18, 14, 49))) {
            return abstractC1984md.A1b().A0F().A03();
        }
        if (abstractC1984md.A0i().equals(A09(6, 12, 112))) {
            return abstractC1984md.A1b().A0F().A04();
        }
        String[] strArr = A0V;
        if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[0] = "";
        strArr2[1] = "oU1GMCkqMMy1";
        return 0;
    }

    private AbstractC0723Ft A05(int i) {
        C0726Fw c0726FwA0J = new C0726Fw(super.A04, super.A05, super.A09, super.A02, this.A0L, super.A0B, super.A07).A0H(super.A08.getToolbarHeight()).A0N(super.A08).A0G(i).A0I(this.A0H).A0O(this.A0T).A0M(this.A02).A0J(super.A06);
        if (super.A02.A1b().A0P() && C05789m.A1W(super.A04) && super.A02.A1b().A0J() != null) {
            c0726FwA0J.A0L(getPackageInstallListener());
        }
        return AbstractC0724Fu.A00(c0726FwA0J.A0Q(), null, true);
    }

    private void A0A() {
        if (!super.A02.A1b().A0I().A03()) {
            this.A02 = new FullScreenAdToolbar(super.A04, super.A09, super.A06, 0, super.A02.A1V(), super.A02.A1M());
            this.A02.setFullscreen(true);
            this.A02.A0A(super.A02.A1a().A01(), ViewOnClickListenerC1617gW.A09(super.A02));
            this.A02.setPageDetails(super.A02.A1e(), super.A02.A1g(), 0, super.A02.A1f());
            this.A02.setPageDetailsVisible(false);
            this.A02.setToolbarListener(new C1448dk(this));
            if (super.A02.A1p()) {
                this.A02.setOnClickListener(new HO(this));
            }
        }
    }

    private void A0B() {
        this.A0L.postDelayed(new C1446di(this), C05789m.A0N(super.A04));
    }

    private void A0C() {
        this.A0L.postDelayed(new C1445dh(this), C05789m.A0O(super.A04));
    }

    private void A0D() {
        this.A0C = true;
        super.A08.A07();
        if (this.A03 != null) {
            this.A03.A12();
        }
    }

    private void A0E() {
        this.A0L.A0h(this.A0T);
        if (this.A0H instanceof IQ) {
            this.A0L.A0h((IQ) this.A0H);
        }
        if (!TextUtils.isEmpty(super.A02.A1b().A0F().A08())) {
            KA ka = new KA(super.A04, super.A02.A1P());
            this.A0L.A0h(ka);
            ka.setImage(super.A02.A1b().A0F().A08());
        }
        if (!super.A02.A1P()) {
            IX ix = new IX(super.A04, true, super.A06);
            this.A0L.A0h(ix);
            this.A0L.A0h(new C1311bX(ix, EnumC0787If.A02, true));
        }
        this.A0L.A0h(new C0783Ib(super.A04));
    }

    private void A0G(AE ae) {
        new AF(super.A02.A1g(), super.A04.A0A()).A04(ae, null);
        super.A09.A4Z(super.A0A.A6b());
        this.A05.A05();
        if (this.A03 instanceof LS) {
            ((LS) this.A03).A1G();
        }
        this.A0G.postDelayed(new HQ(this), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(AE ae) {
        if (!this.A07) {
            this.A09 = true;
            this.A01 = ae;
        } else {
            A0G(ae);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(C0834Ka c0834Ka, boolean z, boolean z2) {
        if (this.A04 != null) {
            if (z) {
                super.A04.A0F().ADn();
            }
            super.A04.A0F().ADk();
            this.A04.AHe();
            return;
        }
        if (this.A0D) {
            return;
        }
        if (!z && this.A08 && this.A0B) {
            this.A00++;
            this.A0L.A0g(IP.A02, 20);
            return;
        }
        if (!this.A0C) {
            A0D();
        }
        this.A0D = true;
        if (this.A03 != null) {
            this.A03.A15(c0834Ka);
        }
        super.A08.setToolbarActionMessage(A09(0, 0, 98));
        A0R(z, z2);
        super.A08.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(KX kx) {
        if (this.A0L.getState() == JI.A02 && C05789m.A1X(super.A04)) {
            this.A0L.postDelayed(new C1441dd(this, kx), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(KX kx) {
        float f;
        int iA00 = kx.A00();
        int totalSecondsForNextCta = super.A02.A1b().A0F().A02();
        int currentPosMs = super.A02.A1b().A0F().A05();
        int currentPosMs2 = A01(iA00, totalSecondsForNextCta, currentPosMs);
        if (totalSecondsForNextCta >= 0 && currentPosMs2 <= 0 && !super.A01 && this.A03 != null && this.A03.A16()) {
            super.A01 = true;
            super.A08.setToolbarActionMode(8);
        }
        if (this.A08) {
            int totalSecondsForNextCta2 = super.A02.A1b().A0F().A03();
            int currentPosMs3 = super.A02.A1b().A0F().A05();
            int iA01 = A01(iA00, totalSecondsForNextCta2, currentPosMs3);
            AbstractC1984md abstractC1984md = super.A02;
            if (A0V[6].length() != 22) {
                String[] strArr = A0V;
                strArr[0] = "";
                strArr[1] = "CRWrhlQnYLwh";
                if (!ViewOnClickListenerC1617gW.A09(abstractC1984md)) {
                    boolean zA1O = super.A02.A1O();
                    String strA09 = A09(0, 0, 98);
                    if (!zA1O && !super.A02.A1M() && !super.A02.A1G() && iA01 > 0) {
                        super.A08.setToolbarActionMessage(super.A02.A1f().A02().replace(A09(0, 6, 50), String.valueOf(iA01)));
                    } else {
                        super.A08.setToolbarActionMessage(strA09);
                    }
                }
                if (iA01 <= 0) {
                    A0R(false, false);
                }
            } else {
                throw new RuntimeException();
            }
        }
        float fA00 = A00();
        float totalCurrentPosMs = iA00;
        if (this.A0B) {
            int totalSecondsForNextCta3 = this.A0L.getDuration();
            int currentPosMs4 = this.A00;
            totalCurrentPosMs += totalSecondsForNextCta3 * currentPosMs4;
        }
        if (!super.A02.A1K() || fA00 > 0.0f) {
            f = totalCurrentPosMs / fA00;
        } else {
            f = 1.0f;
        }
        boolean zA1M = super.A02.A1M();
        if (A0V[5].charAt(8) != 102) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0V;
        strArr2[7] = "BY5kACpHY7KFfLoLkWPFyXHXe8tQ4ZYS";
        strArr2[2] = "FXqF0wWRYQoNHbRw7kiC8WRpThpP8Fmr";
        if (!zA1M) {
            float unskippableSeconds = 100.0f * f;
            super.A08.setProgress(unskippableSeconds);
        } else {
            int i = 0;
            if (fA00 - totalCurrentPosMs > 0.0f) {
                int currentPosMs5 = (int) (fA00 - totalCurrentPosMs);
                i = currentPosMs5 / 1000;
            }
            DQ dq = super.A08;
            String[] strArr3 = A0V;
            String str = strArr3[7];
            String str2 = strArr3[2];
            int totalSecondsForNextCta4 = str.charAt(8);
            int currentPosMs6 = str2.charAt(8);
            if (totalSecondsForNextCta4 != currentPosMs6) {
                float unskippableSeconds2 = 100.0f * f;
                dq.A09(unskippableSeconds2, i);
            } else {
                A0V[3] = "ksHgyK5pJeiIhpnbSmOLRLGEWkwS8h7S";
                float unskippableSeconds3 = 100.0f * f;
                dq.A09(unskippableSeconds3, i);
            }
        }
        if (f >= 1.0f && !this.A0C) {
            A0D();
            DQ dq2 = super.A08;
            int currentPosMs7 = getCloseButtonStyle();
            dq2.setToolbarActionMode(currentPosMs7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(String str) {
        int currentPositionInMillis = 0;
        int duration = 0;
        if (this.A0L != null) {
            currentPositionInMillis = this.A0L.getCurrentPositionInMillis();
            duration = this.A0L.getDuration();
            this.A0L.A0d(3);
        }
        super.A04.A0F().A3Q(str);
        if (C05789m.A1Y(super.A04)) {
            A0N(new C0834Ka(currentPositionInMillis, duration), false, true);
        } else {
            super.A09.A4Z(super.A0A.A7r());
            super.A09.A4Z(super.A0A.A7m());
        }
    }

    private synchronized void A0R(boolean z, boolean z2) {
        if (this.A04 != null) {
            this.A08 = false;
            return;
        }
        if (this.A08 && !z && !z2) {
            super.A09.A4Z(super.A0A.A6b());
            this.A05.A05();
            this.A08 = false;
            if (this.A03 != null) {
                this.A03.A10();
            }
            return;
        }
        this.A08 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final DQ A0Z() {
        DQ c1695hn;
        if (!super.A02.A1P()) {
            c1695hn = new FullScreenAdToolbar(super.A04, super.A09, super.A06, 1, super.A02.A1V(), super.A02.A1M());
        } else {
            c1695hn = new C1695hn(super.A04, super.A09, super.A06, 1);
            A0A();
            if (super.A02.A1p()) {
                c1695hn.setOnTouchListener(new HS(this));
            }
        }
        if (super.A02.A1p()) {
            c1695hn.setOnClickListener(new HN(this));
        }
        return c1695hn;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final void A0b() {
        if (this.A03 != null) {
            super.A06.A04(AE.A0Y, null);
            this.A03.A18(A09(32, 4, 60));
        } else {
            super.A06.A04(AE.A0Z, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final void A0c() {
        D3.A0J(this.A03);
        this.A0L.setVisibility(4);
        if (!super.A02.A1L()) {
            A0g();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final void A0e(C04946e c04946e) {
        c04946e.A0A(this.A0I);
        int orientation = c04946e.A05().getResources().getConfiguration().orientation;
        this.A03 = A05(orientation);
        addView(this.A03, AbstractC1476eD.A0E);
        addView(super.A08, new FrameLayout.LayoutParams(-1, super.A08.getToolbarHeight()));
        if (this.A02 != null) {
            addView(this.A02, new FrameLayout.LayoutParams(-1, this.A02.getToolbarHeight()));
            D3.A0F(this.A02);
        }
        D3.A0F(this.A03);
        D3.A0F(super.A08);
        if (super.A02.A1L() && (this.A03 instanceof LS)) {
            ((LS) this.A03).setVideoAdViewListener(this.A0J);
        }
        setUpFullscreenMode(this.A03 != null && this.A03.A17());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD
    public final boolean A0f() {
        if (this.A03 != null) {
            boolean zA19 = this.A03.A19(this.A08);
            String[] strArr = A0V;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A0V[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (zA19) {
                return true;
            }
        }
        return false;
    }

    public final void A0g() {
        this.A0L.setVisibility(0);
        D3.A0J(super.A08);
        this.A0L.setVolume(super.A02.A1b().A0F().A0A() ? 0.0f : 1.0f);
        if (super.A02.A1P()) {
            C1361cL c1361cL = this.A0L;
            if (A0V[3].charAt(17) == 'M') {
                throw new RuntimeException();
            }
            String[] strArr = A0V;
            strArr[7] = "EZroGEyqYXPxT1OpX1Zo9PGFXXX4LGG2";
            strArr[2] = "A8BrNBzgYOoIkIhiYkC2R6mbpOJkqkYa";
            c1361cL.A0b(getResources().getConfiguration().orientation);
        }
        this.A0L.A0g(IP.A02, 20);
        if (this.A03 != null && this.A08) {
            this.A03.A11();
        }
        if (this.A03 != null && !this.A0C) {
            this.A03.A13();
        }
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEP(boolean z) {
        this.A07 = false;
        if (this.A0L.getVisibility() != 0 || this.A0L.A0p()) {
            return;
        }
        this.A06 = this.A0L.getVideoStartReason();
        this.A0A = z;
        this.A0L.A0k(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.DS
    public final void AEs(boolean z) {
        this.A07 = true;
        if (this.A09) {
            this.A09 = false;
            A0G(this.A01);
        }
        if (this.A0L.getVisibility() != 0 || this.A0L.A0q() || this.A0D || this.A0L.getState() == JI.A06 || this.A06 == null) {
            return;
        }
        if (!this.A0A || z) {
            this.A0L.A0g(this.A06, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A03 != null) {
            return this.A03.getCloseButtonStyle();
        }
        return 0;
    }

    private CZ getPackageInstallListener() {
        return new C1439db(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1476eD, com.facebook.ads.redexgen.core.DS
    public final void onDestroy() {
        super.onDestroy();
        if (C05789m.A1s(super.A04)) {
            super.A04.A0B().AJZ(this.A0L);
        }
        if (this.A03 != null) {
            this.A03.A0z();
        }
        if (this.A0L != null) {
            if (!this.A0D) {
                this.A0L.A0f(II.A05);
            }
            this.A0L.getEventBus().A04(this.A0R, this.A0Q, this.A0P, this.A0S, this.A0N, this.A0O);
            this.A0L.A0Y();
        }
        if (this.A0K != null) {
            this.A0K.A05();
        }
        C0835Kb c0835Kb = this.A0M;
        if (A0V[3].charAt(17) == 'M') {
            throw new RuntimeException();
        }
        A0V[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c0835Kb.A0p();
        this.A0G.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(I7 i7) {
        this.A05 = i7;
    }

    public void setVideoLeadingPlayableAdListener(HU hu) {
        this.A04 = hu;
    }
}
