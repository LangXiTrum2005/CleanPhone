package com.smartdigimkt.h8;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
class f {
    private static final int d = 2048;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f35743e = "Invalid String";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f35744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f35745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35746c;

    public f(int i2) {
        this(new byte[i2], 0);
    }

    public static int f(int i2) {
        if ((i2 >> 7) == 0) {
            return 1;
        }
        if ((i2 >> 14) == 0) {
            return 2;
        }
        if ((i2 >> 21) == 0) {
            return 3;
        }
        return (i2 >> 28) == 0 ? 4 : 5;
    }

    public byte a() {
        byte[] bArr = this.f35745b;
        int i2 = this.f35746c;
        this.f35746c = i2 + 1;
        return bArr[i2];
    }

    public int b() {
        byte[] bArr = this.f35745b;
        int i2 = this.f35746c;
        int i3 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int i4 = i2 + 3;
        int i5 = i3 | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f35746c = i2 + 4;
        return (bArr[i4] << 24) | i5;
    }

    public int c(int i2) {
        byte[] bArr = this.f35745b;
        int i3 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        return (bArr[i2 + 3] << 24) | i3 | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public short d() {
        byte[] bArr = this.f35745b;
        int i2 = this.f35746c;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f35746c = i2 + 2;
        return (short) ((bArr[i3] << 8) | i4);
    }

    public int e() {
        byte[] bArr = this.f35745b;
        int i2 = this.f35746c;
        int i3 = i2 + 1;
        this.f35746c = i3;
        byte b2 = bArr[i2];
        if ((b2 >> 7) == 0) {
            return b2;
        }
        int i4 = b2 & AbstractJsonLexerKt.TC_INVALID;
        int i5 = i2 + 2;
        this.f35746c = i5;
        int i6 = (bArr[i3] << 7) | i4;
        if ((i6 >> 14) == 0) {
            return i6;
        }
        int i7 = i2 + 3;
        this.f35746c = i7;
        int i8 = (i6 & 16383) | (bArr[i5] << 14);
        if ((i8 >> 21) == 0) {
            return i8;
        }
        int i9 = i2 + 4;
        this.f35746c = i9;
        int i10 = (i8 & 2097151) | (bArr[i7] << 21);
        if ((i10 >> 28) == 0) {
            return i10;
        }
        this.f35746c = i2 + 5;
        return (bArr[i9] << 28) | (i10 & 268435455);
    }

    public void g(int i2) {
        byte[] bArr = this.f35745b;
        int i3 = this.f35746c;
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        this.f35746c = i3 + 4;
        bArr[i3 + 3] = (byte) (i2 >> 24);
    }

    public void h(int i2) {
        this.f35746c = c(this.f35746c, i2);
    }

    public f(byte[] bArr) {
        this(bArr, 0);
    }

    public final void a(byte b2) {
        byte[] bArr = this.f35745b;
        int i2 = this.f35746c;
        this.f35746c = i2 + 1;
        bArr[i2] = b2;
    }

    public void b(int i2, int i3) {
        byte[] bArr = this.f35745b;
        bArr[i2] = (byte) i3;
        bArr[i2 + 1] = (byte) (i3 >> 8);
        bArr[i2 + 2] = (byte) (i3 >> 16);
        bArr[i2 + 3] = (byte) (i3 >> 24);
    }

    public int c(com.smartdigimkt.i8.a aVar) {
        int iB = b();
        return aVar != null ? aVar.b(iB) : iB;
    }

    public long d(int i2) {
        byte[] bArr = this.f35745b;
        int i3 = i2 + 6;
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i3]) & 255) << 48) | (((long) bArr[i2 + 7]) << 56);
    }

    public f(byte[] bArr, int i2) {
        this.f35744a = null;
        this.f35745b = bArr;
        this.f35746c = i2;
    }

    public void a(short s) {
        byte[] bArr = this.f35745b;
        int i2 = this.f35746c;
        bArr[i2] = (byte) s;
        this.f35746c = i2 + 2;
        bArr[i2 + 1] = (byte) (s >> 8);
    }

    public long d(com.smartdigimkt.i8.a aVar) {
        long jC = c();
        return aVar != null ? aVar.b(jC) : jC;
    }

    public int c(int i2, int i3) {
        while ((i3 & (-128)) != 0) {
            this.f35745b[i2] = (byte) ((i3 & 127) | 128);
            i3 >>>= 7;
            i2++;
        }
        int i4 = i2 + 1;
        this.f35745b[i2] = (byte) i3;
        return i4;
    }

    public void a(int i2, long j) {
        byte[] bArr = this.f35745b;
        bArr[i2] = (byte) j;
        bArr[i2 + 1] = (byte) (j >> 8);
        bArr[i2 + 2] = (byte) (j >> 16);
        bArr[i2 + 3] = (byte) (j >> 24);
        bArr[i2 + 4] = (byte) (j >> 32);
        bArr[i2 + 5] = (byte) (j >> 40);
        bArr[i2 + 6] = (byte) (j >> 48);
        bArr[i2 + 7] = (byte) (j >> 56);
    }

    public float b(com.smartdigimkt.i8.a aVar) {
        return Float.intBitsToFloat(c(aVar));
    }

    public long c() {
        long jD = d(this.f35746c);
        this.f35746c += 8;
        return jD;
    }

    public String e(int i2) {
        if (i2 < 0) {
            return null;
        }
        if (i2 == 0) {
            return "";
        }
        String str = i2 > 2048 ? new String(this.f35745b, this.f35746c, i2, StandardCharsets.UTF_8) : a(this.f35745b, this.f35746c, i2);
        this.f35746c += i2;
        return str;
    }

    public String b(com.smartdigimkt.i8.a aVar, int i2) {
        String str;
        if (aVar != null && i2 > 0) {
            byte[] bArr = this.f35745b;
            int i3 = this.f35746c;
            byte[] bArrB = aVar.b(Arrays.copyOfRange(bArr, i3, i3 + i2));
            if (bArrB == null) {
                str = null;
            } else {
                str = bArrB.length > 2048 ? new String(bArrB, StandardCharsets.UTF_8) : a(bArrB, 0, bArrB.length);
            }
            this.f35746c += i2;
            return str;
        }
        return e(i2);
    }

    public void c(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        a(str);
    }

    public static int b(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                i3++;
            } else if (cCharAt < 2048) {
                i3 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i3 += 3;
            } else {
                i2 += 2;
                i3 += 4;
            }
            i2 = i4;
        }
        return i3;
    }

    public void a(long j) {
        a(this.f35746c, j);
        this.f35746c += 8;
    }

    private char[] b(int i2) {
        char[] cArr;
        char[] cArr2 = this.f35744a;
        if (cArr2 == null) {
            if (i2 <= 256) {
                cArr = new char[256];
            } else {
                cArr = new char[2048];
            }
            this.f35744a = cArr;
            return cArr;
        }
        if (cArr2.length >= i2) {
            return cArr2;
        }
        char[] cArr3 = new char[2048];
        this.f35744a = cArr3;
        return cArr3;
    }

    public double a(com.smartdigimkt.i8.a aVar) {
        return Double.longBitsToDouble(d(aVar));
    }

    public byte[] a(int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f35745b, this.f35746c, bArr, 0, i2);
        this.f35746c += i2;
        return bArr;
    }

    public byte[] a(com.smartdigimkt.i8.a aVar, int i2) {
        byte[] bArrA = a(i2);
        return aVar != null ? aVar.b(bArrA) : bArrA;
    }

    public void a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f35745b, this.f35746c, length);
            this.f35746c += length;
        }
    }

    public synchronized String a(byte[] bArr, int i2, int i3) {
        char[] cArrB;
        int i4;
        int i5;
        try {
            cArrB = b(i3);
            int i6 = i3 + i2;
            i4 = 0;
            while (i2 < i6) {
                int i7 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 > 0) {
                    cArrB[i4] = (char) b2;
                    i4++;
                    i2 = i7;
                } else {
                    if (b2 < -32) {
                        i2 += 2;
                        byte b3 = bArr[i7];
                        if (b2 >= -62 && b3 <= -65) {
                            i5 = i4 + 1;
                            cArrB[i4] = (char) ((b3 & 63) | ((b2 & 31) << 6));
                        } else {
                            throw new IllegalArgumentException(f35743e);
                        }
                    } else if (b2 < -16) {
                        int i8 = i2 + 2;
                        byte b4 = bArr[i7];
                        i2 += 3;
                        byte b5 = bArr[i8];
                        if ((b2 != -32 || b4 >= -96) && ((b2 != -19 || b4 < -96) && b4 <= -65 && b5 <= -65)) {
                            i5 = i4 + 1;
                            cArrB[i4] = (char) (((b4 & 63) << 6) | ((b2 & 15) << 12) | (b5 & 63));
                        } else {
                            throw new IllegalArgumentException(f35743e);
                        }
                    } else {
                        byte b6 = bArr[i7];
                        int i9 = i2 + 3;
                        byte b7 = bArr[i2 + 2];
                        i2 += 4;
                        byte b8 = bArr[i9];
                        if (b6 <= -65) {
                            if ((((b6 + 112) + (b2 << 28)) >> 30) == 0 && b7 <= -65 && b8 <= -65) {
                                int i10 = ((b6 & 63) << 12) | ((b2 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                int i11 = i4 + 1;
                                cArrB[i4] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                i4 += 2;
                                cArrB[i11] = (char) ((i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                            }
                        }
                        throw new IllegalArgumentException(f35743e);
                    }
                    i4 = i5;
                }
            }
            if (i2 <= i6) {
            } else {
                throw new IllegalArgumentException(f35743e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return new String(cArrB, 0, i4);
    }

    private void a(String str) {
        byte[] bArr = this.f35745b;
        int i2 = this.f35746c;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                bArr[i2] = (byte) cCharAt;
                i2++;
            } else if (cCharAt < 2048) {
                int i5 = i2 + 1;
                bArr[i2] = (byte) ((cCharAt >>> 6) | PsExtractor.AUDIO_STREAM);
                i2 += 2;
                bArr[i5] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                i3 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i4)) - 56613888;
                bArr[i2] = (byte) ((iCharAt >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i2 + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i6 = i2 + 3;
                bArr[i2 + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i2 += 4;
                bArr[i6] = (byte) ((iCharAt & 63) | 128);
            } else {
                bArr[i2] = (byte) ((cCharAt >>> '\f') | 224);
                int i7 = i2 + 2;
                bArr[i2 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i2 += 3;
                bArr[i7] = (byte) ((cCharAt & '?') | 128);
            }
            i3 = i4;
        }
        this.f35746c = i2;
    }

    public long a(int i2, int i3) {
        long jD = 0;
        if (i3 <= 0) {
            return 0L;
        }
        int i4 = i3 >> 3;
        int i5 = i3 & 7;
        int i6 = 0;
        int i7 = i2;
        for (int i8 = 0; i8 < i4; i8++) {
            jD ^= d(i7);
            i7 += 8;
        }
        int i9 = i5 << 3;
        while (i6 < i9) {
            jD ^= (((long) this.f35745b[i7]) & 255) << i6;
            i6 += 8;
            i7++;
        }
        int i10 = (i2 & 7) << 3;
        return (jD >>> (64 - i10)) | (jD << i10);
    }
}
