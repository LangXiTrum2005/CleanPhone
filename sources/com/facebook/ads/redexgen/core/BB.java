package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class BB extends AbstractC2862qK<Comparable<?>> implements Serializable {
    public static byte[] A00;
    public static String[] A01 = {"JDLm", "59j9VSz50JRV62zRfQhUHOfkCXfgeUgK", "B91zWfVJnglJ6qaTwxSE2cgOmWPFgOKk", "ELqJY4", "RV9gCl0i3PKSKYNXbtai8ngQK3fccqTs", "fKxm10xyRNZ", "83zGhfyjGQem9Bncw", "2Nxy8TZF5cPmoYOpvxnNSToHaqPSrsmH"};
    public static final BB A02;
    public static final long serialVersionUID = 0;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            byte b2 = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 85);
            if (A01[5].length() == 31) {
                throw new RuntimeException();
            }
            A01[3] = "F1rbTbQwQjJP2vUBRKO1k8FP";
            bArrCopyOfRange[i5] = b2;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{13, 48, 38, 39, 48, 43, 44, 37, 108, 44, 35, 54, 55, 48, 35, 46, 106, 107};
    }

    static {
        A02();
        A02 = new BB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2862qK, java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Comparable<?> left, Comparable<?> right) {
        AbstractC2530ki.A04(left);
        AbstractC2530ki.A04(right);
        return left.compareTo(right);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2862qK
    public final <S extends Comparable<?>> AbstractC2862qK<S> A06() {
        return B8.A02;
    }

    public final String toString() {
        return A01(0, 18, 23);
    }
}
