package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f41142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41143h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, ak.f fVar) {
        super(fVar);
        this.f41142g = pVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41141f = obj;
        this.f41143h |= Integer.MIN_VALUE;
        return this.f41142g.emit(null, this);
    }
}
