package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfew implements zzffj {
    private final zzfjz zza;
    private final Executor zzb;
    private final zzgyj zzc = new zzfet(this);

    public zzfew(zzfjz zzfjzVar, Executor executor) {
        this.zza = zzfjzVar;
        this.zzb = executor;
    }

    public final ListenableFuture zza(zzffk zzffkVar, zzffi zzffiVar, final zzczr zzczrVar) {
        zzfjz zzfjzVar = this.zza;
        Executor executor = this.zzb;
        return (zzgye) zzgym.zzg((zzgye) zzgym.zzj(zzgye.zzw(new zzfff(zzfjzVar, zzczrVar, executor).zza()), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfeu
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzczrVar, (zzffd) obj);
            }
        }, executor), Exception.class, new zzfes(this), executor);
    }

    public final /* synthetic */ ListenableFuture zzb(zzczr zzczrVar, zzffd zzffdVar) {
        zzfjz zzfjzVar = this.zza;
        zzfkj zzfkjVar = zzffdVar.zzb;
        zzbza zzbzaVar = zzffdVar.zza;
        zzfki zzfkiVarZza = zzfjzVar.zza(zzfkjVar);
        if (zzfkiVarZza != null && zzbzaVar != null) {
            zzgym.zzr(zzczrVar.zza().zzf(zzbzaVar), this.zzc, this.zzb);
        }
        return zzgym.zza(new zzfev(zzfkjVar, zzbzaVar, zzfkiVarZza));
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzffk zzffkVar, zzffi zzffiVar, Object obj) {
        return zza(zzffkVar, zzffiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
