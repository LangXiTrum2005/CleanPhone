package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2154z0 extends AbstractC2106b implements RandomAccess {
    private static final C2154z0 EMPTY_LIST;
    private Object[] array;
    private int size;

    static {
        C2154z0 c2154z0 = new C2154z0(new Object[0], 0);
        EMPTY_LIST = c2154z0;
        c2154z0.makeImmutable();
    }

    public C2154z0() {
        this(new Object[10], 0);
    }

    private static <E> E[] createArray(int i) {
        return (E[]) new Object[i];
    }

    public static <E> C2154z0 emptyList() {
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

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i = this.size;
        Object[] objArr = this.array;
        if (i == objArr.length) {
            this.array = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.array;
        int i2 = this.size;
        this.size = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public Object remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        Object[] objArr = this.array;
        Object obj = objArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        ensureIsMutable();
        ensureIndexInRange(i);
        Object[] objArr = this.array;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private C2154z0(Object[] objArr, int i) {
        this.array = objArr;
        this.size = i;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.DoubleList
    public C2154z0 mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new C2154z0(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2106b, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i >= 0 && i <= (i2 = this.size)) {
            Object[] objArr = this.array;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArrCreateArray = createArray(AbstractC3950lJ.D(i2, 3, 2, 1));
                System.arraycopy(this.array, 0, objArrCreateArray, 0, i);
                System.arraycopy(this.array, i, objArrCreateArray, i + 1, this.size - i);
                this.array = objArrCreateArray;
            }
            this.array[i] = obj;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }
}
