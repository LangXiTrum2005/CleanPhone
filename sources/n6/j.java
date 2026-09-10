package n6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46589e;

    @Override // n6.l
    public final int a(int i10, int i11, int i12, int i13) {
        switch (this.f46589e) {
        }
        return 2;
    }

    @Override // n6.l
    public final float b(int i10, int i11, int i12, int i13) {
        switch (this.f46589e) {
            case 0:
                return Math.max(i12 / i10, i13 / i11);
            default:
                return 1.0f;
        }
    }
}
