package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfkq implements zzgyj {
    final /* synthetic */ zzfkt zza;
    final /* synthetic */ zzfkv zzb;

    public zzfkq(zzfkv zzfkvVar, zzfkt zzfktVar) {
        this.zza = zzfktVar;
        Objects.requireNonNull(zzfkvVar);
        this.zzb = zzfkvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        zzfkv zzfkvVar = this.zzb;
        synchronized (zzfkvVar) {
            zzfkvVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfkv zzfkvVar = this.zzb;
        synchronized (zzfkvVar) {
            try {
                zzfkvVar.zzf(null);
                zzfkvVar.zze().addFirst(this.zza);
                if (zzfkvVar.zzg() == 1) {
                    zzfkvVar.zzd();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
