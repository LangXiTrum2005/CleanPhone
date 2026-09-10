package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijk extends zzijc {
    static {
        zzijh.zza(Collections.EMPTY_MAP);
    }

    public /* synthetic */ zzijk(Map map, zziji zzijiVar) {
        super(map);
    }

    public static zzijj zzc(int i2) {
        return new zzijj(i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzc = zzijd.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzc.put(entry.getKey(), ((zzijp) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzc);
    }
}
