package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzbni implements zzbnn {
    static final /* synthetic */ zzbni zza = new zzbni();

    private /* synthetic */ zzbni() {
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzckd zzckdVar = (zzckd) obj;
        zzbnn zzbnnVar = zzbnm.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzg)).booleanValue() && str.isEmpty()) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
        } else {
            zzcii zzciiVar = (zzcii) zzckdVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzckdVar.getContext(), ((zzckl) zzckdVar).zzs().afmaVersion, str, null, zzciiVar.zzC() != null ? zzciiVar.zzC().zzax : null).zzb();
        }
    }
}
