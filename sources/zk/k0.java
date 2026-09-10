package zk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements jm.d, j0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k0 f54971b = new k0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f54972c = new k0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54973a;

    public /* synthetic */ k0(int i10) {
        this.f54973a = i10;
    }

    @Override // jm.d
    public pm.y getType() {
        switch (this.f54973a) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f54973a) {
            case 6:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
