package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class q3 extends b implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q3 f24923c = new q3(new Object[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f24924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24925b;

    public q3(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f24924a = objArr;
        this.f24925b = i10;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ensureIsMutable();
        int i10 = this.f24925b;
        Object[] objArr = this.f24924a;
        if (i10 == objArr.length) {
            this.f24924a = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f24924a;
        int i11 = this.f24925b;
        this.f24925b = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f24925b) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f24925b);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return this.f24924a[i10];
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f24925b) {
            return new q3(Arrays.copyOf(this.f24924a, i10), this.f24925b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        b(i10);
        Object[] objArr = this.f24924a;
        Object obj = objArr[i10];
        int i11 = this.f24925b;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f24925b--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        ensureIsMutable();
        b(i10);
        Object[] objArr = this.f24924a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24925b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f24925b)) {
            Object[] objArr = this.f24924a;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[defpackage.e.D(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f24924a, i10, objArr2, i10 + 1, this.f24925b - i10);
                this.f24924a = objArr2;
            }
            this.f24924a[i10] = obj;
            this.f24925b++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
        sbU.append(this.f24925b);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
