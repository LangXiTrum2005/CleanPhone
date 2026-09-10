package com.google.protobuf;

import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c4 f25066b = new c4();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d4 f25067c = new d4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25068a;

    public /* synthetic */ z4(int i10) {
        this.f25068a = i10;
    }

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (!i(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !i(b12) && !i(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | (b13 & Utf8.REPLACEMENT_BYTE);
                cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i10 + 1] = (char) ((i11 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void b(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (b10 < -62 || i(b11)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    public static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (i(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || i(b12)))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
    }

    public static String e(int i10, ByteBuffer byteBuffer, int i11) throws InvalidProtocolBufferException {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (b11 >= 0) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = byteBuffer.get(i17);
                    if (b12 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i10 += 2;
                b(b11, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i18 = i10 + 2;
                i10 += 3;
                c(b11, byteBuffer.get(i15), byteBuffer.get(i18), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b13 = byteBuffer.get(i15);
                int i19 = i10 + 3;
                byte b14 = byteBuffer.get(i10 + 2);
                i10 += 4;
                a(b11, b13, b14, byteBuffer.get(i19), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static void g(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i10 = 0;
        while (i10 < length) {
            try {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i10, (byte) cCharAt);
                i10++;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        if (i10 == length) {
            byteBuffer.position(iPosition + i10);
            return;
        }
        iPosition += i10;
        while (i10 < length) {
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i11 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i11;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i11;
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i13 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    int i14 = iPosition + 2;
                                    try {
                                        byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i10 = i12;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i10 = i12;
                                        iPosition = i14;
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    iPosition = i13;
                                    i10 = i12;
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                        i10 = i12;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i10) + " at index " + (Math.max(i10, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                    }
                    throw new y4(i10, length);
                }
                int i15 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i10++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    public static String h(ByteString byteString) {
        StringBuilder sb2 = new StringBuilder(byteString.size());
        for (int i10 = 0; i10 < byteString.size(); i10++) {
            byte bByteAt = byteString.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb2.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean i(byte b10) {
        return b10 > -65;
    }

    public static int m(int i10, int i11, ByteBuffer byteBuffer, int i12) {
        byte b10;
        int i13;
        byte b11;
        int i14;
        int i15 = i11;
        if (i10 != 0) {
            if (i15 >= i12) {
                return i10;
            }
            byte b12 = (byte) i10;
            if (b12 < -32) {
                if (b12 < -62) {
                    return -1;
                }
                int i16 = i15 + 1;
                if (byteBuffer.get(i15) > -65) {
                    return -1;
                }
                i15 = i16;
            } else if (b12 < -16) {
                byte b13 = (byte) (~(i10 >> 8));
                if (b13 == 0) {
                    i14 = i15 + 1;
                    b11 = byteBuffer.get(i15);
                    if (i14 >= i12) {
                        return a5.f(b12, b11);
                    }
                } else {
                    b11 = b13;
                    i14 = i15;
                }
                if (b11 > -65) {
                    return -1;
                }
                if (b12 == -32 && b11 < -96) {
                    return -1;
                }
                if (b12 == -19 && b11 >= -96) {
                    return -1;
                }
                i15 = i14 + 1;
                if (byteBuffer.get(i14) > -65) {
                    return -1;
                }
            } else {
                byte b14 = (byte) (~(i10 >> 8));
                if (b14 == 0) {
                    i13 = i15 + 1;
                    b14 = byteBuffer.get(i15);
                    if (i13 >= i12) {
                        return a5.f(b12, b14);
                    }
                    b10 = 0;
                } else {
                    b10 = (byte) (i10 >> 16);
                    i13 = i15;
                }
                if (b10 == 0) {
                    int i17 = i13 + 1;
                    byte b15 = byteBuffer.get(i13);
                    if (i17 >= i12) {
                        return a5.g(b12, b14, b15);
                    }
                    b10 = b15;
                    i13 = i17;
                }
                if (b14 > -65) {
                    return -1;
                }
                if ((((b14 + 112) + (b12 << 28)) >> 30) != 0 || b10 > -65) {
                    return -1;
                }
                i15 = i13 + 1;
                if (byteBuffer.get(i13) > -65) {
                    return -1;
                }
            }
        }
        z4 z4Var = a5.f24770a;
        int i18 = i12 - 7;
        int i19 = i15;
        while (i19 < i18 && (byteBuffer.getLong(i19) & (-9187201950435737472L)) == 0) {
            i19 += 8;
        }
        int i20 = (i19 - i15) + i15;
        while (i20 < i12) {
            int i21 = i20 + 1;
            byte b16 = byteBuffer.get(i20);
            if (b16 >= 0) {
                i20 = i21;
            } else if (b16 < -32) {
                if (i21 >= i12) {
                    return b16;
                }
                if (b16 < -62 || byteBuffer.get(i21) > -65) {
                    return -1;
                }
                i20 += 2;
            } else if (b16 < -16) {
                if (i21 >= i12 - 1) {
                    return a5.b(b16, i21, byteBuffer, i12 - i21);
                }
                int i22 = i20 + 2;
                byte b17 = byteBuffer.get(i21);
                if (b17 > -65) {
                    return -1;
                }
                if (b16 == -32 && b17 < -96) {
                    return -1;
                }
                if ((b16 == -19 && b17 >= -96) || byteBuffer.get(i22) > -65) {
                    return -1;
                }
                i20 += 3;
            } else {
                if (i21 >= i12 - 2) {
                    return a5.b(b16, i21, byteBuffer, i12 - i21);
                }
                int i23 = i20 + 2;
                byte b18 = byteBuffer.get(i21);
                if (b18 > -65) {
                    return -1;
                }
                if ((((b18 + 112) + (b16 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i24 = i20 + 3;
                if (byteBuffer.get(i23) > -65) {
                    return -1;
                }
                i20 += 4;
                if (byteBuffer.get(i24) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static int n(long j10, int i10, int i11) {
        if (i11 == 0) {
            z4 z4Var = a5.f24770a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return a5.f(i10, x4.f25021c.f(j10));
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        w4 w4Var = x4.f25021c;
        return a5.g(i10, w4Var.f(j10), w4Var.f(j10 + 1));
    }

    public static int o(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            z4 z4Var = a5.f24770a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return a5.f(i10, x4.i(j10, bArr));
        }
        if (i11 == 2) {
            return a5.g(i10, x4.i(j10, bArr), x4.i(j10 + 1, bArr));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x0038 A[LOOP:2: B:16:0x0032->B:19:0x0038, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0041 A[SYNTHETIC] */
    public final String d(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        int i12;
        int i13;
        byte b10;
        int i14;
        int i15;
        byte b11;
        switch (this.f25068a) {
            case 0:
                Charset charset = Internal.UTF_8;
                String str = new String(bArr, i10, i11, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                return str;
            default:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i16 = i10 + i11;
                char[] cArr = new char[i11];
                int i17 = 0;
                while (i10 < i16) {
                    byte b12 = bArr[i10];
                    if (b12 < 0) {
                        i12 = i17;
                        while (i10 < i16) {
                            i13 = i10 + 1;
                            b10 = bArr[i10];
                            if (b10 >= 0) {
                                i14 = i12 + 1;
                                cArr[i12] = (char) b10;
                                i15 = i13;
                                while (i15 < i16) {
                                    b11 = bArr[i15];
                                    if (b11 >= 0) {
                                        i15++;
                                        cArr[i14] = (char) b11;
                                        i14++;
                                    } else {
                                        i12 = i14;
                                        i10 = i15;
                                    }
                                }
                                i12 = i14;
                                i10 = i15;
                            } else if (b10 < -32) {
                                if (i13 < i16) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                i10 += 2;
                                b(b10, bArr[i13], cArr, i12);
                                i12++;
                            } else if (b10 < -16) {
                                if (i13 < i16 - 1) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                int i18 = i10 + 2;
                                i10 += 3;
                                c(b10, bArr[i13], bArr[i18], cArr, i12);
                                i12++;
                            } else {
                                if (i13 < i16 - 2) {
                                    throw InvalidProtocolBufferException.invalidUtf8();
                                }
                                byte b13 = bArr[i13];
                                int i19 = i10 + 3;
                                byte b14 = bArr[i10 + 2];
                                i10 += 4;
                                a(b10, b13, b14, bArr[i19], cArr, i12);
                                i12 += 2;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i10++;
                    cArr[i17] = (char) b12;
                    i17++;
                }
                i12 = i17;
                while (i10 < i16) {
                    i13 = i10 + 1;
                    b10 = bArr[i10];
                    if (b10 >= 0) {
                        i14 = i12 + 1;
                        cArr[i12] = (char) b10;
                        i15 = i13;
                        while (i15 < i16) {
                            b11 = bArr[i15];
                            if (b11 >= 0) {
                                i15++;
                                cArr[i14] = (char) b11;
                                i14++;
                            } else {
                                i12 = i14;
                                i10 = i15;
                            }
                        }
                        i12 = i14;
                        i10 = i15;
                    } else if (b10 < -32) {
                        if (i13 < i16) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i10 += 2;
                        b(b10, bArr[i13], cArr, i12);
                        i12++;
                    } else if (b10 < -16) {
                        if (i13 < i16 - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        int i110 = i10 + 2;
                        i10 += 3;
                        c(b10, bArr[i13], bArr[i110], cArr, i12);
                        i12++;
                    } else {
                        if (i13 < i16 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte b15 = bArr[i13];
                        int i111 = i10 + 3;
                        byte b16 = bArr[i10 + 2];
                        i10 += 4;
                        a(b10, b15, b16, bArr[i111], cArr, i12);
                        i12 += 2;
                    }
                }
                return new String(cArr, 0, i12);
        }
    }

    public final int f(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        long j11;
        long j12;
        int i12;
        char cCharAt;
        int i13;
        int i14;
        char cCharAt2;
        switch (this.f25068a) {
            case 0:
                long j13 = i10;
                long j14 = ((long) i11) + j13;
                int length = charSequence.length();
                if (length > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
                }
                int i15 = 0;
                while (true) {
                    j10 = 1;
                    if (i15 < length && (cCharAt = charSequence.charAt(i15)) < 128) {
                        x4.n(bArr, j13, (byte) cCharAt);
                        i15++;
                        j13 = 1 + j13;
                    }
                }
                if (i15 != length) {
                    while (i15 < length) {
                        char cCharAt3 = charSequence.charAt(i15);
                        if (cCharAt3 < 128 && j13 < j14) {
                            x4.n(bArr, j13, (byte) cCharAt3);
                            j12 = j14;
                            j11 = j10;
                            j13 += j10;
                        } else if (cCharAt3 >= 2048 || j13 > j14 - 2) {
                            j11 = j10;
                            if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j13 > j14 - 3) {
                                j12 = j14;
                                if (j13 > j12 - 4) {
                                    if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i15 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i12)))) {
                                        throw new y4(i15, length);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + j13);
                                }
                                int i16 = i15 + 1;
                                if (i16 != length) {
                                    char cCharAt4 = charSequence.charAt(i16);
                                    if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                        int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                        x4.n(bArr, j13, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        x4.n(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j15 = j13 + 3;
                                        x4.n(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j13 += 4;
                                        x4.n(bArr, j15, (byte) ((codePoint & 63) | 128));
                                        i15 = i16;
                                    } else {
                                        i15 = i16;
                                    }
                                }
                                throw new y4(i15 - 1, length);
                            }
                            x4.n(bArr, j13, (byte) ((cCharAt3 >>> '\f') | 480));
                            long j16 = j13 + 2;
                            j12 = j14;
                            x4.n(bArr, j13 + j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                            j13 += 3;
                            x4.n(bArr, j16, (byte) ((cCharAt3 & '?') | 128));
                        } else {
                            j11 = j10;
                            long j17 = j13 + j11;
                            x4.n(bArr, j13, (byte) ((cCharAt3 >>> 6) | 960));
                            j13 += 2;
                            x4.n(bArr, j17, (byte) ((cCharAt3 & '?') | 128));
                            j12 = j14;
                        }
                        i15++;
                        j10 = j11;
                        j14 = j12;
                    }
                }
                return (int) j13;
            default:
                int length2 = charSequence.length();
                int i17 = i11 + i10;
                int i18 = 0;
                while (i18 < length2 && (i14 = i18 + i10) < i17 && (cCharAt2 = charSequence.charAt(i18)) < 128) {
                    bArr[i14] = (byte) cCharAt2;
                    i18++;
                }
                if (i18 == length2) {
                    return i10 + length2;
                }
                int i19 = i10 + i18;
                while (i18 < length2) {
                    char cCharAt5 = charSequence.charAt(i18);
                    if (cCharAt5 < 128 && i19 < i17) {
                        bArr[i19] = (byte) cCharAt5;
                        i19++;
                    } else if (cCharAt5 < 2048 && i19 <= i17 - 2) {
                        int i20 = i19 + 1;
                        bArr[i19] = (byte) ((cCharAt5 >>> 6) | 960);
                        i19 += 2;
                        bArr[i20] = (byte) ((cCharAt5 & '?') | 128);
                    } else {
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || i19 > i17 - 3) {
                            if (i19 > i17 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i13 = i18 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt5, charSequence.charAt(i13)))) {
                                    throw new y4(i18, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + i19);
                            }
                            int i21 = i18 + 1;
                            if (i21 != charSequence.length()) {
                                char cCharAt6 = charSequence.charAt(i21);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    bArr[i19] = (byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    bArr[i19 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i22 = i19 + 3;
                                    bArr[i19 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i19 += 4;
                                    bArr[i22] = (byte) ((codePoint2 & 63) | 128);
                                    i18 = i21;
                                } else {
                                    i18 = i21;
                                }
                            }
                            throw new y4(i18 - 1, length2);
                        }
                        bArr[i19] = (byte) ((cCharAt5 >>> '\f') | 480);
                        int i23 = i19 + 2;
                        bArr[i19 + 1] = (byte) (((cCharAt5 >>> 6) & 63) | 128);
                        i19 += 3;
                        bArr[i23] = (byte) ((cCharAt5 & '?') | 128);
                    }
                    i18++;
                }
                return i19;
        }
    }

    public boolean j(byte[] bArr, int i10, int i11) {
        return k(0, i10, i11, bArr) == 0;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0230  */
    /* JADX WARN: Code duplicated, block: B:177:0x0239  */
    /* JADX WARN: Code duplicated, block: B:179:0x023d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0246  */
    /* JADX WARN: Code duplicated, block: B:188:0x025a  */
    /* JADX WARN: Code duplicated, block: B:201:0x0280  */
    /* JADX WARN: Code duplicated, block: B:203:0x028a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0293  */
    /* JADX WARN: Code duplicated, block: B:207:0x029a  */
    /* JADX WARN: Code duplicated, block: B:215:? A[PHI: r1
  PHI (r1v26 int) = (r1v0 int), (r1v38 int), (r1v44 int), (r1v47 int) binds: [B:5:0x001d, B:48:0x009f, B:29:0x005c, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0032 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae A[ADDED_TO_REGION, LOOP:1: B:56:0x00ae->B:236:0x00ae, LOOP_START, PHI: r1
  0x00ae: PHI (r1v28 int) = (r1v27 int), (r1v32 int) binds: [B:54:0x00ab, B:236:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x013a, code lost:
    
        if (com.google.protobuf.x4.i(r5, r26) > (-65)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x013d, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x016e, code lost:
    
        if (com.google.protobuf.x4.i(r5, r26) > (-65)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b5, code lost:
    
        if (com.google.protobuf.x4.i(r5, r26) > (-65)) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(int r23, int r24, int r25, byte[] r26) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z4.k(int, int, int, byte[]):int");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0192  */
    /* JADX WARN: Code duplicated, block: B:113:0x019e  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:127:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0149  */
    /* JADX WARN: Code duplicated, block: B:86:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Code duplicated, block: B:90:0x0155  */
    /* JADX WARN: Code duplicated, block: B:93:0x0160  */
    /* JADX WARN: Code duplicated, block: B:94:0x0162  */
    /* JADX WARN: Code duplicated, block: B:96:0x0166  */
    /* JADX WARN: Code duplicated, block: B:99:0x016e  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (com.google.protobuf.x4.f25021c.f(r3) > (-65)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (com.google.protobuf.x4.f25021c.f(r3) > (-65)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        if (com.google.protobuf.x4.f25021c.f(r3) > (-65)) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int l(int r19, int r20, java.nio.ByteBuffer r21, int r22) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.z4.l(int, int, java.nio.ByteBuffer, int):int");
    }
}
