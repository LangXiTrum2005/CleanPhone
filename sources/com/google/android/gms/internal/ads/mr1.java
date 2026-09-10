package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mr1 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mr1 f17527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mr1 f17528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mr1 f17529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mr1 f17530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public mr1 f17531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f17532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f17533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17534h;

    public mr1() {
        this.f17532f = null;
        this.f17531e = this;
        this.f17530d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f17532f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f17533g;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17532f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17533g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f17532f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f17533g;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f17533g;
        this.f17533g = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17532f);
        String strValueOf2 = String.valueOf(this.f17533g);
        return q4.a.j(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, X3.j.f27830b, strValueOf2);
    }

    public mr1(mr1 mr1Var, Object obj, mr1 mr1Var2, mr1 mr1Var3) {
        this.f17527a = mr1Var;
        this.f17532f = obj;
        this.f17534h = 1;
        this.f17530d = mr1Var2;
        this.f17531e = mr1Var3;
        mr1Var3.f17530d = this;
        mr1Var2.f17531e = this;
    }
}
