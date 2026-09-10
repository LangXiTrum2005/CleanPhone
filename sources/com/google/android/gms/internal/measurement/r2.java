package com.google.android.gms.internal.measurement;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f23913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f23915c;

    public r2(q2 q2Var, Comparable comparable, Object obj) {
        this.f23915c = q2Var;
        this.f23913a = comparable;
        this.f23914b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f23913a.compareTo(((r2) obj).f23913a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f23913a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f23914b;
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
        return this.f23913a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f23914b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f23913a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f23914b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f23915c.f();
        Object obj2 = this.f23914b;
        this.f23914b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23913a);
        String strValueOf2 = String.valueOf(this.f23914b);
        return q4.a.j(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, X3.j.f27830b, strValueOf2);
    }
}
