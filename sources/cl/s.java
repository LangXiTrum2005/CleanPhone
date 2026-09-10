package cl;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f6593b;

    public /* synthetic */ s(u uVar, int i10) {
        this.f6592a = i10;
        this.f6593b = uVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        switch (this.f6592a) {
            case 0:
                yl.f fVar = (yl.f) obj;
                if (fVar != null) {
                    u uVar = this.f6593b;
                    return uVar.j(fVar, uVar.i().a(fVar, hl.b.f42410f));
                }
                u.h(8);
                throw null;
            default:
                yl.f fVar2 = (yl.f) obj;
                if (fVar2 != null) {
                    u uVar2 = this.f6593b;
                    return uVar2.j(fVar2, uVar2.i().f(fVar2, hl.b.f42410f));
                }
                u.h(4);
                throw null;
        }
    }
}
