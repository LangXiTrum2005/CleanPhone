package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.p004ironsource.d9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfca implements zzezv {
    private final Bundle zza;

    public zzfca(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zza;
        if (bundle != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbp.zzh(com.google.android.gms.ads.internal.util.zzbp.zzh(jSONObject, d9.h.G), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzbb.zza().zzm(bundle));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
