package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AH implements InterfaceC2796pF {
    public static byte[] A03;
    public final int A00;
    public final AbstractC10653d A01;
    public final InterfaceC2796pF A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 41);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(InterfaceC2796pF interfaceC2796pF, AbstractC10653d abstractC10653d, int i2) {
        this.A02 = (InterfaceC2796pF) AbstractC10843y.A01(interfaceC2796pF);
        AbstractC10843y.A01(abstractC10653d);
        this.A01 = null;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final void A43(InterfaceC11315t interfaceC11315t) {
        AbstractC10843y.A01(interfaceC11315t);
        this.A02.A43(interfaceC11315t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final Map<String, List<String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final long AGi(C11205i c11205i) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final void close() throws IOException {
        this.A02.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10402c
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        throw new NullPointerException(A00(0, 14, 104));
    }
}
