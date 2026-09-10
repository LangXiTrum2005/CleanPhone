package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class MessageSchema<T> implements Schema<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f4884p = new int[0];
    public static final Unsafe q = UnsafeUtil.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f4885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f4886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4887c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MessageLite f4888e;
    public final boolean f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f4889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4890i;
    public final int j;
    public final NewInstanceSchema k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ListFieldSchema f4891l;
    public final UnknownFieldSchema m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ExtensionSchema f4892n;
    public final MapFieldSchema o;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4893a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f4893a = iArr;
            try {
                iArr[WireFormat.FieldType.k0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4893a[WireFormat.FieldType.o0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4893a[WireFormat.FieldType.Z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4893a[WireFormat.FieldType.j0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4893a[WireFormat.FieldType.r0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4893a[WireFormat.FieldType.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4893a[WireFormat.FieldType.s0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4893a[WireFormat.FieldType.e0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4893a[WireFormat.FieldType.q0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4893a[WireFormat.FieldType.h0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4893a[WireFormat.FieldType.p0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4893a[WireFormat.FieldType.f0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4893a[WireFormat.FieldType.g0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4893a[WireFormat.FieldType.n0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4893a[WireFormat.FieldType.t0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4893a[WireFormat.FieldType.u0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4893a[WireFormat.FieldType.l0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MessageSchema(int[] iArr, Object[] objArr, int i2, int i3, MessageLite messageLite, int[] iArr2, int i4, int i5, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        this.f4885a = iArr;
        this.f4886b = objArr;
        this.f4887c = i2;
        this.d = i3;
        this.g = messageLite instanceof GeneratedMessageLite;
        this.f = extensionSchema != null && extensionSchema.e(messageLite);
        this.f4889h = iArr2;
        this.f4890i = i4;
        this.j = i5;
        this.k = newInstanceSchema;
        this.f4891l = listFieldSchema;
        this.m = unknownFieldSchema;
        this.f4892n = extensionSchema;
        this.f4888e = messageLite;
        this.o = mapFieldSchema;
    }

    public static java.lang.reflect.Field D(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbY = android.support.v4.media.a.y("Field ", str, " for ");
            sbY.append(cls.getName());
            sbY.append(" not found. Known fields are ");
            sbY.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbY.toString());
        }
    }

    public static int J(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    public static void M(int i2, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i2, (String) obj);
        } else {
            writer.b(i2, (ByteString) obj);
        }
    }

    public static void g(Object obj) {
        if (n(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).m();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x030f  */
    /* JADX WARN: Code duplicated, block: B:181:0x039a  */
    public static MessageSchema v(RawMessageInfo rawMessageInfo, NewInstanceSchema newInstanceSchema, ListFieldSchema listFieldSchema, UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, MapFieldSchema mapFieldSchema) {
        int i2;
        int iCharAt;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        int i19;
        int i20;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        java.lang.reflect.Field fieldD;
        char cCharAt9;
        int i23;
        java.lang.reflect.Field fieldD2;
        java.lang.reflect.Field fieldD3;
        int i24;
        char cCharAt10;
        int i25;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        String str = rawMessageInfo.f4909b;
        int length = str.length();
        int i29 = 55296;
        if (str.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i2 = i30 + 1;
                if (str.charAt(i30) < 55296) {
                    break;
                }
                i30 = i2;
            }
        } else {
            i2 = 1;
        }
        int i31 = i2 + 1;
        int iCharAt2 = str.charAt(i2);
        if (iCharAt2 >= 55296) {
            int i32 = iCharAt2 & 8191;
            int i33 = 13;
            while (true) {
                i28 = i31 + 1;
                cCharAt13 = str.charAt(i31);
                if (cCharAt13 < 55296) {
                    break;
                }
                i32 |= (cCharAt13 & 8191) << i33;
                i33 += 13;
                i31 = i28;
            }
            iCharAt2 = i32 | (cCharAt13 << i33);
            i31 = i28;
        }
        if (iCharAt2 == 0) {
            i4 = 0;
            i7 = 0;
            iCharAt = 0;
            i3 = 0;
            i6 = 0;
            i8 = 0;
            iArr = f4884p;
            i5 = 0;
        } else {
            int i34 = i31 + 1;
            int iCharAt3 = str.charAt(i31);
            if (iCharAt3 >= 55296) {
                int i35 = iCharAt3 & 8191;
                int i36 = 13;
                while (true) {
                    i16 = i34 + 1;
                    cCharAt8 = str.charAt(i34);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i35 |= (cCharAt8 & 8191) << i36;
                    i36 += 13;
                    i34 = i16;
                }
                iCharAt3 = i35 | (cCharAt8 << i36);
                i34 = i16;
            }
            int i37 = i34 + 1;
            int iCharAt4 = str.charAt(i34);
            if (iCharAt4 >= 55296) {
                int i38 = iCharAt4 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    cCharAt7 = str.charAt(i37);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt7 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                iCharAt4 = i38 | (cCharAt7 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int iCharAt5 = str.charAt(i37);
            if (iCharAt5 >= 55296) {
                int i41 = iCharAt5 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    cCharAt6 = str.charAt(i40);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt6 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                iCharAt5 = i41 | (cCharAt6 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int iCharAt6 = str.charAt(i40);
            if (iCharAt6 >= 55296) {
                int i44 = iCharAt6 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    cCharAt5 = str.charAt(i43);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt5 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                iCharAt6 = i44 | (cCharAt5 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            iCharAt = str.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    cCharAt4 = str.charAt(i46);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt4 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                iCharAt = i47 | (cCharAt4 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            int iCharAt7 = str.charAt(i46);
            if (iCharAt7 >= 55296) {
                int i50 = iCharAt7 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    cCharAt3 = str.charAt(i49);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt3 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                iCharAt7 = i50 | (cCharAt3 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int iCharAt8 = str.charAt(i49);
            if (iCharAt8 >= 55296) {
                int i53 = iCharAt8 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    cCharAt2 = str.charAt(i52);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt2 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                iCharAt8 = i53 | (cCharAt2 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int iCharAt9 = str.charAt(i52);
            if (iCharAt9 >= 55296) {
                int i56 = iCharAt9 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    cCharAt = str.charAt(i55);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i56 |= (cCharAt & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                iCharAt9 = i56 | (cCharAt << i57);
                i55 = i9;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            int i58 = (iCharAt3 * 2) + iCharAt4;
            int i59 = iCharAt7;
            i3 = iCharAt5;
            i4 = i59;
            i5 = iCharAt3;
            i31 = i55;
            iArr = iArr2;
            i6 = iCharAt6;
            i7 = i58;
            i8 = iCharAt9;
        }
        Unsafe unsafe = q;
        Class<?> cls = rawMessageInfo.f4908a.getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i60 = i8 + i4;
        int i61 = i60;
        int i62 = i8;
        int i63 = 0;
        int i64 = 0;
        while (i31 < length) {
            int i65 = i31 + 1;
            int iCharAt10 = str.charAt(i31);
            if (iCharAt10 >= i29) {
                int i66 = iCharAt10 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i27 = i67 + 1;
                    cCharAt12 = str.charAt(i67);
                    i17 = length;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i27;
                    length = i17;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i18 = i27;
            } else {
                i17 = length;
                i18 = i65;
            }
            int i69 = i18 + 1;
            int iCharAt11 = str.charAt(i18);
            int i70 = iCharAt10;
            char c2 = 55296;
            if (iCharAt11 >= 55296) {
                int i71 = iCharAt11 & 8191;
                int i72 = 13;
                while (true) {
                    i26 = i69 + 1;
                    cCharAt11 = str.charAt(i69);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i71 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i69 = i26;
                    c2 = 55296;
                }
                iCharAt11 = i71 | (cCharAt11 << i72);
                i69 = i26;
            }
            int i73 = iCharAt11 & 255;
            int i74 = i5;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            ProtoSyntax protoSyntax = ProtoSyntax.X;
            int[] iArr4 = iArr3;
            Object[] objArr2 = rawMessageInfo.f4910c;
            if (i73 >= 51) {
                int i75 = i69 + 1;
                int iCharAt12 = str.charAt(i69);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i24 = i77 + 1;
                        cCharAt10 = str.charAt(i77);
                        i25 = i76;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 = i25 | ((cCharAt10 & 8191) << i78);
                        i78 += 13;
                        i77 = i24;
                    }
                    iCharAt12 = i25 | (cCharAt10 << i78);
                    i23 = i24;
                } else {
                    i23 = i75;
                }
                int i79 = iCharAt12;
                int i80 = i73 - 51;
                int i81 = i23;
                if (i80 == 9 || i80 == 17) {
                    objArr[a.a(i63, 3, 2, 1)] = objArr2[i7];
                    i7++;
                } else if (i80 == 12 && (rawMessageInfo.getSyntax().equals(protoSyntax) || (iCharAt11 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0)) {
                    objArr[a.a(i63, 3, 2, 1)] = objArr2[i7];
                    i7++;
                }
                int i82 = i79 * 2;
                Object obj = objArr2[i82];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldD2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldD2 = D(cls, (String) obj);
                    objArr2[i82] = fieldD2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                int i83 = i82 + 1;
                Object obj2 = objArr2[i83];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldD3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldD3 = D(cls, (String) obj2);
                    objArr2[i83] = fieldD3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD3);
                i20 = i7;
                iObjectFieldOffset = iObjectFieldOffset3;
                i21 = i81;
                i22 = 0;
                i19 = i60;
            } else {
                int i84 = i7 + 1;
                java.lang.reflect.Field fieldD4 = D(cls, (String) objArr2[i7]);
                i19 = i60;
                if (i73 == 9 || i73 == 17) {
                    objArr[a.a(i63, 3, 2, 1)] = fieldD4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        i20 = i7 + 2;
                        objArr[a.a(i63, 3, 2, 1)] = objArr2[i84];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (rawMessageInfo.getSyntax() == protoSyntax || (iCharAt11 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0) {
                            i20 = i7 + 2;
                            objArr[a.a(i63, 3, 2, 1)] = objArr2[i84];
                        }
                    } else if (i73 == 50) {
                        int i85 = i62 + 1;
                        iArr[i62] = i63;
                        int i86 = (i63 / 3) * 2;
                        int i87 = i7 + 2;
                        objArr[i86] = objArr2[i84];
                        if ((iCharAt11 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0) {
                            objArr[i86 + 1] = objArr2[i87];
                            i20 = i7 + 3;
                        } else {
                            i20 = i87;
                        }
                        i62 = i85;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                    if ((iCharAt11 & 4096) != 0 || i73 > 17) {
                        iObjectFieldOffset2 = 1048575;
                        i21 = i69;
                        i22 = 0;
                    } else {
                        int i88 = i69 + 1;
                        int iCharAt13 = str.charAt(i69);
                        if (iCharAt13 >= 55296) {
                            int i89 = iCharAt13 & 8191;
                            int i90 = 13;
                            while (true) {
                                i21 = i88 + 1;
                                cCharAt9 = str.charAt(i88);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i89 |= (cCharAt9 & 8191) << i90;
                                i90 += 13;
                                i88 = i21;
                            }
                            iCharAt13 = i89 | (cCharAt9 << i90);
                        } else {
                            i21 = i88;
                        }
                        int i91 = (iCharAt13 / 32) + (i74 * 2);
                        Object obj3 = objArr2[i91];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            fieldD = (java.lang.reflect.Field) obj3;
                        } else {
                            fieldD = D(cls, (String) obj3);
                            objArr2[i91] = fieldD;
                        }
                        iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD);
                        i22 = iCharAt13 % 32;
                    }
                    if (i73 >= 18 && i73 <= 49) {
                        iArr[i61] = iObjectFieldOffset;
                        i61++;
                    }
                }
                i20 = i84;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD4);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i21 = i69;
                    i22 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i21 = i69;
                    i22 = 0;
                }
                if (i73 >= 18) {
                    iArr[i61] = iObjectFieldOffset;
                    i61++;
                }
            }
            int i92 = i63 + 1;
            iArr4[i63] = i70;
            int i93 = i63 + 2;
            String str2 = str;
            iArr4[i92] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & com.p004ironsource.mediationsdk.metadata.a.f25965n) != 0 ? Integer.MIN_VALUE : 0) | (i73 << 20) | iObjectFieldOffset;
            i63 += 3;
            iArr4[i93] = (i22 << 20) | iObjectFieldOffset2;
            i7 = i20;
            i5 = i74;
            length = i17;
            iArr3 = iArr4;
            i60 = i19;
            i31 = i21;
            str = str2;
            i29 = 55296;
        }
        return new MessageSchema(iArr3, objArr, i3, i6, rawMessageInfo.f4908a, iArr, i8, i60, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    public static long w(int i2) {
        return i2 & 1048575;
    }

    public static int x(Object obj, long j) {
        return ((Integer) UnsafeUtil.f4938c.m(obj, j)).intValue();
    }

    public static long y(Object obj, long j) {
        return ((Long) UnsafeUtil.f4938c.m(obj, j)).longValue();
    }

    public final void A(Object obj, int i2, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.b(this.f4891l.a(i2 & 1048575, obj), schema, extensionRegistryLite);
    }

    public final void B(int i2, Reader reader, Object obj) {
        if ((536870912 & i2) != 0) {
            UnsafeUtil.r(obj, i2 & 1048575, reader.readStringRequireUtf8());
        } else if (this.g) {
            UnsafeUtil.r(obj, i2 & 1048575, reader.readString());
        } else {
            UnsafeUtil.r(obj, i2 & 1048575, reader.readBytes());
        }
    }

    public final void C(int i2, Reader reader, Object obj) {
        boolean z2 = (536870912 & i2) != 0;
        ListFieldSchema listFieldSchema = this.f4891l;
        if (z2) {
            reader.readStringListRequireUtf8(listFieldSchema.a(i2 & 1048575, obj));
        } else {
            reader.readStringList(listFieldSchema.a(i2 & 1048575, obj));
        }
    }

    public final void E(Object obj, int i2) {
        int i3 = this.f4885a[i2 + 2];
        long j = 1048575 & i3;
        if (j == 1048575) {
            return;
        }
        UnsafeUtil.p(obj, j, (1 << (i3 >>> 20)) | UnsafeUtil.f4938c.j(obj, j));
    }

    public final void F(Object obj, int i2, int i3) {
        UnsafeUtil.p(obj, this.f4885a[i3 + 2] & 1048575, i2);
    }

    public final int G(int i2, int i3) {
        int[] iArr = this.f4885a;
        int length = (iArr.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = iArr[i5];
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

    public final void H(Object obj, int i2, Object obj2) {
        q.putObject(obj, K(i2) & 1048575, obj2);
        E(obj, i2);
    }

    public final void I(Object obj, int i2, int i3, Object obj2) {
        q.putObject(obj, K(i3) & 1048575, obj2);
        F(obj, i2, i3);
    }

    public final int K(int i2) {
        return this.f4885a[i2 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final void L(Object obj, Writer writer) {
        Map.Entry entry;
        Iterator it;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        MessageSchema<T> messageSchema = this;
        boolean z4 = messageSchema.f;
        ExtensionSchema extensionSchema = messageSchema.f4892n;
        if (z4) {
            FieldSet fieldSetC = extensionSchema.c(obj);
            if (fieldSetC.f4837a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itI = fieldSetC.i();
                entry = (Map.Entry) itI.next();
                it = itI;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = messageSchema.f4885a;
        int length = iArr.length;
        Unsafe unsafe = q;
        int i7 = 0;
        int i8 = 1048575;
        int i9 = 0;
        while (i7 < length) {
            int iK = messageSchema.K(i7);
            int i10 = iArr[i7];
            int iJ = J(iK);
            Map.Entry entry2 = entry;
            if (iJ <= 17) {
                int i11 = iArr[i7 + 2];
                z2 = true;
                int i12 = i11 & 1048575;
                if (i12 != i8) {
                    i9 = i12 == 1048575 ? 0 : unsafe.getInt(obj, i12);
                    i8 = i12;
                }
                int i13 = 1 << (i11 >>> 20);
                int i14 = i9;
                i4 = i13;
                i3 = i8;
                i2 = i14;
            } else {
                int i15 = i8;
                z2 = true;
                i2 = i9;
                i3 = i15;
                i4 = 0;
            }
            while (true) {
                i5 = i3;
                if (entry2 != null && extensionSchema.a(entry2) <= i10) {
                    extensionSchema.j(writer, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    i3 = i5;
                }
            }
            int i16 = iK & 1048575;
            Iterator it2 = it;
            int[] iArr2 = iArr;
            long j = i16;
            switch (iJ) {
                case 0:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeDouble(i10, UnsafeUtil.f4938c.h(obj, j));
                    }
                    break;
                case 1:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeFloat(i10, UnsafeUtil.f4938c.i(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 2:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeInt64(i10, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 3:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeUInt64(i10, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 4:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeInt32(i10, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 5:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeFixed64(i10, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 6:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeFixed32(i10, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 7:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeBool(i10, UnsafeUtil.f4938c.e(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 8:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        M(i10, unsafe.getObject(obj, j), writer);
                    }
                    messageSchema = this;
                    break;
                case 9:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.c(i10, unsafe.getObject(obj, j), messageSchema.k(i7));
                    }
                    break;
                case 10:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.b(i10, (ByteString) unsafe.getObject(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 11:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeUInt32(i10, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 12:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeEnum(i10, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 13:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeSFixed32(i10, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 14:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeSFixed64(i10, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 15:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeSInt32(i10, unsafe.getInt(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 16:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.writeSInt64(i10, unsafe.getLong(obj, j));
                    }
                    messageSchema = this;
                    break;
                case 17:
                    i6 = i5;
                    if (messageSchema.m(obj, i7, i6, i2, i4)) {
                        writer.e(i10, unsafe.getObject(obj, j), messageSchema.k(i7));
                    }
                    break;
                case 18:
                    SchemaUtil.o(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 19:
                    SchemaUtil.r(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 20:
                    SchemaUtil.t(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 21:
                    SchemaUtil.z(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 22:
                    SchemaUtil.s(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 23:
                    SchemaUtil.q(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 24:
                    SchemaUtil.p(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 25:
                    SchemaUtil.n(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 26:
                    int i17 = iArr2[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = SchemaUtil.f4914a;
                    if (list != null && !list.isEmpty()) {
                        writer.writeStringList(i17, list);
                    }
                    i6 = i5;
                    break;
                case 27:
                    int i18 = iArr2[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    Schema schemaK = messageSchema.k(i7);
                    Class cls2 = SchemaUtil.f4914a;
                    if (list2 != null && !list2.isEmpty()) {
                        writer.f(i18, list2, schemaK);
                    }
                    i6 = i5;
                    break;
                case 28:
                    int i19 = iArr2[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = SchemaUtil.f4914a;
                    if (list3 != null && !list3.isEmpty()) {
                        writer.writeBytesList(i19, list3);
                    }
                    i6 = i5;
                    break;
                case 29:
                    z3 = false;
                    SchemaUtil.y(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 30:
                    int i20 = iArr2[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    Class cls4 = SchemaUtil.f4914a;
                    if (list4 == null || list4.isEmpty()) {
                        z3 = false;
                    } else {
                        z3 = false;
                        writer.writeEnumList(i20, list4, false);
                    }
                    i6 = i5;
                    break;
                case 31:
                    z3 = false;
                    SchemaUtil.u(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 32:
                    z3 = false;
                    SchemaUtil.v(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 33:
                    z3 = false;
                    SchemaUtil.w(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 34:
                    z3 = false;
                    SchemaUtil.x(iArr2[i7], (List) unsafe.getObject(obj, j), writer, false);
                    i6 = i5;
                    break;
                case 35:
                    SchemaUtil.o(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 36:
                    SchemaUtil.r(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 37:
                    SchemaUtil.t(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 38:
                    SchemaUtil.z(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 39:
                    SchemaUtil.s(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 40:
                    SchemaUtil.q(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 41:
                    SchemaUtil.p(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 42:
                    SchemaUtil.n(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 43:
                    SchemaUtil.y(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 44:
                    int i21 = iArr2[i7];
                    List list5 = (List) unsafe.getObject(obj, j);
                    Class cls5 = SchemaUtil.f4914a;
                    if (list5 != null && !list5.isEmpty()) {
                        writer.writeEnumList(i21, list5, true);
                    }
                    i6 = i5;
                    break;
                case 45:
                    SchemaUtil.u(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 46:
                    SchemaUtil.v(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 47:
                    SchemaUtil.w(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 48:
                    SchemaUtil.x(iArr2[i7], (List) unsafe.getObject(obj, j), writer, z2);
                    i6 = i5;
                    break;
                case 49:
                    int i22 = iArr2[i7];
                    List list6 = (List) unsafe.getObject(obj, j);
                    Schema schemaK2 = messageSchema.k(i7);
                    Class cls6 = SchemaUtil.f4914a;
                    if (list6 != null && !list6.isEmpty()) {
                        writer.a(i22, list6, schemaK2);
                    }
                    i6 = i5;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        Object objJ = messageSchema.j(i7);
                        MapFieldSchema mapFieldSchema = messageSchema.o;
                        writer.d(i10, mapFieldSchema.forMapMetadata(objJ), mapFieldSchema.forMapData(object));
                    }
                    i6 = i5;
                    break;
                case AD_REWARD_USER_VALUE:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeDouble(i10, ((Double) UnsafeUtil.f4938c.m(obj, j)).doubleValue());
                    }
                    i6 = i5;
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeFloat(i10, ((Float) UnsafeUtil.f4938c.m(obj, j)).floatValue());
                    }
                    i6 = i5;
                    break;
                case 53:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeInt64(i10, y(obj, j));
                    }
                    i6 = i5;
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeUInt64(i10, y(obj, j));
                    }
                    i6 = i5;
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeInt32(i10, x(obj, j));
                    }
                    i6 = i5;
                    break;
                case 56:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeFixed64(i10, y(obj, j));
                    }
                    i6 = i5;
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeFixed32(i10, x(obj, j));
                    }
                    i6 = i5;
                    break;
                case 58:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeBool(i10, ((Boolean) UnsafeUtil.f4938c.m(obj, j)).booleanValue());
                    }
                    i6 = i5;
                    break;
                case 59:
                    if (messageSchema.o(obj, i10, i7)) {
                        M(i10, unsafe.getObject(obj, j), writer);
                    }
                    i6 = i5;
                    break;
                case 60:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.c(i10, unsafe.getObject(obj, j), messageSchema.k(i7));
                    }
                    i6 = i5;
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.b(i10, (ByteString) unsafe.getObject(obj, j));
                    }
                    i6 = i5;
                    break;
                case 62:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeUInt32(i10, x(obj, j));
                    }
                    i6 = i5;
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeEnum(i10, x(obj, j));
                    }
                    i6 = i5;
                    break;
                case 64:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeSFixed32(i10, x(obj, j));
                    }
                    i6 = i5;
                    break;
                case 65:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeSFixed64(i10, y(obj, j));
                    }
                    i6 = i5;
                    break;
                case 66:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeSInt32(i10, x(obj, j));
                    }
                    i6 = i5;
                    break;
                case 67:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.writeSInt64(i10, y(obj, j));
                    }
                    i6 = i5;
                    break;
                case 68:
                    if (messageSchema.o(obj, i10, i7)) {
                        writer.e(i10, unsafe.getObject(obj, j), messageSchema.k(i7));
                    }
                    i6 = i5;
                    break;
                default:
                    i6 = i5;
                    break;
            }
            i7 += 3;
            i9 = i2;
            it = it2;
            iArr = iArr2;
            i8 = i6;
            entry = entry2;
        }
        Iterator it3 = it;
        while (entry != null) {
            extensionSchema.j(writer, entry);
            entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
        }
        UnknownFieldSchema unknownFieldSchema = messageSchema.m;
        unknownFieldSchema.r(unknownFieldSchema.g(obj), writer);
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void a(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        extensionRegistryLite.getClass();
        g(obj);
        p(this.m, this.f4892n, obj, reader, extensionRegistryLite);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x037f A[PHI: r18
  0x037f: PHI (r18v48 int) = 
  (r18v31 int)
  (r18v32 int)
  (r18v33 int)
  (r18v37 int)
  (r18v39 int)
  (r18v40 int)
  (r18v41 int)
  (r18v45 int)
  (r18v49 int)
 binds: [B:215:0x053f, B:211:0x0523, B:207:0x0507, B:179:0x0476, B:161:0x0406, B:157:0x03ec, B:153:0x03d2, B:146:0x039c, B:140:0x037d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int b(AbstractMessageLite abstractMessageLite) {
        int i2;
        int i3;
        int iO;
        int iO2;
        int iO3;
        int iQ;
        int iO4;
        int iQ2;
        int iO5;
        int iO6;
        int iP;
        int i4;
        int iO7;
        int size;
        int i5;
        int iO8;
        int iO9;
        int size2;
        int iO10;
        int iP2;
        int iE;
        int serializedSize;
        int iO11;
        int iO12;
        int iO13;
        int iQ3;
        int iO14;
        int iQ4;
        int iO15;
        MessageSchema<T> messageSchema = this;
        AbstractMessageLite abstractMessageLite2 = abstractMessageLite;
        int i6 = 1;
        Unsafe unsafe = q;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = messageSchema.f4885a;
            if (i7 >= iArr.length) {
                UnknownFieldSchema unknownFieldSchema = messageSchema.m;
                int iH = i9 + unknownFieldSchema.h(unknownFieldSchema.g(abstractMessageLite2));
                if (!messageSchema.f) {
                    return iH;
                }
                SmallSortedMap.AnonymousClass1 anonymousClass1 = messageSchema.f4892n.c(abstractMessageLite2).f4837a;
                int size3 = anonymousClass1.X.size();
                int iD = 0;
                for (int i11 = 0; i11 < size3; i11++) {
                    Map.Entry entryC = anonymousClass1.c(i11);
                    iD += FieldSet.d((FieldSet.FieldDescriptorLite) entryC.getKey(), entryC.getValue());
                }
                for (Map.Entry entry : anonymousClass1.d()) {
                    iD += FieldSet.d((FieldSet.FieldDescriptorLite) entry.getKey(), entry.getValue());
                }
                return iH + iD;
            }
            int iK = messageSchema.K(i7);
            int iJ = J(iK);
            int i12 = iArr[i7];
            int i13 = iArr[i7 + 2];
            int i14 = i13 & 1048575;
            if (iJ <= 17) {
                if (i14 != i10) {
                    i8 = i14 == 1048575 ? 0 : unsafe.getInt(abstractMessageLite2, i14);
                    i10 = i14;
                }
                i2 = i6 << (i13 >>> 20);
            } else {
                i2 = 0;
            }
            long j = iK & 1048575;
            if (iJ >= FieldType.f0.X) {
                int i15 = FieldType.g0.X;
            }
            switch (iJ) {
                case 0:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        iO = CodedOutputStream.o(i12) + 8;
                        i9 += iO;
                    }
                    break;
                case 1:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        iO2 = CodedOutputStream.o(i12);
                        iO6 = iO2 + 4;
                        i9 += iO6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 2:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        long j2 = unsafe.getLong(abstractMessageLite2, j);
                        iO3 = CodedOutputStream.o(i12);
                        iQ = CodedOutputStream.q(j2);
                        i9 += iQ + iO3;
                    }
                    messageSchema = this;
                    break;
                case 3:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        long j3 = unsafe.getLong(abstractMessageLite2, j);
                        iO3 = CodedOutputStream.o(i12);
                        iQ = CodedOutputStream.q(j3);
                        i9 += iQ + iO3;
                    }
                    messageSchema = this;
                    break;
                case 4:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        int i16 = unsafe.getInt(abstractMessageLite2, j);
                        iO4 = CodedOutputStream.o(i12);
                        iQ2 = CodedOutputStream.q(i16);
                        i4 = iQ2 + iO4;
                        i9 += i4;
                    }
                    messageSchema = this;
                    break;
                case 5:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        iO5 = CodedOutputStream.o(i12);
                        iO6 = iO5 + 8;
                        i9 += iO6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 6:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        iO2 = CodedOutputStream.o(i12);
                        iO6 = iO2 + 4;
                        i9 += iO6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 7:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        iO6 = CodedOutputStream.o(i12) + 1;
                        i9 += iO6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 8:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        Object object = unsafe.getObject(abstractMessageLite2, j);
                        i9 = (object instanceof ByteString ? CodedOutputStream.i(i12, (ByteString) object) : CodedOutputStream.n((String) object) + CodedOutputStream.o(i12)) + i9;
                    }
                    messageSchema = this;
                    break;
                case 9:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        Object object2 = unsafe.getObject(abstractMessageLite2, j);
                        Schema schemaK = messageSchema.k(i7);
                        Class cls = SchemaUtil.f4914a;
                        if (object2 instanceof LazyFieldLite) {
                            iP = CodedOutputStream.k((LazyFieldLite) object2) + CodedOutputStream.o(i12);
                        } else {
                            int iO16 = CodedOutputStream.o(i12);
                            int iE2 = ((AbstractMessageLite) ((MessageLite) object2)).e(schemaK);
                            iP = CodedOutputStream.p(iE2) + iE2 + iO16;
                        }
                        i9 += iP;
                    }
                    break;
                case 10:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        i4 = CodedOutputStream.i(i12, (ByteString) unsafe.getObject(abstractMessageLite2, j));
                        i9 += i4;
                    }
                    messageSchema = this;
                    break;
                case 11:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        int i17 = unsafe.getInt(abstractMessageLite2, j);
                        iO4 = CodedOutputStream.o(i12);
                        iQ2 = CodedOutputStream.p(i17);
                        i4 = iQ2 + iO4;
                        i9 += i4;
                    }
                    messageSchema = this;
                    break;
                case 12:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        int i18 = unsafe.getInt(abstractMessageLite2, j);
                        iO4 = CodedOutputStream.o(i12);
                        iQ2 = CodedOutputStream.q(i18);
                        i4 = iQ2 + iO4;
                        i9 += i4;
                    }
                    messageSchema = this;
                    break;
                case 13:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        iO2 = CodedOutputStream.o(i12);
                        iO6 = iO2 + 4;
                        i9 += iO6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 14:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        iO5 = CodedOutputStream.o(i12);
                        iO6 = iO5 + 8;
                        i9 += iO6;
                    }
                    messageSchema = this;
                    abstractMessageLite2 = abstractMessageLite;
                    break;
                case 15:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        int i19 = unsafe.getInt(abstractMessageLite2, j);
                        iO4 = CodedOutputStream.o(i12);
                        iQ2 = CodedOutputStream.l(i19);
                        i4 = iQ2 + iO4;
                        i9 += i4;
                    }
                    messageSchema = this;
                    break;
                case 16:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        long j4 = unsafe.getLong(abstractMessageLite2, j);
                        iO3 = CodedOutputStream.o(i12);
                        iQ = CodedOutputStream.m(j4);
                        i9 += iQ + iO3;
                    }
                    messageSchema = this;
                    break;
                case 17:
                    i3 = i6;
                    if (messageSchema.m(abstractMessageLite2, i7, i10, i8, i2)) {
                        iO = ((AbstractMessageLite) ((MessageLite) unsafe.getObject(abstractMessageLite2, j))).e(messageSchema.k(i7)) + (CodedOutputStream.o(i12) * 2);
                        i9 += iO;
                    }
                    break;
                case 18:
                    i3 = i6;
                    iP = SchemaUtil.c(i12, (List) unsafe.getObject(abstractMessageLite2, j));
                    i9 += iP;
                    break;
                case 19:
                    i3 = i6;
                    iP = SchemaUtil.b(i12, (List) unsafe.getObject(abstractMessageLite2, j));
                    i9 += iP;
                    break;
                case 20:
                    i3 = i6;
                    List list = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls2 = SchemaUtil.f4914a;
                    if (list.size() == 0) {
                        iO7 = 0;
                    } else {
                        iO7 = (CodedOutputStream.o(i12) * list.size()) + SchemaUtil.e(list);
                    }
                    i9 += iO7;
                    break;
                case 21:
                    i3 = i6;
                    List list2 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls3 = SchemaUtil.f4914a;
                    size = list2.size();
                    if (size == 0) {
                        iO7 = 0;
                    } else {
                        i5 = SchemaUtil.i(list2);
                        iO8 = CodedOutputStream.o(i12);
                        iO7 = (iO8 * size) + i5;
                    }
                    i9 += iO7;
                    break;
                case 22:
                    i3 = i6;
                    List list3 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls4 = SchemaUtil.f4914a;
                    size = list3.size();
                    if (size == 0) {
                        iO7 = 0;
                    } else {
                        i5 = SchemaUtil.d(list3);
                        iO8 = CodedOutputStream.o(i12);
                        iO7 = (iO8 * size) + i5;
                    }
                    i9 += iO7;
                    break;
                case 23:
                    i3 = i6;
                    iP = SchemaUtil.c(i12, (List) unsafe.getObject(abstractMessageLite2, j));
                    i9 += iP;
                    break;
                case 24:
                    i3 = i6;
                    iP = SchemaUtil.b(i12, (List) unsafe.getObject(abstractMessageLite2, j));
                    i9 += iP;
                    break;
                case 25:
                    i3 = i6;
                    List list4 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls5 = SchemaUtil.f4914a;
                    int size4 = list4.size();
                    i9 += size4 == 0 ? 0 : (CodedOutputStream.o(i12) + 1) * size4;
                    break;
                case 26:
                    i3 = i6;
                    List list5 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls6 = SchemaUtil.f4914a;
                    int size5 = list5.size();
                    if (size5 == 0) {
                        iO7 = 0;
                    } else {
                        iO7 = CodedOutputStream.o(i12) * size5;
                        if (list5 instanceof LazyStringList) {
                            LazyStringList lazyStringList = (LazyStringList) list5;
                            for (int i20 = 0; i20 < size5; i20++) {
                                Object raw = lazyStringList.getRaw(i20);
                                iO7 = (raw instanceof ByteString ? CodedOutputStream.j((ByteString) raw) : CodedOutputStream.n((String) raw)) + iO7;
                            }
                        } else {
                            for (int i21 = 0; i21 < size5; i21++) {
                                Object obj = list5.get(i21);
                                iO7 = (obj instanceof ByteString ? CodedOutputStream.j((ByteString) obj) : CodedOutputStream.n((String) obj)) + iO7;
                            }
                        }
                    }
                    i9 += iO7;
                    break;
                case 27:
                    i3 = i6;
                    List list6 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Schema schemaK2 = messageSchema.k(i7);
                    Class cls7 = SchemaUtil.f4914a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iO9 = 0;
                    } else {
                        iO9 = CodedOutputStream.o(i12) * size6;
                        for (int i22 = 0; i22 < size6; i22++) {
                            Object obj2 = list6.get(i22);
                            if (obj2 instanceof LazyFieldLite) {
                                iO9 = CodedOutputStream.k((LazyFieldLite) obj2) + iO9;
                            } else {
                                int iE3 = ((AbstractMessageLite) ((MessageLite) obj2)).e(schemaK2);
                                iO9 = CodedOutputStream.p(iE3) + iE3 + iO9;
                            }
                        }
                    }
                    i9 += iO9;
                    break;
                case 28:
                    i3 = i6;
                    List list7 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls8 = SchemaUtil.f4914a;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iO7 = 0;
                    } else {
                        iO7 = CodedOutputStream.o(i12) * size7;
                        for (int i23 = 0; i23 < list7.size(); i23++) {
                            iO7 += CodedOutputStream.j((ByteString) list7.get(i23));
                        }
                    }
                    i9 += iO7;
                    break;
                case 29:
                    i3 = i6;
                    List list8 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls9 = SchemaUtil.f4914a;
                    size = list8.size();
                    if (size == 0) {
                        iO7 = 0;
                    } else {
                        i5 = SchemaUtil.h(list8);
                        iO8 = CodedOutputStream.o(i12);
                        iO7 = (iO8 * size) + i5;
                    }
                    i9 += iO7;
                    break;
                case 30:
                    i3 = i6;
                    List list9 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls10 = SchemaUtil.f4914a;
                    size = list9.size();
                    if (size == 0) {
                        iO7 = 0;
                    } else {
                        i5 = SchemaUtil.a(list9);
                        iO8 = CodedOutputStream.o(i12);
                        iO7 = (iO8 * size) + i5;
                    }
                    i9 += iO7;
                    break;
                case 31:
                    i3 = i6;
                    iP = SchemaUtil.b(i12, (List) unsafe.getObject(abstractMessageLite2, j));
                    i9 += iP;
                    break;
                case 32:
                    i3 = i6;
                    iP = SchemaUtil.c(i12, (List) unsafe.getObject(abstractMessageLite2, j));
                    i9 += iP;
                    break;
                case 33:
                    i3 = i6;
                    List list10 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls11 = SchemaUtil.f4914a;
                    size = list10.size();
                    if (size == 0) {
                        iO7 = 0;
                    } else {
                        i5 = SchemaUtil.f(list10);
                        iO8 = CodedOutputStream.o(i12);
                        iO7 = (iO8 * size) + i5;
                    }
                    i9 += iO7;
                    break;
                case 34:
                    i3 = i6;
                    List list11 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls12 = SchemaUtil.f4914a;
                    size = list11.size();
                    if (size == 0) {
                        iO7 = 0;
                    } else {
                        i5 = SchemaUtil.g(list11);
                        iO8 = CodedOutputStream.o(i12);
                        iO7 = (iO8 * size) + i5;
                    }
                    i9 += iO7;
                    break;
                case 35:
                    i3 = i6;
                    List list12 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls13 = SchemaUtil.f4914a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 36:
                    i3 = i6;
                    List list13 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls14 = SchemaUtil.f4914a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 37:
                    i3 = i6;
                    size2 = SchemaUtil.e((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 38:
                    i3 = i6;
                    size2 = SchemaUtil.i((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 39:
                    i3 = i6;
                    size2 = SchemaUtil.d((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 40:
                    i3 = i6;
                    List list14 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls15 = SchemaUtil.f4914a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 41:
                    i3 = i6;
                    List list15 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls16 = SchemaUtil.f4914a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 42:
                    i3 = i6;
                    List list16 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls17 = SchemaUtil.f4914a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 43:
                    i3 = i6;
                    size2 = SchemaUtil.h((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 44:
                    i3 = i6;
                    size2 = SchemaUtil.a((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 45:
                    i3 = i6;
                    List list17 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls18 = SchemaUtil.f4914a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 46:
                    i3 = i6;
                    List list18 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Class cls19 = SchemaUtil.f4914a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 47:
                    i3 = i6;
                    size2 = SchemaUtil.f((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 48:
                    i3 = i6;
                    size2 = SchemaUtil.g((List) unsafe.getObject(abstractMessageLite2, j));
                    if (size2 > 0) {
                        iO10 = CodedOutputStream.o(i12);
                        iP2 = CodedOutputStream.p(size2);
                        i9 += iP2 + iO10 + size2;
                    }
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractMessageLite2, j);
                    Schema schemaK3 = messageSchema.k(i7);
                    Class cls20 = SchemaUtil.f4914a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        iE = 0;
                    } else {
                        int i24 = 0;
                        iE = 0;
                        while (i24 < size8) {
                            iE += ((AbstractMessageLite) ((MessageLite) list19.get(i24))).e(schemaK3) + (CodedOutputStream.o(i12) * 2);
                            i24++;
                            i6 = i6;
                        }
                    }
                    i3 = i6;
                    i9 += iE;
                    break;
                case 50:
                    serializedSize = messageSchema.o.getSerializedSize(i12, unsafe.getObject(abstractMessageLite2, j), messageSchema.j(i7));
                    i9 += serializedSize;
                    i3 = i6;
                    break;
                case AD_REWARD_USER_VALUE:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO11 = CodedOutputStream.o(i12);
                        iO15 = iO11 + 8;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO12 = CodedOutputStream.o(i12);
                        iO15 = iO12 + 4;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 53:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        long jY = y(abstractMessageLite2, j);
                        iO13 = CodedOutputStream.o(i12);
                        iQ3 = CodedOutputStream.q(jY);
                        i9 += iQ3 + iO13;
                    }
                    i3 = i6;
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        long jY2 = y(abstractMessageLite2, j);
                        iO13 = CodedOutputStream.o(i12);
                        iQ3 = CodedOutputStream.q(jY2);
                        i9 += iQ3 + iO13;
                    }
                    i3 = i6;
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        int iX = x(abstractMessageLite2, j);
                        iO14 = CodedOutputStream.o(i12);
                        iQ4 = CodedOutputStream.q(iX);
                        iO15 = iQ4 + iO14;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 56:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO11 = CodedOutputStream.o(i12);
                        iO15 = iO11 + 8;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO12 = CodedOutputStream.o(i12);
                        iO15 = iO12 + 4;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 58:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO15 = CodedOutputStream.o(i12) + i6;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 59:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        Object object3 = unsafe.getObject(abstractMessageLite2, j);
                        i9 = (object3 instanceof ByteString ? CodedOutputStream.i(i12, (ByteString) object3) : CodedOutputStream.n((String) object3) + CodedOutputStream.o(i12)) + i9;
                    }
                    i3 = i6;
                    break;
                case 60:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        Object object4 = unsafe.getObject(abstractMessageLite2, j);
                        Schema schemaK4 = messageSchema.k(i7);
                        Class cls21 = SchemaUtil.f4914a;
                        if (object4 instanceof LazyFieldLite) {
                            serializedSize = CodedOutputStream.k((LazyFieldLite) object4) + CodedOutputStream.o(i12);
                        } else {
                            int iO17 = CodedOutputStream.o(i12);
                            int iE4 = ((AbstractMessageLite) ((MessageLite) object4)).e(schemaK4);
                            serializedSize = CodedOutputStream.p(iE4) + iE4 + iO17;
                        }
                        i9 += serializedSize;
                    }
                    i3 = i6;
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO15 = CodedOutputStream.i(i12, (ByteString) unsafe.getObject(abstractMessageLite2, j));
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 62:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        int iX2 = x(abstractMessageLite2, j);
                        iO14 = CodedOutputStream.o(i12);
                        iQ4 = CodedOutputStream.p(iX2);
                        iO15 = iQ4 + iO14;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        int iX3 = x(abstractMessageLite2, j);
                        iO14 = CodedOutputStream.o(i12);
                        iQ4 = CodedOutputStream.q(iX3);
                        iO15 = iQ4 + iO14;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 64:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO12 = CodedOutputStream.o(i12);
                        iO15 = iO12 + 4;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 65:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO11 = CodedOutputStream.o(i12);
                        iO15 = iO11 + 8;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 66:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        int iX4 = x(abstractMessageLite2, j);
                        iO14 = CodedOutputStream.o(i12);
                        iQ4 = CodedOutputStream.l(iX4);
                        iO15 = iQ4 + iO14;
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                case 67:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        long jY3 = y(abstractMessageLite2, j);
                        iO13 = CodedOutputStream.o(i12);
                        iQ3 = CodedOutputStream.m(jY3);
                        i9 += iQ3 + iO13;
                    }
                    i3 = i6;
                    break;
                case 68:
                    if (messageSchema.o(abstractMessageLite2, i12, i7)) {
                        iO15 = ((AbstractMessageLite) ((MessageLite) unsafe.getObject(abstractMessageLite2, j))).e(messageSchema.k(i7)) + (CodedOutputStream.o(i12) * 2);
                        i9 += iO15;
                    }
                    i3 = i6;
                    break;
                default:
                    i3 = i6;
                    break;
            }
            i7 += 3;
            i6 = i3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e4 A[PHI: r3
  0x00e4: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0219, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final int c(GeneratedMessageLite generatedMessageLite) {
        int i2;
        int iB;
        int i3;
        int iJ;
        int i4;
        int[] iArr = this.f4885a;
        int length = iArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iK = K(i6);
            int i7 = iArr[i6];
            long j = 1048575 & iK;
            int i8 = 1237;
            int iHashCode = 37;
            switch (J(iK)) {
                case 0:
                    i2 = i5 * 53;
                    iB = Internal.b(Double.doubleToLongBits(UnsafeUtil.f4938c.h(generatedMessageLite, j)));
                    i5 = iB + i2;
                    break;
                case 1:
                    i2 = i5 * 53;
                    iB = Float.floatToIntBits(UnsafeUtil.f4938c.i(generatedMessageLite, j));
                    i5 = iB + i2;
                    break;
                case 2:
                    i2 = i5 * 53;
                    iB = Internal.b(UnsafeUtil.f4938c.l(generatedMessageLite, j));
                    i5 = iB + i2;
                    break;
                case 3:
                    i2 = i5 * 53;
                    iB = Internal.b(UnsafeUtil.f4938c.l(generatedMessageLite, j));
                    i5 = iB + i2;
                    break;
                case 4:
                    i3 = i5 * 53;
                    iJ = UnsafeUtil.f4938c.j(generatedMessageLite, j);
                    i5 = i3 + iJ;
                    break;
                case 5:
                    i2 = i5 * 53;
                    iB = Internal.b(UnsafeUtil.f4938c.l(generatedMessageLite, j));
                    i5 = iB + i2;
                    break;
                case 6:
                    i3 = i5 * 53;
                    iJ = UnsafeUtil.f4938c.j(generatedMessageLite, j);
                    i5 = i3 + iJ;
                    break;
                case 7:
                    i4 = i5 * 53;
                    boolean zE = UnsafeUtil.f4938c.e(generatedMessageLite, j);
                    Charset charset = Internal.f4857a;
                    if (zE) {
                        i8 = 1231;
                    }
                    i5 = i8 + i4;
                    break;
                case 8:
                    i2 = i5 * 53;
                    iB = ((String) UnsafeUtil.f4938c.m(generatedMessageLite, j)).hashCode();
                    i5 = iB + i2;
                    break;
                case 9:
                    Object objM = UnsafeUtil.f4938c.m(generatedMessageLite, j);
                    if (objM != null) {
                        iHashCode = objM.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case 10:
                    i2 = i5 * 53;
                    iB = UnsafeUtil.f4938c.m(generatedMessageLite, j).hashCode();
                    i5 = iB + i2;
                    break;
                case 11:
                    i3 = i5 * 53;
                    iJ = UnsafeUtil.f4938c.j(generatedMessageLite, j);
                    i5 = i3 + iJ;
                    break;
                case 12:
                    i3 = i5 * 53;
                    iJ = UnsafeUtil.f4938c.j(generatedMessageLite, j);
                    i5 = i3 + iJ;
                    break;
                case 13:
                    i3 = i5 * 53;
                    iJ = UnsafeUtil.f4938c.j(generatedMessageLite, j);
                    i5 = i3 + iJ;
                    break;
                case 14:
                    i2 = i5 * 53;
                    iB = Internal.b(UnsafeUtil.f4938c.l(generatedMessageLite, j));
                    i5 = iB + i2;
                    break;
                case 15:
                    i3 = i5 * 53;
                    iJ = UnsafeUtil.f4938c.j(generatedMessageLite, j);
                    i5 = i3 + iJ;
                    break;
                case 16:
                    i2 = i5 * 53;
                    iB = Internal.b(UnsafeUtil.f4938c.l(generatedMessageLite, j));
                    i5 = iB + i2;
                    break;
                case 17:
                    Object objM2 = UnsafeUtil.f4938c.m(generatedMessageLite, j);
                    if (objM2 != null) {
                        iHashCode = objM2.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
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
                    i2 = i5 * 53;
                    iB = UnsafeUtil.f4938c.m(generatedMessageLite, j).hashCode();
                    i5 = iB + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    iB = UnsafeUtil.f4938c.m(generatedMessageLite, j).hashCode();
                    i5 = iB + i2;
                    break;
                case AD_REWARD_USER_VALUE:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = Internal.b(Double.doubleToLongBits(((Double) UnsafeUtil.f4938c.m(generatedMessageLite, j)).doubleValue()));
                        i5 = iB + i2;
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = Float.floatToIntBits(((Float) UnsafeUtil.f4938c.m(generatedMessageLite, j)).floatValue());
                        i5 = iB + i2;
                    }
                    break;
                case 53:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = Internal.b(y(generatedMessageLite, j));
                        i5 = iB + i2;
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = Internal.b(y(generatedMessageLite, j));
                        i5 = iB + i2;
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (o(generatedMessageLite, i7, i6)) {
                        i3 = i5 * 53;
                        iJ = x(generatedMessageLite, j);
                        i5 = i3 + iJ;
                    }
                    break;
                case 56:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = Internal.b(y(generatedMessageLite, j));
                        i5 = iB + i2;
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (o(generatedMessageLite, i7, i6)) {
                        i3 = i5 * 53;
                        iJ = x(generatedMessageLite, j);
                        i5 = i3 + iJ;
                    }
                    break;
                case 58:
                    if (o(generatedMessageLite, i7, i6)) {
                        i4 = i5 * 53;
                        boolean zBooleanValue = ((Boolean) UnsafeUtil.f4938c.m(generatedMessageLite, j)).booleanValue();
                        Charset charset2 = Internal.f4857a;
                        if (zBooleanValue) {
                            i8 = 1231;
                        }
                        i5 = i8 + i4;
                    }
                    break;
                case 59:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = ((String) UnsafeUtil.f4938c.m(generatedMessageLite, j)).hashCode();
                        i5 = iB + i2;
                    }
                    break;
                case 60:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = UnsafeUtil.f4938c.m(generatedMessageLite, j).hashCode();
                        i5 = iB + i2;
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = UnsafeUtil.f4938c.m(generatedMessageLite, j).hashCode();
                        i5 = iB + i2;
                    }
                    break;
                case 62:
                    if (o(generatedMessageLite, i7, i6)) {
                        i3 = i5 * 53;
                        iJ = x(generatedMessageLite, j);
                        i5 = i3 + iJ;
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (o(generatedMessageLite, i7, i6)) {
                        i3 = i5 * 53;
                        iJ = x(generatedMessageLite, j);
                        i5 = i3 + iJ;
                    }
                    break;
                case 64:
                    if (o(generatedMessageLite, i7, i6)) {
                        i3 = i5 * 53;
                        iJ = x(generatedMessageLite, j);
                        i5 = i3 + iJ;
                    }
                    break;
                case 65:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = Internal.b(y(generatedMessageLite, j));
                        i5 = iB + i2;
                    }
                    break;
                case 66:
                    if (o(generatedMessageLite, i7, i6)) {
                        i3 = i5 * 53;
                        iJ = x(generatedMessageLite, j);
                        i5 = i3 + iJ;
                    }
                    break;
                case 67:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = Internal.b(y(generatedMessageLite, j));
                        i5 = iB + i2;
                    }
                    break;
                case 68:
                    if (o(generatedMessageLite, i7, i6)) {
                        i2 = i5 * 53;
                        iB = UnsafeUtil.f4938c.m(generatedMessageLite, j).hashCode();
                        i5 = iB + i2;
                    }
                    break;
            }
        }
        int iHashCode2 = this.m.g(generatedMessageLite).hashCode() + (i5 * 53);
        return this.f ? (iHashCode2 * 53) + this.f4892n.c(generatedMessageLite).f4837a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void d(Object obj, Writer writer) {
        Iterator it;
        Map.Entry entry;
        if (writer.fieldOrder() != Writer.FieldOrder.f4947Y) {
            L(obj, writer);
            return;
        }
        UnknownFieldSchema unknownFieldSchema = this.m;
        unknownFieldSchema.r(unknownFieldSchema.g(obj), writer);
        boolean z2 = this.f;
        ExtensionSchema extensionSchema = this.f4892n;
        if (z2) {
            FieldSet fieldSetC = extensionSchema.c(obj);
            if (fieldSetC.f4837a.isEmpty()) {
                it = null;
                entry = null;
            } else {
                SmallSortedMap.AnonymousClass1 anonymousClass1 = fieldSetC.f4837a;
                if (anonymousClass1.isEmpty()) {
                    it = Collections.emptyIterator();
                } else if (fieldSetC.f4839c) {
                    if (anonymousClass1.g0 == null) {
                        anonymousClass1.g0 = new SmallSortedMap.DescendingEntrySet();
                    }
                    it = new LazyField.LazyIterator(anonymousClass1.g0.iterator());
                } else {
                    if (anonymousClass1.g0 == null) {
                        anonymousClass1.g0 = new SmallSortedMap.DescendingEntrySet();
                    }
                    it = anonymousClass1.g0.iterator();
                }
                entry = (Map.Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int[] iArr = this.f4885a;
        for (int length = iArr.length - 3; length >= 0; length -= 3) {
            int iK = K(length);
            int i2 = iArr[length];
            while (entry != null && extensionSchema.a(entry) > i2) {
                extensionSchema.j(writer, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            switch (J(iK)) {
                case 0:
                    if (l(obj, length)) {
                        writer.writeDouble(i2, UnsafeUtil.f4938c.h(obj, iK & 1048575));
                    }
                    break;
                case 1:
                    if (l(obj, length)) {
                        writer.writeFloat(i2, UnsafeUtil.f4938c.i(obj, iK & 1048575));
                    }
                    break;
                case 2:
                    if (l(obj, length)) {
                        writer.writeInt64(i2, UnsafeUtil.f4938c.l(obj, iK & 1048575));
                    }
                    break;
                case 3:
                    if (l(obj, length)) {
                        writer.writeUInt64(i2, UnsafeUtil.f4938c.l(obj, iK & 1048575));
                    }
                    break;
                case 4:
                    if (l(obj, length)) {
                        writer.writeInt32(i2, UnsafeUtil.f4938c.j(obj, iK & 1048575));
                    }
                    break;
                case 5:
                    if (l(obj, length)) {
                        writer.writeFixed64(i2, UnsafeUtil.f4938c.l(obj, iK & 1048575));
                    }
                    break;
                case 6:
                    if (l(obj, length)) {
                        writer.writeFixed32(i2, UnsafeUtil.f4938c.j(obj, iK & 1048575));
                    }
                    break;
                case 7:
                    if (l(obj, length)) {
                        writer.writeBool(i2, UnsafeUtil.f4938c.e(obj, iK & 1048575));
                    }
                    break;
                case 8:
                    if (l(obj, length)) {
                        M(i2, UnsafeUtil.f4938c.m(obj, iK & 1048575), writer);
                    }
                    break;
                case 9:
                    if (l(obj, length)) {
                        writer.c(i2, UnsafeUtil.f4938c.m(obj, iK & 1048575), k(length));
                    }
                    break;
                case 10:
                    if (l(obj, length)) {
                        writer.b(i2, (ByteString) UnsafeUtil.f4938c.m(obj, iK & 1048575));
                    }
                    break;
                case 11:
                    if (l(obj, length)) {
                        writer.writeUInt32(i2, UnsafeUtil.f4938c.j(obj, iK & 1048575));
                    }
                    break;
                case 12:
                    if (l(obj, length)) {
                        writer.writeEnum(i2, UnsafeUtil.f4938c.j(obj, iK & 1048575));
                    }
                    break;
                case 13:
                    if (l(obj, length)) {
                        writer.writeSFixed32(i2, UnsafeUtil.f4938c.j(obj, iK & 1048575));
                    }
                    break;
                case 14:
                    if (l(obj, length)) {
                        writer.writeSFixed64(i2, UnsafeUtil.f4938c.l(obj, iK & 1048575));
                    }
                    break;
                case 15:
                    if (l(obj, length)) {
                        writer.writeSInt32(i2, UnsafeUtil.f4938c.j(obj, iK & 1048575));
                    }
                    break;
                case 16:
                    if (l(obj, length)) {
                        writer.writeSInt64(i2, UnsafeUtil.f4938c.l(obj, iK & 1048575));
                    }
                    break;
                case 17:
                    if (l(obj, length)) {
                        writer.e(i2, UnsafeUtil.f4938c.m(obj, iK & 1048575), k(length));
                    }
                    break;
                case 18:
                    SchemaUtil.o(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 19:
                    SchemaUtil.r(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 20:
                    SchemaUtil.t(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 21:
                    SchemaUtil.z(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 22:
                    SchemaUtil.s(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 23:
                    SchemaUtil.q(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 24:
                    SchemaUtil.p(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 25:
                    SchemaUtil.n(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 26:
                    int i3 = iArr[length];
                    List list = (List) UnsafeUtil.f4938c.m(obj, iK & 1048575);
                    Class cls = SchemaUtil.f4914a;
                    if (list != null && !list.isEmpty()) {
                        writer.writeStringList(i3, list);
                    }
                    break;
                case 27:
                    int i4 = iArr[length];
                    List list2 = (List) UnsafeUtil.f4938c.m(obj, iK & 1048575);
                    Schema schemaK = k(length);
                    Class cls2 = SchemaUtil.f4914a;
                    if (list2 != null && !list2.isEmpty()) {
                        writer.f(i4, list2, schemaK);
                    }
                    break;
                case 28:
                    int i5 = iArr[length];
                    List list3 = (List) UnsafeUtil.f4938c.m(obj, iK & 1048575);
                    Class cls3 = SchemaUtil.f4914a;
                    if (list3 != null && !list3.isEmpty()) {
                        writer.writeBytesList(i5, list3);
                    }
                    break;
                case 29:
                    SchemaUtil.y(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 30:
                    int i6 = iArr[length];
                    List list4 = (List) UnsafeUtil.f4938c.m(obj, iK & 1048575);
                    Class cls4 = SchemaUtil.f4914a;
                    if (list4 != null && !list4.isEmpty()) {
                        writer.writeEnumList(i6, list4, false);
                    }
                    break;
                case 31:
                    SchemaUtil.u(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 32:
                    SchemaUtil.v(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 33:
                    SchemaUtil.w(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 34:
                    SchemaUtil.x(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, false);
                    break;
                case 35:
                    SchemaUtil.o(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 36:
                    SchemaUtil.r(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 37:
                    SchemaUtil.t(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 38:
                    SchemaUtil.z(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 39:
                    SchemaUtil.s(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 40:
                    SchemaUtil.q(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 41:
                    SchemaUtil.p(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 42:
                    SchemaUtil.n(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 43:
                    SchemaUtil.y(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 44:
                    int i7 = iArr[length];
                    List list5 = (List) UnsafeUtil.f4938c.m(obj, iK & 1048575);
                    Class cls5 = SchemaUtil.f4914a;
                    if (list5 != null && !list5.isEmpty()) {
                        writer.writeEnumList(i7, list5, true);
                    }
                    break;
                case 45:
                    SchemaUtil.u(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 46:
                    SchemaUtil.v(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 47:
                    SchemaUtil.w(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 48:
                    SchemaUtil.x(iArr[length], (List) UnsafeUtil.f4938c.m(obj, iK & 1048575), writer, true);
                    break;
                case 49:
                    int i8 = iArr[length];
                    List list6 = (List) UnsafeUtil.f4938c.m(obj, iK & 1048575);
                    Schema schemaK2 = k(length);
                    Class cls6 = SchemaUtil.f4914a;
                    if (list6 != null && !list6.isEmpty()) {
                        writer.a(i8, list6, schemaK2);
                    }
                    break;
                case 50:
                    Object objM = UnsafeUtil.f4938c.m(obj, iK & 1048575);
                    if (objM != null) {
                        Object objJ = j(length);
                        MapFieldSchema mapFieldSchema = this.o;
                        writer.d(i2, mapFieldSchema.forMapMetadata(objJ), mapFieldSchema.forMapData(objM));
                    }
                    break;
                case AD_REWARD_USER_VALUE:
                    if (o(obj, i2, length)) {
                        writer.writeDouble(i2, ((Double) UnsafeUtil.f4938c.m(obj, iK & 1048575)).doubleValue());
                    }
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    if (o(obj, i2, length)) {
                        writer.writeFloat(i2, ((Float) UnsafeUtil.f4938c.m(obj, iK & 1048575)).floatValue());
                    }
                    break;
                case 53:
                    if (o(obj, i2, length)) {
                        writer.writeInt64(i2, y(obj, iK & 1048575));
                    }
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    if (o(obj, i2, length)) {
                        writer.writeUInt64(i2, y(obj, iK & 1048575));
                    }
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    if (o(obj, i2, length)) {
                        writer.writeInt32(i2, x(obj, iK & 1048575));
                    }
                    break;
                case 56:
                    if (o(obj, i2, length)) {
                        writer.writeFixed64(i2, y(obj, iK & 1048575));
                    }
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    if (o(obj, i2, length)) {
                        writer.writeFixed32(i2, x(obj, iK & 1048575));
                    }
                    break;
                case 58:
                    if (o(obj, i2, length)) {
                        writer.writeBool(i2, ((Boolean) UnsafeUtil.f4938c.m(obj, iK & 1048575)).booleanValue());
                    }
                    break;
                case 59:
                    if (o(obj, i2, length)) {
                        M(i2, UnsafeUtil.f4938c.m(obj, iK & 1048575), writer);
                    }
                    break;
                case 60:
                    if (o(obj, i2, length)) {
                        writer.c(i2, UnsafeUtil.f4938c.m(obj, iK & 1048575), k(length));
                    }
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    if (o(obj, i2, length)) {
                        writer.b(i2, (ByteString) UnsafeUtil.f4938c.m(obj, iK & 1048575));
                    }
                    break;
                case 62:
                    if (o(obj, i2, length)) {
                        writer.writeUInt32(i2, x(obj, iK & 1048575));
                    }
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    if (o(obj, i2, length)) {
                        writer.writeEnum(i2, x(obj, iK & 1048575));
                    }
                    break;
                case 64:
                    if (o(obj, i2, length)) {
                        writer.writeSFixed32(i2, x(obj, iK & 1048575));
                    }
                    break;
                case 65:
                    if (o(obj, i2, length)) {
                        writer.writeSFixed64(i2, y(obj, iK & 1048575));
                    }
                    break;
                case 66:
                    if (o(obj, i2, length)) {
                        writer.writeSInt32(i2, x(obj, iK & 1048575));
                    }
                    break;
                case 67:
                    if (o(obj, i2, length)) {
                        writer.writeSInt64(i2, y(obj, iK & 1048575));
                    }
                    break;
                case 68:
                    if (o(obj, i2, length)) {
                        writer.e(i2, UnsafeUtil.f4938c.m(obj, iK & 1048575), k(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            extensionSchema.j(writer, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean e(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.f4885a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            boolean zL = true;
            if (i2 < length) {
                int iK = K(i2);
                long j = iK & 1048575;
                switch (J(iK)) {
                    case 0:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
                            if (Double.doubleToLongBits(memoryAccessor.h(generatedMessageLite, j)) != Double.doubleToLongBits(memoryAccessor.h(generatedMessageLite2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 1:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f4938c;
                            if (Float.floatToIntBits(memoryAccessor2.i(generatedMessageLite, j)) != Float.floatToIntBits(memoryAccessor2.i(generatedMessageLite2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 2:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.f4938c;
                            if (memoryAccessor3.l(generatedMessageLite, j) != memoryAccessor3.l(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 3:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor4 = UnsafeUtil.f4938c;
                            if (memoryAccessor4.l(generatedMessageLite, j) != memoryAccessor4.l(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 4:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor5 = UnsafeUtil.f4938c;
                            if (memoryAccessor5.j(generatedMessageLite, j) != memoryAccessor5.j(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 5:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor6 = UnsafeUtil.f4938c;
                            if (memoryAccessor6.l(generatedMessageLite, j) != memoryAccessor6.l(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 6:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor7 = UnsafeUtil.f4938c;
                            if (memoryAccessor7.j(generatedMessageLite, j) != memoryAccessor7.j(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 7:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor8 = UnsafeUtil.f4938c;
                            if (memoryAccessor8.e(generatedMessageLite, j) != memoryAccessor8.e(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 8:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor9 = UnsafeUtil.f4938c;
                            if (!SchemaUtil.l(memoryAccessor9.m(generatedMessageLite, j), memoryAccessor9.m(generatedMessageLite2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 9:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor10 = UnsafeUtil.f4938c;
                            if (!SchemaUtil.l(memoryAccessor10.m(generatedMessageLite, j), memoryAccessor10.m(generatedMessageLite2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 10:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor11 = UnsafeUtil.f4938c;
                            if (!SchemaUtil.l(memoryAccessor11.m(generatedMessageLite, j), memoryAccessor11.m(generatedMessageLite2, j))) {
                                zL = false;
                            }
                        }
                        break;
                    case 11:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor12 = UnsafeUtil.f4938c;
                            if (memoryAccessor12.j(generatedMessageLite, j) != memoryAccessor12.j(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 12:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor13 = UnsafeUtil.f4938c;
                            if (memoryAccessor13.j(generatedMessageLite, j) != memoryAccessor13.j(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 13:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor14 = UnsafeUtil.f4938c;
                            if (memoryAccessor14.j(generatedMessageLite, j) != memoryAccessor14.j(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 14:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor15 = UnsafeUtil.f4938c;
                            if (memoryAccessor15.l(generatedMessageLite, j) != memoryAccessor15.l(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 15:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor16 = UnsafeUtil.f4938c;
                            if (memoryAccessor16.j(generatedMessageLite, j) != memoryAccessor16.j(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 16:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor17 = UnsafeUtil.f4938c;
                            if (memoryAccessor17.l(generatedMessageLite, j) != memoryAccessor17.l(generatedMessageLite2, j)) {
                                zL = false;
                            }
                        }
                        break;
                    case 17:
                        if (!f(generatedMessageLite, generatedMessageLite2, i2)) {
                            zL = false;
                        } else {
                            UnsafeUtil.MemoryAccessor memoryAccessor18 = UnsafeUtil.f4938c;
                            if (!SchemaUtil.l(memoryAccessor18.m(generatedMessageLite, j), memoryAccessor18.m(generatedMessageLite2, j))) {
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
                        UnsafeUtil.MemoryAccessor memoryAccessor19 = UnsafeUtil.f4938c;
                        zL = SchemaUtil.l(memoryAccessor19.m(generatedMessageLite, j), memoryAccessor19.m(generatedMessageLite2, j));
                        break;
                    case 50:
                        UnsafeUtil.MemoryAccessor memoryAccessor20 = UnsafeUtil.f4938c;
                        zL = SchemaUtil.l(memoryAccessor20.m(generatedMessageLite, j), memoryAccessor20.m(generatedMessageLite2, j));
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
                        long j2 = iArr[i2 + 2] & 1048575;
                        UnsafeUtil.MemoryAccessor memoryAccessor21 = UnsafeUtil.f4938c;
                        if (memoryAccessor21.j(generatedMessageLite, j2) != memoryAccessor21.j(generatedMessageLite2, j2) || !SchemaUtil.l(memoryAccessor21.m(generatedMessageLite, j), memoryAccessor21.m(generatedMessageLite2, j))) {
                            zL = false;
                        }
                        break;
                }
                if (zL) {
                    i2 += 3;
                }
            } else {
                UnknownFieldSchema unknownFieldSchema = this.m;
                if (unknownFieldSchema.g(generatedMessageLite).equals(unknownFieldSchema.g(generatedMessageLite2))) {
                    if (!this.f) {
                        return true;
                    }
                    ExtensionSchema extensionSchema = this.f4892n;
                    return extensionSchema.c(generatedMessageLite).equals(extensionSchema.c(generatedMessageLite2));
                }
            }
        }
        return false;
    }

    public final boolean f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i2) {
        return l(generatedMessageLite, i2) == l(generatedMessageLite2, i2);
    }

    public final Object h(Object obj, int i2, Object obj2, UnknownFieldSchema unknownFieldSchema, Object obj3) {
        Internal.EnumVerifier enumVerifierI;
        int i3 = this.f4885a[i2];
        Object objM = UnsafeUtil.f4938c.m(obj, K(i2) & 1048575);
        if (objM == null || (enumVerifierI = i(i2)) == null) {
            return obj2;
        }
        MapFieldSchema mapFieldSchema = this.o;
        MapFieldLite mapFieldLiteForMutableMapData = mapFieldSchema.forMutableMapData(objM);
        MapEntryLite.Metadata metadataForMapMetadata = mapFieldSchema.forMapMetadata(j(i2));
        Iterator it = mapFieldLiteForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!enumVerifierI.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = unknownFieldSchema.f(obj3);
                }
                ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(MapEntryLite.a(metadataForMapMetadata, entry.getKey(), entry.getValue()));
                CodedOutputStream codedOutputStream = codedBuilder.f4749a;
                try {
                    MapEntryLite.b(codedOutputStream, metadataForMapMetadata, entry.getKey(), entry.getValue());
                    CodedOutputStream.ArrayEncoder arrayEncoder = (CodedOutputStream.ArrayEncoder) codedOutputStream;
                    if (arrayEncoder.f4779e - arrayEncoder.f != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    unknownFieldSchema.d(obj2, i3, new ByteString.LiteralByteString(codedBuilder.f4750b));
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return obj2;
    }

    public final Internal.EnumVerifier i(int i2) {
        return (Internal.EnumVerifier) this.f4886b[a.a(i2, 3, 2, 1)];
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final boolean isInitialized(Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.f4890i) {
            int i7 = this.f4889h[i6];
            int[] iArr = this.f4885a;
            int i8 = iArr[i7];
            int iK = K(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = q.getInt(obj, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                int i12 = i5;
                i2 = i4;
                i3 = i12;
            }
            if ((268435456 & iK) == 0 || m(obj, i7, i2, i3, i11)) {
                int iJ = J(iK);
                if (iJ == 9 || iJ == 17) {
                    if (!m(obj, i7, i2, i3, i11)) {
                        continue;
                    } else if (!k(i7).isInitialized(UnsafeUtil.f4938c.m(obj, iK & 1048575))) {
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                } else {
                    if (iJ != 27) {
                        if (iJ == 60 || iJ == 68) {
                            if (!o(obj, i8, i7)) {
                                continue;
                            } else if (!k(i7).isInitialized(UnsafeUtil.f4938c.m(obj, iK & 1048575))) {
                            }
                            i6++;
                            i4 = i2;
                            i5 = i3;
                        } else if (iJ != 49) {
                            if (iJ != 50) {
                                continue;
                            } else {
                                Object objM = UnsafeUtil.f4938c.m(obj, iK & 1048575);
                                MapFieldSchema mapFieldSchema = this.o;
                                MapFieldLite mapFieldLiteForMapData = mapFieldSchema.forMapData(objM);
                                if (!mapFieldLiteForMapData.isEmpty() && mapFieldSchema.forMapMetadata(j(i7)).f4878b.X == WireFormat.JavaType.MESSAGE) {
                                    Schema schemaA = null;
                                    for (Object obj2 : mapFieldLiteForMapData.values()) {
                                        if (schemaA == null) {
                                            schemaA = Protobuf.f4904c.a(obj2.getClass());
                                        }
                                        if (!schemaA.isInitialized(obj2)) {
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i2;
                            i5 = i3;
                        }
                    }
                    List list = (List) UnsafeUtil.f4938c.m(obj, iK & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        Schema schemaK = k(i7);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (schemaK.isInitialized(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i2;
                    i5 = i3;
                }
            }
        }
        return !this.f || this.f4892n.c(obj).g();
    }

    public final Object j(int i2) {
        return this.f4886b[(i2 / 3) * 2];
    }

    public final Schema k(int i2) {
        int i3 = (i2 / 3) * 2;
        Object[] objArr = this.f4886b;
        Schema schema = (Schema) objArr[i3];
        if (schema != null) {
            return schema;
        }
        Schema schemaA = Protobuf.f4904c.a((Class) objArr[i3 + 1]);
        objArr[i3] = schemaA;
        return schemaA;
    }

    public final boolean l(Object obj, int i2) {
        int i3 = this.f4885a[i2 + 2];
        long j = i3 & 1048575;
        if (j == 1048575) {
            int iK = K(i2);
            long j2 = iK & 1048575;
            switch (J(iK)) {
                case 0:
                    if (Double.doubleToRawLongBits(UnsafeUtil.f4938c.h(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(UnsafeUtil.f4938c.i(obj, j2)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (UnsafeUtil.f4938c.l(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (UnsafeUtil.f4938c.l(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (UnsafeUtil.f4938c.j(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (UnsafeUtil.f4938c.l(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (UnsafeUtil.f4938c.j(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return UnsafeUtil.f4938c.e(obj, j2);
                case 8:
                    Object objM = UnsafeUtil.f4938c.m(obj, j2);
                    if (objM instanceof String) {
                        return !((String) objM).isEmpty();
                    }
                    if (objM instanceof ByteString) {
                        return !ByteString.f4747Y.equals(objM);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (UnsafeUtil.f4938c.m(obj, j2) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !ByteString.f4747Y.equals(UnsafeUtil.f4938c.m(obj, j2));
                case 11:
                    if (UnsafeUtil.f4938c.j(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (UnsafeUtil.f4938c.j(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (UnsafeUtil.f4938c.j(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (UnsafeUtil.f4938c.l(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (UnsafeUtil.f4938c.j(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (UnsafeUtil.f4938c.l(obj, j2) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (UnsafeUtil.f4938c.m(obj, j2) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((UnsafeUtil.f4938c.j(obj, j) & (1 << (i3 >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return l(obj, i2);
        }
        return (i4 & i5) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void makeImmutable(Object obj) {
        if (n(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.f(Integer.MAX_VALUE);
                generatedMessageLite.memoizedHashCode = 0;
                generatedMessageLite.n();
            }
            int[] iArr = this.f4885a;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int iK = K(i2);
                long j = 1048575 & iK;
                int iJ = J(iK);
                if (iJ != 9) {
                    if (iJ != 60 && iJ != 68) {
                        switch (iJ) {
                            case 17:
                                if (l(obj, i2)) {
                                    k(i2).makeImmutable(q.getObject(obj, j));
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
                                this.f4891l.b(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, this.o.toImmutable(object));
                                }
                                break;
                        }
                    } else if (o(obj, iArr[i2], i2)) {
                        k(i2).makeImmutable(q.getObject(obj, j));
                    }
                } else if (l(obj, i2)) {
                    k(i2).makeImmutable(q.getObject(obj, j));
                }
            }
            this.m.j(obj);
            if (this.f) {
                this.f4892n.f(obj);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // androidx.datastore.preferences.protobuf.Schema
    public final void mergeFrom(Object obj, Object obj2) {
        Object obj3;
        g(obj);
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f4885a;
            if (i2 >= iArr.length) {
                Object obj4 = obj;
                Class cls = SchemaUtil.f4914a;
                UnknownFieldSchema unknownFieldSchema = this.m;
                unknownFieldSchema.o(obj4, unknownFieldSchema.k(unknownFieldSchema.g(obj4), unknownFieldSchema.g(obj2)));
                if (this.f) {
                    SchemaUtil.k(this.f4892n, obj4, obj2);
                    return;
                }
                return;
            }
            int iK = K(i2);
            long j = 1048575 & iK;
            int i3 = iArr[i2];
            switch (J(iK)) {
                case 0:
                    if (!l(obj2, i2)) {
                        obj3 = obj;
                    } else {
                        UnsafeUtil.MemoryAccessor memoryAccessor = UnsafeUtil.f4938c;
                        obj3 = obj;
                        memoryAccessor.r(obj3, j, memoryAccessor.h(obj2, j));
                        E(obj3, i2);
                    }
                    break;
                case 1:
                    if (l(obj2, i2)) {
                        UnsafeUtil.MemoryAccessor memoryAccessor2 = UnsafeUtil.f4938c;
                        memoryAccessor2.s(obj, j, memoryAccessor2.i(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (l(obj2, i2)) {
                        UnsafeUtil.q(obj, j, UnsafeUtil.f4938c.l(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (l(obj2, i2)) {
                        UnsafeUtil.q(obj, j, UnsafeUtil.f4938c.l(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (l(obj2, i2)) {
                        UnsafeUtil.p(obj, j, UnsafeUtil.f4938c.j(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (l(obj2, i2)) {
                        UnsafeUtil.q(obj, j, UnsafeUtil.f4938c.l(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (l(obj2, i2)) {
                        UnsafeUtil.p(obj, j, UnsafeUtil.f4938c.j(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (l(obj2, i2)) {
                        UnsafeUtil.MemoryAccessor memoryAccessor3 = UnsafeUtil.f4938c;
                        memoryAccessor3.o(obj, j, memoryAccessor3.e(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (l(obj2, i2)) {
                        UnsafeUtil.r(obj, j, UnsafeUtil.f4938c.m(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    r(obj, obj2, i2);
                    obj3 = obj;
                    break;
                case 10:
                    if (l(obj2, i2)) {
                        UnsafeUtil.r(obj, j, UnsafeUtil.f4938c.m(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (l(obj2, i2)) {
                        UnsafeUtil.p(obj, j, UnsafeUtil.f4938c.j(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (l(obj2, i2)) {
                        UnsafeUtil.p(obj, j, UnsafeUtil.f4938c.j(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (l(obj2, i2)) {
                        UnsafeUtil.p(obj, j, UnsafeUtil.f4938c.j(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (l(obj2, i2)) {
                        UnsafeUtil.q(obj, j, UnsafeUtil.f4938c.l(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (l(obj2, i2)) {
                        UnsafeUtil.p(obj, j, UnsafeUtil.f4938c.j(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (l(obj2, i2)) {
                        UnsafeUtil.q(obj, j, UnsafeUtil.f4938c.l(obj2, j));
                        E(obj, i2);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    r(obj, obj2, i2);
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
                    this.f4891l.c(obj, obj2, j);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls2 = SchemaUtil.f4914a;
                    UnsafeUtil.MemoryAccessor memoryAccessor4 = UnsafeUtil.f4938c;
                    UnsafeUtil.r(obj, j, this.o.mergeFrom(memoryAccessor4.m(obj, j), memoryAccessor4.m(obj2, j)));
                    obj3 = obj;
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
                    if (o(obj2, i3, i2)) {
                        UnsafeUtil.r(obj, j, UnsafeUtil.f4938c.m(obj2, j));
                        F(obj, i3, i2);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    s(obj, obj2, i2);
                    obj3 = obj;
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                case 62:
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (o(obj2, i3, i2)) {
                        UnsafeUtil.r(obj, j, UnsafeUtil.f4938c.m(obj2, j));
                        F(obj, i3, i2);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    s(obj, obj2, i2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i2 += 3;
            obj = obj3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Schema
    public final Object newInstance() {
        return this.k.newInstance(this.f4888e);
    }

    public final boolean o(Object obj, int i2, int i3) {
        return UnsafeUtil.f4938c.j(obj, (long) (this.f4885a[i3 + 2] & 1048575)) == i2;
    }

    /* JADX WARN: Code duplicated, block: B:271:0x07d7 A[Catch: all -> 0x07de, TryCatch #46 {all -> 0x07de, blocks: (B:269:0x07d2, B:271:0x07d7, B:275:0x07e0), top: B:332:0x07d2 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x07ea A[LOOP:2: B:278:0x07e8->B:279:0x07ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:290:0x0817 A[LOOP:3: B:289:0x0815->B:290:0x0817, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x0828  */
    /* JADX WARN: Code duplicated, block: B:369:0x07e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:? A[RETURN, SYNTHETIC] */
    public final void p(UnknownFieldSchema unknownFieldSchema, ExtensionSchema extensionSchema, Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
        UnknownFieldSchema unknownFieldSchema2;
        Object obj2;
        Object objH;
        int i2;
        UnknownFieldSchema unknownFieldSchema3;
        Object objF;
        Object obj3;
        UnknownFieldSchema unknownFieldSchema4;
        ExtensionSchema extensionSchema2;
        GeneratedMessageLite.GeneratedExtension generatedExtensionB;
        MessageSchema<T> messageSchema;
        Reader reader2;
        Object objH2;
        int i3;
        Object obj4;
        Object obj5;
        MessageSchema<T> messageSchema2 = this;
        ExtensionRegistryLite extensionRegistryLite2 = extensionRegistryLite;
        int[] iArr = messageSchema2.f4889h;
        int i4 = messageSchema2.j;
        int i5 = messageSchema2.f4890i;
        Object objG = null;
        FieldSet fieldSetD = null;
        while (true) {
            try {
                int fieldNumber = reader.getFieldNumber();
                try {
                    int iG = (fieldNumber < messageSchema2.f4887c || fieldNumber > messageSchema2.d) ? -1 : messageSchema2.G(fieldNumber, 0);
                    if (iG < 0) {
                        if (fieldNumber == Integer.MAX_VALUE) {
                            Object objH3 = objG;
                            while (i5 < i4) {
                                objH3 = messageSchema2.h(obj, iArr[i5], objH3, unknownFieldSchema, obj);
                                i5++;
                                messageSchema2 = messageSchema2;
                            }
                            if (objH3 != null) {
                                unknownFieldSchema.n(obj, objH3);
                                return;
                            }
                            return;
                        }
                        MessageSchema<T> messageSchema3 = messageSchema2;
                        try {
                            if (messageSchema3.f) {
                                extensionSchema2 = extensionSchema;
                                generatedExtensionB = extensionSchema2.b(extensionRegistryLite2, messageSchema3.f4888e, fieldNumber);
                            } else {
                                extensionSchema2 = extensionSchema;
                                generatedExtensionB = null;
                            }
                            if (generatedExtensionB != null) {
                                if (fieldSetD == null) {
                                    try {
                                        fieldSetD = extensionSchema.d(obj);
                                    } catch (Throwable th) {
                                        th = th;
                                        obj2 = obj;
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        i5 = i5;
                                        objH = objG;
                                        for (i2 = i5; i2 < i4; i2++) {
                                            objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        if (objH != null) {
                                            unknownFieldSchema3.n(obj2, objH);
                                        }
                                        throw th;
                                    }
                                }
                                Object obj6 = objG;
                                FieldSet fieldSet = fieldSetD;
                                try {
                                    fieldSetD = fieldSet;
                                    objG = extensionSchema2.g(obj, reader, generatedExtensionB, extensionRegistryLite2, fieldSet, obj6, unknownFieldSchema);
                                    extensionRegistryLite2 = extensionRegistryLite2;
                                    messageSchema2 = messageSchema3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj;
                                    objF = obj6;
                                    unknownFieldSchema4 = unknownFieldSchema;
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    i5 = i5;
                                    objG = objF;
                                    objH = objG;
                                    while (i2 < i4) {
                                        objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                    }
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    if (objH != null) {
                                        unknownFieldSchema3.n(obj2, objH);
                                    }
                                    throw th;
                                }
                            } else {
                                obj2 = obj;
                                objF = objG;
                                unknownFieldSchema4 = unknownFieldSchema;
                                ExtensionRegistryLite extensionRegistryLite3 = extensionRegistryLite2;
                                try {
                                    unknownFieldSchema4.getClass();
                                    if (objF == null) {
                                        try {
                                            objF = unknownFieldSchema4.f(obj2);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            unknownFieldSchema2 = unknownFieldSchema4;
                                            i5 = i5;
                                            objG = objF;
                                            objH = objG;
                                            while (i2 < i4) {
                                                objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                            }
                                            unknownFieldSchema3 = unknownFieldSchema2;
                                            if (objH != null) {
                                                unknownFieldSchema3.n(obj2, objH);
                                            }
                                            throw th;
                                        }
                                    }
                                    try {
                                        if (!unknownFieldSchema4.l(0, reader, objF)) {
                                            Object objH4 = objF;
                                            while (i5 < i4) {
                                                objH4 = messageSchema3.h(obj2, iArr[i5], objH4, unknownFieldSchema4, obj);
                                                i5++;
                                            }
                                            if (objH4 != null) {
                                                unknownFieldSchema4.n(obj2, objH4);
                                                return;
                                            }
                                            return;
                                        }
                                        extensionRegistryLite2 = extensionRegistryLite3;
                                        messageSchema2 = messageSchema3;
                                        objG = objF;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        unknownFieldSchema2 = unknownFieldSchema4;
                                        i5 = i5;
                                        objG = objF;
                                        objH = objG;
                                        while (i2 < i4) {
                                            objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        if (objH != null) {
                                            unknownFieldSchema3.n(obj2, objH);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj3 = obj2;
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    obj2 = obj3;
                                    i5 = i5;
                                    objG = objF;
                                    objH = objG;
                                    while (i2 < i4) {
                                        objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                    }
                                    unknownFieldSchema3 = unknownFieldSchema2;
                                    if (objH != null) {
                                        unknownFieldSchema3.n(obj2, objH);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            obj3 = obj;
                            objF = objG;
                            unknownFieldSchema4 = unknownFieldSchema;
                        }
                        i5 = i5;
                        objG = objF;
                        objH = objG;
                        while (i2 < i4) {
                            objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                        }
                        unknownFieldSchema3 = unknownFieldSchema2;
                        if (objH != null) {
                            unknownFieldSchema3.n(obj2, objH);
                        }
                        throw th;
                    }
                    obj3 = obj;
                    ExtensionRegistryLite extensionRegistryLite4 = extensionRegistryLite2;
                    objF = objG;
                    unknownFieldSchema4 = unknownFieldSchema;
                    try {
                        int iK = messageSchema2.K(iG);
                        try {
                            int iJ = J(iK);
                            ListFieldSchema listFieldSchema = messageSchema2.f4891l;
                            switch (iJ) {
                                case 0:
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    messageSchema = messageSchema2;
                                    reader2 = reader;
                                    try {
                                        obj4 = obj;
                                        try {
                                            UnsafeUtil.f4938c.r(obj4, w(iK), reader2.readDouble());
                                            messageSchema.E(obj4, iG);
                                            objG = objF;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                            obj2 = obj4;
                                            objG = objF;
                                            try {
                                                unknownFieldSchema2.getClass();
                                                if (objG == null) {
                                                    objG = unknownFieldSchema2.f(obj2);
                                                }
                                                if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                                    objH2 = objG;
                                                    i3 = i5;
                                                    while (i3 < i4) {
                                                        objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                        i3++;
                                                        messageSchema = this;
                                                    }
                                                    if (objH2 != null) {
                                                        unknownFieldSchema2.n(obj2, objH2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj2 = obj4;
                                            objG = objF;
                                            objH = objG;
                                            while (i2 < i4) {
                                                objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                            }
                                            unknownFieldSchema3 = unknownFieldSchema2;
                                            if (objH != null) {
                                                unknownFieldSchema3.n(obj2, objH);
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                        obj2 = obj;
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 1:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.f4938c.s(obj3, w(iK), reader.readFloat());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 2:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.q(obj3, w(iK), reader.readInt64());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 3:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.q(obj3, w(iK), reader.readUInt64());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 4:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.p(obj3, w(iK), reader.readInt32());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 5:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.q(obj3, w(iK), reader.readFixed64());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 6:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.p(obj3, w(iK), reader.readFixed32());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 7:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.f4938c.o(obj3, w(iK), reader.readBool());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 8:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    MessageSchema<T> messageSchema4 = messageSchema2;
                                    messageSchema4.B(iK, reader, obj3);
                                    messageSchema4.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 9:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    MessageSchema<T> messageSchema5 = messageSchema2;
                                    MessageLite messageLite = (MessageLite) messageSchema5.t(obj3, iG);
                                    reader.a(messageLite, messageSchema5.k(iG), extensionRegistryLite4);
                                    messageSchema5.H(obj3, iG, messageLite);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 10:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.r(obj3, w(iK), reader.readBytes());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 11:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.p(obj3, w(iK), reader.readUInt32());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 12:
                                    MessageSchema<T> messageSchema6 = messageSchema2;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    int i6 = reader.readEnum();
                                    Internal.EnumVerifier enumVerifierI = messageSchema6.i(iG);
                                    if (enumVerifierI == null || enumVerifierI.isInRange(i6)) {
                                        UnsafeUtil.p(obj3, w(iK), i6);
                                        messageSchema6.E(obj3, iG);
                                        objG = objF;
                                    } else {
                                        objG = SchemaUtil.m(obj3, fieldNumber, i6, objF, unknownFieldSchema4);
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 13:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.p(obj3, w(iK), reader.readSFixed32());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 14:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.q(obj3, w(iK), reader.readSFixed64());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 15:
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    UnsafeUtil.p(obj3, w(iK), reader.readSInt32());
                                    messageSchema2.E(obj3, iG);
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 16:
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    obj2 = obj3;
                                    i5 = i5;
                                    messageSchema = messageSchema2;
                                    reader2 = reader;
                                    fieldSetD = fieldSetD;
                                    try {
                                        UnsafeUtil.q(obj2, w(iK), reader2.readSInt64());
                                        messageSchema.E(obj2, iG);
                                        objG = objF;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        objG = objF;
                                        unknownFieldSchema2.getClass();
                                        if (objG == null) {
                                            objG = unknownFieldSchema2.f(obj2);
                                        }
                                        if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                            objH2 = objG;
                                            i3 = i5;
                                            while (i3 < i4) {
                                                objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                i3++;
                                                messageSchema = this;
                                            }
                                            if (objH2 != null) {
                                                unknownFieldSchema2.n(obj2, objH2);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 17:
                                    i5 = i5;
                                    MessageSchema<T> messageSchema7 = messageSchema2;
                                    MessageLite messageLite2 = (MessageLite) messageSchema7.t(obj3, iG);
                                    reader.f(messageLite2, messageSchema7.k(iG), extensionRegistryLite4);
                                    messageSchema7.H(obj3, iG, messageLite2);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 18:
                                    i5 = i5;
                                    reader.readDoubleList(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 19:
                                    i5 = i5;
                                    reader.readFloatList(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 20:
                                    i5 = i5;
                                    reader.readInt64List(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 21:
                                    i5 = i5;
                                    reader.readUInt64List(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 22:
                                    i5 = i5;
                                    reader.readInt32List(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 23:
                                    i5 = i5;
                                    reader.readFixed64List(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 24:
                                    i5 = i5;
                                    reader.readFixed32List(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 25:
                                    i5 = i5;
                                    reader.readBoolList(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 26:
                                    i5 = i5;
                                    messageSchema2.C(iK, reader, obj3);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 27:
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    obj2 = obj3;
                                    i5 = i5;
                                    messageSchema = messageSchema2;
                                    reader2 = reader;
                                    try {
                                        try {
                                            messageSchema2.A(obj2, iK, reader, messageSchema.k(iG), extensionRegistryLite);
                                            fieldSetD = fieldSetD;
                                            objG = objF;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            messageSchema = messageSchema2;
                                            reader2 = reader;
                                            fieldSetD = fieldSetD;
                                            objG = objF;
                                            unknownFieldSchema2.getClass();
                                            if (objG == null) {
                                                objG = unknownFieldSchema2.f(obj2);
                                            }
                                            if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                                objH2 = objG;
                                                i3 = i5;
                                                while (i3 < i4) {
                                                    objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                    i3++;
                                                    messageSchema = this;
                                                }
                                                if (objH2 != null) {
                                                    unknownFieldSchema2.n(obj2, objH2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            objG = objF;
                                            objH = objG;
                                            while (i2 < i4) {
                                                objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                            }
                                            unknownFieldSchema3 = unknownFieldSchema2;
                                            if (objH != null) {
                                                unknownFieldSchema3.n(obj2, objH);
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 28:
                                    i5 = i5;
                                    reader.readBytesList(listFieldSchema.a(w(iK), obj3));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 29:
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    obj2 = obj3;
                                    i5 = i5;
                                    messageSchema = messageSchema2;
                                    reader2 = reader;
                                    try {
                                        try {
                                            reader2.readUInt32List(listFieldSchema.a(w(iK), obj2));
                                            fieldSetD = fieldSetD;
                                            objG = objF;
                                        } catch (Throwable th10) {
                                            th = th10;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                        fieldSetD = fieldSetD;
                                        objG = objF;
                                        unknownFieldSchema2.getClass();
                                        if (objG == null) {
                                            objG = unknownFieldSchema2.f(obj2);
                                        }
                                        if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                            objH2 = objG;
                                            i3 = i5;
                                            while (i3 < i4) {
                                                objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                i3++;
                                                messageSchema = this;
                                            }
                                            if (objH2 != null) {
                                                unknownFieldSchema2.n(obj2, objH2);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 30:
                                    messageSchema = messageSchema2;
                                    obj2 = obj3;
                                    i5 = i5;
                                    objG = objF;
                                    reader2 = reader;
                                    try {
                                        Internal.ProtobufList protobufListA = listFieldSchema.a(w(iK), obj2);
                                        reader2.readEnumList(protobufListA);
                                        obj5 = obj2;
                                        try {
                                            objG = SchemaUtil.j(obj5, fieldNumber, protobufListA, messageSchema.i(iG), objG, unknownFieldSchema);
                                            fieldSetD = fieldSetD;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                            unknownFieldSchema2 = unknownFieldSchema;
                                            obj2 = obj5;
                                            fieldSetD = fieldSetD;
                                            unknownFieldSchema2.getClass();
                                            if (objG == null) {
                                                objG = unknownFieldSchema2.f(obj2);
                                            }
                                            if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                                objH2 = objG;
                                                i3 = i5;
                                                while (i3 < i4) {
                                                    objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                    i3++;
                                                    messageSchema = this;
                                                }
                                                if (objH2 != null) {
                                                    unknownFieldSchema2.n(obj2, objH2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            obj2 = obj5;
                                            unknownFieldSchema2 = unknownFieldSchema;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        fieldSetD = fieldSetD;
                                        unknownFieldSchema2.getClass();
                                        if (objG == null) {
                                            objG = unknownFieldSchema2.f(obj2);
                                        }
                                        if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                            objH2 = objG;
                                            i3 = i5;
                                            while (i3 < i4) {
                                                objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                i3++;
                                                messageSchema = this;
                                            }
                                            if (objH2 != null) {
                                                unknownFieldSchema2.n(obj2, objH2);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        unknownFieldSchema2 = unknownFieldSchema;
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 31:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readSFixed32List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 32:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readSFixed64List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 33:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readSInt32List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 34:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readSInt64List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 35:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readDoubleList(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 36:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readFloatList(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 37:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readInt64List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 38:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readUInt64List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 39:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readInt32List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 40:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readFixed64List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 41:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readFixed32List(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 42:
                                    i5 = i5;
                                    objG = objF;
                                    reader.readBoolList(listFieldSchema.a(w(iK), obj3));
                                    objF = objG;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 43:
                                    obj2 = obj3;
                                    i5 = i5;
                                    objG = objF;
                                    messageSchema = messageSchema2;
                                    reader2 = reader;
                                    try {
                                        reader2.readUInt32List(listFieldSchema.a(w(iK), obj2));
                                        objF = objG;
                                        fieldSetD = fieldSetD;
                                        objG = objF;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        fieldSetD = fieldSetD;
                                        unknownFieldSchema2.getClass();
                                        if (objG == null) {
                                            objG = unknownFieldSchema2.f(obj2);
                                        }
                                        if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                            objH2 = objG;
                                            i3 = i5;
                                            while (i3 < i4) {
                                                objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                i3++;
                                                messageSchema = this;
                                            }
                                            if (objH2 != null) {
                                                unknownFieldSchema2.n(obj2, objH2);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        objH = objG;
                                        while (i2 < i4) {
                                            objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        if (objH != null) {
                                            unknownFieldSchema3.n(obj2, objH);
                                        }
                                        throw th;
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 44:
                                    messageSchema = messageSchema2;
                                    obj5 = obj3;
                                    i5 = i5;
                                    reader2 = reader;
                                    try {
                                        Internal.ProtobufList protobufListA2 = listFieldSchema.a(w(iK), obj5);
                                        reader2.readEnumList(protobufListA2);
                                        objG = objF;
                                        try {
                                            objG = SchemaUtil.j(obj5, fieldNumber, protobufListA2, messageSchema.i(iG), objG, unknownFieldSchema4);
                                            fieldSetD = fieldSetD;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                            unknownFieldSchema2 = unknownFieldSchema;
                                            obj2 = obj5;
                                            fieldSetD = fieldSetD;
                                            unknownFieldSchema2.getClass();
                                            if (objG == null) {
                                                objG = unknownFieldSchema2.f(obj2);
                                            }
                                            if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                                objH2 = objG;
                                                i3 = i5;
                                                while (i3 < i4) {
                                                    objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                    i3++;
                                                    messageSchema = this;
                                                }
                                                if (objH2 != null) {
                                                    unknownFieldSchema2.n(obj2, objH2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th14) {
                                            th = th14;
                                            obj2 = obj5;
                                            unknownFieldSchema2 = unknownFieldSchema;
                                            objH = objG;
                                            while (i2 < i4) {
                                                objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                            }
                                            unknownFieldSchema3 = unknownFieldSchema2;
                                            if (objH != null) {
                                                unknownFieldSchema3.n(obj2, objH);
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                                        objG = objF;
                                    } catch (Throwable th15) {
                                        th = th15;
                                        obj2 = obj5;
                                        objG = objF;
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 45:
                                    obj4 = obj3;
                                    i5 = i5;
                                    reader.readSFixed32List(listFieldSchema.a(w(iK), obj4));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 46:
                                    obj4 = obj3;
                                    i5 = i5;
                                    reader.readSFixed64List(listFieldSchema.a(w(iK), obj4));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 47:
                                    obj4 = obj3;
                                    i5 = i5;
                                    reader.readSInt32List(listFieldSchema.a(w(iK), obj4));
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 48:
                                    messageSchema = messageSchema2;
                                    obj4 = obj3;
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    i5 = i5;
                                    reader2 = reader;
                                    try {
                                        reader2.readSInt64List(listFieldSchema.a(w(iK), obj4));
                                        fieldSetD = fieldSetD;
                                        objG = objF;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused12) {
                                        obj2 = obj4;
                                        fieldSetD = fieldSetD;
                                        objG = objF;
                                        unknownFieldSchema2.getClass();
                                        if (objG == null) {
                                            objG = unknownFieldSchema2.f(obj2);
                                        }
                                        if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                            objH2 = objG;
                                            i3 = i5;
                                            while (i3 < i4) {
                                                objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                i3++;
                                                messageSchema = this;
                                            }
                                            if (objH2 != null) {
                                                unknownFieldSchema2.n(obj2, objH2);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        obj2 = obj4;
                                        objG = objF;
                                        objH = objG;
                                        while (i2 < i4) {
                                            objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                        }
                                        unknownFieldSchema3 = unknownFieldSchema2;
                                        if (objH != null) {
                                            unknownFieldSchema3.n(obj2, objH);
                                        }
                                        throw th;
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 49:
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    i5 = i5;
                                    try {
                                        obj2 = obj;
                                        try {
                                            messageSchema2.z(obj2, w(iK), reader, messageSchema2.k(iG), extensionRegistryLite);
                                            obj4 = obj2;
                                            fieldSetD = fieldSetD;
                                            objG = objF;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused13) {
                                            messageSchema = messageSchema2;
                                            reader2 = reader;
                                            fieldSetD = fieldSetD;
                                            objG = objF;
                                            unknownFieldSchema2.getClass();
                                            if (objG == null) {
                                                objG = unknownFieldSchema2.f(obj2);
                                            }
                                            if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                                objH2 = objG;
                                                i3 = i5;
                                                while (i3 < i4) {
                                                    objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                    i3++;
                                                    messageSchema = this;
                                                }
                                                if (objH2 != null) {
                                                    unknownFieldSchema2.n(obj2, objH2);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                        }
                                        messageSchema2 = this;
                                        extensionRegistryLite2 = extensionRegistryLite;
                                        i5 = i5;
                                        fieldSetD = fieldSetD;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        obj4 = obj;
                                        obj2 = obj4;
                                    }
                                    break;
                                case 50:
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    i5 = i5;
                                    try {
                                        try {
                                            messageSchema2.q(obj3, iG, messageSchema2.j(iG), extensionRegistryLite4, reader);
                                            fieldSetD = fieldSetD;
                                            objG = objF;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused14) {
                                            obj2 = obj;
                                            reader2 = reader;
                                            messageSchema = messageSchema2;
                                            fieldSetD = fieldSetD;
                                            objG = objF;
                                            unknownFieldSchema2.getClass();
                                            if (objG == null) {
                                                objG = unknownFieldSchema2.f(obj2);
                                            }
                                            if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                                objH2 = objG;
                                                i3 = i5;
                                                while (i3 < i4) {
                                                    objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                    i3++;
                                                    messageSchema = this;
                                                }
                                                if (objH2 != null) {
                                                    unknownFieldSchema2.n(obj2, objH2);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        messageSchema2 = this;
                                        extensionRegistryLite2 = extensionRegistryLite;
                                        i5 = i5;
                                        fieldSetD = fieldSetD;
                                    } catch (Throwable th19) {
                                        th = th19;
                                        obj2 = obj;
                                    }
                                    break;
                                case AD_REWARD_USER_VALUE:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Double.valueOf(reader.readDouble()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Float.valueOf(reader.readFloat()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 53:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Long.valueOf(reader.readInt64()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Long.valueOf(reader.readUInt64()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Integer.valueOf(reader.readInt32()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 56:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Long.valueOf(reader.readFixed64()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Integer.valueOf(reader.readFixed32()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 58:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Boolean.valueOf(reader.readBool()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 59:
                                    i5 = i5;
                                    messageSchema2.B(iK, reader, obj3);
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 60:
                                    i5 = i5;
                                    MessageLite messageLite3 = (MessageLite) messageSchema2.u(obj3, fieldNumber, iG);
                                    reader.a(messageLite3, messageSchema2.k(iG), extensionRegistryLite4);
                                    messageSchema2.I(obj3, fieldNumber, iG, messageLite3);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), reader.readBytes());
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 62:
                                    i5 = i5;
                                    UnsafeUtil.r(obj3, w(iK), Integer.valueOf(reader.readUInt32()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                    try {
                                        int i7 = reader.readEnum();
                                        Internal.EnumVerifier enumVerifierI2 = messageSchema2.i(iG);
                                        if (enumVerifierI2 == null || enumVerifierI2.isInRange(i7)) {
                                            unknownFieldSchema2 = unknownFieldSchema;
                                            i5 = i5;
                                            try {
                                                UnsafeUtil.r(obj3, w(iK), Integer.valueOf(i7));
                                                messageSchema2.F(obj3, fieldNumber, iG);
                                                fieldSetD = fieldSetD;
                                                objG = objF;
                                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused15) {
                                                reader2 = reader;
                                                obj2 = obj3;
                                                fieldSetD = fieldSetD;
                                                objG = objF;
                                                messageSchema = messageSchema2;
                                                unknownFieldSchema2.getClass();
                                                if (objG == null) {
                                                    objG = unknownFieldSchema2.f(obj2);
                                                }
                                                if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                                    objH2 = objG;
                                                    i3 = i5;
                                                    while (i3 < i4) {
                                                        objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                        i3++;
                                                        messageSchema = this;
                                                    }
                                                    if (objH2 != null) {
                                                        unknownFieldSchema2.n(obj2, objH2);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                obj2 = obj3;
                                                objG = objF;
                                                objH = objG;
                                                while (i2 < i4) {
                                                    objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
                                                }
                                                unknownFieldSchema3 = unknownFieldSchema2;
                                                if (objH != null) {
                                                    unknownFieldSchema3.n(obj2, objH);
                                                }
                                                throw th;
                                            }
                                            messageSchema2 = this;
                                            extensionRegistryLite2 = extensionRegistryLite;
                                            i5 = i5;
                                            fieldSetD = fieldSetD;
                                        } else {
                                            objG = SchemaUtil.m(obj3, fieldNumber, i7, objF, unknownFieldSchema);
                                            messageSchema2 = this;
                                            extensionRegistryLite2 = extensionRegistryLite;
                                            i5 = i5;
                                            fieldSetD = fieldSetD;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused16) {
                                        i5 = i5;
                                        unknownFieldSchema2 = unknownFieldSchema;
                                    } catch (Throwable th21) {
                                        th = th21;
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        i5 = i5;
                                    }
                                    break;
                                case 64:
                                    UnsafeUtil.r(obj3, w(iK), Integer.valueOf(reader.readSFixed32()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 65:
                                    UnsafeUtil.r(obj3, w(iK), Long.valueOf(reader.readSFixed64()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 66:
                                    UnsafeUtil.r(obj3, w(iK), Integer.valueOf(reader.readSInt32()));
                                    messageSchema2.F(obj3, fieldNumber, iG);
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 67:
                                    try {
                                        UnsafeUtil.r(obj3, w(iK), Long.valueOf(reader.readSInt64()));
                                        messageSchema2.F(obj3, fieldNumber, iG);
                                        i5 = i5;
                                        fieldSetD = fieldSetD;
                                        objG = objF;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused17) {
                                        unknownFieldSchema2 = unknownFieldSchema;
                                        obj2 = obj3;
                                        i5 = i5;
                                        fieldSetD = fieldSetD;
                                        objG = objF;
                                        messageSchema = messageSchema2;
                                        reader2 = reader;
                                        unknownFieldSchema2.getClass();
                                        if (objG == null) {
                                            objG = unknownFieldSchema2.f(obj2);
                                        }
                                        if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                            objH2 = objG;
                                            i3 = i5;
                                            while (i3 < i4) {
                                                objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                i3++;
                                                messageSchema = this;
                                            }
                                            if (objH2 != null) {
                                                unknownFieldSchema2.n(obj2, objH2);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th22) {
                                        th = th22;
                                        unknownFieldSchema2 = unknownFieldSchema;
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                case 68:
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                    try {
                                        MessageLite messageLite4 = (MessageLite) messageSchema2.u(obj3, fieldNumber, iG);
                                        reader.f(messageLite4, messageSchema2.k(iG), extensionRegistryLite4);
                                        messageSchema2.I(obj3, fieldNumber, iG, messageLite4);
                                        i5 = i5;
                                        fieldSetD = fieldSetD;
                                        objG = objF;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused18) {
                                        obj2 = obj3;
                                        i5 = i5;
                                        fieldSetD = fieldSetD;
                                        objG = objF;
                                        messageSchema = messageSchema2;
                                        reader2 = reader;
                                        unknownFieldSchema2.getClass();
                                        if (objG == null) {
                                            objG = unknownFieldSchema2.f(obj2);
                                        }
                                        if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                            objH2 = objG;
                                            i3 = i5;
                                            while (i3 < i4) {
                                                objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                i3++;
                                                messageSchema = this;
                                            }
                                            if (objH2 != null) {
                                                unknownFieldSchema2.n(obj2, objH2);
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th23) {
                                        th = th23;
                                    }
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                default:
                                    if (objF == null) {
                                        try {
                                            objF = unknownFieldSchema4.f(obj3);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused19) {
                                            unknownFieldSchema2 = unknownFieldSchema4;
                                            obj2 = obj3;
                                            i5 = i5;
                                            fieldSetD = fieldSetD;
                                            objG = objF;
                                            messageSchema = messageSchema2;
                                            reader2 = reader;
                                            unknownFieldSchema2.getClass();
                                            if (objG == null) {
                                                objG = unknownFieldSchema2.f(obj2);
                                            }
                                            if (!unknownFieldSchema2.l(0, reader2, objG)) {
                                                objH2 = objG;
                                                i3 = i5;
                                                while (i3 < i4) {
                                                    objH2 = messageSchema.h(obj2, iArr[i3], objH2, unknownFieldSchema2, obj);
                                                    i3++;
                                                    messageSchema = this;
                                                }
                                                if (objH2 != null) {
                                                    unknownFieldSchema2.n(obj2, objH2);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                    if (!unknownFieldSchema4.l(0, reader, objF)) {
                                        Object objH5 = objF;
                                        while (i5 < i4) {
                                            objH5 = messageSchema2.h(obj3, iArr[i5], objH5, unknownFieldSchema4, obj);
                                            i5++;
                                        }
                                        if (objH5 != null) {
                                            unknownFieldSchema4.n(obj3, objH5);
                                            return;
                                        }
                                        return;
                                    }
                                    objG = objF;
                                    messageSchema2 = this;
                                    extensionRegistryLite2 = extensionRegistryLite;
                                    i5 = i5;
                                    fieldSetD = fieldSetD;
                                    break;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused20) {
                            unknownFieldSchema2 = unknownFieldSchema4;
                            obj2 = obj3;
                            i5 = i5;
                            fieldSetD = fieldSetD;
                            messageSchema = messageSchema2;
                            reader2 = reader;
                        } catch (Throwable th24) {
                            th = th24;
                            unknownFieldSchema2 = unknownFieldSchema4;
                            obj2 = obj3;
                            i5 = i5;
                        }
                    } catch (Throwable th25) {
                        th = th25;
                        unknownFieldSchema2 = unknownFieldSchema4;
                    }
                    obj2 = obj3;
                } catch (Throwable th26) {
                    th = th26;
                    unknownFieldSchema2 = unknownFieldSchema;
                    obj2 = obj;
                    objF = objG;
                }
                i5 = i5;
                objG = objF;
            } catch (Throwable th27) {
                th = th27;
                unknownFieldSchema2 = unknownFieldSchema;
                obj2 = obj;
            }
            objH = objG;
            while (i2 < i4) {
                objH = h(obj2, iArr[i2], objH, unknownFieldSchema2, obj);
            }
            unknownFieldSchema3 = unknownFieldSchema2;
            if (objH != null) {
                unknownFieldSchema3.n(obj2, objH);
            }
            throw th;
        }
    }

    public final void q(Object obj, int i2, Object obj2, ExtensionRegistryLite extensionRegistryLite, Reader reader) {
        long jK = K(i2) & 1048575;
        Object objM = UnsafeUtil.f4938c.m(obj, jK);
        MapFieldSchema mapFieldSchema = this.o;
        if (objM == null) {
            objM = mapFieldSchema.a();
            UnsafeUtil.r(obj, jK, objM);
        } else if (mapFieldSchema.isImmutable(objM)) {
            MapFieldLite mapFieldLiteA = mapFieldSchema.a();
            mapFieldSchema.mergeFrom(mapFieldLiteA, objM);
            UnsafeUtil.r(obj, jK, mapFieldLiteA);
            objM = mapFieldLiteA;
        }
        reader.e(mapFieldSchema.forMutableMapData(objM), mapFieldSchema.forMapMetadata(obj2), extensionRegistryLite);
    }

    public final void r(Object obj, Object obj2, int i2) {
        if (l(obj2, i2)) {
            long jK = K(i2) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jK);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f4885a[i2] + " is present but null: " + obj2);
            }
            Schema schemaK = k(i2);
            if (!l(obj, i2)) {
                if (n(object)) {
                    Object objNewInstance = schemaK.newInstance();
                    schemaK.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jK, objNewInstance);
                } else {
                    unsafe.putObject(obj, jK, object);
                }
                E(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jK);
            if (!n(object2)) {
                Object objNewInstance2 = schemaK.newInstance();
                schemaK.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jK, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaK.mergeFrom(object2, object);
        }
    }

    public final void s(Object obj, Object obj2, int i2) {
        int[] iArr = this.f4885a;
        int i3 = iArr[i2];
        if (o(obj2, i3, i2)) {
            long jK = K(i2) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, jK);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i2] + " is present but null: " + obj2);
            }
            Schema schemaK = k(i2);
            if (!o(obj, i3, i2)) {
                if (n(object)) {
                    Object objNewInstance = schemaK.newInstance();
                    schemaK.mergeFrom(objNewInstance, object);
                    unsafe.putObject(obj, jK, objNewInstance);
                } else {
                    unsafe.putObject(obj, jK, object);
                }
                F(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jK);
            if (!n(object2)) {
                Object objNewInstance2 = schemaK.newInstance();
                schemaK.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(obj, jK, objNewInstance2);
                object2 = objNewInstance2;
            }
            schemaK.mergeFrom(object2, object);
        }
    }

    public final Object t(Object obj, int i2) {
        Schema schemaK = k(i2);
        long jK = K(i2) & 1048575;
        if (!l(obj, i2)) {
            return schemaK.newInstance();
        }
        Object object = q.getObject(obj, jK);
        if (n(object)) {
            return object;
        }
        Object objNewInstance = schemaK.newInstance();
        if (object != null) {
            schemaK.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final Object u(Object obj, int i2, int i3) {
        Schema schemaK = k(i3);
        if (!o(obj, i2, i3)) {
            return schemaK.newInstance();
        }
        Object object = q.getObject(obj, K(i3) & 1048575);
        if (n(object)) {
            return object;
        }
        Object objNewInstance = schemaK.newInstance();
        if (object != null) {
            schemaK.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    public final void z(Object obj, long j, Reader reader, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        reader.g(this.f4891l.a(j, obj), schema, extensionRegistryLite);
    }
}
