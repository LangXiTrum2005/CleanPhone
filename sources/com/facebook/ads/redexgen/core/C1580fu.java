package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1580fu extends AbstractC0723Ft {
    public static byte[] A0r;
    public static String[] A0s = {"fr3Y9tf6ePgTPq", "pEcG", "X6n0DjY1D3c56kEYNT7NkudbHULcUpi8", "xLfqb7j3EStc", "2nglUwJ7J1gVDM", "1eQzmRPEbuFcZFemJlVYaDXjMdIAS51D", "mnsD3rfSZRPYnMaeA3V0PZWjFbonJuRI", "JvQjcWyuZKXxmxTpCuNSfYxSgxmPRmOD"};
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public static final int A0x;
    public static final int A0y;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Handler A09;
    public View A0A;
    public InputMethodManager A0B;
    public LinearLayout A0C;
    public LinearLayout A0D;
    public RelativeLayout A0E;
    public TextView A0F;
    public AbstractC1984md A0G;
    public BY A0H;
    public C0690Em A0I;
    public C0691En A0J;
    public C1656h9 A0K;
    public ViewOnClickListenerC1617gW A0L;
    public C0727Fx A0M;
    public GT A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final Handler A0e;
    public final View A0f;
    public final AbstractC03841v A0g;
    public final AF A0h;
    public final FP A0i;
    public final InterfaceC0706Fc A0j;
    public final C0707Fd A0k;
    public final C1283b5 A0l;
    public final Runnable A0m;
    public final Runnable A0n;
    public final Set<String> A0o;
    public final boolean A0p;
    public final boolean A0q;

    public static String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0r, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0s;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "BAn7g4Tg6kNh";
            strArr2[1] = "sSvO";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 34);
            i4++;
        }
    }

    public static void A0Z() {
        A0r = new byte[]{8, 92, 83, 86, 92, 84, 96, 76, 80, 74, 77, 92, 90, 119, 112, 110, 107, 106, 65, 115, 123, 106, 118, 113, 122, 96, 102, 112, 103, 118, 121, 124, 118, 126, 74, 115, 124, 121, 97, 112, 103, 112, 113, 79, 81, 86, 92, 87, 79, 64, 89, 94, 104, 84, 67, 86, 104, 85, 66, 67, 67, 88, 89, 78, 87, 80, 102, 78, 92, 91, 102, 80, 87, 74, 77, 88, 85, 85, 102, 91, 76, 77, 77, 86, 87, 121};
    }

    static {
        A0Z();
        A0w = (int) (CP.A02 * 26.0f);
        A0t = (int) (CP.A02 * 4.0f);
        A0y = (int) (CP.A02 * 8.0f);
        A0u = (int) (CP.A02 * 24.0f);
        A0v = AnonymousClass43.A02(-1, 77);
        A0x = (int) (CP.A02 * 12.0f);
    }

    public C1580fu(C0727Fx c0727Fx) {
        super(c0727Fx, true);
        this.A0b = false;
        this.A02 = -1;
        this.A0c = false;
        this.A03 = 0;
        this.A0O = false;
        this.A0W = false;
        this.A0Y = false;
        this.A0Z = false;
        this.A0a = false;
        this.A0X = false;
        this.A0d = false;
        this.A0S = false;
        this.A0U = false;
        this.A0T = false;
        this.A0R = false;
        this.A08 = 0;
        this.A01 = 0;
        this.A0V = false;
        this.A0n = new GJ(this);
        this.A0Q = false;
        this.A0o = new HashSet();
        this.A0e = new Handler(Looper.getMainLooper());
        this.A0m = new Runnable() { // from class: com.facebook.ads.redexgen.X.GE
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A1D();
            }
        };
        this.A09 = new Handler(Looper.getMainLooper());
        this.A0B = (InputMethodManager) c0727Fx.A05().getSystemService(A0J(13, 12, 60));
        this.A0M = c0727Fx;
        this.A0G = this.A0M.A04();
        this.A0h = new AF(c0727Fx.A04().A1g(), c0727Fx.A06());
        this.A0l = this.A0M.A0D();
        if (this.A0l != null) {
            D3.A0I(this.A0l);
        }
        this.A0f = this.A0M.A03();
        this.A0g = C03851w.A01(c0727Fx.A05(), c0727Fx.A06(), c0727Fx.A04().A1g(), C5.A00(c0727Fx.A04().A1b().A0H().A05()), new HashMap(), false, true, this.A0G.A1c());
        this.A0i = new C1585fz(this);
        AbstractC0716Fm.A00(c0727Fx.A05(), this, c0727Fx.A04().A1b().A0F().A08());
        setupLayoutConfiguration(false);
        A0U();
        A0Q();
        this.A0H = new C1584fy(this);
        postDelayed(this.A0H, 1000L);
        A0Y();
        this.A0j = new C1581fv(this);
        C1361cL c1361cL = this.A0M.A02() instanceof C1361cL ? (C1361cL) this.A0M.A02() : null;
        this.A0k = new C0707Fd(c0727Fx, this.A0G, c1361cL, this.A0M.A0C(), this.A0j, this.A0F, this.A0N, this.A0l, this.A0f);
        if (c1361cL != null && C05789m.A1I(getAdContextWrapper())) {
            FE.A00(c1361cL.getVideoImplView(), C05789m.A1J(getAdContextWrapper()), new GK(this));
        } else if (c1361cL == null && this.A0A != null && C05789m.A1G(getAdContextWrapper())) {
            FE.A00(this.A0A, C05789m.A1H(getAdContextWrapper()), new GL(this));
        }
        this.A0E = null;
        this.A0L = null;
        this.A0p = c0727Fx.A04().A1K();
        this.A0q = c0727Fx.A04().A1R();
        getAdContextWrapper().A0F().ABZ(this.A0p, this.A0q, c0727Fx.A04().A1m());
    }

    public C1580fu(C0727Fx c0727Fx, boolean z) {
        this(c0727Fx);
        this.A0b = z;
        AbstractC1984md abstractC1984mdA04 = c0727Fx.A04();
        this.A0c = this.A0b && abstractC1984mdA04.A1S();
        if (this.A0b) {
            this.A02 = abstractC1984mdA04.A0W();
            if (this.A02 == 0) {
                A1D();
            } else if (this.A02 > 0 && this.A02 <= 10000) {
                this.A0e.postDelayed(this.A0m, this.A02);
            }
            String strA0t = abstractC1984mdA04.A0t();
            if (!TextUtils.isEmpty(strA0t)) {
                for (String stringToCheck : strA0t.split(A0J(0, 1, 10))) {
                    this.A0o.add(stringToCheck);
                }
            }
        }
    }

    public static /* synthetic */ int A03(C1580fu c1580fu) {
        int i = c1580fu.A01;
        c1580fu.A01 = i + 1;
        return i;
    }

    public static /* synthetic */ int A05(C1580fu c1580fu) {
        int i = c1580fu.A08;
        c1580fu.A08 = i + 1;
        return i;
    }

    private void A0K() {
        D3.A0H(this.A0D);
        this.A0D = new LinearLayout(this.A0M.A05());
        D3.A0P(this.A0D, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0O ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0D.setLayoutParams(layoutParams);
        addView(this.A0D, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public void A1D() {
        A0f(((N9) this.A0g).A0G().toString());
        A0i(true);
    }

    private void A0M() {
        ExecutorC0649Cx.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.GD
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A1C();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        if (this.A0G.A1D() && this.A0Q) {
            this.A0Q = false;
            A0g(A0J(25, 18, 55));
        }
    }

    private void A0O() {
        if (this.A0G.A1D() && this.A0Q) {
            this.A0Q = false;
            Map<String, String> mapA05 = new FB().A03(null).A02(null).A05();
            mapA05.put(A0J(1, 12, 29), A0J(25, 18, 55));
            getAdEventManager().AAq(this.A0G.A1g(), mapA05);
        }
    }

    private void A0P() {
        DQ dqA0B;
        if (this.A0M.A04().A1Q() && (dqA0B = this.A0M.A0B()) != null) {
            dqA0B.setProgressSpinnerInvisible(false);
        }
    }

    private void A0Q() {
        D3.A0H(this.A0C);
        this.A0C = new LinearLayout(this.A0M.A05());
        this.A0C.setOrientation(1);
        D3.A0I(this.A0C);
        A0W();
        this.A0C.setBackgroundColor(-1);
        addView(this.A0C);
    }

    private void A0R() {
        if (this.A0f != null) {
            D3.A0H(this.A0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0723Ft.A08, AbstractC0723Ft.A08);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC0723Ft.A07, this.A07, AbstractC0723Ft.A07, AbstractC0723Ft.A07);
            addView(this.A0f, layoutParams);
        }
    }

    private void A0S() {
        if (this.A0l != null) {
            D3.A0H(this.A0l);
            this.A0l.setPadding(A0x, A0x, A0x, A0x);
            this.A0l.A06(-1, A0v, false);
            this.A0l.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0w);
            layoutParams.addRule(12);
            addView(this.A0l, layoutParams);
        }
    }

    private void A0T() {
        DQ dqA0B = this.A0M.A0B();
        if (dqA0B == null) {
            return;
        }
        dqA0B.setPageDetailsVisible((this.A0P || dqA0B.A0B()) ? false : true);
    }

    private void A0U() {
        this.A0A = this.A0M.A02();
        if (this.A0G.A1D()) {
            this.A0A.setOnClickListener(new GM(this));
        }
        D3.A0H(this.A0A);
        D3.A0I(this.A0A);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A0A, 1, layoutParams);
        this.A0F = new TextView(this.A0M.A05());
        D3.A0I(this.A0F);
        this.A0F.setGravity(17);
        this.A0F.setTextColor(getColors().A06(true));
        this.A0F.setEllipsize(TextUtils.TruncateAt.END);
        this.A0F.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        layoutParams2.setMargins(A0y, A0y / 2, A0y, this.A0l == null ? A0y : A0w);
        addView(this.A0F, layoutParams2);
        D3.A0I(this.A0F);
        this.A0N = new GT(this.A0M.A05(), getCtaButton(), this.A0M.A04(), this.A0M.A06(), this.A0M.A0C(), this.A0M.A0E(), this.A0M.A09(), getColors(), this.A0i);
        this.A0N.setAutoClickTime(this.A0M.A04(), this.A0M.A0B());
        D3.A0E(1001, this.A0N);
        addView(this.A0N);
        A0X();
        A0K();
        if (C05789m.A16(this.A0M.A05())) {
            this.A0D.setOnClickListener(new GN(this));
            if (this.A0M.A0B() != null) {
                this.A0M.A0B().setCTAClickListener(new GO(this));
            }
        }
    }

    private void A0V() {
        this.A0X = true;
        this.A0N.setVisibility(8);
        D3.A0R(this);
        removeCallbacks(this.A0H);
        D3.A0Z(this.A0N);
        D3.A0Z(this.A0l, this.A0f, this.A0k, this.A0F, this.A0I, this.A0M.A0B(), this.A0C, this.A0J);
        if (Build.VERSION.SDK_INT >= 35) {
            Object parent = getParent();
            if (parent instanceof View) {
                View parentView = (View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
        if (this.A0A instanceof C1361cL) {
            C1361cL c1361cL = (C1361cL) this.A0A;
            for (IQ iq : c1361cL.getPlugins()) {
                if (iq instanceof IX) {
                    c1361cL.A0i(iq);
                    break;
                }
            }
        }
        addView(new G9(this.A0M.A05(), this.A0G, this.A0M.A0C()).A08(getRegularCtaForEndCard()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0W() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (A1G()) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            String[] strArr = A0s;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[3] = "lVu96jIJ4wtN";
            strArr2[1] = "vEsO";
            this.A0C.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        LinearLayout linearLayout = this.A0C;
        String[] strArr3 = A0s;
        if (strArr3[4].length() != strArr3[0].length()) {
            linearLayout.setTranslationY(0.0f);
            this.A0C.setLayoutParams(layoutParams);
            return;
        }
        String[] strArr4 = A0s;
        strArr4[6] = "ao8FhOByUXKbyI2dbjVU10hQSvAA73UK";
        strArr4[5] = "1fPkz4yBU6BXLdgQ7SVXdDzzX5ZOz4LN";
        linearLayout.setTranslationY(0.0f);
        this.A0C.setLayoutParams(layoutParams);
    }

    private void A0X() {
        C03912c adColors;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0O ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0F.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0N.setLayoutParams(layoutParams);
        if (this.A0c && this.A0L != null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0O ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(A0u, 0, A0u, A0u);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                adColors = this.A0M.A04().A1a().A01();
            } else {
                adColors = this.A0M.A04().A1a().A00();
            }
            this.A0L.setUpButtonColors(adColors);
            if (this.A0O) {
                this.A0L.setPadding(A0u, 0, A0u, 0);
            }
            ViewOnClickListenerC1617gW viewOnClickListenerC1617gW = this.A0L;
            String[] strArr = A0s;
            if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[6] = "AuovlskRS4ra5LnKaHVdb744ygVoFjY2";
            strArr2[5] = "ls1L1tiwYnJTmONbQbVaT3PDhb5OoAVQ";
            viewOnClickListenerC1617gW.setLayoutParams(layoutParams2);
        }
        this.A0N.A02();
    }

    private void A0Y() {
        if (!this.A0X) {
            A0S();
            A0R();
        }
        A0T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0f(String str) {
        C1656h9 c1656h9;
        C03912c c03912cA00;
        C03912c c03912cA01;
        if (this.A0c) {
            D3.A0H(this.A0E);
            D3.A0H(this.A0L);
        }
        D3.A0H(this.A0K);
        C1592g6 c1592g6 = new C1592g6(this);
        if (this.A0M.A05().A0E() == null) {
            this.A0M.A05().A0F().A9l();
        }
        if (!AbstractC05799n.A02(this.A0M.A05()) && this.A0M.A05().A0E() != null) {
            c1656h9 = new C1656h9(this.A0M.A05(), this.A0M.A05().A0E(), c1592g6);
        } else {
            c1656h9 = new C1656h9(this.A0M.A05(), c1592g6);
        }
        this.A0K = c1656h9;
        if (this.A0b) {
            this.A0K.setInterceptRedirectRequest(new InterfaceC0698Eu() { // from class: com.facebook.ads.redexgen.X.g9
                @Override // com.facebook.ads.redexgen.core.InterfaceC0698Eu
                public final boolean AAU(String str2) {
                    return this.A00.A1H(str2);
                }
            });
        }
        if (this.A0G.A1J()) {
            this.A0K.addJavascriptInterface(new C0718Fo(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.GA
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1E(view);
                }
            }, this.A0K, new InterfaceC0717Fn() { // from class: com.facebook.ads.redexgen.X.g8
                @Override // com.facebook.ads.redexgen.core.InterfaceC0717Fn
                public final void ACd() {
                    this.A00.A1A();
                }
            }), C0718Fo.A01());
        }
        this.A0K.setOnTouchListener(new GG(this));
        setUpBrowserControls(this.A0K);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        if (this.A0c || this.A0G.A1J()) {
            C1828k1 c1828k1A05 = this.A0M.A05();
            String strA0e = this.A0M.A04().A0e();
            if (this.A0M.A00() == 1) {
                c03912cA00 = this.A0M.A04().A1a().A01();
            } else {
                c03912cA00 = this.A0M.A04().A1a().A00();
            }
            this.A0L = new ViewOnClickListenerC1617gW(c1828k1A05, strA0e, c03912cA00, this.A0M.A04().A1b().A0H().A06(), this.A0M.A06(), this.A0M.A0C(), this.A0M.A0E(), this.A0M.A09(), this.A0M.A04().A1c());
            this.A0L.setCta(this.A0M.A04().A1b().A0H(), this.A0M.A04().A1g(), new HashMap());
        }
        if (!this.A0c || this.A0L == null) {
            this.A0C.addView(this.A0K, layoutParams);
        } else {
            this.A0E = new RelativeLayout(getContext());
            this.A0E.addView(this.A0K, new RelativeLayout.LayoutParams(-1, -1));
            D3.A0I(this.A0L);
            this.A0L.setRoundedCornersEnabled(A00());
            this.A0L.setViewShowsOverMedia(A0A());
            if (getContext().getResources().getConfiguration().orientation == 1) {
                c03912cA01 = this.A0M.A04().A1a().A01();
            } else {
                c03912cA01 = this.A0M.A04().A1a().A00();
            }
            this.A0L.setUpButtonColors(c03912cA01);
            if (this.A0O) {
                this.A0L.setPadding(A0u, 0, A0u, 0);
            }
            this.A0L.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.GB
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1F(view);
                }
            });
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.A0O ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            layoutParams2.setMargins(A0u, 0, A0u, A0u);
            this.A0E.addView(this.A0L, layoutParams2);
            this.A0C.addView(this.A0E, layoutParams);
        }
        this.A0K.loadUrl(str);
    }

    private void A0g(String str) {
        Map<String, String> mapA05 = new FB().A03(null).A02(null).A05();
        mapA05.put(A0J(1, 12, 29), str);
        this.A0h.A04(AE.A0J, mapA05);
        this.A0M.A0C().A4Z(this.A0G.A0e());
        getAdEventManager().AB3(this.A0G.A1g(), mapA05);
        if (C05789m.A2L(this.A0M.A05())) {
            HashMap map = new HashMap();
            map.put(AbstractC2023nG.A04, Boolean.TRUE.toString());
            map.put(AbstractC2023nG.A05, Boolean.TRUE.toString());
            map.put(AbstractC2023nG.A06, Boolean.TRUE.toString());
            getAdEventManager().ABC(this.A0G.A1g(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0h(String str) {
        if (this.A0G.A1Y() > 0) {
            if (this.A0G.A1n() && this.A0R) {
                return;
            }
            this.A0R = true;
            A0g(str);
            return;
        }
        if (this.A0G.A1C()) {
            A0N();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0i(boolean z) {
        if (!z && A0m()) {
            return;
        }
        this.A0P = z;
        if (this.A0b && z) {
            this.A0e.removeCallbacks(this.A0m);
        }
        ObjectAnimator browserTransAnim = null;
        if (!z) {
            this.A09.removeCallbacksAndMessages(null);
        } else {
            this.A01 = 0;
            this.A08 = 0;
            this.A0S = false;
            this.A0T = false;
            this.A0U = false;
            this.A0R = false;
            A0k(!A0m(), 0);
            A0P();
        }
        if (!this.A0V) {
            postDelayed(new C1586g0(this, z), 250L);
        }
        String strA0J = A0J(85, 1, 34);
        if (z) {
            browserTransAnim = ObjectAnimator.ofFloat(this.A0N, strA0J, this.A0N.getY(), this.A05 / 5);
        }
        LinearLayout linearLayout = this.A0C;
        float y = this.A0C.getY();
        int i = this.A05;
        if (z) {
            i /= 5;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, strA0J, y, i);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A0A, strA0J, this.A0A.getY(), 0.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        int height = this.A0A.getHeight();
        int i2 = this.A05;
        if (z) {
            i2 /= 5;
        }
        ValueAnimator duration = ValueAnimator.ofInt(height, i2).setDuration(500L);
        duration.addUpdateListener(new GH(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, duration);
        if (browserTransAnim != null) {
            browserTransAnim.setDuration(500L);
            String[] strArr = A0s;
            if (strArr[3].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "mPKPZPxIo82o2decuruwdSCyMcOv6Ead";
            strArr2[7] = "qDzceeJQflYxul6669uVFcgsbJgsLatz";
            animatorSet.playTogether(browserTransAnim);
        }
        animatorSet.addListener(new GI(this, z));
        if (this.A0q && (this.A0A instanceof C1361cL)) {
            ((C1361cL) this.A0A).A0e(animatorSet, z);
        }
        animatorSet.start();
    }

    private void A0j(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        D3.A0H(this.A0A);
        if (this.A0A == null) {
            this.A0A = this.A0M.A02();
            D3.A0I(this.A0A);
        }
        boolean z2 = this.A0P;
        String[] strArr = A0s;
        if (strArr[6].charAt(18) != strArr[5].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[2] = "vsQMzuL85pElT0uyLkCOYkbLp6FYZ6Kp";
        strArr2[7] = "Jg0wEDfumSgIDDBadFZcUW5HjHx0Xq4t";
        if (z2) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (C05789m.A1G(getAdContextWrapper()) && getResources().getConfiguration().orientation == 2 && !(this.A0A instanceof C1361cL)) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            layoutParams.addRule(13);
            A0Q();
        }
        this.A0A.setTranslationY(0.0f);
        addView(this.A0A, 1, layoutParams);
        A0K();
        A0X();
    }

    private void A0k(boolean z, int i) {
        if (this.A0I != null && this.A0p) {
            this.A0I.setCloseButtonVisibility(z ? 0 : 4);
            C1828k1 adContextWrapper = getAdContextWrapper();
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "GBT9VwLYKrAlXj";
            strArr2[0] = "vffPPOX2qjrj4g";
            adContextWrapper.A0F().ABX(!z, i);
        }
    }

    private boolean A0l() {
        return this.A0G.A1b().A0F().A0B() && this.A0a && !this.A0d && !this.A0Y;
    }

    private boolean A0m() {
        return this.A0p && this.A0Z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A0z() {
        if (this.A0b) {
            this.A0e.removeCallbacks(this.A0m);
        }
        A0O();
        super.A0z();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A10() {
        DQ dqA0B = this.A0M.A0B();
        if (dqA0B != null) {
            dqA0B.setPageDetailsVisible((A1G() || dqA0B.A0B()) ? false : true);
        }
        this.A0a = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A11() {
        if (this.A0M.A0B() != null) {
            this.A0M.A0B().setPageDetailsVisible(false);
        }
        this.A0a = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A12() {
        this.A0Y = false;
        this.A0Z = false;
        A0k(true, 3);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A13() {
        this.A0Y = this.A0G.A1b().A0F().A04() > 0;
        this.A0Z = true;
        A0k(false, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0033  */
    /* JADX WARN: Code duplicated, block: B:8:0x0046  */
    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A14(C2T c2t, String str, double d, Bundle bundle) {
        super.A14(c2t, str, d, bundle);
        this.A0N.setCta(this.A0G.A1b().A0H(), this.A0G.A1g(), new HashMap<>(), this.A0i);
        String strA0E = c2t.A0G().A0E();
        if (strA0E != null) {
            String description = strA0E.trim();
            if (description.length() == 0) {
                D3.A0L(this.A0D, 8);
                if (C05789m.A16(this.A0M.A05())) {
                    this.A0D.setClickable(false);
                }
            } else {
                this.A0F.setText(strA0E);
                if (C05789m.A16(this.A0M.A05())) {
                    LinearLayout linearLayout = this.A0D;
                    String[] strArr = A0s;
                    if (strArr[2].charAt(25) == strArr[7].charAt(25)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0s;
                    strArr2[3] = "eomTAZA5kOTO";
                    strArr2[1] = "I37n";
                    linearLayout.setClickable(true);
                }
            }
        } else {
            D3.A0L(this.A0D, 8);
            if (C05789m.A16(this.A0M.A05())) {
                this.A0D.setClickable(false);
            }
        }
        if (d > 0.0d) {
            this.A03 = (int) (((double) this.A06) / d);
        }
        this.A03 = this.A0O ? this.A04 : this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A15(C0834Ka c0834Ka) {
        super.A15(c0834Ka);
        if (this.A0G.A1b().A0I().A04() && !A1G()) {
            A0V();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final boolean A16() {
        return !A1G();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final boolean A17() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final boolean A18(String str) {
        this.A0N.A03(str);
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final boolean A19(boolean z) {
        if (A1G()) {
            getAdContextWrapper().A0F().ABW();
            A0i(false);
            return true;
        }
        if (A0l()) {
            getAdContextWrapper().A0F().ABa();
            this.A0k.A07(this);
            return true;
        }
        if (this.A0G.A1b().A0I().A04()) {
            getAdContextWrapper().A0F().ABb();
            if (this.A0A instanceof C1361cL) {
                C1361cL simpleVideoView = (C1361cL) this.A0A;
                simpleVideoView.A0j(true);
            }
            A0V();
            return true;
        }
        getAdContextWrapper().A0F().ABY();
        return false;
    }

    public final /* synthetic */ void A1A() {
        this.A0M.A05().A0F().ABd();
    }

    public final /* synthetic */ void A1B() {
        if (this.A0L != null) {
            this.A0M.A05().A0F().ABc();
            this.A0L.A0A(A0J(49, 14, 21));
        }
    }

    public final /* synthetic */ void A1C() {
        if (this.A0L != null) {
            this.A0M.A05().A0F().ABg();
            this.A0L.A0A(A0J(63, 22, 27));
        }
    }

    public final /* synthetic */ void A1E(View view) {
        A0M();
    }

    public final /* synthetic */ void A1F(View view) {
        ExecutorC0649Cx.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.GC
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A1B();
            }
        });
    }

    public final boolean A1G() {
        return this.A0P;
    }

    public final /* synthetic */ boolean A1H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.A0o.isEmpty()) {
            return true;
        }
        Iterator<String> it = this.A0o.iterator();
        while (it.hasNext()) {
            if (!str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public int getCloseButtonStyle() {
        if (A1G()) {
            return A0m() ? 2 : 3;
        }
        if (this.A0G.A1b().A0F().A02() >= 0 && (this.A0Y || this.A0a)) {
            return 8;
        }
        if (this.A0Y) {
            return 2;
        }
        if (this.A0G.A1b().A0F().A0B()) {
            return 1;
        }
        if (this.A0a) {
            return 4;
        }
        if (this.A0G.A1b().A0I().A04()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    private ViewOnClickListenerC1617gW getRegularCtaForEndCard() {
        ViewOnClickListenerC1617gW viewOnClickListenerC1617gW = new ViewOnClickListenerC1617gW(getAdContextWrapper(), this.A0M.A04().A0e(), this.A0G.A1a().A01(), getAdEventManager(), this.A0M.A0C(), (JL) null, this.A0M.A09(), this.A0G.A1c());
        viewOnClickListenerC1617gW.setViewShowsOverMedia(true);
        D3.A0I(viewOnClickListenerC1617gW);
        viewOnClickListenerC1617gW.setText(this.A0G.A1b().A0H().A04());
        D3.A0E(1001, viewOnClickListenerC1617gW);
        viewOnClickListenerC1617gW.setCta(this.A0G.A1b().A0H(), this.A0G.A1g(), new HashMap(), null);
        return viewOnClickListenerC1617gW;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0j(A1G());
        A0Y();
        setupLayoutConfiguration(A1G());
        A0W();
        if (this.A0X && Build.VERSION.SDK_INT >= 35) {
            Object parent = getParent();
            if (parent instanceof View) {
                View parentView = (View) parent;
                parentView.setFitsSystemWindows(false);
                parentView.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public void setChainedWatchAndBrowseSkippableStatus(boolean z) {
        this.A0Z = !z;
        A0k(z, 4);
    }

    public void setChildChainedAd(boolean z) {
        this.A0V = z;
    }

    private void setUpBrowserControls(C1656h9 c1656h9) {
        D3.A0H(this.A0I);
        this.A0I = new C0690Em(this.A0M.A05(), c1656h9, true, this.A0q);
        if (this.A0p) {
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "M6ycP1RHJpeE8b";
            strArr2[0] = "ycEZieyXOIyeai";
            A0k(false, 1);
        }
        c1656h9.setBrowserNavigationListener(this.A0I.getBrowserNavigationListener());
        D3.A0I(this.A0I);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0I.setListener(new C1593g7(this));
        this.A0I.setOnTouchListener(new GF(this));
        this.A0C.addView(this.A0I, layoutParams);
        D3.A0H(this.A0J);
        this.A0J = new C0691En(this.A0M.A05(), null, R.attr.progressBarStyleHorizontal);
        this.A0C.addView(this.A0J, new LinearLayout.LayoutParams(-1, A0t));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0O = getResources().getConfiguration().orientation == 2;
        this.A07 = this.A0M.A0B() != null ? this.A0M.A0B().getToolbarHeight() : 0;
        this.A0P = z;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) getAdContextWrapper().getSystemService(A0J(43, 6, 26));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics windowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = windowMetrics.getBounds().bottom - windowMetrics.getBounds().top;
            } else {
                windowManager.getDefaultDisplay().getRealSize(point);
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
