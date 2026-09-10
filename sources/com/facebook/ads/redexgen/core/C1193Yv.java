package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1193Yv implements InterfaceC0904Nb {
    public static byte[] A03;
    public static String[] A04 = {"2CZGfQM4NhUTxD5pXTfzjs0Op9nNL", "9ZGcHr0wqtfUkFixqdWyLKwsL", "fWHJzWpZQxOIbFXRnW0HpFVm8Vs2vB2q", "kSGMSKwZmKi10WQLtPQBX4vrGdm", "rirTP2ExswnuyvczFLF4baUHTOq", "ZKXz0EO7F5WlR0MIonczSXdniPvxHMYV", "FmQfN11j", "rokn5erDdgDdRRF1BArBF2NFzB75q11U"};
    public static final InterfaceC0903Na<C1193Yv> A05;
    public static final C1193Yv A06;
    public static final String A07;
    public static final String A08;
    public final float A00;
    public final float A01;
    public final int A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{99, 95, 82, 74, 81, 82, 80, 88, 99, 82, 65, 82, 94, 86, 71, 86, 65, 64, 27, 64, 67, 86, 86, 87, cw.l, 22, 29, 1, 85, 31, 19, 67, 90, 71, 80, 91, cw.l, 22, 29, 1, 85, 26};
    }

    static {
        A02();
        A06 = new C1193Yv(1.0f);
        A08 = AbstractC1600gE.A0h(0);
        A07 = AbstractC1600gE.A0h(1);
        A05 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Yw
            @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
            public final InterfaceC0904Nb A6V(Bundle bundle) {
                return C1193Yv.A00(bundle);
            }
        };
    }

    public C1193Yv(float f) {
        this(f, 1.0f);
    }

    public C1193Yv(float f, float f2) {
        AbstractC1517es.A07(f > 0.0f);
        AbstractC1517es.A07(f2 > 0.0f);
        this.A01 = f;
        this.A00 = f2;
        this.A02 = Math.round(1000.0f * f);
    }

    public static /* synthetic */ C1193Yv A00(Bundle bundle) {
        float f = bundle.getFloat(A08, 1.0f);
        float pitch = bundle.getFloat(A07, 1.0f);
        return new C1193Yv(f, pitch);
    }

    public final long A03(long j) {
        return ((long) this.A02) * j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (A04[1].length() != 25) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[5] = "uDHsKYLziYYXqMOO2wSdvPrUTVGVVGFc";
        strArr[2] = "EhrNeVfCC2PBsMHsxIDbmhmSAAkKy3f4";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1193Yv c1193Yv = (C1193Yv) obj;
        return this.A01 == c1193Yv.A01 && this.A00 == c1193Yv.A00;
    }

    public final int hashCode() {
        int result = Float.floatToRawIntBits(this.A01);
        return (((17 * 31) + result) * 31) + Float.floatToRawIntBits(this.A00);
    }

    public final String toString() {
        return AbstractC1600gE.A0n(A01(0, 42, 81), Float.valueOf(this.A01), Float.valueOf(this.A00));
    }
}
