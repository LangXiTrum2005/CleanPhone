package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.protobuf.InvalidProtocolBufferException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Lg0 extends Kg0 {
    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
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
                if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return Ng0.incompleteStateFor(bArr, i3, i2);
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i += 3;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 2) {
                    return Ng0.incompleteStateFor(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 <= -65) {
                    if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                        int i6 = i + 3;
                        if (bArr[i5] <= -65) {
                            i += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    public String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
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
            byte b2 = bArr[i];
            if (Jg0.isOneByte(b2)) {
                int i7 = i5 + 1;
                Jg0.handleOneByte(b2, cArr, i5);
                while (i6 < i3) {
                    byte b3 = bArr[i6];
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
                Jg0.handleTwoBytes(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (Jg0.isThreeBytes(b2)) {
                if (i6 >= i3 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i8 = i + 2;
                i += 3;
                Jg0.handleThreeBytes(b2, bArr[i6], bArr[i8], cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b4 = bArr[i6];
                int i9 = i + 3;
                byte b5 = bArr[i + 2];
                i += 4;
                Jg0.handleFourBytes(b2, b4, b5, bArr[i9], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return decodeUtf8Default(byteBuffer, i, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = charSequence.charAt(i6);
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
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                            throw new Mg0(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                    }
                    int i9 = i6 + 1;
                    if (i9 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i9);
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
                    throw new Mg0(i6 - 1, length);
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
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
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
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
            int r7 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0.access$000(r0, r9)
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
            int r7 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0.access$000(r0, r1)
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
            int r7 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0.access$100(r0, r1, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lg0.partialIsValidUtf8(int, byte[], int, int):int");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    public int partialIsValidUtf8Direct(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return partialIsValidUtf8Default(i, byteBuffer, i2, i3);
    }

    private static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i, i2);
    }
}
