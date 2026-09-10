package com.google.android.gms.internal.measurement;

import com.applovin.impl.Z;
import com.p004ironsource.mediationsdk.metadata.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i2, int i3, zznm zznmVar, boolean z2, int[] iArr2, int i4, int i5, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        boolean z3 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (!zzA(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzC(Object obj, long j) {
        return ((Double) zzop.zzn(obj, j)).doubleValue();
    }

    private static float zzD(Object obj, long j) {
        return ((Float) zzop.zzn(obj, j)).floatValue();
    }

    private static int zzE(Object obj, long j) {
        return ((Integer) zzop.zzn(obj, j)).intValue();
    }

    private static long zzF(Object obj, long j) {
        return ((Long) zzop.zzn(obj, j)).longValue();
    }

    private static boolean zzG(Object obj, long j) {
        return ((Boolean) zzop.zzn(obj, j)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i2) {
        return zzJ(obj, i2) == zzJ(obj2, i2);
    }

    private final boolean zzI(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return zzJ(obj, i2);
        }
        return (i4 & i5) != 0;
    }

    private final boolean zzJ(Object obj, int i2) {
        int iZzy = zzy(i2);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzop.zzd(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzx = zzx(i2);
        long j2 = iZzx & 1048575;
        switch (zzz(iZzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j2)) != 0;
            case 2:
                return zzop.zzf(obj, j2) != 0;
            case 3:
                return zzop.zzf(obj, j2) != 0;
            case 4:
                return zzop.zzd(obj, j2) != 0;
            case 5:
                return zzop.zzf(obj, j2) != 0;
            case 6:
                return zzop.zzd(obj, j2) != 0;
            case 7:
                return zzop.zzh(obj, j2);
            case 8:
                Object objZzn = zzop.zzn(obj, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzlh) {
                    return !zzlh.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j2) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j2));
            case 11:
                return zzop.zzd(obj, j2) != 0;
            case 12:
                return zzop.zzd(obj, j2) != 0;
            case 13:
                return zzop.zzd(obj, j2) != 0;
            case 14:
                return zzop.zzf(obj, j2) != 0;
            case 15:
                return zzop.zzd(obj, j2) != 0;
            case 16:
                return zzop.zzf(obj, j2) != 0;
            case 17:
                return zzop.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i2) {
        int iZzy = zzy(i2);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzop.zze(obj, j, (1 << (iZzy >>> 20)) | zzop.zzd(obj, j));
    }

    private final boolean zzL(Object obj, int i2, int i3) {
        return zzop.zzd(obj, (long) (zzy(i3) & 1048575)) == i2;
    }

    private final void zzM(Object obj, int i2, int i3) {
        zzop.zze(obj, zzy(i3) & 1048575, i2);
    }

    private final int zzN(int i2, int i3) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static final int zzO(byte[] bArr, int i2, int i3, zzot zzotVar, Class cls, zzkw zzkwVar) throws IOException {
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                int i4 = i2 + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i2)));
                return i4;
            case 1:
                int i5 = i2 + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i2)));
                return i5;
            case 2:
            case 3:
                int iZzc = zzkx.zzc(bArr, i2, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzkx.zza(bArr, i2, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return iZza;
            case 5:
            case 15:
                int i6 = i2 + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i2));
                return i6;
            case 6:
            case 14:
                int i7 = i2 + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i2));
                return i7;
            case 7:
                int iZzc2 = zzkx.zzc(bArr, i2, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzkx.zzf(bArr, i2, zzkwVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i2, i3, zzkwVar);
            case 11:
                return zzkx.zzg(bArr, i2, zzkwVar);
            case 16:
                int iZza2 = zzkx.zza(bArr, i2, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzkx.zzc(bArr, i2, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzP(int i2, Object obj, zzov zzovVar) throws IOException {
        if (obj instanceof String) {
            zzovVar.zzm(i2, (String) obj);
        } else {
            zzovVar.zzn(i2, (zzlh) obj);
        }
    }

    public static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzojVarZzb = zzoj.zzb();
        zzmfVar.zzc = zzojVarZzb;
        return zzojVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ad  */
    public static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        int i2;
        int iCharAt;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        char c2;
        int iObjectFieldOffset2;
        int i20;
        int i21;
        int i22;
        Field fieldZzm;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldZzm2;
        int i28;
        Object obj2;
        Field fieldZzm3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar = (zznw) zznjVar;
        String strZzd = zznwVar.zzd();
        int length = strZzd.length();
        char c3 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i2 = i33 + 1;
                if (strZzd.charAt(i33) < 55296) {
                    break;
                }
                i33 = i2;
            }
        } else {
            i2 = 1;
        }
        int i34 = i2 + 1;
        int iCharAt2 = strZzd.charAt(i2);
        if (iCharAt2 >= 55296) {
            int i35 = iCharAt2 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                cCharAt13 = strZzd.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            iCharAt2 = i35 | (cCharAt13 << i36);
            i34 = i32;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i7 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i6 = 0;
            iArr = zza;
            i8 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt3 = strZzd.charAt(i34);
            if (iCharAt3 >= 55296) {
                int i38 = iCharAt3 & 8191;
                int i39 = 13;
                while (true) {
                    i16 = i37 + 1;
                    cCharAt8 = strZzd.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i16;
                }
                iCharAt3 = i38 | (cCharAt8 << i39);
                i37 = i16;
            }
            int i40 = i37 + 1;
            int iCharAt4 = strZzd.charAt(i37);
            if (iCharAt4 >= 55296) {
                int i41 = iCharAt4 & 8191;
                int i42 = 13;
                while (true) {
                    i15 = i40 + 1;
                    cCharAt7 = strZzd.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i15;
                }
                iCharAt4 = i41 | (cCharAt7 << i42);
                i40 = i15;
            }
            int i43 = i40 + 1;
            int iCharAt5 = strZzd.charAt(i40);
            if (iCharAt5 >= 55296) {
                int i44 = iCharAt5 & 8191;
                int i45 = 13;
                while (true) {
                    i14 = i43 + 1;
                    cCharAt6 = strZzd.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i14;
                }
                iCharAt5 = i44 | (cCharAt6 << i45);
                i43 = i14;
            }
            int i46 = i43 + 1;
            int iCharAt6 = strZzd.charAt(i43);
            if (iCharAt6 >= 55296) {
                int i47 = iCharAt6 & 8191;
                int i48 = 13;
                while (true) {
                    i13 = i46 + 1;
                    cCharAt5 = strZzd.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i13;
                }
                iCharAt6 = i47 | (cCharAt5 << i48);
                i46 = i13;
            }
            int i49 = i46 + 1;
            iCharAt = strZzd.charAt(i46);
            if (iCharAt >= 55296) {
                int i50 = iCharAt & 8191;
                int i51 = 13;
                while (true) {
                    i12 = i49 + 1;
                    cCharAt4 = strZzd.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i12;
                }
                iCharAt = i50 | (cCharAt4 << i51);
                i49 = i12;
            }
            int i52 = i49 + 1;
            int iCharAt7 = strZzd.charAt(i49);
            if (iCharAt7 >= 55296) {
                int i53 = iCharAt7 & 8191;
                int i54 = 13;
                while (true) {
                    i11 = i52 + 1;
                    cCharAt3 = strZzd.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i11;
                }
                iCharAt7 = i53 | (cCharAt3 << i54);
                i52 = i11;
            }
            int i55 = i52 + 1;
            int iCharAt8 = strZzd.charAt(i52);
            if (iCharAt8 >= 55296) {
                int i56 = iCharAt8 & 8191;
                int i57 = 13;
                while (true) {
                    i10 = i55 + 1;
                    cCharAt2 = strZzd.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i10;
                }
                iCharAt8 = i56 | (cCharAt2 << i57);
                i55 = i10;
            }
            int i58 = i55 + 1;
            int iCharAt9 = strZzd.charAt(i55);
            if (iCharAt9 >= 55296) {
                int i59 = iCharAt9 & 8191;
                int i60 = 13;
                while (true) {
                    i9 = i58 + 1;
                    cCharAt = strZzd.charAt(i58);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i60;
                    i60 += 13;
                    i58 = i9;
                }
                iCharAt9 = i59 | (cCharAt << i60);
                i58 = i9;
            }
            int i61 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i62 = iCharAt7;
            i3 = iCharAt5;
            i4 = i62;
            i5 = iCharAt6;
            i6 = iCharAt9;
            i7 = i61;
            iArr = iArr2;
            i8 = iCharAt3;
            i34 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zznwVar.zze();
        Class<?> cls2 = zznwVar.zzb().getClass();
        int i63 = i6 + i4;
        int i64 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i6;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i34 < length) {
            int i69 = i34 + 1;
            int iCharAt10 = strZzd.charAt(i34);
            if (iCharAt10 >= c3) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i31 = i71 + 1;
                    cCharAt12 = strZzd.charAt(i71);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i31;
                }
                iCharAt10 = i70 | (cCharAt12 << i72);
                i17 = i31;
            } else {
                i17 = i69;
            }
            int i73 = i17 + 1;
            int iCharAt11 = strZzd.charAt(i17);
            if (iCharAt11 >= c3) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i30 = i75 + 1;
                    cCharAt11 = strZzd.charAt(i75);
                    if (cCharAt11 < c3) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i30;
                }
                iCharAt11 = i74 | (cCharAt11 << i76);
                i18 = i30;
            } else {
                i18 = i73;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = iCharAt11 & 255;
            zznw zznwVar2 = zznwVar;
            int i78 = iCharAt11 & a.f25965n;
            if (i77 >= 51) {
                int i79 = i18 + 1;
                int iCharAt12 = strZzd.charAt(i18);
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i80 = iCharAt12 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i29 = i81 + 1;
                        cCharAt10 = strZzd.charAt(i81);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i82;
                        i82 += 13;
                        i81 = i29;
                        c4 = 55296;
                    }
                    iCharAt12 = i80 | (cCharAt10 << i82);
                    i24 = i29;
                } else {
                    i24 = i79;
                }
                int i83 = i24;
                int i84 = i77 - 51;
                if (i84 == 9 || i84 == 17) {
                    i25 = i7 + 1;
                    int i85 = i68 / 3;
                    objArr[i85 + i85 + 1] = objArrZze[i7];
                } else {
                    if (i84 != 12) {
                        i26 = i78;
                    } else if (zznwVar2.zzc() == 1 || i78 != 0) {
                        i25 = i7 + 1;
                        int i86 = i68 / 3;
                        objArr[i86 + i86 + 1] = objArrZze[i7];
                    } else {
                        i26 = 0;
                    }
                    i27 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i27];
                    int i87 = i26;
                    if (obj instanceof Field) {
                        fieldZzm2 = (Field) obj;
                    } else {
                        fieldZzm2 = zzm(cls2, (String) obj);
                        objArrZze[i27] = fieldZzm2;
                    }
                    int i88 = i8;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm2);
                    i28 = i27 + 1;
                    obj2 = objArrZze[i28];
                    i19 = i88;
                    if (obj2 instanceof Field) {
                        fieldZzm3 = (Field) obj2;
                    } else {
                        fieldZzm3 = zzm(cls2, (String) obj2);
                        objArrZze[i28] = fieldZzm3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm3);
                    strZzd = strZzd;
                    i21 = i87;
                    i18 = i83;
                    i20 = 0;
                    c2 = 55296;
                }
                i7 = i25;
                i26 = i78;
                i27 = iCharAt12 + iCharAt12;
                obj = objArrZze[i27];
                int i89 = i26;
                if (obj instanceof Field) {
                    fieldZzm2 = (Field) obj;
                } else {
                    fieldZzm2 = zzm(cls2, (String) obj);
                    objArrZze[i27] = fieldZzm2;
                }
                int i810 = i8;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm2);
                i28 = i27 + 1;
                obj2 = objArrZze[i28];
                i19 = i810;
                if (obj2 instanceof Field) {
                    fieldZzm3 = (Field) obj2;
                } else {
                    fieldZzm3 = zzm(cls2, (String) obj2);
                    objArrZze[i28] = fieldZzm3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm3);
                strZzd = strZzd;
                i21 = i89;
                i18 = i83;
                i20 = 0;
                c2 = 55296;
            } else {
                i19 = i8;
                int i90 = i7 + 1;
                Field fieldZzm4 = zzm(cls2, (String) objArrZze[i7]);
                if (i77 == 9 || i77 == 17) {
                    int i91 = i68 / 3;
                    objArr[i91 + i91 + 1] = fieldZzm4.getType();
                } else {
                    if (i77 != 27) {
                        if (i77 == 49) {
                            i7 += 2;
                            i23 = 1;
                        } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                            if (zznwVar2.zzc() == 1 || i78 != 0) {
                                i7 += 2;
                                int i92 = i68 / 3;
                                objArr[i92 + i92 + 1] = objArrZze[i90];
                            } else {
                                i7 = i90;
                                i78 = 0;
                            }
                        } else if (i77 == 50) {
                            int i93 = i7 + 2;
                            int i94 = i65 + 1;
                            iArr[i65] = i68;
                            int i95 = i68 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArrZze[i90];
                            if (i78 != 0) {
                                objArr[i96 + 1] = objArrZze[i93];
                                i7 += 3;
                                i65 = i94;
                            } else {
                                i7 = i93;
                                i65 = i94;
                                i78 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                        if ((iCharAt11 & 4096) != 0 || i77 > 17) {
                            c2 = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i20 = 0;
                        } else {
                            int i97 = i18 + 1;
                            int iCharAt13 = strZzd.charAt(i18);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i22 = i97 + 1;
                                    cCharAt9 = strZzd.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i22;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i22 = i97;
                            }
                            int i100 = (iCharAt13 / 32) + i19 + i19;
                            Object obj3 = objArrZze[i100];
                            if (obj3 instanceof Field) {
                                fieldZzm = (Field) obj3;
                            } else {
                                fieldZzm = zzm(cls2, (String) obj3);
                                objArrZze[i100] = fieldZzm;
                            }
                            i20 = iCharAt13 % 32;
                            i18 = i22;
                            c2 = 55296;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzm);
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        i21 = i78;
                    } else {
                        i23 = 1;
                        i7 += 2;
                    }
                    int i101 = i68 / 3;
                    objArr[i101 + i101 + i23] = objArrZze[i90];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                    if ((iCharAt11 & 4096) != 0) {
                        c2 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i20 = 0;
                    } else {
                        c2 = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i20 = 0;
                    }
                    if (i77 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    i21 = i78;
                }
                i7 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzm4);
                if ((iCharAt11 & 4096) != 0) {
                    c2 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i20 = 0;
                } else {
                    c2 = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i20 = 0;
                }
                if (i77 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                i21 = i78;
            }
            int i102 = i68 + 1;
            iArr3[i68] = iCharAt10;
            int i103 = i68 + 2;
            iArr3[i102] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i21 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | iObjectFieldOffset;
            i68 += 3;
            iArr3[i103] = (i20 << 20) | iObjectFieldOffset2;
            i34 = i18;
            strZzd = strZzd;
            c3 = c2;
            zznwVar = zznwVar2;
            length = length;
            i8 = i19;
        }
        return new zznp(iArr3, objArr, i3, i5, zznwVar.zzb(), false, iArr, i6, i63, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            androidx.media3.extractor.text.ttml.a.C(sb, "Field ", str, " for ", name);
            throw new RuntimeException(android.support.v4.media.a.r(sb, " not found. Known fields are ", string), e2);
        }
    }

    private final void zzn(Object obj, Object obj2, int i2) {
        if (zzJ(obj2, i2)) {
            int iZzx = zzx(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = this.zzc[i2];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(Z.a(i3, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zznx zznxVarZzp = zzp(i2);
            if (!zzJ(obj, i2)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i2) {
        int[] iArr = this.zzc;
        int i3 = iArr[i2];
        if (zzL(obj2, i3, i2)) {
            int iZzx = zzx(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i4 = iArr[i2];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(Z.a(i4, 38) + string.length());
                sb.append("Source subfield ");
                sb.append(i4);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zznx zznxVarZzp = zzp(i2);
            if (!zzL(obj, i3, i2)) {
                if (zzA(object)) {
                    Object objZza = zznxVarZzp.zza();
                    zznxVarZzp.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object objZza2 = zznxVarZzp.zza();
                zznxVarZzp.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zznxVarZzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zznx zznxVar = (zznx) objArr[i4];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zznxVarZzb = zznu.zza().zzb((Class) objArr[i4 + 1]);
        objArr[i4] = zznxVarZzb;
        return zznxVarZzb;
    }

    private final Object zzq(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final zzmk zzr(int i2) {
        int i3 = i2 / 3;
        return (zzmk) this.zzd[i3 + i3 + 1];
    }

    private final Object zzs(Object obj, int i2) {
        zznx zznxVarZzp = zzp(i2);
        int iZzx = zzx(i2) & 1048575;
        if (!zzJ(obj, i2)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, iZzx);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzt(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzK(obj, i2);
    }

    private final Object zzu(Object obj, int i2, int i3) {
        zznx zznxVarZzp = zzp(i3);
        if (!zzL(obj, i2, i3)) {
            return zznxVarZzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i3) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object objZza = zznxVarZzp.zza();
        if (object != null) {
            zznxVarZzp.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzv(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzx(i3) & 1048575, obj2);
        zzM(obj, i2, i3);
    }

    private static boolean zzw(Object obj, int i2, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i2 & 1048575));
    }

    private final int zzx(int i2) {
        return this.zzc[i2 + 1];
    }

    private final int zzy(int i2) {
        return this.zzc[i2 + 2];
    }

    private static int zzz(int i2) {
        return (i2 >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzB;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzx = zzx(i2);
            long j = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (!zzH(obj, obj2, i2) || Double.doubleToLongBits(zzop.zzl(obj, j)) != Double.doubleToLongBits(zzop.zzl(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i2) || Float.floatToIntBits(zzop.zzj(obj, j)) != Float.floatToIntBits(zzop.zzj(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i2) || zzop.zzh(obj, j) != zzop.zzh(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i2) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i2) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i2) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i2) || zzop.zzd(obj, j) != zzop.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i2) || zzop.zzf(obj, j) != zzop.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i2) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case 50:
                    zZzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case AD_REWARD_USER_VALUE:
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                case 53:
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                case 56:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                case 58:
                case 59:
                case 60:
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case 62:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzy = zzy(i2) & 1048575;
                    if (zzop.zzd(obj, jZzy) != zzop.zzd(obj2, jZzy) || !zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i2;
        long jDoubleToLongBits;
        int i3;
        int iFloatToIntBits;
        int iZzd;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i5 >= iArr.length) {
                int iHashCode = ((zzmf) obj).zzc.hashCode() + (i6 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzx = zzx(i5);
            int i7 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i8 = iArr[i5];
            long j = i7;
            int iHashCode2 = 37;
            switch (iZzz) {
                case 0:
                    i2 = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j));
                    byte[] bArr = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 1:
                    i3 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j));
                    i6 = iFloatToIntBits + i3;
                    break;
                case 2:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr2 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 3:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr3 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 4:
                    i2 = i6 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 5:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr4 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 6:
                    i2 = i6 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 7:
                    i3 = i6 * 53;
                    iFloatToIntBits = zzmp.zzb(zzop.zzh(obj, j));
                    i6 = iFloatToIntBits + i3;
                    break;
                case 8:
                    i3 = i6 * 53;
                    iFloatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                    i6 = iFloatToIntBits + i3;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objZzn = zzop.zzn(obj, j);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i6 = i4 + iHashCode2;
                    break;
                case 10:
                    i3 = i6 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i6 = iFloatToIntBits + i3;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 14:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr5 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 15:
                    i2 = i6 * 53;
                    iZzd = zzop.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 16:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr6 = zzmp.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objZzn2 = zzop.zzn(obj, j);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i6 = i4 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i6 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i6 = iFloatToIntBits + i3;
                    break;
                case 50:
                    i3 = i6 * 53;
                    iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                    i6 = iFloatToIntBits + i3;
                    break;
                case AD_REWARD_USER_VALUE:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (zzL(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzD(obj, j));
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case 53:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzE(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 56:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzE(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 58:
                    if (zzL(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = zzmp.zzb(zzG(obj, j));
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case 59:
                    if (zzL(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case 60:
                    if (zzL(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzL(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case 62:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzE(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzE(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 64:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzE(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 65:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case 66:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzE(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 67:
                    if (zzL(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzF(obj, j);
                        byte[] bArr12 = zzmp.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case 68:
                    if (zzL(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = zzop.zzn(obj, j).hashCode();
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i2 >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int iZzx = zzx(i2);
            int i3 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i4 = iArr[i2];
            long j = i3;
            switch (iZzz) {
                case 0:
                    if (zzJ(obj2, i2)) {
                        zzop.zzm(obj, j, zzop.zzl(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 1:
                    if (zzJ(obj2, i2)) {
                        zzop.zzk(obj, j, zzop.zzj(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 2:
                    if (zzJ(obj2, i2)) {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 3:
                    if (zzJ(obj2, i2)) {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 4:
                    if (zzJ(obj2, i2)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 5:
                    if (zzJ(obj2, i2)) {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 6:
                    if (zzJ(obj2, i2)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 7:
                    if (zzJ(obj2, i2)) {
                        zzop.zzi(obj, j, zzop.zzh(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 8:
                    if (zzJ(obj2, i2)) {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 9:
                    zzn(obj, obj2, i2);
                    break;
                case 10:
                    if (zzJ(obj2, i2)) {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 11:
                    if (zzJ(obj2, i2)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 12:
                    if (zzJ(obj2, i2)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 13:
                    if (zzJ(obj2, i2)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 14:
                    if (zzJ(obj2, i2)) {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 15:
                    if (zzJ(obj2, i2)) {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 16:
                    if (zzJ(obj2, i2)) {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i2);
                    }
                    break;
                case 17:
                    zzn(obj, obj2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzmo zzmoVarZzg = (zzmo) zzop.zzn(obj, j);
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj2, j);
                    int size = zzmoVarZzg.size();
                    int size2 = zzmoVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVarZzg.zza()) {
                            zzmoVarZzg = zzmoVarZzg.zzg(size2 + size);
                        }
                        zzmoVarZzg.addAll(zzmoVar);
                    }
                    if (size > 0) {
                        zzmoVar = zzmoVarZzg;
                    }
                    zzop.zzo(obj, j, zzmoVar);
                    break;
                case 50:
                    int i5 = zznz.zza;
                    zzop.zzo(obj, j, zznh.zza(zzop.zzn(obj, j), zzop.zzn(obj2, j)));
                    break;
                case AD_REWARD_USER_VALUE:
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                case 53:
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                case 56:
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                case 58:
                case 59:
                    if (zzL(obj2, i4, i2)) {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i4, i2);
                    }
                    break;
                case 60:
                    zzo(obj, obj2, i2);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case 62:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzL(obj2, i4, i2)) {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i4, i2);
                    }
                    break;
                case 68:
                    zzo(obj, obj2, i2);
                    break;
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:196:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i2;
        int iZzz;
        int iZzA;
        int iZzz2;
        int iZzc;
        int iZzz3;
        int iZzz4;
        int iZzG;
        int iZzz5;
        int size;
        int iZzp;
        int iZzz6;
        int iZzz7;
        int iZzz8;
        int iZzx;
        int iZzz9;
        int iZzz10;
        int iZzG2;
        int iZzz11;
        int iZzA2;
        zznp<T> zznpVar = this;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iB = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = zznpVar.zzc;
            if (i4 >= iArr.length) {
                int iZzi = ((zzmf) obj).zzc.zzi() + iB;
                if (!zznpVar.zzh) {
                    return iZzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int iZzc2 = zzoeVar.zzc();
                int iZzj = 0;
                for (int i7 = 0; i7 < iZzc2; i7++) {
                    Map.Entry entryZzd = zzoeVar.zzd(i7);
                    iZzj += zzlw.zzj((zzlv) ((zzob) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    iZzj += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzx2 = zznpVar.zzx(i4);
            int iZzz12 = zzz(iZzx2);
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & i3;
            if (iZzz12 <= 17) {
                if (i10 != i6) {
                    i5 = i10 == i3 ? 0 : unsafe.getInt(obj, i10);
                    i6 = i10;
                }
                i2 = 1 << (i9 >>> 20);
            } else {
                i2 = 0;
            }
            int i11 = iZzx2 & i3;
            if (iZzz12 >= zzlx.zzJ.zza()) {
                zzlx.zzW.zza();
            }
            long j = i11;
            switch (iZzz12) {
                case 0:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iB = Z.B(i8 << 3, 8, iB);
                    }
                    break;
                case 1:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iB = Z.B(i8 << 3, 4, iB);
                    }
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzz = zzlm.zzz(i8 << 3);
                        iZzA = zzlm.zzA(j2);
                        iB += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzz = zzlm.zzz(i8 << 3);
                        iZzA = zzlm.zzA(j3);
                        iB += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzz = zzlm.zzz(i8 << 3);
                        iZzA = zzlm.zzA(j4);
                        iB += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iB = Z.B(i8 << 3, 8, iB);
                    }
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iB = Z.B(i8 << 3, 4, iB);
                    }
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iB = Z.B(i8 << 3, 1, iB);
                    }
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzlh) {
                            iZzz2 = zzlm.zzz(i12);
                            iZzc = ((zzlh) object).zzc();
                            iZzz3 = zzlm.zzz(iZzc);
                            iB += iZzz3 + iZzc + iZzz2;
                        } else {
                            iZzz = zzlm.zzz(i12);
                            iZzA = zzlm.zzB((String) object);
                            iB += iZzA + iZzz;
                        }
                    }
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iZzz4 = zznz.zzz(i8, unsafe.getObject(obj, j), zznpVar.zzp(i4));
                        iB += iZzz4;
                    }
                    break;
                case 10:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj, j);
                        iZzz2 = zzlm.zzz(i8 << 3);
                        iZzc = zzlhVar.zzc();
                        iZzz3 = zzlm.zzz(iZzc);
                        iB += iZzz3 + iZzc + iZzz2;
                    }
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iB = Z.B(unsafe.getInt(obj, j), zzlm.zzz(i8 << 3), iB);
                    }
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzz = zzlm.zzz(i8 << 3);
                        iZzA = zzlm.zzA(j5);
                        iB += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iB = Z.B(i8 << 3, 4, iB);
                    }
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iB = Z.B(i8 << 3, 8, iB);
                    }
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        int i13 = unsafe.getInt(obj, j);
                        iB = Z.B((i13 >> 31) ^ (i13 + i13), zzlm.zzz(i8 << 3), iB);
                    }
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzz = zzlm.zzz(i8 << 3);
                        iZzA = zzlm.zzA((j6 >> 63) ^ (j6 + j6));
                        iB += iZzA + iZzz;
                    }
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj, i4, i6, i5, i2)) {
                        iZzG = zzlm.zzG(i8, (zznm) unsafe.getObject(obj, j), zznpVar.zzp(i4));
                        iB += iZzG;
                    }
                    break;
                case 18:
                    iZzz4 = zznz.zzy(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzz4;
                    break;
                case 19:
                    iZzz4 = zznz.zzw(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzz4;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zznz.zza;
                    if (list.size() == 0) {
                        iZzz5 = 0;
                    } else {
                        iZzz5 = (zzlm.zzz(i8 << 3) * list.size()) + zznz.zzo(list);
                    }
                    iB += iZzz5;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zznz.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzp(list2);
                        iZzz6 = zzlm.zzz(i8 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iB += iZzz7;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zznz.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzs(list3);
                        iZzz6 = zzlm.zzz(i8 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iB += iZzz7;
                    break;
                case 23:
                    iZzz4 = zznz.zzy(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzz4;
                    break;
                case 24:
                    iZzz4 = zznz.zzw(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzz4;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzz5 = 0;
                    } else {
                        iZzz5 = (zzlm.zzz(i8 << 3) + 1) * size2;
                    }
                    iB += iZzz5;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i18 = zznz.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = zzlm.zzz(i8 << 3) * size3;
                        if (list5 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objZzc = zzmxVar.zzc();
                                if (objZzc instanceof zzlh) {
                                    int iZzc3 = ((zzlh) objZzc).zzc();
                                    iZzz7 = Z.B(iZzc3, iZzc3, iZzz7);
                                } else {
                                    iZzz7 = zzlm.zzB((String) objZzc) + iZzz7;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj2 = list5.get(i20);
                                if (obj2 instanceof zzlh) {
                                    int iZzc4 = ((zzlh) obj2).zzc();
                                    iZzz7 = Z.B(iZzc4, iZzc4, iZzz7);
                                } else {
                                    iZzz7 = zzlm.zzB((String) obj2) + iZzz7;
                                }
                            }
                        }
                    }
                    iB += iZzz7;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zznx zznxVarZzp = zznpVar.zzp(i4);
                    int i21 = zznz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzz8 = 0;
                    } else {
                        iZzz8 = zzlm.zzz(i8 << 3) * size4;
                        for (int i22 = 0; i22 < size4; i22++) {
                            Object obj3 = list6.get(i22);
                            if (obj3 instanceof zzmw) {
                                int iZzb = ((zzmw) obj3).zzb();
                                iZzz8 = Z.B(iZzb, iZzb, iZzz8);
                            } else {
                                iZzz8 = zzlm.zzD((zznm) obj3, zznxVarZzp) + iZzz8;
                            }
                        }
                    }
                    iB += iZzz8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zznz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = zzlm.zzz(i8 << 3) * size5;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int iZzc5 = ((zzlh) list7.get(i24)).zzc();
                            iZzz7 = Z.B(iZzc5, iZzc5, iZzz7);
                        }
                    }
                    iB += iZzz7;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i25 = zznz.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzt(list8);
                        iZzz6 = zzlm.zzz(i8 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iB += iZzz7;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i26 = zznz.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzr(list9);
                        iZzz6 = zzlm.zzz(i8 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iB += iZzz7;
                    break;
                case 31:
                    iZzz4 = zznz.zzw(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzz4;
                    break;
                case 32:
                    iZzz4 = zznz.zzy(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzz4;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i27 = zznz.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzu(list10);
                        iZzz6 = zzlm.zzz(i8 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iB += iZzz7;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i28 = zznz.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzz7 = 0;
                    } else {
                        iZzp = zznz.zzq(list11);
                        iZzz6 = zzlm.zzz(i8 << 3);
                        iZzz7 = (iZzz6 * size) + iZzp;
                    }
                    iB += iZzz7;
                    break;
                case 35:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 36:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 37:
                    iZzx = zznz.zzo((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 38:
                    iZzx = zznz.zzp((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 39:
                    iZzx = zznz.zzs((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 40:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 41:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i29 = zznz.zza;
                    iZzx = list12.size();
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 43:
                    iZzx = zznz.zzt((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 44:
                    iZzx = zznz.zzr((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 45:
                    iZzx = zznz.zzv((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 46:
                    iZzx = zznz.zzx((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 47:
                    iZzx = zznz.zzu((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 48:
                    iZzx = zznz.zzq((List) unsafe.getObject(obj, j));
                    if (iZzx > 0) {
                        iZzz9 = zzlm.zzz(i8 << 3);
                        iZzz10 = zzlm.zzz(iZzx);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zznx zznxVarZzp2 = zznpVar.zzp(i4);
                    int i30 = zznz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzG2 = 0;
                    } else {
                        iZzG2 = 0;
                        for (int i31 = 0; i31 < size6; i31++) {
                            iZzG2 += zzlm.zzG(i8, (zznm) list13.get(i31), zznxVarZzp2);
                        }
                    }
                    iB += iZzG2;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj, j);
                    zznf zznfVar = (zznf) zznpVar.zzq(i4);
                    if (zzngVar.isEmpty()) {
                        iZzz7 = 0;
                    } else {
                        iZzz7 = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            iZzz7 += zznfVar.zzd(i8, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iB += iZzz7;
                    break;
                case AD_REWARD_USER_VALUE:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iB = Z.B(i8 << 3, 8, iB);
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iB = Z.B(i8 << 3, 4, iB);
                    }
                    break;
                case 53:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        long jZzF = zzF(obj, j);
                        iZzz11 = zzlm.zzz(i8 << 3);
                        iZzA2 = zzlm.zzA(jZzF);
                        iB += iZzA2 + iZzz11;
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        long jZzF2 = zzF(obj, j);
                        iZzz11 = zzlm.zzz(i8 << 3);
                        iZzA2 = zzlm.zzA(jZzF2);
                        iB += iZzA2 + iZzz11;
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        long jZzE = zzE(obj, j);
                        iZzz11 = zzlm.zzz(i8 << 3);
                        iZzA2 = zzlm.zzA(jZzE);
                        iB += iZzA2 + iZzz11;
                    }
                    break;
                case 56:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iB = Z.B(i8 << 3, 8, iB);
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iB = Z.B(i8 << 3, 4, iB);
                    }
                    break;
                case 58:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iB = Z.B(i8 << 3, 1, iB);
                    }
                    break;
                case 59:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        int i32 = i8 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzlh) {
                            iZzx = zzlm.zzz(i32);
                            iZzz9 = ((zzlh) object2).zzc();
                            iZzz10 = zzlm.zzz(iZzz9);
                            iB += iZzz10 + iZzz9 + iZzx;
                        } else {
                            iZzz11 = zzlm.zzz(i32);
                            iZzA2 = zzlm.zzB((String) object2);
                            iB += iZzA2 + iZzz11;
                        }
                    }
                    break;
                case 60:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iZzz4 = zznz.zzz(i8, unsafe.getObject(obj, j), zznpVar.zzp(i4));
                        iB += iZzz4;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj, j);
                        iZzx = zzlm.zzz(i8 << 3);
                        iZzz9 = zzlhVar2.zzc();
                        iZzz10 = zzlm.zzz(iZzz9);
                        iB += iZzz10 + iZzz9 + iZzx;
                    }
                    break;
                case 62:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iB = Z.B(zzE(obj, j), zzlm.zzz(i8 << 3), iB);
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        long jZzE2 = zzE(obj, j);
                        iZzz11 = zzlm.zzz(i8 << 3);
                        iZzA2 = zzlm.zzA(jZzE2);
                        iB += iZzA2 + iZzz11;
                    }
                    break;
                case 64:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iB = Z.B(i8 << 3, 4, iB);
                    }
                    break;
                case 65:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iB = Z.B(i8 << 3, 8, iB);
                    }
                    break;
                case 66:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        int iZzE = zzE(obj, j);
                        iB = Z.B((iZzE >> 31) ^ (iZzE + iZzE), zzlm.zzz(i8 << 3), iB);
                    }
                    break;
                case 67:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        long jZzF3 = zzF(obj, j);
                        iZzz11 = zzlm.zzz(i8 << 3);
                        iZzA2 = zzlm.zzA((jZzF3 >> 63) ^ (jZzF3 + jZzF3));
                        iB += iZzA2 + iZzz11;
                    }
                    break;
                case 68:
                    if (zznpVar.zzL(obj, i8, i4)) {
                        iZzG = zzlm.zzG(i8, (zznm) unsafe.getObject(obj, j), zznpVar.zzp(i4));
                        iB += iZzG;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzf(Object obj, zzov zzovVar) throws IOException {
        Map.Entry entry;
        int i2;
        zznp<T> zznpVar = this;
        if (zznpVar.zzh) {
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (zzlwVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzlwVar.zzc().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zznpVar.zzc;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < iArr.length) {
            int iZzx = zznpVar.zzx(i5);
            int iZzz = zzz(iZzx);
            int i7 = iArr[i5];
            if (iZzz <= 17) {
                int i8 = iArr[i5 + 2];
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                i2 = 1 << (i8 >>> 20);
            } else {
                i2 = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iZzx & i3;
            switch (iZzz) {
                case 0:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzf(i7, zzop.zzl(obj, j));
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 1:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zze(i7, zzop.zzj(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzc(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzh(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzi(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzj(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzk(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzl(i7, zzop.zzh(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzP(i7, unsafe.getObject(obj, j), zzovVar);
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzr(i7, unsafe.getObject(obj, j), zznpVar.zzp(i5));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 10:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzn(i7, (zzlh) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzo(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzg(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzb(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzd(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzp(i7, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzq(i7, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj, i5, i4, i6, i2)) {
                        zzovVar.zzs(i7, unsafe.getObject(obj, j), zznpVar.zzp(i5));
                    } else {
                        continue;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 18:
                    zznz.zza(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 19:
                    zznz.zzb(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 20:
                    zznz.zzc(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 21:
                    zznz.zzd(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 22:
                    zznz.zzh(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 23:
                    zznz.zzf(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 24:
                    zznz.zzk(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 25:
                    zznz.zzn(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 26:
                    int i10 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    int i11 = zznz.zza;
                    if (list != null && !list.isEmpty()) {
                        zzovVar.zzF(i10, list);
                    }
                    break;
                case 27:
                    int i12 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zznx zznxVarZzp = zznpVar.zzp(i5);
                    int i13 = zznz.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i14 = 0; i14 < list2.size(); i14++) {
                            ((zzln) zzovVar).zzr(i12, list2.get(i14), zznxVarZzp);
                        }
                    }
                    break;
                case 28:
                    int i15 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zznz.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzovVar.zzG(i15, list3);
                    }
                    break;
                case 29:
                    zznz.zzi(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 30:
                    zznz.zzm(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 31:
                    zznz.zzl(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 32:
                    zznz.zzg(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 33:
                    zznz.zzj(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 34:
                    zznz.zze(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, false);
                    continue;
                    i5 += 3;
                    i3 = 1048575;
                    zznpVar = this;
                    break;
                case 35:
                    zznz.zza(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 36:
                    zznz.zzb(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 37:
                    zznz.zzc(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 38:
                    zznz.zzd(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 39:
                    zznz.zzh(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 40:
                    zznz.zzf(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 41:
                    zznz.zzk(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 42:
                    zznz.zzn(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 43:
                    zznz.zzi(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 44:
                    zznz.zzm(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 45:
                    zznz.zzl(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 46:
                    zznz.zzg(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 47:
                    zznz.zzj(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 48:
                    zznz.zze(iArr[i5], (List) unsafe.getObject(obj, j), zzovVar, true);
                    break;
                case 49:
                    int i17 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zznx zznxVarZzp2 = zznpVar.zzp(i5);
                    int i18 = zznz.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            ((zzln) zzovVar).zzs(i17, list4.get(i19), zznxVarZzp2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        zzovVar.zzM(i7, ((zznf) zznpVar.zzq(i5)).zze(), (zzng) object);
                    }
                    break;
                case AD_REWARD_USER_VALUE:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzf(i7, zzC(obj, j));
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zze(i7, zzD(obj, j));
                    }
                    break;
                case 53:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzc(i7, zzF(obj, j));
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzh(i7, zzF(obj, j));
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzi(i7, zzE(obj, j));
                    }
                    break;
                case 56:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzj(i7, zzF(obj, j));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzk(i7, zzE(obj, j));
                    }
                    break;
                case 58:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzl(i7, zzG(obj, j));
                    }
                    break;
                case 59:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzP(i7, unsafe.getObject(obj, j), zzovVar);
                    }
                    break;
                case 60:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzr(i7, unsafe.getObject(obj, j), zznpVar.zzp(i5));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzn(i7, (zzlh) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzo(i7, zzE(obj, j));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzg(i7, zzE(obj, j));
                    }
                    break;
                case 64:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzb(i7, zzE(obj, j));
                    }
                    break;
                case 65:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzd(i7, zzF(obj, j));
                    }
                    break;
                case 66:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzp(i7, zzE(obj, j));
                    }
                    break;
                case 67:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzq(i7, zzF(obj, j));
                    }
                    break;
                case 68:
                    if (zznpVar.zzL(obj, i7, i5)) {
                        zzovVar.zzs(i7, unsafe.getObject(obj, j), zznpVar.zzp(i5));
                    }
                    break;
            }
            i5 += 3;
            i3 = 1048575;
            zznpVar = this;
        }
        if (entry != null) {
            throw null;
        }
        ((zzmf) obj).zzc.zzg(zzovVar);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 43101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzh(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.measurement.zzkw r40) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i2, int i3, zzkw zzkwVar) throws IOException {
        zzh(obj, bArr, i2, i3, 0, zzkwVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        if (zzA(obj)) {
            if (obj instanceof zzmf) {
                zzmf zzmfVar = (zzmf) obj;
                zzmfVar.zzcm(Integer.MAX_VALUE);
                zzmfVar.zza = 0;
                zzmfVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i2 = 0; i2 < iArr.length; i2 += 3) {
                int iZzx = zzx(i2);
                int i3 = 1048575 & iZzx;
                int iZzz = zzz(iZzx);
                long j = i3;
                if (iZzz != 9) {
                    if (iZzz != 60 && iZzz != 68) {
                        switch (iZzz) {
                            case 17:
                                if (zzJ(obj, i2)) {
                                    zzp(i2).zzj(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzmo) zzop.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzng) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzL(obj, iArr[i2], i2)) {
                        zzp(i2).zzj(zzb.getObject(obj, j));
                    }
                } else if (zzJ(obj, i2)) {
                    zzp(i2).zzj(zzb.getObject(obj, j));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzk(Object obj) {
        int i2;
        int i3;
        List list;
        zznx zznxVarZzp;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i8 = iArr[i6];
            int i9 = iArr2[i8];
            int iZzx = zzx(i8);
            int i10 = iArr2[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i7) {
                if (i11 != 1048575) {
                    i5 = zzb.getInt(obj, i11);
                }
                i3 = i5;
                i2 = i11;
            } else {
                int i13 = i5;
                i2 = i7;
                i3 = i13;
            }
            if ((268435456 & iZzx) != 0 && !zzI(obj, i8, i2, i3, i12)) {
                return false;
            }
            int iZzz = zzz(iZzx);
            if (iZzz == 9 || iZzz == 17) {
                if (zzI(obj, i8, i2, i3, i12) && !zzw(obj, iZzx, zzp(i8))) {
                    return false;
                }
            } else if (iZzz == 27) {
                list = (List) zzop.zzn(obj, iZzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznxVarZzp = zzp(i8);
                    for (i4 = 0; i4 < list.size(); i4++) {
                        if (!zznxVarZzp.zzk(list.get(i4))) {
                            return false;
                        }
                    }
                }
            } else if (iZzz == 60 || iZzz == 68) {
                if (zzL(obj, i9, i8) && !zzw(obj, iZzx, zzp(i8))) {
                    return false;
                }
            } else if (iZzz == 49) {
                list = (List) zzop.zzn(obj, iZzx & 1048575);
                if (list.isEmpty()) {
                    zznxVarZzp = zzp(i8);
                    while (i4 < list.size()) {
                        if (!zznxVarZzp.zzk(list.get(i4))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzz != 50) {
                continue;
            } else {
                zzng zzngVar = (zzng) zzop.zzn(obj, iZzx & 1048575);
                if (!zzngVar.isEmpty() && ((zznf) zzq(i8)).zze().zzc.zza() == zzou.MESSAGE) {
                    zznx zznxVarZzb = null;
                    for (Object obj2 : zzngVar.values()) {
                        if (zznxVarZzb == null) {
                            zznxVarZzb = zznu.zza().zzb(obj2.getClass());
                        }
                        if (!zznxVarZzb.zzk(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i6++;
            i7 = i2;
            i5 = i3;
        }
        return !this.zzh || ((zzmc) obj).zzb.zze();
    }
}
