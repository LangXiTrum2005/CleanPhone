package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u21 implements t21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f20605b = new PriorityQueue();

    public u21(Executor executor) {
        this.f20604a = executor;
    }

    @Override // com.google.android.gms.internal.ads.t21
    public final void a(Runnable runnable, long j10) {
        if (j10 <= 0) {
            this.f20604a.execute(runnable);
            return;
        }
        v21 v21Var = new v21(runnable, System.currentTimeMillis() + j10);
        PriorityQueue priorityQueue = this.f20605b;
        synchronized (priorityQueue) {
            priorityQueue.add(v21Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.t21
    public final void zzb() {
        PriorityQueue priorityQueue = this.f20605b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (v21 v21Var = (v21) priorityQueue.peek(); v21Var != null && v21Var.f21012b <= jCurrentTimeMillis; v21Var = (v21) priorityQueue.peek()) {
                    priorityQueue2.add(v21Var);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.f20604a.execute(((v21) it.next()).f21011a);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
