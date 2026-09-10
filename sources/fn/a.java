package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gn.o f41021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f41022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q0 f41023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q0 q0Var, ak.f fVar) {
        super(fVar);
        this.f41023h = q0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41022g = obj;
        this.f41024i |= Integer.MIN_VALUE;
        return this.f41023h.collect(null, this);
    }
}
