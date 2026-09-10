package cloop;

import com.inmobi.media.core.config.models.AdConfig;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: Poly1305.java */
/* JADX INFO: loaded from: classes3.dex */
public class seminary {
    public static byte[] attabal(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jDern = dern(bArr, 0, 0) & 67108863;
        int i = 3;
        int i2 = 2;
        long jDern2 = dern(bArr, 3, 2) & 67108611;
        long jDern3 = dern(bArr, 6, 4) & 67092735;
        long jDern4 = dern(bArr, 9, 6) & 66076671;
        long jDern5 = dern(bArr, 12, 8) & 1048575;
        long j = jDern2 * 5;
        long j2 = jDern3 * 5;
        long j3 = jDern4 * 5;
        long j4 = jDern5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        int i3 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        while (i3 < bArr2.length) {
            saneness(bArr3, bArr2, i3);
            long jDern6 = j9 + dern(bArr3, 0, 0);
            long jDern7 = j5 + dern(bArr3, i, i2);
            long jDern8 = j6 + dern(bArr3, 6, 4);
            long jDern9 = j7 + dern(bArr3, 9, 6);
            long j10 = jDern2;
            long jDern10 = j8 + (dern(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j11 = (jDern6 * jDern) + (jDern7 * j4) + (jDern8 * j3) + (jDern9 * j2) + (jDern10 * j);
            long j12 = (jDern6 * j10) + (jDern7 * jDern) + (jDern8 * j4) + (jDern9 * j3) + (jDern10 * j2);
            long j13 = (jDern6 * jDern3) + (jDern7 * j10) + (jDern8 * jDern) + (jDern9 * j4) + (jDern10 * j3);
            long j14 = (jDern6 * jDern4) + (jDern7 * jDern3) + (jDern8 * j10) + (jDern9 * jDern) + (jDern10 * j4);
            long j15 = (jDern6 * jDern5) + (jDern7 * jDern4) + (jDern8 * jDern3) + (jDern9 * j10) + (jDern10 * jDern);
            long j16 = j12 + (j11 >> 26);
            long j17 = j13 + (j16 >> 26);
            j6 = j17 & 67108863;
            long j18 = j14 + (j17 >> 26);
            j7 = j18 & 67108863;
            long j19 = j15 + (j18 >> 26);
            j8 = j19 & 67108863;
            long j20 = (j11 & 67108863) + ((j19 >> 26) * 5);
            j9 = j20 & 67108863;
            j5 = (j16 & 67108863) + (j20 >> 26);
            i3 += 16;
            jDern2 = j10;
            i = 3;
            i2 = 2;
        }
        long j21 = j6 + (j5 >> 26);
        long j22 = j21 & 67108863;
        long j23 = j7 + (j21 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j8 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j9 + ((j25 >> 26) * 5);
        long j28 = j27 & 67108863;
        long j29 = (j5 & 67108863) + (j27 >> 26);
        long j30 = j28 + 5;
        long j31 = j30 & 67108863;
        long j32 = (j30 >> 26) + j29;
        long j33 = j22 + (j32 >> 26);
        long j34 = j24 + (j33 >> 26);
        long j35 = j34 & 67108863;
        long j36 = (j26 + (j34 >> 26)) - 67108864;
        long j37 = j36 >> 63;
        long j38 = j28 & j37;
        long j39 = j29 & j37;
        long j40 = j22 & j37;
        long j41 = j24 & j37;
        long j42 = j26 & j37;
        long j43 = ~j37;
        long j44 = (j32 & 67108863 & j43) | j39;
        long j45 = (j33 & 67108863 & j43) | j40;
        long j46 = (j35 & j43) | j41;
        long j47 = j42 | (j36 & j43);
        long j48 = (j38 | (j31 & j43) | (j44 << 26)) & 4294967295L;
        long j49 = ((j44 >> 6) | (j45 << 20)) & 4294967295L;
        long j50 = ((j45 >> 12) | (j46 << 14)) & 4294967295L;
        long j51 = ((j46 >> 18) | (j47 << 8)) & 4294967295L;
        long jWireman = j48 + wireman(bArr, 16);
        long j52 = jWireman & 4294967295L;
        long jWireman2 = j49 + wireman(bArr, 20) + (jWireman >> 32);
        long j53 = jWireman2 & 4294967295L;
        long jWireman3 = j50 + wireman(bArr, 24) + (jWireman2 >> 32);
        long j54 = jWireman3 & 4294967295L;
        long jWireman4 = (j51 + wireman(bArr, 28) + (jWireman3 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        marial(bArr4, j52, 0);
        marial(bArr4, j53, 4);
        marial(bArr4, j54, 8);
        marial(bArr4, jWireman4, 12);
        return bArr4;
    }

    public static void beachfront(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!affiche.marial.saneness(attabal(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public static long dern(byte[] bArr, int i, int i2) {
        return (wireman(bArr, i) >> i2) & 67108863;
    }

    public static void marial(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static void saneness(byte[] bArr, byte[] bArr2, int i) {
        int iMin = Math.min(16, bArr2.length - i);
        System.arraycopy(bArr2, i, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    public static long wireman(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16))) & 4294967295L;
    }
}
