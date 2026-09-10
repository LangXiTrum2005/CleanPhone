package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f41099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f41101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41102k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p pVar, ak.f fVar) {
        super(fVar);
        this.f41099h = pVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41097f = obj;
        this.f41098g |= Integer.MIN_VALUE;
        return this.f41099h.emit(null, this);
    }
}
