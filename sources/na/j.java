package na;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements i, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f46632a;

    public j(List list) {
        this.f46632a = list;
    }

    @Override // na.i
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f46632a;
            if (i10 >= list.size()) {
                return true;
            }
            if (!((i) list.get(i10)).apply(obj)) {
                return false;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f46632a.equals(((j) obj).f46632a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46632a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f46632a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
