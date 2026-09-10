package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzbnb implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        if (map.containsKey("start")) {
            zzcirVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzcirVar.zzas(false);
        }
    }
}
