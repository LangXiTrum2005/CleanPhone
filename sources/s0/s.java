package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f49895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln.c f49896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f49897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f49898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49899j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e0 e0Var, ck.c cVar) {
        super(cVar);
        this.f49898i = e0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49897h = obj;
        this.f49899j |= Integer.MIN_VALUE;
        return e0.b(this.f49898i, this);
    }
}
