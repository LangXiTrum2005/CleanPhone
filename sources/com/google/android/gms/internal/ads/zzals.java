package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzals {
    public static void zza(zzalt zzaltVar, zzalx zzalxVar, zzdr zzdrVar) {
        for (int i2 = 0; i2 < zzaltVar.zza(); i2++) {
            long jZzb = zzaltVar.zzb(i2);
            List listZzc = zzaltVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i2 == zzaltVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzaltVar.zzb(i2 + 1) - zzaltVar.zzb(i2);
                if (jZzb2 > 0) {
                    zzdrVar.zza(new zzalq(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
