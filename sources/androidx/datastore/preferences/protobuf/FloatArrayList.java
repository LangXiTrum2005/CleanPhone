package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public float[] f4846Y;
    public int Z;

    static {
        new FloatArrayList(new float[0], 0, false);
    }

    public FloatArrayList(float[] fArr, int i2, boolean z2) {
        super(z2);
        this.f4846Y = fArr;
        this.Z = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.Z)) {
            StringBuilder sbU = android.support.v4.media.a.u(i2, "Index:", ", Size:");
            sbU.append(this.Z);
            throw new IndexOutOfBoundsException(sbU.toString());
        }
        float[] fArr = this.f4846Y;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[android.support.v4.media.a.B(i3, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f4846Y, i2, fArr2, i2 + 1, this.Z - i2);
            this.f4846Y = fArr2;
        }
        this.f4846Y[i2] = fFloatValue;
        this.Z++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = Internal.f4857a;
        collection.getClass();
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i2 = floatArrayList.Z;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.Z;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f4846Y;
        if (i4 > fArr.length) {
            this.f4846Y = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(floatArrayList.f4846Y, 0, this.f4846Y, this.Z, floatArrayList.Z);
        this.Z = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addFloat(float f) {
        a();
        int i2 = this.Z;
        float[] fArr = this.f4846Y;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[android.support.v4.media.a.B(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f4846Y = fArr2;
        }
        float[] fArr3 = this.f4846Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        fArr3[i3] = f;
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
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.Z != floatArrayList.Z) {
            return false;
        }
        float[] fArr = floatArrayList.f4846Y;
        for (int i2 = 0; i2 < this.Z; i2++) {
            if (Float.floatToIntBits(this.f4846Y[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        return Float.valueOf(getFloat(i2));
    }

    public final float getFloat(int i2) {
        c(i2);
        return this.f4846Y[i2];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.Z; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f4846Y[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.Z;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f4846Y[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        a();
        c(i2);
        float[] fArr = this.f4846Y;
        float f = fArr[i2];
        int i3 = this.Z;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.Z--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f4846Y;
        System.arraycopy(fArr, i3, fArr, i2, this.Z - i3);
        this.Z -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        c(i2);
        float[] fArr = this.f4846Y;
        float f = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.Z;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList, androidx.datastore.preferences.protobuf.Internal.BooleanList
    public final Internal.FloatList mutableCopyWithCapacity(int i2) {
        if (i2 >= this.Z) {
            return new FloatArrayList(Arrays.copyOf(this.f4846Y, i2), this.Z, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
