package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaph implements zzapv {
    private final zzapg zza;
    private final zzer zzb = new zzer(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaph(zzapg zzapgVar) {
        this.zza = zzapgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final void zza(zzfg zzfgVar, zzaer zzaerVar, zzapu zzapuVar) {
        this.zza.zza(zzfgVar, zzaerVar, zzapuVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final void zzc(zzer zzerVar, int i2) {
        int iZzg;
        int i3 = i2 & 1;
        if (i3 != 0) {
            iZzg = zzerVar.zzg() + zzerVar.zzs();
        } else {
            iZzg = -1;
        }
        if (this.zzf) {
            if (i3 == 0) {
                return;
            }
            this.zzf = false;
            zzerVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzerVar.zzd() > 0) {
            int i4 = this.zzd;
            if (i4 < 3) {
                if (i4 == 0) {
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzh(zzerVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzerVar.zzd(), 3 - this.zzd);
                zzer zzerVar2 = this.zzb;
                zzerVar.zzm(zzerVar2.zzi(), this.zzd, iMin);
                int i5 = this.zzd + iMin;
                this.zzd = i5;
                if (i5 == 3) {
                    zzerVar2.zzh(0);
                    zzerVar2.zzf(3);
                    zzerVar2.zzk(1);
                    int iZzs2 = zzerVar2.zzs();
                    boolean z2 = (iZzs2 & 128) != 0;
                    int iZzs3 = zzerVar2.zzs();
                    this.zze = z2;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzerVar2.zzj();
                    int i6 = this.zzc;
                    if (iZzj < i6) {
                        int iZzj2 = zzerVar2.zzj();
                        zzerVar2.zzc(Math.min(4098, Math.max(i6, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzerVar.zzd(), this.zzc - this.zzd);
                zzer zzerVar3 = this.zzb;
                zzerVar.zzm(zzerVar3.zzi(), this.zzd, iMin2);
                int i7 = this.zzd + iMin2;
                this.zzd = i7;
                int i8 = this.zzc;
                if (i7 != i8) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzerVar3.zzf(i8);
                    } else {
                        if (zzfj.zzG(zzerVar3.zzi(), 0, i8, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzerVar3.zzf(this.zzc - 4);
                    }
                    zzerVar3.zzh(0);
                    this.zza.zzb(zzerVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
