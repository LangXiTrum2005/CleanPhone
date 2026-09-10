package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f49929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49930g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f49931h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f49932i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49933j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e0 e0Var, ck.c cVar) {
        super(cVar);
        this.f49932i = e0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49931h = obj;
        this.f49933j |= Integer.MIN_VALUE;
        return this.f49932i.h(this);
    }
}
