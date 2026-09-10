package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    public static final IntArrayList e0 = new IntArrayList(new int[0], 0, false);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int[] f4856Y;
    public int Z;

    public IntArrayList(int[] iArr, int i2, boolean z2) {
        super(z2);
        this.f4856Y = iArr;
        this.Z = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.Z)) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Index:", ", Size:");
            sbU.append(this.Z);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        int[] iArr = this.f4856Y;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[android.support.v4.media.a.B(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f4856Y, i2, iArr2, i2 + 1, this.Z - i2);
            this.f4856Y = iArr2;
        }
        this.f4856Y[i2] = iIntValue;
        this.Z++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f4857a;
        collection.getClass();
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i2 = intArrayList.Z;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.Z;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f4856Y;
        if (i4 > iArr.length) {
            this.f4856Y = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(intArrayList.f4856Y, 0, this.f4856Y, this.Z, intArrayList.Z);
        this.Z = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i2) {
        a();
        int i3 = this.Z;
        int[] iArr = this.f4856Y;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[android.support.v4.media.a.B(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f4856Y = iArr2;
        }
        int[] iArr3 = this.f4856Y;
        int i4 = this.Z;
        this.Z = i4 + 1;
        iArr3[i4] = i2;
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
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.Z != intArrayList.Z) {
            return false;
        }
        int[] iArr = intArrayList.f4856Y;
        for (int i2 = 0; i2 < this.Z; i2++) {
            if (this.f4856Y[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return Integer.valueOf(getInt(i2));
    }

    public final int getInt(int i2) {
        c(i2);
        return this.f4856Y[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.Z; i3++) {
            i2 = (i2 * 31) + this.f4856Y[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f4856Y[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        int[] iArr = this.f4856Y;
        int i3 = iArr[i2];
        int i4 = this.Z;
        if (i2 < i4 - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i4 - i2) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f4856Y;
        System.arraycopy(iArr, i3, iArr, i2, this.Z - i3);
        this.Z -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        c(i2);
        int[] iArr = this.f4856Y;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final Internal.IntList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.Z) {
            return new IntArrayList(Arrays.copyOf(this.f4856Y, i2), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
