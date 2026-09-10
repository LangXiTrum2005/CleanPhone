package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzbsp implements zzbod {
    private final zzcdt zza;

    public zzbsp(zzbsr zzbsrVar, zzcdt zzcdtVar) {
        Objects.requireNonNull(zzbsrVar);
        this.zza = zzcdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.zza.zzd(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbru());
            } else {
                this.zza.zzd(new zzbru(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
