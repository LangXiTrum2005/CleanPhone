package com.squareup.picasso;

/* JADX INFO: loaded from: classes6.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    final int index;

    MemoryPolicy(int i2) {
        this.index = i2;
    }

    public static boolean shouldReadFromMemoryCache(int i2) {
        return (i2 & NO_CACHE.index) == 0;
    }

    public static boolean shouldWriteToMemoryCache(int i2) {
        return (i2 & NO_STORE.index) == 0;
    }
}
