package vm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f52718d = new x("must have no value parameters", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f52719e = new x("must have a single value parameter", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(String str, int i10) {
        super(str, 1);
        this.f52720c = i10;
    }

    @Override // vm.e
    public final boolean b(kl.e eVar) {
        switch (this.f52720c) {
            case 0:
                return eVar.B().isEmpty();
            default:
                return eVar.B().size() == 1;
        }
    }
}
