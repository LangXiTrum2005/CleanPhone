package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1781Vw extends N2 {
    public static byte[] A01;
    public final /* synthetic */ UK A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{95, 112, 101, 120, 103, 116, 49, 112, 117, 98, 49, 124, 112, AbstractJsonLexerKt.TC_INVALID, 112, 118, 116, 99, 49, 101, 121, 116, 120, 99, 49, 126, 102, AbstractJsonLexerKt.TC_INVALID, 49, 120, 124, 97, 99, 116, 98, 98, 120, 126, AbstractJsonLexerKt.TC_INVALID, 98, 63};
    }

    public C1781Vw(UK uk) {
        this.A00 = uk;
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0B(C2482ju c2482ju) {
        this.A00.A1d(c2482ju);
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0C() {
        if (this.A00.A0I != null) {
            this.A00.A0I.ACm();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 15));
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0F(N1 n1) {
        if (this.A00.A0B != null) {
            this.A00.A0B.A0M();
        }
    }

    @Override // com.facebook.ads.redexgen.core.N2
    public final void A0G(C1772Vm c1772Vm) {
        this.A00.A16().A0F().A3N(Y1.A01(this.A00.A00), c1772Vm.A03().getErrorCode(), c1772Vm.A04());
        if (this.A00.A0I != null) {
            this.A00.A0I.ADp(c1772Vm);
        }
    }
}
