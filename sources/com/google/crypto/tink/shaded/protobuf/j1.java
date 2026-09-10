package com.google.crypto.tink.shaded.protobuf;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends qk.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24588b;

    public /* synthetic */ j1(int i10) {
        this.f24588b = i10;
    }

    public static int t0(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            qk.i0 i0Var = l1.f24607a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return l1.c(i10, i1.g(j10, bArr));
        }
        if (i11 == 2) {
            return l1.d(i10, i1.g(j10, bArr), i1.g(j10 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // qk.i0
    public final String A(byte[] bArr, int i10, int i11) throws d0 {
        int i12;
        byte b10;
        int i13;
        byte b11;
        byte b12;
        byte b13;
        switch (this.f24588b) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i14 = i10 + i11;
                char[] cArr = new char[i11];
                int i15 = 0;
                while (i10 < i14) {
                    byte b14 = bArr[i10];
                    if (b14 < 0) {
                        while (i10 < i14) {
                            i12 = i10 + 1;
                            b10 = bArr[i10];
                            if (b10 < 0) {
                                i13 = i15 + 1;
                                cArr[i15] = (char) b10;
                                while (i12 < i14) {
                                    b11 = bArr[i12];
                                    if (b11 >= 0) {
                                        i12++;
                                        cArr[i13] = (char) b11;
                                        i13++;
                                    } else {
                                        i15 = i13;
                                        i10 = i12;
                                    }
                                }
                                i15 = i13;
                                i10 = i12;
                            } else if (b10 < -32) {
                                if (i12 < i14) {
                                    throw d0.g();
                                }
                                i10 += 2;
                                byte b15 = bArr[i12];
                                int i16 = i15 + 1;
                                if (b10 >= -62 || no.b.x(b15)) {
                                    throw d0.g();
                                }
                                cArr[i15] = (char) ((b15 & Utf8.REPLACEMENT_BYTE) | ((b10 & 31) << 6));
                                i15 = i16;
                            } else {
                                if (b10 >= -16) {
                                    if (i12 < i14 - 2) {
                                        throw d0.g();
                                    }
                                    b13 = bArr[i12];
                                    int i17 = i10 + 3;
                                    byte b16 = bArr[i10 + 2];
                                    i10 += 4;
                                    byte b17 = bArr[i17];
                                    int i18 = i15 + 1;
                                    if (!no.b.x(b13)) {
                                        if ((((b13 + 112) + (b10 << 28)) >> 30) != 0 && !no.b.x(b16) && !no.b.x(b17)) {
                                            int i19 = ((b13 & Utf8.REPLACEMENT_BYTE) << 12) | ((b10 & 7) << 18) | ((b16 & Utf8.REPLACEMENT_BYTE) << 6) | (b17 & Utf8.REPLACEMENT_BYTE);
                                            cArr[i15] = (char) ((i19 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                            cArr[i18] = (char) ((i19 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                                            i15 += 2;
                                        }
                                    }
                                    throw d0.g();
                                }
                                if (i12 < i14 - 1) {
                                    throw d0.g();
                                }
                                int i20 = i10 + 2;
                                b12 = bArr[i12];
                                i10 += 3;
                                byte b18 = bArr[i20];
                                int i21 = i15 + 1;
                                if (!no.b.x(b12) || ((b10 == -32 && b12 < -96) || ((b10 == -19 && b12 >= -96) || no.b.x(b18)))) {
                                    throw d0.g();
                                }
                                cArr[i15] = (char) (((b12 & Utf8.REPLACEMENT_BYTE) << 6) | ((b10 & 15) << 12) | (b18 & Utf8.REPLACEMENT_BYTE));
                                i15 = i21;
                            }
                        }
                        return new String(cArr, 0, i15);
                    }
                    i10++;
                    cArr[i15] = (char) b14;
                    i15++;
                }
                while (i10 < i14) {
                    i12 = i10 + 1;
                    b10 = bArr[i10];
                    if (b10 < 0) {
                        if (b10 < -32) {
                            if (i12 < i14) {
                                throw d0.g();
                            }
                            i10 += 2;
                            byte b19 = bArr[i12];
                            int i110 = i15 + 1;
                            if (b10 >= -62) {
                            }
                            throw d0.g();
                        }
                        if (b10 >= -16) {
                            if (i12 < i14 - 1) {
                                throw d0.g();
                            }
                            int i22 = i10 + 2;
                            b12 = bArr[i12];
                            i10 += 3;
                            byte b110 = bArr[i22];
                            int i23 = i15 + 1;
                            if (no.b.x(b12)) {
                            }
                            throw d0.g();
                        }
                        if (i12 < i14 - 2) {
                            throw d0.g();
                        }
                        b13 = bArr[i12];
                        int i111 = i10 + 3;
                        byte b111 = bArr[i10 + 2];
                        i10 += 4;
                        byte b112 = bArr[i111];
                        int i112 = i15 + 1;
                        if (!no.b.x(b13)) {
                            if ((((b13 + 112) + (b10 << 28)) >> 30) != 0) {
                            }
                        }
                        throw d0.g();
                    }
                    i13 = i15 + 1;
                    cArr[i15] = (char) b10;
                    while (i12 < i14) {
                        b11 = bArr[i12];
                        if (b11 >= 0) {
                            i12++;
                            cArr[i13] = (char) b11;
                            i13++;
                        } else {
                            i15 = i13;
                            i10 = i12;
                        }
                    }
                    i15 = i13;
                    i10 = i12;
                }
                return new String(cArr, 0, i15);
            default:
                Charset charset = b0.f24539a;
                String str = new String(bArr, i10, i11, charset);
                if (str.indexOf(Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                    throw d0.g();
                }
                return str;
        }
    }

    @Override // qk.i0
    public final int C(byte[] bArr, int i10, int i11, String str) {
        int i12;
        int i13;
        char cCharAt;
        long j10;
        long j11;
        long j12;
        int i14;
        char cCharAt2;
        switch (this.f24588b) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new k1(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new k1(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j13 = i10;
                long j14 = ((long) i11) + j13;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j10 = 1;
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < 128) {
                        i1.k(bArr, j13, (byte) cCharAt2);
                        i22++;
                        j13 = 1 + j13;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char cCharAt5 = str.charAt(i22);
                        if (cCharAt5 < 128 && j13 < j14) {
                            i1.k(bArr, j13, (byte) cCharAt5);
                            j12 = j14;
                            j11 = j10;
                            j13 += j10;
                        } else if (cCharAt5 >= 2048 || j13 > j14 - 2) {
                            j11 = j10;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j13 > j14 - 3) {
                                j12 = j14;
                                if (j13 > j12 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                        throw new k1(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j13);
                                }
                                int i23 = i22 + 1;
                                if (i23 != length2) {
                                    char cCharAt6 = str.charAt(i23);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        i1.k(bArr, j13, (byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        i1.k(bArr, j13 + j11, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j15 = j13 + 3;
                                        i1.k(bArr, j13 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j13 += 4;
                                        i1.k(bArr, j15, (byte) ((codePoint2 & 63) | 128));
                                        i22 = i23;
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                throw new k1(i22 - 1, length2);
                            }
                            i1.k(bArr, j13, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j16 = j13 + 2;
                            j12 = j14;
                            i1.k(bArr, j13 + j11, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j13 += 3;
                            i1.k(bArr, j16, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            j11 = j10;
                            long j17 = j13 + j11;
                            i1.k(bArr, j13, (byte) ((cCharAt5 >>> 6) | 960));
                            j13 += 2;
                            i1.k(bArr, j17, (byte) ((cCharAt5 & '?') | 128));
                            j12 = j14;
                        }
                        i22++;
                        j10 = j11;
                        j14 = j12;
                    }
                }
                return (int) j13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    @Override // qk.i0
    public final int W(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        long j10;
        byte bG;
        long j11;
        byte bG2;
        long j12;
        switch (this.f24588b) {
            case 0:
                break;
            default:
                if ((i10 | i11 | (bArr.length - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long j13 = i10;
                int i14 = (int) (((long) i11) - j13);
                if (i14 < 16) {
                    i12 = 0;
                } else {
                    int i15 = 8 - (((int) j13) & 7);
                    i12 = 0;
                    long j14 = j13;
                    while (true) {
                        if (i12 < i15) {
                            long j15 = j14 + 1;
                            if (i1.g(j14, bArr) >= 0) {
                                i12++;
                                j14 = j15;
                            }
                        } else {
                            while (true) {
                                int i16 = i12 + 8;
                                if (i16 <= i14) {
                                    if ((i1.f24575c.h(i1.f24578f + j14, bArr) & (-9187201950435737472L)) == 0) {
                                        j14 += 8;
                                        i12 = i16;
                                    }
                                }
                            }
                            while (true) {
                                if (i12 < i14) {
                                    long j16 = j14 + 1;
                                    if (i1.g(j14, bArr) >= 0) {
                                        i12++;
                                        j14 = j16;
                                    }
                                } else {
                                    i12 = i14;
                                }
                            }
                        }
                    }
                }
                int i17 = i14 - i12;
                long j17 = j13 + ((long) i12);
                while (true) {
                    byte bG3 = 0;
                    while (i17 > 0) {
                        long j18 = j17 + 1;
                        bG3 = i1.g(j17, bArr);
                        if (bG3 < 0) {
                            j17 = j18;
                            if (i17 == 0) {
                                return 0;
                            }
                            i13 = i17 - 1;
                            if (bG3 < -32) {
                                if (i13 == 0) {
                                    return bG3;
                                }
                                i17 -= 2;
                                if (bG3 >= -62) {
                                    j10 = j17 + 1;
                                    if (i1.g(j17, bArr) > -65) {
                                        j17 = j10;
                                    }
                                }
                                return -1;
                            }
                            if (bG3 < -16) {
                                if (i13 < 2) {
                                    return t0(j17, bArr, bG3, i13);
                                }
                                i17 -= 3;
                                long j19 = j17 + 1;
                                bG = i1.g(j17, bArr);
                                if (bG > -65 && ((bG3 != -32 || bG >= -96) && (bG3 != -19 || bG < -96))) {
                                    j17 += 2;
                                    if (i1.g(j19, bArr) > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (i13 < 3) {
                                return t0(j17, bArr, bG3, i13);
                            }
                            i17 -= 4;
                            j11 = j17 + 1;
                            bG2 = i1.g(j17, bArr);
                            if (bG2 <= -65) {
                                if ((((bG2 + 112) + (bG3 << 28)) >> 30) == 0) {
                                    j12 = 2 + j17;
                                    if (i1.g(j11, bArr) <= -65) {
                                        j17 += 3;
                                        if (i1.g(j12, bArr) > -65) {
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i17--;
                        j17 = j18;
                    }
                    if (i17 == 0) {
                        return 0;
                    }
                    i13 = i17 - 1;
                    if (bG3 < -32) {
                        if (i13 == 0) {
                            return bG3;
                        }
                        i17 -= 2;
                        if (bG3 >= -62) {
                            j10 = j17 + 1;
                            if (i1.g(j17, bArr) > -65) {
                                j17 = j10;
                            }
                        }
                        return -1;
                    }
                    if (bG3 < -16) {
                        if (i13 < 2) {
                            return t0(j17, bArr, bG3, i13);
                        }
                        i17 -= 3;
                        long j110 = j17 + 1;
                        bG = i1.g(j17, bArr);
                        if (bG > -65) {
                        }
                        return -1;
                    }
                    if (i13 < 3) {
                        return t0(j17, bArr, bG3, i13);
                    }
                    i17 -= 4;
                    j11 = j17 + 1;
                    bG2 = i1.g(j17, bArr);
                    if (bG2 <= -65) {
                        if ((((bG2 + 112) + (bG3 << 28)) >> 30) == 0) {
                            j12 = 2 + j17;
                            if (i1.g(j11, bArr) <= -65) {
                                j17 += 3;
                                if (i1.g(j12, bArr) > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
        }
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 < i11) {
            while (i10 < i11) {
                int i18 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 < 0) {
                    if (b10 < -32) {
                        if (i18 >= i11) {
                            return b10;
                        }
                        if (b10 >= -62) {
                            i10 += 2;
                            if (bArr[i18] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        if (i18 >= i11 - 1) {
                            return l1.a(bArr, i18, i11);
                        }
                        int i19 = i10 + 2;
                        byte b11 = bArr[i18];
                        if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                            i10 += 3;
                            if (bArr[i19] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i18 >= i11 - 2) {
                        return l1.a(bArr, i18, i11);
                    }
                    int i20 = i10 + 2;
                    byte b12 = bArr[i18];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i21 = i10 + 3;
                            if (bArr[i20] <= -65) {
                                i10 += 4;
                                if (bArr[i21] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i10 = i18;
            }
        }
        return 0;
    }
}
