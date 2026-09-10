package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public interface zzbqk extends zzbqv, zzbqj {
    @Override // com.google.android.gms.internal.ads.zzbqv
    void zza(String str);

    @Override // com.google.android.gms.internal.ads.zzbqv
    default void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    default void zzc(String str, String str2) {
        zza(androidx.media3.extractor.text.ttml.a.q(new StringBuilder(Z.d(str, 1, String.valueOf(str2).length()) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    default void zzd(String str, JSONObject jSONObject) {
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbQ.toString();
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string));
        zza(sbQ.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbqj
    default void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }
}
