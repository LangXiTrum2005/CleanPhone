package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcwo {
    private final zzedg zza;
    private final zzfik zzb;
    private final zzfmu zzc;
    private final zzcpo zzd;
    private final zzemy zze;
    private final zzdfz zzf;
    private zzfic zzg;
    private final zzeer zzh;
    private final zzczo zzi;
    private final Executor zzj;
    private final zzeec zzk;
    private final zzejl zzl;

    public zzcwo(zzedg zzedgVar, zzfik zzfikVar, zzfmu zzfmuVar, zzcpo zzcpoVar, zzemy zzemyVar, zzdfz zzdfzVar, zzfic zzficVar, zzeer zzeerVar, zzczo zzczoVar, Executor executor, zzeec zzeecVar, zzejl zzejlVar) {
        this.zza = zzedgVar;
        this.zzb = zzfikVar;
        this.zzc = zzfmuVar;
        this.zzd = zzcpoVar;
        this.zze = zzemyVar;
        this.zzf = zzdfzVar;
        this.zzg = zzficVar;
        this.zzh = zzeerVar;
        this.zzi = zzczoVar;
        this.zzj = executor;
        this.zzk = zzeecVar;
        this.zzl = zzejlVar;
    }

    public final ListenableFuture zza(ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            zzfmu zzfmuVar = this.zzc;
            zzfmo zzfmoVar = zzfmo.SERVER_TRANSACTION;
            Objects.requireNonNull(zzfmuVar);
            return zzfmf.zza(zzgym.zza(this.zzg), zzfmoVar, zzfmuVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        zzfml zzfmlVarZza = this.zzc.zza(zzfmo.SERVER_TRANSACTION, listenableFuture);
        final zzeec zzeecVar = this.zzk;
        Objects.requireNonNull(zzeecVar);
        return zzfmlVarZza.zzc(new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcwn
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzeecVar.zza((zzbza) obj);
            }
        }).zzi();
    }

    public final ListenableFuture zzb() {
        zzfik zzfikVar = this.zzb;
        if (!zzfikVar.zzv) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzfikVar.zzd;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                zzfmu zzfmuVar = this.zzc;
                zzfmo zzfmoVar = zzfmo.PRELOADED_LOADER;
                Objects.requireNonNull(zzfmuVar);
                return zzfmf.zza(this.zza.zza(), zzfmoVar, zzfmuVar).zzi();
            }
        }
        return zza(this.zzi.zzb());
    }

    public final ListenableFuture zzc(ListenableFuture listenableFuture) {
        zzfml zzfmlVarZzc = this.zzc.zza(zzfmo.RENDERER, listenableFuture).zzb(new zzflu() { // from class: com.google.android.gms.internal.ads.zzcwm
            @Override // com.google.android.gms.internal.ads.zzflu
            public final /* synthetic */ Object zza(Object obj) throws Exception {
                zzfic zzficVar = (zzfic) obj;
                this.zza.zzi(zzficVar);
                return zzficVar;
            }
        }).zzc(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgw)).booleanValue()) {
            zzfmlVarZzc = zzfmlVarZzc.zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzgx)).intValue(), TimeUnit.SECONDS);
        }
        return zzfmlVarZzc.zzi();
    }

    public final zzdfz zzd() {
        return this.zzf;
    }

    public final ListenableFuture zze(final zzfkg zzfkgVar) {
        zzfmb zzfmbVarZzi = this.zzc.zza(zzfmo.GET_CACHE_KEY, this.zzi.zzb()).zzc(new zzgxu() { // from class: com.google.android.gms.internal.ads.zzcwl
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(zzfkgVar, (zzbza) obj);
            }
        }).zzi();
        zzgym.zzr(zzfmbVarZzi, new zzcwj(this), this.zzj);
        return zzfmbVarZzi;
    }

    public final ListenableFuture zzf(zzbza zzbzaVar) {
        zzfmb zzfmbVarZzi = this.zzc.zza(zzfmo.NOTIFY_CACHE_HIT, this.zzh.zzb(zzbzaVar)).zzi();
        zzgym.zzr(zzfmbVarZzi, new zzcwk(this), this.zzj);
        return zzfmbVarZzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(Throwable th) {
        return zzfjm.zzb(th, this.zzl);
    }

    public final void zzh(zzfic zzficVar) {
        this.zzg = zzficVar;
    }

    public final /* synthetic */ zzfic zzi(zzfic zzficVar) throws Exception {
        this.zzd.zza(zzficVar);
        return zzficVar;
    }

    public final /* synthetic */ ListenableFuture zzj(zzfkg zzfkgVar, zzbza zzbzaVar) {
        zzbzaVar.zzi = zzfkgVar;
        return this.zzh.zza(zzbzaVar);
    }

    public final /* synthetic */ zzdfz zzk() {
        return this.zzf;
    }
}
