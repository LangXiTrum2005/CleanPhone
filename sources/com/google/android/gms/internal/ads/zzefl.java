package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzefl implements zzflu {
    static final /* synthetic */ zzefl zza = new zzefl();

    private /* synthetic */ zzefl() {
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
