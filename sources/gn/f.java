package gn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f41990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41991h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ak.f fVar) {
        super(fVar);
        this.f41990g = gVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41989f = obj;
        this.f41991h |= Integer.MIN_VALUE;
        return this.f41990g.emit(null, this);
    }
}
