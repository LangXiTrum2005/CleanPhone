package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfdw implements zzere {
    final /* synthetic */ zzfdz zza;

    public zzfdw(zzfdz zzfdzVar) {
        Objects.requireNonNull(zzfdzVar);
        this.zza = zzfdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final void zza() {
        zzfdz zzfdzVar = this.zza;
        synchronized (zzfdzVar) {
            zzfdzVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzere
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcsw zzcswVar = (zzcsw) obj;
        zzfdz zzfdzVar = this.zza;
        synchronized (zzfdzVar) {
            try {
                zzcsw zzcswVar2 = zzfdzVar.zza;
                if (zzcswVar2 != null) {
                    zzcswVar2.zzd();
                }
                zzfdzVar.zza = zzcswVar;
                zzcswVar.zza(zzfdzVar);
                zzfdzVar.zzN().zzs(new zzcsx(zzcswVar, zzfdzVar, zzfdzVar.zzN(), zzfdzVar.zzO()));
                zzcswVar.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
