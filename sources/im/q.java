package im;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f43193f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i10) {
        super(0);
        this.f43192e = i10;
        this.f43193f = rVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f43192e) {
            case 0:
                nm.h hVar = this.f43193f.f43195b;
                return xj.o.Q(bm.m.i(hVar), bm.m.j(hVar));
            default:
                return xj.o.R(bm.m.h(this.f43193f.f43195b));
        }
    }
}
