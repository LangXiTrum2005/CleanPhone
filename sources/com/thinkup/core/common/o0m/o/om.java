package com.thinkup.core.common.o0m.o;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
final class om {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42156n = 2048;
    private static final String o0 = "Invalid String";
    public int m;
    public byte[] o;
    private char[] oo;

    public om(int i2) {
        this(new byte[i2], 0);
    }

    private char[] m0(int i2) {
        char[] cArr = this.oo;
        if (cArr == null) {
            char[] cArr2 = i2 <= 256 ? new char[256] : new char[2048];
            this.oo = cArr2;
            return cArr2;
        }
        if (cArr.length >= i2) {
            return cArr;
        }
        char[] cArr3 = new char[2048];
        this.oo = cArr3;
        return cArr3;
    }

    private static int om(int i2) {
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

    private byte[] on(int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(this.o, this.m, bArr, 0, i2);
        this.m += i2;
        return bArr;
    }

    private int oo() {
        byte[] bArr = this.o;
        int i2 = this.m;
        int i3 = i2 + 1;
        this.m = i3;
        byte b2 = bArr[i2];
        if ((b2 >> 7) == 0) {
            return b2;
        }
        int i4 = b2 & AbstractJsonLexerKt.TC_INVALID;
        int i5 = i2 + 2;
        this.m = i5;
        int i6 = (bArr[i3] << 7) | i4;
        if ((i6 >> 14) == 0) {
            return i6;
        }
        int i7 = i2 + 3;
        this.m = i7;
        int i8 = (i6 & 16383) | (bArr[i5] << 14);
        if ((i8 >> 21) == 0) {
            return i8;
        }
        int i9 = i2 + 4;
        this.m = i9;
        int i10 = (i8 & 2097151) | (bArr[i7] << 21);
        if ((i10 >> 28) == 0) {
            return i10;
        }
        this.m = i2 + 5;
        return (bArr[i9] << 28) | (i10 & 268435455);
    }

    public final short m() {
        byte[] bArr = this.o;
        int i2 = this.m;
        int i3 = i2 + 1;
        this.m = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.m = i2 + 2;
        return (short) ((bArr[i3] << 8) | i4);
    }

    public final int n() {
        byte[] bArr = this.o;
        int i2 = this.m;
        int i3 = i2 + 1;
        this.m = i3;
        int i4 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i5 = i2 + 2;
        this.m = i5;
        int i6 = ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i4;
        int i7 = i2 + 3;
        this.m = i7;
        int i8 = i6 | ((bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.m = i2 + 4;
        return (bArr[i7] << 24) | i8;
    }

    public final byte o() {
        byte[] bArr = this.o;
        int i2 = this.m;
        this.m = i2 + 1;
        return bArr[i2];
    }

    public final long o0() {
        long jN = n(this.m);
        this.m += 8;
        return jN;
    }

    public om(byte[] bArr) {
        this(bArr, 0);
    }

    private int n(int i2, int i3) {
        while ((i3 & (-128)) != 0) {
            this.o[i2] = (byte) ((i3 & 127) | 128);
            i3 >>>= 7;
            i2++;
        }
        int i4 = i2 + 1;
        this.o[i2] = (byte) i3;
        return i4;
    }

    public final void m(int i2) {
        byte[] bArr = this.o;
        int i3 = this.m;
        int i4 = i3 + 1;
        this.m = i4;
        bArr[i3] = (byte) i2;
        int i5 = i3 + 2;
        this.m = i5;
        bArr[i4] = (byte) (i2 >> 8);
        int i6 = i3 + 3;
        this.m = i6;
        bArr[i5] = (byte) (i2 >> 16);
        this.m = i3 + 4;
        bArr[i6] = (byte) (i2 >> 24);
    }

    public final void o(byte b2) {
        byte[] bArr = this.o;
        int i2 = this.m;
        this.m = i2 + 1;
        bArr[i2] = b2;
    }

    public om(byte[] bArr, int i2) {
        this.oo = null;
        this.o = bArr;
        this.m = i2;
    }

    private double o0(com.thinkup.core.common.o0m.o.o.o oVar) {
        return Double.longBitsToDouble(m(oVar));
    }

    public final void o(short s) {
        byte[] bArr = this.o;
        int i2 = this.m;
        int i3 = i2 + 1;
        this.m = i3;
        bArr[i2] = (byte) s;
        this.m = i2 + 2;
        bArr[i3] = (byte) (s >> 8);
    }

    public final long n(int i2) {
        byte[] bArr = this.o;
        int i3 = i2 + 6;
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i3]) & 255) << 48) | (((long) bArr[i2 + 7]) << 56);
    }

    public final String o0(int i2) {
        if (i2 < 0) {
            return null;
        }
        if (i2 == 0) {
            return "";
        }
        String str = i2 > 2048 ? new String(this.o, this.m, i2, StandardCharsets.UTF_8) : o(this.o, this.m, i2);
        this.m += i2;
        return str;
    }

    private float n(com.thinkup.core.common.o0m.o.o.o oVar) {
        return Float.intBitsToFloat(o(oVar));
    }

    public final int o(int i2) {
        byte[] bArr = this.o;
        int i3 = ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        return (bArr[i2 + 3] << 24) | i3 | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    private void n(String str) {
        byte[] bArr = this.o;
        int i2 = this.m;
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
        this.m = i2;
    }

    private void oo(int i2) {
        int i3 = this.m;
        while ((i2 & (-128)) != 0) {
            this.o[i3] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i3++;
        }
        this.o[i3] = (byte) i2;
        this.m = i3 + 1;
    }

    public final long m(com.thinkup.core.common.o0m.o.o.o oVar) {
        return oVar != null ? oVar.om() : o0();
    }

    public final int o(com.thinkup.core.common.o0m.o.o.o oVar) {
        return oVar != null ? oVar.o0() : n();
    }

    public static int m(String str) {
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

    public final void o(int i2, int i3) {
        byte[] bArr = this.o;
        bArr[i2] = (byte) i3;
        bArr[i2 + 1] = (byte) (i3 >> 8);
        bArr[i2 + 2] = (byte) (i3 >> 16);
        bArr[i2 + 3] = (byte) (i3 >> 24);
    }

    public final long m(int i2, int i3) {
        long jN = 0;
        if (i3 <= 0) {
            return 0L;
        }
        int i4 = i3 >> 3;
        int i5 = i3 & 7;
        int i6 = 0;
        int i7 = i2;
        for (int i8 = 0; i8 < i4; i8++) {
            jN ^= n(i7);
            i7 += 8;
        }
        int i9 = i5 << 3;
        while (i6 < i9) {
            jN ^= (((long) this.o[i7]) & 255) << i6;
            i6 += 8;
            i7++;
        }
        int i10 = (i2 & 7) << 3;
        return (jN >>> (64 - i10)) | (jN << i10);
    }

    private byte[] m(com.thinkup.core.common.o0m.o.o.o oVar, int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(this.o, this.m, bArr, 0, i2);
        this.m += i2;
        return oVar != null ? oVar.m() : bArr;
    }

    public final void o(int i2, long j) {
        byte[] bArr = this.o;
        bArr[i2] = (byte) j;
        bArr[i2 + 1] = (byte) (j >> 8);
        bArr[i2 + 2] = (byte) (j >> 16);
        bArr[i2 + 3] = (byte) (j >> 24);
        bArr[i2 + 4] = (byte) (j >> 32);
        bArr[i2 + 5] = (byte) (j >> 40);
        bArr[i2 + 6] = (byte) (j >> 48);
        bArr[i2 + 7] = (byte) (j >> 56);
    }

    public final void o(long j) {
        o(this.m, j);
        this.m += 8;
    }

    public final void o(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.o, this.m, length);
            this.m += length;
        }
    }

    public final String o(com.thinkup.core.common.o0m.o.o.o oVar, int i2) {
        String str;
        if (oVar != null && i2 > 0) {
            byte[] bArr = this.o;
            int i3 = this.m;
            Arrays.copyOfRange(bArr, i3, i3 + i2);
            byte[] bArrM = oVar.m();
            if (bArrM == null) {
                str = null;
            } else {
                str = bArrM.length > 2048 ? new String(bArrM, StandardCharsets.UTF_8) : o(bArrM, 0, bArrM.length);
            }
            this.m += i2;
            return str;
        }
        return o0(i2);
    }

    public final void o(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        byte[] bArr = this.o;
        int i2 = this.m;
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
        this.m = i2;
    }

    public final synchronized String o(byte[] bArr, int i2, int i3) {
        char[] cArr;
        int i4;
        int i5;
        try {
            cArr = this.oo;
            if (cArr == null) {
                if (i3 <= 256) {
                    cArr = new char[256];
                } else {
                    cArr = new char[2048];
                }
                this.oo = cArr;
            } else if (cArr.length < i3) {
                cArr = new char[2048];
                this.oo = cArr;
            }
            int i6 = i3 + i2;
            i4 = 0;
            while (i2 < i6) {
                int i7 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 > 0) {
                    cArr[i4] = (char) b2;
                    i4++;
                    i2 = i7;
                } else {
                    if (b2 < -32) {
                        i2 += 2;
                        byte b3 = bArr[i7];
                        if (b2 >= -62 && b3 <= -65) {
                            i5 = i4 + 1;
                            cArr[i4] = (char) ((b3 & 63) | ((b2 & 31) << 6));
                        } else {
                            throw new IllegalArgumentException(o0);
                        }
                    } else if (b2 < -16) {
                        int i8 = i2 + 2;
                        byte b4 = bArr[i7];
                        i2 += 3;
                        byte b5 = bArr[i8];
                        if ((b2 != -32 || b4 >= -96) && ((b2 != -19 || b4 < -96) && b4 <= -65 && b5 <= -65)) {
                            i5 = i4 + 1;
                            cArr[i4] = (char) (((b4 & 63) << 6) | ((b2 & 15) << 12) | (b5 & 63));
                        } else {
                            throw new IllegalArgumentException(o0);
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
                                cArr[i4] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                i4 += 2;
                                cArr[i11] = (char) ((i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                            }
                        }
                        throw new IllegalArgumentException(o0);
                    }
                    i4 = i5;
                }
            }
            if (i2 <= i6) {
            } else {
                throw new IllegalArgumentException(o0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return new String(cArr, 0, i4);
    }
}
