package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgm {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i2) {
        int i3;
        synchronized (zzc) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    try {
                        if (i4 >= i2 - 2) {
                            i4 = i2;
                            break;
                        }
                        int i6 = i4 + 1;
                        if (bArr[i4] == 0 && bArr[i6] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4 = i6;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i5) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = zzd[i9] - i7;
                System.arraycopy(bArr, i7, bArr, i8, i10);
                int i11 = i8 + i10;
                int i12 = i11 + 1;
                bArr[i11] = 0;
                i8 = i11 + 2;
                bArr[i12] = 0;
                i7 += i10 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i8, i3 - i8);
        }
        return i3;
    }

    public static boolean zzb(zzv zzvVar, byte b2) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, "video/avc") && (b2 & 31) == 6) {
            return true;
        }
        return Objects.equals(strZzq, "video/hevc") && ((b2 & 126) >> 1) == 39;
    }

    public static int zzc(zzv zzvVar) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, "video/avc")) {
            return 1;
        }
        return Objects.equals(strZzq, "video/hevc") ? 2 : 0;
    }

    public static boolean zzd(byte[] bArr, int i2, int i3, zzv zzvVar) {
        String str = zzvVar.zzo;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) != 0) {
                return true;
            }
            int i4 = b2 & 31;
            return (i4 == 1 || i4 == 9 || i4 == 14) ? false : true;
        }
        if (Objects.equals(str, "video/hevc")) {
            zzga zzgaVarZzl = zzl(new zzgn(bArr, 4, i3 + 4));
            int i5 = zzgaVarZzl.zza;
            if (i5 == 35) {
                return false;
            }
            return (i5 <= 14 && i5 % 2 == 0 && zzgaVarZzl.zzc == zzvVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01de  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:117:0x0203  */
    /* JADX WARN: Code duplicated, block: B:118:0x0207  */
    /* JADX WARN: Code duplicated, block: B:121:0x0210  */
    /* JADX WARN: Code duplicated, block: B:124:0x021c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0227  */
    /* JADX WARN: Code duplicated, block: B:130:0x0230  */
    /* JADX WARN: Code duplicated, block: B:133:0x0237  */
    /* JADX WARN: Code duplicated, block: B:136:0x0243  */
    /* JADX WARN: Code duplicated, block: B:138:0x0268  */
    /* JADX WARN: Code duplicated, block: B:143:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[PHI: r2
  0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x016f A[PHI: r2
  0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0184  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0 A[PHI: r17
  0x01a0: PHI (r17v3 float) = (r17v1 float), (r17v5 float), (r17v1 float), (r17v1 float), (r17v6 float) binds: [B:92:0x0182, B:102:0x01a7, B:96:0x0198, B:97:0x019a, B:98:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    public static zzgl zze(byte[] bArr, int i2, int i3) {
        int iZzg;
        int i4;
        boolean zZze;
        int i5;
        int iZzg2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int iZzh;
        int i11;
        int i12;
        int iZzg3;
        boolean z2;
        boolean zZze2;
        int i13;
        int i14;
        int i15;
        int iZzg4;
        float f;
        int i16;
        int i17;
        float f2;
        int i18;
        int i19;
        int i20;
        int iZzc;
        boolean zZze3;
        boolean zZze4;
        int i21;
        int iZzf;
        int iZzf2;
        int iZzf3;
        int i22;
        int i23;
        zzgn zzgnVar = new zzgn(bArr, i2, i3);
        int iZzf4 = zzgnVar.zzf(8);
        int iZzf5 = zzgnVar.zzf(8);
        int iZzf6 = zzgnVar.zzf(8);
        int iZzg5 = zzgnVar.zzg();
        if (iZzf4 == 100 || iZzf4 == 110 || iZzf4 == 122 || iZzf4 == 244 || iZzf4 == 44 || iZzf4 == 83 || iZzf4 == 86 || iZzf4 == 118 || iZzf4 == 128) {
            iZzg = zzgnVar.zzg();
            if (iZzg == 3) {
                zZze = zzgnVar.zze();
                i4 = 3;
            } else {
                i4 = iZzg;
                zZze = false;
            }
            i5 = 16;
            int iZzg6 = zzgnVar.zzg();
            iZzg2 = zzgnVar.zzg();
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                if (i4 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                for (i8 = 0; i8 < i7; i8++) {
                    if (!zzgnVar.zze()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iZzh = 8;
                        i11 = 8;
                        for (i10 = 0; i10 < i9; i10++) {
                            if (iZzh != 0) {
                                iZzh = ((zzgnVar.zzh() + i11) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i11 = iZzh;
                            }
                        }
                    }
                }
            }
            i6 = iZzg6;
        } else if (iZzf4 == 138) {
            iZzf4 = 138;
            iZzg = zzgnVar.zzg();
            if (iZzg == 3) {
                zZze = zzgnVar.zze();
                i4 = 3;
            } else {
                i4 = iZzg;
                zZze = false;
            }
            i5 = 16;
            int iZzg7 = zzgnVar.zzg();
            iZzg2 = zzgnVar.zzg();
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                if (i4 != 3) {
                    i7 = 8;
                } else {
                    i7 = 12;
                }
                while (i8 < i7) {
                    if (!zzgnVar.zze()) {
                        if (i8 < 6) {
                            i9 = 16;
                        } else {
                            i9 = 64;
                        }
                        iZzh = 8;
                        i11 = 8;
                        while (i10 < i9) {
                            if (iZzh != 0) {
                                iZzh = ((zzgnVar.zzh() + i11) + 256) % 256;
                            }
                            if (iZzh != 0) {
                                i11 = iZzh;
                            }
                        }
                    }
                }
            }
            i6 = iZzg7;
        } else {
            iZzg = 1;
            i5 = 16;
            i6 = 0;
            zZze = false;
            iZzg2 = 0;
        }
        int iZzg8 = zzgnVar.zzg() + 4;
        int iZzg9 = zzgnVar.zzg();
        if (iZzg9 != 0) {
            if (iZzg9 == 1) {
                boolean zZze5 = zzgnVar.zze();
                zzgnVar.zzh();
                zzgnVar.zzh();
                long jZzg = zzgnVar.zzg();
                for (int i24 = 0; i24 < jZzg; i24++) {
                    zzgnVar.zzg();
                }
                z2 = zZze5;
                iZzg9 = 1;
                i12 = 244;
                iZzg3 = 0;
            } else {
                i12 = 244;
                iZzg3 = 0;
            }
            int iZzg10 = zzgnVar.zzg();
            zzgnVar.zza();
            int iZzg11 = zzgnVar.zzg() + 1;
            int iZzg12 = zzgnVar.zzg() + 1;
            zZze2 = zzgnVar.zze();
            i13 = 2 - (zZze2 ? 1 : 0);
            if (!zZze2) {
                zzgnVar.zza();
            }
            zzgnVar.zza();
            i14 = iZzg11 * 16;
            i15 = iZzg12 * i13 * 16;
            if (zzgnVar.zze()) {
                int iZzg13 = zzgnVar.zzg();
                int iZzg14 = zzgnVar.zzg();
                int iZzg15 = zzgnVar.zzg();
                int iZzg16 = zzgnVar.zzg();
                if (iZzg == 0) {
                    i22 = 1;
                } else {
                    if (iZzg == 3) {
                        i22 = 1;
                    } else {
                        i22 = 2;
                    }
                    if (iZzg == 1) {
                        i23 = 2;
                    } else {
                        i23 = 1;
                    }
                    i13 *= i23;
                }
                i14 -= (iZzg13 + iZzg14) * i22;
                i15 -= (iZzg15 + iZzg16) * i13;
            }
            if (iZzf4 != 44 || iZzf4 == 86 || iZzf4 == 100 || iZzf4 == 110 || iZzf4 == 122) {
                if ((iZzf5 & 16) != 0) {
                    iZzg4 = 0;
                } else {
                    iZzg4 = i5;
                }
            } else if (iZzf4 == i12) {
                iZzf4 = i12;
                if ((iZzf5 & 16) != 0) {
                    iZzg4 = 0;
                } else {
                    iZzg4 = i5;
                }
            } else {
                iZzg4 = i5;
            }
            f = 1.0f;
            i16 = -1;
            if (zzgnVar.zze()) {
                if (!zzgnVar.zze()) {
                    iZzf = zzgnVar.zzf(8);
                    if (iZzf == 255) {
                        int i25 = i5;
                        iZzf2 = zzgnVar.zzf(i25);
                        iZzf3 = zzgnVar.zzf(i25);
                        if (iZzf2 != 0 && iZzf3 != 0) {
                            f = iZzf2 / iZzf3;
                        }
                    } else if (iZzf < 17) {
                        f = zzb[iZzf];
                    } else {
                        Z.w(new StringBuilder(String.valueOf(iZzf).length() + 35), "Unexpected aspect_ratio_idc value: ", iZzf, "NalUnitUtil");
                    }
                }
                if (zzgnVar.zze()) {
                    zzgnVar.zza();
                }
                if (zzgnVar.zze()) {
                    zzgnVar.zzb(3);
                    if (true != zzgnVar.zze()) {
                        i21 = 2;
                    } else {
                        i21 = 1;
                    }
                    if (zzgnVar.zze()) {
                        int iZzf7 = zzgnVar.zzf(8);
                        int iZzf8 = zzgnVar.zzf(8);
                        zzgnVar.zzb(8);
                        int iZzb = zzi.zzb(iZzf7);
                        iZzc = zzi.zzc(iZzf8);
                        i20 = iZzb;
                    } else {
                        i20 = -1;
                        iZzc = -1;
                    }
                    i16 = i21;
                } else {
                    i20 = -1;
                    iZzc = -1;
                }
                if (zzgnVar.zze()) {
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                }
                if (zzgnVar.zze()) {
                    zzgnVar.zzb(65);
                }
                zZze3 = zzgnVar.zze();
                if (zZze3) {
                    zzp(zzgnVar);
                }
                zZze4 = zzgnVar.zze();
                if (zZze4) {
                    zzp(zzgnVar);
                }
                if (zZze3 || zZze4) {
                    zzgnVar.zza();
                }
                zzgnVar.zza();
                if (zzgnVar.zze()) {
                    zzgnVar.zza();
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                    iZzg4 = zzgnVar.zzg();
                    zzgnVar.zzg();
                }
                int i26 = i16;
                i16 = i20;
                iZzg8 = iZzg8;
                i18 = i26;
                i19 = iZzc;
                i17 = iZzg4;
                f2 = f;
            } else {
                i17 = iZzg4;
                f2 = 1.0f;
                i18 = -1;
                i19 = -1;
            }
            return new zzgl(iZzf4, iZzf5, iZzf6, iZzg5, iZzg10, i14, i15, f2, i6, iZzg2, zZze, zZze2, iZzg8, iZzg9, iZzg3, z2, i16, i18, i19, i17);
        }
        iZzg3 = zzgnVar.zzg() + 4;
        i12 = 244;
        z2 = false;
        int iZzg17 = zzgnVar.zzg();
        zzgnVar.zza();
        int iZzg18 = zzgnVar.zzg() + 1;
        int iZzg19 = zzgnVar.zzg() + 1;
        zZze2 = zzgnVar.zze();
        i13 = 2 - (zZze2 ? 1 : 0);
        if (!zZze2) {
            zzgnVar.zza();
        }
        zzgnVar.zza();
        i14 = iZzg18 * 16;
        i15 = iZzg19 * i13 * 16;
        if (zzgnVar.zze()) {
            int iZzg110 = zzgnVar.zzg();
            int iZzg111 = zzgnVar.zzg();
            int iZzg112 = zzgnVar.zzg();
            int iZzg113 = zzgnVar.zzg();
            if (iZzg == 0) {
                i22 = 1;
            } else {
                if (iZzg == 3) {
                    i22 = 1;
                } else {
                    i22 = 2;
                }
                if (iZzg == 1) {
                    i23 = 2;
                } else {
                    i23 = 1;
                }
                i13 *= i23;
            }
            i14 -= (iZzg110 + iZzg111) * i22;
            i15 -= (iZzg112 + iZzg113) * i13;
        }
        if (iZzf4 != 44) {
            if ((iZzf5 & 16) != 0) {
                iZzg4 = 0;
            } else {
                iZzg4 = i5;
            }
        } else if ((iZzf5 & 16) != 0) {
            iZzg4 = 0;
        } else {
            iZzg4 = i5;
        }
        f = 1.0f;
        i16 = -1;
        if (zzgnVar.zze()) {
            if (!zzgnVar.zze()) {
                iZzf = zzgnVar.zzf(8);
                if (iZzf == 255) {
                    int i27 = i5;
                    iZzf2 = zzgnVar.zzf(i27);
                    iZzf3 = zzgnVar.zzf(i27);
                    if (iZzf2 != 0) {
                        f = iZzf2 / iZzf3;
                    }
                } else if (iZzf < 17) {
                    f = zzb[iZzf];
                } else {
                    Z.w(new StringBuilder(String.valueOf(iZzf).length() + 35), "Unexpected aspect_ratio_idc value: ", iZzf, "NalUnitUtil");
                }
            }
            if (zzgnVar.zze()) {
                zzgnVar.zza();
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzb(3);
                if (true != zzgnVar.zze()) {
                    i21 = 2;
                } else {
                    i21 = 1;
                }
                if (zzgnVar.zze()) {
                    int iZzf9 = zzgnVar.zzf(8);
                    int iZzf10 = zzgnVar.zzf(8);
                    zzgnVar.zzb(8);
                    int iZzb2 = zzi.zzb(iZzf9);
                    iZzc = zzi.zzc(iZzf10);
                    i20 = iZzb2;
                } else {
                    i20 = -1;
                    iZzc = -1;
                }
                i16 = i21;
            } else {
                i20 = -1;
                iZzc = -1;
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
                zzgnVar.zzg();
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzb(65);
            }
            zZze3 = zzgnVar.zze();
            if (zZze3) {
                zzp(zzgnVar);
            }
            zZze4 = zzgnVar.zze();
            if (zZze4) {
                zzp(zzgnVar);
            }
            if (zZze3) {
                zzgnVar.zza();
            } else {
                zzgnVar.zza();
            }
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                zzgnVar.zza();
                zzgnVar.zzg();
                zzgnVar.zzg();
                zzgnVar.zzg();
                zzgnVar.zzg();
                iZzg4 = zzgnVar.zzg();
                zzgnVar.zzg();
            }
            int i28 = i16;
            i16 = i20;
            iZzg8 = iZzg8;
            i18 = i28;
            i19 = iZzc;
            i17 = iZzg4;
            f2 = f;
        } else {
            i17 = iZzg4;
            f2 = 1.0f;
            i18 = -1;
            i19 = -1;
        }
        return new zzgl(iZzf4, iZzf5, iZzf6, iZzg5, iZzg17, i14, i15, f2, i6, iZzg2, zZze, zZze2, iZzg8, iZzg9, iZzg3, z2, i16, i18, i19, i17);
    }

    /* JADX WARN: Code duplicated, block: B:458:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgj zzf(byte[] bArr, int i2, int i3) {
        int i4;
        zzgi zzgiVar;
        boolean z2;
        int iZzf;
        int iZzf2;
        int iZzf3;
        int iZzf4;
        int i5;
        int i6;
        int i7;
        boolean[][] zArr;
        int[] iArr;
        boolean[][] zArr2;
        int[] iArr2;
        int i8;
        int i9;
        boolean zZze;
        int i10;
        int i11;
        int i12;
        int iZzg;
        int i13;
        int i14;
        int i15;
        boolean z3;
        boolean z4;
        zzgn zzgnVar = new zzgn(bArr, i2, i3);
        zzga zzgaVarZzl = zzl(zzgnVar);
        zzgnVar.zzb(4);
        boolean zZze2 = zzgnVar.zze();
        boolean zZze3 = zzgnVar.zze();
        int iZzf5 = zzgnVar.zzf(6);
        int i16 = iZzf5 + 1;
        int iZzf6 = zzgnVar.zzf(3);
        zzgnVar.zzb(17);
        zzgb zzgbVarZzm = zzm(zzgnVar, true, iZzf6, null);
        for (int i17 = true != zzgnVar.zze() ? iZzf6 : 0; i17 <= iZzf6; i17++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zzg();
        }
        int iZzf7 = zzgnVar.zzf(6);
        int iZzg2 = zzgnVar.zzg() + 1;
        int i18 = 6;
        zzgc zzgcVar = new zzgc(zzgtd.zzj(zzgbVarZzm), new int[1]);
        boolean z5 = i16 >= 2 && iZzg2 >= 2;
        boolean z6 = zZze2 && zZze3;
        int i19 = 1;
        int i20 = iZzf7 + 1;
        if (!z5 || !z6 || i20 < i16) {
            return new zzgj(zzgaVarZzl, null, zzgcVar, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) cls, iZzg2, i20);
        int[] iArr4 = new int[iZzg2];
        int[] iArr5 = new int[iZzg2];
        iArr3[0][0] = 0;
        iArr4[0] = 1;
        iArr5[0] = 0;
        for (int i21 = 1; i21 < iZzg2; i21++) {
            int i22 = 0;
            for (int i23 = 0; i23 <= iZzf7; i23++) {
                if (zzgnVar.zze()) {
                    iArr3[i21][i22] = i23;
                    iArr5[i21] = i23;
                    i22++;
                }
                iArr4[i21] = i22;
            }
        }
        if (zzgnVar.zze()) {
            zzgnVar.zzb(64);
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
            }
            int iZzg3 = zzgnVar.zzg();
            int i24 = 0;
            while (i24 < iZzg3) {
                zzgnVar.zzg();
                if (i24 == 0 || zzgnVar.zze()) {
                    boolean zZze4 = zzgnVar.zze();
                    boolean zZze5 = zzgnVar.zze();
                    if (zZze4 || zZze5) {
                        zZze = zzgnVar.zze();
                        iZzg3 = iZzg3;
                        if (zZze) {
                            zzgnVar.zzb(19);
                        }
                        zzgnVar.zzb(8);
                        if (zZze) {
                            zzgnVar.zzb(4);
                        }
                        zzgnVar.zzb(15);
                        i11 = zZze4;
                        i10 = zZze5;
                    } else {
                        z4 = zZze4;
                        z3 = zZze5;
                    }
                    i12 = 0;
                    while (i12 <= iZzf6) {
                        if (!zzgnVar.zze() || zzgnVar.zze()) {
                            zzgnVar.zzg();
                        } else {
                            if (zzgnVar.zze()) {
                                iZzg = 0;
                            }
                            zzga zzgaVar = zzgaVarZzl;
                            i13 = i11 + i10;
                            int[][] iArr6 = iArr3;
                            i14 = 0;
                            while (i14 < i13) {
                                int i25 = i13;
                                for (i15 = 0; i15 <= iZzg; i15++) {
                                    zzgnVar.zzg();
                                    zzgnVar.zzg();
                                    if (zZze) {
                                        zzgnVar.zzg();
                                        zzgnVar.zzg();
                                    }
                                    zzgnVar.zza();
                                }
                                i14++;
                                i13 = i25;
                            }
                            i12++;
                            zzgaVarZzl = zzgaVar;
                            iArr3 = iArr6;
                        }
                        iZzg = zzgnVar.zzg();
                        zzga zzgaVar2 = zzgaVarZzl;
                        i13 = i11 + i10;
                        int[][] iArr7 = iArr3;
                        i14 = 0;
                        while (i14 < i13) {
                            int i26 = i13;
                            while (i15 <= iZzg) {
                                zzgnVar.zzg();
                                zzgnVar.zzg();
                                if (zZze) {
                                    zzgnVar.zzg();
                                    zzgnVar.zzg();
                                }
                                zzgnVar.zza();
                            }
                            i14++;
                            i13 = i26;
                        }
                        i12++;
                        zzgaVarZzl = zzgaVar2;
                        iArr3 = iArr7;
                    }
                    i24++;
                    iZzg3 = iZzg3;
                } else {
                    z4 = false;
                    z3 = false;
                }
                zZze = false;
                i11 = z4;
                i10 = z3;
                i12 = 0;
                while (i12 <= iZzf6) {
                    if (zzgnVar.zze()) {
                        zzgnVar.zzg();
                        iZzg = zzgnVar.zzg();
                    } else {
                        zzgnVar.zzg();
                        iZzg = zzgnVar.zzg();
                    }
                    zzga zzgaVar3 = zzgaVarZzl;
                    i13 = i11 + i10;
                    int[][] iArr8 = iArr3;
                    i14 = 0;
                    while (i14 < i13) {
                        int i27 = i13;
                        while (i15 <= iZzg) {
                            zzgnVar.zzg();
                            zzgnVar.zzg();
                            if (zZze) {
                                zzgnVar.zzg();
                                zzgnVar.zzg();
                            }
                            zzgnVar.zza();
                        }
                        i14++;
                        i13 = i27;
                    }
                    i12++;
                    zzgaVarZzl = zzgaVar3;
                    iArr3 = iArr8;
                }
                i24++;
                iZzg3 = iZzg3;
            }
        }
        zzga zzgaVar4 = zzgaVarZzl;
        int[][] iArr9 = iArr3;
        if (!zzgnVar.zze()) {
            return new zzgj(zzgaVar4, null, zzgcVar, null, null);
        }
        zzgnVar.zzc();
        zzgb zzgbVarZzm2 = zzm(zzgnVar, false, iZzf6, zzgbVarZzm);
        boolean zZze6 = zzgnVar.zze();
        boolean[] zArr3 = new boolean[16];
        int i28 = 0;
        for (int i29 = 0; i29 < 16; i29++) {
            boolean zZze7 = zzgnVar.zze();
            zArr3[i29] = zZze7;
            if (zZze7) {
                i28++;
            }
        }
        if (i28 == 0 || !zArr3[1]) {
            return new zzgj(zzgaVar4, null, zzgcVar, null, null);
        }
        int i30 = i28 + 1;
        int[] iArr10 = new int[i28];
        for (int i31 = 0; i31 < i28 - (zZze6 ? 1 : 0); i31++) {
            iArr10[i31] = zzgnVar.zzf(3);
        }
        int[] iArr11 = new int[i30];
        if (zZze6) {
            for (int i32 = 1; i32 < i28; i32++) {
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr11[i32] = iArr10[i33] + 1 + iArr11[i32];
                }
            }
            iArr11[i28] = 6;
        }
        int[][] iArr12 = (int[][]) Array.newInstance((Class<?>) cls, i16, i28);
        int[] iArr13 = new int[i16];
        iArr13[0] = 0;
        boolean zZze8 = zzgnVar.zze();
        int i34 = 1;
        while (i34 < i16) {
            if (zZze8) {
                iArr13[i34] = zzgnVar.zzf(i18);
            } else {
                iArr13[i34] = i34;
            }
            if (zZze6) {
                i9 = i34;
                int i35 = 0;
                while (i35 < i28) {
                    int i36 = i35 + 1;
                    iArr12[i9][i35] = (iArr13[i9] & ((1 << iArr11[i36]) - 1)) >> iArr11[i35];
                    i35 = i36;
                }
            } else {
                int i37 = 0;
                while (i37 < i28) {
                    iArr12[i34][i37] = zzgnVar.zzf(iArr10[i37] + 1);
                    i37++;
                    i34 = i34;
                }
                i9 = i34;
            }
            i34 = i9 + 1;
            i18 = 6;
        }
        int[] iArr14 = new int[i20];
        int i38 = 1;
        int i39 = 0;
        while (i39 < i16) {
            iArr14[iArr13[i39]] = -1;
            int[] iArr15 = iArr14;
            int i40 = 0;
            int i41 = 0;
            while (i40 < 16) {
                if (zArr3[i40]) {
                    i8 = i19;
                    if (i40 == i8) {
                        iArr15[iArr13[i39]] = iArr12[i39][i41];
                        i40 = i8;
                    }
                    i41++;
                } else {
                    i8 = i19;
                }
                i40 += i8;
                i19 = i8;
            }
            if (i39 > 0) {
                int i42 = 0;
                while (true) {
                    if (i42 >= i39) {
                        i38++;
                        break;
                    }
                    if (iArr15[iArr13[i39]] == iArr15[iArr13[i42]]) {
                        break;
                    }
                    i42++;
                }
            }
            i39++;
            iArr14 = iArr15;
            i19 = 1;
        }
        int[] iArr16 = iArr14;
        int iZzf8 = zzgnVar.zzf(4);
        if (i38 < 2 || iZzf8 == 0) {
            return new zzgj(zzgaVar4, null, zzgcVar, null, null);
        }
        int[] iArr17 = new int[i38];
        for (int i43 = 0; i43 < i38; i43++) {
            iArr17[i43] = zzgnVar.zzf(iZzf8);
        }
        int[] iArr18 = new int[i20];
        for (int i44 = 0; i44 < i16; i44++) {
            iArr18[Math.min(iArr13[i44], iZzf7)] = i44;
        }
        zzgta zzgtaVar = new zzgta();
        int i45 = 0;
        while (i45 <= iZzf7) {
            int[] iArr19 = iArr17;
            int i46 = i38;
            int iMin = Math.min(iArr16[i45], i46 - 1);
            int[] iArr20 = iArr18;
            zzgtaVar.zzf(new zzfz(iArr20[i45], iMin >= 0 ? iArr19[iMin] : -1));
            i45++;
            i38 = i46;
            iArr17 = iArr19;
            iArr18 = iArr20;
        }
        zzgtd zzgtdVarZzi = zzgtaVar.zzi();
        if (((zzfz) zzgtdVarZzi.get(0)).zzb == -1) {
            return new zzgj(zzgaVar4, null, zzgcVar, null, null);
        }
        int i47 = 1;
        while (true) {
            zzga zzgaVar5 = zzgaVar4;
            if (i47 > iZzf7) {
                zzgaVar4 = zzgaVar5;
                i4 = -1;
                i47 = -1;
                break;
            }
            zzgaVar4 = zzgaVar5;
            i4 = -1;
            if (((zzfz) zzgtdVarZzi.get(i47)).zzb != -1) {
                break;
            }
            i47++;
        }
        if (i47 == i4) {
            return new zzgj(zzgaVar4, null, zzgcVar, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i16, i16);
        int i48 = 1;
        while (i48 < i16) {
            boolean[][] zArr6 = zArr5;
            for (int i49 = 0; i49 < i48; i49++) {
                boolean[] zArr7 = zArr4[i48];
                boolean[] zArr8 = zArr6[i48];
                boolean zZze9 = zzgnVar.zze();
                zArr8[i49] = zZze9;
                zArr7[i49] = zZze9;
            }
            i48++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i50 = 1; i50 < i16; i50++) {
            int i51 = 0;
            while (i51 < iZzf5) {
                int i52 = i51;
                for (int i53 = 0; i53 < i50; i53++) {
                    boolean[] zArr10 = zArr9[i50];
                    if (zArr10[i53] && zArr9[i53][i52]) {
                        zArr10[i52] = true;
                        break;
                    }
                }
                i51 = i52 + 1;
            }
        }
        int[] iArr21 = new int[i20];
        int i54 = 0;
        while (i54 < i16) {
            int[] iArr22 = iArr21;
            int i55 = 0;
            for (int i56 = 0; i56 < i54; i56++) {
                i55 += zArr4[i54][i56] ? 1 : 0;
            }
            iArr22[iArr13[i54]] = i55;
            i54++;
            iArr21 = iArr22;
        }
        int[] iArr23 = iArr21;
        int i57 = 0;
        for (int i58 = 0; i58 < i16; i58++) {
            if (iArr23[iArr13[i58]] == 0) {
                i57++;
            }
        }
        if (i57 > 1) {
            return new zzgj(zzgaVar4, null, zzgcVar, null, null);
        }
        int[] iArr24 = new int[i16];
        int[] iArr25 = new int[iZzg2];
        if (zzgnVar.zze()) {
            int i59 = 0;
            while (i59 < i16) {
                int i60 = i59;
                iArr24[i60] = zzgnVar.zzf(3);
                i59 = i60 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i16, iZzf6);
        }
        int i61 = 0;
        while (i61 < iZzg2) {
            int[] iArr26 = iArr24;
            int i62 = i61;
            int[] iArr27 = iArr13;
            int iMax = 0;
            for (int i63 = 0; i63 < iArr4[i62]; i63++) {
                iMax = Math.max(iMax, iArr26[((zzfz) zzgtdVarZzi.get(iArr9[i62][i63])).zza]);
            }
            iArr25[i62] = iMax + 1;
            i61 = i62 + 1;
            iArr24 = iArr26;
            iArr13 = iArr27;
        }
        int[] iArr28 = iArr13;
        if (zzgnVar.zze()) {
            int i64 = 0;
            while (i64 < iZzf5) {
                int i65 = i64 + 1;
                int i66 = i65;
                while (i66 < i16) {
                    if (zArr4[i66][i64]) {
                        zzgnVar.zzb(3);
                    }
                    i66++;
                    i64 = i64;
                }
                i64 = i65;
            }
        }
        zzgnVar.zza();
        int iZzg4 = zzgnVar.zzg() + 1;
        zzgta zzgtaVar2 = new zzgta();
        zzgtaVar2.zzf(zzgbVarZzm);
        if (iZzg4 > 1) {
            zzgtaVar2.zzf(zzgbVarZzm2);
            for (int i67 = 2; i67 < iZzg4; i67++) {
                zzgbVarZzm2 = zzm(zzgnVar, zzgnVar.zze(), iZzf6, zzgbVarZzm2);
                zzgtaVar2.zzf(zzgbVarZzm2);
            }
        }
        zzgtd zzgtdVarZzi2 = zzgtaVar2.zzi();
        int iZzg5 = zzgnVar.zzg() + iZzg2;
        if (iZzg5 > iZzg2) {
            return new zzgj(zzgaVar4, null, zzgcVar, null, null);
        }
        int iZzf9 = zzgnVar.zzf(2);
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) cls2, iZzg5, i20);
        int[] iArr29 = new int[iZzg5];
        int i68 = 0;
        int[] iArr30 = new int[iZzg5];
        int i69 = 0;
        while (i69 < iZzg2) {
            iArr29[i69] = i68;
            int i70 = i69;
            int i71 = iArr5[i70];
            iArr30[i70] = i71;
            if (iZzf9 == 0) {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                Arrays.fill(zArr11[i70], i68, iArr4[i70], true);
                iArr2[i70] = iArr4[i70];
            } else {
                iArr = iArr5;
                zArr2 = zArr11;
                iArr2 = iArr29;
                if (iZzf9 == 1) {
                    for (int i72 = 0; i72 < iArr4[i70]; i72++) {
                        zArr2[i70][i72] = iArr9[i70][i72] == i71;
                    }
                    iArr2[i70] = 1;
                } else {
                    i68 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i69 = i70 + 1;
                iArr5 = iArr;
                zArr11 = zArr2;
                iArr29 = iArr2;
            }
            i68 = 0;
            i69 = i70 + 1;
            iArr5 = iArr;
            zArr11 = zArr2;
            iArr29 = iArr2;
        }
        boolean[][] zArr12 = zArr11;
        int[] iArr31 = iArr29;
        int[] iArr32 = new int[i20];
        int i73 = 2;
        int[] iArr33 = new int[2];
        iArr33[1] = i20;
        iArr33[i68] = iZzg5;
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr33);
        int i74 = 1;
        int i75 = 0;
        while (i74 < iZzg5) {
            if (iZzf9 == i73) {
                for (int i76 = 0; i76 < iArr4[i74]; i76++) {
                    zArr12[i74][i76] = zzgnVar.zze();
                    int i77 = iArr31[i74];
                    boolean z7 = zArr12[i74][i76];
                    iArr31[i74] = i77 + (z7 ? 1 : 0);
                    if (z7) {
                        iArr30[i74] = iArr9[i74][i76];
                    }
                }
            }
            if (i75 == 0) {
                i5 = 0;
                if (iArr9[i74][0] == 0 && zArr12[i74][0]) {
                    i75 = 0;
                    for (int i78 = 1; i78 < iArr4[i74]; i78++) {
                        if (iArr9[i74][i78] == i47 && zArr12[i74][i47]) {
                            i75 = i74;
                        }
                    }
                } else {
                    i75 = 0;
                }
            } else {
                i5 = 0;
            }
            int i79 = i5;
            while (i79 < iArr4[i74]) {
                if (iZzg4 > 1) {
                    zArr13[i74][i79] = zArr12[i74][i79];
                    zArr = zArr4;
                    i6 = iZzg4;
                    int iZzc = zzgwn.zzc(iZzg4, RoundingMode.CEILING);
                    if (zArr13[i74][i79]) {
                        i7 = iZzf9;
                        break;
                    }
                    int i80 = ((zzfz) zzgtdVarZzi.get(iArr9[i74][i79])).zza;
                    int i81 = i5;
                    while (true) {
                        if (i81 >= i79) {
                            i7 = iZzf9;
                            break;
                        }
                        i7 = iZzf9;
                        if (zArr9[i80][((zzfz) zzgtdVarZzi.get(iArr9[i74][i81])).zza]) {
                            zArr13[i74][i79] = true;
                            break;
                        }
                        i81++;
                        iZzf9 = i7;
                    }
                    if (zArr13[i74][i79]) {
                        if (i75 <= 0 || i74 != i75) {
                            zzgnVar.zzb(iZzc);
                        } else {
                            iArr32[i79] = zzgnVar.zzf(iZzc);
                        }
                    }
                } else {
                    i6 = iZzg4;
                    i7 = iZzf9;
                    zArr = zArr4;
                }
                i79++;
                zArr4 = zArr;
                iZzg4 = i6;
                iZzf9 = i7;
            }
            int i82 = iZzg4;
            int i83 = iZzf9;
            boolean[][] zArr14 = zArr4;
            if (iArr31[i74] == 1 && iArr23[iArr30[i74]] > 0) {
                zzgnVar.zza();
            }
            i74++;
            zArr4 = zArr14;
            iZzg4 = i82;
            iZzf9 = i83;
            i73 = 2;
        }
        boolean[][] zArr15 = zArr4;
        if (i75 == 0) {
            return new zzgj(zzgaVar4, null, zzgcVar, null, null);
        }
        zzga zzgaVar6 = zzgaVar4;
        int iZzg6 = zzgnVar.zzg();
        int i84 = iZzg6 + 1;
        zzgta zzgtaVarZzv = zzgtd.zzv(i84);
        int[] iArr34 = new int[i16];
        int i85 = 0;
        while (i85 < i84) {
            int iZzf10 = zzgnVar.zzf(16);
            zzgtd zzgtdVar = zzgtdVarZzi;
            int iZzf11 = zzgnVar.zzf(16);
            if (zzgnVar.zze()) {
                iZzf2 = zzgnVar.zzf(2);
                if (iZzf2 == 3) {
                    zzgnVar.zza();
                }
                iZzf3 = zzgnVar.zzf(4);
                iZzf4 = zzgnVar.zzf(4);
            } else {
                iZzf2 = 0;
                iZzf3 = 0;
                iZzf4 = 0;
            }
            if (zzgnVar.zze()) {
                int iZzg7 = zzgnVar.zzg();
                int iZzg8 = zzgnVar.zzg();
                int iZzg9 = zzgnVar.zzg();
                int iZzg10 = zzgnVar.zzg();
                iZzf10 = zzn(iZzf10, iZzf2, iZzg7, iZzg8);
                iZzf11 = zzo(iZzf11, iZzf2, iZzg9, iZzg10);
            }
            zzgtaVarZzv.zzf(new zzgd(iZzf2, iZzf3, iZzf4, iZzf10, iZzf11));
            i85++;
            zzgtdVarZzi = zzgtdVar;
            zArr13 = zArr13;
            zzgaVar6 = zzgaVar6;
            zzgtdVarZzi2 = zzgtdVarZzi2;
        }
        zzgtd zzgtdVar2 = zzgtdVarZzi;
        zzga zzgaVar7 = zzgaVar6;
        zzgtd zzgtdVar3 = zzgtdVarZzi2;
        boolean[][] zArr16 = zArr13;
        if (i84 <= 1 || !zzgnVar.zze()) {
            for (int i86 = 1; i86 < i16; i86++) {
                iArr34[i86] = Math.min(i86, iZzg6);
            }
        } else {
            int iZzc2 = zzgwn.zzc(i84, RoundingMode.CEILING);
            for (int i87 = 1; i87 < i16; i87++) {
                iArr34[i87] = zzgnVar.zzf(iZzc2);
            }
        }
        zzge zzgeVar = new zzge(zzgtaVarZzv.zzi(), iArr34);
        zzgnVar.zzb(2);
        for (int i88 = 1; i88 < i16; i88++) {
            if (iArr23[iArr28[i88]] == 0) {
                zzgnVar.zza();
            }
        }
        for (int i89 = 1; i89 < iZzg5; i89++) {
            boolean zZze10 = zzgnVar.zze();
            int i90 = 0;
            while (i90 < iArr25[i89]) {
                if ((i90 <= 0 || !zZze10) ? i90 == 0 : zzgnVar.zze()) {
                    for (int i91 = 0; i91 < iArr4[i89]; i91++) {
                        if (zArr16[i89][i91]) {
                            zzgnVar.zzg();
                        }
                    }
                    zzgnVar.zzg();
                    zzgnVar.zzg();
                }
                i90++;
            }
        }
        int iZzg11 = zzgnVar.zzg() + 2;
        if (zzgnVar.zze()) {
            zzgnVar.zzb(iZzg11);
        } else {
            for (int i92 = 1; i92 < i16; i92++) {
                for (int i93 = 0; i93 < i92; i93++) {
                    if (zArr15[i92][i93]) {
                        zzgnVar.zzb(iZzg11);
                    }
                }
            }
        }
        int iZzg12 = zzgnVar.zzg();
        for (int i94 = 1; i94 <= iZzg12; i94++) {
            zzgnVar.zzb(8);
        }
        if (zzgnVar.zze()) {
            zzgnVar.zzc();
            if (zzgnVar.zze() || zzgnVar.zze()) {
                zzgnVar.zza();
            }
            boolean zZze11 = zzgnVar.zze();
            boolean zZze12 = zzgnVar.zze();
            if (zZze11 || zZze12) {
                for (int i95 = 0; i95 < iZzg2; i95++) {
                    for (int i96 = 0; i96 < iArr25[i95]; i96++) {
                        boolean zZze13 = zZze11 ? zzgnVar.zze() : false;
                        boolean zZze14 = zZze12 ? zzgnVar.zze() : false;
                        if (zZze13) {
                            zzgnVar.zzb(32);
                        }
                        if (zZze14) {
                            zzgnVar.zzb(18);
                        }
                    }
                }
            }
            boolean zZze15 = zzgnVar.zze();
            if (zZze15) {
                z2 = true;
                iZzf = zzgnVar.zzf(4) + 1;
            } else {
                z2 = true;
                iZzf = i16;
            }
            zzgta zzgtaVarZzv2 = zzgtd.zzv(iZzf);
            int[] iArr35 = new int[i16];
            int i97 = 0;
            while (i97 < iZzf) {
                zzgnVar.zzb(3);
                int i98 = z2 != zzgnVar.zze() ? 2 : 1;
                int iZzb = zzi.zzb(zzgnVar.zzf(8));
                int iZzc3 = zzi.zzc(zzgnVar.zzf(8));
                zzgnVar.zzb(8);
                zzgtaVarZzv2.zzf(new zzgh(iZzb, i98, iZzc3));
                i97++;
                z2 = true;
            }
            if (zZze15 && iZzf > 1) {
                for (int i99 = 0; i99 < i16; i99++) {
                    iArr35[i99] = zzgnVar.zzf(4);
                }
            }
            zzgiVar = new zzgi(zzgtaVarZzv2.zzi(), iArr35);
        } else {
            zzgiVar = null;
        }
        return new zzgj(zzgaVar7, zzgtdVar2, new zzgc(zzgtdVar3, iArr32), zzgeVar, zzgiVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:195:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    public static zzgg zzg(byte[] bArr, int i2, int i3, zzgj zzgjVar) {
        boolean z2;
        int i4;
        int i5;
        int iZzo;
        int iZzn;
        int iZzg;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzg2;
        int i10;
        int iMax;
        float f;
        int i11;
        int i12;
        int i13;
        int iZzb;
        int iZzc;
        int i14;
        zzgi zzgiVar;
        int i15;
        zzge zzgeVar;
        zzga zzgaVarZzl = zzl(new zzgn(bArr, i2, i3));
        zzgn zzgnVar = new zzgn(bArr, i2 + 2, i3);
        zzgnVar.zzb(4);
        int iZzf = zzgnVar.zzf(3);
        int i16 = zzgaVarZzl.zzb;
        if (i16 == 0 || iZzf != 7) {
            z2 = false;
        } else {
            iZzf = 7;
            z2 = true;
        }
        if (zzgjVar != null) {
            zzgtd zzgtdVar = zzgjVar.zza;
            if (zzgtdVar.isEmpty()) {
                i4 = 0;
            } else {
                i4 = ((zzfz) zzgtdVar.get(Math.min(i16, zzgtdVar.size() - 1))).zza;
            }
        } else {
            i4 = 0;
        }
        zzgb zzgbVarZzm = null;
        if (!z2) {
            zzgnVar.zza();
            zzgbVarZzm = zzm(zzgnVar, true, iZzf, null);
        } else if (zzgjVar != null) {
            zzgc zzgcVar = zzgjVar.zzb;
            int i17 = zzgcVar.zzb[i4];
            zzgtd zzgtdVar2 = zzgcVar.zza;
            if (zzgtdVar2.size() > i17) {
                zzgbVarZzm = (zzgb) zzgtdVar2.get(i17);
            }
        }
        int iZzg3 = zzgnVar.zzg();
        if (z2) {
            int iZzf2 = zzgnVar.zze() ? zzgnVar.zzf(8) : -1;
            if (zzgjVar == null || (zzgeVar = zzgjVar.zzc) == null) {
                i7 = 0;
                i9 = 0;
                iZzg = 0;
                i10 = 0;
                iZzg2 = 0;
                i6 = 0;
                i8 = 0;
            } else {
                if (iZzf2 == -1) {
                    iZzf2 = zzgeVar.zzb[i4];
                }
                if (iZzf2 != -1) {
                    zzgtd zzgtdVar3 = zzgeVar.zza;
                    if (zzgtdVar3.size() > iZzf2) {
                        zzgd zzgdVar = (zzgd) zzgtdVar3.get(iZzf2);
                        int i18 = zzgdVar.zza;
                        i8 = zzgdVar.zzd;
                        i6 = zzgdVar.zze;
                        iZzg = zzgdVar.zzb;
                        iZzg2 = zzgdVar.zzc;
                        i10 = i18;
                        i7 = i6;
                        i9 = i8;
                    } else {
                        i7 = 0;
                        i9 = 0;
                        iZzg = 0;
                        i10 = 0;
                        iZzg2 = 0;
                        i6 = 0;
                        i8 = 0;
                    }
                } else {
                    i7 = 0;
                    i9 = 0;
                    iZzg = 0;
                    i10 = 0;
                    iZzg2 = 0;
                    i6 = 0;
                    i8 = 0;
                }
            }
        } else {
            int iZzg4 = zzgnVar.zzg();
            if (iZzg4 == 3) {
                zzgnVar.zza();
                i5 = 3;
            } else {
                i5 = iZzg4;
            }
            int iZzg5 = zzgnVar.zzg();
            int iZzg6 = zzgnVar.zzg();
            if (zzgnVar.zze()) {
                int iZzg7 = zzgnVar.zzg();
                int iZzg8 = zzgnVar.zzg();
                int iZzg9 = zzgnVar.zzg();
                int iZzg10 = zzgnVar.zzg();
                iZzn = zzn(iZzg5, i5, iZzg7, iZzg8);
                iZzo = zzo(iZzg6, i5, iZzg9, iZzg10);
            } else {
                iZzo = iZzg6;
                iZzn = iZzg5;
            }
            iZzg = zzgnVar.zzg();
            i6 = iZzo;
            i7 = iZzg6;
            i8 = iZzn;
            i9 = iZzg5;
            iZzg2 = zzgnVar.zzg();
            i10 = iZzg4;
        }
        int iZzg11 = zzgnVar.zzg();
        if (z2) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i19 = true != zzgnVar.zze() ? iZzf : 0; i19 <= iZzf; i19++) {
                zzgnVar.zzg();
                iMax = Math.max(zzgnVar.zzg(), iMax);
                zzgnVar.zzg();
            }
        }
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        zzgnVar.zzg();
        if (zzgnVar.zze()) {
            if (z2 && zzgnVar.zze()) {
                zzgnVar.zzb(6);
            } else if (zzgnVar.zze()) {
                int i20 = 0;
                int i21 = 4;
                while (i20 < i21) {
                    int i22 = iMax;
                    int i23 = i21;
                    for (int i24 = 0; i24 < 6; i24 += i20 == 3 ? 3 : 1) {
                        if (zzgnVar.zze()) {
                            int iMin = Math.min(64, 1 << ((i20 + i20) + 4));
                            if (i20 > 1) {
                                zzgnVar.zzh();
                            }
                            for (int i25 = 0; i25 < iMin; i25++) {
                                zzgnVar.zzh();
                            }
                        } else {
                            zzgnVar.zzg();
                        }
                    }
                    i20++;
                    iMax = i22;
                    i21 = i23;
                }
            }
        }
        int i26 = iMax;
        zzgnVar.zzb(2);
        if (zzgnVar.zze()) {
            zzgnVar.zzb(8);
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zza();
        }
        int iZzg12 = zzgnVar.zzg();
        int i27 = 0;
        int[] iArr = new int[0];
        int i28 = iZzf;
        int[] iArrCopyOf = new int[0];
        int i29 = iZzg;
        int i30 = -1;
        int i31 = -1;
        while (i27 < iZzg12) {
            if (i27 == 0 || !zzgnVar.zze()) {
                int iZzg13 = zzgnVar.zzg();
                int iZzg14 = zzgnVar.zzg();
                int[] iArr2 = new int[iZzg13];
                int i32 = 0;
                while (i32 < iZzg13) {
                    iArr2[i32] = (i32 > 0 ? iArr2[i32 - 1] : 0) - (zzgnVar.zzg() + 1);
                    zzgnVar.zza();
                    i32++;
                }
                int[] iArr3 = new int[iZzg14];
                int i33 = 0;
                while (i33 < iZzg14) {
                    iArr3[i33] = zzgnVar.zzg() + 1 + (i33 > 0 ? iArr3[i33 - 1] : 0);
                    zzgnVar.zza();
                    i33++;
                }
                iArr = iArr2;
                iArrCopyOf = iArr3;
                i30 = iZzg13;
                i31 = iZzg14;
            } else {
                int i34 = i30 + i31;
                boolean zZze = zzgnVar.zze();
                boolean z3 = true;
                int iZzg15 = zzgnVar.zzg() + 1;
                int i35 = 1 - ((zZze ? 1 : 0) + (zZze ? 1 : 0));
                int i36 = i34 + 1;
                boolean[] zArr = new boolean[i36];
                int i37 = 0;
                while (i37 <= i34) {
                    if (zzgnVar.zze()) {
                        zArr[i37] = z3;
                    } else {
                        zArr[i37] = zzgnVar.zze();
                    }
                    i37++;
                    z3 = true;
                }
                int i38 = i31 - 1;
                int[] iArr4 = new int[i36];
                int[] iArr5 = new int[i36];
                int i39 = 0;
                while (true) {
                    i15 = i35 * iZzg15;
                    if (i38 < 0) {
                        break;
                    }
                    int i40 = iArrCopyOf[i38] + i15;
                    if (i40 < 0 && zArr[i30 + i38]) {
                        iArr4[i39] = i40;
                        i39++;
                    }
                    i38--;
                }
                if (i15 < 0 && zArr[i34]) {
                    iArr4[i39] = i15;
                    i39++;
                }
                int i41 = i39;
                for (int i42 = 0; i42 < i30; i42++) {
                    int i43 = iArr[i42] + i15;
                    if (i43 < 0 && zArr[i42]) {
                        iArr4[i41] = i43;
                        i41++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr4, i41);
                int i44 = 0;
                for (int i45 = i30 - 1; i45 >= 0; i45--) {
                    int i46 = iArr[i45] + i15;
                    if (i46 > 0 && zArr[i45]) {
                        iArr5[i44] = i46;
                        i44++;
                    }
                }
                if (i15 > 0 && zArr[i34]) {
                    iArr5[i44] = i15;
                    i44++;
                }
                int i47 = i44;
                for (int i48 = 0; i48 < i31; i48++) {
                    int i49 = iArrCopyOf[i48] + i15;
                    if (i49 > 0 && zArr[i30 + i48]) {
                        iArr5[i47] = i49;
                        i47++;
                    }
                }
                iArr = iArrCopyOf2;
                iArrCopyOf = Arrays.copyOf(iArr5, i47);
                i30 = i41;
                i31 = i47;
            }
            i27++;
            iZzg12 = iZzg12;
            i4 = i4;
            zzgaVarZzl = zzgaVarZzl;
        }
        zzga zzgaVar = zzgaVarZzl;
        int i50 = i4;
        if (zzgnVar.zze()) {
            int iZzg16 = zzgnVar.zzg();
            for (int i51 = 0; i51 < iZzg16; i51++) {
                zzgnVar.zzb(iZzg11 + 5);
            }
        }
        zzgnVar.zzb(2);
        float f2 = 1.0f;
        if (zzgnVar.zze()) {
            if (zzgnVar.zze()) {
                int iZzf3 = zzgnVar.zzf(8);
                if (iZzf3 == 255) {
                    int iZzf4 = zzgnVar.zzf(16);
                    int iZzf5 = zzgnVar.zzf(16);
                    if (iZzf4 != 0 && iZzf5 != 0) {
                        f2 = iZzf4 / iZzf5;
                    }
                } else if (iZzf3 < 17) {
                    f2 = zzb[iZzf3];
                } else {
                    Z.w(new StringBuilder(String.valueOf(iZzf3).length() + 35), "Unexpected aspect_ratio_idc value: ", iZzf3, "NalUnitUtil");
                }
            }
            if (zzgnVar.zze()) {
                zzgnVar.zza();
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzb(3);
                i14 = true != zzgnVar.zze() ? 2 : 1;
                if (zzgnVar.zze()) {
                    int iZzf6 = zzgnVar.zzf(8);
                    int iZzf7 = zzgnVar.zzf(8);
                    zzgnVar.zzb(8);
                    iZzb = zzi.zzb(iZzf6);
                    iZzc = zzi.zzc(iZzf7);
                } else {
                    iZzb = -1;
                    iZzc = -1;
                }
            } else if (zzgjVar == null || (zzgiVar = zzgjVar.zzd) == null) {
                iZzb = -1;
                iZzc = -1;
                i14 = -1;
            } else {
                int i52 = zzgiVar.zzb[i50];
                zzgtd zzgtdVar4 = zzgiVar.zza;
                if (zzgtdVar4.size() > i52) {
                    zzgh zzghVar = (zzgh) zzgtdVar4.get(i52);
                    int i53 = zzghVar.zza;
                    int i54 = zzghVar.zzb;
                    iZzc = zzghVar.zzc;
                    iZzb = i53;
                    i14 = i54;
                } else {
                    iZzb = -1;
                    iZzc = -1;
                    i14 = -1;
                }
            }
            if (zzgnVar.zze()) {
                zzgnVar.zzg();
                zzgnVar.zzg();
            }
            zzgnVar.zza();
            if (zzgnVar.zze()) {
                i6 += i6;
            }
            i11 = iZzb;
            f = f2;
            i13 = iZzc;
            i12 = i14;
        } else {
            f = 1.0f;
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new zzgg(zzgaVar, i28, zzgbVarZzm, i10, i29, iZzg2, iZzg3, i8, i6, i9, i7, f, i26, i11, i12, i13);
    }

    public static zzgk zzh(byte[] bArr, int i2, int i3) {
        zzgn zzgnVar = new zzgn(bArr, 4, i3);
        int iZzg = zzgnVar.zzg();
        int iZzg2 = zzgnVar.zzg();
        zzgnVar.zza();
        return new zzgk(iZzg, iZzg2, zzgnVar.zze());
    }

    public static int zzi(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        zzgqa.zzi(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            zzj(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            zzj(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    zzj(zArr);
                    return i7;
                }
                i6 = i7;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzk(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i3 = zzgtd.zzd;
                zzgta zzgtaVar = new zzgta();
                int i4 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i4 >= length2) {
                        break;
                    }
                    int iZzi = zzi(bArr, i4, length2, zArr);
                    if (iZzi != length2) {
                        zzgtaVar.zzf(Integer.valueOf(iZzi));
                    }
                    i4 = iZzi + 3;
                }
                zzgtd zzgtdVarZzi = zzgtaVar.zzi();
                for (int i5 = 0; i5 < zzgtdVarZzi.size(); i5++) {
                    if (((Integer) zzgtdVarZzi.get(i5)).intValue() + 3 < length) {
                        zzgn zzgnVar = new zzgn(bArr, ((Integer) zzgtdVarZzi.get(i5)).intValue() + 3, length);
                        zzga zzgaVarZzl = zzl(zzgnVar);
                        if (zzgaVarZzl.zza == 33 && zzgaVarZzl.zzb == 0) {
                            zzgnVar.zzb(4);
                            int iZzf = zzgnVar.zzf(3);
                            zzgnVar.zza();
                            zzgb zzgbVarZzm = zzm(zzgnVar, true, iZzf, null);
                            return zzdo.zzb(zzgbVarZzm.zza, zzgbVarZzm.zzb, zzgbVarZzm.zzc, zzgbVarZzm.zzd, zzgbVarZzm.zze, zzgbVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzga zzl(zzgn zzgnVar) {
        zzgnVar.zza();
        return new zzga(zzgnVar.zzf(6), zzgnVar.zzf(6), zzgnVar.zzf(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c A[SYNTHETIC] */
    private static zzgb zzm(zzgn zzgnVar, boolean z2, int i2, zzgb zzgbVar) {
        int[] iArr;
        int i3;
        boolean z3;
        int i4;
        int i5;
        boolean zZze;
        int iZzf;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z2) {
            if (zzgbVar != null) {
                int i8 = zzgbVar.zza;
                zZze = zzgbVar.zzb;
                iZzf = zzgbVar.zzc;
                i6 = zzgbVar.zzd;
                iArr2 = zzgbVar.zze;
                i3 = i8;
            } else {
                iArr = iArr2;
                i3 = 0;
                z3 = false;
                i4 = 0;
                i5 = 0;
            }
            int iZzf2 = zzgnVar.zzf(8);
            i7 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (zzgnVar.zze()) {
                    i7 += 88;
                }
                if (zzgnVar.zze()) {
                    i7 += 8;
                }
            }
            zzgnVar.zzb(i7);
            if (i2 > 0) {
                int i10 = 8 - i2;
                zzgnVar.zzb(i10 + i10);
            }
            return new zzgb(i3, z3, i4, i5, iArr, iZzf2);
        }
        int iZzf3 = zzgnVar.zzf(2);
        zZze = zzgnVar.zze();
        iZzf = zzgnVar.zzf(5);
        i6 = 0;
        for (int i11 = 0; i11 < 32; i11++) {
            if (zzgnVar.zze()) {
                i6 |= 1 << i11;
            }
        }
        for (int i12 = 0; i12 < 6; i12++) {
            iArr2[i12] = zzgnVar.zzf(8);
        }
        i3 = iZzf3;
        iArr = iArr2;
        z3 = zZze;
        i4 = iZzf;
        i5 = i6;
        int iZzf4 = zzgnVar.zzf(8);
        i7 = 0;
        while (i9 < i2) {
            if (zzgnVar.zze()) {
                i7 += 88;
            }
            if (zzgnVar.zze()) {
                i7 += 8;
            }
        }
        zzgnVar.zzb(i7);
        if (i2 > 0) {
            int i13 = 8 - i2;
            zzgnVar.zzb(i13 + i13);
        }
        return new zzgb(i3, z3, i4, i5, iArr, iZzf4);
    }

    private static int zzn(int i2, int i3, int i4, int i5) {
        int i6 = 2;
        if (i3 != 1 && i3 != 2) {
            i6 = 1;
        }
        return i2 - ((i4 + i5) * i6);
    }

    private static int zzo(int i2, int i3, int i4, int i5) {
        return i2 - ((i4 + i5) * (i3 == 1 ? 2 : 1));
    }

    private static void zzp(zzgn zzgnVar) {
        int iZzg = zzgnVar.zzg() + 1;
        zzgnVar.zzb(8);
        for (int i2 = 0; i2 < iZzg; i2++) {
            zzgnVar.zzg();
            zzgnVar.zzg();
            zzgnVar.zza();
        }
        zzgnVar.zzb(20);
    }

    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzo;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return "video/avc";
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return str2;
    }
}
