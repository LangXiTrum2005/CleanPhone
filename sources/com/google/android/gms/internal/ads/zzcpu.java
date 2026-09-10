package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcpu implements zzcpq {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcpu(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpq
    public final void zza(Map map) {
        this.zza.zzd(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
