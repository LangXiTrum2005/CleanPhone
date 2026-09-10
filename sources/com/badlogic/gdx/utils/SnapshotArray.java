package com.badlogic.gdx.utils;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class SnapshotArray<T> extends Array<T> {
    private T[] recycled;
    private T[] snapshot;
    private int snapshots;

    public SnapshotArray() {
    }

    private void modified() {
        T[] tArr;
        T[] tArr2 = this.snapshot;
        if (tArr2 == null || tArr2 != (tArr = this.items)) {
            return;
        }
        T[] tArr3 = this.recycled;
        if (tArr3 != null) {
            int length = tArr3.length;
            int i = this.size;
            if (length >= i) {
                System.arraycopy(tArr, 0, tArr3, 0, i);
                this.items = this.recycled;
                this.recycled = null;
                return;
            }
        }
        resize(tArr.length);
    }

    public static <T> SnapshotArray<T> with(T... tArr) {
        return new SnapshotArray<>(tArr);
    }

    public T[] begin() {
        modified();
        T[] tArr = this.items;
        this.snapshot = tArr;
        this.snapshots++;
        return tArr;
    }

    @Override // com.badlogic.gdx.utils.Array
    public void clear() {
        modified();
        super.clear();
    }

    public void end() {
        int iMax = Math.max(0, this.snapshots - 1);
        this.snapshots = iMax;
        T[] tArr = this.snapshot;
        if (tArr == null) {
            return;
        }
        if (tArr != this.items && iMax == 0) {
            this.recycled = tArr;
            int length = tArr.length;
            for (int i = 0; i < length; i++) {
                this.recycled[i] = null;
            }
        }
        this.snapshot = null;
    }

    @Override // com.badlogic.gdx.utils.Array
    public void insert(int i, T t) {
        modified();
        super.insert(i, t);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void insertRange(int i, int i2) {
        modified();
        super.insertRange(i, i2);
    }

    @Override // com.badlogic.gdx.utils.Array
    public T pop() {
        modified();
        return (T) super.pop();
    }

    @Override // com.badlogic.gdx.utils.Array
    public boolean removeAll(Array<? extends T> array, boolean z) {
        modified();
        return super.removeAll(array, z);
    }

    @Override // com.badlogic.gdx.utils.Array
    public T removeIndex(int i) {
        modified();
        return (T) super.removeIndex(i);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void removeRange(int i, int i2) {
        modified();
        super.removeRange(i, i2);
    }

    @Override // com.badlogic.gdx.utils.Array
    public boolean removeValue(T t, boolean z) {
        modified();
        return super.removeValue(t, z);
    }

    @Override // com.badlogic.gdx.utils.Array
    public int replaceAll(@Null T t, boolean z, @Null T t2) {
        modified();
        return super.replaceAll(t, z, t2);
    }

    @Override // com.badlogic.gdx.utils.Array
    public boolean replaceFirst(@Null T t, boolean z, T t2) {
        modified();
        return super.replaceFirst(t, z, t2);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void reverse() {
        modified();
        super.reverse();
    }

    @Override // com.badlogic.gdx.utils.Array
    public void set(int i, T t) {
        modified();
        super.set(i, t);
    }

    @Override // com.badlogic.gdx.utils.Array
    public T[] setSize(int i) {
        modified();
        return (T[]) super.setSize(i);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void shuffle() {
        modified();
        super.shuffle();
    }

    @Override // com.badlogic.gdx.utils.Array
    public void sort() {
        modified();
        super.sort();
    }

    @Override // com.badlogic.gdx.utils.Array
    public void swap(int i, int i2) {
        modified();
        super.swap(i, i2);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void truncate(int i) {
        modified();
        super.truncate(i);
    }

    public SnapshotArray(Array array) {
        super(array);
    }

    public SnapshotArray(boolean z, int i, Class cls) {
        super(z, i, cls);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void sort(Comparator<? super T> comparator) {
        modified();
        super.sort(comparator);
    }

    public SnapshotArray(boolean z, int i) {
        super(z, i);
    }

    public SnapshotArray(boolean z, T[] tArr, int i, int i2) {
        super(z, tArr, i, i2);
    }

    public SnapshotArray(Class cls) {
        super(cls);
    }

    public SnapshotArray(int i) {
        super(i);
    }

    public SnapshotArray(T[] tArr) {
        super(tArr);
    }
}
