package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.redexgen.core.AbstractC1835Yb;
import com.facebook.ads.redexgen.core.AbstractC2004bu;
import com.facebook.ads.redexgen.core.C1558Na;
import com.facebook.ads.redexgen.core.C1570Nm;
import com.facebook.ads.redexgen.core.C1576Ns;
import com.facebook.ads.redexgen.core.C2137e4;
import com.facebook.ads.redexgen.core.C2300gi;
import com.facebook.ads.redexgen.core.InterfaceC1834Ya;
import com.facebook.ads.redexgen.core.InterfaceC1841Yh;
import com.facebook.ads.redexgen.core.VI;
import com.facebook.ads.redexgen.core.ViewOnClickListenerC1498Kr;
import com.facebook.ads.redexgen.core.ViewOnClickListenerC1850Yq;
import com.facebook.ads.redexgen.core.XX;
import com.facebook.ads.redexgen.core.YB;
import com.facebook.ads.redexgen.core.YM;
import com.facebook.ads.redexgen.core.YZ;
import com.facebook.ads.redexgen.core.ZC;
import com.facebook.ads.redexgen.core.ZK;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class FullScreenAdToolbar extends AbstractC1835Yb {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public YZ A00;
    public InterfaceC1834Ya A01;
    public InterfaceC1834Ya A02;
    public ZC A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final VI A07;
    public final InterfaceC1841Yh A08;
    public final ZK A09;
    public final C2137e4 A0A;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (XX.A02 * 10.0f);
        A0H = (int) (XX.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (XX.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C2300gi c2300gi, InterfaceC1841Yh interfaceC1841Yh, VI vi, int i2, int i3, boolean z2) {
        super(c2300gi);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z2;
        this.A08 = interfaceC1841Yh;
        this.A07 = vi;
        setGravity(16);
        this.A09 = new ZK(c2300gi, i2, z2);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new ViewOnClickListenerC1850Yq(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c2300gi);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C2137e4(c2300gi);
            YB.A0G(1006, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i3 != -1) {
                A0G(c2300gi, i3);
                return;
            }
            return;
        }
        if (i3 != -1) {
            A0G(c2300gi, i3);
        }
        this.A06 = new RelativeLayout(c2300gi);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C2137e4(c2300gi);
        YB.A0G(1006, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A08() {
        super.A08();
        if (this.A00 != null) {
            this.A00.setVisibility(8);
        }
        if (this.A03 != null) {
            this.A03.setVisibility(8);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A09() {
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A0A() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A0B() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A0C(float f, int i2) {
        this.A09.A03(f, i2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final void A0D(C1558Na c1558Na, boolean z2) {
        boolean z3 = this.A04;
        int iA05 = c1558Na.A05(z3);
        this.A0A.A02(c1558Na.A0B(z3), iA05);
        boolean z4 = this.A05;
        String strA02 = A02(8, 9, 52);
        if (!z4) {
            if (this.A00 != null) {
                this.A00.setIconColors(iA05);
                this.A00.setContentDescription(strA02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(iA05);
            this.A03.setContentDescription(strA02);
        }
        this.A09.A04(c1558Na, z3, z2);
        if (z3) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            YB.A0V(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        YB.A0N(this, 0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public final boolean A0E() {
        return this.A09.A05();
    }

    public final void A0F(C1570Nm c1570Nm, String str, int i2) {
        this.A09.setInitialUnskippableSeconds(i2);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c1570Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c1570Nm, str, this.A07, this.A08);
        }
    }

    public final void A0G(C2300gi c2300gi, int i2) {
        if (this.A00 != null) {
            YB.A0J(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new YZ(c2300gi, i2);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new ZC(c2300gi);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public int getToolbarHeight() {
        return AbstractC1835Yb.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public InterfaceC1834Ya getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setAdReportingVisible(boolean z2) {
        A04(!this.A05 ? this.A00 : this.A03, z2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setCTAClickListener(ViewOnClickListenerC1498Kr viewOnClickListenerC1498Kr) {
        this.A0A.setOnClickListener(AbstractC2004bu.A03(viewOnClickListenerC1498Kr, A02(17, 7, 47)));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setFullscreen(boolean z2) {
        this.A04 = z2;
    }

    public void setOnlyPageDetails(C1570Nm c1570Nm) {
        if (c1570Nm != null) {
            this.A0A.setPageDetails(c1570Nm);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setPageDetails(C1570Nm c1570Nm, String str, int i2, C1576Ns c1576Ns) {
        this.A09.setInitialUnskippableSeconds(i2);
        this.A0A.setPageDetails(c1570Nm);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(c1570Nm, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(c1570Nm, str, this.A07, this.A08);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setPageDetailsVisible(boolean z2) {
        this.A06.removeAllViews();
        if (z2) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgress(float f) {
        this.A09.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgressImage(YM ym) {
        this.A09.setProgressImage(ym);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgressImmediate(float f) {
        this.A09.setProgressImmediate(f);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgressSpinnerInvisible(boolean z2) {
        this.A09.setProgressSpinnerInvisible(z2);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            YB.A0S(view, 0, -16777216, A0E);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setToolbarActionMode(int i2) {
        this.A09.setToolbarActionMode(i2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setToolbarListener(InterfaceC1834Ya interfaceC1834Ya) {
        this.A02 = interfaceC1834Ya;
    }
}
