package oa;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f47306b;

    public /* synthetic */ s(u uVar, int i10) {
        this.f47305a = i10;
        this.f47306b = uVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f47305a) {
            case 0:
                this.f47306b.clear();
                break;
            default:
                this.f47306b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f47305a) {
            case 0:
                u uVar = this.f47306b;
                Map mapG = uVar.g();
                if (mapG != null) {
                    return mapG.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i10 = uVar.i(entry.getKey());
                    if (i10 != -1 && d0.c.h(uVar.q()[i10], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f47306b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f47305a) {
            case 0:
                u uVar = this.f47306b;
                Map mapG = uVar.g();
                return mapG != null ? mapG.entrySet().iterator() : new r(uVar, 1);
            default:
                u uVar2 = this.f47306b;
                Map mapG2 = uVar2.g();
                return mapG2 != null ? mapG2.keySet().iterator() : new r(uVar2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f47305a) {
            case 0:
                u uVar = this.f47306b;
                Map mapG = uVar.g();
                if (mapG != null) {
                    return mapG.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!uVar.l()) {
                        int iH = uVar.h();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = uVar.f47316a;
                        Objects.requireNonNull(obj2);
                        int iS = q.s(key, value, iH, obj2, uVar.o(), uVar.p(), uVar.q());
                        if (iS != -1) {
                            uVar.k(iS, iH);
                            uVar.f47321f--;
                            uVar.f47320e += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                u uVar2 = this.f47306b;
                Map mapG2 = uVar2.g();
                if (mapG2 != null) {
                    return mapG2.keySet().remove(obj);
                }
                return uVar2.m(obj) != u.f47315j;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f47305a) {
            case 0:
                break;
        }
        return this.f47306b.size();
    }
}
