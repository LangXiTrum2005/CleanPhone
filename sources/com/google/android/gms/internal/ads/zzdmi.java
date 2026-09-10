package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmi {
    private final JSONObject zza;
    private final zzdsp zzb;
    private final com.google.android.gms.ads.internal.zzb zzc;
    private final zzcbk zzd;

    public zzdmi(JSONObject jSONObject, zzdsp zzdspVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcbk zzcbkVar) {
        this.zza = jSONObject;
        this.zzb = zzdspVar;
        this.zzc = zzbVar;
        this.zzd = zzcbkVar;
    }

    public final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    public final zzcbk zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdsp zzd() {
        return this.zzb;
    }
}
