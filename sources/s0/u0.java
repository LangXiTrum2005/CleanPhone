package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f49915f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f49916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f49917h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f49918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w0 f49919j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f49920k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(w0 w0Var, ck.c cVar) {
        super(cVar);
        this.f49919j = w0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49918i = obj;
        this.f49920k |= Integer.MIN_VALUE;
        return this.f49919j.c(null, this);
    }
}
