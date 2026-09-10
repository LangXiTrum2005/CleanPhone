package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhjn {
    private final Map zza = new HashMap();

    public final zzhjn zza(zzhxc zzhxcVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzhxcVar.zzd() != 0 && zzhxcVar.zzd() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.zza;
        if (map.containsKey(zzhxcVar)) {
            list = (List) map.get(zzhxcVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzhxcVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzhjp zzb() {
        return new zzhjp(this.zza, null);
    }
}
