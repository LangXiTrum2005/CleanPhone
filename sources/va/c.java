package va;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f52510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f52511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f52512e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52514b;

    static {
        int i10 = 0;
        f52510c = new c("ENABLED", i10);
        f52511d = new c("DISABLED", i10);
        f52512e = new c("DESTROYED", i10);
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f52513a = i10;
        this.f52514b = obj;
    }

    public String toString() {
        switch (this.f52513a) {
            case 0:
                return (String) this.f52514b;
            default:
                return super.toString();
        }
    }
}
