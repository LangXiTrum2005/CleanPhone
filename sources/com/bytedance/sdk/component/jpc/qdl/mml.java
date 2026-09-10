package com.bytedance.sdk.component.jpc.qdl;

import com.bytedance.sdk.component.jpc.qdl.lnr;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class mml<T extends lnr> {
    private int qdl;
    private BlockingQueue<T> ud = new LinkedBlockingQueue();

    private mml(int i2) {
        this.qdl = i2;
    }

    public static mml qdl(int i2) {
        return new mml(i2);
    }

    public T qdl() {
        return this.ud.poll();
    }

    public boolean qdl(T t) {
        if (t == null) {
            return false;
        }
        t.qdl();
        if (this.ud.size() >= this.qdl) {
            return false;
        }
        return this.ud.offer(t);
    }
}
