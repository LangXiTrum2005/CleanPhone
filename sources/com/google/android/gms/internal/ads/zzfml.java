package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfml {
    final /* synthetic */ zzfmm zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    public /* synthetic */ zzfml(zzfmm zzfmmVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, byte[] bArr) {
        this(zzfmmVar, obj, null, listenableFuture, list, listenableFuture2);
    }

    public final zzfml zza(String str) {
        return new zzfml(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfml zzb(final zzflu zzfluVar) {
        return zzc(new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfmk
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgym.zza(zzfluVar.zza(obj));
            }
        });
    }

    public final zzfml zzc(zzgxu zzgxuVar) {
        return zzd(zzgxuVar, this.zza.zze());
    }

    public final zzfml zzd(zzgxu zzgxuVar, Executor executor) {
        return new zzfml(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgym.zzj(this.zzf, zzgxuVar, executor));
    }

    public final zzfml zze(final ListenableFuture listenableFuture) {
        return zzd(new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfmh
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return listenableFuture;
            }
        }, zzcdo.zzg);
    }

    public final zzfml zzf(Class cls, final zzflu zzfluVar) {
        return zzg(cls, new zzgxu(zzfluVar) { // from class: com.google.android.gms.internal.ads.zzfmi
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgym.zza("");
            }
        });
    }

    public final zzfml zzg(Class cls, zzgxu zzgxuVar) {
        zzfmm zzfmmVar = this.zza;
        zzgyw zzgywVarZze = zzfmmVar.zze();
        return new zzfml(zzfmmVar, this.zzb, this.zzc, this.zzd, this.zze, zzgym.zzh(this.zzf, cls, zzgxuVar, zzgywVarZze));
    }

    public final zzfml zzh(long j, TimeUnit timeUnit) {
        zzfmm zzfmmVar = this.zza;
        ScheduledExecutorService scheduledExecutorServiceZzf = zzfmmVar.zzf();
        return new zzfml(zzfmmVar, this.zzb, this.zzc, this.zzd, this.zze, zzgym.zzi(this.zzf, j, timeUnit, scheduledExecutorServiceZzf));
    }

    public final zzfmb zzi() {
        Object obj = this.zzb;
        String strZzc = this.zzc;
        if (strZzc == null) {
            strZzc = this.zza.zzc(obj);
        }
        final zzfmb zzfmbVar = new zzfmb(obj, strZzc, this.zzf);
        this.zza.zzg().zza(zzfmbVar);
        ListenableFuture listenableFuture = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzg().zzb(zzfmbVar);
            }
        };
        zzgyw zzgywVar = zzcdo.zzg;
        listenableFuture.addListener(runnable, zzgywVar);
        zzgym.zzr(zzfmbVar, new zzfmg(this, zzfmbVar), zzgywVar);
        return zzfmbVar;
    }

    public final zzfml zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }

    private zzfml(zzfmm zzfmmVar, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        Objects.requireNonNull(zzfmmVar);
        this.zza = zzfmmVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }
}
