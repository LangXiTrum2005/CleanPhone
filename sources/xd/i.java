package xd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f53755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f53756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53757h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ck.c cVar) {
        super(cVar);
        this.f53756g = jVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f53755f = obj;
        this.f53757h |= Integer.MIN_VALUE;
        return this.f53756g.b(this);
    }
}
