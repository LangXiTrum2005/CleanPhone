package com.google.zxing.common.reedsolomon;

/* JADX INFO: loaded from: classes3.dex */
final class GenericGFPoly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GenericGF f21352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21353b;

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f21352a = genericGF;
        int length = iArr.length;
        int i2 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f21353b = iArr;
            return;
        }
        while (i2 < length && iArr[i2] == 0) {
            i2++;
        }
        if (i2 == length) {
            this.f21353b = new int[]{0};
            return;
        }
        int i3 = length - i2;
        int[] iArr2 = new int[i3];
        this.f21353b = iArr2;
        System.arraycopy(iArr, i2, iArr2, 0, i3);
    }

    public final GenericGFPoly a(GenericGFPoly genericGFPoly) {
        GenericGF genericGF = genericGFPoly.f21352a;
        GenericGF genericGF2 = this.f21352a;
        if (!genericGF2.equals(genericGF)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c()) {
            return genericGFPoly;
        }
        if (genericGFPoly.c()) {
            return this;
        }
        int[] iArr = this.f21353b;
        int length = iArr.length;
        int[] iArr2 = genericGFPoly.f21353b;
        if (length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length2 = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length2);
        for (int i2 = length2; i2 < iArr.length; i2++) {
            iArr3[i2] = iArr2[i2 - length2] ^ iArr[i2];
        }
        return new GenericGFPoly(genericGF2, iArr3);
    }

    public final int b() {
        return this.f21353b.length - 1;
    }

    public final boolean c() {
        return this.f21353b[0] == 0;
    }

    public final GenericGFPoly d(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        GenericGF genericGF = this.f21352a;
        if (i3 == 0) {
            return genericGF.f21350c;
        }
        int[] iArr = this.f21353b;
        int length = iArr.length;
        int[] iArr2 = new int[i2 + length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr2[i4] = genericGF.a(iArr[i4], i3);
        }
        return new GenericGFPoly(genericGF, iArr2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int[] iArr = this.f21353b;
            int i2 = iArr[(iArr.length - 1) - iB];
            if (i2 != 0) {
                if (i2 < 0) {
                    sb.append(" - ");
                    i2 = -i2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iB == 0 || i2 != 1) {
                    GenericGF genericGF = this.f21352a;
                    if (i2 == 0) {
                        genericGF.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i3 = genericGF.f21349b[i2];
                    if (i3 == 0) {
                        sb.append('1');
                    } else if (i3 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i3);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iB);
                    }
                }
            }
        }
        return sb.toString();
    }
}
