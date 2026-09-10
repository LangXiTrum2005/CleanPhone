package ai;

import fc.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements vj.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3606c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile f f3607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f3608b;

    @Override // vj.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f3608b;
        Object obj3 = f3606c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f3608b;
            if (obj == obj3) {
                obj = this.f3607a.get();
                Object obj4 = this.f3608b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f3608b = obj;
                this.f3607a = null;
            }
        }
        return obj;
    }
}
