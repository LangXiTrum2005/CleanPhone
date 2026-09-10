package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbgx {
    private final Map zza = new HashMap();
    private final zzbgz zzb;

    public zzbgx(zzbgz zzbgzVar) {
        this.zzb = zzbgzVar;
    }

    public final void zza(String str, zzbgw zzbgwVar) {
        this.zza.put(str, zzbgwVar);
    }

    public final void zzb(String str, String str2, long j) {
        Map map = this.zza;
        zzbgw zzbgwVar = (zzbgw) map.get(str2);
        String[] strArr = {str};
        if (zzbgwVar != null) {
            this.zzb.zzb(zzbgwVar, j, strArr);
        }
        map.put(str, new zzbgw(j, null, null));
    }

    public final zzbgz zzc() {
        return this.zzb;
    }
}
