package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class zzgzi extends zzgyd {
    private ListenableFuture zza;
    private ScheduledFuture zzb;

    private zzgzi(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgzi zzgziVar = new zzgzi(listenableFuture);
        zzgzg zzgzgVar = new zzgzg(zzgziVar);
        zzgziVar.zzb = scheduledExecutorService.schedule(zzgzgVar, j, timeUnit);
        listenableFuture.addListener(zzgzgVar, zzgyb.INSTANCE);
        return zzgziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final void zzc() {
        zzm(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final String zzd() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String string = listenableFuture.toString();
        String strS = android.support.v4.media.a.s(new StringBuilder(string.length() + 14), "inputFuture=[", string, d9.i.f24752e);
        if (scheduledFuture == null) {
            return strS;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strS;
        }
        int length = strS.length();
        StringBuilder sb = new StringBuilder(String.valueOf(delay).length() + length + 19 + 4);
        sb.append(strS);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final /* synthetic */ ListenableFuture zzf() {
        return this.zza;
    }

    public final /* synthetic */ ScheduledFuture zzx() {
        return this.zzb;
    }

    public final /* synthetic */ void zzy(ScheduledFuture scheduledFuture) {
        this.zzb = null;
    }
}
