package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EV;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2131n0 extends AbstractC2106b implements Internal.LongList, RandomAccess, EV {
    private static final C2131n0 EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        C2131n0 c2131n0 = new C2131n0(new long[0], 0);
        EMPTY_LIST = c2131n0;
        c2131n0.makeImmutable();
    }

    public C2131n0() {
        this(new long[10], 0);
    }

    public static C2131n0 emptyList() {
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
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C2131n0)) {
            return super.addAll(collection);
        }
        C2131n0 c2131n0 = (C2131n0) collection;
        int i = c2131n0.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.array;
        if (i3 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c2131n0.array, 0, this.array, this.size, c2131n0.size);
        this.size = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j) {
        ensureIsMutable();
        int i = this.size;
        long[] jArr = this.array;
        if (i == jArr.length) {
            long[] jArr2 = new long[AbstractC3950lJ.D(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
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
        if (!(obj instanceof C2131n0)) {
            return super.equals(obj);
        }
        C2131n0 c2131n0 = (C2131n0) obj;
        if (this.size != c2131n0.size) {
            return false;
        }
        long[] jArr = c2131n0.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i = 0; i < this.size; i++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.array[i]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.array[i] == jLongValue) {
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
        long[] jArr = this.array;
        System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i, long j) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C2131n0(long[] jArr, int i) {
        this.array = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i) {
        return Long.valueOf(getLong(i));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.DoubleList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i) {
        if (i >= this.size) {
            return new C2131n0(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public Long remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        long[] jArr = this.array;
        long j = jArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public Long set(int i, Long l) {
        return Long.valueOf(setLong(i, l.longValue()));
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l) {
        addLong(l.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public void add(int i, Long l) {
        addLong(i, l.longValue());
    }

    private void addLong(int i, long j) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.size)) {
            long[] jArr = this.array;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[AbstractC3950lJ.D(i2, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.array, i, jArr2, i + 1, this.size - i);
                this.array = jArr2;
            }
            this.array[i] = j;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
