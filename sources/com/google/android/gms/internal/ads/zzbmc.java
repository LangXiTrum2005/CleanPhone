package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbmc implements zzbnn {
    private final zzbmd zza;

    public zzbmc(zzbmd zzbmdVar) {
        this.zza = zzbmdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        if (this.zza == null) {
            return;
        }
        String str = (String) map.get("name");
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleZzl = null;
        if (map.containsKey("info")) {
            try {
                bundleZzl = com.google.android.gms.ads.internal.util.zzbp.zzl(new JSONObject((String) map.get("info")));
            } catch (JSONException e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to convert ad metadata to JSON.", e2);
            }
        }
        if (bundleZzl != null) {
            this.zza.zza(str, bundleZzl);
        } else {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to convert ad metadata to Bundle.");
        }
    }
}
