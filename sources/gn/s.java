package gn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements ak.f, ck.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f42022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ak.k f42023b;

    public s(d dVar, ak.k kVar) {
        this.f42022a = dVar;
        this.f42023b = kVar;
    }

    @Override // ck.d
    public final ck.d getCallerFrame() {
        return this.f42022a;
    }

    @Override // ak.f
    public final ak.k getContext() {
        return this.f42023b;
    }

    @Override // ak.f
    public final void resumeWith(Object obj) {
        this.f42022a.resumeWith(obj);
    }
}
