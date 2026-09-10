package fh;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f40898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ln.c f40899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f40900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f40901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40902j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, ck.c cVar) {
        super(cVar);
        this.f40901i = sVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40900h = obj;
        this.f40902j |= Integer.MIN_VALUE;
        return this.f40901i.r(null, this);
    }
}
