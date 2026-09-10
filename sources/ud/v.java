package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f52163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f52164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f52165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f52166i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, ck.c cVar) {
        super(cVar);
        this.f52165h = qVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f52164g = obj;
        this.f52166i |= Integer.MIN_VALUE;
        return this.f52165h.a(null, this);
    }
}
