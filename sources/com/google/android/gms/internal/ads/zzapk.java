package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzapk implements zzadz {
    private final zzfg zza;
    private final zzer zzb = new zzer();
    private final int zzc;

    public zzapk(int i2, zzfg zzfgVar, int i3) {
        this.zzc = i2;
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    public final zzady zza(zzaep zzaepVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzaepVar.zzn();
        int iMin = (int) Math.min(112800L, zzaepVar.zzo() - jZzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(iMin);
        zzaepVar.zzi(zzerVar.zzi(), 0, iMin);
        int iZze = zzerVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzerVar.zzd() >= 188 && (iZza2 = (iZza = zzapw.zza(zzerVar.zzi(), zzerVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzapw.zzb(zzerVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j) {
                    return j3 == -9223372036854775807L ? zzady.zza(jZze, jZzn) : zzady.zzc(jZzn + j4);
                }
                j4 = iZza;
                if (100000 + jZze > j) {
                    return zzady.zzc(jZzn + j4);
                }
                j3 = jZze;
            }
            zzerVar.zzh(iZza2);
            j2 = iZza2;
        }
        return j3 != -9223372036854775807L ? zzady.zzb(j3, jZzn + j2) : zzady.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
