package pk;

import go.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Iterable, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48395c;

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f48393a = i10;
        this.f48394b = k.J(i10, i11, i12);
        this.f48395c = i12;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b iterator() {
        return new b(this.f48393a, this.f48394b, this.f48395c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f48393a == aVar.f48393a && this.f48394b == aVar.f48394b && this.f48395c == aVar.f48395c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f48393a * 31) + this.f48394b) * 31) + this.f48395c;
    }

    public boolean isEmpty() {
        int i10 = this.f48395c;
        int i11 = this.f48394b;
        int i12 = this.f48393a;
        if (i10 > 0) {
            return i12 > i11;
        }
        return i12 < i11;
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f48394b;
        int i11 = this.f48393a;
        int i12 = this.f48395c;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            i12 = -i12;
        }
        sb2.append(i12);
        return sb2.toString();
    }
}
