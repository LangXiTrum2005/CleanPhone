package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfmm {
    private static final ListenableFuture zza = zzgym.zza(null);
    private final zzgyw zzb;
    private final ScheduledExecutorService zzc;
    private final zzfmn zzd;

    public zzfmm(zzgyw zzgywVar, ScheduledExecutorService scheduledExecutorService, zzfmn zzfmnVar) {
        this.zzb = zzgywVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfmnVar;
    }

    public final zzfml zza(Object obj, ListenableFuture listenableFuture) {
        return new zzfml(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture, null);
    }

    public final zzfmd zzb(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfmd(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    public abstract String zzc(Object obj);

    public final /* synthetic */ zzgyw zze() {
        return this.zzb;
    }

    public final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzfmn zzg() {
        return this.zzd;
    }
}
