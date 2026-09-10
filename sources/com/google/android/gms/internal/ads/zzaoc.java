package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoc implements zzaog {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaga zzi;
    private zzaga zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaga zzw;
    private long zzx;
    private final zzeq zzc = new zzeq(new byte[7], 7);
    private final zzer zzd = new zzer(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzaoc(boolean z2, String str, int i2, String str2) {
        this.zzb = z2;
        this.zze = str;
        this.zzf = i2;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i2) {
        return (i2 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzer zzerVar, byte[] bArr, int i2) {
        int iMin = Math.min(zzerVar.zzd(), i2 - this.zzl);
        zzerVar.zzm(bArr, this.zzl, iMin);
        int i3 = this.zzl + iMin;
        this.zzl = i3;
        return i3 == i2;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzaga zzagaVar, long j, int i2, int i3) {
        this.zzk = 4;
        this.zzl = i2;
        this.zzw = zzagaVar;
        this.zzx = j;
        this.zzu = i3;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b2, byte b3) {
        return zzf((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 65280);
    }

    private static final boolean zzm(zzer zzerVar, byte[] bArr, int i2) {
        if (zzerVar.zzd() < i2) {
            return false;
        }
        zzerVar.zzm(bArr, 0, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        zzapuVar.zza();
        this.zzh = zzapuVar.zzc();
        zzaga zzagaVarZzu = zzaerVar.zzu(zzapuVar.zzb(), 1);
        this.zzi = zzagaVarZzu;
        this.zzw = zzagaVarZzu;
        if (!this.zzb) {
            this.zzj = new zzael();
            return;
        }
        zzapuVar.zza();
        zzaga zzagaVarZzu2 = zzaerVar.zzu(zzapuVar.zzb(), 5);
        this.zzj = zzagaVarZzu2;
        zzt zztVar = new zzt();
        zztVar.zza(zzapuVar.zzc());
        zztVar.zzl(this.zzg);
        zztVar.zzm("application/id3");
        zzagaVarZzu2.zzu(zztVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        this.zzv = j;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:103:0x0267  */
    /* JADX WARN: Code duplicated, block: B:104:0x026d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) throws zzat {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 2;
        this.zzi.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int i9 = this.zzk;
            char c2 = 7;
            int i10 = 3;
            if (i9 == 0) {
                byte[] bArrZzi = zzerVar.zzi();
                int iZzg = zzerVar.zzg();
                int iZze = zzerVar.zze();
                while (true) {
                    if (iZzg < iZze) {
                        int i11 = iZzg + 1;
                        byte b2 = bArrZzi[iZzg];
                        int i12 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        int i13 = i10;
                        if (this.zzm == 512 && zzl((byte) -1, (byte) i12)) {
                            if (!this.zzo) {
                                int i14 = iZzg - 1;
                                zzerVar.zzh(iZzg);
                                zzeq zzeqVar = this.zzc;
                                if (zzm(zzerVar, zzeqVar.zza, 1)) {
                                    zzeqVar.zzf(4);
                                    int iZzj = zzeqVar.zzj(1);
                                    int i15 = this.zzp;
                                    if (i15 == -1 || iZzj == i15) {
                                        if (this.zzq == -1) {
                                            i2 = i8;
                                        } else if (zzm(zzerVar, zzeqVar.zza, 1)) {
                                            zzeqVar.zzf(i8);
                                            i2 = i8;
                                            if (zzeqVar.zzj(4) == this.zzq) {
                                                zzerVar.zzh(iZzg + 1);
                                            }
                                        }
                                        if (zzm(zzerVar, zzeqVar.zza, 4)) {
                                            zzeqVar.zzf(14);
                                            int iZzj2 = zzeqVar.zzj(13);
                                            c2 = 7;
                                            if (iZzj2 >= 7) {
                                                byte[] bArrZzi2 = zzerVar.zzi();
                                                int iZze2 = zzerVar.zze();
                                                int i16 = i14 + iZzj2;
                                                if (i16 < iZze2) {
                                                    byte b3 = bArrZzi2[i16];
                                                    if (b3 == -1) {
                                                        int i17 = i16 + 1;
                                                        if (i17 != iZze2) {
                                                            byte b4 = bArrZzi2[i17];
                                                            if (!zzl((byte) -1, b4) || ((b4 & 8) >> 3) != iZzj) {
                                                            }
                                                        }
                                                    } else if (b3 != 73 || ((i5 = i16 + 1) != iZze2 && (bArrZzi2[i5] != 68 || ((i6 = i16 + 2) != iZze2 && bArrZzi2[i6] != 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                        this.zzr = (b2 & 8) >> 3;
                                        if (1 != ((b2 & 1) ^ 1)) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        this.zzn = z2;
                                        if (this.zzo) {
                                            zzk();
                                        } else {
                                            this.zzk = 1;
                                            this.zzl = 0;
                                        }
                                        zzerVar.zzh(i11);
                                        i8 = i2;
                                        i7 = 0;
                                    } else {
                                        i2 = i8;
                                    }
                                    c2 = 7;
                                } else {
                                    i2 = i8;
                                    c2 = 7;
                                }
                            }
                            i2 = i8;
                            this.zzr = (b2 & 8) >> 3;
                            if (1 != ((b2 & 1) ^ 1)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            this.zzn = z2;
                            if (this.zzo) {
                                this.zzk = 1;
                                this.zzl = 0;
                            } else {
                                zzk();
                            }
                            zzerVar.zzh(i11);
                            i8 = i2;
                            i7 = 0;
                        } else {
                            i2 = i8;
                            c2 = c2;
                        }
                        int i18 = this.zzm;
                        int i19 = i18 | i12;
                        if (i19 == 329) {
                            i3 = 0;
                            i4 = 768;
                        } else if (i19 == 511) {
                            i3 = 0;
                            i4 = 512;
                        } else if (i19 == 836) {
                            i3 = 0;
                            i4 = 1024;
                        } else if (i19 == 1075) {
                            int i20 = i2;
                            this.zzk = i20;
                            this.zzl = i13;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzerVar.zzh(i11);
                            i8 = i20;
                            i7 = 0;
                        } else if (i18 != 256) {
                            this.zzm = 256;
                            i10 = i13;
                            i8 = i2;
                            i7 = 0;
                        } else {
                            i13 = i13;
                            i2 = i2;
                            i3 = 0;
                            i7 = i3;
                            iZzg = i11;
                            i10 = i13;
                            i8 = i2;
                        }
                        this.zzm = i4;
                        i7 = i3;
                        iZzg = i11;
                        i10 = i13;
                        i8 = i2;
                    } else {
                        zzerVar.zzh(iZzg);
                    }
                }
            } else if (i9 != 1) {
                if (i9 == i8) {
                    zzer zzerVar2 = this.zzd;
                    if (zzh(zzerVar, zzerVar2.zzi(), 10)) {
                        this.zzj.zzz(zzerVar2, 10);
                        zzerVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzerVar2.zzG() + 10);
                    }
                } else if (i9 != 3) {
                    int iMin = Math.min(zzerVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzz(zzerVar, iMin);
                    int i21 = this.zzl + iMin;
                    this.zzl = i21;
                    if (i21 == this.zzu) {
                        zzgqa.zzi(this.zzv != -9223372036854775807L ? 1 : i7);
                        this.zzw.zzx(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i22 = true != this.zzn ? 5 : 7;
                    zzeq zzeqVar2 = this.zzc;
                    if (zzh(zzerVar, zzeqVar2.zza, i22)) {
                        zzeqVar2.zzf(i7);
                        if (this.zzs) {
                            zzeqVar2.zzh(10);
                        } else {
                            int iZzj3 = zzeqVar2.zzj(i8) + 1;
                            if (iZzj3 != i8) {
                                StringBuilder sb = new StringBuilder(String.valueOf(iZzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(iZzj3);
                                sb.append(", but assuming AAC LC.");
                                zzee.zzc("AdtsReader", sb.toString());
                            }
                            zzeqVar2.zzh(5);
                            int iZzj4 = zzeqVar2.zzj(3);
                            int i23 = this.zzq;
                            byte[] bArr = new byte[i8];
                            bArr[i7] = (byte) (((i23 >> 1) & 7) | 16);
                            bArr[1] = (byte) (((iZzj4 << 3) & 120) | ((i23 << 7) & 128));
                            zzadm zzadmVarZza = zzadn.zza(bArr);
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzh);
                            zztVar.zzl(this.zzg);
                            zztVar.zzm("audio/mp4a-latm");
                            zztVar.zzj(zzadmVarZza.zzc);
                            zztVar.zzE(zzadmVarZza.zzb);
                            zztVar.zzF(zzadmVarZza.zza);
                            zztVar.zzp(Collections.singletonList(bArr));
                            zztVar.zze(this.zze);
                            zztVar.zzg(this.zzf);
                            zzv zzvVarZzM = zztVar.zzM();
                            this.zzt = 1024000000 / ((long) zzvVarZzM.zzH);
                            this.zzi.zzu(zzvVarZzM);
                            this.zzs = true;
                        }
                        zzeqVar2.zzh(4);
                        int iZzj5 = zzeqVar2.zzj(13);
                        int i24 = iZzj5 - 7;
                        if (this.zzn) {
                            i24 = iZzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i24);
                    }
                }
            } else if (zzerVar.zzd() != 0) {
                zzeq zzeqVar3 = this.zzc;
                zzeqVar3.zza[i7] = zzerVar.zzi()[zzerVar.zzg()];
                zzeqVar3.zzf(i8);
                int iZzj6 = zzeqVar3.zzj(4);
                int i25 = this.zzq;
                if (i25 == -1 || iZzj6 == i25) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = iZzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
    }
}
