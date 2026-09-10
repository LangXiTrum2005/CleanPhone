package com.google.protobuf;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d3 implements x3 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f24797q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Unsafe f24798r = x4.l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f24799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f24800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f24803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f24805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f24807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24809k;
    public final h3 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2 f24810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q4 f24811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i1 f24812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x2 f24813p;

    public d3(int[] iArr, Object[] objArr, int i10, int i11, MessageLite messageLite, boolean z10, int[] iArr2, int i12, int i13, h3 h3Var, p2 p2Var, q4 q4Var, i1 i1Var, x2 x2Var) {
        this.f24799a = iArr;
        this.f24800b = objArr;
        this.f24801c = i10;
        this.f24802d = i11;
        this.f24805g = messageLite instanceof GeneratedMessageLite;
        this.f24804f = i1Var != null && (messageLite instanceof GeneratedMessageLite.ExtendableMessage);
        this.f24806h = z10;
        this.f24807i = iArr2;
        this.f24808j = i12;
        this.f24809k = i13;
        this.l = h3Var;
        this.f24810m = p2Var;
        this.f24811n = q4Var;
        this.f24812o = i1Var;
        this.f24803e = messageLite;
        this.f24813p = x2Var;
    }

    public static d3 B(z2 z2Var, h3 h3Var, p2 p2Var, q4 q4Var, i1 i1Var, x2 x2Var) {
        int i10;
        int i11;
        int i12;
        int iN;
        int iNumberOfTrailingZeros;
        boolean z10;
        if (z2Var instanceof r3) {
            return C((r3) z2Var, h3Var, p2Var, q4Var, i1Var, x2Var);
        }
        j4 j4Var = (j4) z2Var;
        s1[] s1VarArr = j4Var.f24880d;
        if (s1VarArr.length == 0) {
            i10 = 0;
            i11 = 0;
        } else {
            i10 = s1VarArr[0].f24939c;
            i11 = s1VarArr[s1VarArr.length - 1].f24939c;
        }
        int length = s1VarArr.length;
        int[] iArr = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        int i13 = 0;
        int i14 = 0;
        for (s1 s1Var : s1VarArr) {
            FieldType fieldType = s1Var.f24938b;
            if (fieldType == FieldType.MAP) {
                i13++;
            } else if (fieldType.id() >= 18 && s1Var.f24938b.id() <= 49) {
                i14++;
            }
        }
        int[] iArr2 = i13 > 0 ? new int[i13] : null;
        int[] iArr3 = i14 > 0 ? new int[i14] : null;
        int[] iArr4 = j4Var.f24879c;
        int[] iArr5 = f24797q;
        if (iArr4 == null) {
            iArr4 = iArr5;
        }
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i16 < s1VarArr.length) {
            s1 s1Var2 = s1VarArr[i16];
            int i20 = s1Var2.f24939c;
            java.lang.reflect.Field field = s1Var2.f24937a;
            s1[] s1VarArr2 = s1VarArr;
            FieldType fieldType2 = s1Var2.f24938b;
            int i21 = i10;
            Internal.EnumVerifier enumVerifier = s1Var2.f24946j;
            w4 w4Var = x4.f25021c;
            int i22 = i11;
            Object[] objArr2 = objArr;
            int iN2 = (int) w4Var.n(field);
            int iId = fieldType2.id();
            if (fieldType2.isList() || fieldType2.isMap()) {
                i12 = iN2;
                iId = iId;
                java.lang.reflect.Field field2 = s1Var2.f24944h;
                if (field2 == null) {
                    iNumberOfTrailingZeros = 0;
                    iN = 0;
                } else {
                    iN = (int) w4Var.n(field2);
                    iNumberOfTrailingZeros = 0;
                }
            } else {
                i12 = iN2;
                java.lang.reflect.Field field3 = s1Var2.f24940d;
                int iN3 = field3 == null ? 1048575 : (int) w4Var.n(field3);
                iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(s1Var2.f24941e);
                iN = iN3;
            }
            iArr[i17] = s1Var2.f24939c;
            iArr[i17 + 1] = (s1Var2.f24943g ? 536870912 : 0) | (s1Var2.f24942f ? 268435456 : 0) | (iId << 20) | i12;
            iArr[i17 + 2] = (iNumberOfTrailingZeros << 20) | iN;
            int i23 = r1.f24928a[fieldType2.ordinal()];
            Class<?> type = ((i23 == 1 || i23 == 2) && field != null) ? field.getType() : null;
            Object obj = s1Var2.f24945i;
            if (obj != null) {
                int i24 = (i17 / 3) * 2;
                objArr2[i24] = obj;
                if (type != null) {
                    objArr2[i24 + 1] = type;
                } else if (enumVerifier != null) {
                    objArr2[i24 + 1] = enumVerifier;
                }
                z10 = true;
            } else if (type != null) {
                Class<?> cls = type;
                z10 = true;
                objArr2[defpackage.e.e(i17, 3, 2, 1)] = cls;
            } else {
                z10 = true;
                if (enumVerifier != null) {
                    objArr2[defpackage.e.e(i17, 3, 2, 1)] = enumVerifier;
                }
            }
            if (i15 < iArr4.length && iArr4[i15] == i20) {
                iArr4[i15] = i17;
                i15++;
            }
            if (fieldType2 == FieldType.MAP) {
                iArr2[i18] = i17;
                i18++;
            } else if (fieldType2.id() >= 18 && fieldType2.id() <= 49) {
                iArr3[i19] = (int) w4Var.n(field);
                i19++;
            }
            i16++;
            i17 += 3;
            s1VarArr = s1VarArr2;
            i10 = i21;
            i11 = i22;
            objArr = objArr2;
        }
        int i25 = i10;
        int i26 = i11;
        Object[] objArr3 = objArr;
        if (iArr2 == null) {
            iArr2 = iArr5;
        }
        if (iArr3 == null) {
            iArr3 = iArr5;
        }
        int[] iArr6 = new int[iArr4.length + iArr2.length + iArr3.length];
        System.arraycopy(iArr4, 0, iArr6, 0, iArr4.length);
        System.arraycopy(iArr2, 0, iArr6, iArr4.length, iArr2.length);
        System.arraycopy(iArr3, 0, iArr6, iArr4.length + iArr2.length, iArr3.length);
        return new d3(iArr, objArr3, i25, i26, j4Var.f24881e, true, iArr6, iArr4.length, iArr4.length + iArr2.length, h3Var, p2Var, q4Var, i1Var, x2Var);
    }

    /* JADX WARN: Code duplicated, block: B:165:0x034f  */
    /* JADX WARN: Code duplicated, block: B:181:0x039c  */
    /* JADX WARN: Code duplicated, block: B:184:0x03a8  */
    public static d3 C(r3 r3Var, h3 h3Var, p2 p2Var, q4 q4Var, i1 i1Var, x2 x2Var) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
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
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        int i31;
        java.lang.reflect.Field fieldO;
        char cCharAt9;
        int i32;
        java.lang.reflect.Field fieldO2;
        java.lang.reflect.Field fieldO3;
        int i33;
        char cCharAt10;
        int i34;
        char cCharAt11;
        int i35;
        char cCharAt12;
        int i36;
        char cCharAt13;
        String str = r3Var.f24933b;
        int length = str.length();
        int i37 = 55296;
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
                i36 = i39 + 1;
                cCharAt13 = str.charAt(i39);
                if (cCharAt13 < 55296) {
                    break;
                }
                i40 |= (cCharAt13 & 8191) << i41;
                i41 += 13;
                i39 = i36;
            }
            iCharAt2 = i40 | (cCharAt13 << i41);
            i39 = i36;
        }
        if (iCharAt2 == 0) {
            i12 = 0;
            i14 = 0;
            iCharAt = 0;
            i11 = 0;
            i13 = 0;
            i16 = 0;
            iArr = f24797q;
            i15 = 0;
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
            i13 = iCharAt6;
            i14 = i66;
            iArr = iArr2;
            i15 = iCharAt3;
            i16 = iCharAt9;
            i39 = i63;
        }
        Unsafe unsafe = f24798r;
        Object[] objArr = r3Var.f24934c;
        Class<?> cls = r3Var.f24932a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[iCharAt * 2];
        int i68 = i16 + i12;
        int i69 = i68;
        int i70 = i16;
        int i71 = 0;
        int i72 = 0;
        while (i39 < length) {
            int i73 = i39 + 1;
            int iCharAt10 = str.charAt(i39);
            if (iCharAt10 >= i37) {
                int i74 = iCharAt10 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i35 = i75 + 1;
                    cCharAt12 = str.charAt(i75);
                    i25 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt12 & 8191) << i76;
                    i76 += 13;
                    i75 = i35;
                    length = i25;
                }
                iCharAt10 = i74 | (cCharAt12 << i76);
                i26 = i35;
            } else {
                i25 = length;
                i26 = i73;
            }
            int i77 = i26 + 1;
            int iCharAt11 = str.charAt(i26);
            int i78 = iCharAt10;
            char c4 = 55296;
            if (iCharAt11 >= 55296) {
                int i79 = iCharAt11 & 8191;
                int i80 = 13;
                while (true) {
                    i34 = i77 + 1;
                    cCharAt11 = str.charAt(i77);
                    if (cCharAt11 < c4) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i80;
                    i80 += 13;
                    i77 = i34;
                    c4 = 55296;
                }
                iCharAt11 = i79 | (cCharAt11 << i80);
                i77 = i34;
            }
            int i81 = iCharAt11 & 255;
            int i82 = i15;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            int[] iArr4 = iArr3;
            if (i81 >= 51) {
                int i83 = i77 + 1;
                int iCharAt12 = str.charAt(i77);
                char c5 = 55296;
                if (iCharAt12 >= 55296) {
                    int i84 = iCharAt12 & 8191;
                    int i85 = 13;
                    while (true) {
                        i33 = i83 + 1;
                        cCharAt10 = str.charAt(i83);
                        if (cCharAt10 < c5) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i83 = i33;
                        c5 = 55296;
                    }
                    iCharAt12 = i84 | (cCharAt10 << i85);
                    i83 = i33;
                }
                int i86 = i81 - 51;
                int i87 = iCharAt12;
                if (i86 == 9 || i86 == 17) {
                    objArr2[defpackage.e.e(i71, 3, 2, 1)] = objArr[i14];
                    i14++;
                } else if (i86 == 12 && (r3Var.getSyntax().equals(ProtoSyntax.PROTO2) || (iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0)) {
                    objArr2[defpackage.e.e(i71, 3, 2, 1)] = objArr[i14];
                    i14++;
                }
                int i88 = i87 * 2;
                Object obj = objArr[i88];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldO2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldO2 = O(cls, (String) obj);
                    objArr[i88] = fieldO2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldO2);
                int i89 = i88 + 1;
                Object obj2 = objArr[i89];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldO3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldO3 = O(cls, (String) obj2);
                    objArr[i89] = fieldO3;
                }
                i31 = iObjectFieldOffset3;
                i29 = i83;
                i27 = i68;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO3);
                i30 = 0;
            } else {
                int i90 = i14 + 1;
                java.lang.reflect.Field fieldO4 = O(cls, (String) objArr[i14]);
                if (i81 == 9 || i81 == 17) {
                    i27 = i68;
                    objArr2[defpackage.e.e(i71, 3, 2, 1)] = fieldO4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i27 = i68;
                        i32 = i14 + 2;
                        objArr2[defpackage.e.e(i71, 3, 2, 1)] = objArr[i90];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i27 = i68;
                        if (r3Var.getSyntax() == ProtoSyntax.PROTO2 || (iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                            i32 = i14 + 2;
                            objArr2[defpackage.e.e(i71, 3, 2, 1)] = objArr[i90];
                        }
                    } else {
                        if (i81 == 50) {
                            int i91 = i70 + 1;
                            iArr[i70] = i71;
                            int i92 = (i71 / 3) * 2;
                            int i93 = i14 + 2;
                            objArr2[i92] = objArr[i90];
                            if ((iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                                i28 = i14 + 3;
                                objArr2[i92 + 1] = objArr[i93];
                                i27 = i68;
                                i70 = i91;
                            } else {
                                i28 = i93;
                                i70 = i91;
                                i27 = i68;
                            }
                        } else {
                            i27 = i68;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                        if ((iCharAt11 & 4096) != 0 || i81 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i77;
                            i30 = 0;
                        } else {
                            int i94 = i77 + 1;
                            int iCharAt13 = str.charAt(i77);
                            if (iCharAt13 >= 55296) {
                                int i95 = iCharAt13 & 8191;
                                int i96 = 13;
                                while (true) {
                                    i29 = i94 + 1;
                                    cCharAt9 = str.charAt(i94);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i95 |= (cCharAt9 & 8191) << i96;
                                    i96 += 13;
                                    i94 = i29;
                                }
                                iCharAt13 = i95 | (cCharAt9 << i96);
                            } else {
                                i29 = i94;
                            }
                            int i97 = (iCharAt13 / 32) + (i82 * 2);
                            Object obj3 = objArr[i97];
                            if (obj3 instanceof java.lang.reflect.Field) {
                                fieldO = (java.lang.reflect.Field) obj3;
                            } else {
                                fieldO = O(cls, (String) obj3);
                                objArr[i97] = fieldO;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldO);
                            i30 = iCharAt13 % 32;
                        }
                        if (i81 >= 18 && i81 <= 49) {
                            iArr[i69] = iObjectFieldOffset;
                            i69++;
                        }
                        i14 = i28;
                        i31 = iObjectFieldOffset;
                    }
                    i28 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i77;
                        i30 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i77;
                        i30 = 0;
                    }
                    if (i81 >= 18) {
                        iArr[i69] = iObjectFieldOffset;
                        i69++;
                    }
                    i14 = i28;
                    i31 = iObjectFieldOffset;
                }
                i28 = i90;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldO4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i77;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i77;
                    i30 = 0;
                }
                if (i81 >= 18) {
                    iArr[i69] = iObjectFieldOffset;
                    i69++;
                }
                i14 = i28;
                i31 = iObjectFieldOffset;
            }
            int i98 = i71 + 1;
            iArr4[i71] = i78;
            int i99 = i71 + 2;
            String str2 = str;
            iArr4[i98] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | ((iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | i31;
            i71 += 3;
            iArr4[i99] = (i30 << 20) | iObjectFieldOffset2;
            str = str2;
            i15 = i82;
            length = i25;
            i68 = i27;
            i39 = i29;
            iArr3 = iArr4;
            i37 = 55296;
        }
        MessageLite messageLite = r3Var.f24932a;
        r3Var.getSyntax();
        return new d3(iArr3, objArr2, i11, i13, messageLite, false, iArr, i16, i68, h3Var, p2Var, q4Var, i1Var, x2Var);
    }

    public static long D(int i10) {
        return i10 & 1048575;
    }

    public static int E(long j10, Object obj) {
        return ((Integer) x4.f25021c.m(j10, obj)).intValue();
    }

    public static long F(long j10, Object obj) {
        return ((Long) x4.f25021c.m(j10, obj)).longValue();
    }

    public static java.lang.reflect.Field O(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
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

    public static int U(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    public static void Y(int i10, Object obj, l5 l5Var) throws IOException {
        if (obj instanceof String) {
            ((l0) l5Var).f24893a.writeString(i10, (String) obj);
        } else {
            ((l0) l5Var).a(i10, (ByteString) obj);
        }
    }

    public static void l(Object obj) {
        if (u(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int m(byte[] bArr, int i10, int i11, WireFormat.FieldType fieldType, Class cls, g gVar) throws InvalidProtocolBufferException {
        switch (c3.f24788a[fieldType.ordinal()]) {
            case 1:
                int iT = h.t(bArr, i10, gVar);
                gVar.f24838c = Boolean.valueOf(gVar.f24837b != 0);
                return iT;
            case 2:
                return h.a(bArr, i10, gVar);
            case 3:
                gVar.f24838c = Double.valueOf(Double.longBitsToDouble(h.c(i10, bArr)));
                return i10 + 8;
            case 4:
            case 5:
                gVar.f24838c = Integer.valueOf(h.b(i10, bArr));
                return i10 + 4;
            case 6:
            case 7:
                gVar.f24838c = Long.valueOf(h.c(i10, bArr));
                return i10 + 8;
            case 8:
                gVar.f24838c = Float.valueOf(Float.intBitsToFloat(h.b(i10, bArr)));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int iR = h.r(bArr, i10, gVar);
                gVar.f24838c = Integer.valueOf(gVar.f24836a);
                return iR;
            case 12:
            case 13:
                int iT2 = h.t(bArr, i10, gVar);
                gVar.f24838c = Long.valueOf(gVar.f24837b);
                return iT2;
            case 14:
                return h.e(p3.f24916c.a(cls), bArr, i10, i11, gVar);
            case 15:
                int iR2 = h.r(bArr, i10, gVar);
                gVar.f24838c = Integer.valueOf(CodedInputStream.decodeZigZag32(gVar.f24836a));
                return iR2;
            case 16:
                int iT3 = h.t(bArr, i10, gVar);
                gVar.f24838c = Long.valueOf(CodedInputStream.decodeZigZag64(gVar.f24837b));
                return iT3;
            case 17:
                int iR3 = h.r(bArr, i10, gVar);
                int i12 = gVar.f24836a;
                if (i12 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                if (i12 == 0) {
                    gVar.f24838c = "";
                    return iR3;
                }
                gVar.f24838c = a5.f24770a.d(bArr, iR3, i12);
                return iR3 + i12;
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static UnknownFieldSetLite r(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLiteNewInstance = UnknownFieldSetLite.newInstance();
        generatedMessageLite.unknownFields = unknownFieldSetLiteNewInstance;
        return unknownFieldSetLiteNewInstance;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public final Object A(int i10, int i11, Object obj) {
        x3 x3VarQ = q(i11);
        if (!v(i10, i11, obj)) {
            return x3VarQ.d();
        }
        Object object = f24798r.getObject(obj, V(i11) & 1048575);
        if (u(object)) {
            return object;
        }
        Object objD = x3VarQ.d();
        if (object != null) {
            x3VarQ.a(objD, object);
        }
        return objD;
    }

    public final int G(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, g gVar) throws InvalidProtocolBufferException {
        int iM;
        Unsafe unsafe = f24798r;
        Object objP = p(i12);
        Object object = unsafe.getObject(obj, j10);
        this.f24813p.getClass();
        if (!((MapFieldLite) object).isMutable()) {
            MapFieldLite mapFieldLiteMutableCopy = MapFieldLite.emptyMapField().mutableCopy();
            x2.a(mapFieldLiteMutableCopy, object);
            unsafe.putObject(obj, j10, mapFieldLiteMutableCopy);
            object = mapFieldLiteMutableCopy;
        }
        w2 metadata = ((MapEntryLite) objP).getMetadata();
        MapFieldLite mapFieldLite = (MapFieldLite) object;
        int iR = h.r(bArr, i10, gVar);
        int i13 = gVar.f24836a;
        if (i13 < 0 || i13 > i11 - iR) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i14 = iR + i13;
        Object obj2 = metadata.f24989b;
        Object obj3 = metadata.f24991d;
        Object obj4 = obj2;
        Object obj5 = obj3;
        while (iR < i14) {
            int iQ = iR + 1;
            int i15 = bArr[iR];
            if (i15 < 0) {
                iQ = h.q(i15, bArr, iQ, gVar);
                i15 = gVar.f24836a;
            }
            int i16 = i15 >>> 3;
            int i17 = i15 & 7;
            if (i16 != 1) {
                if (i16 == 2 && i17 == metadata.f24990c.getWireType()) {
                    iM = m(bArr, iQ, i11, metadata.f24990c, obj3.getClass(), gVar);
                    obj5 = gVar.f24838c;
                    iR = iM;
                } else {
                    iR = h.w(i15, bArr, iQ, i11, gVar);
                }
            } else if (i17 == metadata.f24988a.getWireType()) {
                iM = m(bArr, iQ, i11, metadata.f24988a, null, gVar);
                obj4 = gVar.f24838c;
                iR = iM;
            } else {
                iR = h.w(i15, bArr, iQ, i11, gVar);
            }
        }
        if (iR != i14) {
            throw InvalidProtocolBufferException.parseFailure();
        }
        mapFieldLite.put(obj4, obj5);
        return i14;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23761. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int H(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.g r36) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 2376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d3.H(java.lang.Object, byte[], int, int, int, com.google.protobuf.g):int");
    }

    public final int I(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, g gVar) throws InvalidProtocolBufferException {
        Unsafe unsafe = f24798r;
        long j11 = this.f24799a[i17 + 2] & 1048575;
        switch (i16) {
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(h.c(i10, bArr))));
                int i18 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i18;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(h.b(i10, bArr))));
                int i19 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i19;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iT = h.t(bArr, i10, gVar);
                unsafe.putObject(obj, j10, Long.valueOf(gVar.f24837b));
                unsafe.putInt(obj, j11, i13);
                return iT;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iR = h.r(bArr, i10, gVar);
                unsafe.putObject(obj, j10, Integer.valueOf(gVar.f24836a));
                unsafe.putInt(obj, j11, i13);
                return iR;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Long.valueOf(h.c(i10, bArr)));
                int i20 = i10 + 8;
                unsafe.putInt(obj, j11, i13);
                return i20;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(h.b(i10, bArr)));
                int i21 = i10 + 4;
                unsafe.putInt(obj, j11, i13);
                return i21;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iT2 = h.t(bArr, i10, gVar);
                unsafe.putObject(obj, j10, Boolean.valueOf(gVar.f24837b != 0));
                unsafe.putInt(obj, j11, i13);
                return iT2;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                if (i14 != 2) {
                    return i10;
                }
                int iR2 = h.r(bArr, i10, gVar);
                int i22 = gVar.f24836a;
                if (i22 == 0) {
                    unsafe.putObject(obj, j10, "");
                } else {
                    if ((i15 & 536870912) != 0) {
                        if (!a5.f24770a.j(bArr, iR2, iR2 + i22)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                    }
                    unsafe.putObject(obj, j10, new String(bArr, iR2, i22, Internal.UTF_8));
                    iR2 += i22;
                }
                unsafe.putInt(obj, j11, i13);
                return iR2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objA = A(i13, i17, obj);
                int iV = h.v(objA, q(i17), bArr, i10, i11, gVar);
                T(i13, i17, obj, objA);
                return iV;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                if (i14 != 2) {
                    return i10;
                }
                int iA = h.a(bArr, i10, gVar);
                unsafe.putObject(obj, j10, gVar.f24838c);
                unsafe.putInt(obj, j11, i13);
                return iA;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                if (i14 != 0) {
                    return i10;
                }
                int iR3 = h.r(bArr, i10, gVar);
                int i23 = gVar.f24836a;
                Internal.EnumVerifier enumVerifierO = o(i17);
                if (enumVerifierO != null && !enumVerifierO.isInRange(i23)) {
                    r(obj).storeField(i12, Long.valueOf(i23));
                    return iR3;
                }
                unsafe.putObject(obj, j10, Integer.valueOf(i23));
                unsafe.putInt(obj, j11, i13);
                return iR3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iR4 = h.r(bArr, i10, gVar);
                unsafe.putObject(obj, j10, Integer.valueOf(CodedInputStream.decodeZigZag32(gVar.f24836a)));
                unsafe.putInt(obj, j11, i13);
                return iR4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iT3 = h.t(bArr, i10, gVar);
                unsafe.putObject(obj, j10, Long.valueOf(CodedInputStream.decodeZigZag64(gVar.f24837b)));
                unsafe.putInt(obj, j11, i13);
                return iT3;
            case 68:
                if (i14 == 3) {
                    Object objA2 = A(i13, i17, obj);
                    int iU = h.u(objA2, q(i17), bArr, i10, i11, (i12 & (-8)) | 4, gVar);
                    T(i13, i17, obj, objA2);
                    return iU;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int J(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, g gVar) throws InvalidProtocolBufferException {
        int iS;
        Unsafe unsafe = f24798r;
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = (Internal.ProtobufList) unsafe.getObject(obj, j11);
        if (!protobufListMutableCopyWithCapacity2.isModifiable()) {
            int size = protobufListMutableCopyWithCapacity2.size();
            protobufListMutableCopyWithCapacity2 = protobufListMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j11, protobufListMutableCopyWithCapacity2);
        }
        Internal.ProtobufList protobufList = protobufListMutableCopyWithCapacity2;
        switch (i16) {
            case 18:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                if (i14 == 2) {
                    return h.h(bArr, i10, protobufList, gVar);
                }
                if (i14 == 1) {
                    z0 z0Var = (z0) protobufList;
                    z0Var.addDouble(Double.longBitsToDouble(h.c(i10, bArr)));
                    int i17 = i10 + 8;
                    while (i17 < i11) {
                        int iR = h.r(bArr, i17, gVar);
                        if (i12 != gVar.f24836a) {
                            return i17;
                        }
                        z0Var.addDouble(Double.longBitsToDouble(h.c(iR, bArr)));
                        i17 = iR + 8;
                    }
                    return i17;
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return h.k(bArr, i10, protobufList, gVar);
                }
                if (i14 == 5) {
                    y1 y1Var = (y1) protobufList;
                    y1Var.addFloat(Float.intBitsToFloat(h.b(i10, bArr)));
                    int i18 = i10 + 4;
                    while (i18 < i11) {
                        int iR2 = h.r(bArr, i18, gVar);
                        if (i12 != gVar.f24836a) {
                            return i18;
                        }
                        y1Var.addFloat(Float.intBitsToFloat(h.b(iR2, bArr)));
                        i18 = iR2 + 4;
                    }
                    return i18;
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                if (i14 == 2) {
                    r2 r2Var = (r2) protobufList;
                    int iR3 = h.r(bArr, i10, gVar);
                    int i19 = gVar.f24836a + iR3;
                    while (iR3 < i19) {
                        iR3 = h.t(bArr, iR3, gVar);
                        r2Var.addLong(gVar.f24837b);
                    }
                    if (iR3 == i19) {
                        return iR3;
                    }
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i14 == 0) {
                    r2 r2Var2 = (r2) protobufList;
                    int iT = h.t(bArr, i10, gVar);
                    r2Var2.addLong(gVar.f24837b);
                    while (iT < i11) {
                        int iR4 = h.r(bArr, iT, gVar);
                        if (i12 != gVar.f24836a) {
                            return iT;
                        }
                        iT = h.t(bArr, iR4, gVar);
                        r2Var2.addLong(gVar.f24837b);
                    }
                    return iT;
                }
                return i10;
            case 22:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
            case 39:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                if (i14 == 2) {
                    return h.n(bArr, i10, protobufList, gVar);
                }
                if (i14 == 0) {
                    return h.s(i12, bArr, i10, i11, protobufList, gVar);
                }
                return i10;
            case 23:
            case 32:
            case 40:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                if (i14 == 2) {
                    return h.j(bArr, i10, protobufList, gVar);
                }
                if (i14 == 1) {
                    r2 r2Var3 = (r2) protobufList;
                    r2Var3.addLong(h.c(i10, bArr));
                    int i20 = i10 + 8;
                    while (i20 < i11) {
                        int iR5 = h.r(bArr, i20, gVar);
                        if (i12 != gVar.f24836a) {
                            return i20;
                        }
                        r2Var3.addLong(h.c(iR5, bArr));
                        i20 = iR5 + 8;
                    }
                    return i20;
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return h.i(bArr, i10, protobufList, gVar);
                }
                if (i14 == 5) {
                    f2 f2Var = (f2) protobufList;
                    f2Var.addInt(h.b(i10, bArr));
                    int i21 = i10 + 4;
                    while (i21 < i11) {
                        int iR6 = h.r(bArr, i21, gVar);
                        if (i12 != gVar.f24836a) {
                            return i21;
                        }
                        f2Var.addInt(h.b(iR6, bArr));
                        i21 = iR6 + 4;
                    }
                    return i21;
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return h.g(bArr, i10, protobufList, gVar);
                }
                if (i14 == 0) {
                    j jVar = (j) protobufList;
                    int iT2 = h.t(bArr, i10, gVar);
                    jVar.addBoolean(gVar.f24837b != 0);
                    while (iT2 < i11) {
                        int iR7 = h.r(bArr, iT2, gVar);
                        if (i12 != gVar.f24836a) {
                            return iT2;
                        }
                        iT2 = h.t(bArr, iR7, gVar);
                        jVar.addBoolean(gVar.f24837b != 0);
                    }
                    return iT2;
                }
                return i10;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                if (i14 == 2) {
                    if ((j10 & 536870912) == 0) {
                        int iR8 = h.r(bArr, i10, gVar);
                        int i22 = gVar.f24836a;
                        if (i22 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i22 == 0) {
                            protobufList.add("");
                        } else {
                            protobufList.add(new String(bArr, iR8, i22, Internal.UTF_8));
                            iR8 += i22;
                        }
                        while (iR8 < i11) {
                            int iR9 = h.r(bArr, iR8, gVar);
                            if (i12 != gVar.f24836a) {
                                return iR8;
                            }
                            iR8 = h.r(bArr, iR9, gVar);
                            int i23 = gVar.f24836a;
                            if (i23 < 0) {
                                throw InvalidProtocolBufferException.negativeSize();
                            }
                            if (i23 == 0) {
                                protobufList.add("");
                            } else {
                                protobufList.add(new String(bArr, iR8, i23, Internal.UTF_8));
                                iR8 += i23;
                            }
                        }
                        return iR8;
                    }
                    int iR10 = h.r(bArr, i10, gVar);
                    int i24 = gVar.f24836a;
                    if (i24 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i24 == 0) {
                        protobufList.add("");
                    } else {
                        int i25 = iR10 + i24;
                        if (!a5.f24770a.j(bArr, iR10, i25)) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        protobufList.add(new String(bArr, iR10, i24, Internal.UTF_8));
                        iR10 = i25;
                    }
                    while (iR10 < i11) {
                        int iR11 = h.r(bArr, iR10, gVar);
                        if (i12 != gVar.f24836a) {
                            return iR10;
                        }
                        iR10 = h.r(bArr, iR11, gVar);
                        int i26 = gVar.f24836a;
                        if (i26 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i26 == 0) {
                            protobufList.add("");
                        } else {
                            int i27 = iR10 + i26;
                            if (!a5.f24770a.j(bArr, iR10, i27)) {
                                throw InvalidProtocolBufferException.invalidUtf8();
                            }
                            protobufList.add(new String(bArr, iR10, i26, Internal.UTF_8));
                            iR10 = i27;
                        }
                    }
                    return iR10;
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return h.f(q(i15), i12, bArr, i10, i11, protobufList, gVar);
                }
                return i10;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                if (i14 == 2) {
                    int iR12 = h.r(bArr, i10, gVar);
                    int i28 = gVar.f24836a;
                    if (i28 < 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    if (i28 > bArr.length - iR12) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if (i28 == 0) {
                        protobufList.add(ByteString.EMPTY);
                    } else {
                        protobufList.add(ByteString.copyFrom(bArr, iR12, i28));
                        iR12 += i28;
                    }
                    while (iR12 < i11) {
                        int iR13 = h.r(bArr, iR12, gVar);
                        if (i12 != gVar.f24836a) {
                            return iR12;
                        }
                        iR12 = h.r(bArr, iR13, gVar);
                        int i29 = gVar.f24836a;
                        if (i29 < 0) {
                            throw InvalidProtocolBufferException.negativeSize();
                        }
                        if (i29 > bArr.length - iR12) {
                            throw InvalidProtocolBufferException.truncatedMessage();
                        }
                        if (i29 == 0) {
                            protobufList.add(ByteString.EMPTY);
                        } else {
                            protobufList.add(ByteString.copyFrom(bArr, iR12, i29));
                            iR12 += i29;
                        }
                    }
                    return iR12;
                }
                return i10;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iS = h.s(i12, bArr, i10, i11, protobufList, gVar);
                    }
                    return i10;
                }
                iS = h.n(bArr, i10, protobufList, gVar);
                y3.k(obj, i13, protobufList, o(i15), null, this.f24811n);
                return iS;
            case 33:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                if (i14 == 2) {
                    return h.l(bArr, i10, protobufList, gVar);
                }
                if (i14 == 0) {
                    f2 f2Var2 = (f2) protobufList;
                    int iR14 = h.r(bArr, i10, gVar);
                    f2Var2.addInt(CodedInputStream.decodeZigZag32(gVar.f24836a));
                    while (iR14 < i11) {
                        int iR15 = h.r(bArr, iR14, gVar);
                        if (i12 != gVar.f24836a) {
                            return iR14;
                        }
                        iR14 = h.r(bArr, iR15, gVar);
                        f2Var2.addInt(CodedInputStream.decodeZigZag32(gVar.f24836a));
                    }
                    return iR14;
                }
                return i10;
            case 34:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                if (i14 == 2) {
                    return h.m(bArr, i10, protobufList, gVar);
                }
                if (i14 == 0) {
                    r2 r2Var4 = (r2) protobufList;
                    int iT3 = h.t(bArr, i10, gVar);
                    r2Var4.addLong(CodedInputStream.decodeZigZag64(gVar.f24837b));
                    while (iT3 < i11) {
                        int iR16 = h.r(bArr, iT3, gVar);
                        if (i12 != gVar.f24836a) {
                            return iT3;
                        }
                        iT3 = h.t(bArr, iR16, gVar);
                        r2Var4.addLong(CodedInputStream.decodeZigZag64(gVar.f24837b));
                    }
                    return iT3;
                }
                return i10;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                if (i14 == 3) {
                    x3 x3VarQ = q(i15);
                    int i30 = (i12 & (-8)) | 4;
                    int iD = h.d(x3VarQ, bArr, i10, i11, i30, gVar);
                    int i31 = i30;
                    protobufList.add(gVar.f24838c);
                    while (iD < i11) {
                        int iR17 = h.r(bArr, iD, gVar);
                        if (i12 != gVar.f24836a) {
                            return iD;
                        }
                        int i32 = i31;
                        iD = h.d(x3VarQ, bArr, iR17, i11, i32, gVar);
                        protobufList.add(gVar.f24838c);
                        i31 = i32;
                    }
                    return iD;
                }
                return i10;
            default:
                return i10;
        }
    }

    public final void K(Object obj, long j10, b0 b0Var, x3 x3Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        List listC = this.f24810m.c(j10, obj);
        CodedInputStream codedInputStream = b0Var.f24771a;
        if (WireFormat.getTagWireType(b0Var.f24772b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i10 = b0Var.f24772b;
        do {
            Object objD = x3Var.d();
            b0Var.b(objD, x3Var, extensionRegistryLite);
            x3Var.b(objD);
            listC.add(objD);
            if (codedInputStream.isAtEnd() || b0Var.f24774d != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i10);
        b0Var.f24774d = tag;
    }

    public final void L(Object obj, int i10, b0 b0Var, x3 x3Var, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int tag;
        List listC = this.f24810m.c(i10 & 1048575, obj);
        CodedInputStream codedInputStream = b0Var.f24771a;
        if (WireFormat.getTagWireType(b0Var.f24772b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i11 = b0Var.f24772b;
        do {
            Object objD = x3Var.d();
            b0Var.c(objD, x3Var, extensionRegistryLite);
            x3Var.b(objD);
            listC.add(objD);
            if (codedInputStream.isAtEnd() || b0Var.f24774d != 0) {
                return;
            } else {
                tag = codedInputStream.readTag();
            }
        } while (tag == i11);
        b0Var.f24774d = tag;
    }

    public final void M(Object obj, int i10, b0 b0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((536870912 & i10) != 0) {
            b0Var.x(2);
            x4.s(obj, i10 & 1048575, b0Var.f24771a.readStringRequireUtf8());
        } else if (!this.f24805g) {
            x4.s(obj, i10 & 1048575, b0Var.e());
        } else {
            b0Var.x(2);
            x4.s(obj, i10 & 1048575, b0Var.f24771a.readString());
        }
    }

    public final void N(Object obj, int i10, b0 b0Var) throws IOException {
        int i11 = 536870912 & i10;
        p2 p2Var = this.f24810m;
        if (i11 != 0) {
            b0Var.t(p2Var.c(i10 & 1048575, obj), true);
        } else {
            b0Var.t(p2Var.c(i10 & 1048575, obj), false);
        }
    }

    public final void P(int i10, Object obj) {
        int i11 = this.f24799a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        x4.q((1 << (i11 >>> 20)) | x4.f25021c.j(j10, obj), j10, obj);
    }

    public final void Q(int i10, int i11, Object obj) {
        x4.q(i10, this.f24799a[i11 + 2] & 1048575, obj);
    }

    public final int R(int i10, int i11) {
        int[] iArr = this.f24799a;
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

    public final void S(int i10, Object obj, Object obj2) {
        f24798r.putObject(obj, V(i10) & 1048575, obj2);
        P(i10, obj);
    }

    public final void T(int i10, int i11, Object obj, Object obj2) {
        f24798r.putObject(obj, V(i11) & 1048575, obj2);
        Q(i10, i11, obj);
    }

    public final int V(int i10) {
        return this.f24799a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x002b  */
    public final void W(Object obj, l5 l5Var) throws IOException {
        Map.Entry entry;
        Iterator it;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11;
        d3 d3Var = this;
        boolean z12 = d3Var.f24804f;
        i1 i1Var = d3Var.f24812o;
        if (z12) {
            ((k1) i1Var).getClass();
            v1 v1Var = ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
            if (v1Var.f24965a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itL = v1Var.l();
                entry = (Map.Entry) itL.next();
                it = itL;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = d3Var.f24799a;
        int length = iArr.length;
        Unsafe unsafe = f24798r;
        int i15 = 0;
        int i16 = 1048575;
        int i17 = 0;
        while (i15 < length) {
            int iV = d3Var.V(i15);
            int i18 = iArr[i15];
            int iU = U(iV);
            Map.Entry entry2 = entry;
            if (iU <= 17) {
                int i19 = iArr[i15 + 2];
                z10 = true;
                int i20 = i19 & 1048575;
                if (i20 != i16) {
                    i17 = i20 == 1048575 ? 0 : unsafe.getInt(obj, i20);
                    i16 = i20;
                }
                int i21 = 1 << (i19 >>> 20);
                int i22 = i17;
                i12 = i21;
                i11 = i16;
                i10 = i22;
            } else {
                int i23 = i16;
                z10 = true;
                i10 = i17;
                i11 = i23;
                i12 = 0;
            }
            while (true) {
                if (entry2 != null) {
                    ((k1) i1Var).getClass();
                    i13 = i11;
                    if (((c2) entry2.getKey()).f24784b <= i18) {
                        i1Var.b(l5Var, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                        i11 = i13;
                    }
                } else {
                    i13 = i11;
                }
            }
            int i24 = iV & 1048575;
            Iterator it2 = it;
            int[] iArr2 = iArr;
            long j10 = i24;
            switch (iU) {
                case 0:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeDouble(i18, x4.f25021c.h(j10, obj));
                    }
                    break;
                case 1:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeFloat(i18, x4.f25021c.i(j10, obj));
                    }
                    d3Var = this;
                    break;
                case 2:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f(i18, unsafe.getLong(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 3:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeUInt64(i18, unsafe.getLong(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 4:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).e(i18, unsafe.getInt(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 5:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).c(i18, unsafe.getLong(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 6:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).b(i18, unsafe.getInt(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 7:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeBool(i18, x4.f25021c.e(j10, obj));
                    }
                    d3Var = this;
                    break;
                case 8:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        Y(i18, unsafe.getObject(obj, j10), l5Var);
                    }
                    d3Var = this;
                    break;
                case 9:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).g(i18, unsafe.getObject(obj, j10), d3Var.q(i15));
                    }
                    break;
                case 10:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).a(i18, (ByteString) unsafe.getObject(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 11:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeUInt32(i18, unsafe.getInt(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 12:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeEnum(i18, unsafe.getInt(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 13:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeSFixed32(i18, unsafe.getInt(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 14:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeSFixed64(i18, unsafe.getLong(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 15:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeSInt32(i18, unsafe.getInt(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 16:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).f24893a.writeSInt64(i18, unsafe.getLong(obj, j10));
                    }
                    d3Var = this;
                    break;
                case 17:
                    i14 = i13;
                    if (d3Var.t(obj, i15, i14, i10, i12)) {
                        ((l0) l5Var).d(i18, unsafe.getObject(obj, j10), d3Var.q(i15));
                    }
                    break;
                case 18:
                    y3.q(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 19:
                    y3.u(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 20:
                    y3.x(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 21:
                    y3.F(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 22:
                    y3.w(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 23:
                    y3.t(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 24:
                    y3.s(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 25:
                    y3.o(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    y3.D(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var);
                    i14 = i13;
                    break;
                case 27:
                    y3.y(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, d3Var.q(i15));
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    y3.p(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    z11 = false;
                    y3.E(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    z11 = false;
                    y3.r(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 31:
                    z11 = false;
                    y3.z(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 32:
                    z11 = false;
                    y3.A(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 33:
                    z11 = false;
                    y3.B(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case 34:
                    z11 = false;
                    y3.C(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, false);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    y3.q(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case 36:
                    y3.u(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case 37:
                    y3.x(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    y3.F(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case 39:
                    y3.w(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case 40:
                    y3.t(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case 41:
                    y3.s(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case 42:
                    y3.o(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    y3.E(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case 44:
                    y3.r(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case 45:
                    y3.z(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    y3.A(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    y3.B(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    y3.C(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, z10);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    y3.v(iArr2[i15], (List) unsafe.getObject(obj, j10), l5Var, d3Var.q(i15));
                    i14 = i13;
                    break;
                case 50:
                    d3Var.X(l5Var, i18, unsafe.getObject(obj, j10), i15);
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeDouble(i18, ((Double) x4.f25021c.m(j10, obj)).doubleValue());
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeFloat(i18, ((Float) x4.f25021c.m(j10, obj)).floatValue());
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f(i18, F(j10, obj));
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeUInt64(i18, F(j10, obj));
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).e(i18, E(j10, obj));
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).c(i18, F(j10, obj));
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).b(i18, E(j10, obj));
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeBool(i18, ((Boolean) x4.f25021c.m(j10, obj)).booleanValue());
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        Y(i18, unsafe.getObject(obj, j10), l5Var);
                    }
                    i14 = i13;
                    break;
                case 60:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).g(i18, unsafe.getObject(obj, j10), d3Var.q(i15));
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).a(i18, (ByteString) unsafe.getObject(obj, j10));
                    }
                    i14 = i13;
                    break;
                case 62:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeUInt32(i18, E(j10, obj));
                    }
                    i14 = i13;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeEnum(i18, E(j10, obj));
                    }
                    i14 = i13;
                    break;
                case 64:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeSFixed32(i18, E(j10, obj));
                    }
                    i14 = i13;
                    break;
                case 65:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeSFixed64(i18, F(j10, obj));
                    }
                    i14 = i13;
                    break;
                case 66:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeSInt32(i18, E(j10, obj));
                    }
                    i14 = i13;
                    break;
                case 67:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).f24893a.writeSInt64(i18, F(j10, obj));
                    }
                    i14 = i13;
                    break;
                case 68:
                    if (d3Var.v(i18, i15, obj)) {
                        ((l0) l5Var).d(i18, unsafe.getObject(obj, j10), d3Var.q(i15));
                    }
                    i14 = i13;
                    break;
                default:
                    i14 = i13;
                    break;
            }
            i15 += 3;
            i17 = i10;
            it = it2;
            iArr = iArr2;
            i16 = i14;
            entry = entry2;
        }
        Iterator it3 = it;
        while (entry != null) {
            i1Var.b(l5Var, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        ((r4) d3Var.f24811n).getClass();
        ((GeneratedMessageLite) obj).unknownFields.writeTo(l5Var);
    }

    public final void X(l5 l5Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            Object objP = p(i11);
            this.f24813p.getClass();
            w2 metadata = ((MapEntryLite) objP).getMetadata();
            MapFieldLite mapFieldLite = (MapFieldLite) obj;
            l0 l0Var = (l0) l5Var;
            CodedOutputStream codedOutputStream = l0Var.f24893a;
            CodedOutputStream codedOutputStream2 = l0Var.f24893a;
            if (!codedOutputStream.isSerializationDeterministic()) {
                Iterator it = mapFieldLite.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    codedOutputStream.writeTag(i10, 2);
                    codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                    MapEntryLite.writeTo(codedOutputStream, metadata, entry.getKey(), entry.getValue());
                }
                return;
            }
            int i12 = 0;
            switch (k0.f24885a[metadata.f24988a.ordinal()]) {
                case 1:
                    Boolean bool = Boolean.FALSE;
                    V v4 = mapFieldLite.get(bool);
                    if (v4 != 0) {
                        codedOutputStream2.writeTag(i10, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool, v4));
                        MapEntryLite.writeTo(codedOutputStream2, metadata, bool, v4);
                    }
                    Boolean bool2 = Boolean.TRUE;
                    V v8 = mapFieldLite.get(bool2);
                    if (v8 != 0) {
                        codedOutputStream2.writeTag(i10, 2);
                        codedOutputStream2.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, bool2, v8));
                        MapEntryLite.writeTo(codedOutputStream2, metadata, bool2, v8);
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    int size = mapFieldLite.size();
                    int[] iArr = new int[size];
                    Iterator it2 = mapFieldLite.keySet().iterator();
                    int i13 = 0;
                    while (it2.hasNext()) {
                        iArr[i13] = ((Integer) it2.next()).intValue();
                        i13++;
                    }
                    Arrays.sort(iArr);
                    while (i12 < size) {
                        int i14 = iArr[i12];
                        V v10 = mapFieldLite.get(Integer.valueOf(i14));
                        codedOutputStream.writeTag(i10, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Integer.valueOf(i14), v10));
                        MapEntryLite.writeTo(codedOutputStream, metadata, Integer.valueOf(i14), v10);
                        i12++;
                    }
                    return;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    int size2 = mapFieldLite.size();
                    long[] jArr = new long[size2];
                    Iterator it3 = mapFieldLite.keySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        jArr[i15] = ((Long) it3.next()).longValue();
                        i15++;
                    }
                    Arrays.sort(jArr);
                    while (i12 < size2) {
                        long j10 = jArr[i12];
                        V v11 = mapFieldLite.get(Long.valueOf(j10));
                        codedOutputStream.writeTag(i10, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, Long.valueOf(j10), v11));
                        MapEntryLite.writeTo(codedOutputStream, metadata, Long.valueOf(j10), v11);
                        i12++;
                    }
                    return;
                case 12:
                    int size3 = mapFieldLite.size();
                    String[] strArr = new String[size3];
                    Iterator it4 = mapFieldLite.keySet().iterator();
                    int i16 = 0;
                    while (it4.hasNext()) {
                        strArr[i16] = (String) it4.next();
                        i16++;
                    }
                    Arrays.sort(strArr);
                    while (i12 < size3) {
                        String str = strArr[i12];
                        V v12 = mapFieldLite.get(str);
                        codedOutputStream.writeTag(i10, 2);
                        codedOutputStream.writeUInt32NoTag(MapEntryLite.computeSerializedSize(metadata, str, v12));
                        MapEntryLite.writeTo(codedOutputStream, metadata, str, v12);
                        i12++;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("does not support key type: " + metadata.f24988a);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.protobuf.x3
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f24799a;
            if (i10 >= iArr.length) {
                Object obj4 = obj;
                y3.l(this.f24811n, obj4, obj2);
                if (this.f24804f) {
                    ((k1) this.f24812o).getClass();
                    v1 v1Var = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
                    if (v1Var.f24965a.isEmpty()) {
                        return;
                    }
                    ((GeneratedMessageLite.ExtendableMessage) obj4).ensureExtensionsAreMutable().n(v1Var);
                    return;
                }
                return;
            }
            int iV = V(i10);
            long j10 = 1048575 & iV;
            int i11 = iArr[i10];
            switch (U(iV)) {
                case 0:
                    if (!s(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        w4 w4Var = x4.f25021c;
                        obj3 = obj;
                        w4Var.r(obj3, j10, w4Var.h(j10, obj2));
                        P(i10, obj3);
                    }
                    break;
                case 1:
                    if (s(i10, obj2)) {
                        w4 w4Var2 = x4.f25021c;
                        w4Var2.s(obj, j10, w4Var2.i(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i10, obj2)) {
                        x4.r(obj, j10, x4.f25021c.l(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i10, obj2)) {
                        x4.r(obj, j10, x4.f25021c.l(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i10, obj2)) {
                        x4.q(x4.f25021c.j(j10, obj2), j10, obj);
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i10, obj2)) {
                        x4.r(obj, j10, x4.f25021c.l(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i10, obj2)) {
                        x4.q(x4.f25021c.j(j10, obj2), j10, obj);
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i10, obj2)) {
                        w4 w4Var3 = x4.f25021c;
                        w4Var3.o(obj, j10, w4Var3.e(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i10, obj2)) {
                        x4.s(obj, j10, x4.f25021c.m(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i10, obj2)) {
                        x4.s(obj, j10, x4.f25021c.m(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i10, obj2)) {
                        x4.q(x4.f25021c.j(j10, obj2), j10, obj);
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i10, obj2)) {
                        x4.q(x4.f25021c.j(j10, obj2), j10, obj);
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i10, obj2)) {
                        x4.q(x4.f25021c.j(j10, obj2), j10, obj);
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i10, obj2)) {
                        x4.r(obj, j10, x4.f25021c.l(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i10, obj2)) {
                        x4.q(x4.f25021c.j(j10, obj2), j10, obj);
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i10, obj2)) {
                        x4.r(obj, j10, x4.f25021c.l(j10, obj2));
                        P(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    x(i10, obj, obj2);
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
                    this.f24810m.b(obj, j10, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = y3.f25041a;
                    w4 w4Var4 = x4.f25021c;
                    Object objM = w4Var4.m(j10, obj);
                    Object objM2 = w4Var4.m(j10, obj2);
                    this.f24813p.getClass();
                    x4.s(obj, j10, x2.a(objM, objM2));
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
                    if (v(i11, i10, obj2)) {
                        x4.s(obj, j10, x4.f25021c.m(j10, obj2));
                        Q(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    y(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                case 62:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (v(i11, i10, obj2)) {
                        x4.s(obj, j10, x4.f25021c.m(j10, obj2));
                        Q(i11, i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    y(i10, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    @Override // com.google.protobuf.x3
    public final void b(Object obj) {
        if (u(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.f24799a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iV = V(i10);
                long j10 = 1048575 & iV;
                int iU = U(iV);
                if (iU != 9) {
                    if (iU != 60 && iU != 68) {
                        switch (iU) {
                            case 17:
                                if (s(i10, obj)) {
                                    q(i10).b(f24798r.getObject(obj, j10));
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
                                this.f24810m.a(j10, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f24798r;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    this.f24813p.getClass();
                                    ((MapFieldLite) object).makeImmutable();
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (v(iArr[i10], i10, obj)) {
                        q(i10).b(f24798r.getObject(obj, j10));
                    }
                } else if (s(i10, obj)) {
                    q(i10).b(f24798r.getObject(obj, j10));
                }
            }
            ((r4) this.f24811n).getClass();
            ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
            if (this.f24804f) {
                ((k1) this.f24812o).getClass();
                ((GeneratedMessageLite.ExtendableMessage) obj).extensions.m();
            }
        }
    }

    @Override // com.google.protobuf.x3
    public final boolean c(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f24808j) {
            int i15 = this.f24807i[i14];
            int[] iArr = this.f24799a;
            int i16 = iArr[i15];
            int iV = V(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f24798r.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                int i20 = i13;
                i10 = i12;
                i11 = i20;
            }
            if ((268435456 & iV) == 0 || t(obj, i15, i10, i11, i19)) {
                int iU = U(iV);
                if (iU == 9 || iU == 17) {
                    if (t(obj, i15, i10, i11, i19)) {
                        if (!q(i15).c(x4.f25021c.m(iV & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i14++;
                    i12 = i10;
                    i13 = i11;
                } else {
                    if (iU != 27) {
                        if (iU == 60 || iU == 68) {
                            if (v(i16, i15, obj)) {
                                if (!q(i15).c(x4.f25021c.m(iV & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i14++;
                            i12 = i10;
                            i13 = i11;
                        } else if (iU != 49) {
                            if (iU != 50) {
                                continue;
                            } else {
                                Object objM = x4.f25021c.m(iV & 1048575, obj);
                                this.f24813p.getClass();
                                MapFieldLite mapFieldLite = (MapFieldLite) objM;
                                if (!mapFieldLite.isEmpty() && ((MapEntryLite) p(i15)).getMetadata().f24990c.getJavaType() == WireFormat.JavaType.MESSAGE) {
                                    x3 x3VarA = null;
                                    for (Object obj2 : mapFieldLite.values()) {
                                        if (x3VarA == null) {
                                            x3VarA = p3.f24916c.a(obj2.getClass());
                                        }
                                        if (!x3VarA.c(obj2)) {
                                        }
                                    }
                                }
                            }
                            i14++;
                            i12 = i10;
                            i13 = i11;
                        }
                    }
                    List list = (List) x4.f25021c.m(iV & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        x3 x3VarQ = q(i15);
                        for (int i21 = 0; i21 < list.size(); i21++) {
                            if (x3VarQ.c(list.get(i21))) {
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
        if (this.f24804f) {
            ((k1) this.f24812o).getClass();
            if (!((GeneratedMessageLite.ExtendableMessage) obj).extensions.j()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.x3
    public final Object d() {
        this.l.getClass();
        return ((GeneratedMessageLite) this.f24803e).newMutableInstance();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:101:0x0309  */
    /* JADX WARN: Code duplicated, block: B:102:0x031a  */
    /* JADX WARN: Code duplicated, block: B:103:0x032b  */
    /* JADX WARN: Code duplicated, block: B:104:0x033c  */
    /* JADX WARN: Code duplicated, block: B:105:0x034d  */
    /* JADX WARN: Code duplicated, block: B:106:0x035e  */
    /* JADX WARN: Code duplicated, block: B:107:0x036f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0380  */
    /* JADX WARN: Code duplicated, block: B:109:0x0391  */
    /* JADX WARN: Code duplicated, block: B:110:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:111:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:113:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:114:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:116:0x040c  */
    /* JADX WARN: Code duplicated, block: B:117:0x041d  */
    /* JADX WARN: Code duplicated, block: B:118:0x042e  */
    /* JADX WARN: Code duplicated, block: B:119:0x043f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0450  */
    /* JADX WARN: Code duplicated, block: B:122:0x0456  */
    /* JADX WARN: Code duplicated, block: B:123:0x0467  */
    /* JADX WARN: Code duplicated, block: B:125:0x046d  */
    /* JADX WARN: Code duplicated, block: B:126:0x047c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0482  */
    /* JADX WARN: Code duplicated, block: B:129:0x0491  */
    /* JADX WARN: Code duplicated, block: B:131:0x0497  */
    /* JADX WARN: Code duplicated, block: B:132:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:135:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:137:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:138:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:140:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:141:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:143:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:144:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:146:0x0500  */
    /* JADX WARN: Code duplicated, block: B:147:0x0511  */
    /* JADX WARN: Code duplicated, block: B:149:0x0517  */
    /* JADX WARN: Code duplicated, block: B:150:0x0524  */
    /* JADX WARN: Code duplicated, block: B:152:0x052a  */
    /* JADX WARN: Code duplicated, block: B:153:0x0539  */
    /* JADX WARN: Code duplicated, block: B:155:0x053f  */
    /* JADX WARN: Code duplicated, block: B:156:0x054c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0552  */
    /* JADX WARN: Code duplicated, block: B:159:0x055e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0564  */
    /* JADX WARN: Code duplicated, block: B:162:0x0570  */
    /* JADX WARN: Code duplicated, block: B:164:0x0576  */
    /* JADX WARN: Code duplicated, block: B:165:0x0584  */
    /* JADX WARN: Code duplicated, block: B:167:0x058a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0596  */
    /* JADX WARN: Code duplicated, block: B:170:0x059c  */
    /* JADX WARN: Code duplicated, block: B:171:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:173:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:185:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:201:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x05bd A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0114  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:59:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0160  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01da  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0200  */
    /* JADX WARN: Code duplicated, block: B:86:0x0206  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0228  */
    /* JADX WARN: Code duplicated, block: B:89:0x023d  */
    /* JADX WARN: Code duplicated, block: B:90:0x024e  */
    /* JADX WARN: Code duplicated, block: B:91:0x025f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0270  */
    /* JADX WARN: Code duplicated, block: B:93:0x0281  */
    /* JADX WARN: Code duplicated, block: B:94:0x0292  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e7  */
    @Override // com.google.protobuf.x3
    public final void e(MessageLite messageLite, l5 l5Var) throws IOException {
        Iterator it;
        Map.Entry entry;
        l0 l0Var = (l0) l5Var;
        l0Var.getClass();
        if (Writer$FieldOrder.ASCENDING != Writer$FieldOrder.DESCENDING) {
            W(messageLite, l5Var);
            return;
        }
        i1 i1Var = this.f24812o;
        int[] iArr = this.f24799a;
        ((r4) this.f24811n).getClass();
        ((GeneratedMessageLite) messageLite).unknownFields.writeTo(l5Var);
        if (this.f24804f) {
            ((k1) i1Var).getClass();
            v1 v1Var = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions;
            if (v1Var.f24965a.isEmpty()) {
                it = null;
                entry = null;
            } else {
                z3 z3Var = v1Var.f24965a;
                if (v1Var.f24967c) {
                    if (z3Var.f25065g == null) {
                        z3Var.f25065g = new b4(z3Var);
                    }
                    it = new l2(z3Var.f25065g.iterator());
                } else {
                    if (z3Var.f25065g == null) {
                        z3Var.f25065g = new b4(z3Var);
                    }
                    it = z3Var.f25065g.iterator();
                }
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iV = V(length);
            int i10 = iArr[length];
            while (entry != null) {
                ((k1) i1Var).getClass();
                if (((c2) entry.getKey()).f24784b > i10) {
                    i1Var.b(l5Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                } else {
                    switch (U(iV)) {
                        case 0:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeDouble(i10, x4.f25021c.h(iV & 1048575, messageLite));
                            }
                            break;
                        case 1:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeFloat(i10, x4.f25021c.i(iV & 1048575, messageLite));
                            }
                            break;
                        case 2:
                            if (s(length, messageLite)) {
                                l0Var.f(i10, x4.f25021c.l(iV & 1048575, messageLite));
                            }
                            break;
                        case 3:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeUInt64(i10, x4.f25021c.l(iV & 1048575, messageLite));
                            }
                            break;
                        case 4:
                            if (s(length, messageLite)) {
                                l0Var.e(i10, x4.f25021c.j(iV & 1048575, messageLite));
                            }
                            break;
                        case 5:
                            if (s(length, messageLite)) {
                                l0Var.c(i10, x4.f25021c.l(iV & 1048575, messageLite));
                            }
                            break;
                        case 6:
                            if (s(length, messageLite)) {
                                l0Var.b(i10, x4.f25021c.j(iV & 1048575, messageLite));
                            }
                            break;
                        case 7:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeBool(i10, x4.f25021c.e(iV & 1048575, messageLite));
                            }
                            break;
                        case 8:
                            if (s(length, messageLite)) {
                                Y(i10, x4.f25021c.m(iV & 1048575, messageLite), l5Var);
                            }
                            break;
                        case 9:
                            if (s(length, messageLite)) {
                                l0Var.g(i10, x4.f25021c.m(iV & 1048575, messageLite), q(length));
                            }
                            break;
                        case 10:
                            if (s(length, messageLite)) {
                                l0Var.a(i10, (ByteString) x4.f25021c.m(iV & 1048575, messageLite));
                            }
                            break;
                        case 11:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeUInt32(i10, x4.f25021c.j(iV & 1048575, messageLite));
                            }
                            break;
                        case 12:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeEnum(i10, x4.f25021c.j(iV & 1048575, messageLite));
                            }
                            break;
                        case 13:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeSFixed32(i10, x4.f25021c.j(iV & 1048575, messageLite));
                            }
                            break;
                        case 14:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeSFixed64(i10, x4.f25021c.l(iV & 1048575, messageLite));
                            }
                            break;
                        case 15:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeSInt32(i10, x4.f25021c.j(iV & 1048575, messageLite));
                            }
                            break;
                        case 16:
                            if (s(length, messageLite)) {
                                l0Var.f24893a.writeSInt64(i10, x4.f25021c.l(iV & 1048575, messageLite));
                            }
                            break;
                        case 17:
                            if (s(length, messageLite)) {
                                l0Var.d(i10, x4.f25021c.m(iV & 1048575, messageLite), q(length));
                            }
                            break;
                        case 18:
                            y3.q(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 19:
                            y3.u(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 20:
                            y3.x(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 21:
                            y3.F(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 22:
                            y3.w(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 23:
                            y3.t(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 24:
                            y3.s(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 25:
                            y3.o(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                            y3.D(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var);
                            break;
                        case 27:
                            y3.y(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, q(length));
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                            y3.p(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                            y3.E(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                            y3.r(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 31:
                            y3.z(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 32:
                            y3.A(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 33:
                            y3.B(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case 34:
                            y3.C(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            y3.q(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case 36:
                            y3.u(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case 37:
                            y3.x(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                            y3.F(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case 39:
                            y3.w(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case 40:
                            y3.t(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case 41:
                            y3.s(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case 42:
                            y3.o(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                            y3.E(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case 44:
                            y3.r(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case 45:
                            y3.z(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                            y3.A(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                            y3.B(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                            y3.C(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                            y3.v(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, q(length));
                            break;
                        case 50:
                            X(l5Var, i10, x4.f25021c.m(iV & 1048575, messageLite), length);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeDouble(i10, ((Double) x4.f25021c.m(iV & 1048575, messageLite)).doubleValue());
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeFloat(i10, ((Float) x4.f25021c.m(iV & 1048575, messageLite)).floatValue());
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.f(i10, F(iV & 1048575, messageLite));
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeUInt64(i10, F(iV & 1048575, messageLite));
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.e(i10, E(iV & 1048575, messageLite));
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.c(i10, F(iV & 1048575, messageLite));
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.b(i10, E(iV & 1048575, messageLite));
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeBool(i10, ((Boolean) x4.f25021c.m(iV & 1048575, messageLite)).booleanValue());
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                            if (v(i10, length, messageLite)) {
                                Y(i10, x4.f25021c.m(iV & 1048575, messageLite), l5Var);
                            }
                            break;
                        case 60:
                            if (v(i10, length, messageLite)) {
                                l0Var.g(i10, x4.f25021c.m(iV & 1048575, messageLite), q(length));
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.a(i10, (ByteString) x4.f25021c.m(iV & 1048575, messageLite));
                            }
                            break;
                        case 62:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeUInt32(i10, E(iV & 1048575, messageLite));
                            }
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeEnum(i10, E(iV & 1048575, messageLite));
                            }
                            break;
                        case 64:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeSFixed32(i10, E(iV & 1048575, messageLite));
                            }
                            break;
                        case 65:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeSFixed64(i10, F(iV & 1048575, messageLite));
                            }
                            break;
                        case 66:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeSInt32(i10, E(iV & 1048575, messageLite));
                            }
                            break;
                        case 67:
                            if (v(i10, length, messageLite)) {
                                l0Var.f24893a.writeSInt64(i10, F(iV & 1048575, messageLite));
                            }
                            break;
                        case 68:
                            if (v(i10, length, messageLite)) {
                                l0Var.d(i10, x4.f25021c.m(iV & 1048575, messageLite), q(length));
                            }
                            break;
                    }
                }
            }
            switch (U(iV)) {
                case 0:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeDouble(i10, x4.f25021c.h(iV & 1048575, messageLite));
                    }
                    break;
                case 1:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeFloat(i10, x4.f25021c.i(iV & 1048575, messageLite));
                    }
                    break;
                case 2:
                    if (s(length, messageLite)) {
                        l0Var.f(i10, x4.f25021c.l(iV & 1048575, messageLite));
                    }
                    break;
                case 3:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeUInt64(i10, x4.f25021c.l(iV & 1048575, messageLite));
                    }
                    break;
                case 4:
                    if (s(length, messageLite)) {
                        l0Var.e(i10, x4.f25021c.j(iV & 1048575, messageLite));
                    }
                    break;
                case 5:
                    if (s(length, messageLite)) {
                        l0Var.c(i10, x4.f25021c.l(iV & 1048575, messageLite));
                    }
                    break;
                case 6:
                    if (s(length, messageLite)) {
                        l0Var.b(i10, x4.f25021c.j(iV & 1048575, messageLite));
                    }
                    break;
                case 7:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeBool(i10, x4.f25021c.e(iV & 1048575, messageLite));
                    }
                    break;
                case 8:
                    if (s(length, messageLite)) {
                        Y(i10, x4.f25021c.m(iV & 1048575, messageLite), l5Var);
                    }
                    break;
                case 9:
                    if (s(length, messageLite)) {
                        l0Var.g(i10, x4.f25021c.m(iV & 1048575, messageLite), q(length));
                    }
                    break;
                case 10:
                    if (s(length, messageLite)) {
                        l0Var.a(i10, (ByteString) x4.f25021c.m(iV & 1048575, messageLite));
                    }
                    break;
                case 11:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeUInt32(i10, x4.f25021c.j(iV & 1048575, messageLite));
                    }
                    break;
                case 12:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeEnum(i10, x4.f25021c.j(iV & 1048575, messageLite));
                    }
                    break;
                case 13:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeSFixed32(i10, x4.f25021c.j(iV & 1048575, messageLite));
                    }
                    break;
                case 14:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeSFixed64(i10, x4.f25021c.l(iV & 1048575, messageLite));
                    }
                    break;
                case 15:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeSInt32(i10, x4.f25021c.j(iV & 1048575, messageLite));
                    }
                    break;
                case 16:
                    if (s(length, messageLite)) {
                        l0Var.f24893a.writeSInt64(i10, x4.f25021c.l(iV & 1048575, messageLite));
                    }
                    break;
                case 17:
                    if (s(length, messageLite)) {
                        l0Var.d(i10, x4.f25021c.m(iV & 1048575, messageLite), q(length));
                    }
                    break;
                case 18:
                    y3.q(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 19:
                    y3.u(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 20:
                    y3.x(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 21:
                    y3.F(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 22:
                    y3.w(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 23:
                    y3.t(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 24:
                    y3.s(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 25:
                    y3.o(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    y3.D(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var);
                    break;
                case 27:
                    y3.y(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, q(length));
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    y3.p(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    y3.E(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    y3.r(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 31:
                    y3.z(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 32:
                    y3.A(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 33:
                    y3.B(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case 34:
                    y3.C(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, false);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    y3.q(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case 36:
                    y3.u(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case 37:
                    y3.x(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    y3.F(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case 39:
                    y3.w(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case 40:
                    y3.t(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case 41:
                    y3.s(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case 42:
                    y3.o(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    y3.E(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case 44:
                    y3.r(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case 45:
                    y3.z(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    y3.A(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    y3.B(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    y3.C(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, true);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    y3.v(iArr[length], (List) x4.f25021c.m(iV & 1048575, messageLite), l5Var, q(length));
                    break;
                case 50:
                    X(l5Var, i10, x4.f25021c.m(iV & 1048575, messageLite), length);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeDouble(i10, ((Double) x4.f25021c.m(iV & 1048575, messageLite)).doubleValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeFloat(i10, ((Float) x4.f25021c.m(iV & 1048575, messageLite)).floatValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.f(i10, F(iV & 1048575, messageLite));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeUInt64(i10, F(iV & 1048575, messageLite));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.e(i10, E(iV & 1048575, messageLite));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.c(i10, F(iV & 1048575, messageLite));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.b(i10, E(iV & 1048575, messageLite));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeBool(i10, ((Boolean) x4.f25021c.m(iV & 1048575, messageLite)).booleanValue());
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (v(i10, length, messageLite)) {
                        Y(i10, x4.f25021c.m(iV & 1048575, messageLite), l5Var);
                    }
                    break;
                case 60:
                    if (v(i10, length, messageLite)) {
                        l0Var.g(i10, x4.f25021c.m(iV & 1048575, messageLite), q(length));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.a(i10, (ByteString) x4.f25021c.m(iV & 1048575, messageLite));
                    }
                    break;
                case 62:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeUInt32(i10, E(iV & 1048575, messageLite));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeEnum(i10, E(iV & 1048575, messageLite));
                    }
                    break;
                case 64:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeSFixed32(i10, E(iV & 1048575, messageLite));
                    }
                    break;
                case 65:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeSFixed64(i10, F(iV & 1048575, messageLite));
                    }
                    break;
                case 66:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeSInt32(i10, E(iV & 1048575, messageLite));
                    }
                    break;
                case 67:
                    if (v(i10, length, messageLite)) {
                        l0Var.f24893a.writeSInt64(i10, F(iV & 1048575, messageLite));
                    }
                    break;
                case 68:
                    if (v(i10, length, messageLite)) {
                        l0Var.d(i10, x4.f25021c.m(iV & 1048575, messageLite), q(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            i1Var.b(l5Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:315:0x06a5 A[PHI: r0
  0x06a5: PHI (r0v9 com.google.protobuf.d3) = 
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v36 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
  (r0v1 com.google.protobuf.d3)
 binds: [B:21:0x0055, B:313:0x069a, B:279:0x05f4, B:259:0x0598, B:252:0x0572, B:167:0x0383, B:162:0x0363, B:157:0x0343, B:152:0x0327, B:147:0x030b, B:142:0x02ef, B:137:0x02cf, B:132:0x02af, B:127:0x0291, B:122:0x0276, B:117:0x025b, B:112:0x023c, B:107:0x021d, B:101:0x01fd, B:83:0x017f, B:80:0x0172, B:77:0x0162, B:74:0x0152, B:71:0x0142, B:68:0x0136, B:65:0x012a, B:62:0x011d, B:55:0x00fd, B:49:0x00d9, B:46:0x00c8, B:43:0x00b9, B:40:0x00aa, B:37:0x009f, B:34:0x0094, B:31:0x0085, B:28:0x0076, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0  */
    @Override // com.google.protobuf.x3
    public final int f(AbstractMessageLite abstractMessageLite) {
        int i10;
        int iComputeFloatSize;
        int iComputeLazyFieldSize;
        int iComputeTagSize;
        int size;
        int i11;
        int iComputeTagSize2;
        int iComputeTagSize3;
        int size2;
        int iComputeTagSize4;
        int iComputeUInt32SizeNoTag;
        int iComputeGroupSize;
        d3 d3Var = this;
        Unsafe unsafe = f24798r;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int iComputeDoubleSize = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = d3Var.f24799a;
            if (i13 >= iArr.length) {
                ((r4) d3Var.f24811n).getClass();
                int serializedSize = ((GeneratedMessageLite) abstractMessageLite).unknownFields.getSerializedSize() + iComputeDoubleSize;
                if (!d3Var.f24804f) {
                    return serializedSize;
                }
                ((k1) d3Var.f24812o).getClass();
                return ((GeneratedMessageLite.ExtendableMessage) abstractMessageLite).extensions.i() + serializedSize;
            }
            int iV = d3Var.V(i13);
            int iU = U(iV);
            int i16 = iArr[i13];
            int i17 = iArr[i13 + 2];
            int i18 = i17 & i12;
            if (iU <= 17) {
                if (i18 != i15) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(abstractMessageLite, i18);
                    i15 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = iComputeDoubleSize;
            long j10 = iV & i12;
            if (iU < FieldType.DOUBLE_LIST_PACKED.id() || iU > FieldType.SINT64_LIST_PACKED.id()) {
                i18 = 0;
            }
            boolean z10 = d3Var.f24806h;
            switch (iU) {
                case 0:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeDoubleSize = CodedOutputStream.computeDoubleSize(i16, 0.0d) + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 1:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFloatSize(i16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 2:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeInt64Size(i16, unsafe.getLong(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 3:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeUInt64Size(i16, unsafe.getLong(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 4:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeInt32Size(i16, unsafe.getInt(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 5:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed64Size(i16, 0L);
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 6:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeFixed32Size(i16, 0);
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 7:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeBoolSize(i16, true);
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 8:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        Object object = unsafe.getObject(abstractMessageLite, j10);
                        iComputeDoubleSize = (object instanceof ByteString ? CodedOutputStream.computeBytesSize(i16, (ByteString) object) : CodedOutputStream.computeStringSize(i16, (String) object)) + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 9:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        Object object2 = unsafe.getObject(abstractMessageLite, j10);
                        x3 x3VarQ = d3Var.q(i13);
                        Class cls = y3.f25041a;
                        iComputeLazyFieldSize = object2 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i16, (LazyFieldLite) object2) : CodedOutputStream.computeMessageSize(i16, (MessageLite) object2, x3VarQ);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 10:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeBytesSize(i16, (ByteString) unsafe.getObject(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 11:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeUInt32Size(i16, unsafe.getInt(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 12:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeEnumSize(i16, unsafe.getInt(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 13:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed32Size(i16, 0);
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 14:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSFixed64Size(i16, 0L);
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 15:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSInt32Size(i16, unsafe.getInt(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 16:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeFloatSize = CodedOutputStream.computeSInt64Size(i16, unsafe.getLong(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeFloatSize + i19;
                        d3Var = this;
                    }
                    d3Var = this;
                    iComputeDoubleSize = i19;
                    break;
                case 17:
                    if (d3Var.t(abstractMessageLite, i13, i15, i14, i10)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeGroupSize(i16, (MessageLite) unsafe.getObject(abstractMessageLite, j10), d3Var.q(i13));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 18:
                    iComputeLazyFieldSize = y3.c(i16, (List) unsafe.getObject(abstractMessageLite, j10));
                    iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    break;
                case 19:
                    iComputeLazyFieldSize = y3.b(i16, (List) unsafe.getObject(abstractMessageLite, j10));
                    iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls2 = y3.f25041a;
                    if (list.size() == 0) {
                        iComputeTagSize = 0;
                    } else {
                        iComputeTagSize = (CodedOutputStream.computeTagSize(i16) * list.size()) + y3.e(list);
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls3 = y3.f25041a;
                    size = list2.size();
                    if (size == 0) {
                        iComputeTagSize = 0;
                    } else {
                        i11 = y3.i(list2);
                        iComputeTagSize2 = CodedOutputStream.computeTagSize(i16);
                        iComputeTagSize = (iComputeTagSize2 * size) + i11;
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls4 = y3.f25041a;
                    size = list3.size();
                    if (size == 0) {
                        iComputeTagSize = 0;
                    } else {
                        i11 = y3.d(list3);
                        iComputeTagSize2 = CodedOutputStream.computeTagSize(i16);
                        iComputeTagSize = (iComputeTagSize2 * size) + i11;
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case 23:
                    iComputeLazyFieldSize = y3.c(i16, (List) unsafe.getObject(abstractMessageLite, j10));
                    iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    break;
                case 24:
                    iComputeLazyFieldSize = y3.b(i16, (List) unsafe.getObject(abstractMessageLite, j10));
                    iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls5 = y3.f25041a;
                    int size3 = list4.size();
                    iComputeDoubleSize = i19 + (size3 == 0 ? 0 : CodedOutputStream.computeBoolSize(i16, true) * size3);
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    List list5 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls6 = y3.f25041a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iComputeTagSize = 0;
                    } else {
                        iComputeTagSize = CodedOutputStream.computeTagSize(i16) * size4;
                        if (list5 instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list5;
                            for (int i20 = 0; i20 < size4; i20++) {
                                Object raw = lazyStringList.getRaw(i20);
                                iComputeTagSize = (raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw)) + iComputeTagSize;
                            }
                        } else {
                            for (int i21 = 0; i21 < size4; i21++) {
                                Object obj = list5.get(i21);
                                iComputeTagSize = (obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                            }
                        }
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractMessageLite, j10);
                    x3 x3VarQ2 = d3Var.q(i13);
                    Class cls7 = y3.f25041a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iComputeTagSize3 = 0;
                    } else {
                        iComputeTagSize3 = CodedOutputStream.computeTagSize(i16) * size5;
                        for (int i22 = 0; i22 < size5; i22++) {
                            Object obj2 = list6.get(i22);
                            iComputeTagSize3 = (obj2 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj2) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj2, x3VarQ2)) + iComputeTagSize3;
                        }
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize3;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    List list7 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls8 = y3.f25041a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iComputeTagSize = 0;
                    } else {
                        iComputeTagSize = CodedOutputStream.computeTagSize(i16) * size6;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag((ByteString) list7.get(i23));
                        }
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    List list8 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls9 = y3.f25041a;
                    size = list8.size();
                    if (size == 0) {
                        iComputeTagSize = 0;
                    } else {
                        i11 = y3.h(list8);
                        iComputeTagSize2 = CodedOutputStream.computeTagSize(i16);
                        iComputeTagSize = (iComputeTagSize2 * size) + i11;
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    List list9 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls10 = y3.f25041a;
                    size = list9.size();
                    if (size == 0) {
                        iComputeTagSize = 0;
                    } else {
                        i11 = y3.a(list9);
                        iComputeTagSize2 = CodedOutputStream.computeTagSize(i16);
                        iComputeTagSize = (iComputeTagSize2 * size) + i11;
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case 31:
                    iComputeLazyFieldSize = y3.b(i16, (List) unsafe.getObject(abstractMessageLite, j10));
                    iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    break;
                case 32:
                    iComputeLazyFieldSize = y3.c(i16, (List) unsafe.getObject(abstractMessageLite, j10));
                    iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls11 = y3.f25041a;
                    size = list10.size();
                    if (size == 0) {
                        iComputeTagSize = 0;
                    } else {
                        i11 = y3.f(list10);
                        iComputeTagSize2 = CodedOutputStream.computeTagSize(i16);
                        iComputeTagSize = (iComputeTagSize2 * size) + i11;
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls12 = y3.f25041a;
                    size = list11.size();
                    if (size == 0) {
                        iComputeTagSize = 0;
                    } else {
                        i11 = y3.g(list11);
                        iComputeTagSize2 = CodedOutputStream.computeTagSize(i16);
                        iComputeTagSize = (iComputeTagSize2 * size) + i11;
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    List list12 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls13 = y3.f25041a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls14 = y3.f25041a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 37:
                    size2 = y3.e((List) unsafe.getObject(abstractMessageLite, j10));
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    size2 = y3.i((List) unsafe.getObject(abstractMessageLite, j10));
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 39:
                    size2 = y3.d((List) unsafe.getObject(abstractMessageLite, j10));
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls15 = y3.f25041a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls16 = y3.f25041a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls17 = y3.f25041a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    size2 = y3.h((List) unsafe.getObject(abstractMessageLite, j10));
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 44:
                    size2 = y3.a((List) unsafe.getObject(abstractMessageLite, j10));
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls18 = y3.f25041a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    List list18 = (List) unsafe.getObject(abstractMessageLite, j10);
                    Class cls19 = y3.f25041a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    size2 = y3.f((List) unsafe.getObject(abstractMessageLite, j10));
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    size2 = y3.g((List) unsafe.getObject(abstractMessageLite, j10));
                    if (size2 > 0) {
                        if (z10) {
                            unsafe.putInt(abstractMessageLite, i18, size2);
                        }
                        iComputeTagSize4 = CodedOutputStream.computeTagSize(i16);
                        iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(size2);
                        iComputeDoubleSize = iComputeUInt32SizeNoTag + iComputeTagSize4 + size2 + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    List list19 = (List) unsafe.getObject(abstractMessageLite, j10);
                    x3 x3VarQ3 = d3Var.q(i13);
                    Class cls20 = y3.f25041a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iComputeGroupSize = 0;
                    } else {
                        iComputeGroupSize = 0;
                        for (int i24 = 0; i24 < size7; i24++) {
                            iComputeGroupSize += CodedOutputStream.computeGroupSize(i16, (MessageLite) list19.get(i24), x3VarQ3);
                        }
                    }
                    iComputeDoubleSize = i19 + iComputeGroupSize;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractMessageLite, j10);
                    Object objP = d3Var.p(i13);
                    d3Var.f24813p.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    MapEntryLite mapEntryLite = (MapEntryLite) objP;
                    if (mapFieldLite.isEmpty()) {
                        iComputeTagSize = 0;
                    } else {
                        iComputeTagSize = 0;
                        for (Map.Entry entry : mapFieldLite.entrySet()) {
                            iComputeTagSize += mapEntryLite.computeMessageSize(i16, entry.getKey(), entry.getValue());
                        }
                    }
                    iComputeDoubleSize = i19 + iComputeTagSize;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeDoubleSize(i16, 0.0d);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeFloatSize(i16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeInt64Size(i16, F(j10, abstractMessageLite));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeUInt64Size(i16, F(j10, abstractMessageLite));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeInt32Size(i16, E(j10, abstractMessageLite));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeFixed64Size(i16, 0L);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeFixed32Size(i16, 0);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeBoolSize(i16, true);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        Object object4 = unsafe.getObject(abstractMessageLite, j10);
                        iComputeDoubleSize = (object4 instanceof ByteString ? CodedOutputStream.computeBytesSize(i16, (ByteString) object4) : CodedOutputStream.computeStringSize(i16, (String) object4)) + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 60:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        Object object5 = unsafe.getObject(abstractMessageLite, j10);
                        x3 x3VarQ4 = d3Var.q(i13);
                        Class cls21 = y3.f25041a;
                        iComputeLazyFieldSize = object5 instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i16, (LazyFieldLite) object5) : CodedOutputStream.computeMessageSize(i16, (MessageLite) object5, x3VarQ4);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeBytesSize(i16, (ByteString) unsafe.getObject(abstractMessageLite, j10));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 62:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeUInt32Size(i16, E(j10, abstractMessageLite));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeEnumSize(i16, E(j10, abstractMessageLite));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 64:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeSFixed32Size(i16, 0);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 65:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeSFixed64Size(i16, 0L);
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 66:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeSInt32Size(i16, E(j10, abstractMessageLite));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 67:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeSInt64Size(i16, F(j10, abstractMessageLite));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                case 68:
                    if (d3Var.v(i16, i13, abstractMessageLite)) {
                        iComputeLazyFieldSize = CodedOutputStream.computeGroupSize(i16, (MessageLite) unsafe.getObject(abstractMessageLite, j10), d3Var.q(i13));
                        iComputeDoubleSize = iComputeLazyFieldSize + i19;
                    } else {
                        iComputeDoubleSize = i19;
                    }
                    break;
                default:
                    iComputeDoubleSize = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 23721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.protobuf.x3
    public final void g(java.lang.Object r21, com.google.protobuf.b0 r22, com.google.protobuf.ExtensionRegistryLite r23) {
        /*
            Method dump skipped, instruction units count: 2372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d3.g(java.lang.Object, com.google.protobuf.b0, com.google.protobuf.ExtensionRegistryLite):void");
    }

    @Override // com.google.protobuf.x3
    public final void h(Object obj, byte[] bArr, int i10, int i11, g gVar) throws InvalidProtocolBufferException {
        H(obj, bArr, i10, i11, 0, gVar);
    }

    @Override // com.google.protobuf.x3
    public final int i(GeneratedMessageLite generatedMessageLite) {
        int i10;
        int iHashLong;
        int[] iArr = this.f24799a;
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iV = V(i12);
            int i13 = iArr[i12];
            long j10 = 1048575 & iV;
            int iHashCode = 37;
            switch (U(iV)) {
                case 0:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(Double.doubleToLongBits(x4.f25021c.h(j10, generatedMessageLite)));
                    i11 = iHashLong + i10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iHashLong = Float.floatToIntBits(x4.f25021c.i(j10, generatedMessageLite));
                    i11 = iHashLong + i10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x4.f25021c.l(j10, generatedMessageLite));
                    i11 = iHashLong + i10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x4.f25021c.l(j10, generatedMessageLite));
                    i11 = iHashLong + i10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.j(j10, generatedMessageLite);
                    i11 = iHashLong + i10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x4.f25021c.l(j10, generatedMessageLite));
                    i11 = iHashLong + i10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.j(j10, generatedMessageLite);
                    i11 = iHashLong + i10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashBoolean(x4.f25021c.e(j10, generatedMessageLite));
                    i11 = iHashLong + i10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iHashLong = ((String) x4.f25021c.m(j10, generatedMessageLite)).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 9:
                    Object objM = x4.f25021c.m(j10, generatedMessageLite);
                    if (objM != null) {
                        iHashCode = objM.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.m(j10, generatedMessageLite).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.j(j10, generatedMessageLite);
                    i11 = iHashLong + i10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.j(j10, generatedMessageLite);
                    i11 = iHashLong + i10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.j(j10, generatedMessageLite);
                    i11 = iHashLong + i10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x4.f25021c.l(j10, generatedMessageLite));
                    i11 = iHashLong + i10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.j(j10, generatedMessageLite);
                    i11 = iHashLong + i10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iHashLong = Internal.hashLong(x4.f25021c.l(j10, generatedMessageLite));
                    i11 = iHashLong + i10;
                    break;
                case 17:
                    Object objM2 = x4.f25021c.m(j10, generatedMessageLite);
                    if (objM2 != null) {
                        iHashCode = objM2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
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
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.m(j10, generatedMessageLite).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iHashLong = x4.f25021c.m(j10, generatedMessageLite).hashCode();
                    i11 = iHashLong + i10;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(Double.doubleToLongBits(((Double) x4.f25021c.m(j10, generatedMessageLite)).doubleValue()));
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = Float.floatToIntBits(((Float) x4.f25021c.m(j10, generatedMessageLite)).floatValue());
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(F(j10, generatedMessageLite));
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(F(j10, generatedMessageLite));
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = E(j10, generatedMessageLite);
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(F(j10, generatedMessageLite));
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = E(j10, generatedMessageLite);
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashBoolean(((Boolean) x4.f25021c.m(j10, generatedMessageLite)).booleanValue());
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = ((String) x4.f25021c.m(j10, generatedMessageLite)).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case 60:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = x4.f25021c.m(j10, generatedMessageLite).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = x4.f25021c.m(j10, generatedMessageLite).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
                case 62:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = E(j10, generatedMessageLite);
                        i11 = iHashLong + i10;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = E(j10, generatedMessageLite);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 64:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = E(j10, generatedMessageLite);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 65:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(F(j10, generatedMessageLite));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 66:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = E(j10, generatedMessageLite);
                        i11 = iHashLong + i10;
                    }
                    break;
                case 67:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = Internal.hashLong(F(j10, generatedMessageLite));
                        i11 = iHashLong + i10;
                    }
                    break;
                case 68:
                    if (v(i13, i12, generatedMessageLite)) {
                        i10 = i11 * 53;
                        iHashLong = x4.f25021c.m(j10, generatedMessageLite).hashCode();
                        i11 = iHashLong + i10;
                    }
                    break;
            }
        }
        ((r4) this.f24811n).getClass();
        int iHashCode2 = generatedMessageLite.unknownFields.hashCode() + (i11 * 53);
        if (!this.f24804f) {
            return iHashCode2;
        }
        ((k1) this.f24812o).getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.f24965a.hashCode() + (iHashCode2 * 53);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.google.protobuf.x3
    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.f24799a;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            boolean zM = true;
            if (i10 < length) {
                int iV = V(i10);
                long j10 = iV & 1048575;
                switch (U(iV)) {
                    case 0:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var = x4.f25021c;
                            if (Double.doubleToLongBits(w4Var.h(j10, generatedMessageLite)) != Double.doubleToLongBits(w4Var.h(j10, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 1:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var2 = x4.f25021c;
                            if (Float.floatToIntBits(w4Var2.i(j10, generatedMessageLite)) != Float.floatToIntBits(w4Var2.i(j10, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 2:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var3 = x4.f25021c;
                            if (w4Var3.l(j10, generatedMessageLite) != w4Var3.l(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 3:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var4 = x4.f25021c;
                            if (w4Var4.l(j10, generatedMessageLite) != w4Var4.l(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 4:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var5 = x4.f25021c;
                            if (w4Var5.j(j10, generatedMessageLite) != w4Var5.j(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 5:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var6 = x4.f25021c;
                            if (w4Var6.l(j10, generatedMessageLite) != w4Var6.l(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 6:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var7 = x4.f25021c;
                            if (w4Var7.j(j10, generatedMessageLite) != w4Var7.j(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 7:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var8 = x4.f25021c;
                            if (w4Var8.e(j10, generatedMessageLite) != w4Var8.e(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 8:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var9 = x4.f25021c;
                            if (!y3.m(w4Var9.m(j10, generatedMessageLite), w4Var9.m(j10, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 9:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var10 = x4.f25021c;
                            if (!y3.m(w4Var10.m(j10, generatedMessageLite), w4Var10.m(j10, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 10:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var11 = x4.f25021c;
                            if (!y3.m(w4Var11.m(j10, generatedMessageLite), w4Var11.m(j10, generatedMessageLite2))) {
                                zM = false;
                            }
                        }
                        break;
                    case 11:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var12 = x4.f25021c;
                            if (w4Var12.j(j10, generatedMessageLite) != w4Var12.j(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 12:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var13 = x4.f25021c;
                            if (w4Var13.j(j10, generatedMessageLite) != w4Var13.j(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 13:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var14 = x4.f25021c;
                            if (w4Var14.j(j10, generatedMessageLite) != w4Var14.j(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 14:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var15 = x4.f25021c;
                            if (w4Var15.l(j10, generatedMessageLite) != w4Var15.l(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 15:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var16 = x4.f25021c;
                            if (w4Var16.j(j10, generatedMessageLite) != w4Var16.j(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 16:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var17 = x4.f25021c;
                            if (w4Var17.l(j10, generatedMessageLite) != w4Var17.l(j10, generatedMessageLite2)) {
                                zM = false;
                            }
                        }
                        break;
                    case 17:
                        if (!k(generatedMessageLite, generatedMessageLite2, i10)) {
                            zM = false;
                        } else {
                            w4 w4Var18 = x4.f25021c;
                            if (!y3.m(w4Var18.m(j10, generatedMessageLite), w4Var18.m(j10, generatedMessageLite2))) {
                                zM = false;
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
                        w4 w4Var19 = x4.f25021c;
                        zM = y3.m(w4Var19.m(j10, generatedMessageLite), w4Var19.m(j10, generatedMessageLite2));
                        break;
                    case 50:
                        w4 w4Var20 = x4.f25021c;
                        zM = y3.m(w4Var20.m(j10, generatedMessageLite), w4Var20.m(j10, generatedMessageLite2));
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
                        w4 w4Var21 = x4.f25021c;
                        if (w4Var21.j(j11, generatedMessageLite) != w4Var21.j(j11, generatedMessageLite2) || !y3.m(w4Var21.m(j10, generatedMessageLite), w4Var21.m(j10, generatedMessageLite2))) {
                            zM = false;
                        }
                        break;
                }
                if (zM) {
                    i10 += 3;
                }
            } else {
                r4 r4Var = (r4) this.f24811n;
                r4Var.getClass();
                UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                r4Var.getClass();
                if (unknownFieldSetLite.equals(generatedMessageLite2.unknownFields)) {
                    if (!this.f24804f) {
                        return true;
                    }
                    k1 k1Var = (k1) this.f24812o;
                    k1Var.getClass();
                    v1 v1Var = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions;
                    k1Var.getClass();
                    return v1Var.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
                }
            }
        }
        return false;
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i10) {
        return s(i10, generatedMessageLite) == s(i10, generatedMessageLite2);
    }

    public final Object n(Object obj, int i10, Object obj2, q4 q4Var, Object obj3) {
        Internal.EnumVerifier enumVerifierO;
        int i11 = this.f24799a[i10];
        Object objM = x4.f25021c.m(V(i10) & 1048575, obj);
        if (objM == null || (enumVerifierO = o(i10)) == null) {
            return obj2;
        }
        this.f24813p.getClass();
        w2 metadata = ((MapEntryLite) p(i10)).getMetadata();
        Iterator it = ((MapFieldLite) objM).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierO.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = q4Var.a(obj3);
                }
                r rVarNewCodedBuilder = ByteString.newCodedBuilder(MapEntryLite.computeSerializedSize(metadata, entry.getKey(), entry.getValue()));
                try {
                    MapEntryLite.writeTo(rVarNewCodedBuilder.f24926a, metadata, entry.getKey(), entry.getValue());
                    rVarNewCodedBuilder.f24926a.checkNoSpaceLeft();
                    t tVar = new t(rVarNewCodedBuilder.f24927b);
                    ((r4) q4Var).getClass();
                    ((UnknownFieldSetLite) obj2).storeField(WireFormat.makeTag(i11, 2), tVar);
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier o(int i10) {
        return (Internal.EnumVerifier) this.f24800b[defpackage.e.e(i10, 3, 2, 1)];
    }

    public final Object p(int i10) {
        return this.f24800b[(i10 / 3) * 2];
    }

    public final x3 q(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f24800b;
        x3 x3Var = (x3) objArr[i11];
        if (x3Var != null) {
            return x3Var;
        }
        x3 x3VarA = p3.f24916c.a((Class) objArr[i11 + 1]);
        objArr[i11] = x3VarA;
        return x3VarA;
    }

    public final boolean s(int i10, Object obj) {
        int i11 = this.f24799a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iV = V(i10);
            long j11 = iV & 1048575;
            switch (U(iV)) {
                case 0:
                    if (Double.doubleToRawLongBits(x4.f25021c.h(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(x4.f25021c.i(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (x4.f25021c.l(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (x4.f25021c.l(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (x4.f25021c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (x4.f25021c.l(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (x4.f25021c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return x4.f25021c.e(j11, obj);
                case 8:
                    Object objM = x4.f25021c.m(j11, obj);
                    if (objM instanceof String) {
                        return !((String) objM).isEmpty();
                    }
                    if (objM instanceof ByteString) {
                        return !ByteString.EMPTY.equals(objM);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (x4.f25021c.m(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.EMPTY.equals(x4.f25021c.m(j11, obj));
                case 11:
                    if (x4.f25021c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (x4.f25021c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (x4.f25021c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (x4.f25021c.l(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (x4.f25021c.j(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (x4.f25021c.l(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (x4.f25021c.m(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & x4.f25021c.j(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean t(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return s(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    public final boolean v(int i10, int i11, Object obj) {
        return x4.f25021c.j((long) (this.f24799a[i11 + 2] & 1048575), obj) == i10;
    }

    public final void w(Object obj, int i10, Object obj2, ExtensionRegistryLite extensionRegistryLite, b0 b0Var) throws InvalidProtocolBufferException {
        long jV = V(i10) & 1048575;
        Object objM = x4.f25021c.m(jV, obj);
        x2 x2Var = this.f24813p;
        if (objM == null) {
            x2Var.getClass();
            objM = MapFieldLite.emptyMapField().mutableCopy();
            x4.s(obj, jV, objM);
        } else {
            x2Var.getClass();
            if (!((MapFieldLite) objM).isMutable()) {
                MapFieldLite mapFieldLiteMutableCopy = MapFieldLite.emptyMapField().mutableCopy();
                x2.a(mapFieldLiteMutableCopy, objM);
                x4.s(obj, jV, mapFieldLiteMutableCopy);
                objM = mapFieldLiteMutableCopy;
            }
        }
        x2Var.getClass();
        MapFieldLite mapFieldLite = (MapFieldLite) objM;
        w2 metadata = ((MapEntryLite) obj2).getMetadata();
        b0Var.x(2);
        CodedInputStream codedInputStream = b0Var.f24771a;
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readUInt32());
        Object objI = metadata.f24989b;
        Object obj3 = metadata.f24991d;
        Object objI2 = obj3;
        while (true) {
            try {
                int iA = b0Var.a();
                if (iA == Integer.MAX_VALUE || codedInputStream.isAtEnd()) {
                    break;
                }
                if (iA == 1) {
                    objI = b0Var.i(metadata.f24988a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!b0Var.y()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!b0Var.y()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = b0Var.i(metadata.f24990c, obj3.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th2) {
                codedInputStream.popLimit(iPushLimit);
                throw th2;
            }
        }
        mapFieldLite.put(objI, objI2);
        codedInputStream.popLimit(iPushLimit);
    }

    public final void x(int i10, Object obj, Object obj2) {
        if (s(i10, obj2)) {
            long jV = V(i10) & 1048575;
            Unsafe unsafe = f24798r;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f24799a[i10] + " is present but null: " + obj2);
            }
            x3 x3VarQ = q(i10);
            if (!s(i10, obj)) {
                if (u(object)) {
                    Object objD = x3VarQ.d();
                    x3VarQ.a(objD, object);
                    unsafe.putObject(obj, jV, objD);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                P(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!u(object2)) {
                Object objD2 = x3VarQ.d();
                x3VarQ.a(objD2, object2);
                unsafe.putObject(obj, jV, objD2);
                object2 = objD2;
            }
            x3VarQ.a(object2, object);
        }
    }

    public final void y(int i10, Object obj, Object obj2) {
        int[] iArr = this.f24799a;
        int i11 = iArr[i10];
        if (v(i11, i10, obj2)) {
            long jV = V(i10) & 1048575;
            Unsafe unsafe = f24798r;
            Object object = unsafe.getObject(obj2, jV);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2);
            }
            x3 x3VarQ = q(i10);
            if (!v(i11, i10, obj)) {
                if (u(object)) {
                    Object objD = x3VarQ.d();
                    x3VarQ.a(objD, object);
                    unsafe.putObject(obj, jV, objD);
                } else {
                    unsafe.putObject(obj, jV, object);
                }
                Q(i11, i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jV);
            if (!u(object2)) {
                Object objD2 = x3VarQ.d();
                x3VarQ.a(objD2, object2);
                unsafe.putObject(obj, jV, objD2);
                object2 = objD2;
            }
            x3VarQ.a(object2, object);
        }
    }

    public final Object z(int i10, Object obj) {
        x3 x3VarQ = q(i10);
        long jV = V(i10) & 1048575;
        if (!s(i10, obj)) {
            return x3VarQ.d();
        }
        Object object = f24798r.getObject(obj, jV);
        if (u(object)) {
            return object;
        }
        Object objD = x3VarQ.d();
        if (object != null) {
            x3VarQ.a(objD, object);
        }
        return objD;
    }
}
