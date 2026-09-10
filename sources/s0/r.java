package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f49888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fn.i0 f49890h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fn.i0 i0Var, ak.f fVar) {
        super(fVar);
        this.f49890h = i0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49888f = obj;
        this.f49889g |= Integer.MIN_VALUE;
        return this.f49890h.emit(null, this);
    }
}
