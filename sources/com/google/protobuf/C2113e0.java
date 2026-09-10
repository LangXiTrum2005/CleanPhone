package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EV;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2113e0 extends AbstractC2106b implements Internal.IntList, RandomAccess, EV {
    private static final C2113e0 EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        C2113e0 c2113e0 = new C2113e0(new int[0], 0);
        EMPTY_LIST = c2113e0;
        c2113e0.makeImmutable();
    }

    public C2113e0() {
        this(new int[10], 0);
    }

    public static C2113e0 emptyList() {
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
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C2113e0)) {
            return super.addAll(collection);
        }
        C2113e0 c2113e0 = (C2113e0) collection;
        int i = c2113e0.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.array;
        if (i3 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c2113e0.array, 0, this.array, this.size, c2113e0.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i) {
        ensureIsMutable();
        int i2 = this.size;
        int[] iArr = this.array;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[AbstractC3950lJ.D(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
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
        if (!(obj instanceof C2113e0)) {
            return super.equals(obj);
        }
        C2113e0 c2113e0 = (C2113e0) obj;
        if (this.size != c2113e0.size) {
            return false;
        }
        int[] iArr = c2113e0.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == iIntValue) {
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
        int[] iArr = this.array;
        System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i, int i2) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int[] iArr = this.array;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C2113e0(int[] iArr, int i) {
        this.array = iArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.DoubleList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i) {
        if (i >= this.size) {
            return new C2113e0(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public Integer remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        int[] iArr = this.array;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public Integer set(int i, Integer num) {
        return Integer.valueOf(setInt(i, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public void add(int i, Integer num) {
        addInt(i, num.intValue());
    }

    private void addInt(int i, int i2) {
        int i3;
        ensureIsMutable();
        if (i >= 0 && i <= (i3 = this.size)) {
            int[] iArr = this.array;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[AbstractC3950lJ.D(i3, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.array, i, iArr2, i + 1, this.size - i);
                this.array = iArr2;
            }
            this.array[i] = i2;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
