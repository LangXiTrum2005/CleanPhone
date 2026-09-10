package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EV;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2118h extends AbstractC2106b implements Internal.BooleanList, RandomAccess, EV {
    private static final C2118h EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        C2118h c2118h = new C2118h(new boolean[0], 0);
        EMPTY_LIST = c2118h;
        c2118h.makeImmutable();
    }

    public C2118h() {
        this(new boolean[10], 0);
    }

    public static C2118h emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        StringBuilder sbQ = AbstractC5044xl.q("Index:", i, ", Size:");
        sbQ.append(this.size);
        return sbQ.toString();
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C2118h)) {
            return super.addAll(collection);
        }
        C2118h c2118h = (C2118h) collection;
        int i = c2118h.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.array;
        if (i3 > zArr.length) {
            this.array = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c2118h.array, 0, this.array, this.size, c2118h.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public void addBoolean(boolean z) {
        ensureIsMutable();
        int i = this.size;
        boolean[] zArr = this.array;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[AbstractC3950lJ.D(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2118h)) {
            return super.equals(obj);
        }
        C2118h c2118h = (C2118h) obj;
        if (this.size != c2118h.size) {
            return false;
        }
        boolean[] zArr = c2118h.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean getBoolean(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i = 0; i < this.size; i++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.array[i]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == zBooleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ensureIsMutable();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.array;
        System.arraycopy(zArr, i2, zArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean[] zArr = this.array;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C2118h(boolean[] zArr, int i) {
        this.array = zArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.DoubleList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i) {
        if (i >= this.size) {
            return new C2118h(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public Boolean remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean[] zArr = this.array;
        boolean z = zArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public void add(int i, Boolean bool) {
        addBoolean(i, bool.booleanValue());
    }

    private void addBoolean(int i, boolean z) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.size)) {
            boolean[] zArr = this.array;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[AbstractC3950lJ.D(i2, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.array, i, zArr2, i + 1, this.size - i);
                this.array = zArr2;
            }
            this.array[i] = z;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
