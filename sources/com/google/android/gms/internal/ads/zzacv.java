package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacv {
    @Nullable
    public static zzay zza(zzaco zzacoVar, boolean z) throws IOException {
        zzay zzayVarZza = new zzadd().zza(zzacoVar, z ? null : zzagg.zza);
        if (zzayVarZza == null || zzayVarZza.zza() == 0) {
            return null;
        }
        return zzayVarZza;
    }

    public static zzacx zzb(zzdy zzdyVar) {
        zzdyVar.zzM(1);
        int iZzo = zzdyVar.zzo();
        long jZzd = zzdyVar.zzd();
        long j = iZzo;
        int i = iZzo / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jZzt = zzdyVar.zzt();
            if (jZzt == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzt;
            jArrCopyOf2[i2] = zzdyVar.zzt();
            zzdyVar.zzM(2);
        }
        zzdyVar.zzM((int) ((jZzd + j) - ((long) zzdyVar.zzd())));
        return new zzacx(jArrCopyOf, jArrCopyOf2);
    }
}
