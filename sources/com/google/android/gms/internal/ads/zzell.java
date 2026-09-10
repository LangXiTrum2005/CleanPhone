package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzell implements zzeji {
    private final zzduu zza;

    public zzell(zzduu zzduuVar) {
        this.zza = zzduuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final zzejj zza(String str, JSONObject jSONObject) throws zzfir {
        return new zzejj(this.zza.zza(str, jSONObject), new zzekv(), str);
    }
}
