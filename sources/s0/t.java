package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f49902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e0 f49903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cn.r f49904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f49905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f49906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f49907k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(e0 e0Var, ck.c cVar) {
        super(cVar);
        this.f49906j = e0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49905i = obj;
        this.f49907k |= Integer.MIN_VALUE;
        return e0.c(this.f49906j, null, this);
    }
}
