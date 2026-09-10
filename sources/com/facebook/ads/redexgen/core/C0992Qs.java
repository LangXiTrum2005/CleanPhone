package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0992Qs implements InterfaceC0904Nb {
    public static byte[] A03;
    public static String[] A04 = {"L9um34xlRa9mvVYBTWzS", "rK95Ijm", "EQF49yv5pvsSo0ik", "xrSVDtvcpmqA", "bvDffTtUPWHKboBJ92HWJYx0EVSkllwH", "ktf3DTCeYabiBEqmGIqH", "aoIefHJ2PsCNPYphTIQQSD86nk1U0LOE", "ljetUHKC5nTD7EudM4NvK"};
    public static final InterfaceC0903Na<C0992Qs> A05;
    public static final C0992Qs A06;
    public static final String A07;
    public int A00;
    public final int A01;
    public final OI<C1175Yc> A02;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-45, -5, -14, -6, -17, -10, -14, -21, -90, -17, -22, -21, -12, -6, -17, -23, -25, -14, -90, -38, -8, -25, -23, -15, -51, -8, -11, -5, -10, -7, -90, -25, -22, -22, -21, -22, -90, -6, -11, -90, -11, -12, -21, -90, -38, -8, -25, -23, -15, -51, -8, -11, -5, -10, -57, -8, -8, -25, -1, -76, -49, -19, -36, -34, -26, -62, -19, -22, -16, -21, -68, -19, -19, -36, -12};
    }

    static {
        A03();
        A06 = new C0992Qs(new C1175Yc[0]);
        A07 = AbstractC1600gE.A0h(0);
        A05 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Qt
            @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
            public final InterfaceC0904Nb A6V(Bundle bundle) {
                return C0992Qs.A00(bundle);
            }
        };
    }

    public C0992Qs(C1175Yc... c1175YcArr) {
        this.A02 = OI.A07(c1175YcArr);
        this.A01 = c1175YcArr.length;
        A02();
    }

    public static /* synthetic */ C0992Qs A00(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new C0992Qs(new C1175Yc[0]);
        }
        return new C0992Qs((C1175Yc[]) C1523ey.A01(C1175Yc.A07, parcelableArrayList).toArray(new C1175Yc[0]));
    }

    private void A02() {
        for (int i = 0; i < i; i++) {
            for (int i2 = i + 1; i2 < i; i2++) {
                C1175Yc c1175Yc = this.A02.get(i);
                C1175Yc c1175Yc2 = this.A02.get(i2);
                String[] strArr = A04;
                String str = strArr[4];
                String str2 = strArr[6];
                int j = str.charAt(4);
                int i3 = str2.charAt(4);
                if (j != i3) {
                    throw new RuntimeException();
                }
                A04[2] = "WnevRkLW3jj27czqc70RUkasUo3krR";
                if (c1175Yc.equals(c1175Yc2)) {
                    AbstractC1561fb.A08(A01(60, 15, 58), A01(0, 0, 60), new IllegalArgumentException(A01(0, 60, 69)));
                }
            }
        }
    }

    public final int A04(C1175Yc c1175Yc) {
        int index = this.A02.indexOf(c1175Yc);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final C1175Yc A05(int i) {
        return this.A02.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        String[] strArr = A04;
        if (strArr[5].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[2] = "rxfaVCRNs0Pz6VF6Nycvm";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0992Qs c0992Qs = (C0992Qs) obj;
        return this.A01 == c0992Qs.A01 && this.A02.equals(c0992Qs.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        return this.A00;
    }
}
