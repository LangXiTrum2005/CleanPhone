package fh;

import ea.f2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends ck.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ah.d f40888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f40889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f2 f40890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ln.c f40891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f40892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f40893k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, ck.c cVar) {
        super(cVar);
        this.f40893k = sVar;
    }

    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        this.f40892j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f40893k.q(null, this, null);
    }
}
