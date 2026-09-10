package oa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f47276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Collection f47277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Map f47278c;

    public Map d() {
        Map map = this.f47278c;
        if (map != null) {
            return map;
        }
        Map mapG = g();
        this.f47278c = mapG;
        return mapG;
    }

    public boolean e(Object obj) {
        Iterator it = d().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return d().equals(((n) obj).d());
        }
        return false;
    }

    public abstract Map g();

    public abstract Set h();

    public final int hashCode() {
        return d().hashCode();
    }

    public Set i() {
        Set set = this.f47276a;
        if (set != null) {
            return set;
        }
        Set setH = h();
        this.f47276a = setH;
        return setH;
    }

    public final String toString() {
        return d().toString();
    }
}
