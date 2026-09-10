package x0;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f53536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f53537b;

    public n(int i10) {
        this.f53536a = new SparseArray(i10);
    }

    public final void a(q qVar, int i10, int i11) {
        int iA = qVar.a(i10);
        SparseArray sparseArray = this.f53536a;
        n nVar = sparseArray == null ? null : (n) sparseArray.get(iA);
        if (nVar == null) {
            nVar = new n(1);
            sparseArray.put(qVar.a(i10), nVar);
        }
        if (i11 > i10) {
            nVar.a(qVar, i10 + 1, i11);
        } else {
            nVar.f53537b = qVar;
        }
    }
}
