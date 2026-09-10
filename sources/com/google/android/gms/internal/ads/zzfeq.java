package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfeq implements zzffj {
    private final zzffj zza;
    private final zzffj zzb;
    private final zzfkv zzc;
    private final String zzd;
    private zzczr zze;
    private final Executor zzf;

    public zzfeq(zzffj zzffjVar, zzffj zzffjVar2, zzfkv zzfkvVar, String str, Executor executor) {
        this.zza = zzffjVar;
        this.zzb = zzffjVar2;
        this.zzc = zzfkvVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfki zzfkiVar, zzffk zzffkVar) {
        zzczr zzczrVar = zzfkiVar.zza;
        this.zze = zzczrVar;
        if (zzfkiVar.zzc != null) {
            if (zzczrVar.zzc() != null) {
                zzfkiVar.zzc.zzp().zzu(zzfkiVar.zza.zzc());
            }
            return zzgym.zza(zzfkiVar.zzc);
        }
        zzczrVar.zza().zzh(zzfkiVar.zzb);
        return ((zzffa) this.zza).zzb(zzffkVar, null, zzfkiVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzczr zzd() {
        return this.zze;
    }

    public final synchronized ListenableFuture zzb(final zzffk zzffkVar, final zzffi zzffiVar, zzczr zzczrVar) {
        zzczq zzczqVarZza = zzffiVar.zza(zzffkVar.zzb);
        zzczqVarZza.zzi(new zzfer(this.zzd));
        final zzczr zzczrVar2 = (zzczr) zzczqVarZza.zzh();
        zzczrVar2.zzb();
        zzczrVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzczrVar2.zzb().zzd;
        if (zzmVar.zzs != null || zzmVar.zzx != null) {
            this.zze = zzczrVar2;
            return ((zzffa) this.zza).zzb(zzffkVar, zzffiVar, zzczrVar2);
        }
        zzfik zzfikVarZzb = zzczrVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzfikVarZzb.zzd;
        String str = zzfikVarZzb.zzg;
        com.google.android.gms.ads.internal.client.zzx zzxVar = zzfikVarZzb.zzk;
        Executor executor = this.zzf;
        final zzfep zzfepVar = new zzfep(zzffiVar, zzffkVar, zzmVar2, str, executor, zzxVar, null);
        return (zzgye) zzgym.zzj(zzgye.zzw(((zzfew) this.zzb).zza(zzffkVar, zzffiVar, zzczrVar2)), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfeo
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze(zzffkVar, zzfepVar, zzffiVar, zzczrVar2, (zzfev) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzffk zzffkVar, zzffi zzffiVar, Object obj) {
        return zzb(zzffkVar, zzffiVar, null);
    }

    public final /* synthetic */ ListenableFuture zze(zzffk zzffkVar, zzfep zzfepVar, zzffi zzffiVar, zzczr zzczrVar, zzfev zzfevVar) {
        if (zzfevVar != null) {
            zzfep zzfepVar2 = new zzfep(zzfepVar.zza, zzfepVar.zzb, zzfepVar.zzc, zzfepVar.zzd, zzfepVar.zze, zzfepVar.zzf, zzfevVar.zza);
            zzfki zzfkiVar = zzfevVar.zzc;
            if (zzfkiVar != null) {
                this.zze = null;
                this.zzc.zza(zzfepVar2);
                return zzg(zzfkiVar, zzffkVar);
            }
            zzfkv zzfkvVar = this.zzc;
            ListenableFuture listenableFutureZzb = zzfkvVar.zzb(zzfepVar2);
            if (listenableFutureZzb != null) {
                this.zze = null;
                return zzgym.zzj(listenableFutureZzb, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfen
                    @Override // com.google.android.gms.internal.ads.zzgxu
                    public final /* synthetic */ ListenableFuture zza(Object obj) {
                        return this.zza.zzf((zzfkr) obj);
                    }
                }, this.zzf);
            }
            zzfkvVar.zza(zzfepVar2);
            zzffkVar = new zzffk(zzffkVar.zzb, zzfevVar.zzb);
        }
        ListenableFuture listenableFutureZzb2 = ((zzffa) this.zza).zzb(zzffkVar, zzffiVar, zzczrVar);
        this.zze = zzczrVar;
        return listenableFutureZzb2;
    }

    public final /* synthetic */ ListenableFuture zzf(zzfkr zzfkrVar) throws zzebr {
        zzfki zzfkiVar;
        zzfkt zzfktVar;
        if (zzfkrVar == null || (zzfkiVar = zzfkrVar.zza) == null || (zzfktVar = zzfkrVar.zzb) == null) {
            throw new zzebr(1, "Empty prefetch");
        }
        zzbfp.zzb.zzc zzcVarZzs = zzbfp.zzb.zzs();
        zzbfp.zzb.zza.C0188zza c0188zzaZzs = zzbfp.zzb.zza.zzs();
        c0188zzaZzs.zzc(zzbfp.zzb.zzd.IN_MEMORY);
        c0188zzaZzs.zzg(zzbfp.zzb.zze.zzs());
        zzcVarZzs.zzh(c0188zzaZzs);
        zzfkiVar.zza.zza().zzd().zzl(zzcVarZzs.zzbu());
        return zzg(zzfkiVar, ((zzfep) zzfktVar).zzb);
    }
}
