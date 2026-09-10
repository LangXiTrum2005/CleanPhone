package com.bytedance.sdk.component.mo.qdl.qdl.ud;

import com.bytedance.sdk.component.mo.qdl.mml.qdl;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public abstract class mml<T extends com.bytedance.sdk.component.mo.qdl.mml.qdl> {
    private Queue<String> lnr;
    private String mml;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdl;
    private Queue<T> ud = new ConcurrentLinkedQueue();

    public mml(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar, Queue<String> queue, String str) {
        this.qdl = qdlVar;
        this.lnr = queue;
        this.mml = str;
    }

    public void qdl(T t) {
        Queue<T> queue = this.ud;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    public synchronized boolean ud(int i2, int i3) {
        int size = this.ud.size();
        int iQdl = this.qdl.qdl();
        if (i2 != 2 && i2 != 1) {
            return size >= iQdl;
        }
        if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.lnr()) {
            return size > 0;
        }
        return size >= iQdl;
    }

    public synchronized List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int i2, int i3) {
        if (!ud(i2, i3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.qdl.qdl());
        do {
            T tPoll = this.ud.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.qdl.ud());
        return arrayList;
    }

    public synchronized void qdl(int i2, List<T> list) {
        try {
            if (i2 != -1 && i2 != 200 && i2 != 509) {
                this.ud.addAll(list);
            } else {
                this.ud.size();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
