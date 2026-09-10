package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b1 f4054d = new b1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f4055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4056c;

    public b1(Object[] objArr, int i10, boolean z10) {
        this.f4053a = z10;
        this.f4055b = objArr;
        this.f4056c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f4056c;
        Object[] objArr = this.f4055b;
        if (i10 == objArr.length) {
            this.f4055b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4055b;
        int i11 = this.f4056c;
        this.f4056c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h(i10);
        return this.f4055b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f4056c) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f4056c);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
    }

    public final b1 m(int i10) {
        if (i10 >= this.f4056c) {
            return new b1(Arrays.copyOf(this.f4055b, i10), this.f4056c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        h(i10);
        Object[] objArr = this.f4055b;
        Object obj = objArr[i10];
        int i11 = this.f4056c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f4056c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        h(i10);
        Object[] objArr = this.f4055b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4056c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f4056c)) {
            Object[] objArr = this.f4055b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[defpackage.e.D(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f4055b, i10, objArr2, i10 + 1, this.f4056c - i10);
                this.f4055b = objArr2;
            }
            this.f4055b[i10] = obj;
            this.f4056c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
        sbU.append(this.f4056c);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
