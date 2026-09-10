package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q91 implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r91 f19006c;

    public q91(r91 r91Var, int i10) {
        Objects.requireNonNull(r91Var);
        this.f19006c = r91Var;
        this.f19004a = r91Var.g()[i10];
        this.f19005b = i10;
    }

    public final void a() {
        int i10 = this.f19005b;
        Object obj = this.f19004a;
        r91 r91Var = this.f19006c;
        if (i10 != -1 && i10 < r91Var.size()) {
            if (Objects.equals(obj, r91Var.g()[this.f19005b])) {
                return;
            }
        }
        this.f19005b = r91Var.o(obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19004a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        r91 r91Var = this.f19006c;
        Map mapJ = r91Var.j();
        if (mapJ != null) {
            return mapJ.get(this.f19004a);
        }
        a();
        int i10 = this.f19005b;
        if (i10 == -1) {
            return null;
        }
        return r91Var.h()[i10];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        r91 r91Var = this.f19006c;
        Map mapJ = r91Var.j();
        Object obj2 = this.f19004a;
        if (mapJ != null) {
            return mapJ.put(obj2, obj);
        }
        a();
        int i10 = this.f19005b;
        if (i10 == -1) {
            r91Var.put(obj2, obj);
            return null;
        }
        Object obj3 = r91Var.h()[i10];
        r91Var.h()[this.f19005b] = obj;
        return obj3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        return q4.a.j(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, X3.j.f27830b, strValueOf2);
    }
}
