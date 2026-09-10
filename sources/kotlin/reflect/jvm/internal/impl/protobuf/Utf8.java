package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes7.dex */
final class Utf8 {
    public static int a(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static int b(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i4 == 1) {
            return a(b2, bArr[i2]);
        }
        if (i4 != 2) {
            throw new AssertionError();
        }
        byte b3 = bArr[i2];
        byte b4 = bArr[i2 + 1];
        if (b2 > -12 || b3 > -65 || b4 > -65) {
            return -1;
        }
        return (b4 << 16) ^ ((b3 << 8) ^ b2);
    }

    public static int c(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                i2 = i4;
            } else if (b2 < -32) {
                if (i4 >= i3) {
                    return b2;
                }
                if (b2 < -62) {
                    return -1;
                }
                i2 += 2;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else if (b2 < -16) {
                if (i4 >= i3 - 1) {
                    return b(bArr, i4, i3);
                }
                int i5 = i2 + 2;
                byte b3 = bArr[i4];
                if (b3 > -65) {
                    return -1;
                }
                if (b2 == -32 && b3 < -96) {
                    return -1;
                }
                if (b2 == -19 && b3 >= -96) {
                    return -1;
                }
                i2 += 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
            } else {
                if (i4 >= i3 - 2) {
                    return b(bArr, i4, i3);
                }
                int i6 = i2 + 2;
                byte b4 = bArr[i4];
                if (b4 > -65) {
                    return -1;
                }
                if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i7 = i2 + 3;
                if (bArr[i6] > -65) {
                    return -1;
                }
                i2 += 4;
                if (bArr[i7] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
