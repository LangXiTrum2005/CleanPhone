package x4;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f53606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f53607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f53608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f53609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f53610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f53611h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53613b;

    static {
        int i10 = 0;
        f53606c = new b("NONE", i10);
        f53607d = new b("FULL", i10);
        int i11 = 1;
        f53608e = new b("FLAT", i11);
        f53609f = new b("HALF_OPENED", i11);
        int i12 = 2;
        f53610g = new b("FOLD", i12);
        f53611h = new b("HINGE", i12);
    }

    public /* synthetic */ b(String str, int i10) {
        this.f53612a = i10;
        this.f53613b = str;
    }

    public String toString() {
        switch (this.f53612a) {
            case 0:
                return (String) this.f53613b;
            case 1:
                return (String) this.f53613b;
            case 2:
                return (String) this.f53613b;
            default:
                return super.toString();
        }
    }

    public b(y4.a aVar) {
        this.f53612a = 3;
        int i10 = l.f53631b;
        this.f53613b = aVar;
    }
}
