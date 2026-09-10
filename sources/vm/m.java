package vm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f52683d = new m("must be a member function", 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f52684e = new m("must be a member or an extension function", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52685c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i10) {
        super(str, 0);
        this.f52685c = i10;
    }

    @Override // vm.e
    public final boolean b(kl.e eVar) {
        switch (this.f52685c) {
            case 0:
                return eVar.f6642j != null;
            default:
                return (eVar.f6642j == null && eVar.f6641i == null) ? false : true;
        }
    }
}
