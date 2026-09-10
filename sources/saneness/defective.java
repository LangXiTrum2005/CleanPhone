package saneness;

import ads_mobile_sdk.m53;
import ads_mobile_sdk.n53;
import ads_mobile_sdk.x81;
import com.applovin.shadow.okio.Utf8;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class defective extends unready {
    @Override // saneness.unready
    public final int attabal(String str, byte[] bArr, int i, int i2) {
        return unready.dern(str, bArr, i, i2);
    }

    @Override // saneness.unready
    public final String saneness(byte[] bArr, int i, int i2) throws x81 {
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(Utf8.REPLACEMENT_CODE_POINT) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw new x81("Protocol message had invalid UTF-8.");
        }
        return str;
    }

    @Override // saneness.unready
    public final boolean wireman(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long j2 = i;
        int i4 = i2 - i;
        long j3 = 1;
        if (i4 >= 16) {
            int i5 = 8 - (((int) j2) & 7);
            long j4 = j2;
            i3 = 0;
            while (true) {
                if (i3 >= i5) {
                    while (true) {
                        int i6 = i3 + 8;
                        if (i6 > i4) {
                            break;
                        }
                        if ((n53.c.f(bArr, n53.f + j4) & (-9187201950435737472L)) != 0) {
                            break;
                        }
                        j4 += 8;
                        i3 = i6;
                    }
                    while (true) {
                        if (i3 >= i4) {
                            i3 = i4;
                            break;
                        }
                        long j5 = j4 + 1;
                        if (n53.c.b(bArr, n53.f + j4) < 0) {
                            break;
                        }
                        i3++;
                        j4 = j5;
                    }
                } else {
                    long j6 = j4 + 1;
                    if (n53.c.b(bArr, n53.f + j4) < 0) {
                        break;
                    }
                    i3++;
                    j4 = j6;
                }
            }
        } else {
            i3 = 0;
        }
        int i7 = i4 - i3;
        long j7 = j2 + ((long) i3);
        while (true) {
            byte b = 0;
            while (i7 > 0) {
                long j8 = j7 + j3;
                b = n53.c.b(bArr, n53.f + j7);
                if (b < 0) {
                    j7 = j8;
                    break;
                }
                i7--;
                j7 = j8;
            }
            if (i7 == 0) {
                return true;
            }
            int i8 = i7 - 1;
            if (b < -32) {
                if (i8 == 0) {
                    return false;
                }
                i7 -= 2;
                if (b >= -62) {
                    long j9 = j7 + j3;
                    if (n53.c.b(bArr, n53.f + j7) <= -65) {
                        j7 = j9;
                    }
                }
                return false;
            }
            if (b < -16) {
                if (i8 < 2) {
                    return false;
                }
                i7 -= 3;
                long j10 = j7 + j3;
                m53 m53Var = n53.c;
                long j11 = n53.f;
                j = j3;
                byte b2 = m53Var.b(bArr, j11 + j7);
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    j7 += 2;
                    if (m53Var.b(bArr, j11 + j10) > -65) {
                    }
                }
                return false;
            }
            j = j3;
            if (i8 < 3) {
                return false;
            }
            i7 -= 4;
            long j12 = j7 + j;
            m53 m53Var2 = n53.c;
            long j13 = n53.f;
            byte b3 = m53Var2.b(bArr, j13 + j7);
            if (b3 <= -65) {
                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                    long j14 = j7 + 2;
                    if (m53Var2.b(bArr, j12 + j13) <= -65) {
                        j7 += 3;
                        if (m53Var2.b(bArr, j13 + j14) > -65) {
                        }
                    }
                }
            }
            return false;
            j3 = j;
        }
    }
}
