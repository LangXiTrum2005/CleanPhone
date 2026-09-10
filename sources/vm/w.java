package vm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52716c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52717d;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(int i10) {
        StringBuilder sbU = defpackage.e.u(i10, "must have at least ", " value parameter");
        sbU.append(i10 > 1 ? "s" : "");
        super(sbU.toString(), 1);
        this.f52717d = i10;
    }

    @Override // vm.e
    public final boolean b(kl.e eVar) {
        switch (this.f52716c) {
            case 0:
                return eVar.B().size() >= this.f52717d;
            default:
                return eVar.B().size() == this.f52717d;
        }
    }

    public w() {
        super("must have exactly 2 value parameters", 1);
        this.f52717d = 2;
    }
}
