package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface js extends ns, is {
    @Override // com.google.android.gms.internal.ads.ns
    default void a(String str, String str2) {
        zza(d5.u.h(new StringBuilder(com.applovin.impl.ca.i(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.is
    default void e(String str, Map map) {
        try {
            f("openIntentAsync", zzay.zza().zzm(map));
        } catch (JSONException unused) {
            int i10 = zze.zza;
            zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    default void f(String str, JSONObject jSONObject) {
        StringBuilder sbK = d5.u.k("(window.AFMA_ReceiveMessage || function() {})('openIntentAsync',", jSONObject.toString(), ");");
        String string = sbK.toString();
        int i10 = zze.zza;
        zzo.zzd("Dispatching AFMA event: ".concat(string));
        zza(sbK.toString());
    }

    @Override // com.google.android.gms.internal.ads.ns
    void zza(String str);
}
