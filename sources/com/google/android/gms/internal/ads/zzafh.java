package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzafh {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final String zzn;
    public final zzgj zzo;

    private zzafh(List list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f, int i14, String str, zzgj zzgjVar) {
        this.zza = list;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i6;
        this.zze = i7;
        this.zzf = i8;
        this.zzg = i9;
        this.zzh = i10;
        this.zzi = i11;
        this.zzj = i12;
        this.zzk = i13;
        this.zzl = f;
        this.zzm = i14;
        this.zzn = str;
        this.zzo = zzgjVar;
    }

    public static zzafh zza(zzer zzerVar) throws zzat {
        return zzc(zzerVar, false, null);
    }

    public static zzafh zzb(zzer zzerVar, zzgj zzgjVar) throws zzat {
        return zzc(zzerVar, true, zzgjVar);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0296  */
    /* JADX WARN: Code duplicated, block: B:116:0x0299  */
    /* JADX WARN: Code duplicated, block: B:39:0x0133 A[PHI: r34
  0x0133: PHI (r34v2 int) = (r34v0 int), (r34v0 int), (r34v0 int), (r34v0 int), (r34v3 int) binds: [B:41:0x013c, B:42:0x013e, B:96:0x023e, B:97:0x0240, B:38:0x0131] A[DONT_GENERATE, DONT_INLINE]] */
    private static zzafh zzc(zzer zzerVar, boolean z2, zzgj zzgjVar) throws zzat {
        boolean z3;
        boolean z4;
        String str;
        int i2;
        int i3;
        zzgf zzgfVar;
        int i4;
        int iMax;
        int i5;
        int iMax2;
        int i6;
        int i7;
        int i8 = 4;
        boolean z5 = true;
        if (z2) {
            try {
                zzerVar.zzk(4);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z4 = true;
                if (z4 != z2) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzat.zzb("Error parsing".concat(str), e);
            }
        } else {
            try {
                zzerVar.zzk(21);
            } catch (ArrayIndexOutOfBoundsException e3) {
                e = e3;
                z3 = z5;
                z4 = z3;
                if (z4 != z2) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzat.zzb("Error parsing".concat(str), e);
            }
        }
        int iZzs = zzerVar.zzs() & 3;
        int iZzs2 = zzerVar.zzs();
        int iZzg = zzerVar.zzg();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < iZzs2; i11++) {
            zzerVar.zzk(1);
            int iZzt = zzerVar.zzt();
            for (int i12 = 0; i12 < iZzt; i12++) {
                int iZzt2 = zzerVar.zzt();
                i10 += iZzt2 + 4;
                zzerVar.zzk(iZzt2);
            }
        }
        zzerVar.zzh(iZzg);
        byte[] bArr = new byte[i10];
        zzgj zzgjVar2 = zzgjVar;
        int i13 = 0;
        float f = 1.0f;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        String strZzb = null;
        int i26 = 0;
        while (i26 < iZzs2) {
            int iZzs3 = zzerVar.zzs() & 63;
            int iZzt3 = zzerVar.zzt();
            z3 = z5;
            int i27 = i9;
            zzgj zzgjVarZzf = zzgjVar2;
            while (i27 < iZzt3) {
                try {
                    int iZzt4 = zzerVar.zzt();
                    int i28 = i27;
                    System.arraycopy(zzgm.zza, i9, bArr, i13, i8);
                    int i29 = i13 + 4;
                    System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), bArr, i29, iZzt4);
                    int i30 = 32;
                    if (iZzs3 == 32) {
                        if (i28 == 0) {
                            zzgjVarZzf = zzgm.zzf(bArr, i29, i29 + iZzt4);
                            i3 = i29;
                            i2 = iZzs;
                            i7 = 0;
                            i6 = 0;
                        }
                        i13 = i3 + iZzt4;
                        zzerVar.zzk(iZzt4);
                        i27 = i7 + 1;
                        i9 = i6;
                        iZzs = i2;
                        i8 = 4;
                    } else {
                        i30 = iZzs3;
                    }
                    i2 = iZzs;
                    if (i30 != 33) {
                        i3 = i29;
                        int i31 = 8;
                        if (i30 == 39 && i28 == 0) {
                            int i32 = i13 + 6;
                            int i33 = (i3 + iZzt4) - 1;
                            while (true) {
                                byte b2 = bArr[i33];
                                if (b2 != 0) {
                                    if (b2 == 0 || i33 <= i32) {
                                        break;
                                    }
                                    zzgn zzgnVar = new zzgn(bArr, i32, i33 + 1);
                                    while (true) {
                                        if (zzgnVar.zzd(16)) {
                                            int i34 = i31;
                                            int iZzf = zzgnVar.zzf(i34);
                                            int i35 = 0;
                                            while (iZzf == 255) {
                                                i35 += 255;
                                                iZzf = zzgnVar.zzf(i34);
                                            }
                                            int i36 = i35 + iZzf;
                                            int iZzf2 = zzgnVar.zzf(i34);
                                            int i37 = 0;
                                            while (iZzf2 == 255) {
                                                i37 += 255;
                                                iZzf2 = zzgnVar.zzf(8);
                                            }
                                            i31 = 8;
                                            int i38 = i37 + iZzf2;
                                            if (i38 == 0 || !zzgnVar.zzd(i38)) {
                                                break;
                                            }
                                            if (i36 == 176) {
                                                int iZzg2 = zzgnVar.zzg();
                                                boolean zZze = zzgnVar.zze();
                                                int iZzg3 = zZze ? zzgnVar.zzg() : 0;
                                                int iZzg4 = zzgnVar.zzg();
                                                int iZzg5 = -1;
                                                int iZzg6 = -1;
                                                int i39 = -1;
                                                int iZzf3 = -1;
                                                int i40 = -1;
                                                int iZzf4 = -1;
                                                int i41 = 0;
                                                while (true) {
                                                    if (i41 > iZzg4) {
                                                        zzgfVar = new zzgf(iZzg2, iZzg3, iZzg4 + 1, iZzg5, iZzg6, i39, iZzf3, i40, iZzf4);
                                                        break;
                                                    }
                                                    iZzg5 = zzgnVar.zzg();
                                                    iZzg6 = zzgnVar.zzg();
                                                    boolean z6 = zZze;
                                                    int iZzf5 = zzgnVar.zzf(6);
                                                    if (iZzf5 != 63) {
                                                        if (iZzf5 == 0) {
                                                            i4 = iZzf5;
                                                            iMax = Math.max(0, iZzg2 - 30);
                                                        } else {
                                                            i4 = iZzf5;
                                                            iMax = Math.max(0, (i4 + iZzg2) - 31);
                                                        }
                                                        iZzf3 = zzgnVar.zzf(iMax);
                                                        if (z6) {
                                                            int iZzf6 = zzgnVar.zzf(6);
                                                            if (iZzf6 != 63) {
                                                                if (iZzf6 == 0) {
                                                                    i5 = iZzf6;
                                                                    iMax2 = Math.max(0, iZzg3 - 30);
                                                                } else {
                                                                    i5 = iZzf6;
                                                                    iMax2 = Math.max(0, (i5 + iZzg3) - 31);
                                                                }
                                                                iZzf4 = zzgnVar.zzf(iMax2);
                                                                i40 = i5;
                                                            }
                                                        }
                                                        if (zzgnVar.zze()) {
                                                            zzgnVar.zzb(10);
                                                        }
                                                        i41++;
                                                        zZze = z6;
                                                        i39 = i4;
                                                    }
                                                }
                                            } else {
                                                zzgnVar.zzb(i38 * 8);
                                            }
                                        }
                                    }
                                } else if (i33 > i32) {
                                    i33--;
                                }
                                zzgfVar = null;
                                break;
                            }
                            if (zzgfVar == null || zzgjVarZzf == null) {
                                i6 = 0;
                            } else {
                                i6 = 0;
                                if (zzgfVar.zza == ((zzfz) zzgjVarZzf.zza.get(0)).zzb) {
                                    i7 = i28;
                                    i24 = 4;
                                } else {
                                    i24 = 5;
                                }
                            }
                            i7 = i28;
                        } else {
                            i6 = 0;
                            i7 = i28;
                        }
                    } else if (i28 == 0) {
                        zzgg zzggVarZzg = zzgm.zzg(bArr, i29, i29 + iZzt4, zzgjVarZzf);
                        int i42 = zzggVarZzg.zza + 1;
                        int i43 = zzggVarZzg.zze;
                        int i44 = zzggVarZzg.zzf;
                        int i45 = zzggVarZzg.zzg;
                        i3 = i29;
                        int i46 = zzggVarZzg.zzh;
                        int i47 = zzggVarZzg.zzc + 8;
                        int i48 = zzggVarZzg.zzd + 8;
                        int i49 = zzggVarZzg.zzk;
                        int i50 = zzggVarZzg.zzl;
                        int i51 = zzggVarZzg.zzm;
                        float f2 = zzggVarZzg.zzi;
                        int i52 = zzggVarZzg.zzj;
                        zzgb zzgbVar = zzggVarZzg.zzb;
                        if (zzgbVar != null) {
                            strZzb = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, zzgbVar.zzd, zzgbVar.zze, zzgbVar.zzf);
                        }
                        i23 = i51;
                        f = f2;
                        i25 = i52;
                        i7 = i28;
                        i20 = i48;
                        i21 = i49;
                        i22 = i50;
                        i17 = i45;
                        i18 = i46;
                        i19 = i47;
                        i6 = 0;
                        i15 = i43;
                        i16 = i44;
                        i14 = i42;
                    } else {
                        i3 = i29;
                        i6 = 0;
                        i7 = i28;
                    }
                    i13 = i3 + iZzt4;
                    zzerVar.zzk(iZzt4);
                    i27 = i7 + 1;
                    i9 = i6;
                    iZzs = i2;
                    i8 = 4;
                } catch (ArrayIndexOutOfBoundsException e4) {
                    e = e4;
                    z4 = z3;
                    if (z4 != z2) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw zzat.zzb("Error parsing".concat(str), e);
                }
            }
            i26++;
            zzgjVar2 = zzgjVarZzf;
            z5 = z3;
            iZzs = iZzs;
            i8 = 4;
        }
        z3 = z5;
        return new zzafh(i10 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZzs + 1, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, f, i25, strZzb, zzgjVar2);
    }
}
