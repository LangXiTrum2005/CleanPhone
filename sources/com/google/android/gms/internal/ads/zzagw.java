package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzagw implements zzadz {
    private final zzafb zza;
    private final int zzb;
    private final zzaev zzc = new zzaev();

    public /* synthetic */ zzagw(zzafb zzafbVar, int i2, byte[] bArr) {
        this.zza = zzafbVar;
        this.zzb = i2;
    }

    private final long zzc(zzaep zzaepVar) throws IOException {
        while (zzaepVar.zzm() < zzaepVar.zzo() - 6) {
            zzafb zzafbVar = this.zza;
            int i2 = this.zzb;
            zzaev zzaevVar = this.zzc;
            long jZzm = zzaepVar.zzm();
            zzer zzerVar = new zzer(17);
            zzaepVar.zzi(zzerVar.zzi(), 0, 2);
            if (zzerVar.zzo() != i2) {
                zzaepVar.zzl();
                zzaepVar.zzk((int) (jZzm - zzaepVar.zzn()));
            } else {
                zzerVar.zzf(zzaes.zzb(zzaepVar, zzerVar.zzi(), 2, 15) + 2);
                zzaepVar.zzl();
                zzaepVar.zzk((int) (jZzm - zzaepVar.zzn()));
                if (zzaew.zza(zzerVar, zzafbVar, i2, zzaevVar)) {
                    break;
                }
            }
            zzaepVar.zzk(1);
        }
        if (zzaepVar.zzm() < zzaepVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzaepVar.zzk((int) (zzaepVar.zzo() - zzaepVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    public final zzady zza(zzaep zzaepVar, long j) throws IOException {
        long jZzn = zzaepVar.zzn();
        long jZzc = zzc(zzaepVar);
        long jZzm = zzaepVar.zzm();
        zzaepVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzaepVar);
        long jZzm2 = zzaepVar.zzm();
        if (jZzc > j || jZzc2 <= j) {
            return jZzc2 <= j ? zzady.zzb(jZzc2, jZzm2) : zzady.zza(jZzc, jZzn);
        }
        return zzady.zzc(jZzm);
    }
}
