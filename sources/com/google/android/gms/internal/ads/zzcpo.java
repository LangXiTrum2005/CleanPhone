package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcpo {
    private final Map zza;
    private final Map zzb;

    public zzcpo(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfic zzficVar) throws Exception {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        for (zzfia zzfiaVar : zzficVar.zzb.zzc) {
            Map map = this.zza;
            String str = zzfiaVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfiaVar.zzb) == null) {
                Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfiaVar.zzb) != null) {
                    zzcpq zzcpqVar = (zzcpq) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzcpqVar.zza(map3);
                }
            } else {
                ((zzcpr) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
