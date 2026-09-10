package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.umeng.analytics.pro.cw;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C0923Nw extends AbstractC2041nY<Comparable<?>> implements Serializable {
    public static byte[] A00;
    public static String[] A01 = {"JDLm", "59j9VSz50JRV62zRfQhUHOfkCXfgeUgK", "B91zWfVJnglJ6qaTwxSE2cgOmWPFgOKk", "ELqJY4", "RV9gCl0i3PKSKYNXbtai8ngQK3fccqTs", "fKxm10xyRNZ", "83zGhfyjGQem9Bncw", "2Nxy8TZF5cPmoYOpvxnNSToHaqPSrsmH"};
    public static final C0923Nw A02;
    public static final long serialVersionUID = 0;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            byte b = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
            if (A01[5].length() == 31) {
                throw new RuntimeException();
            }
            A01[3] = "F1rbTbQwQjJP2vUBRKO1k8FP";
            bArrCopyOfRange[i4] = b;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{cw.k, 48, 38, 39, 48, 43, 44, 37, 108, 44, 35, 54, 55, 48, 35, 46, 106, 107};
    }

    static {
        A02();
        A02 = new C0923Nw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2041nY, java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Comparable<?> left, Comparable<?> right) {
        AbstractC1718iD.A04(left);
        AbstractC1718iD.A04(right);
        return left.compareTo(right);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2041nY
    public final <S extends Comparable<?>> AbstractC2041nY<S> A06() {
        return C0921Nu.A02;
    }

    public final String toString() {
        return A01(0, 18, 23);
    }
}
