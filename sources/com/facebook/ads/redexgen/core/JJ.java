package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class JJ implements InterfaceC2083dB {
    public static byte[] A01;
    public static String[] A02 = {"j0Llx0J1MSgFmdDCajgZS", "WqPPZqRc0dX4AocYH9RDHKNy8FKfctFv", "x4SSjhhb9i0sKdnf0Wf5s", "xtX3gCAokrJDAeXWoUYA8plxhmXwCeOm", "uRKBJqZuIeGTpbClJ99Pe9ZmQekDyja2", "rD1ESZhEMARN2moY0NiI8P2eIcx2KKt8", "vMF11DxP2anc735da3YXnRmNGLge", "xeUiMncNmqcgkFgn7eafy8FxNu3C"};
    public final /* synthetic */ AnonymousClass62 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[6] = "mcgN6rOfJkIrJEn9BPtko0s6E0JP";
            strArr2[7] = "7NujJgKdrQLNFT4Mmbwt8V3uSlrM";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 20);
            i5++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 46, 88, 27, 10, 25, 11, 16, 29, 28, 28, 14, 9, 52, 29, 2, 14, 28};
    }

    static {
        A01();
    }

    public JJ(AnonymousClass62 anonymousClass62) {
        this.A00 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2083dB
    public final void AFU() {
        C2296ge context = T7.A00();
        if (context != null) {
            context.A08().ABC(A00(10, 8, 127), AbstractC1712Td.A2g, new C1713Te(A00(0, 10, 108)));
        }
    }
}
