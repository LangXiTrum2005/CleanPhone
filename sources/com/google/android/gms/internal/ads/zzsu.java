package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
public final class zzsu implements zzsk {
    public zzsu(zzst zzstVar) {
    }

    public static int zza(int i2, int i3, int i4) {
        return zzgwx.zza(((((long) i2) * ((long) i3)) * ((long) i4)) / 1000000);
    }

    public static final int zzb(int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = 250000;
        if (i4 == 0) {
            int iZza = zza(250000, i6, i5);
            int iZza2 = zza(750000, i6, i5);
            String str = zzfj.zza;
            return Math.max(iZza, Math.min(i2 * 4, iZza2));
        }
        if (i4 == 1) {
            return zzgwx.zza((((long) zzc(i3)) * 50000000) / 1000000);
        }
        if (i3 == 5) {
            i8 = 500000;
        } else if (i3 == 8) {
            i8 = 1000000;
            i3 = 8;
        }
        return zzgwx.zza((((long) i8) * ((long) (i7 != -1 ? zzgwq.zzb(i7, 8, RoundingMode.CEILING) : zzc(i3)))) / 1000000);
    }

    private static int zzc(int i2) {
        int iZzf = zzaes.zzf(i2);
        zzgqa.zzi(iZzf != -2147483647);
        return iZzf;
    }
}
