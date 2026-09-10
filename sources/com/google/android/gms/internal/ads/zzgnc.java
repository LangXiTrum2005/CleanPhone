package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgnc {
    private final zzgcf zza;
    private final zzfzm zzb;

    public zzgnc(zzfzm zzfzmVar, zzgcf zzgcfVar) {
        this.zza = zzgcfVar;
        this.zzb = zzfzmVar;
    }

    public final zzgna zza(int i2) {
        return new zzgna(i2, this.zzb, this.zza);
    }

    public final void zzb(int i2) {
        this.zza.zzb(i2 - 1, -1L, null, null);
    }

    public final void zzc(int i2, String str) {
        this.zza.zzb(i2 - 1, -1L, null, str);
    }

    public final void zzd(int i2, Throwable th) {
        this.zza.zzb(i2 - 1, -1L, th, null);
    }

    public final ListenableFuture zze(int i2, ListenableFuture listenableFuture) {
        zzgna zzgnaVarZza = zza(i2);
        zzgnaVarZza.zza();
        zzgym.zzr(listenableFuture, new zzgnb(this, zzgnaVarZza), zzgzd.zza());
        return listenableFuture;
    }

    public final void zzf(int i2, Runnable runnable) {
        zzgna zzgnaVarZza = zza(i2);
        try {
            zzgnaVarZza.zza();
            runnable.run();
            zzgnaVarZza.zzc();
        } catch (Throwable th) {
            try {
                zzgnaVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgnaVarZza.zzc();
                throw th2;
            }
        }
    }
}
