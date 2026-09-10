package com.google.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z4 f24770a;

    static {
        f24770a = (x4.f25023e && x4.f25022d && !c.a()) ? new z4(0) : new z4(1);
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return f(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return g(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(int i10, int i11, ByteBuffer byteBuffer, int i12) {
        if (i12 == 0) {
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i12 == 1) {
            return f(i10, byteBuffer.get(i11));
        }
        if (i12 == 2) {
            return g(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
        }
        throw new AssertionError();
    }

    public static String c(int i10, ByteBuffer byteBuffer, int i11) throws InvalidProtocolBufferException {
        long j10;
        byte bF;
        byte bF2;
        z4 z4Var = f24770a;
        z4Var.getClass();
        if (byteBuffer.hasArray()) {
            return z4Var.d(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        }
        if (!byteBuffer.isDirect()) {
            return z4.e(i10, byteBuffer, i11);
        }
        switch (z4Var.f25068a) {
            case 0:
                if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long jB = x4.b(byteBuffer) + ((long) i10);
                long j11 = ((long) i11) + jB;
                char[] cArr = new char[i11];
                int i12 = 0;
                while (true) {
                    j10 = 1;
                    if (jB < j11 && (bF2 = x4.f25021c.f(jB)) >= 0) {
                        jB++;
                        cArr[i12] = (char) bF2;
                        i12++;
                    }
                }
                int i13 = i12;
                while (jB < j11) {
                    long j12 = jB + j10;
                    w4 w4Var = x4.f25021c;
                    byte bF3 = w4Var.f(jB);
                    if (bF3 >= 0) {
                        int i14 = i13 + 1;
                        cArr[i13] = (char) bF3;
                        while (j12 < j11 && (bF = x4.f25021c.f(j12)) >= 0) {
                            j12 += j10;
                            cArr[i14] = (char) bF;
                            i14++;
                        }
                        i13 = i14;
                        jB = j12;
                    } else if (bF3 < -32) {
                        if (j12 >= j11) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        jB += 2;
                        z4.b(bF3, w4Var.f(j12), cArr, i13);
                        i13++;
                    } else if (bF3 < -16) {
                        if (j12 >= j11 - j10) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j13 = 2 + jB;
                        jB += 3;
                        z4.c(bF3, w4Var.f(j12), w4Var.f(j13), cArr, i13);
                        i13++;
                    } else {
                        if (j12 >= j11 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte bF4 = w4Var.f(j12);
                        long j14 = jB + 3;
                        byte bF5 = w4Var.f(2 + jB);
                        jB += 4;
                        z4.a(bF3, bF4, bF5, w4Var.f(j14), cArr, i13);
                        i13 += 2;
                    }
                    j10 = 1;
                }
                return new String(cArr, 0, i13);
            default:
                return z4.e(i10, byteBuffer, i11);
        }
    }

    public static void d(String str, ByteBuffer byteBuffer) {
        long j10;
        char c4;
        long j11;
        int i10;
        char c5;
        char cCharAt;
        z4 z4Var = f24770a;
        z4Var.getClass();
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(z4Var.f(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            return;
        }
        if (!byteBuffer.isDirect()) {
            z4.g(str, byteBuffer);
            return;
        }
        switch (z4Var.f25068a) {
            case 0:
                long jB = x4.b(byteBuffer);
                long jPosition = ((long) byteBuffer.position()) + jB;
                long jLimit = ((long) byteBuffer.limit()) + jB;
                int length = str.length();
                if (length > jLimit - jPosition) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
                }
                int i11 = 0;
                while (true) {
                    j10 = 1;
                    c4 = 128;
                    if (i11 < length && (cCharAt = str.charAt(i11)) < 128) {
                        x4.m((byte) cCharAt, jPosition);
                        i11++;
                        jPosition = 1 + jPosition;
                    }
                }
                if (i11 == length) {
                    byteBuffer.position((int) (jPosition - jB));
                    return;
                }
                while (i11 < length) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 >= c4 || jPosition >= jLimit) {
                        j11 = j10;
                        if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                            long j12 = jPosition + j11;
                            x4.m((byte) ((cCharAt2 >>> 6) | 960), jPosition);
                            jPosition += 2;
                            x4.m((byte) ((cCharAt2 & '?') | 128), j12);
                        } else {
                            if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                                jB = jB;
                                jLimit = jLimit;
                                if (jPosition > jLimit - 4) {
                                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i10)))) {
                                        throw new y4(i11, length);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                                }
                                int i12 = i11 + 1;
                                if (i12 != length) {
                                    char cCharAt3 = str.charAt(i12);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        x4.m((byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK), jPosition);
                                        c5 = 128;
                                        x4.m((byte) (((codePoint >>> 12) & 63) | 128), jPosition + j11);
                                        long j13 = jPosition + 3;
                                        x4.m((byte) (((codePoint >>> 6) & 63) | 128), jPosition + 2);
                                        jPosition += 4;
                                        x4.m((byte) ((codePoint & 63) | 128), j13);
                                        i11 = i12;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                throw new y4(i11 - 1, length);
                            }
                            x4.m((byte) ((cCharAt2 >>> '\f') | 480), jPosition);
                            long j14 = jPosition + 2;
                            x4.m((byte) (((cCharAt2 >>> 6) & 63) | 128), jPosition + j11);
                            jPosition += 3;
                            x4.m((byte) ((cCharAt2 & '?') | 128), j14);
                        }
                        c5 = 128;
                    } else {
                        x4.m((byte) cCharAt2, jPosition);
                        jB = jB;
                        jLimit = jLimit;
                        c5 = c4;
                        jPosition += j10;
                        j11 = j10;
                    }
                    i11++;
                    c4 = c5;
                    j10 = j11;
                    jB = jB;
                    jLimit = jLimit;
                }
                byteBuffer.position((int) (jPosition - jB));
                return;
            default:
                z4.g(str, byteBuffer);
                return;
        }
    }

    public static int e(String str) {
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
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new y4(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    public static int f(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int g(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
