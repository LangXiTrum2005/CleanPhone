package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbnp implements zzbnn {
    private final zzbnq zza;

    public zzbnp(zzbnq zzbnqVar) {
        this.zza = zzbnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to parse float", e2);
        }
        zzbnq zzbnqVar = this.zza;
        zzbnqVar.zza(zEquals);
        zzbnqVar.zzb(zEquals2, f);
        zzcirVar.zzaE(zEquals);
    }
}
