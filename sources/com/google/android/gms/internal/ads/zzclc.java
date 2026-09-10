package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzclc implements zzcla {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzclc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        this.zza.zzu(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
