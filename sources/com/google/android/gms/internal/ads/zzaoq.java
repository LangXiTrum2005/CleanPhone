package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoq implements zzaog {
    private zzaga zzc;
    private boolean zzd;
    private int zzf;
    private int zzg;
    private final String zza = "video/mp2t";
    private final zzer zzb = new zzer(10);
    private long zze = -9223372036854775807L;

    public zzaoq(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zzd = false;
        this.zze = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        zzaga zzagaVarZzu = zzaerVar.zzu(zzapuVar.zzb(), 5);
        this.zzc = zzagaVarZzu;
        zzt zztVar = new zzt();
        zztVar.zza(zzapuVar.zzc());
        zztVar.zzl(this.zza);
        zztVar.zzm("application/id3");
        zzagaVarZzu.zzu(zztVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zze = j;
        this.zzf = 0;
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) {
        this.zzc.getClass();
        if (this.zzd) {
            int iZzd = zzerVar.zzd();
            int i2 = this.zzg;
            if (i2 < 10) {
                int iMin = Math.min(iZzd, 10 - i2);
                byte[] bArrZzi = zzerVar.zzi();
                int iZzg = zzerVar.zzg();
                zzer zzerVar2 = this.zzb;
                System.arraycopy(bArrZzi, iZzg, zzerVar2.zzi(), this.zzg, iMin);
                if (this.zzg + iMin == 10) {
                    zzerVar2.zzh(0);
                    if (zzerVar2.zzs() != 73 || zzerVar2.zzs() != 68 || zzerVar2.zzs() != 51) {
                        zzee.zzc("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzd = false;
                        return;
                    } else {
                        zzerVar2.zzk(3);
                        this.zzf = zzerVar2.zzG() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZzd, this.zzf - this.zzg);
            this.zzc.zzz(zzerVar, iMin2);
            this.zzg += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
        int i2;
        this.zzc.getClass();
        if (this.zzd && (i2 = this.zzf) != 0 && this.zzg == i2) {
            zzgqa.zzi(this.zze != -9223372036854775807L);
            this.zzc.zzx(this.zze, 1, this.zzf, 0, null);
            this.zzd = false;
        }
    }
}
