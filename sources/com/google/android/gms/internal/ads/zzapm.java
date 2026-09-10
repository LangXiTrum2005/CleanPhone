package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzapm {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    public zzapm(int i2) {
    }

    private final int zze(zzaep zzaepVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaepVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzaep zzaepVar, zzafo zzafoVar, int i2) throws IOException {
        if (i2 <= 0) {
            zze(zzaepVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaepVar);
                return 0;
            }
            if (this.zzd) {
                long j2 = this.zzf;
                if (j2 == -9223372036854775807L) {
                    zze(zzaepVar);
                    return 0;
                }
                zzfg zzfgVar = this.zza;
                this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j2);
                zze(zzaepVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzaepVar.zzo());
            if (zzaepVar.zzn() != 0) {
                zzafoVar.zza = 0L;
                return 1;
            }
            zzer zzerVar = this.zzb;
            zzerVar.zza(iMin);
            zzaepVar.zzl();
            zzaepVar.zzi(zzerVar.zzi(), 0, iMin);
            int iZze = zzerVar.zze();
            for (int iZzg = zzerVar.zzg(); iZzg < iZze; iZzg++) {
                if (zzerVar.zzi()[iZzg] == 71) {
                    long jZzb = zzapw.zzb(zzerVar, iZzg, i2);
                    if (jZzb != -9223372036854775807L) {
                        j = jZzb;
                        break;
                    }
                }
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzaepVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j3 = jZzo - ((long) iMin2);
        if (zzaepVar.zzn() != j3) {
            zzafoVar.zza = j3;
            return 1;
        }
        zzer zzerVar2 = this.zzb;
        zzerVar2.zza(iMin2);
        zzaepVar.zzl();
        zzaepVar.zzi(zzerVar2.zzi(), 0, iMin2);
        int iZzg2 = zzerVar2.zzg();
        int iZze2 = zzerVar2.zze();
        for (int i3 = iZze2 - 188; i3 >= iZzg2; i3--) {
            byte[] bArrZzi = zzerVar2.zzi();
            int i4 = 0;
            for (int i5 = -4; i5 <= 4; i5++) {
                int i6 = (i5 * 188) + i3;
                if (i6 >= iZzg2 && i6 < iZze2 && bArrZzi[i6] == 71) {
                    i4++;
                    if (i4 == 5) {
                        long jZzb2 = zzapw.zzb(zzerVar2, i3, i2);
                        if (jZzb2 == -9223372036854775807L) {
                            break;
                        }
                        j = jZzb2;
                        break;
                    }
                } else {
                    i4 = 0;
                }
            }
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfg zzd() {
        return this.zza;
    }
}
