package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f41027h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p pVar, ak.f fVar) {
        super(fVar);
        this.f41027h = pVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41025f = obj;
        this.f41026g |= Integer.MIN_VALUE;
        return this.f41027h.emit(null, this);
    }
}
