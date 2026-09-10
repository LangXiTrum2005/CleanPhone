package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
final class zzidr {
    private static final zzido zza;

    static {
        if (zzidm.zza() && zzidm.zzb()) {
            int i2 = zzhyy.zza;
        }
        zza = new zzidp();
    }

    public static boolean zza(byte[] bArr, int i2, int i3) {
        return zza.zza(0, bArr, i2, i3) == 0;
    }

    public static int zzb(int i2, byte[] bArr, int i3, int i4) {
        return zza.zza(i2, bArr, i3, i4);
    }

    public static int zzc(String str) {
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
                                throw new zzidq(i3, length2);
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
        throw new IllegalArgumentException(androidx.media3.extractor.text.ttml.a.k(j, "UTF-8 length does not fit in int: ", new StringBuilder(String.valueOf(j).length() + 34)));
    }

    public static int zzd(String str, byte[] bArr, int i2, int i3) {
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
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i5 = i7 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        throw new zzidq(i7, length);
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
                    throw new zzidq(i7 - 1, length);
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

    public static String zze(ByteBuffer byteBuffer, int i2, int i3) throws zzibg {
        zzido zzidoVar = zza;
        if (byteBuffer.hasArray()) {
            return zzidoVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
        }
        return byteBuffer.isDirect() ? zzido.zzc(byteBuffer, i2, i3) : zzido.zzc(byteBuffer, i2, i3);
    }

    public static String zzf(byte[] bArr, int i2, int i3) throws zzibg {
        return zza.zzb(bArr, i2, i3);
    }

    public static /* synthetic */ int zzi(byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        byte b2 = bArr[i2 - 1];
        if (i4 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i4 == 1) {
            return zzj(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return zzk(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }
}
