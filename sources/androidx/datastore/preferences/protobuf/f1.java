package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends AbstractMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4073f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f4074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f4075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i1 f4077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f4078e;

    public static f1 f() {
        f1 f1Var = new f1();
        f1Var.f4074a = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        f1Var.f4075b = map;
        f1Var.f4078e = map;
        return f1Var;
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
        int size = this.f4074a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((g1) this.f4074a.get(i12)).f4082a);
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
            int iCompareTo2 = comparable.compareTo(((g1) this.f4074a.get(i13)).f4082a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((g1) this.f4074a.get(i12)).f4082a);
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
        if (this.f4076c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i10) {
        return (Map.Entry) this.f4074a.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f4074a.isEmpty()) {
            this.f4074a.clear();
        }
        if (this.f4075b.isEmpty()) {
            return;
        }
        this.f4075b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4075b.containsKey(comparable);
    }

    public final Set d() {
        return this.f4075b.isEmpty() ? Collections.EMPTY_SET : this.f4075b.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f4075b.isEmpty() && !(this.f4075b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4075b = treeMap;
            this.f4078e = treeMap.descendingMap();
        }
        return (SortedMap) this.f4075b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4077d == null) {
            this.f4077d = new i1(this, 0);
        }
        return this.f4077d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return super.equals(obj);
        }
        f1 f1Var = (f1) obj;
        int size = size();
        if (size == f1Var.size()) {
            int size2 = this.f4074a.size();
            if (size2 != f1Var.f4074a.size()) {
                return ((AbstractSet) entrySet()).equals(f1Var.entrySet());
            }
            for (int i10 = 0; i10 < size2; i10++) {
                if (c(i10).equals(f1Var.c(i10))) {
                }
            }
            if (size2 != size) {
                return this.f4075b.equals(f1Var.f4075b);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((g1) this.f4074a.get(iA)).setValue(obj);
        }
        b();
        if (this.f4074a.isEmpty() && !(this.f4074a instanceof ArrayList)) {
            this.f4074a = new ArrayList(16);
        }
        int i10 = -(iA + 1);
        if (i10 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f4074a.size() == 16) {
            g1 g1Var = (g1) this.f4074a.remove(15);
            e().put(g1Var.f4082a, g1Var.f4083b);
        }
        this.f4074a.add(i10, new g1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((g1) this.f4074a.get(iA)).f4083b : this.f4075b.get(comparable);
    }

    public final Object h(int i10) {
        b();
        Object obj = ((g1) this.f4074a.remove(i10)).f4083b;
        if (!this.f4075b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f4074a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new g1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4074a.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((g1) this.f4074a.get(i10)).hashCode();
        }
        return this.f4075b.size() > 0 ? this.f4075b.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f4075b.isEmpty()) {
            return null;
        }
        return this.f4075b.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4075b.size() + this.f4074a.size();
    }
}
