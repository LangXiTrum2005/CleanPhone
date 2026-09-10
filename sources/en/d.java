package en;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f40132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f40133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40134h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ck.c cVar) {
        super(cVar);
        this.f40133g = eVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40132f = obj;
        this.f40134h |= Integer.MIN_VALUE;
        Object objC = this.f40133g.C(null, 0, 0L, this);
        return objC == bk.a.f5708a ? objC : new l(objC);
    }
}
