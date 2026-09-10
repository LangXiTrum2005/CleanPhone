package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public long[] f4871Y;
    public int Z;

    static {
        new LongArrayList(new long[0], 0, false);
    }

    public LongArrayList(long[] jArr, int i2, boolean z2) {
        super(z2);
        this.f4871Y = jArr;
        this.Z = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.Z)) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Index:", ", Size:");
            sbU.append(this.Z);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        long[] jArr = this.f4871Y;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[android.support.v4.media.a.B(i3, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f4871Y, i2, jArr2, i2 + 1, this.Z - i2);
            this.f4871Y = jArr2;
        }
        this.f4871Y[i2] = jLongValue;
        this.Z++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f4857a;
        collection.getClass();
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i2 = longArrayList.Z;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.Z;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f4871Y;
        if (i4 > jArr.length) {
            this.f4871Y = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(longArrayList.f4871Y, 0, this.f4871Y, this.Z, longArrayList.Z);
        this.Z = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j) {
        a();
        int i2 = this.Z;
        long[] jArr = this.f4871Y;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[android.support.v4.media.a.B(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f4871Y = jArr2;
        }
        long[] jArr3 = this.f4871Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        jArr3[i3] = j;
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
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.Z != longArrayList.Z) {
            return false;
        }
        long[] jArr = longArrayList.f4871Y;
        for (int i2 = 0; i2 < this.Z; i2++) {
            if (this.f4871Y[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return Long.valueOf(getLong(i2));
    }

    public final long getLong(int i2) {
        c(i2);
        return this.f4871Y[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            iB = (iB * 31) + Internal.b(this.f4871Y[i2]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f4871Y[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        long[] jArr = this.f4871Y;
        long j = jArr[i2];
        int i3 = this.Z;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f4871Y;
        System.arraycopy(jArr, i3, jArr, i2, this.Z - i3);
        this.Z -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        c(i2);
        long[] jArr = this.f4871Y;
        long j = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final Internal.LongList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.Z) {
            return new LongArrayList(Arrays.copyOf(this.f4871Y, i2), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
