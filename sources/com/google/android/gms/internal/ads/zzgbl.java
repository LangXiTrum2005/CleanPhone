package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbl implements zzgbj {
    private final Executor zza;
    private final Queue zzb = new PriorityQueue();

    public zzgbl(Executor executor, zzfzm zzfzmVar) {
        this.zza = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzgbj
    public final void zza(Runnable runnable, long j) {
        if (j <= 0) {
            this.zza.execute(runnable);
            return;
        }
        zzgbn zzgbnVar = new zzgbn(runnable, System.currentTimeMillis() + j);
        Queue queue = this.zzb;
        synchronized (queue) {
            queue.add(zzgbnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbj
    public final void zzb() {
        Queue queue = this.zzb;
        synchronized (queue) {
            try {
                if (queue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (zzgbn zzgbnVar = (zzgbn) queue.peek(); zzgbnVar != null && zzgbnVar.zzb <= jCurrentTimeMillis; zzgbnVar = (zzgbn) queue.peek()) {
                    priorityQueue.add(zzgbnVar);
                }
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    try {
                        this.zza.execute(((zzgbn) it.next()).zza);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
