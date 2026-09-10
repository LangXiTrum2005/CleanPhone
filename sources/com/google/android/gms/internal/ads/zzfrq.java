package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes4.dex */
final class zzfrq extends TimerTask {
    final /* synthetic */ zzfrs zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzfrt zzc;

    public zzfrq(zzfrt zzfrtVar, zzfrs zzfrsVar, Timer timer) {
        this.zza = zzfrsVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfrtVar);
        this.zzc = zzfrtVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
