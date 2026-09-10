package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q f41180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41181i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q qVar, ak.f fVar) {
        super(fVar);
        this.f41180h = qVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41178f = obj;
        this.f41179g |= Integer.MIN_VALUE;
        return this.f41180h.collect(null, this);
    }
}
