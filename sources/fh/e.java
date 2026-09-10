package fh;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f40846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ln.a f40847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f40849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f40850k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s sVar, ck.c cVar) {
        super(cVar);
        this.f40850k = sVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40849j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f40850k.l(false, this);
    }
}
