package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzanv implements zzaeo {
    private final zzanw zza = new zzanw(null, 0, "audio/ac3");
    private final zzer zzb = new zzer(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        zzer zzerVar = new zzer(10);
        int i2 = 0;
        while (true) {
            zzaef zzaefVar = (zzaef) zzaepVar;
            zzaefVar.zzh(zzerVar.zzi(), 0, 10, false);
            zzerVar.zzh(0);
            if (zzerVar.zzx() != 4801587) {
                break;
            }
            zzerVar.zzk(3);
            int iZzG = zzerVar.zzG();
            i2 += iZzG + 10;
            zzaefVar.zzj(iZzG, false);
        }
        zzaepVar.zzl();
        zzaef zzaefVar2 = (zzaef) zzaepVar;
        zzaefVar2.zzj(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            zzaefVar2.zzh(zzerVar.zzi(), 0, 6, false);
            zzerVar.zzh(0);
            if (zzerVar.zzt() != 2935) {
                zzaepVar.zzl();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzaefVar2.zzj(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iZzd = zzadp.zzd(zzerVar.zzi());
                if (iZzd == -1) {
                    return false;
                }
                zzaefVar2.zzj(iZzd - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zza.zzb(zzaerVar, new zzapu(Integer.MIN_VALUE, 0, 1));
        zzaerVar.zzv();
        zzaerVar.zzw(new zzafq(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        zzer zzerVar = this.zzb;
        int iZza = zzaepVar.zza(zzerVar.zzi(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
