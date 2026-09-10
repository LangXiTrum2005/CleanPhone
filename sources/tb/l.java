package tb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements tc.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f50701c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f50702a = f50701c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile tc.b f50703b;

    public l(tc.b bVar) {
        this.f50703b = bVar;
    }

    @Override // tc.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f50702a;
        Object obj3 = f50701c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f50702a;
                if (obj == obj3) {
                    obj = this.f50703b.get();
                    this.f50702a = obj;
                    this.f50703b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
