package com.google.android.gms.internal.auth;

import androidx.datastore.preferences.protobuf.a;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i2, int i3, zzfw zzfwVar, boolean z2, boolean z3, int[] iArr2, int i4, int i5, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbQ = a.q("Field ", str, " for ", name, " not found. Known fields are ");
            sbQ.append(string);
            throw new RuntimeException(sbQ.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i2) {
        long jZzv = zzv(i2) & 1048575;
        if (zzG(obj2, i2)) {
            Object objZzf = zzhi.zzf(obj, jZzv);
            Object objZzf2 = zzhi.zzf(obj2, jZzv);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, jZzv, zzez.zzg(objZzf, objZzf2));
                zzD(obj, i2);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, jZzv, objZzf2);
                zzD(obj, i2);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i2) {
        int iZzv = zzv(i2);
        int i3 = this.zzc[i2];
        long j = iZzv & 1048575;
        if (zzJ(obj2, i3, i2)) {
            Object objZzf = zzJ(obj, i3, i2) ? zzhi.zzf(obj, j) : null;
            Object objZzf2 = zzhi.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzhi.zzp(obj, j, zzez.zzg(objZzf, objZzf2));
                zzE(obj, i3, i2);
            } else if (objZzf2 != null) {
                zzhi.zzp(obj, j, objZzf2);
                zzE(obj, i3, i2);
            }
        }
    }

    private final void zzD(Object obj, int i2) {
        int iZzs = zzs(i2);
        long j = 1048575 & iZzs;
        if (j == 1048575) {
            return;
        }
        zzhi.zzn(obj, j, (1 << (iZzs >>> 20)) | zzhi.zzc(obj, j));
    }

    private final void zzE(Object obj, int i2, int i3) {
        zzhi.zzn(obj, zzs(i3) & 1048575, i2);
    }

    private final boolean zzF(Object obj, Object obj2, int i2) {
        return zzG(obj, i2) == zzG(obj2, i2);
    }

    private final boolean zzG(Object obj, int i2) {
        int iZzs = zzs(i2);
        long j = iZzs & 1048575;
        if (j != 1048575) {
            return (zzhi.zzc(obj, j) & (1 << (iZzs >>> 20))) != 0;
        }
        int iZzv = zzv(i2);
        long j2 = iZzv & 1048575;
        switch (zzu(iZzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j2)) != 0;
            case 2:
                return zzhi.zzd(obj, j2) != 0;
            case 3:
                return zzhi.zzd(obj, j2) != 0;
            case 4:
                return zzhi.zzc(obj, j2) != 0;
            case 5:
                return zzhi.zzd(obj, j2) != 0;
            case 6:
                return zzhi.zzc(obj, j2) != 0;
            case 7:
                return zzhi.zzt(obj, j2);
            case 8:
                Object objZzf = zzhi.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzee) {
                    return !zzee.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j2) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j2));
            case 11:
                return zzhi.zzc(obj, j2) != 0;
            case 12:
                return zzhi.zzc(obj, j2) != 0;
            case 13:
                return zzhi.zzc(obj, j2) != 0;
            case 14:
                return zzhi.zzd(obj, j2) != 0;
            case 15:
                return zzhi.zzc(obj, j2) != 0;
            case 16:
                return zzhi.zzd(obj, j2) != 0;
            case 17:
                return zzhi.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return zzG(obj, i2);
        }
        return (i4 & i5) != 0;
    }

    private static boolean zzI(Object obj, int i2, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i2 & 1048575));
    }

    private final boolean zzJ(Object obj, int i2, int i3) {
        return zzhi.zzc(obj, (long) (zzs(i3) & 1048575)) == i2;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzgzVarZzc = zzgz.zzc();
        zzeuVar.zzc = zzgzVarZzc;
        return zzgzVarZzc;
    }

    public static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0263  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:129:0x027e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0371  */
    public static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i2;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Field fieldZzA;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        Object obj;
        Field fieldZzA2;
        int i25;
        Object obj2;
        Field fieldZzA3;
        int i26;
        char cCharAt10;
        int i27;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        boolean z2 = zzggVar.zzc() == 2;
        String strZzd = zzggVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i2 = i31 + 1;
                if (strZzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i2;
            }
        } else {
            i2 = 1;
        }
        int i32 = i2 + 1;
        int iCharAt5 = strZzd.charAt(i2);
        if (iCharAt5 >= 55296) {
            int i33 = iCharAt5 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = strZzd.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt5 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i4 = 0;
            iCharAt4 = 0;
            i3 = 0;
            iArr = zza;
            i5 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt6 = strZzd.charAt(i32);
            if (iCharAt6 >= 55296) {
                int i36 = iCharAt6 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    cCharAt8 = strZzd.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                iCharAt6 = i36 | (cCharAt8 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int iCharAt7 = strZzd.charAt(i35);
            if (iCharAt7 >= 55296) {
                int i39 = iCharAt7 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    cCharAt7 = strZzd.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                iCharAt7 = i39 | (cCharAt7 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            iCharAt = strZzd.charAt(i38);
            if (iCharAt >= 55296) {
                int i42 = iCharAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    cCharAt6 = strZzd.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                iCharAt = i42 | (cCharAt6 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            iCharAt2 = strZzd.charAt(i41);
            if (iCharAt2 >= 55296) {
                int i45 = iCharAt2 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    cCharAt5 = strZzd.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                iCharAt2 = i45 | (cCharAt5 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            iCharAt3 = strZzd.charAt(i44);
            if (iCharAt3 >= 55296) {
                int i48 = iCharAt3 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    cCharAt4 = strZzd.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                iCharAt3 = i48 | (cCharAt4 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int iCharAt8 = strZzd.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    cCharAt3 = strZzd.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                iCharAt8 = i51 | (cCharAt3 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int iCharAt9 = strZzd.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    cCharAt2 = strZzd.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                iCharAt9 = i54 | (cCharAt2 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            iCharAt4 = strZzd.charAt(i53);
            if (iCharAt4 >= 55296) {
                int i57 = iCharAt4 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    cCharAt = strZzd.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                iCharAt4 = i57 | (cCharAt << i58);
                i56 = i6;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i3 = iCharAt6 + iCharAt6 + iCharAt7;
            i4 = iCharAt8;
            iArr = iArr2;
            i5 = iCharAt6;
            i32 = i56;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 + iCharAt3];
        int i59 = i4 + iCharAt4;
        int i60 = i59;
        int i61 = iCharAt4;
        int i62 = 0;
        int i63 = 0;
        while (i32 < length) {
            int i64 = i32 + 1;
            int iCharAt10 = strZzd.charAt(i32);
            if (iCharAt10 >= c2) {
                int i65 = iCharAt10 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i29 = i66 + 1;
                    cCharAt12 = strZzd.charAt(i66);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i65 |= (cCharAt12 & 8191) << i67;
                    i67 += 13;
                    i66 = i29;
                }
                iCharAt10 = i65 | (cCharAt12 << i67);
                i14 = i29;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int iCharAt11 = strZzd.charAt(i14);
            if (iCharAt11 >= c2) {
                int i69 = iCharAt11 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i28 = i70 + 1;
                    cCharAt11 = strZzd.charAt(i70);
                    i15 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt11 & 8191) << i71;
                    i71 += 13;
                    i70 = i28;
                    length = i15;
                }
                iCharAt11 = i69 | (cCharAt11 << i71);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            if (i72 >= 51) {
                int i73 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i74 = iCharAt12 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i26 = i75 + 1;
                        cCharAt10 = strZzd.charAt(i75);
                        i27 = i74;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i74 = i27 | ((cCharAt10 & 8191) << i76);
                        i76 += 13;
                        i75 = i26;
                    }
                    iCharAt12 = i27 | (cCharAt10 << i76);
                    i22 = i26;
                } else {
                    i22 = i73;
                }
                int i77 = iCharAt12;
                int i78 = i72 - 51;
                int i79 = i22;
                if (i78 == 9 || i78 == 17) {
                    int i80 = i62 / 3;
                    i23 = i3 + 1;
                    objArr[i80 + i80 + 1] = objArrZze[i3];
                } else {
                    if (i78 == 12 && !z2) {
                        int i81 = i62 / 3;
                        i23 = i3 + 1;
                        objArr[i81 + i81 + 1] = objArrZze[i3];
                    }
                    i24 = i77 + i77;
                    obj = objArrZze[i24];
                    if (obj instanceof Field) {
                        fieldZzA2 = (Field) obj;
                    } else {
                        fieldZzA2 = zzA(cls, (String) obj);
                        objArrZze[i24] = fieldZzA2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzA2);
                    i25 = i24 + 1;
                    obj2 = objArrZze[i25];
                    if (obj2 instanceof Field) {
                        fieldZzA3 = (Field) obj2;
                    } else {
                        fieldZzA3 = zzA(cls, (String) obj2);
                        objArrZze[i25] = fieldZzA3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                    i20 = iObjectFieldOffset3;
                    i32 = i79;
                    i19 = 0;
                }
                i3 = i23;
                i24 = i77 + i77;
                obj = objArrZze[i24];
                if (obj instanceof Field) {
                    fieldZzA2 = (Field) obj;
                } else {
                    fieldZzA2 = zzA(cls, (String) obj);
                    objArrZze[i24] = fieldZzA2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzA2);
                i25 = i24 + 1;
                obj2 = objArrZze[i25];
                if (obj2 instanceof Field) {
                    fieldZzA3 = (Field) obj2;
                } else {
                    fieldZzA3 = zzA(cls, (String) obj2);
                    objArrZze[i25] = fieldZzA3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA3);
                i20 = iObjectFieldOffset4;
                i32 = i79;
                i19 = 0;
            } else {
                int i82 = i3 + 1;
                Field fieldZzA4 = zzA(cls, (String) objArrZze[i3]);
                if (i72 == 9 || i72 == 17) {
                    int i83 = i62 / 3;
                    objArr[i83 + i83 + 1] = fieldZzA4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i84 = i62 / 3;
                        i3 += 2;
                        objArr[i84 + i84 + 1] = objArrZze[i82];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z2) {
                            int i85 = i62 / 3;
                            i3 += 2;
                            objArr[i85 + i85 + 1] = objArrZze[i82];
                        }
                    } else if (i72 == 50) {
                        int i86 = i61 + 1;
                        iArr[i61] = i62;
                        int i87 = i62 / 3;
                        int i88 = i87 + i87;
                        int i89 = i3 + 2;
                        objArr[i88] = objArrZze[i82];
                        if ((iCharAt11 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0) {
                            objArr[i88 + 1] = objArrZze[i89];
                            i3 += 3;
                        } else {
                            i3 = i89;
                        }
                        i61 = i86;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) == 4096 || i72 > 17) {
                        i17 = i16;
                        i18 = 0;
                    } else {
                        int i90 = i16 + 1;
                        int iCharAt13 = strZzd.charAt(i16);
                        if (iCharAt13 >= 55296) {
                            int i91 = iCharAt13 & 8191;
                            int i92 = 13;
                            while (true) {
                                i21 = i90 + 1;
                                cCharAt9 = strZzd.charAt(i90);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i91 |= (cCharAt9 & 8191) << i92;
                                i92 += 13;
                                i90 = i21;
                            }
                            iCharAt13 = i91 | (cCharAt9 << i92);
                        } else {
                            i21 = i90;
                        }
                        int i93 = (iCharAt13 / 32) + i5 + i5;
                        Object obj3 = objArrZze[i93];
                        if (obj3 instanceof Field) {
                            fieldZzA = (Field) obj3;
                        } else {
                            fieldZzA = zzA(cls, (String) obj3);
                            objArrZze[i93] = fieldZzA;
                        }
                        i18 = iCharAt13 % 32;
                        int i94 = i21;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzA);
                        i17 = i94;
                    }
                    if (i72 >= 18 && i72 <= 49) {
                        iArr[i60] = iObjectFieldOffset;
                        i60++;
                    }
                    i32 = i17;
                    i19 = i18;
                    i20 = iObjectFieldOffset;
                }
                i3 = i82;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzA4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) == 4096) {
                    i17 = i16;
                    i18 = 0;
                } else {
                    i17 = i16;
                    i18 = 0;
                }
                if (i72 >= 18) {
                    iArr[i60] = iObjectFieldOffset;
                    i60++;
                }
                i32 = i17;
                i19 = i18;
                i20 = iObjectFieldOffset;
            }
            int i95 = i62 + 1;
            iArr4[i62] = iCharAt10;
            int i96 = i62 + 2;
            String str = strZzd;
            iArr4[i95] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i72 << 20) | i20;
            i62 += 3;
            iArr4[i96] = (i19 << 20) | iObjectFieldOffset2;
            iArr3 = iArr4;
            length = i15;
            strZzd = str;
            c2 = 55296;
        }
        return new zzfz(iArr3, objArr, iCharAt, iCharAt2, zzggVar.zza(), z2, false, iArr, iCharAt4, i59, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzhi.zzf(obj, j)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i2, int i3, int i4, long j, zzds zzdsVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzz = zzz(i4);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfq) object).zze()) {
            zzfq zzfqVarZzb = zzfq.zza().zzb();
            zzfr.zza(zzfqVarZzb, object);
            unsafe.putObject(obj, j, zzfqVarZzb);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, zzds zzdsVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i9 + 2] & 1048575;
        switch (i8) {
            case AD_REWARD_USER_VALUE:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i2))));
                unsafe.putInt(obj, j2, i5);
                return i2 + 8;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i2))));
                unsafe.putInt(obj, j2, i5);
                return i2 + 4;
            case 53:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                if (i6 != 0) {
                    return i2;
                }
                int iZzm = zzdt.zzm(bArr, i2, zzdsVar);
                unsafe.putObject(obj, j, Long.valueOf(zzdsVar.zzb));
                unsafe.putInt(obj, j2, i5);
                return iZzm;
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 62:
                if (i6 != 0) {
                    return i2;
                }
                int iZzj = zzdt.zzj(bArr, i2, zzdsVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzdsVar.zza));
                unsafe.putInt(obj, j2, i5);
                return iZzj;
            case 56:
            case 65:
                if (i6 != 1) {
                    return i2;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzdt.zzn(bArr, i2)));
                unsafe.putInt(obj, j2, i5);
                return i2 + 8;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 64:
                if (i6 != 5) {
                    return i2;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzdt.zzb(bArr, i2)));
                unsafe.putInt(obj, j2, i5);
                return i2 + 4;
            case 58:
                if (i6 != 0) {
                    return i2;
                }
                int iZzm2 = zzdt.zzm(bArr, i2, zzdsVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzdsVar.zzb != 0));
                unsafe.putInt(obj, j2, i5);
                return iZzm2;
            case 59:
                if (i6 != 2) {
                    return i2;
                }
                int iZzj2 = zzdt.zzj(bArr, i2, zzdsVar);
                int i10 = zzdsVar.zza;
                if (i10 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i7 & 536870912) != 0 && !zzhm.zzd(bArr, iZzj2, iZzj2 + i10)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i10, zzez.zzb));
                    iZzj2 += i10;
                }
                unsafe.putInt(obj, j2, i5);
                return iZzj2;
            case 60:
                if (i6 != 2) {
                    return i2;
                }
                int iZzd = zzdt.zzd(zzy(i9), bArr, i2, i3, zzdsVar);
                object = unsafe.getInt(obj, j2) == i5 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j2, i5);
                return iZzd;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                if (i6 != 2) {
                    return i2;
                }
                int iZza = zzdt.zza(bArr, i2, zzdsVar);
                unsafe.putObject(obj, j, zzdsVar.zzc);
                unsafe.putInt(obj, j2, i5);
                return iZza;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                if (i6 != 0) {
                    return i2;
                }
                int iZzj3 = zzdt.zzj(bArr, i2, zzdsVar);
                int i11 = zzdsVar.zza;
                zzex zzexVarZzx = zzx(i9);
                if (zzexVarZzx != null && !zzexVarZzx.zza()) {
                    zzc(obj).zzf(i4, Long.valueOf(i11));
                    return iZzj3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i11));
                unsafe.putInt(obj, j2, i5);
                return iZzj3;
            case 66:
                if (i6 != 0) {
                    return i2;
                }
                int iZzj4 = zzdt.zzj(bArr, i2, zzdsVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                unsafe.putInt(obj, j2, i5);
                return iZzj4;
            case 67:
                if (i6 != 0) {
                    return i2;
                }
                int iZzm3 = zzdt.zzm(bArr, i2, zzdsVar);
                unsafe.putObject(obj, j, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                unsafe.putInt(obj, j2, i5);
                return iZzm3;
            case 68:
                if (i6 == 3) {
                    int iZzc = zzdt.zzc(zzy(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzdsVar);
                    object = unsafe.getInt(obj, j2) == i5 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i5);
                    return iZzc;
                }
                break;
        }
        return i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i2, int i3, zzds zzdsVar) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        this = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i3;
        zzdsVar = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i15 = -1;
        int iZzm = i2;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (iZzm < i14) {
            int iZzk = iZzm + 1;
            int i20 = bArr2[iZzm];
            if (i20 < 0) {
                iZzk = zzdt.zzk(i20, bArr2, iZzk, zzdsVar);
                i20 = zzdsVar.zza;
            }
            int i21 = iZzk;
            int i22 = i20 >>> 3;
            int i23 = i20 & 7;
            int iZzr = i22 > i16 ? this.zzr(i22, i17 / 3) : this.zzq(i22);
            if (iZzr == i15) {
                unsafe = unsafe2;
                i4 = i20;
                i5 = i15;
                i6 = i22;
                i7 = 0;
                obj = obj2;
            } else {
                int[] iArr = this.zzc;
                int i24 = iArr[iZzr + 1];
                int iZzu = zzu(i24);
                int i25 = i20;
                int i26 = iZzr;
                long j = i24 & 1048575;
                if (iZzu <= 17) {
                    int i27 = iArr[i26 + 2];
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i19) {
                        int i30 = 1048575;
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj2, i19, i18);
                            i30 = 1048575;
                        }
                        if (i29 != i30) {
                            i18 = unsafe2.getInt(obj2, i29);
                        }
                        i19 = i29;
                    }
                    switch (iZzu) {
                        case 0:
                            i13 = i26;
                            if (i23 != 1) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                zzhi.zzl(obj2, j, Double.longBitsToDouble(zzdt.zzn(bArr2, i21)));
                                iZzm = i21 + 8;
                                i18 |= i28;
                                i14 = i3;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 1:
                            i13 = i26;
                            if (i23 != 5) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                zzhi.zzm(obj2, j, Float.intBitsToFloat(zzdt.zzb(bArr2, i21)));
                                iZzm = i21 + 4;
                                i18 |= i28;
                                i14 = i3;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i13 = i26;
                            if (i23 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                int iZzm2 = zzdt.zzm(bArr2, i21, zzdsVar);
                                Unsafe unsafe3 = unsafe2;
                                Object obj3 = obj2;
                                unsafe3.putLong(obj3, j, zzdsVar.zzb);
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i18 |= i28;
                                iZzm = iZzm2;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                                i14 = i3;
                            }
                            break;
                        case 4:
                        case 11:
                            i13 = i26;
                            if (i23 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                int iZzj = zzdt.zzj(bArr2, i21, zzdsVar);
                                unsafe2.putInt(obj2, j, zzdsVar.zza);
                                i18 |= i28;
                                i14 = i3;
                                iZzm = iZzj;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i13 = i26;
                            if (i23 != 1) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj4 = obj2;
                                unsafe4.putLong(obj4, j, zzdt.zzn(bArr2, i21));
                                unsafe2 = unsafe4;
                                obj2 = obj4;
                                iZzm = i21 + 8;
                                i18 |= i28;
                                i14 = i3;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i13 = i26;
                            if (i23 != 5) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                unsafe2.putInt(obj2, j, zzdt.zzb(bArr2, i21));
                                iZzm = i21 + 4;
                                i18 |= i28;
                                i14 = i3;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 7:
                            i13 = i26;
                            if (i23 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzm(bArr2, i21, zzdsVar);
                                zzhi.zzk(obj2, j, zzdsVar.zzb != 0);
                                i18 |= i28;
                                i14 = i3;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 8:
                            i13 = i26;
                            if (i23 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iZzm = (536870912 & i24) == 0 ? zzdt.zzg(bArr2, i21, zzdsVar) : zzdt.zzh(bArr2, i21, zzdsVar);
                                unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                i18 |= i28;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 9:
                            i13 = i26;
                            if (i23 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzd(this.zzy(i13), bArr2, i21, i14, zzdsVar);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzez.zzg(object, zzdsVar.zzc));
                                }
                                i18 |= i28;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 10:
                            i13 = i26;
                            if (i23 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zza(bArr2, i21, zzdsVar);
                                unsafe2.putObject(obj2, j, zzdsVar.zzc);
                                i18 |= i28;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 12:
                            i13 = i26;
                            if (i23 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i21, zzdsVar);
                                unsafe2.putInt(obj2, j, zzdsVar.zza);
                                i18 |= i28;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 15:
                            i13 = i26;
                            if (i23 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                iZzm = zzdt.zzj(bArr2, i21, zzdsVar);
                                unsafe2.putInt(obj2, j, zzei.zzb(zzdsVar.zza));
                                i18 |= i28;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        case 16:
                            if (i23 != 0) {
                                i13 = i26;
                                obj = obj2;
                                unsafe = unsafe2;
                                i6 = i22;
                                i7 = i13;
                                i5 = -1;
                                i4 = i25 == true ? 1 : 0;
                            } else {
                                int iZzm3 = zzdt.zzm(bArr2, i21, zzdsVar);
                                Unsafe unsafe5 = unsafe2;
                                Object obj5 = obj2;
                                i13 = i26;
                                unsafe5.putLong(obj5, j, zzei.zzc(zzdsVar.zzb));
                                unsafe2 = unsafe5;
                                obj2 = obj5;
                                i18 |= i28;
                                iZzm = iZzm3;
                                i16 = i22;
                                i17 = i13;
                                i15 = -1;
                            }
                            break;
                        default:
                            i13 = i26;
                            obj = obj2;
                            unsafe = unsafe2;
                            i6 = i22;
                            i7 = i13;
                            i5 = -1;
                            i4 = i25 == true ? 1 : 0;
                            break;
                    }
                } else {
                    i7 = i26;
                    if (iZzu != 27) {
                        i8 = i21;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzu <= 49) {
                            i9 = i18;
                            unsafe = unsafe6;
                            i5 = -1;
                            i11 = i19;
                            int iZzp = this.zzp(obj, bArr, i8, i3, i25 == true ? 1 : 0, i22, i23, i7, i24, iZzu, j, zzdsVar);
                            i10 = i25 == true ? 1 : 0;
                            i12 = i22;
                            if (iZzp != i8) {
                                obj2 = obj;
                                iZzm = iZzp;
                                i17 = i7;
                                i16 = i12;
                                i19 = i11;
                                i15 = i5;
                                i18 = i9;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i14 = i3;
                            } else {
                                i21 = iZzp;
                                i6 = i12;
                                i4 = i10;
                            }
                        } else {
                            i9 = i18;
                            unsafe = unsafe6;
                            i5 = -1;
                            i10 = i25 == true ? 1 : 0;
                            i11 = i19;
                            i12 = i22;
                            if (iZzu == 50) {
                                if (i23 == 2) {
                                    int iZzm4 = zzm(obj, bArr, i8, i3, i7, j, zzdsVar);
                                    if (iZzm4 != i8) {
                                        i7 = i7;
                                        this = this;
                                        obj2 = obj;
                                        bArr2 = bArr;
                                        zzdsVar = zzdsVar;
                                        iZzm = iZzm4;
                                        i17 = i7;
                                        i16 = i12;
                                        i19 = i11;
                                        i15 = -1;
                                        i18 = i9;
                                        unsafe2 = unsafe;
                                        i14 = i3;
                                    } else {
                                        i7 = i7;
                                        i21 = iZzm4;
                                    }
                                } else {
                                    i7 = i7;
                                    i21 = i8;
                                }
                                i6 = i12;
                                i4 = i10;
                            } else {
                                i6 = i12;
                                int iZzn = zzn(obj, bArr, i8, i3, i10 == true ? 1 : 0, i6, i23, i24, iZzu, j, i7, zzdsVar);
                                obj = obj;
                                i4 = i10 == true ? 1 : 0;
                                if (iZzn != i8) {
                                    i7 = i7;
                                    i16 = i6;
                                    iZzm = iZzn;
                                    i17 = i7;
                                    obj2 = obj;
                                    i19 = i11;
                                    i15 = i5;
                                    i18 = i9;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i14 = i3;
                                } else {
                                    i7 = i7;
                                    i21 = iZzn;
                                }
                            }
                        }
                    } else if (i23 == 2) {
                        zzey zzeyVarZzd = (zzey) unsafe2.getObject(obj2, j);
                        if (!zzeyVarZzd.zzc()) {
                            int size = zzeyVarZzd.size();
                            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj2, j, zzeyVarZzd);
                        }
                        int iZze = zzdt.zze(this.zzy(i7), i25 == true ? 1 : 0, bArr2, i21, i3, zzeyVarZzd, zzdsVar);
                        bArr2 = bArr;
                        zzdsVar = zzdsVar;
                        iZzm = iZze;
                        i17 = i7;
                        unsafe2 = unsafe2;
                        i16 = i22;
                        i15 = -1;
                        obj2 = obj;
                        i14 = i3;
                    } else {
                        i8 = i21;
                        i11 = i19;
                        i9 = i18;
                        unsafe = unsafe2;
                        i12 = i22;
                        i5 = -1;
                        i10 = i25 == true ? 1 : 0;
                        i21 = i8;
                        i6 = i12;
                        i4 = i10;
                    }
                    i19 = i11;
                    i18 = i9;
                }
            }
            int iZzi = zzdt.zzi(i4 == true ? 1 : 0, bArr, i21, i3, zzc(obj), zzdsVar);
            bArr2 = bArr;
            zzdsVar = zzdsVar;
            i16 = i6;
            i17 = i7;
            obj2 = obj;
            i15 = i5;
            unsafe2 = unsafe;
            i14 = i3;
            iZzm = iZzi;
            this = this;
        }
        Object obj6 = obj2;
        Unsafe unsafe7 = unsafe2;
        int i31 = i14;
        int i32 = i19;
        int i33 = i18;
        if (i32 != 1048575) {
            unsafe7.putInt(obj6, i32, i33);
        }
        if (iZzm == i31) {
            return iZzm;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, long j2, zzds zzdsVar) throws IOException {
        int iZzl;
        Unsafe unsafe = zzb;
        zzey zzeyVarZzd = (zzey) unsafe.getObject(obj, j2);
        if (!zzeyVarZzd.zzc()) {
            int size = zzeyVarZzd.size();
            zzeyVarZzd = zzeyVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzeyVarZzd);
        }
        zzey zzeyVar = zzeyVarZzd;
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int iZzj = zzdt.zzj(bArr, i2, zzdsVar);
                    int i9 = zzdsVar.zza + iZzj;
                    while (iZzj < i9) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj)));
                        iZzj += 8;
                    }
                    if (iZzj == i9) {
                        return iZzj;
                    }
                    throw zzfa.zzf();
                }
                if (i6 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i2)));
                    int i10 = i2 + 8;
                    while (i10 < i3) {
                        int iZzj2 = zzdt.zzj(bArr, i10, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return i10;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, iZzj2)));
                        i10 = iZzj2 + 8;
                    }
                    return i10;
                }
                return i2;
            case 19:
            case 36:
                if (i6 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int iZzj3 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i11 = zzdsVar.zza + iZzj3;
                    while (iZzj3 < i11) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i11) {
                        return iZzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i6 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i2)));
                    int i12 = i2 + 4;
                    while (i12 < i3) {
                        int iZzj4 = zzdt.zzj(bArr, i12, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return i12;
                        }
                        zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, iZzj4)));
                        i12 = iZzj4 + 4;
                    }
                    return i12;
                }
                return i2;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int iZzj5 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i13 = zzdsVar.zza + iZzj5;
                    while (iZzj5 < i13) {
                        iZzj5 = zzdt.zzm(bArr, iZzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (iZzj5 == i13) {
                        return iZzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i6 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int iZzm = zzdt.zzm(bArr, i2, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (iZzm < i3) {
                        int iZzj6 = zzdt.zzj(bArr, iZzm, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzdt.zzm(bArr, iZzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return iZzm;
                }
                return i2;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i6 == 2) {
                    return zzdt.zzf(bArr, i2, zzeyVar, zzdsVar);
                }
                if (i6 == 0) {
                    return zzdt.zzl(i4, bArr, i2, i3, zzeyVar, zzdsVar);
                }
                return i2;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int iZzj7 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i14 = zzdsVar.zza + iZzj7;
                    while (iZzj7 < i14) {
                        zzflVar3.zze(zzdt.zzn(bArr, iZzj7));
                        iZzj7 += 8;
                    }
                    if (iZzj7 == i14) {
                        return iZzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i6 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i2));
                    int i15 = i2 + 8;
                    while (i15 < i3) {
                        int iZzj8 = zzdt.zzj(bArr, i15, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return i15;
                        }
                        zzflVar4.zze(zzdt.zzn(bArr, iZzj8));
                        i15 = iZzj8 + 8;
                    }
                    return i15;
                }
                return i2;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int iZzj9 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i16 = zzdsVar.zza + iZzj9;
                    while (iZzj9 < i16) {
                        zzevVar.zze(zzdt.zzb(bArr, iZzj9));
                        iZzj9 += 4;
                    }
                    if (iZzj9 == i16) {
                        return iZzj9;
                    }
                    throw zzfa.zzf();
                }
                if (i6 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i2));
                    int i17 = i2 + 4;
                    while (i17 < i3) {
                        int iZzj10 = zzdt.zzj(bArr, i17, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return i17;
                        }
                        zzevVar2.zze(zzdt.zzb(bArr, iZzj10));
                        i17 = iZzj10 + 4;
                    }
                    return i17;
                }
                return i2;
            case 25:
            case 42:
                if (i6 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    int iZzj11 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i18 = zzdsVar.zza + iZzj11;
                    while (iZzj11 < i18) {
                        iZzj11 = zzdt.zzm(bArr, iZzj11, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (iZzj11 == i18) {
                        return iZzj11;
                    }
                    throw zzfa.zzf();
                }
                if (i6 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int iZzm2 = zzdt.zzm(bArr, i2, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (iZzm2 < i3) {
                        int iZzj12 = zzdt.zzj(bArr, iZzm2, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzdt.zzm(bArr, iZzj12, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i2;
            case 26:
                if (i6 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj13 = zzdt.zzj(bArr, i2, zzdsVar);
                        int i19 = zzdsVar.zza;
                        if (i19 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i19 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, iZzj13, i19, zzez.zzb));
                            iZzj13 += i19;
                        }
                        while (iZzj13 < i3) {
                            int iZzj14 = zzdt.zzj(bArr, iZzj13, zzdsVar);
                            if (i4 != zzdsVar.zza) {
                                return iZzj13;
                            }
                            iZzj13 = zzdt.zzj(bArr, iZzj14, zzdsVar);
                            int i20 = zzdsVar.zza;
                            if (i20 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i20 == 0) {
                                zzeyVar.add("");
                            } else {
                                zzeyVar.add(new String(bArr, iZzj13, i20, zzez.zzb));
                                iZzj13 += i20;
                            }
                        }
                        return iZzj13;
                    }
                    int iZzj15 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i21 = zzdsVar.zza;
                    if (i21 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i21 == 0) {
                        zzeyVar.add("");
                    } else {
                        int i22 = iZzj15 + i21;
                        if (!zzhm.zzd(bArr, iZzj15, i22)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar.add(new String(bArr, iZzj15, i21, zzez.zzb));
                        iZzj15 = i22;
                    }
                    while (iZzj15 < i3) {
                        int iZzj16 = zzdt.zzj(bArr, iZzj15, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return iZzj15;
                        }
                        iZzj15 = zzdt.zzj(bArr, iZzj16, zzdsVar);
                        int i23 = zzdsVar.zza;
                        if (i23 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i23 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i24 = iZzj15 + i23;
                            if (!zzhm.zzd(bArr, iZzj15, i24)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, iZzj15, i23, zzez.zzb));
                            iZzj15 = i24;
                        }
                    }
                    return iZzj15;
                }
                return i2;
            case 27:
                if (i6 == 2) {
                    return zzdt.zze(zzy(i7), i4, bArr, i2, i3, zzeyVar, zzdsVar);
                }
                return i2;
            case 28:
                if (i6 == 2) {
                    int iZzj17 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i25 = zzdsVar.zza;
                    if (i25 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i25 > bArr.length - iZzj17) {
                        throw zzfa.zzf();
                    }
                    if (i25 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, iZzj17, i25));
                        iZzj17 += i25;
                    }
                    while (iZzj17 < i3) {
                        int iZzj18 = zzdt.zzj(bArr, iZzj17, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzdt.zzj(bArr, iZzj18, zzdsVar);
                        int i26 = zzdsVar.zza;
                        if (i26 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i26 > bArr.length - iZzj17) {
                            throw zzfa.zzf();
                        }
                        if (i26 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, iZzj17, i26));
                            iZzj17 += i26;
                        }
                    }
                    return iZzj17;
                }
                return i2;
            case 30:
            case 44:
                if (i6 != 2) {
                    if (i6 == 0) {
                        iZzl = zzdt.zzl(i4, bArr, i2, i3, zzeyVar, zzdsVar);
                    }
                    return i2;
                }
                iZzl = zzdt.zzf(bArr, i2, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object objZzd = zzgj.zzd(i5, zzeyVar, zzx(i7), zzgzVar, this.zzm);
                if (objZzd == null) {
                    return iZzl;
                }
                zzeuVar.zzc = (zzgz) objZzd;
                return iZzl;
            case 33:
            case 47:
                if (i6 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int iZzj19 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i27 = zzdsVar.zza + iZzj19;
                    while (iZzj19 < i27) {
                        iZzj19 = zzdt.zzj(bArr, iZzj19, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (iZzj19 == i27) {
                        return iZzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i6 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int iZzj20 = zzdt.zzj(bArr, i2, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (iZzj20 < i3) {
                        int iZzj21 = zzdt.zzj(bArr, iZzj20, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return iZzj20;
                        }
                        iZzj20 = zzdt.zzj(bArr, iZzj21, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return iZzj20;
                }
                return i2;
            case 34:
            case 48:
                if (i6 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int iZzj22 = zzdt.zzj(bArr, i2, zzdsVar);
                    int i28 = zzdsVar.zza + iZzj22;
                    while (iZzj22 < i28) {
                        iZzj22 = zzdt.zzm(bArr, iZzj22, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (iZzj22 == i28) {
                        return iZzj22;
                    }
                    throw zzfa.zzf();
                }
                if (i6 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int iZzm3 = zzdt.zzm(bArr, i2, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (iZzm3 < i3) {
                        int iZzj23 = zzdt.zzj(bArr, iZzm3, zzdsVar);
                        if (i4 != zzdsVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzdt.zzm(bArr, iZzj23, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return iZzm3;
                }
                return i2;
            default:
                if (i6 == 3) {
                    zzgh zzghVarZzy = zzy(i7);
                    int i29 = (i4 & (-8)) | 4;
                    int iZzc = zzdt.zzc(zzghVarZzy, bArr, i2, i3, i29, zzdsVar);
                    zzgh zzghVar = zzghVarZzy;
                    zzds zzdsVar2 = zzdsVar;
                    zzeyVar.add(zzdsVar2.zzc);
                    while (iZzc < i3) {
                        int iZzj24 = zzdt.zzj(bArr, iZzc, zzdsVar2);
                        if (i4 != zzdsVar2.zza) {
                            return iZzc;
                        }
                        zzgh zzghVar2 = zzghVar;
                        zzds zzdsVar3 = zzdsVar2;
                        iZzc = zzdt.zzc(zzghVar2, bArr, iZzj24, i3, i29, zzdsVar3);
                        zzeyVar.add(zzdsVar3.zzc);
                        zzghVar = zzghVar2;
                        zzdsVar2 = zzdsVar3;
                    }
                    return iZzc;
                }
                return i2;
        }
    }

    private final int zzq(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzt(i2, 0);
    }

    private final int zzr(int i2, int i3) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzt(i2, i3);
    }

    private final int zzs(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzt(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.zzc[i5];
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

    private static int zzu(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzv(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzw(Object obj, long j) {
        return ((Long) zzhi.zzf(obj, j)).longValue();
    }

    private final zzex zzx(int i2) {
        int i3 = i2 / 3;
        return (zzex) this.zzd[i3 + i3 + 1];
    }

    private final zzgh zzy(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzgh zzghVar = (zzgh) this.zzd[i4];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzghVarZzb = zzge.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzghVarZzb;
        return zzghVarZzb;
    }

    private final Object zzz(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i2;
        int iZzc;
        int i3;
        int iZzc2;
        int length = this.zzc.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iZzv = zzv(i5);
            int i6 = this.zzc[i5];
            long j = 1048575 & iZzv;
            int iHashCode = 37;
            switch (zzu(iZzv)) {
                case 0:
                    i2 = i4 * 53;
                    iZzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j)));
                    i4 = iZzc + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    iZzc = Float.floatToIntBits(zzhi.zzb(obj, j));
                    i4 = iZzc + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i4 = iZzc + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i4 = iZzc + i2;
                    break;
                case 4:
                    i3 = i4 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i4 = i3 + iZzc2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i4 = iZzc + i2;
                    break;
                case 6:
                    i3 = i4 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i4 = i3 + iZzc2;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iZzc = zzez.zza(zzhi.zzt(obj, j));
                    i4 = iZzc + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                    i4 = iZzc + i2;
                    break;
                case 9:
                    Object objZzf = zzhi.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i4 = iZzc + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i4 = i3 + iZzc2;
                    break;
                case 12:
                    i3 = i4 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i4 = i3 + iZzc2;
                    break;
                case 13:
                    i3 = i4 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i4 = i3 + iZzc2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i4 = iZzc + i2;
                    break;
                case 15:
                    i3 = i4 * 53;
                    iZzc2 = zzhi.zzc(obj, j);
                    i4 = i3 + iZzc2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    iZzc = zzez.zzc(zzhi.zzd(obj, j));
                    i4 = iZzc + i2;
                    break;
                case 17:
                    Object objZzf2 = zzhi.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i4 = (i4 * 53) + iHashCode;
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
                    i2 = i4 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i4 = iZzc + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    iZzc = zzhi.zzf(obj, j).hashCode();
                    i4 = iZzc + i2;
                    break;
                case AD_REWARD_USER_VALUE:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j)).doubleValue()));
                        i4 = iZzc + i2;
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j)).floatValue());
                        i4 = iZzc + i2;
                    }
                    break;
                case 53:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i4 = iZzc + i2;
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i4 = iZzc + i2;
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (zzJ(obj, i6, i5)) {
                        i3 = i4 * 53;
                        iZzc2 = zzl(obj, j);
                        i4 = i3 + iZzc2;
                    }
                    break;
                case 56:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i4 = iZzc + i2;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (zzJ(obj, i6, i5)) {
                        i3 = i4 * 53;
                        iZzc2 = zzl(obj, j);
                        i4 = i3 + iZzc2;
                    }
                    break;
                case 58:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzez.zza(((Boolean) zzhi.zzf(obj, j)).booleanValue());
                        i4 = iZzc + i2;
                    }
                    break;
                case 59:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = ((String) zzhi.zzf(obj, j)).hashCode();
                        i4 = iZzc + i2;
                    }
                    break;
                case 60:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i4 = iZzc + i2;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i4 = iZzc + i2;
                    }
                    break;
                case 62:
                    if (zzJ(obj, i6, i5)) {
                        i3 = i4 * 53;
                        iZzc2 = zzl(obj, j);
                        i4 = i3 + iZzc2;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (zzJ(obj, i6, i5)) {
                        i3 = i4 * 53;
                        iZzc2 = zzl(obj, j);
                        i4 = i3 + iZzc2;
                    }
                    break;
                case 64:
                    if (zzJ(obj, i6, i5)) {
                        i3 = i4 * 53;
                        iZzc2 = zzl(obj, j);
                        i4 = i3 + iZzc2;
                    }
                    break;
                case 65:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i4 = iZzc + i2;
                    }
                    break;
                case 66:
                    if (zzJ(obj, i6, i5)) {
                        i3 = i4 * 53;
                        iZzc2 = zzl(obj, j);
                        i4 = i3 + iZzc2;
                    }
                    break;
                case 67:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzez.zzc(zzw(obj, j));
                        i4 = iZzc + i2;
                    }
                    break;
                case 68:
                    if (zzJ(obj, i6, i5)) {
                        i2 = i4 * 53;
                        iZzc = zzhi.zzf(obj, j).hashCode();
                        i4 = iZzc + i2;
                    }
                    break;
            }
        }
        return this.zzm.zza(obj).hashCode() + (i4 * 53);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12421. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int zzb(java.lang.Object r28, byte[] r29, int r30, int r31, int r32, com.google.android.gms.internal.auth.zzds r33) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i2;
        int i3 = this.zzj;
        while (true) {
            i2 = this.zzk;
            if (i3 >= i2) {
                break;
            }
            long jZzv = zzv(this.zzi[i3]) & 1048575;
            Object objZzf = zzhi.zzf(obj, jZzv);
            if (objZzf != null) {
                ((zzfq) objZzf).zzc();
                zzhi.zzp(obj, jZzv, objZzf);
            }
            i3++;
        }
        int length = this.zzi.length;
        while (i2 < length) {
            this.zzl.zza(obj, this.zzi[i2]);
            i2++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int iZzv = zzv(i2);
            long j = 1048575 & iZzv;
            int i3 = this.zzc[i2];
            switch (zzu(iZzv)) {
                case 0:
                    if (zzG(obj2, i2)) {
                        zzhi.zzl(obj, j, zzhi.zza(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 1:
                    if (zzG(obj2, i2)) {
                        zzhi.zzm(obj, j, zzhi.zzb(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 2:
                    if (zzG(obj2, i2)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 3:
                    if (zzG(obj2, i2)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 4:
                    if (zzG(obj2, i2)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 5:
                    if (zzG(obj2, i2)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 6:
                    if (zzG(obj2, i2)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 7:
                    if (zzG(obj2, i2)) {
                        zzhi.zzk(obj, j, zzhi.zzt(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 8:
                    if (zzG(obj2, i2)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 9:
                    zzB(obj, obj2, i2);
                    break;
                case 10:
                    if (zzG(obj2, i2)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 11:
                    if (zzG(obj2, i2)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 12:
                    if (zzG(obj2, i2)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 13:
                    if (zzG(obj2, i2)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 14:
                    if (zzG(obj2, i2)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 15:
                    if (zzG(obj2, i2)) {
                        zzhi.zzn(obj, j, zzhi.zzc(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 16:
                    if (zzG(obj2, i2)) {
                        zzhi.zzo(obj, j, zzhi.zzd(obj2, j));
                        zzD(obj, i2);
                    }
                    break;
                case 17:
                    zzB(obj, obj2, i2);
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
                    zzgj.zzi(this.zzp, obj, obj2, j);
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
                    if (zzJ(obj2, i3, i2)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i3, i2);
                    }
                    break;
                case 60:
                    zzC(obj, obj2, i2);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case 62:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i3, i2)) {
                        zzhi.zzp(obj, j, zzhi.zzf(obj2, j));
                        zzE(obj, i3, i2);
                    }
                    break;
                case 68:
                    zzC(obj, obj2, i2);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i2, int i3, zzds zzdsVar) throws IOException {
        if (this.zzh) {
            zzo(obj, bArr, i2, i3, zzdsVar);
        } else {
            zzb(obj, bArr, i2, i3, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzh;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int iZzv = zzv(i2);
            long j = iZzv & 1048575;
            switch (zzu(iZzv)) {
                case 0:
                    if (!zzF(obj, obj2, i2) || Double.doubleToLongBits(zzhi.zza(obj, j)) != Double.doubleToLongBits(zzhi.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzF(obj, obj2, i2) || Float.floatToIntBits(zzhi.zzb(obj, j)) != Float.floatToIntBits(zzhi.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzF(obj, obj2, i2) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzF(obj, obj2, i2) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzF(obj, obj2, i2) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzF(obj, obj2, i2) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzF(obj, obj2, i2) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzF(obj, obj2, i2) || zzhi.zzt(obj, j) != zzhi.zzt(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzF(obj, obj2, i2) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzF(obj, obj2, i2) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzF(obj, obj2, i2) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzF(obj, obj2, i2) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzF(obj, obj2, i2) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzF(obj, obj2, i2) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzF(obj, obj2, i2) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzF(obj, obj2, i2) || zzhi.zzc(obj, j) != zzhi.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzF(obj, obj2, i2) || zzhi.zzd(obj, j) != zzhi.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzF(obj, obj2, i2) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
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
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
                    break;
                case 50:
                    zZzh = zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j));
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
                    long jZzs = zzs(i2) & 1048575;
                    if (zzhi.zzc(obj, jZzs) != zzhi.zzc(obj2, jZzs) || !zzgj.zzh(zzhi.zzf(obj, j), zzhi.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[LOOP:1: B:45:0x00a1->B:50:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i2;
        int i3;
        List list;
        zzgh zzghVarZzy;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < this.zzj) {
            int i8 = this.zzi[i6];
            int i9 = this.zzc[i8];
            int iZzv = zzv(i8);
            int i10 = this.zzc[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i7 = zzb.getInt(obj, i11);
                }
                i3 = i7;
                i2 = i11;
            } else {
                i2 = i5;
                i3 = i7;
            }
            Object obj2 = obj;
            if ((268435456 & iZzv) != 0 && !zzH(obj2, i8, i2, i3, i12)) {
                return false;
            }
            int iZzu = zzu(iZzv);
            if (iZzu == 9 || iZzu == 17) {
                if (zzH(obj2, i8, i2, i3, i12) && !zzI(obj2, iZzv, zzy(i8))) {
                    return false;
                }
            } else if (iZzu == 27) {
                list = (List) zzhi.zzf(obj2, iZzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzghVarZzy = zzy(i8);
                    for (i4 = 0; i4 < list.size(); i4++) {
                        if (!zzghVarZzy.zzi(list.get(i4))) {
                            return false;
                        }
                    }
                }
            } else if (iZzu == 60 || iZzu == 68) {
                if (zzJ(obj2, i9, i8) && !zzI(obj2, iZzv, zzy(i8))) {
                    return false;
                }
            } else if (iZzu == 49) {
                list = (List) zzhi.zzf(obj2, iZzv & 1048575);
                if (list.isEmpty()) {
                    zzghVarZzy = zzy(i8);
                    while (i4 < list.size()) {
                        if (!zzghVarZzy.zzi(list.get(i4))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzu == 50 && !((zzfq) zzhi.zzf(obj2, iZzv & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            obj = obj2;
            i5 = i2;
            i7 = i3;
        }
        return true;
    }
}
