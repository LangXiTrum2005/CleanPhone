package zl;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f55016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f55017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f55018c;

    public b0(x xVar, Comparable comparable, Object obj) {
        this.f55018c = xVar;
        this.f55016a = comparable;
        this.f55017b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f55016a.compareTo(((b0) obj).f55016a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f55016a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f55017b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f55016a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f55017b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f55016a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f55017b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f55018c.b();
        Object obj2 = this.f55017b;
        this.f55017b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f55016a);
        String strValueOf2 = String.valueOf(this.f55017b);
        return q4.a.j(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, X3.j.f27830b, strValueOf2);
    }
}
