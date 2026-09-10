package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadc {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final int zzj;

    @Nullable
    public final String zzk;

    @Nullable
    public final zzfh zzl;

    private zzadc(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, @Nullable String str, @Nullable zzfh zzfhVar) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = f;
        this.zzj = i10;
        this.zzk = str;
        this.zzl = zzfhVar;
    }

    public static zzadc zza(zzdy zzdyVar) throws zzbc {
        return zzc(zzdyVar, false, null);
    }

    public static zzadc zzb(zzdy zzdyVar, zzfh zzfhVar) throws zzbc {
        return zzc(zzdyVar, true, zzfhVar);
    }

    private static zzadc zzc(zzdy zzdyVar, boolean z, @Nullable zzfh zzfhVar) throws zzbc {
        int i;
        int i2;
        zzfd zzfdVar;
        int i3 = 4;
        try {
            if (z) {
                zzdyVar.zzM(4);
            } else {
                zzdyVar.zzM(21);
            }
            int iZzm = zzdyVar.zzm() & 3;
            int iZzm2 = zzdyVar.zzm();
            int iZzd = zzdyVar.zzd();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iZzm2; i6++) {
                zzdyVar.zzM(1);
                int iZzq = zzdyVar.zzq();
                for (int i7 = 0; i7 < iZzq; i7++) {
                    int iZzq2 = zzdyVar.zzq();
                    i5 += iZzq2 + 4;
                    zzdyVar.zzM(iZzq2);
                }
            }
            zzdyVar.zzL(iZzd);
            byte[] bArr = new byte[i5];
            zzfh zzfhVar2 = zzfhVar;
            int i8 = 0;
            int i9 = 0;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f = 1.0f;
            int i18 = -1;
            String strZzd = null;
            while (i8 < iZzm2) {
                int iZzm3 = zzdyVar.zzm() & 63;
                int iZzq3 = zzdyVar.zzq();
                zzfh zzfhVarZzd = zzfhVar2;
                int i19 = 0;
                while (i19 < iZzq3) {
                    int iZzq4 = zzdyVar.zzq();
                    int i20 = iZzm2;
                    System.arraycopy(zzfk.zza, i4, bArr, i9, i3);
                    int i21 = i9 + 4;
                    System.arraycopy(zzdyVar.zzN(), zzdyVar.zzd(), bArr, i21, iZzq4);
                    int i22 = 32;
                    if (iZzm3 == 32) {
                        if (i19 == 0) {
                            zzfhVarZzd = zzfk.zzd(bArr, i21, i21 + iZzq4);
                            i = iZzq3;
                            iZzm3 = iZzm3;
                            i19 = 0;
                        }
                        i9 = i21 + iZzq4;
                        zzdyVar.zzM(iZzq4);
                        i19++;
                        iZzm2 = i20;
                        iZzq3 = i;
                        iZzm3 = iZzm3;
                        i3 = 4;
                        i4 = 0;
                    } else {
                        i22 = iZzm3;
                    }
                    i = iZzq3;
                    int i23 = 8;
                    if (i22 != 33) {
                        iZzm3 = iZzm3;
                        if (i22 == 39 && i19 == 0) {
                            int i24 = i9 + 6;
                            int i25 = (i21 + iZzq4) - 1;
                            while (true) {
                                byte b = bArr[i25];
                                if (b != 0) {
                                    if (b != 0 && i25 > i24) {
                                        zzfl zzflVar = new zzfl(bArr, i24, i25 + 1);
                                        while (true) {
                                            if (zzflVar.zzg(16)) {
                                                int iZza = zzflVar.zza(i23);
                                                int i26 = 0;
                                                while (iZza == 255) {
                                                    i26 += 255;
                                                    iZza = zzflVar.zza(i23);
                                                }
                                                int i27 = i26 + iZza;
                                                int iZza2 = zzflVar.zza(i23);
                                                int i28 = 0;
                                                while (iZza2 == 255) {
                                                    i28 += 255;
                                                    iZza2 = zzflVar.zza(8);
                                                }
                                                int i29 = i28 + iZza2;
                                                if (i29 != 0 && zzflVar.zzg(i29)) {
                                                    if (i27 == 176) {
                                                        int iZzc = zzflVar.zzc();
                                                        boolean zZzh = zzflVar.zzh();
                                                        int iZzc2 = zZzh ? zzflVar.zzc() : 0;
                                                        int iZzc3 = zzflVar.zzc();
                                                        int i30 = 0;
                                                        int iZzc4 = -1;
                                                        int iZzc5 = -1;
                                                        int i31 = -1;
                                                        int iZza3 = -1;
                                                        int i32 = -1;
                                                        int iZza4 = -1;
                                                        while (true) {
                                                            if (i30 <= iZzc3) {
                                                                iZzc4 = zzflVar.zzc();
                                                                iZzc5 = zzflVar.zzc();
                                                                i2 = i19;
                                                                int iZza5 = zzflVar.zza(6);
                                                                if (iZza5 != 63) {
                                                                    iZza3 = zzflVar.zza(iZza5 == 0 ? Math.max(0, iZzc - 30) : Math.max(0, (iZza5 + iZzc) - 31));
                                                                    if (zZzh) {
                                                                        int iZza6 = zzflVar.zza(6);
                                                                        if (iZza6 != 63) {
                                                                            iZza4 = zzflVar.zza(iZza6 == 0 ? Math.max(0, iZzc2 - 30) : Math.max(0, (iZza6 + iZzc2) - 31));
                                                                            i32 = iZza6;
                                                                        }
                                                                    } else {
                                                                        zZzh = zZzh;
                                                                    }
                                                                    if (zzflVar.zzh()) {
                                                                        zzflVar.zzf(10);
                                                                    }
                                                                    i30++;
                                                                    i31 = iZza5;
                                                                    i19 = i2;
                                                                    zZzh = zZzh;
                                                                    i10 = i10;
                                                                }
                                                                zzfdVar = null;
                                                            } else {
                                                                i2 = i19;
                                                                i10 = i10;
                                                                zzfdVar = new zzfd(iZzc, iZzc2, iZzc3 + 1, iZzc4, iZzc5, i31, iZza3, i32, iZza4);
                                                            }
                                                        }
                                                    } else {
                                                        i23 = 8;
                                                    }
                                                }
                                                i10 = i10;
                                                zzfdVar = null;
                                            }
                                        }
                                    }
                                    if (zzfdVar == null && zzfhVarZzd != null) {
                                        if (zzfdVar.zza == ((zzex) zzfhVarZzd.zza.get(0)).zzb) {
                                            i19 = i2;
                                            i10 = i10;
                                            i17 = 4;
                                        } else {
                                            i19 = i2;
                                            i10 = i10;
                                            i17 = 5;
                                        }
                                    }
                                } else if (i25 > i24) {
                                    i25--;
                                }
                                i2 = i19;
                                i10 = i10;
                                zzfdVar = null;
                                if (zzfdVar == null) {
                                }
                            }
                        } else {
                            i2 = i19;
                            i10 = i10;
                        }
                        i19 = i2;
                        i10 = i10;
                    } else if (i19 == 0) {
                        zzfe zzfeVarZzc = zzfk.zzc(bArr, i21, i21 + iZzq4, zzfhVarZzd);
                        int i33 = zzfeVarZzc.zzd;
                        int i34 = zzfeVarZzc.zze;
                        int i35 = zzfeVarZzc.zzb + 8;
                        int i36 = zzfeVarZzc.zzc + 8;
                        int i37 = zzfeVarZzc.zzh;
                        int i38 = zzfeVarZzc.zzi;
                        int i39 = zzfeVarZzc.zzj;
                        float f2 = zzfeVarZzc.zzf;
                        int i40 = zzfeVarZzc.zzg;
                        zzez zzezVar = zzfeVarZzc.zza;
                        if (zzezVar != null) {
                            strZzd = zzcy.zzd(zzezVar.zza, zzezVar.zzb, zzezVar.zzc, zzezVar.zzd, zzezVar.zze, zzezVar.zzf);
                        }
                        i10 = i33;
                        i11 = i34;
                        i18 = i40;
                        i16 = i39;
                        i14 = i37;
                        f = f2;
                        i15 = i38;
                        i13 = i36;
                        i12 = i35;
                    } else {
                        iZzm3 = iZzm3;
                        i2 = i19;
                        i10 = i10;
                        i19 = i2;
                        i10 = i10;
                    }
                    i9 = i21 + iZzq4;
                    zzdyVar.zzM(iZzq4);
                    i19++;
                    iZzm2 = i20;
                    iZzq3 = i;
                    iZzm3 = iZzm3;
                    i3 = 4;
                    i4 = 0;
                }
                i8++;
                zzfhVar2 = zzfhVarZzd;
                i3 = 4;
                i4 = 0;
            }
            return new zzadc(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iZzm + 1, i10, i11, i12, i13, i14, i15, i16, i17, f, i18, strZzd, zzfhVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbc.zza("Error parsing".concat(true != z ? "HEVC config" : "L-HEVC config"), e);
        }
    }
}
