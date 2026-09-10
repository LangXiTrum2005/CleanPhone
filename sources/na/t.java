package na;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l2.k f46648d = new l2.k(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46649a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile r f46650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f46651c;

    public t(r rVar) {
        rVar.getClass();
        this.f46650b = rVar;
    }

    @Override // na.r
    public final Object get() {
        r rVar = this.f46650b;
        l2.k kVar = f46648d;
        if (rVar != kVar) {
            synchronized (this.f46649a) {
                try {
                    if (this.f46650b != kVar) {
                        Object obj = this.f46650b.get();
                        this.f46651c = obj;
                        this.f46650b = kVar;
                        return obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f46651c;
    }

    public final String toString() {
        Object obj = this.f46650b;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (obj == f46648d) {
            obj = "<supplier that returned " + this.f46651c + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
