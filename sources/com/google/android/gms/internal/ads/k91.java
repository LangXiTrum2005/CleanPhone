package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f16385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Collection f16386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Map f16387c;

    public abstract Collection d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k91) {
            return i().equals(((k91) obj).i());
        }
        return false;
    }

    public abstract Map g();

    public boolean h(Object obj) {
        Iterator it = i().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return i().hashCode();
    }

    public Map i() {
        Map map = this.f16387c;
        if (map != null) {
            return map;
        }
        Map mapG = g();
        this.f16387c = mapG;
        return mapG;
    }

    public final String toString() {
        return i().toString();
    }
}
