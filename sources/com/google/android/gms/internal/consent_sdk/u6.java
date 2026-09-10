package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u6 extends AbstractMap {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f23212g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f23213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f23215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.i1 f23217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f23218f;

    public u6() {
        Map map = Collections.EMPTY_MAP;
        this.f23215c = map;
        this.f23218f = map;
    }

    public final Set a() {
        return this.f23215c.isEmpty() ? Collections.EMPTY_SET : this.f23215c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        g();
        int iD = d(comparable);
        if (iD >= 0) {
            return ((v6) this.f23213a[iD]).setValue(obj);
        }
        g();
        if (this.f23213a == null) {
            this.f23213a = new Object[16];
        }
        int i10 = -(iD + 1);
        if (i10 >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f23214b == 16) {
            v6 v6Var = (v6) this.f23213a[15];
            this.f23214b = 15;
            f().put(v6Var.f23224a, v6Var.f23225b);
        }
        Object[] objArr = this.f23213a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f23213a[i10] = new v6(this, comparable, obj);
        this.f23214b++;
        return null;
    }

    public final v6 c(int i10) {
        if (i10 < this.f23214b) {
            return (v6) this.f23213a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (this.f23214b != 0) {
            this.f23213a = null;
            this.f23214b = 0;
        }
        if (this.f23215c.isEmpty()) {
            return;
        }
        this.f23215c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return d(comparable) >= 0 || this.f23215c.containsKey(comparable);
    }

    public final int d(Comparable comparable) {
        int i10 = this.f23214b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((v6) this.f23213a[i11]).f23224a);
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((v6) this.f23213a[i13]).f23224a);
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

    public final Object e(int i10) {
        g();
        Object[] objArr = this.f23213a;
        Object obj = ((v6) objArr[i10]).f23225b;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f23214b - i10) - 1);
        this.f23214b--;
        if (!this.f23215c.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            Object[] objArr2 = this.f23213a;
            int i11 = this.f23214b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new v6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f23214b++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f23217e == null) {
            this.f23217e = new androidx.datastore.preferences.protobuf.i1(this, 2);
        }
        return this.f23217e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return super.equals(obj);
        }
        u6 u6Var = (u6) obj;
        int size = size();
        if (size == u6Var.size()) {
            int i10 = this.f23214b;
            if (i10 != u6Var.f23214b) {
                return entrySet().equals(u6Var.entrySet());
            }
            for (int i11 = 0; i11 < i10; i11++) {
                if (c(i11).equals(u6Var.c(i11))) {
                }
            }
            if (i10 != size) {
                return this.f23215c.equals(u6Var.f23215c);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        g();
        if (this.f23215c.isEmpty() && !(this.f23215c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23215c = treeMap;
            this.f23218f = treeMap.descendingMap();
        }
        return (SortedMap) this.f23215c;
    }

    public final void g() {
        if (this.f23216d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        return iD >= 0 ? ((v6) this.f23213a[iD]).f23225b : this.f23215c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f23214b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f23213a[i11].hashCode();
        }
        return this.f23215c.size() > 0 ? this.f23215c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iD = d(comparable);
        if (iD >= 0) {
            return e(iD);
        }
        if (this.f23215c.isEmpty()) {
            return null;
        }
        return this.f23215c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23215c.size() + this.f23214b;
    }
}
