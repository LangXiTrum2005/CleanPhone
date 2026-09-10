package com.google.protobuf;

import android.support.v4.media.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b3)) {
                if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !isNotTrailingByte(b4) && !isNotTrailingByte(b5)) {
                    int iTrailingByteValue = ((b2 & 7) << 18) | (trailingByteValue(b3) << 12) | (trailingByteValue(b4) << 6) | trailingByteValue(b5);
                    cArr[i2] = highSurrogate(iTrailingByteValue);
                    cArr[i2 + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b2, byte b3, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || isNotTrailingByte(b4)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i2] = (char) (((b2 & 15) << 12) | (trailingByteValue(b3) << 6) | trailingByteValue(b4));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (b2 < -62 || isNotTrailingByte(b3)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i2] = (char) (((b2 & 31) << 6) | trailingByteValue(b3));
        }

        private static char highSurrogate(int i2) {
            return (char) ((i2 >>> 10) + com.applovin.shadow.okio.Utf8.HIGH_SURROGATE_HEADER);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b2) {
            return b2 < -32;
        }

        private static char lowSurrogate(int i2) {
            return (char) ((i2 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + com.applovin.shadow.okio.Utf8.LOG_SURROGATE_HEADER);
        }

        private static int trailingByteValue(byte b2) {
            return b2 & 63;
        }
    }

    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i2, i3) : decodeUtf8Default(byteBuffer, i2, i3);
        }

        public abstract String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = byteBuffer.get(i2);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.handleOneByte(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b3 = byteBuffer.get(i2);
                if (DecodeUtil.isOneByte(b3)) {
                    int i8 = i6 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i6);
                    int i9 = i7;
                    while (i9 < i4) {
                        byte b4 = byteBuffer.get(i9);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i9++;
                        DecodeUtil.handleOneByte(b4, cArr, i8);
                        i8++;
                    }
                    i6 = i8;
                    i2 = i9;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i2 += 2;
                    DecodeUtil.handleTwoBytes(b3, byteBuffer.get(i7), cArr, i6);
                    i6++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i10 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.handleThreeBytes(b3, byteBuffer.get(i7), byteBuffer.get(i10), cArr, i6);
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = byteBuffer.get(i7);
                    int i11 = i2 + 3;
                    byte b6 = byteBuffer.get(i2 + 2);
                    i2 += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, byteBuffer.get(i11), cArr, i6);
                    i6 += 2;
                }
            }
            return new String(cArr, 0, i6);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i2 = 0;
            while (i2 < length) {
                try {
                    char cCharAt = charSequence.charAt(i2);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i2, (byte) cCharAt);
                    i2++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i2 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i2);
                return;
            }
            iPosition += i2;
            while (i2 < length) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i3 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                        byteBuffer.put(i3, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i3;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i3;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i4 = i2 + 1;
                        if (i4 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i4);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i5 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        int i6 = iPosition + 2;
                                        try {
                                            byteBuffer.put(i5, (byte) (((codePoint >>> 12) & 63) | 128));
                                            iPosition += 3;
                                            byteBuffer.put(i6, (byte) (((codePoint >>> 6) & 63) | 128));
                                            byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                            i2 = i4;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i2 = i4;
                                            iPosition = i6;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i5;
                                        i2 = i4;
                                    }
                                } else {
                                    i2 = i4;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i2 = i4;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (Math.max(i2, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                        }
                        throw new UnpairedSurrogateException(i2, length);
                    }
                    int i7 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i7, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i2++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i2, int i3) {
            return partialIsValidUtf8(0, bArr, i2, i3) == 0;
        }

        public final int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i2, byteBuffer, i3, i4) : partialIsValidUtf8Default(i2, byteBuffer, i3, i4);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i2, byteBuffer.array(), i3 + iArrayOffset, iArrayOffset + i4);
        }

        public abstract int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4);

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
        public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
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
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
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
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
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
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8(0, byteBuffer, i2, i3) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            int iEstimateConsecutiveAscii = i2 + Utf8.estimateConsecutiveAscii(byteBuffer, i2, i3);
            while (iEstimateConsecutiveAscii < i3) {
                int i4 = iEstimateConsecutiveAscii + 1;
                byte b2 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b2 >= 0) {
                    iEstimateConsecutiveAscii = i4;
                } else if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 < -62 || byteBuffer.get(i4) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b2 >= -16) {
                        if (i4 >= i3 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b2, i4, i3 - i4);
                        }
                        int i5 = iEstimateConsecutiveAscii + 2;
                        byte b3 = byteBuffer.get(i4);
                        if (b3 <= -65) {
                            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0) {
                                int i6 = iEstimateConsecutiveAscii + 3;
                                if (byteBuffer.get(i5) <= -65) {
                                    iEstimateConsecutiveAscii += 4;
                                    if (byteBuffer.get(i6) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i4 >= i3 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b2, i4, i3 - i4);
                    }
                    int i7 = iEstimateConsecutiveAscii + 2;
                    byte b4 = byteBuffer.get(i4);
                    if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i7) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i2, int i3) {
            super(a.g(i2, i3, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i2, i3);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        return processor.encodeUtf8(charSequence, bArr, i2, i3);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int iEncodedLengthGeneral = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i2);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i2) < 65536) {
                        throw new UnpairedSurrogateException(i2, length);
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i2, int i3) {
        int i4 = i3 - 7;
        int i5 = i2;
        while (i5 < i4 && (byteBuffer.getLong(i5) & ASCII_MASK_LONG) == 0) {
            i5 += 8;
        }
        return i5 - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4) {
        return processor.partialIsValidUtf8(i2, bArr, i3, i4);
    }

    public static String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i2, int i3) {
        return processor.isValidUtf8(bArr, i2, i3);
    }

    public static int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i4) {
        return processor.partialIsValidUtf8(i2, byteBuffer, i3, i4);
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            int i4 = 8 - (((int) j) & 7);
            while (i3 < i4) {
                long j2 = 1 + j;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i3;
                }
                i3++;
                j = j2;
            }
            while (true) {
                int i5 = i3 + 8;
                if (i5 > i2 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j += 8;
                i3 = i5;
            }
            while (i3 < i2) {
                long j3 = j + 1;
                if (UnsafeUtil.getByte(bArr, j) < 0) {
                    return i3;
                }
                i3++;
                j = j3;
            }
            return i2;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i2, long j, int i3) {
            if (i3 == 0) {
                return Utf8.incompleteStateFor(i2);
            }
            if (i3 == 1) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(bArr, j));
            }
            if (i3 == 2) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(bArr, j), UnsafeUtil.getByte(bArr, j + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i2, i3, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i2);
            long j = ((long) i3) + jAddressOffset;
            char[] cArr = new char[i3];
            int i4 = 0;
            while (jAddressOffset < j) {
                byte b2 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b2, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (jAddressOffset < j) {
                long j2 = jAddressOffset + 1;
                byte b3 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b3)) {
                    int i6 = i5 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i5);
                    long j3 = j2;
                    while (j3 < j) {
                        byte b4 = UnsafeUtil.getByte(j3);
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        j3++;
                        DecodeUtil.handleOneByte(b4, cArr, i6);
                        i6++;
                    }
                    i5 = i6;
                    jAddressOffset = j3;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (j2 >= j) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b3, UnsafeUtil.getByte(j2), cArr, i5);
                    i5++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (j2 >= j - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j4 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b3, UnsafeUtil.getByte(j2), UnsafeUtil.getByte(j4), cArr, i5);
                    i5++;
                } else {
                    if (j2 >= j - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = UnsafeUtil.getByte(j2);
                    long j5 = jAddressOffset + 3;
                    byte b6 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, UnsafeUtil.getByte(j5), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            long j;
            long j2;
            long j3;
            int i4;
            char cCharAt;
            long j4 = i2;
            long j5 = ((long) i3) + j4;
            int length = charSequence.length();
            if (length > i3 || bArr.length - i3 < i2) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i2 + i3));
            }
            int i5 = 0;
            while (true) {
                j = 1;
                if (i5 >= length || (cCharAt = charSequence.charAt(i5)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j4, (byte) cCharAt);
                i5++;
                j4 = 1 + j4;
            }
            if (i5 == length) {
                return (int) j4;
            }
            while (i5 < length) {
                char cCharAt2 = charSequence.charAt(i5);
                if (cCharAt2 < 128 && j4 < j5) {
                    UnsafeUtil.putByte(bArr, j4, (byte) cCharAt2);
                    j3 = j5;
                    j2 = j;
                    j4 += j;
                } else if (cCharAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j4 > j5 - 3) {
                        j3 = j5;
                        if (j4 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new UnpairedSurrogateException(i5, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j4);
                        }
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char cCharAt3 = charSequence.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j4, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                UnsafeUtil.putByte(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j6 = j4 + 3;
                                UnsafeUtil.putByte(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                UnsafeUtil.putByte(bArr, j6, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new UnpairedSurrogateException(i5 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j7 = j4 + 2;
                    j3 = j5;
                    UnsafeUtil.putByte(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j4 += 3;
                    UnsafeUtil.putByte(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j8 = j4 + j2;
                    UnsafeUtil.putByte(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                    j4 += 2;
                    UnsafeUtil.putByte(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                    j3 = j5;
                }
                i5++;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j;
            char c2;
            long j2;
            int i2;
            char c3;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i3 = 0;
            while (true) {
                j = 1;
                c2 = 128;
                if (i3 >= length || (cCharAt = charSequence.charAt(i3)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i3++;
                jPosition = 1 + jPosition;
            }
            if (i3 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i3 < length) {
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 >= c2 || jPosition >= jLimit) {
                    j2 = j;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j3 = jPosition + j2;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j3, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            jAddressOffset = jAddressOffset;
                            jLimit = jLimit;
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i2 = i3 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i2)))) {
                                    throw new UnpairedSurrogateException(i3, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i4 = i3 + 1;
                            if (i4 != length) {
                                char cCharAt3 = charSequence.charAt(i4);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    c3 = 128;
                                    UnsafeUtil.putByte(jPosition + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j4 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j4, (byte) ((codePoint & 63) | 128));
                                    i3 = i4;
                                } else {
                                    i3 = i4;
                                }
                            }
                            throw new UnpairedSurrogateException(i3 - 1, length);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j5 = jPosition + 2;
                        UnsafeUtil.putByte(jPosition + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        UnsafeUtil.putByte(j5, (byte) ((cCharAt2 & '?') | 128));
                    }
                    c3 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    jAddressOffset = jAddressOffset;
                    jLimit = jLimit;
                    c3 = c2;
                    jPosition += j;
                    j2 = j;
                }
                i3++;
                c2 = c3;
                j = j2;
                jAddressOffset = jAddressOffset;
                jLimit = jLimit;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
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
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
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
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = com.google.protobuf.Utf8.access$000(r2, r11)
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
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
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
                byte r3 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = com.google.protobuf.Utf8.access$000(r2, r3)
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
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = com.google.protobuf.Utf8.access$100(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r3 = r3 + r2
                int r2 = r3 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = com.google.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = partialIsValidUtf8(r12, r0, r11)
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int partialIsValidUtf8Direct(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j, int i2) {
            if (i2 < 16) {
                return 0;
            }
            int i3 = (int) ((-j) & 7);
            int i4 = i3;
            while (i4 > 0) {
                long j2 = 1 + j;
                if (UnsafeUtil.getByte(j) < 0) {
                    return i3 - i4;
                }
                i4--;
                j = j2;
            }
            int i5 = i2 - i3;
            while (i5 >= 8 && (UnsafeUtil.getLong(j) & Utf8.ASCII_MASK_LONG) == 0) {
                j += 8;
                i5 -= 8;
            }
            return i2 - i5;
        }

        private static int unsafeIncompleteStateFor(long j, int i2, int i3) {
            if (i3 == 0) {
                return Utf8.incompleteStateFor(i2);
            }
            if (i3 == 1) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(j));
            }
            if (i3 == 2) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(j), UnsafeUtil.getByte(j + 1));
            }
            throw new AssertionError();
        }

        private static int partialIsValidUtf8(byte[] bArr, long j, int i2) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j, i2);
            int i3 = i2 - iUnsafeEstimateConsecutiveAscii;
            long j2 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b2 = 0;
                while (i3 > 0) {
                    long j3 = j2 + 1;
                    b2 = UnsafeUtil.getByte(bArr, j2);
                    if (b2 < 0) {
                        j2 = j3;
                        break;
                    }
                    i3--;
                    j2 = j3;
                }
                if (i3 == 0) {
                    return 0;
                }
                int i4 = i3 - 1;
                if (b2 < -32) {
                    if (i4 == 0) {
                        return b2;
                    }
                    i3 -= 2;
                    if (b2 >= -62) {
                        long j4 = 1 + j2;
                        if (UnsafeUtil.getByte(bArr, j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i4 < 2) {
                        return unsafeIncompleteStateFor(bArr, b2, j2, i4);
                    }
                    i3 -= 3;
                    long j5 = 1 + j2;
                    byte b3 = UnsafeUtil.getByte(bArr, j2);
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        j2 += 2;
                        if (UnsafeUtil.getByte(bArr, j5) > -65) {
                        }
                    }
                    return -1;
                }
                if (i4 < 3) {
                    return unsafeIncompleteStateFor(bArr, b2, j2, i4);
                }
                i3 -= 4;
                long j6 = 1 + j2;
                byte b4 = UnsafeUtil.getByte(bArr, j2);
                if (b4 <= -65) {
                    if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                        long j7 = 2 + j2;
                        if (UnsafeUtil.getByte(bArr, j6) <= -65) {
                            j2 += 3;
                            if (UnsafeUtil.getByte(bArr, j7) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }

        private static int partialIsValidUtf8(long j, int i2) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j, i2);
            long j2 = j + ((long) iUnsafeEstimateConsecutiveAscii);
            int i3 = i2 - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b2 = 0;
                while (i3 > 0) {
                    long j3 = j2 + 1;
                    b2 = UnsafeUtil.getByte(j2);
                    if (b2 < 0) {
                        j2 = j3;
                        break;
                    }
                    i3--;
                    j2 = j3;
                }
                if (i3 == 0) {
                    return 0;
                }
                int i4 = i3 - 1;
                if (b2 < -32) {
                    if (i4 == 0) {
                        return b2;
                    }
                    i3 -= 2;
                    if (b2 >= -62) {
                        long j4 = 1 + j2;
                        if (UnsafeUtil.getByte(j2) <= -65) {
                            j2 = j4;
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i4 < 2) {
                        return unsafeIncompleteStateFor(j2, b2, i4);
                    }
                    i3 -= 3;
                    long j5 = 1 + j2;
                    byte b3 = UnsafeUtil.getByte(j2);
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        j2 += 2;
                        if (UnsafeUtil.getByte(j5) > -65) {
                        }
                    }
                    return -1;
                }
                if (i4 < 3) {
                    return unsafeIncompleteStateFor(j2, b2, i4);
                }
                i3 -= 4;
                long j6 = 1 + j2;
                byte b4 = UnsafeUtil.getByte(j2);
                if (b4 <= -65) {
                    if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                        long j7 = 2 + j2;
                        if (UnsafeUtil.getByte(j6) <= -65) {
                            j2 += 3;
                            if (UnsafeUtil.getByte(j7) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            return incompleteStateFor(b2);
        }
        if (i4 == 1) {
            return incompleteStateFor(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return incompleteStateFor(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        if (i4 == 0) {
            return incompleteStateFor(i2);
        }
        if (i4 == 1) {
            return incompleteStateFor(i2, byteBuffer.get(i3));
        }
        if (i4 == 2) {
            return incompleteStateFor(i2, byteBuffer.get(i3), byteBuffer.get(i3 + 1));
        }
        throw new AssertionError();
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i2, int i3) {
            while (i2 < i3) {
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i4 >= i3) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i2 += 2;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 < -16) {
                        if (i4 >= i3 - 1) {
                            return Utf8.incompleteStateFor(bArr, i4, i3);
                        }
                        int i5 = i2 + 2;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                            i2 += 3;
                            if (bArr[i5] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i4 >= i3 - 2) {
                        return Utf8.incompleteStateFor(bArr, i4, i3);
                    }
                    int i6 = i2 + 2;
                    byte b4 = bArr[i4];
                    if (b4 <= -65) {
                        if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                            int i7 = i2 + 3;
                            if (bArr[i6] <= -65) {
                                i2 += 4;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i2 = i4;
            }
            return 0;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i4 = i2 + i3;
            char[] cArr = new char[i3];
            int i5 = 0;
            while (i2 < i4) {
                byte b2 = bArr[i2];
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.handleOneByte(b2, cArr, i5);
                i5++;
            }
            int i6 = i5;
            while (i2 < i4) {
                int i7 = i2 + 1;
                byte b3 = bArr[i2];
                if (DecodeUtil.isOneByte(b3)) {
                    int i8 = i6 + 1;
                    DecodeUtil.handleOneByte(b3, cArr, i6);
                    int i9 = i7;
                    while (i9 < i4) {
                        byte b4 = bArr[i9];
                        if (!DecodeUtil.isOneByte(b4)) {
                            break;
                        }
                        i9++;
                        DecodeUtil.handleOneByte(b4, cArr, i8);
                        i8++;
                    }
                    i6 = i8;
                    i2 = i9;
                } else if (DecodeUtil.isTwoBytes(b3)) {
                    if (i7 >= i4) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i2 += 2;
                    DecodeUtil.handleTwoBytes(b3, bArr[i7], cArr, i6);
                    i6++;
                } else if (DecodeUtil.isThreeBytes(b3)) {
                    if (i7 >= i4 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i10 = i2 + 2;
                    i2 += 3;
                    DecodeUtil.handleThreeBytes(b3, bArr[i7], bArr[i10], cArr, i6);
                    i6++;
                } else {
                    if (i7 >= i4 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b5 = bArr[i7];
                    int i11 = i2 + 3;
                    byte b6 = bArr[i2 + 2];
                    i2 += 4;
                    DecodeUtil.handleFourBytes(b3, b5, b6, bArr[i11], cArr, i6);
                    i6 += 2;
                }
            }
            return new String(cArr, 0, i6);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i2, i3);
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            char cCharAt;
            int length = charSequence.length();
            int i6 = i3 + i2;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i2) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i2 + length;
            }
            int i8 = i2 + i7;
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 < 128 && i8 < i6) {
                    bArr[i8] = (byte) cCharAt2;
                    i8++;
                } else if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                    i8 += 2;
                    bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                        if (i8 > i6 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                throw new UnpairedSurrogateException(i7, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                        }
                        int i10 = i7 + 1;
                        if (i10 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i10);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i8] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i11 = i8 + 3;
                                bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i8 += 4;
                                bArr[i11] = (byte) ((codePoint & 63) | 128);
                                i7 = i10;
                            } else {
                                i7 = i10;
                            }
                        }
                        throw new UnpairedSurrogateException(i7 - 1, length);
                    }
                    bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i12 = i8 + 2;
                    bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i8 += 3;
                    bArr[i12] = (byte) ((cCharAt2 & '?') | 128);
                }
                i7++;
            }
            return i8;
        }

        @Override // com.google.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
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
        @Override // com.google.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
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
                int r7 = com.google.protobuf.Utf8.access$000(r0, r9)
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
                int r7 = com.google.protobuf.Utf8.access$000(r0, r1)
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
                int r7 = com.google.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            return partialIsValidUtf8Default(i2, byteBuffer, i3, i4);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i2, i3);
        }
    }
}
