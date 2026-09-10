package x3;

import java.util.List;
import kotlin.jvm.internal.n;
import xj.o;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f53581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53582b;

    public d(List list, int i10) {
        this.f53581a = list;
        this.f53582b = i10;
        if (list.isEmpty() && i10 == -1) {
            return;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i10 >= 0 && i10 < size) {
                return;
            }
        }
        StringBuilder sbU = defpackage.e.u(i10, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '");
        sbU.append(o.O(list2));
        sbU.append("'.");
        throw new IllegalArgumentException(sbU.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f53582b == dVar.f53582b && n.a(this.f53581a, dVar.f53581a);
    }

    public final int hashCode() {
        return this.f53581a.hashCode() + (this.f53582b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f53582b + ", mergedHistory=" + this.f53581a + ')';
    }

    public d() {
        this(v.f53866a, -1);
    }
}
