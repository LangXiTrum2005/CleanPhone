package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.a0 f49760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f49761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e0 f49762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49763i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, ck.c cVar) {
        super(cVar);
        this.f49762h = e0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49761g = obj;
        this.f49763i |= Integer.MIN_VALUE;
        return this.f49762h.j(null, false, this);
    }
}
