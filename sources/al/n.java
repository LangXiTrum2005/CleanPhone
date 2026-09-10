package al;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl.c f3655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(yl.c cVar, int i10) {
        super(1);
        this.f3654e = i10;
        this.f3655f = cVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f3654e) {
            case 0:
                j it = (j) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return it.d(this.f3655f);
            default:
                yl.c it2 = (yl.c) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                return Boolean.valueOf(!it2.d() && it2.e().equals(this.f3655f));
        }
    }
}
