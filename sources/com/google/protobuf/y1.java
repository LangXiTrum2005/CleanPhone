package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends b implements Internal.FloatList, RandomAccess, o3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y1 f25036c = new y1(new float[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f25037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25038b;

    public y1(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f25037a = fArr;
        this.f25038b = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f25038b)) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f25038b);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        float[] fArr = this.f25037a;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[defpackage.e.D(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f25037a, i10, fArr2, i10 + 1, this.f25038b - i10);
            this.f25037a = fArr2;
        }
        this.f25037a[i10] = fFloatValue;
        this.f25038b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof y1)) {
            return super.addAll(collection);
        }
        y1 y1Var = (y1) collection;
        int i10 = y1Var.f25038b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25038b;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f25037a;
        if (i12 > fArr.length) {
            this.f25037a = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(y1Var.f25037a, 0, this.f25037a, this.f25038b, y1Var.f25038b);
        this.f25038b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final void addFloat(float f10) {
        ensureIsMutable();
        int i10 = this.f25038b;
        float[] fArr = this.f25037a;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[defpackage.e.D(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f25037a = fArr2;
        }
        float[] fArr3 = this.f25037a;
        int i11 = this.f25038b;
        this.f25038b = i11 + 1;
        fArr3[i11] = f10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.f25038b) {
            StringBuilder sbU = defpackage.e.u(i10, "Index:", ", Size:");
            sbU.append(this.f25038b);
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
        if (!(obj instanceof y1)) {
            return super.equals(obj);
        }
        y1 y1Var = (y1) obj;
        if (this.f25038b != y1Var.f25038b) {
            return false;
        }
        float[] fArr = y1Var.f25037a;
        for (int i10 = 0; i10 < this.f25038b; i10++) {
            if (Float.floatToIntBits(this.f25037a[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float getFloat(int i10) {
        b(i10);
        return this.f25037a[i10];
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f25038b; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f25037a[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f25038b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f25037a[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        ensureIsMutable();
        b(i10);
        float[] fArr = this.f25037a;
        float f10 = fArr[i10];
        int i11 = this.f25038b;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f25038b--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f25037a;
        System.arraycopy(fArr, i11, fArr, i10, this.f25038b - i11);
        this.f25038b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        return Float.valueOf(setFloat(i10, ((Float) obj).floatValue()));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float setFloat(int i10, float f10) {
        ensureIsMutable();
        b(i10);
        float[] fArr = this.f25037a;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25038b;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f25038b) {
            return new y1(Arrays.copyOf(this.f25037a, i10), this.f25038b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
