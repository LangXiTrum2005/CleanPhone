package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.thinkup.core.common.oo.o;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbnv implements zzbnn {
    private final zzdyh zza;

    public zzbnv(zzdyh zzdyhVar) {
        this.zza = zzdyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey(o.C0684o.m) || TextUtils.isEmpty((CharSequence) map.get(o.C0684o.m))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get(o.C0684o.m)), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (NumberFormatException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e2);
        }
    }
}
