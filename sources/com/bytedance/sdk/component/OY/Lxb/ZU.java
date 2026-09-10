package com.bytedance.sdk.component.OY.Lxb;

import com.bytedance.sdk.component.OY.Lxb.lk;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class ZU<T extends lk> {
    private BlockingQueue<T> LD = new LinkedBlockingQueue();
    private int Lxb;

    private ZU(int i) {
        this.Lxb = i;
    }

    public static ZU Lxb(int i) {
        return new ZU(i);
    }

    public T Lxb() {
        return this.LD.poll();
    }

    public boolean Lxb(T t) {
        if (t == null) {
            return false;
        }
        t.Lxb();
        if (this.LD.size() >= this.Lxb) {
            return false;
        }
        return this.LD.offer(t);
    }
}
