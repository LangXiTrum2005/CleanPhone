package eh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ln.c f40071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f40072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f40073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40074i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ck.c cVar) {
        super(cVar);
        this.f40073h = hVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40072g = obj;
        this.f40074i |= Integer.MIN_VALUE;
        return this.f40073h.c(this);
    }
}
