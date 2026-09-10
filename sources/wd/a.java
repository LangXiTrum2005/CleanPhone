package wd;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f53169c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f53170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f53171b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f53171b = f53169c;
        aVar.f53170a = bVar;
        return aVar;
    }

    @Override // vj.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f53171b;
        Object obj3 = f53169c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f53171b;
            if (obj == obj3) {
                obj = this.f53170a.get();
                Object obj4 = this.f53171b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f53171b = obj;
                this.f53170a = null;
            }
        }
        return obj;
    }
}
