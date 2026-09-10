package fh;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f40903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln.c f40904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f40905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f40906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40907j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, ck.c cVar) {
        super(cVar);
        this.f40906i = sVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40905h = obj;
        this.f40907j |= Integer.MIN_VALUE;
        return this.f40906i.s(null, this);
    }
}
