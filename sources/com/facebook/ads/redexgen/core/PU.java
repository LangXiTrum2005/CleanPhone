package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.LinearLayout;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class PU extends AbstractC1835Yb {
    public static byte[] A03;
    public C2300gi A00;
    public InterfaceC1834Ya A01;
    public final ZM A02;

    static {
        A05();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-75, -34, -31, -27, -41, -110, -77, -42};
    }

    public PU(C2300gi c2300gi, AbstractC2465jd abstractC2465jd, int i2) {
        super(c2300gi);
        this.A00 = c2300gi;
        setGravity(16);
        A04();
        this.A02 = new ZM(this.A00, abstractC2465jd, i2);
        A03();
    }

    private void A03() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.A02.setContentDescription(A02(0, 8, 39));
        this.A02.setActionClickListener(new ViewOnClickListenerC1851Yr(this));
        addView(this.A02, layoutParams);
    }

    private void A04() {
        View view = new View(this.A00);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        addView(view);
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

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public int getToolbarActionMode() {
        return this.A02.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public int getToolbarHeight() {
        return AbstractC1835Yb.A01;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public InterfaceC1834Ya getToolbarListener() {
        return null;
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

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setFullscreen(boolean z2) {
    }

    public void setInitialUnskippableSeconds(int i2) {
        this.A02.setInitialUnskippableSeconds(i2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setPageDetails(C1570Nm c1570Nm, String str, int i2, C1576Ns c1576Ns) {
        this.A02.setInitialUnskippableSeconds(i2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setPageDetailsVisible(boolean z2) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setProgress(float f) {
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
        this.A02.setToolbarActionMode(i2);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1835Yb
    public void setToolbarListener(InterfaceC1834Ya interfaceC1834Ya) {
        this.A01 = interfaceC1834Ya;
    }
}
