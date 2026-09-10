package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzazk extends zzaxi {
    public Long zza;
    public Boolean zzb;
    public Boolean zzc;

    public zzazk() {
    }

    @Override // com.google.android.gms.internal.ads.zzaxi
    public final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(1, this.zzb);
        map.put(2, this.zzc);
        return map;
    }

    public zzazk(String str) {
        HashMap mapZzb = zzaxi.zzb(str);
        if (mapZzb != null) {
            this.zza = (Long) mapZzb.get(0);
            this.zzb = (Boolean) mapZzb.get(1);
            this.zzc = (Boolean) mapZzb.get(2);
        }
    }
}
