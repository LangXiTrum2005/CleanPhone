package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1461Jg extends AbstractC2013c3 {
    public static byte[] A00;

    static {
        A0B();
    }

    public static String A0A(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{106, 111, 111, 110, AbstractJsonLexerKt.TC_INVALID, 106, 98, 103, 120};
    }

    public abstract void A1R();

    public abstract void A1S();

    public abstract void A1T();

    public abstract boolean A1U();

    public abstract boolean A1V();

    public AbstractC1461Jg(C2017c7 c2017c7, boolean z2) {
        super(c2017c7, z2);
        if (C1750Up.A17(c2017c7.A06())) {
            if (c2017c7.A0B() != null) {
                c2017c7.A0B().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A1Q() {
        if (C1750Up.A17(this.A07.A06()) && this.A07.A0B() != null) {
            this.A07.A0B().setCTAClickListener(getCtaButton());
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2013c3
    public ViewOnClickListenerC1498Kr getCtaButton() {
        return super.getCtaButton();
    }

    public void setAdDetailsClickListener(AbstractC1963bF abstractC1963bF) {
        if (C1750Up.A17(this.A07.A06()) && abstractC1963bF != null) {
            abstractC1963bF.setOnClickListener(AbstractC2004bu.A03(getCtaButton(), A0A(0, 9, 29)));
        }
    }

    public void setupNativeCtaExtension(C2138e5 c2138e5) {
    }
}
