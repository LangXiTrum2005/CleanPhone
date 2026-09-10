package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f52019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z0 f52020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f52021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c1 f52022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f52023j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, ak.f fVar) {
        super(fVar);
        this.f52022i = c1Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f52021h = obj;
        this.f52023j |= Integer.MIN_VALUE;
        return c1.a(this.f52022i, null, null, this);
    }
}
