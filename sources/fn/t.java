package fn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f41151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f41152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u f41153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41154i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, ak.f fVar) {
        super(fVar);
        this.f41153h = uVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f41152g = obj;
        this.f41154i |= Integer.MIN_VALUE;
        return this.f41153h.emit(null, this);
    }
}
