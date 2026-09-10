package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ca1 extends y91 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aa1 f13122b = new aa1(ya1.f22208e, 0);

    public static ya1 A(int i10, Object[] objArr) {
        return i10 == 0 ? ya1.f22208e : new ya1(i10, objArr);
    }

    public static ya1 u(Object obj) {
        Object[] objArr = {obj};
        ps1.s(1, objArr);
        return A(1, objArr);
    }

    public static ya1 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ps1.s(2, objArr);
        return A(2, objArr);
    }

    public static ya1 w(Long l, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l, l10, l11, l12, l13};
        ps1.s(5, objArr);
        return A(5, objArr);
    }

    public static ya1 x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i10 = length + 12;
        Object[] objArr2 = new Object[i10];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        ps1.s(i10, objArr2);
        return A(i10, objArr2);
    }

    public static ca1 y(Collection collection) {
        if (!(collection instanceof y91)) {
            Object[] array = collection.toArray();
            int length = array.length;
            ps1.s(length, array);
            return A(length, array);
        }
        ca1 ca1VarQ = ((y91) collection).q();
        if (!ca1VarQ.r()) {
            return ca1VarQ;
        }
        Object[] array2 = ca1VarQ.toArray(y91.f22207a);
        return A(array2.length, array2);
    }

    public static ya1 z(Object[] objArr) {
        if (objArr.length == 0) {
            return ya1.f22208e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        ps1.s(length, objArr2);
        return A(length, objArr2);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final aa1 listIterator(int i10) {
        ps1.g0(i10, size());
        return isEmpty() ? f13122b : new aa1(this, i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.y91, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (Objects.equals(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                aa1 aa1VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (aa1VarListIterator.hasNext()) {
                    if (it.hasNext() && Objects.equals(aa1VarListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final mb1 h() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.y91
    public int s(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public ca1 subList(int i10, int i11) {
        ps1.h0(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? ya1.f22208e : new ba1(this, i10, i12);
    }

    @Override // com.google.android.gms.internal.ads.y91
    public final ca1 q() {
        return this;
    }
}
