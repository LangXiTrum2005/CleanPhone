package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzbmq implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        try {
            String str = (String) map.get("enabled");
            zzbnn zzbnnVar = zzbnm.zza;
            if (!zzgpj.zze(com.p004ironsource.mediationsdk.metadata.a.g, str) && !zzgpj.zze("false", str)) {
                return;
            }
            zzfzg.zza(zzcirVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
