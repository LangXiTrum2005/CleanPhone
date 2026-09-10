package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AV extends AbstractC2835pt {
    public static byte[] A01;
    public static final AnonymousClass23<AV> A02;
    public static final String A03;
    public final float A00;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{22, 3, 20, 5, 3, 8, 18, 70, 11, 19, 21, 18, 70, 4, 3, 70, 15, 8, 70, 18, 14, 3, 70, 20, 7, 8, 1, 3, 70, 9, 0, 70, 61, 86, 74, 70, 87, 86, 86, 59};
    }

    static {
        A03();
        A03 = C5C.A0h(1);
        A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.q1
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return AV.A00(bundle);
            }
        };
    }

    public AV() {
        this.A00 = -1.0f;
    }

    public AV(float f) {
        AbstractC10843y.A09(f >= 0.0f && f <= 100.0f, A02(0, 40, 45));
        this.A00 = f;
    }

    public static AV A00(Bundle bundle) {
        AbstractC10843y.A07(bundle.getInt(AbstractC2835pt.A02, -1) == 1);
        float f = bundle.getFloat(A03, -1.0f);
        return f == -1.0f ? new AV() : new AV(f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AV) && this.A00 == ((AV) obj).A00;
    }

    public final int hashCode() {
        return CB.A00(Float.valueOf(this.A00));
    }
}
