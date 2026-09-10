package com.bytedance.sdk.component.OY;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public class ebl<V> extends FutureTask<V> implements Comparable<ebl<V>> {
    private int LD;
    private int Lxb;

    public ebl(Callable<V> callable, int i, int i2) {
        super(callable);
        this.Lxb = i == -1 ? 5 : i;
        this.LD = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public int compareTo(ebl eblVar) {
        if (Lxb() < eblVar.Lxb()) {
            return 1;
        }
        return Lxb() > eblVar.Lxb() ? -1 : 0;
    }

    public int Lxb() {
        return this.Lxb;
    }

    public ebl(Runnable runnable, V v, int i, int i2) {
        super(runnable, v);
        this.Lxb = i == -1 ? 5 : i;
        this.LD = i2;
    }
}
