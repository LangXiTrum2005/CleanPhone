package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcps implements zzcpq {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcps(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpq
    public final void zza(Map map) {
        this.zza.zzb(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
