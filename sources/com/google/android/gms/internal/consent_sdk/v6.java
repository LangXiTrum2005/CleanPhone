package com.google.android.gms.internal.consent_sdk;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v6 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f23224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u6 f23226c;

    public v6(u6 u6Var, Comparable comparable, Object obj) {
        this.f23226c = u6Var;
        this.f23224a = comparable;
        this.f23225b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f23224a.compareTo(((v6) obj).f23224a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f23224a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f23225b;
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
        return this.f23224a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f23225b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f23224a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f23225b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f23226c.g();
        Object obj2 = this.f23225b;
        this.f23225b = obj;
        return obj2;
    }

    public final String toString() {
        return wi.d.i(String.valueOf(this.f23224a), X3.j.f27830b, String.valueOf(this.f23225b));
    }
}
