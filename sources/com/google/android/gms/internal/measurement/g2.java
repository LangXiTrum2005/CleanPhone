package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.fs1;
import com.google.android.gms.internal.ads.ur1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements o2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f23490k = new int[0];
    public static final Unsafe l = z2.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f23492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f23495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f23497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f23499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f1 f23500j;

    public g2(int[] iArr, Object[] objArr, int i10, int i11, l0 l0Var, int[] iArr2, int i12, int i13, f1 f1Var, f1 f1Var2) {
        this.f23491a = iArr;
        this.f23492b = objArr;
        this.f23493c = i10;
        this.f23494d = i11;
        this.f23496f = l0Var instanceof i1;
        this.f23497g = iArr2;
        this.f23498h = i12;
        this.f23499i = i13;
        this.f23500j = f1Var;
        this.f23495e = l0Var;
    }

    public static int k(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static boolean l(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof i1) {
            return ((i1) obj).g();
        }
        return true;
    }

    public static void m(Object obj) {
        if (!l(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static int n(long j10, Object obj) {
        return ((Integer) z2.i(j10, obj)).intValue();
    }

    public static long o(long j10, Object obj) {
        return ((Long) z2.i(j10, obj)).longValue();
    }

    public static final int w(byte[] bArr, int i10, int i11, c3 c3Var, Class cls, ur1 ur1Var) throws u1 {
        c3 c3Var2 = c3.f23342c;
        switch (c3Var.ordinal()) {
            case 0:
                int i12 = i10 + 8;
                ur1Var.f20876c = Double.valueOf(Double.longBitsToDouble(mb.m(i10, bArr)));
                return i12;
            case 1:
                int i13 = i10 + 4;
                ur1Var.f20876c = Float.valueOf(Float.intBitsToFloat(mb.k(i10, bArr)));
                return i13;
            case 2:
            case 3:
                int i14 = mb.i(bArr, i10, ur1Var);
                ur1Var.f20876c = Long.valueOf(ur1Var.f20875b);
                return i14;
            case 4:
            case 12:
            case 13:
                int iB = mb.b(bArr, i10, ur1Var);
                ur1Var.f20876c = Integer.valueOf(ur1Var.f20874a);
                return iB;
            case 5:
            case 15:
                int i15 = i10 + 8;
                ur1Var.f20876c = Long.valueOf(mb.m(i10, bArr));
                return i15;
            case 6:
            case 14:
                int i16 = i10 + 4;
                ur1Var.f20876c = Integer.valueOf(mb.k(i10, bArr));
                return i16;
            case 7:
                int i17 = mb.i(bArr, i10, ur1Var);
                ur1Var.f20876c = Boolean.valueOf(ur1Var.f20875b != 0);
                return i17;
            case 8:
                return mb.o(bArr, i10, ur1Var);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                o2 o2VarA = l2.f23690c.a(cls);
                i1 i1VarZza = o2VarA.zza();
                int iQ = mb.q(i1VarZza, o2VarA, bArr, i10, i11, ur1Var);
                o2VarA.a(i1VarZza);
                ur1Var.f20876c = i1VarZza;
                return iQ;
            case 11:
                return mb.p(bArr, i10, ur1Var);
            case 16:
                int iB2 = mb.b(bArr, i10, ur1Var);
                ur1Var.f20876c = Integer.valueOf(fs1.y(ur1Var.f20874a));
                return iB2;
            case 17:
                int i18 = mb.i(bArr, i10, ur1Var);
                ur1Var.f20876c = Long.valueOf(fs1.z(ur1Var.f20875b));
                return i18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x035d  */
    /* JADX WARN: Code duplicated, block: B:188:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:189:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:193:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:196:0x03da  */
    public static g2 y(n2 n2Var, f1 f1Var, f1 f1Var2) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        int i19;
        char cCharAt2;
        int i20;
        char cCharAt3;
        int i21;
        char cCharAt4;
        int i22;
        char cCharAt5;
        int i23;
        char cCharAt6;
        int i24;
        char cCharAt7;
        Object[] objArr;
        int i25;
        int i26;
        int i27;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i28;
        int i29;
        int i30;
        Field fieldZ;
        int i31;
        int i32;
        char cCharAt8;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        Field fieldZ2;
        Field fieldZ3;
        int i40;
        char cCharAt9;
        int i41;
        int i42;
        char cCharAt10;
        int i43;
        int i44;
        char cCharAt11;
        int i45;
        char cCharAt12;
        if (!(n2Var instanceof n2)) {
            n2Var.getClass();
            throw new ClassCastException();
        }
        String str = n2Var.f23762b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i46 = 1;
            while (true) {
                i10 = i46 + 1;
                if (str.charAt(i46) < 55296) {
                    break;
                }
                i46 = i10;
            }
        } else {
            i10 = 1;
        }
        int i47 = i10 + 1;
        int iCharAt2 = str.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i48 = iCharAt2 & 8191;
            int i49 = 13;
            while (true) {
                i45 = i47 + 1;
                cCharAt12 = str.charAt(i47);
                if (cCharAt12 < 55296) {
                    break;
                }
                i48 |= (cCharAt12 & 8191) << i49;
                i49 += 13;
                i47 = i45;
            }
            iCharAt2 = i48 | (cCharAt12 << i49);
            i47 = i45;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i15 = 0;
            iCharAt = 0;
            i11 = 0;
            i14 = 0;
            i16 = 0;
            iArr = f23490k;
            i13 = 0;
        } else {
            int i50 = i47 + 1;
            int iCharAt3 = str.charAt(i47);
            if (iCharAt3 >= 55296) {
                int i51 = iCharAt3 & 8191;
                int i52 = 13;
                while (true) {
                    i24 = i50 + 1;
                    cCharAt7 = str.charAt(i50);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i24;
                }
                iCharAt3 = i51 | (cCharAt7 << i52);
                i50 = i24;
            }
            int i53 = i50 + 1;
            int iCharAt4 = str.charAt(i50);
            if (iCharAt4 >= 55296) {
                int i54 = iCharAt4 & 8191;
                int i55 = 13;
                while (true) {
                    i23 = i53 + 1;
                    cCharAt6 = str.charAt(i53);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i23;
                }
                iCharAt4 = i54 | (cCharAt6 << i55);
                i53 = i23;
            }
            int i56 = i53 + 1;
            int iCharAt5 = str.charAt(i53);
            if (iCharAt5 >= 55296) {
                int i57 = iCharAt5 & 8191;
                int i58 = 13;
                while (true) {
                    i22 = i56 + 1;
                    cCharAt5 = str.charAt(i56);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i22;
                }
                iCharAt5 = i57 | (cCharAt5 << i58);
                i56 = i22;
            }
            int i59 = i56 + 1;
            int iCharAt6 = str.charAt(i56);
            if (iCharAt6 >= 55296) {
                int i60 = iCharAt6 & 8191;
                int i61 = 13;
                while (true) {
                    i21 = i59 + 1;
                    cCharAt4 = str.charAt(i59);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i21;
                }
                iCharAt6 = i60 | (cCharAt4 << i61);
                i59 = i21;
            }
            int i62 = i59 + 1;
            iCharAt = str.charAt(i59);
            if (iCharAt >= 55296) {
                int i63 = iCharAt & 8191;
                int i64 = 13;
                while (true) {
                    i20 = i62 + 1;
                    cCharAt3 = str.charAt(i62);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt3 & 8191) << i64;
                    i64 += 13;
                    i62 = i20;
                }
                iCharAt = i63 | (cCharAt3 << i64);
                i62 = i20;
            }
            int i65 = i62 + 1;
            int iCharAt7 = str.charAt(i62);
            if (iCharAt7 >= 55296) {
                int i66 = iCharAt7 & 8191;
                int i67 = 13;
                while (true) {
                    i19 = i65 + 1;
                    cCharAt2 = str.charAt(i65);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt2 & 8191) << i67;
                    i67 += 13;
                    i65 = i19;
                }
                iCharAt7 = i66 | (cCharAt2 << i67);
                i65 = i19;
            }
            int i68 = i65 + 1;
            if (str.charAt(i65) >= 55296) {
                while (true) {
                    i18 = i68 + 1;
                    if (str.charAt(i68) < 55296) {
                        break;
                    }
                    i68 = i18;
                }
                i68 = i18;
            }
            int i69 = i68 + 1;
            int iCharAt8 = str.charAt(i68);
            if (iCharAt8 >= 55296) {
                int i70 = iCharAt8 & 8191;
                int i71 = 13;
                while (true) {
                    i17 = i69 + 1;
                    cCharAt = str.charAt(i69);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i70 |= (cCharAt & 8191) << i71;
                    i71 += 13;
                    i69 = i17;
                }
                iCharAt8 = i70 | (cCharAt << i71);
                i69 = i17;
            }
            int i72 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            int i73 = iCharAt7;
            i11 = iCharAt5;
            i12 = i73;
            iArr = iArr2;
            i13 = iCharAt3;
            i47 = i69;
            i14 = iCharAt6;
            i15 = i72;
            i16 = iCharAt8;
        }
        Unsafe unsafe = l;
        Object[] objArr2 = n2Var.f23763c;
        Class<?> cls = n2Var.f23761a.getClass();
        int i74 = i16 + i12;
        int i75 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i75];
        int i76 = i74;
        int i77 = i16;
        int i78 = 0;
        int i79 = 0;
        while (i47 < length) {
            int i80 = i47 + 1;
            int iCharAt9 = str.charAt(i47);
            int i81 = length;
            if (iCharAt9 >= 55296) {
                int i82 = iCharAt9 & 8191;
                int i83 = i80;
                int i84 = 13;
                while (true) {
                    i44 = i83 + 1;
                    cCharAt11 = str.charAt(i83);
                    objArr = objArr2;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i82 |= (cCharAt11 & 8191) << i84;
                    i84 += 13;
                    i83 = i44;
                    objArr2 = objArr;
                }
                iCharAt9 = i82 | (cCharAt11 << i84);
                i25 = i44;
            } else {
                objArr = objArr2;
                i25 = i80;
            }
            int i85 = i25 + 1;
            int iCharAt10 = str.charAt(i25);
            if (iCharAt10 >= 55296) {
                int i86 = iCharAt10 & 8191;
                int i87 = i85;
                int i88 = 13;
                while (true) {
                    i42 = i87 + 1;
                    cCharAt10 = str.charAt(i87);
                    i43 = i86;
                    if (cCharAt10 < 55296) {
                        break;
                    }
                    i86 = i43 | ((cCharAt10 & 8191) << i88);
                    i88 += 13;
                    i87 = i42;
                }
                iCharAt10 = i43 | (cCharAt10 << i88);
                i26 = i42;
            } else {
                i26 = i85;
            }
            int i89 = iCharAt9;
            if ((iCharAt10 & 1024) != 0) {
                iArr[i79] = i78;
                i79++;
            }
            int i90 = iCharAt10 & 255;
            Object[] objArr4 = objArr3;
            int i91 = iCharAt10 & com.ironsource.mediationsdk.metadata.a.f29616n;
            if (i90 >= 51) {
                int i92 = i26 + 1;
                int iCharAt11 = str.charAt(i26);
                if (iCharAt11 >= 55296) {
                    int i93 = iCharAt11 & 8191;
                    int i94 = i92;
                    int i95 = 13;
                    while (true) {
                        i40 = i94 + 1;
                        cCharAt9 = str.charAt(i94);
                        i41 = i93;
                        if (cCharAt9 < 55296) {
                            break;
                        }
                        i93 = i41 | ((cCharAt9 & 8191) << i95);
                        i95 += 13;
                        i94 = i40;
                    }
                    iCharAt11 = i41 | (cCharAt9 << i95);
                    i38 = i40;
                } else {
                    i38 = i92;
                }
                int i96 = iCharAt11;
                int i97 = i90 - 51;
                i28 = i38;
                if (i97 == 9 || i97 == 17) {
                    objArr4[com.applovin.impl.ca.f(i78, 3, 1)] = objArr[i15];
                    i39 = i91;
                    i15++;
                } else if (i97 != 12) {
                    i39 = i91;
                } else if (n2Var.a() == 1 || i91 != 0) {
                    objArr4[com.applovin.impl.ca.f(i78, 3, 1)] = objArr[i15];
                    i15++;
                    i39 = i91;
                } else {
                    i39 = 0;
                }
                int i98 = i96 + i96;
                Object obj = objArr[i98];
                int i99 = i39;
                if (obj instanceof Field) {
                    fieldZ2 = (Field) obj;
                } else {
                    fieldZ2 = z(cls, (String) obj);
                    objArr[i98] = fieldZ2;
                    iArr[i76] = i78;
                    i76++;
                }
                i27 = i13;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZ2);
                int i100 = i98 + 1;
                Object obj2 = objArr[i100];
                if (obj2 instanceof Field) {
                    fieldZ3 = (Field) obj2;
                } else {
                    fieldZ3 = z(cls, (String) obj2);
                    objArr[i100] = fieldZ3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ3);
                i74 = i74;
                i29 = iObjectFieldOffset3;
                i30 = i99;
            } else {
                i27 = i13;
                int i101 = i15 + 1;
                Field fieldZ4 = z(cls, (String) objArr[i15]);
                if (i90 == 9 || i90 == 17) {
                    objArr4[com.applovin.impl.ca.f(i78, 3, 1)] = fieldZ4.getType();
                } else {
                    if (i90 != 27) {
                        if (i90 == 49) {
                            i15 += 2;
                            i33 = 3;
                            i34 = 1;
                        } else if (i90 == 12 || i90 == 30 || i90 == 44) {
                            i74 = i74;
                            if (n2Var.a() == 1 || i91 != 0) {
                                i15 += 2;
                                objArr4[com.applovin.impl.ca.f(i78, 3, 1)] = objArr[i101];
                            } else {
                                i15 = i101;
                                i91 = 0;
                            }
                        } else if (i90 == 50) {
                            int i102 = i15 + 2;
                            i77++;
                            iArr[i77] = i78;
                            int i103 = i78 / 3;
                            int i104 = i103 + i103;
                            objArr4[i104] = objArr[i101];
                            if (i91 != 0) {
                                i15 += 3;
                                objArr4[i104 + 1] = objArr[i102];
                            } else {
                                i15 = i102;
                                i91 = 0;
                            }
                            i74 = i74;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i90 > 17) {
                            i28 = i26;
                            i29 = iObjectFieldOffset;
                            i30 = i91;
                        } else {
                            int i105 = i26 + 1;
                            int iCharAt12 = str.charAt(i26);
                            if (iCharAt12 >= 55296) {
                                int i106 = iCharAt12 & 8191;
                                int i107 = 13;
                                while (true) {
                                    i32 = i105 + 1;
                                    cCharAt8 = str.charAt(i105);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i106 |= (cCharAt8 & 8191) << i107;
                                    i107 += 13;
                                    i105 = i32;
                                }
                                iCharAt12 = i106 | (cCharAt8 << i107);
                                i105 = i32;
                            }
                            int i108 = (iCharAt12 / 32) + i27 + i27;
                            Object obj3 = objArr[i108];
                            str = str;
                            if (obj3 instanceof Field) {
                                fieldZ = (Field) obj3;
                            } else {
                                fieldZ = z(cls, (String) obj3);
                                objArr[i108] = fieldZ;
                            }
                            i90 = i90;
                            i31 = iCharAt12 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZ);
                            i29 = iObjectFieldOffset;
                            i28 = i105;
                            i30 = i91;
                        }
                        int i109 = i78 + 1;
                        iArr3[i78] = i89;
                        int i110 = i78 + 2;
                        int i111 = i90;
                        if ((iCharAt10 & 512) != 0) {
                            i35 = 536870912;
                        } else {
                            i35 = 0;
                        }
                        if ((iCharAt10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                            i36 = 268435456;
                        } else {
                            i36 = 0;
                        }
                        if (i30 != 0) {
                            i37 = Integer.MIN_VALUE;
                        } else {
                            i37 = 0;
                        }
                        iArr3[i109] = i35 | i36 | i37 | (i111 << 20) | i29;
                        i78 += 3;
                        iArr3[i110] = (i31 << 20) | iObjectFieldOffset2;
                        length = i81;
                        objArr3 = objArr4;
                        objArr2 = objArr;
                        i74 = i74;
                        str = str;
                        i47 = i28;
                        i13 = i27;
                    } else {
                        i33 = 3;
                        i34 = 1;
                        i15 += 2;
                    }
                    objArr4[com.applovin.impl.ca.f(i78, i33, i34)] = objArr[i101];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                    }
                    i28 = i26;
                    i29 = iObjectFieldOffset;
                    i30 = i91;
                }
                i15 = i101;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZ4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                }
                i28 = i26;
                i29 = iObjectFieldOffset;
                i30 = i91;
            }
            i31 = 0;
            int i1010 = i78 + 1;
            iArr3[i78] = i89;
            int i112 = i78 + 2;
            int i113 = i90;
            if ((iCharAt10 & 512) != 0) {
                i35 = 536870912;
            } else {
                i35 = 0;
            }
            if ((iCharAt10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                i36 = 268435456;
            } else {
                i36 = 0;
            }
            if (i30 != 0) {
                i37 = Integer.MIN_VALUE;
            } else {
                i37 = 0;
            }
            iArr3[i1010] = i35 | i36 | i37 | (i113 << 20) | i29;
            i78 += 3;
            iArr3[i112] = (i31 << 20) | iObjectFieldOffset2;
            length = i81;
            objArr3 = objArr4;
            objArr2 = objArr;
            i74 = i74;
            str = str;
            i47 = i28;
            i13 = i27;
        }
        return new g2(iArr3, objArr3, i11, i14, n2Var.f23761a, iArr, i16, i74, f1Var, f1Var2);
    }

    public static Field z(Class cls, String str) {
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
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            d5.u.r(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(defpackage.e.q(" not found. Known fields are ", string, sb2), e10);
        }
    }

    public final void A(int i10, Object obj, Object obj2) {
        if (r(i10, obj2)) {
            int iJ = j(i10) & 1048575;
            Unsafe unsafe = l;
            long j10 = iJ;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i11 = this.f23491a[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.e(i11, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i11);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            o2 o2VarC = C(i10);
            if (!r(i10, obj)) {
                if (l(object)) {
                    i1 i1VarZza = o2VarC.zza();
                    o2VarC.b(i1VarZza, object);
                    unsafe.putObject(obj, j10, i1VarZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!l(object2)) {
                i1 i1VarZza2 = o2VarC.zza();
                o2VarC.b(i1VarZza2, object2);
                unsafe.putObject(obj, j10, i1VarZza2);
                object2 = i1VarZza2;
            }
            o2VarC.b(object2, object);
        }
    }

    public final void B(int i10, Object obj, Object obj2) {
        int[] iArr = this.f23491a;
        int i11 = iArr[i10];
        if (t(i11, i10, obj2)) {
            int iJ = j(i10) & 1048575;
            Unsafe unsafe = l;
            long j10 = iJ;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.e(i12, 38) + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            o2 o2VarC = C(i10);
            if (!t(i11, i10, obj)) {
                if (l(object)) {
                    i1 i1VarZza = o2VarC.zza();
                    o2VarC.b(i1VarZza, object);
                    unsafe.putObject(obj, j10, i1VarZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                u(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!l(object2)) {
                i1 i1VarZza2 = o2VarC.zza();
                o2VarC.b(i1VarZza2, object2);
                unsafe.putObject(obj, j10, i1VarZza2);
                object2 = i1VarZza2;
            }
            o2VarC.b(object2, object);
        }
    }

    public final o2 C(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f23492b;
        o2 o2Var = (o2) objArr[i12];
        if (o2Var != null) {
            return o2Var;
        }
        o2 o2VarA = l2.f23690c.a((Class) objArr[i12 + 1]);
        objArr[i12] = o2VarA;
        return o2VarA;
    }

    public final Object D(int i10) {
        int i11 = i10 / 3;
        return this.f23492b[i11 + i11];
    }

    public final l1 E(int i10) {
        int i11 = i10 / 3;
        return (l1) this.f23492b[i11 + i11 + 1];
    }

    public final Object F(int i10, Object obj) {
        o2 o2VarC = C(i10);
        int iJ = j(i10) & 1048575;
        if (!r(i10, obj)) {
            return o2VarC.zza();
        }
        Object object = l.getObject(obj, iJ);
        if (l(object)) {
            return object;
        }
        i1 i1VarZza = o2VarC.zza();
        if (object != null) {
            o2VarC.b(i1VarZza, object);
        }
        return i1VarZza;
    }

    public final void G(int i10, Object obj, Object obj2) {
        l.putObject(obj, j(i10) & 1048575, obj2);
        s(i10, obj);
    }

    public final Object H(int i10, int i11, Object obj) {
        o2 o2VarC = C(i11);
        if (!t(i10, i11, obj)) {
            return o2VarC.zza();
        }
        Object object = l.getObject(obj, j(i11) & 1048575);
        if (l(object)) {
            return object;
        }
        i1 i1VarZza = o2VarC.zza();
        if (object != null) {
            o2VarC.b(i1VarZza, object);
        }
        return i1VarZza;
    }

    public final void I(int i10, int i11, Object obj, Object obj2) {
        l.putObject(obj, j(i11) & 1048575, obj2);
        u(i10, i11, obj);
    }

    public final Object J(Object obj, int i10, Object obj2, f1 f1Var, Object obj3) {
        l1 l1VarE;
        int i11 = this.f23491a[i10];
        Object objI = z2.i(j(i10) & 1048575, obj);
        if (objI == null || (l1VarE = E(i10)) == null) {
            return obj2;
        }
        g9.k kVar = ((z1) D(i10)).f24191a;
        Iterator it = ((a2) objI).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!l1VarE.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    f1Var.getClass();
                    obj2 = f1.f(obj3);
                }
                int iB = z1.b(kVar, entry.getKey(), entry.getValue());
                r0 r0Var = s0.f23949b;
                byte[] bArr = new byte[iB];
                boolean z10 = x0.f24137d;
                v0 v0Var = new v0(bArr, iB);
                try {
                    z1.a(v0Var, kVar, entry.getKey(), entry.getValue());
                    if (v0Var.L() > 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    if (v0Var.L() < 0) {
                        throw new IllegalStateException("Wrote more data than expected.");
                    }
                    r0 r0Var2 = new r0(bArr);
                    f1Var.getClass();
                    ((u2) obj2).d((i11 << 3) | 2, r0Var2);
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    public final void K(int i10, androidx.datastore.preferences.protobuf.n nVar, Object obj) {
        fs1 fs1Var = (fs1) nVar.f4137e;
        long j10 = i10 & 1048575;
        if ((536870912 & i10) != 0) {
            nVar.F0(2);
            z2.j(obj, j10, fs1Var.M());
        } else if (!this.f23496f) {
            z2.j(obj, j10, nVar.U0());
        } else {
            nVar.F0(2);
            z2.j(obj, j10, fs1Var.L());
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.o2
    public final void a(Object obj) {
        if (!l(obj)) {
            return;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            i1Var.m();
            i1Var.zza = 0;
            i1Var.h();
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f23491a;
            if (i10 >= iArr.length) {
                this.f23500j.getClass();
                u2 u2Var = ((i1) obj).zzc;
                if (u2Var.f24018e) {
                    u2Var.f24018e = false;
                    return;
                }
                return;
            }
            int iJ = j(i10);
            int i11 = 1048575 & iJ;
            int iK = k(iJ);
            long j10 = i11;
            if (iK != 9) {
                if (iK != 60 && iK != 68) {
                    switch (iK) {
                        case 17:
                            if (r(i10, obj)) {
                                C(i10).a(l.getObject(obj, j10));
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
                            m0 m0Var = (m0) ((s1) z2.i(j10, obj));
                            if (m0Var.f23719a) {
                                m0Var.f23719a = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = l;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((a2) object).f23291a = false;
                                unsafe.putObject(obj, j10, object);
                            }
                            break;
                    }
                } else if (t(iArr[i10], i10, obj)) {
                    C(i10).a(l.getObject(obj, j10));
                }
            } else if (r(i10, obj)) {
                C(i10).a(l.getObject(obj, j10));
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // com.google.android.gms.internal.measurement.o2
    public final void b(Object obj, Object obj2) {
        Object obj3;
        m(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f23491a;
            if (i10 >= iArr.length) {
                p2.b(obj, obj2);
                return;
            }
            int iJ = j(i10);
            int i11 = 1048575 & iJ;
            int iK = k(iJ);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iK) {
                case 0:
                    if (!r(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        y2 y2Var = z2.f24194c;
                        obj3 = obj;
                        y2Var.l(obj3, j10, y2Var.k(j10, obj2));
                        s(i10, obj3);
                    }
                    break;
                case 1:
                    if (r(i10, obj2)) {
                        y2 y2Var2 = z2.f24194c;
                        y2Var2.j(obj, j10, y2Var2.h(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (r(i10, obj2)) {
                        z2.h(obj, j10, z2.g(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (r(i10, obj2)) {
                        z2.h(obj, j10, z2.g(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (r(i10, obj2)) {
                        z2.f(z2.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (r(i10, obj2)) {
                        z2.h(obj, j10, z2.g(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (r(i10, obj2)) {
                        z2.f(z2.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (r(i10, obj2)) {
                        y2 y2Var3 = z2.f24194c;
                        y2Var3.g(obj, j10, y2Var3.d(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (r(i10, obj2)) {
                        z2.j(obj, j10, z2.i(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    A(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (r(i10, obj2)) {
                        z2.j(obj, j10, z2.i(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (r(i10, obj2)) {
                        z2.f(z2.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (r(i10, obj2)) {
                        z2.f(z2.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (r(i10, obj2)) {
                        z2.f(z2.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (r(i10, obj2)) {
                        z2.h(obj, j10, z2.g(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (r(i10, obj2)) {
                        z2.f(z2.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (r(i10, obj2)) {
                        z2.h(obj, j10, z2.g(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    A(i10, obj, obj2);
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
                    s1 s1VarG = (s1) z2.i(j10, obj);
                    s1 s1Var = (s1) z2.i(j10, obj2);
                    int size = s1VarG.size();
                    int size2 = s1Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((m0) s1VarG).f23719a) {
                            s1VarG = s1VarG.g(size2 + size);
                        }
                        s1VarG.addAll(s1Var);
                    }
                    if (size > 0) {
                        s1Var = s1VarG;
                    }
                    z2.j(obj, j10, s1Var);
                    obj3 = obj;
                    break;
                case 50:
                    f1 f1Var = p2.f23833a;
                    z2.j(obj, j10, f1.e(z2.i(j10, obj), z2.i(j10, obj2)));
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
                    if (t(i12, i10, obj2)) {
                        z2.j(obj, j10, z2.i(j10, obj2));
                        u(i12, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    B(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                case 62:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (t(i12, i10, obj2)) {
                        z2.j(obj, j10, z2.i(j10, obj2));
                        u(i12, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    B(i10, obj, obj2);
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

    @Override // com.google.android.gms.internal.measurement.o2
    public final boolean c(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i12 < this.f23498h) {
            int i15 = this.f23497g[i12];
            int iJ = this.j(i15);
            int[] iArr = this.f23491a;
            int i16 = iArr[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i14) {
                if (i17 != 1048575) {
                    i13 = l.getInt(obj, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i14;
                i11 = i13;
            }
            g2 g2Var = this;
            Object obj2 = obj;
            if ((268435456 & iJ) == 0 || g2Var.q(obj2, i15, i10, i11, i18)) {
                int iK = k(iJ);
                if (iK != 9 && iK != 17) {
                    if (iK != 27) {
                        if (iK == 60 || iK == 68) {
                            if (!g2Var.t(iArr[i15], i15, obj2) || g2Var.C(i15).c(z2.i(iJ & 1048575, obj2))) {
                                i12++;
                                this = g2Var;
                                obj = obj2;
                                i14 = i10;
                                i13 = i11;
                            }
                        } else if (iK != 49) {
                            if (iK != 50) {
                                continue;
                            } else {
                                a2 a2Var = (a2) z2.i(iJ & 1048575, obj2);
                                if (!a2Var.isEmpty() && ((c3) ((z1) g2Var.D(i15)).f24191a.f41771c).f23346a == d3.f23379i) {
                                    o2 o2VarA = null;
                                    for (Object obj3 : a2Var.values()) {
                                        if (o2VarA == null) {
                                            o2VarA = l2.f23690c.a(obj3.getClass());
                                        }
                                        if (!o2VarA.c(obj3)) {
                                        }
                                    }
                                }
                            }
                            i12++;
                            this = g2Var;
                            obj = obj2;
                            i14 = i10;
                            i13 = i11;
                        }
                    }
                    List list = (List) z2.i(iJ & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        o2 o2VarC = g2Var.C(i15);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (o2VarC.c(list.get(i19))) {
                            }
                        }
                    }
                    i12++;
                    this = g2Var;
                    obj = obj2;
                    i14 = i10;
                    i13 = i11;
                } else if (!g2Var.q(obj2, i15, i10, i11, i18) || g2Var.C(i15).c(z2.i(iJ & 1048575, obj2))) {
                    i12++;
                    this = g2Var;
                    obj = obj2;
                    i14 = i10;
                    i13 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void d(Object obj, q6 q6Var) {
        int i10;
        x0 x0Var = (x0) q6Var.f23891b;
        Unsafe unsafe = l;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f23491a;
            if (i13 >= iArr.length) {
                ((i1) obj).zzc.b(q6Var);
                return;
            }
            int iJ = j(i13);
            int iK = k(iJ);
            int i15 = iArr[i13];
            if (iK <= 17) {
                int i16 = iArr[i13 + 2];
                int i17 = i16 & i11;
                if (i17 != i12) {
                    i14 = i17 == i11 ? 0 : unsafe.getInt(obj, i17);
                    i12 = i17;
                }
                i10 = 1 << (i16 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iJ & i11;
            switch (iK) {
                case 0:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.w(i15, Double.doubleToRawLongBits(z2.f24194c.k(j10, obj)));
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 1:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.u(i15, Float.floatToRawIntBits(z2.f24194c.h(j10, obj)));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 2:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.v(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 3:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.v(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 4:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.s(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 5:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.w(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 6:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.u(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 7:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.x(i15, z2.f24194c.d(j10, obj));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 8:
                    if (q(obj, i13, i12, i14, i10)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            x0Var.y(i15, (String) object);
                        } else {
                            x0Var.z(i15, (s0) object);
                        }
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 9:
                    if (q(obj, i13, i12, i14, i10)) {
                        q6Var.e(i15, unsafe.getObject(obj, j10), C(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 10:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.z(i15, (s0) unsafe.getObject(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 11:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.t(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 12:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.s(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 13:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.u(i15, unsafe.getInt(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 14:
                    if (q(obj, i13, i12, i14, i10)) {
                        x0Var.w(i15, unsafe.getLong(obj, j10));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 15:
                    if (q(obj, i13, i12, i14, i10)) {
                        int i18 = unsafe.getInt(obj, j10);
                        x0Var.t(i15, (i18 >> 31) ^ (i18 + i18));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 16:
                    if (q(obj, i13, i12, i14, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        x0Var.v(i15, (j11 >> 63) ^ (j11 + j11));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 17:
                    if (q(obj, i13, i12, i14, i10)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        x0Var.r(i15, 3);
                        C(i13).d((l0) object2, q6Var);
                        x0Var.r(i15, 4);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 18:
                    p2.d(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 19:
                    p2.e(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 20:
                    p2.f(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 21:
                    p2.g(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 22:
                    p2.k(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 23:
                    p2.i(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 24:
                    p2.n(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 25:
                    p2.q(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    int i19 = iArr[i13];
                    List list = (List) unsafe.getObject(obj, j10);
                    f1 f1Var = p2.f23833a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof w1) {
                            w1 w1Var = (w1) list;
                            for (int i20 = 0; i20 < list.size(); i20++) {
                                Object objZzc = w1Var.zzc();
                                if (objZzc instanceof String) {
                                    x0Var.y(i19, (String) objZzc);
                                } else {
                                    x0Var.z(i19, (s0) objZzc);
                                }
                            }
                        } else {
                            for (int i21 = 0; i21 < list.size(); i21++) {
                                x0Var.y(i19, (String) list.get(i21));
                            }
                        }
                    }
                    break;
                case 27:
                    int i22 = iArr[i13];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    o2 o2VarC = C(i13);
                    f1 f1Var2 = p2.f23833a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i23 = 0; i23 < list2.size(); i23++) {
                            q6Var.e(i22, list2.get(i23), o2VarC);
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    int i24 = iArr[i13];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    f1 f1Var3 = p2.f23833a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i25 = 0; i25 < list3.size(); i25++) {
                            x0Var.z(i24, (s0) list3.get(i25));
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    p2.l(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    p2.p(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 31:
                    p2.o(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 32:
                    p2.j(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 33:
                    p2.m(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case 34:
                    p2.h(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, false);
                    continue;
                    i13 += 3;
                    i11 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    p2.d(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case 36:
                    p2.e(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case 37:
                    p2.f(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    p2.g(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case 39:
                    p2.k(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case 40:
                    p2.i(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case 41:
                    p2.n(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case 42:
                    p2.q(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    p2.l(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case 44:
                    p2.p(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case 45:
                    p2.o(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    p2.j(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    p2.m(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    p2.h(iArr[i13], (List) unsafe.getObject(obj, j10), q6Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    int i26 = iArr[i13];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    o2 o2VarC2 = C(i13);
                    f1 f1Var4 = p2.f23833a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i27 = 0; i27 < list4.size(); i27++) {
                            l0 l0Var = (l0) list4.get(i27);
                            x0Var.r(i26, 3);
                            o2VarC2.d(l0Var, q6Var);
                            x0Var.r(i26, 4);
                        }
                    }
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j10);
                    if (object3 != null) {
                        g9.k kVar = ((z1) D(i13)).f24191a;
                        for (Map.Entry entry : ((a2) object3).entrySet()) {
                            x0Var.r(i15, 2);
                            x0Var.F(z1.b(kVar, entry.getKey(), entry.getValue()));
                            z1.a(x0Var, kVar, entry.getKey(), entry.getValue());
                        }
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.w(i15, Double.doubleToRawLongBits(((Double) z2.i(j10, obj)).doubleValue()));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.u(i15, Float.floatToRawIntBits(((Float) z2.i(j10, obj)).floatValue()));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.v(i15, o(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.v(i15, o(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.s(i15, n(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.w(i15, o(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.u(i15, n(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.x(i15, ((Boolean) z2.i(j10, obj)).booleanValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (t(i15, i13, obj)) {
                        Object object4 = unsafe.getObject(obj, j10);
                        if (object4 instanceof String) {
                            x0Var.y(i15, (String) object4);
                        } else {
                            x0Var.z(i15, (s0) object4);
                        }
                    }
                    break;
                case 60:
                    if (t(i15, i13, obj)) {
                        q6Var.e(i15, unsafe.getObject(obj, j10), C(i13));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.z(i15, (s0) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (t(i15, i13, obj)) {
                        x0Var.t(i15, n(j10, obj));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (t(i15, i13, obj)) {
                        x0Var.s(i15, n(j10, obj));
                    }
                    break;
                case 64:
                    if (t(i15, i13, obj)) {
                        x0Var.u(i15, n(j10, obj));
                    }
                    break;
                case 65:
                    if (t(i15, i13, obj)) {
                        x0Var.w(i15, o(j10, obj));
                    }
                    break;
                case 66:
                    if (t(i15, i13, obj)) {
                        int iN = n(j10, obj);
                        x0Var.t(i15, (iN >> 31) ^ (iN + iN));
                    }
                    break;
                case 67:
                    if (t(i15, i13, obj)) {
                        long jO = o(j10, obj);
                        x0Var.v(i15, (jO >> 63) ^ (jO + jO));
                    }
                    break;
                case 68:
                    if (t(i15, i13, obj)) {
                        Object object5 = unsafe.getObject(obj, j10);
                        x0Var.r(i15, 3);
                        C(i13).d((l0) object5, q6Var);
                        x0Var.r(i15, 4);
                    }
                    break;
            }
            i13 += 3;
            i11 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:207:0x07c2 A[LOOP:3: B:206:0x07c0->B:207:0x07c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:217:0x07ef A[LOOP:1: B:216:0x07ed->B:217:0x07ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x0800  */
    /* JADX WARN: Code duplicated, block: B:226:0x07ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x07bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.o2
    public final void e(Object obj, androidx.datastore.preferences.protobuf.n nVar, z0 z0Var) throws Throwable {
        Object obj2;
        Object objJ;
        Object objJ2;
        g2 g2Var;
        f1 f1Var;
        Object obj3;
        g2 g2Var2;
        Object objF;
        Object obj4;
        g2 g2Var3 = this;
        fs1 fs1Var = (fs1) nVar.f4137e;
        int[] iArr = g2Var3.f23497g;
        int i10 = g2Var3.f23499i;
        int i11 = g2Var3.f23498h;
        z0Var.getClass();
        m(obj);
        f1 f1Var2 = g2Var3.f23500j;
        Object objF2 = null;
        while (true) {
            try {
                int iR0 = nVar.R0();
                int iV = (iR0 < g2Var3.f23493c || iR0 > g2Var3.f23494d) ? -1 : g2Var3.v(iR0, 0);
                if (iV >= 0) {
                    int iJ = g2Var3.j(iV);
                    try {
                        try {
                            switch (k(iJ)) {
                                case 0:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2 g2Var4 = g2Var3;
                                    int i12 = iJ & 1048575;
                                    try {
                                        nVar.F0(1);
                                        g2Var = g2Var4;
                                        z2.f24194c.l(obj, i12, fs1Var.D());
                                        g2Var.s(iV, obj);
                                        g2Var3 = g2Var;
                                        f1Var2 = f1Var;
                                        objF2 = obj2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        f1Var2 = f1Var;
                                        objF2 = obj2;
                                        objJ = objF2;
                                        while (i11 < i10) {
                                            objJ = J(obj, iArr[i11], objJ, f1Var2, obj);
                                            i11++;
                                        }
                                        if (objJ != null) {
                                            f1Var2.getClass();
                                            ((i1) obj).zzc = (u2) objJ;
                                        }
                                        throw th;
                                    }
                                    break;
                                case 1:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(5);
                                    z2.f24194c.j(obj, iJ & 1048575, fs1Var.E());
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 2:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(0);
                                    z2.h(obj, iJ & 1048575, fs1Var.G());
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 3:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(0);
                                    z2.h(obj, iJ & 1048575, fs1Var.F());
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 4:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(0);
                                    z2.f(fs1Var.H(), iJ & 1048575, obj);
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 5:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(1);
                                    z2.h(obj, iJ & 1048575, fs1Var.I());
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 6:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(5);
                                    z2.f(fs1Var.J(), iJ & 1048575, obj);
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 7:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(0);
                                    z2.f24194c.g(obj, iJ & 1048575, fs1Var.K());
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 8:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    g2Var2.K(iJ, nVar, obj);
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 9:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    l0 l0Var = (l0) g2Var2.F(iV, obj);
                                    o2 o2VarC = g2Var2.C(iV);
                                    nVar.F0(2);
                                    nVar.H0(l0Var, o2VarC, z0Var);
                                    g2Var2.G(iV, obj, l0Var);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 10:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    z2.j(obj, iJ & 1048575, nVar.U0());
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 11:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(0);
                                    z2.f(fs1Var.R(), iJ & 1048575, obj);
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 12:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(0);
                                    int iS = fs1Var.S();
                                    l1 l1VarE = g2Var2.E(iV);
                                    if (l1VarE != null && !l1VarE.a(iS)) {
                                        f1 f1Var3 = p2.f23833a;
                                        if (obj2 == null) {
                                            f1Var.getClass();
                                            objF = f1.f(obj);
                                        } else {
                                            objF = obj2;
                                        }
                                        f1Var.getClass();
                                        ((u2) objF).d(iR0 << 3, Long.valueOf(iS));
                                        g2Var3 = g2Var2;
                                        objF2 = objF;
                                        f1Var2 = f1Var;
                                    }
                                    z2.f(iS, iJ & 1048575, obj);
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 13:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(5);
                                    z2.f(fs1Var.T(), iJ & 1048575, obj);
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 14:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(1);
                                    z2.h(obj, iJ & 1048575, fs1Var.W());
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 15:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(0);
                                    z2.f(fs1Var.X(), iJ & 1048575, obj);
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 16:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    nVar.F0(0);
                                    z2.h(obj, iJ & 1048575, fs1Var.Z());
                                    g2Var2.s(iV, obj);
                                    g2Var = g2Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 17:
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var2 = g2Var3;
                                    obj3 = obj;
                                    try {
                                        l0 l0Var2 = (l0) g2Var2.F(iV, obj3);
                                        o2 o2VarC2 = g2Var2.C(iV);
                                        nVar.F0(3);
                                        nVar.J0(l0Var2, o2VarC2, z0Var);
                                        g2Var2.G(iV, obj3, l0Var2);
                                        g2Var = g2Var2;
                                        g2Var3 = g2Var;
                                        f1Var2 = f1Var;
                                        objF2 = obj2;
                                    } catch (t1 unused) {
                                        g2Var = g2Var2;
                                        objF2 = obj2;
                                        if (objF2 == null) {
                                            try {
                                                f1Var.getClass();
                                                objF2 = f1.f(obj3);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                f1Var2 = f1Var;
                                                objJ = objF2;
                                                while (i11 < i10) {
                                                    objJ = J(obj, iArr[i11], objJ, f1Var2, obj);
                                                    i11++;
                                                }
                                                if (objJ != null) {
                                                    f1Var2.getClass();
                                                    ((i1) obj).zzc = (u2) objJ;
                                                }
                                                throw th;
                                            }
                                        }
                                        f1Var.getClass();
                                        if (!f1.g(0, nVar, objF2)) {
                                            objJ2 = objF2;
                                            while (i11 < i10) {
                                                objJ2 = g2Var.J(obj3, iArr[i11], objJ2, f1Var, obj);
                                                i11++;
                                                g2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objJ2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (u2) objJ2;
                                            }
                                        }
                                        g2Var3 = this;
                                        f1Var2 = f1Var;
                                    }
                                    break;
                                case 18:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.W0(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 19:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.Y0(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 20:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.a0(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 21:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.a1(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 22:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.c0(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 23:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.e0(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 24:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.g0(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 25:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.i0(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    if ((536870912 & iJ) != 0) {
                                        nVar.k0(f1.c(iJ & 1048575, obj), true);
                                    } else {
                                        nVar.k0(f1.c(iJ & 1048575, obj), false);
                                    }
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 27:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.m0(f1.c(iJ & 1048575, obj), g2Var.C(iV), z0Var);
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    nVar.q0(f1.c(iJ & 1048575, obj));
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    obj3 = obj;
                                    try {
                                        try {
                                            nVar.s0(f1.c(iJ & 1048575, obj3));
                                            g2Var3 = g2Var;
                                            f1Var2 = f1Var;
                                            objF2 = obj2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            f1Var2 = f1Var;
                                            objF2 = obj2;
                                            objJ = objF2;
                                            while (i11 < i10) {
                                                objJ = J(obj, iArr[i11], objJ, f1Var2, obj);
                                                i11++;
                                            }
                                            if (objJ != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (u2) objJ;
                                            }
                                            throw th;
                                        }
                                    } catch (t1 unused2) {
                                        objF2 = obj2;
                                        if (objF2 == null) {
                                            f1Var.getClass();
                                            objF2 = f1.f(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.g(0, nVar, objF2)) {
                                            objJ2 = objF2;
                                            while (i11 < i10) {
                                                objJ2 = g2Var.J(obj3, iArr[i11], objJ2, f1Var, obj);
                                                i11++;
                                                g2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objJ2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (u2) objJ2;
                                            }
                                        }
                                        g2Var3 = this;
                                        f1Var2 = f1Var;
                                        break;
                                    }
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                    g2Var = g2Var3;
                                    f1Var = f1Var2;
                                    obj3 = obj;
                                    Object obj5 = objF2;
                                    try {
                                        s1 s1VarC = f1.c(iJ & 1048575, obj3);
                                        nVar.u0(s1VarC);
                                        try {
                                            objF2 = p2.c(obj3, iR0, s1VarC, g2Var.E(iV), obj5, f1Var);
                                            f1Var = f1Var;
                                            g2Var3 = g2Var;
                                            f1Var2 = f1Var;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj2 = obj5;
                                            f1Var = f1Var;
                                            f1Var2 = f1Var;
                                            objF2 = obj2;
                                            objJ = objF2;
                                            while (i11 < i10) {
                                                objJ = J(obj, iArr[i11], objJ, f1Var2, obj);
                                                i11++;
                                            }
                                            if (objJ != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (u2) objJ;
                                            }
                                            throw th;
                                        }
                                    } catch (t1 unused3) {
                                        obj2 = obj5;
                                        objF2 = obj2;
                                        if (objF2 == null) {
                                            f1Var.getClass();
                                            objF2 = f1.f(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.g(0, nVar, objF2)) {
                                            objJ2 = objF2;
                                            while (i11 < i10) {
                                                objJ2 = g2Var.J(obj3, iArr[i11], objJ2, f1Var, obj);
                                                i11++;
                                                g2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objJ2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (u2) objJ2;
                                            }
                                        }
                                        g2Var3 = this;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj2 = obj5;
                                    }
                                    break;
                                case 31:
                                    g2Var = g2Var3;
                                    nVar.w0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 32:
                                    g2Var = g2Var3;
                                    nVar.y0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 33:
                                    g2Var = g2Var3;
                                    nVar.A0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 34:
                                    g2Var = g2Var3;
                                    nVar.C0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                                    g2Var = g2Var3;
                                    nVar.W0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 36:
                                    g2Var = g2Var3;
                                    nVar.Y0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 37:
                                    g2Var = g2Var3;
                                    nVar.a0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                    g2Var = g2Var3;
                                    nVar.a1(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 39:
                                    g2Var = g2Var3;
                                    nVar.c0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 40:
                                    g2Var = g2Var3;
                                    nVar.e0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 41:
                                    g2Var = g2Var3;
                                    nVar.g0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 42:
                                    g2Var = g2Var3;
                                    nVar.i0(f1.c(iJ & 1048575, obj));
                                    obj2 = objF2;
                                    f1Var = f1Var2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                                    g2Var = g2Var3;
                                    obj3 = obj;
                                    try {
                                        nVar.s0(f1.c(iJ & 1048575, obj3));
                                        obj2 = objF2;
                                        f1Var = f1Var2;
                                        g2Var3 = g2Var;
                                        f1Var2 = f1Var;
                                        objF2 = obj2;
                                    } catch (t1 unused4) {
                                        obj2 = objF2;
                                        f1Var = f1Var2;
                                        objF2 = obj2;
                                        if (objF2 == null) {
                                            f1Var.getClass();
                                            objF2 = f1.f(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.g(0, nVar, objF2)) {
                                            objJ2 = objF2;
                                            while (i11 < i10) {
                                                objJ2 = g2Var.J(obj3, iArr[i11], objJ2, f1Var, obj);
                                                i11++;
                                                g2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objJ2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (u2) objJ2;
                                            }
                                        }
                                        g2Var3 = this;
                                        f1Var2 = f1Var;
                                    }
                                    break;
                                case 44:
                                    f1Var = f1Var2;
                                    try {
                                        s1 s1VarC2 = f1.c(iJ & 1048575, obj);
                                        nVar.u0(s1VarC2);
                                        l1 l1VarE2 = g2Var3.E(iV);
                                        g2Var = g2Var3;
                                        obj3 = obj;
                                        Object obj6 = objF2;
                                        try {
                                            try {
                                                objF2 = p2.c(obj3, iR0, s1VarC2, l1VarE2, obj6, f1Var);
                                                f1Var2 = f1Var;
                                                g2Var3 = g2Var;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                objF2 = obj6;
                                                f1Var2 = f1Var;
                                                obj2 = objF2;
                                                objF2 = obj2;
                                                objJ = objF2;
                                                while (i11 < i10) {
                                                    objJ = J(obj, iArr[i11], objJ, f1Var2, obj);
                                                    i11++;
                                                }
                                                if (objJ != null) {
                                                    f1Var2.getClass();
                                                    ((i1) obj).zzc = (u2) objJ;
                                                }
                                                throw th;
                                            }
                                        } catch (t1 unused5) {
                                            obj2 = obj6;
                                            f1Var = f1Var;
                                            objF2 = obj2;
                                            if (objF2 == null) {
                                                f1Var.getClass();
                                                objF2 = f1.f(obj3);
                                            }
                                            f1Var.getClass();
                                            if (!f1.g(0, nVar, objF2)) {
                                                objJ2 = objF2;
                                                while (i11 < i10) {
                                                    objJ2 = g2Var.J(obj3, iArr[i11], objJ2, f1Var, obj);
                                                    i11++;
                                                    g2Var = this;
                                                    obj3 = obj;
                                                }
                                                f1Var2 = f1Var;
                                                if (objJ2 != null) {
                                                    f1Var2.getClass();
                                                    ((i1) obj).zzc = (u2) objJ2;
                                                }
                                            }
                                            g2Var3 = this;
                                            f1Var2 = f1Var;
                                            break;
                                        }
                                    } catch (t1 unused6) {
                                        g2Var = g2Var3;
                                        obj3 = obj;
                                        obj2 = objF2;
                                    } catch (Throwable th8) {
                                        th = th8;
                                        f1Var2 = f1Var;
                                    }
                                    break;
                                case 45:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.w0(f1.c(iJ & 1048575, obj4));
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.y0(f1.c(iJ & 1048575, obj4));
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.A0(f1.c(iJ & 1048575, obj4));
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.C0(f1.c(iJ & 1048575, obj4));
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.o0(f1.c(iJ & 1048575, obj4), g2Var3.C(iV), z0Var);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 50:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    Object objD = g2Var3.D(iV);
                                    long j10 = g2Var3.j(iV) & 1048575;
                                    Object objI = z2.i(j10, obj4);
                                    if (objI == null) {
                                        objI = a2.f23290b.g();
                                        z2.j(obj4, j10, objI);
                                    } else if (!((a2) objI).f23291a) {
                                        Object objG = a2.f23290b.g();
                                        f1.e(objG, objI);
                                        z2.j(obj4, j10, objG);
                                        objI = objG;
                                    }
                                    nVar.E0((a2) objI, ((z1) objD).c(), z0Var);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(1);
                                    z2.j(obj4, iJ & 1048575, Double.valueOf(fs1Var.D()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(5);
                                    z2.j(obj4, iJ & 1048575, Float.valueOf(fs1Var.E()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(0);
                                    z2.j(obj4, iJ & 1048575, Long.valueOf(fs1Var.G()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(0);
                                    z2.j(obj4, iJ & 1048575, Long.valueOf(fs1Var.F()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(0);
                                    z2.j(obj4, iJ & 1048575, Integer.valueOf(fs1Var.H()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(1);
                                    z2.j(obj4, iJ & 1048575, Long.valueOf(fs1Var.I()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(5);
                                    z2.j(obj4, iJ & 1048575, Integer.valueOf(fs1Var.J()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(0);
                                    z2.j(obj4, iJ & 1048575, Boolean.valueOf(fs1Var.K()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    g2Var3.K(iJ, nVar, obj4);
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 60:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    l0 l0Var3 = (l0) g2Var3.H(iR0, iV, obj4);
                                    o2 o2VarC3 = g2Var3.C(iV);
                                    nVar.F0(2);
                                    nVar.H0(l0Var3, o2VarC3, z0Var);
                                    g2Var3.I(iR0, iV, obj4, l0Var3);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    z2.j(obj4, iJ & 1048575, nVar.U0());
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 62:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(0);
                                    z2.j(obj4, iJ & 1048575, Integer.valueOf(fs1Var.R()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(0);
                                    int iS2 = fs1Var.S();
                                    l1 l1VarE3 = g2Var3.E(iV);
                                    if (l1VarE3 != null && !l1VarE3.a(iS2)) {
                                        f1 f1Var4 = p2.f23833a;
                                        if (objF2 == null) {
                                            f1Var.getClass();
                                            objF = f1.f(obj4);
                                        } else {
                                            objF = objF2;
                                        }
                                        f1Var.getClass();
                                        ((u2) objF).d(iR0 << 3, Long.valueOf(iS2));
                                        objF2 = objF;
                                        f1Var2 = f1Var;
                                    }
                                    z2.j(obj4, iJ & 1048575, Integer.valueOf(iS2));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 64:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(5);
                                    z2.j(obj4, iJ & 1048575, Integer.valueOf(fs1Var.T()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 65:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(1);
                                    z2.j(obj4, iJ & 1048575, Long.valueOf(fs1Var.W()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 66:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(0);
                                    z2.j(obj4, iJ & 1048575, Integer.valueOf(fs1Var.X()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 67:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    nVar.F0(0);
                                    z2.j(obj4, iJ & 1048575, Long.valueOf(fs1Var.Z()));
                                    g2Var3.u(iR0, iV, obj4);
                                    g2Var = g2Var3;
                                    obj2 = objF2;
                                    g2Var3 = g2Var;
                                    f1Var2 = f1Var;
                                    objF2 = obj2;
                                    break;
                                case 68:
                                    f1Var = f1Var2;
                                    obj4 = obj;
                                    try {
                                        l0 l0Var4 = (l0) g2Var3.H(iR0, iV, obj4);
                                        o2 o2VarC4 = g2Var3.C(iV);
                                        nVar.F0(3);
                                        nVar.J0(l0Var4, o2VarC4, z0Var);
                                        g2Var3.I(iR0, iV, obj4, l0Var4);
                                        g2Var = g2Var3;
                                        obj2 = objF2;
                                        g2Var3 = g2Var;
                                        f1Var2 = f1Var;
                                        objF2 = obj2;
                                    } catch (t1 unused7) {
                                        g2Var = g2Var3;
                                        obj2 = objF2;
                                        obj3 = obj4;
                                        objF2 = obj2;
                                        if (objF2 == null) {
                                            f1Var.getClass();
                                            objF2 = f1.f(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.g(0, nVar, objF2)) {
                                            objJ2 = objF2;
                                            while (i11 < i10) {
                                                objJ2 = g2Var.J(obj3, iArr[i11], objJ2, f1Var, obj);
                                                i11++;
                                                g2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objJ2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (u2) objJ2;
                                            }
                                        }
                                        g2Var3 = this;
                                        f1Var2 = f1Var;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        obj2 = objF2;
                                        f1Var2 = f1Var;
                                        objF2 = obj2;
                                        objJ = objF2;
                                        while (i11 < i10) {
                                            objJ = J(obj, iArr[i11], objJ, f1Var2, obj);
                                            i11++;
                                        }
                                        if (objJ != null) {
                                            f1Var2.getClass();
                                            ((i1) obj).zzc = (u2) objJ;
                                        }
                                        throw th;
                                    }
                                    break;
                                default:
                                    if (objF2 == null) {
                                        f1Var2.getClass();
                                        objF2 = f1.f(obj);
                                    }
                                    try {
                                        f1Var2.getClass();
                                        if (f1.g(0, nVar, objF2)) {
                                            f1Var = f1Var2;
                                            f1Var2 = f1Var;
                                        } else {
                                            objJ2 = objF2;
                                            while (i11 < i10) {
                                                objJ2 = g2Var3.J(obj, iArr[i11], objJ2, f1Var2, obj);
                                                i11++;
                                                f1Var2 = f1Var2;
                                            }
                                            f1Var = f1Var2;
                                            f1Var2 = f1Var;
                                        }
                                    } catch (t1 unused8) {
                                        f1Var = f1Var2;
                                        g2Var = g2Var3;
                                        obj3 = obj;
                                        if (objF2 == null) {
                                            f1Var.getClass();
                                            objF2 = f1.f(obj3);
                                        }
                                        f1Var.getClass();
                                        if (!f1.g(0, nVar, objF2)) {
                                            objJ2 = objF2;
                                            while (i11 < i10) {
                                                objJ2 = g2Var.J(obj3, iArr[i11], objJ2, f1Var, obj);
                                                i11++;
                                                g2Var = this;
                                                obj3 = obj;
                                            }
                                            f1Var2 = f1Var;
                                            if (objJ2 != null) {
                                                f1Var2.getClass();
                                                ((i1) obj).zzc = (u2) objJ2;
                                            }
                                        }
                                        g2Var3 = this;
                                    } catch (Throwable th10) {
                                        th = th10;
                                        f1Var = f1Var2;
                                        f1Var2 = f1Var;
                                        objJ = objF2;
                                        while (i11 < i10) {
                                            objJ = J(obj, iArr[i11], objJ, f1Var2, obj);
                                            i11++;
                                        }
                                        if (objJ != null) {
                                            f1Var2.getClass();
                                            ((i1) obj).zzc = (u2) objJ;
                                        }
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (t1 unused9) {
                            g2Var = g2Var3;
                            obj2 = objF2;
                            f1Var = f1Var2;
                            obj3 = obj;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        obj2 = objF2;
                    }
                } else if (iR0 == Integer.MAX_VALUE) {
                    objJ2 = objF2;
                    while (i11 < i10) {
                        objJ2 = g2Var3.J(obj, iArr[i11], objJ2, f1Var2, obj);
                        i11++;
                        g2Var3 = this;
                    }
                } else {
                    if (objF2 == null) {
                        f1Var2.getClass();
                        objF2 = f1.f(obj);
                    }
                    try {
                        f1Var2.getClass();
                        if (f1.g(0, nVar, objF2)) {
                            g2Var3 = this;
                        } else {
                            objJ2 = objF2;
                            while (i11 < i10) {
                                objJ2 = J(obj, iArr[i11], objJ2, f1Var2, obj);
                                i11++;
                            }
                        }
                    } catch (Throwable th12) {
                        th = th12;
                        objJ = objF2;
                        while (i11 < i10) {
                            objJ = J(obj, iArr[i11], objJ, f1Var2, obj);
                            i11++;
                        }
                        if (objJ != null) {
                            f1Var2.getClass();
                            ((i1) obj).zzc = (u2) objJ;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th13) {
                th = th13;
            }
        }
        if (objJ2 != null) {
            f1Var2.getClass();
            ((i1) obj).zzc = (u2) objJ2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final void f(Object obj, byte[] bArr, int i10, int i11, ur1 ur1Var) {
        x(obj, bArr, i10, i11, 0, ur1Var);
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final int g(i1 i1Var) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int i12;
        int i13;
        int iHashCode = 0;
        for (int i14 = 0; i14 < this.f23491a.length; i14 += 3) {
            int iJ = j(i14);
            int iK = k(iJ);
            if (iK <= 50 || iK >= 69) {
                long j10 = iJ & 1048575;
                int iHashCode2 = 37;
                switch (iK) {
                    case 0:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(z2.f24194c.k(j10, i1Var));
                        byte[] bArr = q1.f23877a;
                        i12 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + i12;
                        break;
                    case 1:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(z2.f24194c.h(j10, i1Var));
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 2:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = z2.g(j10, i1Var);
                        byte[] bArr2 = q1.f23877a;
                        i12 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + i12;
                        break;
                    case 3:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = z2.g(j10, i1Var);
                        byte[] bArr3 = q1.f23877a;
                        i12 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + i12;
                        break;
                    case 4:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.e(j10, i1Var);
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 5:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = z2.g(j10, i1Var);
                        byte[] bArr4 = q1.f23877a;
                        i12 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + i12;
                        break;
                    case 6:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.e(j10, i1Var);
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 7:
                        i10 = iHashCode * 53;
                        boolean zD = z2.f24194c.d(j10, i1Var);
                        byte[] bArr5 = q1.f23877a;
                        i12 = zD ? 1231 : 1237;
                        iHashCode = i10 + i12;
                        break;
                    case 8:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = ((String) z2.i(j10, i1Var)).hashCode();
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 9:
                        i13 = iHashCode * 53;
                        Object objI = z2.i(j10, i1Var);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i13 + iHashCode2;
                        break;
                    case 10:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.i(j10, i1Var).hashCode();
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 11:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.e(j10, i1Var);
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 12:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.e(j10, i1Var);
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 13:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.e(j10, i1Var);
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 14:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = z2.g(j10, i1Var);
                        byte[] bArr6 = q1.f23877a;
                        i12 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + i12;
                        break;
                    case 15:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.e(j10, i1Var);
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 16:
                        i10 = iHashCode * 53;
                        jDoubleToLongBits = z2.g(j10, i1Var);
                        byte[] bArr7 = q1.f23877a;
                        i12 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i10 + i12;
                        break;
                    case 17:
                        i13 = iHashCode * 53;
                        Object objI2 = z2.i(j10, i1Var);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i13 + iHashCode2;
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
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.i(j10, i1Var).hashCode();
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                    case 50:
                        i11 = iHashCode * 53;
                        iFloatToIntBits = z2.i(j10, i1Var).hashCode();
                        iHashCode = i11 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i15 = this.f23499i;
        while (true) {
            int[] iArr = this.f23497g;
            if (i15 >= iArr.length) {
                return i1Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i16 = iArr[i15];
            if (!t(0, i16, i1Var)) {
                iHashCode = z2.i(j(i16) & 1048575, i1Var).hashCode() + (iHashCode * 53);
            }
            i15++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x051b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fa  */
    @Override // com.google.android.gms.internal.measurement.o2
    public final int h(l0 l0Var) {
        int i10;
        int iP;
        int iQ;
        int iZ;
        int i11;
        int iC;
        int iP2;
        int size;
        int iS;
        int iP3;
        int iP4;
        int iP5;
        int iC2;
        int iP6;
        int iQ2;
        Unsafe unsafe = l;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int iY = 0;
        while (true) {
            int[] iArr = this.f23491a;
            if (i14 >= iArr.length) {
                return ((i1) l0Var).zzc.c() + iY;
            }
            int iJ = j(i14);
            int iK = k(iJ);
            int i16 = iArr[i14];
            int i17 = iArr[i14 + 2];
            int i18 = i17 & i12;
            if (iK <= 17) {
                if (i18 != i13) {
                    i15 = i18 == i12 ? 0 : unsafe.getInt(l0Var, i18);
                    i13 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iJ & i12;
            if (iK >= c1.f23336b.f23340a) {
                c1.f23337c.getClass();
            }
            long j10 = i19;
            switch (iK) {
                case 0:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 8, iY);
                    }
                    break;
                case 1:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 4, iY);
                    }
                    break;
                case 2:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        long j11 = unsafe.getLong(l0Var, j10);
                        iP = x0.p(i16 << 3);
                        iQ = x0.q(j11);
                        iZ = iQ + iP;
                        iY += iZ;
                    }
                    break;
                case 3:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        long j12 = unsafe.getLong(l0Var, j10);
                        iP = x0.p(i16 << 3);
                        iQ = x0.q(j12);
                        iZ = iQ + iP;
                        iY += iZ;
                    }
                    break;
                case 4:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        long j13 = unsafe.getInt(l0Var, j10);
                        iP = x0.p(i16 << 3);
                        iQ = x0.q(j13);
                        iZ = iQ + iP;
                        iY += iZ;
                    }
                    break;
                case 5:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 8, iY);
                    }
                    break;
                case 6:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 4, iY);
                    }
                    break;
                case 7:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 1, iY);
                    }
                    break;
                case 8:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        int i20 = i16 << 3;
                        Object object = unsafe.getObject(l0Var, j10);
                        if (object instanceof s0) {
                            int iP7 = x0.p(i20);
                            int iH = ((s0) object).h();
                            iY = f2.e(iH, iH, iP7, iY);
                        } else {
                            int iP8 = x0.p(i20);
                            int iB = b3.b((String) object);
                            iY = f2.e(iB, iB, iP8, iY);
                        }
                    }
                    break;
                case 9:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        Object object2 = unsafe.getObject(l0Var, j10);
                        o2 o2VarC = C(i14);
                        f1 f1Var = p2.f23833a;
                        int iP9 = x0.p(i16 << 3);
                        int iC3 = ((l0) object2).c(o2VarC);
                        iY = f2.e(iC3, iC3, iP9, iY);
                    }
                    break;
                case 10:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        s0 s0Var = (s0) unsafe.getObject(l0Var, j10);
                        int iP10 = x0.p(i16 << 3);
                        int iH2 = s0Var.h();
                        iY = f2.e(iH2, iH2, iP10, iY);
                    }
                    break;
                case 11:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        iY = com.applovin.impl.ca.y(unsafe.getInt(l0Var, j10), x0.p(i16 << 3), iY);
                    }
                    break;
                case 12:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        long j14 = unsafe.getInt(l0Var, j10);
                        iP = x0.p(i16 << 3);
                        iQ = x0.q(j14);
                        iZ = iQ + iP;
                        iY += iZ;
                    }
                    break;
                case 13:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 4, iY);
                    }
                    break;
                case 14:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 8, iY);
                    }
                    break;
                case 15:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        int i21 = unsafe.getInt(l0Var, j10);
                        iY = com.applovin.impl.ca.y((i21 >> 31) ^ (i21 + i21), x0.p(i16 << 3), iY);
                    }
                    break;
                case 16:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        long j15 = unsafe.getLong(l0Var, j10);
                        iP = x0.p(i16 << 3);
                        iQ = x0.q((j15 >> 63) ^ (j15 + j15));
                        iZ = iQ + iP;
                        iY += iZ;
                    }
                    break;
                case 17:
                    if (q(l0Var, i14, i13, i15, i10)) {
                        l0 l0Var2 = (l0) unsafe.getObject(l0Var, j10);
                        o2 o2VarC2 = C(i14);
                        f1 f1Var2 = p2.f23833a;
                        int iP11 = x0.p(i16 << 3);
                        i11 = iP11 + iP11;
                        iC = l0Var2.c(o2VarC2);
                        iZ = iC + i11;
                        iY += iZ;
                    }
                    break;
                case 18:
                    iZ = p2.z(i16, (List) unsafe.getObject(l0Var, j10));
                    iY += iZ;
                    break;
                case 19:
                    iZ = p2.y(i16, (List) unsafe.getObject(l0Var, j10));
                    iY += iZ;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var3 = p2.f23833a;
                    if (list.size() == 0) {
                        iP2 = 0;
                    } else {
                        iP2 = (x0.p(i16 << 3) * list.size()) + p2.r(list);
                    }
                    iY += iP2;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var4 = p2.f23833a;
                    size = list2.size();
                    if (size == 0) {
                        iP4 = 0;
                    } else {
                        iS = p2.s(list2);
                        iP3 = x0.p(i16 << 3);
                        iP4 = (iP3 * size) + iS;
                    }
                    iY += iP4;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var5 = p2.f23833a;
                    size = list3.size();
                    if (size == 0) {
                        iP4 = 0;
                    } else {
                        iS = p2.v(list3);
                        iP3 = x0.p(i16 << 3);
                        iP4 = (iP3 * size) + iS;
                    }
                    iY += iP4;
                    break;
                case 23:
                    iZ = p2.z(i16, (List) unsafe.getObject(l0Var, j10));
                    iY += iZ;
                    break;
                case 24:
                    iZ = p2.y(i16, (List) unsafe.getObject(l0Var, j10));
                    iY += iZ;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var6 = p2.f23833a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iP2 = 0;
                    } else {
                        iP2 = (x0.p(i16 << 3) + 1) * size2;
                    }
                    iY += iP2;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    List list5 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var7 = p2.f23833a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iP4 = 0;
                    } else {
                        iP4 = x0.p(i16 << 3) * size3;
                        if (list5 instanceof w1) {
                            w1 w1Var = (w1) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object objZzc = w1Var.zzc();
                                if (objZzc instanceof s0) {
                                    int iH3 = ((s0) objZzc).h();
                                    iP4 = com.applovin.impl.ca.y(iH3, iH3, iP4);
                                } else {
                                    int iB2 = b3.b((String) objZzc);
                                    iP4 = com.applovin.impl.ca.y(iB2, iB2, iP4);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj = list5.get(i23);
                                if (obj instanceof s0) {
                                    int iH4 = ((s0) obj).h();
                                    iP4 = com.applovin.impl.ca.y(iH4, iH4, iP4);
                                } else {
                                    int iB3 = b3.b((String) obj);
                                    iP4 = com.applovin.impl.ca.y(iB3, iB3, iP4);
                                }
                            }
                        }
                    }
                    iY += iP4;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(l0Var, j10);
                    o2 o2VarC3 = C(i14);
                    f1 f1Var8 = p2.f23833a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iP5 = 0;
                    } else {
                        iP5 = x0.p(i16 << 3) * size4;
                        for (int i24 = 0; i24 < size4; i24++) {
                            int iC4 = ((l0) list6.get(i24)).c(o2VarC3);
                            iP5 = com.applovin.impl.ca.y(iC4, iC4, iP5);
                        }
                    }
                    iY += iP5;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    List list7 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var9 = p2.f23833a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iP4 = 0;
                    } else {
                        iP4 = x0.p(i16 << 3) * size5;
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int iH5 = ((s0) list7.get(i25)).h();
                            iP4 = com.applovin.impl.ca.y(iH5, iH5, iP4);
                        }
                    }
                    iY += iP4;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    List list8 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var10 = p2.f23833a;
                    size = list8.size();
                    if (size == 0) {
                        iP4 = 0;
                    } else {
                        iS = p2.w(list8);
                        iP3 = x0.p(i16 << 3);
                        iP4 = (iP3 * size) + iS;
                    }
                    iY += iP4;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    List list9 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var11 = p2.f23833a;
                    size = list9.size();
                    if (size == 0) {
                        iP4 = 0;
                    } else {
                        iS = p2.u(list9);
                        iP3 = x0.p(i16 << 3);
                        iP4 = (iP3 * size) + iS;
                    }
                    iY += iP4;
                    break;
                case 31:
                    iZ = p2.y(i16, (List) unsafe.getObject(l0Var, j10));
                    iY += iZ;
                    break;
                case 32:
                    iZ = p2.z(i16, (List) unsafe.getObject(l0Var, j10));
                    iY += iZ;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var12 = p2.f23833a;
                    size = list10.size();
                    if (size == 0) {
                        iP4 = 0;
                    } else {
                        iS = p2.x(list10);
                        iP3 = x0.p(i16 << 3);
                        iP4 = (iP3 * size) + iS;
                    }
                    iY += iP4;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var13 = p2.f23833a;
                    size = list11.size();
                    if (size == 0) {
                        iP4 = 0;
                    } else {
                        iS = p2.t(list11);
                        iP3 = x0.p(i16 << 3);
                        iP4 = (iP3 * size) + iS;
                    }
                    iY += iP4;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    List list12 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var14 = p2.f23833a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iY = f2.e(size6, x0.p(i16 << 3), size6, iY);
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var15 = p2.f23833a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iY = f2.e(size7, x0.p(i16 << 3), size7, iY);
                    }
                    break;
                case 37:
                    int iR = p2.r((List) unsafe.getObject(l0Var, j10));
                    if (iR > 0) {
                        iY = f2.e(iR, x0.p(i16 << 3), iR, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    int iS2 = p2.s((List) unsafe.getObject(l0Var, j10));
                    if (iS2 > 0) {
                        iY = f2.e(iS2, x0.p(i16 << 3), iS2, iY);
                    }
                    break;
                case 39:
                    int iV = p2.v((List) unsafe.getObject(l0Var, j10));
                    if (iV > 0) {
                        iY = f2.e(iV, x0.p(i16 << 3), iV, iY);
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var16 = p2.f23833a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iY = f2.e(size8, x0.p(i16 << 3), size8, iY);
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var17 = p2.f23833a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iY = f2.e(size9, x0.p(i16 << 3), size9, iY);
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var18 = p2.f23833a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iY = f2.e(size10, x0.p(i16 << 3), size10, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    int iW = p2.w((List) unsafe.getObject(l0Var, j10));
                    if (iW > 0) {
                        iY = f2.e(iW, x0.p(i16 << 3), iW, iY);
                    }
                    break;
                case 44:
                    int iU = p2.u((List) unsafe.getObject(l0Var, j10));
                    if (iU > 0) {
                        iY = f2.e(iU, x0.p(i16 << 3), iU, iY);
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var19 = p2.f23833a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iY = f2.e(size11, x0.p(i16 << 3), size11, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    List list18 = (List) unsafe.getObject(l0Var, j10);
                    f1 f1Var20 = p2.f23833a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iY = f2.e(size12, x0.p(i16 << 3), size12, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    int iX = p2.x((List) unsafe.getObject(l0Var, j10));
                    if (iX > 0) {
                        iY = f2.e(iX, x0.p(i16 << 3), iX, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    int iT = p2.t((List) unsafe.getObject(l0Var, j10));
                    if (iT > 0) {
                        iY = f2.e(iT, x0.p(i16 << 3), iT, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    List list19 = (List) unsafe.getObject(l0Var, j10);
                    o2 o2VarC4 = C(i14);
                    f1 f1Var21 = p2.f23833a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iC2 = 0;
                    } else {
                        iC2 = 0;
                        for (int i26 = 0; i26 < size13; i26++) {
                            l0 l0Var3 = (l0) list19.get(i26);
                            int iP12 = x0.p(i16 << 3);
                            iC2 += l0Var3.c(o2VarC4) + iP12 + iP12;
                        }
                    }
                    iY += iC2;
                    break;
                case 50:
                    a2 a2Var = (a2) unsafe.getObject(l0Var, j10);
                    z1 z1Var = (z1) D(i14);
                    if (a2Var.isEmpty()) {
                        iP4 = 0;
                    } else {
                        iP4 = 0;
                        for (Map.Entry entry : a2Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            g9.k kVar = z1Var.f24191a;
                            int iP13 = x0.p(i16 << 3);
                            int iB4 = z1.b(kVar, key, value);
                            iP4 = f2.e(iB4, iB4, iP13, iP4);
                        }
                    }
                    iY += iP4;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (t(i16, i14, l0Var)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 8, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (t(i16, i14, l0Var)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 4, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (t(i16, i14, l0Var)) {
                        long jO = o(j10, l0Var);
                        iP6 = x0.p(i16 << 3);
                        iQ2 = x0.q(jO);
                        iY += iQ2 + iP6;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (t(i16, i14, l0Var)) {
                        long jO2 = o(j10, l0Var);
                        iP6 = x0.p(i16 << 3);
                        iQ2 = x0.q(jO2);
                        iY += iQ2 + iP6;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (t(i16, i14, l0Var)) {
                        long jN = n(j10, l0Var);
                        iP6 = x0.p(i16 << 3);
                        iQ2 = x0.q(jN);
                        iY += iQ2 + iP6;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (t(i16, i14, l0Var)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 8, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (t(i16, i14, l0Var)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 4, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (t(i16, i14, l0Var)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 1, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (t(i16, i14, l0Var)) {
                        int i27 = i16 << 3;
                        Object object3 = unsafe.getObject(l0Var, j10);
                        if (object3 instanceof s0) {
                            int iP14 = x0.p(i27);
                            int iH6 = ((s0) object3).h();
                            iY = f2.e(iH6, iH6, iP14, iY);
                        } else {
                            int iP15 = x0.p(i27);
                            int iB5 = b3.b((String) object3);
                            iY = f2.e(iB5, iB5, iP15, iY);
                        }
                    }
                    break;
                case 60:
                    if (t(i16, i14, l0Var)) {
                        Object object4 = unsafe.getObject(l0Var, j10);
                        o2 o2VarC5 = C(i14);
                        f1 f1Var22 = p2.f23833a;
                        int iP16 = x0.p(i16 << 3);
                        int iC5 = ((l0) object4).c(o2VarC5);
                        iY = f2.e(iC5, iC5, iP16, iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (t(i16, i14, l0Var)) {
                        s0 s0Var2 = (s0) unsafe.getObject(l0Var, j10);
                        int iP17 = x0.p(i16 << 3);
                        int iH7 = s0Var2.h();
                        iY = f2.e(iH7, iH7, iP17, iY);
                    }
                    break;
                case 62:
                    if (t(i16, i14, l0Var)) {
                        iY = com.applovin.impl.ca.y(n(j10, l0Var), x0.p(i16 << 3), iY);
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (t(i16, i14, l0Var)) {
                        long jN2 = n(j10, l0Var);
                        iP6 = x0.p(i16 << 3);
                        iQ2 = x0.q(jN2);
                        iY += iQ2 + iP6;
                    }
                    break;
                case 64:
                    if (t(i16, i14, l0Var)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 4, iY);
                    }
                    break;
                case 65:
                    if (t(i16, i14, l0Var)) {
                        iY = com.applovin.impl.ca.y(i16 << 3, 8, iY);
                    }
                    break;
                case 66:
                    if (t(i16, i14, l0Var)) {
                        int iN = n(j10, l0Var);
                        iY = com.applovin.impl.ca.y((iN >> 31) ^ (iN + iN), x0.p(i16 << 3), iY);
                    }
                    break;
                case 67:
                    if (t(i16, i14, l0Var)) {
                        long jO3 = o(j10, l0Var);
                        iP6 = x0.p(i16 << 3);
                        iQ2 = x0.q((jO3 >> 63) ^ (jO3 + jO3));
                        iY += iQ2 + iP6;
                    }
                    break;
                case 68:
                    if (t(i16, i14, l0Var)) {
                        l0 l0Var4 = (l0) unsafe.getObject(l0Var, j10);
                        o2 o2VarC6 = C(i14);
                        f1 f1Var23 = p2.f23833a;
                        int iP18 = x0.p(i16 << 3);
                        i11 = iP18 + iP18;
                        iC = l0Var4.c(o2VarC6);
                        iZ = iC + i11;
                        iY += iZ;
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01d1 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.o2
    public final boolean i(i1 i1Var, i1 i1Var2) {
        boolean zA;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f23491a;
            if (i10 < iArr.length) {
                int iJ = j(i10);
                int iK = k(iJ);
                if (iK <= 50 || iK >= 69) {
                    long j10 = iJ & 1048575;
                    switch (iK) {
                        case 0:
                            if (p(i1Var, i1Var2, i10)) {
                                y2 y2Var = z2.f24194c;
                                if (Double.doubleToLongBits(y2Var.k(j10, i1Var)) != Double.doubleToLongBits(y2Var.k(j10, i1Var2))) {
                                }
                            }
                            break;
                        case 1:
                            if (p(i1Var, i1Var2, i10)) {
                                y2 y2Var2 = z2.f24194c;
                                if (Float.floatToIntBits(y2Var2.h(j10, i1Var)) != Float.floatToIntBits(y2Var2.h(j10, i1Var2))) {
                                }
                            }
                            break;
                        case 2:
                            if (!p(i1Var, i1Var2, i10) || z2.g(j10, i1Var) != z2.g(j10, i1Var2)) {
                            }
                            break;
                        case 3:
                            if (!p(i1Var, i1Var2, i10) || z2.g(j10, i1Var) != z2.g(j10, i1Var2)) {
                            }
                            break;
                        case 4:
                            if (!p(i1Var, i1Var2, i10) || z2.e(j10, i1Var) != z2.e(j10, i1Var2)) {
                            }
                            break;
                        case 5:
                            if (!p(i1Var, i1Var2, i10) || z2.g(j10, i1Var) != z2.g(j10, i1Var2)) {
                            }
                            break;
                        case 6:
                            if (!p(i1Var, i1Var2, i10) || z2.e(j10, i1Var) != z2.e(j10, i1Var2)) {
                            }
                            break;
                        case 7:
                            if (p(i1Var, i1Var2, i10)) {
                                y2 y2Var3 = z2.f24194c;
                                if (y2Var3.d(j10, i1Var) != y2Var3.d(j10, i1Var2)) {
                                }
                            }
                            break;
                        case 8:
                            if (!p(i1Var, i1Var2, i10) || !p2.a(z2.i(j10, i1Var), z2.i(j10, i1Var2))) {
                            }
                            break;
                        case 9:
                            if (!p(i1Var, i1Var2, i10) || !p2.a(z2.i(j10, i1Var), z2.i(j10, i1Var2))) {
                            }
                            break;
                        case 10:
                            if (!p(i1Var, i1Var2, i10) || !p2.a(z2.i(j10, i1Var), z2.i(j10, i1Var2))) {
                            }
                            break;
                        case 11:
                            if (!p(i1Var, i1Var2, i10) || z2.e(j10, i1Var) != z2.e(j10, i1Var2)) {
                            }
                            break;
                        case 12:
                            if (!p(i1Var, i1Var2, i10) || z2.e(j10, i1Var) != z2.e(j10, i1Var2)) {
                            }
                            break;
                        case 13:
                            if (!p(i1Var, i1Var2, i10) || z2.e(j10, i1Var) != z2.e(j10, i1Var2)) {
                            }
                            break;
                        case 14:
                            if (!p(i1Var, i1Var2, i10) || z2.g(j10, i1Var) != z2.g(j10, i1Var2)) {
                            }
                            break;
                        case 15:
                            if (!p(i1Var, i1Var2, i10) || z2.e(j10, i1Var) != z2.e(j10, i1Var2)) {
                            }
                            break;
                        case 16:
                            if (!p(i1Var, i1Var2, i10) || z2.g(j10, i1Var) != z2.g(j10, i1Var2)) {
                            }
                            break;
                        case 17:
                            if (!p(i1Var, i1Var2, i10) || !p2.a(z2.i(j10, i1Var), z2.i(j10, i1Var2))) {
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
                            zA = p2.a(z2.i(j10, i1Var), z2.i(j10, i1Var2));
                            if (zA) {
                            }
                            break;
                        case 50:
                            zA = p2.a(z2.i(j10, i1Var), z2.i(j10, i1Var2));
                            if (zA) {
                            }
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
                            if (z2.e(j11, i1Var) == z2.e(j11, i1Var2) && p2.a(z2.i(j10, i1Var), z2.i(j10, i1Var2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i10 += 3;
            } else {
                int i11 = this.f23499i;
                while (true) {
                    int[] iArr2 = this.f23497g;
                    if (i11 < iArr2.length) {
                        int i12 = iArr2[i11];
                        long j12 = iArr[i12 + 2] & 1048575;
                        if (z2.e(j12, i1Var) == z2.e(j12, i1Var2)) {
                            if (!t(0, i12, i1Var)) {
                                long j13 = j(i12) & 1048575;
                                if (!p2.a(z2.i(j13, i1Var), z2.i(j13, i1Var2))) {
                                }
                            }
                            i11++;
                        }
                    } else if (i1Var.zzc.equals(i1Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int j(int i10) {
        return this.f23491a[i10 + 1];
    }

    public final boolean p(i1 i1Var, i1 i1Var2, int i10) {
        return r(i10, i1Var) == r(i10, i1Var2);
    }

    public final boolean q(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return r(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final boolean r(int i10, Object obj) {
        int i11 = this.f23491a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iJ = j(i10);
            long j11 = iJ & 1048575;
            switch (k(iJ)) {
                case 0:
                    if (Double.doubleToRawLongBits(z2.f24194c.k(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(z2.f24194c.h(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (z2.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (z2.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (z2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (z2.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (z2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return z2.f24194c.d(j11, obj);
                case 8:
                    Object objI = z2.i(j11, obj);
                    if (objI instanceof String) {
                        if (((String) objI).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objI instanceof s0)) {
                            throw new IllegalArgumentException();
                        }
                        if (s0.f23949b.equals(objI)) {
                            return false;
                        }
                    }
                case 9:
                    if (z2.i(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (s0.f23949b.equals(z2.i(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (z2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (z2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (z2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (z2.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (z2.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (z2.g(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (z2.i(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & z2.e(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final void s(int i10, Object obj) {
        int i11 = this.f23491a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        z2.f((1 << (i11 >>> 20)) | z2.e(j10, obj), j10, obj);
    }

    public final boolean t(int i10, int i11, Object obj) {
        return z2.e((long) (this.f23491a[i11 + 2] & 1048575), obj) == i10;
    }

    public final void u(int i10, int i11, Object obj) {
        z2.f(i10, this.f23491a[i11 + 2] & 1048575, obj);
    }

    public final int v(int i10, int i11) {
        int[] iArr = this.f23491a;
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37801. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int x(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.ur1 r39) {
        /*
            Method dump skipped, instruction units count: 3780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g2.x(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.ur1):int");
    }

    @Override // com.google.android.gms.internal.measurement.o2
    public final i1 zza() {
        return ((i1) this.f23495e).i();
    }
}
