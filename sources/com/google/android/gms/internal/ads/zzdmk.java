package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmk implements zzijg {
    private final zzdmi zza;

    private zzdmk(zzdmi zzdmiVar) {
        this.zza = zzdmiVar;
    }

    public static zzdmk zzc(zzdmi zzdmiVar) {
        return new zzdmk(zzdmiVar);
    }

    public static JSONObject zzd(zzdmi zzdmiVar) {
        JSONObject jSONObjectZzc = zzdmiVar.zzc();
        zzijo.zzb(jSONObjectZzc);
        return jSONObjectZzc;
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
