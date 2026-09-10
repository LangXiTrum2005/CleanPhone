package g6;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f41644b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f41645c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f41646d = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41647a;

    public /* synthetic */ l(int i10) {
        this.f41647a = i10;
    }

    public final boolean a(int i10) {
        switch (this.f41647a) {
            case 0:
                return false;
            case 1:
                return (i10 == 3 || i10 == 5) ? false : true;
            default:
                return i10 == 2;
        }
    }
}
