package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzbmz implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcirVar.zzdk();
        } else if ("resume".equals(str)) {
            zzcirVar.zzdl();
        }
    }
}
