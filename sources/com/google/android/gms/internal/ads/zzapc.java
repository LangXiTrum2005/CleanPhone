package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzapc {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    public static long zze(zzer zzerVar) {
        int iZzg = zzerVar.zzg();
        if (zzerVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzerVar.zzm(bArr, 0, 9);
        zzerVar.zzh(iZzg);
        byte b2 = bArr[0];
        if ((b2 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[2];
        if ((b3 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b4 = bArr[4];
        if ((b4 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b2;
        long j2 = b3;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
    }

    private final int zzf(zzaep zzaepVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaepVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfg zzb() {
        return this.zza;
    }

    public final int zzc(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzaepVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j2 = jZzo - ((long) iMin);
            if (zzaepVar.zzn() != j2) {
                zzafoVar.zza = j2;
                return 1;
            }
            zzer zzerVar = this.zzb;
            zzerVar.zza(iMin);
            zzaepVar.zzl();
            zzaepVar.zzi(zzerVar.zzi(), 0, iMin);
            int iZzg = zzerVar.zzg();
            for (int iZze = zzerVar.zze() - 4; iZze >= iZzg; iZze--) {
                if (zzg(zzerVar.zzi(), iZze) == 442) {
                    zzerVar.zzh(iZze + 4);
                    long jZze = zze(zzerVar);
                    if (jZze != -9223372036854775807L) {
                        j = jZze;
                        break;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzaepVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzaepVar);
                return 0;
            }
            zzfg zzfgVar = this.zza;
            this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j3);
            zzf(zzaepVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzaepVar.zzo());
        if (zzaepVar.zzn() != 0) {
            zzafoVar.zza = 0L;
            return 1;
        }
        zzer zzerVar2 = this.zzb;
        zzerVar2.zza(iMin2);
        zzaepVar.zzl();
        zzaepVar.zzi(zzerVar2.zzi(), 0, iMin2);
        int iZze2 = zzerVar2.zze();
        for (int iZzg2 = zzerVar2.zzg(); iZzg2 < iZze2 - 3; iZzg2++) {
            if (zzg(zzerVar2.zzi(), iZzg2) == 442) {
                zzerVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzerVar2);
                if (jZze2 != -9223372036854775807L) {
                    j = jZze2;
                    break;
                }
            }
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
