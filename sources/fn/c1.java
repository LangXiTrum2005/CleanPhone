package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gn.o f41042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f41043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1 f41044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41045i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(d1 d1Var, ck.c cVar) {
        super(cVar);
        this.f41044h = d1Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41043g = obj;
        this.f41045i |= Integer.MIN_VALUE;
        return this.f41044h.b(this);
    }
}
