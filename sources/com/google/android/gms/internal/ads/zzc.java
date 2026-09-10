package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    public static final zzc zza = new zzc(null, new zza[0], 0, -9223372036854775807L, 0);
    private static final zza zze = new zza(0).zzb(0);
    private final zza[] zzf;
    public final long zzc = 0;
    public final int zzb = 0;
    public final int zzd = 0;

    static {
        String str = zzfj.zza;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private zzc(Object obj, zza[] zzaVarArr, long j, long j2, int i2) {
        this.zzf = zzaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzc.class == obj.getClass() && Arrays.equals(this.zzf, ((zzc) obj).zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return android.support.v4.media.a.C("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }

    public final zza zza(int i2) {
        return i2 < 0 ? zze : this.zzf[i2];
    }

    public final boolean zzb(int i2) {
        zza(-1);
        return false;
    }
}
