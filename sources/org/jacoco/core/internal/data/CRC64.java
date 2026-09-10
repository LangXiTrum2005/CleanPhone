package org.jacoco.core.internal.data;

/* JADX INFO: loaded from: classes5.dex */
public final class CRC64 {
    private static final long[] LOOKUPTABLE = new long[256];
    private static final long POLY64REV = -2882303761517117440L;

    static {
        for (int i = 0; i < 256; i++) {
            long j = i;
            for (int i2 = 0; i2 < 8; i2++) {
                j = (j & 1) == 1 ? (j >>> 1) ^ POLY64REV : j >>> 1;
            }
            LOOKUPTABLE[i] = j;
        }
    }

    private CRC64() {
    }

    public static long classId(byte[] bArr) {
        return (bArr.length > 7 && bArr[6] == 0 && bArr[7] == 53) ? update(update(update(0L, bArr, 0, 7), (byte) 52), bArr, 8, bArr.length) : update(0L, bArr, 0, bArr.length);
    }

    private static long update(long j, byte b) {
        return (j >>> 8) ^ LOOKUPTABLE[(b ^ ((int) j)) & 255];
    }

    private static long update(long j, byte[] bArr, int i, int i2) {
        while (i < i2) {
            j = update(j, bArr[i]);
            i++;
        }
        return j;
    }
}
