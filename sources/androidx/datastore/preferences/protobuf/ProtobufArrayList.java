package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    public static final ProtobufArrayList e0 = new ProtobufArrayList(new Object[0], 0, false);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Object[] f4907Y;
    public int Z;

    public ProtobufArrayList(Object[] objArr, int i2, boolean z2) {
        super(z2);
        this.f4907Y = objArr;
        this.Z = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i2 = this.Z;
        Object[] objArr = this.f4907Y;
        if (i2 == objArr.length) {
            this.f4907Y = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4907Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        objArr2[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.Z) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Index:", ", Size:");
            sbU.append(this.Z);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        c(i2);
        return this.f4907Y[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.Z) {
            return new ProtobufArrayList(Arrays.copyOf(this.f4907Y, i2), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        Object[] objArr = this.f4907Y;
        Object obj = objArr[i2];
        int i3 = this.Z;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        a();
        c(i2);
        Object[] objArr = this.f4907Y;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.Z)) {
            Object[] objArr = this.f4907Y;
            if (i3 < objArr.length) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i3 - i2);
            } else {
                Object[] objArr2 = new Object[android.support.v4.media.a.B(i3, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i2);
                System.arraycopy(this.f4907Y, i2, objArr2, i2 + 1, this.Z - i2);
                this.f4907Y = objArr2;
            }
            this.f4907Y[i2] = obj;
            this.Z++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbU = android.support.v4.media.a.u(i2, "Index:", ", Size:");
        sbU.append(this.Z);
        throw new IndexOutOfBoundsException(sbU.toString());
    }
}
