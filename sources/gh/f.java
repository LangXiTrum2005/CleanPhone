package gh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f41904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln.c f41905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f41907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ bo.e f41908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41909k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bo.e eVar, ck.c cVar) {
        super(cVar);
        this.f41908j = eVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41907i = obj;
        this.f41909k |= Integer.MIN_VALUE;
        return this.f41908j.d(this);
    }
}
