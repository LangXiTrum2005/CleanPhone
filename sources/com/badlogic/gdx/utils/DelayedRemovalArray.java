package com.badlogic.gdx.utils;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class DelayedRemovalArray<T> extends Array<T> {
    private int clear;
    private int iterating;
    private IntArray remove;

    public DelayedRemovalArray() {
        this.remove = new IntArray(0);
    }

    private void remove(int i) {
        if (i < this.clear) {
            return;
        }
        int i2 = this.remove.size;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.remove.get(i3);
            if (i == i4) {
                return;
            }
            if (i < i4) {
                this.remove.insert(i3, i);
                return;
            }
        }
        this.remove.add(i);
    }

    public static <T> DelayedRemovalArray<T> with(T... tArr) {
        return new DelayedRemovalArray<>(tArr);
    }

    public void begin() {
        this.iterating++;
    }

    @Override // com.badlogic.gdx.utils.Array
    public void clear() {
        if (this.iterating > 0) {
            this.clear = this.size;
        } else {
            super.clear();
        }
    }

    public void end() {
        int i = this.iterating;
        if (i == 0) {
            throw new IllegalStateException("begin must be called before end.");
        }
        int i2 = i - 1;
        this.iterating = i2;
        if (i2 == 0) {
            int i3 = this.clear;
            if (i3 <= 0 || i3 != this.size) {
                int i4 = this.remove.size;
                for (int i5 = 0; i5 < i4; i5++) {
                    int iPop = this.remove.pop();
                    if (iPop >= this.clear) {
                        removeIndex(iPop);
                    }
                }
                for (int i6 = this.clear - 1; i6 >= 0; i6--) {
                    removeIndex(i6);
                }
            } else {
                this.remove.clear();
                clear();
            }
            this.clear = 0;
        }
    }

    @Override // com.badlogic.gdx.utils.Array
    public void insert(int i, T t) {
        if (this.iterating > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.insert(i, t);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void insertRange(int i, int i2) {
        if (this.iterating > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.insertRange(i, i2);
    }

    @Override // com.badlogic.gdx.utils.Array
    public T pop() {
        if (this.iterating <= 0) {
            return (T) super.pop();
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override // com.badlogic.gdx.utils.Array
    public T removeIndex(int i) {
        if (this.iterating <= 0) {
            return (T) super.removeIndex(i);
        }
        remove(i);
        return get(i);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void removeRange(int i, int i2) {
        if (this.iterating <= 0) {
            super.removeRange(i, i2);
            return;
        }
        while (i2 >= i) {
            remove(i2);
            i2--;
        }
    }

    @Override // com.badlogic.gdx.utils.Array
    public boolean removeValue(T t, boolean z) {
        if (this.iterating <= 0) {
            return super.removeValue(t, z);
        }
        int iIndexOf = indexOf(t, z);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // com.badlogic.gdx.utils.Array
    public int replaceAll(@Null T t, boolean z, @Null T t2) {
        if (this.iterating <= 0) {
            return super.replaceAll(t, z, t2);
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override // com.badlogic.gdx.utils.Array
    public boolean replaceFirst(@Null T t, boolean z, T t2) {
        if (this.iterating <= 0) {
            return super.replaceFirst(t, z, t2);
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override // com.badlogic.gdx.utils.Array
    public void reverse() {
        if (this.iterating > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.reverse();
    }

    @Override // com.badlogic.gdx.utils.Array
    public void set(int i, T t) {
        if (this.iterating > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.set(i, t);
    }

    @Override // com.badlogic.gdx.utils.Array
    public T[] setSize(int i) {
        if (this.iterating <= 0) {
            return (T[]) super.setSize(i);
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    @Override // com.badlogic.gdx.utils.Array
    public void shuffle() {
        if (this.iterating > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.shuffle();
    }

    @Override // com.badlogic.gdx.utils.Array
    public void sort() {
        if (this.iterating > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.sort();
    }

    @Override // com.badlogic.gdx.utils.Array
    public void swap(int i, int i2) {
        if (this.iterating > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.swap(i, i2);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void truncate(int i) {
        if (this.iterating > 0) {
            throw new IllegalStateException("Invalid between begin/end.");
        }
        super.truncate(i);
    }

    public DelayedRemovalArray(Array array) {
        super(array);
        this.remove = new IntArray(0);
    }

    @Override // com.badlogic.gdx.utils.Array
    public void sort(Comparator<? super T> comparator) {
        if (this.iterating <= 0) {
            super.sort(comparator);
            return;
        }
        throw new IllegalStateException("Invalid between begin/end.");
    }

    public DelayedRemovalArray(boolean z, int i, Class cls) {
        super(z, i, cls);
        this.remove = new IntArray(0);
    }

    public DelayedRemovalArray(boolean z, int i) {
        super(z, i);
        this.remove = new IntArray(0);
    }

    public DelayedRemovalArray(boolean z, T[] tArr, int i, int i2) {
        super(z, tArr, i, i2);
        this.remove = new IntArray(0);
    }

    public DelayedRemovalArray(Class cls) {
        super(cls);
        this.remove = new IntArray(0);
    }

    public DelayedRemovalArray(int i) {
        super(i);
        this.remove = new IntArray(0);
    }

    public DelayedRemovalArray(T[] tArr) {
        super(tArr);
        this.remove = new IntArray(0);
    }
}
