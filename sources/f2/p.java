package f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements na.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f40424b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f40423a = i10;
        this.f40424b = obj;
    }

    @Override // na.r
    public final Object get() {
        int i10 = this.f40423a;
        Object obj = this.f40424b;
        switch (i10) {
            case 0:
                try {
                    return (b0) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 1:
                return (i2.p) obj;
            default:
                return (b0) obj;
        }
    }
}
