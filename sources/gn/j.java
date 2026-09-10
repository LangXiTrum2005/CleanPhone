package gn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements ak.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ak.k f42010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f42011b;

    public j(ak.k kVar, Throwable th2) {
        this.f42010a = kVar;
        this.f42011b = th2;
    }

    @Override // ak.k
    public final Object fold(Object obj, jk.c cVar) {
        return this.f42010a.fold(obj, cVar);
    }

    @Override // ak.k
    public final ak.i get(ak.j jVar) {
        return this.f42010a.get(jVar);
    }

    @Override // ak.k
    public final ak.k minusKey(ak.j jVar) {
        return this.f42010a.minusKey(jVar);
    }

    @Override // ak.k
    public final ak.k plus(ak.k kVar) {
        return this.f42010a.plus(kVar);
    }
}
