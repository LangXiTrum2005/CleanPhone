package com.bytedance.sdk.component.jpc;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public class wd<V> extends FutureTask<V> implements Comparable<wd<V>> {
    private int qdl;
    private int ud;

    public wd(Callable<V> callable, int i2, int i3) {
        super(callable);
        this.qdl = i2 == -1 ? 5 : i2;
        this.ud = i3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(wd wdVar) {
        if (qdl() < wdVar.qdl()) {
            return 1;
        }
        return qdl() > wdVar.qdl() ? -1 : 0;
    }

    public int qdl() {
        return this.qdl;
    }
}
