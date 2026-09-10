package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoz implements zzapv {
    private final zzaog zza;
    private final zzeq zzb = new zzeq(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfg zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaoz(zzaog zzaogVar) {
        this.zza = zzaogVar;
    }

    private final void zze(int i2) {
        this.zzc = i2;
        this.zzd = 0;
    }

    private final boolean zzf(zzer zzerVar, byte[] bArr, int i2) {
        int iMin = Math.min(zzerVar.zzd(), i2 - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzerVar.zzk(iMin);
        } else {
            zzerVar.zzm(bArr, this.zzd, iMin);
        }
        int i3 = this.zzd + iMin;
        this.zzd = i3;
        return i3 == i2;
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final void zza(zzfg zzfgVar, zzaer zzaerVar, zzapu zzapuVar) {
        this.zze = zzfgVar;
        this.zza.zzb(zzaerVar, zzapuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzapv
    public final void zzc(zzer zzerVar, int i2) throws zzat {
        int i3;
        int i4;
        long jZze;
        this.zze.getClass();
        int i5 = -1;
        int i6 = 2;
        if ((i2 & 1) != 0) {
            int i7 = this.zzc;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.zzj;
                    if (i8 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i8);
                        sb.append(" more bytes");
                        zzee.zzc("PesReader", sb.toString());
                    }
                    this.zza.zze(zzerVar.zze() == 0);
                } else {
                    zzee.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i9 = i2;
        while (zzerVar.zzd() > 0) {
            int i10 = this.zzc;
            if (i10 == 0) {
                i3 = i6;
                zzerVar.zzk(zzerVar.zzd());
            } else if (i10 != 1) {
                if (i10 != i6) {
                    int iZzd = zzerVar.zzd();
                    int i11 = this.zzj;
                    int i12 = i11 == i5 ? 0 : iZzd - i11;
                    if (i12 > 0) {
                        iZzd -= i12;
                        zzerVar.zzf(zzerVar.zzg() + iZzd);
                    }
                    zzaog zzaogVar = this.zza;
                    zzaogVar.zzd(zzerVar);
                    int i13 = this.zzj;
                    if (i13 != i5) {
                        int i14 = i13 - iZzd;
                        this.zzj = i14;
                        if (i14 == 0) {
                            zzaogVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzeq zzeqVar = this.zzb;
                    if (zzf(zzerVar, zzeqVar.zza, iMin) && zzf(zzerVar, null, this.zzi)) {
                        zzeqVar.zzf(0);
                        if (this.zzf) {
                            zzeqVar.zzh(4);
                            long jZzj = zzeqVar.zzj(3);
                            zzeqVar.zzh(1);
                            int iZzj = zzeqVar.zzj(15) << 15;
                            zzeqVar.zzh(1);
                            long jZzj2 = zzeqVar.zzj(15);
                            zzeqVar.zzh(1);
                            if (!this.zzh && this.zzg) {
                                zzeqVar.zzh(4);
                                long jZzj3 = ((long) zzeqVar.zzj(3)) << 30;
                                zzeqVar.zzh(1);
                                int iZzj2 = zzeqVar.zzj(15) << 15;
                                zzeqVar.zzh(1);
                                long jZzj4 = zzeqVar.zzj(15);
                                zzeqVar.zzh(1);
                                this.zze.zze(jZzj3 | ((long) iZzj2) | jZzj4);
                                this.zzh = true;
                            }
                            jZze = this.zze.zze(jZzj2 | (jZzj << 30) | ((long) iZzj));
                        } else {
                            jZze = -9223372036854775807L;
                        }
                        i9 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(jZze, i9);
                        zze(3);
                        i5 = -1;
                        i6 = 2;
                    }
                }
                i3 = i6;
            } else {
                zzeq zzeqVar2 = this.zzb;
                if (zzf(zzerVar, zzeqVar2.zza, 9)) {
                    zzeqVar2.zzf(0);
                    int iZzj3 = zzeqVar2.zzj(24);
                    if (iZzj3 != 1) {
                        Z.w(new StringBuilder(String.valueOf(iZzj3).length() + 30), "Unexpected start code prefix: ", iZzj3, "PesReader");
                        i5 = -1;
                        this.zzj = -1;
                        i4 = 0;
                        i3 = 2;
                    } else {
                        zzeqVar2.zzh(8);
                        int iZzj4 = zzeqVar2.zzj(16);
                        zzeqVar2.zzh(5);
                        this.zzk = zzeqVar2.zzi();
                        i3 = 2;
                        zzeqVar2.zzh(2);
                        this.zzf = zzeqVar2.zzi();
                        this.zzg = zzeqVar2.zzi();
                        zzeqVar2.zzh(6);
                        int iZzj5 = zzeqVar2.zzj(8);
                        this.zzi = iZzj5;
                        if (iZzj4 == 0) {
                            this.zzj = -1;
                            i5 = -1;
                        } else {
                            int i15 = (iZzj4 - 3) - iZzj5;
                            this.zzj = i15;
                            if (i15 < 0) {
                                Z.w(new StringBuilder(String.valueOf(i15).length() + 36), "Found negative packet payload size: ", i15, "PesReader");
                                i5 = -1;
                                this.zzj = -1;
                            } else {
                                i5 = -1;
                            }
                        }
                        i4 = 2;
                    }
                    zze(i4);
                } else {
                    i5 = -1;
                    i3 = 2;
                }
            }
            i6 = i3;
        }
    }

    public final boolean zzd(boolean z2) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
