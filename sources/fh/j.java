package fh;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ah.d f40873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f40874g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f40875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40876i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, ck.c cVar) {
        super(cVar);
        this.f40875h = sVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40874g = obj;
        this.f40876i |= Integer.MIN_VALUE;
        return this.f40875h.p(null, this, null);
    }
}
