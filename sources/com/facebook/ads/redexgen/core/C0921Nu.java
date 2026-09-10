package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class C0921Nu extends AbstractC2041nY<Comparable<?>> implements Serializable {
    public static byte[] A00;
    public static String[] A01 = {"VpDQNWoK0mmjrFci3J1ES8becoOn0yPT", "Vr", "", "dVgvDtkQ8cSY7jysLBul", "4dcdEYs2txrJkBrXjBMi1LqbKTa90ufq", "PVumC7zyVZC9p2BLxPfo", "qAFwV", ""};
    public static final C0921Nu A02;
    public static final long serialVersionUID = 0;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{18, 47, 57, 56, 47, 52, 51, 58, 115, 51, 60, 41, 40, 47, 60, 49, 117, 116, 115, 47, 56, 43, 56, 47, 46, 56, 117, 116};
    }

    static {
        A02();
        A02 = new C0921Nu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2041nY, java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(Comparable<?> left, Comparable<?> right) {
        AbstractC1718iD.A04(left);
        if (left != right) {
            return right.compareTo(left);
        }
        String[] strArr = A01;
        if (strArr[6].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A01[0] = "QsSMXmf1NPN173cjiLSi9PN2wuQJFCPh";
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2041nY
    public final <S extends Comparable<?>> AbstractC2041nY<S> A06() {
        return AbstractC2041nY.A03();
    }

    public final String toString() {
        return A01(0, 28, 44);
    }
}
