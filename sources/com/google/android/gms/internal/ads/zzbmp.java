package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzbmp implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        try {
            zzfzj.zzh(zzcirVar.getContext()).zzk();
            zzfzk.zzh(zzcirVar.getContext()).zzj();
            zzfzl.zza(zzcirVar.getContext()).zzb(null);
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
