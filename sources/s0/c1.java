package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f49764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln.c f49765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f49766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e1 f49767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49768j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, ck.c cVar) {
        super(cVar);
        this.f49767i = e1Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49766h = obj;
        this.f49768j |= Integer.MIN_VALUE;
        return this.f49767i.c(null, this);
    }
}
