package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ru2 implements Map.Entry, Comparable {
    public final Comparable a;
    public Object b;
    public final /* synthetic */ uu2 c;

    public ru2(uu2 uu2Var, Comparable comparable, Object obj) {
        this.c = uu2Var;
        this.a = comparable;
        this.b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.compareTo(((ru2) obj).a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.a;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.b;
            Object value = entry.getValue();
            if (obj2 != null ? obj2.equals(value) : value == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.c.a();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.a) + X3.j.b + String.valueOf(this.b);
    }
}
