package h6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends al.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(2);
        this.f42224b = i10;
    }

    public final g H0() {
        switch (this.f42224b) {
            case 0:
                return new d(this);
            default:
                return new i(this);
        }
    }
}
