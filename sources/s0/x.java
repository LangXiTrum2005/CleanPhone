package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f49943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f1 f49944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f49945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f49946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f49947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f49948k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e0 e0Var, ak.f fVar) {
        super(fVar);
        this.f49947j = e0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49946i = obj;
        this.f49948k |= Integer.MIN_VALUE;
        return e0.e(this.f49947j, false, this);
    }
}
