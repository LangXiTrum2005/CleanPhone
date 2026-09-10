package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoe implements zzaog {
    private final zzer zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaga zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzaoe(String str, int i2, int i3, String str2) {
        this.zza = new zzer(new byte[i3]);
        this.zzc = str;
        this.zzd = i2;
    }

    private final boolean zzf(zzer zzerVar, byte[] bArr, int i2) {
        int iMin = Math.min(zzerVar.zzd(), i2 - this.zzi);
        zzerVar.zzm(bArr, this.zzi, iMin);
        int i3 = this.zzi + iMin;
        this.zzi = i3;
        return i3 == i2;
    }

    @RequiresNonNull
    private final void zzg(zzaem zzaemVar) {
        int i2;
        int i3 = zzaemVar.zzb;
        if (i3 == -2147483647 || (i2 = zzaemVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i2 == zzvVar.zzG && i3 == zzvVar.zzH && Objects.equals(zzaemVar.zza, zzvVar.zzo)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzl(this.zze);
        zztVar.zzm(zzaemVar.zza);
        zztVar.zzE(i2);
        zztVar.zzF(i3);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzvVarZzM = zztVar.zzM();
        this.zzl = zzvVarZzM;
        this.zzg.zzu(zzvVarZzM);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zzf = zzapuVar.zzc();
        this.zzg = zzaerVar.zzu(zzapuVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) throws zzat {
        int i2;
        byte b2;
        int i3;
        byte b3;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i4 = this.zzh;
            if (i4 == 0) {
                while (zzerVar.zzd() > 0) {
                    int i5 = this.zzj << 8;
                    this.zzj = i5;
                    int iZzs = i5 | zzerVar.zzs();
                    this.zzj = iZzs;
                    int iZza = zzaen.zza(iZzs);
                    this.zzn = iZza;
                    if (iZza != 0) {
                        byte[] bArrZzi = this.zza.zzi();
                        int i6 = this.zzj;
                        bArrZzi[0] = (byte) ((i6 >> 24) & 255);
                        bArrZzi[1] = (byte) ((i6 >> 16) & 255);
                        bArrZzi[2] = (byte) ((i6 >> 8) & 255);
                        bArrZzi[3] = (byte) (i6 & 255);
                        this.zzi = 4;
                        this.zzj = 0;
                        if (iZza != 3 && iZza != 4) {
                            if (iZza != 1) {
                                this.zzh = 2;
                                break;
                            } else {
                                this.zzh = 1;
                                break;
                            }
                        }
                        this.zzh = 4;
                        break;
                    }
                }
            } else if (i4 == 1) {
                zzer zzerVar2 = this.zza;
                if (zzf(zzerVar, zzerVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzerVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzvVarZzb = zzaen.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzvVarZzb;
                        this.zzg.zzu(zzvVarZzb);
                    }
                    this.zzm = zzaen.zzc(bArrZzi2);
                    byte b4 = bArrZzi2[0];
                    if (b4 != -2) {
                        if (b4 == -1) {
                            i2 = (bArrZzi2[4] & 7) << 4;
                            b3 = bArrZzi2[7];
                        } else if (b4 != 31) {
                            i2 = (bArrZzi2[4] & 1) << 6;
                            b2 = bArrZzi2[5];
                        } else {
                            i2 = (bArrZzi2[5] & 7) << 4;
                            b3 = bArrZzi2[6];
                        }
                        i3 = b3 & 60;
                        this.zzk = zzgwx.zza(zzfj.zzr(((i2 | (i3 >> 2)) + 1) * 32, this.zzl.zzH));
                        zzerVar2.zzh(0);
                        this.zzg.zzz(zzerVar2, 18);
                        this.zzh = 6;
                    } else {
                        i2 = (bArrZzi2[5] & 1) << 6;
                        b2 = bArrZzi2[4];
                    }
                    i3 = b2 & 252;
                    this.zzk = zzgwx.zza(zzfj.zzr(((i2 | (i3 >> 2)) + 1) * 32, this.zzl.zzH));
                    zzerVar2.zzh(0);
                    this.zzg.zzz(zzerVar2, 18);
                    this.zzh = 6;
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    zzer zzerVar3 = this.zza;
                    if (zzf(zzerVar, zzerVar3.zzi(), this.zzo)) {
                        zzaem zzaemVarZzd = zzaen.zzd(zzerVar3.zzi());
                        zzg(zzaemVarZzd);
                        this.zzm = zzaemVarZzd.zzd;
                        long j = zzaemVarZzd.zze;
                        this.zzk = j != -9223372036854775807L ? j : 0L;
                        zzerVar3.zzh(0);
                        this.zzg.zzz(zzerVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i4 == 4) {
                    zzer zzerVar4 = this.zza;
                    if (zzf(zzerVar, zzerVar4.zzi(), 6)) {
                        int iZzg = zzaen.zzg(zzerVar4.zzi());
                        this.zzp = iZzg;
                        int i7 = this.zzi;
                        if (i7 > iZzg) {
                            int i8 = i7 - iZzg;
                            this.zzi = i7 - i8;
                            zzerVar.zzh(zzerVar.zzg() - i8);
                        }
                        this.zzh = 5;
                    }
                } else if (i4 != 5) {
                    int iMin = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzz(zzerVar, iMin);
                    int i9 = this.zzi + iMin;
                    this.zzi = i9;
                    if (i9 == this.zzm) {
                        zzgqa.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zzx(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzer zzerVar5 = this.zza;
                    if (zzf(zzerVar, zzerVar5.zzi(), this.zzp)) {
                        zzaem zzaemVarZzf = zzaen.zzf(zzerVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzaemVarZzf);
                        }
                        this.zzm = zzaemVarZzf.zzd;
                        long j2 = zzaemVarZzf.zze;
                        this.zzk = j2 != -9223372036854775807L ? j2 : 0L;
                        zzerVar5.zzh(0);
                        this.zzg.zzz(zzerVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzer zzerVar6 = this.zza;
                if (zzf(zzerVar, zzerVar6.zzi(), 7)) {
                    this.zzo = zzaen.zze(zzerVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
    }
}
