package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzajm {
    public final zzafk zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzajm(zzafk zzafkVar, long j, long j2, long[] jArr, int i2, int i3) {
        this.zza = new zzafk(zzafkVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i2;
        this.zze = i3;
    }

    public static zzajm zza(zzafk zzafkVar, zzer zzerVar) {
        long[] jArr;
        int i2;
        int i3;
        int iZzB = zzerVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzerVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzerVar.zzz() : -1L;
        if ((iZzB & 4) == 4) {
            jArr = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr[i4] = zzerVar.zzs();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzB & 8) != 0) {
            zzerVar.zzk(4);
        }
        if (zzerVar.zzd() >= 24) {
            zzerVar.zzk(21);
            int iZzx = zzerVar.zzx();
            i3 = iZzx & 4095;
            i2 = iZzx >> 12;
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new zzajm(zzafkVar, iZzH, jZzz, jArr2, i2, i3);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        zzafk zzafkVar = this.zza;
        return zzfj.zzr((j * ((long) zzafkVar.zzg)) - 1, zzafkVar.zzd);
    }
}
