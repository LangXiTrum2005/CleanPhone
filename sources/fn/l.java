package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f41112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f41113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gn.o f41114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41115k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, ak.f fVar) {
        super(fVar);
        this.f41112h = kVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41110f = obj;
        this.f41111g |= Integer.MIN_VALUE;
        return this.f41112h.collect(null, this);
    }
}
