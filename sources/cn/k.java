package cn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements jk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6725b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f6724a = i10;
        this.f6725b = obj;
    }

    @Override // jk.d
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f6724a;
        Object obj4 = this.f6725b;
        switch (i10) {
            case 0:
                ((jk.b) obj4).invoke((Throwable) obj);
                break;
            case 1:
                ln.c cVar = (ln.c) obj4;
                ln.c.f45604h.set(cVar, null);
                cVar.g(null);
                break;
            default:
                ((ln.g) obj4).c();
                break;
        }
        return wj.r.f53297a;
    }

    public /* synthetic */ k(ln.c cVar, ln.b bVar) {
        this.f6724a = 1;
        this.f6725b = cVar;
    }
}
