package com.google.crypto.tink.shaded.protobuf;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.ca;
import com.google.android.gms.internal.ads.ur1;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements z0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f24617n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f24618o = i1.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f24619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f24620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f24623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f24625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t0 f24628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g0 f24629k;
    public final d1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m0 f24630m;

    public r0(int[] iArr, Object[] objArr, int i10, int i11, a aVar, int[] iArr2, int i12, int i13, t0 t0Var, g0 g0Var, d1 d1Var, q qVar, m0 m0Var) {
        this.f24619a = iArr;
        this.f24620b = objArr;
        this.f24621c = i10;
        this.f24622d = i11;
        this.f24624f = aVar instanceof x;
        this.f24625g = iArr2;
        this.f24626h = i12;
        this.f24627i = i13;
        this.f24628j = t0Var;
        this.f24629k = g0Var;
        this.l = d1Var;
        this.f24623e = aVar;
        this.f24630m = m0Var;
    }

    public static long A(int i10) {
        return i10 & 1048575;
    }

    public static int B(long j10, Object obj) {
        return ((Integer) i1.f24575c.i(j10, obj)).intValue();
    }

    public static long C(long j10, Object obj) {
        return ((Long) i1.f24575c.i(j10, obj)).longValue();
    }

    public static Field L(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
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
            throw new RuntimeException(sbK.toString(), e10);
        }
    }

    public static int R(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (s(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof x) {
            return ((x) obj).o();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x035a  */
    /* JADX WARN: Code duplicated, block: B:182:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:185:0x03bb  */
    public static r0 z(y0 y0Var, t0 t0Var, g0 g0Var, d1 d1Var, q qVar, m0 m0Var) {
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
        Field fieldL;
        int i31;
        char cCharAt9;
        int i32;
        Field fieldL2;
        Field fieldL3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        int i36;
        char cCharAt12;
        int i37;
        char cCharAt13;
        String str = y0Var.f24655b;
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
            iArr = f24617n;
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
        Unsafe unsafe = f24618o;
        Object[] objArr2 = y0Var.f24656c;
        Class<?> cls = y0Var.f24654a.getClass();
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
                } else if (i88 == 12 && (v0.i.b(y0Var.a(), 1) || (iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0)) {
                    objArr3[defpackage.e.e(i71, 3, 2, 1)] = objArr[i15];
                    i15++;
                }
                int i90 = i89 * 2;
                Object obj = objArr[i90];
                if (obj instanceof Field) {
                    fieldL2 = (Field) obj;
                } else {
                    fieldL2 = L(cls, (String) obj);
                    objArr[i90] = fieldL2;
                }
                int i91 = i68;
                i28 = i15;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldL2);
                int i92 = i90 + 1;
                Object obj2 = objArr[i92];
                if (obj2 instanceof Field) {
                    fieldL3 = (Field) obj2;
                } else {
                    fieldL3 = L(cls, (String) obj2);
                    objArr[i92] = fieldL3;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldL3);
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
                Field fieldL4 = L(cls, (String) objArr[i15]);
                if (i83 == 9 || i83 == 17) {
                    i27 = i27;
                    objArr3[defpackage.e.e(i71, 3, 2, 1)] = fieldL4.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i27 = i27;
                        i32 = i15 + 2;
                        objArr3[defpackage.e.e(i71, 3, 2, 1)] = objArr[i93];
                    } else if (i83 == 12 || i83 == 30 || i83 == 44) {
                        i27 = i27;
                        if (y0Var.a() == 1 || (iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                            i32 = i15 + 2;
                            objArr3[defpackage.e.e(i71, 3, 2, 1)] = objArr[i93];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
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
                                fieldL = (Field) obj3;
                            } else {
                                fieldL = L(cls, (String) obj3);
                                objArr[i96] = fieldL;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldL);
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
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
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
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
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
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldL4);
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
        return new r0(iArr3, objArr3, i11, i14, y0Var.f24654a, iArr, i16, i68, t0Var, g0Var, d1Var, qVar, m0Var);
    }

    public final void D(int i10, long j10, Object obj) {
        Unsafe unsafe = f24618o;
        Object objO = o(i10);
        Object object = unsafe.getObject(obj, j10);
        this.f24630m.getClass();
        if (!((l0) object).f24606a) {
            l0 l0VarI = l0.f24605b.i();
            m0.a(l0VarI, object);
            unsafe.putObject(obj, j10, l0VarI);
        }
        defpackage.e.z(objO);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12741. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int E(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.ads.ur1 r35) {
        /*
            Method dump skipped, instruction units count: 1274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.r0.E(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ur1):int");
    }

    public final int F(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, ur1 ur1Var) throws d0 {
        int i18;
        Unsafe unsafe = f24618o;
        long j11 = this.f24619a[i17 + 2] & 1048575;
        switch (i16) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(go.c.i(i10, bArr))));
                int i19 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(go.c.h(i10, bArr))));
                int i20 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iO = go.c.o(bArr, i10, ur1Var);
                unsafe.putObject(obj, j10, Long.valueOf(ur1Var.f20875b));
                unsafe.putInt(obj, j11, i13);
                return iO;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iM = go.c.m(bArr, i10, ur1Var);
                unsafe.putObject(obj, j10, Integer.valueOf(ur1Var.f20874a));
                unsafe.putInt(obj, j11, i13);
                return iM;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(go.c.i(i10, bArr)));
                int i21 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(go.c.h(i10, bArr)));
                int i22 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i22;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iO2 = go.c.o(bArr, i10, ur1Var);
                unsafe.putObject(obj, j10, Boolean.valueOf(ur1Var.f20875b != 0));
                unsafe.putInt(obj, j11, i13);
                return iO2;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                if (i14 != 2) {
                    return i10;
                }
                int iM2 = go.c.m(bArr, i10, ur1Var);
                int i23 = ur1Var.f20874a;
                if (i23 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (l1.f24607a.W(bArr, iM2, iM2 + i23) != 0) {
                            throw d0.g();
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iM2, i23, b0.f24539a));
                    iM2 += i23;
                }
                unsafe.putInt(obj, j11, i13);
                return iM2;
            case 60:
                i18 = i10;
                if (i14 == 2) {
                    Object objY = y(i13, i17, obj);
                    int iZ = go.c.z(objY, p(i17), bArr, i18, i11, ur1Var);
                    Q(i13, i17, obj, objY);
                    return iZ;
                }
                return i18;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                i18 = i10;
                if (i14 == 2) {
                    int iG = go.c.g(bArr, i18, ur1Var);
                    unsafe.putObject(obj, j10, ur1Var.f20876c);
                    unsafe.putInt(obj, j11, i13);
                    return iG;
                }
                return i18;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                i18 = i10;
                if (i14 == 0) {
                    int iM3 = go.c.m(bArr, i18, ur1Var);
                    int i24 = ur1Var.f20874a;
                    n(i17);
                    unsafe.putObject(obj, j10, Integer.valueOf(i24));
                    unsafe.putInt(obj, j11, i13);
                    return iM3;
                }
                return i18;
            case 66:
                i18 = i10;
                if (i14 == 0) {
                    int iM4 = go.c.m(bArr, i18, ur1Var);
                    unsafe.putObject(obj, j10, Integer.valueOf(androidx.datastore.preferences.protobuf.m.b(ur1Var.f20874a)));
                    unsafe.putInt(obj, j11, i13);
                    return iM4;
                }
                return i18;
            case 67:
                i18 = i10;
                if (i14 == 0) {
                    int iO3 = go.c.o(bArr, i18, ur1Var);
                    unsafe.putObject(obj, j10, Long.valueOf(androidx.datastore.preferences.protobuf.m.c(ur1Var.f20875b)));
                    unsafe.putInt(obj, j11, i13);
                    return iO3;
                }
                return i18;
            case 68:
                if (i14 == 3) {
                    Object objY2 = y(i13, i17, obj);
                    int iY = go.c.y(objY2, p(i17), bArr, i10, i11, (i12 & (-8)) | 4, ur1Var);
                    Q(i13, i17, obj, objY2);
                    return iY;
                }
            default:
                return i10;
        }
    }

    public final int G(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, long j10, int i15, long j11, ur1 ur1Var) throws d0 {
        int i16;
        int iN;
        Unsafe unsafe = f24618o;
        a0 a0VarMutableCopyWithCapacity = (a0) unsafe.getObject(obj, j11);
        if (!((b) a0VarMutableCopyWithCapacity).f24538a) {
            a0VarMutableCopyWithCapacity = a0VarMutableCopyWithCapacity.mutableCopyWithCapacity(a0VarMutableCopyWithCapacity.size() * 2);
            unsafe.putObject(obj, j11, a0VarMutableCopyWithCapacity);
        }
        a0 a0Var = a0VarMutableCopyWithCapacity;
        switch (i15) {
            case 18:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                if (i13 != 2) {
                    if (i13 != 1) {
                        return i10;
                    }
                    n nVar = (n) a0Var;
                    nVar.addDouble(Double.longBitsToDouble(go.c.i(i10, bArr)));
                    int i17 = i10 + 8;
                    while (i17 < i11) {
                        int iM = go.c.m(bArr, i17, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return i17;
                        }
                        nVar.addDouble(Double.longBitsToDouble(go.c.i(iM, bArr)));
                        i17 = iM + 8;
                    }
                    return i17;
                }
                n nVar2 = (n) a0Var;
                int iM2 = go.c.m(bArr, i10, ur1Var);
                int i18 = ur1Var.f20874a;
                int i19 = iM2 + i18;
                if (i19 > bArr.length) {
                    throw d0.l();
                }
                nVar2.getClass();
                int i20 = (i18 / 8) + 0;
                double[] dArr = nVar2.f24608b;
                if (i20 > dArr.length) {
                    if (dArr.length == 0) {
                        nVar2.f24608b = new double[Math.max(i20, 10)];
                    } else {
                        int length = dArr.length;
                        while (length < i20) {
                            length = ca.v(length, 3, 2, 1, 10);
                        }
                        nVar2.f24608b = Arrays.copyOf(nVar2.f24608b, length);
                    }
                }
                while (iM2 < i19) {
                    nVar2.addDouble(Double.longBitsToDouble(go.c.i(iM2, bArr)));
                    iM2 += 8;
                }
                if (iM2 == i19) {
                    return iM2;
                }
                throw d0.l();
            case 19:
            case 36:
                if (i13 != 2) {
                    if (i13 != 5) {
                        return i10;
                    }
                    t tVar = (t) a0Var;
                    tVar.addFloat(Float.intBitsToFloat(go.c.h(i10, bArr)));
                    int i21 = i10 + 4;
                    while (i21 < i11) {
                        int iM3 = go.c.m(bArr, i21, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return i21;
                        }
                        tVar.addFloat(Float.intBitsToFloat(go.c.h(iM3, bArr)));
                        i21 = iM3 + 4;
                    }
                    return i21;
                }
                t tVar2 = (t) a0Var;
                int iM4 = go.c.m(bArr, i10, ur1Var);
                int i22 = ur1Var.f20874a;
                int i23 = iM4 + i22;
                if (i23 > bArr.length) {
                    throw d0.l();
                }
                tVar2.getClass();
                int i24 = (i22 / 4) + 0;
                float[] fArr = tVar2.f24639b;
                if (i24 > fArr.length) {
                    if (fArr.length == 0) {
                        tVar2.f24639b = new float[Math.max(i24, 10)];
                    } else {
                        int length2 = fArr.length;
                        while (length2 < i24) {
                            length2 = ca.v(length2, 3, 2, 1, 10);
                        }
                        tVar2.f24639b = Arrays.copyOf(tVar2.f24639b, length2);
                    }
                }
                while (iM4 < i23) {
                    tVar2.addFloat(Float.intBitsToFloat(go.c.h(iM4, bArr)));
                    iM4 += 4;
                }
                if (iM4 == i23) {
                    return iM4;
                }
                throw d0.l();
            case 20:
            case 21:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                if (i13 == 2) {
                    i0 i0Var = (i0) a0Var;
                    int iM5 = go.c.m(bArr, i10, ur1Var);
                    int i25 = ur1Var.f20874a + iM5;
                    while (iM5 < i25) {
                        iM5 = go.c.o(bArr, iM5, ur1Var);
                        i0Var.addLong(ur1Var.f20875b);
                    }
                    if (iM5 == i25) {
                        return iM5;
                    }
                    throw d0.l();
                }
                if (i13 != 0) {
                    return i10;
                }
                i0 i0Var2 = (i0) a0Var;
                int iO = go.c.o(bArr, i10, ur1Var);
                i0Var2.addLong(ur1Var.f20875b);
                while (iO < i11) {
                    int iM6 = go.c.m(bArr, iO, ur1Var);
                    if (i12 != ur1Var.f20874a) {
                        return iO;
                    }
                    iO = go.c.o(bArr, iM6, ur1Var);
                    i0Var2.addLong(ur1Var.f20875b);
                }
                return iO;
            case 22:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case 39:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                if (i13 != 2) {
                    return i13 == 0 ? go.c.n(i12, bArr, i10, i11, a0Var, ur1Var) : i10;
                }
                y yVar = (y) a0Var;
                int iM7 = go.c.m(bArr, i10, ur1Var);
                int i26 = ur1Var.f20874a + iM7;
                while (iM7 < i26) {
                    iM7 = go.c.m(bArr, iM7, ur1Var);
                    yVar.addInt(ur1Var.f20874a);
                }
                if (iM7 == i26) {
                    return iM7;
                }
                throw d0.l();
            case 23:
            case 32:
            case 40:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                if (i13 != 2) {
                    if (i13 != 1) {
                        return i10;
                    }
                    i0 i0Var3 = (i0) a0Var;
                    i0Var3.addLong(go.c.i(i10, bArr));
                    int i27 = i10 + 8;
                    while (i27 < i11) {
                        int iM8 = go.c.m(bArr, i27, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return i27;
                        }
                        i0Var3.addLong(go.c.i(iM8, bArr));
                        i27 = iM8 + 8;
                    }
                    return i27;
                }
                i0 i0Var4 = (i0) a0Var;
                int iM9 = go.c.m(bArr, i10, ur1Var);
                int i28 = ur1Var.f20874a;
                int i29 = iM9 + i28;
                if (i29 > bArr.length) {
                    throw d0.l();
                }
                i0Var4.getClass();
                int i30 = (i28 / 8) + 0;
                long[] jArr = i0Var4.f24572b;
                if (i30 > jArr.length) {
                    if (jArr.length == 0) {
                        i0Var4.f24572b = new long[Math.max(i30, 10)];
                    } else {
                        int length3 = jArr.length;
                        while (length3 < i30) {
                            length3 = ca.v(length3, 3, 2, 1, 10);
                        }
                        i0Var4.f24572b = Arrays.copyOf(i0Var4.f24572b, length3);
                    }
                }
                while (iM9 < i29) {
                    i0Var4.addLong(go.c.i(iM9, bArr));
                    iM9 += 8;
                }
                if (iM9 == i29) {
                    return iM9;
                }
                throw d0.l();
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 != 2) {
                    if (i13 != 5) {
                        return i10;
                    }
                    y yVar2 = (y) a0Var;
                    yVar2.addInt(go.c.h(i10, bArr));
                    int i31 = i10 + 4;
                    while (i31 < i11) {
                        int iM10 = go.c.m(bArr, i31, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return i31;
                        }
                        yVar2.addInt(go.c.h(iM10, bArr));
                        i31 = iM10 + 4;
                    }
                    return i31;
                }
                y yVar3 = (y) a0Var;
                int iM11 = go.c.m(bArr, i10, ur1Var);
                int i32 = ur1Var.f20874a;
                int i33 = iM11 + i32;
                if (i33 > bArr.length) {
                    throw d0.l();
                }
                yVar3.getClass();
                int i34 = (i32 / 4) + 0;
                int[] iArr = yVar3.f24653b;
                if (i34 > iArr.length) {
                    if (iArr.length == 0) {
                        yVar3.f24653b = new int[Math.max(i34, 10)];
                    } else {
                        int length4 = iArr.length;
                        while (length4 < i34) {
                            length4 = ca.v(length4, 3, 2, 1, 10);
                        }
                        yVar3.f24653b = Arrays.copyOf(yVar3.f24653b, length4);
                    }
                }
                while (iM11 < i33) {
                    yVar3.addInt(go.c.h(iM11, bArr));
                    iM11 += 4;
                }
                if (iM11 == i33) {
                    return iM11;
                }
                throw d0.l();
            case 25:
            case 42:
                if (i13 == 2) {
                    d dVar = (d) a0Var;
                    int iM12 = go.c.m(bArr, i10, ur1Var);
                    int i35 = ur1Var.f20874a + iM12;
                    while (iM12 < i35) {
                        iM12 = go.c.o(bArr, iM12, ur1Var);
                        dVar.addBoolean(ur1Var.f20875b != 0);
                    }
                    if (iM12 == i35) {
                        return iM12;
                    }
                    throw d0.l();
                }
                if (i13 != 0) {
                    return i10;
                }
                d dVar2 = (d) a0Var;
                int iO2 = go.c.o(bArr, i10, ur1Var);
                dVar2.addBoolean(ur1Var.f20875b != 0);
                while (iO2 < i11) {
                    int iM13 = go.c.m(bArr, iO2, ur1Var);
                    if (i12 != ur1Var.f20874a) {
                        return iO2;
                    }
                    iO2 = go.c.o(bArr, iM13, ur1Var);
                    dVar2.addBoolean(ur1Var.f20875b != 0);
                }
                return iO2;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                if (i13 != 2) {
                    return i10;
                }
                if ((j10 & 536870912) == 0) {
                    int iM14 = go.c.m(bArr, i10, ur1Var);
                    int i36 = ur1Var.f20874a;
                    if (i36 < 0) {
                        throw d0.j();
                    }
                    if (i36 == 0) {
                        a0Var.add("");
                    } else {
                        a0Var.add(new String(bArr, iM14, i36, b0.f24539a));
                        iM14 += i36;
                    }
                    while (iM14 < i11) {
                        int iM15 = go.c.m(bArr, iM14, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return iM14;
                        }
                        iM14 = go.c.m(bArr, iM15, ur1Var);
                        int i37 = ur1Var.f20874a;
                        if (i37 < 0) {
                            throw d0.j();
                        }
                        if (i37 == 0) {
                            a0Var.add("");
                        } else {
                            a0Var.add(new String(bArr, iM14, i37, b0.f24539a));
                            iM14 += i37;
                        }
                    }
                    return iM14;
                }
                int iM16 = go.c.m(bArr, i10, ur1Var);
                int i38 = ur1Var.f20874a;
                if (i38 < 0) {
                    throw d0.j();
                }
                if (i38 == 0) {
                    a0Var.add("");
                } else {
                    int i39 = iM16 + i38;
                    if (l1.f24607a.W(bArr, iM16, i39) != 0) {
                        throw d0.g();
                    }
                    a0Var.add(new String(bArr, iM16, i38, b0.f24539a));
                    iM16 = i39;
                }
                while (iM16 < i11) {
                    int iM17 = go.c.m(bArr, iM16, ur1Var);
                    if (i12 != ur1Var.f20874a) {
                        return iM16;
                    }
                    iM16 = go.c.m(bArr, iM17, ur1Var);
                    int i40 = ur1Var.f20874a;
                    if (i40 < 0) {
                        throw d0.j();
                    }
                    if (i40 == 0) {
                        a0Var.add("");
                    } else {
                        int i41 = iM16 + i40;
                        if (l1.f24607a.W(bArr, iM16, i41) != 0) {
                            throw d0.g();
                        }
                        a0Var.add(new String(bArr, iM16, i40, b0.f24539a));
                        iM16 = i41;
                    }
                }
                return iM16;
            case 27:
                i16 = i10;
                if (i13 == 2) {
                    return go.c.j(p(i14), i12, bArr, i16, i11, a0Var, ur1Var);
                }
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                i16 = i10;
                if (i13 == 2) {
                    int iM18 = go.c.m(bArr, i16, ur1Var);
                    int i42 = ur1Var.f20874a;
                    if (i42 < 0) {
                        throw d0.j();
                    }
                    if (i42 > bArr.length - iM18) {
                        throw d0.l();
                    }
                    if (i42 == 0) {
                        a0Var.add(i.f24569b);
                    } else {
                        a0Var.add(i.m(bArr, iM18, i42));
                        iM18 += i42;
                    }
                    while (iM18 < i11) {
                        int iM19 = go.c.m(bArr, iM18, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return iM18;
                        }
                        iM18 = go.c.m(bArr, iM19, ur1Var);
                        int i43 = ur1Var.f20874a;
                        if (i43 < 0) {
                            throw d0.j();
                        }
                        if (i43 > bArr.length - iM18) {
                            throw d0.l();
                        }
                        if (i43 == 0) {
                            a0Var.add(i.f24569b);
                        } else {
                            a0Var.add(i.m(bArr, iM18, i43));
                            iM18 += i43;
                        }
                    }
                    return iM18;
                }
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 44:
                i16 = i10;
                if (i13 == 2) {
                    y yVar4 = (y) a0Var;
                    iN = go.c.m(bArr, i16, ur1Var);
                    int i44 = ur1Var.f20874a + iN;
                    while (iN < i44) {
                        iN = go.c.m(bArr, iN, ur1Var);
                        yVar4.addInt(ur1Var.f20874a);
                    }
                    if (iN != i44) {
                        throw d0.l();
                    }
                } else if (i13 == 0) {
                    iN = go.c.n(i12, bArr, i16, i11, a0Var, ur1Var);
                }
                n(i14);
                Class cls = a1.f24535a;
                return iN;
            case 33:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                i16 = i10;
                if (i13 == 2) {
                    y yVar5 = (y) a0Var;
                    int iM20 = go.c.m(bArr, i16, ur1Var);
                    int i45 = ur1Var.f20874a + iM20;
                    while (iM20 < i45) {
                        iM20 = go.c.m(bArr, iM20, ur1Var);
                        yVar5.addInt(androidx.datastore.preferences.protobuf.m.b(ur1Var.f20874a));
                    }
                    if (iM20 == i45) {
                        return iM20;
                    }
                    throw d0.l();
                }
                if (i13 == 0) {
                    y yVar6 = (y) a0Var;
                    int iM21 = go.c.m(bArr, i16, ur1Var);
                    yVar6.addInt(androidx.datastore.preferences.protobuf.m.b(ur1Var.f20874a));
                    while (iM21 < i11) {
                        int iM22 = go.c.m(bArr, iM21, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return iM21;
                        }
                        iM21 = go.c.m(bArr, iM22, ur1Var);
                        yVar6.addInt(androidx.datastore.preferences.protobuf.m.b(ur1Var.f20874a));
                    }
                    return iM21;
                }
                break;
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                i16 = i10;
                if (i13 == 2) {
                    i0 i0Var5 = (i0) a0Var;
                    int iM23 = go.c.m(bArr, i16, ur1Var);
                    int i46 = ur1Var.f20874a + iM23;
                    while (iM23 < i46) {
                        iM23 = go.c.o(bArr, iM23, ur1Var);
                        i0Var5.addLong(androidx.datastore.preferences.protobuf.m.c(ur1Var.f20875b));
                    }
                    if (iM23 == i46) {
                        return iM23;
                    }
                    throw d0.l();
                }
                if (i13 == 0) {
                    i0 i0Var6 = (i0) a0Var;
                    int iO3 = go.c.o(bArr, i16, ur1Var);
                    i0Var6.addLong(androidx.datastore.preferences.protobuf.m.c(ur1Var.f20875b));
                    while (iO3 < i11) {
                        int iM24 = go.c.m(bArr, iO3, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return iO3;
                        }
                        iO3 = go.c.o(bArr, iM24, ur1Var);
                        i0Var6.addLong(androidx.datastore.preferences.protobuf.m.c(ur1Var.f20875b));
                    }
                    return iO3;
                }
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                if (i13 == 3) {
                    z0 z0VarP = p(i14);
                    int i47 = (i12 & (-8)) | 4;
                    Object objD = z0VarP.d();
                    int iY = go.c.y(objD, z0VarP, bArr, i10, i11, i47, ur1Var);
                    z0VarP.b(objD);
                    ur1Var.f20876c = objD;
                    a0Var.add(objD);
                    while (iY < i11) {
                        int iM25 = go.c.m(bArr, iY, ur1Var);
                        if (i12 != ur1Var.f20874a) {
                            return iY;
                        }
                        Object objD2 = z0VarP.d();
                        iY = go.c.y(objD2, z0VarP, bArr, iM25, i11, i47, ur1Var);
                        z0VarP.b(objD2);
                        ur1Var.f20876c = objD2;
                        a0Var.add(objD2);
                    }
                    return iY;
                }
            default:
                return i10;
        }
        return i16;
    }

    public final void H(Object obj, long j10, androidx.datastore.preferences.protobuf.n nVar, z0 z0Var, p pVar) throws c0 {
        int iY;
        this.f24629k.getClass();
        a0 a0VarA = g0.a(j10, obj);
        androidx.datastore.preferences.protobuf.m mVar = (androidx.datastore.preferences.protobuf.m) nVar.f4137e;
        int i10 = nVar.f4134b;
        if ((i10 & 7) != 3) {
            throw d0.h();
        }
        do {
            Object objD = z0Var.d();
            nVar.g(objD, z0Var, pVar);
            z0Var.b(objD);
            a0VarA.add(objD);
            if (mVar.e() || nVar.f4136d != 0) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == i10);
        nVar.f4136d = iY;
    }

    public final void I(Object obj, int i10, androidx.datastore.preferences.protobuf.n nVar, z0 z0Var, p pVar) throws d0 {
        int iY;
        this.f24629k.getClass();
        a0 a0VarA = g0.a(i10 & 1048575, obj);
        androidx.datastore.preferences.protobuf.m mVar = (androidx.datastore.preferences.protobuf.m) nVar.f4137e;
        int i11 = nVar.f4134b;
        if ((i11 & 7) != 2) {
            throw d0.h();
        }
        do {
            Object objD = z0Var.d();
            nVar.i(objD, z0Var, pVar);
            z0Var.b(objD);
            a0VarA.add(objD);
            if (mVar.e() || nVar.f4136d != 0) {
                return;
            } else {
                iY = mVar.y();
            }
        } while (iY == i11);
        nVar.f4136d = iY;
    }

    public final void J(int i10, androidx.datastore.preferences.protobuf.n nVar, Object obj) throws c0, androidx.datastore.preferences.protobuf.f0 {
        androidx.datastore.preferences.protobuf.m mVar = (androidx.datastore.preferences.protobuf.m) nVar.f4137e;
        if ((536870912 & i10) != 0) {
            nVar.T(2);
            i1.p(obj, i10 & 1048575, mVar.x());
        } else if (!this.f24624f) {
            i1.p(obj, i10 & 1048575, nVar.m());
        } else {
            nVar.T(2);
            i1.p(obj, i10 & 1048575, mVar.w());
        }
    }

    public final void K(int i10, androidx.datastore.preferences.protobuf.n nVar, Object obj) throws c0, androidx.datastore.preferences.protobuf.f0 {
        int i11 = 536870912 & i10;
        g0 g0Var = this.f24629k;
        if (i11 != 0) {
            g0Var.getClass();
            nVar.N(g0.a(i10 & 1048575, obj), true);
        } else {
            g0Var.getClass();
            nVar.N(g0.a(i10 & 1048575, obj), false);
        }
    }

    public final void M(int i10, Object obj) {
        int i11 = this.f24619a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        i1.n((1 << (i11 >>> 20)) | i1.f24575c.g(j10, obj), j10, obj);
    }

    public final void N(int i10, int i11, Object obj) {
        i1.n(i10, this.f24619a[i11 + 2] & 1048575, obj);
    }

    public final int O(int i10, int i11) {
        int[] iArr = this.f24619a;
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

    public final void P(int i10, Object obj, Object obj2) {
        f24618o.putObject(obj, S(i10) & 1048575, obj2);
        M(i10, obj);
    }

    public final void Q(int i10, int i11, Object obj, Object obj2) {
        f24618o.putObject(obj, S(i11) & 1048575, obj2);
        N(i10, i11, obj);
    }

    public final int S(int i10) {
        return this.f24619a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public final void T(Object obj, k0 k0Var) throws m {
        char c4;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        r0 r0Var = this;
        int[] iArr = r0Var.f24619a;
        int length = iArr.length;
        Unsafe unsafe = f24618o;
        int i18 = 1048575;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        while (i20 < length) {
            int iS = r0Var.S(i20);
            int i22 = iArr[i20];
            int iR = R(iS);
            if (iR <= 17) {
                int i23 = iArr[i20 + 2];
                c4 = 1;
                int i24 = i23 & i18;
                if (i24 != i19) {
                    i21 = i24 == i18 ? 0 : unsafe.getInt(obj, i24);
                    i19 = i24;
                } else {
                    i18 = i18;
                }
                int i25 = i21;
                i10 = i19;
                i11 = i25;
                i12 = 1 << (i23 >>> 20);
            } else {
                i18 = i18;
                c4 = 1;
                int i26 = i21;
                i10 = i19;
                i11 = i26;
                i12 = 0;
            }
            long j10 = iS & i18;
            int[] iArr2 = iArr;
            int i27 = 2;
            switch (iR) {
                case 0:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        double dE = i1.f24575c.e(j10, obj);
                        l lVar = (l) k0Var.f24598a;
                        lVar.getClass();
                        lVar.l0(i22, Double.doubleToRawLongBits(dE));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 1:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        float f10 = i1.f24575c.f(j10, obj);
                        l lVar2 = (l) k0Var.f24598a;
                        lVar2.getClass();
                        lVar2.j0(i22, Float.floatToRawIntBits(f10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 2:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).s0(i22, unsafe.getLong(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 3:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).s0(i22, unsafe.getLong(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 4:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).n0(i22, unsafe.getInt(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 5:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).l0(i22, unsafe.getLong(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 6:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).j0(i22, unsafe.getInt(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 7:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        boolean zC = i1.f24575c.c(j10, obj);
                        l lVar3 = (l) k0Var.f24598a;
                        lVar3.p0(i22, 0);
                        lVar3.h0(zC ? (byte) 1 : (byte) 0);
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 8:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            String str = (String) object;
                            l lVar4 = (l) k0Var.f24598a;
                            lVar4.p0(i22, 2);
                            int i28 = lVar4.f24603c;
                            byte[] bArr = lVar4.f24602b;
                            int i29 = lVar4.f24604d;
                            try {
                                int iF0 = l.f0(str.length() * 3);
                                int iF1 = l.f0(str.length());
                                if (iF1 == iF0) {
                                    int i30 = i29 + iF1;
                                    lVar4.f24604d = i30;
                                    int iC = l1.f24607a.C(bArr, i30, i28 - i30, str);
                                    lVar4.f24604d = i29;
                                    lVar4.r0((iC - i29) - iF1);
                                    lVar4.f24604d = iC;
                                } else {
                                    lVar4.r0(l1.b(str));
                                    int i31 = lVar4.f24604d;
                                    lVar4.f24604d = l1.f24607a.C(bArr, i31, i28 - i31, str);
                                }
                            } catch (k1 e10) {
                                lVar4.f24604d = i29;
                                l.f24599e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                                byte[] bytes = str.getBytes(b0.f24539a);
                                try {
                                    lVar4.r0(bytes.length);
                                    lVar4.i0(bytes, 0, bytes.length);
                                } catch (IndexOutOfBoundsException e11) {
                                    throw new m(e11);
                                }
                                break;
                            } catch (IndexOutOfBoundsException e12) {
                                throw new m(e12);
                            }
                        } else {
                            i iVar = (i) object;
                            l lVar5 = (l) k0Var.f24598a;
                            lVar5.p0(i22, 2);
                            lVar5.r0(iVar.size());
                            h hVar = (h) iVar;
                            lVar5.i0(hVar.f24565d, hVar.r(), hVar.size());
                        }
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 9:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        k0Var.b(i22, unsafe.getObject(obj, j10), r0Var.p(i20));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 10:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        i iVar2 = (i) unsafe.getObject(obj, j10);
                        l lVar6 = (l) k0Var.f24598a;
                        lVar6.p0(i22, 2);
                        lVar6.r0(iVar2.size());
                        h hVar2 = (h) iVar2;
                        lVar6.i0(hVar2.f24565d, hVar2.r(), hVar2.size());
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 11:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).q0(i22, unsafe.getInt(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 12:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).n0(i22, unsafe.getInt(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 13:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).j0(i22, unsafe.getInt(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 14:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        ((l) k0Var.f24598a).l0(i22, unsafe.getLong(obj, j10));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 15:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        int i32 = unsafe.getInt(obj, j10);
                        ((l) k0Var.f24598a).q0(i22, (i32 >> 31) ^ (i32 << 1));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 16:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((l) k0Var.f24598a).s0(i22, (j11 >> 63) ^ (j11 << 1));
                    }
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 17:
                    if (r0Var.r(obj, i20, i10, i11, i12)) {
                        k0Var.a(i22, unsafe.getObject(obj, j10), r0Var.p(i20));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 18:
                    z10 = false;
                    a1.n(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 19:
                    z10 = false;
                    a1.r(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 20:
                    z10 = false;
                    a1.t(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 21:
                    z10 = false;
                    a1.z(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 22:
                    z10 = false;
                    a1.s(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 23:
                    z10 = false;
                    a1.q(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 24:
                    z10 = false;
                    a1.p(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 25:
                    z10 = false;
                    a1.m(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    r0Var = this;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    int i33 = i10;
                    int i34 = iArr2[i20];
                    List list = (List) unsafe.getObject(obj, j10);
                    Class cls = a1.f24535a;
                    if (list == null || list.isEmpty()) {
                        i13 = i20;
                        i14 = i11;
                    } else {
                        l lVar7 = (l) k0Var.f24598a;
                        if (list instanceof f0) {
                            f0 f0Var = (f0) list;
                            int i35 = 0;
                            while (i35 < list.size()) {
                                Object objI = f0Var.i();
                                if (objI instanceof String) {
                                    String str2 = (String) objI;
                                    lVar7.p0(i34, i27);
                                    int i36 = lVar7.f24603c;
                                    byte[] bArr2 = lVar7.f24602b;
                                    int i37 = lVar7.f24604d;
                                    try {
                                        try {
                                            int iF2 = l.f0(str2.length() * 3);
                                            i15 = i20;
                                            try {
                                                int iF3 = l.f0(str2.length());
                                                if (iF3 == iF2) {
                                                    int i38 = i37 + iF3;
                                                    lVar7.f24604d = i38;
                                                    i16 = i11;
                                                    try {
                                                        int iC2 = l1.f24607a.C(bArr2, i38, i36 - i38, str2);
                                                        lVar7.f24604d = i37;
                                                        lVar7.r0((iC2 - i37) - iF3);
                                                        lVar7.f24604d = iC2;
                                                    } catch (k1 e13) {
                                                        e = e13;
                                                        lVar7.f24604d = i37;
                                                        l.f24599e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                                        byte[] bytes2 = str2.getBytes(b0.f24539a);
                                                        try {
                                                            lVar7.r0(bytes2.length);
                                                            lVar7.i0(bytes2, 0, bytes2.length);
                                                        } catch (IndexOutOfBoundsException e14) {
                                                            throw new m(e14);
                                                        }
                                                    }
                                                } else {
                                                    i16 = i11;
                                                    lVar7.r0(l1.b(str2));
                                                    int i39 = lVar7.f24604d;
                                                    lVar7.f24604d = l1.f24607a.C(bArr2, i39, i36 - i39, str2);
                                                }
                                            } catch (k1 e15) {
                                                e = e15;
                                                i16 = i11;
                                                lVar7.f24604d = i37;
                                                l.f24599e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                                byte[] bytes3 = str2.getBytes(b0.f24539a);
                                                lVar7.r0(bytes3.length);
                                                lVar7.i0(bytes3, 0, bytes3.length);
                                                i35++;
                                                i20 = i15;
                                                i11 = i16;
                                                i27 = 2;
                                            }
                                        } catch (k1 e16) {
                                            e = e16;
                                            i15 = i20;
                                        }
                                    } catch (IndexOutOfBoundsException e17) {
                                        throw new m(e17);
                                    }
                                } else {
                                    i15 = i20;
                                    i16 = i11;
                                    i iVar3 = (i) objI;
                                    lVar7.p0(i34, 2);
                                    lVar7.r0(iVar3.size());
                                    h hVar3 = (h) iVar3;
                                    lVar7.i0(hVar3.f24565d, hVar3.r(), hVar3.size());
                                }
                                i35++;
                                i20 = i15;
                                i11 = i16;
                                i27 = 2;
                            }
                            i13 = i20;
                            i14 = i11;
                        } else {
                            i13 = i20;
                            i14 = i11;
                            for (int i40 = 0; i40 < list.size(); i40++) {
                                String str3 = (String) list.get(i40);
                                lVar7.p0(i34, 2);
                                int i41 = lVar7.f24603c;
                                byte[] bArr3 = lVar7.f24602b;
                                int i42 = lVar7.f24604d;
                                try {
                                    int iF4 = l.f0(str3.length() * 3);
                                    int iF5 = l.f0(str3.length());
                                    if (iF5 == iF4) {
                                        int i43 = i42 + iF5;
                                        lVar7.f24604d = i43;
                                        int iC3 = l1.f24607a.C(bArr3, i43, i41 - i43, str3);
                                        lVar7.f24604d = i42;
                                        lVar7.r0((iC3 - i42) - iF5);
                                        lVar7.f24604d = iC3;
                                    } else {
                                        lVar7.r0(l1.b(str3));
                                        int i44 = lVar7.f24604d;
                                        lVar7.f24604d = l1.f24607a.C(bArr3, i44, i41 - i44, str3);
                                    }
                                } catch (k1 e18) {
                                    lVar7.f24604d = i42;
                                    l.f24599e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e18);
                                    byte[] bytes4 = str3.getBytes(b0.f24539a);
                                    try {
                                        lVar7.r0(bytes4.length);
                                        lVar7.i0(bytes4, 0, bytes4.length);
                                    } catch (IndexOutOfBoundsException e19) {
                                        throw new m(e19);
                                    }
                                } catch (IndexOutOfBoundsException e20) {
                                    throw new m(e20);
                                }
                            }
                        }
                    }
                    r0Var = this;
                    i10 = i33;
                    i20 = i13;
                    i11 = i14;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 27:
                    i17 = i10;
                    int i45 = iArr2[i20];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    z0 z0VarP = r0Var.p(i20);
                    Class cls2 = a1.f24535a;
                    if (list2 != null && !list2.isEmpty()) {
                        k0Var.getClass();
                        for (int i46 = 0; i46 < list2.size(); i46++) {
                            k0Var.b(i45, list2.get(i46), z0VarP);
                        }
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    i17 = i10;
                    int i47 = iArr2[i20];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    Class cls3 = a1.f24535a;
                    if (list3 != null && !list3.isEmpty()) {
                        k0Var.getClass();
                        for (int i48 = 0; i48 < list3.size(); i48++) {
                            l lVar8 = (l) k0Var.f24598a;
                            i iVar4 = (i) list3.get(i48);
                            lVar8.p0(i47, 2);
                            lVar8.r0(iVar4.size());
                            h hVar4 = (h) iVar4;
                            lVar8.i0(hVar4.f24565d, hVar4.r(), hVar4.size());
                        }
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    z11 = false;
                    a1.y(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    i10 = i10;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    z11 = false;
                    a1.o(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    i10 = i10;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 31:
                    z11 = false;
                    a1.u(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    i10 = i10;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 32:
                    z11 = false;
                    a1.v(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    i10 = i10;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 33:
                    z11 = false;
                    a1.w(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    i10 = i10;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 34:
                    z11 = false;
                    a1.x(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, false);
                    i10 = i10;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    i17 = i10;
                    a1.n(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 36:
                    i17 = i10;
                    a1.r(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 37:
                    i17 = i10;
                    a1.t(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    i17 = i10;
                    a1.z(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 39:
                    i17 = i10;
                    a1.s(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 40:
                    i17 = i10;
                    a1.q(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 41:
                    i17 = i10;
                    a1.p(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 42:
                    i17 = i10;
                    a1.m(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    i17 = i10;
                    a1.y(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 44:
                    i17 = i10;
                    a1.o(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 45:
                    i17 = i10;
                    a1.u(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    i17 = i10;
                    a1.v(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    i17 = i10;
                    a1.w(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    i17 = i10;
                    a1.x(iArr2[i20], (List) unsafe.getObject(obj, j10), k0Var, c4);
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    i17 = i10;
                    int i49 = iArr2[i20];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    z0 z0VarP2 = r0Var.p(i20);
                    Class cls4 = a1.f24535a;
                    if (list4 != null && !list4.isEmpty()) {
                        k0Var.getClass();
                        for (int i50 = 0; i50 < list4.size(); i50++) {
                            k0Var.a(i49, list4.get(i50), z0VarP2);
                        }
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 50:
                    i17 = i10;
                    if (unsafe.getObject(obj, j10) != null) {
                        Object objO = r0Var.o(i20);
                        r0Var.f24630m.getClass();
                        defpackage.e.z(objO);
                        throw null;
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    i17 = i10;
                    if (r0Var.t(i22, i20, obj)) {
                        double dDoubleValue = ((Double) i1.f24575c.i(j10, obj)).doubleValue();
                        l lVar9 = (l) k0Var.f24598a;
                        lVar9.getClass();
                        lVar9.l0(i22, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    i17 = i10;
                    if (r0Var.t(i22, i20, obj)) {
                        float fFloatValue = ((Float) i1.f24575c.i(j10, obj)).floatValue();
                        l lVar10 = (l) k0Var.f24598a;
                        lVar10.getClass();
                        lVar10.j0(i22, Float.floatToRawIntBits(fFloatValue));
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    i17 = i10;
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).s0(i22, C(j10, obj));
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    i17 = i10;
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).s0(i22, C(j10, obj));
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    i17 = i10;
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).n0(i22, B(j10, obj));
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    i17 = i10;
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).l0(i22, C(j10, obj));
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    i17 = i10;
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).j0(i22, B(j10, obj));
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    i17 = i10;
                    if (r0Var.t(i22, i20, obj)) {
                        boolean zBooleanValue = ((Boolean) i1.f24575c.i(j10, obj)).booleanValue();
                        l lVar11 = (l) k0Var.f24598a;
                        lVar11.p0(i22, 0);
                        lVar11.h0(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i10 = i17;
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (r0Var.t(i22, i20, obj)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof String) {
                            String str4 = (String) object2;
                            l lVar12 = (l) k0Var.f24598a;
                            lVar12.p0(i22, 2);
                            int i51 = lVar12.f24603c;
                            byte[] bArr4 = lVar12.f24602b;
                            int i52 = lVar12.f24604d;
                            try {
                                try {
                                    int iF6 = l.f0(str4.length() * 3);
                                    int iF7 = l.f0(str4.length());
                                    if (iF7 == iF6) {
                                        int i53 = i52 + iF7;
                                        lVar12.f24604d = i53;
                                        i17 = i10;
                                        try {
                                            int iC4 = l1.f24607a.C(bArr4, i53, i51 - i53, str4);
                                            lVar12.f24604d = i52;
                                            lVar12.r0((iC4 - i52) - iF7);
                                            lVar12.f24604d = iC4;
                                        } catch (k1 e21) {
                                            e = e21;
                                            lVar12.f24604d = i52;
                                            l.f24599e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                                            byte[] bytes5 = str4.getBytes(b0.f24539a);
                                            try {
                                                lVar12.r0(bytes5.length);
                                                lVar12.i0(bytes5, 0, bytes5.length);
                                            } catch (IndexOutOfBoundsException e22) {
                                                throw new m(e22);
                                            }
                                        }
                                    } else {
                                        i17 = i10;
                                        lVar12.r0(l1.b(str4));
                                        int i54 = lVar12.f24604d;
                                        lVar12.f24604d = l1.f24607a.C(bArr4, i54, i51 - i54, str4);
                                    }
                                } catch (k1 e23) {
                                    e = e23;
                                    i17 = i10;
                                }
                            } catch (IndexOutOfBoundsException e24) {
                                throw new m(e24);
                            }
                        } else {
                            i17 = i10;
                            i iVar5 = (i) object2;
                            l lVar13 = (l) k0Var.f24598a;
                            lVar13.p0(i22, 2);
                            lVar13.r0(iVar5.size());
                            h hVar5 = (h) iVar5;
                            lVar13.i0(hVar5.f24565d, hVar5.r(), hVar5.size());
                        }
                        i10 = i17;
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 60:
                    if (r0Var.t(i22, i20, obj)) {
                        k0Var.b(i22, unsafe.getObject(obj, j10), r0Var.p(i20));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (r0Var.t(i22, i20, obj)) {
                        i iVar6 = (i) unsafe.getObject(obj, j10);
                        l lVar14 = (l) k0Var.f24598a;
                        lVar14.p0(i22, 2);
                        lVar14.r0(iVar6.size());
                        h hVar6 = (h) iVar6;
                        lVar14.i0(hVar6.f24565d, hVar6.r(), hVar6.size());
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 62:
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).q0(i22, B(j10, obj));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).n0(i22, B(j10, obj));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 64:
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).j0(i22, B(j10, obj));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 65:
                    if (r0Var.t(i22, i20, obj)) {
                        ((l) k0Var.f24598a).l0(i22, C(j10, obj));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 66:
                    if (r0Var.t(i22, i20, obj)) {
                        int iB = B(j10, obj);
                        ((l) k0Var.f24598a).q0(i22, (iB >> 31) ^ (iB << 1));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 67:
                    if (r0Var.t(i22, i20, obj)) {
                        long jC = C(j10, obj);
                        ((l) k0Var.f24598a).s0(i22, (jC >> 63) ^ (jC << c4));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                case 68:
                    if (r0Var.t(i22, i20, obj)) {
                        k0Var.a(i22, unsafe.getObject(obj, j10), r0Var.p(i20));
                    }
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
                default:
                    i20 += 3;
                    i19 = i10;
                    i21 = i11;
                    i18 = i18;
                    iArr = iArr2;
                    break;
            }
        }
        r0Var.l.getClass();
        ((x) obj).unknownFields.e(k0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24619a;
            if (i10 >= iArr.length) {
                a1.k(this.l, obj, obj2);
                return;
            }
            int iS = S(i10);
            long j10 = 1048575 & iS;
            int i11 = iArr[i10];
            switch (R(iS)) {
                case 0:
                    if (!q(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        h1 h1Var = i1.f24575c;
                        obj3 = obj;
                        h1Var.m(obj3, j10, h1Var.e(j10, obj2));
                        M(i10, obj3);
                    }
                    break;
                case 1:
                    if (q(i10, obj2)) {
                        h1 h1Var2 = i1.f24575c;
                        h1Var2.n(obj, j10, h1Var2.f(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (q(i10, obj2)) {
                        i1.o(obj, j10, i1.f24575c.h(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (q(i10, obj2)) {
                        i1.o(obj, j10, i1.f24575c.h(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (q(i10, obj2)) {
                        i1.n(i1.f24575c.g(j10, obj2), j10, obj);
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (q(i10, obj2)) {
                        i1.o(obj, j10, i1.f24575c.h(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (q(i10, obj2)) {
                        i1.n(i1.f24575c.g(j10, obj2), j10, obj);
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (q(i10, obj2)) {
                        h1 h1Var3 = i1.f24575c;
                        h1Var3.k(obj, j10, h1Var3.c(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (q(i10, obj2)) {
                        i1.p(obj, j10, i1.f24575c.i(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    v(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (q(i10, obj2)) {
                        i1.p(obj, j10, i1.f24575c.i(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i10, obj2)) {
                        i1.n(i1.f24575c.g(j10, obj2), j10, obj);
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i10, obj2)) {
                        i1.n(i1.f24575c.g(j10, obj2), j10, obj);
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i10, obj2)) {
                        i1.n(i1.f24575c.g(j10, obj2), j10, obj);
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i10, obj2)) {
                        i1.o(obj, j10, i1.f24575c.h(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (q(i10, obj2)) {
                        i1.n(i1.f24575c.g(j10, obj2), j10, obj);
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i10, obj2)) {
                        i1.o(obj, j10, i1.f24575c.h(j10, obj2));
                        M(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    v(i10, obj, obj2);
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
                    this.f24629k.getClass();
                    h1 h1Var4 = i1.f24575c;
                    a0 a0VarMutableCopyWithCapacity = (a0) h1Var4.i(j10, obj);
                    a0 a0Var = (a0) h1Var4.i(j10, obj2);
                    int size = a0VarMutableCopyWithCapacity.size();
                    int size2 = a0Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((b) a0VarMutableCopyWithCapacity).f24538a) {
                            a0VarMutableCopyWithCapacity = a0VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                        }
                        a0VarMutableCopyWithCapacity.addAll(a0Var);
                    }
                    if (size > 0) {
                        a0Var = a0VarMutableCopyWithCapacity;
                    }
                    i1.p(obj, j10, a0Var);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = a1.f24535a;
                    h1 h1Var5 = i1.f24575c;
                    Object objI = h1Var5.i(j10, obj);
                    Object objI2 = h1Var5.i(j10, obj2);
                    this.f24630m.getClass();
                    i1.p(obj, j10, m0.a(objI, objI2));
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
                    if (t(i11, i10, obj2)) {
                        i1.p(obj, j10, i1.f24575c.i(j10, obj2));
                        N(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    w(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                case 62:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (t(i11, i10, obj2)) {
                        i1.p(obj, j10, i1.f24575c.i(j10, obj2));
                        N(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    w(i10, obj, obj2);
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
    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void b(Object obj) {
        if (s(obj)) {
            if (obj instanceof x) {
                x xVar = (x) obj;
                xVar.w(Integer.MAX_VALUE);
                xVar.memoizedHashCode = 0;
                xVar.p();
            }
            int[] iArr = this.f24619a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iS = S(i10);
                long j10 = 1048575 & iS;
                int iR = R(iS);
                if (iR != 9) {
                    if (iR != 60 && iR != 68) {
                        switch (iR) {
                            case 17:
                                if (q(i10, obj)) {
                                    p(i10).b(f24618o.getObject(obj, j10));
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
                                this.f24629k.getClass();
                                b bVar = (b) ((a0) i1.f24575c.i(j10, obj));
                                if (bVar.f24538a) {
                                    bVar.f24538a = false;
                                }
                                break;
                            case 50:
                                Unsafe unsafe = f24618o;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    this.f24630m.getClass();
                                    ((l0) object).f24606a = false;
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (t(iArr[i10], i10, obj)) {
                        p(i10).b(f24618o.getObject(obj, j10));
                    }
                } else if (q(i10, obj)) {
                    p(i10).b(f24618o.getObject(obj, j10));
                }
            }
            this.l.getClass();
            c1 c1Var = ((x) obj).unknownFields;
            if (c1Var.f24548e) {
                c1Var.f24548e = false;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final boolean c(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f24626h) {
            int i15 = this.f24625g[i14];
            int[] iArr = this.f24619a;
            int i16 = iArr[i15];
            int iS = S(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f24618o.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                int i20 = i13;
                i10 = i12;
                i11 = i20;
            }
            if ((268435456 & iS) == 0 || r(obj, i15, i10, i11, i19)) {
                int iR = R(iS);
                if (iR == 9 || iR == 17) {
                    if (r(obj, i15, i10, i11, i19)) {
                        if (!p(i15).c(i1.f24575c.i(iS & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    if (iR != 27) {
                        if (iR == 60 || iR == 68) {
                            if (t(i16, i15, obj)) {
                                if (!p(i15).c(i1.f24575c.i(iS & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                        } else if (iR != 49) {
                            if (iR != 50) {
                                continue;
                            } else {
                                Object objI = i1.f24575c.i(iS & 1048575, obj);
                                this.f24630m.getClass();
                                if (!((l0) objI).isEmpty()) {
                                    defpackage.e.z(o(i15));
                                    throw null;
                                }
                            }
                        }
                        i14++;
                        i12 = i10;
                        i13 = i11;
                    }
                    List list = (List) i1.f24575c.i(iS & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        z0 z0VarP = p(i15);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (z0VarP.c(list.get(i21))) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final Object d() {
        this.f24628j.getClass();
        return ((x) this.f24623e).r();
    }

    /* JADX WARN: Code duplicated, block: B:149:0x036e  */
    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final int e(x xVar) {
        int i10;
        int iE0;
        int iE1;
        int iE2;
        int iG0;
        int iE3;
        int iG1;
        int iE4;
        int iE5;
        int iE6;
        int iA;
        int iF0;
        int iA0;
        int iE7;
        int iA2;
        int iC;
        int iE8;
        int size;
        int i11;
        int iE9;
        int iE10;
        int size2;
        int iE11;
        int iF1;
        int iA3;
        int iE12;
        int iE13;
        int iG2;
        int iE14;
        int iG3;
        int i12;
        r0 r0Var = this;
        x xVar2 = xVar;
        Unsafe unsafe = f24618o;
        int i13 = 0;
        int i14 = 0;
        int iA1 = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = r0Var.f24619a;
            if (i13 >= iArr.length) {
                r0Var.l.getClass();
                return xVar2.unknownFields.b() + iA1;
            }
            int iS = r0Var.S(i13);
            int iR = R(iS);
            int i16 = iArr[i13];
            int i17 = iArr[i13 + 2];
            int i18 = i17 & 1048575;
            if (iR <= 17) {
                if (i18 != i15) {
                    i14 = i18 == 1048575 ? 0 : unsafe.getInt(xVar2, i18);
                    i15 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iS & 1048575;
            if (iR >= s.f24631b.f24635a) {
                int i19 = s.f24632c.f24635a;
            }
            switch (iR) {
                case 0:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        iE0 = l.e0(i16);
                        iC = iE0 + 8;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case 1:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        iE1 = l.e0(i16);
                        iE5 = iE1 + 4;
                        iA1 += iE5;
                    }
                    r0Var = this;
                    xVar2 = xVar;
                    i13 += 3;
                    break;
                case 2:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        long j11 = unsafe.getLong(xVar2, j10);
                        iE2 = l.e0(i16);
                        iG0 = l.g0(j11);
                        iA1 += iG0 + iE2;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 3:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        long j12 = unsafe.getLong(xVar2, j10);
                        iE2 = l.e0(i16);
                        iG0 = l.g0(j12);
                        iA1 += iG0 + iE2;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 4:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        int i20 = unsafe.getInt(xVar2, j10);
                        iE3 = l.e0(i16);
                        iG1 = l.g0(i20);
                        iA0 = iG1 + iE3;
                        iA1 += iA0;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 5:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        iE4 = l.e0(i16);
                        iE5 = iE4 + 8;
                        iA1 += iE5;
                    }
                    r0Var = this;
                    xVar2 = xVar;
                    i13 += 3;
                    break;
                case 6:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        iE1 = l.e0(i16);
                        iE5 = iE1 + 4;
                        iA1 += iE5;
                    }
                    r0Var = this;
                    xVar2 = xVar;
                    i13 += 3;
                    break;
                case 7:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        iE5 = l.e0(i16) + 1;
                        iA1 += iE5;
                    }
                    r0Var = this;
                    xVar2 = xVar;
                    i13 += 3;
                    break;
                case 8:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        Object object = unsafe.getObject(xVar2, j10);
                        iA1 = (object instanceof i ? l.a0(i16, (i) object) : l.d0((String) object) + l.e0(i16)) + iA1;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 9:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        Object object2 = unsafe.getObject(xVar2, j10);
                        z0 z0VarP = r0Var.p(i13);
                        Class cls = a1.f24535a;
                        iE6 = l.e0(i16);
                        iA = ((a) object2).a(z0VarP);
                        iF0 = l.f0(iA);
                        i12 = iF0 + iA + iE6;
                        iA1 += i12;
                    }
                    i13 += 3;
                    break;
                case 10:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        iA0 = l.a0(i16, (i) unsafe.getObject(xVar2, j10));
                        iA1 += iA0;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 11:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        int i21 = unsafe.getInt(xVar2, j10);
                        iE3 = l.e0(i16);
                        iG1 = l.f0(i21);
                        iA0 = iG1 + iE3;
                        iA1 += iA0;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 12:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        int i22 = unsafe.getInt(xVar2, j10);
                        iE3 = l.e0(i16);
                        iG1 = l.g0(i22);
                        iA0 = iG1 + iE3;
                        iA1 += iA0;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 13:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        iE1 = l.e0(i16);
                        iE5 = iE1 + 4;
                        iA1 += iE5;
                    }
                    r0Var = this;
                    xVar2 = xVar;
                    i13 += 3;
                    break;
                case 14:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        iE4 = l.e0(i16);
                        iE5 = iE4 + 8;
                        iA1 += iE5;
                    }
                    r0Var = this;
                    xVar2 = xVar;
                    i13 += 3;
                    break;
                case 15:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        int i23 = unsafe.getInt(xVar2, j10);
                        iE3 = l.e0(i16);
                        iG1 = l.b0(i23);
                        iA0 = iG1 + iE3;
                        iA1 += iA0;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 16:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        long j13 = unsafe.getLong(xVar2, j10);
                        iE2 = l.e0(i16);
                        iG0 = l.c0(j13);
                        iA1 += iG0 + iE2;
                    }
                    r0Var = this;
                    i13 += 3;
                    break;
                case 17:
                    if (r0Var.r(xVar2, i13, i15, i14, i10)) {
                        a aVar = (a) unsafe.getObject(xVar2, j10);
                        z0 z0VarP2 = r0Var.p(i13);
                        iE7 = l.e0(i16) * 2;
                        iA2 = aVar.a(z0VarP2);
                        iC = iA2 + iE7;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case 18:
                    iC = a1.c(i16, (List) unsafe.getObject(xVar2, j10));
                    iA1 += iC;
                    i13 += 3;
                    break;
                case 19:
                    iC = a1.b(i16, (List) unsafe.getObject(xVar2, j10));
                    iA1 += iC;
                    i13 += 3;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(xVar2, j10);
                    Class cls2 = a1.f24535a;
                    if (list.size() == 0) {
                        iE8 = 0;
                    } else {
                        iE8 = (l.e0(i16) * list.size()) + a1.e(list);
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(xVar2, j10);
                    Class cls3 = a1.f24535a;
                    size = list2.size();
                    if (size == 0) {
                        iE8 = 0;
                    } else {
                        i11 = a1.i(list2);
                        iE9 = l.e0(i16);
                        iE8 = (iE9 * size) + i11;
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(xVar2, j10);
                    Class cls4 = a1.f24535a;
                    size = list3.size();
                    if (size == 0) {
                        iE8 = 0;
                    } else {
                        i11 = a1.d(list3);
                        iE9 = l.e0(i16);
                        iE8 = (iE9 * size) + i11;
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case 23:
                    iC = a1.c(i16, (List) unsafe.getObject(xVar2, j10));
                    iA1 += iC;
                    i13 += 3;
                    break;
                case 24:
                    iC = a1.b(i16, (List) unsafe.getObject(xVar2, j10));
                    iA1 += iC;
                    i13 += 3;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(xVar2, j10);
                    Class cls5 = a1.f24535a;
                    int size3 = list4.size();
                    iA1 += size3 == 0 ? 0 : (l.e0(i16) + 1) * size3;
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    List list5 = (List) unsafe.getObject(xVar2, j10);
                    Class cls6 = a1.f24535a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iE8 = 0;
                    } else {
                        iE8 = l.e0(i16) * size4;
                        if (list5 instanceof f0) {
                            f0 f0Var = (f0) list5;
                            for (int i24 = 0; i24 < size4; i24++) {
                                Object objI = f0Var.i();
                                if (objI instanceof i) {
                                    int size5 = ((i) objI).size();
                                    iE8 = l.f0(size5) + size5 + iE8;
                                } else {
                                    iE8 = l.d0((String) objI) + iE8;
                                }
                            }
                        } else {
                            for (int i25 = 0; i25 < size4; i25++) {
                                Object obj = list5.get(i25);
                                if (obj instanceof i) {
                                    int size6 = ((i) obj).size();
                                    iE8 = l.f0(size6) + size6 + iE8;
                                } else {
                                    iE8 = l.d0((String) obj) + iE8;
                                }
                            }
                        }
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(xVar2, j10);
                    z0 z0VarP3 = r0Var.p(i13);
                    Class cls7 = a1.f24535a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        iE10 = 0;
                    } else {
                        iE10 = l.e0(i16) * size7;
                        for (int i26 = 0; i26 < size7; i26++) {
                            int iA4 = ((a) list6.get(i26)).a(z0VarP3);
                            iE10 += l.f0(iA4) + iA4;
                        }
                    }
                    iA1 += iE10;
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    List list7 = (List) unsafe.getObject(xVar2, j10);
                    Class cls8 = a1.f24535a;
                    int size8 = list7.size();
                    if (size8 == 0) {
                        iE8 = 0;
                    } else {
                        iE8 = l.e0(i16) * size8;
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int size9 = ((i) list7.get(i27)).size();
                            iE8 += l.f0(size9) + size9;
                        }
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    List list8 = (List) unsafe.getObject(xVar2, j10);
                    Class cls9 = a1.f24535a;
                    size = list8.size();
                    if (size == 0) {
                        iE8 = 0;
                    } else {
                        i11 = a1.h(list8);
                        iE9 = l.e0(i16);
                        iE8 = (iE9 * size) + i11;
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    List list9 = (List) unsafe.getObject(xVar2, j10);
                    Class cls10 = a1.f24535a;
                    size = list9.size();
                    if (size == 0) {
                        iE8 = 0;
                    } else {
                        i11 = a1.a(list9);
                        iE9 = l.e0(i16);
                        iE8 = (iE9 * size) + i11;
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case 31:
                    iC = a1.b(i16, (List) unsafe.getObject(xVar2, j10));
                    iA1 += iC;
                    i13 += 3;
                    break;
                case 32:
                    iC = a1.c(i16, (List) unsafe.getObject(xVar2, j10));
                    iA1 += iC;
                    i13 += 3;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(xVar2, j10);
                    Class cls11 = a1.f24535a;
                    size = list10.size();
                    if (size == 0) {
                        iE8 = 0;
                    } else {
                        i11 = a1.f(list10);
                        iE9 = l.e0(i16);
                        iE8 = (iE9 * size) + i11;
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(xVar2, j10);
                    Class cls12 = a1.f24535a;
                    size = list11.size();
                    if (size == 0) {
                        iE8 = 0;
                    } else {
                        i11 = a1.g(list11);
                        iE9 = l.e0(i16);
                        iE8 = (iE9 * size) + i11;
                    }
                    iA1 += iE8;
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    List list12 = (List) unsafe.getObject(xVar2, j10);
                    Class cls13 = a1.f24535a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(xVar2, j10);
                    Class cls14 = a1.f24535a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case 37:
                    size2 = a1.e((List) unsafe.getObject(xVar2, j10));
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    size2 = a1.i((List) unsafe.getObject(xVar2, j10));
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case 39:
                    size2 = a1.d((List) unsafe.getObject(xVar2, j10));
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(xVar2, j10);
                    Class cls15 = a1.f24535a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(xVar2, j10);
                    Class cls16 = a1.f24535a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(xVar2, j10);
                    Class cls17 = a1.f24535a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    size2 = a1.h((List) unsafe.getObject(xVar2, j10));
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case 44:
                    size2 = a1.a((List) unsafe.getObject(xVar2, j10));
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(xVar2, j10);
                    Class cls18 = a1.f24535a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    List list18 = (List) unsafe.getObject(xVar2, j10);
                    Class cls19 = a1.f24535a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    size2 = a1.f((List) unsafe.getObject(xVar2, j10));
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    size2 = a1.g((List) unsafe.getObject(xVar2, j10));
                    if (size2 > 0) {
                        iE11 = l.e0(i16);
                        iF1 = l.f0(size2);
                        iA1 += iF1 + iE11 + size2;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    List list19 = (List) unsafe.getObject(xVar2, j10);
                    z0 z0VarP4 = r0Var.p(i13);
                    Class cls20 = a1.f24535a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        iA3 = 0;
                    } else {
                        iA3 = 0;
                        for (int i28 = 0; i28 < size10; i28++) {
                            iA3 += ((a) list19.get(i28)).a(z0VarP4) + (l.e0(i16) * 2);
                        }
                    }
                    iA1 += iA3;
                    i13 += 3;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(xVar2, j10);
                    Object objO = r0Var.o(i13);
                    r0Var.f24630m.getClass();
                    l0 l0Var = (l0) object3;
                    if (objO != null) {
                        throw new ClassCastException();
                    }
                    if (l0Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = l0Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        iE0 = l.e0(i16);
                        iC = iE0 + 8;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        iE12 = l.e0(i16);
                        iC = iE12 + 4;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        long jC = C(j10, xVar2);
                        iE13 = l.e0(i16);
                        iG2 = l.g0(jC);
                        i12 = iG2 + iE13;
                        iA1 += i12;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        long jC2 = C(j10, xVar2);
                        iE13 = l.e0(i16);
                        iG2 = l.g0(jC2);
                        i12 = iG2 + iE13;
                        iA1 += i12;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        int iB = B(j10, xVar2);
                        iE14 = l.e0(i16);
                        iG3 = l.g0(iB);
                        iC = iG3 + iE14;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        iE0 = l.e0(i16);
                        iC = iE0 + 8;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        iE12 = l.e0(i16);
                        iC = iE12 + 4;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        iC = l.e0(i16) + 1;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        Object object4 = unsafe.getObject(xVar2, j10);
                        iA1 = (object4 instanceof i ? l.a0(i16, (i) object4) : l.d0((String) object4) + l.e0(i16)) + iA1;
                    }
                    i13 += 3;
                    break;
                case 60:
                    if (r0Var.t(i16, i13, xVar2)) {
                        Object object5 = unsafe.getObject(xVar2, j10);
                        z0 z0VarP5 = r0Var.p(i13);
                        Class cls21 = a1.f24535a;
                        iE6 = l.e0(i16);
                        iA = ((a) object5).a(z0VarP5);
                        iF0 = l.f0(iA);
                        i12 = iF0 + iA + iE6;
                        iA1 += i12;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        iC = l.a0(i16, (i) unsafe.getObject(xVar2, j10));
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case 62:
                    if (r0Var.t(i16, i13, xVar2)) {
                        int iB2 = B(j10, xVar2);
                        iE14 = l.e0(i16);
                        iG3 = l.f0(iB2);
                        iC = iG3 + iE14;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (r0Var.t(i16, i13, xVar2)) {
                        int iB3 = B(j10, xVar2);
                        iE14 = l.e0(i16);
                        iG3 = l.g0(iB3);
                        iC = iG3 + iE14;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case 64:
                    if (r0Var.t(i16, i13, xVar2)) {
                        iE12 = l.e0(i16);
                        iC = iE12 + 4;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case 65:
                    if (r0Var.t(i16, i13, xVar2)) {
                        iE0 = l.e0(i16);
                        iC = iE0 + 8;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case 66:
                    if (r0Var.t(i16, i13, xVar2)) {
                        int iB4 = B(j10, xVar2);
                        iE14 = l.e0(i16);
                        iG3 = l.b0(iB4);
                        iC = iG3 + iE14;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                case 67:
                    if (r0Var.t(i16, i13, xVar2)) {
                        long jC3 = C(j10, xVar2);
                        iE13 = l.e0(i16);
                        iG2 = l.c0(jC3);
                        i12 = iG2 + iE13;
                        iA1 += i12;
                    }
                    i13 += 3;
                    break;
                case 68:
                    if (r0Var.t(i16, i13, xVar2)) {
                        a aVar2 = (a) unsafe.getObject(xVar2, j10);
                        z0 z0VarP6 = r0Var.p(i13);
                        iE7 = l.e0(i16) * 2;
                        iA2 = aVar2.a(z0VarP6);
                        iC = iA2 + iE7;
                        iA1 += iC;
                    }
                    i13 += 3;
                    break;
                default:
                    i13 += 3;
                    break;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void f(Object obj, k0 k0Var) throws m {
        k0Var.getClass();
        T(obj, k0Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final boolean g(x xVar, x xVar2) {
        int[] iArr = this.f24619a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zL = true;
            if (i10 < length) {
                int iS = S(i10);
                long j10 = iS & 1048575;
                switch (R(iS)) {
                    case 0:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var = i1.f24575c;
                            if (Double.doubleToLongBits(h1Var.e(j10, xVar)) != Double.doubleToLongBits(h1Var.e(j10, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var2 = i1.f24575c;
                            if (Float.floatToIntBits(h1Var2.f(j10, xVar)) != Float.floatToIntBits(h1Var2.f(j10, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var3 = i1.f24575c;
                            if (h1Var3.h(j10, xVar) != h1Var3.h(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var4 = i1.f24575c;
                            if (h1Var4.h(j10, xVar) != h1Var4.h(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var5 = i1.f24575c;
                            if (h1Var5.g(j10, xVar) != h1Var5.g(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var6 = i1.f24575c;
                            if (h1Var6.h(j10, xVar) != h1Var6.h(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var7 = i1.f24575c;
                            if (h1Var7.g(j10, xVar) != h1Var7.g(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var8 = i1.f24575c;
                            if (h1Var8.c(j10, xVar) != h1Var8.c(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var9 = i1.f24575c;
                            if (!a1.l(h1Var9.i(j10, xVar), h1Var9.i(j10, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var10 = i1.f24575c;
                            if (!a1.l(h1Var10.i(j10, xVar), h1Var10.i(j10, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var11 = i1.f24575c;
                            if (!a1.l(h1Var11.i(j10, xVar), h1Var11.i(j10, xVar2))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var12 = i1.f24575c;
                            if (h1Var12.g(j10, xVar) != h1Var12.g(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var13 = i1.f24575c;
                            if (h1Var13.g(j10, xVar) != h1Var13.g(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var14 = i1.f24575c;
                            if (h1Var14.g(j10, xVar) != h1Var14.g(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var15 = i1.f24575c;
                            if (h1Var15.h(j10, xVar) != h1Var15.h(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var16 = i1.f24575c;
                            if (h1Var16.g(j10, xVar) != h1Var16.g(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var17 = i1.f24575c;
                            if (h1Var17.h(j10, xVar) != h1Var17.h(j10, xVar2)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!k(xVar, xVar2, i10)) {
                            zL = false;
                        } else {
                            h1 h1Var18 = i1.f24575c;
                            if (!a1.l(h1Var18.i(j10, xVar), h1Var18.i(j10, xVar2))) {
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
                        h1 h1Var19 = i1.f24575c;
                        zL = a1.l(h1Var19.i(j10, xVar), h1Var19.i(j10, xVar2));
                        break;
                    case 50:
                        h1 h1Var20 = i1.f24575c;
                        zL = a1.l(h1Var20.i(j10, xVar), h1Var20.i(j10, xVar2));
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
                        h1 h1Var21 = i1.f24575c;
                        if (h1Var21.g(j11, xVar) != h1Var21.g(j11, xVar2) || !a1.l(h1Var21.i(j10, xVar), h1Var21.i(j10, xVar2))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i10 += 3;
                }
            } else {
                this.l.getClass();
                if (xVar.unknownFields.equals(xVar2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final int h(x xVar) {
        int i10;
        int iB;
        int i11;
        int[] iArr = this.f24619a;
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iS = S(i13);
            int i14 = iArr[i13];
            long j10 = 1048575 & iS;
            int i15 = 1237;
            int iHashCode = 37;
            switch (R(iS)) {
                case 0:
                    i10 = i12 * 53;
                    iB = b0.b(Double.doubleToLongBits(i1.f24575c.e(j10, xVar)));
                    i12 = iB + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iB = Float.floatToIntBits(i1.f24575c.f(j10, xVar));
                    i12 = iB + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    iB = b0.b(i1.f24575c.h(j10, xVar));
                    i12 = iB + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    iB = b0.b(i1.f24575c.h(j10, xVar));
                    i12 = iB + i10;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iB = i1.f24575c.g(j10, xVar);
                    i12 = iB + i10;
                    break;
                case 5:
                    i10 = i12 * 53;
                    iB = b0.b(i1.f24575c.h(j10, xVar));
                    i12 = iB + i10;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iB = i1.f24575c.g(j10, xVar);
                    i12 = iB + i10;
                    break;
                case 7:
                    i11 = i12 * 53;
                    boolean zC = i1.f24575c.c(j10, xVar);
                    Charset charset = b0.f24539a;
                    if (zC) {
                        i15 = 1231;
                    }
                    i12 = i15 + i11;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iB = ((String) i1.f24575c.i(j10, xVar)).hashCode();
                    i12 = iB + i10;
                    break;
                case 9:
                    Object objI = i1.f24575c.i(j10, xVar);
                    if (objI != null) {
                        iHashCode = objI.hashCode();
                    }
                    i12 = (i12 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iB = i1.f24575c.i(j10, xVar).hashCode();
                    i12 = iB + i10;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iB = i1.f24575c.g(j10, xVar);
                    i12 = iB + i10;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iB = i1.f24575c.g(j10, xVar);
                    i12 = iB + i10;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iB = i1.f24575c.g(j10, xVar);
                    i12 = iB + i10;
                    break;
                case 14:
                    i10 = i12 * 53;
                    iB = b0.b(i1.f24575c.h(j10, xVar));
                    i12 = iB + i10;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iB = i1.f24575c.g(j10, xVar);
                    i12 = iB + i10;
                    break;
                case 16:
                    i10 = i12 * 53;
                    iB = b0.b(i1.f24575c.h(j10, xVar));
                    i12 = iB + i10;
                    break;
                case 17:
                    Object objI2 = i1.f24575c.i(j10, xVar);
                    if (objI2 != null) {
                        iHashCode = objI2.hashCode();
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
                    iB = i1.f24575c.i(j10, xVar).hashCode();
                    i12 = iB + i10;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iB = i1.f24575c.i(j10, xVar).hashCode();
                    i12 = iB + i10;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = b0.b(Double.doubleToLongBits(((Double) i1.f24575c.i(j10, xVar)).doubleValue()));
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = Float.floatToIntBits(((Float) i1.f24575c.i(j10, xVar)).floatValue());
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = b0.b(C(j10, xVar));
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = b0.b(C(j10, xVar));
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = B(j10, xVar);
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = b0.b(C(j10, xVar));
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = B(j10, xVar);
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (t(i14, i13, xVar)) {
                        i11 = i12 * 53;
                        boolean zBooleanValue = ((Boolean) i1.f24575c.i(j10, xVar)).booleanValue();
                        Charset charset2 = b0.f24539a;
                        if (zBooleanValue) {
                            i15 = 1231;
                        }
                        i12 = i15 + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = ((String) i1.f24575c.i(j10, xVar)).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 60:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = i1.f24575c.i(j10, xVar).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = i1.f24575c.i(j10, xVar).hashCode();
                        i12 = iB + i10;
                    }
                    break;
                case 62:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = B(j10, xVar);
                        i12 = iB + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = B(j10, xVar);
                        i12 = iB + i10;
                    }
                    break;
                case 64:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = B(j10, xVar);
                        i12 = iB + i10;
                    }
                    break;
                case 65:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = b0.b(C(j10, xVar));
                        i12 = iB + i10;
                    }
                    break;
                case 66:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = B(j10, xVar);
                        i12 = iB + i10;
                    }
                    break;
                case 67:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = b0.b(C(j10, xVar));
                        i12 = iB + i10;
                    }
                    break;
                case 68:
                    if (t(i14, i13, xVar)) {
                        i10 = i12 * 53;
                        iB = i1.f24575c.i(j10, xVar).hashCode();
                        i12 = iB + i10;
                    }
                    break;
            }
        }
        this.l.getClass();
        return xVar.unknownFields.hashCode() + (i12 * 53);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void i(Object obj, byte[] bArr, int i10, int i11, ur1 ur1Var) {
        E(obj, bArr, i10, i11, 0, ur1Var);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0713 A[Catch: all -> 0x0460, TryCatch #0 {all -> 0x0460, blocks: (B:148:0x070e, B:150:0x0713, B:151:0x0718, B:110:0x045b, B:113:0x0463, B:114:0x0478, B:115:0x048d, B:116:0x04a2, B:117:0x04b7, B:118:0x04cc, B:119:0x04e1, B:120:0x04f6, B:121:0x050b, B:122:0x0525, B:123:0x0541, B:124:0x055e, B:125:0x057b, B:126:0x0598, B:127:0x05b8, B:128:0x05d5, B:129:0x05ea, B:130:0x0605, B:131:0x0612, B:132:0x0631, B:133:0x064e, B:134:0x066b, B:135:0x0688, B:136:0x06a5, B:137:0x06c2, B:138:0x06e0, B:142:0x06fe), top: B:168:0x070e }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0723 A[LOOP:2: B:154:0x0721->B:155:0x0723, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x073c A[LOOP:3: B:161:0x073a->B:162:0x073c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0746  */
    /* JADX WARN: Code duplicated, block: B:197:0x071f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.z0
    public final void j(Object obj, androidx.datastore.preferences.protobuf.n nVar, p pVar) throws Throwable {
        int i10;
        int i11;
        androidx.datastore.preferences.protobuf.n nVar2;
        int i12;
        r0 r0Var = this;
        Object obj2 = obj;
        androidx.datastore.preferences.protobuf.n nVar3 = nVar;
        p pVar2 = pVar;
        pVar2.getClass();
        l(obj2);
        d1 d1Var = r0Var.l;
        int[] iArr = r0Var.f24625g;
        int i13 = r0Var.f24627i;
        int i14 = r0Var.f24626h;
        c1 c1VarA = null;
        while (true) {
            try {
                int iD = nVar3.d();
                int iO = (iD < r0Var.f24621c || iD > r0Var.f24622d) ? -1 : r0Var.O(iD, 0);
                if (iO >= 0) {
                    int iS = r0Var.S(iO);
                    try {
                        int iR = R(iS);
                        g0 g0Var = r0Var.f24629k;
                        switch (iR) {
                            case 0:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA = A(iS);
                                nVar2.T(1);
                                Object obj3 = obj2;
                                try {
                                    i1.f24575c.m(obj3, jA, ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).l());
                                    obj2 = obj3;
                                    r0Var.M(iO, obj2);
                                } catch (c0 unused) {
                                    obj2 = obj3;
                                    try {
                                        d1Var.getClass();
                                        if (c1VarA == null) {
                                            c1VarA = d1.a(obj2);
                                        }
                                        if (!d1.b(0, nVar2, c1VarA)) {
                                            for (i12 = i10; i12 < i13; i12++) {
                                                r0Var.m(iArr[i12], obj2, c1VarA);
                                            }
                                            if (c1VarA == null) {
                                                return;
                                            }
                                            ((x) obj2).unknownFields = c1VarA;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        for (i11 = i10; i11 < i13; i11++) {
                                            r0Var.m(iArr[i11], obj2, c1VarA);
                                        }
                                        if (c1VarA != null) {
                                            d1Var.getClass();
                                            ((x) obj2).unknownFields = c1VarA;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj3;
                                    while (i11 < i13) {
                                        r0Var.m(iArr[i11], obj2, c1VarA);
                                    }
                                    if (c1VarA != null) {
                                        d1Var.getClass();
                                        ((x) obj2).unknownFields = c1VarA;
                                    }
                                    throw th;
                                }
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 1:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA2 = A(iS);
                                nVar2.T(5);
                                i1.f24575c.n(obj2, jA2, ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).p());
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 2:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA3 = A(iS);
                                nVar2.T(0);
                                i1.o(obj2, jA3, ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).r());
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 3:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA4 = A(iS);
                                nVar2.T(0);
                                i1.o(obj2, jA4, ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).A());
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 4:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA5 = A(iS);
                                nVar2.T(0);
                                i1.n(((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).q(), jA5, obj2);
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 5:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA6 = A(iS);
                                nVar2.T(1);
                                i1.o(obj2, jA6, ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).o());
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 6:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA7 = A(iS);
                                nVar2.T(5);
                                i1.n(((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).n(), jA7, obj2);
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 7:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA8 = A(iS);
                                nVar2.T(0);
                                i1.f24575c.k(obj2, jA8, ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).i());
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 8:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                r0Var.J(iS, nVar2, obj2);
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 9:
                                p pVar3 = pVar2;
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                a aVar = (a) r0Var.x(iO, obj2);
                                z0 z0VarP = r0Var.p(iO);
                                nVar2.T(2);
                                nVar2.i(aVar, z0VarP, pVar3);
                                r0Var.P(iO, obj2, aVar);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 10:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                i1.p(obj2, A(iS), nVar2.m());
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 11:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA9 = A(iS);
                                nVar2.T(0);
                                i1.n(((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).z(), jA9, obj2);
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 12:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                nVar2.T(0);
                                int iM = ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).m();
                                r0Var.n(iO);
                                i1.n(iM, A(iS), obj2);
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 13:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA10 = A(iS);
                                nVar2.T(5);
                                i1.n(((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).s(), jA10, obj2);
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 14:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA11 = A(iS);
                                nVar2.T(1);
                                i1.o(obj2, jA11, ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).t());
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 15:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA12 = A(iS);
                                nVar2.T(0);
                                i1.n(((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).u(), jA12, obj2);
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 16:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA13 = A(iS);
                                nVar2.T(0);
                                i1.o(obj2, jA13, ((androidx.datastore.preferences.protobuf.m) nVar2.f4137e).v());
                                r0Var.M(iO, obj2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 17:
                                p pVar4 = pVar2;
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                a aVar2 = (a) r0Var.x(iO, obj2);
                                z0 z0VarP2 = r0Var.p(iO);
                                nVar2.T(3);
                                nVar2.g(aVar2, z0VarP2, pVar4);
                                r0Var.P(iO, obj2, aVar2);
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 18:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA14 = A(iS);
                                g0Var.getClass();
                                nVar2.q(g0.a(jA14, obj2));
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 19:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA15 = A(iS);
                                g0Var.getClass();
                                nVar2.z(g0.a(jA15, obj2));
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 20:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA16 = A(iS);
                                g0Var.getClass();
                                nVar2.D(g0.a(jA16, obj2));
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 21:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA17 = A(iS);
                                g0Var.getClass();
                                nVar2.R(g0.a(jA17, obj2));
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 22:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA18 = A(iS);
                                g0Var.getClass();
                                nVar2.B(g0.a(jA18, obj2));
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 23:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA19 = A(iS);
                                g0Var.getClass();
                                nVar2.x(g0.a(jA19, obj2));
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 24:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA20 = A(iS);
                                g0Var.getClass();
                                nVar2.v(g0.a(jA20, obj2));
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 25:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                long jA21 = A(iS);
                                g0Var.getClass();
                                nVar2.k(g0.a(jA21, obj2));
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                i10 = i14;
                                r0Var = r0Var;
                                nVar2 = nVar3;
                                try {
                                    r0Var.K(iS, nVar2, obj2);
                                } catch (c0 unused2) {
                                    d1Var.getClass();
                                    if (c1VarA == null) {
                                        c1VarA = d1.a(obj2);
                                    }
                                    if (!d1.b(0, nVar2, c1VarA)) {
                                        while (i12 < i13) {
                                            r0Var.m(iArr[i12], obj2, c1VarA);
                                        }
                                        if (c1VarA == null) {
                                            return;
                                        }
                                        ((x) obj2).unknownFields = c1VarA;
                                    }
                                }
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 27:
                                i10 = i14;
                                try {
                                    try {
                                        r0Var.I(obj2, iS, nVar3, r0Var.p(iO), pVar);
                                        nVar2 = nVar3;
                                        r0Var = r0Var;
                                    } catch (c0 unused3) {
                                        nVar2 = nVar3;
                                        r0Var = r0Var;
                                        d1Var.getClass();
                                        if (c1VarA == null) {
                                            c1VarA = d1.a(obj2);
                                        }
                                        if (!d1.b(0, nVar2, c1VarA)) {
                                            while (i12 < i13) {
                                                r0Var.m(iArr[i12], obj2, c1VarA);
                                            }
                                            if (c1VarA == null) {
                                                return;
                                            }
                                            ((x) obj2).unknownFields = c1VarA;
                                        }
                                    }
                                } catch (c0 unused4) {
                                    nVar2 = nVar3;
                                    d1Var.getClass();
                                    if (c1VarA == null) {
                                        c1VarA = d1.a(obj2);
                                    }
                                    if (!d1.b(0, nVar2, c1VarA)) {
                                        while (i12 < i13) {
                                            r0Var.m(iArr[i12], obj2, c1VarA);
                                        }
                                        if (c1VarA == null) {
                                            return;
                                        }
                                        ((x) obj2).unknownFields = c1VarA;
                                    }
                                }
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                                i10 = i14;
                                long jA22 = A(iS);
                                g0Var.getClass();
                                nVar3.o(g0.a(jA22, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                i10 = i14;
                                long jA23 = A(iS);
                                g0Var.getClass();
                                nVar3.P(g0.a(jA23, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                i10 = i14;
                                long jA24 = A(iS);
                                g0Var.getClass();
                                a0 a0VarA = g0.a(jA24, obj2);
                                nVar3.s(a0VarA);
                                r0Var.n(iO);
                                a1.j(obj2, iD, a0VarA, c1VarA, d1Var);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 31:
                                i10 = i14;
                                long jA25 = A(iS);
                                g0Var.getClass();
                                nVar3.F(g0.a(jA25, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 32:
                                i10 = i14;
                                long jA26 = A(iS);
                                g0Var.getClass();
                                nVar3.H(g0.a(jA26, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 33:
                                i10 = i14;
                                long jA27 = A(iS);
                                g0Var.getClass();
                                nVar3.J(g0.a(jA27, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 34:
                                i10 = i14;
                                long jA28 = A(iS);
                                g0Var.getClass();
                                nVar3.L(g0.a(jA28, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                                i10 = i14;
                                long jA29 = A(iS);
                                g0Var.getClass();
                                nVar3.q(g0.a(jA29, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 36:
                                i10 = i14;
                                long jA30 = A(iS);
                                g0Var.getClass();
                                nVar3.z(g0.a(jA30, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 37:
                                i10 = i14;
                                long jA31 = A(iS);
                                g0Var.getClass();
                                nVar3.D(g0.a(jA31, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                i10 = i14;
                                long jA32 = A(iS);
                                g0Var.getClass();
                                nVar3.R(g0.a(jA32, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 39:
                                i10 = i14;
                                long jA33 = A(iS);
                                g0Var.getClass();
                                nVar3.B(g0.a(jA33, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 40:
                                i10 = i14;
                                long jA34 = A(iS);
                                g0Var.getClass();
                                nVar3.x(g0.a(jA34, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 41:
                                i10 = i14;
                                long jA35 = A(iS);
                                g0Var.getClass();
                                nVar3.v(g0.a(jA35, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 42:
                                i10 = i14;
                                long jA36 = A(iS);
                                g0Var.getClass();
                                nVar3.k(g0.a(jA36, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                                i10 = i14;
                                long jA37 = A(iS);
                                g0Var.getClass();
                                nVar3.P(g0.a(jA37, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 44:
                                i10 = i14;
                                long jA38 = A(iS);
                                g0Var.getClass();
                                a0 a0VarA2 = g0.a(jA38, obj2);
                                nVar3.s(a0VarA2);
                                r0Var.n(iO);
                                a1.j(obj2, iD, a0VarA2, c1VarA, d1Var);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 45:
                                i10 = i14;
                                long jA39 = A(iS);
                                g0Var.getClass();
                                nVar3.F(g0.a(jA39, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                i10 = i14;
                                long jA40 = A(iS);
                                g0Var.getClass();
                                nVar3.H(g0.a(jA40, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                i10 = i14;
                                long jA41 = A(iS);
                                g0Var.getClass();
                                nVar3.J(g0.a(jA41, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                                i10 = i14;
                                long jA42 = A(iS);
                                g0Var.getClass();
                                nVar3.L(g0.a(jA42, obj2));
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                                i10 = i14;
                                try {
                                    try {
                                        r0Var.H(obj2, A(iS), nVar, r0Var.p(iO), pVar);
                                        nVar3 = nVar;
                                        nVar2 = nVar3;
                                    } catch (c0 unused5) {
                                        r0Var = r0Var;
                                        nVar2 = nVar;
                                        d1Var.getClass();
                                        if (c1VarA == null) {
                                            c1VarA = d1.a(obj2);
                                        }
                                        if (!d1.b(0, nVar2, c1VarA)) {
                                            while (i12 < i13) {
                                                r0Var.m(iArr[i12], obj2, c1VarA);
                                            }
                                            if (c1VarA == null) {
                                                return;
                                            }
                                            ((x) obj2).unknownFields = c1VarA;
                                        }
                                    }
                                } catch (c0 unused6) {
                                    nVar2 = nVar;
                                    r0Var = r0Var;
                                    d1Var.getClass();
                                    if (c1VarA == null) {
                                        c1VarA = d1.a(obj2);
                                    }
                                    if (!d1.b(0, nVar2, c1VarA)) {
                                        while (i12 < i13) {
                                            r0Var.m(iArr[i12], obj2, c1VarA);
                                        }
                                        if (c1VarA == null) {
                                            return;
                                        }
                                        ((x) obj2).unknownFields = c1VarA;
                                    }
                                    r0Var = r0Var;
                                    nVar3 = nVar2;
                                    i14 = i10;
                                    pVar2 = pVar;
                                    break;
                                }
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 50:
                                i10 = i14;
                                r0Var.u(iO, obj2, r0Var.o(iO));
                                throw null;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                                i10 = i14;
                                long jA43 = A(iS);
                                nVar3.T(1);
                                i1.p(obj2, jA43, Double.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).l()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                                i10 = i14;
                                long jA44 = A(iS);
                                nVar3.T(5);
                                i1.p(obj2, jA44, Float.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).p()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                                i10 = i14;
                                long jA45 = A(iS);
                                nVar3.T(0);
                                i1.p(obj2, jA45, Long.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).r()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                                i10 = i14;
                                long jA46 = A(iS);
                                nVar3.T(0);
                                i1.p(obj2, jA46, Long.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).A()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                                i10 = i14;
                                long jA47 = A(iS);
                                nVar3.T(0);
                                i1.p(obj2, jA47, Integer.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).q()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                                i10 = i14;
                                long jA48 = A(iS);
                                nVar3.T(1);
                                i1.p(obj2, jA48, Long.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).o()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                                i10 = i14;
                                long jA49 = A(iS);
                                nVar3.T(5);
                                i1.p(obj2, jA49, Integer.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).n()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                                i10 = i14;
                                long jA50 = A(iS);
                                nVar3.T(0);
                                i1.p(obj2, jA50, Boolean.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).i()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                                i10 = i14;
                                r0Var.J(iS, nVar3, obj2);
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 60:
                                i10 = i14;
                                a aVar3 = (a) r0Var.y(iD, iO, obj2);
                                z0 z0VarP3 = r0Var.p(iO);
                                nVar3.T(2);
                                nVar3.i(aVar3, z0VarP3, pVar2);
                                r0Var.Q(iD, iO, obj2, aVar3);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                                i10 = i14;
                                i1.p(obj2, A(iS), nVar3.m());
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 62:
                                i10 = i14;
                                long jA51 = A(iS);
                                nVar3.T(0);
                                i1.p(obj2, jA51, Integer.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).z()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                                i10 = i14;
                                nVar3.T(0);
                                int iM2 = ((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).m();
                                r0Var.n(iO);
                                i1.p(obj2, A(iS), Integer.valueOf(iM2));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 64:
                                i10 = i14;
                                long jA52 = A(iS);
                                nVar3.T(5);
                                i1.p(obj2, jA52, Integer.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).s()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 65:
                                i10 = i14;
                                long jA53 = A(iS);
                                nVar3.T(1);
                                i1.p(obj2, jA53, Long.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).t()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 66:
                                i10 = i14;
                                long jA54 = A(iS);
                                nVar3.T(0);
                                i1.p(obj2, jA54, Integer.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).u()));
                                r0Var.N(iD, iO, obj2);
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 67:
                                i10 = i14;
                                try {
                                    try {
                                        long jA55 = A(iS);
                                        nVar3.T(0);
                                        i1.p(obj2, jA55, Long.valueOf(((androidx.datastore.preferences.protobuf.m) nVar3.f4137e).v()));
                                        r0Var.N(iD, iO, obj2);
                                        nVar2 = nVar3;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r0Var = r0Var;
                                        while (i11 < i13) {
                                            r0Var.m(iArr[i11], obj2, c1VarA);
                                        }
                                        if (c1VarA != null) {
                                            d1Var.getClass();
                                            ((x) obj2).unknownFields = c1VarA;
                                        }
                                        throw th;
                                    }
                                } catch (c0 unused7) {
                                    nVar2 = nVar3;
                                    d1Var.getClass();
                                    if (c1VarA == null) {
                                        c1VarA = d1.a(obj2);
                                    }
                                    if (!d1.b(0, nVar2, c1VarA)) {
                                        while (i12 < i13) {
                                            r0Var.m(iArr[i12], obj2, c1VarA);
                                        }
                                        if (c1VarA == null) {
                                            return;
                                        }
                                        ((x) obj2).unknownFields = c1VarA;
                                    }
                                }
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            case 68:
                                a aVar4 = (a) r0Var.y(iD, iO, obj2);
                                z0 z0VarP4 = r0Var.p(iO);
                                nVar3.T(3);
                                nVar3.g(aVar4, z0VarP4, pVar2);
                                r0Var.Q(iD, iO, obj2, aVar4);
                                i10 = i14;
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                            default:
                                if (c1VarA == null) {
                                    try {
                                        d1Var.getClass();
                                        c1VarA = d1.a(obj2);
                                    } catch (c0 unused8) {
                                        i10 = i14;
                                        nVar2 = nVar3;
                                        d1Var.getClass();
                                        if (c1VarA == null) {
                                            c1VarA = d1.a(obj2);
                                        }
                                        if (!d1.b(0, nVar2, c1VarA)) {
                                            while (i12 < i13) {
                                                r0Var.m(iArr[i12], obj2, c1VarA);
                                            }
                                            if (c1VarA == null) {
                                                return;
                                            }
                                            ((x) obj2).unknownFields = c1VarA;
                                        }
                                    }
                                }
                                d1Var.getClass();
                                if (!d1.b(0, nVar3, c1VarA)) {
                                    while (i14 < i13) {
                                        r0Var.m(iArr[i14], obj2, c1VarA);
                                        i14++;
                                    }
                                    if (c1VarA == null) {
                                        return;
                                    }
                                }
                                i10 = i14;
                                nVar2 = nVar3;
                                r0Var = r0Var;
                                nVar3 = nVar2;
                                i14 = i10;
                                pVar2 = pVar;
                                break;
                        }
                    } catch (c0 unused9) {
                        i10 = i14;
                    }
                } else if (iD == Integer.MAX_VALUE) {
                    while (i14 < i13) {
                        r0Var.m(iArr[i14], obj2, c1VarA);
                        i14++;
                    }
                    if (c1VarA == null) {
                        return;
                    } else {
                        d1Var.getClass();
                    }
                } else {
                    d1Var.getClass();
                    if (c1VarA == null) {
                        c1VarA = d1.a(obj2);
                    }
                    if (!d1.b(0, nVar3, c1VarA)) {
                        while (i14 < i13) {
                            r0Var.m(iArr[i14], obj2, c1VarA);
                            i14++;
                        }
                        if (c1VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                r0Var = r0Var;
                i10 = i14;
            }
        }
        ((x) obj2).unknownFields = c1VarA;
    }

    public final boolean k(x xVar, x xVar2, int i10) {
        return q(i10, xVar) == q(i10, xVar2);
    }

    public final void m(int i10, Object obj, Object obj2) {
        int i11 = this.f24619a[i10];
        if (i1.f24575c.i(S(i10) & 1048575, obj) == null) {
            return;
        }
        n(i10);
    }

    public final void n(int i10) {
        if (this.f24620b[defpackage.e.e(i10, 3, 2, 1)] != null) {
            throw new ClassCastException();
        }
    }

    public final Object o(int i10) {
        return this.f24620b[(i10 / 3) * 2];
    }

    public final z0 p(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f24620b;
        z0 z0Var = (z0) objArr[i11];
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0VarA = w0.f24646c.a((Class) objArr[i11 + 1]);
        objArr[i11] = z0VarA;
        return z0VarA;
    }

    public final boolean q(int i10, Object obj) {
        int i11 = this.f24619a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iS = S(i10);
            long j11 = iS & 1048575;
            switch (R(iS)) {
                case 0:
                    if (Double.doubleToRawLongBits(i1.f24575c.e(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(i1.f24575c.f(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (i1.f24575c.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (i1.f24575c.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (i1.f24575c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (i1.f24575c.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (i1.f24575c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return i1.f24575c.c(j11, obj);
                case 8:
                    Object objI = i1.f24575c.i(j11, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof i) {
                        return !i.f24569b.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (i1.f24575c.i(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !i.f24569b.equals(i1.f24575c.i(j11, obj));
                case 11:
                    if (i1.f24575c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (i1.f24575c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (i1.f24575c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (i1.f24575c.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (i1.f24575c.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (i1.f24575c.h(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (i1.f24575c.i(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & i1.f24575c.g(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean r(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return q(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final boolean t(int i10, int i11, Object obj) {
        return i1.f24575c.g((long) (this.f24619a[i11 + 2] & 1048575), obj) == i10;
    }

    public final void u(int i10, Object obj, Object obj2) {
        long jS = S(i10) & 1048575;
        Object objI = i1.f24575c.i(jS, obj);
        m0 m0Var = this.f24630m;
        if (objI != null) {
            m0Var.getClass();
            if (!((l0) objI).f24606a) {
                l0 l0VarI = l0.f24605b.i();
                m0.a(l0VarI, objI);
                i1.p(obj, jS, l0VarI);
                objI = l0VarI;
            }
        } else {
            m0Var.getClass();
            objI = l0.f24605b.i();
            i1.p(obj, jS, objI);
        }
        m0Var.getClass();
        defpackage.e.z(obj2);
        throw null;
    }

    public final void v(int i10, Object obj, Object obj2) {
        if (q(i10, obj2)) {
            long jS = S(i10) & 1048575;
            Unsafe unsafe = f24618o;
            Object object = unsafe.getObject(obj2, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f24619a[i10] + " is present but null: " + obj2);
            }
            z0 z0VarP = p(i10);
            if (!q(i10, obj)) {
                if (s(object)) {
                    Object objD = z0VarP.d();
                    z0VarP.a(objD, object);
                    unsafe.putObject(obj, jS, objD);
                } else {
                    unsafe.putObject(obj, jS, object);
                }
                M(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jS);
            if (!s(object2)) {
                Object objD2 = z0VarP.d();
                z0VarP.a(objD2, object2);
                unsafe.putObject(obj, jS, objD2);
                object2 = objD2;
            }
            z0VarP.a(object2, object);
        }
    }

    public final void w(int i10, Object obj, Object obj2) {
        int[] iArr = this.f24619a;
        int i11 = iArr[i10];
        if (t(i11, i10, obj2)) {
            long jS = S(i10) & 1048575;
            Unsafe unsafe = f24618o;
            Object object = unsafe.getObject(obj2, jS);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            z0 z0VarP = p(i10);
            if (!t(i11, i10, obj)) {
                if (s(object)) {
                    Object objD = z0VarP.d();
                    z0VarP.a(objD, object);
                    unsafe.putObject(obj, jS, objD);
                } else {
                    unsafe.putObject(obj, jS, object);
                }
                N(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jS);
            if (!s(object2)) {
                Object objD2 = z0VarP.d();
                z0VarP.a(objD2, object2);
                unsafe.putObject(obj, jS, objD2);
                object2 = objD2;
            }
            z0VarP.a(object2, object);
        }
    }

    public final Object x(int i10, Object obj) {
        z0 z0VarP = p(i10);
        long jS = S(i10) & 1048575;
        if (!q(i10, obj)) {
            return z0VarP.d();
        }
        Object object = f24618o.getObject(obj, jS);
        if (s(object)) {
            return object;
        }
        Object objD = z0VarP.d();
        if (object != null) {
            z0VarP.a(objD, object);
        }
        return objD;
    }

    public final Object y(int i10, int i11, Object obj) {
        z0 z0VarP = p(i11);
        if (!t(i10, i11, obj)) {
            return z0VarP.d();
        }
        Object object = f24618o.getObject(obj, S(i11) & 1048575);
        if (s(object)) {
            return object;
        }
        Object objD = z0VarP.d();
        if (object != null) {
            z0VarP.a(objD, object);
        }
        return objD;
    }
}
