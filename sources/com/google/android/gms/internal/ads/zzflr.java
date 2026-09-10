package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class zzflr implements zzijg {
    private final zzijp zza;

    private zzflr(zzijp zzijpVar) {
        this.zza = zzijpVar;
    }

    public static zzflr zza(zzijp zzijpVar) {
        return new zzflr(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.zza.zzb();
        zzfxk.zza();
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        zzijo.zzb(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
