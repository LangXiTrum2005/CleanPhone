package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class du1 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f13723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f13725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.i1 f13727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f13728f;

    public du1() {
        Map map = Collections.EMPTY_MAP;
        this.f13725c = map;
        this.f13728f = map;
    }

    public final eu1 a(int i10) {
        if (i10 < this.f13724b) {
            return (eu1) this.f13723a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Set b() {
        return this.f13725c.isEmpty() ? Collections.EMPTY_SET : this.f13725c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((eu1) this.f13723a[iE]).setValue(obj);
        }
        f();
        if (this.f13723a == null) {
            this.f13723a = new Object[16];
        }
        int i10 = -(iE + 1);
        if (i10 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f13724b == 16) {
            eu1 eu1Var = (eu1) this.f13723a[15];
            this.f13724b = 15;
            g().put(eu1Var.f14082a, eu1Var.f14083b);
        }
        Object[] objArr = this.f13723a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f13723a[i10] = new eu1(this, comparable, obj);
        this.f13724b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f13724b != 0) {
            this.f13723a = null;
            this.f13724b = 0;
        }
        if (this.f13725c.isEmpty()) {
            return;
        }
        this.f13725c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f13725c.containsKey(comparable);
    }

    public final Object d(int i10) {
        f();
        Object[] objArr = this.f13723a;
        Object obj = ((eu1) objArr[i10]).f14083b;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f13724b - i10) - 1);
        this.f13724b--;
        if (!this.f13725c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f13723a;
            int i11 = this.f13724b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new eu1(this, (Comparable) entry.getKey(), entry.getValue());
            this.f13724b++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i10 = this.f13724b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((eu1) this.f13723a[i11]).f14082a);
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((eu1) this.f13723a[i13]).f14082a);
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f13727e == null) {
            this.f13727e = new androidx.datastore.preferences.protobuf.i1(this, 1);
        }
        return this.f13727e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du1)) {
            return super.equals(obj);
        }
        du1 du1Var = (du1) obj;
        int size = size();
        if (size == du1Var.size()) {
            int i10 = this.f13724b;
            if (i10 != du1Var.f13724b) {
                return entrySet().equals(du1Var.entrySet());
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (a(i11).equals(du1Var.a(i11))) {
                }
            }
            if (i10 != size) {
                return this.f13725c.equals(du1Var.f13725c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f13726d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f13725c.isEmpty() && !(this.f13725c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13725c = treeMap;
            this.f13728f = treeMap.descendingMap();
        }
        return (SortedMap) this.f13725c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((eu1) this.f13723a[iE]).f14083b : this.f13725c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f13724b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f13723a[i11].hashCode();
        }
        return this.f13725c.size() > 0 ? this.f13725c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f13725c.isEmpty()) {
            return null;
        }
        return this.f13725c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13725c.size() + this.f13724b;
    }
}
