package com.google.android.gms.internal.measurement;

import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.ads.ur1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b3 {
    static {
        int i10 = n0.f23760a;
    }

    public static boolean a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return true;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                i10 = i12;
            } else {
                if (b10 < -32) {
                    if (i12 < i11 && b10 >= -62) {
                        i10 += 2;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return false;
                }
                if (b10 >= -16) {
                    if (i12 >= i11 - 2) {
                        return false;
                    }
                    int i13 = i10 + 2;
                    byte b11 = bArr[i12];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i14 = i10 + 3;
                            if (bArr[i13] <= -65) {
                                i10 += 4;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i12 >= i11 - 1) {
                    return false;
                }
                int i15 = i10 + 2;
                byte b12 = bArr[i12];
                if (b12 > -65 || (b10 == -32 && b12 < -96)) {
                    return false;
                }
                if (b10 == -19 && b12 >= -96) {
                    return false;
                }
                i10 += 3;
                if (bArr[i15] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i11 < length2) {
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 < 2048) {
                            i10 += (127 - cCharAt2) >>> 31;
                        } else {
                            i10 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i11) < 65536) {
                                    throw new a3(ur1.a(length2, i11, (byte) 32, "Unpaired surrogate at index ", " of "));
                                }
                                i11++;
                            }
                        }
                        i11++;
                    }
                    i12 += i10;
                    break;
                } catch (a3 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        long j10 = ((long) i12) + 4294967296L;
        throw new IllegalArgumentException(defpackage.e.s(new StringBuilder(String.valueOf(j10).length() + 34), "UTF-8 length does not fit in int: ", j10));
    }

    public static int c(byte[] bArr, int i10, int i11, String str) {
        int i12;
        int i13;
        int length;
        int i14;
        char cCharAt;
        int length2 = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length2 || (i14 = i15 + i10) >= i12 || (cCharAt = str.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length2) {
            return i10 + length2;
        }
        int i16 = i10 + i15;
        while (i15 < length2) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i12 - 2) {
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 <= i12 - 4) {
                        i15++;
                        if (i15 != str.length()) {
                            char cCharAt3 = str.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i17 = i16 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 += 4;
                                bArr[i17] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i10 > i11) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i10, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i13 = i15 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i10 > i11) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i10, length);
                    }
                    return i10 + length;
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 3;
            }
            i15++;
        }
        return i16;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094 A[PHI: r4
  0x0094: PHI (r4v6 byte) = (r4v5 byte), (r4v9 byte) binds: [B:41:0x008f, B:43:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ac A[SYNTHETIC] */
    public static String d(byte[] bArr, int i10, int i11) throws u1 {
        if (i11 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i10) - i11) | i10 | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (i10 < i12) {
            int i14 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                cArr[i13] = (char) b11;
                i13++;
                i10 = i14;
                while (i10 < i12) {
                    byte b12 = bArr[i10];
                    if (b12 < 0) {
                        break;
                    }
                    i10++;
                    cArr[i13] = (char) b12;
                    i13++;
                }
            } else {
                if (b11 >= -32) {
                    if (b11 >= -16) {
                        if (i14 >= i12 - 2) {
                            throw new u1("Protocol message had invalid UTF-8.");
                        }
                        byte b13 = bArr[i14];
                        int i15 = i10 + 3;
                        byte b14 = bArr[i10 + 2];
                        i10 += 4;
                        byte b15 = bArr[i15];
                        if (!e1.e(b13)) {
                            if ((((b13 + 112) + (b11 << 28)) >> 30) == 0 && !e1.e(b14) && !e1.e(b15)) {
                                int i16 = ((b13 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & 7) << 18) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE);
                                cArr[i13] = (char) ((i16 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                cArr[i13 + 1] = (char) ((i16 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                                i13 += 2;
                            }
                        }
                        throw new u1("Protocol message had invalid UTF-8.");
                    }
                    if (i14 >= i12 - 1) {
                        throw new u1("Protocol message had invalid UTF-8.");
                    }
                    int i17 = i13 + 1;
                    int i18 = i10 + 2;
                    byte b16 = bArr[i14];
                    i10 += 3;
                    byte b17 = bArr[i18];
                    if (!e1.e(b16)) {
                        if (b11 != -32) {
                            if (b11 != -19) {
                                if (!e1.e(b17)) {
                                    cArr[i13] = (char) (((b16 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b17 & Utf8.REPLACEMENT_BYTE));
                                    i13 = i17;
                                }
                            } else if (b16 < -96) {
                                b11 = -19;
                                if (!e1.e(b17)) {
                                    cArr[i13] = (char) (((b16 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b17 & Utf8.REPLACEMENT_BYTE));
                                    i13 = i17;
                                }
                            }
                        } else if (b16 >= -96) {
                            b11 = -32;
                            if (b11 != -19) {
                                if (!e1.e(b17)) {
                                    cArr[i13] = (char) (((b16 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b17 & Utf8.REPLACEMENT_BYTE));
                                    i13 = i17;
                                }
                            } else if (b16 < -96) {
                                b11 = -19;
                                if (!e1.e(b17)) {
                                    cArr[i13] = (char) (((b16 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b17 & Utf8.REPLACEMENT_BYTE));
                                    i13 = i17;
                                }
                            }
                        }
                    }
                    throw new u1("Protocol message had invalid UTF-8.");
                }
                if (i14 >= i12) {
                    throw new u1("Protocol message had invalid UTF-8.");
                }
                int i19 = i13 + 1;
                i10 += 2;
                byte b18 = bArr[i14];
                if (b11 < -62 || e1.e(b18)) {
                    throw new u1("Protocol message had invalid UTF-8.");
                }
                cArr[i13] = (char) ((b18 & Utf8.REPLACEMENT_BYTE) | ((b11 & 31) << 6));
                i13 = i19;
            }
        }
        return new String(cArr, 0, i13);
    }
}
