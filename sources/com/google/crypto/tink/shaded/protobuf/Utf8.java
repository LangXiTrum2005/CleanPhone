package com.google.crypto.tink.shaded.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Utf8 {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f22155attabal;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static class attabal {
        public static void apical(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || impassible(b2)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 31) << 6) | polloi(b2));
        }

        public static boolean arytenoidectomy(byte b) {
            return b < -32;
        }

        public static void cutely(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (impassible(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || impassible(b3)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i] = (char) (((b & 15) << 12) | (polloi(b2) << 6) | polloi(b3));
        }

        public static char formularize(int i) {
            return (char) ((i >>> 10) + com.applovin.shadow.okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        public static boolean impassible(byte b) {
            return b > -65;
        }

        public static void impromptu(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (impassible(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || impassible(b3) || impassible(b4)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iPolloi = ((b & 7) << 18) | (polloi(b2) << 12) | (polloi(b3) << 6) | polloi(b4);
            cArr[i] = formularize(iPolloi);
            cArr[i + 1] = monoploid(iPolloi);
        }

        public static boolean kowloon(byte b) {
            return b < -16;
        }

        public static char monoploid(int i) {
            return (char) ((i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + com.applovin.shadow.okio.Utf8.LOG_SURROGATE_HEADER);
        }

        public static int polloi(byte b) {
            return b & com.applovin.shadow.okio.Utf8.REPLACEMENT_BYTE;
        }

        public static void taiyuan(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        public static boolean triweekly(byte b) {
            return b >= 0;
        }
    }

    public static final class dern extends saneness {
        public static int impassible(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return triweekly(bArr, i, i2);
        }

        public static int triweekly(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.monoploid(bArr, i3, i2);
                        }
                        int i4 = i + 2;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i + 3;
                            if (bArr[i4] <= -65) {
                                i += 4;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.monoploid(bArr, i3, i2);
                    }
                    int i6 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                        i += 3;
                        if (bArr[i6] > -65) {
                        }
                    }
                    return -1;
                }
                i = i3;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        public int formularize(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return apical(i, byteBuffer, i2, i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        public int marial(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = str.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new UnpairedSurrogateException(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                }
                i6++;
            }
            return i7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        public String saneness(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!attabal.triweekly(b)) {
                    break;
                }
                i++;
                attabal.taiyuan(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (attabal.triweekly(b2)) {
                    int i7 = i5 + 1;
                    attabal.taiyuan(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = bArr[i8];
                        if (!attabal.triweekly(b3)) {
                            break;
                        }
                        i8++;
                        attabal.taiyuan(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (attabal.arytenoidectomy(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    attabal.apical(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (attabal.kowloon(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    attabal.cutely(b2, bArr[i6], bArr[i9], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b4 = bArr[i6];
                    int i10 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    attabal.impromptu(b2, b4, b5, bArr[i10], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int taiyuan(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.attabal(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.attabal(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.saneness(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = impassible(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.dern.taiyuan(int, byte[], int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        public String wireman(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return dern(byteBuffer, i, i2);
        }
    }

    public static abstract class saneness {
        public static int cutely(ByteBuffer byteBuffer, int i, int i2) {
            int iFormularize = i + Utf8.formularize(byteBuffer, i, i2);
            while (iFormularize < i2) {
                int i3 = iFormularize + 1;
                byte b = byteBuffer.get(iFormularize);
                if (b >= 0) {
                    iFormularize = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62 || byteBuffer.get(i3) > -65) {
                        return -1;
                    }
                    iFormularize += 2;
                } else {
                    if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return Utf8.arytenoidectomy(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = iFormularize + 2;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                            int i5 = iFormularize + 3;
                            if (byteBuffer.get(i4) <= -65) {
                                iFormularize += 4;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i3 >= i2 - 1) {
                        return Utf8.arytenoidectomy(byteBuffer, b, i3, i2 - i3);
                    }
                    int i6 = iFormularize + 2;
                    byte b3 = byteBuffer.get(i3);
                    if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                        return -1;
                    }
                    iFormularize += 3;
                }
            }
            return 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int apical(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.attabal(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.attabal(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.saneness(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = cutely(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.saneness.apical(int, java.nio.ByteBuffer, int, int):int");
        }

        public final String attabal(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return saneness(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            }
            return byteBuffer.isDirect() ? wireman(byteBuffer, i, i2) : dern(byteBuffer, i, i2);
        }

        public final boolean beachfront(ByteBuffer byteBuffer, int i, int i2) {
            return impromptu(0, byteBuffer, i, i2) == 0;
        }

        public final boolean competently(byte[] bArr, int i, int i2) {
            return taiyuan(0, bArr, i, i2) == 0;
        }

        public final String dern(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = byteBuffer.get(i);
                if (!attabal.triweekly(b)) {
                    break;
                }
                i++;
                attabal.taiyuan(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = byteBuffer.get(i);
                if (attabal.triweekly(b2)) {
                    int i7 = i5 + 1;
                    attabal.taiyuan(b2, cArr, i5);
                    int i8 = i6;
                    while (i8 < i3) {
                        byte b3 = byteBuffer.get(i8);
                        if (!attabal.triweekly(b3)) {
                            break;
                        }
                        i8++;
                        attabal.taiyuan(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i8;
                } else if (attabal.arytenoidectomy(b2)) {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i += 2;
                    attabal.apical(b2, byteBuffer.get(i6), cArr, i5);
                    i5++;
                } else if (attabal.kowloon(b2)) {
                    if (i6 >= i3 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i9 = i + 2;
                    i += 3;
                    attabal.cutely(b2, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b4 = byteBuffer.get(i6);
                    int i10 = i + 3;
                    byte b5 = byteBuffer.get(i + 2);
                    i += 4;
                    attabal.impromptu(b2, b4, b5, byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        public abstract int formularize(int i, ByteBuffer byteBuffer, int i2, int i3);

        public final int impromptu(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? formularize(i, byteBuffer, i2, i3) : apical(i, byteBuffer, i2, i3);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return taiyuan(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
        }

        public abstract int marial(String str, byte[] bArr, int i, int i2);

        public abstract String saneness(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        public abstract int taiyuan(int i, byte[] bArr, int i2, int i3);

        public abstract String wireman(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;
    }

    public static final class wireman extends saneness {
        public static int arytenoidectomy(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = (int) ((-j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (sayid.dovishness(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (sayid.trm(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        public static boolean impassible() {
            return sayid.supplicat() && sayid.restrictive();
        }

        public static int kowloon(byte[] bArr, long j, int i) {
            int iMonoploid = monoploid(bArr, j, i);
            int i2 = i - iMonoploid;
            long j2 = j + ((long) iMonoploid);
            while (true) {
                byte bGintrap = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bGintrap = sayid.gintrap(bArr, j2);
                    if (bGintrap < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bGintrap < -32) {
                    if (i3 == 0) {
                        return bGintrap;
                    }
                    i2 -= 2;
                    if (bGintrap >= -62) {
                        long j4 = 1 + j2;
                        if (sayid.gintrap(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bGintrap >= -16) {
                    if (i3 < 3) {
                        return molybdenite(bArr, bGintrap, j2, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bGintrap2 = sayid.gintrap(bArr, j2);
                    if (bGintrap2 <= -65 && (((bGintrap << 28) + (bGintrap2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (sayid.gintrap(bArr, j5) <= -65) {
                            j2 += 3;
                            if (sayid.gintrap(bArr, j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return molybdenite(bArr, bGintrap, j2, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bGintrap3 = sayid.gintrap(bArr, j2);
                if (bGintrap3 <= -65 && ((bGintrap != -32 || bGintrap3 >= -96) && (bGintrap != -19 || bGintrap3 < -96))) {
                    j2 += 2;
                    if (sayid.gintrap(bArr, j7) > -65) {
                    }
                }
                return -1;
            }
        }

        public static int molybdenite(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.impassible(i);
            }
            if (i2 == 1) {
                return Utf8.triweekly(i, sayid.gintrap(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.kowloon(i, sayid.gintrap(bArr, j), sayid.gintrap(bArr, j + 1));
            }
            throw new AssertionError();
        }

        public static int monoploid(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            int i3 = 8 - (((int) j) & 7);
            while (i2 < i3) {
                long j2 = 1 + j;
                if (sayid.gintrap(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            while (true) {
                int i4 = i2 + 8;
                if (i4 > i || (sayid.oilcan(bArr, sayid.f22293impromptu + j) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j += 8;
                i2 = i4;
            }
            while (i2 < i) {
                long j3 = j + 1;
                if (sayid.gintrap(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j3;
            }
            return i;
        }

        public static int polloi(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.impassible(i);
            }
            if (i2 == 1) {
                return Utf8.triweekly(i, sayid.dovishness(j));
            }
            if (i2 == 2) {
                return Utf8.kowloon(i, sayid.dovishness(j), sayid.dovishness(j + 1));
            }
            throw new AssertionError();
        }

        public static int triweekly(long j, int i) {
            int iArytenoidectomy = arytenoidectomy(j, i);
            long j2 = j + ((long) iArytenoidectomy);
            int i2 = i - iArytenoidectomy;
            while (true) {
                byte bDovishness = 0;
                while (i2 > 0) {
                    long j3 = j2 + 1;
                    bDovishness = sayid.dovishness(j2);
                    if (bDovishness < 0) {
                        j2 = j3;
                        break;
                    }
                    i2--;
                    j2 = j3;
                }
                if (i2 == 0) {
                    return 0;
                }
                int i3 = i2 - 1;
                if (bDovishness < -32) {
                    if (i3 == 0) {
                        return bDovishness;
                    }
                    i2 -= 2;
                    if (bDovishness >= -62) {
                        long j4 = 1 + j2;
                        if (sayid.dovishness(j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (bDovishness >= -16) {
                    if (i3 < 3) {
                        return polloi(j2, bDovishness, i3);
                    }
                    i2 -= 4;
                    long j5 = 1 + j2;
                    byte bDovishness2 = sayid.dovishness(j2);
                    if (bDovishness2 <= -65 && (((bDovishness << 28) + (bDovishness2 + 112)) >> 30) == 0) {
                        long j6 = 2 + j2;
                        if (sayid.dovishness(j5) <= -65) {
                            j2 += 3;
                            if (sayid.dovishness(j6) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i3 < 2) {
                    return polloi(j2, bDovishness, i3);
                }
                i2 -= 3;
                long j7 = 1 + j2;
                byte bDovishness3 = sayid.dovishness(j2);
                if (bDovishness3 <= -65 && ((bDovishness != -32 || bDovishness3 >= -96) && (bDovishness != -19 || bDovishness3 < -96))) {
                    j2 += 2;
                    if (sayid.dovishness(j7) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r0) > (-65)) goto L57;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int formularize(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.wireman.formularize(int, java.nio.ByteBuffer, int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        public int marial(String str, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            long j3;
            int i3;
            char cCharAt;
            long j4 = i;
            long j5 = ((long) i2) + j4;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                sayid.privatdozent(bArr, j4, (byte) cCharAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128 && j4 < j5) {
                    sayid.privatdozent(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new UnpairedSurrogateException(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                sayid.privatdozent(bArr, j4, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                sayid.privatdozent(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                sayid.privatdozent(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                sayid.privatdozent(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i4 - 1, length);
                    }
                    sayid.privatdozent(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    sayid.privatdozent(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j4 += 3;
                    sayid.privatdozent(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    sayid.privatdozent(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    j4 += 2;
                    sayid.privatdozent(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                    j3 = j5;
                }
                i4++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        public String saneness(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            Charset charset = rotuma.f22277saneness;
            String str = new String(bArr, i, i2, charset);
            if (str.indexOf(com.applovin.shadow.okio.Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.sayid.gintrap(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.sayid.gintrap(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int taiyuan(int r11, byte[] r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L2a
                r11 = -62
                if (r2 < r11) goto L29
                long r6 = r6 + r0
                byte r11 = com.google.crypto.tink.shaded.protobuf.sayid.gintrap(r12, r0)
                if (r11 <= r5) goto L26
                goto L29
            L26:
                r0 = r6
                goto La1
            L29:
                return r4
            L2a:
                r8 = -16
                if (r2 >= r8) goto L5e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L44
                long r8 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.sayid.gintrap(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = com.google.crypto.tink.shaded.protobuf.Utf8.attabal(r2, r11)
                return r11
            L43:
                r0 = r8
            L44:
                if (r11 > r5) goto L5d
                r8 = -96
                if (r2 != r3) goto L4c
                if (r11 < r8) goto L5d
            L4c:
                r3 = -19
                if (r2 != r3) goto L52
                if (r11 >= r8) goto L5d
            L52:
                long r2 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.sayid.gintrap(r12, r0)
                if (r11 <= r5) goto L5b
                goto L5d
            L5b:
                r0 = r2
                goto La1
            L5d:
                return r4
            L5e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r0 + r6
                byte r3 = com.google.crypto.tink.shaded.protobuf.sayid.gintrap(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = com.google.crypto.tink.shaded.protobuf.Utf8.attabal(r2, r3)
                return r11
            L73:
                r11 = 0
                r0 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L79:
                if (r11 != 0) goto L8b
                long r8 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.sayid.gintrap(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = com.google.crypto.tink.shaded.protobuf.Utf8.saneness(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.sayid.gintrap(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = kowloon(r12, r0, r11)
                return r11
            La8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.wireman.taiyuan(int, byte[], int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.saneness
        public String wireman(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long jApical = sayid.apical(byteBuffer) + ((long) i);
            long j = ((long) i2) + jApical;
            char[] cArr = new char[i2];
            int i3 = 0;
            while (jApical < j) {
                byte bDovishness = sayid.dovishness(jApical);
                if (!attabal.triweekly(bDovishness)) {
                    break;
                }
                jApical++;
                attabal.taiyuan(bDovishness, cArr, i3);
                i3++;
            }
            int i4 = i3;
            while (jApical < j) {
                long j2 = jApical + 1;
                byte bDovishness2 = sayid.dovishness(jApical);
                if (attabal.triweekly(bDovishness2)) {
                    int i5 = i4 + 1;
                    attabal.taiyuan(bDovishness2, cArr, i4);
                    long j3 = j2;
                    while (j3 < j) {
                        byte bDovishness3 = sayid.dovishness(j3);
                        if (!attabal.triweekly(bDovishness3)) {
                            break;
                        }
                        j3++;
                        attabal.taiyuan(bDovishness3, cArr, i5);
                        i5++;
                    }
                    i4 = i5;
                    jApical = j3;
                } else if (attabal.arytenoidectomy(bDovishness2)) {
                    if (j2 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jApical += 2;
                    attabal.apical(bDovishness2, sayid.dovishness(j2), cArr, i4);
                    i4++;
                } else if (attabal.kowloon(bDovishness2)) {
                    if (j2 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j4 = 2 + jApical;
                    jApical += 3;
                    attabal.cutely(bDovishness2, sayid.dovishness(j2), sayid.dovishness(j4), cArr, i4);
                    i4++;
                } else {
                    if (j2 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte bDovishness4 = sayid.dovishness(j2);
                    long j5 = jApical + 3;
                    byte bDovishness5 = sayid.dovishness(2 + jApical);
                    jApical += 4;
                    attabal.impromptu(bDovishness2, bDovishness4, bDovishness5, sayid.dovishness(j5), cArr, i4);
                    i4 += 2;
                }
            }
            return new String(cArr, 0, i4);
        }
    }

    static {
        f22155attabal = (!wireman.impassible() || com.google.crypto.tink.shaded.protobuf.wireman.dern()) ? new dern() : new wireman();
    }

    public static int adultoid(int i, byte[] bArr, int i2, int i3) {
        return f22155attabal.taiyuan(i, bArr, i2, i3);
    }

    public static int apical(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 2048) {
                i2 += (127 - cCharAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new UnpairedSurrogateException(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    public static int arytenoidectomy(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return impassible(i);
        }
        if (i3 == 1) {
            return triweekly(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return kowloon(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    public static String competently(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return f22155attabal.attabal(byteBuffer, i, i2);
    }

    public static int cutely(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int iApical = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                iApical += apical(str, i);
                break;
            }
            iApical += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iApical >= length) {
            return iApical;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iApical) + 4294967296L));
    }

    public static int formularize(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    public static int graveside(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f22155attabal.impromptu(i, byteBuffer, i2, i3);
    }

    public static int impassible(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static String impromptu(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return f22155attabal.saneness(bArr, i, i2);
    }

    public static int kowloon(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean molybdenite(byte[] bArr, int i, int i2) {
        return f22155attabal.competently(bArr, i, i2);
    }

    public static int monoploid(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return impassible(b);
        }
        if (i3 == 1) {
            return triweekly(b, bArr[i]);
        }
        if (i3 == 2) {
            return kowloon(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean polloi(ByteBuffer byteBuffer) {
        return f22155attabal.beachfront(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static int taiyuan(String str, byte[] bArr, int i, int i2) {
        return f22155attabal.marial(str, bArr, i, i2);
    }

    public static int triweekly(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
