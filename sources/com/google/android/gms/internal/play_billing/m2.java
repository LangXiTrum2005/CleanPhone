package com.google.android.gms.internal.play_billing;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.ca;
import com.google.android.gms.internal.ads.ur1;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 implements s2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f24409j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Unsafe f24410k = b3.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f24411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f24412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c1 f24415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f24416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r1 f24419i;

    public m2(int[] iArr, Object[] objArr, int i10, int i11, c1 c1Var, int[] iArr2, int i12, int i13, r1 r1Var, r1 r1Var2) {
        this.f24411a = iArr;
        this.f24412b = objArr;
        this.f24413c = i10;
        this.f24414d = i11;
        this.f24416f = iArr2;
        this.f24417g = i12;
        this.f24418h = i13;
        this.f24419i = r1Var;
        this.f24415e = c1Var;
    }

    public static Field D(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbV = defpackage.e.v("Field ", str, " for ", name, " not found. Known fields are ");
            sbV.append(string);
            throw new RuntimeException(sbV.toString(), e10);
        }
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t1) {
            return ((t1) obj).m();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0369  */
    /* JADX WARN: Code duplicated, block: B:186:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:189:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d3  */
    public static m2 t(r2 r2Var, r1 r1Var, r1 r1Var2) {
        int i10;
        int iCharAt;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        Object[] objArr;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int i28;
        int i29;
        int i30;
        Field fieldD;
        char cCharAt9;
        int i31;
        int i32;
        int i33;
        int i34;
        Field fieldD2;
        Field fieldD3;
        int i35;
        char cCharAt10;
        int i36;
        int i37;
        char cCharAt11;
        int i38;
        int i39;
        char cCharAt12;
        int i40;
        char cCharAt13;
        if (!(r2Var instanceof r2)) {
            r2Var.getClass();
            throw new ClassCastException();
        }
        String str = r2Var.f24462b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i10 = i41 + 1;
                if (str.charAt(i41) < 55296) {
                    break;
                }
                i41 = i10;
            }
        } else {
            i10 = 1;
        }
        int i42 = i10 + 1;
        int iCharAt2 = str.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i43 = iCharAt2 & 8191;
            int i44 = 13;
            while (true) {
                i40 = i42 + 1;
                cCharAt13 = str.charAt(i42);
                if (cCharAt13 < 55296) {
                    break;
                }
                i43 |= (cCharAt13 & 8191) << i44;
                i44 += 13;
                i42 = i40;
            }
            iCharAt2 = i43 | (cCharAt13 << i44);
            i42 = i40;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            i15 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i16 = 0;
            iArr = f24409j;
            i11 = 0;
        } else {
            int i45 = i42 + 1;
            int iCharAt3 = str.charAt(i42);
            if (iCharAt3 >= 55296) {
                int i46 = iCharAt3 & 8191;
                int i47 = 13;
                while (true) {
                    i24 = i45 + 1;
                    cCharAt8 = str.charAt(i45);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i24;
                }
                iCharAt3 = i46 | (cCharAt8 << i47);
                i45 = i24;
            }
            int i48 = i45 + 1;
            int iCharAt4 = str.charAt(i45);
            if (iCharAt4 >= 55296) {
                int i49 = iCharAt4 & 8191;
                int i50 = 13;
                while (true) {
                    i23 = i48 + 1;
                    cCharAt7 = str.charAt(i48);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i23;
                }
                iCharAt4 = i49 | (cCharAt7 << i50);
                i48 = i23;
            }
            int i51 = i48 + 1;
            int iCharAt5 = str.charAt(i48);
            if (iCharAt5 >= 55296) {
                int i52 = iCharAt5 & 8191;
                int i53 = 13;
                while (true) {
                    i22 = i51 + 1;
                    cCharAt6 = str.charAt(i51);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i22;
                }
                iCharAt5 = i52 | (cCharAt6 << i53);
                i51 = i22;
            }
            int i54 = i51 + 1;
            int iCharAt6 = str.charAt(i51);
            if (iCharAt6 >= 55296) {
                int i55 = iCharAt6 & 8191;
                int i56 = 13;
                while (true) {
                    i21 = i54 + 1;
                    cCharAt5 = str.charAt(i54);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i21;
                }
                iCharAt6 = i55 | (cCharAt5 << i56);
                i54 = i21;
            }
            int i57 = i54 + 1;
            iCharAt = str.charAt(i54);
            if (iCharAt >= 55296) {
                int i58 = iCharAt & 8191;
                int i59 = 13;
                while (true) {
                    i20 = i57 + 1;
                    cCharAt4 = str.charAt(i57);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt4 & 8191) << i59;
                    i59 += 13;
                    i57 = i20;
                }
                iCharAt = i58 | (cCharAt4 << i59);
                i57 = i20;
            }
            int i60 = i57 + 1;
            int iCharAt7 = str.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i61 = iCharAt7 & 8191;
                int i62 = 13;
                while (true) {
                    i19 = i60 + 1;
                    cCharAt3 = str.charAt(i60);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt3 & 8191) << i62;
                    i62 += 13;
                    i60 = i19;
                }
                iCharAt7 = i61 | (cCharAt3 << i62);
                i60 = i19;
            }
            int i63 = i60 + 1;
            int iCharAt8 = str.charAt(i60);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i18 = i63 + 1;
                    cCharAt2 = str.charAt(i63);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i64 |= (cCharAt2 & 8191) << i65;
                    i65 += 13;
                    i63 = i18;
                }
                iCharAt8 = i64 | (cCharAt2 << i65);
                i63 = i18;
            }
            int i66 = i63 + 1;
            int iCharAt9 = str.charAt(i63);
            if (iCharAt9 >= 55296) {
                int i67 = iCharAt9 & 8191;
                int i68 = 13;
                while (true) {
                    i17 = i66 + 1;
                    cCharAt = str.charAt(i66);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i67 |= (cCharAt & 8191) << i68;
                    i68 += 13;
                    i66 = i17;
                }
                iCharAt9 = i67 | (cCharAt << i68);
                i66 = i17;
            }
            int i69 = iCharAt3 + iCharAt3 + iCharAt4;
            i11 = iCharAt3;
            i42 = i66;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i70 = iCharAt7;
            i12 = iCharAt5;
            i13 = i70;
            i14 = iCharAt6;
            i15 = i69;
            i16 = iCharAt9;
        }
        Unsafe unsafe = f24410k;
        Object[] objArr2 = r2Var.f24463c;
        Class<?> cls = r2Var.f24461a.getClass();
        int i71 = i16 + i13;
        int i72 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i72];
        int i73 = i71;
        int i74 = i16;
        int i75 = 0;
        int i76 = 0;
        while (i42 < length) {
            int i77 = i42 + 1;
            int iCharAt10 = str.charAt(i42);
            int i78 = length;
            if (iCharAt10 >= 55296) {
                int i79 = iCharAt10 & 8191;
                int i80 = i77;
                int i81 = 13;
                while (true) {
                    i39 = i80 + 1;
                    cCharAt12 = str.charAt(i80);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i79 |= (cCharAt12 & 8191) << i81;
                    i81 += 13;
                    i80 = i39;
                    objArr2 = objArr;
                }
                iCharAt10 = i79 | (cCharAt12 << i81);
                i25 = i39;
            } else {
                objArr = objArr2;
                i25 = i77;
            }
            int i82 = i25 + 1;
            int iCharAt11 = str.charAt(i25);
            if (iCharAt11 >= 55296) {
                int i83 = iCharAt11 & 8191;
                int i84 = i82;
                int i85 = 13;
                while (true) {
                    i37 = i84 + 1;
                    cCharAt11 = str.charAt(i84);
                    i38 = i83;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i83 = i38 | ((cCharAt11 & 8191) << i85);
                    i85 += 13;
                    i84 = i37;
                }
                iCharAt11 = i38 | (cCharAt11 << i85);
                i26 = i37;
            } else {
                i26 = i82;
            }
            int i86 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i76] = i75;
                i76++;
            }
            int i87 = iCharAt11 & 255;
            Object[] objArr4 = objArr3;
            int i88 = iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n;
            if (i87 >= 51) {
                int i89 = i26 + 1;
                int iCharAt12 = str.charAt(i26);
                if (iCharAt12 >= 55296) {
                    int i90 = iCharAt12 & 8191;
                    int i91 = i89;
                    int i92 = 13;
                    while (true) {
                        i35 = i91 + 1;
                        cCharAt10 = str.charAt(i91);
                        i36 = i90;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i90 = i36 | ((cCharAt10 & 8191) << i92);
                        i92 += 13;
                        i91 = i35;
                    }
                    iCharAt12 = i36 | (cCharAt10 << i92);
                    i33 = i35;
                } else {
                    i33 = i89;
                }
                int i93 = iCharAt12;
                int i94 = i87 - 51;
                int i95 = i33;
                if (i94 == 9 || i94 == 17) {
                    objArr4[ca.f(i75, 3, 1)] = objArr[i15];
                    i34 = i88;
                    i15++;
                } else if (i94 != 12) {
                    i34 = i88;
                } else if (r2Var.a() == 1 || i88 != 0) {
                    objArr4[ca.f(i75, 3, 1)] = objArr[i15];
                    i15++;
                    i34 = i88;
                } else {
                    i34 = 0;
                }
                int i96 = i93 + i93;
                Object obj = objArr[i96];
                int i97 = i34;
                if (obj instanceof Field) {
                    fieldD2 = (Field) obj;
                } else {
                    fieldD2 = D(cls, (String) obj);
                    objArr[i96] = fieldD2;
                }
                i27 = i11;
                int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD2);
                int i98 = i96 + 1;
                Object obj2 = objArr[i98];
                if (obj2 instanceof Field) {
                    fieldD3 = (Field) obj2;
                } else {
                    fieldD3 = D(cls, (String) obj2);
                    objArr[i98] = fieldD3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD3);
                i71 = i71;
                i30 = iObjectFieldOffset2;
                i88 = i97;
                i28 = i95;
                i75 = i75;
                i29 = 0;
            } else {
                i27 = i11;
                int i99 = i15 + 1;
                Field fieldD4 = D(cls, (String) objArr[i15]);
                if (i87 == 9 || i87 == 17) {
                    objArr4[ca.f(i75, 3, 1)] = fieldD4.getType();
                } else {
                    if (i87 != 27) {
                        if (i87 == 49) {
                            i15 += 2;
                            i31 = 3;
                            i32 = 1;
                        } else if (i87 == 12 || i87 == 30 || i87 == 44) {
                            i71 = i71;
                            if (r2Var.a() == 1 || i88 != 0) {
                                i15 += 2;
                                objArr4[ca.f(i75, 3, 1)] = objArr[i99];
                            } else {
                                i15 = i99;
                                i88 = 0;
                            }
                        } else if (i87 == 50) {
                            int i100 = i15 + 2;
                            i74++;
                            iArr[i74] = i75;
                            int i101 = i75 / 3;
                            int i102 = i101 + i101;
                            objArr4[i102] = objArr[i99];
                            if (i88 != 0) {
                                i15 += 3;
                                objArr4[i102 + 1] = objArr[i100];
                            } else {
                                i15 = i100;
                                i88 = 0;
                            }
                            i71 = i71;
                        }
                        int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD4);
                        iObjectFieldOffset = 1048575;
                        if ((iCharAt11 & 4096) != 0 || i87 > 17) {
                            i28 = i26;
                            i29 = 0;
                        } else {
                            int i103 = i26 + 1;
                            int iCharAt13 = str.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i104 = iCharAt13 & 8191;
                                int i105 = 13;
                                while (true) {
                                    i28 = i103 + 1;
                                    cCharAt9 = str.charAt(i103);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i104 |= (cCharAt9 & 8191) << i105;
                                    i105 += 13;
                                    i103 = i28;
                                }
                                iCharAt13 = i104 | (cCharAt9 << i105);
                            } else {
                                i28 = i103;
                            }
                            int i106 = (iCharAt13 / 32) + i27 + i27;
                            Object obj3 = objArr[i106];
                            if (obj3 instanceof Field) {
                                fieldD = (Field) obj3;
                            } else {
                                fieldD = D(cls, (String) obj3);
                                objArr[i106] = fieldD;
                            }
                            i29 = iCharAt13 % 32;
                            iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD);
                        }
                        if (i87 < 18 && i87 <= 49) {
                            iArr[i73] = iObjectFieldOffset3;
                            i73++;
                        }
                        i30 = iObjectFieldOffset3;
                    } else {
                        i31 = 3;
                        i32 = 1;
                        i15 += 2;
                    }
                    objArr4[ca.f(i75, i31, i32)] = objArr[i99];
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldD4);
                    iObjectFieldOffset = 1048575;
                    if ((iCharAt11 & 4096) != 0) {
                        i28 = i26;
                        i29 = 0;
                    } else {
                        i28 = i26;
                        i29 = 0;
                    }
                    if (i87 < 18) {
                    }
                    i30 = iObjectFieldOffset4;
                }
                i15 = i99;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldD4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i28 = i26;
                    i29 = 0;
                } else {
                    i28 = i26;
                    i29 = 0;
                }
                if (i87 < 18) {
                }
                i30 = iObjectFieldOffset5;
            }
            int i107 = i75 + 1;
            iArr2[i75] = i86;
            int i108 = i75 + 2;
            String str2 = str;
            iArr2[i107] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i88 != 0 ? Integer.MIN_VALUE : 0) | (i87 << 20) | i30;
            iArr2[i108] = (i29 << 20) | iObjectFieldOffset;
            i75 += 3;
            i42 = i28;
            length = i78;
            objArr3 = objArr4;
            objArr2 = objArr;
            str = str2;
            i71 = i71;
            i11 = i27;
        }
        return new m2(iArr2, objArr3, i12, i14, r2Var.f24461a, iArr, i16, i71, r1Var, r1Var2);
    }

    public static int u(long j10, Object obj) {
        return ((Integer) b3.h(j10, obj)).intValue();
    }

    public static int w(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static long y(long j10, Object obj) {
        return ((Long) b3.h(j10, obj)).longValue();
    }

    public final s2 A(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f24412b;
        s2 s2Var = (s2) objArr[i12];
        if (s2Var != null) {
            return s2Var;
        }
        s2 s2VarA = p2.f24443c.a((Class) objArr[i12 + 1]);
        objArr[i12] = s2VarA;
        return s2VarA;
    }

    public final Object B(int i10, Object obj) {
        s2 s2VarA = A(i10);
        int iX = x(i10) & 1048575;
        if (!o(i10, obj)) {
            return s2VarA.zze();
        }
        Object object = f24410k.getObject(obj, iX);
        if (q(object)) {
            return object;
        }
        t1 t1VarZze = s2VarA.zze();
        if (object != null) {
            s2VarA.c(t1VarZze, object);
        }
        return t1VarZze;
    }

    public final Object C(int i10, int i11, Object obj) {
        s2 s2VarA = A(i11);
        if (!r(i10, i11, obj)) {
            return s2VarA.zze();
        }
        Object object = f24410k.getObject(obj, x(i11) & 1048575);
        if (q(object)) {
            return object;
        }
        t1 t1VarZze = s2VarA.zze();
        if (object != null) {
            s2VarA.c(t1VarZze, object);
        }
        return t1VarZze;
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final boolean a(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f24417g) {
            int i15 = this.f24416f[i13];
            int[] iArr = this.f24411a;
            int i16 = iArr[i15];
            int iX = x(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f24410k.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                int i20 = i12;
                i10 = i14;
                i11 = i20;
            }
            if ((268435456 & iX) == 0 || p(obj, i15, i10, i11, i19)) {
                int iW = w(iX);
                if (iW != 9 && iW != 17) {
                    if (iW != 27) {
                        if (iW == 60 || iW == 68) {
                            if (!r(i16, i15, obj) || A(i15).a(b3.h(iX & 1048575, obj))) {
                            }
                        } else if (iW != 49) {
                            if (iW == 50 && !((i2) b3.h(iX & 1048575, obj)).isEmpty()) {
                                int i21 = i15 / 3;
                                throw q4.a.h(this.f24412b[i21 + i21]);
                            }
                        }
                        i13++;
                        i14 = i10;
                        i12 = i11;
                    }
                    List list = (List) b3.h(iX & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        s2 s2VarA = A(i15);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (s2VarA.a(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i10;
                    i12 = i11;
                } else if (!p(obj, i15, i10, i11, i19) || A(i15).a(b3.h(iX & 1048575, obj))) {
                    i13++;
                    i14 = i10;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.s2
    public final void b(Object obj) {
        if (!q(obj)) {
            return;
        }
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            t1Var.l();
            t1Var.zza = 0;
            t1Var.j();
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24411a;
            if (i10 >= iArr.length) {
                this.f24419i.getClass();
                w2 w2Var = ((t1) obj).zzc;
                if (w2Var.f24498e) {
                    w2Var.f24498e = false;
                    return;
                }
                return;
            }
            int iX = x(i10);
            int i11 = 1048575 & iX;
            int iW = w(iX);
            long j10 = i11;
            if (iW != 9) {
                if (iW != 60 && iW != 68) {
                    switch (iW) {
                        case 17:
                            if (o(i10, obj)) {
                                A(i10).b(f24410k.getObject(obj, j10));
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
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                        case 27:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                        case 36:
                        case 37:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                        case 44:
                        case 45:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                            d1 d1Var = (d1) ((y1) b3.h(j10, obj));
                            if (d1Var.f24256a) {
                                d1Var.f24256a = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = f24410k;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((i2) object).f24289a = false;
                                unsafe.putObject(obj, j10, object);
                            }
                            break;
                    }
                } else if (r(iArr[i10], i10, obj)) {
                    A(i10).b(f24410k.getObject(obj, j10));
                }
            } else if (o(i10, obj)) {
                A(i10).b(f24410k.getObject(obj, j10));
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.play_billing.s2
    public final void c(Object obj, Object obj2) {
        Object obj3;
        if (!q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24411a;
            if (i10 >= iArr.length) {
                t2.p(obj, obj2);
                return;
            }
            int iX = x(i10);
            int i11 = iX & 1048575;
            int iW = w(iX);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iW) {
                case 0:
                    if (!o(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        a3 a3Var = b3.f24233c;
                        obj3 = obj;
                        a3Var.e(obj3, j10, a3Var.a(j10, obj2));
                        k(i10, obj3);
                    }
                    break;
                case 1:
                    if (o(i10, obj2)) {
                        a3 a3Var2 = b3.f24233c;
                        a3Var2.f(obj, j10, a3Var2.b(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i10, obj2)) {
                        b3.k(obj, j10, b3.f(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i10, obj2)) {
                        b3.k(obj, j10, b3.f(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i10, obj2)) {
                        b3.j(b3.e(j10, obj2), j10, obj);
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i10, obj2)) {
                        b3.k(obj, j10, b3.f(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i10, obj2)) {
                        b3.j(b3.e(j10, obj2), j10, obj);
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i10, obj2)) {
                        a3 a3Var3 = b3.f24233c;
                        a3Var3.c(obj, j10, a3Var3.g(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i10, obj2)) {
                        b3.l(obj, j10, b3.h(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    i(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(i10, obj2)) {
                        b3.l(obj, j10, b3.h(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(i10, obj2)) {
                        b3.j(b3.e(j10, obj2), j10, obj);
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i10, obj2)) {
                        b3.j(b3.e(j10, obj2), j10, obj);
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(i10, obj2)) {
                        b3.j(b3.e(j10, obj2), j10, obj);
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i10, obj2)) {
                        b3.k(obj, j10, b3.f(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i10, obj2)) {
                        b3.j(b3.e(j10, obj2), j10, obj);
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(i10, obj2)) {
                        b3.k(obj, j10, b3.f(j10, obj2));
                        k(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    i(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                case 27:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                case 31:
                case 32:
                case 33:
                case 34:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                case 36:
                case 37:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                case 39:
                case 40:
                case 41:
                case 42:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                case 44:
                case 45:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    y1 y1VarF = (y1) b3.h(j10, obj);
                    y1 y1Var = (y1) b3.h(j10, obj2);
                    int size = y1VarF.size();
                    int size2 = y1Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((d1) y1VarF).f24256a) {
                            y1VarF = y1VarF.f(size2 + size);
                        }
                        y1VarF.addAll(y1Var);
                    }
                    if (size > 0) {
                        y1Var = y1VarF;
                    }
                    b3.l(obj, j10, y1Var);
                    obj3 = obj;
                    break;
                case 50:
                    r1 r1Var = t2.f24472a;
                    b3.l(obj, j10, r1.c(b3.h(j10, obj), b3.h(j10, obj2)));
                    obj3 = obj;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (r(i12, i10, obj2)) {
                        b3.l(obj, j10, b3.h(j10, obj2));
                        b3.j(i12, iArr[i10 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    j(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                case 62:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i12, i10, obj2)) {
                        b3.l(obj, j10, b3.h(j10, obj2));
                        b3.j(i12, iArr[i10 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    j(i10, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i10 += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x03be  */
    /* JADX WARN: Code duplicated, block: B:195:0x0503  */
    @Override // com.google.android.gms.internal.play_billing.s2
    public final int d(c1 c1Var) {
        int i10;
        int iR;
        int iS;
        int iH;
        int i11;
        int iB;
        int iR2;
        int size;
        int iN;
        int iR3;
        int iR4;
        int iR5;
        int iB2;
        int iR6;
        int iS2;
        Unsafe unsafe = f24410k;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iD = 0;
        while (true) {
            int[] iArr = this.f24411a;
            if (i14 >= iArr.length) {
                return ((t1) c1Var).zzc.a() + iD;
            }
            int iX = x(i14);
            int iW = w(iX);
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i12;
            if (iW <= 17) {
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(c1Var, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iX & i12;
            if (iW >= o1.f24432b.f24436a) {
                o1.f24433c.getClass();
            }
            long j10 = i19;
            switch (iW) {
                case 0:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 8, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 1:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 4, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 2:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        long j11 = unsafe.getLong(c1Var, j10);
                        iR = j1.R(i16 << 3);
                        iS = j1.S(j11);
                        iH = iS + iR;
                        iD += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 3:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        long j12 = unsafe.getLong(c1Var, j10);
                        iR = j1.R(i16 << 3);
                        iS = j1.S(j12);
                        iH = iS + iR;
                        iD += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 4:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        long j13 = unsafe.getInt(c1Var, j10);
                        iR = j1.R(i16 << 3);
                        iS = j1.S(j13);
                        iH = iS + iR;
                        iD += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 5:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 8, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 6:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 4, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 7:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 1, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 8:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(c1Var, j10);
                        if (object instanceof i1) {
                            int iR7 = j1.R(i20);
                            int iM = ((i1) object).m();
                            iD = com.google.android.gms.internal.measurement.f2.y(iM, iM, iR7, iD);
                        } else {
                            iR = j1.R(i20);
                            iS = j1.Q((String) object);
                            iH = iS + iR;
                            iD += iH;
                        }
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 9:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        Object object2 = unsafe.getObject(c1Var, j10);
                        s2 s2VarA = A(i14);
                        r1 r1Var = t2.f24472a;
                        int iR8 = j1.R(i16 << 3);
                        int iB3 = ((c1) object2).b(s2VarA);
                        iD = com.google.android.gms.internal.measurement.f2.y(iB3, iB3, iR8, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 10:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        i1 i1Var = (i1) unsafe.getObject(c1Var, j10);
                        int iR9 = j1.R(i16 << 3);
                        int iM2 = i1Var.m();
                        iD = com.google.android.gms.internal.measurement.f2.y(iM2, iM2, iR9, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 11:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(unsafe.getInt(c1Var, j10), j1.R(i16 << 3), iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 12:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        long j14 = unsafe.getInt(c1Var, j10);
                        iR = j1.R(i16 << 3);
                        iS = j1.S(j14);
                        iH = iS + iR;
                        iD += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 13:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 4, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 14:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 8, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 15:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        int i21 = unsafe.getInt(c1Var, j10);
                        iD = com.google.android.gms.internal.measurement.f2.d((i21 >> 31) ^ (i21 + i21), j1.R(i16 << 3), iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 16:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        long j15 = unsafe.getLong(c1Var, j10);
                        iR = j1.R(i16 << 3);
                        iS = j1.S((j15 >> 63) ^ (j15 + j15));
                        iH = iS + iR;
                        iD += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 17:
                    if (p(c1Var, i14, i13, i15, i10)) {
                        c1 c1Var2 = (c1) unsafe.getObject(c1Var, j10);
                        s2 s2VarA2 = A(i14);
                        int iR10 = j1.R(i16 << 3);
                        i11 = iR10 + iR10;
                        iB = c1Var2.b(s2VarA2);
                        iH = iB + i11;
                        iD += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 18:
                    iH = t2.h(i16, (List) unsafe.getObject(c1Var, j10));
                    iD += iH;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 19:
                    iH = t2.g(i16, (List) unsafe.getObject(c1Var, j10));
                    iD += iH;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var2 = t2.f24472a;
                    if (list.size() == 0) {
                        iR2 = 0;
                    } else {
                        iR2 = (j1.R(i16 << 3) * list.size()) + t2.j(list);
                    }
                    iD += iR2;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var3 = t2.f24472a;
                    size = list2.size();
                    if (size == 0) {
                        iR4 = 0;
                    } else {
                        iN = t2.n(list2);
                        iR3 = j1.R(i16 << 3);
                        iR4 = (iR3 * size) + iN;
                    }
                    iD += iR4;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var4 = t2.f24472a;
                    size = list3.size();
                    if (size == 0) {
                        iR4 = 0;
                    } else {
                        iN = t2.i(list3);
                        iR3 = j1.R(i16 << 3);
                        iR4 = (iR3 * size) + iN;
                    }
                    iD += iR4;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 23:
                    iH = t2.h(i16, (List) unsafe.getObject(c1Var, j10));
                    iD += iH;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 24:
                    iH = t2.g(i16, (List) unsafe.getObject(c1Var, j10));
                    iD += iH;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var5 = t2.f24472a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iR2 = 0;
                    } else {
                        iR2 = (j1.R(i16 << 3) + 1) * size2;
                    }
                    iD += iR2;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    List list5 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var6 = t2.f24472a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iR4 = 0;
                    } else {
                        iR4 = j1.R(i16 << 3) * size3;
                        if (list5 instanceof d2) {
                            d2 d2Var = (d2) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object objZza = d2Var.zza();
                                if (objZza instanceof i1) {
                                    int iM3 = ((i1) objZza).m();
                                    iR4 = com.google.android.gms.internal.measurement.f2.d(iM3, iM3, iR4);
                                } else {
                                    iR4 = j1.Q((String) objZza) + iR4;
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj = list5.get(i23);
                                if (obj instanceof i1) {
                                    int iM4 = ((i1) obj).m();
                                    iR4 = com.google.android.gms.internal.measurement.f2.d(iM4, iM4, iR4);
                                } else {
                                    iR4 = j1.Q((String) obj) + iR4;
                                }
                            }
                        }
                    }
                    iD += iR4;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(c1Var, j10);
                    s2 s2VarA3 = A(i14);
                    r1 r1Var7 = t2.f24472a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iR5 = 0;
                    } else {
                        iR5 = j1.R(i16 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            int iB4 = ((c1) list6.get(i24)).b(s2VarA3);
                            iR5 = com.google.android.gms.internal.measurement.f2.d(iB4, iB4, iR5);
                        }
                    }
                    iD += iR5;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    List list7 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var8 = t2.f24472a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iR4 = 0;
                    } else {
                        iR4 = j1.R(i16 << 3) * size5;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int iM5 = ((i1) list7.get(i25)).m();
                            iR4 = com.google.android.gms.internal.measurement.f2.d(iM5, iM5, iR4);
                        }
                    }
                    iD += iR4;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    List list8 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var9 = t2.f24472a;
                    size = list8.size();
                    if (size == 0) {
                        iR4 = 0;
                    } else {
                        iN = t2.m(list8);
                        iR3 = j1.R(i16 << 3);
                        iR4 = (iR3 * size) + iN;
                    }
                    iD += iR4;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    List list9 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var10 = t2.f24472a;
                    size = list9.size();
                    if (size == 0) {
                        iR4 = 0;
                    } else {
                        iN = t2.f(list9);
                        iR3 = j1.R(i16 << 3);
                        iR4 = (iR3 * size) + iN;
                    }
                    iD += iR4;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 31:
                    iH = t2.g(i16, (List) unsafe.getObject(c1Var, j10));
                    iD += iH;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 32:
                    iH = t2.h(i16, (List) unsafe.getObject(c1Var, j10));
                    iD += iH;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var11 = t2.f24472a;
                    size = list10.size();
                    if (size == 0) {
                        iR4 = 0;
                    } else {
                        iN = t2.k(list10);
                        iR3 = j1.R(i16 << 3);
                        iR4 = (iR3 * size) + iN;
                    }
                    iD += iR4;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var12 = t2.f24472a;
                    size = list11.size();
                    if (size == 0) {
                        iR4 = 0;
                    } else {
                        iN = t2.l(list11);
                        iR3 = j1.R(i16 << 3);
                        iR4 = (iR3 * size) + iN;
                    }
                    iD += iR4;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    List list12 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var13 = t2.f24472a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(size6, j1.R(i16 << 3), size6, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var14 = t2.f24472a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(size7, j1.R(i16 << 3), size7, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 37:
                    int iJ = t2.j((List) unsafe.getObject(c1Var, j10));
                    if (iJ > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(iJ, j1.R(i16 << 3), iJ, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    int iN2 = t2.n((List) unsafe.getObject(c1Var, j10));
                    if (iN2 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(iN2, j1.R(i16 << 3), iN2, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 39:
                    int i26 = t2.i((List) unsafe.getObject(c1Var, j10));
                    if (i26 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(i26, j1.R(i16 << 3), i26, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var15 = t2.f24472a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(size8, j1.R(i16 << 3), size8, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var16 = t2.f24472a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(size9, j1.R(i16 << 3), size9, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var17 = t2.f24472a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(size10, j1.R(i16 << 3), size10, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    int iM6 = t2.m((List) unsafe.getObject(c1Var, j10));
                    if (iM6 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(iM6, j1.R(i16 << 3), iM6, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 44:
                    int iF = t2.f((List) unsafe.getObject(c1Var, j10));
                    if (iF > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(iF, j1.R(i16 << 3), iF, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var18 = t2.f24472a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(size11, j1.R(i16 << 3), size11, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    List list18 = (List) unsafe.getObject(c1Var, j10);
                    r1 r1Var19 = t2.f24472a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(size12, j1.R(i16 << 3), size12, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    int iK = t2.k((List) unsafe.getObject(c1Var, j10));
                    if (iK > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(iK, j1.R(i16 << 3), iK, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    int iL = t2.l((List) unsafe.getObject(c1Var, j10));
                    if (iL > 0) {
                        iD = com.google.android.gms.internal.measurement.f2.y(iL, j1.R(i16 << 3), iL, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    List list19 = (List) unsafe.getObject(c1Var, j10);
                    s2 s2VarA4 = A(i14);
                    r1 r1Var20 = t2.f24472a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iB2 = 0;
                    } else {
                        iB2 = 0;
                        for (int i27 = 0; i27 < size13; i27++) {
                            c1 c1Var3 = (c1) list19.get(i27);
                            int iR11 = j1.R(i16 << 3);
                            iB2 += c1Var3.b(s2VarA4) + iR11 + iR11;
                        }
                    }
                    iD += iB2;
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 50:
                    int i28 = i14 / 3;
                    i2 i2Var = (i2) unsafe.getObject(c1Var, j10);
                    if (this.f24412b[i28 + i28] != null) {
                        throw new ClassCastException();
                    }
                    if (i2Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = i2Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (r(i16, i14, c1Var)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 8, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (r(i16, i14, c1Var)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 4, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (r(i16, i14, c1Var)) {
                        long jY = y(j10, c1Var);
                        iR6 = j1.R(i16 << 3);
                        iS2 = j1.S(jY);
                        iD += iS2 + iR6;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (r(i16, i14, c1Var)) {
                        long jY2 = y(j10, c1Var);
                        iR6 = j1.R(i16 << 3);
                        iS2 = j1.S(jY2);
                        iD += iS2 + iR6;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (r(i16, i14, c1Var)) {
                        long jU = u(j10, c1Var);
                        iR6 = j1.R(i16 << 3);
                        iS2 = j1.S(jU);
                        iD += iS2 + iR6;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (r(i16, i14, c1Var)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 8, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (r(i16, i14, c1Var)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 4, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (r(i16, i14, c1Var)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 1, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (r(i16, i14, c1Var)) {
                        int i29 = i16 << 3;
                        Object object3 = unsafe.getObject(c1Var, j10);
                        if (object3 instanceof i1) {
                            int iR12 = j1.R(i29);
                            int iM7 = ((i1) object3).m();
                            iD = com.google.android.gms.internal.measurement.f2.y(iM7, iM7, iR12, iD);
                        } else {
                            iR6 = j1.R(i29);
                            iS2 = j1.Q((String) object3);
                            iD += iS2 + iR6;
                        }
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 60:
                    if (r(i16, i14, c1Var)) {
                        Object object4 = unsafe.getObject(c1Var, j10);
                        s2 s2VarA5 = A(i14);
                        r1 r1Var21 = t2.f24472a;
                        int iR13 = j1.R(i16 << 3);
                        int iB5 = ((c1) object4).b(s2VarA5);
                        iD = com.google.android.gms.internal.measurement.f2.y(iB5, iB5, iR13, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (r(i16, i14, c1Var)) {
                        i1 i1Var2 = (i1) unsafe.getObject(c1Var, j10);
                        int iR14 = j1.R(i16 << 3);
                        int iM8 = i1Var2.m();
                        iD = com.google.android.gms.internal.measurement.f2.y(iM8, iM8, iR14, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 62:
                    if (r(i16, i14, c1Var)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(u(j10, c1Var), j1.R(i16 << 3), iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (r(i16, i14, c1Var)) {
                        long jU2 = u(j10, c1Var);
                        iR6 = j1.R(i16 << 3);
                        iS2 = j1.S(jU2);
                        iD += iS2 + iR6;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 64:
                    if (r(i16, i14, c1Var)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 4, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 65:
                    if (r(i16, i14, c1Var)) {
                        iD = com.google.android.gms.internal.measurement.f2.d(i16 << 3, 8, iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 66:
                    if (r(i16, i14, c1Var)) {
                        int iU = u(j10, c1Var);
                        iD = com.google.android.gms.internal.measurement.f2.d((iU >> 31) ^ (iU + iU), j1.R(i16 << 3), iD);
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 67:
                    if (r(i16, i14, c1Var)) {
                        long jY3 = y(j10, c1Var);
                        iR6 = j1.R(i16 << 3);
                        iS2 = j1.S((jY3 >> 63) ^ (jY3 + jY3));
                        iD += iS2 + iR6;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                case 68:
                    if (r(i16, i14, c1Var)) {
                        c1 c1Var4 = (c1) unsafe.getObject(c1Var, j10);
                        s2 s2VarA6 = A(i14);
                        int iR15 = j1.R(i16 << 3);
                        i11 = iR15 + iR15;
                        iB = c1Var4.b(s2VarA6);
                        iH = iB + i11;
                        iD += iH;
                    }
                    i14 += 3;
                    i12 = 1048575;
                    break;
                default:
                    i14 += 3;
                    i12 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.s2
    public final int e(t1 t1Var) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f24411a;
            if (i14 >= iArr.length) {
                return t1Var.zzc.hashCode() + (i15 * 53);
            }
            int iX = x(i14);
            int i16 = 1048575 & iX;
            int iW = w(iX);
            int i17 = iArr[i14];
            long j10 = i16;
            int i18 = 1237;
            int iHashCode = 37;
            switch (iW) {
                case 0:
                    i10 = i15 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(b3.f24233c.a(j10, t1Var));
                    Charset charset = z1.f24507a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i15 * 53;
                    iFloatToIntBits = Float.floatToIntBits(b3.f24233c.b(j10, t1Var));
                    i15 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i15 * 53;
                    jDoubleToLongBits = b3.f(j10, t1Var);
                    Charset charset2 = z1.f24507a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i15 * 53;
                    jDoubleToLongBits = b3.f(j10, t1Var);
                    Charset charset3 = z1.f24507a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.e(j10, t1Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 5:
                    i10 = i15 * 53;
                    jDoubleToLongBits = b3.f(j10, t1Var);
                    Charset charset4 = z1.f24507a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.e(j10, t1Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 7:
                    i12 = i15 * 53;
                    boolean zG = b3.f24233c.g(j10, t1Var);
                    Charset charset5 = z1.f24507a;
                    if (zG) {
                        i18 = 1231;
                    }
                    i15 = i18 + i12;
                    break;
                case 8:
                    i11 = i15 * 53;
                    iFloatToIntBits = ((String) b3.h(j10, t1Var)).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i13 = i15 * 53;
                    Object objH = b3.h(j10, t1Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i15 = i13 + iHashCode;
                    break;
                case 10:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.h(j10, t1Var).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.e(j10, t1Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 12:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.e(j10, t1Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 13:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.e(j10, t1Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 14:
                    i10 = i15 * 53;
                    jDoubleToLongBits = b3.f(j10, t1Var);
                    Charset charset6 = z1.f24507a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.e(j10, t1Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 16:
                    i10 = i15 * 53;
                    jDoubleToLongBits = b3.f(j10, t1Var);
                    Charset charset7 = z1.f24507a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i15 * 53;
                    Object objH2 = b3.h(j10, t1Var);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i15 = i13 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                case 27:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                case 31:
                case 32:
                case 33:
                case 34:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                case 36:
                case 37:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                case 39:
                case 40:
                case 41:
                case 42:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                case 44:
                case 45:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.h(j10, t1Var).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i15 * 53;
                    iFloatToIntBits = b3.h(j10, t1Var).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) b3.h(j10, t1Var)).doubleValue());
                        Charset charset8 = z1.f24507a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) b3.h(j10, t1Var)).floatValue());
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = y(j10, t1Var);
                        Charset charset9 = z1.f24507a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = y(j10, t1Var);
                        Charset charset10 = z1.f24507a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = u(j10, t1Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = y(j10, t1Var);
                        Charset charset11 = z1.f24507a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = u(j10, t1Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i12 = i15 * 53;
                        boolean zBooleanValue = ((Boolean) b3.h(j10, t1Var)).booleanValue();
                        Charset charset12 = z1.f24507a;
                        if (zBooleanValue) {
                            i18 = 1231;
                        }
                        i15 = i18 + i12;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = ((String) b3.h(j10, t1Var)).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 60:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = b3.h(j10, t1Var).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = b3.h(j10, t1Var).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = u(j10, t1Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = u(j10, t1Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 64:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = u(j10, t1Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 65:
                    if (r(i17, i14, t1Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = y(j10, t1Var);
                        Charset charset13 = z1.f24507a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = u(j10, t1Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 67:
                    if (r(i17, i14, t1Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = y(j10, t1Var);
                        Charset charset14 = z1.f24507a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (r(i17, i14, t1Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = b3.h(j10, t1Var).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
            }
            i14 += 3;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void f(Object obj, h2 h2Var) throws b2.z {
        int i10;
        Unsafe unsafe = f24410k;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (true) {
            int[] iArr = this.f24411a;
            if (i12 >= iArr.length) {
                ((t1) obj).zzc.d(h2Var);
                return;
            }
            int iX = x(i12);
            int iW = w(iX);
            int i15 = iArr[i12];
            if (iW <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i11;
                if (i17 != i14) {
                    i13 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i14 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iX & i11;
            switch (iW) {
                case 0:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).X(i15, Double.doubleToRawLongBits(b3.f24233c.a(j10, obj)));
                    }
                    break;
                case 1:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).V(i15, Float.floatToRawIntBits(b3.f24233c.b(j10, obj)));
                    }
                    break;
                case 2:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).f0(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 3:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).f0(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 4:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).Z(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 5:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).X(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 6:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).V(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 7:
                    if (!p(obj, i12, i14, i13, i10)) {
                        continue;
                    } else {
                        byte bG = b3.f24233c.g(j10, obj);
                        j1 j1Var = (j1) h2Var.f24280a;
                        j1Var.e0(i15 << 3);
                        int i18 = j1Var.f24309d;
                        try {
                            int i19 = i18 + 1;
                            try {
                                j1Var.f24307b[i18] = bG;
                                j1Var.f24309d = i19;
                            } catch (IndexOutOfBoundsException e10) {
                                e = e10;
                                i18 = i19;
                                throw new b2.z(i18, j1Var.f24308c, 1, e, 8);
                            }
                        } catch (IndexOutOfBoundsException e11) {
                            e = e11;
                        }
                    }
                    break;
                case 8:
                    if (p(obj, i12, i14, i13, i10)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            ((j1) h2Var.f24280a).b0(i15, (String) object);
                        } else {
                            ((j1) h2Var.f24280a).U(i15, (i1) object);
                        }
                    }
                    break;
                case 9:
                    if (p(obj, i12, i14, i13, i10)) {
                        h2Var.d(i15, unsafe.getObject(obj, j10), A(i12));
                    }
                    break;
                case 10:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).U(i15, (i1) unsafe.getObject(obj, j10));
                    }
                    break;
                case 11:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).d0(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 12:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).Z(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 13:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).V(i15, unsafe.getInt(obj, j10));
                    }
                    break;
                case 14:
                    if (p(obj, i12, i14, i13, i10)) {
                        ((j1) h2Var.f24280a).X(i15, unsafe.getLong(obj, j10));
                    }
                    break;
                case 15:
                    if (p(obj, i12, i14, i13, i10)) {
                        int i20 = unsafe.getInt(obj, j10);
                        ((j1) h2Var.f24280a).d0(i15, (i20 >> 31) ^ (i20 + i20));
                    }
                    break;
                case 16:
                    if (p(obj, i12, i14, i13, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((j1) h2Var.f24280a).f0(i15, (j11 >> 63) ^ (j11 + j11));
                    }
                    break;
                case 17:
                    if (p(obj, i12, i14, i13, i10)) {
                        h2Var.c(i15, unsafe.getObject(obj, j10), A(i12));
                    }
                    break;
                case 18:
                    t2.r(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 19:
                    t2.v(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 20:
                    t2.x(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 21:
                    t2.d(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 22:
                    t2.w(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 23:
                    t2.u(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 24:
                    t2.t(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 25:
                    t2.q(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    int i21 = iArr[i12];
                    List list = (List) unsafe.getObject(obj, j10);
                    r1 r1Var = t2.f24472a;
                    if (list != null && !list.isEmpty()) {
                        j1 j1Var2 = (j1) h2Var.f24280a;
                        if (list instanceof d2) {
                            d2 d2Var = (d2) list;
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                Object objZza = d2Var.zza();
                                if (objZza instanceof String) {
                                    j1Var2.b0(i21, (String) objZza);
                                } else {
                                    j1Var2.U(i21, (i1) objZza);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                j1Var2.b0(i21, (String) list.get(i23));
                            }
                        }
                    }
                    break;
                case 27:
                    int i24 = iArr[i12];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    s2 s2VarA = A(i12);
                    r1 r1Var2 = t2.f24472a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            h2Var.d(i24, list2.get(i25), s2VarA);
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    int i26 = iArr[i12];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    r1 r1Var3 = t2.f24472a;
                    if (list3 != null && !list3.isEmpty()) {
                        h2Var.getClass();
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            ((j1) h2Var.f24280a).U(i26, (i1) list3.get(i27));
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    t2.c(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    t2.s(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 31:
                    t2.y(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 32:
                    t2.z(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 33:
                    t2.a(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case 34:
                    t2.b(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, false);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    t2.r(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case 36:
                    t2.v(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case 37:
                    t2.x(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    t2.d(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case 39:
                    t2.w(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case 40:
                    t2.u(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case 41:
                    t2.t(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case 42:
                    t2.q(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    t2.c(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case 44:
                    t2.s(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case 45:
                    t2.y(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    t2.z(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    t2.a(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    t2.b(iArr[i12], (List) unsafe.getObject(obj, j10), h2Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    int i28 = iArr[i12];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    s2 s2VarA2 = A(i12);
                    r1 r1Var4 = t2.f24472a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            h2Var.c(i28, list4.get(i29), s2VarA2);
                        }
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j10) != null) {
                        int i30 = i12 / 3;
                        throw q4.a.h(this.f24412b[i30 + i30]);
                    }
                    break;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).X(i15, Double.doubleToRawLongBits(((Double) b3.h(j10, obj)).doubleValue()));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).V(i15, Float.floatToRawIntBits(((Float) b3.h(j10, obj)).floatValue()));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).f0(i15, y(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).f0(i15, y(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).Z(i15, u(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).X(i15, y(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).V(i15, u(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (!r(i15, i12, obj)) {
                        continue;
                    } else {
                        byte bBooleanValue = ((Boolean) b3.h(j10, obj)).booleanValue();
                        j1 j1Var3 = (j1) h2Var.f24280a;
                        j1Var3.e0(i15 << 3);
                        int i31 = j1Var3.f24309d;
                        try {
                            int i32 = i31 + 1;
                            try {
                                j1Var3.f24307b[i31] = bBooleanValue;
                                j1Var3.f24309d = i32;
                            } catch (IndexOutOfBoundsException e12) {
                                e = e12;
                                i31 = i32;
                                throw new b2.z(i31, j1Var3.f24308c, 1, e, 8);
                            }
                        } catch (IndexOutOfBoundsException e13) {
                            e = e13;
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (r(i15, i12, obj)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            ((j1) h2Var.f24280a).b0(i15, (String) object2);
                        } else {
                            ((j1) h2Var.f24280a).U(i15, (i1) object2);
                        }
                    }
                    break;
                case 60:
                    if (r(i15, i12, obj)) {
                        h2Var.d(i15, unsafe.getObject(obj, j10), A(i12));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).U(i15, (i1) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).d0(i15, u(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).Z(i15, u(j10, obj));
                    }
                    break;
                case 64:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).V(i15, u(j10, obj));
                    }
                    break;
                case 65:
                    if (r(i15, i12, obj)) {
                        ((j1) h2Var.f24280a).X(i15, y(j10, obj));
                    }
                    break;
                case 66:
                    if (r(i15, i12, obj)) {
                        int iU = u(j10, obj);
                        ((j1) h2Var.f24280a).d0(i15, (iU >> 31) ^ (iU + iU));
                    }
                    break;
                case 67:
                    if (r(i15, i12, obj)) {
                        long jY = y(j10, obj);
                        ((j1) h2Var.f24280a).f0(i15, (jY >> 63) ^ (jY + jY));
                    }
                    break;
                case 68:
                    if (r(i15, i12, obj)) {
                        h2Var.c(i15, unsafe.getObject(obj, j10), A(i12));
                    }
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final void g(Object obj, byte[] bArr, int i10, int i11, ur1 ur1Var) {
        s(obj, bArr, i10, i11, 0, ur1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final boolean h(t1 t1Var, t1 t1Var2) {
        boolean zE;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24411a;
            if (i10 < iArr.length) {
                int iX = x(i10);
                long j10 = iX & 1048575;
                switch (w(iX)) {
                    case 0:
                        if (n(t1Var, t1Var2, i10)) {
                            a3 a3Var = b3.f24233c;
                            if (Double.doubleToLongBits(a3Var.a(j10, t1Var)) == Double.doubleToLongBits(a3Var.a(j10, t1Var2))) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 1:
                        if (n(t1Var, t1Var2, i10)) {
                            a3 a3Var2 = b3.f24233c;
                            if (Float.floatToIntBits(a3Var2.b(j10, t1Var)) == Float.floatToIntBits(a3Var2.b(j10, t1Var2))) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 2:
                        if (n(t1Var, t1Var2, i10) && b3.f(j10, t1Var) == b3.f(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (n(t1Var, t1Var2, i10) && b3.f(j10, t1Var) == b3.f(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (n(t1Var, t1Var2, i10) && b3.e(j10, t1Var) == b3.e(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (n(t1Var, t1Var2, i10) && b3.f(j10, t1Var) == b3.f(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (n(t1Var, t1Var2, i10) && b3.e(j10, t1Var) == b3.e(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (n(t1Var, t1Var2, i10)) {
                            a3 a3Var3 = b3.f24233c;
                            if (a3Var3.g(j10, t1Var) == a3Var3.g(j10, t1Var2)) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 8:
                        if (n(t1Var, t1Var2, i10) && t2.e(b3.h(j10, t1Var), b3.h(j10, t1Var2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (n(t1Var, t1Var2, i10) && t2.e(b3.h(j10, t1Var), b3.h(j10, t1Var2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (n(t1Var, t1Var2, i10) && t2.e(b3.h(j10, t1Var), b3.h(j10, t1Var2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (n(t1Var, t1Var2, i10) && b3.e(j10, t1Var) == b3.e(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (n(t1Var, t1Var2, i10) && b3.e(j10, t1Var) == b3.e(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (n(t1Var, t1Var2, i10) && b3.e(j10, t1Var) == b3.e(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (n(t1Var, t1Var2, i10) && b3.f(j10, t1Var) == b3.f(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 15:
                        if (n(t1Var, t1Var2, i10) && b3.e(j10, t1Var) == b3.e(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (n(t1Var, t1Var2, i10) && b3.f(j10, t1Var) == b3.f(j10, t1Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (n(t1Var, t1Var2, i10) && t2.e(b3.h(j10, t1Var), b3.h(j10, t1Var2))) {
                            continue;
                            i10 += 3;
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
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    case 27:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    case 36:
                    case 37:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    case 44:
                    case 45:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                        zE = t2.e(b3.h(j10, t1Var), b3.h(j10, t1Var2));
                        break;
                    case 50:
                        zE = t2.e(b3.h(j10, t1Var), b3.h(j10, t1Var2));
                        break;
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    case 60:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    case 62:
                    case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j11 = iArr[i10 + 2] & 1048575;
                        if (b3.e(j11, t1Var) == b3.e(j11, t1Var2) && t2.e(b3.h(j10, t1Var), b3.h(j10, t1Var2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    default:
                        continue;
                        i10 += 3;
                        break;
                }
                if (zE) {
                    i10 += 3;
                }
            } else if (t1Var.zzc.equals(t1Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final void i(int i10, Object obj, Object obj2) {
        if (o(i10, obj2)) {
            int iX = x(i10) & 1048575;
            Unsafe unsafe = f24410k;
            long j10 = iX;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f24411a[i10] + " is present but null: " + obj2.toString());
            }
            s2 s2VarA = A(i10);
            if (!o(i10, obj)) {
                if (q(object)) {
                    t1 t1VarZze = s2VarA.zze();
                    s2VarA.c(t1VarZze, object);
                    unsafe.putObject(obj, j10, t1VarZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                k(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!q(object2)) {
                t1 t1VarZze2 = s2VarA.zze();
                s2VarA.c(t1VarZze2, object2);
                unsafe.putObject(obj, j10, t1VarZze2);
                object2 = t1VarZze2;
            }
            s2VarA.c(object2, object);
        }
    }

    public final void j(int i10, Object obj, Object obj2) {
        int[] iArr = this.f24411a;
        int i11 = iArr[i10];
        if (r(i11, i10, obj2)) {
            int iX = x(i10) & 1048575;
            Unsafe unsafe = f24410k;
            long j10 = iX;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            s2 s2VarA = A(i10);
            if (!r(i11, i10, obj)) {
                if (q(object)) {
                    t1 t1VarZze = s2VarA.zze();
                    s2VarA.c(t1VarZze, object);
                    unsafe.putObject(obj, j10, t1VarZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                b3.j(i11, iArr[i10 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!q(object2)) {
                t1 t1VarZze2 = s2VarA.zze();
                s2VarA.c(t1VarZze2, object2);
                unsafe.putObject(obj, j10, t1VarZze2);
                object2 = t1VarZze2;
            }
            s2VarA.c(object2, object);
        }
    }

    public final void k(int i10, Object obj) {
        int i11 = this.f24411a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        b3.j((1 << (i11 >>> 20)) | b3.e(j10, obj), j10, obj);
    }

    public final void l(int i10, Object obj, Object obj2) {
        f24410k.putObject(obj, x(i10) & 1048575, obj2);
        k(i10, obj);
    }

    public final void m(int i10, int i11, Object obj, Object obj2) {
        f24410k.putObject(obj, x(i11) & 1048575, obj2);
        b3.j(i10, this.f24411a[i11 + 2] & 1048575, obj);
    }

    public final boolean n(t1 t1Var, t1 t1Var2, int i10) {
        return o(i10, t1Var) == o(i10, t1Var2);
    }

    public final boolean o(int i10, Object obj) {
        int i11 = this.f24411a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iX = x(i10);
            long j11 = iX & 1048575;
            switch (w(iX)) {
                case 0:
                    if (Double.doubleToRawLongBits(b3.f24233c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(b3.f24233c.b(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (b3.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (b3.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (b3.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (b3.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (b3.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return b3.f24233c.g(j11, obj);
                case 8:
                    Object objH = b3.h(j11, obj);
                    if (objH instanceof String) {
                        if (((String) objH).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objH instanceof i1)) {
                            throw new IllegalArgumentException();
                        }
                        if (i1.f24285c.equals(objH)) {
                            return false;
                        }
                    }
                case 9:
                    if (b3.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (i1.f24285c.equals(b3.h(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (b3.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (b3.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (b3.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (b3.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (b3.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (b3.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (b3.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & b3.e(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean p(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return o(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final boolean r(int i10, int i11, Object obj) {
        return b3.e((long) (this.f24411a[i11 + 2] & 1048575), obj) == i10;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 39941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int s(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.ads.ur1 r42) {
        /*
            Method dump skipped, instruction units count: 3994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.m2.s(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ur1):int");
    }

    public final int v(int i10, int i11) {
        int[] iArr = this.f24411a;
        int length = (iArr.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = iArr[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final int x(int i10) {
        return this.f24411a[i10 + 1];
    }

    public final w1 z(int i10) {
        int i11 = i10 / 3;
        return (w1) this.f24412b[i11 + i11 + 1];
    }

    @Override // com.google.android.gms.internal.play_billing.s2
    public final t1 zze() {
        return (t1) ((t1) this.f24415e).d(4);
    }
}
