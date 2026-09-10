package i1;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42658b;

    static {
        l1.y.G(0);
        l1.y.G(1);
    }

    public q(String str, String str2) {
        this.f42657a = l1.y.N(str);
        this.f42658b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (Objects.equals(this.f42657a, qVar.f42657a) && Objects.equals(this.f42658b, qVar.f42658b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f42658b.hashCode() * 31;
        String str = this.f42657a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
