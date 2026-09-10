package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzect {
    private final ScheduledExecutorService zza;
    private final zzgyw zzb;
    private final zzgyw zzc;
    private final zzeds zzd;
    private final zzija zze;

    public zzect(ScheduledExecutorService scheduledExecutorService, zzgyw zzgywVar, zzgyw zzgywVar2, zzeds zzedsVar, zzija zzijaVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgywVar;
        this.zzc = zzgywVar2;
        this.zzd = zzedsVar;
        this.zze = zzijaVar;
    }

    public final ListenableFuture zza(final zzbza zzbzaVar) {
        ListenableFuture listenableFutureSubmit;
        String str = zzbzaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            listenableFutureSubmit = zzgym.zzc(new zzeef(1));
        } else {
            listenableFutureSubmit = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zziq)).booleanValue() || ((Boolean) zzbiv.zza.zze()).booleanValue()) ? this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzecq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzbzaVar);
                }
            }) : this.zzd.zza(zzbzaVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgye) zzgym.zzh((zzgye) zzgym.zzi(zzgye.zzw(listenableFutureSubmit), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgx)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzecs
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbzaVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ ListenableFuture zzb(final zzbza zzbzaVar, int i2, Throwable th) {
        Bundle bundle;
        if (zzbzaVar != null && (bundle = zzbzaVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgym.zzj(((zzefw) this.zze.zzb()).zzk(zzbzaVar, i2), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgym.zza(new zzeeg((InputStream) obj, zzbzaVar));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzeeg zzc(zzbza zzbzaVar) {
        return (zzeeg) this.zzd.zza(zzbzaVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgx)).intValue(), TimeUnit.SECONDS);
    }
}
