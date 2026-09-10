package com.google.android.gms.internal.measurement;

import androidx.media3.extractor.text.ttml.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes4.dex */
final class zzos {
    public static final /* synthetic */ int zza = 0;

    static {
        if (zzop.zza() && zzop.zzb()) {
            int i2 = zzkv.zza;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    public static boolean zza(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return true;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            int iZzd = bArr[i2];
            if (iZzd >= 0) {
                i2 = i4;
            } else if (iZzd < -32) {
                if (i4 >= i3) {
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                if (iZzd < -62) {
                    return false;
                }
                i2 += 2;
                if (bArr[i4] > -65) {
                    return false;
                }
            } else if (iZzd < -16) {
                if (i4 >= i3 - 1) {
                    iZzd = zzd(bArr, i4, i3);
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                int i5 = i2 + 2;
                byte b2 = bArr[i4];
                if (b2 > -65) {
                    return false;
                }
                if (iZzd == -32 && b2 < -96) {
                    return false;
                }
                if (iZzd == -19 && b2 >= -96) {
                    return false;
                }
                i2 += 3;
                if (bArr[i5] > -65) {
                    return false;
                }
            } else {
                if (i4 >= i3 - 2) {
                    iZzd = zzd(bArr, i4, i3);
                    if (iZzd != 0) {
                        return false;
                    }
                    return true;
                }
                int i6 = i2 + 2;
                byte b3 = bArr[i4];
                if (b3 > -65) {
                    return false;
                }
                if ((((b3 + 112) + (iZzd << 28)) >> 30) != 0) {
                    return false;
                }
                int i7 = i2 + 3;
                if (bArr[i6] > -65) {
                    return false;
                }
                i2 += 4;
                if (bArr[i7] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int zzb(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i3 < length2) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new zzor(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
                break;
            }
            i4 += (127 - cCharAt) >>> 31;
            i3++;
        }
        if (i4 >= length) {
            return i4;
        }
        long j = ((long) i4) + 4294967296L;
        throw new IllegalArgumentException(a.k(j, "UTF-8 length does not fit in int: ", new StringBuilder(String.valueOf(j).length() + 34)));
    }

    public static int zzc(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int length = str.length();
        int i7 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i7 >= length || (i6 = i7 + i2) >= i4 || (cCharAt = str.charAt(i7)) >= 128) {
                break;
            }
            bArr[i6] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128 && i8 < i4) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i4 - 2) {
                bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i8 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i8 > i4 - 3) {
                    if (i8 > i4 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i5 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new zzor(i7, length);
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i8).length());
                        sb.append("Failed writing ");
                        sb.append(cCharAt2);
                        sb.append(" at index ");
                        sb.append(i8);
                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                    }
                    int i9 = i7 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i10 = i8 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i8] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i7 = i9;
                        } else {
                            i7 = i9;
                        }
                    }
                    throw new zzor(i7 - 1, length);
                }
                bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    public static /* synthetic */ int zzd(byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        byte b2 = bArr[i2 - 1];
        if (i4 == 0) {
            if (b2 <= -12) {
                return b2;
            }
            return -1;
        }
        if (i4 == 1) {
            byte b3 = bArr[i2];
            if (b2 > -12 || b3 > -65) {
                return -1;
            }
            return (b3 << 8) ^ b2;
        }
        if (i4 != 2) {
            throw new AssertionError();
        }
        byte b4 = bArr[i2];
        byte b5 = bArr[i2 + 1];
        if (b2 > -12 || b4 > -65 || b5 > -65) {
            return -1;
        }
        return (b5 << 16) ^ ((b4 << 8) ^ b2);
    }
}
