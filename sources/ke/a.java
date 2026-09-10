package ke;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44613b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f44612a = new int[1];

    public final void a(boolean z10) {
        c(this.f44613b + 1);
        if (z10) {
            int[] iArr = this.f44612a;
            int i10 = this.f44613b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f44613b++;
    }

    public final void b(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.f44613b + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    public final void c(int i10) {
        int[] iArr = this.f44612a;
        if (i10 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i10 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f44612a = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f44612a.clone();
        int i10 = this.f44613b;
        a aVar = new a();
        aVar.f44612a = iArr;
        aVar.f44613b = i10;
        return aVar;
    }

    public final boolean d(int i10) {
        return (this.f44612a[i10 / 32] & (1 << (i10 & 31))) != 0;
    }

    public final int e() {
        return (this.f44613b + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f44613b == aVar.f44613b && Arrays.equals(this.f44612a, aVar.f44612a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44612a) + (this.f44613b * 31);
    }

    public final String toString() {
        int i10 = this.f44613b;
        StringBuilder sb2 = new StringBuilder((i10 / 8) + i10 + 1);
        for (int i11 = 0; i11 < this.f44613b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(d(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
