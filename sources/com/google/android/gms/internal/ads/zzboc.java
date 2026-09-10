package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzboc implements zzbod {
    final /* synthetic */ zzcdt zza;

    public zzboc(zzboe zzboeVar, zzcdt zzcdtVar) {
        this.zza = zzcdtVar;
        Objects.requireNonNull(zzboeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void zzb(String str) {
        this.zza.zzd(new zzbru(str));
    }
}
