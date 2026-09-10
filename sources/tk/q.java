package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk.c f51042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f51043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(zk.c cVar, int i10) {
        super(0);
        this.f51042e = cVar;
        this.f51043f = i10;
    }

    @Override // jk.a
    public final Object invoke() {
        Object obj = this.f51042e.B().get(this.f51043f);
        kotlin.jvm.internal.n.e(obj, "descriptor.valueParameters[i]");
        return (zk.f0) obj;
    }
}
