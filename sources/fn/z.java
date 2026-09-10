package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f41193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41195j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p pVar, ak.f fVar) {
        super(fVar);
        this.f41193h = pVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41191f = obj;
        this.f41192g |= Integer.MIN_VALUE;
        return this.f41193h.emit(null, this);
    }
}
