package com.google.android.gms.internal.ads;

import com.smartdigimkt.o1.b;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzbna implements zzbnn {
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcir zzcirVar = (zzcir) obj;
        if (map.containsKey("start")) {
            zzcirVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzcirVar.zzP().zzs();
        } else if (map.containsKey(b.P3)) {
            zzcirVar.zzP().zzt();
        }
    }
}
