package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public double[] f4817Y;
    public int Z;

    static {
        new DoubleArrayList(new double[0], 0, false);
    }

    public DoubleArrayList(double[] dArr, int i2, boolean z2) {
        super(z2);
        this.f4817Y = dArr;
        this.Z = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.Z)) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Index:", ", Size:");
            sbU.append(this.Z);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        double[] dArr = this.f4817Y;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[android.support.v4.media.a.B(i3, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f4817Y, i2, dArr2, i2 + 1, this.Z - i2);
            this.f4817Y = dArr2;
        }
        this.f4817Y[i2] = dDoubleValue;
        this.Z++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f4857a;
        collection.getClass();
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i2 = doubleArrayList.Z;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.Z;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f4817Y;
        if (i4 > dArr.length) {
            this.f4817Y = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(doubleArrayList.f4817Y, 0, this.f4817Y, this.Z, doubleArrayList.Z);
        this.Z = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addDouble(double d) {
        a();
        int i2 = this.Z;
        double[] dArr = this.f4817Y;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[android.support.v4.media.a.B(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f4817Y = dArr2;
        }
        double[] dArr3 = this.f4817Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        dArr3[i3] = d;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.Z) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Index:", ", Size:");
            sbU.append(this.Z);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DoubleArrayList)) {
            return super.equals(obj);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) obj;
        if (this.Z != doubleArrayList.Z) {
            return false;
        }
        double[] dArr = doubleArrayList.f4817Y;
        for (int i2 = 0; i2 < this.Z; i2++) {
            if (Double.doubleToLongBits(this.f4817Y[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return Double.valueOf(getDouble(i2));
    }

    public final double getDouble(int i2) {
        c(i2);
        return this.f4817Y[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            iB = (iB * 31) + Internal.b(Double.doubleToLongBits(this.f4817Y[i2]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f4817Y[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        double[] dArr = this.f4817Y;
        double d = dArr[i2];
        int i3 = this.Z;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f4817Y;
        System.arraycopy(dArr, i3, dArr, i2, this.Z - i3);
        this.Z -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        c(i2);
        double[] dArr = this.f4817Y;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final Internal.DoubleList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.Z) {
            return new DoubleArrayList(Arrays.copyOf(this.f4817Y, i2), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
