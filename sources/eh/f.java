package eh;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f40066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln.c f40067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f40068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f40069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40070j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ck.c cVar) {
        super(cVar);
        this.f40069i = hVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40068h = obj;
        this.f40070j |= Integer.MIN_VALUE;
        return this.f40069i.b(null, this);
    }
}
