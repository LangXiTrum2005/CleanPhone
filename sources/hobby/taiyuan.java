package hobby;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: Field25519.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f27843attabal = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f27845saneness = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f27844dern = {67108863, 33554431};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f27846wireman = {26, 25};

    public static void apical(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[19];
        formularize(jArr3, jArr2);
        impromptu(jArr3, jArr);
    }

    public static byte[] attabal(long[] jArr) {
        int i;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j = jArrCopyOf[i4];
                int i5 = f27846wireman[i4 & 1];
                int i6 = -((int) (((j >> 31) & j) >> i5));
                jArrCopyOf[i4] = j + ((long) (i6 << i5));
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - ((long) i6);
            }
            long j2 = jArrCopyOf[9];
            int i7 = -((int) (((j2 >> 31) & j2) >> 25));
            jArrCopyOf[9] = j2 + ((long) (i7 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i7) * 19);
            i3++;
        }
        long j3 = jArrCopyOf[0];
        int i8 = -((int) (((j3 >> 31) & j3) >> 26));
        jArrCopyOf[0] = j3 + ((long) (i8 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i8);
        int i9 = 0;
        while (i9 < 2) {
            int i10 = i2;
            while (i10 < 9) {
                long j4 = jArrCopyOf[i10];
                int i11 = i10 & 1;
                int i12 = i2;
                int i13 = (int) (j4 >> f27846wireman[i11]);
                jArrCopyOf[i10] = j4 & ((long) f27844dern[i11]);
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] + ((long) i13);
                i2 = i12;
                i9 = i9;
            }
            i9++;
        }
        int i14 = i2;
        long j5 = jArrCopyOf[9];
        jArrCopyOf[9] = j5 & 33554431;
        long j6 = jArrCopyOf[i14] + (((long) ((int) (j5 >> 25))) * 19);
        jArrCopyOf[i14] = j6;
        int iWireman = wireman((int) j6, 67108845);
        for (int i15 = 1; i15 < 10; i15++) {
            iWireman &= saneness((int) jArrCopyOf[i15], f27844dern[i15 & 1]);
        }
        jArrCopyOf[i14] = jArrCopyOf[i14] - ((long) (67108845 & iWireman));
        long j7 = 33554431 & iWireman;
        jArrCopyOf[1] = jArrCopyOf[1] - j7;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - ((long) (67108863 & iWireman));
            int i16 = i + 1;
            jArrCopyOf[i16] = jArrCopyOf[i16] - j7;
        }
        for (int i17 = i14; i17 < 10; i17++) {
            jArrCopyOf[i17] = jArrCopyOf[i17] << f27845saneness[i17];
        }
        byte[] bArr = new byte[32];
        for (int i18 = i14; i18 < 10; i18++) {
            int i19 = f27843attabal[i18];
            long j8 = bArr[i19];
            long j9 = jArrCopyOf[i18];
            bArr[i19] = (byte) (j8 | (j9 & 255));
            int i20 = i19 + 1;
            bArr[i20] = (byte) (((long) bArr[i20]) | ((j9 >> 8) & 255));
            int i21 = i19 + 2;
            bArr[i21] = (byte) (((long) bArr[i21]) | ((j9 >> 16) & 255));
            int i22 = i19 + 3;
            bArr[i22] = (byte) (((long) bArr[i22]) | ((j9 >> 24) & 255));
        }
        return bArr;
    }

    public static void beachfront(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        competently(jArr4, jArr2, jArr3);
        impromptu(jArr4, jArr);
    }

    public static void competently(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j2 = jArr3[1] * j;
        long j3 = jArr2[1];
        long j4 = jArr3[0];
        jArr[1] = j2 + (j3 * j4);
        long j5 = jArr2[1];
        long j6 = jArr3[1];
        jArr[2] = (j5 * 2 * j6) + (jArr3[2] * j) + (jArr2[2] * j4);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        jArr[3] = (j5 * j7) + (j8 * j6) + (jArr3[3] * j) + (jArr2[3] * j4);
        long j9 = jArr3[3];
        long j10 = jArr2[3];
        jArr[4] = (j8 * j7) + (((j5 * j9) + (j10 * j6)) * 2) + (jArr3[4] * j) + (jArr2[4] * j4);
        long j11 = jArr3[4];
        long j12 = jArr2[4];
        jArr[5] = (j8 * j9) + (j10 * j7) + (j5 * j11) + (j12 * j6) + (jArr3[5] * j) + (jArr2[5] * j4);
        long j13 = jArr3[5];
        long j14 = jArr2[5];
        jArr[6] = (((j10 * j9) + (j5 * j13) + (j14 * j6)) * 2) + (j8 * j11) + (j12 * j7) + (jArr3[6] * j) + (jArr2[6] * j4);
        long j15 = jArr3[6];
        long j16 = jArr2[6];
        jArr[7] = (j10 * j11) + (j12 * j9) + (j8 * j13) + (j14 * j7) + (j5 * j15) + (j16 * j6) + (jArr3[7] * j) + (jArr2[7] * j4);
        long j17 = jArr3[7];
        long j18 = jArr2[7];
        jArr[8] = (j12 * j11) + (((j10 * j13) + (j14 * j9) + (j5 * j17) + (j18 * j6)) * 2) + (j8 * j15) + (j16 * j7) + (jArr3[8] * j) + (jArr2[8] * j4);
        long j19 = jArr3[8];
        long j20 = jArr2[8];
        jArr[9] = (j12 * j13) + (j14 * j11) + (j10 * j15) + (j16 * j9) + (j8 * j17) + (j18 * j7) + (j5 * j19) + (j20 * j6) + (j * jArr3[9]) + (jArr2[9] * j4);
        long j21 = jArr3[9];
        long j22 = jArr2[9];
        jArr[10] = (((j14 * j13) + (j10 * j17) + (j18 * j9) + (j5 * j21) + (j6 * j22)) * 2) + (j12 * j15) + (j16 * j11) + (j8 * j19) + (j20 * j7);
        jArr[11] = (j14 * j15) + (j16 * j13) + (j12 * j17) + (j18 * j11) + (j10 * j19) + (j20 * j9) + (j8 * j21) + (j7 * j22);
        jArr[12] = (j16 * j15) + (((j14 * j17) + (j18 * j13) + (j10 * j21) + (j9 * j22)) * 2) + (j12 * j19) + (j20 * j11);
        jArr[13] = (j16 * j17) + (j18 * j15) + (j14 * j19) + (j20 * j13) + (j12 * j21) + (j11 * j22);
        jArr[14] = (((j18 * j17) + (j14 * j21) + (j13 * j22)) * 2) + (j16 * j19) + (j20 * j15);
        jArr[15] = (j18 * j19) + (j20 * j17) + (j16 * j21) + (j15 * j22);
        jArr[16] = (j20 * j19) + (((j18 * j21) + (j17 * j22)) * 2);
        jArr[17] = (j20 * j21) + (j19 * j22);
        jArr[18] = j22 * 2 * j21;
    }

    public static void cutely(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static long[] dern(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = f27843attabal[i];
            jArr[i] = ((((((long) (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) | (((long) (bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8)) | (((long) (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 16)) | (((long) (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 24)) >> f27845saneness[i]) & ((long) f27844dern[i & 1]);
        }
        return jArr;
    }

    public static void formularize(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        jArr[0] = j * j;
        long j2 = jArr2[0];
        jArr[1] = j2 * 2 * jArr2[1];
        long j3 = jArr2[1];
        jArr[2] = ((j3 * j3) + (jArr2[2] * j2)) * 2;
        long j4 = jArr2[2];
        jArr[3] = ((j3 * j4) + (jArr2[3] * j2)) * 2;
        long j5 = jArr2[3];
        jArr[4] = (j4 * j4) + (j3 * 4 * j5) + (j2 * 2 * jArr2[4]);
        long j6 = jArr2[4];
        jArr[5] = ((j4 * j5) + (j3 * j6) + (jArr2[5] * j2)) * 2;
        long j7 = (j5 * j5) + (j4 * j6) + (jArr2[6] * j2);
        long j8 = jArr2[5];
        jArr[6] = (j7 + (j3 * 2 * j8)) * 2;
        long j9 = jArr2[6];
        jArr[7] = ((j5 * j6) + (j4 * j8) + (j3 * j9) + (jArr2[7] * j2)) * 2;
        long j10 = (j4 * j9) + (jArr2[8] * j2);
        long j11 = jArr2[7];
        jArr[8] = (j6 * j6) + ((j10 + (((j3 * j11) + (j5 * j8)) * 2)) * 2);
        long j12 = jArr2[8];
        jArr[9] = ((j6 * j8) + (j5 * j9) + (j4 * j11) + (j3 * j12) + (j2 * jArr2[9])) * 2;
        long j13 = jArr2[9];
        jArr[10] = ((j8 * j8) + (j6 * j9) + (j4 * j12) + (((j5 * j11) + (j3 * j13)) * 2)) * 2;
        jArr[11] = ((j8 * j9) + (j6 * j11) + (j5 * j12) + (j4 * j13)) * 2;
        jArr[12] = (j9 * j9) + (((j6 * j12) + (((j8 * j11) + (j5 * j13)) * 2)) * 2);
        jArr[13] = ((j9 * j11) + (j8 * j12) + (j6 * j13)) * 2;
        jArr[14] = ((j11 * j11) + (j9 * j12) + (j8 * 2 * j13)) * 2;
        jArr[15] = ((j11 * j12) + (j9 * j13)) * 2;
        jArr[16] = (j12 * j12) + (j11 * 4 * j13);
        jArr[17] = j12 * 2 * j13;
        jArr[18] = 2 * j13 * j13;
    }

    public static void impassible(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void impromptu(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        cutely(jArr);
        taiyuan(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void kowloon(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static void marial(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        apical(jArr3, jArr2);
        apical(jArr12, jArr3);
        apical(jArr11, jArr12);
        beachfront(jArr4, jArr11, jArr2);
        beachfront(jArr5, jArr4, jArr3);
        apical(jArr11, jArr5);
        beachfront(jArr6, jArr11, jArr4);
        apical(jArr11, jArr6);
        apical(jArr12, jArr11);
        apical(jArr11, jArr12);
        apical(jArr12, jArr11);
        apical(jArr11, jArr12);
        beachfront(jArr7, jArr11, jArr6);
        apical(jArr11, jArr7);
        apical(jArr12, jArr11);
        for (int i = 2; i < 10; i += 2) {
            apical(jArr11, jArr12);
            apical(jArr12, jArr11);
        }
        beachfront(jArr8, jArr12, jArr7);
        apical(jArr11, jArr8);
        apical(jArr12, jArr11);
        for (int i2 = 2; i2 < 20; i2 += 2) {
            apical(jArr11, jArr12);
            apical(jArr12, jArr11);
        }
        beachfront(jArr11, jArr12, jArr8);
        apical(jArr12, jArr11);
        apical(jArr11, jArr12);
        for (int i3 = 2; i3 < 10; i3 += 2) {
            apical(jArr12, jArr11);
            apical(jArr11, jArr12);
        }
        beachfront(jArr9, jArr11, jArr7);
        apical(jArr11, jArr9);
        apical(jArr12, jArr11);
        for (int i4 = 2; i4 < 50; i4 += 2) {
            apical(jArr11, jArr12);
            apical(jArr12, jArr11);
        }
        beachfront(jArr10, jArr12, jArr9);
        apical(jArr12, jArr10);
        apical(jArr11, jArr12);
        for (int i5 = 2; i5 < 100; i5 += 2) {
            apical(jArr12, jArr11);
            apical(jArr11, jArr12);
        }
        beachfront(jArr12, jArr11, jArr10);
        apical(jArr11, jArr12);
        apical(jArr12, jArr11);
        for (int i6 = 2; i6 < 50; i6 += 2) {
            apical(jArr11, jArr12);
            apical(jArr12, jArr11);
        }
        beachfront(jArr11, jArr12, jArr9);
        apical(jArr12, jArr11);
        apical(jArr11, jArr12);
        apical(jArr12, jArr11);
        apical(jArr11, jArr12);
        apical(jArr12, jArr11);
        beachfront(jArr, jArr12, jArr5);
    }

    public static int saneness(int i, int i2) {
        int i3 = ~(i ^ i2);
        int i4 = i3 & (i3 << 16);
        int i5 = i4 & (i4 << 8);
        int i6 = i5 & (i5 << 4);
        int i7 = i6 & (i6 << 2);
        return (i7 & (i7 << 1)) >> 31;
    }

    public static void taiyuan(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void triweekly(long[] jArr, long[] jArr2) {
        kowloon(jArr, jArr, jArr2);
    }

    public static int wireman(int i, int i2) {
        return ~((i - i2) >> 31);
    }
}
