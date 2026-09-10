package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaos implements zzaog {
    private final zzer zza;
    private final zzafk zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private zzaga zzf;
    private String zzg;
    private int zzh = 0;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaos(String str, int i2, String str2) {
        zzer zzerVar = new zzer(4);
        this.zza = zzerVar;
        zzerVar.zzi()[0] = -1;
        this.zzb = new zzafk();
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i2;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zzg = zzapuVar.zzc();
        this.zzf = zzaerVar.zzu(zzapuVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) {
        this.zzf.getClass();
        while (zzerVar.zzd() > 0) {
            int i2 = this.zzh;
            if (i2 == 0) {
                byte[] bArrZzi = zzerVar.zzi();
                int iZzg = zzerVar.zzg();
                int iZze = zzerVar.zze();
                while (true) {
                    if (iZzg >= iZze) {
                        zzerVar.zzh(iZze);
                        break;
                    }
                    int i3 = iZzg + 1;
                    byte b2 = bArrZzi[iZzg];
                    boolean z2 = (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z3 = this.zzk && (b2 & 224) == 224;
                    this.zzk = z2;
                    if (z3) {
                        zzerVar.zzh(i3);
                        this.zzk = false;
                        this.zza.zzi()[1] = bArrZzi[iZzg];
                        this.zzi = 2;
                        this.zzh = 1;
                        break;
                    }
                    iZzg = i3;
                }
            } else if (i2 != 1) {
                int iMin = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                this.zzf.zzz(zzerVar, iMin);
                int i4 = this.zzi + iMin;
                this.zzi = i4;
                if (i4 >= this.zzm) {
                    zzgqa.zzi(this.zzn != -9223372036854775807L);
                    this.zzf.zzx(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzl;
                    this.zzi = 0;
                    this.zzh = 0;
                }
            } else {
                int iMin2 = Math.min(zzerVar.zzd(), 4 - this.zzi);
                zzer zzerVar2 = this.zza;
                zzerVar.zzm(zzerVar2.zzi(), this.zzi, iMin2);
                int i5 = this.zzi + iMin2;
                this.zzi = i5;
                if (i5 >= 4) {
                    zzerVar2.zzh(0);
                    zzafk zzafkVar = this.zzb;
                    if (zzafkVar.zza(zzerVar2.zzB())) {
                        this.zzm = zzafkVar.zzc;
                        if (!this.zzj) {
                            this.zzl = (((long) zzafkVar.zzg) * 1000000) / ((long) zzafkVar.zzd);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzg);
                            zztVar.zzl(this.zze);
                            zztVar.zzm(zzafkVar.zzb);
                            zztVar.zzn(4096);
                            zztVar.zzE(zzafkVar.zze);
                            zztVar.zzF(zzafkVar.zzd);
                            zztVar.zze(this.zzc);
                            zztVar.zzg(this.zzd);
                            this.zzf.zzu(zztVar.zzM());
                            this.zzj = true;
                        }
                        zzerVar2.zzh(0);
                        this.zzf.zzz(zzerVar2, 4);
                        this.zzh = 2;
                    } else {
                        this.zzi = 0;
                        this.zzh = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
    }
}
