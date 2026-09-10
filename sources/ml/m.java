package ml;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f46215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(p pVar, int i10) {
        super(1);
        this.f46214e = i10;
        this.f46215f = pVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f46214e) {
            case 0:
                yl.f it = (yl.f) obj;
                kotlin.jvm.internal.n.f(it, "it");
                return p.v(this.f46215f, it);
            default:
                yl.f it2 = (yl.f) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                return p.w(this.f46215f, it2);
        }
    }
}
