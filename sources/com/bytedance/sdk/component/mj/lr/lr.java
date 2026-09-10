package com.bytedance.sdk.component.mj.lr;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class lr<V> extends FutureTask<V> implements Comparable<lr<V>> {
    private int lr;
    private int ri;

    public lr(Callable<V> callable, int i, int i2) {
        super(callable);
        this.ri = i == -1 ? 5 : i;
        this.lr = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(lr lrVar) {
        if (ri() < lrVar.ri()) {
            return 1;
        }
        return ri() > lrVar.ri() ? -1 : 0;
    }

    public int ri() {
        return this.ri;
    }
}
