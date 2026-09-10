package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1189Yr implements InterfaceC0904Nb {
    public static byte[] A00;
    public static String[] A01 = {"JgJJF1CzU6a0egwyYWwluC4JPqRLSmrF", "GuwzQkpeHTpwVltJhBqGuMVs8hJPPx94", "rlq2rggQOHnUpuDV", "bqhuc4q3L2It1J22YQtHcY6WMOmrtX8R", "7WylJ8m1xbLSMtwB8kwW13R9Nxtl42lQ", "rodw3ZHLAe3CiUwE", "njYleDb7mIfMlMHhtO7R6Zvy13ONChMX", "W6vmgx6UG27xb4UDe7mRfh3M4CCceGH4"};
    public static final String A02;
    public static final InterfaceC0903Na<AbstractC1189Yr> A03;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{67, 120, 125, 120, 121, 97, 120, 54, 68, 119, 98, 127, 120, 113, 66, 111, 102, 115, 44, 54};
    }

    static {
        A07();
        A02 = AbstractC1600gE.A0h(0);
        A03 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Ys
            @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
            public final InterfaceC0904Nb A6V(Bundle bundle) {
                return AbstractC1189Yr.A04(bundle);
            }
        };
    }

    public static AbstractC1189Yr A04(Bundle bundle) {
        int i = bundle.getInt(A02, -1);
        switch (i) {
            case 0:
                return (AbstractC1189Yr) E3.A02.A6V(bundle);
            case 1:
                InterfaceC0903Na<C0677Dz> interfaceC0903Na = C0677Dz.A02;
                if (A01[6].charAt(20) == 'l') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "WmbtHwVt7xYkE9W9";
                strArr[2] = "SfG0k5wVWRyQey8o";
                return (AbstractC1189Yr) interfaceC0903Na.A6V(bundle);
            case 2:
                return (AbstractC1189Yr) C0675Dx.A04.A6V(bundle);
            case 3:
                return (AbstractC1189Yr) C0674Dw.A03.A6V(bundle);
            default:
                throw new IllegalArgumentException(A06(0, 20, 75) + i);
        }
    }
}
