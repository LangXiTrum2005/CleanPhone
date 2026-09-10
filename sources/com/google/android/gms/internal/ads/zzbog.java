package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbog implements zzbnn {
    private final zzbof zza;

    public zzbog(zzbof zzbofVar) {
        this.zza = zzbofVar;
    }

    public static void zzb(zzcir zzcirVar, zzbof zzbofVar) {
        zzcirVar.zzab("/reward", new zzbog(zzbofVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzbzy zzbzyVar = null;
        try {
            int i2 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbzyVar = new zzbzy(str2, i2);
            }
        } catch (NumberFormatException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e2);
        }
        this.zza.zzb(zzbzyVar);
    }
}
