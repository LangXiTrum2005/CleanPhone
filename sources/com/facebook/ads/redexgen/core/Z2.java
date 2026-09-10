package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C2470ji A01;
    public final AbstractC2465jd A02;
    public final C2300gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C1606Ow A07;
    public final AbstractC1600Oq A08;
    public final AbstractC2244fo A09;
    public final C2245fp A0A;
    public final String A0B;
    public final WeakReference<Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public Z2(C2300gi c2300gi, VA va, C1706Sx c1706Sx, WeakReference<Z1> weakReference, int i2, int i3, int i4, int i5, C2470ji c2470ji, String str) {
        super(c2300gi);
        this.A06 = new Y2();
        this.A03 = c2300gi;
        this.A04 = va;
        this.A01 = c2470ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC2465jd abstractC2465jdA0F = this.A01.A0F();
        if (abstractC2465jdA0F == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i2, i5, i3, i4);
        LinearLayout linearLayout = new LinearLayout(c2300gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c1706Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(abstractC2465jdA0F);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] - i4) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, 29, -39, 29, 26, 45, 26, -39, 27, 46, 39, 29, 37, 30, -39, 34, 44, -39, 28, 26, 39, 39, 40, 45, -39, 27, 30, -39, 39, 46, 37, 37, 52, 64, 62, -1, 55, 50, 52, 54, 51, 64, 64, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, 61, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C1606Ow A02(AbstractC2465jd abstractC2465jd) {
        C1558Na c1558NaA00;
        NR nrA29 = abstractC2465jd.A29();
        PW pw = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i2, int i3, int i4) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
                int i5 = 0;
                while (true) {
                    int length = bArrCopyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i5 >= length) {
                        return new String(bArrCopyOfRange);
                    }
                    bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 4);
                    i5++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC1841Yh
            public final void A4j(String str) {
                P2.A00(this.A00.A03).A07(new Intent(str + A00(0, 1, 92) + this.A00.A0B));
            }
        };
        if (getOrientation() == 1) {
            c1558NaA00 = abstractC2465jd.A28().A01();
        } else {
            NN nnA28 = abstractC2465jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            c1558NaA00 = nnA28.A00();
        }
        C1606Ow c1606Ow = new C1606Ow(this.A03, A0F, c1558NaA00, nrA29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC2465jd.A2A());
        c1606Ow.setInfo(nrA29.A0I(), nrA29.A0J(), this.A01.A7O(), abstractC2465jd.A2C().A01(), null, null);
        if (C1750Up.A1N(this.A03)) {
            c1606Ow.A0k();
        }
        return c1606Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC1600Oq A04(C1706Sx c1706Sx) {
        final ViewOnClickListenerC1859Yz viewOnClickListenerC1859Yz = new ViewOnClickListenerC1859Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c1706Sx, this.A01) && videoUrl != null) {
            C11446g videoView = new C11446g(this.A03, this.A04, c1706Sx, this.A05, viewOnClickListenerC1859Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C1750Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C1762Vb c1762VbA0H = this.A01.A0H();
        if (c1762VbA0H == null) {
            return null;
        }
        final C2300gi c2300gi = this.A03;
        final VI vi = this.A05;
        final AbstractC2465jd abstractC2465jd = this.A02;
        C11546q c11546qA0I = new AbstractC1600Oq(c2300gi, viewOnClickListenerC1859Yz, vi, abstractC2465jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C1953b5 A00;

            {
                super(c2300gi, viewOnClickListenerC1859Yz, vi, abstractC2465jd);
                this.A00 = new C1953b5(c2300gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1600Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1600Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC1600Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C11546q A0I(String str) {
                new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C1601Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC1600Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(c1762VbA0H.getUrl());
        if (C1750Up.A1P(this.A03)) {
            setViewAsCTA(c11546qA0I);
        }
        return c11546qA0I;
    }

    private C1585Ob A06() {
        return new C1585Ob(this);
    }

    private C2245fp A07(int i2, int i3, int i4, int i5) {
        C2245fp c2245fp = new C2245fp(this, i2, i3, true, new WeakReference(this.A09), this.A03);
        c2245fp.A0W(i4);
        c2245fp.A0X(i5);
        return c2245fp;
    }

    private void A0C() {
        String strA0M = this.A01.A0M();
        if (!TextUtils.isEmpty(strA0M)) {
            X6 x6 = new X6();
            C2300gi c2300gi = this.A03;
            Uri uriA00 = XB.A00(strA0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x6, c2300gi, uriA00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC1591Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC1863Zd abstractC1863ZdA01 = AbstractC1864Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (abstractC1863ZdA01 == null) {
            A0C();
            return;
        }
        YB.A0W(this);
        addView(abstractC1863ZdA01, new FrameLayout.LayoutParams(-1, -1));
        abstractC1863ZdA01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C1706Sx c1706Sx, C2470ji c2470ji) {
        String strA0e = c2470ji.A0e();
        if (TextUtils.isEmpty(strA0e)) {
            return false;
        }
        String videoUrl = c1706Sx.A0T(strA0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC1600Oq abstractC1600Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC1600Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C2245fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}
