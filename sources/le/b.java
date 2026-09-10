package le;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f45329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f45330b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f45329a = aVar;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f45330b = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f45330b = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f45330b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    public final b a(b bVar) {
        a aVar = bVar.f45329a;
        a aVar2 = this.f45329a;
        if (!aVar2.equals(aVar)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        int[] iArr = this.f45330b;
        if (iArr[0] == 0) {
            return bVar;
        }
        int[] iArr2 = bVar.f45330b;
        if (iArr2[0] == 0) {
            return this;
        }
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = iArr2[i10 - length] ^ iArr[i10];
        }
        return new b(aVar2, iArr3);
    }

    public final int b() {
        return this.f45330b.length - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(b() * 8);
        for (int iB = b(); iB >= 0; iB--) {
            int[] iArr = this.f45330b;
            int i10 = iArr[(iArr.length - 1) - iB];
            if (i10 != 0) {
                if (i10 < 0) {
                    sb2.append(" - ");
                    i10 = -i10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iB == 0 || i10 != 1) {
                    a aVar = this.f45329a;
                    if (i10 == 0) {
                        aVar.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i11 = aVar.f45324b[i10];
                    if (i11 == 0) {
                        sb2.append('1');
                    } else if (i11 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i11);
                    }
                }
                if (iB != 0) {
                    if (iB == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iB);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
