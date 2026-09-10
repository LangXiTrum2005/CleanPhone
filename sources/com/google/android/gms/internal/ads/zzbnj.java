package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbnj implements zzbnn {
    static final /* synthetic */ zzbnj zza = new zzbnj();

    private /* synthetic */ zzbnj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzckk zzckkVar = (zzckk) obj;
        zzbnn zzbnnVar = zzbnm.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i2 = Integer.parseInt(str);
            int i3 = Integer.parseInt(str2);
            int i4 = Integer.parseInt(str3);
            zzayq zzayqVarZzS = zzckkVar.zzS();
            if (zzayqVarZzS != null) {
                zzayqVarZzS.zzb().zze(i2, i3, i4);
            }
        } catch (NumberFormatException unused) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
