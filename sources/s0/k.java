package s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k5.g f49835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f49836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k5.g f49837h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49838i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k5.g gVar, ck.c cVar) {
        super(cVar);
        this.f49837h = gVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f49836g = obj;
        this.f49838i |= Integer.MIN_VALUE;
        return this.f49837h.o(this);
    }
}
