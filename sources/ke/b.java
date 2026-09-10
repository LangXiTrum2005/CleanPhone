package ke;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f44617d;

    public b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f44614a = i10;
        this.f44615b = i11;
        int i12 = (i10 + 31) / 32;
        this.f44616c = i12;
        this.f44617d = new int[i12 * i11];
    }

    public final boolean a(int i10, int i11) {
        return ((this.f44617d[(i10 / 32) + (i11 * this.f44616c)] >>> (i10 & 31)) & 1) != 0;
    }

    public final void b(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f44616c);
        int[] iArr = this.f44617d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public final void c(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f44615b || i14 > this.f44614a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f44616c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int i18 = (i17 / 32) + i16;
                int[] iArr = this.f44617d;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public final Object clone() {
        return new b((int[]) this.f44617d.clone(), this.f44614a, this.f44615b, this.f44616c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f44614a == bVar.f44614a && this.f44615b == bVar.f44615b && this.f44616c == bVar.f44616c && Arrays.equals(this.f44617d, bVar.f44617d);
    }

    public final int hashCode() {
        int i10 = this.f44614a;
        return Arrays.hashCode(this.f44617d) + (((((((i10 * 31) + i10) * 31) + this.f44615b) * 31) + this.f44616c) * 31);
    }

    public final String toString() {
        int i10 = this.f44614a;
        int i11 = this.f44615b;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sb2.append(a(i13, i12) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public b(int[] iArr, int i10, int i11, int i12) {
        this.f44614a = i10;
        this.f44615b = i11;
        this.f44616c = i12;
        this.f44617d = iArr;
    }
}
