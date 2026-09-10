package com.google.protobuf;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e4 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f24825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f24826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3 f24827c;

    public e4(z3 z3Var, Comparable comparable, Object obj) {
        this.f24827c = z3Var;
        this.f24825a = comparable;
        this.f24826b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f24825a.compareTo(((e4) obj).f24825a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f24825a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f24826b;
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
        return this.f24825a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f24826b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f24825a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f24826b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f24827c.b();
        Object obj2 = this.f24826b;
        this.f24826b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f24825a + X3.j.f27830b + this.f24826b;
    }
}
