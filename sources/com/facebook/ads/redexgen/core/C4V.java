package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4V, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4V extends AbstractC1387Gj {
    public static byte[] A0V;
    public static String[] A0W = {"", "YtQm2387uXJs", "MlRkJczYYxJD4Wwp0SHW4B9CEOUSnddR", "Rw6HEQ3C6e1KGOQ0gaz0SQKaqXM6WP6s", "SVsTOXJGQLTRlrov45UN9nTiloFn5X8Y", "Icuwm310fXqoj23c8ds7ElfBFjsMoXLO", "Pjvv6hw4WD5DyhE4XvR8T7jl", "KYBHBzoeYb2kbTAqfKJN2TrMGpQFpmBq"};
    public int A00;
    public VH A01;
    public AbstractC2013c3 A02;
    public InterfaceC2131dy A03;
    public C2168ea A04;
    public EnumC2187et A05;
    public boolean A06;
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
    public final InterfaceC1668Rk A0I;
    public final AbstractC1835Yb A0J;
    public final InterfaceC2130dx A0K;
    public final C1347Eu A0L;
    public final C1337Ek A0M;
    public final C4L A0N;
    public final EA A0O;
    public final E8 A0P;
    public final E4 A0Q;
    public final E2 A0R;
    public final E0 A0S;
    public final AbstractC1326Dz A0T;
    public final DZ A0U;

    public static String A0A(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0V = new byte[]{23, 63, 41, 47, 63, 17, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 61, 42, 56, 46, 61, 43, 42, 43, 16, 57, 38, 43, 42, 32, 49, 41, 43, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A0S(boolean z2, boolean z3) {
        if (this.A03 != null) {
            this.A08 = false;
            return;
        }
        if (this.A08) {
            boolean zA2C = C1750Up.A2C(super.A05);
            if (!z2 && (!zA2C || !z3)) {
                if (z3) {
                    super.A05.A0F().ACC();
                }
                super.A0A.A4j(super.A0B.A6l());
                this.A04.A06();
                this.A08 = false;
                if (this.A02 != null) {
                    this.A02.A1D();
                }
                return;
            }
            this.A08 = false;
        }
    }

    static {
        A0F();
    }

    public C4V(C2300gi c2300gi, ZU zu, VA va, AbstractC2465jd abstractC2465jd, C1706Sx c1706Sx, InterfaceC1841Yh interfaceC1841Yh) {
        super(c2300gi, zu, va, abstractC2465jd, c1706Sx, interfaceC1841Yh);
        this.A0I = new GN(this);
        this.A0S = new E0() { // from class: com.facebook.ads.redexgen.X.4w
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e1) {
                this.A00.A0E = true;
                this.A00.A02.A1J(e1);
            }
        };
        this.A0R = new E2() { // from class: com.facebook.ads.redexgen.X.4t
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e3) {
                this.A00.A0F = true;
                this.A00.A0e();
            }
        };
        this.A0Q = new E4() { // from class: com.facebook.ads.redexgen.X.4s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
            }
        };
        this.A0T = new AbstractC1326Dz() { // from class: com.facebook.ads.redexgen.X.4r
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4A c4a) {
                this.A00.A0P(c4a);
                this.A00.A0O(c4a);
                this.A00.A02.A1K(c4a, this.A00.A00);
            }
        };
        this.A0O = new EA() { // from class: com.facebook.ads.redexgen.X.4q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                this.A00.A0N(c4k, this.A00.A0M.getState() != EnumC2242fm.A06, false);
            }
        };
        this.A0P = new C10904e(this);
        boolean z2 = false;
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A0C = false;
        this.A0A = false;
        this.A00 = 0;
        this.A06 = false;
        this.A09 = false;
        this.A07 = false;
        this.A01 = VH.A0c;
        this.A0G = new Handler(Looper.getMainLooper());
        this.A0K = new GE(this);
        this.A0M = new C1337Ek(super.A05);
        this.A0M.setFunnelLoggingHandler(super.A07);
        this.A0M.getEventBus().A03(this.A0S, this.A0R, this.A0Q, this.A0T, this.A0O, this.A0P);
        this.A0B = abstractC2465jd.A1t();
        this.A0N = new C4L(super.A05, super.A06, this.A0M, super.A03.A2E(), 0, 0, super.A03.A29().A0U(), null, null);
        if (C1750Up.A20(super.A05)) {
            this.A0L = new C1347Eu(super.A05, super.A06, this.A0M, super.A03.A2E(), super.A03.A29().A0U(), this.A0N, null);
        } else {
            this.A0L = null;
        }
        this.A04 = new C2168ea(super.A05, super.A0B, super.A03.A1G(), interfaceC1841Yh);
        if (!A0m()) {
            this.A0H = new C1306Df(super.A05, super.A07);
        } else {
            this.A0H = new C1304Dd(super.A05, super.A07);
        }
        int iA02 = (super.A03.A1h() || A0m()) ? A02(super.A03) * 1000 : -1;
        if (!A0m()) {
            this.A0U = new DZ(super.A05, iA02);
        } else {
            this.A0U = new DZ(super.A05, iA02, DZ.A0D);
        }
        if ((this.A0B && !super.A03.A1r()) || super.A03.A1i()) {
            this.A0U.setVisibility(8);
        }
        if (super.A03.A29().A0U() || super.A03.A1W()) {
            this.A0U.setShouldClearAnimationWhenVideoCompleted(false);
        }
        A0E();
        String strA09 = super.A03.A29().A0H().A09();
        C1337Ek c1337Ek = this.A0M;
        String videoUrl = super.A04.A0T(strA09);
        c1337Ek.setVideoURI(videoUrl);
        A0C();
        int unskippableSeconds = super.A03.A29().A0H().A04();
        if (C1750Up.A2Q(super.A05)) {
            this.A0C = unskippableSeconds == 0;
        } else {
            this.A0C = unskippableSeconds <= 0;
        }
        if (super.A03.A29().A0S() && super.A03.A29().A0H().A03() > 0) {
            z2 = true;
        }
        this.A08 = z2;
        Integer toolbarBackgroundColor = getBackgroundColorForToolbar();
        if (toolbarBackgroundColor == null) {
            YB.A0N(this, super.A03.A28().A01().A08(true));
        } else {
            YB.A0N(this, toolbarBackgroundColor.intValue());
        }
        if (C1750Up.A2K(super.A05) || super.A03.A1h()) {
            super.A09.setProgressSpinnerInvisible(true);
        }
        if (super.A03.A1u()) {
            super.A05.A0F().AEX();
        }
    }

    private float A00() {
        float fA04 = super.A03.A29().A0H().A04();
        boolean isRV = super.A0B.A8l().equals(AdPlacementType.REWARDED_VIDEO.toString());
        if (fA04 == -1.0f && isRV && super.A03.A1m()) {
            float videoDuration = this.A0M.getDuration();
            if (videoDuration <= 0.0f) {
                return 0.0f;
            }
            return videoDuration;
        }
        if (!this.A0B) {
            float serverUnskippableSeconds = this.A0M.getDuration();
            return Math.min(1000.0f * fA04, serverUnskippableSeconds);
        }
        return 1000.0f * fA04;
    }

    private int A01(int i2, int i3, int i4) {
        int i5 = 0;
        if (this.A0B) {
            int i6 = this.A00;
            if (A0W[4].charAt(26) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "";
            strArr[1] = "GEJnt8SXHB7Z";
            i5 = i4 * i6;
        }
        int completedVideoCycleDuration = i2 / 1000;
        return (i3 - i5) - completedVideoCycleDuration;
    }

    public static int A02(AbstractC2465jd abstractC2465jd) {
        if (abstractC2465jd.A10().equals(A0A(18, 14, 49))) {
            return abstractC2465jd.A29().A0H().A03();
        }
        if (abstractC2465jd.A10().equals(A0A(6, 12, 112))) {
            return abstractC2465jd.A29().A0H().A04();
        }
        String[] strArr = A0W;
        if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "";
        strArr2[1] = "oU1GMCkqMMy1";
        return 0;
    }

    private AbstractC2013c3 A06(int i2) {
        C2016c6 c2016c6A0M = new C2016c6(super.A05, super.A06, super.A0A, super.A03, this.A0M, super.A0C, super.A08).A0J(super.A09.getToolbarHeight()).A0P(super.A09).A0I(i2).A0K(this.A0H).A0R(this.A0U).A0M(super.A07);
        if (super.A03.A29().A0S() && C1750Up.A1d(super.A05) && super.A03.A29().A0L() != null) {
            c2016c6A0M.A0O(getPackageInstallListener());
        }
        c2016c6A0M.A0L(C1553Mu.A00(super.A05, super.A06, A0A(0, 0, 98), XB.A00(super.A03.A29().A0J().A05()), new HashMap(), super.A03.A2A()));
        C2017c7 params = c2016c6A0M.A0U();
        return AbstractC2014c4.A00(params, null, true);
    }

    private void A0B() {
        this.A0M.postDelayed(new GV(this), C1750Up.A0O(super.A05));
    }

    private void A0C() {
        this.A0M.postDelayed(new GU(this), C1750Up.A0P(super.A05));
    }

    private void A0D() {
        this.A0C = true;
        super.A09.A0A();
        if (this.A02 != null) {
            this.A02.A1F();
        }
    }

    private void A0E() {
        this.A0M.A0f(this.A0U);
        if (this.A0H instanceof InterfaceC2188eu) {
            this.A0M.A0f((InterfaceC2188eu) this.A0H);
        }
        if (!TextUtils.isEmpty(super.A03.A29().A0H().A08())) {
            C3S c3s = new C3S(super.A05, A0m());
            this.A0M.A0f(c3s);
            c3s.setImage(super.A03.A29().A0H().A08());
        }
        if (!A0m()) {
            AnonymousClass34 anonymousClass34 = new AnonymousClass34(super.A05, true, super.A07);
            this.A0M.A0f(anonymousClass34);
            this.A0M.A0f(new C1308Dh(anonymousClass34, EnumC2203f9.A02, true));
        }
        this.A0M.A0f(new C3B(super.A05));
    }

    private void A0G(VH vh) {
        new VI(super.A03.A2E(), super.A05.A0A()).A04(vh, null);
        super.A0A.A4j(super.A0B.A6l());
        this.A04.A06();
        if (this.A02 instanceof C6H) {
            ((C6H) this.A02).A1Z();
        }
        if (!super.A03.A1r()) {
            this.A0G.postDelayed(new RunnableC2126dt(this), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(VH vh) {
        if (!this.A06) {
            this.A09 = true;
            this.A01 = vh;
        } else {
            A0G(vh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(C4K c4k, boolean z2, boolean z3) {
        if (this.A03 != null) {
            if (z2) {
                super.A05.A0F().AEY();
            }
            super.A05.A0F().AEV();
            this.A03.AIY();
            return;
        }
        if (this.A0D) {
            return;
        }
        if (!z2 && this.A08 && this.A0B) {
            this.A00++;
            this.A0M.A0e(EnumC2187et.A02, 20);
            return;
        }
        if (!this.A0C) {
            A0D();
        }
        if (!z2 && this.A00 < super.A03.A29().A0G()) {
            this.A0M.A0e(EnumC2187et.A02, 32);
        } else {
            this.A0D = true;
            if (this.A02 != null) {
                this.A02.A1I(c4k);
            }
        }
        if (this.A00 == 0) {
            A0R(z2, z3);
        }
        this.A00++;
        String[] strArr = A0W;
        if (strArr[0].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "";
        strArr2[1] = "mBWwcFSbVIKH";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(C4A c4a) {
        if (this.A0M.getState() == EnumC2242fm.A02 && C1750Up.A1e(super.A05)) {
            this.A0M.postDelayed(new GT(this, c4a), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(C4A c4a) {
        float f;
        int iA00 = c4a.A00();
        int totalSecondsForNextCta = super.A03.A29().A0H().A02();
        int currentPosMs = super.A03.A29().A0H().A05();
        int currentPosMs2 = A01(iA00, totalSecondsForNextCta, currentPosMs);
        if (totalSecondsForNextCta >= 0 && currentPosMs2 <= 0 && !super.A02 && this.A02 != null && this.A02.A1N()) {
            super.A02 = true;
            super.A09.setToolbarActionMode(8);
        }
        if (this.A08) {
            int totalSecondsForNextCta2 = super.A03.A29().A0H().A03();
            int currentPosMs3 = super.A03.A29().A0H().A05();
            int iA01 = A01(iA00, totalSecondsForNextCta2, currentPosMs3);
            AbstractC2465jd abstractC2465jd = super.A03;
            if (A0W[6].length() != 22) {
                String[] strArr = A0W;
                strArr[0] = "";
                strArr[1] = "CRWrhlQnYLwh";
                if (!ViewOnClickListenerC1498Kr.A05(abstractC2465jd)) {
                    boolean zA1u = super.A03.A1u();
                    String strA0A = A0A(0, 0, 98);
                    if (!zA1u && !super.A03.A1s() && !super.A03.A1h() && iA01 > 0) {
                        super.A09.setToolbarActionMessage(super.A03.A2D().A06().replace(A0A(0, 6, 50), String.valueOf(iA01)));
                    } else {
                        super.A09.setToolbarActionMessage(strA0A);
                    }
                }
                if (iA01 <= 0) {
                    A0S(false, false);
                }
            } else {
                throw new RuntimeException();
            }
        }
        float fA00 = A00();
        float totalCurrentPosMs = iA00;
        if (this.A0B) {
            int totalSecondsForNextCta3 = this.A0M.getDuration();
            int currentPosMs4 = this.A00;
            totalCurrentPosMs += totalSecondsForNextCta3 * currentPosMs4;
        }
        if (!super.A03.A1m() || fA00 > 0.0f) {
            f = totalCurrentPosMs / fA00;
        } else {
            f = 1.0f;
        }
        boolean zA1s = super.A03.A1s();
        if (A0W[5].charAt(8) != 102) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[7] = "BY5kACpHY7KFfLoLkWPFyXHXe8tQ4ZYS";
        strArr2[2] = "FXqF0wWRYQoNHbRw7kiC8WRpThpP8Fmr";
        if (!zA1s) {
            float unskippableSeconds = 100.0f * f;
            super.A09.setProgress(unskippableSeconds);
        } else {
            int i2 = 0;
            if (fA00 - totalCurrentPosMs > 0.0f) {
                int currentPosMs5 = (int) (fA00 - totalCurrentPosMs);
                i2 = currentPosMs5 / 1000;
            }
            AbstractC1835Yb abstractC1835Yb = super.A09;
            String[] strArr3 = A0W;
            String str = strArr3[7];
            String str2 = strArr3[2];
            int totalSecondsForNextCta4 = str.charAt(8);
            int currentPosMs6 = str2.charAt(8);
            if (totalSecondsForNextCta4 != currentPosMs6) {
                float unskippableSeconds2 = 100.0f * f;
                abstractC1835Yb.A0C(unskippableSeconds2, i2);
            } else {
                A0W[3] = "ksHgyK5pJeiIhpnbSmOLRLGEWkwS8h7S";
                float unskippableSeconds3 = 100.0f * f;
                abstractC1835Yb.A0C(unskippableSeconds3, i2);
            }
        }
        if (f >= 1.0f && !this.A0C) {
            A0D();
            AbstractC1835Yb abstractC1835Yb2 = super.A09;
            int currentPosMs7 = getCloseButtonStyle();
            abstractC1835Yb2.setToolbarActionMode(currentPosMs7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(String str) {
        if (this.A07) {
            return;
        }
        this.A07 = true;
        int currentPositionInMillis = 0;
        int duration = 0;
        if (this.A0M != null) {
            currentPositionInMillis = this.A0M.getCurrentPositionInMillis();
            duration = this.A0M.getDuration();
            this.A0M.A0b(3);
        }
        super.A05.A0F().A3a(str);
        if (C1750Up.A1f(super.A05)) {
            A0N(new C4K(currentPositionInMillis, duration), false, true);
            return;
        }
        super.A0A.A4j(super.A0B.A81());
        InterfaceC1841Yh interfaceC1841Yh = super.A0A;
        ZU zu = super.A0B;
        int currentPositionMS = A0W[4].charAt(26);
        if (currentPositionMS != 70) {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "";
        strArr[1] = "o6mUTp9wkX0m";
        interfaceC1841Yh.A4j(zu.A7w());
    }

    private void A0R(boolean z2, boolean z3) {
        super.A09.setToolbarActionMessage(A0A(0, 0, 98));
        A0S(z2, z3);
        if (z3) {
            if (super.A03.A29().A0T()) {
                super.A05.A0F().ACE();
            } else {
                super.A05.A0F().ACD();
            }
            AbstractC1835Yb abstractC1835Yb = super.A09;
            String[] strArr = A0W;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[0] = "";
            strArr2[1] = "xKhq1oBo2v82";
            abstractC1835Yb.setToolbarActionMode(0);
            return;
        }
        super.A09.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final AbstractC1835Yb A0c() {
        AbstractC1835Yb abstractC1835YbA0c = super.A0c();
        if (A0m() && super.A03.A2T()) {
            abstractC1835YbA0c.setOnTouchListener(new ViewOnTouchListenerC2128dv(this));
        }
        if (super.A03.A2T()) {
            abstractC1835YbA0c.setOnClickListener(new ViewOnClickListenerC2124dr(this));
        }
        return abstractC1835YbA0c;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final void A0d() {
        Rect requestedMargins;
        super.A0d();
        if (!super.A03.A1W() || (requestedMargins = super.A09.getRequestedMargins()) == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0H.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, requestedMargins.top, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.A0H.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final void A0g() {
        if (this.A02 != null) {
            super.A07.A04(VH.A0Y, null);
            if (super.A03.A29().A0H().A07() != null) {
                this.A0M.A0d(EnumC2179el.A05);
                if (C1750Up.A1H(super.A05)) {
                    super.A03.A29().A0H().A07().A0U(false);
                }
            }
            EnumC1549Mq enumC1549MqA1B = this.A02.A1B(A0A(32, 4, 60));
            if (super.A03.A2N()) {
                return;
            }
            EnumC1549Mq actionOutcome = EnumC1549Mq.A09;
            if (enumC1549MqA1B != actionOutcome) {
                EnumC1549Mq actionOutcome2 = EnumC1549Mq.A06;
                if (enumC1549MqA1B != actionOutcome2) {
                    A0f();
                    return;
                }
                return;
            }
            return;
        }
        super.A07.A04(VH.A0Z, null);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final void A0h() {
        YB.A0L(this.A02);
        this.A0M.setVisibility(4);
        if (!super.A03.A1o()) {
            A0n();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final void A0k(C1662Re c1662Re) {
        FrameLayout.LayoutParams layoutParams;
        c1662Re.A0A(this.A0I);
        int orientation = c1662Re.A05().getResources().getConfiguration().orientation;
        this.A02 = A06(orientation);
        this.A02.setAccidentalClickCappingListener(new InterfaceC1550Mr() { // from class: com.facebook.ads.redexgen.X.GW
            @Override // com.facebook.ads.redexgen.core.InterfaceC1550Mr
            public final void ACk() {
                this.A00.A0o();
            }
        });
        A0j(this.A02);
        if (super.A01 != null) {
            addView(super.A01, AbstractC1387Gj.A0H);
        }
        boolean z2 = false;
        if (A0m()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            Rect requestedMargins = super.A09.getRequestedMargins();
            if (requestedMargins == null) {
                int i2 = XV.A0u;
                int orientation2 = XV.A0r;
                layoutParams.setMargins(i2, orientation2, 0, 0);
            } else {
                int i3 = requestedMargins.left;
                int i4 = requestedMargins.top;
                int i5 = requestedMargins.right;
                int orientation3 = requestedMargins.bottom;
                layoutParams.setMargins(i3, i4, i5, orientation3);
            }
        } else {
            int orientation4 = super.A09.getToolbarHeight();
            layoutParams = new FrameLayout.LayoutParams(-1, orientation4);
        }
        addView(super.A09, layoutParams);
        if (this.A0J != null) {
            addView(this.A0J, new FrameLayout.LayoutParams(-1, this.A0J.getToolbarHeight()));
            YB.A0H(this.A0J);
        }
        AbstractC2013c3 abstractC2013c3 = this.A02;
        if (A0W[5].charAt(8) != 'f') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "";
        strArr[1] = "o0V9GMeYx8z7";
        YB.A0H(abstractC2013c3);
        YB.A0H(super.A09);
        if (super.A03.A1o() && (this.A02 instanceof C6H)) {
            ((C6H) this.A02).setVideoAdViewListener(this.A0K);
        }
        if (this.A02 != null && this.A02.A1O()) {
            z2 = true;
        }
        setUpFullscreenMode(z2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final boolean A0l() {
        if (this.A02 != null) {
            boolean zA1P = this.A02.A1P(this.A08);
            String[] strArr = A0W;
            if (strArr[7].charAt(8) != strArr[2].charAt(8)) {
                throw new RuntimeException();
            }
            A0W[5] = "3q2LSuBAfmgZDuIIO8XYef2gzNnaMySy";
            if (zA1P) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj
    public final boolean A0m() {
        if (super.A03.A29().A0H().A07() == null) {
            if (!super.A03.A1w()) {
                boolean zA1y = super.A03.A1y();
                if (A0W[5].charAt(8) != 'f') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "";
                strArr[1] = "yoI6qUf6VdU9";
                if (!zA1y) {
                    return false;
                }
            }
            return true;
        }
        return super.A03.A1n();
    }

    public final void A0n() {
        this.A0M.setVisibility(0);
        YB.A0L(super.A09);
        this.A0M.setVolume(super.A03.A29().A0H().A0A() ? 0.0f : 1.0f);
        if (A0m()) {
            AbstractC2013c3 abstractC2013c3 = this.A02;
            if (A0W[3].charAt(17) == 'M') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[7] = "EZroGEyqYXPxT1OpX1Zo9PGFXXX4LGG2";
            strArr[2] = "A8BrNBzgYOoIkIhiYkC2R6mbpOJkqkYa";
            if (abstractC2013c3 instanceof C6H) {
                ((C6H) this.A02).A1a(getResources().getConfiguration().orientation);
                ((C6H) this.A02).A1Y();
            }
        }
        this.A0M.A0e(EnumC2187et.A02, 20);
        if (this.A02 != null && this.A08) {
            this.A02.A1E();
        }
        if (this.A02 != null && !this.A0C) {
            this.A02.A1G();
        }
        A0B();
    }

    public final /* synthetic */ void A0o() {
        A0f();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFA(boolean z2) {
        this.A06 = false;
        if (this.A02 != null) {
            this.A02.A1L(z2);
        }
        if (this.A0M.getVisibility() != 0 || this.A0M.A0n()) {
            return;
        }
        this.A05 = this.A0M.getVideoStartReason();
        this.A0A = z2;
        this.A0M.A0i(false, 13);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void AFi(boolean z2) {
        this.A06 = true;
        if (this.A09) {
            this.A09 = false;
            A0G(this.A01);
        }
        if (this.A0M.getVisibility() != 0 || this.A0M.A0o() || this.A0D || this.A0M.getState() == EnumC2242fm.A06 || this.A05 == null) {
            return;
        }
        if (!this.A0A || z2) {
            this.A0M.A0e(this.A05, 19);
        }
    }

    private int getCloseButtonStyle() {
        if (this.A02 != null) {
            return this.A02.getCloseButtonStyle();
        }
        return 0;
    }

    private InterfaceC1815Xh getPackageInstallListener() {
        return new GS(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1387Gj, com.facebook.ads.redexgen.core.InterfaceC1842Yi
    public final void onDestroy() {
        super.onDestroy();
        if (C1750Up.A1z(super.A05)) {
            super.A05.A0B().AKU(this.A0M);
        }
        if (this.A02 != null) {
            this.A02.A1C();
        }
        if (this.A0M != null) {
            if (!this.A0D) {
                this.A0M.A0d(EnumC2179el.A05);
            }
            this.A0M.getEventBus().A04(this.A0S, this.A0R, this.A0Q, this.A0T, this.A0O, this.A0P);
            this.A0M.A0W();
        }
        if (this.A0L != null) {
            this.A0L.A07();
        }
        C4L c4l = this.A0N;
        if (A0W[3].charAt(17) == 'M') {
            throw new RuntimeException();
        }
        A0W[5] = "JW7Ky8SZfj6uPXM0M3owDCnBT69Er2UJ";
        c4l.A0p();
        this.A0G.removeCallbacksAndMessages(null);
    }

    public void setServerSideRewardHandler(C2168ea c2168ea) {
        this.A04 = c2168ea;
    }

    public void setVideoLeadingPlayableAdListener(InterfaceC2131dy interfaceC2131dy) {
        this.A03 = interfaceC2131dy;
    }
}
