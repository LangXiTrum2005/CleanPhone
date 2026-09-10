package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzanz implements zzaog {
    private final zzeq zza;
    private final zzer zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaga zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzanz(String str, int i2, String str2) {
        zzeq zzeqVar = new zzeq(new byte[16], 16);
        this.zza = zzeqVar;
        this.zzb = new zzer(zzeqVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i2;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zzf = zzapuVar.zzc();
        this.zzg = zzaerVar.zzu(zzapuVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) {
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i2 = this.zzh;
            if (i2 == 0) {
                while (true) {
                    if (zzerVar.zzd() > 0) {
                        if (this.zzj) {
                            int iZzs = zzerVar.zzs();
                            this.zzj = iZzs == 172;
                            if (iZzs != 64) {
                                if (iZzs == 65) {
                                    iZzs = 65;
                                }
                            }
                            this.zzh = 1;
                            zzer zzerVar2 = this.zzb;
                            zzerVar2.zzi()[0] = -84;
                            zzerVar2.zzi()[1] = iZzs == 65 ? (byte) 65 : (byte) 64;
                            this.zzi = 2;
                        } else {
                            this.zzj = zzerVar.zzs() == 172;
                        }
                    }
                }
            } else if (i2 != 1) {
                int iMin = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzz(zzerVar, iMin);
                int i3 = this.zzi + iMin;
                this.zzi = i3;
                if (i3 == this.zzm) {
                    zzgqa.zzi(this.zzn != -9223372036854775807L);
                    this.zzg.zzx(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzer zzerVar3 = this.zzb;
                byte[] bArrZzi = zzerVar3.zzi();
                int iMin2 = Math.min(zzerVar.zzd(), 16 - this.zzi);
                zzerVar.zzm(bArrZzi, this.zzi, iMin2);
                int i4 = this.zzi + iMin2;
                this.zzi = i4;
                if (i4 == 16) {
                    zzeq zzeqVar = this.zza;
                    zzeqVar.zzf(0);
                    zzadr zzadrVarZzb = zzads.zzb(zzeqVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzvVar.zzG != 2 || zzadrVarZzb.zza != zzvVar.zzH || !"audio/ac4".equals(zzvVar.zzo)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzl(this.zze);
                        zztVar.zzm("audio/ac4");
                        zztVar.zzE(2);
                        zztVar.zzF(zzadrVarZzb.zza);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        zzv zzvVarZzM = zztVar.zzM();
                        this.zzl = zzvVarZzM;
                        this.zzg.zzu(zzvVarZzM);
                    }
                    this.zzm = zzadrVarZzb.zzb;
                    this.zzk = (((long) zzadrVarZzb.zzc) * 1000000) / ((long) this.zzl.zzH);
                    zzerVar3.zzh(0);
                    this.zzg.zzz(zzerVar3, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
    }
}
