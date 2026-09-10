package ml;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl.f f46164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(yl.f fVar, int i10) {
        super(1);
        this.f46163e = i10;
        this.f46164f = fVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f46163e) {
            case 0:
                im.n it = (im.n) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return it.f(this.f46164f, hl.b.f42409e);
            default:
                im.n it2 = (im.n) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                return it2.a(this.f46164f, hl.b.f42405a);
        }
    }
}
