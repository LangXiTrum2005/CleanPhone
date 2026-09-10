package org.apache.commons.codec.binary;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes7.dex */
public class Base64 extends BaseNCodec {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f45188h = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f45189i = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public final byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f45190e;
    public final byte[] f;
    public final int g;

    public Base64(int i2, byte[] bArr) {
        super(i2, bArr.length);
        this.f45190e = f45189i;
        for (byte b2 : bArr) {
            if (61 != b2) {
                if (b2 >= 0) {
                    byte[] bArr2 = this.f45190e;
                    if (b2 >= bArr2.length || bArr2[b2] == -1) {
                    }
                }
            }
            throw new IllegalArgumentException(a.n("lineSeparator must not contain base64 characters: [", new String(bArr, StandardCharsets.UTF_8), d9.i.f24752e));
        }
        if (i2 > 0) {
            this.g = bArr.length + 4;
            byte[] bArr3 = new byte[bArr.length];
            this.f = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        } else {
            this.g = 4;
            this.f = null;
        }
        this.d = f45188h;
    }

    public static byte[] c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = new Base64(0, BaseNCodec.f45191c);
        long length = ((long) ((bArr.length + 2) / 3)) * ((long) 4);
        int i2 = base64.f45192a;
        if (i2 > 0) {
            long j = i2;
            length += (((length + j) - 1) / j) * ((long) base64.f45193b);
        }
        if (length > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(androidx.media3.extractor.text.ttml.a.j(length, "Input array too big, the output array would be bigger (", ") than the specified maximum size of 2147483647"));
        }
        if (bArr.length != 0) {
            int length2 = bArr.length;
            if (bArr.length != 0) {
                BaseNCodec.Context context = new BaseNCodec.Context();
                base64.b(bArr, length2, context);
                base64.b(bArr, -1, context);
                int i3 = context.f45196c;
                int i4 = context.d;
                int i5 = i3 - i4;
                byte[] bArr2 = new byte[i5];
                if (context.f45195b != null) {
                    int iMin = Math.min(i3 - i4, i5);
                    System.arraycopy(context.f45195b, context.d, bArr2, 0, iMin);
                    int i6 = context.d + iMin;
                    context.d = i6;
                    if (i6 >= context.f45196c) {
                        context.f45195b = null;
                    }
                }
                return bArr2;
            }
        }
        return bArr;
    }

    public final void b(byte[] bArr, int i2, BaseNCodec.Context context) {
        if (context.f45197e) {
            return;
        }
        int i3 = this.g;
        byte[] bArr2 = this.d;
        int i4 = this.f45192a;
        byte[] bArr3 = this.f;
        if (i2 >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i2) {
                byte[] bArrA = BaseNCodec.a(i3, context);
                int i7 = (context.g + 1) % 3;
                context.g = i7;
                int i8 = i6 + 1;
                int i9 = bArr[i6];
                if (i9 < 0) {
                    i9 += 256;
                }
                int i10 = (context.f45194a << 8) + i9;
                context.f45194a = i10;
                if (i7 == 0) {
                    int i11 = context.f45196c;
                    int i12 = i11 + 1;
                    context.f45196c = i12;
                    bArrA[i11] = bArr2[(i10 >> 18) & 63];
                    int i13 = i11 + 2;
                    context.f45196c = i13;
                    bArrA[i12] = bArr2[(i10 >> 12) & 63];
                    int i14 = i11 + 3;
                    context.f45196c = i14;
                    bArrA[i13] = bArr2[(i10 >> 6) & 63];
                    int i15 = i11 + 4;
                    context.f45196c = i15;
                    bArrA[i14] = bArr2[i10 & 63];
                    int i16 = context.f + 4;
                    context.f = i16;
                    if (i4 > 0 && i4 <= i16) {
                        System.arraycopy(bArr3, 0, bArrA, i15, bArr3.length);
                        context.f45196c += bArr3.length;
                        context.f = 0;
                    }
                }
                i5++;
                i6 = i8;
            }
            return;
        }
        context.f45197e = true;
        if (context.g == 0 && i4 == 0) {
            return;
        }
        byte[] bArrA2 = BaseNCodec.a(i3, context);
        int i17 = context.f45196c;
        int i18 = context.g;
        if (i18 != 0) {
            byte[] bArr4 = f45188h;
            if (i18 == 1) {
                int i19 = i17 + 1;
                context.f45196c = i19;
                int i20 = context.f45194a;
                bArrA2[i17] = bArr2[(i20 >> 2) & 63];
                int i21 = i17 + 2;
                context.f45196c = i21;
                bArrA2[i19] = bArr2[(i20 << 4) & 63];
                if (bArr2 == bArr4) {
                    int i22 = i17 + 3;
                    context.f45196c = i22;
                    bArrA2[i21] = 61;
                    context.f45196c = i17 + 4;
                    bArrA2[i22] = 61;
                }
            } else {
                if (i18 != 2) {
                    throw new IllegalStateException("Impossible modulus " + context.g);
                }
                int i23 = i17 + 1;
                context.f45196c = i23;
                int i24 = context.f45194a;
                bArrA2[i17] = bArr2[(i24 >> 10) & 63];
                int i25 = i17 + 2;
                context.f45196c = i25;
                bArrA2[i23] = bArr2[(i24 >> 4) & 63];
                int i26 = i17 + 3;
                context.f45196c = i26;
                bArrA2[i25] = bArr2[(i24 << 2) & 63];
                if (bArr2 == bArr4) {
                    context.f45196c = i17 + 4;
                    bArrA2[i26] = 61;
                }
            }
        }
        int i27 = context.f;
        int i28 = context.f45196c;
        int i29 = (i28 - i17) + i27;
        context.f = i29;
        if (i4 <= 0 || i29 <= 0) {
            return;
        }
        System.arraycopy(bArr3, 0, bArrA2, i28, bArr3.length);
        context.f45196c += bArr3.length;
    }
}
