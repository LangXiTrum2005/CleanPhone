package sa;

import go.k;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f50223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50225c;

    public b(int i10, int i11, int[] iArr) {
        this.f50223a = iArr;
        this.f50224b = i10;
        this.f50225c = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return com.bumptech.glide.c.v(this.f50223a, ((Integer) obj).intValue(), this.f50224b, this.f50225c) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f50223a[this.f50224b + i10] != bVar.f50223a[bVar.f50224b + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        k.m(i10, size());
        return Integer.valueOf(this.f50223a[this.f50224b + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f50224b; i11 < this.f50225c; i11++) {
            i10 = (i10 * 31) + this.f50223a[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f50225c;
        int[] iArr = this.f50223a;
        int i11 = this.f50224b;
        int iV = com.bumptech.glide.c.v(iArr, iIntValue, i11, i10);
        if (iV >= 0) {
            return iV - i11;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f50225c;
            do {
                i11--;
                i10 = this.f50224b;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
            } while (this.f50223a[i11] != iIntValue);
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        k.m(i10, size());
        int i11 = this.f50224b + i10;
        int[] iArr = this.f50223a;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50225c - this.f50224b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        k.r(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.f50224b;
        return new b(i10 + i12, i12 + i11, this.f50223a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f50223a;
        int i10 = this.f50224b;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.f50225c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }
}
