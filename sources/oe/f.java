package oe;

import com.google.android.gms.internal.play_billing.q1;
import d5.u;
import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47398b;

    public /* synthetic */ f(int i10) {
        this.f47398b = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.q1, he.d
    public final ke.b i(String str, int i10, EnumMap enumMap) {
        switch (this.f47398b) {
            case 0:
                if (i10 == 8) {
                    return super.i(str, i10, enumMap);
                }
                throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(u.A(i10)));
            case 1:
                if (i10 == 7) {
                    return super.i(str, i10, enumMap);
                }
                throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(u.A(i10)));
            default:
                if (i10 == 16) {
                    return super.i(str, i10, enumMap);
                }
                throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(u.A(i10)));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.q1
    public final boolean[] l(String str) {
        switch (this.f47398b) {
            case 0:
                int length = str.length();
                if (length == 12) {
                    try {
                        str = str + h.G(str);
                    } catch (he.b e10) {
                        throw new IllegalArgumentException(e10);
                    }
                } else {
                    if (length != 13) {
                        throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                    }
                    try {
                        if (!h.F(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (he.b unused) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int i10 = e.f47396j[Character.digit(str.charAt(0), 10)];
                boolean[] zArr = new boolean[95];
                int iA = q1.a(zArr, 0, h.f47403e, true);
                for (int i11 = 1; i11 <= 6; i11++) {
                    int iDigit = Character.digit(str.charAt(i11), 10);
                    if (((i10 >> (6 - i11)) & 1) == 1) {
                        iDigit += 10;
                    }
                    iA += q1.a(zArr, iA, h.f47407i[iDigit], false);
                }
                int iA2 = q1.a(zArr, iA, h.f47404f, false) + iA;
                for (int i12 = 7; i12 <= 12; i12++) {
                    iA2 += q1.a(zArr, iA2, h.f47406h[Character.digit(str.charAt(i12), 10)], true);
                }
                q1.a(zArr, iA2, h.f47403e, true);
                return zArr;
            case 1:
                int length2 = str.length();
                if (length2 == 7) {
                    try {
                        str = str + h.G(str);
                    } catch (he.b e11) {
                        throw new IllegalArgumentException(e11);
                    }
                } else {
                    if (length2 != 8) {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length2)));
                    }
                    try {
                        if (!h.F(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (he.b unused2) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                boolean[] zArr2 = new boolean[67];
                int iA3 = q1.a(zArr2, 0, h.f47403e, true);
                for (int i13 = 0; i13 <= 3; i13++) {
                    iA3 += q1.a(zArr2, iA3, h.f47406h[Character.digit(str.charAt(i13), 10)], false);
                }
                int iA4 = q1.a(zArr2, iA3, h.f47404f, false) + iA3;
                for (int i14 = 4; i14 <= 7; i14++) {
                    iA4 += q1.a(zArr2, iA4, h.f47406h[Character.digit(str.charAt(i14), 10)], true);
                }
                q1.a(zArr2, iA4, h.f47403e, true);
                return zArr2;
            default:
                int length3 = str.length();
                if (length3 == 7) {
                    try {
                        str = str + h.G(e.H(str));
                    } catch (he.b e12) {
                        throw new IllegalArgumentException(e12);
                    }
                } else {
                    if (length3 != 8) {
                        throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length3)));
                    }
                    try {
                        if (!h.F(str)) {
                            throw new IllegalArgumentException("Contents do not pass checksum");
                        }
                    } catch (he.b unused3) {
                        throw new IllegalArgumentException("Illegal contents");
                    }
                }
                int iDigit2 = Character.digit(str.charAt(0), 10);
                if (iDigit2 != 0 && iDigit2 != 1) {
                    throw new IllegalArgumentException("Number system must be 0 or 1");
                }
                int i15 = e.f47397k[iDigit2][Character.digit(str.charAt(7), 10)];
                boolean[] zArr3 = new boolean[51];
                int iA5 = q1.a(zArr3, 0, h.f47403e, true);
                for (int i16 = 1; i16 <= 6; i16++) {
                    int iDigit3 = Character.digit(str.charAt(i16), 10);
                    if (((i15 >> (6 - i16)) & 1) == 1) {
                        iDigit3 += 10;
                    }
                    iA5 += q1.a(zArr3, iA5, h.f47407i[iDigit3], false);
                }
                q1.a(zArr3, iA5, h.f47405g, false);
                return zArr3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.q1
    public final int r() {
        return 9;
    }
}
