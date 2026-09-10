package i2;

import i1.q0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends n implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42771f;

    public f(int i10, q0 q0Var, int i11, i iVar, int i12) {
        int i13;
        super(i10, q0Var, i11);
        this.f42770e = p1.a.k(i12, iVar.B) ? 1 : 0;
        i1.p pVar = this.f42799d;
        int i14 = pVar.f42650u;
        int i15 = -1;
        if (i14 != -1 && (i13 = pVar.f42651v) != -1) {
            i15 = i14 * i13;
        }
        this.f42771f = i15;
    }

    @Override // i2.n
    public final int a() {
        return this.f42770e;
    }

    @Override // i2.n
    public final /* bridge */ /* synthetic */ boolean b(n nVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f42771f, ((f) obj).f42771f);
    }
}
