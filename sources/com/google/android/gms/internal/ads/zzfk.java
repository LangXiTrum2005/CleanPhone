package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfk {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzcw.zzf(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzh(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzh(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzh(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zzh(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = zzd[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    public static zzfe zzc(byte[] bArr, int i, int i2, @Nullable zzfh zzfhVar) {
        boolean z;
        int i3;
        int iZzc;
        int iZzc2;
        int i4;
        int i5;
        int iZzc3;
        int iMax;
        int i6;
        int iZzb;
        float f;
        int i7;
        int i8;
        int i9;
        zzfg zzfgVar;
        int i10;
        int iZza;
        int i11;
        int i12;
        zzfc zzfcVar;
        zzey zzeyVarZzl = zzl(new zzfl(bArr, i, i2));
        zzfl zzflVar = new zzfl(bArr, i + 2, i2);
        zzflVar.zzf(4);
        int iZza2 = zzflVar.zza(3);
        if (zzeyVarZzl.zzb == 0 || iZza2 != 7) {
            z = false;
        } else {
            iZza2 = 7;
            z = true;
        }
        int i13 = (zzfhVar == null || zzfhVar.zza.isEmpty()) ? 0 : ((zzex) zzfhVar.zza.get(Math.min(zzeyVarZzl.zzb, zzfhVar.zza.size() - 1))).zza;
        zzez zzezVarZzm = null;
        if (!z) {
            zzflVar.zze();
            zzezVarZzm = zzm(zzflVar, true, iZza2, null);
        } else if (zzfhVar != null) {
            zzfa zzfaVar = zzfhVar.zzb;
            int i14 = zzfaVar.zzb[i13];
            if (zzfaVar.zza.size() > i14) {
                zzezVarZzm = (zzez) zzfhVar.zzb.zza.get(i14);
            }
        }
        int iZzc4 = zzflVar.zzc();
        if (z) {
            int iZza3 = zzflVar.zzh() ? zzflVar.zza(8) : -1;
            if (zzfhVar == null || (zzfcVar = zzfhVar.zzc) == null) {
                i5 = 0;
                i4 = 0;
                iZzc2 = 0;
                iZzc3 = 0;
                iZzc = 0;
            } else {
                if (iZza3 == -1) {
                    iZza3 = zzfcVar.zzb[i13];
                }
                if (iZza3 == -1 || zzfcVar.zza.size() <= iZza3) {
                    i5 = 0;
                    i4 = 0;
                    iZzc2 = 0;
                    iZzc3 = 0;
                    iZzc = 0;
                } else {
                    zzfb zzfbVar = (zzfb) zzfhVar.zzc.zza.get(iZza3);
                    int i15 = zzfbVar.zza;
                    int i16 = zzfbVar.zzd;
                    iZzc = zzfbVar.zze;
                    int i17 = zzfbVar.zzb;
                    i5 = i16;
                    i4 = i15;
                    iZzc3 = zzfbVar.zzc;
                    iZzc2 = i17;
                }
            }
        } else {
            int iZzc5 = zzflVar.zzc();
            if (iZzc5 == 3) {
                zzflVar.zze();
                i3 = 3;
            } else {
                i3 = iZzc5;
            }
            int iZzc6 = zzflVar.zzc();
            iZzc = zzflVar.zzc();
            if (zzflVar.zzh()) {
                int iZzc7 = zzflVar.zzc();
                int iZzc8 = zzflVar.zzc();
                int iZzc9 = zzflVar.zzc();
                int iZzc10 = zzflVar.zzc();
                iZzc6 = zzk(iZzc6, i3, iZzc7, iZzc8);
                iZzc = zzj(iZzc, i3, iZzc9, iZzc10);
            }
            iZzc2 = zzflVar.zzc();
            i4 = iZzc5;
            i5 = iZzc6;
            iZzc3 = zzflVar.zzc();
        }
        int iZzc11 = zzflVar.zzc();
        if (z) {
            iMax = -1;
        } else {
            int i18 = true != zzflVar.zzh() ? iZza2 : 0;
            iMax = -1;
            while (i18 <= iZza2) {
                zzflVar.zzc();
                iMax = Math.max(zzflVar.zzc(), iMax);
                zzflVar.zzc();
                i18++;
                iZza2 = iZza2;
            }
        }
        zzflVar.zzc();
        zzflVar.zzc();
        zzflVar.zzc();
        zzflVar.zzc();
        zzflVar.zzc();
        zzflVar.zzc();
        if (zzflVar.zzh()) {
            int i19 = 6;
            if (z && zzflVar.zzh()) {
                zzflVar.zzf(6);
            } else if (zzflVar.zzh()) {
                int i20 = 0;
                for (int i21 = 4; i20 < i21; i21 = 4) {
                    int i22 = 0;
                    while (i22 < i19) {
                        if (zzflVar.zzh()) {
                            int iMin = Math.min(64, 1 << ((i20 + i20) + 4));
                            if (i20 > 1) {
                                zzflVar.zzb();
                            }
                            for (int i23 = 0; i23 < iMin; i23++) {
                                zzflVar.zzb();
                            }
                            i12 = 3;
                        } else {
                            zzflVar.zzc();
                            i12 = 3;
                        }
                        i22 += i20 == i12 ? 3 : 1;
                        i5 = i5;
                        iMax = iMax;
                        i19 = 6;
                    }
                    i20++;
                    i19 = 6;
                }
            }
        }
        int i24 = i5;
        int i25 = iMax;
        zzflVar.zzf(2);
        if (zzflVar.zzh()) {
            zzflVar.zzf(8);
            zzflVar.zzc();
            zzflVar.zzc();
            zzflVar.zze();
        }
        int iZzc12 = zzflVar.zzc();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i26 = -1;
        int i27 = -1;
        int i28 = 0;
        while (i28 < iZzc12) {
            if (i28 == 0 || !zzflVar.zzh()) {
                int iZzc13 = zzflVar.zzc();
                int iZzc14 = zzflVar.zzc();
                iArr = new int[iZzc13];
                int i29 = 0;
                while (i29 < iZzc13) {
                    iArr[i29] = (i29 > 0 ? iArr[i29 - 1] : 0) - (zzflVar.zzc() + 1);
                    zzflVar.zze();
                    i29++;
                }
                int[] iArr2 = new int[iZzc14];
                int i30 = 0;
                while (i30 < iZzc14) {
                    iArr2[i30] = zzflVar.zzc() + 1 + (i30 > 0 ? iArr2[i30 - 1] : 0);
                    zzflVar.zze();
                    i30++;
                }
                i27 = iZzc14;
                iArrCopyOf = iArr2;
                i26 = iZzc13;
            } else {
                int i31 = i26 + i27;
                boolean zZzh = zzflVar.zzh();
                boolean z2 = true;
                int iZzc15 = zzflVar.zzc() + 1;
                int i32 = 1 - ((zZzh ? 1 : 0) + (zZzh ? 1 : 0));
                int i33 = i31 + 1;
                boolean[] zArr = new boolean[i33];
                int i34 = 0;
                while (i34 <= i31) {
                    if (zzflVar.zzh()) {
                        zArr[i34] = z2;
                    } else {
                        zArr[i34] = zzflVar.zzh();
                    }
                    i34++;
                    z2 = true;
                }
                int i35 = i27 - 1;
                int[] iArr3 = new int[i33];
                int[] iArr4 = new int[i33];
                int i36 = 0;
                while (true) {
                    i11 = i32 * iZzc15;
                    if (i35 < 0) {
                        break;
                    }
                    int i37 = iArrCopyOf[i35] + i11;
                    if (i37 < 0 && zArr[i26 + i35]) {
                        iArr3[i36] = i37;
                        i36++;
                    }
                    i35--;
                }
                if (i11 < 0 && zArr[i31]) {
                    iArr3[i36] = i11;
                    i36++;
                }
                int i38 = i36;
                for (int i39 = 0; i39 < i26; i39++) {
                    int i40 = iArr[i39] + i11;
                    if (i40 < 0 && zArr[i39]) {
                        iArr3[i38] = i40;
                        i38++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, i38);
                int i41 = 0;
                for (int i42 = i26 - 1; i42 >= 0; i42--) {
                    int i43 = iArr[i42] + i11;
                    if (i43 > 0 && zArr[i42]) {
                        iArr4[i41] = i43;
                        i41++;
                    }
                }
                if (i11 > 0 && zArr[i31]) {
                    iArr4[i41] = i11;
                    i41++;
                }
                int i44 = i41;
                for (int i45 = 0; i45 < i27; i45++) {
                    int i46 = iArrCopyOf[i45] + i11;
                    if (i46 > 0 && zArr[i26 + i45]) {
                        iArr4[i44] = i46;
                        i44++;
                    }
                }
                i27 = i44;
                iArrCopyOf = Arrays.copyOf(iArr4, i44);
                iArr = iArrCopyOf2;
                i26 = i38;
            }
            i28++;
            iZzc12 = iZzc12;
            zzezVarZzm = zzezVarZzm;
            zzeyVarZzl = zzeyVarZzl;
            iZzc3 = iZzc3;
            iZzc2 = iZzc2;
            i4 = i4;
        }
        zzey zzeyVar = zzeyVarZzl;
        int i47 = i4;
        int i48 = iZzc2;
        int i49 = iZzc3;
        zzez zzezVar = zzezVarZzm;
        if (zzflVar.zzh()) {
            int iZzc16 = zzflVar.zzc();
            for (int i50 = 0; i50 < iZzc16; i50++) {
                zzflVar.zzf(iZzc11 + 5);
            }
        }
        zzflVar.zzf(2);
        float f2 = 1.0f;
        if (zzflVar.zzh()) {
            if (zzflVar.zzh()) {
                int iZza4 = zzflVar.zza(8);
                if (iZza4 == 255) {
                    int iZza5 = zzflVar.zza(16);
                    int iZza6 = zzflVar.zza(16);
                    if (iZza5 != 0 && iZza6 != 0) {
                        f2 = iZza5 / iZza6;
                    }
                } else if (iZza4 < 17) {
                    f2 = zzb[iZza4];
                } else {
                    AbstractC3888ke0.r("Unexpected aspect_ratio_idc value: ", iZza4, "NalUnitUtil");
                }
            }
            if (zzflVar.zzh()) {
                zzflVar.zze();
            }
            if (zzflVar.zzh()) {
                zzflVar.zzf(3);
                i9 = true != zzflVar.zzh() ? 2 : 1;
                if (zzflVar.zzh()) {
                    int iZza7 = zzflVar.zza(8);
                    int iZza8 = zzflVar.zza(8);
                    zzflVar.zzf(8);
                    iZza = zzk.zza(iZza7);
                    iZzb = zzk.zzb(iZza8);
                } else {
                    iZzb = -1;
                    iZza = -1;
                }
            } else if (zzfhVar == null || (zzfgVar = zzfhVar.zzd) == null || zzfgVar.zza.size() <= (i10 = zzfgVar.zzb[i13])) {
                iZzb = -1;
                i9 = -1;
                iZza = -1;
            } else {
                zzff zzffVar = (zzff) zzfhVar.zzd.zza.get(i10);
                iZza = zzffVar.zza;
                int i51 = zzffVar.zzb;
                iZzb = zzffVar.zzc;
                i9 = i51;
            }
            if (zzflVar.zzh()) {
                zzflVar.zzc();
                zzflVar.zzc();
            }
            zzflVar.zze();
            if (zzflVar.zzh()) {
                iZzc += iZzc;
            }
            i8 = i9;
            i7 = iZza;
            i6 = iZzc;
            f = f2;
        } else {
            i6 = iZzc;
            iZzb = -1;
            f = 1.0f;
            i7 = -1;
            i8 = -1;
        }
        return new zzfe(zzeyVar, zzezVar, i47, i48, i49, iZzc4, i24, i6, f, i25, i7, i8, iZzb);
    }

    /* JADX WARN: Code duplicated, block: B:355:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:358:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:360:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:443:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:528:0x06f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0142  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzfh zzd(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int[] iArr;
        int i5;
        zzfg zzfgVar;
        boolean z;
        int iZza;
        int i6;
        int iZza2;
        int iZza3;
        int iZza4;
        int i7;
        int i8;
        int i9;
        boolean[][] zArr;
        int i10;
        int i11;
        boolean[][] zArr2;
        int[] iArr2;
        int i12;
        int i13;
        boolean z2;
        boolean zZzh;
        int i14;
        int i15;
        int i16;
        int iZzc;
        int i17;
        int i18;
        int i19;
        boolean z3;
        boolean z4;
        zzfl zzflVar = new zzfl(bArr, i, i2);
        zzey zzeyVarZzl = zzl(zzflVar);
        zzflVar.zzf(4);
        boolean zZzh2 = zzflVar.zzh();
        boolean zZzh3 = zzflVar.zzh();
        int iZza5 = zzflVar.zza(6);
        int i20 = iZza5 + 1;
        int iZza6 = zzflVar.zza(3);
        zzflVar.zzf(17);
        int i21 = 1;
        zzez zzezVarZzm = zzm(zzflVar, true, iZza6, null);
        int i22 = 0;
        for (int i23 = true != zzflVar.zzh() ? iZza6 : 0; i23 <= iZza6; i23++) {
            zzflVar.zzc();
            zzflVar.zzc();
            zzflVar.zzc();
        }
        int iZza7 = zzflVar.zza(6);
        int iZzc2 = zzflVar.zzc() + 1;
        zzfa zzfaVar = new zzfa(zzfxn.zzo(zzezVarZzm), new int[1]);
        boolean z5 = i20 >= 2 && iZzc2 >= 2;
        boolean z6 = zZzh2 && zZzh3;
        int i24 = iZza7 + 1;
        if (!z5 || !z6 || i24 < i20) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iZzc2, i24);
        int[] iArr4 = new int[iZzc2];
        int[] iArr5 = new int[iZzc2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        while (i21 < iZzc2) {
            int i25 = 0;
            while (i22 <= iZza7) {
                if (zzflVar.zzh()) {
                    iArr3[i21][i25] = i22;
                    iArr5[i21] = i22;
                    i25++;
                }
                iArr4[i21] = i25;
                i22++;
            }
            i21++;
            i22 = 0;
        }
        if (zzflVar.zzh()) {
            zzflVar.zzf(64);
            if (zzflVar.zzh()) {
                zzflVar.zzc();
            }
            int iZzc3 = zzflVar.zzc();
            for (int i26 = 0; i26 < iZzc3; i26++) {
                zzflVar.zzc();
                if (i26 == 0 || zzflVar.zzh()) {
                    boolean zZzh4 = zzflVar.zzh();
                    boolean zZzh5 = zzflVar.zzh();
                    z4 = zZzh4;
                    z3 = zZzh5;
                    if (zZzh4 || zZzh5) {
                        zZzh = zzflVar.zzh();
                        if (zZzh) {
                            zzflVar.zzf(19);
                        }
                        zzflVar.zzf(8);
                        if (zZzh) {
                            zzflVar.zzf(4);
                        }
                        zzflVar.zzf(15);
                        i15 = zZzh4;
                        i14 = zZzh5;
                    }
                    i16 = 0;
                    while (i16 <= iZza6) {
                        if (!zzflVar.zzh() || zzflVar.zzh()) {
                            zzflVar.zzc();
                        } else {
                            if (zzflVar.zzh()) {
                                iZzc = 0;
                            }
                            i17 = i15 + i14;
                            int[][] iArr6 = iArr3;
                            i18 = 0;
                            while (i18 < i17) {
                                int i27 = i17;
                                for (i19 = 0; i19 <= iZzc; i19++) {
                                    zzflVar.zzc();
                                    zzflVar.zzc();
                                    if (zZzh) {
                                        zzflVar.zzc();
                                        zzflVar.zzc();
                                    }
                                    zzflVar.zze();
                                }
                                i18++;
                                i17 = i27;
                            }
                            i16++;
                            iArr5 = iArr5;
                            iZzc3 = iZzc3;
                            iArr3 = iArr6;
                        }
                        iZzc = zzflVar.zzc();
                        i17 = i15 + i14;
                        int[][] iArr7 = iArr3;
                        i18 = 0;
                        while (i18 < i17) {
                            int i28 = i17;
                            while (i19 <= iZzc) {
                                zzflVar.zzc();
                                zzflVar.zzc();
                                if (zZzh) {
                                    zzflVar.zzc();
                                    zzflVar.zzc();
                                }
                                zzflVar.zze();
                            }
                            i18++;
                            i17 = i28;
                        }
                        i16++;
                        iArr5 = iArr5;
                        iZzc3 = iZzc3;
                        iArr3 = iArr7;
                    }
                } else {
                    z4 = false;
                    z3 = false;
                }
                zZzh = false;
                i15 = z4;
                i14 = z3;
                i16 = 0;
                while (i16 <= iZza6) {
                    if (zzflVar.zzh()) {
                        zzflVar.zzc();
                        iZzc = zzflVar.zzc();
                    } else {
                        zzflVar.zzc();
                        iZzc = zzflVar.zzc();
                    }
                    i17 = i15 + i14;
                    int[][] iArr8 = iArr3;
                    i18 = 0;
                    while (i18 < i17) {
                        int i29 = i17;
                        while (i19 <= iZzc) {
                            zzflVar.zzc();
                            zzflVar.zzc();
                            if (zZzh) {
                                zzflVar.zzc();
                                zzflVar.zzc();
                            }
                            zzflVar.zze();
                        }
                        i18++;
                        i17 = i29;
                    }
                    i16++;
                    iArr5 = iArr5;
                    iZzc3 = iZzc3;
                    iArr3 = iArr8;
                }
            }
        }
        int[][] iArr9 = iArr3;
        int[] iArr10 = iArr5;
        if (!zzflVar.zzh()) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        zzflVar.zzd();
        zzez zzezVarZzm2 = zzm(zzflVar, false, iZza6, zzezVarZzm);
        boolean zZzh6 = zzflVar.zzh();
        boolean[] zArr3 = new boolean[16];
        int i30 = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            boolean zZzh7 = zzflVar.zzh();
            zArr3[i31] = zZzh7;
            if (zZzh7) {
                i30++;
            }
        }
        if (i30 == 0 || !zArr3[1]) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        int i32 = i30 + 1;
        int[] iArr11 = new int[i30];
        for (int i33 = 0; i33 < i30 - (zZzh6 ? 1 : 0); i33++) {
            iArr11[i33] = zzflVar.zza(3);
        }
        int[] iArr12 = new int[i32];
        if (zZzh6) {
            for (int i34 = 1; i34 < i30; i34++) {
                for (int i35 = 0; i35 < i34; i35++) {
                    iArr12[i34] = iArr11[i35] + 1 + iArr12[i34];
                }
            }
            iArr12[i30] = 6;
        }
        int[][] iArr13 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i20, i30);
        int[] iArr14 = new int[i20];
        iArr14[0] = 0;
        boolean zZzh8 = zzflVar.zzh();
        int i36 = 1;
        while (i36 < i20) {
            if (zZzh8) {
                iArr14[i36] = zzflVar.zza(6);
            } else {
                iArr14[i36] = i36;
            }
            if (zZzh6) {
                z2 = zZzh6 ? 1 : 0;
                int i37 = 0;
                while (i37 < i30) {
                    int i38 = i37 + 1;
                    iArr13[i36][i37] = (iArr14[i36] & ((1 << iArr12[i38]) - 1)) >> iArr12[i37];
                    i37 = i38;
                }
            } else {
                int i39 = 0;
                while (i39 < i30) {
                    iArr13[i36][i39] = zzflVar.zza(iArr11[i39] + 1);
                    i39++;
                    zZzh6 = zZzh6 ? 1 : 0;
                }
                z2 = zZzh6;
            }
            i36++;
            zZzh6 = z2;
        }
        int[] iArr15 = new int[i24];
        int i40 = 1;
        for (int i41 = 0; i41 < i20; i41++) {
            iArr15[iArr14[i41]] = -1;
            int i42 = 0;
            int i43 = 0;
            while (i42 < 16) {
                if (zArr3[i42]) {
                    i12 = 1;
                    if (i42 == 1) {
                        iArr15[iArr14[i41]] = iArr13[i41][i43];
                        i13 = 1;
                    } else {
                        i13 = i42;
                    }
                    i43++;
                    i42 = i13;
                } else {
                    i12 = 1;
                }
                i42 += i12;
            }
            if (i41 > 0) {
                int i44 = 0;
                while (true) {
                    if (i44 >= i41) {
                        i40++;
                        break;
                    }
                    if (iArr15[iArr14[i41]] == iArr15[iArr14[i44]]) {
                        break;
                    }
                    i44++;
                }
            }
        }
        int iZza8 = zzflVar.zza(4);
        if (i40 < 2 || iZza8 == 0) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        int[] iArr16 = new int[i40];
        for (int i45 = 0; i45 < i40; i45++) {
            iArr16[i45] = zzflVar.zza(iZza8);
        }
        int[] iArr17 = new int[i24];
        for (int i46 = 0; i46 < i20; i46++) {
            iArr17[Math.min(iArr14[i46], iZza7)] = i46;
        }
        zzfxk zzfxkVar = new zzfxk();
        int i47 = 0;
        while (i47 <= iZza7) {
            int[] iArr18 = iArr15;
            int iMin = Math.min(iArr15[i47], i40 - 1);
            zzfxkVar.zzf(new zzex(iArr17[i47], iMin >= 0 ? iArr16[iMin] : -1));
            i47++;
            iArr15 = iArr18;
        }
        zzfxn zzfxnVarZzi = zzfxkVar.zzi();
        if (((zzex) zzfxnVarZzi.get(0)).zzb == -1) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        int i48 = 1;
        while (true) {
            if (i48 > iZza7) {
                i3 = -1;
                i48 = -1;
                break;
            }
            i3 = -1;
            if (((zzex) zzfxnVarZzi.get(i48)).zzb != -1) {
                break;
            }
            i48++;
        }
        if (i48 == i3) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        Class cls = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls, i20, i20);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls, i20, i20);
        for (int i49 = 1; i49 < i20; i49++) {
            for (int i50 = 0; i50 < i49; i50++) {
                boolean[] zArr6 = zArr4[i49];
                boolean[] zArr7 = zArr5[i49];
                boolean zZzh9 = zzflVar.zzh();
                zArr7[i50] = zZzh9;
                zArr6[i50] = zZzh9;
            }
        }
        for (int i51 = 1; i51 < i20; i51++) {
            for (int i52 = 0; i52 < iZza5; i52++) {
                for (int i53 = 0; i53 < i51; i53++) {
                    boolean[] zArr8 = zArr5[i51];
                    if (zArr8[i53] && zArr5[i53][i52]) {
                        zArr8[i52] = true;
                        break;
                    }
                }
            }
        }
        int[] iArr19 = new int[i24];
        for (int i54 = 0; i54 < i20; i54++) {
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr4[i54][i56] ? 1 : 0;
            }
            iArr19[iArr14[i54]] = i55;
        }
        int i57 = 0;
        for (int i58 = 0; i58 < i20; i58++) {
            if (iArr19[iArr14[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        int[] iArr20 = new int[i20];
        int[] iArr21 = new int[i4];
        if (zzflVar.zzh()) {
            int i59 = 0;
            while (i59 < i20) {
                i4 = iZzc2;
                iArr20[i59] = zzflVar.zza(3);
                i59++;
                iArr14 = iArr14;
            }
            i4 = iZzc2;
            iArr = iArr14;
            i5 = iZza6;
        } else {
            i4 = iZzc2;
            iArr = iArr14;
            i5 = iZza6;
            Arrays.fill(iArr20, 0, i20, i5);
        }
        int i60 = 0;
        while (i60 < i4) {
            int i61 = i48;
            boolean[][] zArr9 = zArr5;
            int[] iArr22 = iArr19;
            int iMax = 0;
            for (int i62 = 0; i62 < iArr4[i60]; i62++) {
                iMax = Math.max(iMax, iArr20[((zzex) zzfxnVarZzi.get(iArr9[i60][i62])).zza]);
            }
            iArr21[i60] = iMax + 1;
            i60++;
            zArr5 = zArr9;
            iArr19 = iArr22;
            i48 = i61;
        }
        int i63 = i48;
        boolean[][] zArr10 = zArr5;
        int[] iArr23 = iArr19;
        if (zzflVar.zzh()) {
            int i64 = 0;
            while (i64 < iZza5) {
                int i65 = i64 + 1;
                for (int i66 = i65; i66 < i20; i66++) {
                    if (zArr4[i66][i64]) {
                        zzflVar.zzf(3);
                    }
                }
                i64 = i65;
            }
        }
        zzflVar.zze();
        int iZzc4 = zzflVar.zzc() + 1;
        zzfxk zzfxkVar2 = new zzfxk();
        zzfxkVar2.zzf(zzezVarZzm);
        if (iZzc4 > 1) {
            zzez zzezVarZzm3 = zzezVarZzm2;
            zzfxkVar2.zzf(zzezVarZzm3);
            for (int i67 = 2; i67 < iZzc4; i67++) {
                zzezVarZzm3 = zzm(zzflVar, zzflVar.zzh(), i5, zzezVarZzm3);
                zzfxkVar2.zzf(zzezVarZzm3);
            }
        }
        zzfxn zzfxnVarZzi2 = zzfxkVar2.zzi();
        int iZzc5 = zzflVar.zzc() + i4;
        if (iZzc5 > i4) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        int iZza9 = zzflVar.zza(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iZzc5, i24);
        int[] iArr24 = new int[iZzc5];
        int[] iArr25 = new int[iZzc5];
        int i68 = 0;
        while (i68 < i4) {
            int i69 = i4;
            iArr24[i68] = 0;
            int i70 = iArr10[i68];
            iArr25[i68] = i70;
            if (iZza9 == 0) {
                zArr2 = zArr4;
                i11 = i20;
                iArr2 = iArr21;
                Arrays.fill(zArr11[i68], 0, iArr4[i68], true);
                iArr24[i68] = iArr4[i68];
            } else {
                i11 = i20;
                zArr2 = zArr4;
                iArr2 = iArr21;
                if (iZza9 == 1) {
                    for (int i71 = 0; i71 < iArr4[i68]; i71++) {
                        zArr11[i68][i71] = iArr9[i68][i71] == i70;
                    }
                    iArr24[i68] = 1;
                } else {
                    zArr11[0][0] = true;
                    iArr24[0] = 1;
                }
            }
            i68++;
            i4 = i69;
            zArr4 = zArr2;
            iArr21 = iArr2;
            i20 = i11;
        }
        int i72 = i20;
        boolean[][] zArr12 = zArr4;
        int[] iArr26 = iArr21;
        int i73 = i4;
        int[] iArr27 = new int[i24];
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iZzc5, i24);
        int i74 = 0;
        int i75 = 1;
        while (i75 < iZzc5) {
            if (iZza9 == 2) {
                for (int i76 = 0; i76 < iArr4[i75]; i76++) {
                    zArr11[i75][i76] = zzflVar.zzh();
                    int i77 = iArr24[i75];
                    boolean z7 = zArr11[i75][i76];
                    iArr24[i75] = i77 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr25[i75] = iArr9[i75][i76];
                    }
                }
            }
            if (i74 != 0) {
                i7 = iZza9;
                i8 = i63;
            } else if (iArr9[i75][0] == 0 && zArr11[i75][0]) {
                i74 = 0;
                int i78 = 1;
                while (i78 < iArr4[i75]) {
                    int i79 = iZza9;
                    int i80 = i63;
                    if (iArr9[i75][i78] == i80 && zArr11[i75][i80]) {
                        i74 = i75;
                    }
                    i78++;
                    i63 = i80;
                    iZza9 = i79;
                }
                i7 = iZza9;
                i8 = i63;
            } else {
                i7 = iZza9;
                i8 = i63;
                i74 = 0;
            }
            int i81 = 0;
            while (i81 < iArr4[i75]) {
                if (iZzc4 > 1) {
                    zArr13[i75][i81] = zArr11[i75][i81];
                    boolean[][] zArr14 = zArr11;
                    i10 = i8;
                    i9 = iZzc4;
                    int iZza10 = zzgag.zza(iZzc4, RoundingMode.CEILING);
                    if (zArr13[i75][i81]) {
                        zArr = zArr14;
                        break;
                    }
                    int i82 = ((zzex) zzfxnVarZzi.get(iArr9[i75][i81])).zza;
                    int i83 = 0;
                    while (true) {
                        if (i83 >= i81) {
                            zArr = zArr14;
                            break;
                        }
                        zArr = zArr14;
                        if (zArr10[i82][((zzex) zzfxnVarZzi.get(iArr9[i75][i83])).zza]) {
                            zArr13[i75][i81] = true;
                            break;
                        }
                        i83++;
                        zArr14 = zArr;
                    }
                    if (zArr13[i75][i81]) {
                        if (i74 <= 0 || i75 != i74) {
                            zzflVar.zzf(iZza10);
                        } else {
                            iArr27[i81] = zzflVar.zza(iZza10);
                        }
                    }
                } else {
                    i9 = iZzc4;
                    zArr = zArr11;
                    i10 = i8;
                }
                i81++;
                i8 = i10;
                iZzc4 = i9;
                zArr11 = zArr;
            }
            int i84 = iZzc4;
            boolean[][] zArr15 = zArr11;
            i63 = i8;
            if (iArr24[i75] == 1 && iArr23[iArr25[i75]] > 0) {
                zzflVar.zze();
            }
            i75++;
            iZza9 = i7;
            iZzc4 = i84;
            zArr11 = zArr15;
        }
        if (i74 == 0) {
            return new zzfh(zzeyVarZzl, null, zzfaVar, null, null);
        }
        int iZzc6 = zzflVar.zzc();
        int i85 = iZzc6 + 1;
        zzfxk zzfxkVarZzi = zzfxn.zzi(i85);
        int[] iArr28 = new int[i72];
        int i86 = 0;
        while (i86 < i85) {
            int iZza11 = zzflVar.zza(16);
            int iZza12 = zzflVar.zza(16);
            if (zzflVar.zzh()) {
                iZza2 = zzflVar.zza(2);
                if (iZza2 == 3) {
                    zzflVar.zze();
                }
                iZza3 = zzflVar.zza(4);
                iZza4 = zzflVar.zza(4);
            } else {
                iZza2 = 0;
                iZza3 = 0;
                iZza4 = 0;
            }
            if (zzflVar.zzh()) {
                int iZzc7 = zzflVar.zzc();
                int iZzc8 = zzflVar.zzc();
                int iZzc9 = zzflVar.zzc();
                int iZzc10 = zzflVar.zzc();
                iZza11 = zzk(iZza11, iZza2, iZzc7, iZzc8);
                iZza12 = zzj(iZza12, iZza2, iZzc9, iZzc10);
            }
            zzfxkVarZzi.zzf(new zzfb(iZza2, iZza3, iZza4, iZza11, iZza12));
            i86++;
            zzfxnVarZzi = zzfxnVarZzi;
            zzeyVarZzl = zzeyVarZzl;
            iArr27 = iArr27;
        }
        zzey zzeyVar = zzeyVarZzl;
        zzfxn zzfxnVar = zzfxnVarZzi;
        int[] iArr29 = iArr27;
        if (i85 <= 1 || !zzflVar.zzh()) {
            for (int i87 = 1; i87 < i72; i87++) {
                iArr28[i87] = Math.min(i87, iZzc6);
            }
        } else {
            int iZza13 = zzgag.zza(i85, RoundingMode.CEILING);
            for (int i88 = 1; i88 < i72; i88++) {
                iArr28[i88] = zzflVar.zza(iZza13);
            }
        }
        zzfc zzfcVar = new zzfc(zzfxkVarZzi.zzi(), iArr28);
        zzflVar.zzf(2);
        for (int i89 = 1; i89 < i72; i89++) {
            if (iArr23[iArr[i89]] == 0) {
                zzflVar.zze();
            }
        }
        for (int i90 = 1; i90 < iZzc5; i90++) {
            boolean zZzh10 = zzflVar.zzh();
            for (int i91 = 0; i91 < iArr26[i90]; i91++) {
                if (i91 <= 0 || !zZzh10) {
                    if (i91 == 0) {
                        for (i6 = 0; i6 < iArr4[i90]; i6++) {
                            if (zArr13[i90][i6]) {
                                zzflVar.zzc();
                            }
                        }
                        zzflVar.zzc();
                        zzflVar.zzc();
                    }
                } else if (zzflVar.zzh()) {
                    while (i6 < iArr4[i90]) {
                        if (zArr13[i90][i6]) {
                            zzflVar.zzc();
                        }
                    }
                    zzflVar.zzc();
                    zzflVar.zzc();
                }
            }
        }
        int iZzc11 = zzflVar.zzc() + 2;
        if (zzflVar.zzh()) {
            zzflVar.zzf(iZzc11);
        } else {
            for (int i92 = 1; i92 < i72; i92++) {
                for (int i93 = 0; i93 < i92; i93++) {
                    if (zArr12[i92][i93]) {
                        zzflVar.zzf(iZzc11);
                    }
                }
            }
        }
        int iZzc12 = zzflVar.zzc();
        for (int i94 = 1; i94 <= iZzc12; i94++) {
            zzflVar.zzf(8);
        }
        if (zzflVar.zzh()) {
            zzflVar.zzd();
            if (zzflVar.zzh() || zzflVar.zzh()) {
                zzflVar.zze();
            }
            boolean zZzh11 = zzflVar.zzh();
            boolean zZzh12 = zzflVar.zzh();
            if (zZzh11 || zZzh12) {
                for (int i95 = 0; i95 < i73; i95++) {
                    for (int i96 = 0; i96 < iArr26[i95]; i96++) {
                        boolean zZzh13 = zZzh11 ? zzflVar.zzh() : false;
                        boolean zZzh14 = zZzh12 ? zzflVar.zzh() : false;
                        if (zZzh13) {
                            zzflVar.zzf(32);
                        }
                        if (zZzh14) {
                            zzflVar.zzf(18);
                        }
                    }
                }
            }
            boolean zZzh15 = zzflVar.zzh();
            if (zZzh15) {
                z = true;
                iZza = zzflVar.zza(4) + 1;
            } else {
                z = true;
                iZza = i72;
            }
            zzfxk zzfxkVarZzi2 = zzfxn.zzi(iZza);
            int[] iArr30 = new int[i72];
            int i97 = 0;
            while (i97 < iZza) {
                zzflVar.zzf(3);
                int i98 = z != zzflVar.zzh() ? 2 : 1;
                int iZza14 = zzk.zza(zzflVar.zza(8));
                int iZzb = zzk.zzb(zzflVar.zza(8));
                zzflVar.zzf(8);
                zzfxkVarZzi2.zzf(new zzff(iZza14, i98, iZzb));
                i97++;
                z = true;
            }
            if (zZzh15 && iZza > 1) {
                for (int i99 = 0; i99 < i72; i99++) {
                    iArr30[i99] = zzflVar.zza(4);
                }
            }
            zzfgVar = new zzfg(zzfxkVarZzi2.zzi(), iArr30);
        } else {
            zzfgVar = null;
        }
        return new zzfh(zzeyVar, zzfxnVar, new zzfa(zzfxnVarZzi2, iArr29), zzfcVar, zzfgVar);
    }

    public static zzfi zze(byte[] bArr, int i, int i2) {
        zzfl zzflVar = new zzfl(bArr, 4, i2);
        int iZzc = zzflVar.zzc();
        int iZzc2 = zzflVar.zzc();
        zzflVar.zze();
        return new zzfi(iZzc, iZzc2, zzflVar.zzh());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f0 A[PHI: r19
  0x01f0: PHI (r19v4 int) = (r19v2 int), (r19v6 int) binds: [B:107:0x01c1, B:114:0x01ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:124:0x020f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0218  */
    /* JADX WARN: Code duplicated, block: B:130:0x021f  */
    /* JADX WARN: Code duplicated, block: B:133:0x022b  */
    /* JADX WARN: Code duplicated, block: B:135:0x024b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0252  */
    /* JADX WARN: Code duplicated, block: B:141:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:63:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:84:0x016d A[PHI: r2
  0x016d: PHI (r2v23 int) = (r2v4 int), (r2v3 int) binds: [B:86:0x0173, B:82:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0171 A[PHI: r2
  0x0171: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v24 int) binds: [B:72:0x0154, B:74:0x0158, B:76:0x015c, B:78:0x0160, B:80:0x0164, B:83:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3  */
    public static zzfj zzf(byte[] bArr, int i, int i2) {
        int iZzc;
        int i3;
        boolean zZzh;
        int iZzc2;
        int iZzc3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iZzb;
        int i8;
        int iZzc4;
        boolean z;
        boolean zZzh2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        int iZzb2;
        float f2;
        boolean zZzh3;
        boolean zZzh4;
        int i18;
        int iZza;
        int iZza2;
        int i19;
        int i20;
        zzfl zzflVar = new zzfl(bArr, i, i2);
        int iZza3 = zzflVar.zza(8);
        int iZza4 = zzflVar.zza(8);
        int iZza5 = zzflVar.zza(8);
        int iZzc5 = zzflVar.zzc();
        if (iZza3 == 100 || iZza3 == 110 || iZza3 == 122 || iZza3 == 244 || iZza3 == 44 || iZza3 == 83 || iZza3 == 86 || iZza3 == 118 || iZza3 == 128) {
            iZzc = zzflVar.zzc();
            if (iZzc == 3) {
                zZzh = zzflVar.zzh();
                i3 = 3;
            } else {
                i3 = iZzc;
                zZzh = false;
            }
            iZzc2 = zzflVar.zzc();
            iZzc3 = zzflVar.zzc();
            zzflVar.zze();
            if (zzflVar.zzh()) {
                if (i3 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                for (i5 = 0; i5 < i4; i5++) {
                    if (!zzflVar.zzh()) {
                        if (i5 < 6) {
                            i6 = 16;
                        } else {
                            i6 = 64;
                        }
                        iZzb = 8;
                        i8 = 8;
                        for (i7 = 0; i7 < i6; i7++) {
                            if (iZzb != 0) {
                                iZzb = ((zzflVar.zzb() + i8) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i8 = iZzb;
                            }
                        }
                    }
                }
            }
        } else if (iZza3 == 138) {
            iZza3 = 138;
            iZzc = zzflVar.zzc();
            if (iZzc == 3) {
                zZzh = zzflVar.zzh();
                i3 = 3;
            } else {
                i3 = iZzc;
                zZzh = false;
            }
            iZzc2 = zzflVar.zzc();
            iZzc3 = zzflVar.zzc();
            zzflVar.zze();
            if (zzflVar.zzh()) {
                if (i3 != 3) {
                    i4 = 8;
                } else {
                    i4 = 12;
                }
                while (i5 < i4) {
                    if (!zzflVar.zzh()) {
                        if (i5 < 6) {
                            i6 = 16;
                        } else {
                            i6 = 64;
                        }
                        iZzb = 8;
                        i8 = 8;
                        while (i7 < i6) {
                            if (iZzb != 0) {
                                iZzb = ((zzflVar.zzb() + i8) + 256) % 256;
                            }
                            if (iZzb != 0) {
                                i8 = iZzb;
                            }
                        }
                    }
                }
            }
        } else {
            iZzc = 1;
            zZzh = false;
            iZzc2 = 0;
            iZzc3 = 0;
        }
        int iZzc6 = zzflVar.zzc() + 4;
        int iZzc7 = zzflVar.zzc();
        if (iZzc7 != 0) {
            if (iZzc7 == 1) {
                boolean zZzh5 = zzflVar.zzh();
                zzflVar.zzb();
                zzflVar.zzb();
                long jZzc = zzflVar.zzc();
                for (int i21 = 0; i21 < jZzc; i21++) {
                    zzflVar.zzc();
                }
                z = zZzh5;
                iZzc7 = 1;
                iZzc4 = 0;
            } else {
                iZzc4 = 0;
            }
            int iZzc8 = zzflVar.zzc();
            zzflVar.zze();
            int iZzc9 = zzflVar.zzc() + 1;
            int iZzc10 = zzflVar.zzc() + 1;
            zZzh2 = zzflVar.zzh();
            i9 = 2 - (zZzh2 ? 1 : 0);
            if (!zZzh2) {
                zzflVar.zze();
            }
            zzflVar.zze();
            i10 = iZzc9 * 16;
            i11 = iZzc10 * i9 * 16;
            if (zzflVar.zzh()) {
                int iZzc11 = zzflVar.zzc();
                int iZzc12 = zzflVar.zzc();
                int iZzc13 = zzflVar.zzc();
                int iZzc14 = zzflVar.zzc();
                if (iZzc == 0) {
                    i19 = 1;
                } else {
                    if (iZzc == 3) {
                        i19 = 1;
                    } else {
                        i19 = 2;
                    }
                    if (iZzc == 1) {
                        i20 = 2;
                    } else {
                        i20 = 1;
                    }
                    i9 *= i20;
                }
                i10 -= (iZzc11 + iZzc12) * i19;
                i11 -= (iZzc13 + iZzc14) * i9;
            }
            int i22 = i10;
            int i23 = i11;
            if (iZza3 != 44 || iZza3 == 86 || iZza3 == 100 || iZza3 == 110 || iZza3 == 122) {
                if ((iZza4 & 16) != 0) {
                    i12 = iZza3;
                    i13 = 0;
                } else {
                    i12 = iZza3;
                    i13 = 16;
                }
            } else if (iZza3 == 244) {
                iZza3 = 244;
                if ((iZza4 & 16) != 0) {
                    i12 = iZza3;
                    i13 = 0;
                } else {
                    i12 = iZza3;
                    i13 = 16;
                }
            } else {
                i12 = iZza3;
                i13 = 16;
            }
            i14 = -1;
            if (zzflVar.zzh()) {
                if (zzflVar.zzh()) {
                    iZza = zzflVar.zza(8);
                    if (iZza == 255) {
                        iZza2 = zzflVar.zza(16);
                        int iZza6 = zzflVar.zza(16);
                        if (iZza2 != 0 || iZza6 == 0) {
                            f2 = 1.0f;
                        } else {
                            f2 = iZza2 / iZza6;
                        }
                    } else if (iZza < 17) {
                        f2 = zzb[iZza];
                    } else {
                        AbstractC3888ke0.r("Unexpected aspect_ratio_idc value: ", iZza, "NalUnitUtil");
                        f2 = 1.0f;
                    }
                } else {
                    f2 = 1.0f;
                }
                if (zzflVar.zzh()) {
                    zzflVar.zze();
                }
                if (zzflVar.zzh()) {
                    zzflVar.zzf(3);
                    i18 = true != zzflVar.zzh() ? 2 : 1;
                    if (zzflVar.zzh()) {
                        int iZza7 = zzflVar.zza(8);
                        int iZza8 = zzflVar.zza(8);
                        zzflVar.zzf(8);
                        int iZza9 = zzk.zza(iZza7);
                        iZzb2 = zzk.zzb(iZza8);
                        i16 = iZza9;
                        i14 = i18;
                    } else {
                        i14 = i18;
                        i16 = -1;
                        iZzb2 = -1;
                    }
                } else {
                    i16 = -1;
                    iZzb2 = -1;
                }
                if (zzflVar.zzh()) {
                    zzflVar.zzc();
                    zzflVar.zzc();
                }
                if (zzflVar.zzh()) {
                    zzflVar.zzf(65);
                }
                zZzh3 = zzflVar.zzh();
                if (zZzh3) {
                    zzn(zzflVar);
                }
                zZzh4 = zzflVar.zzh();
                if (zZzh4) {
                    zzn(zzflVar);
                }
                if (zZzh3 || zZzh4) {
                    zzflVar.zze();
                }
                zzflVar.zze();
                if (zzflVar.zzh()) {
                    zzflVar.zze();
                    zzflVar.zzc();
                    zzflVar.zzc();
                    zzflVar.zzc();
                    zzflVar.zzc();
                    int iZzc15 = zzflVar.zzc();
                    zzflVar.zzc();
                    i15 = iZzc15;
                } else {
                    i15 = i13;
                }
                i17 = i14;
                f = f2;
            } else {
                i15 = i13;
                f = 1.0f;
                i16 = -1;
                i17 = -1;
                iZzb2 = -1;
            }
            return new zzfj(i12, iZza4, iZza5, iZzc5, iZzc8, i22, i23, f, iZzc2, iZzc3, zZzh, zZzh2, iZzc6, iZzc7, iZzc4, z, i16, i17, iZzb2, i15);
        }
        iZzc4 = zzflVar.zzc() + 4;
        z = false;
        int iZzc16 = zzflVar.zzc();
        zzflVar.zze();
        int iZzc17 = zzflVar.zzc() + 1;
        int iZzc18 = zzflVar.zzc() + 1;
        zZzh2 = zzflVar.zzh();
        i9 = 2 - (zZzh2 ? 1 : 0);
        if (!zZzh2) {
            zzflVar.zze();
        }
        zzflVar.zze();
        i10 = iZzc17 * 16;
        i11 = iZzc18 * i9 * 16;
        if (zzflVar.zzh()) {
            int iZzc19 = zzflVar.zzc();
            int iZzc110 = zzflVar.zzc();
            int iZzc111 = zzflVar.zzc();
            int iZzc112 = zzflVar.zzc();
            if (iZzc == 0) {
                i19 = 1;
            } else {
                if (iZzc == 3) {
                    i19 = 1;
                } else {
                    i19 = 2;
                }
                if (iZzc == 1) {
                    i20 = 2;
                } else {
                    i20 = 1;
                }
                i9 *= i20;
            }
            i10 -= (iZzc19 + iZzc110) * i19;
            i11 -= (iZzc111 + iZzc112) * i9;
        }
        int i24 = i10;
        int i25 = i11;
        if (iZza3 != 44) {
            if ((iZza4 & 16) != 0) {
                i12 = iZza3;
                i13 = 0;
            } else {
                i12 = iZza3;
                i13 = 16;
            }
        } else if ((iZza4 & 16) != 0) {
            i12 = iZza3;
            i13 = 0;
        } else {
            i12 = iZza3;
            i13 = 16;
        }
        i14 = -1;
        if (zzflVar.zzh()) {
            if (zzflVar.zzh()) {
                f2 = 1.0f;
            } else {
                iZza = zzflVar.zza(8);
                if (iZza == 255) {
                    iZza2 = zzflVar.zza(16);
                    int iZza10 = zzflVar.zza(16);
                    if (iZza2 != 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                } else if (iZza < 17) {
                    f2 = zzb[iZza];
                } else {
                    AbstractC3888ke0.r("Unexpected aspect_ratio_idc value: ", iZza, "NalUnitUtil");
                    f2 = 1.0f;
                }
            }
            if (zzflVar.zzh()) {
                zzflVar.zze();
            }
            if (zzflVar.zzh()) {
                zzflVar.zzf(3);
                if (true != zzflVar.zzh()) {
                }
                if (zzflVar.zzh()) {
                    int iZza11 = zzflVar.zza(8);
                    int iZza12 = zzflVar.zza(8);
                    zzflVar.zzf(8);
                    int iZza13 = zzk.zza(iZza11);
                    iZzb2 = zzk.zzb(iZza12);
                    i16 = iZza13;
                    i14 = i18;
                } else {
                    i14 = i18;
                    i16 = -1;
                    iZzb2 = -1;
                }
            } else {
                i16 = -1;
                iZzb2 = -1;
            }
            if (zzflVar.zzh()) {
                zzflVar.zzc();
                zzflVar.zzc();
            }
            if (zzflVar.zzh()) {
                zzflVar.zzf(65);
            }
            zZzh3 = zzflVar.zzh();
            if (zZzh3) {
                zzn(zzflVar);
            }
            zZzh4 = zzflVar.zzh();
            if (zZzh4) {
                zzn(zzflVar);
            }
            if (zZzh3) {
                zzflVar.zze();
            } else {
                zzflVar.zze();
            }
            zzflVar.zze();
            if (zzflVar.zzh()) {
                zzflVar.zze();
                zzflVar.zzc();
                zzflVar.zzc();
                zzflVar.zzc();
                zzflVar.zzc();
                int iZzc113 = zzflVar.zzc();
                zzflVar.zzc();
                i15 = iZzc113;
            } else {
                i15 = i13;
            }
            i17 = i14;
            f = f2;
        } else {
            i15 = i13;
            f = 1.0f;
            i16 = -1;
            i17 = -1;
            iZzb2 = -1;
        }
        return new zzfj(i12, iZza4, iZza5, iZzc5, iZzc16, i24, i25, f, iZzc2, iZzc3, zZzh, zZzh2, iZzc6, iZzc7, iZzc4, z, i16, i17, iZzb2, i15);
    }

    @Nullable
    public static String zzg(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                zzfxk zzfxkVar = new zzfxk();
                int i2 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i2 >= length2) {
                        break;
                    }
                    int iZza = zza(bArr, i2, length2, zArr);
                    if (iZza != length2) {
                        zzfxkVar.zzf(Integer.valueOf(iZza));
                    }
                    i2 = iZza + 3;
                }
                zzfxn zzfxnVarZzi = zzfxkVar.zzi();
                for (int i3 = 0; i3 < zzfxnVarZzi.size(); i3++) {
                    if (((Integer) zzfxnVarZzi.get(i3)).intValue() + 3 < length) {
                        zzfl zzflVar = new zzfl(bArr, ((Integer) zzfxnVarZzi.get(i3)).intValue() + 3, length);
                        zzey zzeyVarZzl = zzl(zzflVar);
                        if (zzeyVarZzl.zza == 33 && zzeyVarZzl.zzb == 0) {
                            zzflVar.zzf(4);
                            int iZza2 = zzflVar.zza(3);
                            zzflVar.zze();
                            zzez zzezVarZzm = zzm(zzflVar, true, iZza2, null);
                            return zzcy.zzd(zzezVarZzm.zza, zzezVarZzm.zzb, zzezVarZzm.zzc, zzezVarZzm.zzd, zzezVarZzm.zze, zzezVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void zzh(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean zzi(byte b) {
        if (((b & 96) >> 5) != 0) {
            return true;
        }
        int i = b & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    private static int zzj(int i, int i2, int i3, int i4) {
        return i - ((i3 + i4) * (i2 == 1 ? 2 : 1));
    }

    private static int zzk(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - ((i3 + i4) * i5);
    }

    private static zzey zzl(zzfl zzflVar) {
        zzflVar.zze();
        return new zzey(zzflVar.zza(6), zzflVar.zza(6), zzflVar.zza(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static zzez zzm(zzfl zzflVar, boolean z, int i, @Nullable zzez zzezVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zZzh;
        int iZza;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (!z) {
            if (zzezVar != null) {
                int i7 = zzezVar.zza;
                zZzh = zzezVar.zzb;
                iZza = zzezVar.zzc;
                i5 = zzezVar.zzd;
                iArr2 = zzezVar.zze;
                i2 = i7;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int iZza2 = zzflVar.zza(8);
            i6 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                if (zzflVar.zzh()) {
                    i6 += 88;
                }
                if (zzflVar.zzh()) {
                    i6 += 8;
                }
            }
            zzflVar.zzf(i6);
            if (i > 0) {
                int i9 = 8 - i;
                zzflVar.zzf(i9 + i9);
            }
            return new zzez(i2, z2, i3, i4, iArr, iZza2);
        }
        int iZza3 = zzflVar.zza(2);
        zZzh = zzflVar.zzh();
        iZza = zzflVar.zza(5);
        i5 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (zzflVar.zzh()) {
                i5 |= 1 << i10;
            }
        }
        for (int i11 = 0; i11 < 6; i11++) {
            iArr2[i11] = zzflVar.zza(8);
        }
        i2 = iZza3;
        iArr = iArr2;
        z2 = zZzh;
        i3 = iZza;
        i4 = i5;
        int iZza4 = zzflVar.zza(8);
        i6 = 0;
        while (i8 < i) {
            if (zzflVar.zzh()) {
                i6 += 88;
            }
            if (zzflVar.zzh()) {
                i6 += 8;
            }
        }
        zzflVar.zzf(i6);
        if (i > 0) {
            int i12 = 8 - i;
            zzflVar.zzf(i12 + i12);
        }
        return new zzez(i2, z2, i3, i4, iArr, iZza4);
    }

    private static void zzn(zzfl zzflVar) {
        int iZzc = zzflVar.zzc() + 1;
        zzflVar.zzf(8);
        for (int i = 0; i < iZzc; i++) {
            zzflVar.zzc();
            zzflVar.zzc();
            zzflVar.zze();
        }
        zzflVar.zzf(20);
    }
}
