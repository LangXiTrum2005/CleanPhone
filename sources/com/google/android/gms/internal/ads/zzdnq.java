package com.google.android.gms.internal.ads;

import com.p004ironsource.e9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdnq extends zzdnr {
    private final JSONObject zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final boolean zzf;
    private final String zzg;
    private final JSONObject zzh;

    public zzdnq(zzfhr zzfhrVar, JSONObject jSONObject) {
        super(zzfhrVar);
        this.zzb = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzc = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzd = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, e9.ATTRIBUTION, "allow_pub_rendering");
        this.zze = com.google.android.gms.ads.internal.util.zzbp.zzj(false, jSONObject, "enable_omid");
        this.zzg = com.google.android.gms.ads.internal.util.zzbp.zzk("", jSONObject, "watermark_overlay_png_base64");
        this.zzf = jSONObject.optJSONObject("overlay") != null;
        this.zzh = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdnr
    public final JSONObject zza() {
        JSONObject jSONObject = this.zzb;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zza.zzz);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnr
    public final boolean zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdnr
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdnr
    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdnr
    public final boolean zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdnr
    public final String zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzdnr
    public final zzfin zzg() {
        JSONObject jSONObject = this.zzh;
        return jSONObject != null ? new zzfin(jSONObject) : this.zza.zzV;
    }
}
