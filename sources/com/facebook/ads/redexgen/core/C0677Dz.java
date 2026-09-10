package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0677Dz extends AbstractC1189Yr {
    public static byte[] A01;
    public static final InterfaceC0903Na<C0677Dz> A02;
    public static final String A03;
    public final float A00;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{32, 53, 34, 51, 53, 62, 36, 112, 61, 37, 35, 36, 112, 50, 53, 112, 57, 62, 112, 36, 56, 53, 112, 34, 49, 62, 55, 53, 112, 63, 54, 112, 11, 96, 124, 112, 97, 96, 96, cw.k};
    }

    static {
        A03();
        A03 = AbstractC1600gE.A0h(1);
        A02 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Z8
            @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
            public final InterfaceC0904Nb A6V(Bundle bundle) {
                return C0677Dz.A00(bundle);
            }
        };
    }

    public C0677Dz() {
        this.A00 = -1.0f;
    }

    public C0677Dz(float f) {
        AbstractC1517es.A09(f >= 0.0f && f <= 100.0f, A02(0, 40, 4));
        this.A00 = f;
    }

    public static C0677Dz A00(Bundle bundle) {
        AbstractC1517es.A07(bundle.getInt(AbstractC1189Yr.A02, -1) == 1);
        float f = bundle.getFloat(A03, -1.0f);
        return f == -1.0f ? new C0677Dz() : new C0677Dz(f);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0677Dz) && this.A00 == ((C0677Dz) obj).A00;
    }

    public final int hashCode() {
        return AbstractC0942Or.A00(Float.valueOf(this.A00));
    }
}
