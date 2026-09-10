package com.badlogic.gdx.utils;

/* JADX INFO: loaded from: classes.dex */
public class Pools {
    private static final ObjectMap<Class, Pool> typePools = new ObjectMap<>();

    private Pools() {
    }

    public static void free(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        Pool pool = typePools.get(obj.getClass());
        if (pool == null) {
            return;
        }
        pool.free(obj);
    }

    public static void freeAll(Array array) {
        freeAll(array, false);
    }

    public static <T> Pool<T> get(Class<T> cls, int i) {
        ObjectMap<Class, Pool> objectMap = typePools;
        Pool<T> pool = objectMap.get(cls);
        if (pool != null) {
            return pool;
        }
        ReflectionPool reflectionPool = new ReflectionPool(cls, 4, i);
        objectMap.put(cls, reflectionPool);
        return reflectionPool;
    }

    public static <T> T obtain(Class<T> cls) {
        return (T) get(cls).obtain();
    }

    public static <T> void set(Class<T> cls, Pool<T> pool) {
        typePools.put(cls, pool);
    }

    public static void freeAll(Array array, boolean z) {
        if (array == null) {
            throw new IllegalArgumentException("objects cannot be null.");
        }
        int i = array.size;
        Pool pool = null;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = array.get(i2);
            if (obj != null && (pool != null || (pool = typePools.get(obj.getClass())) != null)) {
                pool.free(obj);
                if (!z) {
                    pool = null;
                }
            }
        }
    }

    public static <T> Pool<T> get(Class<T> cls) {
        return get(cls, 100);
    }
}
