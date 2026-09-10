package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzbsi implements zzbod {
    final /* synthetic */ zzbsj zza;
    private final zzbrl zzb;
    private final zzcdt zzc;

    public zzbsi(zzbsj zzbsjVar, zzbrl zzbrlVar, zzcdt zzcdtVar) {
        Objects.requireNonNull(zzbsjVar);
        this.zza = zzbsjVar;
        this.zzb = zzbrlVar;
        this.zzc = zzcdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e2) {
                this.zzc.zzd(e2);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbru());
            } else {
                this.zzc.zzd(new zzbru(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.zzb.zza();
        }
    }
}
