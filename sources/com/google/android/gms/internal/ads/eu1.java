package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eu1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f14082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du1 f14084c;

    public eu1(du1 du1Var, Comparable comparable, Object obj) {
        this.f14084c = du1Var;
        this.f14082a = comparable;
        this.f14083b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f14082a.compareTo(((eu1) obj).f14082a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f14082a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f14083b;
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
    public final /* synthetic */ Object getKey() {
        return this.f14082a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f14083b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f14082a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f14083b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f14084c.f();
        Object obj2 = this.f14083b;
        this.f14083b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14082a);
        String strValueOf2 = String.valueOf(this.f14083b);
        return q4.a.j(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, X3.j.f27830b, strValueOf2);
    }
}
