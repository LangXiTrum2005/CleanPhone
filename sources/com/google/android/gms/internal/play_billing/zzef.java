package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i, int i2, zzec zzecVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int iZzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int iZzp = zzp(i);
        long j = 1048575 & iZzp;
        if (j == 1048575) {
            return;
        }
        zzfp.zzq(obj, j, (1 << (iZzp >>> 20)) | zzfp.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfp.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int iZzp = zzp(i);
        long j = iZzp & 1048575;
        if (j != 1048575) {
            return (zzfp.zzc(obj, j) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i);
        long j2 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzb(obj, j2)) != 0;
            case 2:
                return zzfp.zzd(obj, j2) != 0;
            case 3:
                return zzfp.zzd(obj, j2) != 0;
            case 4:
                return zzfp.zzc(obj, j2) != 0;
            case 5:
                return zzfp.zzd(obj, j2) != 0;
            case 6:
                return zzfp.zzc(obj, j2) != 0;
            case 7:
                return zzfp.zzw(obj, j2);
            case 8:
                Object objZzf = zzfp.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzbq) {
                    return !zzbq.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfp.zzf(obj, j2) != null;
            case 10:
                return !zzbq.zzb.equals(zzfp.zzf(obj, j2));
            case 11:
                return zzfp.zzc(obj, j2) != 0;
            case 12:
                return zzfp.zzc(obj, j2) != 0;
            case 13:
                return zzfp.zzc(obj, j2) != 0;
            case 14:
                return zzfp.zzd(obj, j2) != 0;
            case 15:
                return zzfp.zzc(obj, j2) != 0;
            case 16:
                return zzfp.zzd(obj, j2) != 0;
            case 17:
                return zzfp.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzI(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfp.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfp.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzG(i, (String) obj);
        } else {
            zzfxVar.zzd(i, (zzbq) obj);
        }
    }

    public static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar != zzfg.zzc()) {
            return zzfgVar;
        }
        zzfg zzfgVarZzf = zzfg.zzf();
        zzcsVar.zzc = zzfgVarZzf;
        return zzfgVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0268  */
    /* JADX WARN: Code duplicated, block: B:127:0x026e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0284  */
    /* JADX WARN: Code duplicated, block: B:131:0x0287  */
    /* JADX WARN: Code duplicated, block: B:171:0x0351  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ad  */
    public static zzef zzl(Class cls, zzdz zzdzVar, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        char cCharAt2;
        int i10;
        char cCharAt3;
        int i11;
        char cCharAt4;
        int i12;
        char cCharAt5;
        int i13;
        char cCharAt6;
        int i14;
        char cCharAt7;
        int i15;
        char cCharAt8;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        int iObjectFieldOffset3;
        Field fieldZzz;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzz2;
        int i27;
        Object obj2;
        Field fieldZzz3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zzdzVar instanceof zzen)) {
            throw null;
        }
        zzen zzenVar = (zzen) zzdzVar;
        String strZzd = zzenVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (strZzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i34 = iCharAt2 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strZzd.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt2 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            iCharAt = 0;
            i3 = 0;
            i5 = 0;
            i2 = 0;
            i6 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt3 = strZzd.charAt(i33);
            if (iCharAt3 >= 55296) {
                int i37 = iCharAt3 & 8191;
                int i38 = 13;
                while (true) {
                    i15 = i36 + 1;
                    cCharAt8 = strZzd.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i15;
                }
                iCharAt3 = i37 | (cCharAt8 << i38);
                i36 = i15;
            }
            int i39 = i36 + 1;
            int iCharAt4 = strZzd.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    cCharAt7 = strZzd.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                iCharAt4 = i40 | (cCharAt7 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strZzd.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    cCharAt6 = strZzd.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                iCharAt5 = i43 | (cCharAt6 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strZzd.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    cCharAt5 = strZzd.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                iCharAt6 = i46 | (cCharAt5 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            iCharAt = strZzd.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    cCharAt4 = strZzd.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int iCharAt7 = strZzd.charAt(i48);
            if (iCharAt7 >= 55296) {
                int i52 = iCharAt7 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    cCharAt3 = strZzd.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                iCharAt7 = i52 | (cCharAt3 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strZzd.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    cCharAt2 = strZzd.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strZzd.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i8 = i57 + 1;
                    cCharAt = strZzd.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i8;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i8;
            }
            i2 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i60 = iCharAt7;
            i3 = iCharAt5;
            i4 = i60;
            iArr = iArr2;
            i5 = iCharAt6;
            i6 = iCharAt9;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzenVar.zze();
        Class<?> cls2 = zzenVar.zza().getClass();
        int i61 = i6 + i4;
        int i62 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i62];
        int i63 = 0;
        int i64 = 0;
        int i65 = i6;
        int i66 = i61;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = strZzd.charAt(i69);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i16 = i30;
            } else {
                i16 = i67;
            }
            int i71 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = strZzd.charAt(i73);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i17 = i29;
            } else {
                i17 = i71;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i64;
                i63++;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt11 & 2048;
            zzen zzenVar2 = zzenVar;
            if (i75 >= 51) {
                int i77 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i78 = iCharAt12 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i28 = i79 + 1;
                        cCharAt10 = strZzd.charAt(i79);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i78 |= (cCharAt10 & 8191) << i80;
                        i80 += 13;
                        i79 = i28;
                        c2 = 55296;
                    }
                    iCharAt12 = i78 | (cCharAt10 << i80);
                    i24 = i28;
                } else {
                    i24 = i77;
                }
                int i81 = i24;
                int i82 = i75 - 51;
                if (i82 == 9 || i82 == 17) {
                    i25 = i2 + 1;
                    int i83 = i64 / 3;
                    objArr[i83 + i83 + 1] = objArrZze[i2];
                } else {
                    if (i82 == 12) {
                        if (zzenVar2.zzc() == 1 || i76 != 0) {
                            i25 = i2 + 1;
                            int i84 = i64 / 3;
                            objArr[i84 + i84 + 1] = objArrZze[i2];
                        } else {
                            i76 = 0;
                        }
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i26];
                    if (obj instanceof Field) {
                        fieldZzz2 = (Field) obj;
                    } else {
                        fieldZzz2 = zzz(cls2, (String) obj);
                        objArrZze[i26] = fieldZzz2;
                    }
                    int i85 = iCharAt10;
                    int i86 = i76;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    if (obj2 instanceof Field) {
                        fieldZzz3 = (Field) obj2;
                    } else {
                        fieldZzz3 = zzz(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzz3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                    strZzd = strZzd;
                    i20 = i81;
                    i76 = i86;
                    i21 = 0;
                    i18 = i85;
                }
                i2 = i25;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrZze[i26];
                if (obj instanceof Field) {
                    fieldZzz2 = (Field) obj;
                } else {
                    fieldZzz2 = zzz(cls2, (String) obj);
                    objArrZze[i26] = fieldZzz2;
                }
                int i87 = iCharAt10;
                int i88 = i76;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzz2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                if (obj2 instanceof Field) {
                    fieldZzz3 = (Field) obj2;
                } else {
                    fieldZzz3 = zzz(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzz3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz3);
                strZzd = strZzd;
                i20 = i81;
                i76 = i88;
                i21 = 0;
                i18 = i87;
            } else {
                i18 = iCharAt10;
                int i89 = i2 + 1;
                Field fieldZzz4 = zzz(cls2, (String) objArrZze[i2]);
                if (i75 == 9 || i75 == 17) {
                    int i90 = i64 / 3;
                    objArr[i90 + i90 + 1] = fieldZzz4.getType();
                } else {
                    if (i75 != 27) {
                        if (i75 == 49) {
                            i23 = i2 + 2;
                            i22 = 1;
                        } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                            i18 = i18;
                            if (zzenVar2.zzc() == 1 || i76 != 0) {
                                i23 = i2 + 2;
                                int i91 = i64 / 3;
                                objArr[i91 + i91 + 1] = objArrZze[i89];
                                i19 = i23;
                            } else {
                                i19 = i89;
                                i76 = 0;
                            }
                        } else if (i75 == 50) {
                            i19 = i2 + 2;
                            int i92 = i65 + 1;
                            iArr[i65] = i64;
                            int i93 = i64 / 3;
                            int i94 = i93 + i93;
                            objArr[i94] = objArrZze[i89];
                            if (i76 != 0) {
                                objArr[i94 + 1] = objArrZze[i19];
                                i19 = i2 + 3;
                                i65 = i92;
                                i18 = i18;
                            } else {
                                i65 = i92;
                                i76 = 0;
                                i18 = i18;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                        iCharAt11 = iCharAt11;
                        if ((iCharAt11 & 4096) != 0 || i75 > 17) {
                            i20 = i17;
                            iObjectFieldOffset2 = 1048575;
                            i21 = 0;
                        } else {
                            int i95 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i96 = iCharAt13 & 8191;
                                int i97 = 13;
                                while (true) {
                                    i20 = i95 + 1;
                                    cCharAt9 = strZzd.charAt(i95);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i96 |= (cCharAt9 & 8191) << i97;
                                    i97 += 13;
                                    i95 = i20;
                                }
                                iCharAt13 = i96 | (cCharAt9 << i97);
                            } else {
                                i20 = i95;
                            }
                            int i98 = i7 + i7 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i98];
                            if (obj3 instanceof Field) {
                                fieldZzz = (Field) obj3;
                            } else {
                                fieldZzz = zzz(cls2, (String) obj3);
                                objArrZze[i98] = fieldZzz;
                            }
                            i21 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzz);
                        }
                        if (i75 >= 18 && i75 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        iObjectFieldOffset3 = iObjectFieldOffset;
                        i2 = i19;
                    } else {
                        i22 = 1;
                        i23 = i2 + 2;
                    }
                    int i99 = i64 / 3;
                    objArr[i99 + i99 + i22] = objArrZze[i89];
                    i19 = i23;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                    iCharAt11 = iCharAt11;
                    if ((iCharAt11 & 4096) != 0) {
                        i20 = i17;
                        iObjectFieldOffset2 = 1048575;
                        i21 = 0;
                    } else {
                        i20 = i17;
                        iObjectFieldOffset2 = 1048575;
                        i21 = 0;
                    }
                    if (i75 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    iObjectFieldOffset3 = iObjectFieldOffset;
                    i2 = i19;
                }
                i19 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzz4);
                iCharAt11 = iCharAt11;
                if ((iCharAt11 & 4096) != 0) {
                    i20 = i17;
                    iObjectFieldOffset2 = 1048575;
                    i21 = 0;
                } else {
                    i20 = i17;
                    iObjectFieldOffset2 = 1048575;
                    i21 = 0;
                }
                if (i75 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                iObjectFieldOffset3 = iObjectFieldOffset;
                i2 = i19;
            }
            int i100 = i64 + 1;
            iArr3[i64] = i18;
            int i101 = i64 + 2;
            iArr3[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i76 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset3;
            i64 += 3;
            iArr3[i101] = (i21 << 20) | iObjectFieldOffset2;
            i33 = i20;
            zzenVar = zzenVar2;
            strZzd = strZzd;
            length = length;
            c = 55296;
        }
        zzen zzenVar3 = zzenVar;
        return new zzef(iArr3, objArr, i3, i5, zzenVar3.zza(), zzenVar3.zzc(), false, iArr, i6, i61, zzeiVar, zzdqVar, zzffVar, zzceVar, zzdxVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfp.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfp.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfp.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfp.zzf(obj, j)).longValue();
    }

    private final zzcw zzu(int i) {
        int i2 = i / 3;
        return (zzcw) this.zzd[i2 + i2 + 1];
    }

    private final zzeo zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzeo zzeoVar = (zzeo) objArr[i3];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzeoVarZzb = zzel.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzeoVarZzb;
        return zzeoVarZzb;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzeo zzeoVarZzv = zzv(i);
        int iZzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i, int i2) {
        zzeo zzeoVarZzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:142:0x038a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0481  */
    /* JADX WARN: Code duplicated, block: B:282:0x071e A[PHI: r0 r1
  0x071e: PHI (r0v2 com.google.android.gms.internal.play_billing.zzef<T>) = 
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v33 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v42 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
 binds: [B:18:0x004f, B:280:0x0714, B:250:0x0650, B:234:0x05e9, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]
  0x071e: PHI (r1v6 java.lang.Object) = 
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v7 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
  (r1v1 java.lang.Object)
 binds: [B:18:0x004f, B:280:0x0714, B:250:0x0650, B:234:0x05e9, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zza(Object obj) {
        int i;
        int iZzw;
        int iZzw2;
        int iZzw3;
        int iZzx;
        int iZzw4;
        int iZzw5;
        int iZzw6;
        int iZzd;
        int iZzw7;
        int iZzh;
        int i2;
        int iZzg;
        int size;
        int iZzl;
        int iZzw8;
        int iZzw9;
        int iZzw10;
        int iZzx2;
        int iZze;
        int iZzw11;
        int iZzw12;
        int iZzt;
        int iZzw13;
        int iZzw14;
        int iZzd2;
        int iZzw15;
        zzef<T> zzefVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < zzefVar.zzc.length) {
            int iZzs = zzefVar.zzs(i4);
            int iZzr = zzr(iZzs);
            int[] iArr = zzefVar.zzc;
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & i3;
            if (iZzr <= 17) {
                if (i10 != i7) {
                    i5 = i10 == i3 ? 0 : unsafe.getInt(obj2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iZzs & i3;
            if (iZzr >= zzcj.zzJ.zza()) {
                zzcj.zzW.zza();
            }
            int i12 = i6;
            long j = i11;
            switch (iZzr) {
                case 0:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzw = zzby.zzw(i8 << 3);
                        iZzh = iZzw + 8;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzw2 = zzby.zzw(i8 << 3);
                        iZzw5 = iZzw2 + 4;
                        i6 = i12 + iZzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        iZzw3 = zzby.zzw(i8 << 3);
                        iZzx = zzby.zzx(j2);
                        i2 = iZzw3 + iZzx;
                        i6 = i12 + i2;
                        zzefVar = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        iZzw3 = zzby.zzw(i8 << 3);
                        iZzx = zzby.zzx(j3);
                        i2 = iZzw3 + iZzx;
                        i6 = i12 + i2;
                        zzefVar = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        iZzw3 = zzby.zzw(i8 << 3);
                        iZzx = zzby.zzx(j4);
                        i2 = iZzw3 + iZzx;
                        i6 = i12 + i2;
                        zzefVar = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzw4 = zzby.zzw(i8 << 3);
                        iZzw5 = iZzw4 + 8;
                        i6 = i12 + iZzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzw2 = zzby.zzw(i8 << 3);
                        iZzw5 = iZzw2 + 4;
                        i6 = i12 + iZzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzw5 = zzby.zzw(i8 << 3) + 1;
                        i6 = i12 + iZzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        int i13 = i8 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzbq) {
                            iZzw6 = zzby.zzw(i13);
                            iZzd = ((zzbq) object).zzd();
                            iZzw7 = zzby.zzw(iZzd);
                            i2 = iZzw6 + iZzw7 + iZzd;
                            i6 = i12 + i2;
                            zzefVar = this;
                            i4 += 3;
                            i3 = 1048575;
                        } else {
                            iZzw3 = zzby.zzw(i13);
                            iZzx = zzby.zzv((String) object);
                            i2 = iZzw3 + iZzx;
                            i6 = i12 + i2;
                            zzefVar = this;
                            i4 += 3;
                            i3 = 1048575;
                        }
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzh = zzeq.zzh(i8, unsafe.getObject(obj2, j), zzefVar.zzv(i4));
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        zzbq zzbqVar = (zzbq) unsafe.getObject(obj2, j);
                        iZzw6 = zzby.zzw(i8 << 3);
                        iZzd = zzbqVar.zzd();
                        iZzw7 = zzby.zzw(iZzd);
                        i2 = iZzw6 + iZzw7 + iZzd;
                        i6 = i12 + i2;
                        zzefVar = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(obj2, j);
                        iZzw3 = zzby.zzw(i8 << 3);
                        iZzx = zzby.zzw(i14);
                        i2 = iZzw3 + iZzx;
                        i6 = i12 + i2;
                        zzefVar = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        iZzw3 = zzby.zzw(i8 << 3);
                        iZzx = zzby.zzx(j5);
                        i2 = iZzw3 + iZzx;
                        i6 = i12 + i2;
                        zzefVar = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzw2 = zzby.zzw(i8 << 3);
                        iZzw5 = iZzw2 + 4;
                        i6 = i12 + iZzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzw4 = zzby.zzw(i8 << 3);
                        iZzw5 = iZzw4 + 8;
                        i6 = i12 + iZzw5;
                        zzefVar = this;
                        obj2 = obj;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    obj2 = obj;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        iZzw3 = zzby.zzw(i8 << 3);
                        iZzx = zzby.zzw((i15 >> 31) ^ (i15 + i15));
                        i2 = iZzw3 + iZzx;
                        i6 = i12 + i2;
                        zzefVar = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        iZzw3 = zzby.zzw(i8 << 3);
                        iZzx = zzby.zzx((j6 >> 63) ^ (j6 + j6));
                        i2 = iZzw3 + iZzx;
                        i6 = i12 + i2;
                        zzefVar = this;
                        i4 += 3;
                        i3 = 1048575;
                    }
                    zzefVar = this;
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (zzefVar.zzJ(obj2, i4, i7, i5, i)) {
                        iZzh = zzby.zzt(i8, (zzec) unsafe.getObject(obj2, j), zzefVar.zzv(i4));
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    iZzh = zzeq.zzd(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    iZzh = zzeq.zzb(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i16 = zzeq.zza;
                    if (list.size() == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzeq.zzg(list) + (list.size() * zzby.zzw(i8 << 3));
                    }
                    i6 = iZzg + i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i17 = zzeq.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzeq.zzl(list2);
                        iZzw8 = zzby.zzw(i8 << 3);
                        iZzx2 = size * iZzw8;
                        iZzh = iZzl + iZzx2;
                    }
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzeq.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzeq.zzf(list3);
                        iZzw8 = zzby.zzw(i8 << 3);
                        iZzx2 = size * iZzw8;
                        iZzh = iZzl + iZzx2;
                    }
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    iZzh = zzeq.zzd(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    iZzh = zzeq.zzb(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzeq.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = size2 * (zzby.zzw(i8 << 3) + 1);
                    }
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzeq.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzg = 0;
                    } else {
                        iZzg = zzby.zzw(i8 << 3) * size3;
                        if (list5 instanceof zzdk) {
                            zzdk zzdkVar = (zzdk) list5;
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object objZzf = zzdkVar.zzf(i21);
                                if (objZzf instanceof zzbq) {
                                    int iZzd3 = ((zzbq) objZzf).zzd();
                                    iZzg += zzby.zzw(iZzd3) + iZzd3;
                                } else {
                                    iZzg += zzby.zzv((String) objZzf);
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object obj3 = list5.get(i22);
                                if (obj3 instanceof zzbq) {
                                    int iZzd4 = ((zzbq) obj3).zzd();
                                    iZzg += zzby.zzw(iZzd4) + iZzd4;
                                } else {
                                    iZzg += zzby.zzv((String) obj3);
                                }
                            }
                        }
                    }
                    i6 = iZzg + i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzeo zzeoVarZzv = zzefVar.zzv(i4);
                    int i23 = zzeq.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzw9 = 0;
                    } else {
                        iZzw9 = zzby.zzw(i8 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            Object obj4 = list6.get(i24);
                            if (obj4 instanceof zzdi) {
                                int iZza = ((zzdi) obj4).zza();
                                iZzw9 += zzby.zzw(iZza) + iZza;
                            } else {
                                iZzw9 += zzby.zzu((zzec) obj4, zzeoVarZzv);
                            }
                        }
                    }
                    i6 = i12 + iZzw9;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i25 = zzeq.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzw10 = 0;
                    } else {
                        iZzw10 = size5 * zzby.zzw(i8 << 3);
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int iZzd5 = ((zzbq) list7.get(i26)).zzd();
                            iZzw10 += zzby.zzw(iZzd5) + iZzd5;
                        }
                    }
                    i6 = i12 + iZzw10;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzeq.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzeq.zzk(list8);
                        iZzw8 = zzby.zzw(i8 << 3);
                        iZzx2 = size * iZzw8;
                        iZzh = iZzl + iZzx2;
                    }
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzeq.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzeq.zza(list9);
                        iZzw8 = zzby.zzw(i8 << 3);
                        iZzx2 = size * iZzw8;
                        iZzh = iZzl + iZzx2;
                    }
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    iZzh = zzeq.zzb(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    iZzh = zzeq.zzd(i8, (List) unsafe.getObject(obj2, j), false);
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzeq.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzeq.zzi(list10);
                        iZzw8 = zzby.zzw(i8 << 3);
                        iZzx2 = size * iZzw8;
                        iZzh = iZzl + iZzx2;
                    }
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzeq.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzh = 0;
                    } else {
                        iZzl = zzeq.zzj(list11);
                        iZzw8 = zzby.zzw(i8 << 3);
                        iZzx2 = size * iZzw8;
                        iZzh = iZzl + iZzx2;
                    }
                    i6 = i12 + iZzh;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    iZze = zzeq.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 36:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    iZze = zzeq.zzg((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    iZze = zzeq.zzl((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    iZze = zzeq.zzf((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    iZze = zzeq.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzeq.zza;
                    iZze = list12.size();
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    iZze = zzeq.zzk((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    iZze = zzeq.zza((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    iZze = zzeq.zzc((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 46:
                    iZze = zzeq.zze((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 47:
                    iZze = zzeq.zzi((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 48:
                    iZze = zzeq.zzj((List) unsafe.getObject(obj2, j));
                    if (iZze > 0) {
                        iZzw11 = zzby.zzw(i8 << 3);
                        iZzw12 = zzby.zzw(iZze);
                        iZzw10 = iZzw11 + iZzw12 + iZze;
                        i6 = i12 + iZzw10;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzeo zzeoVarZzv2 = zzefVar.zzv(i4);
                    int i32 = zzeq.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzt = 0;
                    } else {
                        iZzt = 0;
                        for (int i33 = 0; i33 < size6; i33++) {
                            iZzt += zzby.zzt(i8, (zzec) list13.get(i33), zzeoVarZzv2);
                        }
                    }
                    i6 = i12 + iZzt;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 50:
                    zzdw zzdwVar = (zzdw) unsafe.getObject(obj2, j);
                    if (!zzdwVar.isEmpty()) {
                        Iterator it = zzdwVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 51:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzw = zzby.zzw(i8 << 3);
                        iZzh = iZzw + 8;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 52:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzw13 = zzby.zzw(i8 << 3);
                        iZzh = iZzw13 + 4;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        long jZzt = zzt(obj2, j);
                        iZzl = zzby.zzw(i8 << 3);
                        iZzx2 = zzby.zzx(jZzt);
                        iZzh = iZzl + iZzx2;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        long jZzt2 = zzt(obj2, j);
                        iZzl = zzby.zzw(i8 << 3);
                        iZzx2 = zzby.zzx(jZzt2);
                        iZzh = iZzl + iZzx2;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        long jZzo = zzo(obj2, j);
                        iZzl = zzby.zzw(i8 << 3);
                        iZzx2 = zzby.zzx(jZzo);
                        iZzh = iZzl + iZzx2;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzw = zzby.zzw(i8 << 3);
                        iZzh = iZzw + 8;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzw13 = zzby.zzw(i8 << 3);
                        iZzh = iZzw13 + 4;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzh = zzby.zzw(i8 << 3) + 1;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        int i34 = i8 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzbq) {
                            iZzw14 = zzby.zzw(i34);
                            iZzd2 = ((zzbq) object2).zzd();
                            iZzw15 = zzby.zzw(iZzd2);
                            iZzh = iZzw14 + iZzw15 + iZzd2;
                            i6 = i12 + iZzh;
                        } else {
                            iZzl = zzby.zzw(i34);
                            iZzx2 = zzby.zzv((String) object2);
                            iZzh = iZzl + iZzx2;
                            i6 = i12 + iZzh;
                        }
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzh = zzeq.zzh(i8, unsafe.getObject(obj2, j), zzefVar.zzv(i4));
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        zzbq zzbqVar2 = (zzbq) unsafe.getObject(obj2, j);
                        iZzw14 = zzby.zzw(i8 << 3);
                        iZzd2 = zzbqVar2.zzd();
                        iZzw15 = zzby.zzw(iZzd2);
                        iZzh = iZzw14 + iZzw15 + iZzd2;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        int iZzo = zzo(obj2, j);
                        iZzl = zzby.zzw(i8 << 3);
                        iZzx2 = zzby.zzw(iZzo);
                        iZzh = iZzl + iZzx2;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        long jZzo2 = zzo(obj2, j);
                        iZzl = zzby.zzw(i8 << 3);
                        iZzx2 = zzby.zzx(jZzo2);
                        iZzh = iZzl + iZzx2;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzw13 = zzby.zzw(i8 << 3);
                        iZzh = iZzw13 + 4;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzw = zzby.zzw(i8 << 3);
                        iZzh = iZzw + 8;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        int iZzo2 = zzo(obj2, j);
                        iZzl = zzby.zzw(i8 << 3);
                        iZzx2 = zzby.zzw((iZzo2 >> 31) ^ (iZzo2 + iZzo2));
                        iZzh = iZzl + iZzx2;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        long jZzt3 = zzt(obj2, j);
                        iZzl = zzby.zzw(i8 << 3);
                        iZzx2 = zzby.zzx((jZzt3 >> 63) ^ (jZzt3 + jZzt3));
                        iZzh = iZzl + iZzx2;
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (zzefVar.zzM(obj2, i8, i4)) {
                        iZzh = zzby.zzt(i8, (zzec) unsafe.getObject(obj2, j), zzefVar.zzv(i4));
                        i6 = i12 + iZzh;
                    } else {
                        i6 = i12;
                    }
                    i4 += 3;
                    i3 = 1048575;
                    break;
                default:
                    i6 = i12;
                    i4 += 3;
                    i3 = 1048575;
                    break;
            }
        }
        zzff zzffVar = zzefVar.zzm;
        int iZza2 = i6 + zzffVar.zza(zzffVar.zzd(obj2));
        if (!zzefVar.zzh) {
            return iZza2;
        }
        zzci zzciVarZzb = zzefVar.zzn.zzb(obj2);
        int iZzb = 0;
        for (int i35 = 0; i35 < zzciVarZzb.zza.zzb(); i35++) {
            Map.Entry entryZzg = zzciVarZzb.zza.zzg(i35);
            iZzb += zzci.zzb((zzch) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzciVarZzb.zza.zzc()) {
            iZzb += zzci.zzb((zzch) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int iZzs = zzs(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & iZzs;
            int iZzr = zzr(iZzs);
            int i6 = iArr[i4];
            long j = i5;
            int iHashCode = 37;
            switch (iZzr) {
                case 0:
                    i = i3 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzfp.zza(obj, j));
                    byte[] bArr = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzfp.zzb(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr2 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr3 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr4 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    iFloatToIntBits = zzda.zza(zzfp.zzw(obj, j));
                    i3 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objZzf = zzfp.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr5 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzc(obj, j);
                    i3 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    jDoubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr6 = zzda.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i3 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objZzf2 = zzfp.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i3 = i2 + iHashCode;
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
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i3 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzda.zza(zzN(obj, j));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzo(obj, j);
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        jDoubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzda.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i3 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzM(obj, i6, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i3 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i3 * 53) + this.zzm.zzd(obj).hashCode();
        return this.zzh ? (iHashCode2 * 53) + this.zzn.zzb(obj).zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 38061. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.play_billing.zzbc r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbc):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzcs) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzu(Integer.MAX_VALUE);
                zzcsVar.zza = 0;
                zzcsVar.zzs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzs = zzs(i);
                int i2 = 1048575 & iZzs;
                int iZzr = zzr(iZzs);
                long j = i2;
                if (iZzr != 9) {
                    if (iZzr != 60 && iZzr != 68) {
                        switch (iZzr) {
                            case 17:
                                if (zzI(obj, i)) {
                                    zzv(i).zzf(zzb.getObject(obj, j));
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
                                this.zzl.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzdw) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzd(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            int i2 = 1048575 & iZzs;
            int[] iArr = this.zzc;
            int iZzr = zzr(iZzs);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfp.zzo(obj, j, zzfp.zza(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 1:
                    if (zzI(obj2, i)) {
                        zzfp.zzp(obj, j, zzfp.zzb(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 2:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 3:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 4:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 5:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 6:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 7:
                    if (zzI(obj2, i)) {
                        zzfp.zzm(obj, j, zzfp.zzw(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 8:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 11:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 12:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 13:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 14:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 15:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 16:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i);
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzeq.zza;
                    zzfp.zzs(obj, j, zzdx.zza(zzfp.zzf(obj, j), zzfp.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbc zzbcVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzi(Object obj, zzfx zzfxVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        int i2;
        int i3;
        int i4;
        zzef<T> zzefVar = this;
        if (zzefVar.zzh) {
            zzci zzciVarZzb = zzefVar.zzn.zzb(obj);
            if (zzciVarZzb.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzciVarZzb.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzefVar.zzc;
        Unsafe unsafe = zzb;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (i5 < iArr.length) {
            int iZzs = zzefVar.zzs(i5);
            int[] iArr2 = zzefVar.zzc;
            int iZzr = zzr(iZzs);
            int i8 = iArr2[i5];
            if (iZzr <= 17) {
                int i9 = iArr2[i5 + 2];
                int i10 = i9 & 1048575;
                if (i10 != i6) {
                    i = 1;
                    i7 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i6 = i10;
                } else {
                    i = 1;
                }
                i2 = i6;
                i3 = i7;
                i4 = i << (i9 >>> 20);
            } else {
                i = 1;
                i2 = i6;
                i3 = i7;
                i4 = 0;
            }
            while (entry != null && zzefVar.zzn.zza(entry) <= i8) {
                zzefVar.zzn.zze(zzfxVar, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzs & 1048575;
            switch (iZzr) {
                case 0:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzf(i8, zzfp.zza(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 1:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzo(i8, zzfp.zzb(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 2:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzt(i8, unsafe.getLong(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 3:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzK(i8, unsafe.getLong(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 4:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzr(i8, unsafe.getInt(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 5:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzm(i8, unsafe.getLong(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 6:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 7:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzb(i8, zzfp.zzw(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 8:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzO(i8, unsafe.getObject(obj, j), zzfxVar);
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 9:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzv(i8, unsafe.getObject(obj, j), zzefVar.zzv(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 10:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzd(i8, (zzbq) unsafe.getObject(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 11:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzI(i8, unsafe.getInt(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 12:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 13:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzx(i8, unsafe.getInt(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 14:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzz(i8, unsafe.getLong(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 15:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzB(i8, unsafe.getInt(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 16:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzD(i8, unsafe.getLong(obj, j));
                    }
                    zzefVar = this;
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 17:
                    if (zzefVar.zzJ(obj, i5, i2, i3, i4)) {
                        zzfxVar.zzq(i8, unsafe.getObject(obj, j), zzefVar.zzv(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 18:
                    zzeq.zzt(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 19:
                    zzeq.zzx(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 20:
                    zzeq.zzz(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 21:
                    zzeq.zzF(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 22:
                    zzeq.zzy(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 23:
                    zzeq.zzw(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 24:
                    zzeq.zzv(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 25:
                    zzeq.zzs(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 26:
                    int i11 = zzefVar.zzc[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzeq.zza;
                    if (list != null && !list.isEmpty()) {
                        zzfxVar.zzH(i11, list);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 27:
                    int i13 = zzefVar.zzc[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv = zzefVar.zzv(i5);
                    int i14 = zzeq.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            ((zzbz) zzfxVar).zzv(i13, list2.get(i15), zzeoVarZzv);
                        }
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 28:
                    int i16 = zzefVar.zzc[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzeq.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzfxVar.zze(i16, list3);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 29:
                    zzeq.zzE(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 30:
                    zzeq.zzu(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 31:
                    zzeq.zzA(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 32:
                    zzeq.zzB(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 33:
                    zzeq.zzC(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 34:
                    zzeq.zzD(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, false);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 35:
                    zzeq.zzt(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 36:
                    zzeq.zzx(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 37:
                    zzeq.zzz(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 38:
                    zzeq.zzF(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 39:
                    zzeq.zzy(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 40:
                    zzeq.zzw(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 41:
                    zzeq.zzv(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 42:
                    zzeq.zzs(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 43:
                    zzeq.zzE(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 44:
                    zzeq.zzu(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 45:
                    zzeq.zzA(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 46:
                    zzeq.zzB(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 47:
                    zzeq.zzC(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 48:
                    zzeq.zzD(zzefVar.zzc[i5], (List) unsafe.getObject(obj, j), zzfxVar, i);
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 49:
                    int i18 = zzefVar.zzc[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzeo zzeoVarZzv2 = zzefVar.zzv(i5);
                    int i19 = zzeq.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            ((zzbz) zzfxVar).zzq(i18, list4.get(i20), zzeoVarZzv2);
                        }
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 51:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzf(i8, zzm(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 52:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzo(i8, zzn(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 53:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzt(i8, zzt(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 54:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzK(i8, zzt(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 55:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzr(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 56:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzm(i8, zzt(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 57:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzk(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 58:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzb(i8, zzN(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 59:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzO(i8, unsafe.getObject(obj, j), zzfxVar);
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 60:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzv(i8, unsafe.getObject(obj, j), zzefVar.zzv(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 61:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzd(i8, (zzbq) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 62:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzI(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 63:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzi(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 64:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzx(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 65:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzz(i8, zzt(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 66:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzB(i8, zzo(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 67:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzD(i8, zzt(obj, j));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                case 68:
                    if (zzefVar.zzM(obj, i8, i5)) {
                        zzfxVar.zzq(i8, unsafe.getObject(obj, j), zzefVar.zzv(i5));
                    }
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
                default:
                    i5 += 3;
                    i7 = i3;
                    i6 = i2;
                    entry = entry;
                    break;
            }
        }
        while (entry != null) {
            zzefVar.zzn.zze(zzfxVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        zzff zzffVar = zzefVar.zzm;
        zzffVar.zzj(zzffVar.zzd(obj), zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzs = zzs(i);
            long j = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i) || Double.doubleToLongBits(zzfp.zza(obj, j)) != Double.doubleToLongBits(zzfp.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i) || Float.floatToIntBits(zzfp.zzb(obj, j)) != Float.floatToIntBits(zzfp.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i) || zzfp.zzw(obj, j) != zzfp.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i) || zzfp.zzc(obj, j) != zzfp.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i) || zzfp.zzd(obj, j) != zzfp.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
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
                    zZzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case 50:
                    zZzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzp = zzp(i) & 1048575;
                    if (zzfp.zzc(obj, jZzp) != zzfp.zzc(obj2, jZzp) || !zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
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
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzeo zzeoVarZzv;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr2[i7];
            int iZzs = zzs(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i6;
                i2 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & iZzs) != 0 && !zzJ(obj2, i7, i, i2, i11)) {
                return false;
            }
            int iZzr = zzr(iZzs);
            if (iZzr == 9 || iZzr == 17) {
                if (zzJ(obj2, i7, i, i2, i11) && !zzK(obj2, iZzs, zzv(i7))) {
                    return false;
                }
            } else if (iZzr == 27) {
                list = (List) zzfp.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzeoVarZzv = zzv(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzeoVarZzv.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzr == 60 || iZzr == 68) {
                if (zzM(obj2, i8, i7) && !zzK(obj2, iZzs, zzv(i7))) {
                    return false;
                }
            } else if (iZzr == 49) {
                list = (List) zzfp.zzf(obj2, iZzs & 1048575);
                if (list.isEmpty()) {
                    zzeoVarZzv = zzv(i7);
                    while (i3 < list.size()) {
                        if (!zzeoVarZzv.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzr == 50 && !((zzdw) zzfp.zzf(obj2, iZzs & 1048575)).isEmpty()) {
                throw null;
            }
            i4++;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzn.zzb(obj).zzj();
    }
}
