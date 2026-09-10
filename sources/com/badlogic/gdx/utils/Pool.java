package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public abstract class Pool<T> {
    private final Array<T> freeObjects;
    public final int max;
    public int peak;

    public interface Poolable {
        void reset();
    }

    public Pool() {
        this(16, Integer.MAX_VALUE);
    }

    public void clear() {
        Array<T> array = this.freeObjects;
        int i = array.size;
        for (int i2 = 0; i2 < i; i2++) {
            discard(array.get(i2));
        }
        array.clear();
    }

    public void discard(T t) {
        reset(t);
    }

    public void fill(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Array<T> array = this.freeObjects;
            if (array.size < this.max) {
                array.add(newObject());
            }
        }
        this.peak = Math.max(this.peak, this.freeObjects.size);
    }

    public void free(T t) {
        if (t == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        Array<T> array = this.freeObjects;
        if (array.size >= this.max) {
            discard(t);
            return;
        }
        array.add(t);
        this.peak = Math.max(this.peak, this.freeObjects.size);
        reset(t);
    }

    public void freeAll(Array<T> array) {
        if (array == null) {
            throw new IllegalArgumentException("objects cannot be null.");
        }
        Array<T> array2 = this.freeObjects;
        int i = this.max;
        int i2 = array.size;
        for (int i3 = 0; i3 < i2; i3++) {
            T t = array.get(i3);
            if (t != null) {
                if (array2.size < i) {
                    array2.add(t);
                    reset(t);
                } else {
                    discard(t);
                }
            }
        }
        this.peak = Math.max(this.peak, array2.size);
    }

    public int getFree() {
        return this.freeObjects.size;
    }

    public abstract T newObject();

    public T obtain() {
        Array<T> array = this.freeObjects;
        return array.size == 0 ? newObject() : array.pop();
    }

    public void reset(T t) {
        if (t instanceof Poolable) {
            ((Poolable) t).reset();
        }
    }

    public Pool(int i) {
        this(i, Integer.MAX_VALUE);
    }

    public Pool(int i, int i2) {
        this.freeObjects = new Array<>(false, i);
        this.max = i2;
    }
}
