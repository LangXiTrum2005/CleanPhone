package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean[] f4746Y;
    public int Z;

    static {
        new BooleanArrayList(new boolean[0], 0, false);
    }

    public BooleanArrayList(boolean[] zArr, int i2, boolean z2) {
        super(z2);
        this.f4746Y = zArr;
        this.Z = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.Z)) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Index:", ", Size:");
            sbU.append(this.Z);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        boolean[] zArr = this.f4746Y;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[android.support.v4.media.a.B(i3, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f4746Y, i2, zArr2, i2 + 1, this.Z - i2);
            this.f4746Y = zArr2;
        }
        this.f4746Y[i2] = zBooleanValue;
        this.Z++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f4857a;
        collection.getClass();
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i2 = booleanArrayList.Z;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.Z;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f4746Y;
        if (i4 > zArr.length) {
            this.f4746Y = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(booleanArrayList.f4746Y, 0, this.f4746Y, this.Z, booleanArrayList.Z);
        this.Z = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addBoolean(boolean z2) {
        a();
        int i2 = this.Z;
        boolean[] zArr = this.f4746Y;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[android.support.v4.media.a.B(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f4746Y = zArr2;
        }
        boolean[] zArr3 = this.f4746Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        zArr3[i3] = z2;
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
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.Z != booleanArrayList.Z) {
            return false;
        }
        boolean[] zArr = booleanArrayList.f4746Y;
        for (int i2 = 0; i2 < this.Z; i2++) {
            if (this.f4746Y[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return Boolean.valueOf(getBoolean(i2));
    }

    public final boolean getBoolean(int i2) {
        c(i2);
        return this.f4746Y[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.Z; i3++) {
            int i4 = i2 * 31;
            boolean z2 = this.f4746Y[i3];
            Charset charset = Internal.f4857a;
            i2 = i4 + (z2 ? 1231 : 1237);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f4746Y[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        boolean[] zArr = this.f4746Y;
        boolean z2 = zArr[i2];
        int i3 = this.Z;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f4746Y;
        System.arraycopy(zArr, i3, zArr, i2, this.Z - i3);
        this.Z -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        c(i2);
        boolean[] zArr = this.f4746Y;
        boolean z2 = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final Internal.BooleanList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.Z) {
            return new BooleanArrayList(Arrays.copyOf(this.f4746Y, i2), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
