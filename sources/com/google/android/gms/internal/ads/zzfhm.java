package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfhm implements zzere {
    final /* synthetic */ zzfho zza;

    public zzfhm(zzfho zzfhoVar) {
        Objects.requireNonNull(zzfhoVar);
        this.zza = zzfhoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final void zza() {
        zzfho zzfhoVar = this.zza;
        synchronized (zzfhoVar) {
            zzfhoVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfho zzfhoVar = this.zza;
        zzdte zzdteVar = (zzdte) obj;
        synchronized (zzfhoVar) {
            try {
                zzfhoVar.zzx(zzdteVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzer)).booleanValue()) {
                    zzdteVar.zzh().zza = zzfhoVar.zzv();
                }
                zzfhoVar.zzw().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
