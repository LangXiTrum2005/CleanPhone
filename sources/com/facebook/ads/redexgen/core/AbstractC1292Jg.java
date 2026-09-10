package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1292Jg extends AbstractC1844c3 {
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

    public abstract void A1R();

    public abstract void A1S();

    public abstract void A1T();

    public abstract boolean A1U();

    public abstract boolean A1V();

    public AbstractC1292Jg(C1848c7 c1848c7, boolean z) {
        super(c1848c7, z);
        if (C1581Up.A17(c1848c7.A06())) {
            if (c1848c7.A0B() != null) {
                c1848c7.A0B().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1Q() {
        if (C1581Up.A17(this.A07.A06()) && this.A07.A0B() != null) {
            this.A07.A0B().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1844c3
    public ViewOnClickListenerC1329Kr getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(AbstractC1794bF abstractC1794bF) {
        if (C1581Up.A17(this.A07.A06()) && abstractC1794bF != null) {
            abstractC1794bF.setOnClickListener(AbstractC1835bu.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(C1969e5 c1969e5) {
    }
}
