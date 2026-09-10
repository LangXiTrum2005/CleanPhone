package com.google.android.gms.internal.auth;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.ca;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements l1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f22803k = new int[0];
    public static final Unsafe l = x1.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f22804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f22805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f22808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f22809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v0 f22812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1 f22813j;

    public d1(int[] iArr, Object[] objArr, int i10, int i11, c0 c0Var, int[] iArr2, int i12, int i13, v0 v0Var, p1 p1Var) {
        this.f22804a = iArr;
        this.f22805b = objArr;
        this.f22806c = i10;
        this.f22807d = i11;
        this.f22809f = iArr2;
        this.f22810g = i12;
        this.f22811h = i13;
        this.f22812i = v0Var;
        this.f22813j = p1Var;
        this.f22808e = c0Var;
    }

    public static boolean k(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof m0) {
            return ((m0) obj).g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x030a  */
    /* JADX WARN: Code duplicated, block: B:186:0x039b  */
    public static d1 n(k1 k1Var, v0 v0Var, p1 p1Var) {
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
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i27;
        int i28;
        Field fieldW;
        int i29;
        char cCharAt9;
        Field fieldW2;
        Field fieldW3;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        if (!(k1Var instanceof k1)) {
            k1Var.getClass();
            throw new ClassCastException();
        }
        int i35 = k1Var.f22859c;
        String str = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
        if ("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0) >= 55296) {
            int i36 = 1;
            while (true) {
                i10 = i36 + 1;
                if ("\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i36) < 55296) {
                    break;
                }
                i36 = i10;
            }
        } else {
            i10 = 1;
        }
        int i37 = i10 + 1;
        int iCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i10);
        if (iCharAt2 >= 55296) {
            int i38 = iCharAt2 & 8191;
            int i39 = 13;
            while (true) {
                i34 = i37 + 1;
                cCharAt13 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i37);
                if (cCharAt13 < 55296) {
                    break;
                }
                i38 |= (cCharAt13 & 8191) << i39;
                i39 += 13;
                i37 = i34;
            }
            iCharAt2 = i38 | (cCharAt13 << i39);
            i37 = i34;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            i15 = 0;
            iCharAt = 0;
            i12 = 0;
            i14 = 0;
            i16 = 0;
            iArr = f22803k;
            i11 = 0;
        } else {
            int i40 = i37 + 1;
            int iCharAt3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i37);
            if (iCharAt3 >= 55296) {
                int i41 = iCharAt3 & 8191;
                int i42 = 13;
                while (true) {
                    i24 = i40 + 1;
                    cCharAt8 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i40);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i24;
                }
                iCharAt3 = i41 | (cCharAt8 << i42);
                i40 = i24;
            }
            int i43 = i40 + 1;
            int iCharAt4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i40);
            if (iCharAt4 >= 55296) {
                int i44 = iCharAt4 & 8191;
                int i45 = 13;
                while (true) {
                    i23 = i43 + 1;
                    cCharAt7 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i43);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i23;
                }
                iCharAt4 = i44 | (cCharAt7 << i45);
                i43 = i23;
            }
            int i46 = i43 + 1;
            int iCharAt5 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i43);
            if (iCharAt5 >= 55296) {
                int i47 = iCharAt5 & 8191;
                int i48 = 13;
                while (true) {
                    i22 = i46 + 1;
                    cCharAt6 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i46);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i22;
                }
                iCharAt5 = i47 | (cCharAt6 << i48);
                i46 = i22;
            }
            int i49 = i46 + 1;
            int iCharAt6 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i46);
            if (iCharAt6 >= 55296) {
                int i50 = iCharAt6 & 8191;
                int i51 = 13;
                while (true) {
                    i21 = i49 + 1;
                    cCharAt5 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i49);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i21;
                }
                iCharAt6 = i50 | (cCharAt5 << i51);
                i49 = i21;
            }
            int i52 = i49 + 1;
            iCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i49);
            if (iCharAt >= 55296) {
                int i53 = iCharAt & 8191;
                int i54 = 13;
                while (true) {
                    i20 = i52 + 1;
                    cCharAt4 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i52);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i20;
                }
                iCharAt = i53 | (cCharAt4 << i54);
                i52 = i20;
            }
            int i55 = i52 + 1;
            int iCharAt7 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i52);
            if (iCharAt7 >= 55296) {
                int i56 = iCharAt7 & 8191;
                int i57 = 13;
                while (true) {
                    i19 = i55 + 1;
                    cCharAt3 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i55);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i19;
                }
                iCharAt7 = i56 | (cCharAt3 << i57);
                i55 = i19;
            }
            int i58 = i55 + 1;
            int iCharAt8 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i55);
            if (iCharAt8 >= 55296) {
                int i59 = iCharAt8 & 8191;
                int i60 = 13;
                while (true) {
                    i18 = i58 + 1;
                    cCharAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i58);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i59 |= (cCharAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i18;
                }
                iCharAt8 = i59 | (cCharAt2 << i60);
                i58 = i18;
            }
            int i61 = i58 + 1;
            int iCharAt9 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i58);
            if (iCharAt9 >= 55296) {
                int i62 = iCharAt9 & 8191;
                int i63 = 13;
                while (true) {
                    i17 = i61 + 1;
                    cCharAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i61);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i62 |= (cCharAt & 8191) << i63;
                    i63 += 13;
                    i61 = i17;
                }
                iCharAt9 = i62 | (cCharAt << i63);
                i61 = i17;
            }
            int i64 = iCharAt3 + iCharAt3 + iCharAt4;
            i11 = iCharAt3;
            i37 = i61;
            iArr = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i65 = iCharAt7;
            i12 = iCharAt5;
            i13 = i65;
            i14 = iCharAt6;
            i15 = i64;
            i16 = iCharAt9;
        }
        Unsafe unsafe = l;
        Object[] objArr2 = k1Var.f22858b;
        Class<?> cls = k1Var.f22857a.getClass();
        int i66 = i16 + i13;
        int i67 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i67];
        int i68 = i66;
        int i69 = i16;
        int i70 = 0;
        int i71 = 0;
        while (i37 < 12) {
            int i72 = i37 + 1;
            int iCharAt10 = str.charAt(i37);
            if (iCharAt10 >= 55296) {
                int i73 = iCharAt10 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i33 = i74 + 1;
                    cCharAt12 = str.charAt(i74);
                    objArr = objArr2;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i73 |= (cCharAt12 & 8191) << i75;
                    i75 += 13;
                    i74 = i33;
                    objArr2 = objArr;
                }
                iCharAt10 = i73 | (cCharAt12 << i75);
                i25 = i33;
            } else {
                objArr = objArr2;
                i25 = i72;
            }
            int i76 = i25 + 1;
            int iCharAt11 = str.charAt(i25);
            if (iCharAt11 >= 55296) {
                int i77 = iCharAt11 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i31 = i78 + 1;
                    cCharAt11 = str.charAt(i78);
                    i32 = i77;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i77 = i32 | ((cCharAt11 & 8191) << i79);
                    i79 += 13;
                    i78 = i31;
                }
                iCharAt11 = i32 | (cCharAt11 << i79);
                i26 = i31;
            } else {
                i26 = i76;
            }
            int i80 = iCharAt10;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i71] = i70;
                i71++;
            }
            int i81 = iCharAt11 & 255;
            Object[] objArr4 = objArr3;
            int i82 = i11;
            if (i81 >= 51) {
                int i83 = i26 + 1;
                int iCharAt12 = str.charAt(i26);
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i84 = iCharAt12 & 8191;
                    int i85 = 13;
                    while (true) {
                        i30 = i83 + 1;
                        cCharAt10 = str.charAt(i83);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i84 |= (cCharAt10 & 8191) << i85;
                        i85 += 13;
                        i83 = i30;
                        c4 = 55296;
                    }
                    iCharAt12 = i84 | (cCharAt10 << i85);
                    i83 = i30;
                }
                int i86 = i81 - 51;
                int i87 = iCharAt12;
                if (i86 == 9 || i86 == 17) {
                    objArr4[ca.f(i70, 3, 1)] = objArr[i15];
                    i15++;
                } else if (i86 == 12 && ((i35 & 1) != 0 || (iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0)) {
                    objArr4[ca.f(i70, 3, 1)] = objArr[i15];
                    i15++;
                }
                int i88 = i87 + i87;
                Object obj = objArr[i88];
                if (obj instanceof Field) {
                    fieldW2 = (Field) obj;
                } else {
                    fieldW2 = w(cls, (String) obj);
                    objArr[i88] = fieldW2;
                }
                int i89 = i83;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldW2);
                int i90 = i88 + 1;
                Object obj2 = objArr[i90];
                if (obj2 instanceof Field) {
                    fieldW3 = (Field) obj2;
                } else {
                    fieldW3 = w(cls, (String) obj2);
                    objArr[i90] = fieldW3;
                }
                str = str;
                i66 = i66;
                i27 = i89;
                iObjectFieldOffset = iObjectFieldOffset3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldW3);
                i28 = 0;
            } else {
                int i91 = i15 + 1;
                Field fieldW4 = w(cls, (String) objArr[i15]);
                if (i81 == 9 || i81 == 17) {
                    objArr4[ca.f(i70, 3, 1)] = fieldW4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i66 = i66;
                        i15 += 2;
                        objArr4[ca.f(i70, 3, 1)] = objArr[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        if ((i35 & 1) != 0 || (iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                            i66 = i66;
                            i15 += 2;
                            objArr4[ca.f(i70, 3, 1)] = objArr[i91];
                        }
                    } else if (i81 == 50) {
                        int i92 = i69 + 1;
                        iArr[i69] = i70;
                        int i93 = i70 / 3;
                        int i94 = i15 + 2;
                        int i95 = i93 + i93;
                        objArr4[i95] = objArr[i91];
                        if ((iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0) {
                            objArr4[i95 + 1] = objArr[i94];
                            i15 += 3;
                        } else {
                            i15 = i94;
                        }
                        i69 = i92;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt11 & 4096) != 0 || i81 > 17) {
                        i27 = i26;
                        i28 = 0;
                    } else {
                        i27 = i26 + 1;
                        int iCharAt13 = str.charAt(i26);
                        if (iCharAt13 >= 55296) {
                            int i96 = iCharAt13 & 8191;
                            int i97 = 13;
                            while (true) {
                                i29 = i27 + 1;
                                cCharAt9 = str.charAt(i27);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i96 |= (cCharAt9 & 8191) << i97;
                                i97 += 13;
                                i27 = i29;
                            }
                            iCharAt13 = i96 | (cCharAt9 << i97);
                            i27 = i29;
                        }
                        int i98 = (iCharAt13 / 32) + i82 + i82;
                        Object obj3 = objArr[i98];
                        if (obj3 instanceof Field) {
                            fieldW = (Field) obj3;
                        } else {
                            fieldW = w(cls, (String) obj3);
                            objArr[i98] = fieldW;
                        }
                        i28 = iCharAt13 % 32;
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldW);
                    }
                    if (i81 >= 18 && i81 <= 49) {
                        iArr[i68] = iObjectFieldOffset;
                        i68++;
                    }
                }
                i15 = i91;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldW4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt11 & 4096) != 0) {
                    i27 = i26;
                    i28 = 0;
                } else {
                    i27 = i26;
                    i28 = 0;
                }
                if (i81 >= 18) {
                    iArr[i68] = iObjectFieldOffset;
                    i68++;
                }
            }
            int i99 = i70 + 1;
            iArr2[i70] = i80;
            int i100 = i70 + 2;
            iArr2[i99] = ((iCharAt11 & com.ironsource.mediationsdk.metadata.a.f29616n) != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i81 << 20) | iObjectFieldOffset;
            i70 += 3;
            iArr2[i100] = (i28 << 20) | iObjectFieldOffset2;
            i37 = i27;
            i66 = i66;
            objArr3 = objArr4;
            objArr2 = objArr;
            i11 = i82;
            str = str;
        }
        return new d1(iArr2, objArr3, i12, i14, k1Var.f22857a, iArr, i16, i66, v0Var, p1Var);
    }

    public static int o(m0 m0Var, long j10) {
        return ((Integer) x1.d(j10, m0Var)).intValue();
    }

    public static int q(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static Field w(Class cls, String str) {
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
            StringBuilder sbV = defpackage.e.v("Field ", str, " for ", name, " not found. Known fields are ");
            sbV.append(string);
            throw new RuntimeException(sbV.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.l1
    public final void a(Object obj) {
        if (k(obj)) {
            if (obj instanceof m0) {
                m0 m0Var = (m0) obj;
                m0Var.f();
                m0Var.zza = 0;
                m0Var.d();
            }
            int[] iArr = this.f22804a;
            int length = iArr.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iR = r(i10);
                int i11 = 1048575 & iR;
                int iQ = q(iR);
                long j10 = i11;
                if (iQ != 9) {
                    if (iQ != 60 && iQ != 68) {
                        switch (iQ) {
                            case 17:
                                if (j(i10, obj)) {
                                    t(i10).a(l.getObject(obj, j10));
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
                                this.f22812i.a(j10, obj);
                                break;
                            case 50:
                                Unsafe unsafe = l;
                                Object object = unsafe.getObject(obj, j10);
                                if (object != null) {
                                    ((y0) object).f22927a = false;
                                    unsafe.putObject(obj, j10, object);
                                }
                                break;
                        }
                    } else if (l(iArr[i10], i10, obj)) {
                        t(i10).a(l.getObject(obj, j10));
                    }
                } else if (j(i10, obj)) {
                    t(i10).a(l.getObject(obj, j10));
                }
            }
            this.f22813j.getClass();
            o1 o1Var = ((m0) obj).zzc;
            if (o1Var.f22887d) {
                o1Var.f22887d = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final boolean b(m0 m0Var, m0 m0Var2) {
        boolean zB;
        int[] iArr = this.f22804a;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iR = r(i10);
            long j10 = iR & 1048575;
            switch (q(iR)) {
                case 0:
                    if (i(m0Var, m0Var2, i10)) {
                        w1 w1Var = x1.f22919c;
                        if (Double.doubleToLongBits(w1Var.a(j10, m0Var)) == Double.doubleToLongBits(w1Var.a(j10, m0Var2))) {
                            continue;
                            break;
                        }
                    }
                case 1:
                    if (i(m0Var, m0Var2, i10)) {
                        w1 w1Var2 = x1.f22919c;
                        if (Float.floatToIntBits(w1Var2.b(j10, m0Var)) == Float.floatToIntBits(w1Var2.b(j10, m0Var2))) {
                            continue;
                            break;
                        }
                    }
                case 2:
                    if (i(m0Var, m0Var2, i10) && x1.b(j10, m0Var) == x1.b(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 3:
                    if (i(m0Var, m0Var2, i10) && x1.b(j10, m0Var) == x1.b(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 4:
                    if (i(m0Var, m0Var2, i10) && x1.a(j10, m0Var) == x1.a(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 5:
                    if (i(m0Var, m0Var2, i10) && x1.b(j10, m0Var) == x1.b(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 6:
                    if (i(m0Var, m0Var2, i10) && x1.a(j10, m0Var) == x1.a(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 7:
                    if (i(m0Var, m0Var2, i10)) {
                        w1 w1Var3 = x1.f22919c;
                        if (w1Var3.f(j10, m0Var) == w1Var3.f(j10, m0Var2)) {
                            continue;
                            break;
                        }
                    }
                case 8:
                    if (i(m0Var, m0Var2, i10) && m1.b(x1.d(j10, m0Var), x1.d(j10, m0Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 9:
                    if (i(m0Var, m0Var2, i10) && m1.b(x1.d(j10, m0Var), x1.d(j10, m0Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 10:
                    if (i(m0Var, m0Var2, i10) && m1.b(x1.d(j10, m0Var), x1.d(j10, m0Var2))) {
                        continue;
                        break;
                    }
                    break;
                case 11:
                    if (i(m0Var, m0Var2, i10) && x1.a(j10, m0Var) == x1.a(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 12:
                    if (i(m0Var, m0Var2, i10) && x1.a(j10, m0Var) == x1.a(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 13:
                    if (i(m0Var, m0Var2, i10) && x1.a(j10, m0Var) == x1.a(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 14:
                    if (i(m0Var, m0Var2, i10) && x1.b(j10, m0Var) == x1.b(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 15:
                    if (i(m0Var, m0Var2, i10) && x1.a(j10, m0Var) == x1.a(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 16:
                    if (i(m0Var, m0Var2, i10) && x1.b(j10, m0Var) == x1.b(j10, m0Var2)) {
                        continue;
                        break;
                    }
                    break;
                case 17:
                    if (i(m0Var, m0Var2, i10) && m1.b(x1.d(j10, m0Var), x1.d(j10, m0Var2))) {
                        continue;
                        break;
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
                    zB = m1.b(x1.d(j10, m0Var), x1.d(j10, m0Var2));
                    break;
                case 50:
                    zB = m1.b(x1.d(j10, m0Var), x1.d(j10, m0Var2));
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
                    if (x1.a(j11, m0Var) == x1.a(j11, m0Var2) && m1.b(x1.d(j10, m0Var), x1.d(j10, m0Var2))) {
                        continue;
                        break;
                    }
                    break;
                default:
                    continue;
                    break;
            }
            if (zB) {
            }
        }
        this.f22813j.getClass();
        return m0Var.zzc.equals(m0Var2.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[PHI: r3
  0x00e8: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0207, B:42:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.auth.l1
    public final int c(m0 m0Var) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int i12;
        int[] iArr = this.f22804a;
        int length = iArr.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 += 3) {
            int iR = r(i14);
            int i15 = iArr[i14];
            long j10 = 1048575 & iR;
            int i16 = 1237;
            int iHashCode = 37;
            switch (q(iR)) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(x1.f22919c.a(j10, m0Var));
                    Charset charset = p0.f22890a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(x1.f22919c.b(j10, m0Var));
                    i13 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = x1.b(j10, m0Var);
                    Charset charset2 = p0.f22890a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = x1.b(j10, m0Var);
                    Charset charset3 = p0.f22890a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.a(j10, m0Var);
                    i13 = iFloatToIntBits + i11;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = x1.b(j10, m0Var);
                    Charset charset4 = p0.f22890a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.a(j10, m0Var);
                    i13 = iFloatToIntBits + i11;
                    break;
                case 7:
                    i12 = i13 * 53;
                    boolean zF = x1.f22919c.f(j10, m0Var);
                    Charset charset5 = p0.f22890a;
                    if (zF) {
                        i16 = 1231;
                    }
                    i13 = i16 + i12;
                    break;
                case 8:
                    i11 = i13 * 53;
                    iFloatToIntBits = ((String) x1.d(j10, m0Var)).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 9:
                    Object objD = x1.d(j10, m0Var);
                    if (objD != null) {
                        iHashCode = objD.hashCode();
                    }
                    i13 = (i13 * 53) + iHashCode;
                    break;
                case 10:
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.d(j10, m0Var).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.a(j10, m0Var);
                    i13 = iFloatToIntBits + i11;
                    break;
                case 12:
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.a(j10, m0Var);
                    i13 = iFloatToIntBits + i11;
                    break;
                case 13:
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.a(j10, m0Var);
                    i13 = iFloatToIntBits + i11;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = x1.b(j10, m0Var);
                    Charset charset6 = p0.f22890a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.a(j10, m0Var);
                    i13 = iFloatToIntBits + i11;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = x1.b(j10, m0Var);
                    Charset charset7 = p0.f22890a;
                    i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object objD2 = x1.d(j10, m0Var);
                    if (objD2 != null) {
                        iHashCode = objD2.hashCode();
                    }
                    i13 = (i13 * 53) + iHashCode;
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
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.d(j10, m0Var).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    iFloatToIntBits = x1.d(j10, m0Var).hashCode();
                    i13 = iFloatToIntBits + i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) x1.d(j10, m0Var)).doubleValue());
                        Charset charset8 = p0.f22890a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) x1.d(j10, m0Var)).floatValue());
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = ((Long) x1.d(j10, m0Var)).longValue();
                        Charset charset9 = p0.f22890a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = ((Long) x1.d(j10, m0Var)).longValue();
                        Charset charset10 = p0.f22890a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = o(m0Var, j10);
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = ((Long) x1.d(j10, m0Var)).longValue();
                        Charset charset11 = p0.f22890a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = o(m0Var, j10);
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i12 = i13 * 53;
                        boolean zBooleanValue = ((Boolean) x1.d(j10, m0Var)).booleanValue();
                        Charset charset12 = p0.f22890a;
                        if (zBooleanValue) {
                            i16 = 1231;
                        }
                        i13 = i16 + i12;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = ((String) x1.d(j10, m0Var)).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 60:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = x1.d(j10, m0Var).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = x1.d(j10, m0Var).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = o(m0Var, j10);
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = o(m0Var, j10);
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 64:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = o(m0Var, j10);
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 65:
                    if (l(i15, i14, m0Var)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = ((Long) x1.d(j10, m0Var)).longValue();
                        Charset charset13 = p0.f22890a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = o(m0Var, j10);
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
                case 67:
                    if (l(i15, i14, m0Var)) {
                        i10 = i13 * 53;
                        jDoubleToLongBits = ((Long) x1.d(j10, m0Var)).longValue();
                        Charset charset14 = p0.f22890a;
                        i13 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (l(i15, i14, m0Var)) {
                        i11 = i13 * 53;
                        iFloatToIntBits = x1.d(j10, m0Var).hashCode();
                        i13 = iFloatToIntBits + i11;
                    }
                    break;
            }
        }
        this.f22813j.getClass();
        return m0Var.zzc.hashCode() + (i13 * 53);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.auth.l1
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!k(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f22804a;
            if (i10 >= iArr.length) {
                m1.a(this.f22813j, obj, obj2);
                return;
            }
            int iR = r(i10);
            int i11 = iArr[i10];
            long j10 = iR & 1048575;
            switch (q(iR)) {
                case 0:
                    if (!j(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        w1 w1Var = x1.f22919c;
                        obj3 = obj;
                        w1Var.d(obj3, j10, w1Var.a(j10, obj2));
                        z(i10, obj3);
                    }
                    break;
                case 1:
                    if (j(i10, obj2)) {
                        w1 w1Var2 = x1.f22919c;
                        w1Var2.e(obj, j10, w1Var2.b(j10, obj2));
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (j(i10, obj2)) {
                        x1.i(obj, j10, x1.b(j10, obj2));
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (j(i10, obj2)) {
                        x1.i(obj, j10, x1.b(j10, obj2));
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (j(i10, obj2)) {
                        x1.h(x1.a(j10, obj2), j10, obj);
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (j(i10, obj2)) {
                        x1.i(obj, j10, x1.b(j10, obj2));
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (j(i10, obj2)) {
                        x1.h(x1.a(j10, obj2), j10, obj);
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (j(i10, obj2)) {
                        w1 w1Var3 = x1.f22919c;
                        w1Var3.c(obj, j10, w1Var3.f(j10, obj2));
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (j(i10, obj2)) {
                        x1.j(obj, j10, x1.d(j10, obj2));
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (j(i10, obj2)) {
                        x1.j(obj, j10, x1.d(j10, obj2));
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (j(i10, obj2)) {
                        x1.h(x1.a(j10, obj2), j10, obj);
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (j(i10, obj2)) {
                        x1.h(x1.a(j10, obj2), j10, obj);
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (j(i10, obj2)) {
                        x1.h(x1.a(j10, obj2), j10, obj);
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (j(i10, obj2)) {
                        x1.i(obj, j10, x1.b(j10, obj2));
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (j(i10, obj2)) {
                        x1.h(x1.a(j10, obj2), j10, obj);
                        z(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (j(i10, obj2)) {
                        x1.i(obj, j10, x1.b(j10, obj2));
                        z(i10, obj);
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
                    this.f22812i.b(obj, j10, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = m1.f22873a;
                    x1.j(obj, j10, z0.a(x1.d(j10, obj), x1.d(j10, obj2)));
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
                    if (l(i11, i10, obj2)) {
                        x1.j(obj, j10, x1.d(j10, obj2));
                        x1.h(i11, iArr[i10 + 2] & 1048575, obj);
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
                    if (l(i11, i10, obj2)) {
                        x1.j(obj, j10, x1.d(j10, obj2));
                        x1.h(i11, iArr[i10 + 2] & 1048575, obj);
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

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    @Override // com.google.android.gms.internal.auth.l1
    public final boolean e(Object obj) {
        int iQ;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            boolean zJ = true;
            if (i10 >= this.f22810g) {
                return true;
            }
            int i13 = this.f22809f[i10];
            int[] iArr = this.f22804a;
            int i14 = iArr[i13];
            int iR = r(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i12) {
                if (i16 != 1048575) {
                    i11 = l.getInt(obj, i16);
                }
                i12 = i16;
            }
            if ((268435456 & iR) == 0) {
                iQ = q(iR);
                if (iQ != 9 || iQ == 17) {
                    if (i12 == 1048575) {
                        zJ = j(i13, obj);
                    } else if ((i17 & i11) == 0) {
                        zJ = false;
                    }
                    if (!zJ || t(i13).e(x1.d(iR & 1048575, obj))) {
                        i10++;
                    }
                } else {
                    if (iQ != 27) {
                        if (iQ == 60 || iQ == 68) {
                            if (!l(i14, i13, obj) || t(i13).e(x1.d(iR & 1048575, obj))) {
                            }
                        } else if (iQ != 49) {
                            if (iQ == 50 && !((y0) x1.d(iR & 1048575, obj)).isEmpty()) {
                                int i18 = i13 / 3;
                                throw q4.a.h(this.f22805b[i18 + i18]);
                            }
                        }
                        i10++;
                    }
                    List list = (List) x1.d(iR & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        l1 l1VarT = t(i13);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (l1VarT.e(list.get(i19))) {
                            }
                        }
                    }
                    i10++;
                }
            } else {
                if (i12 == 1048575 ? j(i13, obj) : (i11 & i17) != 0) {
                    iQ = q(iR);
                    if (iQ != 9) {
                    }
                    if (i12 == 1048575) {
                        zJ = j(i13, obj);
                    } else if ((i17 & i11) == 0) {
                        zJ = false;
                    }
                    if (!zJ) {
                        continue;
                    }
                    i10++;
                }
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final void f(Object obj, byte[] bArr, int i10, int i11, b2.d0 d0Var) throws q0 {
        m(obj, bArr, i10, i11, 0, d0Var);
    }

    public final void g(int i10, Object obj, Object obj2) {
        l.putObject(obj, r(i10) & 1048575, obj2);
        z(i10, obj);
    }

    public final void h(int i10, int i11, Object obj, Object obj2) {
        l.putObject(obj, r(i11) & 1048575, obj2);
        x1.h(i10, this.f22804a[i11 + 2] & 1048575, obj);
    }

    public final boolean i(m0 m0Var, m0 m0Var2, int i10) {
        return j(i10, m0Var) == j(i10, m0Var2);
    }

    public final boolean j(int i10, Object obj) {
        int i11 = this.f22804a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iR = r(i10);
            long j11 = iR & 1048575;
            switch (q(iR)) {
                case 0:
                    if (Double.doubleToRawLongBits(x1.f22919c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(x1.f22919c.b(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (x1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (x1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (x1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (x1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (x1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return x1.f22919c.f(j11, obj);
                case 8:
                    Object objD = x1.d(j11, obj);
                    if (objD instanceof String) {
                        if (((String) objD).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objD instanceof h0)) {
                            throw new IllegalArgumentException();
                        }
                        if (h0.f22838c.equals(objD)) {
                            return false;
                        }
                    }
                case 9:
                    if (x1.d(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (h0.f22838c.equals(x1.d(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (x1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (x1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (x1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (x1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (x1.a(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (x1.b(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (x1.d(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & x1.a(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean l(int i10, int i11, Object obj) {
        return x1.a((long) (this.f22804a[i11 + 2] & 1048575), obj) == i10;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0295  */
    /* JADX WARN: Code duplicated, block: B:110:0x029f  */
    /* JADX WARN: Code duplicated, block: B:112:0x02af  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b8 A[PHI: r3
  0x02b8: PHI (r3v57 byte) = (r3v36 byte), (r3v66 byte) binds: [B:113:0x02b3, B:115:0x02b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x02bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x02be  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bf A[PHI: r3
  0x02bf: PHI (r3v58 byte) = (r3v57 byte), (r3v65 byte) binds: [B:117:0x02ba, B:119:0x02be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0308  */
    /* JADX WARN: Code duplicated, block: B:147:0x0379  */
    /* JADX WARN: Code duplicated, block: B:149:0x0384 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0386  */
    /* JADX WARN: Code duplicated, block: B:152:0x038a  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:174:0x0435  */
    /* JADX WARN: Code duplicated, block: B:194:0x0522  */
    /* JADX WARN: Code duplicated, block: B:197:0x052b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0588  */
    /* JADX WARN: Code duplicated, block: B:208:0x0591  */
    /* JADX WARN: Code duplicated, block: B:212:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:214:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:216:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:218:0x05e0 A[LOOP:3: B:215:0x05d2->B:218:0x05e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x060b  */
    /* JADX WARN: Code duplicated, block: B:223:0x061d  */
    /* JADX WARN: Code duplicated, block: B:225:0x0630 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x0632  */
    /* JADX WARN: Code duplicated, block: B:228:0x063b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:236:0x064d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x0657  */
    /* JADX WARN: Code duplicated, block: B:241:0x065b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0661  */
    /* JADX WARN: Code duplicated, block: B:245:0x0674 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:246:0x0676  */
    /* JADX WARN: Code duplicated, block: B:248:0x067f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x0691 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x0696  */
    /* JADX WARN: Code duplicated, block: B:261:0x069a  */
    /* JADX WARN: Code duplicated, block: B:263:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:265:0x06b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:266:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:268:0x06be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:269:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:276:0x06d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:279:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:281:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:283:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:285:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:287:0x0701  */
    /* JADX WARN: Code duplicated, block: B:289:0x0705 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:290:0x0707  */
    /* JADX WARN: Code duplicated, block: B:291:0x070d  */
    /* JADX WARN: Code duplicated, block: B:294:0x0717  */
    /* JADX WARN: Code duplicated, block: B:296:0x071f  */
    /* JADX WARN: Code duplicated, block: B:298:0x0727  */
    /* JADX WARN: Code duplicated, block: B:300:0x072b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:312:0x0752  */
    /* JADX WARN: Code duplicated, block: B:314:0x0765  */
    /* JADX WARN: Code duplicated, block: B:316:0x0779  */
    /* JADX WARN: Code duplicated, block: B:318:0x078d  */
    /* JADX WARN: Code duplicated, block: B:320:0x0796  */
    /* JADX WARN: Code duplicated, block: B:322:0x079e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:323:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:324:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:327:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:329:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:331:0x07c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:338:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:340:0x07e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:341:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:342:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:344:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:347:0x0807  */
    /* JADX WARN: Code duplicated, block: B:349:0x080f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:351:0x0817 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:355:0x082a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:364:0x084b  */
    /* JADX WARN: Code duplicated, block: B:366:0x085f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:367:0x0861  */
    /* JADX WARN: Code duplicated, block: B:369:0x086a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:377:0x087d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:380:0x0883  */
    /* JADX WARN: Code duplicated, block: B:382:0x0887  */
    /* JADX WARN: Code duplicated, block: B:384:0x088d  */
    /* JADX WARN: Code duplicated, block: B:386:0x08a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:389:0x08ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:397:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:401:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:403:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:405:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:407:0x08e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:410:0x08ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:418:0x0902  */
    /* JADX WARN: Code duplicated, block: B:422:0x0909  */
    /* JADX WARN: Code duplicated, block: B:424:0x090d  */
    /* JADX WARN: Code duplicated, block: B:426:0x0913  */
    /* JADX WARN: Code duplicated, block: B:428:0x0927 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:429:0x0929  */
    /* JADX WARN: Code duplicated, block: B:431:0x0932 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:439:0x0945 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:442:0x094b  */
    /* JADX WARN: Code duplicated, block: B:444:0x094f  */
    /* JADX WARN: Code duplicated, block: B:446:0x0955  */
    /* JADX WARN: Code duplicated, block: B:448:0x0969 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:449:0x096b  */
    /* JADX WARN: Code duplicated, block: B:451:0x0974 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:459:0x0987 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:462:0x098d  */
    /* JADX WARN: Code duplicated, block: B:464:0x0991  */
    /* JADX WARN: Code duplicated, block: B:466:0x0997  */
    /* JADX WARN: Code duplicated, block: B:468:0x09ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:469:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:471:0x09b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:479:0x09cc  */
    /* JADX WARN: Code duplicated, block: B:483:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:485:0x09da  */
    /* JADX WARN: Code duplicated, block: B:487:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:489:0x09f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:490:0x09f6  */
    /* JADX WARN: Code duplicated, block: B:492:0x09ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:500:0x0a15  */
    /* JADX WARN: Code duplicated, block: B:502:0x0a18 A[PHI: r3 r4 r9 r14 r15 r20 r21 r29
  0x0a18: PHI (r3v136 int) = 
  (r3v119 int)
  (r3v120 int)
  (r3v121 int)
  (r3v122 int)
  (r3v123 int)
  (r3v124 int)
  (r3v125 int)
  (r3v126 int)
  (r3v134 int)
  (r3v143 int)
 binds: [B:501:0x0a16, B:480:0x09cd, B:459:0x0987, B:439:0x0945, B:419:0x0903, B:398:0x08c0, B:377:0x087d, B:317:0x078b, B:237:0x064f, B:222:0x060b] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r4v101 byte[]) = 
  (r4v76 byte[])
  (r4v77 byte[])
  (r4v78 byte[])
  (r4v79 byte[])
  (r4v80 byte[])
  (r4v81 byte[])
  (r4v82 byte[])
  (r4v83 byte[])
  (r4v98 byte[])
  (r4v105 byte[])
 binds: [B:501:0x0a16, B:480:0x09cd, B:459:0x0987, B:439:0x0945, B:419:0x0903, B:398:0x08c0, B:377:0x087d, B:317:0x078b, B:237:0x064f, B:222:0x060b] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r9v63 int) = 
  (r9v46 int)
  (r9v47 int)
  (r9v48 int)
  (r9v49 int)
  (r9v50 int)
  (r9v51 int)
  (r9v52 int)
  (r9v53 int)
  (r9v61 int)
  (r9v67 int)
 binds: [B:501:0x0a16, B:480:0x09cd, B:459:0x0987, B:439:0x0945, B:419:0x0903, B:398:0x08c0, B:377:0x087d, B:317:0x078b, B:237:0x064f, B:222:0x060b] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r14v54 int) = 
  (r14v43 int)
  (r14v44 int)
  (r14v45 int)
  (r14v46 int)
  (r14v47 int)
  (r14v48 int)
  (r14v49 int)
  (r14v50 int)
  (r14v53 int)
  (r14v58 int)
 binds: [B:501:0x0a16, B:480:0x09cd, B:459:0x0987, B:439:0x0945, B:419:0x0903, B:398:0x08c0, B:377:0x087d, B:317:0x078b, B:237:0x064f, B:222:0x060b] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r15v67 b2.d0) = 
  (r15v50 b2.d0)
  (r15v51 b2.d0)
  (r15v52 b2.d0)
  (r15v53 b2.d0)
  (r15v54 b2.d0)
  (r15v55 b2.d0)
  (r15v56 b2.d0)
  (r15v57 b2.d0)
  (r15v65 b2.d0)
  (r15v72 b2.d0)
 binds: [B:501:0x0a16, B:480:0x09cd, B:459:0x0987, B:439:0x0945, B:419:0x0903, B:398:0x08c0, B:377:0x087d, B:317:0x078b, B:237:0x064f, B:222:0x060b] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r20v45 int) = 
  (r20v30 int)
  (r20v31 int)
  (r20v32 int)
  (r20v33 int)
  (r20v34 int)
  (r20v35 int)
  (r20v36 int)
  (r20v37 int)
  (r20v43 int)
  (r20v48 int)
 binds: [B:501:0x0a16, B:480:0x09cd, B:459:0x0987, B:439:0x0945, B:419:0x0903, B:398:0x08c0, B:377:0x087d, B:317:0x078b, B:237:0x064f, B:222:0x060b] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r21v25 int) = 
  (r21v10 int)
  (r21v11 int)
  (r21v12 int)
  (r21v13 int)
  (r21v14 int)
  (r21v15 int)
  (r21v16 int)
  (r21v17 int)
  (r21v23 int)
  (r21v28 int)
 binds: [B:501:0x0a16, B:480:0x09cd, B:459:0x0987, B:439:0x0945, B:419:0x0903, B:398:0x08c0, B:377:0x087d, B:317:0x078b, B:237:0x064f, B:222:0x060b] A[DONT_GENERATE, DONT_INLINE]
  0x0a18: PHI (r29v24 sun.misc.Unsafe) = 
  (r29v9 sun.misc.Unsafe)
  (r29v10 sun.misc.Unsafe)
  (r29v11 sun.misc.Unsafe)
  (r29v12 sun.misc.Unsafe)
  (r29v13 sun.misc.Unsafe)
  (r29v14 sun.misc.Unsafe)
  (r29v15 sun.misc.Unsafe)
  (r29v16 sun.misc.Unsafe)
  (r29v22 sun.misc.Unsafe)
  (r29v27 sun.misc.Unsafe)
 binds: [B:501:0x0a16, B:480:0x09cd, B:459:0x0987, B:439:0x0945, B:419:0x0903, B:398:0x08c0, B:377:0x087d, B:317:0x078b, B:237:0x064f, B:222:0x060b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:508:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:510:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:518:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:520:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:521:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:526:0x0aa5  */
    /* JADX WARN: Code duplicated, block: B:528:0x0ab8 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:529:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:531:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:532:0x0ae7  */
    /* JADX WARN: Code duplicated, block: B:534:0x0aeb  */
    /* JADX WARN: Code duplicated, block: B:537:0x0b0d  */
    /* JADX WARN: Code duplicated, block: B:539:0x0b0f A[PHI: r10 r14
  0x0b0f: PHI (r10v20 int) = (r10v16 int), (r10v21 int) binds: [B:553:0x0b7f, B:538:0x0b0e] A[DONT_GENERATE, DONT_INLINE]
  0x0b0f: PHI (r14v75 int) = (r14v70 int), (r14v76 int) binds: [B:553:0x0b7f, B:538:0x0b0e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:540:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:542:0x0b18  */
    /* JADX WARN: Code duplicated, block: B:543:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:545:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:546:0x0b4a  */
    /* JADX WARN: Code duplicated, block: B:548:0x0b50  */
    /* JADX WARN: Code duplicated, block: B:549:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:551:0x0b63  */
    /* JADX WARN: Code duplicated, block: B:552:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:554:0x0b81  */
    /* JADX WARN: Code duplicated, block: B:556:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:557:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:559:0x0b93  */
    /* JADX WARN: Code duplicated, block: B:566:0x0bb9  */
    /* JADX WARN: Code duplicated, block: B:568:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:570:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:571:0x0bce  */
    /* JADX WARN: Code duplicated, block: B:574:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:576:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:577:0x0bf7  */
    /* JADX WARN: Code duplicated, block: B:579:0x0bff  */
    /* JADX WARN: Code duplicated, block: B:580:0x0c11  */
    /* JADX WARN: Code duplicated, block: B:582:0x0c18  */
    /* JADX WARN: Code duplicated, block: B:583:0x0c29  */
    /* JADX WARN: Code duplicated, block: B:585:0x0c30  */
    /* JADX WARN: Code duplicated, block: B:586:0x0c42  */
    /* JADX WARN: Code duplicated, block: B:588:0x0c4a  */
    /* JADX WARN: Code duplicated, block: B:589:0x0c5f  */
    /* JADX WARN: Code duplicated, block: B:591:0x0c67  */
    /* JADX WARN: Code duplicated, block: B:592:0x0c7c A[PHI: r10 r14 r19
  0x0c7c: PHI (r10v27 int) = 
  (r10v8 int)
  (r10v9 int)
  (r10v10 int)
  (r10v11 int)
  (r10v12 int)
  (r10v13 int)
  (r10v15 int)
  (r10v20 int)
  (r10v28 int)
 binds: [B:590:0x0c65, B:587:0x0c48, B:584:0x0c2e, B:581:0x0c16, B:578:0x0bfd, B:575:0x0be3, B:567:0x0bbe, B:539:0x0b0f, B:528:0x0ab8] A[DONT_GENERATE, DONT_INLINE]
  0x0c7c: PHI (r14v84 int) = 
  (r14v62 int)
  (r14v63 int)
  (r14v64 int)
  (r14v65 int)
  (r14v66 int)
  (r14v67 int)
  (r14v69 int)
  (r14v75 int)
  (r14v85 int)
 binds: [B:590:0x0c65, B:587:0x0c48, B:584:0x0c2e, B:581:0x0c16, B:578:0x0bfd, B:575:0x0be3, B:567:0x0bbe, B:539:0x0b0f, B:528:0x0ab8] A[DONT_GENERATE, DONT_INLINE]
  0x0c7c: PHI (r19v29 int) = 
  (r19v13 int)
  (r19v14 int)
  (r19v15 int)
  (r19v16 int)
  (r19v17 int)
  (r19v18 int)
  (r19v20 int)
  (r19v25 int)
  (r19v30 int)
 binds: [B:590:0x0c65, B:587:0x0c48, B:584:0x0c2e, B:581:0x0c16, B:578:0x0bfd, B:575:0x0be3, B:567:0x0bbe, B:539:0x0b0f, B:528:0x0ab8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:603:0x0cb4  */
    /* JADX WARN: Code duplicated, block: B:633:0x0374 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:0x028b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x02de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x033f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x047b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0647 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x0643 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x0655 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:0x068b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0687 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0682 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:660:0x0694 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x06cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x06c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x06da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x074d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0748 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:0x0740 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:0x073b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x07d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x0846 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0841 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:0x083c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x0837 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x0877 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:0x0873 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x086e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:0x0881 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:0x08b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x08b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x08b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x08c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x08fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x08f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:686:0x0907 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:687:0x093f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:688:0x093b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:689:0x0936 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0949 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x0981 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x097d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0978 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x098b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x09c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:696:0x09be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:697:0x09b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:698:0x09d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:699:0x0a0f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:700:0x0a07 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:701:0x0a02 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:702:0x0a39 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x0a61 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:704:0x0ba1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:706:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:707:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:711:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:712:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:713:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:714:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:715:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x0c7f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:717:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:719:0x044e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x0515 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:721:0x0a1b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:722:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x04fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:724:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:725:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:726:0x03ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:728:0x0469 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:729:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x04bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:736:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:737:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:739:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x020d  */
    /* JADX WARN: Code duplicated, block: B:740:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:741:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:743:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:744:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:745:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:747:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x0554 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:749:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:750:0x0a49 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:751:0x0a2e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:752:0x0a5e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:753:0x0c94 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:754:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:765:0x0602 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:766:0x05fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:768:0x0745 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:769:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0217  */
    /* JADX WARN: Code duplicated, block: B:770:0x072d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:776:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:777:0x07c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:778:0x07c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x021f  */
    /* JADX WARN: Code duplicated, block: B:784:0x0776 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:785:0x081d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:786:0x0819 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:792:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:794:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:795:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:796:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:797:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:798:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x022a  */
    /* JADX WARN: Code duplicated, block: B:802:0x023f A[ADDED_TO_REGION, EDGE_INSN: B:802:0x023f->B:799:0x023f BREAK  A[LOOP:9: B:88:0x024f->B:92:0x0257], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0231  */
    /* JADX WARN: Code duplicated, block: B:83:0x0235 A[LOOP:7: B:80:0x022f->B:83:0x0235, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0241  */
    /* JADX WARN: Code duplicated, block: B:90:0x0253  */
    /* JADX WARN: Code duplicated, block: B:96:0x0267  */
    /* JADX WARN: Code duplicated, block: B:98:0x0273  */
    public final int m(Object obj, byte[] bArr, int i10, int i11, int i12, b2.d0 d0Var) throws q0 {
        int[] iArr;
        Object obj2;
        int i13;
        byte[] bArr2;
        Unsafe unsafe;
        int i14;
        int i15;
        b2.d0 d0Var2;
        m0 m0Var;
        o1 o1VarA;
        int i16;
        int i17;
        int iQ;
        long j10;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Unsafe unsafe2;
        Object obj3;
        int i23;
        byte[] bArr3;
        b2.d0 d0Var3;
        int i24;
        boolean z10;
        byte[] bArr4;
        Object obj4;
        b2.d0 d0Var4;
        Unsafe unsafe3;
        int iP;
        int i25;
        int iP2;
        int i26;
        int length;
        int i27;
        char[] cArr;
        int i28;
        int i29;
        int i30;
        byte b10;
        int i31;
        byte b11;
        byte b12;
        int i32;
        byte b13;
        byte b14;
        int i33;
        byte b15;
        int i34;
        byte b16;
        Object obj5;
        Unsafe unsafe4;
        Unsafe unsafe5;
        b2.d0 d0Var5;
        int i35;
        Unsafe unsafe6;
        Object obj6;
        int i36;
        int i37;
        Object obj7;
        Unsafe unsafe7;
        int i38;
        int i39;
        int i40;
        int i41;
        n0 n0VarF;
        Unsafe unsafe8;
        long j11;
        Unsafe unsafe9;
        n0 n0VarF2;
        n0 n0Var;
        int i42;
        int i43;
        int i44;
        int iP3;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int iP4;
        int i52;
        int i53;
        int iP5;
        int i54;
        int i55;
        int i56;
        int iP6;
        int i57;
        byte[] bArr5;
        int i58;
        b2.d0 d0Var6;
        int i59;
        int iP7;
        int i60;
        int iP8;
        int i61;
        int i62;
        int i63;
        int i64;
        l1 l1VarT;
        int i65;
        d1 d1Var;
        int i66;
        int i67;
        int iP9;
        d1 d1Var2;
        Unsafe unsafe10;
        Object object;
        y0 y0Var;
        y0 y0Var2;
        Unsafe unsafe11;
        long j12;
        int i68;
        int i69;
        int iP10;
        int iR;
        boolean z11;
        int iP11;
        int i70;
        int i71;
        int iL;
        Object obj8 = obj;
        byte[] bArr6 = bArr;
        i11 = i11;
        b2.d0 d0Var7 = d0Var;
        if (!k(obj8)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj8)));
        }
        Unsafe unsafe12 = l;
        int iR2 = i10;
        int i72 = -1;
        int iP12 = 0;
        int i73 = 1048575;
        int i74 = 0;
        int i75 = 0;
        while (true) {
            int i76 = 1048575;
            while (true) {
                int[] iArr2 = this.f22804a;
                if (iR2 < i11) {
                    int iQ2 = iR2 + 1;
                    int i77 = bArr6[iR2];
                    if (i77 < 0) {
                        iQ2 = go.c.Q(i77, iQ2, d0Var7, bArr6);
                        i77 = d0Var7.f5246c;
                    }
                    int i78 = iQ2;
                    i75 = i77;
                    i72 = (i75 == true ? 1 : 0) >>> 3;
                    int i79 = this.f22807d;
                    int i80 = this.f22806c;
                    if (i72 > i72) {
                        iP12 = (i72 < i80 || i72 > i79) ? -1 : p(i72, iP12 / 3);
                    } else {
                        if (i72 < i80 || i72 > i79) {
                            i13 = -1;
                            iP12 = -1;
                        } else {
                            iP12 = p(i72, 0);
                        }
                        if (iP12 == i13) {
                            i16 = (i75 == true ? 1 : 0) & 7;
                            i17 = iArr2[iP12 + 1];
                            iQ = q(i17);
                            j10 = i17 & i76;
                            if (iQ <= 17) {
                                int i81 = iArr2[iP12 + 2];
                                i18 = 1 << (i81 >>> 20);
                                i19 = i81 & i76;
                                if (i19 != i73) {
                                    i36 = i76;
                                    if (i73 != i36) {
                                        unsafe12.putInt(obj8, i73, i74);
                                        i36 = 1048575;
                                    }
                                    if (i19 == i36) {
                                        i37 = 0;
                                    } else {
                                        i37 = unsafe12.getInt(obj8, i19);
                                    }
                                    i20 = i37;
                                    i21 = i19;
                                } else {
                                    i20 = i74;
                                    i21 = i73;
                                }
                                switch (iQ) {
                                    case 0:
                                        bArr4 = bArr;
                                        i35 = i78;
                                        iArr2 = iArr2;
                                        i23 = i21;
                                        d0Var4 = d0Var;
                                        unsafe3 = unsafe12;
                                        i24 = i75 == true ? 1 : 0;
                                        if (i16 == 1) {
                                            x1.f22919c.d(obj8, j10, Double.longBitsToDouble(go.c.T(i35, bArr4)));
                                            iR2 = i35 + 8;
                                            obj8 = obj8;
                                            unsafe12 = unsafe3;
                                            i74 = i20 | i18;
                                            i73 = i23;
                                            bArr6 = bArr4;
                                            d0Var7 = d0Var4;
                                            i75 = i24;
                                        }
                                        obj4 = obj8;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                        break;
                                    case 1:
                                        bArr4 = bArr;
                                        i35 = i78;
                                        iArr2 = iArr2;
                                        i23 = i21;
                                        d0Var4 = d0Var;
                                        unsafe3 = unsafe12;
                                        i24 = i75 == true ? 1 : 0;
                                        if (i16 == 5) {
                                            x1.f22919c.e(obj8, j10, Float.intBitsToFloat(go.c.M(i35, bArr4)));
                                            iR2 = i35 + 4;
                                            i74 = i20 | i18;
                                            unsafe12 = unsafe3;
                                            i73 = i23;
                                            bArr6 = bArr4;
                                            d0Var7 = d0Var4;
                                            i75 = i24;
                                        }
                                        obj4 = obj8;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                        break;
                                    case 2:
                                    case 3:
                                        bArr4 = bArr;
                                        i35 = i78;
                                        i23 = i21;
                                        d0Var4 = d0Var;
                                        i24 = i75 == true ? 1 : 0;
                                        if (i16 == 0) {
                                            int iR3 = go.c.R(bArr4, i35, d0Var4);
                                            unsafe12.putLong(obj8, j10, d0Var4.f5245b);
                                            i74 = i20 | i18;
                                            unsafe12 = unsafe12;
                                            i73 = i23;
                                            bArr6 = bArr4;
                                            iR2 = iR3;
                                            d0Var7 = d0Var4;
                                            i75 = i24;
                                        }
                                        unsafe3 = unsafe12;
                                        obj4 = obj8;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                        break;
                                    case 4:
                                    case 11:
                                        bArr4 = bArr;
                                        i35 = i78;
                                        i23 = i21;
                                        d0Var4 = d0Var;
                                        i24 = i75 == true ? 1 : 0;
                                        if (i16 == 0) {
                                            int iP13 = go.c.P(bArr4, i35, d0Var4);
                                            unsafe12.putInt(obj8, j10, d0Var4.f5246c);
                                            i74 = i20 | i18;
                                            i73 = i23;
                                            iR2 = iP13;
                                            bArr6 = bArr4;
                                            iP12 = iP12;
                                            i72 = i72;
                                            d0Var7 = d0Var4;
                                            i75 = i24 == true ? 1 : 0;
                                            i76 = 1048575;
                                            i11 = i11;
                                        } else {
                                            unsafe3 = unsafe12;
                                            obj4 = obj8;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 5:
                                    case 14:
                                        unsafe6 = unsafe12;
                                        obj6 = obj8;
                                        i23 = i21;
                                        i24 = i75 == true ? 1 : 0;
                                        if (i16 == 1) {
                                            bArr4 = bArr;
                                            unsafe12 = unsafe6;
                                            d0Var4 = d0Var;
                                            obj8 = obj6;
                                            unsafe12.putLong(obj8, j10, go.c.T(i78, bArr));
                                            iR2 = i78 + 8;
                                            i74 = i20 | i18;
                                            i73 = i23;
                                            bArr6 = bArr4;
                                            d0Var7 = d0Var4;
                                            i75 = i24;
                                        } else {
                                            d0Var4 = d0Var;
                                            obj8 = obj6;
                                            bArr4 = bArr;
                                            unsafe12 = unsafe6;
                                            i35 = i78;
                                            unsafe3 = unsafe12;
                                            obj4 = obj8;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 6:
                                    case 13:
                                        i22 = i78;
                                        unsafe2 = unsafe12;
                                        obj3 = obj8;
                                        i23 = i21;
                                        bArr3 = bArr;
                                        d0Var3 = d0Var;
                                        i24 = i75 == true ? 1 : 0;
                                        if (i16 == 5) {
                                            unsafe2.putInt(obj3, j10, go.c.M(i22, bArr3));
                                            iR2 = i22 + 4;
                                            i74 = i20 | i18;
                                            Object obj9 = obj3;
                                            d0Var7 = d0Var3;
                                            obj8 = obj9;
                                            i11 = i11;
                                            bArr6 = bArr3;
                                            unsafe12 = unsafe2;
                                            i75 = i24;
                                            i76 = 1048575;
                                            i73 = i23;
                                        } else {
                                            Object obj10 = obj3;
                                            bArr4 = bArr3;
                                            obj4 = obj10;
                                            d0Var4 = d0Var3;
                                            unsafe3 = unsafe2;
                                            i35 = i22;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 7:
                                        i22 = i78;
                                        unsafe2 = unsafe12;
                                        obj3 = obj8;
                                        i23 = i21;
                                        bArr3 = bArr;
                                        d0Var3 = d0Var;
                                        i24 = i75 == true ? 1 : 0;
                                        if (i16 == 0) {
                                            iR2 = go.c.R(bArr3, i22, d0Var3);
                                            if (d0Var3.f5245b != 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            x1.f22919c.c(obj3, j10, z10);
                                            i74 = i20 | i18;
                                            Object obj11 = obj3;
                                            d0Var7 = d0Var3;
                                            obj8 = obj11;
                                            i11 = i11;
                                            bArr6 = bArr3;
                                            unsafe12 = unsafe2;
                                            i75 = i24;
                                            i76 = 1048575;
                                            i73 = i23;
                                        } else {
                                            Object obj12 = obj3;
                                            bArr4 = bArr3;
                                            obj4 = obj12;
                                            d0Var4 = d0Var3;
                                            unsafe3 = unsafe2;
                                            i35 = i22;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 8:
                                        i22 = i78;
                                        unsafe2 = unsafe12;
                                        obj3 = obj8;
                                        i23 = i21;
                                        bArr3 = bArr;
                                        d0Var3 = d0Var;
                                        if (i16 == 2) {
                                            if ((i17 & 536870912) != 0) {
                                                iP2 = go.c.P(bArr3, i22, d0Var3);
                                                i26 = d0Var3.f5246c;
                                                if (i26 >= 0) {
                                                    throw q0.g();
                                                }
                                                if (i26 == 0) {
                                                    d0Var3.f5247d = "";
                                                    iR2 = iP2;
                                                    i24 = i75 == true ? 1 : 0;
                                                } else {
                                                    z zVar = y1.f22928a;
                                                    length = bArr3.length;
                                                    if ((((length - iP2) - i26) | iP2 | i26) >= 0) {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iP2), Integer.valueOf(i26)));
                                                    }
                                                    i27 = iP2 + i26;
                                                    cArr = new char[i26];
                                                    i28 = 0;
                                                    while (iP2 < i27) {
                                                        b16 = bArr3[iP2];
                                                        if (b16 >= 0) {
                                                            iP2++;
                                                            cArr[i28] = (char) b16;
                                                            i28++;
                                                        } else {
                                                            while (iP2 < i27) {
                                                                i29 = iP2 + 1;
                                                                i30 = iP2;
                                                                b10 = bArr3[i30];
                                                                if (b10 >= 0) {
                                                                    i31 = i28 + 1;
                                                                    cArr[i28] = (char) b10;
                                                                    iP2 = i29;
                                                                    while (true) {
                                                                        i28 = i31;
                                                                        if (iP2 >= i27 || (b11 = bArr3[iP2]) < 0) {
                                                                        }
                                                                        iP2++;
                                                                        i31 = i28 + 1;
                                                                        cArr[i28] = (char) b11;
                                                                    }
                                                                } else {
                                                                    b12 = i75 == true ? 1 : 0;
                                                                    if (b10 >= -32) {
                                                                        i32 = i27;
                                                                        if (b10 < -16) {
                                                                            if (i29 < i32 - 2) {
                                                                                throw q0.d();
                                                                            }
                                                                            b13 = bArr3[i29];
                                                                            int i82 = i30 + 3;
                                                                            byte b17 = bArr3[i30 + 2];
                                                                            int i83 = i30 + 4;
                                                                            byte b18 = bArr3[i82];
                                                                            if (!j1.f.L(b13)) {
                                                                                if ((((b13 + 112) + (b10 << 28)) >> 30) != 0 && !j1.f.L(b17) && !j1.f.L(b18)) {
                                                                                    int i84 = ((b10 & 7) << 18) | ((b13 & Utf8.REPLACEMENT_BYTE) << 12) | ((b17 & Utf8.REPLACEMENT_BYTE) << 6) | (b18 & Utf8.REPLACEMENT_BYTE);
                                                                                    cArr[i28] = (char) ((i84 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                                                                    cArr[i28 + 1] = (char) ((i84 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                                                                                    i28 += 2;
                                                                                    iP2 = i83;
                                                                                }
                                                                            }
                                                                            throw q0.d();
                                                                        }
                                                                        if (i29 < i32 - 1) {
                                                                            throw q0.d();
                                                                        }
                                                                        int i85 = i30 + 2;
                                                                        b14 = bArr3[i29];
                                                                        i33 = i30 + 3;
                                                                        b15 = bArr3[i85];
                                                                        i34 = i28 + 1;
                                                                        if (j1.f.L(b14)) {
                                                                            if (b10 != -32) {
                                                                                if (b10 != -19) {
                                                                                    if (!j1.f.L(b15)) {
                                                                                        cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                                        iP2 = i33;
                                                                                        i75 = b12 == true ? 1 : 0;
                                                                                        i27 = i32;
                                                                                        i28 = i34;
                                                                                    }
                                                                                } else if (b14 < -96) {
                                                                                    b10 = -19;
                                                                                    if (!j1.f.L(b15)) {
                                                                                        cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                                        iP2 = i33;
                                                                                        i75 = b12 == true ? 1 : 0;
                                                                                        i27 = i32;
                                                                                        i28 = i34;
                                                                                    }
                                                                                }
                                                                            } else if (b14 >= -96) {
                                                                                b10 = -32;
                                                                                if (b10 != -19) {
                                                                                    if (!j1.f.L(b15)) {
                                                                                        cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                                        iP2 = i33;
                                                                                        i75 = b12 == true ? 1 : 0;
                                                                                        i27 = i32;
                                                                                        i28 = i34;
                                                                                    }
                                                                                } else if (b14 < -96) {
                                                                                    b10 = -19;
                                                                                    if (!j1.f.L(b15)) {
                                                                                        cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                                        iP2 = i33;
                                                                                        i75 = b12 == true ? 1 : 0;
                                                                                        i27 = i32;
                                                                                        i28 = i34;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        throw q0.d();
                                                                    }
                                                                    if (i29 < i27) {
                                                                        throw q0.d();
                                                                    }
                                                                    int i86 = i30 + 2;
                                                                    byte b19 = bArr3[i29];
                                                                    int i87 = i28 + 1;
                                                                    i32 = i27;
                                                                    if (b10 >= -62 || j1.f.L(b19)) {
                                                                        throw q0.d();
                                                                    }
                                                                    cArr[i28] = (char) (((b10 & 31) << 6) | (b19 & Utf8.REPLACEMENT_BYTE));
                                                                    iP2 = i86;
                                                                    i28 = i87;
                                                                    i75 = b12 == true ? 1 : 0;
                                                                    i27 = i32;
                                                                }
                                                                break;
                                                            }
                                                            i24 = i75 == true ? 1 : 0;
                                                            d0Var3.f5247d = new String(cArr, 0, i28);
                                                            iR2 = i27;
                                                        }
                                                    }
                                                    while (iP2 < i27) {
                                                        i29 = iP2 + 1;
                                                        i30 = iP2;
                                                        b10 = bArr3[i30];
                                                        if (b10 >= 0) {
                                                            i31 = i28 + 1;
                                                            cArr[i28] = (char) b10;
                                                            iP2 = i29;
                                                            while (true) {
                                                                i28 = i31;
                                                                if (iP2 >= i27) {
                                                                }
                                                                break;
                                                                iP2++;
                                                                i31 = i28 + 1;
                                                                cArr[i28] = (char) b11;
                                                            }
                                                        } else {
                                                            b12 = i75 == true ? 1 : 0;
                                                            if (b10 >= -32) {
                                                                if (i29 < i27) {
                                                                    throw q0.d();
                                                                }
                                                                int i88 = i30 + 2;
                                                                byte b110 = bArr3[i29];
                                                                int i89 = i28 + 1;
                                                                i32 = i27;
                                                                if (b10 >= -62) {
                                                                }
                                                                throw q0.d();
                                                            }
                                                            i32 = i27;
                                                            if (b10 < -16) {
                                                                if (i29 < i32 - 2) {
                                                                    throw q0.d();
                                                                }
                                                                b13 = bArr3[i29];
                                                                int i810 = i30 + 3;
                                                                byte b111 = bArr3[i30 + 2];
                                                                int i811 = i30 + 4;
                                                                byte b112 = bArr3[i810];
                                                                if (!j1.f.L(b13)) {
                                                                    if ((((b13 + 112) + (b10 << 28)) >> 30) != 0) {
                                                                    }
                                                                }
                                                                throw q0.d();
                                                            }
                                                            if (i29 < i32 - 1) {
                                                                throw q0.d();
                                                            }
                                                            int i812 = i30 + 2;
                                                            b14 = bArr3[i29];
                                                            i33 = i30 + 3;
                                                            b15 = bArr3[i812];
                                                            i34 = i28 + 1;
                                                            if (j1.f.L(b14)) {
                                                                if (b10 != -32) {
                                                                    if (b10 != -19) {
                                                                        if (!j1.f.L(b15)) {
                                                                            cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                            iP2 = i33;
                                                                            i75 = b12 == true ? 1 : 0;
                                                                            i27 = i32;
                                                                            i28 = i34;
                                                                        }
                                                                    } else if (b14 < -96) {
                                                                        b10 = -19;
                                                                        if (!j1.f.L(b15)) {
                                                                            cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                            iP2 = i33;
                                                                            i75 = b12 == true ? 1 : 0;
                                                                            i27 = i32;
                                                                            i28 = i34;
                                                                        }
                                                                    }
                                                                } else if (b14 >= -96) {
                                                                    b10 = -32;
                                                                    if (b10 != -19) {
                                                                        if (!j1.f.L(b15)) {
                                                                            cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                            iP2 = i33;
                                                                            i75 = b12 == true ? 1 : 0;
                                                                            i27 = i32;
                                                                            i28 = i34;
                                                                        }
                                                                    } else if (b14 < -96) {
                                                                        b10 = -19;
                                                                        if (!j1.f.L(b15)) {
                                                                            cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                            iP2 = i33;
                                                                            i75 = b12 == true ? 1 : 0;
                                                                            i27 = i32;
                                                                            i28 = i34;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            throw q0.d();
                                                            i75 = b12 == true ? 1 : 0;
                                                            i27 = i32;
                                                        }
                                                    }
                                                    i24 = i75 == true ? 1 : 0;
                                                    d0Var3.f5247d = new String(cArr, 0, i28);
                                                    iR2 = i27;
                                                }
                                            } else {
                                                i24 = i75 == true ? 1 : 0;
                                                iP = go.c.P(bArr3, i22, d0Var3);
                                                i25 = d0Var3.f5246c;
                                                if (i25 >= 0) {
                                                    throw q0.g();
                                                }
                                                if (i25 == 0) {
                                                    d0Var3.f5247d = "";
                                                } else {
                                                    d0Var3.f5247d = new String(bArr3, iP, i25, p0.f22890a);
                                                    iP += i25;
                                                }
                                                iR2 = iP;
                                            }
                                            unsafe2.putObject(obj3, j10, d0Var3.f5247d);
                                            i74 = i20 | i18;
                                            Object obj13 = obj3;
                                            d0Var7 = d0Var3;
                                            obj8 = obj13;
                                            i11 = i11;
                                            bArr6 = bArr3;
                                            unsafe12 = unsafe2;
                                            i75 = i24;
                                            i76 = 1048575;
                                            i73 = i23;
                                        } else {
                                            i24 = i75 == true ? 1 : 0;
                                            Object obj14 = obj3;
                                            bArr4 = bArr3;
                                            obj4 = obj14;
                                            d0Var4 = d0Var3;
                                            unsafe3 = unsafe2;
                                            i35 = i22;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 9:
                                        obj5 = obj8;
                                        unsafe4 = unsafe12;
                                        i22 = i78;
                                        iArr2 = iArr2;
                                        i23 = i21;
                                        if (i16 == 2) {
                                            Object objU = u(iP12, obj5);
                                            i11 = i11;
                                            iR2 = go.c.S(objU, t(iP12), bArr, i22, i11, d0Var);
                                            g(iP12, obj5, objU);
                                            i74 = i20 | i18;
                                            d0Var7 = d0Var;
                                            obj8 = obj5;
                                            bArr6 = bArr;
                                            unsafe12 = unsafe4;
                                            i76 = 1048575;
                                            i73 = i23;
                                        } else {
                                            bArr4 = bArr;
                                            obj4 = obj5;
                                            d0Var4 = d0Var;
                                            unsafe3 = unsafe4;
                                            i24 = i75 == true ? 1 : 0;
                                            i35 = i22;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 10:
                                        Object obj15 = obj8;
                                        unsafe5 = unsafe12;
                                        obj4 = obj15;
                                        bArr4 = bArr;
                                        i22 = i78;
                                        d0Var5 = d0Var;
                                        i23 = i21;
                                        if (i16 == 2) {
                                            iR2 = go.c.L(bArr4, i22, d0Var5);
                                            unsafe5.putObject(obj4, j10, d0Var5.f5247d);
                                            i74 = i20 | i18;
                                            Unsafe unsafe13 = unsafe5;
                                            obj8 = obj4;
                                            unsafe12 = unsafe13;
                                            i11 = i11;
                                            bArr6 = bArr4;
                                            d0Var7 = d0Var5;
                                            i76 = 1048575;
                                            i73 = i23;
                                        } else {
                                            unsafe3 = unsafe5;
                                            d0Var4 = d0Var5;
                                            i24 = i75 == true ? 1 : 0;
                                            i35 = i22;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 12:
                                        Object obj16 = obj8;
                                        unsafe5 = unsafe12;
                                        obj4 = obj16;
                                        bArr4 = bArr;
                                        i22 = i78;
                                        d0Var5 = d0Var;
                                        i23 = i21;
                                        if (i16 == 0) {
                                            iR2 = go.c.P(bArr4, i22, d0Var5);
                                            int i90 = d0Var5.f5246c;
                                            s(iP12);
                                            unsafe5.putInt(obj4, j10, i90);
                                            i74 = i20 | i18;
                                            Unsafe unsafe14 = unsafe5;
                                            obj8 = obj4;
                                            unsafe12 = unsafe14;
                                            i11 = i11;
                                            bArr6 = bArr4;
                                            d0Var7 = d0Var5;
                                            i76 = 1048575;
                                            i73 = i23;
                                        } else {
                                            unsafe3 = unsafe5;
                                            d0Var4 = d0Var5;
                                            i24 = i75 == true ? 1 : 0;
                                            i35 = i22;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 15:
                                        Object obj17 = obj8;
                                        unsafe5 = unsafe12;
                                        obj4 = obj17;
                                        bArr4 = bArr;
                                        i22 = i78;
                                        d0Var5 = d0Var;
                                        i23 = i21;
                                        if (i16 == 0) {
                                            iR2 = go.c.P(bArr4, i22, d0Var5);
                                            int i91 = d0Var5.f5246c;
                                            unsafe5.putInt(obj4, j10, (i91 >>> 1) ^ (-(i91 & 1)));
                                            i74 = i20 | i18;
                                            Unsafe unsafe15 = unsafe5;
                                            obj8 = obj4;
                                            unsafe12 = unsafe15;
                                            i11 = i11;
                                            bArr6 = bArr4;
                                            d0Var7 = d0Var5;
                                            i76 = 1048575;
                                            i73 = i23;
                                        } else {
                                            unsafe3 = unsafe5;
                                            d0Var4 = d0Var5;
                                            i24 = i75 == true ? 1 : 0;
                                            i35 = i22;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    case 16:
                                        bArr4 = bArr;
                                        i22 = i78;
                                        if (i16 == 0) {
                                            int iR4 = go.c.R(bArr4, i22, d0Var);
                                            long j13 = d0Var.f5245b;
                                            unsafe12.putLong(obj8, j10, (-(j13 & 1)) ^ (j13 >>> 1));
                                            obj8 = obj8;
                                            unsafe12 = unsafe12;
                                            int i92 = i21;
                                            i74 = i20 | i18;
                                            bArr6 = bArr4;
                                            d0Var7 = d0Var;
                                            i73 = i92;
                                            iR2 = iR4;
                                        } else {
                                            Object obj18 = obj8;
                                            Unsafe unsafe16 = unsafe12;
                                            obj4 = obj18;
                                            iArr2 = iArr2;
                                            i23 = i21;
                                            i24 = i75 == true ? 1 : 0;
                                            unsafe3 = unsafe16;
                                            d0Var4 = d0Var;
                                            i35 = i22;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                    default:
                                        if (i16 == 3) {
                                            Object objU2 = u(iP12, obj8);
                                            int iM = ((d1) t(iP12)).m(objU2, bArr, i78, i11, (i72 << 3) | 4, d0Var);
                                            d0Var.f5247d = objU2;
                                            g(iP12, obj8, objU2);
                                            iR2 = iM;
                                            bArr6 = bArr;
                                            d0Var7 = d0Var;
                                            i73 = i21;
                                            i74 = i20 | i18;
                                        } else {
                                            bArr4 = bArr;
                                            i35 = i78;
                                            i23 = i21;
                                            i24 = i75 == true ? 1 : 0;
                                            d0Var4 = d0Var;
                                            unsafe3 = unsafe12;
                                            obj4 = obj8;
                                            i12 = i12;
                                            bArr2 = bArr4;
                                            i14 = i35;
                                            d0Var2 = d0Var4;
                                            unsafe = unsafe3;
                                            i15 = i24;
                                            i74 = i20;
                                            i73 = i23;
                                            obj2 = obj4;
                                            iArr = iArr2;
                                            iP12 = iP12;
                                        }
                                        break;
                                }
                            } else {
                                obj7 = obj8;
                                unsafe7 = unsafe12;
                                iArr = iArr2;
                                if (iQ == 27) {
                                    obj2 = obj7;
                                    unsafe8 = unsafe7;
                                    if (iQ <= 49) {
                                        j11 = i17;
                                        unsafe9 = l;
                                        n0VarF2 = (n0) unsafe9.getObject(obj2, j10);
                                        if (!((d0) n0VarF2).f22802a) {
                                            int size = n0VarF2.size();
                                            n0VarF2 = n0VarF2.f(size != 0 ? size + size : 10);
                                            unsafe9.putObject(obj2, j10, n0VarF2);
                                        }
                                        n0Var = n0VarF2;
                                        switch (iQ) {
                                            case 18:
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                                                bArr2 = bArr;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i43 = i78;
                                                d0Var2 = d0Var;
                                                i41 = i74;
                                                i44 = i11;
                                                if (i16 == 2) {
                                                    if (i16 == 1) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        Double.longBitsToDouble(go.c.T(i43, bArr2));
                                                        throw null;
                                                    }
                                                    iP3 = i43;
                                                } else {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr2, i43, d0Var2);
                                                    i45 = d0Var2.f5246c + iP3;
                                                    if (iP3 >= i45) {
                                                        Double.longBitsToDouble(go.c.T(iP3, bArr2));
                                                        throw null;
                                                    }
                                                    if (iP3 != i45) {
                                                        throw q0.h();
                                                    }
                                                }
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 19:
                                            case 36:
                                                bArr2 = bArr;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i43 = i78;
                                                d0Var2 = d0Var;
                                                i41 = i74;
                                                i44 = i11;
                                                if (i16 == 2) {
                                                    if (i16 == 5) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        Float.intBitsToFloat(go.c.M(i43, bArr2));
                                                        throw null;
                                                    }
                                                    iP3 = i43;
                                                } else {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr2, i43, d0Var2);
                                                    i46 = d0Var2.f5246c + iP3;
                                                    if (iP3 >= i46) {
                                                        Float.intBitsToFloat(go.c.M(iP3, bArr2));
                                                        throw null;
                                                    }
                                                    if (iP3 != i46) {
                                                        throw q0.h();
                                                    }
                                                }
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                                bArr2 = bArr;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i43 = i78;
                                                d0Var2 = d0Var;
                                                i41 = i74;
                                                i44 = i11;
                                                if (i16 == 2) {
                                                    if (i16 == 0) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        go.c.R(bArr2, i43, d0Var2);
                                                        throw null;
                                                    }
                                                    iP3 = i43;
                                                } else {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr2, i43, d0Var2);
                                                    i47 = d0Var2.f5246c + iP3;
                                                    if (iP3 >= i47) {
                                                        go.c.R(bArr2, iP3, d0Var2);
                                                        throw null;
                                                    }
                                                    if (iP3 != i47) {
                                                        throw q0.h();
                                                    }
                                                }
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 22:
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                            case 39:
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                                                bArr2 = bArr;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i43 = i78;
                                                d0Var2 = d0Var;
                                                i41 = i74;
                                                i44 = i11;
                                                if (i16 == 2) {
                                                    if (i16 == 0) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        go.c.P(bArr2, i43, d0Var2);
                                                        throw null;
                                                    }
                                                    iP3 = i43;
                                                } else {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr2, i43, d0Var2);
                                                    i48 = d0Var2.f5246c + iP3;
                                                    if (iP3 >= i48) {
                                                        go.c.P(bArr2, iP3, d0Var2);
                                                        throw null;
                                                    }
                                                    if (iP3 != i48) {
                                                        throw q0.h();
                                                    }
                                                }
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 23:
                                            case 32:
                                            case 40:
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                                bArr2 = bArr;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i43 = i78;
                                                d0Var2 = d0Var;
                                                i41 = i74;
                                                i44 = i11;
                                                if (i16 == 2) {
                                                    if (i16 == 1) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        go.c.T(i43, bArr2);
                                                        throw null;
                                                    }
                                                    iP3 = i43;
                                                } else {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr2, i43, d0Var2);
                                                    i49 = d0Var2.f5246c + iP3;
                                                    if (iP3 >= i49) {
                                                        go.c.T(iP3, bArr2);
                                                        throw null;
                                                    }
                                                    if (iP3 != i49) {
                                                        throw q0.h();
                                                    }
                                                }
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 24:
                                            case 31:
                                            case 41:
                                            case 45:
                                                bArr2 = bArr;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i43 = i78;
                                                d0Var2 = d0Var;
                                                i41 = i74;
                                                i44 = i11;
                                                if (i16 == 2) {
                                                    if (i16 == 5) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        go.c.M(i43, bArr2);
                                                        throw null;
                                                    }
                                                    iP3 = i43;
                                                } else {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr2, i43, d0Var2);
                                                    i50 = d0Var2.f5246c + iP3;
                                                    if (iP3 >= i50) {
                                                        go.c.M(iP3, bArr2);
                                                        throw null;
                                                    }
                                                    if (iP3 != i50) {
                                                        throw q0.h();
                                                    }
                                                }
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                bArr2 = bArr;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i43 = i78;
                                                d0Var2 = d0Var;
                                                i41 = i74;
                                                i44 = i11;
                                                if (i16 == 2) {
                                                    if (i16 == 0) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        go.c.R(bArr2, i43, d0Var2);
                                                        throw null;
                                                    }
                                                    iP3 = i43;
                                                } else {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr2, i43, d0Var2);
                                                    i51 = d0Var2.f5246c + iP3;
                                                    if (iP3 >= i51) {
                                                        go.c.R(bArr2, iP3, d0Var2);
                                                        throw null;
                                                    }
                                                    if (iP3 != i51) {
                                                        throw q0.h();
                                                    }
                                                }
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                                bArr2 = bArr;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i43 = i78;
                                                d0Var2 = d0Var;
                                                i41 = i74;
                                                i44 = i11;
                                                if (i16 == 2) {
                                                    if ((j11 & 536870912) == 0) {
                                                        iP4 = go.c.P(bArr2, i43, d0Var2);
                                                        i56 = d0Var2.f5246c;
                                                        if (i56 >= 0) {
                                                            throw q0.g();
                                                        }
                                                        if (i56 == 0) {
                                                            n0Var.add("");
                                                        } else {
                                                            n0Var.add(new String(bArr2, iP4, i56, p0.f22890a));
                                                            iP4 += i56;
                                                        }
                                                        while (iP4 < i44) {
                                                            iP6 = go.c.P(bArr2, iP4, d0Var2);
                                                            if (i42 == d0Var2.f5246c) {
                                                                iP4 = go.c.P(bArr2, iP6, d0Var2);
                                                                i57 = d0Var2.f5246c;
                                                                if (i57 >= 0) {
                                                                    throw q0.g();
                                                                }
                                                                if (i57 == 0) {
                                                                    n0Var.add("");
                                                                } else {
                                                                    n0Var.add(new String(bArr2, iP4, i57, p0.f22890a));
                                                                    iP4 += i57;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        iP4 = go.c.P(bArr2, i43, d0Var2);
                                                        i52 = d0Var2.f5246c;
                                                        if (i52 >= 0) {
                                                            throw q0.g();
                                                        }
                                                        if (i52 == 0) {
                                                            n0Var.add("");
                                                        } else {
                                                            i53 = iP4 + i52;
                                                            y1.f22928a.getClass();
                                                            if (z.a(bArr2, iP4, i53)) {
                                                                throw q0.d();
                                                            }
                                                            n0Var.add(new String(bArr2, iP4, i52, p0.f22890a));
                                                            iP4 = i53;
                                                        }
                                                        while (iP4 < i44) {
                                                            iP5 = go.c.P(bArr2, iP4, d0Var2);
                                                            if (i42 == d0Var2.f5246c) {
                                                                iP4 = go.c.P(bArr2, iP5, d0Var2);
                                                                i54 = d0Var2.f5246c;
                                                                if (i54 >= 0) {
                                                                    throw q0.g();
                                                                }
                                                                if (i54 == 0) {
                                                                    n0Var.add("");
                                                                } else {
                                                                    i55 = iP4 + i54;
                                                                    y1.f22928a.getClass();
                                                                    if (z.a(bArr2, iP4, i55)) {
                                                                        throw q0.d();
                                                                    }
                                                                    n0Var.add(new String(bArr2, iP4, i54, p0.f22890a));
                                                                    iP4 = i55;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    iP3 = iP4;
                                                } else {
                                                    iP3 = i43;
                                                }
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 27:
                                                bArr5 = bArr;
                                                i58 = i11;
                                                d0Var6 = d0Var;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i59 = i78;
                                                i41 = i74;
                                                if (i16 == 2) {
                                                    iP4 = go.c.N(t(iP12), i42 == true ? 1 : 0, bArr5, i59, i58, n0Var, d0Var6);
                                                    bArr2 = bArr5;
                                                    i43 = i59;
                                                    i42 = i42 == true ? 1 : 0;
                                                    i44 = i58;
                                                    d0Var2 = d0Var6;
                                                    iP3 = iP4;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                iP3 = i43;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                                                bArr5 = bArr;
                                                i58 = i11;
                                                d0Var6 = d0Var;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i59 = i78;
                                                i41 = i74;
                                                if (i16 == 2) {
                                                    iP7 = go.c.P(bArr5, i59, d0Var6);
                                                    i60 = d0Var6.f5246c;
                                                    if (i60 >= 0) {
                                                        throw q0.g();
                                                    }
                                                    if (i60 <= bArr5.length - iP7) {
                                                        throw q0.h();
                                                    }
                                                    if (i60 == 0) {
                                                        n0Var.add(h0.f22838c);
                                                    } else {
                                                        n0Var.add(h0.p(bArr5, iP7, i60));
                                                        iP7 += i60;
                                                    }
                                                    while (iP7 < i58) {
                                                        iP8 = go.c.P(bArr5, iP7, d0Var6);
                                                        if (i42 == d0Var6.f5246c) {
                                                            iP3 = iP7;
                                                            bArr2 = bArr5;
                                                            i44 = i58;
                                                            i43 = i59;
                                                            d0Var2 = d0Var6;
                                                            if (iP3 != i43) {
                                                                bArr6 = bArr2;
                                                                iP12 = iP12;
                                                                i72 = i72;
                                                                i11 = i44;
                                                                d0Var7 = d0Var2;
                                                                i74 = i41;
                                                                unsafe12 = unsafe;
                                                                i76 = 1048575;
                                                                iR2 = iP3;
                                                                i75 = i42;
                                                                obj8 = obj2;
                                                                i73 = i39;
                                                            } else {
                                                                i14 = iP3;
                                                                i15 = i42;
                                                                iP12 = iP12;
                                                                i74 = i41;
                                                                i73 = i39;
                                                            }
                                                            break;
                                                        } else {
                                                            iP7 = go.c.P(bArr5, iP8, d0Var6);
                                                            i61 = d0Var6.f5246c;
                                                            if (i61 >= 0) {
                                                                throw q0.g();
                                                            }
                                                            if (i61 <= bArr5.length - iP7) {
                                                                throw q0.h();
                                                            }
                                                            if (i61 == 0) {
                                                                n0Var.add(h0.f22838c);
                                                            } else {
                                                                n0Var.add(h0.p(bArr5, iP7, i61));
                                                                iP7 += i61;
                                                            }
                                                        }
                                                    }
                                                    iP3 = iP7;
                                                    bArr2 = bArr5;
                                                    i44 = i58;
                                                    i43 = i59;
                                                    d0Var2 = d0Var6;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                iP3 = i43;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                            case 44:
                                                bArr5 = bArr;
                                                i58 = i11;
                                                d0Var6 = d0Var;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i59 = i78;
                                                i41 = i74;
                                                if (i16 == 2) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr5, i59, d0Var6);
                                                    i62 = d0Var6.f5246c + iP3;
                                                    if (iP3 >= i62) {
                                                        go.c.P(bArr5, iP3, d0Var6);
                                                        throw null;
                                                    }
                                                    if (iP3 == i62) {
                                                        throw q0.h();
                                                    }
                                                    s(iP12);
                                                    Class cls = m1.f22873a;
                                                    bArr2 = bArr5;
                                                    i44 = i58;
                                                    i43 = i59;
                                                    d0Var2 = d0Var6;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                } else {
                                                    if (i16 == 0) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        go.c.P(bArr5, i59, d0Var6);
                                                        throw null;
                                                    }
                                                    bArr2 = bArr5;
                                                    i44 = i58;
                                                    i43 = i59;
                                                    d0Var2 = d0Var6;
                                                    iP3 = i43;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                break;
                                            case 33:
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                                bArr5 = bArr;
                                                i58 = i11;
                                                d0Var6 = d0Var;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i59 = i78;
                                                i41 = i74;
                                                if (i16 == 2) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr5, i59, d0Var6);
                                                    i63 = d0Var6.f5246c + iP3;
                                                    if (iP3 >= i63) {
                                                        go.c.P(bArr5, iP3, d0Var6);
                                                        throw null;
                                                    }
                                                    if (iP3 != i63) {
                                                        throw q0.h();
                                                    }
                                                    bArr2 = bArr5;
                                                    i44 = i58;
                                                    i43 = i59;
                                                    d0Var2 = d0Var6;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                } else {
                                                    if (i16 == 0) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        go.c.P(bArr5, i59, d0Var6);
                                                        throw null;
                                                    }
                                                    bArr2 = bArr5;
                                                    i44 = i58;
                                                    i43 = i59;
                                                    d0Var2 = d0Var6;
                                                    iP3 = i43;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                break;
                                            case 34:
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                                                bArr5 = bArr;
                                                i58 = i11;
                                                d0Var6 = d0Var;
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i59 = i78;
                                                i41 = i74;
                                                if (i16 == 2) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    iP3 = go.c.P(bArr5, i59, d0Var6);
                                                    i64 = d0Var6.f5246c + iP3;
                                                    if (iP3 >= i64) {
                                                        go.c.R(bArr5, iP3, d0Var6);
                                                        throw null;
                                                    }
                                                    if (iP3 != i64) {
                                                        throw q0.h();
                                                    }
                                                    bArr2 = bArr5;
                                                    i44 = i58;
                                                    i43 = i59;
                                                    d0Var2 = d0Var6;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                } else {
                                                    if (i16 == 0) {
                                                        if (n0Var == null) {
                                                            throw new ClassCastException();
                                                        }
                                                        go.c.R(bArr5, i59, d0Var6);
                                                        throw null;
                                                    }
                                                    bArr2 = bArr5;
                                                    i44 = i58;
                                                    i43 = i59;
                                                    d0Var2 = d0Var6;
                                                    iP3 = i43;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                break;
                                            default:
                                                if (i16 == 3) {
                                                    l1VarT = t(iP12);
                                                    i65 = ((i75 == true ? 1 : 0) & (-8)) | 4;
                                                    m0 m0VarZzd = l1VarT.zzd();
                                                    d1Var = (d1) l1VarT;
                                                    i58 = i11;
                                                    d0Var6 = d0Var;
                                                    i39 = i73;
                                                    i42 = i75 == true ? 1 : 0;
                                                    i66 = i78;
                                                    i41 = i74;
                                                    bArr5 = bArr;
                                                    int iM2 = d1Var.m(m0VarZzd, bArr5, i66, i58, i65, d0Var6);
                                                    d0Var6.f5247d = m0VarZzd;
                                                    l1VarT.a(m0VarZzd);
                                                    d0Var6.f5247d = m0VarZzd;
                                                    n0Var.add(m0VarZzd);
                                                    iP3 = iM2;
                                                    while (true) {
                                                        if (iP3 < i58) {
                                                            i67 = i66;
                                                            iP9 = go.c.P(bArr5, iP3, d0Var6);
                                                            d1Var2 = d1Var;
                                                            if (i42 == d0Var6.f5246c) {
                                                                m0 m0VarZzd2 = l1VarT.zzd();
                                                                d1Var = d1Var2;
                                                                int iM3 = d1Var.m(m0VarZzd2, bArr5, iP9, i58, i65, d0Var6);
                                                                d0Var6.f5247d = m0VarZzd2;
                                                                l1VarT.a(m0VarZzd2);
                                                                d0Var6.f5247d = m0VarZzd2;
                                                                n0Var.add(m0VarZzd2);
                                                                iP3 = iM3;
                                                                i66 = i67;
                                                                unsafe8 = unsafe8;
                                                            } else {
                                                                unsafe = unsafe8;
                                                                i59 = i67;
                                                            }
                                                        } else {
                                                            unsafe = unsafe8;
                                                            i59 = i66;
                                                        }
                                                    }
                                                    bArr2 = bArr5;
                                                    i44 = i58;
                                                    i43 = i59;
                                                    d0Var2 = d0Var6;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                } else {
                                                    i39 = i73;
                                                    unsafe = unsafe8;
                                                    i42 = i75 == true ? 1 : 0;
                                                    i41 = i74;
                                                    bArr2 = bArr;
                                                    i44 = i11;
                                                    d0Var2 = d0Var;
                                                    i43 = i78;
                                                    iP3 = i43;
                                                    if (iP3 != i43) {
                                                        bArr6 = bArr2;
                                                        iP12 = iP12;
                                                        i72 = i72;
                                                        i11 = i44;
                                                        d0Var7 = d0Var2;
                                                        i74 = i41;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        iR2 = iP3;
                                                        i75 = i42;
                                                        obj8 = obj2;
                                                        i73 = i39;
                                                    } else {
                                                        i14 = iP3;
                                                        i15 = i42;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                break;
                                        }
                                    } else {
                                        i38 = i78;
                                        i39 = i73;
                                        i41 = i74;
                                        bArr2 = bArr;
                                        i40 = i75 == true ? 1 : 0;
                                        unsafe = unsafe8;
                                        d0Var2 = d0Var;
                                        if (iQ == 50) {
                                            unsafe11 = l;
                                            j12 = iArr[iP12 + 2] & 1048575;
                                            switch (iQ) {
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    i69 = i38;
                                                    if (i16 == 1) {
                                                        unsafe11.putObject(obj2, j10, Double.valueOf(Double.longBitsToDouble(go.c.T(i69, bArr2))));
                                                        iP10 = i69 + 8;
                                                        unsafe11.putInt(obj2, j12, i72);
                                                    } else {
                                                        iP10 = i69;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    i69 = i38;
                                                    if (i16 == 5) {
                                                        unsafe11.putObject(obj2, j10, Float.valueOf(Float.intBitsToFloat(go.c.M(i69, bArr2))));
                                                        iP10 = i69 + 4;
                                                        unsafe11.putInt(obj2, j12, i72);
                                                    } else {
                                                        iP10 = i69;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    i69 = i38;
                                                    if (i16 == 0) {
                                                        iR = go.c.R(bArr2, i69, d0Var2);
                                                        unsafe11.putObject(obj2, j10, Long.valueOf(d0Var2.f5245b));
                                                        unsafe11.putInt(obj2, j12, i72);
                                                        iP10 = iR;
                                                    } else {
                                                        iP10 = i69;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                                                case 62:
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    i69 = i38;
                                                    if (i16 == 0) {
                                                        iP10 = go.c.P(bArr2, i69, d0Var2);
                                                        unsafe11.putObject(obj2, j10, Integer.valueOf(d0Var2.f5246c));
                                                        unsafe11.putInt(obj2, j12, i72);
                                                    } else {
                                                        iP10 = i69;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                                                case 65:
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    i69 = i38;
                                                    if (i16 == 1) {
                                                        unsafe11.putObject(obj2, j10, Long.valueOf(go.c.T(i69, bArr2)));
                                                        iP10 = i69 + 8;
                                                        unsafe11.putInt(obj2, j12, i72);
                                                    } else {
                                                        iP10 = i69;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                                                case 64:
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    i69 = i38;
                                                    if (i16 == 5) {
                                                        unsafe11.putObject(obj2, j10, Integer.valueOf(go.c.M(i69, bArr2)));
                                                        iP10 = i69 + 4;
                                                        unsafe11.putInt(obj2, j12, i72);
                                                    } else {
                                                        iP10 = i69;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    i69 = i38;
                                                    if (i16 == 0) {
                                                        iR = go.c.R(bArr2, i69, d0Var2);
                                                        if (d0Var2.f5245b != 0) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        unsafe11.putObject(obj2, j10, Boolean.valueOf(z11));
                                                        unsafe11.putInt(obj2, j12, i72);
                                                        iP10 = iR;
                                                    } else {
                                                        iP10 = i69;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                                                    i68 = i40 == true ? 1 : 0;
                                                    i69 = i38;
                                                    if (i16 == 2) {
                                                        iP11 = go.c.P(bArr2, i69, d0Var2);
                                                        i70 = d0Var2.f5246c;
                                                        if (i70 == 0) {
                                                            unsafe11.putObject(obj2, j10, "");
                                                        } else {
                                                            if ((i17 & 536870912) != 0) {
                                                                y1.f22928a.getClass();
                                                                if (!z.a(bArr2, iP11, iP11 + i70)) {
                                                                    throw q0.d();
                                                                }
                                                            }
                                                            unsafe11.putObject(obj2, j10, new String(bArr2, iP11, i70, p0.f22890a));
                                                            iP11 += i70;
                                                        }
                                                        unsafe11.putInt(obj2, j12, i72);
                                                        iP10 = iP11;
                                                    } else {
                                                        iP12 = iP12;
                                                        iP10 = i69;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case 60:
                                                    i68 = i40 == true ? 1 : 0;
                                                    i71 = i38;
                                                    if (i16 == 2) {
                                                        Object objV = v(i72, iP12, obj2);
                                                        int iS = go.c.S(objV, t(iP12), bArr2, i71, i11, d0Var2);
                                                        i69 = i71;
                                                        bArr2 = bArr2;
                                                        h(i72, iP12, obj2, objV);
                                                        iP10 = iS;
                                                        iP12 = iP12;
                                                        if (iP10 != i69) {
                                                            bArr2 = bArr2;
                                                            bArr6 = bArr2;
                                                            iR2 = iP10;
                                                            i72 = i72;
                                                            obj8 = obj2;
                                                            d0Var7 = d0Var2;
                                                            iP12 = iP12;
                                                            i73 = i39;
                                                            unsafe12 = unsafe;
                                                            i76 = 1048575;
                                                            i11 = i11;
                                                            i75 = i68;
                                                            i74 = i41;
                                                        } else {
                                                            bArr2 = bArr2;
                                                            i14 = iP10;
                                                            i15 = i68;
                                                            iP12 = iP12;
                                                            i74 = i41;
                                                            i73 = i39;
                                                        }
                                                    }
                                                    i69 = i71;
                                                    iP12 = iP12;
                                                    iP10 = i69;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                                                    i68 = i40 == true ? 1 : 0;
                                                    i71 = i38;
                                                    if (i16 == 2) {
                                                        iL = go.c.L(bArr2, i71, d0Var2);
                                                        unsafe11.putObject(obj2, j10, d0Var2.f5247d);
                                                        unsafe11.putInt(obj2, j12, i72);
                                                        i69 = i71;
                                                        iP10 = iL;
                                                        iP12 = iP12;
                                                        if (iP10 != i69) {
                                                            bArr2 = bArr2;
                                                            bArr6 = bArr2;
                                                            iR2 = iP10;
                                                            i72 = i72;
                                                            obj8 = obj2;
                                                            d0Var7 = d0Var2;
                                                            iP12 = iP12;
                                                            i73 = i39;
                                                            unsafe12 = unsafe;
                                                            i76 = 1048575;
                                                            i11 = i11;
                                                            i75 = i68;
                                                            i74 = i41;
                                                        } else {
                                                            bArr2 = bArr2;
                                                            i14 = iP10;
                                                            i15 = i68;
                                                            iP12 = iP12;
                                                            i74 = i41;
                                                            i73 = i39;
                                                        }
                                                    }
                                                    i69 = i71;
                                                    iP12 = iP12;
                                                    iP10 = i69;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                                                    i68 = i40 == true ? 1 : 0;
                                                    i71 = i38;
                                                    if (i16 == 0) {
                                                        iL = go.c.P(bArr2, i71, d0Var2);
                                                        int i93 = d0Var2.f5246c;
                                                        s(iP12);
                                                        unsafe11.putObject(obj2, j10, Integer.valueOf(i93));
                                                        unsafe11.putInt(obj2, j12, i72);
                                                        i69 = i71;
                                                        iP10 = iL;
                                                        iP12 = iP12;
                                                        if (iP10 != i69) {
                                                            bArr2 = bArr2;
                                                            bArr6 = bArr2;
                                                            iR2 = iP10;
                                                            i72 = i72;
                                                            obj8 = obj2;
                                                            d0Var7 = d0Var2;
                                                            iP12 = iP12;
                                                            i73 = i39;
                                                            unsafe12 = unsafe;
                                                            i76 = 1048575;
                                                            i11 = i11;
                                                            i75 = i68;
                                                            i74 = i41;
                                                        } else {
                                                            bArr2 = bArr2;
                                                            i14 = iP10;
                                                            i15 = i68;
                                                            iP12 = iP12;
                                                            i74 = i41;
                                                            i73 = i39;
                                                        }
                                                    }
                                                    i69 = i71;
                                                    iP12 = iP12;
                                                    iP10 = i69;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case 66:
                                                    i68 = i40 == true ? 1 : 0;
                                                    i71 = i38;
                                                    if (i16 == 0) {
                                                        iL = go.c.P(bArr2, i71, d0Var2);
                                                        int i94 = d0Var2.f5246c;
                                                        unsafe11.putObject(obj2, j10, Integer.valueOf((i94 >>> 1) ^ (-(i94 & 1))));
                                                        unsafe11.putInt(obj2, j12, i72);
                                                        i69 = i71;
                                                        iP10 = iL;
                                                        iP12 = iP12;
                                                        if (iP10 != i69) {
                                                            bArr2 = bArr2;
                                                            bArr6 = bArr2;
                                                            iR2 = iP10;
                                                            i72 = i72;
                                                            obj8 = obj2;
                                                            d0Var7 = d0Var2;
                                                            iP12 = iP12;
                                                            i73 = i39;
                                                            unsafe12 = unsafe;
                                                            i76 = 1048575;
                                                            i11 = i11;
                                                            i75 = i68;
                                                            i74 = i41;
                                                        } else {
                                                            bArr2 = bArr2;
                                                            i14 = iP10;
                                                            i15 = i68;
                                                            iP12 = iP12;
                                                            i74 = i41;
                                                            i73 = i39;
                                                        }
                                                    }
                                                    i69 = i71;
                                                    iP12 = iP12;
                                                    iP10 = i69;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                                case 67:
                                                    i71 = i38;
                                                    if (i16 == 0) {
                                                        iL = go.c.R(bArr2, i71, d0Var2);
                                                        i68 = i40 == true ? 1 : 0;
                                                        long j14 = d0Var2.f5245b;
                                                        unsafe11.putObject(obj2, j10, Long.valueOf((j14 >>> 1) ^ (-(j14 & 1))));
                                                        unsafe11.putInt(obj2, j12, i72);
                                                        i69 = i71;
                                                        iP10 = iL;
                                                        iP12 = iP12;
                                                        if (iP10 != i69) {
                                                            bArr2 = bArr2;
                                                            bArr6 = bArr2;
                                                            iR2 = iP10;
                                                            i72 = i72;
                                                            obj8 = obj2;
                                                            d0Var7 = d0Var2;
                                                            iP12 = iP12;
                                                            i73 = i39;
                                                            unsafe12 = unsafe;
                                                            i76 = 1048575;
                                                            i11 = i11;
                                                            i75 = i68;
                                                            i74 = i41;
                                                        } else {
                                                            bArr2 = bArr2;
                                                            i14 = iP10;
                                                            i15 = i68;
                                                            iP12 = iP12;
                                                            i74 = i41;
                                                            i73 = i39;
                                                        }
                                                    } else {
                                                        i68 = i40 == true ? 1 : 0;
                                                        i69 = i71;
                                                        iP12 = iP12;
                                                        iP10 = i69;
                                                        if (iP10 != i69) {
                                                            bArr2 = bArr2;
                                                            bArr6 = bArr2;
                                                            iR2 = iP10;
                                                            i72 = i72;
                                                            obj8 = obj2;
                                                            d0Var7 = d0Var2;
                                                            iP12 = iP12;
                                                            i73 = i39;
                                                            unsafe12 = unsafe;
                                                            i76 = 1048575;
                                                            i11 = i11;
                                                            i75 = i68;
                                                            i74 = i41;
                                                        } else {
                                                            bArr2 = bArr2;
                                                            i14 = iP10;
                                                            i15 = i68;
                                                            iP12 = iP12;
                                                            i74 = i41;
                                                            i73 = i39;
                                                        }
                                                    }
                                                    break;
                                                case 68:
                                                    if (i16 == 3) {
                                                        Object objV2 = v(i72, iP12, obj2);
                                                        int iM4 = ((d1) t(iP12)).m(objV2, bArr2, i38, i11, ((i40 == true ? 1 : 0) & (-8)) | 4, d0Var2);
                                                        d0Var2.f5247d = objV2;
                                                        h(i72, iP12, obj2, objV2);
                                                        i69 = i38;
                                                        i68 = i40 == true ? 1 : 0;
                                                        iP12 = iP12;
                                                        iP10 = iM4;
                                                    }
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                        break;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                        break;
                                                    }
                                                default:
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    i69 = i38;
                                                    iP10 = i69;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i16 == 2) {
                                                unsafe10 = l;
                                                int i95 = iP12 / 3;
                                                Object obj19 = this.f22805b[i95 + i95];
                                                object = unsafe10.getObject(obj2, j10);
                                                if (!((y0) object).f22927a) {
                                                    y0Var = y0.f22926b;
                                                    if (y0Var.isEmpty()) {
                                                        y0Var2 = new y0();
                                                    } else {
                                                        y0 y0Var3 = new y0(y0Var);
                                                        y0Var3.f22927a = true;
                                                        y0Var2 = y0Var3;
                                                    }
                                                    z0.a(y0Var2, object);
                                                    unsafe10.putObject(obj2, j10, y0Var2);
                                                }
                                                throw q4.a.h(obj19);
                                            }
                                            i12 = i12;
                                            i15 = i40;
                                            iP12 = iP12;
                                            i74 = i41;
                                            i73 = i39;
                                            i14 = i38;
                                        }
                                    }
                                } else if (i16 == 2) {
                                    n0VarF = (n0) unsafe7.getObject(obj7, j10);
                                    if (!((d0) n0VarF).f22802a) {
                                        int size2 = n0VarF.size();
                                        n0VarF = n0VarF.f(size2 != 0 ? size2 + size2 : 10);
                                        unsafe7.putObject(obj7, j10, n0VarF);
                                    }
                                    n0 n0Var2 = n0VarF;
                                    bArr6 = bArr;
                                    i11 = i11;
                                    iR2 = go.c.N(t(iP12), i75 == true ? 1 : 0, bArr6, i78, i11, n0Var2, d0Var);
                                    d0Var7 = d0Var;
                                    iP12 = iP12;
                                    i72 = i72;
                                    unsafe12 = unsafe7;
                                    i76 = 1048575;
                                    i75 = i75 == true ? 1 : 0;
                                    obj8 = obj;
                                } else {
                                    obj2 = obj7;
                                    i38 = i78;
                                    i39 = i73;
                                    unsafe = unsafe7;
                                    i40 = i75 == true ? 1 : 0;
                                    bArr2 = bArr;
                                    d0Var2 = d0Var;
                                    i41 = i74;
                                    i12 = i12;
                                    i15 = i40;
                                    iP12 = iP12;
                                    i74 = i41;
                                    i73 = i39;
                                    i14 = i38;
                                }
                            }
                        } else {
                            bArr2 = bArr;
                            i12 = i12;
                            unsafe = unsafe12;
                            iP12 = 0;
                            i14 = i78;
                            iArr = iArr2;
                            obj2 = obj8;
                            i15 = i75 == true ? 1 : 0;
                            d0Var2 = d0Var7;
                        }
                        if (i15 == i12 || i12 == 0) {
                            m0Var = (m0) obj2;
                            o1VarA = m0Var.zzc;
                            if (o1VarA == o1.f22883e) {
                                o1VarA = o1.a();
                                m0Var.zzc = o1VarA;
                            }
                            int i96 = i15;
                            int iO = go.c.O(i96 == true ? 1 : 0, bArr2, i14, i11, o1VarA, d0Var2);
                            d0Var7 = d0Var;
                            i75 = i96 == true ? 1 : 0;
                            i11 = i11;
                            i72 = i72;
                            obj8 = obj2;
                            unsafe12 = unsafe;
                            i76 = 1048575;
                            iR2 = iO;
                            bArr6 = bArr;
                        } else {
                            i11 = i11;
                            i75 = i15;
                            iR2 = i14;
                            unsafe12 = unsafe;
                        }
                    }
                    i13 = -1;
                    if (iP12 == i13) {
                        i16 = (i75 == true ? 1 : 0) & 7;
                        i17 = iArr2[iP12 + 1];
                        iQ = q(i17);
                        j10 = i17 & i76;
                        if (iQ <= 17) {
                            int i813 = iArr2[iP12 + 2];
                            i18 = 1 << (i813 >>> 20);
                            i19 = i813 & i76;
                            if (i19 != i73) {
                                i36 = i76;
                                if (i73 != i36) {
                                    unsafe12.putInt(obj8, i73, i74);
                                    i36 = 1048575;
                                }
                                if (i19 == i36) {
                                    i37 = 0;
                                } else {
                                    i37 = unsafe12.getInt(obj8, i19);
                                }
                                i20 = i37;
                                i21 = i19;
                            } else {
                                i20 = i74;
                                i21 = i73;
                            }
                            switch (iQ) {
                                case 0:
                                    bArr4 = bArr;
                                    i35 = i78;
                                    iArr2 = iArr2;
                                    i23 = i21;
                                    d0Var4 = d0Var;
                                    unsafe3 = unsafe12;
                                    i24 = i75 == true ? 1 : 0;
                                    if (i16 == 1) {
                                        x1.f22919c.d(obj8, j10, Double.longBitsToDouble(go.c.T(i35, bArr4)));
                                        iR2 = i35 + 8;
                                        obj8 = obj8;
                                        unsafe12 = unsafe3;
                                        i74 = i20 | i18;
                                        i73 = i23;
                                        bArr6 = bArr4;
                                        d0Var7 = d0Var4;
                                        i75 = i24;
                                    }
                                    obj4 = obj8;
                                    i12 = i12;
                                    bArr2 = bArr4;
                                    i14 = i35;
                                    d0Var2 = d0Var4;
                                    unsafe = unsafe3;
                                    i15 = i24;
                                    i74 = i20;
                                    i73 = i23;
                                    obj2 = obj4;
                                    iArr = iArr2;
                                    iP12 = iP12;
                                    break;
                                case 1:
                                    bArr4 = bArr;
                                    i35 = i78;
                                    iArr2 = iArr2;
                                    i23 = i21;
                                    d0Var4 = d0Var;
                                    unsafe3 = unsafe12;
                                    i24 = i75 == true ? 1 : 0;
                                    if (i16 == 5) {
                                        x1.f22919c.e(obj8, j10, Float.intBitsToFloat(go.c.M(i35, bArr4)));
                                        iR2 = i35 + 4;
                                        i74 = i20 | i18;
                                        unsafe12 = unsafe3;
                                        i73 = i23;
                                        bArr6 = bArr4;
                                        d0Var7 = d0Var4;
                                        i75 = i24;
                                    }
                                    obj4 = obj8;
                                    i12 = i12;
                                    bArr2 = bArr4;
                                    i14 = i35;
                                    d0Var2 = d0Var4;
                                    unsafe = unsafe3;
                                    i15 = i24;
                                    i74 = i20;
                                    i73 = i23;
                                    obj2 = obj4;
                                    iArr = iArr2;
                                    iP12 = iP12;
                                    break;
                                case 2:
                                case 3:
                                    bArr4 = bArr;
                                    i35 = i78;
                                    i23 = i21;
                                    d0Var4 = d0Var;
                                    i24 = i75 == true ? 1 : 0;
                                    if (i16 == 0) {
                                        int iR5 = go.c.R(bArr4, i35, d0Var4);
                                        unsafe12.putLong(obj8, j10, d0Var4.f5245b);
                                        i74 = i20 | i18;
                                        unsafe12 = unsafe12;
                                        i73 = i23;
                                        bArr6 = bArr4;
                                        iR2 = iR5;
                                        d0Var7 = d0Var4;
                                        i75 = i24;
                                    }
                                    unsafe3 = unsafe12;
                                    obj4 = obj8;
                                    i12 = i12;
                                    bArr2 = bArr4;
                                    i14 = i35;
                                    d0Var2 = d0Var4;
                                    unsafe = unsafe3;
                                    i15 = i24;
                                    i74 = i20;
                                    i73 = i23;
                                    obj2 = obj4;
                                    iArr = iArr2;
                                    iP12 = iP12;
                                    break;
                                case 4:
                                case 11:
                                    bArr4 = bArr;
                                    i35 = i78;
                                    i23 = i21;
                                    d0Var4 = d0Var;
                                    i24 = i75 == true ? 1 : 0;
                                    if (i16 == 0) {
                                        int iP14 = go.c.P(bArr4, i35, d0Var4);
                                        unsafe12.putInt(obj8, j10, d0Var4.f5246c);
                                        i74 = i20 | i18;
                                        i73 = i23;
                                        iR2 = iP14;
                                        bArr6 = bArr4;
                                        iP12 = iP12;
                                        i72 = i72;
                                        d0Var7 = d0Var4;
                                        i75 = i24 == true ? 1 : 0;
                                        i76 = 1048575;
                                        i11 = i11;
                                    } else {
                                        unsafe3 = unsafe12;
                                        obj4 = obj8;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 5:
                                case 14:
                                    unsafe6 = unsafe12;
                                    obj6 = obj8;
                                    i23 = i21;
                                    i24 = i75 == true ? 1 : 0;
                                    if (i16 == 1) {
                                        bArr4 = bArr;
                                        unsafe12 = unsafe6;
                                        d0Var4 = d0Var;
                                        obj8 = obj6;
                                        unsafe12.putLong(obj8, j10, go.c.T(i78, bArr));
                                        iR2 = i78 + 8;
                                        i74 = i20 | i18;
                                        i73 = i23;
                                        bArr6 = bArr4;
                                        d0Var7 = d0Var4;
                                        i75 = i24;
                                    } else {
                                        d0Var4 = d0Var;
                                        obj8 = obj6;
                                        bArr4 = bArr;
                                        unsafe12 = unsafe6;
                                        i35 = i78;
                                        unsafe3 = unsafe12;
                                        obj4 = obj8;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 6:
                                case 13:
                                    i22 = i78;
                                    unsafe2 = unsafe12;
                                    obj3 = obj8;
                                    i23 = i21;
                                    bArr3 = bArr;
                                    d0Var3 = d0Var;
                                    i24 = i75 == true ? 1 : 0;
                                    if (i16 == 5) {
                                        unsafe2.putInt(obj3, j10, go.c.M(i22, bArr3));
                                        iR2 = i22 + 4;
                                        i74 = i20 | i18;
                                        Object obj110 = obj3;
                                        d0Var7 = d0Var3;
                                        obj8 = obj110;
                                        i11 = i11;
                                        bArr6 = bArr3;
                                        unsafe12 = unsafe2;
                                        i75 = i24;
                                        i76 = 1048575;
                                        i73 = i23;
                                    } else {
                                        Object obj111 = obj3;
                                        bArr4 = bArr3;
                                        obj4 = obj111;
                                        d0Var4 = d0Var3;
                                        unsafe3 = unsafe2;
                                        i35 = i22;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 7:
                                    i22 = i78;
                                    unsafe2 = unsafe12;
                                    obj3 = obj8;
                                    i23 = i21;
                                    bArr3 = bArr;
                                    d0Var3 = d0Var;
                                    i24 = i75 == true ? 1 : 0;
                                    if (i16 == 0) {
                                        iR2 = go.c.R(bArr3, i22, d0Var3);
                                        if (d0Var3.f5245b != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        x1.f22919c.c(obj3, j10, z10);
                                        i74 = i20 | i18;
                                        Object obj112 = obj3;
                                        d0Var7 = d0Var3;
                                        obj8 = obj112;
                                        i11 = i11;
                                        bArr6 = bArr3;
                                        unsafe12 = unsafe2;
                                        i75 = i24;
                                        i76 = 1048575;
                                        i73 = i23;
                                    } else {
                                        Object obj113 = obj3;
                                        bArr4 = bArr3;
                                        obj4 = obj113;
                                        d0Var4 = d0Var3;
                                        unsafe3 = unsafe2;
                                        i35 = i22;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 8:
                                    i22 = i78;
                                    unsafe2 = unsafe12;
                                    obj3 = obj8;
                                    i23 = i21;
                                    bArr3 = bArr;
                                    d0Var3 = d0Var;
                                    if (i16 == 2) {
                                        if ((i17 & 536870912) != 0) {
                                            iP2 = go.c.P(bArr3, i22, d0Var3);
                                            i26 = d0Var3.f5246c;
                                            if (i26 >= 0) {
                                                throw q0.g();
                                            }
                                            if (i26 == 0) {
                                                d0Var3.f5247d = "";
                                                iR2 = iP2;
                                                i24 = i75 == true ? 1 : 0;
                                            } else {
                                                z zVar2 = y1.f22928a;
                                                length = bArr3.length;
                                                if ((((length - iP2) - i26) | iP2 | i26) >= 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iP2), Integer.valueOf(i26)));
                                                }
                                                i27 = iP2 + i26;
                                                cArr = new char[i26];
                                                i28 = 0;
                                                while (iP2 < i27) {
                                                    b16 = bArr3[iP2];
                                                    if (b16 >= 0) {
                                                        iP2++;
                                                        cArr[i28] = (char) b16;
                                                        i28++;
                                                    } else {
                                                        while (iP2 < i27) {
                                                            i29 = iP2 + 1;
                                                            i30 = iP2;
                                                            b10 = bArr3[i30];
                                                            if (b10 >= 0) {
                                                                i31 = i28 + 1;
                                                                cArr[i28] = (char) b10;
                                                                iP2 = i29;
                                                                while (true) {
                                                                    i28 = i31;
                                                                    if (iP2 >= i27) {
                                                                    }
                                                                    break;
                                                                    iP2++;
                                                                    i31 = i28 + 1;
                                                                    cArr[i28] = (char) b11;
                                                                }
                                                            } else {
                                                                b12 = i75 == true ? 1 : 0;
                                                                if (b10 >= -32) {
                                                                    if (i29 < i27) {
                                                                        throw q0.d();
                                                                    }
                                                                    int i814 = i30 + 2;
                                                                    byte b113 = bArr3[i29];
                                                                    int i815 = i28 + 1;
                                                                    i32 = i27;
                                                                    if (b10 >= -62) {
                                                                    }
                                                                    throw q0.d();
                                                                }
                                                                i32 = i27;
                                                                if (b10 < -16) {
                                                                    if (i29 < i32 - 2) {
                                                                        throw q0.d();
                                                                    }
                                                                    b13 = bArr3[i29];
                                                                    int i816 = i30 + 3;
                                                                    byte b114 = bArr3[i30 + 2];
                                                                    int i817 = i30 + 4;
                                                                    byte b115 = bArr3[i816];
                                                                    if (!j1.f.L(b13)) {
                                                                        if ((((b13 + 112) + (b10 << 28)) >> 30) != 0) {
                                                                        }
                                                                    }
                                                                    throw q0.d();
                                                                }
                                                                if (i29 < i32 - 1) {
                                                                    throw q0.d();
                                                                }
                                                                int i818 = i30 + 2;
                                                                b14 = bArr3[i29];
                                                                i33 = i30 + 3;
                                                                b15 = bArr3[i818];
                                                                i34 = i28 + 1;
                                                                if (j1.f.L(b14)) {
                                                                    if (b10 != -32) {
                                                                        if (b10 != -19) {
                                                                            if (!j1.f.L(b15)) {
                                                                                cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                                iP2 = i33;
                                                                                i75 = b12 == true ? 1 : 0;
                                                                                i27 = i32;
                                                                                i28 = i34;
                                                                            }
                                                                        } else if (b14 < -96) {
                                                                            b10 = -19;
                                                                            if (!j1.f.L(b15)) {
                                                                                cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                                iP2 = i33;
                                                                                i75 = b12 == true ? 1 : 0;
                                                                                i27 = i32;
                                                                                i28 = i34;
                                                                            }
                                                                        }
                                                                    } else if (b14 >= -96) {
                                                                        b10 = -32;
                                                                        if (b10 != -19) {
                                                                            if (!j1.f.L(b15)) {
                                                                                cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                                iP2 = i33;
                                                                                i75 = b12 == true ? 1 : 0;
                                                                                i27 = i32;
                                                                                i28 = i34;
                                                                            }
                                                                        } else if (b14 < -96) {
                                                                            b10 = -19;
                                                                            if (!j1.f.L(b15)) {
                                                                                cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                                iP2 = i33;
                                                                                i75 = b12 == true ? 1 : 0;
                                                                                i27 = i32;
                                                                                i28 = i34;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                throw q0.d();
                                                                i75 = b12 == true ? 1 : 0;
                                                                i27 = i32;
                                                            }
                                                        }
                                                        i24 = i75 == true ? 1 : 0;
                                                        d0Var3.f5247d = new String(cArr, 0, i28);
                                                        iR2 = i27;
                                                    }
                                                }
                                                while (iP2 < i27) {
                                                    i29 = iP2 + 1;
                                                    i30 = iP2;
                                                    b10 = bArr3[i30];
                                                    if (b10 >= 0) {
                                                        i31 = i28 + 1;
                                                        cArr[i28] = (char) b10;
                                                        iP2 = i29;
                                                        while (true) {
                                                            i28 = i31;
                                                            if (iP2 >= i27) {
                                                            }
                                                            break;
                                                            iP2++;
                                                            i31 = i28 + 1;
                                                            cArr[i28] = (char) b11;
                                                        }
                                                    } else {
                                                        b12 = i75 == true ? 1 : 0;
                                                        if (b10 >= -32) {
                                                            if (i29 < i27) {
                                                                throw q0.d();
                                                            }
                                                            int i819 = i30 + 2;
                                                            byte b116 = bArr3[i29];
                                                            int i8110 = i28 + 1;
                                                            i32 = i27;
                                                            if (b10 >= -62) {
                                                            }
                                                            throw q0.d();
                                                        }
                                                        i32 = i27;
                                                        if (b10 < -16) {
                                                            if (i29 < i32 - 2) {
                                                                throw q0.d();
                                                            }
                                                            b13 = bArr3[i29];
                                                            int i8111 = i30 + 3;
                                                            byte b117 = bArr3[i30 + 2];
                                                            int i8112 = i30 + 4;
                                                            byte b118 = bArr3[i8111];
                                                            if (!j1.f.L(b13)) {
                                                                if ((((b13 + 112) + (b10 << 28)) >> 30) != 0) {
                                                                }
                                                            }
                                                            throw q0.d();
                                                        }
                                                        if (i29 < i32 - 1) {
                                                            throw q0.d();
                                                        }
                                                        int i8113 = i30 + 2;
                                                        b14 = bArr3[i29];
                                                        i33 = i30 + 3;
                                                        b15 = bArr3[i8113];
                                                        i34 = i28 + 1;
                                                        if (j1.f.L(b14)) {
                                                            if (b10 != -32) {
                                                                if (b10 != -19) {
                                                                    if (!j1.f.L(b15)) {
                                                                        cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                        iP2 = i33;
                                                                        i75 = b12 == true ? 1 : 0;
                                                                        i27 = i32;
                                                                        i28 = i34;
                                                                    }
                                                                } else if (b14 < -96) {
                                                                    b10 = -19;
                                                                    if (!j1.f.L(b15)) {
                                                                        cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                        iP2 = i33;
                                                                        i75 = b12 == true ? 1 : 0;
                                                                        i27 = i32;
                                                                        i28 = i34;
                                                                    }
                                                                }
                                                            } else if (b14 >= -96) {
                                                                b10 = -32;
                                                                if (b10 != -19) {
                                                                    if (!j1.f.L(b15)) {
                                                                        cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                        iP2 = i33;
                                                                        i75 = b12 == true ? 1 : 0;
                                                                        i27 = i32;
                                                                        i28 = i34;
                                                                    }
                                                                } else if (b14 < -96) {
                                                                    b10 = -19;
                                                                    if (!j1.f.L(b15)) {
                                                                        cArr[i28] = (char) (((b10 & 15) << 12) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (b15 & Utf8.REPLACEMENT_BYTE));
                                                                        iP2 = i33;
                                                                        i75 = b12 == true ? 1 : 0;
                                                                        i27 = i32;
                                                                        i28 = i34;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        throw q0.d();
                                                        i75 = b12 == true ? 1 : 0;
                                                        i27 = i32;
                                                    }
                                                }
                                                i24 = i75 == true ? 1 : 0;
                                                d0Var3.f5247d = new String(cArr, 0, i28);
                                                iR2 = i27;
                                            }
                                        } else {
                                            i24 = i75 == true ? 1 : 0;
                                            iP = go.c.P(bArr3, i22, d0Var3);
                                            i25 = d0Var3.f5246c;
                                            if (i25 >= 0) {
                                                throw q0.g();
                                            }
                                            if (i25 == 0) {
                                                d0Var3.f5247d = "";
                                            } else {
                                                d0Var3.f5247d = new String(bArr3, iP, i25, p0.f22890a);
                                                iP += i25;
                                            }
                                            iR2 = iP;
                                        }
                                        unsafe2.putObject(obj3, j10, d0Var3.f5247d);
                                        i74 = i20 | i18;
                                        Object obj114 = obj3;
                                        d0Var7 = d0Var3;
                                        obj8 = obj114;
                                        i11 = i11;
                                        bArr6 = bArr3;
                                        unsafe12 = unsafe2;
                                        i75 = i24;
                                        i76 = 1048575;
                                        i73 = i23;
                                    } else {
                                        i24 = i75 == true ? 1 : 0;
                                        Object obj115 = obj3;
                                        bArr4 = bArr3;
                                        obj4 = obj115;
                                        d0Var4 = d0Var3;
                                        unsafe3 = unsafe2;
                                        i35 = i22;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 9:
                                    obj5 = obj8;
                                    unsafe4 = unsafe12;
                                    i22 = i78;
                                    iArr2 = iArr2;
                                    i23 = i21;
                                    if (i16 == 2) {
                                        Object objU3 = u(iP12, obj5);
                                        i11 = i11;
                                        iR2 = go.c.S(objU3, t(iP12), bArr, i22, i11, d0Var);
                                        g(iP12, obj5, objU3);
                                        i74 = i20 | i18;
                                        d0Var7 = d0Var;
                                        obj8 = obj5;
                                        bArr6 = bArr;
                                        unsafe12 = unsafe4;
                                        i76 = 1048575;
                                        i73 = i23;
                                    } else {
                                        bArr4 = bArr;
                                        obj4 = obj5;
                                        d0Var4 = d0Var;
                                        unsafe3 = unsafe4;
                                        i24 = i75 == true ? 1 : 0;
                                        i35 = i22;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 10:
                                    Object obj116 = obj8;
                                    unsafe5 = unsafe12;
                                    obj4 = obj116;
                                    bArr4 = bArr;
                                    i22 = i78;
                                    d0Var5 = d0Var;
                                    i23 = i21;
                                    if (i16 == 2) {
                                        iR2 = go.c.L(bArr4, i22, d0Var5);
                                        unsafe5.putObject(obj4, j10, d0Var5.f5247d);
                                        i74 = i20 | i18;
                                        Unsafe unsafe17 = unsafe5;
                                        obj8 = obj4;
                                        unsafe12 = unsafe17;
                                        i11 = i11;
                                        bArr6 = bArr4;
                                        d0Var7 = d0Var5;
                                        i76 = 1048575;
                                        i73 = i23;
                                    } else {
                                        unsafe3 = unsafe5;
                                        d0Var4 = d0Var5;
                                        i24 = i75 == true ? 1 : 0;
                                        i35 = i22;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 12:
                                    Object obj117 = obj8;
                                    unsafe5 = unsafe12;
                                    obj4 = obj117;
                                    bArr4 = bArr;
                                    i22 = i78;
                                    d0Var5 = d0Var;
                                    i23 = i21;
                                    if (i16 == 0) {
                                        iR2 = go.c.P(bArr4, i22, d0Var5);
                                        int i97 = d0Var5.f5246c;
                                        s(iP12);
                                        unsafe5.putInt(obj4, j10, i97);
                                        i74 = i20 | i18;
                                        Unsafe unsafe18 = unsafe5;
                                        obj8 = obj4;
                                        unsafe12 = unsafe18;
                                        i11 = i11;
                                        bArr6 = bArr4;
                                        d0Var7 = d0Var5;
                                        i76 = 1048575;
                                        i73 = i23;
                                    } else {
                                        unsafe3 = unsafe5;
                                        d0Var4 = d0Var5;
                                        i24 = i75 == true ? 1 : 0;
                                        i35 = i22;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 15:
                                    Object obj118 = obj8;
                                    unsafe5 = unsafe12;
                                    obj4 = obj118;
                                    bArr4 = bArr;
                                    i22 = i78;
                                    d0Var5 = d0Var;
                                    i23 = i21;
                                    if (i16 == 0) {
                                        iR2 = go.c.P(bArr4, i22, d0Var5);
                                        int i98 = d0Var5.f5246c;
                                        unsafe5.putInt(obj4, j10, (i98 >>> 1) ^ (-(i98 & 1)));
                                        i74 = i20 | i18;
                                        Unsafe unsafe19 = unsafe5;
                                        obj8 = obj4;
                                        unsafe12 = unsafe19;
                                        i11 = i11;
                                        bArr6 = bArr4;
                                        d0Var7 = d0Var5;
                                        i76 = 1048575;
                                        i73 = i23;
                                    } else {
                                        unsafe3 = unsafe5;
                                        d0Var4 = d0Var5;
                                        i24 = i75 == true ? 1 : 0;
                                        i35 = i22;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                case 16:
                                    bArr4 = bArr;
                                    i22 = i78;
                                    if (i16 == 0) {
                                        int iR6 = go.c.R(bArr4, i22, d0Var);
                                        long j15 = d0Var.f5245b;
                                        unsafe12.putLong(obj8, j10, (-(j15 & 1)) ^ (j15 >>> 1));
                                        obj8 = obj8;
                                        unsafe12 = unsafe12;
                                        int i99 = i21;
                                        i74 = i20 | i18;
                                        bArr6 = bArr4;
                                        d0Var7 = d0Var;
                                        i73 = i99;
                                        iR2 = iR6;
                                    } else {
                                        Object obj119 = obj8;
                                        Unsafe unsafe110 = unsafe12;
                                        obj4 = obj119;
                                        iArr2 = iArr2;
                                        i23 = i21;
                                        i24 = i75 == true ? 1 : 0;
                                        unsafe3 = unsafe110;
                                        d0Var4 = d0Var;
                                        i35 = i22;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                                default:
                                    if (i16 == 3) {
                                        Object objU4 = u(iP12, obj8);
                                        int iM5 = ((d1) t(iP12)).m(objU4, bArr, i78, i11, (i72 << 3) | 4, d0Var);
                                        d0Var.f5247d = objU4;
                                        g(iP12, obj8, objU4);
                                        iR2 = iM5;
                                        bArr6 = bArr;
                                        d0Var7 = d0Var;
                                        i73 = i21;
                                        i74 = i20 | i18;
                                    } else {
                                        bArr4 = bArr;
                                        i35 = i78;
                                        i23 = i21;
                                        i24 = i75 == true ? 1 : 0;
                                        d0Var4 = d0Var;
                                        unsafe3 = unsafe12;
                                        obj4 = obj8;
                                        i12 = i12;
                                        bArr2 = bArr4;
                                        i14 = i35;
                                        d0Var2 = d0Var4;
                                        unsafe = unsafe3;
                                        i15 = i24;
                                        i74 = i20;
                                        i73 = i23;
                                        obj2 = obj4;
                                        iArr = iArr2;
                                        iP12 = iP12;
                                    }
                                    break;
                            }
                        } else {
                            obj7 = obj8;
                            unsafe7 = unsafe12;
                            iArr = iArr2;
                            if (iQ == 27) {
                                obj2 = obj7;
                                unsafe8 = unsafe7;
                                if (iQ <= 49) {
                                    j11 = i17;
                                    unsafe9 = l;
                                    n0VarF2 = (n0) unsafe9.getObject(obj2, j10);
                                    if (!((d0) n0VarF2).f22802a) {
                                        int size3 = n0VarF2.size();
                                        n0VarF2 = n0VarF2.f(size3 != 0 ? size3 + size3 : 10);
                                        unsafe9.putObject(obj2, j10, n0VarF2);
                                    }
                                    n0Var = n0VarF2;
                                    switch (iQ) {
                                        case 18:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                                            bArr2 = bArr;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i43 = i78;
                                            d0Var2 = d0Var;
                                            i41 = i74;
                                            i44 = i11;
                                            if (i16 == 2) {
                                                if (i16 == 1) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    Double.longBitsToDouble(go.c.T(i43, bArr2));
                                                    throw null;
                                                }
                                                iP3 = i43;
                                            } else {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr2, i43, d0Var2);
                                                i45 = d0Var2.f5246c + iP3;
                                                if (iP3 >= i45) {
                                                    Double.longBitsToDouble(go.c.T(iP3, bArr2));
                                                    throw null;
                                                }
                                                if (iP3 != i45) {
                                                    throw q0.h();
                                                }
                                            }
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case 19:
                                        case 36:
                                            bArr2 = bArr;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i43 = i78;
                                            d0Var2 = d0Var;
                                            i41 = i74;
                                            i44 = i11;
                                            if (i16 == 2) {
                                                if (i16 == 5) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    Float.intBitsToFloat(go.c.M(i43, bArr2));
                                                    throw null;
                                                }
                                                iP3 = i43;
                                            } else {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr2, i43, d0Var2);
                                                i46 = d0Var2.f5246c + iP3;
                                                if (iP3 >= i46) {
                                                    Float.intBitsToFloat(go.c.M(iP3, bArr2));
                                                    throw null;
                                                }
                                                if (iP3 != i46) {
                                                    throw q0.h();
                                                }
                                            }
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                                            bArr2 = bArr;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i43 = i78;
                                            d0Var2 = d0Var;
                                            i41 = i74;
                                            i44 = i11;
                                            if (i16 == 2) {
                                                if (i16 == 0) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    go.c.R(bArr2, i43, d0Var2);
                                                    throw null;
                                                }
                                                iP3 = i43;
                                            } else {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr2, i43, d0Var2);
                                                i47 = d0Var2.f5246c + iP3;
                                                if (iP3 >= i47) {
                                                    go.c.R(bArr2, iP3, d0Var2);
                                                    throw null;
                                                }
                                                if (iP3 != i47) {
                                                    throw q0.h();
                                                }
                                            }
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case 22:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                                        case 39:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                                            bArr2 = bArr;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i43 = i78;
                                            d0Var2 = d0Var;
                                            i41 = i74;
                                            i44 = i11;
                                            if (i16 == 2) {
                                                if (i16 == 0) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    go.c.P(bArr2, i43, d0Var2);
                                                    throw null;
                                                }
                                                iP3 = i43;
                                            } else {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr2, i43, d0Var2);
                                                i48 = d0Var2.f5246c + iP3;
                                                if (iP3 >= i48) {
                                                    go.c.P(bArr2, iP3, d0Var2);
                                                    throw null;
                                                }
                                                if (iP3 != i48) {
                                                    throw q0.h();
                                                }
                                            }
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                                            bArr2 = bArr;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i43 = i78;
                                            d0Var2 = d0Var;
                                            i41 = i74;
                                            i44 = i11;
                                            if (i16 == 2) {
                                                if (i16 == 1) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    go.c.T(i43, bArr2);
                                                    throw null;
                                                }
                                                iP3 = i43;
                                            } else {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr2, i43, d0Var2);
                                                i49 = d0Var2.f5246c + iP3;
                                                if (iP3 >= i49) {
                                                    go.c.T(iP3, bArr2);
                                                    throw null;
                                                }
                                                if (iP3 != i49) {
                                                    throw q0.h();
                                                }
                                            }
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case 24:
                                        case 31:
                                        case 41:
                                        case 45:
                                            bArr2 = bArr;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i43 = i78;
                                            d0Var2 = d0Var;
                                            i41 = i74;
                                            i44 = i11;
                                            if (i16 == 2) {
                                                if (i16 == 5) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    go.c.M(i43, bArr2);
                                                    throw null;
                                                }
                                                iP3 = i43;
                                            } else {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr2, i43, d0Var2);
                                                i50 = d0Var2.f5246c + iP3;
                                                if (iP3 >= i50) {
                                                    go.c.M(iP3, bArr2);
                                                    throw null;
                                                }
                                                if (iP3 != i50) {
                                                    throw q0.h();
                                                }
                                            }
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            bArr2 = bArr;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i43 = i78;
                                            d0Var2 = d0Var;
                                            i41 = i74;
                                            i44 = i11;
                                            if (i16 == 2) {
                                                if (i16 == 0) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    go.c.R(bArr2, i43, d0Var2);
                                                    throw null;
                                                }
                                                iP3 = i43;
                                            } else {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr2, i43, d0Var2);
                                                i51 = d0Var2.f5246c + iP3;
                                                if (iP3 >= i51) {
                                                    go.c.R(bArr2, iP3, d0Var2);
                                                    throw null;
                                                }
                                                if (iP3 != i51) {
                                                    throw q0.h();
                                                }
                                            }
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                                            bArr2 = bArr;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i43 = i78;
                                            d0Var2 = d0Var;
                                            i41 = i74;
                                            i44 = i11;
                                            if (i16 == 2) {
                                                if ((j11 & 536870912) == 0) {
                                                    iP4 = go.c.P(bArr2, i43, d0Var2);
                                                    i56 = d0Var2.f5246c;
                                                    if (i56 >= 0) {
                                                        throw q0.g();
                                                    }
                                                    if (i56 == 0) {
                                                        n0Var.add("");
                                                    } else {
                                                        n0Var.add(new String(bArr2, iP4, i56, p0.f22890a));
                                                        iP4 += i56;
                                                    }
                                                    while (iP4 < i44) {
                                                        iP6 = go.c.P(bArr2, iP4, d0Var2);
                                                        if (i42 == d0Var2.f5246c) {
                                                            iP4 = go.c.P(bArr2, iP6, d0Var2);
                                                            i57 = d0Var2.f5246c;
                                                            if (i57 >= 0) {
                                                                throw q0.g();
                                                            }
                                                            if (i57 == 0) {
                                                                n0Var.add("");
                                                            } else {
                                                                n0Var.add(new String(bArr2, iP4, i57, p0.f22890a));
                                                                iP4 += i57;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    iP4 = go.c.P(bArr2, i43, d0Var2);
                                                    i52 = d0Var2.f5246c;
                                                    if (i52 >= 0) {
                                                        throw q0.g();
                                                    }
                                                    if (i52 == 0) {
                                                        n0Var.add("");
                                                    } else {
                                                        i53 = iP4 + i52;
                                                        y1.f22928a.getClass();
                                                        if (z.a(bArr2, iP4, i53)) {
                                                            throw q0.d();
                                                        }
                                                        n0Var.add(new String(bArr2, iP4, i52, p0.f22890a));
                                                        iP4 = i53;
                                                    }
                                                    while (iP4 < i44) {
                                                        iP5 = go.c.P(bArr2, iP4, d0Var2);
                                                        if (i42 == d0Var2.f5246c) {
                                                            iP4 = go.c.P(bArr2, iP5, d0Var2);
                                                            i54 = d0Var2.f5246c;
                                                            if (i54 >= 0) {
                                                                throw q0.g();
                                                            }
                                                            if (i54 == 0) {
                                                                n0Var.add("");
                                                            } else {
                                                                i55 = iP4 + i54;
                                                                y1.f22928a.getClass();
                                                                if (z.a(bArr2, iP4, i55)) {
                                                                    throw q0.d();
                                                                }
                                                                n0Var.add(new String(bArr2, iP4, i54, p0.f22890a));
                                                                iP4 = i55;
                                                            }
                                                        }
                                                    }
                                                }
                                                iP3 = iP4;
                                            } else {
                                                iP3 = i43;
                                            }
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case 27:
                                            bArr5 = bArr;
                                            i58 = i11;
                                            d0Var6 = d0Var;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i59 = i78;
                                            i41 = i74;
                                            if (i16 == 2) {
                                                iP4 = go.c.N(t(iP12), i42 == true ? 1 : 0, bArr5, i59, i58, n0Var, d0Var6);
                                                bArr2 = bArr5;
                                                i43 = i59;
                                                i42 = i42 == true ? 1 : 0;
                                                i44 = i58;
                                                d0Var2 = d0Var6;
                                                iP3 = iP4;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            }
                                            bArr2 = bArr5;
                                            i44 = i58;
                                            i43 = i59;
                                            d0Var2 = d0Var6;
                                            iP3 = i43;
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                                            bArr5 = bArr;
                                            i58 = i11;
                                            d0Var6 = d0Var;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i59 = i78;
                                            i41 = i74;
                                            if (i16 == 2) {
                                                iP7 = go.c.P(bArr5, i59, d0Var6);
                                                i60 = d0Var6.f5246c;
                                                if (i60 >= 0) {
                                                    throw q0.g();
                                                }
                                                if (i60 <= bArr5.length - iP7) {
                                                    throw q0.h();
                                                }
                                                if (i60 == 0) {
                                                    n0Var.add(h0.f22838c);
                                                } else {
                                                    n0Var.add(h0.p(bArr5, iP7, i60));
                                                    iP7 += i60;
                                                }
                                                while (iP7 < i58) {
                                                    iP8 = go.c.P(bArr5, iP7, d0Var6);
                                                    if (i42 == d0Var6.f5246c) {
                                                        iP3 = iP7;
                                                        bArr2 = bArr5;
                                                        i44 = i58;
                                                        i43 = i59;
                                                        d0Var2 = d0Var6;
                                                        if (iP3 != i43) {
                                                            bArr6 = bArr2;
                                                            iP12 = iP12;
                                                            i72 = i72;
                                                            i11 = i44;
                                                            d0Var7 = d0Var2;
                                                            i74 = i41;
                                                            unsafe12 = unsafe;
                                                            i76 = 1048575;
                                                            iR2 = iP3;
                                                            i75 = i42;
                                                            obj8 = obj2;
                                                            i73 = i39;
                                                        } else {
                                                            i14 = iP3;
                                                            i15 = i42;
                                                            iP12 = iP12;
                                                            i74 = i41;
                                                            i73 = i39;
                                                        }
                                                        break;
                                                    } else {
                                                        iP7 = go.c.P(bArr5, iP8, d0Var6);
                                                        i61 = d0Var6.f5246c;
                                                        if (i61 >= 0) {
                                                            throw q0.g();
                                                        }
                                                        if (i61 <= bArr5.length - iP7) {
                                                            throw q0.h();
                                                        }
                                                        if (i61 == 0) {
                                                            n0Var.add(h0.f22838c);
                                                        } else {
                                                            n0Var.add(h0.p(bArr5, iP7, i61));
                                                            iP7 += i61;
                                                        }
                                                    }
                                                }
                                                iP3 = iP7;
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            }
                                            bArr2 = bArr5;
                                            i44 = i58;
                                            i43 = i59;
                                            d0Var2 = d0Var6;
                                            iP3 = i43;
                                            if (iP3 != i43) {
                                                bArr6 = bArr2;
                                                iP12 = iP12;
                                                i72 = i72;
                                                i11 = i44;
                                                d0Var7 = d0Var2;
                                                i74 = i41;
                                                unsafe12 = unsafe;
                                                i76 = 1048575;
                                                iR2 = iP3;
                                                i75 = i42;
                                                obj8 = obj2;
                                                i73 = i39;
                                            } else {
                                                i14 = iP3;
                                                i15 = i42;
                                                iP12 = iP12;
                                                i74 = i41;
                                                i73 = i39;
                                            }
                                            break;
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                                        case 44:
                                            bArr5 = bArr;
                                            i58 = i11;
                                            d0Var6 = d0Var;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i59 = i78;
                                            i41 = i74;
                                            if (i16 == 2) {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr5, i59, d0Var6);
                                                i62 = d0Var6.f5246c + iP3;
                                                if (iP3 >= i62) {
                                                    go.c.P(bArr5, iP3, d0Var6);
                                                    throw null;
                                                }
                                                if (iP3 == i62) {
                                                    throw q0.h();
                                                }
                                                s(iP12);
                                                Class cls2 = m1.f22873a;
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            } else {
                                                if (i16 == 0) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    go.c.P(bArr5, i59, d0Var6);
                                                    throw null;
                                                }
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                iP3 = i43;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            }
                                            break;
                                        case 33:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                                            bArr5 = bArr;
                                            i58 = i11;
                                            d0Var6 = d0Var;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i59 = i78;
                                            i41 = i74;
                                            if (i16 == 2) {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr5, i59, d0Var6);
                                                i63 = d0Var6.f5246c + iP3;
                                                if (iP3 >= i63) {
                                                    go.c.P(bArr5, iP3, d0Var6);
                                                    throw null;
                                                }
                                                if (iP3 != i63) {
                                                    throw q0.h();
                                                }
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            } else {
                                                if (i16 == 0) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    go.c.P(bArr5, i59, d0Var6);
                                                    throw null;
                                                }
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                iP3 = i43;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            }
                                            break;
                                        case 34:
                                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                                            bArr5 = bArr;
                                            i58 = i11;
                                            d0Var6 = d0Var;
                                            i39 = i73;
                                            unsafe = unsafe8;
                                            i42 = i75 == true ? 1 : 0;
                                            i59 = i78;
                                            i41 = i74;
                                            if (i16 == 2) {
                                                if (n0Var == null) {
                                                    throw new ClassCastException();
                                                }
                                                iP3 = go.c.P(bArr5, i59, d0Var6);
                                                i64 = d0Var6.f5246c + iP3;
                                                if (iP3 >= i64) {
                                                    go.c.R(bArr5, iP3, d0Var6);
                                                    throw null;
                                                }
                                                if (iP3 != i64) {
                                                    throw q0.h();
                                                }
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            } else {
                                                if (i16 == 0) {
                                                    if (n0Var == null) {
                                                        throw new ClassCastException();
                                                    }
                                                    go.c.R(bArr5, i59, d0Var6);
                                                    throw null;
                                                }
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                iP3 = i43;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            }
                                            break;
                                        default:
                                            if (i16 == 3) {
                                                l1VarT = t(iP12);
                                                i65 = ((i75 == true ? 1 : 0) & (-8)) | 4;
                                                m0 m0VarZzd3 = l1VarT.zzd();
                                                d1Var = (d1) l1VarT;
                                                i58 = i11;
                                                d0Var6 = d0Var;
                                                i39 = i73;
                                                i42 = i75 == true ? 1 : 0;
                                                i66 = i78;
                                                i41 = i74;
                                                bArr5 = bArr;
                                                int iM6 = d1Var.m(m0VarZzd3, bArr5, i66, i58, i65, d0Var6);
                                                d0Var6.f5247d = m0VarZzd3;
                                                l1VarT.a(m0VarZzd3);
                                                d0Var6.f5247d = m0VarZzd3;
                                                n0Var.add(m0VarZzd3);
                                                iP3 = iM6;
                                                while (true) {
                                                    if (iP3 < i58) {
                                                        i67 = i66;
                                                        iP9 = go.c.P(bArr5, iP3, d0Var6);
                                                        d1Var2 = d1Var;
                                                        if (i42 == d0Var6.f5246c) {
                                                            m0 m0VarZzd4 = l1VarT.zzd();
                                                            d1Var = d1Var2;
                                                            int iM7 = d1Var.m(m0VarZzd4, bArr5, iP9, i58, i65, d0Var6);
                                                            d0Var6.f5247d = m0VarZzd4;
                                                            l1VarT.a(m0VarZzd4);
                                                            d0Var6.f5247d = m0VarZzd4;
                                                            n0Var.add(m0VarZzd4);
                                                            iP3 = iM7;
                                                            i66 = i67;
                                                            unsafe8 = unsafe8;
                                                        } else {
                                                            unsafe = unsafe8;
                                                            i59 = i67;
                                                        }
                                                    } else {
                                                        unsafe = unsafe8;
                                                        i59 = i66;
                                                    }
                                                }
                                                bArr2 = bArr5;
                                                i44 = i58;
                                                i43 = i59;
                                                d0Var2 = d0Var6;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            } else {
                                                i39 = i73;
                                                unsafe = unsafe8;
                                                i42 = i75 == true ? 1 : 0;
                                                i41 = i74;
                                                bArr2 = bArr;
                                                i44 = i11;
                                                d0Var2 = d0Var;
                                                i43 = i78;
                                                iP3 = i43;
                                                if (iP3 != i43) {
                                                    bArr6 = bArr2;
                                                    iP12 = iP12;
                                                    i72 = i72;
                                                    i11 = i44;
                                                    d0Var7 = d0Var2;
                                                    i74 = i41;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    iR2 = iP3;
                                                    i75 = i42;
                                                    obj8 = obj2;
                                                    i73 = i39;
                                                } else {
                                                    i14 = iP3;
                                                    i15 = i42;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                            }
                                            break;
                                    }
                                } else {
                                    i38 = i78;
                                    i39 = i73;
                                    i41 = i74;
                                    bArr2 = bArr;
                                    i40 = i75 == true ? 1 : 0;
                                    unsafe = unsafe8;
                                    d0Var2 = d0Var;
                                    if (iQ == 50) {
                                        unsafe11 = l;
                                        j12 = iArr[iP12 + 2] & 1048575;
                                        switch (iQ) {
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                                                i68 = i40 == true ? 1 : 0;
                                                iP12 = iP12;
                                                i69 = i38;
                                                if (i16 == 1) {
                                                    unsafe11.putObject(obj2, j10, Double.valueOf(Double.longBitsToDouble(go.c.T(i69, bArr2))));
                                                    iP10 = i69 + 8;
                                                    unsafe11.putInt(obj2, j12, i72);
                                                } else {
                                                    iP10 = i69;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                                                i68 = i40 == true ? 1 : 0;
                                                iP12 = iP12;
                                                i69 = i38;
                                                if (i16 == 5) {
                                                    unsafe11.putObject(obj2, j10, Float.valueOf(Float.intBitsToFloat(go.c.M(i69, bArr2))));
                                                    iP10 = i69 + 4;
                                                    unsafe11.putInt(obj2, j12, i72);
                                                } else {
                                                    iP10 = i69;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                                                i68 = i40 == true ? 1 : 0;
                                                iP12 = iP12;
                                                i69 = i38;
                                                if (i16 == 0) {
                                                    iR = go.c.R(bArr2, i69, d0Var2);
                                                    unsafe11.putObject(obj2, j10, Long.valueOf(d0Var2.f5245b));
                                                    unsafe11.putInt(obj2, j12, i72);
                                                    iP10 = iR;
                                                } else {
                                                    iP10 = i69;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                                            case 62:
                                                i68 = i40 == true ? 1 : 0;
                                                iP12 = iP12;
                                                i69 = i38;
                                                if (i16 == 0) {
                                                    iP10 = go.c.P(bArr2, i69, d0Var2);
                                                    unsafe11.putObject(obj2, j10, Integer.valueOf(d0Var2.f5246c));
                                                    unsafe11.putInt(obj2, j12, i72);
                                                } else {
                                                    iP10 = i69;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                                            case 65:
                                                i68 = i40 == true ? 1 : 0;
                                                iP12 = iP12;
                                                i69 = i38;
                                                if (i16 == 1) {
                                                    unsafe11.putObject(obj2, j10, Long.valueOf(go.c.T(i69, bArr2)));
                                                    iP10 = i69 + 8;
                                                    unsafe11.putInt(obj2, j12, i72);
                                                } else {
                                                    iP10 = i69;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                                            case 64:
                                                i68 = i40 == true ? 1 : 0;
                                                iP12 = iP12;
                                                i69 = i38;
                                                if (i16 == 5) {
                                                    unsafe11.putObject(obj2, j10, Integer.valueOf(go.c.M(i69, bArr2)));
                                                    iP10 = i69 + 4;
                                                    unsafe11.putInt(obj2, j12, i72);
                                                } else {
                                                    iP10 = i69;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                                                i68 = i40 == true ? 1 : 0;
                                                iP12 = iP12;
                                                i69 = i38;
                                                if (i16 == 0) {
                                                    iR = go.c.R(bArr2, i69, d0Var2);
                                                    if (d0Var2.f5245b != 0) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    unsafe11.putObject(obj2, j10, Boolean.valueOf(z11));
                                                    unsafe11.putInt(obj2, j12, i72);
                                                    iP10 = iR;
                                                } else {
                                                    iP10 = i69;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                                                i68 = i40 == true ? 1 : 0;
                                                i69 = i38;
                                                if (i16 == 2) {
                                                    iP11 = go.c.P(bArr2, i69, d0Var2);
                                                    i70 = d0Var2.f5246c;
                                                    if (i70 == 0) {
                                                        unsafe11.putObject(obj2, j10, "");
                                                    } else {
                                                        if ((i17 & 536870912) != 0) {
                                                            y1.f22928a.getClass();
                                                            if (!z.a(bArr2, iP11, iP11 + i70)) {
                                                                throw q0.d();
                                                            }
                                                        }
                                                        unsafe11.putObject(obj2, j10, new String(bArr2, iP11, i70, p0.f22890a));
                                                        iP11 += i70;
                                                    }
                                                    unsafe11.putInt(obj2, j12, i72);
                                                    iP10 = iP11;
                                                } else {
                                                    iP12 = iP12;
                                                    iP10 = i69;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 60:
                                                i68 = i40 == true ? 1 : 0;
                                                i71 = i38;
                                                if (i16 == 2) {
                                                    Object objV3 = v(i72, iP12, obj2);
                                                    int iS2 = go.c.S(objV3, t(iP12), bArr2, i71, i11, d0Var2);
                                                    i69 = i71;
                                                    bArr2 = bArr2;
                                                    h(i72, iP12, obj2, objV3);
                                                    iP10 = iS2;
                                                    iP12 = iP12;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                i69 = i71;
                                                iP12 = iP12;
                                                iP10 = i69;
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                                                i68 = i40 == true ? 1 : 0;
                                                i71 = i38;
                                                if (i16 == 2) {
                                                    iL = go.c.L(bArr2, i71, d0Var2);
                                                    unsafe11.putObject(obj2, j10, d0Var2.f5247d);
                                                    unsafe11.putInt(obj2, j12, i72);
                                                    i69 = i71;
                                                    iP10 = iL;
                                                    iP12 = iP12;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                i69 = i71;
                                                iP12 = iP12;
                                                iP10 = i69;
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                                                i68 = i40 == true ? 1 : 0;
                                                i71 = i38;
                                                if (i16 == 0) {
                                                    iL = go.c.P(bArr2, i71, d0Var2);
                                                    int i910 = d0Var2.f5246c;
                                                    s(iP12);
                                                    unsafe11.putObject(obj2, j10, Integer.valueOf(i910));
                                                    unsafe11.putInt(obj2, j12, i72);
                                                    i69 = i71;
                                                    iP10 = iL;
                                                    iP12 = iP12;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                i69 = i71;
                                                iP12 = iP12;
                                                iP10 = i69;
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 66:
                                                i68 = i40 == true ? 1 : 0;
                                                i71 = i38;
                                                if (i16 == 0) {
                                                    iL = go.c.P(bArr2, i71, d0Var2);
                                                    int i911 = d0Var2.f5246c;
                                                    unsafe11.putObject(obj2, j10, Integer.valueOf((i911 >>> 1) ^ (-(i911 & 1))));
                                                    unsafe11.putInt(obj2, j12, i72);
                                                    i69 = i71;
                                                    iP10 = iL;
                                                    iP12 = iP12;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                i69 = i71;
                                                iP12 = iP12;
                                                iP10 = i69;
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                            case 67:
                                                i71 = i38;
                                                if (i16 == 0) {
                                                    iL = go.c.R(bArr2, i71, d0Var2);
                                                    i68 = i40 == true ? 1 : 0;
                                                    long j16 = d0Var2.f5245b;
                                                    unsafe11.putObject(obj2, j10, Long.valueOf((j16 >>> 1) ^ (-(j16 & 1))));
                                                    unsafe11.putInt(obj2, j12, i72);
                                                    i69 = i71;
                                                    iP10 = iL;
                                                    iP12 = iP12;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                } else {
                                                    i68 = i40 == true ? 1 : 0;
                                                    i69 = i71;
                                                    iP12 = iP12;
                                                    iP10 = i69;
                                                    if (iP10 != i69) {
                                                        bArr2 = bArr2;
                                                        bArr6 = bArr2;
                                                        iR2 = iP10;
                                                        i72 = i72;
                                                        obj8 = obj2;
                                                        d0Var7 = d0Var2;
                                                        iP12 = iP12;
                                                        i73 = i39;
                                                        unsafe12 = unsafe;
                                                        i76 = 1048575;
                                                        i11 = i11;
                                                        i75 = i68;
                                                        i74 = i41;
                                                    } else {
                                                        bArr2 = bArr2;
                                                        i14 = iP10;
                                                        i15 = i68;
                                                        iP12 = iP12;
                                                        i74 = i41;
                                                        i73 = i39;
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (i16 == 3) {
                                                    Object objV4 = v(i72, iP12, obj2);
                                                    int iM8 = ((d1) t(iP12)).m(objV4, bArr2, i38, i11, ((i40 == true ? 1 : 0) & (-8)) | 4, d0Var2);
                                                    d0Var2.f5247d = objV4;
                                                    h(i72, iP12, obj2, objV4);
                                                    i69 = i38;
                                                    i68 = i40 == true ? 1 : 0;
                                                    iP12 = iP12;
                                                    iP10 = iM8;
                                                }
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                    break;
                                                } else {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                    break;
                                                }
                                            default:
                                                i68 = i40 == true ? 1 : 0;
                                                iP12 = iP12;
                                                i69 = i38;
                                                iP10 = i69;
                                                if (iP10 != i69) {
                                                    bArr2 = bArr2;
                                                    bArr6 = bArr2;
                                                    iR2 = iP10;
                                                    i72 = i72;
                                                    obj8 = obj2;
                                                    d0Var7 = d0Var2;
                                                    iP12 = iP12;
                                                    i73 = i39;
                                                    unsafe12 = unsafe;
                                                    i76 = 1048575;
                                                    i11 = i11;
                                                    i75 = i68;
                                                    i74 = i41;
                                                } else {
                                                    bArr2 = bArr2;
                                                    i14 = iP10;
                                                    i15 = i68;
                                                    iP12 = iP12;
                                                    i74 = i41;
                                                    i73 = i39;
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i16 == 2) {
                                            unsafe10 = l;
                                            int i912 = iP12 / 3;
                                            Object obj120 = this.f22805b[i912 + i912];
                                            object = unsafe10.getObject(obj2, j10);
                                            if (!((y0) object).f22927a) {
                                                y0Var = y0.f22926b;
                                                if (y0Var.isEmpty()) {
                                                    y0Var2 = new y0();
                                                } else {
                                                    y0 y0Var4 = new y0(y0Var);
                                                    y0Var4.f22927a = true;
                                                    y0Var2 = y0Var4;
                                                }
                                                z0.a(y0Var2, object);
                                                unsafe10.putObject(obj2, j10, y0Var2);
                                            }
                                            throw q4.a.h(obj120);
                                        }
                                        i12 = i12;
                                        i15 = i40;
                                        iP12 = iP12;
                                        i74 = i41;
                                        i73 = i39;
                                        i14 = i38;
                                    }
                                }
                            } else if (i16 == 2) {
                                n0VarF = (n0) unsafe7.getObject(obj7, j10);
                                if (!((d0) n0VarF).f22802a) {
                                    int size4 = n0VarF.size();
                                    n0VarF = n0VarF.f(size4 != 0 ? size4 + size4 : 10);
                                    unsafe7.putObject(obj7, j10, n0VarF);
                                }
                                n0 n0Var3 = n0VarF;
                                bArr6 = bArr;
                                i11 = i11;
                                iR2 = go.c.N(t(iP12), i75 == true ? 1 : 0, bArr6, i78, i11, n0Var3, d0Var);
                                d0Var7 = d0Var;
                                iP12 = iP12;
                                i72 = i72;
                                unsafe12 = unsafe7;
                                i76 = 1048575;
                                i75 = i75 == true ? 1 : 0;
                                obj8 = obj;
                            } else {
                                obj2 = obj7;
                                i38 = i78;
                                i39 = i73;
                                unsafe = unsafe7;
                                i40 = i75 == true ? 1 : 0;
                                bArr2 = bArr;
                                d0Var2 = d0Var;
                                i41 = i74;
                                i12 = i12;
                                i15 = i40;
                                iP12 = iP12;
                                i74 = i41;
                                i73 = i39;
                                i14 = i38;
                            }
                        }
                    } else {
                        bArr2 = bArr;
                        i12 = i12;
                        unsafe = unsafe12;
                        iP12 = 0;
                        i14 = i78;
                        iArr = iArr2;
                        obj2 = obj8;
                        i15 = i75 == true ? 1 : 0;
                        d0Var2 = d0Var7;
                    }
                    if (i15 == i12) {
                    }
                    m0Var = (m0) obj2;
                    o1VarA = m0Var.zzc;
                    if (o1VarA == o1.f22883e) {
                        o1VarA = o1.a();
                        m0Var.zzc = o1VarA;
                    }
                    int i913 = i15;
                    int iO2 = go.c.O(i913 == true ? 1 : 0, bArr2, i14, i11, o1VarA, d0Var2);
                    d0Var7 = d0Var;
                    i75 = i913 == true ? 1 : 0;
                    i11 = i11;
                    i72 = i72;
                    obj8 = obj2;
                    unsafe12 = unsafe;
                    i76 = 1048575;
                    iR2 = iO2;
                    bArr6 = bArr;
                } else {
                    i12 = i12;
                    iArr = iArr2;
                    obj2 = obj8;
                }
            }
        }
        if (i73 != 1048575) {
            unsafe12.putInt(obj2, i73, i74);
        }
        for (int i100 = this.f22810g; i100 < this.f22811h; i100++) {
            int i101 = this.f22809f[i100];
            int i102 = iArr[i101];
            if (x1.d(r(i101) & 1048575, obj2) != null) {
                s(i101);
            }
        }
        if (i12 == 0) {
            if (iR2 != i11) {
                throw new q0("Failed to parse the message.");
            }
        } else if (iR2 > i11 || i75 != i12) {
            throw new q0("Failed to parse the message.");
        }
        return iR2;
    }

    public final int p(int i10, int i11) {
        int[] iArr = this.f22804a;
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

    public final int r(int i10) {
        return this.f22804a[i10 + 1];
    }

    public final void s(int i10) {
        int i11 = i10 / 3;
        if (this.f22805b[i11 + i11 + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final l1 t(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f22805b;
        l1 l1Var = (l1) objArr[i12];
        if (l1Var != null) {
            return l1Var;
        }
        l1 l1VarA = i1.f22844c.a((Class) objArr[i12 + 1]);
        objArr[i12] = l1VarA;
        return l1VarA;
    }

    public final Object u(int i10, Object obj) {
        l1 l1VarT = t(i10);
        int iR = r(i10) & 1048575;
        if (!j(i10, obj)) {
            return l1VarT.zzd();
        }
        Object object = l.getObject(obj, iR);
        if (k(object)) {
            return object;
        }
        m0 m0VarZzd = l1VarT.zzd();
        if (object != null) {
            l1VarT.d(m0VarZzd, object);
        }
        return m0VarZzd;
    }

    public final Object v(int i10, int i11, Object obj) {
        l1 l1VarT = t(i11);
        if (!l(i10, i11, obj)) {
            return l1VarT.zzd();
        }
        Object object = l.getObject(obj, r(i11) & 1048575);
        if (k(object)) {
            return object;
        }
        m0 m0VarZzd = l1VarT.zzd();
        if (object != null) {
            l1VarT.d(m0VarZzd, object);
        }
        return m0VarZzd;
    }

    public final void x(int i10, Object obj, Object obj2) {
        if (j(i10, obj2)) {
            int iR = r(i10) & 1048575;
            Unsafe unsafe = l;
            long j10 = iR;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f22804a[i10] + " is present but null: " + obj2.toString());
            }
            l1 l1VarT = t(i10);
            if (!j(i10, obj)) {
                if (k(object)) {
                    m0 m0VarZzd = l1VarT.zzd();
                    l1VarT.d(m0VarZzd, object);
                    unsafe.putObject(obj, j10, m0VarZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                z(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!k(object2)) {
                m0 m0VarZzd2 = l1VarT.zzd();
                l1VarT.d(m0VarZzd2, object2);
                unsafe.putObject(obj, j10, m0VarZzd2);
                object2 = m0VarZzd2;
            }
            l1VarT.d(object2, object);
        }
    }

    public final void y(int i10, Object obj, Object obj2) {
        int[] iArr = this.f22804a;
        int i11 = iArr[i10];
        if (l(i11, i10, obj2)) {
            int iR = r(i10) & 1048575;
            Unsafe unsafe = l;
            long j10 = iR;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            l1 l1VarT = t(i10);
            if (!l(i11, i10, obj)) {
                if (k(object)) {
                    m0 m0VarZzd = l1VarT.zzd();
                    l1VarT.d(m0VarZzd, object);
                    unsafe.putObject(obj, j10, m0VarZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                x1.h(i11, iArr[i10 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!k(object2)) {
                m0 m0VarZzd2 = l1VarT.zzd();
                l1VarT.d(m0VarZzd2, object2);
                unsafe.putObject(obj, j10, m0VarZzd2);
                object2 = m0VarZzd2;
            }
            l1VarT.d(object2, object);
        }
    }

    public final void z(int i10, Object obj) {
        int i11 = this.f22804a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        x1.h((1 << (i11 >>> 20)) | x1.a(j10, obj), j10, obj);
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final m0 zzd() {
        return ((m0) this.f22808e).b();
    }
}
