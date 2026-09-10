package qe;

import com.applovin.shadow.okio.Utf8;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f49020c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f49018a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f49019b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, Utf8.REPLACEMENT_BYTE, 123, 125, 39, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f49021d = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f49022e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        f49020c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f49018a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f49020c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f49021d, (byte) -1);
        while (true) {
            byte[] bArr3 = f49019b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f49021d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    public static void a(int i10, int i11, StringBuilder sb2, byte[] bArr) {
        if (i10 == 1 && i11 == 0) {
            sb2.append((char) 913);
        } else if (i10 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        int i12 = 0;
        if (i10 >= 6) {
            char[] cArr = new char[5];
            int i13 = 0;
            while (i10 - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + ((long) (bArr[i13 + i14] & 255));
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
            i12 = i13;
        }
        while (i12 < i10) {
            sb2.append((char) (bArr[i12] & 255));
            i12++;
        }
    }

    public static void b(int i10, int i11, String str, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int iMin = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder("1");
            int i13 = i10 + i12;
            sb4.append(str.substring(i13, i13 + iMin));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x00e6 A[EDGE_INSN: B:76:0x00e6->B:57:0x00e6 BREAK  A[LOOP:0: B:3:0x000e->B:93:0x000e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x000e A[SYNTHETIC] */
    public static int c(String str, int i10, int i11, StringBuilder sb2, int i12) {
        char cCharAt;
        StringBuilder sb3 = new StringBuilder(i11);
        int i13 = i12;
        int i14 = 0;
        while (true) {
            int i15 = i10 + i14;
            char cCharAt2 = str.charAt(i15);
            byte[] bArr = f49020c;
            byte[] bArr2 = f49021d;
            if (i13 == 0) {
                if (e(cCharAt2)) {
                    if (cCharAt2 == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt2 - 'A'));
                    }
                } else if (d(cCharAt2)) {
                    sb3.append((char) 27);
                    i13 = 1;
                } else if (bArr[cCharAt2] != -1) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) bArr2[cCharAt2]);
                }
                i14++;
                if (i14 >= i11) {
                    break;
                    break;
                }
            } else {
                if (i13 != 1) {
                    if (i13 == 2) {
                        byte b10 = bArr[cCharAt2];
                        if (b10 != -1) {
                            sb3.append((char) b10);
                        } else if (e(cCharAt2)) {
                            sb3.append((char) 28);
                            i13 = 0;
                        } else if (d(cCharAt2)) {
                            sb3.append((char) 27);
                            i13 = 1;
                        } else {
                            int i16 = i15 + 1;
                            if (i16 >= i11 || bArr2[str.charAt(i16)] == -1) {
                                sb3.append((char) 29);
                                sb3.append((char) bArr2[cCharAt2]);
                            } else {
                                sb3.append((char) 25);
                                i13 = 3;
                            }
                        }
                    } else if (bArr2[cCharAt2] != -1) {
                        sb3.append((char) bArr2[cCharAt2]);
                    } else {
                        sb3.append((char) 29);
                        i13 = 0;
                    }
                } else if (d(cCharAt2)) {
                    if (cCharAt2 == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt2 - 'a'));
                    }
                } else if (e(cCharAt2)) {
                    sb3.append((char) 27);
                    sb3.append((char) (cCharAt2 - 'A'));
                } else if (bArr[cCharAt2] != -1) {
                    sb3.append((char) 28);
                    i13 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) bArr2[cCharAt2]);
                }
                i14++;
                if (i14 >= i11) {
                    break;
                }
            }
        }
        int length = sb3.length();
        char c4 = 0;
        for (int i17 = 0; i17 < length; i17++) {
            if (i17 % 2 != 0) {
                cCharAt = (char) (sb3.charAt(i17) + (c4 * 30));
                sb2.append(cCharAt);
            } else {
                cCharAt = sb3.charAt(i17);
            }
            c4 = cCharAt;
        }
        if (length % 2 != 0) {
            sb2.append((char) ((c4 * 30) + 29));
        }
        return i13;
    }

    public static boolean d(char c4) {
        if (c4 != ' ') {
            return c4 >= 'a' && c4 <= 'z';
        }
        return true;
    }

    public static boolean e(char c4) {
        if (c4 != ' ') {
            return c4 >= 'A' && c4 <= 'Z';
        }
        return true;
    }
}
