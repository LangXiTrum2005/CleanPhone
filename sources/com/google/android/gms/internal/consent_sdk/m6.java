package com.google.android.gms.internal.consent_sdk;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.ca;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m6 implements s6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f23092g = new int[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Unsafe f23093h = d7.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f23094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f23095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i5 f23096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f23097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y6 f23099f;

    public m6(int[] iArr, Object[] objArr, i5 i5Var, int[] iArr2, int i10, y6 y6Var, o4 o4Var) {
        this.f23094a = iArr;
        this.f23095b = objArr;
        this.f23097d = iArr2;
        this.f23098e = i10;
        this.f23099f = y6Var;
        this.f23096c = i5Var;
    }

    public static boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof w5) {
            return ((w5) obj).e();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x032a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0376  */
    /* JADX WARN: Code duplicated, block: B:185:0x037d  */
    /* JADX WARN: Code duplicated, block: B:188:0x038a  */
    public static m6 j(r6 r6Var, y6 y6Var, o4 o4Var) {
        int i10;
        int iCharAt;
        int iCharAt2;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        char cCharAt;
        int i15;
        char cCharAt2;
        int i16;
        char cCharAt3;
        int i17;
        char cCharAt4;
        int i18;
        int i19;
        int i20;
        char cCharAt5;
        int i21;
        char cCharAt6;
        int i22;
        int i23;
        Object[] objArr;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i24;
        int i25;
        int i26;
        int i27;
        Field fieldP;
        char cCharAt7;
        int i28;
        int i29;
        int i30;
        int i31;
        Field fieldP2;
        Field fieldP3;
        int i32;
        char cCharAt8;
        int i33;
        int i34;
        char cCharAt9;
        int i35;
        char cCharAt10;
        int i36;
        char cCharAt11;
        if (!(r6Var instanceof r6)) {
            r6Var.getClass();
            throw new ClassCastException();
        }
        String str = r6Var.f23182b;
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
        int iCharAt3 = str.charAt(i10);
        if (iCharAt3 >= 55296) {
            int i40 = iCharAt3 & 8191;
            int i41 = 13;
            while (true) {
                i36 = i39 + 1;
                cCharAt11 = str.charAt(i39);
                if (cCharAt11 < 55296) {
                    break;
                }
                i40 |= (cCharAt11 & 8191) << i41;
                i41 += 13;
                i39 = i36;
            }
            iCharAt3 = i40 | (cCharAt11 << i41);
            i39 = i36;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i11 = 0;
            i13 = 0;
            iArr = f23092g;
            i12 = 0;
        } else {
            int i42 = i39 + 1;
            int iCharAt4 = str.charAt(i39);
            if (iCharAt4 >= 55296) {
                int i43 = iCharAt4 & 8191;
                int i44 = 13;
                while (true) {
                    i21 = i42 + 1;
                    cCharAt6 = str.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i21;
                }
                iCharAt4 = i43 | (cCharAt6 << i44);
                i42 = i21;
            }
            int i45 = i42 + 1;
            int iCharAt5 = str.charAt(i42);
            if (iCharAt5 >= 55296) {
                int i46 = iCharAt5 & 8191;
                int i47 = 13;
                while (true) {
                    i20 = i45 + 1;
                    cCharAt5 = str.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i20;
                }
                iCharAt5 = i46 | (cCharAt5 << i47);
                i45 = i20;
            }
            int i48 = i45 + 1;
            if (str.charAt(i45) >= 55296) {
                while (true) {
                    i19 = i48 + 1;
                    if (str.charAt(i48) < 55296) {
                        break;
                    }
                    i48 = i19;
                }
                i48 = i19;
            }
            int i49 = i48 + 1;
            if (str.charAt(i48) >= 55296) {
                while (true) {
                    i18 = i49 + 1;
                    if (str.charAt(i49) < 55296) {
                        break;
                    }
                    i49 = i18;
                }
                i49 = i18;
            }
            int i50 = i49 + 1;
            iCharAt = str.charAt(i49);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i17 = i50 + 1;
                    cCharAt4 = str.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i17;
                }
                iCharAt = i51 | (cCharAt4 << i52);
                i50 = i17;
            }
            int i53 = i50 + 1;
            iCharAt2 = str.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i16 = i53 + 1;
                    cCharAt3 = str.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i16;
                }
                iCharAt2 = i54 | (cCharAt3 << i55);
                i53 = i16;
            }
            int i56 = i53 + 1;
            int iCharAt6 = str.charAt(i53);
            if (iCharAt6 >= 55296) {
                int i57 = iCharAt6 & 8191;
                int i58 = 13;
                while (true) {
                    i15 = i56 + 1;
                    cCharAt2 = str.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i15;
                }
                iCharAt6 = i57 | (cCharAt2 << i58);
                i56 = i15;
            }
            int i59 = i56 + 1;
            int iCharAt7 = str.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i14 = i59 + 1;
                    cCharAt = str.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i59 = i14;
                }
                iCharAt7 = i60 | (cCharAt << i61);
                i59 = i14;
            }
            int i62 = iCharAt7 + iCharAt2 + iCharAt6;
            i11 = iCharAt4 + iCharAt4 + iCharAt5;
            i12 = iCharAt4;
            i39 = i59;
            iArr = new int[i62];
            i13 = iCharAt7;
        }
        Unsafe unsafe = f23093h;
        Object[] objArr2 = r6Var.f23183c;
        Class<?> cls = r6Var.f23181a.getClass();
        int i63 = iCharAt2 + i13;
        int i64 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr3 = new Object[i64];
        int i65 = i13;
        int i66 = 0;
        int i67 = 0;
        while (i39 < length) {
            int i68 = i39 + 1;
            int iCharAt8 = str.charAt(i39);
            if (iCharAt8 >= i37) {
                int i69 = iCharAt8 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i35 = i70 + 1;
                    cCharAt10 = str.charAt(i70);
                    i22 = length;
                    if (cCharAt10 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt10 & 8191) << i71;
                    i71 += 13;
                    i70 = i35;
                    length = i22;
                }
                iCharAt8 = i69 | (cCharAt10 << i71);
                i23 = i35;
            } else {
                i22 = length;
                i23 = i68;
            }
            int i72 = i23 + 1;
            int iCharAt9 = str.charAt(i23);
            int i73 = iCharAt8;
            char c4 = 55296;
            if (iCharAt9 >= 55296) {
                int i74 = iCharAt9 & 8191;
                int i75 = 13;
                while (true) {
                    i34 = i72 + 1;
                    cCharAt9 = str.charAt(i72);
                    if (cCharAt9 < c4) {
                        break;
                    }
                    i74 |= (cCharAt9 & 8191) << i75;
                    i75 += 13;
                    i72 = i34;
                    c4 = 55296;
                }
                iCharAt9 = i74 | (cCharAt9 << i75);
                i72 = i34;
            }
            if ((iCharAt9 & 1024) != 0) {
                iArr[i67] = i66;
                i67++;
            }
            int i76 = iCharAt9 & 255;
            int i77 = i12;
            int i78 = iCharAt9 & com.ironsource.mediationsdk.metadata.a.f29616n;
            if (i76 >= 51) {
                int i79 = i72 + 1;
                int iCharAt10 = str.charAt(i72);
                if (iCharAt10 >= 55296) {
                    int i80 = iCharAt10 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i32 = i81 + 1;
                        cCharAt8 = str.charAt(i81);
                        i33 = i80;
                        if (cCharAt8 < 55296) {
                            break;
                        }
                        i80 = i33 | ((cCharAt8 & 8191) << i82);
                        i82 += 13;
                        i81 = i32;
                    }
                    iCharAt10 = i33 | (cCharAt8 << i82);
                    i30 = i32;
                } else {
                    i30 = i79;
                }
                int i83 = iCharAt10;
                int i84 = i76 - 51;
                int i85 = i30;
                if (i84 == 9 || i84 == 17) {
                    objArr3[ca.f(i66, 3, 1)] = objArr2[i11];
                    i31 = i78;
                    i11++;
                } else if (i84 != 12) {
                    i31 = i78;
                } else if (r6Var.a() == 1 || i78 != 0) {
                    objArr3[ca.f(i66, 3, 1)] = objArr2[i11];
                    i11++;
                    i31 = i78;
                } else {
                    i31 = 0;
                }
                int i86 = i83 + i83;
                Object obj = objArr2[i86];
                int i87 = i31;
                if (obj instanceof Field) {
                    fieldP2 = (Field) obj;
                } else {
                    fieldP2 = p(cls, (String) obj);
                    objArr2[i86] = fieldP2;
                }
                objArr = objArr3;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldP2);
                int i88 = i86 + 1;
                Object obj2 = objArr2[i88];
                if (obj2 instanceof Field) {
                    fieldP3 = (Field) obj2;
                } else {
                    fieldP3 = p(cls, (String) obj2);
                    objArr2[i88] = fieldP3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP3);
                iArr2 = iArr2;
                i27 = iObjectFieldOffset3;
                i78 = i87;
                i24 = i85;
                i26 = 0;
            } else {
                objArr = objArr3;
                int i89 = i11 + 1;
                Field fieldP4 = p(cls, (String) objArr2[i11]);
                if (i76 == 9 || i76 == 17) {
                    objArr[ca.f(i66, 3, 1)] = fieldP4.getType();
                } else {
                    if (i76 != 27) {
                        if (i76 == 49) {
                            i11 += 2;
                            i28 = 3;
                            i29 = 1;
                        } else if (i76 == 12 || i76 == 30 || i76 == 44) {
                            iArr2 = iArr2;
                            if (r6Var.a() == 1 || i78 != 0) {
                                i11 += 2;
                                objArr[ca.f(i66, 3, 1)] = objArr2[i89];
                            } else {
                                i11 = i89;
                                i78 = 0;
                            }
                        } else if (i76 == 50) {
                            int i90 = i11 + 2;
                            i65++;
                            iArr[i65] = i66;
                            int i91 = i66 / 3;
                            int i92 = i91 + i91;
                            objArr[i92] = objArr2[i89];
                            if (i78 != 0) {
                                i11 += 3;
                                objArr[i92 + 1] = objArr2[i90];
                            } else {
                                i11 = i90;
                                i78 = 0;
                            }
                            iArr2 = iArr2;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt9 & 4096) != 0 || i76 > 17) {
                            i24 = i72;
                            i25 = 0;
                        } else {
                            int i93 = i72 + 1;
                            int iCharAt11 = str.charAt(i72);
                            if (iCharAt11 >= 55296) {
                                int i94 = iCharAt11 & 8191;
                                int i95 = 13;
                                while (true) {
                                    i24 = i93 + 1;
                                    cCharAt7 = str.charAt(i93);
                                    if (cCharAt7 < 55296) {
                                        break;
                                    }
                                    i94 |= (cCharAt7 & 8191) << i95;
                                    i95 += 13;
                                    i93 = i24;
                                }
                                iCharAt11 = i94 | (cCharAt7 << i95);
                            } else {
                                i24 = i93;
                            }
                            int i96 = (iCharAt11 / 32) + i77 + i77;
                            Object obj3 = objArr2[i96];
                            if (obj3 instanceof Field) {
                                fieldP = (Field) obj3;
                            } else {
                                fieldP = p(cls, (String) obj3);
                                objArr2[i96] = fieldP;
                            }
                            i25 = iCharAt11 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldP);
                        }
                        if (i76 >= 18 || i76 > 49) {
                            i26 = i25;
                            i27 = iObjectFieldOffset;
                        } else {
                            iArr[i63] = iObjectFieldOffset;
                            i26 = i25;
                            i27 = iObjectFieldOffset;
                            i63++;
                        }
                    } else {
                        i28 = 3;
                        i29 = 1;
                        i11 += 2;
                    }
                    objArr[ca.f(i66, i28, i29)] = objArr2[i89];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt9 & 4096) != 0) {
                        i24 = i72;
                        i25 = 0;
                    } else {
                        i24 = i72;
                        i25 = 0;
                    }
                    if (i76 >= 18) {
                        i26 = i25;
                        i27 = iObjectFieldOffset;
                    } else {
                        i26 = i25;
                        i27 = iObjectFieldOffset;
                    }
                }
                i11 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldP4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt9 & 4096) != 0) {
                    i24 = i72;
                    i25 = 0;
                } else {
                    i24 = i72;
                    i25 = 0;
                }
                if (i76 >= 18) {
                    i26 = i25;
                    i27 = iObjectFieldOffset;
                } else {
                    i26 = i25;
                    i27 = iObjectFieldOffset;
                }
            }
            int i97 = i66 + 1;
            iArr2[i66] = i73;
            int i98 = i66 + 2;
            String str2 = str;
            iArr2[i97] = ((iCharAt9 & 512) != 0 ? 536870912 : 0) | ((iCharAt9 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 268435456 : 0) | (i78 != 0 ? Integer.MIN_VALUE : 0) | (i76 << 20) | i27;
            i66 += 3;
            iArr2[i98] = (i26 << 20) | iObjectFieldOffset2;
            str = str2;
            i39 = i24;
            i12 = i77;
            length = i22;
            iArr2 = iArr2;
            objArr3 = objArr;
            i37 = 55296;
        }
        return new m6(iArr2, objArr3, r6Var.f23181a, iArr, i13, y6Var, o4Var);
    }

    public static int k(long j10, Object obj) {
        return ((Integer) d7.h(j10, obj)).intValue();
    }

    public static int l(int i10) {
        return (i10 >>> 20) & 255;
    }

    public static long n(long j10, Object obj) {
        return ((Long) d7.h(j10, obj)).longValue();
    }

    public static Field p(Class cls, String str) {
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

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final void a(Object obj) {
        if (!h(obj)) {
            return;
        }
        if (obj instanceof w5) {
            w5 w5Var = (w5) obj;
            w5Var.d();
            w5Var.zza = 0;
            w5Var.k();
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f23094a;
            if (i10 >= iArr.length) {
                this.f23099f.getClass();
                x6 x6Var = ((w5) obj).zzc;
                if (x6Var.f23274d) {
                    x6Var.f23274d = false;
                    return;
                }
                return;
            }
            int iM = m(i10);
            int i11 = 1048575 & iM;
            int iL = l(iM);
            long j10 = i11;
            if (iL != 9) {
                if (iL != 60 && iL != 68) {
                    switch (iL) {
                        case 17:
                            if (u(i10, obj)) {
                                o(i10).a(f23093h.getObject(obj, j10));
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
                            j5 j5Var = (j5) ((z5) d7.h(j10, obj));
                            if (j5Var.f23059a) {
                                j5Var.f23059a = false;
                            }
                            break;
                        case 50:
                            Unsafe unsafe = f23093h;
                            Object object = unsafe.getObject(obj, j10);
                            if (object != null) {
                                ((i6) object).f23052a = false;
                                unsafe.putObject(obj, j10, object);
                            }
                            break;
                    }
                } else if (i(iArr[i10], i10, obj)) {
                    o(i10).a(f23093h.getObject(obj, j10));
                }
            } else if (u(i10, obj)) {
                o(i10).a(f23093h.getObject(obj, j10));
            }
            i10 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final int b(w5 w5Var) {
        int i10;
        long jDoubleToLongBits;
        int i11;
        int iFloatToIntBits;
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f23094a;
            if (i14 >= iArr.length) {
                w5Var.zzc.getClass();
                return (i15 * 53) + 506991;
            }
            int iM = m(i14);
            int i16 = 1048575 & iM;
            int iL = l(iM);
            int i17 = iArr[i14];
            long j10 = i16;
            int i18 = 1237;
            int iHashCode = 37;
            switch (iL) {
                case 0:
                    i10 = i15 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(d7.f22994c.a(j10, w5Var));
                    Charset charset = a6.f22937a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i11 = i15 * 53;
                    iFloatToIntBits = Float.floatToIntBits(d7.f22994c.b(j10, w5Var));
                    i15 = iFloatToIntBits + i11;
                    break;
                case 2:
                    i10 = i15 * 53;
                    jDoubleToLongBits = d7.f(j10, w5Var);
                    Charset charset2 = a6.f22937a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i10 = i15 * 53;
                    jDoubleToLongBits = d7.f(j10, w5Var);
                    Charset charset3 = a6.f22937a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i11 = i15 * 53;
                    iFloatToIntBits = d7.e(j10, w5Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 5:
                    i10 = i15 * 53;
                    jDoubleToLongBits = d7.f(j10, w5Var);
                    Charset charset4 = a6.f22937a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i11 = i15 * 53;
                    iFloatToIntBits = d7.e(j10, w5Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 7:
                    i12 = i15 * 53;
                    boolean zG = d7.f22994c.g(j10, w5Var);
                    Charset charset5 = a6.f22937a;
                    if (zG) {
                        i18 = 1231;
                    }
                    i15 = i18 + i12;
                    break;
                case 8:
                    i11 = i15 * 53;
                    iFloatToIntBits = ((String) d7.h(j10, w5Var)).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 9:
                    i13 = i15 * 53;
                    Object objH = d7.h(j10, w5Var);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i15 = i13 + iHashCode;
                    break;
                case 10:
                    i11 = i15 * 53;
                    iFloatToIntBits = d7.h(j10, w5Var).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 11:
                    i11 = i15 * 53;
                    iFloatToIntBits = d7.e(j10, w5Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 12:
                    i11 = i15 * 53;
                    iFloatToIntBits = d7.e(j10, w5Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 13:
                    i11 = i15 * 53;
                    iFloatToIntBits = d7.e(j10, w5Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 14:
                    i10 = i15 * 53;
                    jDoubleToLongBits = d7.f(j10, w5Var);
                    Charset charset6 = a6.f22937a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i11 = i15 * 53;
                    iFloatToIntBits = d7.e(j10, w5Var);
                    i15 = iFloatToIntBits + i11;
                    break;
                case 16:
                    i10 = i15 * 53;
                    jDoubleToLongBits = d7.f(j10, w5Var);
                    Charset charset7 = a6.f22937a;
                    i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i13 = i15 * 53;
                    Object objH2 = d7.h(j10, w5Var);
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
                    iFloatToIntBits = d7.h(j10, w5Var).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case 50:
                    i11 = i15 * 53;
                    iFloatToIntBits = d7.h(j10, w5Var).hashCode();
                    i15 = iFloatToIntBits + i11;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) d7.h(j10, w5Var)).doubleValue());
                        Charset charset8 = a6.f22937a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) d7.h(j10, w5Var)).floatValue());
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = n(j10, w5Var);
                        Charset charset9 = a6.f22937a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = n(j10, w5Var);
                        Charset charset10 = a6.f22937a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, w5Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = n(j10, w5Var);
                        Charset charset11 = a6.f22937a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, w5Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i12 = i15 * 53;
                        boolean zBooleanValue = ((Boolean) d7.h(j10, w5Var)).booleanValue();
                        Charset charset12 = a6.f22937a;
                        if (zBooleanValue) {
                            i18 = 1231;
                        }
                        i15 = i18 + i12;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = ((String) d7.h(j10, w5Var)).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 60:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = d7.h(j10, w5Var).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = d7.h(j10, w5Var).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 62:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, w5Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, w5Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 64:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, w5Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 65:
                    if (i(i17, i14, w5Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = n(j10, w5Var);
                        Charset charset13 = a6.f22937a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = k(j10, w5Var);
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
                case 67:
                    if (i(i17, i14, w5Var)) {
                        i10 = i15 * 53;
                        jDoubleToLongBits = n(j10, w5Var);
                        Charset charset14 = a6.f22937a;
                        i15 = i10 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (i(i17, i14, w5Var)) {
                        i11 = i15 * 53;
                        iFloatToIntBits = d7.h(j10, w5Var).hashCode();
                        i15 = iFloatToIntBits + i11;
                    }
                    break;
            }
            i14 += 3;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final boolean c(w5 w5Var, w5 w5Var2) {
        boolean zE;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f23094a;
            if (i10 < iArr.length) {
                int iM = m(i10);
                long j10 = iM & 1048575;
                switch (l(iM)) {
                    case 0:
                        if (t(w5Var, w5Var2, i10)) {
                            c7 c7Var = d7.f22994c;
                            if (Double.doubleToLongBits(c7Var.a(j10, w5Var)) == Double.doubleToLongBits(c7Var.a(j10, w5Var2))) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 1:
                        if (t(w5Var, w5Var2, i10)) {
                            c7 c7Var2 = d7.f22994c;
                            if (Float.floatToIntBits(c7Var2.b(j10, w5Var)) == Float.floatToIntBits(c7Var2.b(j10, w5Var2))) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 2:
                        if (t(w5Var, w5Var2, i10) && d7.f(j10, w5Var) == d7.f(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 3:
                        if (t(w5Var, w5Var2, i10) && d7.f(j10, w5Var) == d7.f(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 4:
                        if (t(w5Var, w5Var2, i10) && d7.e(j10, w5Var) == d7.e(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 5:
                        if (t(w5Var, w5Var2, i10) && d7.f(j10, w5Var) == d7.f(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 6:
                        if (t(w5Var, w5Var2, i10) && d7.e(j10, w5Var) == d7.e(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 7:
                        if (t(w5Var, w5Var2, i10)) {
                            c7 c7Var3 = d7.f22994c;
                            if (c7Var3.g(j10, w5Var) == c7Var3.g(j10, w5Var2)) {
                                continue;
                                i10 += 3;
                            }
                        }
                        break;
                    case 8:
                        if (t(w5Var, w5Var2, i10) && t6.e(d7.h(j10, w5Var), d7.h(j10, w5Var2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 9:
                        if (t(w5Var, w5Var2, i10) && t6.e(d7.h(j10, w5Var), d7.h(j10, w5Var2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 10:
                        if (t(w5Var, w5Var2, i10) && t6.e(d7.h(j10, w5Var), d7.h(j10, w5Var2))) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 11:
                        if (t(w5Var, w5Var2, i10) && d7.e(j10, w5Var) == d7.e(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 12:
                        if (t(w5Var, w5Var2, i10) && d7.e(j10, w5Var) == d7.e(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 13:
                        if (t(w5Var, w5Var2, i10) && d7.e(j10, w5Var) == d7.e(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 14:
                        if (t(w5Var, w5Var2, i10) && d7.f(j10, w5Var) == d7.f(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 15:
                        if (t(w5Var, w5Var2, i10) && d7.e(j10, w5Var) == d7.e(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 16:
                        if (t(w5Var, w5Var2, i10) && d7.f(j10, w5Var) == d7.f(j10, w5Var2)) {
                            continue;
                            i10 += 3;
                        }
                        break;
                    case 17:
                        if (t(w5Var, w5Var2, i10) && t6.e(d7.h(j10, w5Var), d7.h(j10, w5Var2))) {
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
                        zE = t6.e(d7.h(j10, w5Var), d7.h(j10, w5Var2));
                        break;
                    case 50:
                        zE = t6.e(d7.h(j10, w5Var), d7.h(j10, w5Var2));
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
                        if (d7.e(j11, w5Var) == d7.e(j11, w5Var2) && t6.e(d7.h(j10, w5Var), d7.h(j10, w5Var2))) {
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
            } else if (w5Var.zzc.equals(w5Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:117:0x0336  */
    /* JADX WARN: Code duplicated, block: B:122:0x0344  */
    /* JADX WARN: Code duplicated, block: B:123:0x0356  */
    /* JADX WARN: Code duplicated, block: B:124:0x0367  */
    /* JADX WARN: Code duplicated, block: B:126:0x0370  */
    /* JADX WARN: Code duplicated, block: B:128:0x0378  */
    /* JADX WARN: Code duplicated, block: B:129:0x0385  */
    /* JADX WARN: Code duplicated, block: B:130:0x0391  */
    /* JADX WARN: Code duplicated, block: B:132:0x0395  */
    /* JADX WARN: Code duplicated, block: B:134:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:140:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:142:0x03da  */
    /* JADX WARN: Code duplicated, block: B:143:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:145:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:146:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:147:0x0408  */
    /* JADX WARN: Code duplicated, block: B:148:0x040f  */
    /* JADX WARN: Code duplicated, block: B:285:0x033e A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final void d(Object obj, g6 g6Var) throws IOException {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int iJ;
        int iM;
        int i13;
        int i14;
        int i15;
        int i16;
        int iJ2;
        int iM2;
        int i17;
        o5 o5Var = (o5) g6Var.f23023b;
        Unsafe unsafe = f23093h;
        int i18 = 1048575;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            int[] iArr = this.f23094a;
            if (i20 >= iArr.length) {
                x6 x6Var = ((w5) obj).zzc;
                return;
            }
            int iM3 = m(i20);
            int iL = l(iM3);
            int i22 = iArr[i20];
            if (iL <= 17) {
                int i23 = iArr[i20 + 2];
                int i24 = i23 & i18;
                if (i24 != i19) {
                    i21 = i24 == i18 ? 0 : unsafe.getInt(obj, i24);
                    i19 = i24;
                }
                i10 = 1 << (i23 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = iM3 & i18;
            int i25 = 1;
            int i26 = 2;
            switch (iL) {
                case 0:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.u(i22, Double.doubleToRawLongBits(d7.f22994c.a(j10, obj)));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 1:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.s(i22, Float.floatToRawIntBits(d7.f22994c.b(j10, obj)));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 2:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.C(i22, unsafe.getLong(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 3:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.C(i22, unsafe.getLong(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 4:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.w(i22, unsafe.getInt(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 5:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.u(i22, unsafe.getLong(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 6:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.s(i22, unsafe.getInt(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 7:
                    if (v(obj, i20, i19, i21, i10)) {
                        byte bG = d7.f22994c.g(j10, obj);
                        o5Var.l(11);
                        o5Var.o(i22 << 3);
                        byte[] bArr = o5Var.f23153c;
                        int i27 = o5Var.f23155e;
                        bArr[i27] = bG;
                        o5Var.f23155e = i27 + 1;
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 8:
                    if (v(obj, i20, i19, i21, i10)) {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof String) {
                            o5Var.B((i22 << 3) | 2);
                            o5Var.y((String) object);
                        } else {
                            o5Var.q(i22, (n5) object);
                        }
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 9:
                    if (v(obj, i20, i19, i21, i10)) {
                        g6Var.c(i22, unsafe.getObject(obj, j10), o(i20));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 10:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.q(i22, (n5) unsafe.getObject(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 11:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.A(i22, unsafe.getInt(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 12:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.w(i22, unsafe.getInt(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 13:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.s(i22, unsafe.getInt(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 14:
                    if (v(obj, i20, i19, i21, i10)) {
                        o5Var.u(i22, unsafe.getLong(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 15:
                    if (v(obj, i20, i19, i21, i10)) {
                        int i28 = unsafe.getInt(obj, j10);
                        o5Var.A(i22, (i28 >> 31) ^ (i28 + i28));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 16:
                    if (v(obj, i20, i19, i21, i10)) {
                        long j11 = unsafe.getLong(obj, j10);
                        o5Var.C(i22, (j11 >> 63) ^ (j11 + j11));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 17:
                    if (v(obj, i20, i19, i21, i10)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        o5Var.z(i22, 3);
                        o(i20).d((i5) object2, g6Var);
                        o5Var.z(i22, 4);
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 18:
                    i19 = i19;
                    i21 = i21;
                    t6.q(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 19:
                    i19 = i19;
                    i21 = i21;
                    t6.u(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 20:
                    i19 = i19;
                    i21 = i21;
                    t6.w(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 21:
                    i19 = i19;
                    i21 = i21;
                    t6.d(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 22:
                    i19 = i19;
                    i21 = i21;
                    t6.v(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 23:
                    i19 = i19;
                    i21 = i21;
                    t6.t(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 24:
                    i19 = i19;
                    i21 = i21;
                    t6.s(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 25:
                    i19 = i19;
                    i21 = i21;
                    t6.p(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    i11 = i19;
                    i12 = i21;
                    int i29 = iArr[i20];
                    List list = (List) unsafe.getObject(obj, j10);
                    y6 y6Var = t6.f23209a;
                    if (list != null && !list.isEmpty()) {
                        if (list instanceof d6) {
                            d6 d6Var = (d6) list;
                            for (int i30 = 0; i30 < list.size(); i30++) {
                                Object objZza = d6Var.zza();
                                if (objZza instanceof String) {
                                    o5Var.B((i29 << 3) | 2);
                                    o5Var.y((String) objZza);
                                } else {
                                    o5Var.q(i29, (n5) objZza);
                                }
                            }
                        } else {
                            for (int i31 = 0; i31 < list.size(); i31++) {
                                String str = (String) list.get(i31);
                                o5Var.B((i29 << 3) | 2);
                                o5Var.y(str);
                            }
                        }
                    }
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 27:
                    i11 = i19;
                    i12 = i21;
                    int i32 = iArr[i20];
                    List list2 = (List) unsafe.getObject(obj, j10);
                    s6 s6VarO = o(i20);
                    y6 y6Var2 = t6.f23209a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i33 = 0; i33 < list2.size(); i33++) {
                            g6Var.c(i32, list2.get(i33), s6VarO);
                        }
                    }
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    i11 = i19;
                    i12 = i21;
                    int i34 = iArr[i20];
                    List list3 = (List) unsafe.getObject(obj, j10);
                    y6 y6Var3 = t6.f23209a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i35 = 0; i35 < list3.size(); i35++) {
                            o5Var.q(i34, (n5) list3.get(i35));
                        }
                    }
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    z10 = false;
                    t6.c(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    z10 = false;
                    t6.r(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 31:
                    z10 = false;
                    t6.x(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 32:
                    z10 = false;
                    t6.y(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 33:
                    z10 = false;
                    t6.a(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 34:
                    z10 = false;
                    t6.b(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, false);
                    i21 = i21;
                    i19 = i19;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    i11 = i19;
                    i12 = i21;
                    t6.q(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 36:
                    i11 = i19;
                    i12 = i21;
                    t6.u(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 37:
                    i11 = i19;
                    i12 = i21;
                    t6.w(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    i11 = i19;
                    i12 = i21;
                    t6.d(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 39:
                    i11 = i19;
                    i12 = i21;
                    t6.v(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 40:
                    i11 = i19;
                    i12 = i21;
                    t6.t(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 41:
                    i11 = i19;
                    i12 = i21;
                    t6.s(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 42:
                    i11 = i19;
                    i12 = i21;
                    t6.p(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    i11 = i19;
                    i12 = i21;
                    t6.c(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 44:
                    i11 = i19;
                    i12 = i21;
                    t6.r(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 45:
                    i11 = i19;
                    i12 = i21;
                    t6.x(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    i11 = i19;
                    i12 = i21;
                    t6.y(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    i11 = i19;
                    i12 = i21;
                    t6.a(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    i11 = i19;
                    i12 = i21;
                    t6.b(iArr[i20], (List) unsafe.getObject(obj, j10), g6Var, true);
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    i11 = i19;
                    i12 = i21;
                    int i36 = iArr[i20];
                    List list4 = (List) unsafe.getObject(obj, j10);
                    s6 s6VarO2 = o(i20);
                    y6 y6Var4 = t6.f23209a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i37 = 0; i37 < list4.size(); i37++) {
                            i5 i5Var = (i5) list4.get(i37);
                            o5Var.z(i36, 3);
                            s6VarO2.d(i5Var, g6Var);
                            o5Var.z(i36, 4);
                        }
                    }
                    i21 = i12;
                    i19 = i11;
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j10);
                    if (object3 != null) {
                        int i38 = i20 / 3;
                        p pVar = ((h6) this.f23095b[i38 + i38]).f23036a;
                        g7 g7Var = (g7) pVar.f23159b;
                        g7 g7Var2 = (g7) pVar.f23158a;
                        Iterator it = ((i6) object3).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            o5Var.z(i22, i26);
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i39 = s5.f23194c;
                            int i40 = o5.i(8);
                            g7 g7Var3 = g7.f23026e;
                            if (g7Var2 == g7Var3) {
                                i40 += i40;
                            }
                            h7 h7Var = h7.f23037a;
                            int i41 = i19;
                            switch (g7Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iJ = 8;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key2);
                                            s5.b(o5Var, g7Var, 2, value2);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key3 = entry.getKey();
                                            Object value3 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key3);
                                            s5.b(o5Var, g7Var, 2, value3);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key4 = entry.getKey();
                                            Object value4 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key4);
                                            s5.b(o5Var, g7Var, 2, value4);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key5 = entry.getKey();
                                            Object value5 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key5);
                                            s5.b(o5Var, g7Var, 2, value5);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key6 = entry.getKey();
                                            Object value6 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key6);
                                            s5.b(o5Var, g7Var, 2, value6);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key7 = entry.getKey();
                                            Object value7 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key7);
                                            s5.b(o5Var, g7Var, 2, value7);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key8 = entry.getKey();
                                            Object value8 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key8);
                                            s5.b(o5Var, g7Var, 2, value8);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key9 = entry.getKey();
                                            Object value9 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key9);
                                            s5.b(o5Var, g7Var, 2, value9);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key10 = entry.getKey();
                                            Object value10 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key10);
                                            s5.b(o5Var, g7Var, 2, value10);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11 = entry.getKey();
                                            Object value11 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11);
                                            s5.b(o5Var, g7Var, 2, value11);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key12 = entry.getKey();
                                            Object value12 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key12);
                                            s5.b(o5Var, g7Var, 2, value12);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key13 = entry.getKey();
                                            Object value13 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key13);
                                            s5.b(o5Var, g7Var, 2, value13);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key14 = entry.getKey();
                                            Object value14 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key14);
                                            s5.b(o5Var, g7Var, 2, value14);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key15 = entry.getKey();
                                            Object value15 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key15);
                                            s5.b(o5Var, g7Var, 2, value15);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key16 = entry.getKey();
                                            Object value16 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key16);
                                            s5.b(o5Var, g7Var, 2, value16);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key17 = entry.getKey();
                                            Object value17 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key17);
                                            s5.b(o5Var, g7Var, 2, value17);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue >> 31) ^ (iIntValue + iIntValue));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key18 = entry.getKey();
                                            Object value18 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key18);
                                            s5.b(o5Var, g7Var, 2, value18);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue + jLongValue) ^ (jLongValue >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key19 = entry.getKey();
                                            Object value19 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key19);
                                            s5.b(o5Var, g7Var, 2, value19);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iJ = 4;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key110 = entry.getKey();
                                            Object value110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key110);
                                            s5.b(o5Var, g7Var, 2, value110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111 = entry.getKey();
                                            Object value111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111);
                                            s5.b(o5Var, g7Var, 2, value111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key112 = entry.getKey();
                                            Object value112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key112);
                                            s5.b(o5Var, g7Var, 2, value112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key113 = entry.getKey();
                                            Object value113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key113);
                                            s5.b(o5Var, g7Var, 2, value113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key114 = entry.getKey();
                                            Object value114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key114);
                                            s5.b(o5Var, g7Var, 2, value114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key115 = entry.getKey();
                                            Object value115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key115);
                                            s5.b(o5Var, g7Var, 2, value115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key116 = entry.getKey();
                                            Object value116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key116);
                                            s5.b(o5Var, g7Var, 2, value116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key117 = entry.getKey();
                                            Object value117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key117);
                                            s5.b(o5Var, g7Var, 2, value117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key118 = entry.getKey();
                                            Object value118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key118);
                                            s5.b(o5Var, g7Var, 2, value118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key119 = entry.getKey();
                                            Object value119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key119);
                                            s5.b(o5Var, g7Var, 2, value119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1110 = entry.getKey();
                                            Object value1110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1110);
                                            s5.b(o5Var, g7Var, 2, value1110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111 = entry.getKey();
                                            Object value1111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111);
                                            s5.b(o5Var, g7Var, 2, value1111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1112 = entry.getKey();
                                            Object value1112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1112);
                                            s5.b(o5Var, g7Var, 2, value1112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1113 = entry.getKey();
                                            Object value1113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1113);
                                            s5.b(o5Var, g7Var, 2, value1113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1114 = entry.getKey();
                                            Object value1114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1114);
                                            s5.b(o5Var, g7Var, 2, value1114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1115 = entry.getKey();
                                            Object value1115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1115);
                                            s5.b(o5Var, g7Var, 2, value1115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1116 = entry.getKey();
                                            Object value1116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1116);
                                            s5.b(o5Var, g7Var, 2, value1116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1117 = entry.getKey();
                                            Object value1117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1117);
                                            s5.b(o5Var, g7Var, 2, value1117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    i21 = i21;
                                    it = it;
                                    iJ = o5.j(((Long) key).longValue());
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1118 = entry.getKey();
                                            Object value1118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1118);
                                            s5.b(o5Var, g7Var, 2, value1118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1119 = entry.getKey();
                                            Object value1119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1119);
                                            s5.b(o5Var, g7Var, 2, value1119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11110 = entry.getKey();
                                            Object value11110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11110);
                                            s5.b(o5Var, g7Var, 2, value11110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111 = entry.getKey();
                                            Object value11111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111);
                                            s5.b(o5Var, g7Var, 2, value11111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11112 = entry.getKey();
                                            Object value11112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11112);
                                            s5.b(o5Var, g7Var, 2, value11112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11113 = entry.getKey();
                                            Object value11113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11113);
                                            s5.b(o5Var, g7Var, 2, value11113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11114 = entry.getKey();
                                            Object value11114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11114);
                                            s5.b(o5Var, g7Var, 2, value11114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11115 = entry.getKey();
                                            Object value11115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11115);
                                            s5.b(o5Var, g7Var, 2, value11115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11116 = entry.getKey();
                                            Object value11116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11116);
                                            s5.b(o5Var, g7Var, 2, value11116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11117 = entry.getKey();
                                            Object value11117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11117);
                                            s5.b(o5Var, g7Var, 2, value11117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11118 = entry.getKey();
                                            Object value11118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11118);
                                            s5.b(o5Var, g7Var, 2, value11118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11119 = entry.getKey();
                                            Object value11119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11119);
                                            s5.b(o5Var, g7Var, 2, value11119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111110 = entry.getKey();
                                            Object value111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111110);
                                            s5.b(o5Var, g7Var, 2, value111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111 = entry.getKey();
                                            Object value111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111);
                                            s5.b(o5Var, g7Var, 2, value111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111112 = entry.getKey();
                                            Object value111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111112);
                                            s5.b(o5Var, g7Var, 2, value111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111113 = entry.getKey();
                                            Object value111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111113);
                                            s5.b(o5Var, g7Var, 2, value111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111114 = entry.getKey();
                                            Object value111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111114);
                                            s5.b(o5Var, g7Var, 2, value111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111115 = entry.getKey();
                                            Object value111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111115);
                                            s5.b(o5Var, g7Var, 2, value111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    i21 = i21;
                                    it = it;
                                    iJ = o5.j(((Long) key).longValue());
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111116 = entry.getKey();
                                            Object value111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111116);
                                            s5.b(o5Var, g7Var, 2, value111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111117 = entry.getKey();
                                            Object value111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111117);
                                            s5.b(o5Var, g7Var, 2, value111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111118 = entry.getKey();
                                            Object value111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111118);
                                            s5.b(o5Var, g7Var, 2, value111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111119 = entry.getKey();
                                            Object value111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111119);
                                            s5.b(o5Var, g7Var, 2, value111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111110 = entry.getKey();
                                            Object value1111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111110);
                                            s5.b(o5Var, g7Var, 2, value1111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111 = entry.getKey();
                                            Object value1111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111);
                                            s5.b(o5Var, g7Var, 2, value1111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111112 = entry.getKey();
                                            Object value1111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111112);
                                            s5.b(o5Var, g7Var, 2, value1111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111113 = entry.getKey();
                                            Object value1111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111113);
                                            s5.b(o5Var, g7Var, 2, value1111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111114 = entry.getKey();
                                            Object value1111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111114);
                                            s5.b(o5Var, g7Var, 2, value1111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111115 = entry.getKey();
                                            Object value1111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111115);
                                            s5.b(o5Var, g7Var, 2, value1111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111116 = entry.getKey();
                                            Object value1111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111116);
                                            s5.b(o5Var, g7Var, 2, value1111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111117 = entry.getKey();
                                            Object value1111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111117);
                                            s5.b(o5Var, g7Var, 2, value1111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111118 = entry.getKey();
                                            Object value1111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111118);
                                            s5.b(o5Var, g7Var, 2, value1111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111119 = entry.getKey();
                                            Object value1111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111119);
                                            s5.b(o5Var, g7Var, 2, value1111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111110 = entry.getKey();
                                            Object value11111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111110);
                                            s5.b(o5Var, g7Var, 2, value11111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111 = entry.getKey();
                                            Object value11111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111);
                                            s5.b(o5Var, g7Var, 2, value11111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111112 = entry.getKey();
                                            Object value11111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111112);
                                            s5.b(o5Var, g7Var, 2, value11111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue4 + jLongValue4) ^ (jLongValue4 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111113 = entry.getKey();
                                            Object value11111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111113);
                                            s5.b(o5Var, g7Var, 2, value11111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    i21 = i21;
                                    it = it;
                                    iJ = o5.j(((Integer) key).intValue());
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111114 = entry.getKey();
                                            Object value11111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111114);
                                            s5.b(o5Var, g7Var, 2, value11111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111115 = entry.getKey();
                                            Object value11111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111115);
                                            s5.b(o5Var, g7Var, 2, value11111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111116 = entry.getKey();
                                            Object value11111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111116);
                                            s5.b(o5Var, g7Var, 2, value11111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111117 = entry.getKey();
                                            Object value11111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111117);
                                            s5.b(o5Var, g7Var, 2, value11111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111118 = entry.getKey();
                                            Object value11111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111118);
                                            s5.b(o5Var, g7Var, 2, value11111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111119 = entry.getKey();
                                            Object value11111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111119);
                                            s5.b(o5Var, g7Var, 2, value11111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111110 = entry.getKey();
                                            Object value111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111110);
                                            s5.b(o5Var, g7Var, 2, value111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111 = entry.getKey();
                                            Object value111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111112 = entry.getKey();
                                            Object value111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111112);
                                            s5.b(o5Var, g7Var, 2, value111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111113 = entry.getKey();
                                            Object value111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111113);
                                            s5.b(o5Var, g7Var, 2, value111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111114 = entry.getKey();
                                            Object value111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111114);
                                            s5.b(o5Var, g7Var, 2, value111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111115 = entry.getKey();
                                            Object value111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111115);
                                            s5.b(o5Var, g7Var, 2, value111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111116 = entry.getKey();
                                            Object value111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111116);
                                            s5.b(o5Var, g7Var, 2, value111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111117 = entry.getKey();
                                            Object value111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111117);
                                            s5.b(o5Var, g7Var, 2, value111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111118 = entry.getKey();
                                            Object value111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111118);
                                            s5.b(o5Var, g7Var, 2, value111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111119 = entry.getKey();
                                            Object value111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111119);
                                            s5.b(o5Var, g7Var, 2, value111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111110 = entry.getKey();
                                            Object value1111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111110);
                                            s5.b(o5Var, g7Var, 2, value1111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue5 + jLongValue5) ^ (jLongValue5 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111 = entry.getKey();
                                            Object value1111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111);
                                            s5.b(o5Var, g7Var, 2, value1111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iJ = 8;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111112 = entry.getKey();
                                            Object value1111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111112);
                                            s5.b(o5Var, g7Var, 2, value1111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111113 = entry.getKey();
                                            Object value1111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111113);
                                            s5.b(o5Var, g7Var, 2, value1111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111114 = entry.getKey();
                                            Object value1111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111114);
                                            s5.b(o5Var, g7Var, 2, value1111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111115 = entry.getKey();
                                            Object value1111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111115);
                                            s5.b(o5Var, g7Var, 2, value1111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111116 = entry.getKey();
                                            Object value1111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111116);
                                            s5.b(o5Var, g7Var, 2, value1111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111117 = entry.getKey();
                                            Object value1111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111117);
                                            s5.b(o5Var, g7Var, 2, value1111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111118 = entry.getKey();
                                            Object value1111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111118);
                                            s5.b(o5Var, g7Var, 2, value1111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111119 = entry.getKey();
                                            Object value1111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111119);
                                            s5.b(o5Var, g7Var, 2, value1111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111110 = entry.getKey();
                                            Object value11111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111110);
                                            s5.b(o5Var, g7Var, 2, value11111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111 = entry.getKey();
                                            Object value11111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111);
                                            s5.b(o5Var, g7Var, 2, value11111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111112 = entry.getKey();
                                            Object value11111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111112);
                                            s5.b(o5Var, g7Var, 2, value11111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111113 = entry.getKey();
                                            Object value11111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111113);
                                            s5.b(o5Var, g7Var, 2, value11111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111114 = entry.getKey();
                                            Object value11111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111114);
                                            s5.b(o5Var, g7Var, 2, value11111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111115 = entry.getKey();
                                            Object value11111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111115);
                                            s5.b(o5Var, g7Var, 2, value11111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111116 = entry.getKey();
                                            Object value11111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111116);
                                            s5.b(o5Var, g7Var, 2, value11111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111117 = entry.getKey();
                                            Object value11111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111117);
                                            s5.b(o5Var, g7Var, 2, value11111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111118 = entry.getKey();
                                            Object value11111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111118);
                                            s5.b(o5Var, g7Var, 2, value11111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue6 + jLongValue6) ^ (jLongValue6 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111119 = entry.getKey();
                                            Object value11111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111119);
                                            s5.b(o5Var, g7Var, 2, value11111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iJ = 4;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111110 = entry.getKey();
                                            Object value111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111110);
                                            s5.b(o5Var, g7Var, 2, value111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111 = entry.getKey();
                                            Object value111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111112 = entry.getKey();
                                            Object value111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111112);
                                            s5.b(o5Var, g7Var, 2, value111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111113 = entry.getKey();
                                            Object value111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111113);
                                            s5.b(o5Var, g7Var, 2, value111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111114 = entry.getKey();
                                            Object value111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111114);
                                            s5.b(o5Var, g7Var, 2, value111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111115 = entry.getKey();
                                            Object value111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111115);
                                            s5.b(o5Var, g7Var, 2, value111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111116 = entry.getKey();
                                            Object value111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111116);
                                            s5.b(o5Var, g7Var, 2, value111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111117 = entry.getKey();
                                            Object value111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111117);
                                            s5.b(o5Var, g7Var, 2, value111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111118 = entry.getKey();
                                            Object value111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111118);
                                            s5.b(o5Var, g7Var, 2, value111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111119 = entry.getKey();
                                            Object value111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111119);
                                            s5.b(o5Var, g7Var, 2, value111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111110 = entry.getKey();
                                            Object value1111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111110);
                                            s5.b(o5Var, g7Var, 2, value1111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111 = entry.getKey();
                                            Object value1111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111);
                                            s5.b(o5Var, g7Var, 2, value1111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111112 = entry.getKey();
                                            Object value1111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111112);
                                            s5.b(o5Var, g7Var, 2, value1111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111113 = entry.getKey();
                                            Object value1111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111113);
                                            s5.b(o5Var, g7Var, 2, value1111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111114 = entry.getKey();
                                            Object value1111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111114);
                                            s5.b(o5Var, g7Var, 2, value1111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111115 = entry.getKey();
                                            Object value1111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111115);
                                            s5.b(o5Var, g7Var, 2, value1111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111116 = entry.getKey();
                                            Object value1111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111116);
                                            s5.b(o5Var, g7Var, 2, value1111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue7 + jLongValue7) ^ (jLongValue7 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111117 = entry.getKey();
                                            Object value1111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111117);
                                            s5.b(o5Var, g7Var, 2, value1111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    i21 = i21;
                                    it = it;
                                    ((Boolean) key).getClass();
                                    iJ = i25;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111118 = entry.getKey();
                                            Object value1111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111118);
                                            s5.b(o5Var, g7Var, 2, value1111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111119 = entry.getKey();
                                            Object value1111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111119);
                                            s5.b(o5Var, g7Var, 2, value1111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111110 = entry.getKey();
                                            Object value11111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111110);
                                            s5.b(o5Var, g7Var, 2, value11111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111 = entry.getKey();
                                            Object value11111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111);
                                            s5.b(o5Var, g7Var, 2, value11111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111112 = entry.getKey();
                                            Object value11111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111112);
                                            s5.b(o5Var, g7Var, 2, value11111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111113 = entry.getKey();
                                            Object value11111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111113);
                                            s5.b(o5Var, g7Var, 2, value11111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111114 = entry.getKey();
                                            Object value11111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111114);
                                            s5.b(o5Var, g7Var, 2, value11111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111115 = entry.getKey();
                                            Object value11111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111115);
                                            s5.b(o5Var, g7Var, 2, value11111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111116 = entry.getKey();
                                            Object value11111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111116);
                                            s5.b(o5Var, g7Var, 2, value11111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111117 = entry.getKey();
                                            Object value11111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111117);
                                            s5.b(o5Var, g7Var, 2, value11111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111118 = entry.getKey();
                                            Object value11111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111118);
                                            s5.b(o5Var, g7Var, 2, value11111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111119 = entry.getKey();
                                            Object value11111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111119);
                                            s5.b(o5Var, g7Var, 2, value11111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111110 = entry.getKey();
                                            Object value111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111110);
                                            s5.b(o5Var, g7Var, 2, value111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111 = entry.getKey();
                                            Object value111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111112 = entry.getKey();
                                            Object value111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111112);
                                            s5.b(o5Var, g7Var, 2, value111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111113 = entry.getKey();
                                            Object value111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111113);
                                            s5.b(o5Var, g7Var, 2, value111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111114 = entry.getKey();
                                            Object value111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111114);
                                            s5.b(o5Var, g7Var, 2, value111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue8 + jLongValue8) ^ (jLongValue8 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111115 = entry.getKey();
                                            Object value111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111115);
                                            s5.b(o5Var, g7Var, 2, value111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    i21 = i21;
                                    it = it;
                                    if (key instanceof n5) {
                                        iM = ((n5) key).m();
                                        i13 = o5.i(iM);
                                        iJ = iM + i13;
                                    } else {
                                        iJ = o5.h((String) key);
                                    }
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111116 = entry.getKey();
                                            Object value111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111116);
                                            s5.b(o5Var, g7Var, 2, value111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111117 = entry.getKey();
                                            Object value111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111117);
                                            s5.b(o5Var, g7Var, 2, value111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111118 = entry.getKey();
                                            Object value111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111118);
                                            s5.b(o5Var, g7Var, 2, value111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111119 = entry.getKey();
                                            Object value111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111119);
                                            s5.b(o5Var, g7Var, 2, value111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111110 = entry.getKey();
                                            Object value1111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111110);
                                            s5.b(o5Var, g7Var, 2, value1111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111 = entry.getKey();
                                            Object value1111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111112 = entry.getKey();
                                            Object value1111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111112);
                                            s5.b(o5Var, g7Var, 2, value1111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111113 = entry.getKey();
                                            Object value1111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111113);
                                            s5.b(o5Var, g7Var, 2, value1111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111114 = entry.getKey();
                                            Object value1111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111114);
                                            s5.b(o5Var, g7Var, 2, value1111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111115 = entry.getKey();
                                            Object value1111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111115);
                                            s5.b(o5Var, g7Var, 2, value1111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111116 = entry.getKey();
                                            Object value1111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111116);
                                            s5.b(o5Var, g7Var, 2, value1111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111117 = entry.getKey();
                                            Object value1111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111117);
                                            s5.b(o5Var, g7Var, 2, value1111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111118 = entry.getKey();
                                            Object value1111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111118);
                                            s5.b(o5Var, g7Var, 2, value1111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111119 = entry.getKey();
                                            Object value1111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111119);
                                            s5.b(o5Var, g7Var, 2, value1111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111110 = entry.getKey();
                                            Object value11111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111110);
                                            s5.b(o5Var, g7Var, 2, value11111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111 = entry.getKey();
                                            Object value11111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111112 = entry.getKey();
                                            Object value11111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111112);
                                            s5.b(o5Var, g7Var, 2, value11111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue9 + jLongValue9) ^ (jLongValue9 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111113 = entry.getKey();
                                            Object value11111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111113);
                                            s5.b(o5Var, g7Var, 2, value11111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    i21 = i21;
                                    it = it;
                                    iJ = ((i5) key).c();
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111114 = entry.getKey();
                                            Object value11111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111114);
                                            s5.b(o5Var, g7Var, 2, value11111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111115 = entry.getKey();
                                            Object value11111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111115);
                                            s5.b(o5Var, g7Var, 2, value11111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111116 = entry.getKey();
                                            Object value11111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111116);
                                            s5.b(o5Var, g7Var, 2, value11111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111117 = entry.getKey();
                                            Object value11111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111117);
                                            s5.b(o5Var, g7Var, 2, value11111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111118 = entry.getKey();
                                            Object value11111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111118);
                                            s5.b(o5Var, g7Var, 2, value11111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111119 = entry.getKey();
                                            Object value11111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111119);
                                            s5.b(o5Var, g7Var, 2, value11111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111110 = entry.getKey();
                                            Object value111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111 = entry.getKey();
                                            Object value111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111112 = entry.getKey();
                                            Object value111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111113 = entry.getKey();
                                            Object value111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111114 = entry.getKey();
                                            Object value111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111115 = entry.getKey();
                                            Object value111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111116 = entry.getKey();
                                            Object value111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111117 = entry.getKey();
                                            Object value111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111118 = entry.getKey();
                                            Object value111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111119 = entry.getKey();
                                            Object value111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111110 = entry.getKey();
                                            Object value1111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue10 + jLongValue10) ^ (jLongValue10 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111 = entry.getKey();
                                            Object value1111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    i21 = i21;
                                    it = it;
                                    iM = ((i5) key).c();
                                    i13 = o5.i(iM);
                                    iJ = iM + i13;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111112 = entry.getKey();
                                            Object value1111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111113 = entry.getKey();
                                            Object value1111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111114 = entry.getKey();
                                            Object value1111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111115 = entry.getKey();
                                            Object value1111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111116 = entry.getKey();
                                            Object value1111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111117 = entry.getKey();
                                            Object value1111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111118 = entry.getKey();
                                            Object value1111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111119 = entry.getKey();
                                            Object value1111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111110 = entry.getKey();
                                            Object value11111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111 = entry.getKey();
                                            Object value11111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111112 = entry.getKey();
                                            Object value11111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111113 = entry.getKey();
                                            Object value11111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111114 = entry.getKey();
                                            Object value11111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111115 = entry.getKey();
                                            Object value11111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111116 = entry.getKey();
                                            Object value11111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111117 = entry.getKey();
                                            Object value11111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111118 = entry.getKey();
                                            Object value11111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue11 + jLongValue11) ^ (jLongValue11 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111119 = entry.getKey();
                                            Object value11111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    i21 = i21;
                                    it = it;
                                    if (key instanceof n5) {
                                        iM = ((n5) key).m();
                                        i13 = o5.i(iM);
                                    } else {
                                        iM = ((byte[]) key).length;
                                        i13 = o5.i(iM);
                                    }
                                    iJ = iM + i13;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111110 = entry.getKey();
                                            Object value111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111112 = entry.getKey();
                                            Object value111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111113 = entry.getKey();
                                            Object value111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111114 = entry.getKey();
                                            Object value111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111115 = entry.getKey();
                                            Object value111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111116 = entry.getKey();
                                            Object value111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111117 = entry.getKey();
                                            Object value111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111118 = entry.getKey();
                                            Object value111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111119 = entry.getKey();
                                            Object value111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue12 + jLongValue12) ^ (jLongValue12 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    i21 = i21;
                                    it = it;
                                    iJ = o5.i(((Integer) key).intValue());
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue13 + jLongValue13) ^ (jLongValue13 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    i21 = i21;
                                    it = it;
                                    iJ = o5.j(((Integer) key).intValue());
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue14 + jLongValue14) ^ (jLongValue14 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iJ = 4;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue15 + jLongValue15) ^ (jLongValue15 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iJ = 8;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue16 + jLongValue16) ^ (jLongValue16 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    i14 = o5.i((iIntValue17 + iIntValue17) ^ (iIntValue17 >> 31));
                                    i21 = i21;
                                    it = it;
                                    iJ = i14;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111116 = entry.getKey();
                                            Object value111111111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111117 = entry.getKey();
                                            Object value111111111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111118 = entry.getKey();
                                            Object value111111111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111119 = entry.getKey();
                                            Object value111111111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111110 = entry.getKey();
                                            Object value1111111111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111111 = entry.getKey();
                                            Object value1111111111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111112 = entry.getKey();
                                            Object value1111111111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111113 = entry.getKey();
                                            Object value1111111111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111114 = entry.getKey();
                                            Object value1111111111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111115 = entry.getKey();
                                            Object value1111111111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111116 = entry.getKey();
                                            Object value1111111111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue17 + jLongValue17) ^ (jLongValue17 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111117 = entry.getKey();
                                            Object value1111111111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    i14 = o5.j((jLongValue18 + jLongValue18) ^ (jLongValue18 >> 63));
                                    i21 = i21;
                                    it = it;
                                    iJ = i14;
                                    i15 = iJ + i40;
                                    i16 = o5.i(16);
                                    if (g7Var == g7Var3) {
                                        i16 += i16;
                                    }
                                    switch (g7Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111118 = entry.getKey();
                                            Object value1111111111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key1111111111111111111111111111119 = entry.getKey();
                                            Object value1111111111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key1111111111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value1111111111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 2:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111110 = entry.getKey();
                                            Object value11111111111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 3:
                                            iJ2 = o5.j(((Long) value).longValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111111 = entry.getKey();
                                            Object value11111111111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 4:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111112 = entry.getKey();
                                            Object value11111111111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111113 = entry.getKey();
                                            Object value11111111111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111114 = entry.getKey();
                                            Object value11111111111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ2 = i25;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111115 = entry.getKey();
                                            Object value11111111111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                                iJ2 = iM2 + i17;
                                            } else {
                                                iJ2 = o5.h((String) value);
                                            }
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111116 = entry.getKey();
                                            Object value11111111111111111111111111111116 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111116);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111116);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 9:
                                            iJ2 = ((i5) value).c();
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111117 = entry.getKey();
                                            Object value11111111111111111111111111111117 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111117);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111117);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i17 = o5.i(iM2);
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111118 = entry.getKey();
                                            Object value11111111111111111111111111111118 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111118);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111118);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i17 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i17 = o5.i(iM2);
                                            }
                                            iJ2 = iM2 + i17;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key11111111111111111111111111111119 = entry.getKey();
                                            Object value11111111111111111111111111111119 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key11111111111111111111111111111119);
                                            s5.b(o5Var, g7Var, 2, value11111111111111111111111111111119);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 12:
                                            iJ2 = o5.i(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111111110 = entry.getKey();
                                            Object value111111111111111111111111111111110 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111111110);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111111110);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 13:
                                            iJ2 = o5.j(((Integer) value).intValue());
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111111111 = entry.getKey();
                                            Object value111111111111111111111111111111111 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111111111);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111111111);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ2 = 4;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111111112 = entry.getKey();
                                            Object value111111111111111111111111111111112 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111111112);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111111112);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ2 = 8;
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111111113 = entry.getKey();
                                            Object value111111111111111111111111111111113 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111111113);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111111113);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iJ2 = o5.i((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111111114 = entry.getKey();
                                            Object value111111111111111111111111111111114 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111111114);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111111114);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iJ2 = o5.j((jLongValue19 + jLongValue19) ^ (jLongValue19 >> 63));
                                            o5Var.B(iJ2 + i16 + i15);
                                            Object key111111111111111111111111111111115 = entry.getKey();
                                            Object value111111111111111111111111111111115 = entry.getValue();
                                            s5.b(o5Var, g7Var2, i25, key111111111111111111111111111111115);
                                            s5.b(o5Var, g7Var, 2, value111111111111111111111111111111115);
                                            i26 = 2;
                                            i21 = i21;
                                            i19 = i41;
                                            it = it;
                                            i25 = 1;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.u(i22, Double.doubleToRawLongBits(((Double) d7.h(j10, obj)).doubleValue()));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.s(i22, Float.floatToRawIntBits(((Float) d7.h(j10, obj)).floatValue()));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.C(i22, n(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.C(i22, n(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.w(i22, k(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.u(i22, n(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.s(i22, k(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (i(i22, i20, obj)) {
                        byte bBooleanValue = ((Boolean) d7.h(j10, obj)).booleanValue();
                        o5Var.l(11);
                        o5Var.o(i22 << 3);
                        byte[] bArr2 = o5Var.f23153c;
                        int i42 = o5Var.f23155e;
                        bArr2[i42] = bBooleanValue;
                        o5Var.f23155e = i42 + 1;
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (i(i22, i20, obj)) {
                        Object object4 = unsafe.getObject(obj, j10);
                        if (object4 instanceof String) {
                            o5Var.B((i22 << 3) | 2);
                            o5Var.y((String) object4);
                        } else {
                            o5Var.q(i22, (n5) object4);
                        }
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 60:
                    if (i(i22, i20, obj)) {
                        g6Var.c(i22, unsafe.getObject(obj, j10), o(i20));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.q(i22, (n5) unsafe.getObject(obj, j10));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 62:
                    if (i(i22, i20, obj)) {
                        o5Var.A(i22, k(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (i(i22, i20, obj)) {
                        o5Var.w(i22, k(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 64:
                    if (i(i22, i20, obj)) {
                        o5Var.s(i22, k(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 65:
                    if (i(i22, i20, obj)) {
                        o5Var.u(i22, n(j10, obj));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 66:
                    if (i(i22, i20, obj)) {
                        int iK = k(j10, obj);
                        o5Var.A(i22, (iK >> 31) ^ (iK + iK));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 67:
                    if (i(i22, i20, obj)) {
                        long jN = n(j10, obj);
                        o5Var.C(i22, (jN >> 63) ^ (jN + jN));
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                case 68:
                    if (i(i22, i20, obj)) {
                        Object object5 = unsafe.getObject(obj, j10);
                        o5Var.z(i22, 3);
                        o(i20).d((i5) object5, g6Var);
                        o5Var.z(i22, 4);
                    }
                    i20 += 3;
                    i18 = 1048575;
                    break;
                default:
                    i20 += 3;
                    i18 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final void e(Object obj, Object obj2) {
        Object obj3;
        if (!h(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.f23094a;
            if (i10 >= iArr.length) {
                t6.o(obj, obj2);
                return;
            }
            int iM = m(i10);
            int i11 = iM & 1048575;
            int iL = l(iM);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iL) {
                case 0:
                    if (!u(i10, obj2)) {
                        obj3 = obj;
                    } else {
                        c7 c7Var = d7.f22994c;
                        obj3 = obj;
                        c7Var.e(obj3, j10, c7Var.a(j10, obj2));
                        s(i10, obj3);
                    }
                    break;
                case 1:
                    if (u(i10, obj2)) {
                        c7 c7Var2 = d7.f22994c;
                        c7Var2.f(obj, j10, c7Var2.b(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (u(i10, obj2)) {
                        d7.k(obj, j10, d7.f(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (u(i10, obj2)) {
                        d7.k(obj, j10, d7.f(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (u(i10, obj2)) {
                        d7.j(d7.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (u(i10, obj2)) {
                        d7.k(obj, j10, d7.f(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (u(i10, obj2)) {
                        d7.j(d7.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (u(i10, obj2)) {
                        c7 c7Var3 = d7.f22994c;
                        c7Var3.c(obj, j10, c7Var3.g(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (u(i10, obj2)) {
                        d7.l(obj, j10, d7.h(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    q(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (u(i10, obj2)) {
                        d7.l(obj, j10, d7.h(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (u(i10, obj2)) {
                        d7.j(d7.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (u(i10, obj2)) {
                        d7.j(d7.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (u(i10, obj2)) {
                        d7.j(d7.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (u(i10, obj2)) {
                        d7.k(obj, j10, d7.f(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (u(i10, obj2)) {
                        d7.j(d7.e(j10, obj2), j10, obj);
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (u(i10, obj2)) {
                        d7.k(obj, j10, d7.f(j10, obj2));
                        s(i10, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    q(i10, obj, obj2);
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
                    z5 z5VarF = (z5) d7.h(j10, obj);
                    z5 z5Var = (z5) d7.h(j10, obj2);
                    int size = z5VarF.size();
                    int size2 = z5Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((j5) z5VarF).f23059a) {
                            z5VarF = z5VarF.f(size2 + size);
                        }
                        z5VarF.addAll(z5Var);
                    }
                    if (size > 0) {
                        z5Var = z5VarF;
                    }
                    d7.l(obj, j10, z5Var);
                    obj3 = obj;
                    break;
                case 50:
                    y6 y6Var = t6.f23209a;
                    i6 i6Var = (i6) d7.h(j10, obj);
                    i6 i6Var2 = (i6) d7.h(j10, obj2);
                    if (!i6Var2.isEmpty()) {
                        if (!i6Var.f23052a) {
                            if (i6Var.isEmpty()) {
                                i6Var = new i6();
                            } else {
                                i6 i6Var3 = new i6(i6Var);
                                i6Var3.f23052a = true;
                                i6Var = i6Var3;
                            }
                        }
                        i6Var.g();
                        if (!i6Var2.isEmpty()) {
                            i6Var.putAll(i6Var2);
                        }
                    }
                    d7.l(obj, j10, i6Var);
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
                    if (i(i12, i10, obj2)) {
                        d7.l(obj, j10, d7.h(j10, obj2));
                        d7.j(i12, iArr[i10 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    r(i10, obj, obj2);
                    obj3 = obj;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                case 62:
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (i(i12, i10, obj2)) {
                        d7.l(obj, j10, d7.h(j10, obj2));
                        d7.j(i12, iArr[i10 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    r(i10, obj, obj2);
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

    /* JADX WARN: Code duplicated, block: B:123:0x0355  */
    /* JADX WARN: Code duplicated, block: B:128:0x0363  */
    /* JADX WARN: Code duplicated, block: B:129:0x0374  */
    /* JADX WARN: Code duplicated, block: B:130:0x0385  */
    /* JADX WARN: Code duplicated, block: B:132:0x038e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0397  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:141:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:143:0x03db  */
    /* JADX WARN: Code duplicated, block: B:145:0x03df  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:147:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:148:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:150:0x0405  */
    /* JADX WARN: Code duplicated, block: B:151:0x0411  */
    /* JADX WARN: Code duplicated, block: B:152:0x041c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0427  */
    /* JADX WARN: Code duplicated, block: B:154:0x042e  */
    /* JADX WARN: Code duplicated, block: B:209:0x0642 A[PHI: r21 r22
  0x0642: PHI (r21v21 int) = (r21v3 int), (r21v4 int), (r21v10 int), (r21v12 int), (r21v13 int), (r21v14 int), (r21v18 int), (r21v22 int) binds: [B:273:0x080f, B:269:0x07ef, B:243:0x074a, B:229:0x06e1, B:225:0x06c1, B:221:0x06a3, B:214:0x0663, B:208:0x0640] A[DONT_GENERATE, DONT_INLINE]
  0x0642: PHI (r22v20 int) = (r22v3 int), (r22v4 int), (r22v10 int), (r22v12 int), (r22v13 int), (r22v14 int), (r22v17 int), (r22v21 int) binds: [B:273:0x080f, B:269:0x07ef, B:243:0x074a, B:229:0x06e1, B:225:0x06c1, B:221:0x06a3, B:214:0x0663, B:208:0x0640] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:263:0x07b1 A[PHI: r21 r22
  0x07b1: PHI (r21v8 int) = (r21v2 int), (r21v9 int) binds: [B:277:0x082f, B:262:0x07af] A[DONT_GENERATE, DONT_INLINE]
  0x07b1: PHI (r22v8 int) = (r22v2 int), (r22v9 int) binds: [B:277:0x082f, B:262:0x07af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:349:0x035d A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final int f(i5 i5Var) {
        int i10;
        int i11;
        int i12;
        int iJ;
        int iB;
        int iH;
        int i13;
        int i14;
        int i15;
        int size;
        int iN;
        int i16;
        int i17;
        int i18;
        int iB2;
        int iX;
        int iJ2;
        int iM;
        int i19;
        int i20;
        int i21;
        int iJ3;
        int iM2;
        int i22;
        int i23;
        int iJ4;
        Unsafe unsafe = f23093h;
        int i24 = 1048575;
        int i25 = 1048575;
        int i26 = 0;
        int i27 = 0;
        int iW = 0;
        while (true) {
            int[] iArr = this.f23094a;
            if (i26 >= iArr.length) {
                x6 x6Var = ((w5) i5Var).zzc;
                int i28 = x6Var.f23273c;
                if (i28 == -1) {
                    x6Var.f23273c = 0;
                    i10 = 0;
                } else {
                    i10 = i28;
                }
                return i10 + iW;
            }
            int iM3 = m(i26);
            int iL = l(iM3);
            int i29 = iArr[i26];
            int i30 = iArr[i26 + 2];
            int i31 = i30 & i24;
            int i32 = 1;
            if (iL <= 17) {
                if (i31 != i25) {
                    i27 = i31 == i24 ? 0 : unsafe.getInt(i5Var, i31);
                    i25 = i31;
                }
                i11 = 1 << (i30 >>> 20);
            } else {
                i11 = 0;
            }
            int i33 = iM3 & i24;
            if (iL >= t5.f23204b.f23208a) {
                t5.f23205c.getClass();
            }
            long j10 = i33;
            int i34 = 4;
            int i35 = 8;
            switch (iL) {
                case 0:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        iW = ca.w(i29 << 3, 8, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 1:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        iW = ca.w(i29 << 3, 4, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 2:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        long j11 = unsafe.getLong(i5Var, j10);
                        i12 = o5.i(i29 << 3);
                        iJ = o5.j(j11);
                        iB = iJ + i12;
                        iW += iB;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 3:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        long j12 = unsafe.getLong(i5Var, j10);
                        i12 = o5.i(i29 << 3);
                        iJ = o5.j(j12);
                        iB = iJ + i12;
                        iW += iB;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 4:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        long j13 = unsafe.getInt(i5Var, j10);
                        i12 = o5.i(i29 << 3);
                        iJ = o5.j(j13);
                        iB = iJ + i12;
                        iW += iB;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 5:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        iW = ca.w(i29 << 3, 8, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 6:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        iW = ca.w(i29 << 3, 4, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 7:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        iW = ca.w(i29 << 3, 1, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 8:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        int i36 = i29 << 3;
                        Object object = unsafe.getObject(i5Var, j10);
                        if (object instanceof n5) {
                            int i37 = o5.i(i36);
                            int iM4 = ((n5) object).m();
                            iW = ca.x(iM4, iM4, i37, iW);
                        } else {
                            i12 = o5.i(i36);
                            iJ = o5.h((String) object);
                            iB = iJ + i12;
                            iW += iB;
                        }
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 9:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        Object object2 = unsafe.getObject(i5Var, j10);
                        s6 s6VarO = o(i26);
                        y6 y6Var = t6.f23209a;
                        int i38 = o5.i(i29 << 3);
                        int iB3 = ((i5) object2).b(s6VarO);
                        iW = ca.x(iB3, iB3, i38, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 10:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        n5 n5Var = (n5) unsafe.getObject(i5Var, j10);
                        int i39 = o5.i(i29 << 3);
                        int iM5 = n5Var.m();
                        iW = ca.x(iM5, iM5, i39, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 11:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        iW = ca.w(unsafe.getInt(i5Var, j10), o5.i(i29 << 3), iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 12:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        long j14 = unsafe.getInt(i5Var, j10);
                        i12 = o5.i(i29 << 3);
                        iJ = o5.j(j14);
                        iB = iJ + i12;
                        iW += iB;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 13:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        iW = ca.w(i29 << 3, 4, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 14:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        iW = ca.w(i29 << 3, 8, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 15:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        int i40 = unsafe.getInt(i5Var, j10);
                        iW = ca.w((i40 >> 31) ^ (i40 + i40), o5.i(i29 << 3), iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 16:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        long j15 = unsafe.getLong(i5Var, j10);
                        i12 = o5.i(i29 << 3);
                        iJ = o5.j((j15 >> 63) ^ (j15 + j15));
                        iB = iJ + i12;
                        iW += iB;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 17:
                    if (v(i5Var, i26, i25, i27, i11)) {
                        i5 i5Var2 = (i5) unsafe.getObject(i5Var, j10);
                        s6 s6VarO2 = o(i26);
                        y6 y6Var2 = t6.f23209a;
                        int i41 = o5.i(i29 << 3);
                        iB = i5Var2.b(s6VarO2) + i41 + i41;
                        iW += iB;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 18:
                    iH = t6.h(i29, (List) unsafe.getObject(i5Var, j10));
                    iW += iH;
                    i25 = i25;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 19:
                    iH = t6.g(i29, (List) unsafe.getObject(i5Var, j10));
                    iW += iH;
                    i25 = i25;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 20:
                    i13 = i25;
                    i14 = i27;
                    List list = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var3 = t6.f23209a;
                    if (list.size() == 0) {
                        i15 = 0;
                    } else {
                        i15 = (o5.i(i29 << 3) * list.size()) + t6.j(list);
                    }
                    iW += i15;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 21:
                    i13 = i25;
                    i14 = i27;
                    List list2 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var4 = t6.f23209a;
                    size = list2.size();
                    if (size == 0) {
                        i17 = 0;
                    } else {
                        iN = t6.n(list2);
                        i16 = o5.i(i29 << 3);
                        i17 = (i16 * size) + iN;
                    }
                    iW += i17;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 22:
                    i13 = i25;
                    i14 = i27;
                    List list3 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var5 = t6.f23209a;
                    size = list3.size();
                    if (size == 0) {
                        i17 = 0;
                    } else {
                        iN = t6.i(list3);
                        i16 = o5.i(i29 << 3);
                        i17 = (i16 * size) + iN;
                    }
                    iW += i17;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 23:
                    iH = t6.h(i29, (List) unsafe.getObject(i5Var, j10));
                    iW += iH;
                    i25 = i25;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 24:
                    iH = t6.g(i29, (List) unsafe.getObject(i5Var, j10));
                    iW += iH;
                    i25 = i25;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 25:
                    i13 = i25;
                    i14 = i27;
                    List list4 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var6 = t6.f23209a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        i15 = 0;
                    } else {
                        i15 = (o5.i(i29 << 3) + 1) * size2;
                    }
                    iW += i15;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                    i13 = i25;
                    i14 = i27;
                    List list5 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var7 = t6.f23209a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        i17 = 0;
                    } else {
                        i17 = o5.i(i29 << 3) * size3;
                        if (list5 instanceof d6) {
                            d6 d6Var = (d6) list5;
                            for (int i42 = 0; i42 < size3; i42++) {
                                Object objZza = d6Var.zza();
                                if (objZza instanceof n5) {
                                    int iM6 = ((n5) objZza).m();
                                    i17 = ca.w(iM6, iM6, i17);
                                } else {
                                    i17 = o5.h((String) objZza) + i17;
                                }
                            }
                        } else {
                            for (int i43 = 0; i43 < size3; i43++) {
                                Object obj = list5.get(i43);
                                if (obj instanceof n5) {
                                    int iM7 = ((n5) obj).m();
                                    i17 = ca.w(iM7, iM7, i17);
                                } else {
                                    i17 = o5.h((String) obj) + i17;
                                }
                            }
                        }
                    }
                    iW += i17;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 27:
                    i13 = i25;
                    i14 = i27;
                    List list6 = (List) unsafe.getObject(i5Var, j10);
                    s6 s6VarO3 = o(i26);
                    y6 y6Var8 = t6.f23209a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        i18 = 0;
                    } else {
                        i18 = o5.i(i29 << 3) * size4;
                        for (int i44 = 0; i44 < size4; i44++) {
                            int iB4 = ((i5) list6.get(i44)).b(s6VarO3);
                            i18 = ca.w(iB4, iB4, i18);
                        }
                    }
                    iW += i18;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                    i13 = i25;
                    i14 = i27;
                    List list7 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var9 = t6.f23209a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        i17 = 0;
                    } else {
                        i17 = o5.i(i29 << 3) * size5;
                        for (int i45 = 0; i45 < list7.size(); i45++) {
                            int iM8 = ((n5) list7.get(i45)).m();
                            i17 = ca.w(iM8, iM8, i17);
                        }
                    }
                    iW += i17;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME_VALUE:
                    i13 = i25;
                    i14 = i27;
                    List list8 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var10 = t6.f23209a;
                    size = list8.size();
                    if (size == 0) {
                        i17 = 0;
                    } else {
                        iN = t6.m(list8);
                        i16 = o5.i(i29 << 3);
                        i17 = (i16 * size) + iN;
                    }
                    iW += i17;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME_VALUE:
                    i13 = i25;
                    i14 = i27;
                    List list9 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var11 = t6.f23209a;
                    size = list9.size();
                    if (size == 0) {
                        i17 = 0;
                    } else {
                        iN = t6.f(list9);
                        i16 = o5.i(i29 << 3);
                        i17 = (i16 * size) + iN;
                    }
                    iW += i17;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 31:
                    iH = t6.g(i29, (List) unsafe.getObject(i5Var, j10));
                    iW += iH;
                    i25 = i25;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 32:
                    iH = t6.h(i29, (List) unsafe.getObject(i5Var, j10));
                    iW += iH;
                    i25 = i25;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 33:
                    i13 = i25;
                    i14 = i27;
                    List list10 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var12 = t6.f23209a;
                    size = list10.size();
                    if (size == 0) {
                        i17 = 0;
                    } else {
                        iN = t6.k(list10);
                        i16 = o5.i(i29 << 3);
                        i17 = (i16 * size) + iN;
                    }
                    iW += i17;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 34:
                    i13 = i25;
                    i14 = i27;
                    List list11 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var13 = t6.f23209a;
                    size = list11.size();
                    if (size == 0) {
                        i17 = 0;
                    } else {
                        iN = t6.l(list11);
                        i16 = o5.i(i29 << 3);
                        i17 = (i16 * size) + iN;
                    }
                    iW += i17;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                    i13 = i25;
                    i14 = i27;
                    List list12 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var14 = t6.f23209a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        iW = ca.x(size6, o5.i(i29 << 3), size6, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 36:
                    i13 = i25;
                    i14 = i27;
                    List list13 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var15 = t6.f23209a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        iW = ca.x(size7, o5.i(i29 << 3), size7, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 37:
                    i13 = i25;
                    i14 = i27;
                    int iJ5 = t6.j((List) unsafe.getObject(i5Var, j10));
                    if (iJ5 > 0) {
                        iW = ca.x(iJ5, o5.i(i29 << 3), iJ5, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                    i13 = i25;
                    i14 = i27;
                    int iN2 = t6.n((List) unsafe.getObject(i5Var, j10));
                    if (iN2 > 0) {
                        iW = ca.x(iN2, o5.i(i29 << 3), iN2, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 39:
                    i13 = i25;
                    i14 = i27;
                    int i46 = t6.i((List) unsafe.getObject(i5Var, j10));
                    if (i46 > 0) {
                        iW = ca.x(i46, o5.i(i29 << 3), i46, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 40:
                    i13 = i25;
                    i14 = i27;
                    List list14 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var16 = t6.f23209a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        iW = ca.x(size8, o5.i(i29 << 3), size8, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 41:
                    i13 = i25;
                    i14 = i27;
                    List list15 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var17 = t6.f23209a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        iW = ca.x(size9, o5.i(i29 << 3), size9, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 42:
                    i13 = i25;
                    i14 = i27;
                    List list16 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var18 = t6.f23209a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        iW = ca.x(size10, o5.i(i29 << 3), size10, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                    i13 = i25;
                    i14 = i27;
                    int iM9 = t6.m((List) unsafe.getObject(i5Var, j10));
                    if (iM9 > 0) {
                        iW = ca.x(iM9, o5.i(i29 << 3), iM9, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 44:
                    i13 = i25;
                    i14 = i27;
                    int iF = t6.f((List) unsafe.getObject(i5Var, j10));
                    if (iF > 0) {
                        iW = ca.x(iF, o5.i(i29 << 3), iF, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 45:
                    i13 = i25;
                    i14 = i27;
                    List list17 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var19 = t6.f23209a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        iW = ca.x(size11, o5.i(i29 << 3), size11, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                    i13 = i25;
                    i14 = i27;
                    List list18 = (List) unsafe.getObject(i5Var, j10);
                    y6 y6Var20 = t6.f23209a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        iW = ca.x(size12, o5.i(i29 << 3), size12, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                    i13 = i25;
                    i14 = i27;
                    int iK = t6.k((List) unsafe.getObject(i5Var, j10));
                    if (iK > 0) {
                        iW = ca.x(iK, o5.i(i29 << 3), iK, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                    i13 = i25;
                    i14 = i27;
                    int iL2 = t6.l((List) unsafe.getObject(i5Var, j10));
                    if (iL2 > 0) {
                        iW = ca.x(iL2, o5.i(i29 << 3), iL2, iW);
                    }
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                    i13 = i25;
                    i14 = i27;
                    List list19 = (List) unsafe.getObject(i5Var, j10);
                    s6 s6VarO4 = o(i26);
                    y6 y6Var21 = t6.f23209a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        iB2 = 0;
                    } else {
                        iB2 = 0;
                        for (int i47 = 0; i47 < size13; i47++) {
                            i5 i5Var3 = (i5) list19.get(i47);
                            int i48 = o5.i(i29 << 3);
                            iB2 += i5Var3.b(s6VarO4) + i48 + i48;
                        }
                    }
                    iW += iB2;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 50:
                    int i49 = i26 / 3;
                    i6 i6Var = (i6) unsafe.getObject(i5Var, j10);
                    h6 h6Var = (h6) this.f23095b[i49 + i49];
                    if (i6Var.isEmpty()) {
                        iX = 0;
                    } else {
                        iX = 0;
                        for (Map.Entry entry : i6Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            int i50 = i32;
                            p pVar = h6Var.f23036a;
                            int i51 = i34;
                            int i52 = o5.i(i29 << 3);
                            int i53 = i35;
                            g7 g7Var = (g7) pVar.f23158a;
                            g7 g7Var2 = (g7) pVar.f23159b;
                            int i54 = s5.f23194c;
                            int i55 = o5.i(i53);
                            int i56 = i25;
                            g7 g7Var3 = g7.f23026e;
                            if (g7Var == g7Var3) {
                                i55 += i55;
                            }
                            h7 h7Var = h7.f23037a;
                            int i57 = i27;
                            switch (g7Var.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    iJ2 = i53;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i58 = iJ3 + i21 + i20;
                                            iX = ca.x(i58, i58, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i59 = iJ3 + i21 + i20;
                                            iX = ca.x(i59, i59, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i510 = iJ3 + i21 + i20;
                                            iX = ca.x(i510, i510, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511 = iJ3 + i21 + i20;
                                            iX = ca.x(i511, i511, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i512 = iJ3 + i21 + i20;
                                            iX = ca.x(i512, i512, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i513 = iJ3 + i21 + i20;
                                            iX = ca.x(i513, i513, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i514 = iJ3 + i21 + i20;
                                            iX = ca.x(i514, i514, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i515 = iJ3 + i21 + i20;
                                            iX = ca.x(i515, i515, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i516 = iJ3 + i21 + i20;
                                            iX = ca.x(i516, i516, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i517 = iJ3 + i21 + i20;
                                            iX = ca.x(i517, i517, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i518 = iJ3 + i21 + i20;
                                            iX = ca.x(i518, i518, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i519 = iJ3 + i21 + i20;
                                            iX = ca.x(i519, i519, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i5110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5110, i5110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111, i5111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5112, i5112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5113, i5113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue >> 31) ^ (iIntValue + iIntValue));
                                            int i5114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5114, i5114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue >> 63) ^ (jLongValue + jLongValue));
                                            int i5115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5115, i5115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 1:
                                    ((Float) key).getClass();
                                    iJ2 = i51;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i5116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5116, i5116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i5117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5117, i5117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5118, i5118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5119, i5119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51110, i51110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111, i51111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51112, i51112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i51113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51113, i51113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i51114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51114, i51114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i51115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51115, i51115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i51116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51116, i51116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i51117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51117, i51117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i51118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51118, i51118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51119, i51119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511110, i511110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111, i511111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue2 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                                            int i511112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511112, i511112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue2 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                                            int i511113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511113, i511113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 2:
                                    h6Var = h6Var;
                                    iJ2 = o5.j(((Long) key).longValue());
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i511114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511114, i511114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i511115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511115, i511115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511116, i511116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511117, i511117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511118, i511118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511119, i511119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111110, i5111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i5111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111, i5111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i5111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111112, i5111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i5111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111113, i5111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i5111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111114, i5111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i5111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111115, i5111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i5111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111116, i5111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111117, i5111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111118, i5111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111119, i5111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue3 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                                            int i51111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111110, i51111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue3 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                                            int i51111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111, i51111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 3:
                                    h6Var = h6Var;
                                    iJ2 = o5.j(((Long) key).longValue());
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i51111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111112, i51111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i51111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111113, i51111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i51111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111114, i51111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i51111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111115, i51111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111116, i51111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111117, i51111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111118, i51111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i51111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111119, i51111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i511111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111110, i511111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i511111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111, i511111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i511111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111112, i511111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i511111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111113, i511111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i511111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111114, i511111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111115, i511111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111116, i511111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111117, i511111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue4 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue4 >> 31) ^ (iIntValue4 + iIntValue4));
                                            int i511111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111118, i511111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue4 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue4 >> 63) ^ (jLongValue4 + jLongValue4));
                                            int i511111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111119, i511111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 4:
                                    h6Var = h6Var;
                                    iJ2 = o5.j(((Integer) key).intValue());
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i5111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111110, i5111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111, i5111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111112, i5111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111113, i5111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111114, i5111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111115, i5111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111116, i5111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i5111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111117, i5111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i5111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111118, i5111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i5111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111119, i5111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i51111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111110, i51111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i51111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111, i51111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i51111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111112, i51111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111113, i51111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111114, i51111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111115, i51111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue5 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue5 >> 31) ^ (iIntValue5 + iIntValue5));
                                            int i51111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111116, i51111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue5 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue5 >> 63) ^ (jLongValue5 + jLongValue5));
                                            int i51111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111117, i51111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 5:
                                    ((Long) key).getClass();
                                    iJ2 = i53;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i51111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111118, i51111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i51111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111119, i51111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111110, i511111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111, i511111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111112, i511111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111113, i511111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111114, i511111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i511111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111115, i511111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i511111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111116, i511111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i511111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111117, i511111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i511111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111118, i511111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i511111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111119, i511111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i5111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111110, i5111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111, i5111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111112, i5111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111113, i5111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue6 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue6 >> 31) ^ (iIntValue6 + iIntValue6));
                                            int i5111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111114, i5111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue6 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue6 >> 63) ^ (jLongValue6 + jLongValue6));
                                            int i5111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111115, i5111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 6:
                                    ((Integer) key).getClass();
                                    iJ2 = i51;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111116, i5111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111117, i5111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111118, i5111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111119, i5111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111110, i51111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111, i51111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111112, i51111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i51111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111113, i51111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i51111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111114, i51111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i51111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111115, i51111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i51111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111116, i51111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i51111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111117, i51111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i51111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111118, i51111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111119, i51111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111110, i511111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111, i511111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue7 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue7 >> 31) ^ (iIntValue7 + iIntValue7));
                                            int i511111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111112, i511111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue7 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue7 >> 63) ^ (jLongValue7 + jLongValue7));
                                            int i511111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111113, i511111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 7:
                                    h6Var = h6Var;
                                    ((Boolean) key).getClass();
                                    iJ2 = i50;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111114, i511111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111115, i511111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111116, i511111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111117, i511111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111118, i511111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111119, i511111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111110, i5111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i5111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111, i5111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i5111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111112, i5111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i5111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111113, i5111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i5111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111114, i5111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i5111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111115, i5111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i5111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111116, i5111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111117, i5111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111118, i5111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111119, i5111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue8 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue8 >> 31) ^ (iIntValue8 + iIntValue8));
                                            int i51111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111110, i51111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue8 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue8 >> 63) ^ (jLongValue8 + jLongValue8));
                                            int i51111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111, i51111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 8:
                                    h6Var = h6Var;
                                    if (key instanceof n5) {
                                        iM = ((n5) key).m();
                                        i19 = o5.i(iM);
                                        iJ2 = iM + i19;
                                    } else {
                                        iJ2 = o5.h((String) key);
                                    }
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111112, i51111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111113, i51111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i51111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111114, i51111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i51111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111115, i51111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111116, i51111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111117, i51111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111118, i51111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i51111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111119, i51111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i511111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111110, i511111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i511111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111, i511111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i511111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111112, i511111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i511111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111113, i511111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i511111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111114, i511111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111115, i511111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111116, i511111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111117, i511111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue9 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue9 >> 31) ^ (iIntValue9 + iIntValue9));
                                            int i511111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111118, i511111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue9 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue9 >> 63) ^ (jLongValue9 + jLongValue9));
                                            int i511111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111119, i511111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 9:
                                    h6Var = h6Var;
                                    iJ2 = ((i5) key).c();
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111110, i5111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111, i5111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111112, i5111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111113, i5111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111114, i5111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111115, i5111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111116, i5111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i5111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111117, i5111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i5111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111118, i5111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i5111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111119, i5111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i51111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111110, i51111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i51111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111, i51111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i51111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111112, i51111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111113, i51111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111114, i51111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111115, i51111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue10 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue10 >> 31) ^ (iIntValue10 + iIntValue10));
                                            int i51111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111116, i51111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue10 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue10 >> 63) ^ (jLongValue10 + jLongValue10));
                                            int i51111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111117, i51111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 10:
                                    h6Var = h6Var;
                                    iM = ((i5) key).c();
                                    i19 = o5.i(iM);
                                    iJ2 = iM + i19;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111118, i51111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111119, i51111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111110, i511111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111, i511111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111112, i511111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111113, i511111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111114, i511111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i511111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111115, i511111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i511111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111116, i511111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i511111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111117, i511111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i511111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111118, i511111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i511111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111119, i511111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i5111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111110, i5111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111, i5111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111112, i5111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111113, i5111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue11 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue11 >> 31) ^ (iIntValue11 + iIntValue11));
                                            int i5111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111114, i5111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue11 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue11 >> 63) ^ (jLongValue11 + jLongValue11));
                                            int i5111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111115, i5111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 11:
                                    h6Var = h6Var;
                                    if (key instanceof n5) {
                                        iM = ((n5) key).m();
                                        i19 = o5.i(iM);
                                    } else {
                                        iM = ((byte[]) key).length;
                                        i19 = o5.i(iM);
                                    }
                                    iJ2 = iM + i19;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111116, i5111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111117, i5111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111118, i5111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111119, i5111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111110, i51111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111, i51111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111112, i51111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i51111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111113, i51111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i51111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111114, i51111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i51111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111115, i51111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i51111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111116, i51111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i51111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111117, i51111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i51111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111118, i51111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111119, i51111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111110, i511111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111, i511111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue12 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue12 >> 31) ^ (iIntValue12 + iIntValue12));
                                            int i511111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111112, i511111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue12 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue12 >> 63) ^ (jLongValue12 + jLongValue12));
                                            int i511111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111113, i511111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 12:
                                    h6Var = h6Var;
                                    iJ2 = o5.i(((Integer) key).intValue());
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111114, i511111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111115, i511111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111116, i511111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111117, i511111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111118, i511111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111119, i511111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111110, i5111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i5111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111, i5111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i5111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111112, i5111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i5111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111113, i5111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i5111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111114, i5111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i5111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111115, i5111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i5111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111116, i5111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111117, i5111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111118, i5111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111119, i5111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue13 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue13 >> 31) ^ (iIntValue13 + iIntValue13));
                                            int i51111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111110, i51111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue13 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue13 >> 63) ^ (jLongValue13 + jLongValue13));
                                            int i51111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111, i51111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 13:
                                    h6Var = h6Var;
                                    iJ2 = o5.j(((Integer) key).intValue());
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111112, i51111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111113, i51111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i51111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111114, i51111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i51111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111115, i51111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111116, i51111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111117, i51111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111118, i51111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i51111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111119, i51111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i511111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111110, i511111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i511111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111, i511111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i511111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111112, i511111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i511111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111113, i511111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i511111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111114, i511111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111115, i511111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111116, i511111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111117, i511111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue14 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue14 >> 31) ^ (iIntValue14 + iIntValue14));
                                            int i511111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111118, i511111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue14 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue14 >> 63) ^ (jLongValue14 + jLongValue14));
                                            int i511111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111119, i511111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 14:
                                    ((Integer) key).getClass();
                                    iJ2 = i51;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111110, i5111111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111, i5111111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111112, i5111111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111113, i5111111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111114, i5111111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111115, i5111111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111116, i5111111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i5111111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111117, i5111111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i5111111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111118, i5111111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i5111111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111119, i5111111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i51111111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111110, i51111111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i51111111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111, i51111111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i51111111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111112, i51111111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111113, i51111111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111114, i51111111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111115, i51111111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue15 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue15 >> 31) ^ (iIntValue15 + iIntValue15));
                                            int i51111111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111116, i51111111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue15 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue15 >> 63) ^ (jLongValue15 + jLongValue15));
                                            int i51111111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111117, i51111111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 15:
                                    ((Long) key).getClass();
                                    iJ2 = i53;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111118, i51111111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111119, i51111111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111110, i511111111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111, i511111111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111112, i511111111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111113, i511111111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111114, i511111111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i511111111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111115, i511111111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i511111111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111116, i511111111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i511111111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111117, i511111111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i511111111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111118, i511111111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i511111111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111119, i511111111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i5111111111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111110, i5111111111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111, i5111111111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111112, i5111111111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111113, i5111111111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue16 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue16 >> 31) ^ (iIntValue16 + iIntValue16));
                                            int i5111111111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111114, i5111111111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue16 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue16 >> 63) ^ (jLongValue16 + jLongValue16));
                                            int i5111111111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111115, i5111111111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 16:
                                    int iIntValue17 = ((Integer) key).intValue();
                                    iJ2 = o5.i((iIntValue17 >> 31) ^ (iIntValue17 + iIntValue17));
                                    h6Var = h6Var;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111116, i5111111111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111117, i5111111111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111118, i5111111111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i5111111111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111119, i5111111111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111110, i51111111111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i51111111111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111111, i51111111111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i51111111111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111112, i51111111111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i51111111111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111113, i51111111111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i51111111111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111114, i51111111111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i51111111111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111115, i51111111111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i51111111111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111116, i51111111111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i51111111111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111117, i51111111111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i51111111111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111118, i51111111111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i51111111111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111119, i51111111111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111110, i511111111111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111111, i511111111111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue18 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue18 >> 31) ^ (iIntValue18 + iIntValue18));
                                            int i511111111111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111112, i511111111111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue17 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue17 >> 63) ^ (jLongValue17 + jLongValue17));
                                            int i511111111111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111113, i511111111111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                case 17:
                                    long jLongValue18 = ((Long) key).longValue();
                                    iJ2 = o5.j((jLongValue18 + jLongValue18) ^ (jLongValue18 >> 63));
                                    h6Var = h6Var;
                                    i20 = iJ2 + i55;
                                    i21 = o5.i(16);
                                    if (g7Var2 == g7Var3) {
                                        i21 += i21;
                                    }
                                    switch (g7Var2.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111114, i511111111111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 1:
                                            ((Float) value).getClass();
                                            iJ3 = i51;
                                            int i511111111111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111115, i511111111111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 2:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111116, i511111111111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 3:
                                            iJ3 = o5.j(((Long) value).longValue());
                                            int i511111111111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111117, i511111111111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 4:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i511111111111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111118, i511111111111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 5:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i511111111111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i511111111111111111111111111111119, i511111111111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 6:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111110, i5111111111111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 7:
                                            ((Boolean) value).getClass();
                                            iJ3 = i50;
                                            int i5111111111111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111111, i5111111111111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 8:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                                iJ3 = iM2 + i22;
                                            } else {
                                                iJ3 = o5.h((String) value);
                                            }
                                            int i5111111111111111111111111111111112 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111112, i5111111111111111111111111111111112, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 9:
                                            iJ3 = ((i5) value).c();
                                            int i5111111111111111111111111111111113 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111113, i5111111111111111111111111111111113, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 10:
                                            iM2 = ((i5) value).c();
                                            i22 = o5.i(iM2);
                                            iJ3 = iM2 + i22;
                                            int i5111111111111111111111111111111114 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111114, i5111111111111111111111111111111114, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 11:
                                            if (value instanceof n5) {
                                                iM2 = ((n5) value).m();
                                                i22 = o5.i(iM2);
                                            } else {
                                                iM2 = ((byte[]) value).length;
                                                i22 = o5.i(iM2);
                                            }
                                            iJ3 = iM2 + i22;
                                            int i5111111111111111111111111111111115 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111115, i5111111111111111111111111111111115, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 12:
                                            iJ3 = o5.i(((Integer) value).intValue());
                                            int i5111111111111111111111111111111116 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111116, i5111111111111111111111111111111116, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 13:
                                            iJ3 = o5.j(((Integer) value).intValue());
                                            int i5111111111111111111111111111111117 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111117, i5111111111111111111111111111111117, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 14:
                                            ((Integer) value).getClass();
                                            iJ3 = i51;
                                            int i5111111111111111111111111111111118 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111118, i5111111111111111111111111111111118, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 15:
                                            ((Long) value).getClass();
                                            iJ3 = i53;
                                            int i5111111111111111111111111111111119 = iJ3 + i21 + i20;
                                            iX = ca.x(i5111111111111111111111111111111119, i5111111111111111111111111111111119, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 16:
                                            int iIntValue19 = ((Integer) value).intValue();
                                            iJ3 = o5.i((iIntValue19 >> 31) ^ (iIntValue19 + iIntValue19));
                                            int i51111111111111111111111111111111110 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111111110, i51111111111111111111111111111111110, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        case 17:
                                            long jLongValue19 = ((Long) value).longValue();
                                            iJ3 = o5.j((jLongValue19 >> 63) ^ (jLongValue19 + jLongValue19));
                                            int i51111111111111111111111111111111111 = iJ3 + i21 + i20;
                                            iX = ca.x(i51111111111111111111111111111111111, i51111111111111111111111111111111111, i52, iX);
                                            i32 = i50;
                                            i35 = i53;
                                            i34 = i51;
                                            i25 = i56;
                                            i27 = i57;
                                            h6Var = h6Var;
                                            break;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                    break;
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i13 = i25;
                    i14 = i27;
                    iW += iX;
                    i25 = i13;
                    i27 = i14;
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                    if (i(i29, i26, i5Var)) {
                        iW = ca.w(i29 << 3, 8, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                    if (i(i29, i26, i5Var)) {
                        iW = ca.w(i29 << 3, 4, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                    if (i(i29, i26, i5Var)) {
                        long jN = n(j10, i5Var);
                        i23 = o5.i(i29 << 3);
                        iJ4 = o5.j(jN);
                        iW += iJ4 + i23;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                    if (i(i29, i26, i5Var)) {
                        long jN2 = n(j10, i5Var);
                        i23 = o5.i(i29 << 3);
                        iJ4 = o5.j(jN2);
                        iW += iJ4 + i23;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                    if (i(i29, i26, i5Var)) {
                        long jK = k(j10, i5Var);
                        i23 = o5.i(i29 << 3);
                        iJ4 = o5.j(jK);
                        iW += iJ4 + i23;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                    if (i(i29, i26, i5Var)) {
                        iW = ca.w(i29 << 3, 8, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                    if (i(i29, i26, i5Var)) {
                        iW = ca.w(i29 << 3, 4, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                    if (i(i29, i26, i5Var)) {
                        iW = ca.w(i29 << 3, 1, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                    if (i(i29, i26, i5Var)) {
                        int i60 = i29 << 3;
                        Object object3 = unsafe.getObject(i5Var, j10);
                        if (object3 instanceof n5) {
                            int i61 = o5.i(i60);
                            int iM10 = ((n5) object3).m();
                            iW = ca.x(iM10, iM10, i61, iW);
                        } else {
                            i23 = o5.i(i60);
                            iJ4 = o5.h((String) object3);
                            iW += iJ4 + i23;
                        }
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 60:
                    if (i(i29, i26, i5Var)) {
                        Object object4 = unsafe.getObject(i5Var, j10);
                        s6 s6VarO5 = o(i26);
                        y6 y6Var22 = t6.f23209a;
                        int i62 = o5.i(i29 << 3);
                        int iB5 = ((i5) object4).b(s6VarO5);
                        iW = ca.x(iB5, iB5, i62, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                    if (i(i29, i26, i5Var)) {
                        n5 n5Var2 = (n5) unsafe.getObject(i5Var, j10);
                        int i63 = o5.i(i29 << 3);
                        int iM11 = n5Var2.m();
                        iW = ca.x(iM11, iM11, i63, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 62:
                    if (i(i29, i26, i5Var)) {
                        iW = ca.w(k(j10, i5Var), o5.i(i29 << 3), iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case DIAGNOSTIC_EVENT_TYPE_NATIVE_START_ON_DISPLAY_READY_VALUE:
                    if (i(i29, i26, i5Var)) {
                        long jK2 = k(j10, i5Var);
                        i23 = o5.i(i29 << 3);
                        iJ4 = o5.j(jK2);
                        iW += iJ4 + i23;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 64:
                    if (i(i29, i26, i5Var)) {
                        iW = ca.w(i29 << 3, 4, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 65:
                    if (i(i29, i26, i5Var)) {
                        iW = ca.w(i29 << 3, 8, iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 66:
                    if (i(i29, i26, i5Var)) {
                        int iK2 = k(j10, i5Var);
                        iW = ca.w((iK2 >> 31) ^ (iK2 + iK2), o5.i(i29 << 3), iW);
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 67:
                    if (i(i29, i26, i5Var)) {
                        long jN3 = n(j10, i5Var);
                        i23 = o5.i(i29 << 3);
                        iJ4 = o5.j((jN3 >> 63) ^ (jN3 + jN3));
                        iW += iJ4 + i23;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                case 68:
                    if (i(i29, i26, i5Var)) {
                        i5 i5Var4 = (i5) unsafe.getObject(i5Var, j10);
                        s6 s6VarO6 = o(i26);
                        y6 y6Var23 = t6.f23209a;
                        int i64 = o5.i(i29 << 3);
                        iB = i5Var4.b(s6VarO6) + i64 + i64;
                        iW += iB;
                    }
                    i26 += 3;
                    i24 = 1048575;
                    break;
                default:
                    i26 += 3;
                    i24 = 1048575;
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final boolean g(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.f23098e) {
            int i15 = this.f23097d[i13];
            int[] iArr = this.f23094a;
            int i16 = iArr[i15];
            int iM = m(i15);
            int i17 = iArr[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = f23093h.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                int i20 = i12;
                i10 = i14;
                i11 = i20;
            }
            if ((268435456 & iM) == 0 || v(obj, i15, i10, i11, i19)) {
                int iL = l(iM);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!i(i16, i15, obj) || o(i15).g(d7.h(iM & 1048575, obj))) {
                                i13++;
                                i14 = i10;
                                i12 = i11;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                i6 i6Var = (i6) d7.h(iM & 1048575, obj);
                                if (i6Var.isEmpty()) {
                                    continue;
                                } else {
                                    int i21 = i15 / 3;
                                    if (((g7) ((h6) this.f23095b[i21 + i21]).f23036a.f23159b).f23028a == h7.f23045i) {
                                        s6 s6VarA = null;
                                        for (Object obj2 : i6Var.values()) {
                                            if (s6VarA == null) {
                                                s6VarA = p6.f23162c.a(obj2.getClass());
                                            }
                                            if (!s6VarA.g(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i13++;
                            i14 = i10;
                            i12 = i11;
                        }
                    }
                    List list = (List) d7.h(iM & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        s6 s6VarO = o(i15);
                        for (int i22 = 0; i22 < list.size(); i22++) {
                            if (s6VarO.g(list.get(i22))) {
                            }
                        }
                    }
                    i13++;
                    i14 = i10;
                    i12 = i11;
                } else if (!v(obj, i15, i10, i11, i19) || o(i15).g(d7.h(iM & 1048575, obj))) {
                    i13++;
                    i14 = i10;
                    i12 = i11;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean i(int i10, int i11, Object obj) {
        return d7.e((long) (this.f23094a[i11 + 2] & 1048575), obj) == i10;
    }

    public final int m(int i10) {
        return this.f23094a[i10 + 1];
    }

    public final s6 o(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f23095b;
        s6 s6Var = (s6) objArr[i12];
        if (s6Var != null) {
            return s6Var;
        }
        s6 s6VarA = p6.f23162c.a((Class) objArr[i12 + 1]);
        objArr[i12] = s6VarA;
        return s6VarA;
    }

    public final void q(int i10, Object obj, Object obj2) {
        if (u(i10, obj2)) {
            int iM = m(i10) & 1048575;
            Unsafe unsafe = f23093h;
            long j10 = iM;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f23094a[i10] + " is present but null: " + obj2.toString());
            }
            s6 s6VarO = o(i10);
            if (!u(i10, obj)) {
                if (h(object)) {
                    w5 w5VarZzc = s6VarO.zzc();
                    s6VarO.e(w5VarZzc, object);
                    unsafe.putObject(obj, j10, w5VarZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                s(i10, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!h(object2)) {
                w5 w5VarZzc2 = s6VarO.zzc();
                s6VarO.e(w5VarZzc2, object2);
                unsafe.putObject(obj, j10, w5VarZzc2);
                object2 = w5VarZzc2;
            }
            s6VarO.e(object2, object);
        }
    }

    public final void r(int i10, Object obj, Object obj2) {
        int[] iArr = this.f23094a;
        int i11 = iArr[i10];
        if (i(i11, i10, obj2)) {
            int iM = m(i10) & 1048575;
            Unsafe unsafe = f23093h;
            long j10 = iM;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i10] + " is present but null: " + obj2.toString());
            }
            s6 s6VarO = o(i10);
            if (!i(i11, i10, obj)) {
                if (h(object)) {
                    w5 w5VarZzc = s6VarO.zzc();
                    s6VarO.e(w5VarZzc, object);
                    unsafe.putObject(obj, j10, w5VarZzc);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                d7.j(i11, iArr[i10 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!h(object2)) {
                w5 w5VarZzc2 = s6VarO.zzc();
                s6VarO.e(w5VarZzc2, object2);
                unsafe.putObject(obj, j10, w5VarZzc2);
                object2 = w5VarZzc2;
            }
            s6VarO.e(object2, object);
        }
    }

    public final void s(int i10, Object obj) {
        int i11 = this.f23094a[i10 + 2];
        long j10 = 1048575 & i11;
        if (j10 == 1048575) {
            return;
        }
        d7.j((1 << (i11 >>> 20)) | d7.e(j10, obj), j10, obj);
    }

    public final boolean t(w5 w5Var, w5 w5Var2, int i10) {
        return u(i10, w5Var) == u(i10, w5Var2);
    }

    public final boolean u(int i10, Object obj) {
        int i11 = this.f23094a[i10 + 2];
        long j10 = i11 & 1048575;
        if (j10 == 1048575) {
            int iM = m(i10);
            long j11 = iM & 1048575;
            switch (l(iM)) {
                case 0:
                    if (Double.doubleToRawLongBits(d7.f22994c.a(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(d7.f22994c.b(j11, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (d7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (d7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (d7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (d7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (d7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return d7.f22994c.g(j11, obj);
                case 8:
                    Object objH = d7.h(j11, obj);
                    if (objH instanceof String) {
                        if (((String) objH).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objH instanceof n5)) {
                            throw new IllegalArgumentException();
                        }
                        if (n5.f23112c.equals(objH)) {
                            return false;
                        }
                    }
                case 9:
                    if (d7.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (n5.f23112c.equals(d7.h(j11, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (d7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (d7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (d7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (d7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (d7.e(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (d7.f(j11, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (d7.h(j11, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i11 >>> 20)) & d7.e(j10, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean v(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return u(i10, obj);
        }
        return (i12 & i13) != 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.s6
    public final w5 zzc() {
        return (w5) ((w5) this.f23096c).f(4);
    }
}
