package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f49829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0 f49830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f49831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f49832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l0 f49833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f49834k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, ck.c cVar) {
        super(cVar);
        this.f49833j = l0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49832i = obj;
        this.f49834k |= Integer.MIN_VALUE;
        return this.f49833j.a(null, this);
    }
}
