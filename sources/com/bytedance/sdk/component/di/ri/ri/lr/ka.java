package com.bytedance.sdk.component.di.ri.ri.lr;

import com.bytedance.sdk.component.di.ri.ka.ri;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ka<T extends com.bytedance.sdk.component.di.ri.ka.ri> {
    private Queue<String> ik;
    private String ka;
    private Queue<T> lr = new ConcurrentLinkedQueue();
    private com.bytedance.sdk.component.di.ri.ka.lr.ri ri;

    public ka(com.bytedance.sdk.component.di.ri.ka.lr.ri riVar, Queue<String> queue, String str) {
        this.ri = riVar;
        this.ik = queue;
        this.ka = str;
    }

    public synchronized boolean lr(int i, int i2) {
        int size = this.lr.size();
        int iRi = this.ri.ri();
        if (i != 2 && i != 1) {
            return size >= iRi;
        }
        if (com.bytedance.sdk.component.di.ri.ik.ri.ik()) {
            return size > 0;
        }
        return size >= iRi;
    }

    public void ri(T t) {
        Queue<T> queue = this.lr;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized List<com.bytedance.sdk.component.di.ri.ka.ri> ri(int i, int i2) {
        if (!lr(i, i2)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.ri.ri());
        do {
            T tPoll = this.lr.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.ri.lr());
        return arrayList;
    }

    public synchronized void ri(int i, List<T> list) {
        try {
            if (i != -1 && i != 200 && i != 509) {
                this.lr.addAll(list);
            } else {
                this.lr.size();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
