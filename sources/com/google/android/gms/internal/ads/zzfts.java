package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfts {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc = new ArrayDeque();
    private zzftr zzd = null;

    public zzfts() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void zzc() {
        zzftr zzftrVar = (zzftr) this.zzc.poll();
        this.zzd = zzftrVar;
        if (zzftrVar != null) {
            zzftrVar.executeOnExecutor(this.zzb, new Object[0]);
        }
    }

    public final void zza(zzftr zzftrVar) {
        zzftrVar.zzb(this);
        this.zzc.add(zzftrVar);
        if (this.zzd == null) {
            zzc();
        }
    }

    public final void zzb(zzftr zzftrVar) {
        this.zzd = null;
        zzc();
    }
}
