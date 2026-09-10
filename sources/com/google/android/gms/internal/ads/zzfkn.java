package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfkn {
    private final HashMap zza = new HashMap();

    public final zzfkm zza(zzfkd zzfkdVar, Context context, zzfjv zzfjvVar, zzfks zzfksVar) {
        HashMap map = this.zza;
        zzfkm zzfkmVar = (zzfkm) map.get(zzfkdVar);
        if (zzfkmVar != null) {
            return zzfkmVar;
        }
        zzfka zzfkaVar = new zzfka(zzfkg.zza(zzfkdVar, context));
        zzfkm zzfkmVar2 = new zzfkm(zzfkaVar, new zzfkv(zzfkaVar, zzfjvVar, zzfksVar));
        map.put(zzfkdVar, zzfkmVar2);
        return zzfkmVar2;
    }
}
