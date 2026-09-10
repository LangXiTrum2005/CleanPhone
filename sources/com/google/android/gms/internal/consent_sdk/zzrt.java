package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzrt<T> implements zzsa<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzsw.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzrq zze;
    private final boolean zzf;
    private final int[] zzg;
    private final int zzh;
    private final zzsp zzi;
    private final zzqb zzj;

    private zzrt(int[] iArr, Object[] objArr, int i, int i2, zzrq zzrqVar, boolean z, int[] iArr2, int i3, int i4, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        boolean z2 = false;
        if (zzqbVar != null && (zzrqVar instanceof zzqk)) {
            z2 = true;
        }
        this.zzf = z2;
        this.zzg = iArr2;
        this.zzh = i3;
        this.zzi = zzspVar;
        this.zzj = zzqbVar;
        this.zze = zzrqVar;
    }

    private static boolean zzA(Object obj, int i, zzsa zzsaVar) {
        return zzsaVar.zzh(zzsw.zzf(obj, i & 1048575));
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzqm) {
            return ((zzqm) obj).zzD();
        }
        return true;
    }

    private final boolean zzC(Object obj, int i, int i2) {
        return zzsw.zzc(obj, (long) (zzm(i2) & 1048575)) == i;
    }

    private static boolean zzD(Object obj, long j) {
        return ((Boolean) zzsw.zzf(obj, j)).booleanValue();
    }

    private static final void zzE(int i, Object obj, zztb zztbVar) throws IOException {
        if (obj instanceof String) {
            zztbVar.zzF(i, (String) obj);
        } else {
            zztbVar.zzd(i, (zzpm) obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x028f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0350  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b0  */
    public static zzrt zzi(Class cls, zzrn zzrnVar, zzrv zzrvVar, zzrc zzrcVar, zzsp zzspVar, zzqb zzqbVar, zzrl zzrlVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
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
        int iObjectFieldOffset;
        char c;
        int iObjectFieldOffset2;
        int i19;
        int i20;
        int i21;
        Field fieldZzs;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldZzs2;
        int i27;
        Object obj2;
        Field fieldZzs3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(zzrnVar instanceof zzrz)) {
            throw null;
        }
        zzrz zzrzVar = (zzrz) zzrnVar;
        String strZzd = zzrzVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
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
            i3 = 0;
            i6 = 0;
            iCharAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
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
            int i60 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i61 = iCharAt7;
            i2 = iCharAt5;
            i3 = i61;
            i4 = iCharAt6;
            i5 = iCharAt9;
            i6 = i60;
            iArr = iArr2;
            i7 = iCharAt3;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzrzVar.zze();
        Class<?> cls2 = zzrzVar.zza().getClass();
        int i62 = i5 + i3;
        int i63 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i63];
        int i64 = i5;
        int i65 = i62;
        int i66 = 0;
        int i67 = 0;
        while (i33 < length) {
            int i68 = i33 + 1;
            int iCharAt10 = strZzd.charAt(i33);
            if (iCharAt10 >= c2) {
                int i69 = iCharAt10 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    cCharAt12 = strZzd.charAt(i70);
                    if (cCharAt12 < c2) {
                        break;
                    }
                    i69 |= (cCharAt12 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                }
                iCharAt10 = i69 | (cCharAt12 << i71);
                i16 = i30;
            } else {
                i16 = i68;
            }
            int i72 = i16 + 1;
            int iCharAt11 = strZzd.charAt(i16);
            if (iCharAt11 >= c2) {
                int i73 = iCharAt11 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i29 = i74 + 1;
                    cCharAt11 = strZzd.charAt(i74);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i73 |= (cCharAt11 & 8191) << i75;
                    i75 += 13;
                    i74 = i29;
                }
                iCharAt11 = i73 | (cCharAt11 << i75);
                i17 = i29;
            } else {
                i17 = i72;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i66] = i67;
                i66++;
            }
            int i76 = iCharAt11 & 255;
            zzrz zzrzVar2 = zzrzVar;
            int i77 = iCharAt11 & 2048;
            if (i76 >= 51) {
                int i78 = i17 + 1;
                int iCharAt12 = strZzd.charAt(i17);
                char c3 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        cCharAt10 = strZzd.charAt(i80);
                        if (cCharAt10 < c3) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i28;
                        c3 = 55296;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i23 = i28;
                } else {
                    i23 = i78;
                }
                int i82 = i23;
                int i83 = i76 - 51;
                if (i83 == 9 || i83 == 17) {
                    i24 = i6 + 1;
                    int i84 = i67 / 3;
                    objArr[i84 + i84 + 1] = objArrZze[i6];
                } else {
                    if (i83 != 12) {
                        i25 = i77;
                    } else if (zzrzVar2.zzc() == 1 || i77 != 0) {
                        i24 = i6 + 1;
                        int i85 = i67 / 3;
                        objArr[i85 + i85 + 1] = objArrZze[i6];
                    } else {
                        i25 = 0;
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i26];
                    int i86 = i25;
                    if (obj instanceof Field) {
                        fieldZzs2 = (Field) obj;
                    } else {
                        fieldZzs2 = zzs(cls2, (String) obj);
                        objArrZze[i26] = fieldZzs2;
                    }
                    int i87 = i7;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs2);
                    i27 = i26 + 1;
                    obj2 = objArrZze[i27];
                    i18 = i87;
                    if (obj2 instanceof Field) {
                        fieldZzs3 = (Field) obj2;
                    } else {
                        fieldZzs3 = zzs(cls2, (String) obj2);
                        objArrZze[i27] = fieldZzs3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzs3);
                    strZzd = strZzd;
                    i20 = i86;
                    i17 = i82;
                    i19 = 0;
                    c = 55296;
                }
                i6 = i24;
                i25 = i77;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrZze[i26];
                int i88 = i25;
                if (obj instanceof Field) {
                    fieldZzs2 = (Field) obj;
                } else {
                    fieldZzs2 = zzs(cls2, (String) obj);
                    objArrZze[i26] = fieldZzs2;
                }
                int i89 = i7;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs2);
                i27 = i26 + 1;
                obj2 = objArrZze[i27];
                i18 = i89;
                if (obj2 instanceof Field) {
                    fieldZzs3 = (Field) obj2;
                } else {
                    fieldZzs3 = zzs(cls2, (String) obj2);
                    objArrZze[i27] = fieldZzs3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzs3);
                strZzd = strZzd;
                i20 = i88;
                i17 = i82;
                i19 = 0;
                c = 55296;
            } else {
                i18 = i7;
                int i90 = i6 + 1;
                Field fieldZzs4 = zzs(cls2, (String) objArrZze[i6]);
                if (i76 == 9 || i76 == 17) {
                    int i91 = i67 / 3;
                    objArr[i91 + i91 + 1] = fieldZzs4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i6 += 2;
                            i22 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            if (zzrzVar2.zzc() == 1 || i77 != 0) {
                                i6 += 2;
                                int i92 = i67 / 3;
                                objArr[i92 + i92 + 1] = objArrZze[i90];
                            } else {
                                i6 = i90;
                                i77 = 0;
                            }
                        } else if (i76 == 50) {
                            int i93 = i6 + 2;
                            int i94 = i64 + 1;
                            iArr[i64] = i67;
                            int i95 = i67 / 3;
                            int i96 = i95 + i95;
                            objArr[i96] = objArrZze[i90];
                            if (i77 != 0) {
                                objArr[i96 + 1] = objArrZze[i93];
                                i6 += 3;
                                i64 = i94;
                            } else {
                                i6 = i93;
                                i64 = i94;
                                i77 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs4);
                        if ((iCharAt11 & 4096) != 0 || i76 > 17) {
                            c = 55296;
                            iObjectFieldOffset2 = 1048575;
                            i19 = 0;
                        } else {
                            int i97 = i17 + 1;
                            int iCharAt13 = strZzd.charAt(i17);
                            if (iCharAt13 >= 55296) {
                                int i98 = iCharAt13 & 8191;
                                int i99 = 13;
                                while (true) {
                                    i21 = i97 + 1;
                                    cCharAt9 = strZzd.charAt(i97);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i98 |= (cCharAt9 & 8191) << i99;
                                    i99 += 13;
                                    i97 = i21;
                                }
                                iCharAt13 = i98 | (cCharAt9 << i99);
                            } else {
                                i21 = i97;
                            }
                            int i100 = i18 + i18 + (iCharAt13 / 32);
                            Object obj3 = objArrZze[i100];
                            if (obj3 instanceof Field) {
                                fieldZzs = (Field) obj3;
                            } else {
                                fieldZzs = zzs(cls2, (String) obj3);
                                objArrZze[i100] = fieldZzs;
                            }
                            int i101 = iCharAt13;
                            int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzs);
                            i19 = i101 % 32;
                            i17 = i21;
                            c = 55296;
                            iObjectFieldOffset2 = iObjectFieldOffset3;
                        }
                        if (i76 >= 18 && i76 <= 49) {
                            iArr[i65] = iObjectFieldOffset;
                            i65++;
                        }
                        i20 = i77;
                    } else {
                        i22 = 1;
                        i6 += 2;
                    }
                    int i102 = i67 / 3;
                    objArr[i102 + i102 + i22] = objArrZze[i90];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs4);
                    if ((iCharAt11 & 4096) != 0) {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    } else {
                        c = 55296;
                        iObjectFieldOffset2 = 1048575;
                        i19 = 0;
                    }
                    if (i76 >= 18) {
                        iArr[i65] = iObjectFieldOffset;
                        i65++;
                    }
                    i20 = i77;
                }
                i6 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzs4);
                if ((iCharAt11 & 4096) != 0) {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                } else {
                    c = 55296;
                    iObjectFieldOffset2 = 1048575;
                    i19 = 0;
                }
                if (i76 >= 18) {
                    iArr[i65] = iObjectFieldOffset;
                    i65++;
                }
                i20 = i77;
            }
            int i103 = i67 + 1;
            iArr3[i67] = iCharAt10;
            int i104 = i67 + 2;
            iArr3[i103] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | iObjectFieldOffset;
            i67 += 3;
            iArr3[i104] = (i19 << 20) | iObjectFieldOffset2;
            i33 = i17;
            strZzd = strZzd;
            c2 = c;
            zzrzVar = zzrzVar2;
            length = length;
            i7 = i18;
        }
        return new zzrt(iArr3, objArr, i2, i4, zzrzVar.zza(), false, iArr, i5, i62, zzrvVar, zzrcVar, zzspVar, zzqbVar, zzrlVar);
    }

    private static double zzj(Object obj, long j) {
        return ((Double) zzsw.zzf(obj, j)).doubleValue();
    }

    private static float zzk(Object obj, long j) {
        return ((Float) zzsw.zzf(obj, j)).floatValue();
    }

    private static int zzl(Object obj, long j) {
        return ((Integer) zzsw.zzf(obj, j)).intValue();
    }

    private final int zzm(int i) {
        return this.zzc[i + 2];
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzsw.zzf(obj, j)).longValue();
    }

    private final zzsa zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzsa zzsaVar = (zzsa) objArr[i3];
        if (zzsaVar != null) {
            return zzsaVar;
        }
        zzsa zzsaVarZzb = zzrx.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzsaVarZzb;
        return zzsaVarZzb;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzs(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private final void zzt(Object obj, Object obj2, int i) {
        if (zzy(obj2, i)) {
            int iZzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i);
            if (!zzy(obj, i)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j, objZzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzv(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzu(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzC(obj2, i2, i)) {
            int iZzo = zzo(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzo;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            zzsa zzsaVarZzq = zzq(i);
            if (!zzC(obj, i2, i)) {
                if (zzB(object)) {
                    Object objZzc = zzsaVarZzq.zzc();
                    zzsaVarZzq.zze(objZzc, object);
                    unsafe.putObject(obj, j, objZzc);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzw(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzB(object2)) {
                Object objZzc2 = zzsaVarZzq.zzc();
                zzsaVarZzq.zze(objZzc2, object2);
                unsafe.putObject(obj, j, objZzc2);
                object2 = objZzc2;
            }
            zzsaVarZzq.zze(object2, object);
        }
    }

    private final void zzv(Object obj, int i) {
        int iZzm = zzm(i);
        long j = 1048575 & iZzm;
        if (j == 1048575) {
            return;
        }
        zzsw.zzq(obj, j, (1 << (iZzm >>> 20)) | zzsw.zzc(obj, j));
    }

    private final void zzw(Object obj, int i, int i2) {
        zzsw.zzq(obj, zzm(i2) & 1048575, i);
    }

    private final boolean zzx(Object obj, Object obj2, int i) {
        return zzy(obj, i) == zzy(obj2, i);
    }

    private final boolean zzy(Object obj, int i) {
        int iZzm = zzm(i);
        long j = iZzm & 1048575;
        if (j != 1048575) {
            return (zzsw.zzc(obj, j) & (1 << (iZzm >>> 20))) != 0;
        }
        int iZzo = zzo(i);
        long j2 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzsw.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzsw.zzb(obj, j2)) != 0;
            case 2:
                return zzsw.zzd(obj, j2) != 0;
            case 3:
                return zzsw.zzd(obj, j2) != 0;
            case 4:
                return zzsw.zzc(obj, j2) != 0;
            case 5:
                return zzsw.zzd(obj, j2) != 0;
            case 6:
                return zzsw.zzc(obj, j2) != 0;
            case 7:
                return zzsw.zzw(obj, j2);
            case 8:
                Object objZzf = zzsw.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzpm) {
                    return !zzpm.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzsw.zzf(obj, j2) != null;
            case 10:
                return !zzpm.zzb.equals(zzsw.zzf(obj, j2));
            case 11:
                return zzsw.zzc(obj, j2) != 0;
            case 12:
                return zzsw.zzc(obj, j2) != 0;
            case 13:
                return zzsw.zzc(obj, j2) != 0;
            case 14:
                return zzsw.zzd(obj, j2) != 0;
            case 15:
                return zzsw.zzc(obj, j2) != 0;
            case 16:
                return zzsw.zzd(obj, j2) != 0;
            case 17:
                return zzsw.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzz(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzy(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x038e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zza(Object obj) {
        int i;
        int iZzC;
        int iZzC2;
        int iZzD;
        int iZzC3;
        int iZzC4;
        int iZzC5;
        int iZzd;
        int iZzC6;
        int iZzi;
        int iZzh;
        int size;
        int iZzm;
        int iZzC7;
        int iZzC8;
        int iZzj;
        int iZzC9;
        int iZzC10;
        int iZzD2;
        int iZzf;
        int iZzC11;
        int iZzC12;
        int iZza;
        int iZzC13;
        int iZzC14;
        int iZzC15;
        int iZzd2;
        int iZzC16;
        zzrt<T> zzrtVar = this;
        Unsafe unsafe = zzb;
        int i2 = 0;
        int i3 = 0;
        int iZzC17 = 0;
        int i4 = 1048575;
        while (true) {
            int[] iArr = zzrtVar.zzc;
            if (i2 >= iArr.length) {
                int iZza2 = iZzC17 + ((zzqm) obj).zzc.zza();
                if (!zzrtVar.zzf) {
                    return iZza2;
                }
                zzsi zzsiVar = ((zzqk) obj).zzb.zza;
                int iZzc = zzsiVar.zzc();
                int iZzc2 = 0;
                for (int i5 = 0; i5 < iZzc; i5++) {
                    Map.Entry entryZzg = zzsiVar.zzg(i5);
                    iZzc2 += zzqf.zzc((zzqe) ((zzse) entryZzg).zza(), entryZzg.getValue());
                }
                for (Map.Entry entry : zzsiVar.zzd()) {
                    iZzc2 += zzqf.zzc((zzqe) entry.getKey(), entry.getValue());
                }
                return iZza2 + iZzc2;
            }
            int iZzo = zzrtVar.zzo(i2);
            int iZzn = zzn(iZzo);
            int i6 = iArr[i2];
            int i7 = iArr[i2 + 2];
            int i8 = i7 & 1048575;
            if (iZzn <= 17) {
                if (i8 != i4) {
                    i3 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iZzo & 1048575;
            if (iZzn >= zzqg.zzJ.zza()) {
                zzqg.zzW.zza();
            }
            long j = i9;
            switch (iZzn) {
                case 0:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzC17 += zzpv.zzC(i6 << 3) + 8;
                    }
                    break;
                case 1:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzC = zzpv.zzC(i6 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 2:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzC2 = zzpv.zzC(i6 << 3);
                        iZzD = zzpv.zzD(j2);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 3:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzC2 = zzpv.zzC(i6 << 3);
                        iZzD = zzpv.zzD(j3);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 4:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzC2 = zzpv.zzC(i6 << 3);
                        iZzD = zzpv.zzD(j4);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 5:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzC3 = zzpv.zzC(i6 << 3);
                        iZzC4 = iZzC3 + 8;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 6:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzC = zzpv.zzC(i6 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 7:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzC4 = zzpv.zzC(i6 << 3) + 1;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 8:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        int i10 = i6 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzpm) {
                            iZzC5 = zzpv.zzC(i10);
                            iZzd = ((zzpm) object).zzd();
                            iZzC6 = zzpv.zzC(iZzd);
                            iZzC4 = iZzC5 + iZzC6 + iZzd;
                            iZzC17 += iZzC4;
                        } else {
                            iZzC2 = zzpv.zzC(i10);
                            iZzD = zzpv.zzB((String) object);
                            iZzC4 = iZzC2 + iZzD;
                            iZzC17 += iZzC4;
                        }
                    }
                    zzrtVar = this;
                    break;
                case 9:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzi = zzsc.zzi(i6, unsafe.getObject(obj, j), zzrtVar.zzq(i2));
                        iZzC17 += iZzi;
                    }
                    break;
                case 10:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        zzpm zzpmVar = (zzpm) unsafe.getObject(obj, j);
                        iZzC5 = zzpv.zzC(i6 << 3);
                        iZzd = zzpmVar.zzd();
                        iZzC6 = zzpv.zzC(iZzd);
                        iZzC4 = iZzC5 + iZzC6 + iZzd;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 11:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzC2 = zzpv.zzC(i6 << 3);
                        iZzD = zzpv.zzC(i11);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 12:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzC2 = zzpv.zzC(i6 << 3);
                        iZzD = zzpv.zzD(j5);
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 13:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzC = zzpv.zzC(i6 << 3);
                        iZzC4 = iZzC + 4;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 14:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzC3 = zzpv.zzC(i6 << 3);
                        iZzC4 = iZzC3 + 8;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 15:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzC2 = zzpv.zzC(i6 << 3);
                        iZzD = zzpv.zzC((i12 >> 31) ^ (i12 + i12));
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 16:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzC2 = zzpv.zzC(i6 << 3);
                        iZzD = zzpv.zzD((j6 >> 63) ^ (j6 + j6));
                        iZzC4 = iZzC2 + iZzD;
                        iZzC17 += iZzC4;
                    }
                    zzrtVar = this;
                    break;
                case 17:
                    if (zzrtVar.zzz(obj, i2, i4, i3, i)) {
                        iZzi = zzsc.zza(i6, (zzrq) unsafe.getObject(obj, j), zzrtVar.zzq(i2));
                        iZzC17 += iZzi;
                    }
                    break;
                case 18:
                    iZzi = zzsc.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzC17 += iZzi;
                    break;
                case 19:
                    iZzi = zzsc.zzc(i6, (List) unsafe.getObject(obj, j), false);
                    iZzC17 += iZzi;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i13 = zzsc.zza;
                    if (list.size() == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = zzsc.zzh(list) + (list.size() * zzpv.zzC(i6 << 3));
                    }
                    iZzC17 += iZzh;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = zzsc.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzm(list2);
                        iZzC7 = zzpv.zzC(i6 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzsc.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzg(list3);
                        iZzC7 = zzpv.zzC(i6 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 23:
                    iZzi = zzsc.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzC17 += iZzi;
                    break;
                case 24:
                    iZzi = zzsc.zzc(i6, (List) unsafe.getObject(obj, j), false);
                    iZzC17 += iZzi;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i16 = zzsc.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzi = 0;
                    } else {
                        iZzi = size2 * (zzpv.zzC(i6 << 3) + 1);
                    }
                    iZzC17 += iZzi;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i17 = zzsc.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzh = 0;
                    } else {
                        iZzh = zzpv.zzC(i6 << 3) * size3;
                        if (list5 instanceof zzrb) {
                            zzrb zzrbVar = (zzrb) list5;
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object objZza = zzrbVar.zza();
                                if (objZza instanceof zzpm) {
                                    int iZzd3 = ((zzpm) objZza).zzd();
                                    iZzh += zzpv.zzC(iZzd3) + iZzd3;
                                } else {
                                    iZzh += zzpv.zzB((String) objZza);
                                }
                            }
                        } else {
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object obj2 = list5.get(i19);
                                if (obj2 instanceof zzpm) {
                                    int iZzd4 = ((zzpm) obj2).zzd();
                                    iZzh += zzpv.zzC(iZzd4) + iZzd4;
                                } else {
                                    iZzh += zzpv.zzB((String) obj2);
                                }
                            }
                        }
                    }
                    iZzC17 += iZzh;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzsa zzsaVarZzq = zzrtVar.zzq(i2);
                    int i20 = zzsc.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzC8 = 0;
                    } else {
                        iZzC8 = zzpv.zzC(i6 << 3) * size4;
                        for (int i21 = 0; i21 < size4; i21++) {
                            Object obj3 = list6.get(i21);
                            if (obj3 instanceof zzra) {
                                iZzj = ((zzra) obj3).zza();
                                iZzC9 = zzpv.zzC(iZzj);
                            } else {
                                iZzj = ((zzpa) obj3).zzj(zzsaVarZzq);
                                iZzC9 = zzpv.zzC(iZzj);
                            }
                            iZzC8 += iZzC9 + iZzj;
                        }
                    }
                    iZzC17 += iZzC8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i22 = zzsc.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzC10 = 0;
                    } else {
                        iZzC10 = size5 * zzpv.zzC(i6 << 3);
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            int iZzd5 = ((zzpm) list7.get(i23)).zzd();
                            iZzC10 += zzpv.zzC(iZzd5) + iZzd5;
                        }
                    }
                    iZzC17 += iZzC10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i24 = zzsc.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzl(list8);
                        iZzC7 = zzpv.zzC(i6 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i25 = zzsc.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzb(list9);
                        iZzC7 = zzpv.zzC(i6 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 31:
                    iZzi = zzsc.zzc(i6, (List) unsafe.getObject(obj, j), false);
                    iZzC17 += iZzi;
                    break;
                case 32:
                    iZzi = zzsc.zze(i6, (List) unsafe.getObject(obj, j), false);
                    iZzC17 += iZzi;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i26 = zzsc.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzj(list10);
                        iZzC7 = zzpv.zzC(i6 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i27 = zzsc.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzi = 0;
                    } else {
                        iZzm = zzsc.zzk(list11);
                        iZzC7 = zzpv.zzC(i6 << 3);
                        iZzD2 = size * iZzC7;
                        iZzi = iZzm + iZzD2;
                    }
                    iZzC17 += iZzi;
                    break;
                case 35:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 36:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 37:
                    iZzf = zzsc.zzh((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 38:
                    iZzf = zzsc.zzm((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 39:
                    iZzf = zzsc.zzg((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 40:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 41:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i28 = zzsc.zza;
                    iZzf = list12.size();
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 43:
                    iZzf = zzsc.zzl((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 44:
                    iZzf = zzsc.zzb((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 45:
                    iZzf = zzsc.zzd((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 46:
                    iZzf = zzsc.zzf((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 47:
                    iZzf = zzsc.zzj((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 48:
                    iZzf = zzsc.zzk((List) unsafe.getObject(obj, j));
                    if (iZzf > 0) {
                        iZzC11 = zzpv.zzC(i6 << 3);
                        iZzC12 = zzpv.zzC(iZzf);
                        iZzC10 = iZzC11 + iZzC12 + iZzf;
                        iZzC17 += iZzC10;
                    }
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzsa zzsaVarZzq2 = zzrtVar.zzq(i2);
                    int i29 = zzsc.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZza = 0;
                    } else {
                        iZza = 0;
                        for (int i30 = 0; i30 < size6; i30++) {
                            iZza += zzsc.zza(i6, (zzrq) list13.get(i30), zzsaVarZzq2);
                        }
                    }
                    iZzC17 += iZza;
                    break;
                case 50:
                    zzrk zzrkVar = (zzrk) unsafe.getObject(obj, j);
                    zzrj zzrjVar = (zzrj) zzrtVar.zzr(i2);
                    if (zzrkVar.isEmpty()) {
                        iZzh = 0;
                    } else {
                        iZzh = 0;
                        for (Map.Entry entry2 : zzrkVar.entrySet()) {
                            iZzh += zzrjVar.zza(i6, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzC17 += iZzh;
                    break;
                case 51:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzC13 = zzpv.zzC(i6 << 3);
                        iZzi = iZzC13 + 8;
                        iZzC17 += iZzi;
                    }
                    break;
                case 52:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzC14 = zzpv.zzC(i6 << 3);
                        iZzi = iZzC14 + 4;
                        iZzC17 += iZzi;
                    }
                    break;
                case 53:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        long jZzp = zzp(obj, j);
                        iZzm = zzpv.zzC(i6 << 3);
                        iZzD2 = zzpv.zzD(jZzp);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 54:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        long jZzp2 = zzp(obj, j);
                        iZzm = zzpv.zzC(i6 << 3);
                        iZzD2 = zzpv.zzD(jZzp2);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 55:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        long jZzl = zzl(obj, j);
                        iZzm = zzpv.zzC(i6 << 3);
                        iZzD2 = zzpv.zzD(jZzl);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 56:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzC13 = zzpv.zzC(i6 << 3);
                        iZzi = iZzC13 + 8;
                        iZzC17 += iZzi;
                    }
                    break;
                case 57:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzC14 = zzpv.zzC(i6 << 3);
                        iZzi = iZzC14 + 4;
                        iZzC17 += iZzi;
                    }
                    break;
                case 58:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzi = zzpv.zzC(i6 << 3) + 1;
                        iZzC17 += iZzi;
                    }
                    break;
                case 59:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        int i31 = i6 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzpm) {
                            iZzC15 = zzpv.zzC(i31);
                            iZzd2 = ((zzpm) object2).zzd();
                            iZzC16 = zzpv.zzC(iZzd2);
                            iZzi = iZzC15 + iZzC16 + iZzd2;
                            iZzC17 += iZzi;
                        } else {
                            iZzm = zzpv.zzC(i31);
                            iZzD2 = zzpv.zzB((String) object2);
                            iZzi = iZzm + iZzD2;
                            iZzC17 += iZzi;
                        }
                    }
                    break;
                case 60:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzi = zzsc.zzi(i6, unsafe.getObject(obj, j), zzrtVar.zzq(i2));
                        iZzC17 += iZzi;
                    }
                    break;
                case 61:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        zzpm zzpmVar2 = (zzpm) unsafe.getObject(obj, j);
                        iZzC15 = zzpv.zzC(i6 << 3);
                        iZzd2 = zzpmVar2.zzd();
                        iZzC16 = zzpv.zzC(iZzd2);
                        iZzi = iZzC15 + iZzC16 + iZzd2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 62:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        int iZzl = zzl(obj, j);
                        iZzm = zzpv.zzC(i6 << 3);
                        iZzD2 = zzpv.zzC(iZzl);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 63:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        long jZzl2 = zzl(obj, j);
                        iZzm = zzpv.zzC(i6 << 3);
                        iZzD2 = zzpv.zzD(jZzl2);
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 64:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzC14 = zzpv.zzC(i6 << 3);
                        iZzi = iZzC14 + 4;
                        iZzC17 += iZzi;
                    }
                    break;
                case 65:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzC13 = zzpv.zzC(i6 << 3);
                        iZzi = iZzC13 + 8;
                        iZzC17 += iZzi;
                    }
                    break;
                case 66:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        int iZzl2 = zzl(obj, j);
                        iZzm = zzpv.zzC(i6 << 3);
                        iZzD2 = zzpv.zzC((iZzl2 >> 31) ^ (iZzl2 + iZzl2));
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 67:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        long jZzp3 = zzp(obj, j);
                        iZzm = zzpv.zzC(i6 << 3);
                        iZzD2 = zzpv.zzD((jZzp3 >> 63) ^ (jZzp3 + jZzp3));
                        iZzi = iZzm + iZzD2;
                        iZzC17 += iZzi;
                    }
                    break;
                case 68:
                    if (zzrtVar.zzC(obj, i6, i2)) {
                        iZzi = zzsc.zza(i6, (zzrq) unsafe.getObject(obj, j), zzrtVar.zzq(i2));
                        iZzC17 += iZzi;
                    }
                    break;
            }
            i2 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int iHashCode = (i4 * 53) + ((zzqm) obj).zzc.hashCode();
                return this.zzf ? (iHashCode * 53) + ((zzqk) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzo = zzo(i3);
            int i5 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i6 = iArr[i3];
            long j = i5;
            int iHashCode2 = 37;
            switch (iZzn) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzsw.zza(obj, j));
                    byte[] bArr = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzsw.zzb(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr2 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr3 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr4 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    iFloatToIntBits = zzqs.zza(zzsw.zzw(obj, j));
                    i4 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    iFloatToIntBits = ((String) zzsw.zzf(obj, j)).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object objZzf = zzsw.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode2 = objZzf.hashCode();
                    }
                    i4 = i2 + iHashCode2;
                    break;
                case 10:
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr5 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzc(obj, j);
                    i4 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = zzsw.zzd(obj, j);
                    byte[] bArr6 = zzqs.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i4 = i + iFloatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object objZzf2 = zzsw.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode2 = objZzf2.hashCode();
                    }
                    i4 = i2 + iHashCode2;
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
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    iFloatToIntBits = zzsw.zzf(obj, j).hashCode();
                    i4 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzj(obj, j));
                        byte[] bArr7 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzk(obj, j));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzl(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzl(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzqs.zza(zzD(obj, j));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = ((String) zzsw.zzf(obj, j)).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzl(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzl(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzl(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzl(obj, j);
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzqs.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i4 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzC(obj, i6, i3)) {
                        i = i4 * 53;
                        iFloatToIntBits = zzsw.zzf(obj, j).hashCode();
                        i4 = i + iFloatToIntBits;
                    }
                    break;
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final Object zzc() {
        return ((zzqm) this.zze).zzr();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzd(Object obj) {
        if (zzB(obj)) {
            if (obj instanceof zzqm) {
                zzqm zzqmVar = (zzqm) obj;
                zzqmVar.zzA(Integer.MAX_VALUE);
                zzqmVar.zza = 0;
                zzqmVar.zzy();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzo = zzo(i);
                int i2 = 1048575 & iZzo;
                int iZzn = zzn(iZzo);
                long j = i2;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzy(obj, i)) {
                                    zzq(i).zzd(zzb.getObject(obj, j));
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
                                ((zzqr) zzsw.zzf(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzrk) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzC(obj, iArr[i], i)) {
                        zzq(i).zzd(zzb.getObject(obj, j));
                    }
                } else if (zzy(obj, i)) {
                    zzq(i).zzd(zzb.getObject(obj, j));
                }
            }
            this.zzi.zza(obj);
            if (this.zzf) {
                this.zzj.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(Object obj, Object obj2) {
        if (!zzB(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzsc.zzp(this.zzi, obj, obj2);
                if (this.zzf) {
                    zzsc.zzo(this.zzj, obj, obj2);
                    return;
                }
                return;
            }
            int iZzo = zzo(i);
            int i2 = 1048575 & iZzo;
            int iZzn = zzn(iZzo);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzn) {
                case 0:
                    if (zzy(obj2, i)) {
                        zzsw.zzo(obj, j, zzsw.zza(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 1:
                    if (zzy(obj2, i)) {
                        zzsw.zzp(obj, j, zzsw.zzb(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 2:
                    if (zzy(obj2, i)) {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 3:
                    if (zzy(obj2, i)) {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 4:
                    if (zzy(obj2, i)) {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 5:
                    if (zzy(obj2, i)) {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 6:
                    if (zzy(obj2, i)) {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 7:
                    if (zzy(obj2, i)) {
                        zzsw.zzm(obj, j, zzsw.zzw(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 8:
                    if (zzy(obj2, i)) {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 9:
                    zzt(obj, obj2, i);
                    break;
                case 10:
                    if (zzy(obj2, i)) {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 11:
                    if (zzy(obj2, i)) {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 12:
                    if (zzy(obj2, i)) {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 13:
                    if (zzy(obj2, i)) {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 14:
                    if (zzy(obj2, i)) {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 15:
                    if (zzy(obj2, i)) {
                        zzsw.zzq(obj, j, zzsw.zzc(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 16:
                    if (zzy(obj2, i)) {
                        zzsw.zzr(obj, j, zzsw.zzd(obj2, j));
                        zzv(obj, i);
                    }
                    break;
                case 17:
                    zzt(obj, obj2, i);
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
                    zzqr zzqrVarZzd = (zzqr) zzsw.zzf(obj, j);
                    zzqr zzqrVar = (zzqr) zzsw.zzf(obj2, j);
                    int size = zzqrVarZzd.size();
                    int size2 = zzqrVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzqrVarZzd.zzc()) {
                            zzqrVarZzd = zzqrVarZzd.zzd(size2 + size);
                        }
                        zzqrVarZzd.addAll(zzqrVar);
                    }
                    if (size > 0) {
                        zzqrVar = zzqrVarZzd;
                    }
                    zzsw.zzs(obj, j, zzqrVar);
                    break;
                case 50:
                    int i4 = zzsc.zza;
                    zzrk zzrkVarZzb = (zzrk) zzsw.zzf(obj, j);
                    zzrk zzrkVar = (zzrk) zzsw.zzf(obj2, j);
                    if (!zzrkVar.isEmpty()) {
                        if (!zzrkVarZzb.zze()) {
                            zzrkVarZzb = zzrkVarZzb.zzb();
                        }
                        zzrkVarZzb.zzd(zzrkVar);
                    }
                    zzsw.zzs(obj, j, zzrkVarZzb);
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
                    if (zzC(obj2, i3, i)) {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                    }
                    break;
                case 60:
                    zzu(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzC(obj2, i3, i)) {
                        zzsw.zzs(obj, j, zzsw.zzf(obj2, j));
                        zzw(obj, i3, i);
                    }
                    break;
                case 68:
                    zzu(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzf(Object obj, zztb zztbVar) throws IOException {
        Map.Entry entry;
        int i;
        zzrt<T> zzrtVar = this;
        if (zzrtVar.zzf) {
            zzqf zzqfVar = ((zzqk) obj).zzb;
            if (zzqfVar.zza.isEmpty()) {
                entry = null;
            } else {
                entry = (Map.Entry) zzqfVar.zzf().next();
            }
        } else {
            entry = null;
        }
        int[] iArr = zzrtVar.zzc;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < iArr.length) {
            int iZzo = zzrtVar.zzo(i4);
            int iZzn = zzn(iZzo);
            int i6 = iArr[i4];
            if (iZzn <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            if (entry != null) {
                throw null;
            }
            long j = iZzo & i2;
            switch (iZzn) {
                case 0:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzf(i6, zzsw.zza(obj, j));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 1:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzn(i6, zzsw.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 2:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzs(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 3:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzJ(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 4:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzq(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 5:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzl(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 6:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzj(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 7:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzb(i6, zzsw.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 8:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zzE(i6, unsafe.getObject(obj, j), zztbVar);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 9:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzv(i6, unsafe.getObject(obj, j), zzrtVar.zzq(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 10:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzd(i6, (zzpm) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 11:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzH(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 12:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzh(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 13:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzx(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 14:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzz(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 15:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzB(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 16:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzD(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 17:
                    if (zzrtVar.zzz(obj, i4, i3, i5, i)) {
                        zztbVar.zzp(i6, unsafe.getObject(obj, j), zzrtVar.zzq(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 18:
                    zzsc.zzr(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 19:
                    zzsc.zzv(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 20:
                    zzsc.zzx(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 21:
                    zzsc.zzD(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 22:
                    zzsc.zzw(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 23:
                    zzsc.zzu(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 24:
                    zzsc.zzt(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 25:
                    zzsc.zzq(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 26:
                    int i9 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    int i10 = zzsc.zza;
                    if (list != null && !list.isEmpty()) {
                        zztbVar.zzG(i9, list);
                    }
                    break;
                case 27:
                    int i11 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzsa zzsaVarZzq = zzrtVar.zzq(i4);
                    int i12 = zzsc.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i13 = 0; i13 < list2.size(); i13++) {
                            ((zzpw) zztbVar).zzv(i11, list2.get(i13), zzsaVarZzq);
                        }
                    }
                    break;
                case 28:
                    int i14 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i15 = zzsc.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zztbVar.zze(i14, list3);
                    }
                    break;
                case 29:
                    zzsc.zzC(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 30:
                    zzsc.zzs(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 31:
                    zzsc.zzy(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 32:
                    zzsc.zzz(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 33:
                    zzsc.zzA(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 34:
                    zzsc.zzB(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    zzrtVar = this;
                    break;
                case 35:
                    zzsc.zzr(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 36:
                    zzsc.zzv(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 37:
                    zzsc.zzx(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 38:
                    zzsc.zzD(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 39:
                    zzsc.zzw(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 40:
                    zzsc.zzu(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 41:
                    zzsc.zzt(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 42:
                    zzsc.zzq(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 43:
                    zzsc.zzC(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 44:
                    zzsc.zzs(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 45:
                    zzsc.zzy(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 46:
                    zzsc.zzz(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 47:
                    zzsc.zzA(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 48:
                    zzsc.zzB(iArr[i4], (List) unsafe.getObject(obj, j), zztbVar, true);
                    break;
                case 49:
                    int i16 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzsa zzsaVarZzq2 = zzrtVar.zzq(i4);
                    int i17 = zzsc.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i18 = 0; i18 < list4.size(); i18++) {
                            ((zzpw) zztbVar).zzp(i16, list4.get(i18), zzsaVarZzq2);
                        }
                    }
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        zztbVar.zzu(i6, ((zzrj) zzrtVar.zzr(i4)).zzc(), (zzrk) object);
                    }
                    break;
                case 51:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzf(i6, zzj(obj, j));
                    }
                    break;
                case 52:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzn(i6, zzk(obj, j));
                    }
                    break;
                case 53:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzs(i6, zzp(obj, j));
                    }
                    break;
                case 54:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzJ(i6, zzp(obj, j));
                    }
                    break;
                case 55:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzq(i6, zzl(obj, j));
                    }
                    break;
                case 56:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzl(i6, zzp(obj, j));
                    }
                    break;
                case 57:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzj(i6, zzl(obj, j));
                    }
                    break;
                case 58:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzb(i6, zzD(obj, j));
                    }
                    break;
                case 59:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zzE(i6, unsafe.getObject(obj, j), zztbVar);
                    }
                    break;
                case 60:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzv(i6, unsafe.getObject(obj, j), zzrtVar.zzq(i4));
                    }
                    break;
                case 61:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzd(i6, (zzpm) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzH(i6, zzl(obj, j));
                    }
                    break;
                case 63:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzh(i6, zzl(obj, j));
                    }
                    break;
                case 64:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzx(i6, zzl(obj, j));
                    }
                    break;
                case 65:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzz(i6, zzp(obj, j));
                    }
                    break;
                case 66:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzB(i6, zzl(obj, j));
                    }
                    break;
                case 67:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzD(i6, zzp(obj, j));
                    }
                    break;
                case 68:
                    if (zzrtVar.zzC(obj, i6, i4)) {
                        zztbVar.zzp(i6, unsafe.getObject(obj, j), zzrtVar.zzq(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            zzrtVar = this;
        }
        if (entry != null) {
            throw null;
        }
        zzsq zzsqVar = ((zzqm) obj).zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(Object obj, Object obj2) {
        boolean zZzE;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzo = zzo(i);
            long j = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzx(obj, obj2, i) || Double.doubleToLongBits(zzsw.zza(obj, j)) != Double.doubleToLongBits(zzsw.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzx(obj, obj2, i) || Float.floatToIntBits(zzsw.zzb(obj, j)) != Float.floatToIntBits(zzsw.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzx(obj, obj2, i) || zzsw.zzd(obj, j) != zzsw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzx(obj, obj2, i) || zzsw.zzd(obj, j) != zzsw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzx(obj, obj2, i) || zzsw.zzc(obj, j) != zzsw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzx(obj, obj2, i) || zzsw.zzd(obj, j) != zzsw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzx(obj, obj2, i) || zzsw.zzc(obj, j) != zzsw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzx(obj, obj2, i) || zzsw.zzw(obj, j) != zzsw.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzx(obj, obj2, i) || !zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzx(obj, obj2, i) || !zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzx(obj, obj2, i) || !zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzx(obj, obj2, i) || zzsw.zzc(obj, j) != zzsw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzx(obj, obj2, i) || zzsw.zzc(obj, j) != zzsw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzx(obj, obj2, i) || zzsw.zzc(obj, j) != zzsw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzx(obj, obj2, i) || zzsw.zzd(obj, j) != zzsw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzx(obj, obj2, i) || zzsw.zzc(obj, j) != zzsw.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzx(obj, obj2, i) || zzsw.zzd(obj, j) != zzsw.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzx(obj, obj2, i) || !zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
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
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j));
                    break;
                case 50:
                    zZzE = zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j));
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
                    long jZzm = zzm(i) & 1048575;
                    if (zzsw.zzc(obj, jZzm) != zzsw.zzc(obj2, jZzm) || !zzsc.zzE(zzsw.zzf(obj, j), zzsw.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzE) {
                return false;
            }
        }
        if (!((zzqm) obj).zzc.equals(((zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzf) {
            return ((zzqk) obj).zzb.equals(((zzqk) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[LOOP:2: B:53:0x00d5->B:58:0x00e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzh(Object obj) {
        int i;
        int i2;
        List list;
        zzsa zzsaVarZzq;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzh) {
            int[] iArr = this.zzg;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int iZzo = zzo(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i12;
            }
            if ((268435456 & iZzo) != 0 && !zzz(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzz(obj, i7, i, i2, i11) && !zzA(obj, iZzo, zzq(i7))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzsw.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzsaVarZzq = zzq(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzsaVarZzq.zzh(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzC(obj, i8, i7) && !zzA(obj, iZzo, zzq(i7))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzsw.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzsaVarZzq = zzq(i7);
                    while (i3 < list.size()) {
                        if (!zzsaVarZzq.zzh(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn != 50) {
                continue;
            } else {
                zzrk zzrkVar = (zzrk) zzsw.zzf(obj, iZzo & 1048575);
                if (!zzrkVar.isEmpty() && ((zzrj) zzr(i7)).zzc().zzb.zzb() == zzta.MESSAGE) {
                    zzsa zzsaVarZzb = null;
                    for (Object obj2 : zzrkVar.values()) {
                        if (zzsaVarZzb == null) {
                            zzsaVarZzb = zzrx.zza().zzb(obj2.getClass());
                        }
                        if (!zzsaVarZzb.zzh(obj2)) {
                            return false;
                        }
                    }
                }
            }
            i5++;
            i6 = i;
            i4 = i2;
        }
        return !this.zzf || ((zzqk) obj).zzb.zzj();
    }
}
