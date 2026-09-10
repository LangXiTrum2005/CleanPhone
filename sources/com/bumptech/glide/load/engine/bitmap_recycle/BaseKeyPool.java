package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.bumptech.glide.util.Util;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseKeyPool<T extends Poolable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f12482a;

    public BaseKeyPool() {
        char[] cArr = Util.f12851a;
        this.f12482a = new ArrayDeque(20);
    }

    public abstract Poolable a();

    public final Poolable b() {
        Poolable poolable = (Poolable) this.f12482a.poll();
        return poolable == null ? a() : poolable;
    }

    public final void c(Poolable poolable) {
        ArrayDeque arrayDeque = this.f12482a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(poolable);
        }
    }
}
