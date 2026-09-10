package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f41123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f41124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41125j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, ak.f fVar) {
        super(fVar);
        this.f41123h = kVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41121f = obj;
        this.f41122g |= Integer.MIN_VALUE;
        return this.f41123h.collect(null, this);
    }
}
