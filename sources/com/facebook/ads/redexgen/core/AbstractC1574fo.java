package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1574fo extends AbstractC0723Ft {
    public static byte[] A00;

    static {
        A0B();
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{106, 111, 111, 110, 127, 106, 98, 103, 120};
    }

    public abstract void A1B();

    public abstract void A1C();

    public abstract void A1D();

    public abstract boolean A1E();

    public abstract boolean A1F();

    public AbstractC1574fo(C0727Fx c0727Fx, boolean z) {
        super(c0727Fx, z);
        if (C05789m.A16(c0727Fx.A05())) {
            if (c0727Fx.A0B() != null) {
                c0727Fx.A0B().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1A() {
        if (C05789m.A16(this.A06.A05()) && this.A06.A0B() != null) {
            this.A06.A0B().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public ViewOnClickListenerC1617gW getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(FH fh) {
        if (C05789m.A16(this.A06.A05()) && fh != null) {
            fh.setOnClickListener(AbstractC0720Fq.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(C0758Hc c0758Hc) {
    }
}
