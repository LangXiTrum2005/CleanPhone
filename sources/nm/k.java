package nm;

import xj.g0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f46834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f46835g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, o oVar, int i10) {
        super(0);
        this.f46833e = i10;
        this.f46834f = mVar;
        this.f46835g = oVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f46833e) {
            case 0:
                return g0.v0(this.f46835g.o(), this.f46834f.f46839a.keySet());
            default:
                return g0.v0(this.f46835g.p(), this.f46834f.f46840b.keySet());
        }
    }
}
