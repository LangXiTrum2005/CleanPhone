package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1614Pe extends AbstractC1835Yb {
    public static byte[] A08;
    public static String[] A09 = {"fERBvMHNNnzy3nk4ZNYWfuNmaphricqR", "36dIUinCjWD1st1oFa", "LXwDs8sQ22ml4TxQk7X9Yy2PND6TLebQ", "XXrP48rjLtmBZR3EppDVWeHK64Oiflqr", "lJVaLdSDUZo8CZ4Z9dOQvPM3HMB2ksyr", "0Ja0eNtF0Cq6bAhyEs6lkKXZN09pMEMJ", "OH638NDLRGGNEgbxKp", "sf1pLwcEB21wXoeUmJKgsuWxlp0ZYlJT"};
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final Integer A0D;
    public static final Integer A0E;
    public int A00;
    public InterfaceC1839Yf A01;
    public float A02;
    public InterfaceC1834Ya A03;
    public boolean A04;
    public final C2300gi A05;
    public final C1838Ye A06;
    public final EnumC1840Yg A07;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{110, 65, 66, 94, 72, 13, 108, 73};
        String[] strArr = A09;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[6] = "7Gx7HJtPRSPh20N7Kw";
        strArr2[1] = "xYim5uVBO0YQkaepUH";
    }

    static {
        A07();
        A0A = XV.A0C;
        A0C = XV.A0H;
        A0B = (int) (((double) A0C) / 2.0d);
        A0D = 855638016;
        A0E = null;
    }

    public C1614Pe(C2300gi c2300gi, EnumC1840Yg enumC1840Yg, AbstractC2465jd abstractC2465jd, int i2, InterfaceC1839Yf interfaceC1839Yf) {
        super(c2300gi);
        this.A00 = 0;
        this.A04 = true;
        this.A05 = c2300gi;
        this.A07 = enumC1840Yg;
        this.A01 = interfaceC1839Yf;
        A04();
        this.A06 = new C1838Ye(this.A05, abstractC2465jd, this.A07, i2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        this.A06.setContentDescription(A03(0, 8, 81));
        this.A06.setOnClickListener(new ViewOnClickListenerC1837Yd(this));
        addView(this.A06, layoutParams);
        A06();
    }

    private void A04() {
        View view = new View(this.A05);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
    }

    private void A05() {
        Rect requestedMargins = getRequestedMargins();
        if (this.A01 != null && requestedMargins != null) {
            this.A01.AEZ(getToolbarHeight());
        }
    }

    private void A06() {
        if (Build.VERSION.SDK_INT >= 28) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.Yc
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return this.A00.A0F(view, windowInsets);
                }
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A09() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A0A() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A0C(float f, int i2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A0D(C1558Na c1558Na, boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final boolean A0E() {
        return false;
    }

    public final /* synthetic */ WindowInsets A0F(View view, WindowInsets windowInsets) {
        int cutoutInsetTop;
        DisplayCutout cutout = windowInsets.getDisplayCutout();
        if (cutout != null && (cutoutInsetTop = cutout.getSafeInsetTop()) != this.A00) {
            this.A00 = cutoutInsetTop;
            A05();
        }
        return windowInsets;
    }

    public final void A0G() {
        if (this.A03 != null && this.A04) {
            InterfaceC1834Ya interfaceC1834Ya = this.A03;
            if (A09[4].charAt(19) != 'Q') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[7] = "Nz9FTwNSu9sKseNM42ZlibQZooapJX2m";
            strArr[0] = "gMFqMi1vQ9rk8jIPSWsyy3tPRxgAiTUd";
            interfaceC1834Ya.ACl(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public Rect getRequestedMargins() {
        if (getResources().getConfiguration().orientation == 1) {
            int i2 = XV.A0u;
            int i3 = XV.A0c;
            int orientation = this.A00;
            return new Rect(i2, i3 + orientation, 0, 0);
        }
        return new Rect(XV.A0u, XV.A0v, 0, 0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public int getToolbarActionMode() {
        return this.A06.A09();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public int getToolbarHeight() {
        if (this.A07 == EnumC1840Yg.A08) {
            if (getResources().getConfiguration().orientation == 1) {
                int i2 = this.A00;
                int orientation = A0C;
                int i3 = i2 + orientation;
                int orientation2 = XV.A0c;
                return i3 + (orientation2 * 2);
            }
            int i4 = A0C;
            int orientation3 = XV.A0v;
            return i4 + (orientation3 * 2);
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public InterfaceC1834Ya getToolbarListener() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A05();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A05();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setAdReportingVisible(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setCTAClickListener(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    private void setClickable(float f) {
        boolean z2;
        if (f > 0.0f) {
            boolean zA19 = C1750Up.A19(this.A05);
            if (A09[4].charAt(19) != 'Q') {
                throw new RuntimeException();
            }
            A09[5] = "CynGSFEo4busEIaNEzQQTo6NoR2HzSp3";
            if (zA19) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        this.A04 = z2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setFullscreen(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setPageDetails(C1570Nm c1570Nm, String str, int i2, C1576Ns c1576Ns) {
        this.A02 = i2 * 1000;
        setClickable(this.A02);
        this.A06.A0A(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setPageDetailsVisible(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgress(float f) {
        float f2 = (f / 100.0f) * this.A02;
        float remainingMs = 0.0f;
        if (this.A02 - f2 > 0.0f) {
            float remainingMs2 = this.A02;
            remainingMs = remainingMs2 - f2;
        }
        this.A06.A0B(remainingMs);
        setClickable(remainingMs);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgressImage(YM ym) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgressImmediate(float f) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgressSpinnerInvisible(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setToolbarActionMessage(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setToolbarActionMode(int i2) {
        this.A06.A0C(i2);
        if (i2 == 0) {
            setProgress(100.0f);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setToolbarListener(InterfaceC1834Ya interfaceC1834Ya) {
        this.A03 = interfaceC1834Ya;
    }
}
