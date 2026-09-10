package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HZ {
    public static byte[] A02;
    public static String[] A03 = {"W2JHeYWWa9ELcHAI15RIxe4rxnXWWmwk", "jvlLQF6rExXNlz19WHgISGbwTL", "EBuySnurnPPVASsat8Xhk3v9TkFPfMa7", "RYPW7gHfiH7qYGvVsJs3ktsr8U93g5tm", "ZClNIsWZ1G8A3MTEGXpjjoEPMiXhgtof", "D5tWHlyJf58ulipH56j910ebLUAuxbL6", "RihQcpykaCTUXmmxq9jMexUaOMIMy6Jg", "Z9jj6O5eYN9H67mnhWcCV55A3djqvCt0"};
    public static final HZ A04;
    public final long A00;
    public final long A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{120, 116, 36, 59, 39, 61, 32, 61, 59, 58, 105, 58, 21, 8, 12, 4, 52, 18, 92, 37};
    }

    static {
        A01();
        A04 = new HZ(0L, 0L);
    }

    public HZ(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            if (A03[2].charAt(20) != 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "xxeEFU0wzywmupm5o82U4LrsfSXadp98";
            strArr[4] = "8tPKtjPFESzwuJv9uBTgFsWt41X19Dg4";
            if (cls == cls2) {
                HZ hz = (HZ) obj;
                return this.A01 == hz.A01 && this.A00 == hz.A00;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public final String toString() {
        return A00(11, 8, 66) + this.A01 + A00(0, 11, 119) + this.A00 + A00(19, 1, 91);
    }
}
