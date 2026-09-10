package saneness;

import ads_mobile_sdk.x81;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes.dex */
public final class civitan extends unready {
    @Override // saneness.unready
    public final int attabal(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        int length = str.length();
        int i5 = i + i2;
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
                        if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i3 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return unready.dern(str, bArr, i, i2);
                    }
                    i6++;
                    if (i6 != str.length()) {
                        char cCharAt3 = str.charAt(i6);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i9 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i9] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return unready.dern(str, bArr, i, i2);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i10 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    @Override // saneness.unready
    public final String saneness(byte[] bArr, int i, int i2) throws x81 {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                cArr[i4] = (char) b2;
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (b3 < 0) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b3;
                    i4++;
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw new x81("Protocol message had invalid UTF-8.");
                }
                i += 2;
                byte b4 = bArr[i5];
                int i6 = i4 + 1;
                if (b2 < -62 || petrol.attabal(b4)) {
                    throw new x81("Protocol message had invalid UTF-8.");
                }
                cArr[i4] = (char) ((b4 & Utf8.REPLACEMENT_BYTE) | ((b2 & 31) << 6));
                i4 = i6;
            } else {
                if (b2 >= -16) {
                    if (i5 >= i3 - 2) {
                        throw new x81("Protocol message had invalid UTF-8.");
                    }
                    byte b5 = bArr[i5];
                    int i7 = i + 3;
                    byte b6 = bArr[i + 2];
                    i += 4;
                    byte b7 = bArr[i7];
                    int i8 = i4 + 1;
                    if (!petrol.attabal(b5)) {
                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !petrol.attabal(b6) && !petrol.attabal(b7)) {
                            int i9 = ((b5 & Utf8.REPLACEMENT_BYTE) << 12) | ((b2 & 7) << 18) | ((b6 & Utf8.REPLACEMENT_BYTE) << 6) | (b7 & Utf8.REPLACEMENT_BYTE);
                            cArr[i4] = (char) ((i9 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                            cArr[i8] = (char) ((i9 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                            i4 += 2;
                        }
                    }
                    throw new x81("Protocol message had invalid UTF-8.");
                }
                if (i5 >= i3 - 1) {
                    throw new x81("Protocol message had invalid UTF-8.");
                }
                int i10 = i + 2;
                byte b8 = bArr[i5];
                i += 3;
                byte b9 = bArr[i10];
                int i11 = i4 + 1;
                if (petrol.attabal(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || petrol.attabal(b9)))) {
                    throw new x81("Protocol message had invalid UTF-8.");
                }
                cArr[i4] = (char) (((b8 & Utf8.REPLACEMENT_BYTE) << 6) | ((b2 & 15) << 12) | (b9 & Utf8.REPLACEMENT_BYTE));
                i4 = i11;
            }
        }
        return new String(cArr, 0, i4);
    }

    @Override // saneness.unready
    public final boolean wireman(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2 || b < -62) {
                    return false;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return false;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return false;
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return false;
                }
                if (b == -32 && b2 < -96) {
                    return false;
                }
                if (b == -19 && b2 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return false;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return false;
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return false;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return false;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return false;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
