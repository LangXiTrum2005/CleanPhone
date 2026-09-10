package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lr1 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr1 f17115b;

    public /* synthetic */ lr1(nr1 nr1Var, int i10) {
        this.f17114a = i10;
        this.f17115b = nr1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f17114a) {
            case 0:
                this.f17115b.clear();
                break;
            default:
                this.f17115b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        mr1 mr1VarA;
        switch (this.f17114a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                nr1 nr1Var = this.f17115b;
                nr1Var.getClass();
                Object key = entry.getKey();
                mr1 mr1Var = null;
                if (key != null) {
                    try {
                        mr1VarA = nr1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        mr1VarA = null;
                    }
                    break;
                } else {
                    mr1VarA = null;
                }
                if (mr1VarA != null && Objects.equals(mr1VarA.f17533g, entry.getValue())) {
                    mr1Var = mr1VarA;
                }
                return mr1Var != null;
            default:
                return this.f17115b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f17114a) {
            case 0:
                return new kr1(this.f17115b, 0);
            default:
                return new kr1(this.f17115b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        mr1 mr1VarA;
        switch (this.f17114a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                nr1 nr1Var = this.f17115b;
                nr1Var.getClass();
                Object key = entry.getKey();
                mr1 mr1Var = null;
                if (key != null) {
                    try {
                        mr1VarA = nr1Var.a(key, false);
                    } catch (ClassCastException unused) {
                        mr1VarA = null;
                    }
                    break;
                } else {
                    mr1VarA = null;
                }
                if (mr1VarA != null && Objects.equals(mr1VarA.f17533g, entry.getValue())) {
                    mr1Var = mr1VarA;
                }
                if (mr1Var == null) {
                    return false;
                }
                nr1Var.b(mr1Var, true);
                return true;
            default:
                nr1 nr1Var2 = this.f17115b;
                nr1Var2.getClass();
                mr1 mr1VarA2 = null;
                if (obj != null) {
                    try {
                        mr1VarA2 = nr1Var2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mr1VarA2 != null) {
                    nr1Var2.b(mr1VarA2, true);
                }
                return mr1VarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f17114a) {
            case 0:
                break;
        }
        return this.f17115b.f17932c;
    }
}
