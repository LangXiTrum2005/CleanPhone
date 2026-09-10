package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzfbp implements zzezx {
    private final JSONObject zza;

    public zzfbp(Context context) {
        this.zza = zzbyw.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzno)).booleanValue() ? zzgym.zza(zzfbn.zza) : zzgym.zza(new zzezv() { // from class: com.google.android.gms.internal.ads.zzfbo
            @Override // com.google.android.gms.internal.ads.zzezv
            public final /* synthetic */ void zza(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 46;
    }

    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
