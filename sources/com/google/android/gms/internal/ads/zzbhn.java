package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.Objects;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
final class zzbhn extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbhp zzb;

    public zzbhn(zzbhp zzbhpVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbhpVar);
        this.zzb = zzbhpVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbhp zzbhpVar = this.zzb;
            zzbhpVar.zzi().d(zzbhpVar.zze(this.zza, str).toString());
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Error Response JSON: ", e2);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbhp zzbhpVar = this.zzb;
            zzbhpVar.zzi().d(zzbhpVar.zzf(this.zza, query).toString());
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Signal Response JSON: ", e2);
        }
    }
}
