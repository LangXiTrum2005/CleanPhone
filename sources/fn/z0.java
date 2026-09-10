package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f41196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b1 f41197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cn.f1 f41198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f41200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f41201k;
    public final /* synthetic */ a1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41202m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, ak.f fVar) {
        super(fVar);
        this.l = a1Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41201k = obj;
        this.f41202m |= Integer.MIN_VALUE;
        this.l.collect(null, this);
        return bk.a.f5708a;
    }
}
