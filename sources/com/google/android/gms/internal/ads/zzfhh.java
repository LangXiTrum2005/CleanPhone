package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfhh implements zzere {
    final /* synthetic */ zzfhi zza;

    public zzfhh(zzfhi zzfhiVar) {
        Objects.requireNonNull(zzfhiVar);
        this.zza = zzfhiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final void zza() {
        zzfhi zzfhiVar = this.zza;
        synchronized (zzfhiVar) {
            zzfhiVar.zzw(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhi zzfhiVar = this.zza;
        zzdte zzdteVar = (zzdte) obj;
        synchronized (zzfhiVar) {
            try {
                zzfhiVar.zzw(zzdteVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzer)).booleanValue()) {
                    zzdteVar.zzh().zza = zzfhiVar.zzu();
                }
                zzfhiVar.zzv().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
