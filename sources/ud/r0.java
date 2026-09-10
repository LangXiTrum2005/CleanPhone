package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f52145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0 f52146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52147h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, ck.c cVar) {
        super(cVar);
        this.f52146g = s0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f52145f = obj;
        this.f52147h |= Integer.MIN_VALUE;
        return s0.a(this.f52146g, this);
    }
}
