package im;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends bm.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f43177c;

    public g(ArrayList arrayList, h hVar) {
        this.f43176b = arrayList;
        this.f43177c = hVar;
    }

    @Override // bm.m
    public final void b(zk.c fakeOverride) {
        kotlin.jvm.internal.n.f(fakeOverride, "fakeOverride");
        bm.l.r(fakeOverride, null);
        this.f43176b.add(fakeOverride);
    }

    @Override // bm.m
    public final void d(zk.c cVar, zk.c fromCurrent) {
        kotlin.jvm.internal.n.f(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f43177c.f43179b + ": " + cVar + " vs " + fromCurrent).toString());
    }
}
