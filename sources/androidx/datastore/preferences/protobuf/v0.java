package androidx.datastore.preferences.protobuf;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements d1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f4175n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f4176o = q1.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f4177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f4178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f4181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f4183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x0 f4186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j0 f4187k;
    public final l1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f4188m;

    public v0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, int[] iArr2, int i12, int i13, x0 x0Var, j0 j0Var, l1 l1Var, t tVar, r0 r0Var) {
        this.f4177a = iArr;
        this.f4178b = objArr;
        this.f4179c = i10;
        this.f4180d = i11;
        this.f4182f = aVar instanceof b0;
        this.f4183g = iArr2;
        this.f4184h = i12;
        this.f4185i = i13;
        this.f4186j = x0Var;
        this.f4187k = j0Var;
        this.l = l1Var;
        this.f4181e = aVar;
        this.f4188m = r0Var;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbK = d5.u.k("Field ", str, " for ");
            sbK.append(cls.getName());
            sbK.append(" not found. Known fields are ");
            sbK.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbK.toString());
        }
    }

    public static int K(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof b0) {
            return ((b0) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    public static v0 w(c1 c1Var, x0 x0Var, j0 j0Var, l1 l1Var, t tVar, r0 r0Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int[] iArr;
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
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        Field fieldF;
        int i31;
        char cCharAt9;
        int i32;
        Field fieldF2;
        Field fieldF3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        String str = c1Var.f4060b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i10 = i38 + 1;
                if (str.charAt(i38) < 55296) {
                    break;
                }
                i38 = i10;
            }
        } else {
            i10 = 1;
        }
        int i39 = i10 + 1;
        int iCharAt2 = str.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i40 = iCharAt2 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                cCharAt13 = str.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i37;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i14 = 0;
            i16 = 0;
            iArr = f4175n;
            i13 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt3 = str.charAt(i39);
            if (iCharAt3 >= 55296) {
                int i43 = iCharAt3 & 8191;
                int i44 = 13;
                while (true) {
                    i24 = i42 + 1;
                    cCharAt8 = str.charAt(i42);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i24;
                }
                iCharAt3 = i43 | (cCharAt8 << i44);
                i42 = i24;
            }
            int i45 = i42 + 1;
            int iCharAt4 = str.charAt(i42);
            if (iCharAt4 >= 55296) {
                int i46 = iCharAt4 & 8191;
                int i47 = 13;
                while (true) {
                    i23 = i45 + 1;
                    cCharAt7 = str.charAt(i45);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i23;
                }
                iCharAt4 = i46 | (cCharAt7 << i47);
                i45 = i23;
            }
            int i48 = i45 + 1;
            int iCharAt5 = str.charAt(i45);
            if (iCharAt5 >= 55296) {
                int i49 = iCharAt5 & 8191;
                int i50 = 13;
                while (true) {
                    i22 = i48 + 1;
                    cCharAt6 = str.charAt(i48);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i22;
                }
                iCharAt5 = i49 | (cCharAt6 << i50);
                i48 = i22;
            }
            int i51 = i48 + 1;
            int iCharAt6 = str.charAt(i48);
            if (iCharAt6 >= 55296) {
                int i52 = iCharAt6 & 8191;
                int i53 = 13;
                while (true) {
                    i21 = i51 + 1;
                    cCharAt5 = str.charAt(i51);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i21;
                }
                iCharAt6 = i52 | (cCharAt5 << i53);
                i51 = i21;
            }
            int i54 = i51 + 1;
            iCharAt = str.charAt(i51);
            if (iCharAt >= 55296) {
                int i55 = iCharAt & 8191;
                int i56 = 13;
                while (true) {
                    i20 = i54 + 1;
                    cCharAt4 = str.charAt(i54);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i20;
                }
                iCharAt = i55 | (cCharAt4 << i56);
                i54 = i20;
            }
            int i57 = i54 + 1;
            int iCharAt7 = str.charAt(i54);
            if (iCharAt7 >= 55296) {
                int i58 = iCharAt7 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    cCharAt3 = str.charAt(i57);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                iCharAt7 = i58 | (cCharAt3 << i59);
                i57 = i19;
            }
            int i60 = i57 + 1;
            int iCharAt8 = str.charAt(i57);
            if (iCharAt8 >= 55296) {
                int i61 = iCharAt8 & 8191;
                int i62 = 13;
                while (true) {
                    i18 = i60 + 1;
                    cCharAt2 = str.charAt(i60);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i61 |= (cCharAt2 & 8191) << i62;
                    i62 += 13;
                    i60 = i18;
                }
                iCharAt8 = i61 | (cCharAt2 << i62);
                i60 = i18;
            }
            int i63 = i60 + 1;
            int iCharAt9 = str.charAt(i60);
            if (iCharAt9 >= 55296) {
                int i64 = iCharAt9 & 8191;
                int i65 = 13;
                while (true) {
                    i17 = i63 + 1;
                    cCharAt = str.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i17;
                }
                iCharAt9 = i64 | (cCharAt << i65);
                i63 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i66 = (iCharAt3 * 2) + iCharAt4;
            int i67 = iCharAt7;
            i11 = iCharAt5;
            i12 = i67;
            i13 = iCharAt3;
            i39 = i63;
            iArr = iArr2;
            i14 = iCharAt6;
            i15 = i66;
            i16 = iCharAt9;
        }
        Unsafe unsafe = f4176o;
        Object[] objArr2 = c1Var.f4061c;
        Class<?> cls = c1Var.f4059a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[iCharAt * 2];
        int i68 = i16 + i12;
        int i69 = i68;
        int i70 = i16;
        int i71 = 0;
        int i72 = 0;
        while (i39 < length) {
            int i73 = i39 + 1;
            int iCharAt10 = str.charAt(i39);
            int i74 = length;
            if (iCharAt10 >= 55296) {
                int i75 = iCharAt10 & 8191;
                int i76 = i73;
                int i77 = 13;
                while (true) {
                    i36 = i76 + 1;
                    cCharAt12 = str.charAt(i76);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i36;
                    objArr2 = objArr;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i25 = i36;
            } else {
                objArr = objArr2;
                i25 = i73;
            }
            int i78 = i25 + 1;
            int iCharAt11 = str.charAt(i25);
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i34 = i80 + 1;
                    cCharAt11 = str.charAt(i80);
                    i35 = i79;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i79 = i35 | ((cCharAt11 & 8191) << i81);
                    i81 += 13;
                    i80 = i34;
                }
                iCharAt11 = i35 | (cCharAt11 << i81);
                i26 = i34;
            } else {
                i26 = i78;
            }
            int i82 = iCharAt10;
            int i83 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            int i84 = i13;
            if (i83 >= 51) {
                int i85 = i26 + 1;
                int iCharAt12 = str.charAt(i26);
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i86 = iCharAt12 & 8191;
                    int i87 = 13;
                    while (true) {
                        i33 = i85 + 1;
                        cCharAt10 = str.charAt(i85);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i86 |= (cCharAt10 & 8191) << i87;
                        i87 += 13;
                        i85 = i33;
                        c4 = 55296;
                    }
                    iCharAt12 = i86 | (cCharAt10 << i87);
                    i85 = i33;
                }
                int i88 = i83 - 51;
                int i89 = iCharAt12;
                if (i88 == 9 || i88 == 17) {
                    objArr3[defpackage.e.e(i71, 3, 2, 1)] = objArr[i15];
                    i15++;
                } else if (i88 == 12 && (v0.i.b(c1Var.a(), 1) || (iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0)) {
                    objArr3[defpackage.e.e(i71, 3, 2, 1)] = objArr[i15];
                    i15++;
                }
                int i90 = i89 * 2;
                Object obj = objArr[i90];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArr[i90] = fieldF2;
                }
                int i91 = i68;
                i28 = i15;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF2);
                int i92 = i90 + 1;
                Object obj2 = objArr[i92];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArr[i92] = fieldF3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldF3);
                str = str;
                iObjectFieldOffset = iObjectFieldOffset3;
                i71 = i71;
                i29 = i85;
                iObjectFieldOffset2 = iObjectFieldOffset4;
                i27 = i91;
                i30 = 0;
            } else {
                i27 = i68;
                int i93 = i15 + 1;
                Field fieldF4 = F(cls, (String) objArr[i15]);
                if (i83 == 9 || i83 == 17) {
                    i27 = i27;
                    objArr3[defpackage.e.e(i71, 3, 2, 1)] = fieldF4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i27 = i27;
                        i32 = i15 + 2;
                        objArr3[defpackage.e.e(i71, 3, 2, 1)] = objArr[i93];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i27 = i27;
                        if (c1Var.a() == 1 || (iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                            i32 = i15 + 2;
                            objArr3[defpackage.e.e(i71, 3, 2, 1)] = objArr[i93];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0 || i83 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            i29 = i26 + 1;
                            int iCharAt13 = str.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i94 = iCharAt13 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i31 = i29 + 1;
                                    cCharAt9 = str.charAt(i29);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i94 |= (cCharAt9 & 8191) << i95;
                                    i95 += 13;
                                    i29 = i31;
                                }
                                iCharAt13 = i94 | (cCharAt9 << i95);
                                i29 = i31;
                            }
                            int i96 = (iCharAt13 / 32) + (i84 * 2);
                            Object obj3 = objArr[i96];
                            if (obj3 instanceof Field) {
                                fieldF = (Field) obj3;
                            } else {
                                fieldF = F(cls, (String) obj3);
                                objArr[i96] = fieldF;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF);
                            i30 = iCharAt13 % 32;
                        }
                        if (i83 >= 18 && i83 <= 49) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                    } else {
                        if (i83 == 50) {
                            int i97 = i70 + 1;
                            iArr[i70] = i71;
                            int i98 = (i71 / 3) * 2;
                            int i99 = i15 + 2;
                            objArr3[i98] = objArr[i93];
                            i70 = i97;
                            if ((iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                                i28 = i15 + 3;
                                objArr3[i98 + 1] = objArr[i99];
                            } else {
                                i28 = i99;
                            }
                        } else {
                            i27 = i27;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        }
                        if (i83 >= 18) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                    }
                    i28 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    }
                    if (i83 >= 18) {
                        iArr[i69] = iObjectFieldOffset;
                        i69++;
                    }
                }
                i28 = i93;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                }
                if (i83 >= 18) {
                    iArr[i69] = iObjectFieldOffset;
                    i69++;
                }
            }
            int i100 = i71 + 1;
            iArr4[i71] = i82;
            int i101 = i71 + 2;
            int i102 = i71;
            iArr4[i100] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? Integer.MIN_VALUE : 0) | (i83 << 20) | iObjectFieldOffset;
            i71 = i102 + 3;
            iArr4[i101] = (i30 << 20) | iObjectFieldOffset2;
            i39 = i29;
            length = i74;
            iArr3 = iArr4;
            objArr2 = objArr;
            i68 = i27;
            i15 = i28;
            i13 = i84;
            str = str;
        }
        return new v0(iArr3, objArr3, i11, i14, c1Var.f4059a, iArr, i16, i68, x0Var, j0Var, l1Var, tVar, r0Var);
    }

    public static long x(int i10) {
        return i10 & 1048575;
    }

    public static int y(long j10, Object obj) {
        return ((Integer) q1.f4157c.h(j10, obj)).intValue();
    }

    public static long z(long j10, Object obj) {
        return ((Long) q1.f4157c.h(j10, obj)).longValue();
    }

    public final int A(int i10) {
        if (i10 >= this.f4179c && i10 <= this.f4180d) {
            int[] iArr = this.f4177a;
            int length = (iArr.length / 3) - 1;
            int i11 = 0;
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
        }
        return -1;
    }

    public final void B(Object obj, long j10, n nVar, d1 d1Var, s sVar) throws f0 {
        int iY;
        this.f4187k.getClass();
        d0 d0VarA = j0.a(j10, obj);
        m mVar = (m) nVar.f4137e;
        int i10 = nVar.f4134b;
        if ((i10 & 7) != 3) {
            throw g0.g();
        }
        do {
            b0 b0VarD = d1Var.d();
            nVar.f(b0VarD, d1Var, sVar);
            d1Var.b(b0VarD);
            d0VarA.add(b0VarD);
            if (mVar.e() || nVar.f4136d != 0) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == i10);
        nVar.f4136d = iY;
    }

    public final void C(Object obj, int i10, n nVar, d1 d1Var, s sVar) throws g0 {
        int iY;
        this.f4187k.getClass();
        d0 d0VarA = j0.a(i10 & 1048575, obj);
        m mVar = (m) nVar.f4137e;
        int i11 = nVar.f4134b;
        if ((i11 & 7) != 2) {
            throw g0.g();
        }
        do {
            b0 b0VarD = d1Var.d();
            nVar.h(b0VarD, d1Var, sVar);
            d1Var.b(b0VarD);
            d0VarA.add(b0VarD);
            if (mVar.e() || nVar.f4136d != 0) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == i11);
        nVar.f4136d = iY;
    }

    public final void D(int i10, n nVar, Object obj) throws com.google.crypto.tink.shaded.protobuf.c0, f0 {
        m mVar = (m) nVar.f4137e;
        if ((536870912 & i10) != 0) {
            nVar.T(2);
            q1.o(obj, i10 & 1048575, mVar.x());
        } else if (!this.f4182f) {
            q1.o(obj, i10 & 1048575, nVar.l());
        } else {
            nVar.T(2);
            q1.o(obj, i10 & 1048575, mVar.w());
        }
    }

    public final void E(int i10, n nVar, Object obj) throws com.google.crypto.tink.shaded.protobuf.c0, f0 {
        int i11 = 536870912 & i10;
        j0 j0Var = this.f4187k;
        if (i11 != 0) {
            j0Var.getClass();
            nVar.M(j0.a(i10 & 1048575, obj), true);
        } else {
            j0Var.getClass();
            nVar.M(j0.a(i10 & 1048575, obj), false);
        }
    }

    public final void G(int i10, Object obj) {
        int i11 = this.f4177a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        q1.m((1 << (i11 >>> 20)) | q1.f4157c.f(j10, obj), j10, obj);
    }

    public final void H(int i10, int i11, Object obj) {
        q1.m(i10, this.f4177a[i11 + 2] & 1048575, obj);
    }

    public final void I(Object obj, int i10, a aVar) {
        f4176o.putObject(obj, L(i10) & 1048575, aVar);
        G(i10, obj);
    }

    public final void J(Object obj, int i10, int i11, a aVar) {
        f4176o.putObject(obj, L(i11) & 1048575, aVar);
        H(i10, i11, obj);
    }

    public final int L(int i10) {
        return this.f4177a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void M(Object obj, n0 n0Var) throws IOException {
        int i10;
        int i11;
        boolean z10;
        v0 v0Var = this;
        int[] iArr = v0Var.f4177a;
        int length = iArr.length;
        Unsafe unsafe = f4176o;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iL = v0Var.L(i14);
            int i16 = iArr[i14];
            int iK = K(iL);
            if (iK <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iL & i12;
            switch (iK) {
                case 0:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        double d10 = q1.f4157c.d(j10, obj);
                        p pVar = (p) n0Var.f4139a;
                        pVar.getClass();
                        pVar.f0(i16, Double.doubleToRawLongBits(d10));
                    }
                    break;
                case 1:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        float fE = q1.f4157c.e(j10, obj);
                        p pVar2 = (p) n0Var.f4139a;
                        pVar2.getClass();
                        pVar2.d0(i16, Float.floatToRawIntBits(fE));
                    }
                    v0Var = this;
                    break;
                case 2:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).p0(i16, unsafe.getLong(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 3:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).p0(i16, unsafe.getLong(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 4:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).h0(i16, unsafe.getInt(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 5:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).f0(i16, unsafe.getLong(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 6:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).d0(i16, unsafe.getInt(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 7:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).a0(i16, q1.f4157c.c(j10, obj));
                    }
                    v0Var = this;
                    break;
                case 8:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            ((p) n0Var.f4139a).k0(i16, (String) object);
                        } else {
                            ((p) n0Var.f4139a).b0(i16, (j) object);
                        }
                    }
                    v0Var = this;
                    break;
                case 9:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).j0(i16, (a) unsafe.getObject(obj, j10), v0Var.m(i14));
                    }
                    break;
                case 10:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).b0(i16, (j) unsafe.getObject(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 11:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).n0(i16, unsafe.getInt(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 12:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).h0(i16, unsafe.getInt(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 13:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).d0(i16, unsafe.getInt(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 14:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        ((p) n0Var.f4139a).f0(i16, unsafe.getLong(obj, j10));
                    }
                    v0Var = this;
                    break;
                case 15:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        int i19 = unsafe.getInt(obj, j10);
                        ((p) n0Var.f4139a).n0(i16, (i19 >> 31) ^ (i19 << 1));
                    }
                    v0Var = this;
                    break;
                case 16:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((p) n0Var.f4139a).p0(i16, (j11 >> 63) ^ (j11 << 1));
                    }
                    v0Var = this;
                    break;
                case 17:
                    if (v0Var.o(obj, i14, i13, i15, i10)) {
                        n0Var.a(i16, unsafe.getObject(obj, j10), v0Var.m(i14));
                    }
                    break;
                case 18:
                    i13 = i13;
                    e1.n(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 19:
                    i13 = i13;
                    e1.r(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 20:
                    i13 = i13;
                    e1.t(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 21:
                    i13 = i13;
                    e1.z(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 22:
                    i13 = i13;
                    e1.s(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 23:
                    i13 = i13;
                    e1.q(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 24:
                    i13 = i13;
                    e1.p(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 25:
                    i13 = i13;
                    e1.m(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    i11 = i13;
                    int i20 = iArr[i14];
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls = e1.f4069a;
                    if (list != null && !list.isEmpty()) {
                        p pVar3 = (p) n0Var.f4139a;
                        if (list instanceof i0) {
                            i0 i0Var = (i0) list;
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                Object objI = i0Var.i();
                                if (objI instanceof String) {
                                    pVar3.k0(i20, (String) objI);
                                } else {
                                    pVar3.b0(i20, (j) objI);
                                }
                            }
                        } else {
                            for (int i22 = 0; i22 < list.size(); i22++) {
                                pVar3.k0(i20, (String) list.get(i22));
                            }
                        }
                    }
                    i13 = i11;
                    break;
                case 27:
                    i11 = i13;
                    int i23 = iArr[i14];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    d1 d1VarM = v0Var.m(i14);
                    Class cls2 = e1.f4069a;
                    if (list2 != null && !list2.isEmpty()) {
                        n0Var.getClass();
                        for (int i24 = 0; i24 < list2.size(); i24++) {
                            ((p) n0Var.f4139a).j0(i23, (a) list2.get(i24), d1VarM);
                        }
                    }
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    i11 = i13;
                    int i25 = iArr[i14];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    Class cls3 = e1.f4069a;
                    if (list3 != null && !list3.isEmpty()) {
                        n0Var.getClass();
                        for (int i26 = 0; i26 < list3.size(); i26++) {
                            ((p) n0Var.f4139a).b0(i25, (j) list3.get(i26));
                        }
                    }
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    z10 = false;
                    e1.y(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    z10 = false;
                    e1.o(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 31:
                    z10 = false;
                    e1.u(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 32:
                    z10 = false;
                    e1.v(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 33:
                    z10 = false;
                    e1.w(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case 34:
                    z10 = false;
                    e1.x(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, false);
                    i13 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    i11 = i13;
                    e1.n(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case 36:
                    i11 = i13;
                    e1.r(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case 37:
                    i11 = i13;
                    e1.t(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    i11 = i13;
                    e1.z(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case 39:
                    i11 = i13;
                    e1.s(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case 40:
                    i11 = i13;
                    e1.q(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case 41:
                    i11 = i13;
                    e1.p(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case 42:
                    i11 = i13;
                    e1.m(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    i11 = i13;
                    e1.y(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case 44:
                    i11 = i13;
                    e1.o(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case 45:
                    i11 = i13;
                    e1.u(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    i11 = i13;
                    e1.v(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    i11 = i13;
                    e1.w(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    i11 = i13;
                    e1.x(iArr[i14], (List) unsafe.getObject(obj, j10), n0Var, true);
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    i11 = i13;
                    int i27 = iArr[i14];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    d1 d1VarM2 = v0Var.m(i14);
                    Class cls4 = e1.f4069a;
                    if (list4 != null && !list4.isEmpty()) {
                        n0Var.getClass();
                        for (int i28 = 0; i28 < list4.size(); i28++) {
                            n0Var.a(i27, list4.get(i28), d1VarM2);
                        }
                    }
                    i13 = i11;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j10);
                    if (object2 != null) {
                        int i29 = 2;
                        Object obj2 = v0Var.f4178b[(i14 / 3) * 2];
                        v0Var.f4188m.getClass();
                        o0 o0Var = ((p0) obj2).f4151a;
                        p pVar4 = (p) n0Var.f4139a;
                        pVar4.getClass();
                        for (Map.Entry entry : ((q0) object2).entrySet()) {
                            pVar4.m0(i16, i29);
                            pVar4.o0(p0.a(o0Var, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            v.b(pVar4, o0Var.f4141a, 1, key);
                            i29 = 2;
                            v.b(pVar4, o0Var.f4142b, 2, value);
                            i13 = i13;
                        }
                    }
                    i11 = i13;
                    i13 = i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        double dDoubleValue = ((Double) q1.f4157c.h(j10, obj)).doubleValue();
                        p pVar5 = (p) n0Var.f4139a;
                        pVar5.getClass();
                        pVar5.f0(i16, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        float fFloatValue = ((Float) q1.f4157c.h(j10, obj)).floatValue();
                        p pVar6 = (p) n0Var.f4139a;
                        pVar6.getClass();
                        pVar6.d0(i16, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).p0(i16, z(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).p0(i16, z(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).h0(i16, y(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).f0(i16, z(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).d0(i16, y(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).a0(i16, ((Boolean) q1.f4157c.h(j10, obj)).booleanValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        Object object3 = unsafe.getObject(obj, j10);
                        if (object3 instanceof String) {
                            ((p) n0Var.f4139a).k0(i16, (String) object3);
                        } else {
                            ((p) n0Var.f4139a).b0(i16, (j) object3);
                        }
                    }
                    break;
                case 60:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).j0(i16, (a) unsafe.getObject(obj, j10), v0Var.m(i14));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).b0(i16, (j) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).n0(i16, y(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).h0(i16, y(j10, obj));
                    }
                    break;
                case 64:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).d0(i16, y(j10, obj));
                    }
                    break;
                case 65:
                    if (v0Var.q(i16, i14, obj)) {
                        ((p) n0Var.f4139a).f0(i16, z(j10, obj));
                    }
                    break;
                case 66:
                    if (v0Var.q(i16, i14, obj)) {
                        int iY = y(j10, obj);
                        ((p) n0Var.f4139a).n0(i16, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (v0Var.q(i16, i14, obj)) {
                        long jZ = z(j10, obj);
                        ((p) n0Var.f4139a).p0(i16, (jZ << 1) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (v0Var.q(i16, i14, obj)) {
                        n0Var.a(i16, unsafe.getObject(obj, j10), v0Var.m(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        v0Var.l.getClass();
        ((b0) obj).unknownFields.d(n0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f4177a;
            if (i10 >= iArr.length) {
                e1.k(this.l, obj, obj2);
                return;
            }
            int iL = L(i10);
            long j10 = 1048575 & iL;
            int i11 = iArr[i10];
            switch (K(iL)) {
                case 0:
                    if (!n(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        p1 p1Var = q1.f4157c;
                        obj3 = obj;
                        p1Var.l(obj3, j10, p1Var.d(j10, obj2));
                        G(i10, obj3);
                    }
                    break;
                case 1:
                    if (n(i10, obj2)) {
                        p1 p1Var2 = q1.f4157c;
                        p1Var2.m(obj, j10, p1Var2.e(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i10, obj2)) {
                        q1.n(obj, j10, q1.f4157c.g(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i10, obj2)) {
                        q1.n(obj, j10, q1.f4157c.g(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i10, obj2)) {
                        q1.m(q1.f4157c.f(j10, obj2), j10, obj);
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i10, obj2)) {
                        q1.n(obj, j10, q1.f4157c.g(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i10, obj2)) {
                        q1.m(q1.f4157c.f(j10, obj2), j10, obj);
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i10, obj2)) {
                        p1 p1Var3 = q1.f4157c;
                        p1Var3.j(obj, j10, p1Var3.c(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i10, obj2)) {
                        q1.o(obj, j10, q1.f4157c.h(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i10, obj2)) {
                        q1.o(obj, j10, q1.f4157c.h(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i10, obj2)) {
                        q1.m(q1.f4157c.f(j10, obj2), j10, obj);
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i10, obj2)) {
                        q1.m(q1.f4157c.f(j10, obj2), j10, obj);
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i10, obj2)) {
                        q1.m(q1.f4157c.f(j10, obj2), j10, obj);
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i10, obj2)) {
                        q1.n(obj, j10, q1.f4157c.g(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i10, obj2)) {
                        q1.m(q1.f4157c.f(j10, obj2), j10, obj);
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i10, obj2)) {
                        q1.n(obj, j10, q1.f4157c.g(j10, obj2));
                        G(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i10, obj, obj2);
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
                    this.f4187k.getClass();
                    p1 p1Var4 = q1.f4157c;
                    d0 d0VarM = (d0) p1Var4.h(j10, obj);
                    d0 d0Var = (d0) p1Var4.h(j10, obj2);
                    int size = d0VarM.size();
                    int size2 = d0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((b) d0VarM).f4053a) {
                            d0VarM = ((b1) d0VarM).m(size2 + size);
                        }
                        d0VarM.addAll(d0Var);
                    }
                    if (size > 0) {
                        d0Var = d0VarM;
                    }
                    q1.o(obj, j10, d0Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = e1.f4069a;
                    p1 p1Var5 = q1.f4157c;
                    Object objH = p1Var5.h(j10, obj);
                    Object objH2 = p1Var5.h(j10, obj2);
                    this.f4188m.getClass();
                    q1.o(obj, j10, r0.a(objH, objH2));
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
                    if (q(i11, i10, obj2)) {
                        q1.o(obj, j10, q1.f4157c.h(j10, obj2));
                        H(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                case 62:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i11, i10, obj2)) {
                        q1.o(obj, j10, q1.f4157c.h(j10, obj2));
                        H(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i10, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                b0Var.k(Integer.MAX_VALUE);
                b0Var.memoizedHashCode = 0;
                b0Var.h();
            }
            int[] iArr = this.f4177a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iL = L(i10);
                long j10 = 1048575 & iL;
                int iK = K(iL);
                if (iK != 9) {
                    if (iK != 60 && iK != 68) {
                        switch (iK) {
                            case 17:
                                if (n(i10, obj)) {
                                    m(i10).b(f4176o.getObject(obj, j10));
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
                                this.f4187k.getClass();
                                b bVar = (b) ((d0) q1.f4157c.h(j10, obj));
                                if (bVar.f4053a) {
                                    bVar.f4053a = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f4176o;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    this.f4188m.getClass();
                                    ((q0) object).f4154a = false;
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (q(iArr[i10], i10, obj)) {
                        m(i10).b(f4176o.getObject(obj, j10));
                    }
                } else if (n(i10, obj)) {
                    m(i10).b(f4176o.getObject(obj, j10));
                }
            }
            this.l.getClass();
            k1 k1Var = ((b0) obj).unknownFields;
            if (k1Var.f4121e) {
                k1Var.f4121e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean c(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f4184h) {
            int i15 = this.f4183g[i14];
            int[] iArr = this.f4177a;
            int i16 = iArr[i15];
            int iL = L(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f4176o.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                int i20 = i13;
                i10 = i12;
                i11 = i20;
            }
            if ((268435456 & iL) == 0 || o(obj, i15, i10, i11, i19)) {
                int iK = K(iL);
                if (iK == 9 || iK == 17) {
                    if (o(obj, i15, i10, i11, i19)) {
                        if (!m(i15).c(q1.f4157c.h(iL & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (q(i16, i15, obj)) {
                                if (!m(i15).c(q1.f4157c.h(iL & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i10;
                            i13 = i11;
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                Object objH = q1.f4157c.h(iL & 1048575, obj);
                                this.f4188m.getClass();
                                q0 q0Var = (q0) objH;
                                if (q0Var.isEmpty()) {
                                    continue;
                                } else {
                                    if (((p0) this.f4178b[(i15 / 3) * 2]).f4151a.f4142b.f4205a != z1.MESSAGE) {
                                        continue;
                                    } else {
                                        d1 d1VarA = null;
                                        for (Object obj2 : q0Var.values()) {
                                            if (d1VarA == null) {
                                                d1VarA = a1.f4050c.a(obj2.getClass());
                                            }
                                            if (!d1VarA.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i10;
                            i13 = i11;
                        }
                    }
                    List list = (List) q1.f4157c.h(iL & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        d1 d1VarM = m(i15);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (d1VarM.c(list.get(i21))) {
                            }
                        }
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final b0 d() {
        this.f4186j.getClass();
        return ((b0) this.f4181e).i();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void e(Object obj, n0 n0Var) throws IOException {
        n0Var.getClass();
        M(obj, n0Var);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final void f(java.lang.Object r19, androidx.datastore.preferences.protobuf.n r20, androidx.datastore.preferences.protobuf.s r21) {
        /*
            Method dump skipped, instruction units count: 1934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.v0.f(java.lang.Object, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.s):void");
    }

    /* JADX WARN: Code duplicated, block: B:144:0x038c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cd  */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final int g(b0 b0Var) {
        int i10;
        int iT;
        int iT2;
        int iT3;
        int iV;
        int iT4;
        int iV2;
        int iT5;
        int iT6;
        int iR;
        int iT7;
        int iA;
        int iC;
        int iT8;
        int size;
        int i11;
        int iT9;
        int iT10;
        int size2;
        int iT11;
        int iU;
        int iV3;
        int iA2;
        int iT12;
        int iU2;
        v0 v0Var = this;
        b0 b0Var2 = b0Var;
        Unsafe unsafe = f4176o;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int iR2 = 0;
        while (true) {
            int[] iArr = v0Var.f4177a;
            if (i13 >= iArr.length) {
                v0Var.l.getClass();
                return b0Var2.unknownFields.b() + iR2;
            }
            int iL = v0Var.L(i13);
            int iK = K(iL);
            int i15 = iArr[i13];
            int i16 = iArr[i13 + 2];
            int i17 = i16 & 1048575;
            if (iK <= 17) {
                if (i17 != i12) {
                    i14 = i17 == 1048575 ? 0 : unsafe.getInt(b0Var2, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iL & 1048575;
            if (iK >= w.f4189b.f4193a) {
                int i18 = w.f4190c.f4193a;
            }
            switch (iK) {
                case 0:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        iT = p.T(i15);
                        iC = iT + 8;
                        iR2 += iC;
                    }
                    break;
                case 1:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        iT2 = p.T(i15);
                        iT6 = iT2 + 4;
                        iR2 += iT6;
                    }
                    v0Var = this;
                    b0Var2 = b0Var;
                    break;
                case 2:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        long j11 = unsafe.getLong(b0Var2, j10);
                        iT3 = p.T(i15);
                        iV = p.V(j11);
                        iR2 += iV + iT3;
                    }
                    v0Var = this;
                    break;
                case 3:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        long j12 = unsafe.getLong(b0Var2, j10);
                        iT3 = p.T(i15);
                        iV = p.V(j12);
                        iR2 += iV + iT3;
                    }
                    v0Var = this;
                    break;
                case 4:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        int i19 = unsafe.getInt(b0Var2, j10);
                        iT4 = p.T(i15);
                        iV2 = p.V(i19);
                        iR = iV2 + iT4;
                        iR2 += iR;
                    }
                    v0Var = this;
                    break;
                case 5:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        iT5 = p.T(i15);
                        iT6 = iT5 + 8;
                        iR2 += iT6;
                    }
                    v0Var = this;
                    b0Var2 = b0Var;
                    break;
                case 6:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        iT2 = p.T(i15);
                        iT6 = iT2 + 4;
                        iR2 += iT6;
                    }
                    v0Var = this;
                    b0Var2 = b0Var;
                    break;
                case 7:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        iT6 = p.T(i15) + 1;
                        iR2 += iT6;
                    }
                    v0Var = this;
                    b0Var2 = b0Var;
                    break;
                case 8:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        Object object = unsafe.getObject(b0Var2, j10);
                        iR2 = (object instanceof j ? p.R(i15, (j) object) : p.S((String) object) + p.T(i15)) + iR2;
                    }
                    v0Var = this;
                    break;
                case 9:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        Object object2 = unsafe.getObject(b0Var2, j10);
                        d1 d1VarM = v0Var.m(i13);
                        Class cls = e1.f4069a;
                        int iT13 = p.T(i15);
                        int iA3 = ((a) object2).a(d1VarM);
                        iR2 += p.U(iA3) + iA3 + iT13;
                    }
                    break;
                case 10:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        iR = p.R(i15, (j) unsafe.getObject(b0Var2, j10));
                        iR2 += iR;
                    }
                    v0Var = this;
                    break;
                case 11:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        int i20 = unsafe.getInt(b0Var2, j10);
                        iT4 = p.T(i15);
                        iV2 = p.U(i20);
                        iR = iV2 + iT4;
                        iR2 += iR;
                    }
                    v0Var = this;
                    break;
                case 12:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        int i21 = unsafe.getInt(b0Var2, j10);
                        iT4 = p.T(i15);
                        iV2 = p.V(i21);
                        iR = iV2 + iT4;
                        iR2 += iR;
                    }
                    v0Var = this;
                    break;
                case 13:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        iT2 = p.T(i15);
                        iT6 = iT2 + 4;
                        iR2 += iT6;
                    }
                    v0Var = this;
                    b0Var2 = b0Var;
                    break;
                case 14:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        iT5 = p.T(i15);
                        iT6 = iT5 + 8;
                        iR2 += iT6;
                    }
                    v0Var = this;
                    b0Var2 = b0Var;
                    break;
                case 15:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        int i22 = unsafe.getInt(b0Var2, j10);
                        iT4 = p.T(i15);
                        iV2 = p.U((i22 >> 31) ^ (i22 << 1));
                        iR = iV2 + iT4;
                        iR2 += iR;
                    }
                    v0Var = this;
                    break;
                case 16:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        long j13 = unsafe.getLong(b0Var2, j10);
                        iT3 = p.T(i15);
                        iV = p.V((j13 << 1) ^ (j13 >> 63));
                        iR2 += iV + iT3;
                    }
                    v0Var = this;
                    break;
                case 17:
                    if (v0Var.o(b0Var2, i13, i12, i14, i10)) {
                        a aVar = (a) unsafe.getObject(b0Var2, j10);
                        d1 d1VarM2 = v0Var.m(i13);
                        iT7 = p.T(i15) * 2;
                        iA = aVar.a(d1VarM2);
                        iC = iA + iT7;
                        iR2 += iC;
                    }
                    break;
                case 18:
                    iC = e1.c(i15, (List) unsafe.getObject(b0Var2, j10));
                    iR2 += iC;
                    break;
                case 19:
                    iC = e1.b(i15, (List) unsafe.getObject(b0Var2, j10));
                    iR2 += iC;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(b0Var2, j10);
                    Class cls2 = e1.f4069a;
                    if (list.size() == 0) {
                        iT8 = 0;
                    } else {
                        iT8 = (p.T(i15) * list.size()) + e1.e(list);
                    }
                    iR2 += iT8;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls3 = e1.f4069a;
                    size = list2.size();
                    if (size == 0) {
                        iT8 = 0;
                    } else {
                        i11 = e1.i(list2);
                        iT9 = p.T(i15);
                        iT8 = (iT9 * size) + i11;
                    }
                    iR2 += iT8;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls4 = e1.f4069a;
                    size = list3.size();
                    if (size == 0) {
                        iT8 = 0;
                    } else {
                        i11 = e1.d(list3);
                        iT9 = p.T(i15);
                        iT8 = (iT9 * size) + i11;
                    }
                    iR2 += iT8;
                    break;
                case 23:
                    iC = e1.c(i15, (List) unsafe.getObject(b0Var2, j10));
                    iR2 += iC;
                    break;
                case 24:
                    iC = e1.b(i15, (List) unsafe.getObject(b0Var2, j10));
                    iR2 += iC;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls5 = e1.f4069a;
                    int size3 = list4.size();
                    iR2 += size3 == 0 ? 0 : (p.T(i15) + 1) * size3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    List list5 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls6 = e1.f4069a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iT8 = 0;
                    } else {
                        iT8 = p.T(i15) * size4;
                        if (list5 instanceof i0) {
                            i0 i0Var = (i0) list5;
                            for (int i23 = 0; i23 < size4; i23++) {
                                Object objI = i0Var.i();
                                if (objI instanceof j) {
                                    int size5 = ((j) objI).size();
                                    iT8 = p.U(size5) + size5 + iT8;
                                } else {
                                    iT8 = p.S((String) objI) + iT8;
                                }
                            }
                        } else {
                            for (int i24 = 0; i24 < size4; i24++) {
                                Object obj = list5.get(i24);
                                if (obj instanceof j) {
                                    int size6 = ((j) obj).size();
                                    iT8 = p.U(size6) + size6 + iT8;
                                } else {
                                    iT8 = p.S((String) obj) + iT8;
                                }
                            }
                        }
                    }
                    iR2 += iT8;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(b0Var2, j10);
                    d1 d1VarM3 = v0Var.m(i13);
                    Class cls7 = e1.f4069a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iT10 = 0;
                    } else {
                        iT10 = p.T(i15) * size7;
                        for (int i25 = 0; i25 < size7; i25++) {
                            int iA4 = ((a) list6.get(i25)).a(d1VarM3);
                            iT10 += p.U(iA4) + iA4;
                        }
                    }
                    iR2 += iT10;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    List list7 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls8 = e1.f4069a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iT8 = 0;
                    } else {
                        iT8 = p.T(i15) * size8;
                        for (int i26 = 0; i26 < list7.size(); i26++) {
                            int size9 = ((j) list7.get(i26)).size();
                            iT8 += p.U(size9) + size9;
                        }
                    }
                    iR2 += iT8;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    List list8 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls9 = e1.f4069a;
                    size = list8.size();
                    if (size == 0) {
                        iT8 = 0;
                    } else {
                        i11 = e1.h(list8);
                        iT9 = p.T(i15);
                        iT8 = (iT9 * size) + i11;
                    }
                    iR2 += iT8;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    List list9 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls10 = e1.f4069a;
                    size = list9.size();
                    if (size == 0) {
                        iT8 = 0;
                    } else {
                        i11 = e1.a(list9);
                        iT9 = p.T(i15);
                        iT8 = (iT9 * size) + i11;
                    }
                    iR2 += iT8;
                    break;
                case 31:
                    iC = e1.b(i15, (List) unsafe.getObject(b0Var2, j10));
                    iR2 += iC;
                    break;
                case 32:
                    iC = e1.c(i15, (List) unsafe.getObject(b0Var2, j10));
                    iR2 += iC;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls11 = e1.f4069a;
                    size = list10.size();
                    if (size == 0) {
                        iT8 = 0;
                    } else {
                        i11 = e1.f(list10);
                        iT9 = p.T(i15);
                        iT8 = (iT9 * size) + i11;
                    }
                    iR2 += iT8;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls12 = e1.f4069a;
                    size = list11.size();
                    if (size == 0) {
                        iT8 = 0;
                    } else {
                        i11 = e1.g(list11);
                        iT9 = p.T(i15);
                        iT8 = (iT9 * size) + i11;
                    }
                    iR2 += iT8;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    List list12 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls13 = e1.f4069a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls14 = e1.f4069a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 37:
                    size2 = e1.e((List) unsafe.getObject(b0Var2, j10));
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    size2 = e1.i((List) unsafe.getObject(b0Var2, j10));
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 39:
                    size2 = e1.d((List) unsafe.getObject(b0Var2, j10));
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls15 = e1.f4069a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls16 = e1.f4069a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls17 = e1.f4069a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    size2 = e1.h((List) unsafe.getObject(b0Var2, j10));
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 44:
                    size2 = e1.a((List) unsafe.getObject(b0Var2, j10));
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls18 = e1.f4069a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    List list18 = (List) unsafe.getObject(b0Var2, j10);
                    Class cls19 = e1.f4069a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    size2 = e1.f((List) unsafe.getObject(b0Var2, j10));
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    size2 = e1.g((List) unsafe.getObject(b0Var2, j10));
                    if (size2 > 0) {
                        iT11 = p.T(i15);
                        iU = p.U(size2);
                        iV3 = iU + iT11;
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    List list19 = (List) unsafe.getObject(b0Var2, j10);
                    d1 d1VarM4 = v0Var.m(i13);
                    Class cls20 = e1.f4069a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iA2 = 0;
                    } else {
                        iA2 = 0;
                        for (int i27 = 0; i27 < size10; i27++) {
                            iA2 += ((a) list19.get(i27)).a(d1VarM4) + (p.T(i15) * 2);
                        }
                    }
                    iR2 += iA2;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(b0Var2, j10);
                    Object obj2 = v0Var.f4178b[(i13 / 3) * 2];
                    v0Var.f4188m.getClass();
                    q0 q0Var = (q0) object3;
                    p0 p0Var = (p0) obj2;
                    if (q0Var.isEmpty()) {
                        iT10 = 0;
                    } else {
                        iT10 = 0;
                        for (Map.Entry entry : q0Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            p0Var.getClass();
                            int iT14 = p.T(i15);
                            int iA5 = p0.a(p0Var.f4151a, key, value);
                            iT10 += p.U(iA5) + iA5 + iT14;
                        }
                    }
                    iR2 += iT10;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iT = p.T(i15);
                        iC = iT + 8;
                        iR2 += iC;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iT12 = p.T(i15);
                        iC = iT12 + 4;
                        iR2 += iC;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        long jZ = z(j10, b0Var2);
                        size2 = p.T(i15);
                        iV3 = p.V(jZ);
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        long jZ2 = z(j10, b0Var2);
                        size2 = p.T(i15);
                        iV3 = p.V(jZ2);
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        int iY = y(j10, b0Var2);
                        iT7 = p.T(i15);
                        iA = p.V(iY);
                        iC = iA + iT7;
                        iR2 += iC;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iT = p.T(i15);
                        iC = iT + 8;
                        iR2 += iC;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iT12 = p.T(i15);
                        iC = iT12 + 4;
                        iR2 += iC;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iC = p.T(i15) + 1;
                        iR2 += iC;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        Object object4 = unsafe.getObject(b0Var2, j10);
                        iR2 = (object4 instanceof j ? p.R(i15, (j) object4) : p.S((String) object4) + p.T(i15)) + iR2;
                    }
                    break;
                case 60:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        Object object5 = unsafe.getObject(b0Var2, j10);
                        d1 d1VarM5 = v0Var.m(i13);
                        Class cls21 = e1.f4069a;
                        int iT15 = p.T(i15);
                        int iA6 = ((a) object5).a(d1VarM5);
                        iU2 = p.U(iA6) + iA6 + iT15;
                        iR2 += iU2;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iC = p.R(i15, (j) unsafe.getObject(b0Var2, j10));
                        iR2 += iC;
                    }
                    break;
                case 62:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        int iY2 = y(j10, b0Var2);
                        iT7 = p.T(i15);
                        iA = p.U(iY2);
                        iC = iA + iT7;
                        iR2 += iC;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        int iY3 = y(j10, b0Var2);
                        iT7 = p.T(i15);
                        iA = p.V(iY3);
                        iC = iA + iT7;
                        iR2 += iC;
                    }
                    break;
                case 64:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iT12 = p.T(i15);
                        iC = iT12 + 4;
                        iR2 += iC;
                    }
                    break;
                case 65:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iT = p.T(i15);
                        iC = iT + 8;
                        iR2 += iC;
                    }
                    break;
                case 66:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        int iY4 = y(j10, b0Var2);
                        iT7 = p.T(i15);
                        iA = p.U((iY4 >> 31) ^ (iY4 << 1));
                        iC = iA + iT7;
                        iR2 += iC;
                    }
                    break;
                case 67:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        long jZ3 = z(j10, b0Var2);
                        size2 = p.T(i15);
                        iV3 = p.V((jZ3 << 1) ^ (jZ3 >> 63));
                        iU2 = iV3 + size2;
                        iR2 += iU2;
                    }
                    break;
                case 68:
                    if (v0Var.q(i15, i13, b0Var2)) {
                        iC = ((a) unsafe.getObject(b0Var2, j10)).a(v0Var.m(i13)) + (p.T(i15) * 2);
                        iR2 += iC;
                    }
                    break;
            }
            i13 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final int h(b0 b0Var) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f4177a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iL = L(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iL;
            int i15 = 1237;
            int iHashCode = 37;
            switch (K(iL)) {
                case 0:
                    i10 = i12 * 53;
                    iB = e0.b(Double.doubleToLongBits(q1.f4157c.d(j10, b0Var)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(q1.f4157c.e(j10, b0Var));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = e0.b(q1.f4157c.g(j10, b0Var));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = e0.b(q1.f4157c.g(j10, b0Var));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = q1.f4157c.f(j10, b0Var);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = e0.b(q1.f4157c.g(j10, b0Var));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = q1.f4157c.f(j10, b0Var);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = q1.f4157c.c(j10, b0Var);
                    Charset charset = e0.f4067a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) q1.f4157c.h(j10, b0Var)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objH = q1.f4157c.h(j10, b0Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = q1.f4157c.h(j10, b0Var).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = q1.f4157c.f(j10, b0Var);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = q1.f4157c.f(j10, b0Var);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = q1.f4157c.f(j10, b0Var);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = e0.b(q1.f4157c.g(j10, b0Var));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = q1.f4157c.f(j10, b0Var);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = e0.b(q1.f4157c.g(j10, b0Var));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objH2 = q1.f4157c.h(j10, b0Var);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
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
                    i10 = i12 * 53;
                    iB = q1.f4157c.h(j10, b0Var).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = q1.f4157c.h(j10, b0Var).hashCode();
                    i12 = iB + i10;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = e0.b(Double.doubleToLongBits(((Double) q1.f4157c.h(j10, b0Var)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) q1.f4157c.h(j10, b0Var)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = e0.b(z(j10, b0Var));
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = e0.b(z(j10, b0Var));
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = y(j10, b0Var);
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = e0.b(z(j10, b0Var));
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = y(j10, b0Var);
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) q1.f4157c.h(j10, b0Var)).booleanValue();
                        Charset charset2 = e0.f4067a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = ((String) q1.f4157c.h(j10, b0Var)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 60:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = q1.f4157c.h(j10, b0Var).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = q1.f4157c.h(j10, b0Var).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 62:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = y(j10, b0Var);
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = y(j10, b0Var);
                        i12 = iB + i10;
                    }
                    break;
                case 64:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = y(j10, b0Var);
                        i12 = iB + i10;
                    }
                    break;
                case 65:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = e0.b(z(j10, b0Var));
                        i12 = iB + i10;
                    }
                    break;
                case 66:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = y(j10, b0Var);
                        i12 = iB + i10;
                    }
                    break;
                case 67:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = e0.b(z(j10, b0Var));
                        i12 = iB + i10;
                    }
                    break;
                case 68:
                    if (q(i14, i13, b0Var)) {
                        i10 = i12 * 53;
                        iB = q1.f4157c.h(j10, b0Var).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        this.l.getClass();
        return b0Var.unknownFields.hashCode() + (i12 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean i(b0 b0Var, b0 b0Var2) {
        int[] iArr = this.f4177a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zL = true;
            if (i10 < length) {
                int iL = L(i10);
                long j10 = iL & 1048575;
                switch (K(iL)) {
                    case 0:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var = q1.f4157c;
                            if (Double.doubleToLongBits(p1Var.d(j10, b0Var)) != Double.doubleToLongBits(p1Var.d(j10, b0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var2 = q1.f4157c;
                            if (Float.floatToIntBits(p1Var2.e(j10, b0Var)) != Float.floatToIntBits(p1Var2.e(j10, b0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var3 = q1.f4157c;
                            if (p1Var3.g(j10, b0Var) != p1Var3.g(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var4 = q1.f4157c;
                            if (p1Var4.g(j10, b0Var) != p1Var4.g(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var5 = q1.f4157c;
                            if (p1Var5.f(j10, b0Var) != p1Var5.f(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var6 = q1.f4157c;
                            if (p1Var6.g(j10, b0Var) != p1Var6.g(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var7 = q1.f4157c;
                            if (p1Var7.f(j10, b0Var) != p1Var7.f(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var8 = q1.f4157c;
                            if (p1Var8.c(j10, b0Var) != p1Var8.c(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var9 = q1.f4157c;
                            if (!e1.l(p1Var9.h(j10, b0Var), p1Var9.h(j10, b0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var10 = q1.f4157c;
                            if (!e1.l(p1Var10.h(j10, b0Var), p1Var10.h(j10, b0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var11 = q1.f4157c;
                            if (!e1.l(p1Var11.h(j10, b0Var), p1Var11.h(j10, b0Var2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var12 = q1.f4157c;
                            if (p1Var12.f(j10, b0Var) != p1Var12.f(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var13 = q1.f4157c;
                            if (p1Var13.f(j10, b0Var) != p1Var13.f(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var14 = q1.f4157c;
                            if (p1Var14.f(j10, b0Var) != p1Var14.f(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var15 = q1.f4157c;
                            if (p1Var15.g(j10, b0Var) != p1Var15.g(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var16 = q1.f4157c;
                            if (p1Var16.f(j10, b0Var) != p1Var16.f(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var17 = q1.f4157c;
                            if (p1Var17.g(j10, b0Var) != p1Var17.g(j10, b0Var2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!j(b0Var, b0Var2, i10)) {
                            zL = false;
                        } else {
                            p1 p1Var18 = q1.f4157c;
                            if (!e1.l(p1Var18.h(j10, b0Var), p1Var18.h(j10, b0Var2))) {
                                zL = false;
                            }
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
                        p1 p1Var19 = q1.f4157c;
                        zL = e1.l(p1Var19.h(j10, b0Var), p1Var19.h(j10, b0Var2));
                        break;
                    case 50:
                        p1 p1Var20 = q1.f4157c;
                        zL = e1.l(p1Var20.h(j10, b0Var), p1Var20.h(j10, b0Var2));
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
                        p1 p1Var21 = q1.f4157c;
                        if (p1Var21.f(j11, b0Var) != p1Var21.f(j11, b0Var2) || !e1.l(p1Var21.h(j10, b0Var), p1Var21.h(j10, b0Var2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i10 += 3;
                }
            } else {
                this.l.getClass();
                if (b0Var.unknownFields.equals(b0Var2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j(b0 b0Var, b0 b0Var2, int i10) {
        return n(i10, b0Var) == n(i10, b0Var2);
    }

    public final void k(int i10, Object obj, Object obj2) {
        int i11 = this.f4177a[i10];
        if (q1.f4157c.h(L(i10) & 1048575, obj) == null) {
            return;
        }
        l(i10);
    }

    public final void l(int i10) {
        if (this.f4178b[defpackage.e.e(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final d1 m(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f4178b;
        d1 d1Var = (d1) objArr[i11];
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1VarA = a1.f4050c.a((Class) objArr[i11 + 1]);
        objArr[i11] = d1VarA;
        return d1VarA;
    }

    public final boolean n(int i10, Object obj) {
        int i11 = this.f4177a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iL = L(i10);
            long j11 = iL & 1048575;
            switch (K(iL)) {
                case 0:
                    if (Double.doubleToRawLongBits(q1.f4157c.d(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(q1.f4157c.e(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (q1.f4157c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (q1.f4157c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (q1.f4157c.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (q1.f4157c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (q1.f4157c.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return q1.f4157c.c(j11, obj);
                case 8:
                    Object objH = q1.f4157c.h(j11, obj);
                    if (objH instanceof String) {
                        return !((String) objH).isEmpty();
                    }
                    if (objH instanceof j) {
                        return !j.f4104b.equals(objH);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (q1.f4157c.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !j.f4104b.equals(q1.f4157c.h(j11, obj));
                case 11:
                    if (q1.f4157c.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (q1.f4157c.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (q1.f4157c.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (q1.f4157c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (q1.f4157c.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (q1.f4157c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (q1.f4157c.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & q1.f4157c.f(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return n(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final boolean q(int i10, int i11, Object obj) {
        return q1.f4157c.f((long) (this.f4177a[i11 + 2] & 1048575), obj) == i10;
    }

    public final void r(Object obj, int i10, Object obj2, s sVar, n nVar) throws com.google.crypto.tink.shaded.protobuf.c0, f0 {
        long jL = L(i10) & 1048575;
        Object objH = q1.f4157c.h(jL, obj);
        r0 r0Var = this.f4188m;
        if (objH == null) {
            r0Var.getClass();
            objH = q0.f4153b.i();
            q1.o(obj, jL, objH);
        } else {
            r0Var.getClass();
            if (!((q0) objH).f4154a) {
                q0 q0VarI = q0.f4153b.i();
                r0.a(q0VarI, objH);
                q1.o(obj, jL, q0VarI);
                objH = q0VarI;
            }
        }
        r0Var.getClass();
        q0 q0Var = (q0) objH;
        o0 o0Var = ((p0) obj2).f4151a;
        nVar.T(2);
        m mVar = (m) nVar.f4137e;
        int iH = mVar.h(mVar.z());
        Object obj3 = o0Var.f4143c;
        Object objT = "";
        Object objT2 = obj3;
        while (true) {
            try {
                int iD = nVar.d();
                if (iD == Integer.MAX_VALUE || mVar.e()) {
                    break;
                }
                if (iD == 1) {
                    objT = nVar.t(o0Var.f4141a, null, null);
                } else if (iD != 2) {
                    try {
                        if (!nVar.U()) {
                            throw new g0("Unable to parse map entry.");
                        }
                    } catch (f0 unused) {
                        if (!nVar.U()) {
                            throw new g0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objT2 = nVar.t(o0Var.f4142b, obj3.getClass(), sVar);
                }
            } catch (Throwable th2) {
                mVar.g(iH);
                throw th2;
            }
        }
        q0Var.put(objT, objT2);
        mVar.g(iH);
    }

    public final void s(int i10, Object obj, Object obj2) {
        if (n(i10, obj2)) {
            long jL = L(i10) & 1048575;
            Unsafe unsafe = f4176o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4177a[i10] + " is present but null: " + obj2);
            }
            d1 d1VarM = m(i10);
            if (!n(i10, obj)) {
                if (p(object)) {
                    b0 b0VarD = d1VarM.d();
                    d1VarM.a(b0VarD, object);
                    unsafe.putObject(obj, jL, b0VarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                G(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                b0 b0VarD2 = d1VarM.d();
                d1VarM.a(b0VarD2, object2);
                unsafe.putObject(obj, jL, b0VarD2);
                object2 = b0VarD2;
            }
            d1VarM.a(object2, object);
        }
    }

    public final void t(int i10, Object obj, Object obj2) {
        int[] iArr = this.f4177a;
        int i11 = iArr[i10];
        if (q(i11, i10, obj2)) {
            long jL = L(i10) & 1048575;
            Unsafe unsafe = f4176o;
            Object object = unsafe.getObject(obj2, jL);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            d1 d1VarM = m(i10);
            if (!q(i11, i10, obj)) {
                if (p(object)) {
                    b0 b0VarD = d1VarM.d();
                    d1VarM.a(b0VarD, object);
                    unsafe.putObject(obj, jL, b0VarD);
                } else {
                    unsafe.putObject(obj, jL, object);
                }
                H(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jL);
            if (!p(object2)) {
                b0 b0VarD2 = d1VarM.d();
                d1VarM.a(b0VarD2, object2);
                unsafe.putObject(obj, jL, b0VarD2);
                object2 = b0VarD2;
            }
            d1VarM.a(object2, object);
        }
    }

    public final Object u(int i10, Object obj) {
        d1 d1VarM = m(i10);
        long jL = L(i10) & 1048575;
        if (!n(i10, obj)) {
            return d1VarM.d();
        }
        Object object = f4176o.getObject(obj, jL);
        if (p(object)) {
            return object;
        }
        b0 b0VarD = d1VarM.d();
        if (object != null) {
            d1VarM.a(b0VarD, object);
        }
        return b0VarD;
    }

    public final Object v(int i10, int i11, Object obj) {
        d1 d1VarM = m(i11);
        if (!q(i10, i11, obj)) {
            return d1VarM.d();
        }
        Object object = f4176o.getObject(obj, L(i11) & 1048575);
        if (p(object)) {
            return object;
        }
        b0 b0VarD = d1VarM.d();
        if (object != null) {
            d1VarM.a(b0VarD, object);
        }
        return b0VarD;
    }
}
