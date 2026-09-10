package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z3 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f25058h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f25060b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f25061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.i1 f25063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f25064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile b4 f25065g;

    public z3(int i10) {
        this.f25059a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f25061c = map;
        this.f25064f = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f25060b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((e4) this.f25060b.get(i12)).f24825a);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((e4) this.f25060b.get(i13)).f24825a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((e4) this.f25060b.get(i12)).f24825a);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void b() {
        if (this.f25062d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.f25060b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f25060b.isEmpty()) {
            this.f25060b.clear();
        }
        if (this.f25061c.isEmpty()) {
            return;
        }
        this.f25061c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f25061c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f25061c.isEmpty() ? z4.f25067c : this.f25061c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f25061c.isEmpty() && !(this.f25061c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f25061c = treeMap;
            this.f25064f = treeMap.descendingMap();
        }
        return (SortedMap) this.f25061c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f25063e == null) {
            this.f25063e = new androidx.datastore.preferences.protobuf.i1(this, 5);
        }
        return this.f25063e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return super.equals(obj);
        }
        z3 z3Var = (z3) obj;
        int size = size();
        if (size == z3Var.size()) {
            int size2 = this.f25060b.size();
            if (size2 != z3Var.f25060b.size()) {
                return ((AbstractSet) entrySet()).equals(z3Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(z3Var.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.f25061c.equals(z3Var.f25061c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((e4) this.f25060b.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f25060b.isEmpty();
        int i10 = this.f25059a;
        if (zIsEmpty && !(this.f25060b instanceof ArrayList)) {
            this.f25060b = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return e().put(comparable, obj);
        }
        if (this.f25060b.size() == i10) {
            e4 e4Var = (e4) this.f25060b.remove(i10 - 1);
            e().put(e4Var.f24825a, e4Var.f24826b);
        }
        this.f25060b.add(i11, new e4(this, comparable, obj));
        return null;
    }

    public final Object g(int i10) {
        b();
        Object obj = ((e4) this.f25060b.remove(i10)).f24826b;
        if (!this.f25061c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f25060b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new e4(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((e4) this.f25060b.get(iA)).f24826b : this.f25061c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f25060b.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((e4) this.f25060b.get(i10)).hashCode();
        }
        return this.f25061c.size() > 0 ? this.f25061c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.f25061c.isEmpty()) {
            return null;
        }
        return this.f25061c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f25061c.size() + this.f25060b.size();
    }
}
