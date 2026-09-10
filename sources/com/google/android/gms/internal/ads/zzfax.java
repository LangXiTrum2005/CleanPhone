package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfax implements zzezv {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfzf zzc;

    public zzfax(AdvertisingIdClient.Info info, String str, zzfzf zzfzfVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectZzh.put("pdid", str);
                    jSONObjectZzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzh.put("rdid", info.getId());
            jSONObjectZzh.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzh.put("idtype", "adid");
            zzfzf zzfzfVar = this.zzc;
            if (zzfzfVar.zzc()) {
                jSONObjectZzh.put("paidv1_id_android_3p", zzfzfVar.zza());
                jSONObjectZzh.put("paidv1_creation_time_android_3p", zzfzfVar.zzb());
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e2);
        }
    }
}
