package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public final class IntegerArrayAdapter implements ArrayAdapterInterface<int[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final int a() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final int b(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final String getTag() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final Object newArray(int i2) {
        return new int[i2];
    }
}
