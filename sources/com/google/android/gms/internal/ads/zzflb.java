package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzflb {
    private final zzfkt zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzflb(final zzfjz zzfjzVar, final zzfks zzfksVar, final zzfkt zzfktVar) {
        this.zza = zzfktVar;
        this.zzb = zzgym.zzh(zzgym.zzj(zzfksVar.zza(zzfktVar), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfla
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc(zzfksVar, zzfjzVar, zzfktVar, (zzfki) obj);
            }
        }, zzfktVar.zza()), Exception.class, new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfky
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzd(zzfksVar, (Exception) obj);
            }
        }, zzfktVar.zza());
    }

    public final synchronized void zza(zzgyj zzgyjVar) {
        zzfkt zzfktVar = this.zza;
        zzgym.zzr(zzgym.zzj(this.zzb, zzfkz.zza, zzfktVar.zza()), zzgyjVar, zzfktVar.zza());
    }

    public final synchronized ListenableFuture zzb(zzfkt zzfktVar) {
        if (!this.zzd && !this.zzc) {
            zzfkt zzfktVar2 = this.zza;
            if (zzfktVar2.zzb() != null && zzfktVar.zzb() != null && zzfktVar2.zzb().equals(zzfktVar.zzb())) {
                this.zzc = true;
                return this.zzb;
            }
        }
        return null;
    }

    public final /* synthetic */ ListenableFuture zzc(zzfks zzfksVar, zzfjz zzfjzVar, zzfkt zzfktVar, zzfki zzfkiVar) {
        synchronized (this) {
            try {
                this.zzd = true;
                zzfksVar.zzb(zzfkiVar);
                if (this.zzc) {
                    return zzgym.zza(new zzfkr(zzfkiVar, zzfktVar));
                }
                zzfjzVar.zzb(zzfktVar.zzb(), zzfkiVar);
                return zzgym.zza(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ ListenableFuture zzd(zzfks zzfksVar, Exception exc) {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }
}
