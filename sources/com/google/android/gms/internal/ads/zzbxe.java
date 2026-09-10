package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbxe {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbxe(boolean z2, String str, boolean z3) {
        this.zza = z2;
        this.zzb = str;
        this.zzc = z3;
    }

    public static zzbxe zza(JSONObject jSONObject) {
        return new zzbxe(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
