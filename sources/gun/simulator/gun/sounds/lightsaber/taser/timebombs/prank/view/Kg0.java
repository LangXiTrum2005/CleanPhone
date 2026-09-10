package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.InvalidProtocolBufferException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Kg0 {
    public final String decodeUtf8(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if (byteBuffer.hasArray()) {
            return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
        }
        return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i, i2) : decodeUtf8Default(byteBuffer, i, i2);
    }

    public abstract String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

    public final String decodeUtf8Default(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!Jg0.isOneByte(b)) {
                break;
            }
            i++;
            Jg0.handleOneByte(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (Jg0.isOneByte(b2)) {
                int i7 = i5 + 1;
                Jg0.handleOneByte(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = byteBuffer.get(i6);
                    if (!Jg0.isOneByte(b3)) {
                        break;
                    }
                    i6++;
                    Jg0.handleOneByte(b3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i6;
            } else if (Jg0.isTwoBytes(b2)) {
                if (i6 >= i3) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i += 2;
                Jg0.handleTwoBytes(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (Jg0.isThreeBytes(b2)) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i8 = i + 2;
                i += 3;
                Jg0.handleThreeBytes(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b4 = byteBuffer.get(i6);
                int i9 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                Jg0.handleFourBytes(b2, b4, b5, byteBuffer.get(i9), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

    public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2);

    public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
        } else if (byteBuffer.isDirect()) {
            encodeUtf8Direct(charSequence, byteBuffer);
        } else {
            encodeUtf8Default(charSequence, byteBuffer);
        }
    }

    public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i, (byte) cCharAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        if (i == length) {
            return;
        }
        iPosition += i;
        while (i < length) {
            char cCharAt2 = charSequence.charAt(i);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i2 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i2, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i2;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i2;
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i3 = i + 1;
                    if (i3 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i4 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    int i5 = iPosition + 2;
                                    try {
                                        byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i5, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i = i3;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i = i3;
                                        iPosition = i5;
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    iPosition = i4;
                                    i = i3;
                                }
                            } else {
                                i = i3;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                        i = i3;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i) + " at index " + (Math.max(i, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                    }
                    throw new Mg0(i, length);
                }
                int i6 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i6, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i++;
            iPosition++;
        }
    }

    public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean isValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
        return partialIsValidUtf8(0, byteBuffer, i, i2) == 0;
    }

    public final int partialIsValidUtf8(int i, ByteBuffer byteBuffer, int i2, int i3) {
        if (!byteBuffer.hasArray()) {
            return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i, byteBuffer, i2, i3) : partialIsValidUtf8Default(i, byteBuffer, i2, i3);
        }
        int iArrayOffset = byteBuffer.arrayOffset();
        return partialIsValidUtf8(i, byteBuffer.array(), i2 + iArrayOffset, iArrayOffset + i3);
    }

    public abstract int partialIsValidUtf8(int i, byte[] bArr, int i2, int i3);

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
            int r7 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0.access$000(r0, r9)
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
            int r7 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0.access$000(r0, r1)
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
            int r7 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0.access$100(r0, r1, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
    }

    public abstract int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3);

    public final boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return partialIsValidUtf8(0, bArr, i, i2) == 0;
    }

    private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i, int i2) {
        int iEstimateConsecutiveAscii = Ng0.estimateConsecutiveAscii(byteBuffer, i, i2) + i;
        while (iEstimateConsecutiveAscii < i2) {
            int i3 = iEstimateConsecutiveAscii + 1;
            byte b = byteBuffer.get(iEstimateConsecutiveAscii);
            if (b >= 0) {
                iEstimateConsecutiveAscii = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62 || byteBuffer.get(i3) > -65) {
                    return -1;
                }
                iEstimateConsecutiveAscii += 2;
            } else {
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return Ng0.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                    }
                    int i4 = iEstimateConsecutiveAscii + 2;
                    byte b2 = byteBuffer.get(i3);
                    if (b2 <= -65) {
                        if ((((b2 + 112) + (b << 28)) >> 30) == 0) {
                            int i5 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i4) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 1) {
                    return Ng0.incompleteStateFor(byteBuffer, b, i3, i2 - i3);
                }
                int i6 = iEstimateConsecutiveAscii + 2;
                byte b3 = byteBuffer.get(i3);
                if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                    return -1;
                }
                iEstimateConsecutiveAscii += 3;
            }
        }
        return 0;
    }
}
