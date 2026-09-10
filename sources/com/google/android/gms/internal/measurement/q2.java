package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f23878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f23880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.i1 f23882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f23883f;

    public q2() {
        Map map = Collections.EMPTY_MAP;
        this.f23880c = map;
        this.f23883f = map;
    }

    public final r2 a(int i10) {
        if (i10 < this.f23879b) {
            return (r2) this.f23878a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Set b() {
        return this.f23880c.isEmpty() ? Collections.EMPTY_SET : this.f23880c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((r2) this.f23878a[iE]).setValue(obj);
        }
        f();
        if (this.f23878a == null) {
            this.f23878a = new Object[16];
        }
        int i10 = -(iE + 1);
        if (i10 >= 16) {
            return g().put(comparable, obj);
        }
        if (this.f23879b == 16) {
            r2 r2Var = (r2) this.f23878a[15];
            this.f23879b = 15;
            g().put(r2Var.f23913a, r2Var.f23914b);
        }
        Object[] objArr = this.f23878a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f23878a[i10] = new r2(this, comparable, obj);
        this.f23879b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.f23879b != 0) {
            this.f23878a = null;
            this.f23879b = 0;
        }
        if (this.f23880c.isEmpty()) {
            return;
        }
        this.f23880c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f23880c.containsKey(comparable);
    }

    public final Object d(int i10) {
        f();
        Object[] objArr = this.f23878a;
        Object obj = ((r2) objArr[i10]).f23914b;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f23879b - i10) - 1);
        this.f23879b--;
        if (!this.f23880c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.f23878a;
            int i11 = this.f23879b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new r2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f23879b++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i10 = this.f23879b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((r2) this.f23878a[i11]).f23913a);
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((r2) this.f23878a[i13]).f23913a);
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
        if (this.f23882e == null) {
            this.f23882e = new androidx.datastore.preferences.protobuf.i1(this, 3);
        }
        return this.f23882e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return super.equals(obj);
        }
        q2 q2Var = (q2) obj;
        int size = size();
        if (size == q2Var.size()) {
            int i10 = this.f23879b;
            if (i10 != q2Var.f23879b) {
                return entrySet().equals(q2Var.entrySet());
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (a(i11).equals(q2Var.a(i11))) {
                }
            }
            if (i10 != size) {
                return this.f23880c.equals(q2Var.f23880c);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f23881d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap g() {
        f();
        if (this.f23880c.isEmpty() && !(this.f23880c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23880c = treeMap;
            this.f23883f = treeMap.descendingMap();
        }
        return (SortedMap) this.f23880c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((r2) this.f23878a[iE]).f23914b : this.f23880c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f23879b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f23878a[i11].hashCode();
        }
        return this.f23880c.size() > 0 ? this.f23880c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
        }
        if (this.f23880c.isEmpty()) {
            return null;
        }
        return this.f23880c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23880c.size() + this.f23879b;
    }
}
