package tb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f50713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f50714b;

    public q(Class cls, Class cls2) {
        this.f50713a = cls;
        this.f50714b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f50714b.equals(qVar.f50714b)) {
            return this.f50713a.equals(qVar.f50713a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50713a.hashCode() + (this.f50714b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f50714b;
        Class cls2 = this.f50713a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
