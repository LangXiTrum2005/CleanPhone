package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class zzicf<T> implements zzicu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzidm.zzt();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzicc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzidf zzm;
    private final zziac zzn;

    private zzicf(int[] iArr, Object[] objArr, int i2, int i3, zzicc zziccVar, boolean z2, int[] iArr2, int i4, int i5, zzici zziciVar, zzibo zziboVar, zzidf zzidfVar, zziac zziacVar, zzibx zzibxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zziccVar instanceof zziar;
        boolean z3 = false;
        if (zziacVar != null && (zziccVar instanceof zzian)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzm = zzidfVar;
        this.zzn = zziacVar;
        this.zzg = zziccVar;
    }

    private final int zzA(int i2) {
        return this.zzc[i2 + 1];
    }

    private final int zzB(int i2) {
        return this.zzc[i2 + 2];
    }

    private static int zzC(int i2) {
        return (i2 >>> 20) & 255;
    }

    private static boolean zzD(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zziar) {
            return ((zziar) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (!zzE(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzG(Object obj, long j) {
        return ((Double) zzidm.zzn(obj, j)).doubleValue();
    }

    private static float zzH(Object obj, long j) {
        return ((Float) zzidm.zzn(obj, j)).floatValue();
    }

    private static int zzI(Object obj, long j) {
        return ((Integer) zzidm.zzn(obj, j)).intValue();
    }

    private static long zzJ(Object obj, long j) {
        return ((Long) zzidm.zzn(obj, j)).longValue();
    }

    private static boolean zzK(Object obj, long j) {
        return ((Boolean) zzidm.zzn(obj, j)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i2) {
        return zzN(obj, i2) == zzN(obj2, i2);
    }

    private final boolean zzM(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return zzN(obj, i2);
        }
        return (i4 & i5) != 0;
    }

    private final boolean zzN(Object obj, int i2) {
        int iZzB = zzB(i2);
        long j = iZzB & 1048575;
        if (j != 1048575) {
            return (zzidm.zzd(obj, j) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i2);
        long j2 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzidm.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzidm.zzj(obj, j2)) != 0;
            case 2:
                return zzidm.zzf(obj, j2) != 0;
            case 3:
                return zzidm.zzf(obj, j2) != 0;
            case 4:
                return zzidm.zzd(obj, j2) != 0;
            case 5:
                return zzidm.zzf(obj, j2) != 0;
            case 6:
                return zzidm.zzd(obj, j2) != 0;
            case 7:
                return zzidm.zzh(obj, j2);
            case 8:
                Object objZzn = zzidm.zzn(obj, j2);
                if (objZzn instanceof String) {
                    return !((String) objZzn).isEmpty();
                }
                if (objZzn instanceof zzhzl) {
                    return !zzhzl.zzb.equals(objZzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzidm.zzn(obj, j2) != null;
            case 10:
                return !zzhzl.zzb.equals(zzidm.zzn(obj, j2));
            case 11:
                return zzidm.zzd(obj, j2) != 0;
            case 12:
                return zzidm.zzd(obj, j2) != 0;
            case 13:
                return zzidm.zzd(obj, j2) != 0;
            case 14:
                return zzidm.zzf(obj, j2) != 0;
            case 15:
                return zzidm.zzd(obj, j2) != 0;
            case 16:
                return zzidm.zzf(obj, j2) != 0;
            case 17:
                return zzidm.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i2) {
        int iZzB = zzB(i2);
        long j = 1048575 & iZzB;
        if (j == 1048575) {
            return;
        }
        zzidm.zze(obj, j, (1 << (iZzB >>> 20)) | zzidm.zzd(obj, j));
    }

    private final boolean zzP(Object obj, int i2, int i3) {
        return zzidm.zzd(obj, (long) (zzB(i3) & 1048575)) == i2;
    }

    private final void zzQ(Object obj, int i2, int i3) {
        zzidm.zze(obj, zzB(i3) & 1048575, i2);
    }

    private final int zzR(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzS(i2, 0);
    }

    private final int zzS(int i2, int i3) {
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

    private static final int zzT(byte[] bArr, int i2, int i3, zzids zzidsVar, Class cls, zzhyz zzhyzVar) throws IOException {
        zzids zzidsVar2 = zzids.zza;
        switch (zzidsVar.ordinal()) {
            case 0:
                int i4 = i2 + 8;
                zzhyzVar.zzc = Double.valueOf(Double.longBitsToDouble(zzhza.zze(bArr, i2)));
                return i4;
            case 1:
                int i5 = i2 + 4;
                zzhyzVar.zzc = Float.valueOf(Float.intBitsToFloat(zzhza.zzd(bArr, i2)));
                return i5;
            case 2:
            case 3:
                int iZzc = zzhza.zzc(bArr, i2, zzhyzVar);
                zzhyzVar.zzc = Long.valueOf(zzhyzVar.zzb);
                return iZzc;
            case 4:
            case 12:
            case 13:
                int iZza = zzhza.zza(bArr, i2, zzhyzVar);
                zzhyzVar.zzc = Integer.valueOf(zzhyzVar.zza);
                return iZza;
            case 5:
            case 15:
                int i6 = i2 + 8;
                zzhyzVar.zzc = Long.valueOf(zzhza.zze(bArr, i2));
                return i6;
            case 6:
            case 14:
                int i7 = i2 + 4;
                zzhyzVar.zzc = Integer.valueOf(zzhza.zzd(bArr, i2));
                return i7;
            case 7:
                int iZzc2 = zzhza.zzc(bArr, i2, zzhyzVar);
                zzhyzVar.zzc = Boolean.valueOf(zzhyzVar.zzb != 0);
                return iZzc2;
            case 8:
                return zzhza.zzf(bArr, i2, zzhyzVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzhza.zzh(zzicm.zza().zzb(cls), bArr, i2, i3, zzhyzVar);
            case 11:
                return zzhza.zzg(bArr, i2, zzhyzVar);
            case 16:
                int iZza2 = zzhza.zza(bArr, i2, zzhyzVar);
                zzhyzVar.zzc = Integer.valueOf(zzhzq.zzK(zzhyzVar.zza));
                return iZza2;
            case 17:
                int iZzc3 = zzhza.zzc(bArr, i2, zzhyzVar);
                zzhyzVar.zzc = Long.valueOf(zzhzq.zzL(zzhyzVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzU(int i2, Object obj, zzidu zziduVar) throws IOException {
        if (obj instanceof String) {
            zziduVar.zzm(i2, (String) obj);
        } else {
            zziduVar.zzn(i2, (zzhzl) obj);
        }
    }

    public static zzidg zzh(Object obj) {
        zziar zziarVar = (zziar) obj;
        zzidg zzidgVar = zziarVar.zzt;
        if (zzidgVar != zzidg.zza()) {
            return zzidgVar;
        }
        zzidg zzidgVarZzb = zzidg.zzb();
        zziarVar.zzt = zzidgVarZzb;
        return zzidgVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:190:0x03ad  */
    public static zzicf zzm(Class cls, zzibz zzibzVar, zzici zziciVar, zzibo zziboVar, zzidf zzidfVar, zziac zziacVar, zzibx zzibxVar) {
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
        Field fieldZzn;
        char cCharAt9;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field fieldZzn2;
        int i28;
        Object obj2;
        Field fieldZzn3;
        int i29;
        char cCharAt10;
        int i30;
        char cCharAt11;
        int i31;
        char cCharAt12;
        int i32;
        char cCharAt13;
        if (!(zzibzVar instanceof zzico)) {
            throw null;
        }
        zzico zzicoVar = (zzico) zzibzVar;
        String strZzd = zzicoVar.zzd();
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
        Object[] objArrZze = zzicoVar.zze();
        Class<?> cls2 = zzicoVar.zzb().getClass();
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
            zzico zzicoVar2 = zzicoVar;
            int i78 = iCharAt11 & com.p004ironsource.mediationsdk.metadata.a.f25965n;
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
                    } else if (zzicoVar2.zzc() == 1 || i78 != 0) {
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
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls2, (String) obj);
                        objArrZze[i27] = fieldZzn2;
                    }
                    int i88 = i8;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i28 = i27 + 1;
                    obj2 = objArrZze[i28];
                    i19 = i88;
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls2, (String) obj2);
                        objArrZze[i28] = fieldZzn3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
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
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls2, (String) obj);
                    objArrZze[i27] = fieldZzn2;
                }
                int i810 = i8;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn2);
                i28 = i27 + 1;
                obj2 = objArrZze[i28];
                i19 = i810;
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls2, (String) obj2);
                    objArrZze[i28] = fieldZzn3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                strZzd = strZzd;
                i21 = i89;
                i18 = i83;
                i20 = 0;
                c2 = 55296;
            } else {
                i19 = i8;
                int i90 = i7 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i7]);
                if (i77 == 9 || i77 == 17) {
                    int i91 = i68 / 3;
                    objArr[i91 + i91 + 1] = fieldZzn4.getType();
                } else {
                    if (i77 != 27) {
                        if (i77 == 49) {
                            i7 += 2;
                            i23 = 1;
                        } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                            if (zzicoVar2.zzc() == 1 || i78 != 0) {
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
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
                                fieldZzn = (Field) obj3;
                            } else {
                                fieldZzn = zzn(cls2, (String) obj3);
                                objArrZze[i100] = fieldZzn;
                            }
                            i20 = iCharAt13 % 32;
                            i18 = i22;
                            c2 = 55296;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
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
            zzicoVar = zzicoVar2;
            length = length;
            i8 = i19;
        }
        return new zzicf(iArr3, objArr, i3, i5, zzicoVar.zzb(), false, iArr, i6, i63, zziciVar, zziboVar, zzidfVar, zziacVar, zzibxVar);
    }

    private static Field zzn(Class cls, String str) {
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

    private final void zzo(Object obj, Object obj2, int i2) {
        if (zzN(obj2, i2)) {
            int iZzA = zzA(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
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
            zzicu zzicuVarZzq = zzq(i2);
            if (!zzN(obj, i2)) {
                if (zzE(object)) {
                    Object objZza = zzicuVarZzq.zza();
                    zzicuVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zzicuVarZzq.zza();
                zzicuVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zzicuVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i2) {
        int[] iArr = this.zzc;
        int i3 = iArr[i2];
        if (zzP(obj2, i3, i2)) {
            int iZzA = zzA(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
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
            zzicu zzicuVarZzq = zzq(i2);
            if (!zzP(obj, i3, i2)) {
                if (zzE(object)) {
                    Object objZza = zzicuVarZzq.zza();
                    zzicuVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzQ(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zzicuVarZzq.zza();
                zzicuVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zzicuVarZzq.zzd(object2, object);
        }
    }

    private final zzicu zzq(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzicu zzicuVar = (zzicu) objArr[i4];
        if (zzicuVar != null) {
            return zzicuVar;
        }
        zzicu zzicuVarZzb = zzicm.zza().zzb((Class) objArr[i4 + 1]);
        objArr[i4] = zzicuVarZzb;
        return zzicuVarZzb;
    }

    private final Object zzr(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final zziax zzs(int i2) {
        int i3 = i2 / 3;
        return (zziax) this.zzd[i3 + i3 + 1];
    }

    private final Object zzt(Object obj, int i2) {
        zzicu zzicuVarZzq = zzq(i2);
        int iZzA = zzA(i2) & 1048575;
        if (!zzN(obj, i2)) {
            return zzicuVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzicuVarZzq.zza();
        if (object != null) {
            zzicuVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzO(obj, i2);
    }

    private final Object zzv(Object obj, int i2, int i3) {
        zzicu zzicuVarZzq = zzq(i3);
        if (!zzP(obj, i2, i3)) {
            return zzicuVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i3) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzicuVarZzq.zza();
        if (object != null) {
            zzicuVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzA(i3) & 1048575, obj2);
        zzQ(obj, i2, i3);
    }

    private final Object zzx(Object obj, int i2, Object obj2, zzidf zzidfVar, Object obj3) {
        zziax zziaxVarZzs;
        int i3 = this.zzc[i2];
        Object objZzn = zzidm.zzn(obj, zzA(i2) & 1048575);
        if (objZzn == null || (zziaxVarZzs = zzs(i2)) == null) {
            return obj2;
        }
        zzibu zzibuVarZze = ((zzibv) zzr(i2)).zze();
        Iterator it = ((zzibw) objZzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zziaxVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzidfVar.zzh(obj3);
                }
                int iZzc = zzibv.zzc(zzibuVarZze, entry.getKey(), entry.getValue());
                zzhzl zzhzlVar = zzhzl.zzb;
                byte[] bArr = new byte[iZzc];
                int i4 = zzhzw.zzf;
                zzhzt zzhztVar = new zzhzt(bArr, 0, iZzc);
                try {
                    zzibv.zzb(zzhztVar, zzibuVarZze, entry.getKey(), entry.getValue());
                    zzidfVar.zzd(obj2, i3, zzhzh.zza(zzhztVar, bArr));
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i2, zzicu zzicuVar) {
        return zzicuVar.zzl(zzidm.zzn(obj, i2 & 1048575));
    }

    private final void zzz(Object obj, int i2, zzicp zzicpVar) throws IOException {
        long j = i2 & 1048575;
        if (zzD(i2)) {
            zzidm.zzo(obj, j, zzicpVar.zzn());
        } else if (this.zzi) {
            zzidm.zzo(obj, j, zzicpVar.zzm());
        } else {
            zzidm.zzo(obj, j, zzicpVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final Object zza() {
        return ((zziar) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzG;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzA = zzA(i2);
            long j = iZzA & 1048575;
            switch (zzC(iZzA)) {
                case 0:
                    if (!zzL(obj, obj2, i2) || Double.doubleToLongBits(zzidm.zzl(obj, j)) != Double.doubleToLongBits(zzidm.zzl(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i2) || Float.floatToIntBits(zzidm.zzj(obj, j)) != Float.floatToIntBits(zzidm.zzj(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i2) || zzidm.zzf(obj, j) != zzidm.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i2) || zzidm.zzf(obj, j) != zzidm.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i2) || zzidm.zzd(obj, j) != zzidm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i2) || zzidm.zzf(obj, j) != zzidm.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i2) || zzidm.zzd(obj, j) != zzidm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i2) || zzidm.zzh(obj, j) != zzidm.zzh(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i2) || !zzicw.zzG(zzidm.zzn(obj, j), zzidm.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i2) || !zzicw.zzG(zzidm.zzn(obj, j), zzidm.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i2) || !zzicw.zzG(zzidm.zzn(obj, j), zzidm.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i2) || zzidm.zzd(obj, j) != zzidm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i2) || zzidm.zzd(obj, j) != zzidm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i2) || zzidm.zzd(obj, j) != zzidm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i2) || zzidm.zzf(obj, j) != zzidm.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i2) || zzidm.zzd(obj, j) != zzidm.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i2) || zzidm.zzf(obj, j) != zzidm.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i2) || !zzicw.zzG(zzidm.zzn(obj, j), zzidm.zzn(obj2, j))) {
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
                    zZzG = zzicw.zzG(zzidm.zzn(obj, j), zzidm.zzn(obj2, j));
                    break;
                case 50:
                    zZzG = zzicw.zzG(zzidm.zzn(obj, j), zzidm.zzn(obj2, j));
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
                    long jZzB = zzB(i2) & 1048575;
                    if (zzidm.zzd(obj, jZzB) != zzidm.zzd(obj2, jZzB) || !zzicw.zzG(zzidm.zzn(obj, j), zzidm.zzn(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzG) {
                return false;
            }
        }
        if (!((zziar) obj).zzt.equals(((zziar) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzian) obj).zza.equals(((zzian) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzicu
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
                int iHashCode = ((zziar) obj).zzt.hashCode() + (i6 * 53);
                return this.zzh ? (iHashCode * 53) + ((zzian) obj).zza.zza.hashCode() : iHashCode;
            }
            int iZzA = zzA(i5);
            int i7 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i8 = iArr[i5];
            long j = i7;
            int iHashCode2 = 37;
            switch (iZzC) {
                case 0:
                    i2 = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzidm.zzl(obj, j));
                    byte[] bArr = zzibe.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 1:
                    i3 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzidm.zzj(obj, j));
                    i6 = iFloatToIntBits + i3;
                    break;
                case 2:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzidm.zzf(obj, j);
                    byte[] bArr2 = zzibe.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 3:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzidm.zzf(obj, j);
                    byte[] bArr3 = zzibe.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 4:
                    i2 = i6 * 53;
                    iZzd = zzidm.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 5:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzidm.zzf(obj, j);
                    byte[] bArr4 = zzibe.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 6:
                    i2 = i6 * 53;
                    iZzd = zzidm.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 7:
                    i3 = i6 * 53;
                    iFloatToIntBits = zzibe.zzb(zzidm.zzh(obj, j));
                    i6 = iFloatToIntBits + i3;
                    break;
                case 8:
                    i3 = i6 * 53;
                    iFloatToIntBits = ((String) zzidm.zzn(obj, j)).hashCode();
                    i6 = iFloatToIntBits + i3;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objZzn = zzidm.zzn(obj, j);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i6 = i4 + iHashCode2;
                    break;
                case 10:
                    i3 = i6 * 53;
                    iFloatToIntBits = zzidm.zzn(obj, j).hashCode();
                    i6 = iFloatToIntBits + i3;
                    break;
                case 11:
                    i2 = i6 * 53;
                    iZzd = zzidm.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 12:
                    i2 = i6 * 53;
                    iZzd = zzidm.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iZzd = zzidm.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 14:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzidm.zzf(obj, j);
                    byte[] bArr5 = zzibe.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 15:
                    i2 = i6 * 53;
                    iZzd = zzidm.zzd(obj, j);
                    i6 = i2 + iZzd;
                    break;
                case 16:
                    i2 = i6 * 53;
                    jDoubleToLongBits = zzidm.zzf(obj, j);
                    byte[] bArr6 = zzibe.zzb;
                    iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i6 = i2 + iZzd;
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objZzn2 = zzidm.zzn(obj, j);
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
                    iFloatToIntBits = zzidm.zzn(obj, j).hashCode();
                    i6 = iFloatToIntBits + i3;
                    break;
                case 50:
                    i3 = i6 * 53;
                    iFloatToIntBits = zzidm.zzn(obj, j).hashCode();
                    i6 = iFloatToIntBits + i3;
                    break;
                case AD_REWARD_USER_VALUE:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzG(obj, j));
                        byte[] bArr7 = zzibe.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (zzP(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzH(obj, j));
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case 53:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr8 = zzibe.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr9 = zzibe.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzI(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 56:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr10 = zzibe.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzI(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 58:
                    if (zzP(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = zzibe.zzb(zzK(obj, j));
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case 59:
                    if (zzP(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = ((String) zzidm.zzn(obj, j)).hashCode();
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case 60:
                    if (zzP(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = zzidm.zzn(obj, j).hashCode();
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzP(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = zzidm.zzn(obj, j).hashCode();
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
                case 62:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzI(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzI(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 64:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzI(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 65:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr11 = zzibe.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case 66:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        iZzd = zzI(obj, j);
                        i6 = i2 + iZzd;
                    }
                    break;
                case 67:
                    if (zzP(obj, i8, i5)) {
                        i2 = i6 * 53;
                        jDoubleToLongBits = zzJ(obj, j);
                        byte[] bArr12 = zzibe.zzb;
                        iZzd = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i6 = i2 + iZzd;
                    }
                    break;
                case 68:
                    if (zzP(obj, i8, i5)) {
                        i3 = i6 * 53;
                        iFloatToIntBits = zzidm.zzn(obj, j).hashCode();
                        i6 = iFloatToIntBits + i3;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i2 >= iArr.length) {
                zzicw.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzicw.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i2);
            int i3 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i4 = iArr[i2];
            long j = i3;
            switch (iZzC) {
                case 0:
                    if (zzN(obj2, i2)) {
                        zzidm.zzm(obj, j, zzidm.zzl(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i2)) {
                        zzidm.zzk(obj, j, zzidm.zzj(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i2)) {
                        zzidm.zzg(obj, j, zzidm.zzf(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i2)) {
                        zzidm.zzg(obj, j, zzidm.zzf(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i2)) {
                        zzidm.zze(obj, j, zzidm.zzd(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i2)) {
                        zzidm.zzg(obj, j, zzidm.zzf(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i2)) {
                        zzidm.zze(obj, j, zzidm.zzd(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i2)) {
                        zzidm.zzi(obj, j, zzidm.zzh(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i2)) {
                        zzidm.zzo(obj, j, zzidm.zzn(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i2);
                    break;
                case 10:
                    if (zzN(obj2, i2)) {
                        zzidm.zzo(obj, j, zzidm.zzn(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i2)) {
                        zzidm.zze(obj, j, zzidm.zzd(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i2)) {
                        zzidm.zze(obj, j, zzidm.zzd(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i2)) {
                        zzidm.zze(obj, j, zzidm.zzd(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i2)) {
                        zzidm.zzg(obj, j, zzidm.zzf(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i2)) {
                        zzidm.zze(obj, j, zzidm.zzd(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i2)) {
                        zzidm.zzg(obj, j, zzidm.zzf(obj2, j));
                        zzO(obj, i2);
                    }
                    break;
                case 17:
                    zzo(obj, obj2, i2);
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
                    zzibd zzibdVarZzh = (zzibd) zzidm.zzn(obj, j);
                    zzibd zzibdVar = (zzibd) zzidm.zzn(obj2, j);
                    int size = zzibdVarZzh.size();
                    int size2 = zzibdVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzibdVarZzh.zza()) {
                            zzibdVarZzh = zzibdVarZzh.zzh(size2 + size);
                        }
                        zzibdVarZzh.addAll(zzibdVar);
                    }
                    if (size > 0) {
                        zzibdVar = zzibdVarZzh;
                    }
                    zzidm.zzo(obj, j, zzibdVar);
                    break;
                case 50:
                    int i5 = zzicw.zza;
                    zzidm.zzo(obj, j, zzibx.zzb(zzidm.zzn(obj, j), zzidm.zzn(obj2, j)));
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
                    if (zzP(obj2, i4, i2)) {
                        zzidm.zzo(obj, j, zzidm.zzn(obj2, j));
                        zzQ(obj, i4, i2);
                    }
                    break;
                case 60:
                    zzp(obj, obj2, i2);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case 62:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzP(obj2, i4, i2)) {
                        zzidm.zzo(obj, j, zzidm.zzn(obj2, j));
                        zzQ(obj, i4, i2);
                    }
                    break;
                case 68:
                    zzp(obj, obj2, i2);
                    break;
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:195:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e4  */
    @Override // com.google.android.gms.internal.ads.zzicu
    public final int zze(Object obj) {
        int i2;
        int iZzA;
        int iZzB;
        int iZzA2;
        int iZzc;
        int iZzA3;
        int iZzD;
        int iZzA4;
        int size;
        int iZzt;
        int iZzA5;
        int iZzA6;
        int iZzA7;
        int iZzB2;
        int iZzA8;
        int iZzA9;
        int iZzE;
        int iZzA10;
        int iZzB3;
        zzicf<T> zzicfVar = this;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int iB = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = zzicfVar.zzc;
            if (i4 >= iArr.length) {
                int iZzi = ((zziar) obj).zzt.zzi() + iB;
                if (!zzicfVar.zzh) {
                    return iZzi;
                }
                zzidb zzidbVar = ((zzian) obj).zza.zza;
                int iZzc2 = zzidbVar.zzc();
                int iZzj = 0;
                for (int i7 = 0; i7 < iZzc2; i7++) {
                    Map.Entry entryZzd = zzidbVar.zzd(i7);
                    iZzj += zziag.zzj((zziaf) ((zzicy) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzidbVar.zze()) {
                    iZzj += zziag.zzj((zziaf) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA11 = zzicfVar.zzA(i4);
            int iZzC = zzC(iZzA11);
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & i3;
            if (iZzC <= 17) {
                if (i10 != i6) {
                    i5 = i10 == i3 ? 0 : unsafe.getInt(obj, i10);
                    i6 = i10;
                }
                i2 = 1 << (i9 >>> 20);
            } else {
                i2 = 0;
            }
            int i11 = iZzA11 & i3;
            if (iZzC >= zziah.zzJ.zza()) {
                zziah.zzW.zza();
            }
            long j = i11;
            switch (iZzC) {
                case 0:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iB = Z.b(i8 << 3, 8, iB);
                    }
                    break;
                case 1:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iB = Z.b(i8 << 3, 4, iB);
                    }
                    zzicfVar = this;
                    break;
                case 2:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA = zzhzw.zzA(i8 << 3);
                        iZzB = zzhzw.zzB(j2);
                        iB += iZzB + iZzA;
                    }
                    zzicfVar = this;
                    break;
                case 3:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA = zzhzw.zzA(i8 << 3);
                        iZzB = zzhzw.zzB(j3);
                        iB += iZzB + iZzA;
                    }
                    zzicfVar = this;
                    break;
                case 4:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzA = zzhzw.zzA(i8 << 3);
                        iZzB = zzhzw.zzB(j4);
                        iB += iZzB + iZzA;
                    }
                    zzicfVar = this;
                    break;
                case 5:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iB = Z.b(i8 << 3, 8, iB);
                    }
                    zzicfVar = this;
                    break;
                case 6:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iB = Z.b(i8 << 3, 4, iB);
                    }
                    zzicfVar = this;
                    break;
                case 7:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iB = Z.b(i8 << 3, 1, iB);
                    }
                    zzicfVar = this;
                    break;
                case 8:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzhzl) {
                            iZzA2 = zzhzw.zzA(i12);
                            iZzc = ((zzhzl) object).zzc();
                            iZzA3 = zzhzw.zzA(iZzc);
                            iB += iZzA3 + iZzc + iZzA2;
                        } else {
                            iZzA = zzhzw.zzA(i12);
                            iZzB = zzhzw.zzC((String) object);
                            iB += iZzB + iZzA;
                        }
                    }
                    zzicfVar = this;
                    break;
                case 9:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iZzD = zzicw.zzD(i8, unsafe.getObject(obj, j), zzicfVar.zzq(i4));
                        iB += iZzD;
                    }
                    break;
                case 10:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        zzhzl zzhzlVar = (zzhzl) unsafe.getObject(obj, j);
                        iZzA2 = zzhzw.zzA(i8 << 3);
                        iZzc = zzhzlVar.zzc();
                        iZzA3 = zzhzw.zzA(iZzc);
                        iB += iZzA3 + iZzc + iZzA2;
                    }
                    zzicfVar = this;
                    break;
                case 11:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iB = Z.b(unsafe.getInt(obj, j), zzhzw.zzA(i8 << 3), iB);
                    }
                    zzicfVar = this;
                    break;
                case 12:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzA = zzhzw.zzA(i8 << 3);
                        iZzB = zzhzw.zzB(j5);
                        iB += iZzB + iZzA;
                    }
                    zzicfVar = this;
                    break;
                case 13:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iB = Z.b(i8 << 3, 4, iB);
                    }
                    zzicfVar = this;
                    break;
                case 14:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iB = Z.b(i8 << 3, 8, iB);
                    }
                    zzicfVar = this;
                    break;
                case 15:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        int i13 = unsafe.getInt(obj, j);
                        iB = Z.b((i13 >> 31) ^ (i13 + i13), zzhzw.zzA(i8 << 3), iB);
                    }
                    zzicfVar = this;
                    break;
                case 16:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzA = zzhzw.zzA(i8 << 3);
                        iZzB = zzhzw.zzB((j6 >> 63) ^ (j6 + j6));
                        iB += iZzB + iZzA;
                    }
                    zzicfVar = this;
                    break;
                case 17:
                    if (zzicfVar.zzM(obj, i4, i6, i5, i2)) {
                        iZzD = zzicw.zzE(i8, (zzicc) unsafe.getObject(obj, j), zzicfVar.zzq(i4));
                        iB += iZzD;
                    }
                    break;
                case 18:
                    iZzD = zzicw.zzC(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzD;
                    break;
                case 19:
                    iZzD = zzicw.zzA(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zzicw.zza;
                    if (list.size() == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzA4 = (zzhzw.zzA(i8 << 3) * list.size()) + zzicw.zzs(list);
                    }
                    iB += iZzA4;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zzicw.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzt = zzicw.zzt(list2);
                        iZzA5 = zzhzw.zzA(i8 << 3);
                        iZzA6 = (iZzA5 * size) + iZzt;
                    }
                    iB += iZzA6;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zzicw.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzt = zzicw.zzw(list3);
                        iZzA5 = zzhzw.zzA(i8 << 3);
                        iZzA6 = (iZzA5 * size) + iZzt;
                    }
                    iB += iZzA6;
                    break;
                case 23:
                    iZzD = zzicw.zzC(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzD;
                    break;
                case 24:
                    iZzD = zzicw.zzA(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zzicw.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzA4 = 0;
                    } else {
                        iZzA4 = (zzhzw.zzA(i8 << 3) + 1) * size2;
                    }
                    iB += iZzA4;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i18 = zzicw.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzhzw.zzA(i8 << 3) * size3;
                        if (list5 instanceof zzibn) {
                            zzibn zzibnVar = (zzibn) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objZzc = zzibnVar.zzc();
                                if (objZzc instanceof zzhzl) {
                                    int iZzc3 = ((zzhzl) objZzc).zzc();
                                    iZzA6 = Z.b(iZzc3, iZzc3, iZzA6);
                                } else {
                                    iZzA6 = zzhzw.zzC((String) objZzc) + iZzA6;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj2 = list5.get(i20);
                                if (obj2 instanceof zzhzl) {
                                    int iZzc4 = ((zzhzl) obj2).zzc();
                                    iZzA6 = Z.b(iZzc4, iZzc4, iZzA6);
                                } else {
                                    iZzA6 = zzhzw.zzC((String) obj2) + iZzA6;
                                }
                            }
                        }
                    }
                    iB += iZzA6;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzicu zzicuVarZzq = zzicfVar.zzq(i4);
                    int i21 = zzicw.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzA7 = 0;
                    } else {
                        iZzA7 = zzhzw.zzA(i8 << 3) * size4;
                        for (int i22 = 0; i22 < size4; i22++) {
                            Object obj3 = list6.get(i22);
                            if (obj3 instanceof zzibm) {
                                int iZzb = ((zzibm) obj3).zzb();
                                iZzA7 = Z.b(iZzb, iZzb, iZzA7);
                            } else {
                                int iZzaT = ((zzhyu) obj3).zzaT(zzicuVarZzq);
                                iZzA7 = Z.b(iZzaT, iZzaT, iZzA7);
                            }
                        }
                    }
                    iB += iZzA7;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zzicw.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = zzhzw.zzA(i8 << 3) * size5;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int iZzc5 = ((zzhzl) list7.get(i24)).zzc();
                            iZzA6 = Z.b(iZzc5, iZzc5, iZzA6);
                        }
                    }
                    iB += iZzA6;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i25 = zzicw.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzt = zzicw.zzx(list8);
                        iZzA5 = zzhzw.zzA(i8 << 3);
                        iZzA6 = (iZzA5 * size) + iZzt;
                    }
                    iB += iZzA6;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i26 = zzicw.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzt = zzicw.zzv(list9);
                        iZzA5 = zzhzw.zzA(i8 << 3);
                        iZzA6 = (iZzA5 * size) + iZzt;
                    }
                    iB += iZzA6;
                    break;
                case 31:
                    iZzD = zzicw.zzA(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzD;
                    break;
                case 32:
                    iZzD = zzicw.zzC(i8, (List) unsafe.getObject(obj, j), false);
                    iB += iZzD;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i27 = zzicw.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzt = zzicw.zzy(list10);
                        iZzA5 = zzhzw.zzA(i8 << 3);
                        iZzA6 = (iZzA5 * size) + iZzt;
                    }
                    iB += iZzA6;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i28 = zzicw.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzA6 = 0;
                    } else {
                        iZzt = zzicw.zzu(list11);
                        iZzA5 = zzhzw.zzA(i8 << 3);
                        iZzA6 = (iZzA5 * size) + iZzt;
                    }
                    iB += iZzA6;
                    break;
                case 35:
                    iZzB2 = zzicw.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 36:
                    iZzB2 = zzicw.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 37:
                    iZzB2 = zzicw.zzs((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 38:
                    iZzB2 = zzicw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 39:
                    iZzB2 = zzicw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 40:
                    iZzB2 = zzicw.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 41:
                    iZzB2 = zzicw.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i29 = zzicw.zza;
                    iZzB2 = list12.size();
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 43:
                    iZzB2 = zzicw.zzx((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 44:
                    iZzB2 = zzicw.zzv((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 45:
                    iZzB2 = zzicw.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 46:
                    iZzB2 = zzicw.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 47:
                    iZzB2 = zzicw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 48:
                    iZzB2 = zzicw.zzu((List) unsafe.getObject(obj, j));
                    if (iZzB2 > 0) {
                        iZzA8 = zzhzw.zzA(i8 << 3);
                        iZzA9 = zzhzw.zzA(iZzB2);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzicu zzicuVarZzq2 = zzicfVar.zzq(i4);
                    int i30 = zzicw.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzE = 0;
                    } else {
                        iZzE = 0;
                        for (int i31 = 0; i31 < size6; i31++) {
                            iZzE += zzicw.zzE(i8, (zzicc) list13.get(i31), zzicuVarZzq2);
                        }
                    }
                    iB += iZzE;
                    break;
                case 50:
                    zzibw zzibwVar = (zzibw) unsafe.getObject(obj, j);
                    zzibv zzibvVar = (zzibv) zzicfVar.zzr(i4);
                    if (zzibwVar.isEmpty()) {
                        iZzA6 = 0;
                    } else {
                        iZzA6 = 0;
                        for (Map.Entry entry2 : zzibwVar.entrySet()) {
                            iZzA6 += zzibvVar.zzd(i8, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iB += iZzA6;
                    break;
                case AD_REWARD_USER_VALUE:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iB = Z.b(i8 << 3, 8, iB);
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iB = Z.b(i8 << 3, 4, iB);
                    }
                    break;
                case 53:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        long jZzJ = zzJ(obj, j);
                        iZzA10 = zzhzw.zzA(i8 << 3);
                        iZzB3 = zzhzw.zzB(jZzJ);
                        iB += iZzB3 + iZzA10;
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        long jZzJ2 = zzJ(obj, j);
                        iZzA10 = zzhzw.zzA(i8 << 3);
                        iZzB3 = zzhzw.zzB(jZzJ2);
                        iB += iZzB3 + iZzA10;
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        long jZzI = zzI(obj, j);
                        iZzA10 = zzhzw.zzA(i8 << 3);
                        iZzB3 = zzhzw.zzB(jZzI);
                        iB += iZzB3 + iZzA10;
                    }
                    break;
                case 56:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iB = Z.b(i8 << 3, 8, iB);
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iB = Z.b(i8 << 3, 4, iB);
                    }
                    break;
                case 58:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iB = Z.b(i8 << 3, 1, iB);
                    }
                    break;
                case 59:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        int i32 = i8 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzhzl) {
                            iZzB2 = zzhzw.zzA(i32);
                            iZzA8 = ((zzhzl) object2).zzc();
                            iZzA9 = zzhzw.zzA(iZzA8);
                            iB += iZzA9 + iZzA8 + iZzB2;
                        } else {
                            iZzA10 = zzhzw.zzA(i32);
                            iZzB3 = zzhzw.zzC((String) object2);
                            iB += iZzB3 + iZzA10;
                        }
                    }
                    break;
                case 60:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iZzD = zzicw.zzD(i8, unsafe.getObject(obj, j), zzicfVar.zzq(i4));
                        iB += iZzD;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        zzhzl zzhzlVar2 = (zzhzl) unsafe.getObject(obj, j);
                        iZzB2 = zzhzw.zzA(i8 << 3);
                        iZzA8 = zzhzlVar2.zzc();
                        iZzA9 = zzhzw.zzA(iZzA8);
                        iB += iZzA9 + iZzA8 + iZzB2;
                    }
                    break;
                case 62:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iB = Z.b(zzI(obj, j), zzhzw.zzA(i8 << 3), iB);
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        long jZzI2 = zzI(obj, j);
                        iZzA10 = zzhzw.zzA(i8 << 3);
                        iZzB3 = zzhzw.zzB(jZzI2);
                        iB += iZzB3 + iZzA10;
                    }
                    break;
                case 64:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iB = Z.b(i8 << 3, 4, iB);
                    }
                    break;
                case 65:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iB = Z.b(i8 << 3, 8, iB);
                    }
                    break;
                case 66:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        int iZzI = zzI(obj, j);
                        iB = Z.b((iZzI >> 31) ^ (iZzI + iZzI), zzhzw.zzA(i8 << 3), iB);
                    }
                    break;
                case 67:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        long jZzJ3 = zzJ(obj, j);
                        iZzA10 = zzhzw.zzA(i8 << 3);
                        iZzB3 = zzhzw.zzB((jZzJ3 >> 63) ^ (jZzJ3 + jZzJ3));
                        iB += iZzB3 + iZzA10;
                    }
                    break;
                case 68:
                    if (zzicfVar.zzP(obj, i8, i4)) {
                        iZzD = zzicw.zzE(i8, (zzicc) unsafe.getObject(obj, j), zzicfVar.zzq(i4));
                        iB += iZzD;
                    }
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzf(Object obj, zzidu zziduVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        boolean z2;
        int i2;
        int i3;
        int i4;
        zzicf<T> zzicfVar = this;
        if (zzicfVar.zzh) {
            zziag zziagVar = ((zzian) obj).zza;
            if (zziagVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzc = zziagVar.zzc();
                entry = (Map.Entry) itZzc.next();
                it = itZzc;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzicfVar.zzc;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr.length) {
            int iZzA = zzicfVar.zzA(i7);
            int iZzC = zzC(iZzA);
            int i9 = iArr[i7];
            if (iZzC <= 17) {
                int i10 = iArr[i7 + 2];
                z2 = true;
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i2 = i6;
                i3 = i8;
                i4 = 1 << (i10 >>> 20);
            } else {
                z2 = true;
                i2 = i6;
                i3 = i8;
                i4 = 0;
            }
            while (true) {
                if (entry != null) {
                    zziac zziacVar = zzicfVar.zzn;
                    i5 = i5;
                    if (((zziao) entry.getKey()).zza <= i9) {
                        zziacVar.zzb(zziduVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                } else {
                    i5 = i5;
                }
            }
            long j = iZzA & i5;
            switch (iZzC) {
                case 0:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzf(i9, zzidm.zzl(obj, j));
                    }
                    break;
                case 1:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zze(i9, zzidm.zzj(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 2:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzc(i9, unsafe.getLong(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 3:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzh(i9, unsafe.getLong(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 4:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzi(i9, unsafe.getInt(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 5:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzj(i9, unsafe.getLong(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 6:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzk(i9, unsafe.getInt(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 7:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzl(i9, zzidm.zzh(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 8:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zzU(i9, unsafe.getObject(obj, j), zziduVar);
                    }
                    zzicfVar = this;
                    break;
                case 9:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzr(i9, unsafe.getObject(obj, j), zzicfVar.zzq(i7));
                    }
                    break;
                case 10:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzn(i9, (zzhzl) unsafe.getObject(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 11:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzo(i9, unsafe.getInt(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 12:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzg(i9, unsafe.getInt(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 13:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzb(i9, unsafe.getInt(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 14:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzd(i9, unsafe.getLong(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 15:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzp(i9, unsafe.getInt(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 16:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzq(i9, unsafe.getLong(obj, j));
                    }
                    zzicfVar = this;
                    break;
                case 17:
                    if (zzicfVar.zzM(obj, i7, i2, i3, i4)) {
                        zziduVar.zzs(i9, unsafe.getObject(obj, j), zzicfVar.zzq(i7));
                    }
                    break;
                case 18:
                    zzicw.zza(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 19:
                    zzicw.zzb(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 20:
                    zzicw.zzc(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 21:
                    zzicw.zzd(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 22:
                    zzicw.zzh(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 23:
                    zzicw.zzf(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 24:
                    zzicw.zzk(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 25:
                    zzicw.zzn(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 26:
                    zzicw.zzo(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar);
                    break;
                case 27:
                    zzicw.zzq(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, zzicfVar.zzq(i7));
                    break;
                case 28:
                    zzicw.zzp(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar);
                    break;
                case 29:
                    zzicw.zzi(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 30:
                    zzicw.zzm(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 31:
                    zzicw.zzl(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 32:
                    zzicw.zzg(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 33:
                    zzicw.zzj(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 34:
                    zzicw.zze(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, false);
                    break;
                case 35:
                    zzicw.zza(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 36:
                    zzicw.zzb(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 37:
                    zzicw.zzc(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 38:
                    zzicw.zzd(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 39:
                    zzicw.zzh(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 40:
                    zzicw.zzf(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 41:
                    zzicw.zzk(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 42:
                    zzicw.zzn(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 43:
                    zzicw.zzi(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 44:
                    zzicw.zzm(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 45:
                    zzicw.zzl(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 46:
                    zzicw.zzg(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 47:
                    zzicw.zzj(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 48:
                    zzicw.zze(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, z2);
                    break;
                case 49:
                    zzicw.zzr(iArr[i7], (List) unsafe.getObject(obj, j), zziduVar, zzicfVar.zzq(i7));
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        zziduVar.zzM(i9, ((zzibv) zzicfVar.zzr(i7)).zze(), (zzibw) object);
                    }
                    break;
                case AD_REWARD_USER_VALUE:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzf(i9, zzG(obj, j));
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zze(i9, zzH(obj, j));
                    }
                    break;
                case 53:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzc(i9, zzJ(obj, j));
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzh(i9, zzJ(obj, j));
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzi(i9, zzI(obj, j));
                    }
                    break;
                case 56:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzj(i9, zzJ(obj, j));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzk(i9, zzI(obj, j));
                    }
                    break;
                case 58:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzl(i9, zzK(obj, j));
                    }
                    break;
                case 59:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zzU(i9, unsafe.getObject(obj, j), zziduVar);
                    }
                    break;
                case 60:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzr(i9, unsafe.getObject(obj, j), zzicfVar.zzq(i7));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzn(i9, (zzhzl) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzo(i9, zzI(obj, j));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzg(i9, zzI(obj, j));
                    }
                    break;
                case 64:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzb(i9, zzI(obj, j));
                    }
                    break;
                case 65:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzd(i9, zzJ(obj, j));
                    }
                    break;
                case 66:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzp(i9, zzI(obj, j));
                    }
                    break;
                case 67:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzq(i9, zzJ(obj, j));
                    }
                    break;
                case 68:
                    if (zzicfVar.zzP(obj, i9, i7)) {
                        zziduVar.zzs(i9, unsafe.getObject(obj, j), zzicfVar.zzq(i7));
                    }
                    break;
                default:
                    break;
            }
            i7 += 3;
            i8 = i3;
            i5 = i5;
            i6 = i2;
            entry = entry;
        }
        while (entry != null) {
            zzicfVar.zzn.zzb(zziduVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zziar) obj).zzt.zzg(zziduVar);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0581 A[LOOP:2: B:180:0x057d->B:182:0x0581, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0593  */
    /* JADX WARN: Code duplicated, block: B:187:0x0597  */
    /* JADX WARN: Code duplicated, block: B:198:0x05ad A[LOOP:1: B:196:0x05a9->B:198:0x05ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:214:0x0569 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x057a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzg(Object obj, zzicp zzicpVar, zziab zziabVar) throws Throwable {
        zzicf<T> zzicfVar;
        Object obj2;
        Throwable th;
        int i2;
        Object objZzx;
        zzidf zzidfVar;
        Object objZzx2;
        Object obj3;
        zzicf<T> zzicfVar2;
        int i3;
        zziabVar.getClass();
        zzF(obj);
        zzidf zzidfVar2 = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzicpVar.zzb();
                int iZzR = zzR(iZzb);
                if (iZzR >= 0) {
                    obj3 = obj;
                    zzicfVar2 = this;
                    try {
                        int iZzA = zzA(iZzR);
                        try {
                            try {
                                switch (zzC(iZzA)) {
                                    case 0:
                                        obj2 = obj3;
                                        zzidm.zzm(obj2, iZzA & 1048575, zzicpVar.zze());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 1:
                                        obj2 = obj3;
                                        zzidm.zzk(obj2, iZzA & 1048575, zzicpVar.zzf());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 2:
                                        obj2 = obj3;
                                        zzidm.zzg(obj2, iZzA & 1048575, zzicpVar.zzh());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 3:
                                        obj2 = obj3;
                                        zzidm.zzg(obj2, iZzA & 1048575, zzicpVar.zzg());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 4:
                                        obj2 = obj3;
                                        zzidm.zze(obj2, iZzA & 1048575, zzicpVar.zzi());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 5:
                                        obj2 = obj3;
                                        zzidm.zzg(obj2, iZzA & 1048575, zzicpVar.zzj());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 6:
                                        obj2 = obj3;
                                        zzidm.zze(obj2, iZzA & 1048575, zzicpVar.zzk());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 7:
                                        obj2 = obj3;
                                        zzidm.zzi(obj2, iZzA & 1048575, zzicpVar.zzl());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 8:
                                        obj2 = obj3;
                                        zzz(obj2, iZzA, zzicpVar);
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 9:
                                        obj2 = obj3;
                                        zzicc zziccVar = (zzicc) zzt(obj2, iZzR);
                                        zzicpVar.zzo(zziccVar, zzq(iZzR), zziabVar);
                                        zzu(obj2, iZzR, zziccVar);
                                        obj = obj2;
                                        break;
                                    case 10:
                                        obj2 = obj3;
                                        zzidm.zzo(obj2, iZzA & 1048575, zzicpVar.zzq());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 11:
                                        obj2 = obj3;
                                        zzidm.zze(obj2, iZzA & 1048575, zzicpVar.zzr());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 12:
                                        obj2 = obj3;
                                        int iZzs = zzicpVar.zzs();
                                        zziax zziaxVarZzs = zzs(iZzR);
                                        if (zziaxVarZzs == null || zziaxVarZzs.zza(iZzs)) {
                                            zzidm.zze(obj2, iZzA & 1048575, iZzs);
                                            zzO(obj2, iZzR);
                                        } else {
                                            objZzh = zzicw.zzK(obj2, iZzb, iZzs, objZzh, zzidfVar2);
                                        }
                                        obj = obj2;
                                        break;
                                    case 13:
                                        obj2 = obj3;
                                        zzidm.zze(obj2, iZzA & 1048575, zzicpVar.zzt());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 14:
                                        obj2 = obj3;
                                        zzidm.zzg(obj2, iZzA & 1048575, zzicpVar.zzu());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 15:
                                        obj2 = obj3;
                                        zzidm.zze(obj2, iZzA & 1048575, zzicpVar.zzv());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 16:
                                        obj2 = obj3;
                                        zzidm.zzg(obj2, iZzA & 1048575, zzicpVar.zzw());
                                        zzO(obj2, iZzR);
                                        obj = obj2;
                                        break;
                                    case 17:
                                        obj2 = obj3;
                                        zzicc zziccVar2 = (zzicc) zzt(obj2, iZzR);
                                        zzicpVar.zzp(zziccVar2, zzq(iZzR), zziabVar);
                                        zzu(obj2, iZzR, zziccVar2);
                                        obj = obj2;
                                        break;
                                    case 18:
                                        obj2 = obj3;
                                        zzicpVar.zzx(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 19:
                                        obj2 = obj3;
                                        zzicpVar.zzy(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 20:
                                        obj2 = obj3;
                                        zzicpVar.zzA(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 21:
                                        obj2 = obj3;
                                        zzicpVar.zzz(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 22:
                                        obj2 = obj3;
                                        zzicpVar.zzB(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 23:
                                        obj2 = obj3;
                                        zzicpVar.zzC(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 24:
                                        obj2 = obj3;
                                        zzicpVar.zzD(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 25:
                                        obj2 = obj3;
                                        zzicpVar.zzE(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 26:
                                        obj2 = obj3;
                                        if (zzD(iZzA)) {
                                            ((zzhzr) zzicpVar).zzF(zzibo.zza(obj2, iZzA & 1048575), true);
                                        } else {
                                            ((zzhzr) zzicpVar).zzF(zzibo.zza(obj2, iZzA & 1048575), false);
                                        }
                                        obj = obj2;
                                        break;
                                    case 27:
                                        obj2 = obj3;
                                        zzicpVar.zzG(zzibo.zza(obj2, iZzA & 1048575), zzq(iZzR), zziabVar);
                                        obj = obj2;
                                        break;
                                    case 28:
                                        obj2 = obj3;
                                        zzicpVar.zzI(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 29:
                                        obj2 = obj3;
                                        zzicpVar.zzJ(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 30:
                                        List listZza = zzibo.zza(obj3, iZzA & 1048575);
                                        zzicpVar.zzK(listZza);
                                        objZzh = zzicw.zzJ(obj3, iZzb, listZza, zzs(iZzR), objZzh, zzidfVar2);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 31:
                                        obj2 = obj3;
                                        zzicpVar.zzL(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 32:
                                        obj2 = obj3;
                                        zzicpVar.zzM(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 33:
                                        obj2 = obj3;
                                        zzicpVar.zzN(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 34:
                                        obj2 = obj3;
                                        zzicpVar.zzO(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 35:
                                        obj2 = obj3;
                                        zzicpVar.zzx(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 36:
                                        obj2 = obj3;
                                        zzicpVar.zzy(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 37:
                                        obj2 = obj3;
                                        zzicpVar.zzA(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 38:
                                        obj2 = obj3;
                                        zzicpVar.zzz(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 39:
                                        obj2 = obj3;
                                        zzicpVar.zzB(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 40:
                                        obj2 = obj3;
                                        zzicpVar.zzC(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 41:
                                        obj2 = obj3;
                                        zzicpVar.zzD(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 42:
                                        obj2 = obj3;
                                        zzicpVar.zzE(zzibo.zza(obj2, iZzA & 1048575));
                                        obj = obj2;
                                        break;
                                    case 43:
                                        obj2 = obj3;
                                        try {
                                            zzicpVar.zzJ(zzibo.zza(obj2, iZzA & 1048575));
                                            break;
                                        } catch (zzibf unused) {
                                            if (objZzh == null) {
                                                try {
                                                    objZzh = zzidfVar2.zzh(obj2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    zzicfVar = zzicfVar2;
                                                    i2 = zzicfVar.zzk;
                                                    objZzx = objZzh;
                                                    while (i2 < zzicfVar.zzl) {
                                                        zzidf zzidfVar3 = zzidfVar2;
                                                        objZzx = zzicfVar.zzx(obj2, zzicfVar.zzj[i2], objZzx, zzidfVar3, obj2);
                                                        i2++;
                                                        zzicfVar = this;
                                                        zzidfVar2 = zzidfVar3;
                                                    }
                                                    zzidfVar = zzidfVar2;
                                                    if (objZzx != null) {
                                                        throw th;
                                                    }
                                                    zzidfVar.zzi(obj2, objZzx);
                                                    throw th;
                                                }
                                            }
                                            try {
                                                if (!zzidfVar2.zzk(objZzh, zzicpVar, 0)) {
                                                    objZzx2 = objZzh;
                                                    for (i3 = zzicfVar2.zzk; i3 < zzicfVar2.zzl; i3++) {
                                                        zzidf zzidfVar4 = zzidfVar2;
                                                        objZzx2 = zzicfVar2.zzx(obj2, zzicfVar2.zzj[i3], objZzx2, zzidfVar4, obj2);
                                                        zzidfVar2 = zzidfVar4;
                                                    }
                                                    if (objZzx2 != null) {
                                                        zzidfVar2.zzi(obj2, objZzx2);
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzicfVar = zzicfVar2;
                                                th = th;
                                                i2 = zzicfVar.zzk;
                                                objZzx = objZzh;
                                                while (i2 < zzicfVar.zzl) {
                                                    zzidf zzidfVar5 = zzidfVar2;
                                                    objZzx = zzicfVar.zzx(obj2, zzicfVar.zzj[i2], objZzx, zzidfVar5, obj2);
                                                    i2++;
                                                    zzicfVar = this;
                                                    zzidfVar2 = zzidfVar5;
                                                }
                                                zzidfVar = zzidfVar2;
                                                if (objZzx != null) {
                                                    throw th;
                                                }
                                                zzidfVar.zzi(obj2, objZzx);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            zzicfVar = zzicfVar2;
                                            i2 = zzicfVar.zzk;
                                            objZzx = objZzh;
                                            while (i2 < zzicfVar.zzl) {
                                                zzidf zzidfVar6 = zzidfVar2;
                                                objZzx = zzicfVar.zzx(obj2, zzicfVar.zzj[i2], objZzx, zzidfVar6, obj2);
                                                i2++;
                                                zzicfVar = this;
                                                zzidfVar2 = zzidfVar6;
                                            }
                                            zzidfVar = zzidfVar2;
                                            if (objZzx != null) {
                                                throw th;
                                            }
                                            zzidfVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                        obj = obj2;
                                        break;
                                    case 44:
                                        List listZza2 = zzibo.zza(obj3, iZzA & 1048575);
                                        zzicpVar.zzK(listZza2);
                                        try {
                                            objZzh = zzicw.zzJ(obj3, iZzb, listZza2, zzs(iZzR), objZzh, zzidfVar2);
                                            obj2 = obj3;
                                        } catch (zzibf unused2) {
                                            obj2 = obj3;
                                            if (objZzh == null) {
                                                objZzh = zzidfVar2.zzh(obj2);
                                            }
                                            if (!zzidfVar2.zzk(objZzh, zzicpVar, 0)) {
                                                objZzx2 = objZzh;
                                                while (i3 < zzicfVar2.zzl) {
                                                    zzidf zzidfVar7 = zzidfVar2;
                                                    objZzx2 = zzicfVar2.zzx(obj2, zzicfVar2.zzj[i3], objZzx2, zzidfVar7, obj2);
                                                    zzidfVar2 = zzidfVar7;
                                                }
                                                if (objZzx2 != null) {
                                                    zzidfVar2.zzi(obj2, objZzx2);
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = obj3;
                                            th = th;
                                            zzicfVar = zzicfVar2;
                                            i2 = zzicfVar.zzk;
                                            objZzx = objZzh;
                                            while (i2 < zzicfVar.zzl) {
                                                zzidf zzidfVar8 = zzidfVar2;
                                                objZzx = zzicfVar.zzx(obj2, zzicfVar.zzj[i2], objZzx, zzidfVar8, obj2);
                                                i2++;
                                                zzicfVar = this;
                                                zzidfVar2 = zzidfVar8;
                                            }
                                            zzidfVar = zzidfVar2;
                                            if (objZzx != null) {
                                                throw th;
                                            }
                                            zzidfVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                        obj = obj2;
                                        break;
                                    case 45:
                                        zzicpVar.zzL(zzibo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 46:
                                        zzicpVar.zzM(zzibo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 47:
                                        zzicpVar.zzN(zzibo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 48:
                                        zzicpVar.zzO(zzibo.zza(obj3, iZzA & 1048575));
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 49:
                                        zzicpVar.zzH(zzibo.zza(obj3, iZzA & 1048575), zzq(iZzR), zziabVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 50:
                                        Object objZzr = zzr(iZzR);
                                        long jZzA = zzA(iZzR) & 1048575;
                                        Object objZzn = zzidm.zzn(obj3, jZzA);
                                        if (objZzn == null) {
                                            objZzn = zzibw.zza().zzc();
                                            zzidm.zzo(obj3, jZzA, objZzn);
                                        } else if (zzibx.zza(objZzn)) {
                                            Object objZzc = zzibw.zza().zzc();
                                            zzibx.zzb(objZzc, objZzn);
                                            zzidm.zzo(obj3, jZzA, objZzc);
                                            objZzn = objZzc;
                                        }
                                        zzicpVar.zzP((zzibw) objZzn, ((zzibv) objZzr).zze(), zziabVar);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_REWARD_USER_VALUE:
                                        zzidm.zzo(obj3, iZzA & 1048575, Double.valueOf(zzicpVar.zze()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                        zzidm.zzo(obj3, iZzA & 1048575, Float.valueOf(zzicpVar.zzf()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 53:
                                        zzidm.zzo(obj3, iZzA & 1048575, Long.valueOf(zzicpVar.zzh()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                                        zzidm.zzo(obj3, iZzA & 1048575, Long.valueOf(zzicpVar.zzg()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                                        zzidm.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzicpVar.zzi()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 56:
                                        zzidm.zzo(obj3, iZzA & 1048575, Long.valueOf(zzicpVar.zzj()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                        zzidm.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzicpVar.zzk()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 58:
                                        zzidm.zzo(obj3, iZzA & 1048575, Boolean.valueOf(zzicpVar.zzl()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 59:
                                        zzz(obj3, iZzA, zzicpVar);
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 60:
                                        zzicc zziccVar3 = (zzicc) zzv(obj3, iZzb, iZzR);
                                        zzicpVar.zzo(zziccVar3, zzq(iZzR), zziabVar);
                                        zzw(obj3, iZzb, iZzR, zziccVar3);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                        zzidm.zzo(obj3, iZzA & 1048575, zzicpVar.zzq());
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 62:
                                        zzidm.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzicpVar.zzr()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                        int iZzs2 = zzicpVar.zzs();
                                        zziax zziaxVarZzs2 = zzs(iZzR);
                                        if (zziaxVarZzs2 != null && !zziaxVarZzs2.zza(iZzs2)) {
                                            objZzh = zzicw.zzK(obj3, iZzb, iZzs2, objZzh, zzidfVar2);
                                            obj = obj3;
                                        }
                                        zzidm.zzo(obj3, iZzA & 1048575, Integer.valueOf(iZzs2));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 64:
                                        zzidm.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzicpVar.zzt()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 65:
                                        zzidm.zzo(obj3, iZzA & 1048575, Long.valueOf(zzicpVar.zzu()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 66:
                                        zzidm.zzo(obj3, iZzA & 1048575, Integer.valueOf(zzicpVar.zzv()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 67:
                                        zzidm.zzo(obj3, iZzA & 1048575, Long.valueOf(zzicpVar.zzw()));
                                        zzQ(obj3, iZzb, iZzR);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    case 68:
                                        zzicc zziccVar4 = (zzicc) zzv(obj3, iZzb, iZzR);
                                        zzicpVar.zzp(zziccVar4, zzq(iZzR), zziabVar);
                                        zzw(obj3, iZzb, iZzR, zziccVar4);
                                        obj2 = obj3;
                                        obj = obj2;
                                        break;
                                    default:
                                        if (objZzh == null) {
                                            try {
                                                objZzh = zzidfVar2.zzh(obj3);
                                            } catch (Throwable th6) {
                                                th = th6;
                                                th = th;
                                                zzicfVar = zzicfVar2;
                                                obj2 = obj3;
                                                i2 = zzicfVar.zzk;
                                                objZzx = objZzh;
                                                while (i2 < zzicfVar.zzl) {
                                                    zzidf zzidfVar9 = zzidfVar2;
                                                    objZzx = zzicfVar.zzx(obj2, zzicfVar.zzj[i2], objZzx, zzidfVar9, obj2);
                                                    i2++;
                                                    zzicfVar = this;
                                                    zzidfVar2 = zzidfVar9;
                                                }
                                                zzidfVar = zzidfVar2;
                                                if (objZzx != null) {
                                                    throw th;
                                                }
                                                zzidfVar.zzi(obj2, objZzx);
                                                throw th;
                                            }
                                        }
                                        if (!zzidfVar2.zzk(objZzh, zzicpVar, 0)) {
                                            objZzx2 = objZzh;
                                            for (int i4 = zzicfVar2.zzk; i4 < zzicfVar2.zzl; i4++) {
                                                zzidf zzidfVar10 = zzidfVar2;
                                                Object obj4 = obj3;
                                                objZzx2 = zzicfVar2.zzx(obj4, zzicfVar2.zzj[i4], objZzx2, zzidfVar10, obj3);
                                                obj3 = obj4;
                                                zzidfVar2 = zzidfVar10;
                                            }
                                            obj2 = obj3;
                                        }
                                        obj = obj3;
                                        break;
                                }
                            } catch (zzibf unused3) {
                                obj2 = obj3;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            obj2 = obj3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzicfVar = zzicfVar2;
                        obj2 = obj3;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx2 = objZzh;
                    for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                        zzidf zzidfVar11 = zzidfVar2;
                        objZzx2 = zzx(obj, this.zzj[i5], objZzx2, zzidfVar11, obj);
                        zzidfVar2 = zzidfVar11;
                    }
                    obj2 = obj;
                } else {
                    zzicfVar = this;
                    try {
                        if ((!zzicfVar.zzh ? null : zziabVar.zzc(zzicfVar.zzg, iZzb)) != null) {
                            obj3 = obj;
                            zzicfVar2 = zzicfVar;
                            throw null;
                        }
                        if (objZzh == null) {
                            try {
                                objZzh = zzidfVar2.zzh(obj);
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj;
                                i2 = zzicfVar.zzk;
                                objZzx = objZzh;
                                while (i2 < zzicfVar.zzl) {
                                    zzidf zzidfVar12 = zzidfVar2;
                                    objZzx = zzicfVar.zzx(obj2, zzicfVar.zzj[i2], objZzx, zzidfVar12, obj2);
                                    i2++;
                                    zzicfVar = this;
                                    zzidfVar2 = zzidfVar12;
                                }
                                zzidfVar = zzidfVar2;
                                if (objZzx != null) {
                                    throw th;
                                }
                                zzidfVar.zzi(obj2, objZzx);
                                throw th;
                            }
                        }
                        try {
                            if (zzidfVar2.zzk(objZzh, zzicpVar, 0)) {
                                obj3 = obj;
                                obj = obj3;
                            } else {
                                int i6 = zzicfVar.zzk;
                                objZzx2 = objZzh;
                                while (i6 < zzicfVar.zzl) {
                                    zzidf zzidfVar13 = zzidfVar2;
                                    Object obj5 = obj;
                                    objZzx2 = zzicfVar.zzx(obj5, zzicfVar.zzj[i6], objZzx2, zzidfVar13, obj);
                                    zzidfVar2 = zzidfVar13;
                                    i6++;
                                    obj = obj5;
                                }
                                obj3 = obj;
                                obj2 = obj3;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj3 = obj;
                            zzicfVar2 = zzicfVar;
                            th = th;
                            zzicfVar = zzicfVar2;
                            obj2 = obj3;
                            i2 = zzicfVar.zzk;
                            objZzx = objZzh;
                            while (i2 < zzicfVar.zzl) {
                                zzidf zzidfVar14 = zzidfVar2;
                                objZzx = zzicfVar.zzx(obj2, zzicfVar.zzj[i2], objZzx, zzidfVar14, obj2);
                                i2++;
                                zzicfVar = this;
                                zzidfVar2 = zzidfVar14;
                            }
                            zzidfVar = zzidfVar2;
                            if (objZzx != null) {
                                throw th;
                            }
                            zzidfVar.zzi(obj2, objZzx);
                            throw th;
                        }
                    } catch (Throwable th11) {
                        obj3 = obj;
                        th = th11;
                        obj2 = obj3;
                        i2 = zzicfVar.zzk;
                        objZzx = objZzh;
                        while (i2 < zzicfVar.zzl) {
                            zzidf zzidfVar15 = zzidfVar2;
                            objZzx = zzicfVar.zzx(obj2, zzicfVar.zzj[i2], objZzx, zzidfVar15, obj2);
                            i2++;
                            zzicfVar = this;
                            zzidfVar2 = zzidfVar15;
                        }
                        zzidfVar = zzidfVar2;
                        if (objZzx != null) {
                            throw th;
                        }
                        zzidfVar.zzi(obj2, objZzx);
                        throw th;
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                zzicfVar = this;
                obj2 = obj;
            }
        }
        if (objZzx2 != null) {
            zzidfVar2.zzi(obj2, objZzx2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 40761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzi(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzhyz r39) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 4076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzicf.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzhyz):int");
    }

    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzj(Object obj, byte[] bArr, int i2, int i3, zzhyz zzhyzVar) throws IOException {
        zzi(obj, bArr, i2, i3, 0, zzhyzVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzicu
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zziar) {
                zziar zziarVar = (zziar) obj;
                zziarVar.zzbq();
                zziarVar.zzbb();
                zziarVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i2 = 0; i2 < iArr.length; i2 += 3) {
                int iZzA = zzA(i2);
                int i3 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                long j = i3;
                if (iZzC != 9) {
                    if (iZzC != 60 && iZzC != 68) {
                        switch (iZzC) {
                            case 17:
                                if (zzN(obj, i2)) {
                                    zzq(i2).zzk(zzb.getObject(obj, j));
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
                                ((zzibd) zzidm.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzibw) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzP(obj, iArr[i2], i2)) {
                        zzq(i2).zzk(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i2)) {
                    zzq(i2).zzk(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzicu
    public final boolean zzl(Object obj) {
        int i2;
        int i3;
        List list;
        zzicu zzicuVarZzq;
        int i4;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i6 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i8 = iArr[i6];
            int i9 = iArr2[i8];
            int iZzA = zzA(i8);
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
            if ((268435456 & iZzA) != 0 && !zzM(obj, i8, i2, i3, i12)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzM(obj, i8, i2, i3, i12) && !zzy(obj, iZzA, zzq(i8))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zzidm.zzn(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzicuVarZzq = zzq(i8);
                    for (i4 = 0; i4 < list.size(); i4++) {
                        if (!zzicuVarZzq.zzl(list.get(i4))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzP(obj, i9, i8) && !zzy(obj, iZzA, zzq(i8))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zzidm.zzn(obj, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzicuVarZzq = zzq(i8);
                    while (i4 < list.size()) {
                        if (!zzicuVarZzq.zzl(list.get(i4))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzibw zzibwVar = (zzibw) zzidm.zzn(obj, iZzA & 1048575);
                if (!zzibwVar.isEmpty() && ((zzibv) zzr(i8)).zze().zzc.zza() == zzidt.MESSAGE) {
                    zzicu zzicuVarZzb = null;
                    for (Object obj2 : zzibwVar.values()) {
                        if (zzicuVarZzb == null) {
                            zzicuVarZzb = zzicm.zza().zzb(obj2.getClass());
                        }
                        if (!zzicuVarZzb.zzl(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i6++;
            i7 = i2;
            i5 = i3;
        }
        return !this.zzh || ((zzian) obj).zza.zze();
    }
}
