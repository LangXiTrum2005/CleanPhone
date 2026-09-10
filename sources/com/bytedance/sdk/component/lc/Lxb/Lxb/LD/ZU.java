package com.bytedance.sdk.component.lc.Lxb.Lxb.LD;

import com.bytedance.sdk.component.lc.Lxb.ZU.Lxb;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZU<T extends com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> {
    private Queue<T> LD = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb Lxb;
    private String ZU;
    private Queue<String> lk;

    public ZU(com.bytedance.sdk.component.lc.Lxb.ZU.LD.Lxb lxb, Queue<String> queue, String str) {
        this.Lxb = lxb;
        this.lk = queue;
        this.ZU = str;
    }

    public synchronized boolean LD(int i, int i2) {
        int size = this.LD.size();
        int iLxb = this.Lxb.Lxb();
        if (i != 2 && i != 1) {
            return size >= iLxb;
        }
        if (com.bytedance.sdk.component.lc.Lxb.lk.Lxb.lk()) {
            return size > 0;
        }
        return size >= iLxb;
    }

    public void Lxb(T t) {
        Queue<T> queue = this.LD;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized List<com.bytedance.sdk.component.lc.Lxb.ZU.Lxb> Lxb(int i, int i2) {
        if (!LD(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.Lxb.Lxb());
        do {
            T tPoll = this.LD.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.Lxb.LD());
        return arrayList;
    }

    public synchronized void Lxb(int i, List<T> list) {
        try {
            if (i != -1 && i != 200 && i != 509) {
                this.LD.addAll(list);
            } else {
                this.LD.size();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
