package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzboi implements zzbnn {
    private final zzeak zza;

    public zzboi(zzeak zzeakVar) {
        Preconditions.checkNotNull(zzeakVar, "The Inspector Manager must not be null");
        this.zza = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.zza.zzi((String) map.get("extras"), j);
    }
}
