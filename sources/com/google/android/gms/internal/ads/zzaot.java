package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaot implements zzaog {
    private String zzf;
    private zzaga zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzer zzb = new zzer(new byte[15], 2);
    private final zzeq zzc = new zzeq();
    private final zzer zzd = new zzer();
    private final zzaou zzq = new zzaou();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzaot(String str) {
    }

    private static final void zzf(zzer zzerVar, zzer zzerVar2, boolean z2) {
        int iZzg = zzerVar.zzg();
        int iMin = Math.min(zzerVar.zzd(), zzerVar2.zzd());
        zzerVar.zzm(zzerVar2.zzi(), zzerVar2.zzg(), iMin);
        zzerVar2.zzk(iMin);
        if (z2) {
            zzerVar.zzh(iZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zzf = zzapuVar.zzc();
        this.zzg = zzaerVar.zzu(zzapuVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzl = i2;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) throws zzat {
        int i2;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i3 = this.zze;
            int iZzj = 0;
            if (i3 == 0) {
                int i4 = this.zzl;
                if ((i4 & 2) != 0) {
                    if ((i4 & 4) == 0) {
                        while (zzerVar.zzd() > 0) {
                            int i5 = this.zzm << 8;
                            this.zzm = i5;
                            int iZzs = i5 | zzerVar.zzs();
                            this.zzm = iZzs;
                            if ((iZzs & 16777215) == 12583333) {
                                zzerVar.zzh(zzerVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzerVar.zzh(zzerVar.zze());
            } else if (i3 != 1) {
                zzaou zzaouVar = this.zzq;
                int i6 = zzaouVar.zza;
                if (i6 == 1 || i6 == 17) {
                    zzf(zzerVar, this.zzd, true);
                }
                int iMin = Math.min(zzerVar.zzd(), zzaouVar.zzc - this.zzo);
                this.zzg.zzz(zzerVar, iMin);
                int i7 = this.zzo + iMin;
                this.zzo = i7;
                if (i7 == zzaouVar.zzc) {
                    int i8 = zzaouVar.zza;
                    if (i8 == 1) {
                        byte[] bArrZzi = this.zzd.zzi();
                        zzaov zzaovVarZzb = zzaow.zzb(new zzeq(bArrZzi, bArrZzi.length));
                        this.zzr = zzaovVarZzb.zzb;
                        this.zzs = zzaovVarZzb.zzc;
                        long j = this.zzu;
                        long j2 = zzaouVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i9 = zzaovVarZzb.zza;
                            String strConcat = i9 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i9))) : "mhm1";
                            byte[] bArr = zzaovVarZzb.zzd;
                            zzgtd zzgtdVarZzk = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgtdVarZzk = zzgtd.zzk(zzfj.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzl(this.zza);
                            zztVar.zzm("audio/mhm1");
                            zztVar.zzF(this.zzr);
                            zztVar.zzj(strConcat);
                            zztVar.zzp(zzgtdVarZzk);
                            this.zzg.zzu(zztVar.zzM());
                        }
                        this.zzv = true;
                    } else if (i8 == 17) {
                        byte[] bArrZzi2 = this.zzd.zzi();
                        zzeq zzeqVar = new zzeq(bArrZzi2, bArrZzi2.length);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(2);
                            iZzj = zzeqVar.zzj(13);
                        }
                        this.zzt = iZzj;
                    } else if (i8 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        int i10 = this.zzs - this.zzt;
                        double d = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (((double) i10) * 1000000.0d) / d;
                        }
                        this.zzg.zzx(jRound, i2, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzer zzerVar2 = this.zzb;
                zzf(zzerVar, zzerVar2, false);
                if (zzerVar2.zzd() == 0) {
                    zzeq zzeqVar2 = this.zzc;
                    int iZze = zzerVar2.zze();
                    zzeqVar2.zzb(zzerVar2.zzi(), iZze);
                    zzaou zzaouVar2 = this.zzq;
                    if (zzaow.zza(zzeqVar2, zzaouVar2)) {
                        this.zzo = 0;
                        this.zzp = zzaouVar2.zzc + iZze + this.zzp;
                        zzerVar2.zzh(0);
                        this.zzg.zzz(zzerVar2, zzerVar2.zze());
                        zzerVar2.zza(2);
                        this.zzd.zza(zzaouVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzerVar2.zze() < 15) {
                        zzerVar2.zzf(zzerVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
    }
}
