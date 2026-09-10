package com.google.crypto.tink.shaded.protobuf;

import com.applovin.impl.ca;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends b implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f24649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x0 f24650e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f24651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24652c;

    static {
        Object[] objArr = new Object[0];
        f24649d = objArr;
        f24650e = new x0(objArr, 0, false);
    }

    public x0(Object[] objArr, int i10, boolean z10) {
        this.f24538a = z10;
        this.f24651b = objArr;
        this.f24652c = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i10 = this.f24652c;
        Object[] objArr = this.f24651b;
        if (i10 == objArr.length) {
            this.f24651b = Arrays.copyOf(this.f24651b, ca.v(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f24651b;
        int i11 = this.f24652c;
        this.f24652c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        h(i10);
        return this.f24651b[i10];
    }

    public final void h(int i10) {
        if (i10 < 0 || i10 >= this.f24652c) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f24652c);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public final a0 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f24652c) {
            return new x0(i10 == 0 ? f24649d : Arrays.copyOf(this.f24651b, i10), this.f24652c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        h(i10);
        Object[] objArr = this.f24651b;
        Object obj = objArr[i10];
        int i11 = this.f24652c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f24652c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        h(i10);
        Object[] objArr = this.f24651b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24652c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        b();
        if (i10 >= 0 && i10 <= (i11 = this.f24652c)) {
            Object[] objArr = this.f24651b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[ca.v(objArr.length, 3, 2, 1, 10)];
                System.arraycopy(this.f24651b, 0, objArr2, 0, i10);
                System.arraycopy(this.f24651b, i10, objArr2, i10 + 1, this.f24652c - i10);
                this.f24651b = objArr2;
            }
            this.f24651b[i10] = obj;
            this.f24652c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
        sbU.append(this.f24652c);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
