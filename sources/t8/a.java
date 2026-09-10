package t8;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements vj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f50560c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f50561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f50562b;

    public static vj.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f50562b = f50560c;
        aVar.f50561a = bVar;
        return aVar;
    }

    @Override // vj.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f50562b;
        Object obj3 = f50560c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f50562b;
                if (obj == obj3) {
                    obj = this.f50561a.get();
                    Object obj4 = this.f50562b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f50562b = obj;
                    this.f50561a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
