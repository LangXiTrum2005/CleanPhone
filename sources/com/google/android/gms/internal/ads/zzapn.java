package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzapn implements zzapg {
    final /* synthetic */ zzapq zza;
    private final zzeq zzb;

    public zzapn(zzapq zzapqVar) {
        Objects.requireNonNull(zzapqVar);
        this.zza = zzapqVar;
        this.zzb = new zzeq(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zza(zzfg zzfgVar, zzaer zzaerVar, zzapu zzapuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzb(zzer zzerVar) {
        if (zzerVar.zzs() == 0 && (zzerVar.zzs() & 128) != 0) {
            zzerVar.zzk(6);
            int iZzd = zzerVar.zzd() / 4;
            for (int i2 = 0; i2 < iZzd; i2++) {
                zzeq zzeqVar = this.zzb;
                zzerVar.zzl(zzeqVar, 4);
                int iZzj = zzeqVar.zzj(16);
                zzeqVar.zzh(3);
                if (iZzj == 0) {
                    zzeqVar.zzh(13);
                } else {
                    int iZzj2 = zzeqVar.zzj(13);
                    zzapq zzapqVar = this.zza;
                    if (zzapqVar.zzj().get(iZzj2) == null) {
                        zzapqVar.zzj().put(iZzj2, new zzaph(new zzapo(zzapqVar, iZzj2)));
                        zzapqVar.zzo(zzapqVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}
