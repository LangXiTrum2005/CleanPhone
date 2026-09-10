package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class zzalh {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzer zzg = new zzer(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaep zzaepVar, long j) throws IOException {
        zzgqa.zza(zzaepVar.zzn() == zzaepVar.zzm());
        zzer zzerVar = this.zzg;
        zzerVar.zza(4);
        while (true) {
            if ((j != -1 && zzaepVar.zzn() + 4 >= j) || !zzaes.zze(zzaepVar, zzerVar.zzi(), 0, 4, true)) {
                break;
            }
            zzerVar.zzh(0);
            if (zzerVar.zzz() == 1332176723) {
                zzaepVar.zzl();
                return true;
            }
            zzaepVar.zzf(1);
        }
        do {
            if (j != -1 && zzaepVar.zzn() >= j) {
                break;
            }
        } while (zzaepVar.zzd(1) != -1);
        return false;
    }

    public final boolean zzc(zzaep zzaepVar, boolean z2) throws IOException {
        zza();
        zzer zzerVar = this.zzg;
        zzerVar.zza(27);
        if (zzaes.zze(zzaepVar, zzerVar.zzi(), 0, 27, z2) && zzerVar.zzz() == 1332176723) {
            if (zzerVar.zzs() != 0) {
                if (z2) {
                    return false;
                }
                throw zzat.zzc("unsupported bit stream revision");
            }
            this.zza = zzerVar.zzs();
            this.zzb = zzerVar.zzE();
            zzerVar.zzA();
            zzerVar.zzA();
            zzerVar.zzA();
            int iZzs = zzerVar.zzs();
            this.zzc = iZzs;
            this.zzd = iZzs + 27;
            zzerVar.zza(iZzs);
            if (zzaes.zze(zzaepVar, zzerVar.zzi(), 0, this.zzc, z2)) {
                for (int i2 = 0; i2 < this.zzc; i2++) {
                    int[] iArr = this.zzf;
                    int iZzs2 = zzerVar.zzs();
                    iArr[i2] = iZzs2;
                    this.zze += iZzs2;
                }
                return true;
            }
        }
        return false;
    }
}
