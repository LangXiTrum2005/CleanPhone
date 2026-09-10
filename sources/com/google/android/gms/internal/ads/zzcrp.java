package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcrp implements zzbnn {
    final /* synthetic */ zzcrs zza;

    public zzcrp(zzcrs zzcrsVar) {
        Objects.requireNonNull(zzcrsVar);
        this.zza = zzcrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        zzcrs zzcrsVar = this.zza;
        if (zzcrsVar.zze(map)) {
            zzcrsVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcro
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzl();
                }
            });
        }
    }
}
