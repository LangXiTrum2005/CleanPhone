package fn;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f41038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f41040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f41041i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p pVar, ak.f fVar) {
        super(fVar);
        this.f41040h = pVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41038f = obj;
        this.f41039g |= Integer.MIN_VALUE;
        return this.f41040h.emit(null, this);
    }
}
