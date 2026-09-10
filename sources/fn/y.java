package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f41189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f41190i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar, ak.f fVar) {
        super(fVar);
        this.f41189h = sVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41187f = obj;
        this.f41188g |= Integer.MIN_VALUE;
        return this.f41189h.collect(null, this);
    }
}
