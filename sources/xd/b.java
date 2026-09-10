package xd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ln.a f53733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f53734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f53735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53736i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ck.c cVar2) {
        super(cVar2);
        this.f53735h = cVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f53734g = obj;
        this.f53736i |= Integer.MIN_VALUE;
        return this.f53735h.b(this);
    }
}
