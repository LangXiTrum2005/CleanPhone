package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1463Ji extends AbstractC2013c3 {
    public static byte[] A0e;
    public static String[] A0f = {"f8QpfXiibO7PJ4", "00U3", "QiVJCyNgR8A0MkWyBq6Sbwgp9SRG2Fs1", "mRNBH9qX8UoqoKTWOWXmqQrDEDoanN5e", "rH0ZwdBUaXUf9W", "YRkVnZkRMq0VwRkFeWVEZBfHhK", "H8ri0FbqOBWJinUWmvrCS", "7rqKKWYNcxFyr7Opoa7bPZ9HiZbpRRd0"};
    public static final int A0g;
    public int A00;
    public int A01;
    public ImageView A02;
    public LinearLayout A03;
    public RelativeLayout A04;
    public RelativeLayout A05;
    public M8 A06;
    public C1929ah A07;
    public M3 A08;
    public C1977bT A09;
    public C1992bi A0A;
    public C2029cJ A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final float A0Q;
    public final Handler A0R;
    public final Handler A0S;
    public final View A0T;
    public final View A0U;
    public final InputMethodManager A0V;
    public final AbstractC1552Mt A0W;
    public final AbstractC2465jd A0X;
    public final VI A0Y;
    public final LK A0Z;
    public final InterfaceC1978bU A0a;
    public final C2017c7 A0b;
    public final Runnable A0c;
    public final boolean A0d;

    public static String A0L(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0Y() {
        A0e = new byte[]{35, 44, 41, 35, 43, 31, 51, 47, 53, 50, 35, 37, 24, 31, 1, 4, 5, 46, 28, 20, 5, 25, 30, 21, 75, 77, 91, 76, 93, 82, 87, 93, 85, 97, 88, 87, 82, 74, 91, 76, 91, 90, 38};
    }

    static {
        A0Y();
        A0g = XV.A0I;
    }

    public C1463Ji(C2017c7 c2017c7) {
        super(c2017c7, true);
        this.A0K = false;
        this.A0M = false;
        this.A0N = false;
        this.A0L = false;
        this.A0O = false;
        this.A0G = false;
        this.A0I = false;
        this.A0H = false;
        this.A0F = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A0J = false;
        this.A0P = false;
        this.A0E = false;
        this.A0S = new Handler(Looper.getMainLooper());
        this.A0C = true;
        this.A0c = new RunnableC2054ci(this);
        this.A0a = new C1474Jt(this);
        this.A0R = new Handler(Looper.getMainLooper());
        this.A0V = (InputMethodManager) c2017c7.A06().getSystemService(A0L(12, 12, 46));
        this.A0b = c2017c7;
        this.A0X = this.A0b.A05();
        this.A0Y = new VI(c2017c7.A05().A2E(), c2017c7.A07());
        this.A0Q = A00(c2017c7);
        this.A0U = this.A0b.A03();
        this.A0W = C1553Mu.A01(c2017c7.A06(), c2017c7.A07(), c2017c7.A05().A2E(), XB.A00(c2017c7.A05().A29().A0J().A05()), new HashMap(), false, true, this.A0X.A2A());
        AbstractC2001br.A00(c2017c7.A06(), this, c2017c7.A05().A29().A0H().A08());
        this.A0D = false;
        this.A0T = this.A0b.A02();
        this.A0Z = A0F(this.A0b);
        addView(this.A0Z);
        YB.A0K(this.A0Z);
        this.A0Z.getProgressBarAnimation().setShouldClearAnimationWhenVideoCompleted(false);
        A0T();
        A0R();
        A0S();
        A0W();
        if (this.A0T != null && A0w()) {
            this.A0A = A0I((C1337Ek) this.A0T);
        }
        this.A0d = c2017c7.A05().A1m();
        getAdContextWrapper().A0F().ACI(this.A0d, true, c2017c7.A05().A2L());
        if (!(this.A0T instanceof C1337Ek)) {
            A0P();
        }
        A0O();
    }

    private float A00(C2017c7 c2017c7) {
        if (this.A0b.A02() instanceof C1337Ek) {
            double dA0k = c2017c7.A05().A0k();
            String[] strArr = A0f;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "8ZXxKRs86BLRZmcfqRB4QIE0v7vA7Zkm";
            float mAspectRatio = (float) dA0k;
            return mAspectRatio;
        }
        float mAspectRatio2 = new C1706Sx(c2017c7.A06()).A0M(this.A0X.A29().A0H().A08());
        return mAspectRatio2;
    }

    public static /* synthetic */ int A02(C1463Ji c1463Ji) {
        int i2 = c1463Ji.A00;
        c1463Ji.A00 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int A04(C1463Ji c1463Ji) {
        int i2 = c1463Ji.A01;
        c1463Ji.A01 = i2 + 1;
        return i2;
    }

    private LK A0F(C2017c7 c2017c7) {
        LK lkA03 = new C2002bs(this.A0Q, c2017c7.A05().A0w(), c2017c7.A06(), getColors(), c2017c7.A05(), c2017c7.A0C(), getCtaButton(), AbstractC1481Ka.A0G, true, c2017c7.A07(), c2017c7.A0F(), c2017c7.A0A(), c2017c7.A0E(), c2017c7.A08(), true).A03();
        RelativeLayout.LayoutParams adDetailsParams = new RelativeLayout.LayoutParams(-1, -1);
        adDetailsParams.addRule(12);
        lkA03.setVisibility(8);
        lkA03.setLayoutParams(adDetailsParams);
        if (c2017c7.A0G() != null) {
            String strA0G = c2017c7.A0G();
            String[] strArr = A0f;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[2] = "VZhN7WRkFtQENMyvVst4luqikh6KPW2a";
            strArr2[3] = "z0fI7TK2oK2liNoF2nj9L3f0XJiqwQYs";
            lkA03.setChainedAdInfo(strA0G);
        }
        return lkA03;
    }

    private C1992bi A0I(C1337Ek c1337Ek) {
        return new C1992bi(this.A0b, this.A0X, c1337Ek, this.A0b.A0C(), new K4(this), this.A0U, this.A0Z, this.A03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        if (this.A0X.A1e() && this.A0E) {
            this.A0E = false;
            A0n(A0L(24, 18, 97));
        }
    }

    private void A0N() {
        if (this.A0X.A1e() && this.A0E) {
            this.A0E = false;
            Map<String, String> mapA05 = new C1957b9().A03(null).A02(null).A05();
            mapA05.put(A0L(0, 12, 31), A0L(24, 18, 97));
            getAdEventManager().AB6(this.A0X.A2E(), mapA05);
        }
    }

    private void A0O() {
        if (!A0y()) {
            return;
        }
        this.A02 = new ImageView(this.A0b.A06());
        addView(this.A02);
        this.A02.setVisibility(4);
        new LM(this.A02, this.A0b.A06()).A04().A06(new K3(this)).A07(this.A0X.A29().A0H().A08());
    }

    private void A0P() {
        this.A0b.A06().A0F().AKh(XL.A00(this.A0Q), getResources().getConfiguration().orientation, false, this.A0b.A0G() != null, AbstractC1552Mt.A0A());
        this.A05 = new RelativeLayout(this.A0b.A06());
        this.A04 = new RelativeLayout(this.A0b.A06());
        if (this.A0T != null) {
            YB.A0d(this.A0T);
            RelativeLayout relativeLayout = this.A04;
            String[] strArr = A0f;
            if (strArr[2].charAt(22) == strArr[3].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[0] = "ObNU9T88skhfra";
            strArr2[4] = "gcdrQI7RHa0S1U";
            relativeLayout.addView(this.A0T);
        }
        this.A05.addView(this.A04, new RelativeLayout.LayoutParams(-2, -2));
        YB.A0K(this.A04);
        addView(this.A05, new RelativeLayout.LayoutParams(-1, -1));
        YB.A0K(this.A05);
        A0Z(getResources().getConfiguration().orientation);
        this.A0Z.setVisibility(0);
        A0t(this.A0D, false);
        this.A0Z.A0u(getResources().getConfiguration().orientation);
        this.A0Z.bringToFront();
    }

    private void A0Q() {
        AbstractC1835Yb abstractC1835YbA0B;
        if (this.A0b.A05().A1x() && (abstractC1835YbA0B = this.A0b.A0B()) != null) {
            abstractC1835YbA0B.setProgressSpinnerInvisible(false);
        }
    }

    private void A0R() {
        YB.A0J(this.A03);
        this.A03 = new LinearLayout(this.A0b.A06());
        this.A03.setOrientation(1);
        YB.A0K(this.A03);
        A0t(this.A0D, false);
        this.A03.setBackgroundColor(-1);
        addView(this.A03);
    }

    private void A0S() {
        if (this.A0b.A05().A1X() && this.A0W != null && XL.A03(this.A0Q)) {
            this.A09 = new C1977bT(this.A0b.A06(), this.A0b.A0C(), this.A0b.A05().A0l(), this.A0W, this.A0Z.getCTAButton(), this.A0Z);
            addView(this.A09.getBrowserPeekView());
            this.A0S.postDelayed(new RunnableC2053ch(this), 5900L);
        }
    }

    private void A0T() {
        if (this.A0T != null && this.A0X.A1e()) {
            this.A0T.setOnClickListener(new ViewOnClickListenerC2056ck(this));
        }
        YB.A0J(this.A0T);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.A0T != null) {
            addView(this.A0T, layoutParams);
            YB.A0K(this.A0T);
        }
        if (C1750Up.A17(this.A0b.A06())) {
            View.OnClickListener onClickListener = new ViewOnClickListenerC2057cl(this);
            this.A0Z.setCTAClickListener(onClickListener);
            if (this.A0b.A0B() != null) {
                View.OnClickListener onClickListener2 = new ViewOnClickListenerC2058cm(this);
                this.A0b.A0B().setCTAClickListener(onClickListener2);
            }
        }
        if (this.A0T != null) {
            if (C1750Up.A1L(getAdContextWrapper())) {
                AbstractC1960bC.A00(this.A0T, C1750Up.A1M(getAdContextWrapper()), new ViewOnClickListenerC2059cn(this));
                return;
            }
            C2300gi adContextWrapper = getAdContextWrapper();
            if (A0f[6].length() == 10) {
                throw new RuntimeException();
            }
            A0f[7] = "Oiyftodkn5sp5o8TW1yBI7W6XQQ10Nb7";
            if (!C1750Up.A1J(adContextWrapper)) {
                return;
            }
            AbstractC1960bC.A00(this.A0T, C1750Up.A1K(getAdContextWrapper()), new ViewOnClickListenerC2060co(this));
        }
    }

    private void A0U() {
        if (this.A0U != null) {
            YB.A0J(this.A0U);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC2013c3.A0A, AbstractC2013c3.A0A);
            layoutParams.setMargins(XV.A09, XV.A0N, XV.A09, XV.A05);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            addView(this.A0U, layoutParams);
        }
    }

    private void A0V() {
        AbstractC1835Yb abstractC1835YbA0B = this.A0b.A0B();
        if (abstractC1835YbA0B == null) {
            return;
        }
        abstractC1835YbA0B.setPageDetailsVisible((this.A0D || abstractC1835YbA0B.A0E()) ? false : true);
        String[] strArr = A0f;
        if (strArr[2].charAt(22) == strArr[3].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[2] = "1yoT7KI3snCc494ZeQVfvKcwdedzZqUL";
        strArr2[3] = "maitTS2j9i61dN9OwsPG0RZMowmllQ6i";
    }

    private void A0W() {
        if (!this.A0L) {
            A0U();
        }
        A0V();
    }

    private void A0X() {
        DZ dzA0E = this.A0b.A0E();
        if (dzA0E == null) {
            return;
        }
        int videoDuration = this.A0T != null ? ((C1337Ek) this.A0T).getDuration() : 0;
        if (dzA0E.getCustomDuration() > videoDuration) {
            dzA0E.setCustomDuration(videoDuration);
        }
    }

    private void A0Z(int i2) {
        ViewGroup viewGroup;
        RelativeLayout adjacentView;
        if (this.A0T == null) {
            return;
        }
        if (A0w()) {
            viewGroup = (ViewGroup) this.A0T;
            adjacentView = (RelativeLayout) ((C1337Ek) this.A0T).getVideoView();
            ((C1337Ek) this.A0T).A0Z(i2);
        } else {
            A0a(i2);
            viewGroup = this.A05;
            adjacentView = this.A04;
        }
        if (viewGroup != null) {
            A0c(i2, viewGroup, adjacentView);
        }
    }

    private void A0a(int i2) {
        if (this.A0T == null || this.A04 == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0T.getLayoutParams();
        layoutParams.removeRule(13);
        layoutParams.removeRule(10);
        layoutParams.removeRule(9);
        if (i2 == 1) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.addRule(10);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            if (XL.A05(this.A0Q)) {
                layoutParams.addRule(13);
                layoutParams.addRule(14);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.A04.getLayoutParams();
                layoutParams2.addRule(14);
                RelativeLayout relativeLayout = this.A04;
                if (A0f[6].length() == 10) {
                    throw new RuntimeException();
                }
                String[] strArr = A0f;
                strArr[5] = "iCwgI3rcmLyVygWAbxB5hffDSu";
                strArr[1] = "9hOX";
                relativeLayout.setLayoutParams(layoutParams2);
            } else {
                layoutParams.addRule(9);
            }
        }
        this.A0T.setLayoutParams(layoutParams);
    }

    private void A0b(int i2) {
        if (this.A0U != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0U.getLayoutParams();
            layoutParams.setMargins(XV.A09, i2, XV.A09, XV.A05);
            this.A0U.setLayoutParams(layoutParams);
        }
    }

    private final void A0c(int i2, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return;
        }
        YB.A0J(this.A0Z);
        if ((this.A0Z instanceof C6V) || (this.A0Z instanceof C6U)) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (getResources().getConfiguration().orientation == 2) {
                layoutParams.addRule(1, relativeLayout.getId());
                this.A0Z.setLayoutParams(layoutParams);
                viewGroup.addView(this.A0Z);
            } else {
                addView(this.A0Z, layoutParams);
            }
        } else if (this.A0Z instanceof C6T) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(12);
            this.A0Z.setLayoutParams(layoutParams2);
            addView(this.A0Z, layoutParams2);
        }
        this.A0Z.A0l(i2);
        this.A0Z.A0y(viewGroup, relativeLayout, i2);
    }

    private void A0d(ViewGroup viewGroup, View view, int i2) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        if (i2 == 1) {
            layoutParams2.width = -1;
            layoutParams2.height = -2;
        } else {
            layoutParams2.width = -2;
            layoutParams2.height = -1;
        }
        layoutParams2.removeRule(14);
        viewGroup.setLayoutParams(layoutParams);
        view.setLayoutParams(layoutParams2);
        A0Z(i2);
    }

    private void A0e(ViewGroup viewGroup, View view, AbstractC1835Yb abstractC1835Yb, int i2) {
        YB.A0d(this.A03);
        YB.A0J(abstractC1835Yb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        layoutParams.setMargins(XV.A0T, XV.A0N, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams toolbarParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        if (i2 == 1) {
            toolbarParams.width = -1;
            toolbarParams.height = -2;
        } else {
            toolbarParams.width = -2;
            toolbarParams.height = -1;
        }
        toolbarParams.removeRule(14);
        viewGroup.setLayoutParams(layoutParams2);
        view.setLayoutParams(toolbarParams);
        this.A0Z.A0z(viewGroup, false, false, this.A03.getId());
        A0Z(i2);
        viewGroup.addView(abstractC1835Yb, layoutParams);
    }

    private void A0f(ViewGroup viewGroup, View view, AbstractC1835Yb abstractC1835Yb, int i2) {
        YB.A0J(this.A03);
        YB.A0J(abstractC1835Yb);
        YB.A0J(this.A0Z);
        boolean zA05 = XL.A05(this.A0Q);
        boolean isBrowserBelowMediaView = i2 == 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        if (!this.A0X.A2U() || i2 != 2 || !zA05) {
            A0b(XV.A0N);
            layoutParams.setMargins(XV.A0T, XV.A0N, 0, 0);
        } else {
            layoutParams.setMargins(XV.A0T, XV.A0B, 0, 0);
            A0b(XV.A0B);
        }
        RelativeLayout.LayoutParams parentLayoutParam = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.removeRule(14);
        layoutParams2.removeRule(9);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.A03.getLayoutParams();
        layoutParams3.removeRule(3);
        layoutParams3.removeRule(1);
        boolean isBrowserBelowMediaView2 = isBrowserBelowMediaView || zA05;
        if (isBrowserBelowMediaView2) {
            parentLayoutParam.height = getHeightPixels() / 4;
            layoutParams2.height = getHeightPixels() / 4;
            layoutParams2.addRule(14);
            layoutParams3.addRule(3, viewGroup.getId());
        } else {
            if (this.A0T != null && A0w()) {
                ((C1337Ek) this.A0T).A0Z(i2);
            } else {
                A0a(i2);
            }
            parentLayoutParam.height = -1;
            layoutParams2.height = -1;
            layoutParams2.addRule(9);
            layoutParams3.addRule(1, view.getId());
        }
        parentLayoutParam.addRule(9);
        parentLayoutParam.addRule(10);
        viewGroup.setLayoutParams(parentLayoutParam);
        layoutParams2.width = -2;
        view.setLayoutParams(layoutParams2);
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        layoutParams3.setMargins(0, 0, 0, 0);
        this.A03.setLayoutParams(layoutParams3);
        if (isBrowserBelowMediaView2) {
            addView(this.A03);
            addView(abstractC1835Yb, layoutParams);
        } else {
            viewGroup.addView(this.A03);
            int id = this.A03.getId();
            if (A0f[7].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[2] = "7JaGKtDxzcfwUdZHrMC5peuenb4R08oC";
            strArr[3] = "WhY5lESONlEwbbLTXD1P91R7rTQEAxl9";
            layoutParams.addRule(0, id);
            viewGroup.addView(abstractC1835Yb, layoutParams);
        }
        this.A0Z.A0z(viewGroup, true, zA05, this.A03.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0m(String str) {
        M3 m3;
        YB.A0J(this.A08);
        KA ka = new KA(this);
        if (this.A0b.A06().A0E() == null) {
            this.A0b.A06().A0F().A9v();
        }
        if (AbstractC1751Uq.A02(this.A0b.A06()) || this.A0b.A06().A0E() == null) {
            m3 = new M3(this.A0b.A06(), ka);
        } else {
            m3 = new M3(this.A0b.A06(), this.A0b.A06().A0E(), ka);
        }
        this.A08 = m3;
        this.A08.setOnTouchListener(new ViewOnTouchListenerC2050ce(this));
        setUpBrowserControls(this.A08);
        this.A03.addView(this.A08, new LinearLayout.LayoutParams(-1, -1));
        this.A08.loadUrl(str);
    }

    private void A0n(String str) {
        Map<String, String> mapA05 = new C1957b9().A03(null).A02(null).A05();
        mapA05.put(A0L(0, 12, 31), str);
        this.A0Y.A04(VH.A0J, mapA05);
        this.A0b.A0C().A4j(this.A0X.A0w());
        getAdEventManager().ABM(this.A0X.A2E(), mapA05);
        if (C1750Up.A2U(this.A0b.A06())) {
            HashMap map = new HashMap();
            map.put(AbstractC2504kH.A04, Boolean.TRUE.toString());
            map.put(AbstractC2504kH.A05, Boolean.TRUE.toString());
            map.put(AbstractC2504kH.A06, Boolean.TRUE.toString());
            getAdEventManager().ABn(this.A0X.A2E(), map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0o(String str) {
        if (this.A0X.A25() > 0) {
            if (this.A0X.A2O() && this.A0F) {
                return;
            }
            this.A0F = true;
            A0n(str);
            return;
        }
        if (this.A0X.A1d()) {
            A0M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0p(String str) {
        if (!this.A0D) {
            this.A0Z.getCTAButton().A0E(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0q(boolean z2) {
        if (!z2 && A0x()) {
            return;
        }
        this.A0D = z2;
        if (z2) {
            this.A00 = 0;
            this.A01 = 0;
            this.A0G = false;
            this.A0H = false;
            this.A0I = false;
            this.A0F = false;
            A0s(!A0x(), 0);
            A0Q();
        } else {
            this.A0R.removeCallbacksAndMessages(null);
        }
        if (!this.A0J) {
            postDelayed(new K6(this, z2), 250L);
        }
        LinearLayout linearLayout = this.A03;
        float y = this.A03.getY();
        float heightPixels = getHeightPixels();
        if (z2) {
            if (A0f[7].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[5] = "hio5BYluDvHiSt1DGRQHr7K5cg";
            strArr[1] = "0MBl";
            heightPixels /= 4.0f;
        }
        float[] fArr = {y, heightPixels};
        String strA0L = A0L(42, 1, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, strA0L, fArr);
        objectAnimatorOfFloat.setDuration(500L);
        if (this.A0T != null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.A0T, strA0L, this.A0T.getY(), 0.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            int height = this.A0T.getHeight();
            int heightPixels2 = getHeightPixels();
            if (z2) {
                heightPixels2 /= 4;
            }
            ValueAnimator duration = ValueAnimator.ofInt(height, heightPixels2).setDuration(500L);
            duration.addUpdateListener(new C2051cf(this));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, duration);
            animatorSet.addListener(new C2052cg(this, z2));
            if (this.A0T instanceof C1337Ek) {
                ((C1337Ek) this.A0T).A0c(animatorSet, z2);
            }
        }
        A0t(this.A0D, true);
        String[] strArr2 = A0f;
        if (strArr2[0].length() != strArr2[4].length()) {
            throw new RuntimeException();
        }
        A0f[7] = "lHjeSTcy3i9rYziz9k5lFO2SBDOz5dmU";
        if (!z2 && this.A08 != null) {
            M3 m3 = this.A08;
            if (A0f[7].charAt(21) != '6') {
                A0f[7] = "CSTMrgBvM8lyRSCUouINeSS4n16b06JB";
                m3.destroy();
            } else {
                m3.destroy();
            }
        }
    }

    private void A0r(boolean z2) {
        this.A0L = true;
        this.A0Z.A0o();
        YB.A0d(this.A0A, this.A06, this.A03, this.A0U, this.A0Z, this.A0T, this.A0b.A0E(), this.A05, this.A04, this.A0b.A0B());
        if (this.A09 != null) {
            this.A09.A0B();
        }
        YB.A0W(this);
        if (this.A02 != null) {
            this.A02.setVisibility(0);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            Object parent = getParent();
            if (parent instanceof View) {
                View view = (View) parent;
                view.setFitsSystemWindows(false);
                view.setPadding(0, 0, 0, 0);
            }
        }
        View view2 = this.A0T;
        if (A0f[6].length() == 10) {
            throw new RuntimeException();
        }
        String[] strArr = A0f;
        strArr[5] = "Cvniwq1c5lbs2HOl3mraOy3NaR";
        strArr[1] = "MPMP";
        if (view2 != null && A0w()) {
            C1337Ek c1337Ek = (C1337Ek) this.A0T;
            for (InterfaceC2188eu interfaceC2188eu : c1337Ek.getPlugins()) {
                if (interfaceC2188eu instanceof AnonymousClass34) {
                    c1337Ek.A0g(interfaceC2188eu);
                    break;
                }
            }
        }
        this.A0B = new C2029cJ(this.A0b.A06(), this.A0X, this.A0Y, this.A0S, this.A0b.A0C());
        this.A0B.A0I(z2);
        addView(this.A0B.A0C(getRegularCtaForEndCard()));
        if (!z2) {
            if (this.A0b.A0B() != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                layoutParams.setMargins(XV.A0T, XV.A0N, 0, 0);
                addView(this.A0b.A0B(), layoutParams);
                this.A0b.A0B().bringToFront();
            }
            this.A0C = true;
            if (this.A0b.A0D() != null) {
                this.A0b.A0D().AFw(true);
                if (this.A0b.A0B() != null && this.A0b.A05().A29().A0K().A00() > 0) {
                    this.A0C = false;
                    if (this.A0b.A05().A2P()) {
                        this.A0b.A0B().setToolbarActionMode(8);
                    } else {
                        this.A0b.A0B().setToolbarActionMode(2);
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2055cj(this), this.A0b.A05().A29().A0K().A00());
                }
            }
        }
    }

    private void A0s(boolean z2, int i2) {
        if (this.A06 != null && this.A0d) {
            this.A06.setCloseButtonVisibility(4);
            getAdContextWrapper().A0F().ACG(!z2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0t(boolean z2, boolean z3) {
        if (A0v()) {
            return;
        }
        AbstractC1835Yb abstractC1835YbA0B = this.A0b.A0B();
        if (A0f[6].length() == 10) {
            throw new RuntimeException();
        }
        A0f[6] = "gQE173ac";
        if (abstractC1835YbA0B == null) {
            return;
        }
        ViewGroup parentView = getParentView();
        if (A0f[6].length() == 10) {
            throw new RuntimeException();
        }
        String[] strArr = A0f;
        strArr[2] = "HI7slczAopnLrQVo6YkGF0EaDN2P2XJ6";
        strArr[3] = "Ht1OtVWvCs2jCygEm2rJxJr9xXXDE1GX";
        View containerView = getContainerView();
        if (parentView == null || containerView == null) {
            return;
        }
        int i2 = getResources().getConfiguration().orientation;
        if (z2) {
            A0f(parentView, containerView, abstractC1835YbA0B, i2);
        } else if (z3) {
            A0e(parentView, containerView, abstractC1835YbA0B, i2);
        } else {
            A0d(parentView, containerView, i2);
        }
    }

    private boolean A0u() {
        if (this.A0X.A29().A0H().A0B() && this.A0N) {
            boolean z2 = this.A0O;
            String[] strArr = A0f;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[2] = "CULoRpyPQpgDQm7q7yLjDGE92r3i5BFz";
            strArr2[3] = "FD29Dr2zGBD96QEWLn0naQvlBTnIp70Y";
            if (!z2 && !this.A0M) {
                return true;
            }
        }
        return false;
    }

    private boolean A0v() {
        return this.A0T == null || (A0w() && !this.A0P);
    }

    private boolean A0w() {
        return this.A0T != null && (this.A0T instanceof C1337Ek);
    }

    private boolean A0x() {
        return this.A0d;
    }

    private boolean A0y() {
        return this.A0X.A29().A0V() && this.A0X.A29().A0K().A04();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final EnumC1549Mq A1B(String str) {
        EnumC1549Mq enumC1549Mq = EnumC1549Mq.A09;
        if (!A1R()) {
            C2029cJ c2029cJ = this.A0B;
            String[] strArr = A0f;
            if (strArr[0].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0f;
            strArr2[5] = "mDHIeobZMaiDBC6GT0NjXylYqI";
            strArr2[1] = "9M0w";
            if (c2029cJ != null && this.A0B.A0E() != null) {
                return this.A0B.A0E().A0E(str);
            }
            return getCtaButton().A0E(str);
        }
        return enumC1549Mq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1C() {
        A0N();
        this.A0S.removeCallbacksAndMessages(null);
        this.A0Z.A0j();
        if (this.A0B != null) {
            this.A0B.A0F();
        }
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        super.A1C();
        String[] strArr = A0f;
        if (strArr[5].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[5] = "320DltLTniR8mdOryPF1IAFoFp";
        strArr2[1] = "a388";
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1D() {
        AbstractC1835Yb abstractC1835YbA0B = this.A0b.A0B();
        if (abstractC1835YbA0B != null) {
            abstractC1835YbA0B.setPageDetailsVisible((A1R() || abstractC1835YbA0B.A0E()) ? false : true);
        }
        this.A0N = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1E() {
        if (this.A0b.A0B() != null) {
            this.A0b.A0B().setPageDetailsVisible(false);
        }
        this.A0N = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1F() {
        this.A0M = false;
        A0s(true, 3);
        this.A0Z.A0n();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1G() {
        this.A0M = this.A0X.A29().A0H().A04() > 0;
        A0s(false, 2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1H(NR nr, String str, double d, Bundle bundle) {
        super.A1H(nr, str, d, bundle);
        this.A0Z.setInfo(nr.A0I(), nr.A0J(), str, this.A0X.A2C().A01(), this.A0b.A09(), this.A0a);
        this.A0Z.getCTAButton().setIsInAppBrowser(true);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1I(C4K c4k) {
        super.A1I(c4k);
        if (A0y() && !A1R()) {
            A0r(true);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1J(E1 e1) {
        super.A1J(e1);
        this.A0b.A06().A0F().AKh(XL.A00(this.A0Q), getResources().getConfiguration().orientation, true, false, AbstractC1552Mt.A0A());
        this.A0P = true;
        A0Z(getResources().getConfiguration().orientation);
        this.A0Z.setVisibility(0);
        A0t(this.A0D, false);
        this.A0Z.A0u(getResources().getConfiguration().orientation);
        this.A0Z.bringToFront();
        A0X();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1K(C4A c4a, int i2) {
        super.A1K(c4a, i2);
        int duration = this.A0T != null ? ((C1337Ek) this.A0T).getDuration() : 0;
        int videoDuration = c4a.A00();
        int i3 = (duration * i2) + videoDuration;
        if (A0f[7].charAt(21) == '6') {
            throw new RuntimeException();
        }
        String[] strArr = A0f;
        strArr[0] = "smnJ2j3iSPWePz";
        strArr[4] = "RsYNc9pmOTKXmH";
        int videoDuration2 = i3 / 1000;
        this.A0Z.A0s(videoDuration2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final void A1L(boolean z2) {
        super.A1L(z2);
        this.A0Z.A0m(z2);
        if (this.A0B != null) {
            this.A0B.A0H(z2);
        }
        if (this.A09 != null && getResources().getConfiguration().orientation == 1) {
            this.A09.A0C();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final boolean A1M() {
        return A0y();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final boolean A1N() {
        return !A1R();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final boolean A1O() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public final boolean A1P(boolean z2) {
        if (A0u()) {
            getAdContextWrapper().A0F().ACJ();
            if (this.A0A != null) {
                this.A0A.A07(this);
            }
            return true;
        }
        if (A0y()) {
            getAdContextWrapper().A0F().ACK();
            if (this.A0T instanceof C1337Ek) {
                C1337Ek simpleVideoView = (C1337Ek) this.A0T;
                simpleVideoView.A0h(true);
            }
            A0r(true);
            return true;
        }
        getAdContextWrapper().A0F().ACH();
        return false;
    }

    public final void A1Q(boolean z2) {
        A0r(z2);
    }

    public final boolean A1R() {
        return this.A0D;
    }

    public final boolean A1S() {
        return this.A0L;
    }

    public final boolean A1T() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public int getCloseButtonStyle() {
        if (this.A0X.A29().A0H().A02() >= 0 && A1N()) {
            boolean z2 = this.A0M;
            if (A0f[6].length() == 10) {
                throw new RuntimeException();
            }
            A0f[7] = "Ls3R1IhphSEeti0RclvzrDjIYGWvTtJZ";
            if (z2 || this.A0N) {
                return 8;
            }
        }
        if (this.A0M) {
            return 2;
        }
        if (this.A0X.A29().A0H().A0B()) {
            return 1;
        }
        if (this.A0N) {
            return 4;
        }
        if (A0y()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    private View getContainerView() {
        if (this.A0T != null && A0w()) {
            return ((C1337Ek) this.A0T).getVideoView();
        }
        return this.A04;
    }

    private int getHeightPixels() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        return displayMetrics.heightPixels;
    }

    private ViewGroup getParentView() {
        if (A0w()) {
            return (ViewGroup) this.A0T;
        }
        return this.A05;
    }

    private ViewOnClickListenerC1498Kr getRegularCtaForEndCard() {
        ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr = new ViewOnClickListenerC1498Kr(getAdContextWrapper(), this.A0b.A05().A0w(), this.A0X.A28().A01(), getAdEventManager(), this.A0b.A0C(), (C2245fp) null, this.A0b.A0A(), this.A0X.A2A());
        viewOnClickListenerC1498Kr.setViewShowsOverMedia(true);
        YB.A0K(viewOnClickListenerC1498Kr);
        viewOnClickListenerC1498Kr.setText(this.A0X.A29().A0J().A04());
        YB.A0G(1001, viewOnClickListenerC1498Kr);
        viewOnClickListenerC1498Kr.setCta(this.A0X.A29().A0J(), this.A0X.A2E(), new HashMap(), null);
        return viewOnClickListenerC1498Kr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0L) {
            if (Build.VERSION.SDK_INT >= 35) {
                Object parent = getParent();
                if (parent instanceof View) {
                    View view = (View) parent;
                    view.setFitsSystemWindows(false);
                    view.setPadding(0, 0, 0, 0);
                    return;
                }
                return;
            }
            return;
        }
        A0t(this.A0D, false);
        if (this.A09 != null) {
            this.A09.A0D(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public void setChainedWatchAndBrowseSkippableStatus(boolean z2) {
        A0s(z2, 4);
    }

    public void setChildChainedAd(boolean z2) {
        this.A0J = z2;
    }

    private void setUpBrowserControls(M3 m3) {
        YB.A0J(this.A06);
        this.A06 = new M8(this.A0b.A06(), m3, true);
        if (this.A0d) {
            A0s(false, 1);
        }
        m3.setBrowserNavigationListener(this.A06.getBrowserNavigationListener());
        YB.A0K(this.A06);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(XV.A0U, XV.A0U, XV.A0U, XV.A0U);
        this.A06.setListener(new C1465Jk(this));
        this.A03.addView(this.A06, layoutParams);
        YB.A0J(this.A07);
        this.A07 = new C1929ah(this.A0b.A06(), null, R.attr.progressBarStyleHorizontal);
        this.A03.addView(this.A07, new LinearLayout.LayoutParams(-1, A0g));
    }
}
