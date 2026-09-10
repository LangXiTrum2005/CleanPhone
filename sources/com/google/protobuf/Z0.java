package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends b implements Internal.DoubleList, RandomAccess, o3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z0 f25054c = new z0(new double[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f25055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25056b;

    public z0(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f25055a = dArr;
        this.f25056b = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f25056b)) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f25056b);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        double[] dArr = this.f25055a;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[defpackage.e.D(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f25055a, i10, dArr2, i10 + 1, this.f25056b - i10);
            this.f25055a = dArr2;
        }
        this.f25055a[i10] = dDoubleValue;
        this.f25056b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof z0)) {
            return super.addAll(collection);
        }
        z0 z0Var = (z0) collection;
        int i10 = z0Var.f25056b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25056b;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f25055a;
        if (i12 > dArr.length) {
            this.f25055a = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(z0Var.f25055a, 0, this.f25055a, this.f25056b, z0Var.f25056b);
        this.f25056b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final void addDouble(double d10) {
        ensureIsMutable();
        int i10 = this.f25056b;
        double[] dArr = this.f25055a;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[defpackage.e.D(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f25055a = dArr2;
        }
        double[] dArr3 = this.f25055a;
        int i11 = this.f25056b;
        this.f25056b = i11 + 1;
        dArr3[i11] = d10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f25056b) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f25056b);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return super.equals(obj);
        }
        z0 z0Var = (z0) obj;
        if (this.f25056b != z0Var.f25056b) {
            return false;
        }
        double[] dArr = z0Var.f25055a;
        for (int i10 = 0; i10 < this.f25056b; i10++) {
            if (Double.doubleToLongBits(this.f25055a[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double getDouble(int i10) {
        b(i10);
        return this.f25055a[i10];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f25056b; i10++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.f25055a[i10]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f25056b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f25055a[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        b(i10);
        double[] dArr = this.f25055a;
        double d10 = dArr[i10];
        int i11 = this.f25056b;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f25056b--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f25055a;
        System.arraycopy(dArr, i11, dArr, i10, this.f25056b - i11);
        this.f25056b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Double.valueOf(setDouble(i10, ((Double) obj).doubleValue()));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double setDouble(int i10, double d10) {
        ensureIsMutable();
        b(i10);
        double[] dArr = this.f25055a;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25056b;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f25056b) {
            return new z0(Arrays.copyOf(this.f25055a, i10), this.f25056b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
