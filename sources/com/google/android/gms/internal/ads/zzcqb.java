package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcqb implements zzcpr {
    private final zzeak zza;

    public zzcqb(zzeak zzeakVar) {
        this.zza = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcpr
    public final void zza(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkB)).booleanValue()) {
            this.zza.zzp(jSONObject);
        }
    }
}
