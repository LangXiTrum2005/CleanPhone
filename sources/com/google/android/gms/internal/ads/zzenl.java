package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzenl implements zzeji {
    private final Map zza = new HashMap();
    private final zzduu zzb;

    public zzenl(zzduu zzduuVar) {
        this.zzb = zzduuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeji
    public final zzejj zza(String str, JSONObject jSONObject) throws zzfir {
        zzejj zzejjVar;
        synchronized (this) {
            try {
                Map map = this.zza;
                zzejjVar = (zzejj) map.get(str);
                if (zzejjVar == null) {
                    zzejjVar = new zzejj(this.zzb.zza(str, jSONObject), new zzekw(), str);
                    map.put(str, zzejjVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzejjVar;
    }
}
