package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o91 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r91 f18206b;

    public /* synthetic */ o91(r91 r91Var, int i10) {
        this.f18205a = i10;
        this.f18206b = r91Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f18205a) {
            case 0:
                this.f18206b.clear();
                break;
            default:
                this.f18206b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f18205a) {
            case 0:
                r91 r91Var = this.f18206b;
                Map mapJ = r91Var.j();
                if (mapJ != null) {
                    return mapJ.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iO = r91Var.o(entry.getKey());
                    if (iO != -1 && Objects.equals(r91Var.h()[iO], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f18206b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f18205a) {
            case 0:
                r91 r91Var = this.f18206b;
                Map mapJ = r91Var.j();
                return mapJ != null ? mapJ.entrySet().iterator() : new n91(r91Var, 1);
            default:
                r91 r91Var2 = this.f18206b;
                Map mapJ2 = r91Var2.j();
                return mapJ2 != null ? mapJ2.keySet().iterator() : new n91(r91Var2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f18205a) {
            case 0:
                r91 r91Var = this.f18206b;
                Map mapJ = r91Var.j();
                if (mapJ != null) {
                    return mapJ.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!r91Var.i()) {
                        int iL = r91Var.l();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = r91Var.f19484a;
                        Objects.requireNonNull(obj2);
                        int iD = pi1.D(key, value, iL, obj2, r91Var.d(), r91Var.g(), r91Var.h());
                        if (iD != -1) {
                            r91Var.k(iD, iL);
                            r91Var.f19489f--;
                            r91Var.f19488e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                r91 r91Var2 = this.f18206b;
                Map mapJ2 = r91Var2.j();
                if (mapJ2 != null) {
                    return mapJ2.keySet().remove(obj);
                }
                return r91Var2.p(obj) != r91.f19483j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f18205a) {
            case 0:
                break;
        }
        return this.f18206b.size();
    }
}
