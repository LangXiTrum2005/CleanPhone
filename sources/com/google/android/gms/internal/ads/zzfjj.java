package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfjj {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgyw zzc;

    public zzfjj(Callable callable, zzgyw zzgywVar) {
        this.zzb = callable;
        this.zzc = zzgywVar;
    }

    public final synchronized void zza(int i2) {
        Deque deque = this.zza;
        int size = i2 - deque.size();
        for (int i3 = 0; i3 < size; i3++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    public final synchronized ListenableFuture zzb() {
        zza(1);
        return (ListenableFuture) this.zza.poll();
    }

    public final synchronized void zzc(ListenableFuture listenableFuture) {
        this.zza.addFirst(listenableFuture);
    }
}
