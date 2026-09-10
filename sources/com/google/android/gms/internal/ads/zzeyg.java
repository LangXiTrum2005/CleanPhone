package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.thinkup.core.common.oo.o;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyg implements zzezv {
    private final Map zza;

    public zzeyg(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Map map = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (map.isEmpty()) {
            return;
        }
        Bundle bundle = zzczmVar.zza;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
            if (!arrayDeque.isEmpty()) {
                zzdyk zzdykVar = (zzdyk) entry.getKey();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", zzdykVar.zza());
                    jSONObject.put(o.C0684o.m, zzdykVar.zzb());
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = arrayDeque.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put((Long) it.next());
                    }
                    jSONObject.put("timestamps", jSONArray2);
                    jSONArray.put(jSONObject);
                } catch (JSONException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Failed putting the on-device storage record.", e2);
                }
            }
        }
        if (jSONArray.length() > 0) {
            bundle.putString("on_device_storage_records", jSONArray.toString());
        }
    }
}
