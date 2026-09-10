package gh;

import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f41893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41894h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ck.c cVar) {
        super(cVar);
        this.f41893g = bVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41892f = obj;
        this.f41894h |= Integer.MIN_VALUE;
        Object objC = this.f41893g.c(this);
        return objC == bk.a.f5708a ? objC : new h(objC);
    }
}
