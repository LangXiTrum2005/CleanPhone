package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f41085h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, ak.f fVar) {
        super(fVar);
        this.f41085h = i0Var;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41083f = obj;
        this.f41084g |= Integer.MIN_VALUE;
        return this.f41085h.emit(null, this);
    }
}
