package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class WireFormat {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4944a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f4944a = iArr;
            try {
                iArr[FieldType.Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4944a[FieldType.e0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4944a[FieldType.f0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4944a[FieldType.g0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4944a[FieldType.h0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4944a[FieldType.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4944a[FieldType.j0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4944a[FieldType.k0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4944a[FieldType.o0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4944a[FieldType.p0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4944a[FieldType.r0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4944a[FieldType.s0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4944a[FieldType.t0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4944a[FieldType.u0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4944a[FieldType.l0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4944a[FieldType.m0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4944a[FieldType.n0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4944a[FieldType.q0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f0' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class FieldType {
        public static final FieldType Z;
        public static final FieldType e0;
        public static final FieldType f0;
        public static final FieldType g0;
        public static final FieldType h0;
        public static final FieldType i0;
        public static final FieldType j0;
        public static final FieldType k0;
        public static final FieldType l0;
        public static final FieldType m0;
        public static final FieldType n0;
        public static final FieldType o0;
        public static final FieldType p0;
        public static final FieldType q0;
        public static final FieldType r0;
        public static final FieldType s0;
        public static final FieldType t0;
        public static final FieldType u0;
        public static final /* synthetic */ FieldType[] v0;
        public final JavaType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f4945Y;

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$1, reason: invalid class name */
        public final enum AnonymousClass1 extends FieldType {
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$2, reason: invalid class name */
        public final enum AnonymousClass2 extends FieldType {
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$3, reason: invalid class name */
        public final enum AnonymousClass3 extends FieldType {
        }

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.WireFormat$FieldType$4, reason: invalid class name */
        public final enum AnonymousClass4 extends FieldType {
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            Z = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            e0 = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f0 = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            g0 = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            h0 = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            i0 = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            j0 = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            k0 = fieldType8;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1("STRING", 8, JavaType.STRING, 2);
            l0 = anonymousClass1;
            JavaType javaType3 = JavaType.MESSAGE;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2("GROUP", 9, javaType3, 3);
            m0 = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3("MESSAGE", 10, javaType3, 2);
            n0 = anonymousClass3;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4("BYTES", 11, JavaType.BYTE_STRING, 2);
            o0 = anonymousClass4;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            p0 = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            q0 = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            r0 = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            s0 = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            t0 = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            u0 = fieldType14;
            v0 = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public FieldType(String str, int i2, JavaType javaType, int i3) {
            super(str, i2);
            this.X = javaType;
            this.f4945Y = i3;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) java.lang.Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) v0.clone();
        }
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.f4747Y),
        ENUM(null),
        MESSAGE(null);

        public final Serializable X;

        JavaType(Serializable serializable) {
            this.X = serializable;
        }
    }

    public enum Utf8Validation {
        /* JADX INFO: Fake field, exist only in values array */
        EF2 { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.1
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF7 { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.2
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF12 { // from class: androidx.datastore.preferences.protobuf.WireFormat.Utf8Validation.3
        }
    }
}
