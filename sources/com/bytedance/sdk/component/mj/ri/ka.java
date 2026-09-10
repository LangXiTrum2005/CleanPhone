package com.bytedance.sdk.component.mj.ri;

import com.bytedance.sdk.component.mj.ri.ik;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class ka<T extends ik> {
    private BlockingQueue<T> lr = new LinkedBlockingQueue();
    private int ri;

    private ka(int i) {
        this.ri = i;
    }

    public static ka ri(int i) {
        return new ka(i);
    }

    public T ri() {
        return this.lr.poll();
    }

    public boolean ri(T t) {
        if (t == null) {
            return false;
        }
        t.ri();
        if (this.lr.size() >= this.ri) {
            return false;
        }
        return this.lr.offer(t);
    }
}
