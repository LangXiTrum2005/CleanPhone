package kn;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f44733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f44734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44735h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ck.c cVar) {
        super(cVar);
        this.f44734g = dVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f44733f = obj;
        this.f44735h |= Integer.MIN_VALUE;
        return this.f44734g.d(this);
    }
}
