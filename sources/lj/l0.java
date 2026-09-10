package lj;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l0 implements jk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jk.b f45408b;

    public /* synthetic */ l0(jk.b bVar, int i10) {
        this.f45407a = i10;
        this.f45408b = bVar;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        wj.h hVar = (wj.h) obj;
        switch (this.f45407a) {
            case 0:
                this.f45408b.invoke(new m0(hVar.f53286a));
                break;
            default:
                this.f45408b.invoke(new tj.j0(hVar.f53286a));
                break;
        }
        return wj.r.f53297a;
    }
}
