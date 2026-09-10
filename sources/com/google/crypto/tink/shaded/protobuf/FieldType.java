package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class FieldType {
    public static final FieldType BOOL;
    public static final FieldType BOOL_LIST;
    public static final FieldType BOOL_LIST_PACKED;
    public static final FieldType BYTES;
    public static final FieldType BYTES_LIST;
    public static final FieldType DOUBLE;
    public static final FieldType DOUBLE_LIST;
    public static final FieldType DOUBLE_LIST_PACKED;
    public static final FieldType ENUM;
    public static final FieldType ENUM_LIST;
    public static final FieldType ENUM_LIST_PACKED;
    public static final FieldType FIXED32;
    public static final FieldType FIXED32_LIST;
    public static final FieldType FIXED32_LIST_PACKED;
    public static final FieldType FIXED64;
    public static final FieldType FIXED64_LIST;
    public static final FieldType FIXED64_LIST_PACKED;
    public static final FieldType FLOAT;
    public static final FieldType FLOAT_LIST;
    public static final FieldType FLOAT_LIST_PACKED;
    public static final FieldType GROUP;
    public static final FieldType GROUP_LIST;
    public static final FieldType INT32;
    public static final FieldType INT32_LIST;
    public static final FieldType INT32_LIST_PACKED;
    public static final FieldType INT64;
    public static final FieldType INT64_LIST;
    public static final FieldType INT64_LIST_PACKED;
    public static final FieldType MAP;
    public static final FieldType MESSAGE;
    public static final FieldType MESSAGE_LIST;
    public static final FieldType SFIXED32;
    public static final FieldType SFIXED32_LIST;
    public static final FieldType SFIXED32_LIST_PACKED;
    public static final FieldType SFIXED64;
    public static final FieldType SFIXED64_LIST;
    public static final FieldType SFIXED64_LIST_PACKED;
    public static final FieldType SINT32;
    public static final FieldType SINT32_LIST;
    public static final FieldType SINT32_LIST_PACKED;
    public static final FieldType SINT64;
    public static final FieldType SINT64_LIST;
    public static final FieldType SINT64_LIST_PACKED;
    public static final FieldType STRING;
    public static final FieldType STRING_LIST;
    public static final FieldType UINT32;
    public static final FieldType UINT32_LIST;
    public static final FieldType UINT32_LIST_PACKED;
    public static final FieldType UINT64;
    public static final FieldType UINT64_LIST;
    public static final FieldType UINT64_LIST_PACKED;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final Type[] f22122arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final FieldType[] f22123kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final /* synthetic */ FieldType[] f22124monoploid;

    /* JADX INFO: renamed from: collection, reason: collision with root package name */
    private final Collection f22125collection;
    private final Class<?> elementType;
    private final int id;
    private final JavaType javaType;
    private final boolean primitiveScalar;

    public enum Collection {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        Collection(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22127attabal;

        static {
            int[] iArr = new int[JavaType.values().length];
            f22127attabal = iArr;
            try {
                iArr[JavaType.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22127attabal[JavaType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22127attabal[JavaType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Collection collection2 = Collection.SCALAR;
        JavaType javaType = JavaType.DOUBLE;
        DOUBLE = new FieldType("DOUBLE", 0, 0, collection2, javaType);
        JavaType javaType2 = JavaType.FLOAT;
        FLOAT = new FieldType("FLOAT", 1, 1, collection2, javaType2);
        JavaType javaType3 = JavaType.LONG;
        INT64 = new FieldType("INT64", 2, 2, collection2, javaType3);
        UINT64 = new FieldType("UINT64", 3, 3, collection2, javaType3);
        JavaType javaType4 = JavaType.INT;
        INT32 = new FieldType("INT32", 4, 4, collection2, javaType4);
        FIXED64 = new FieldType("FIXED64", 5, 5, collection2, javaType3);
        FIXED32 = new FieldType("FIXED32", 6, 6, collection2, javaType4);
        JavaType javaType5 = JavaType.BOOLEAN;
        BOOL = new FieldType("BOOL", 7, 7, collection2, javaType5);
        JavaType javaType6 = JavaType.STRING;
        STRING = new FieldType("STRING", 8, 8, collection2, javaType6);
        JavaType javaType7 = JavaType.MESSAGE;
        MESSAGE = new FieldType("MESSAGE", 9, 9, collection2, javaType7);
        JavaType javaType8 = JavaType.BYTE_STRING;
        BYTES = new FieldType("BYTES", 10, 10, collection2, javaType8);
        UINT32 = new FieldType("UINT32", 11, 11, collection2, javaType4);
        JavaType javaType9 = JavaType.ENUM;
        ENUM = new FieldType("ENUM", 12, 12, collection2, javaType9);
        SFIXED32 = new FieldType("SFIXED32", 13, 13, collection2, javaType4);
        SFIXED64 = new FieldType("SFIXED64", 14, 14, collection2, javaType3);
        SINT32 = new FieldType("SINT32", 15, 15, collection2, javaType4);
        SINT64 = new FieldType("SINT64", 16, 16, collection2, javaType3);
        GROUP = new FieldType("GROUP", 17, 17, collection2, javaType7);
        Collection collection3 = Collection.VECTOR;
        DOUBLE_LIST = new FieldType("DOUBLE_LIST", 18, 18, collection3, javaType);
        FLOAT_LIST = new FieldType("FLOAT_LIST", 19, 19, collection3, javaType2);
        INT64_LIST = new FieldType("INT64_LIST", 20, 20, collection3, javaType3);
        UINT64_LIST = new FieldType("UINT64_LIST", 21, 21, collection3, javaType3);
        INT32_LIST = new FieldType("INT32_LIST", 22, 22, collection3, javaType4);
        FIXED64_LIST = new FieldType("FIXED64_LIST", 23, 23, collection3, javaType3);
        FIXED32_LIST = new FieldType("FIXED32_LIST", 24, 24, collection3, javaType4);
        BOOL_LIST = new FieldType("BOOL_LIST", 25, 25, collection3, javaType5);
        STRING_LIST = new FieldType("STRING_LIST", 26, 26, collection3, javaType6);
        MESSAGE_LIST = new FieldType("MESSAGE_LIST", 27, 27, collection3, javaType7);
        BYTES_LIST = new FieldType("BYTES_LIST", 28, 28, collection3, javaType8);
        UINT32_LIST = new FieldType("UINT32_LIST", 29, 29, collection3, javaType4);
        ENUM_LIST = new FieldType("ENUM_LIST", 30, 30, collection3, javaType9);
        SFIXED32_LIST = new FieldType("SFIXED32_LIST", 31, 31, collection3, javaType4);
        SFIXED64_LIST = new FieldType("SFIXED64_LIST", 32, 32, collection3, javaType3);
        SINT32_LIST = new FieldType("SINT32_LIST", 33, 33, collection3, javaType4);
        SINT64_LIST = new FieldType("SINT64_LIST", 34, 34, collection3, javaType3);
        Collection collection4 = Collection.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new FieldType("DOUBLE_LIST_PACKED", 35, 35, collection4, javaType);
        FLOAT_LIST_PACKED = new FieldType("FLOAT_LIST_PACKED", 36, 36, collection4, javaType2);
        INT64_LIST_PACKED = new FieldType("INT64_LIST_PACKED", 37, 37, collection4, javaType3);
        UINT64_LIST_PACKED = new FieldType("UINT64_LIST_PACKED", 38, 38, collection4, javaType3);
        INT32_LIST_PACKED = new FieldType("INT32_LIST_PACKED", 39, 39, collection4, javaType4);
        FIXED64_LIST_PACKED = new FieldType("FIXED64_LIST_PACKED", 40, 40, collection4, javaType3);
        FIXED32_LIST_PACKED = new FieldType("FIXED32_LIST_PACKED", 41, 41, collection4, javaType4);
        BOOL_LIST_PACKED = new FieldType("BOOL_LIST_PACKED", 42, 42, collection4, javaType5);
        UINT32_LIST_PACKED = new FieldType("UINT32_LIST_PACKED", 43, 43, collection4, javaType4);
        ENUM_LIST_PACKED = new FieldType("ENUM_LIST_PACKED", 44, 44, collection4, javaType9);
        SFIXED32_LIST_PACKED = new FieldType("SFIXED32_LIST_PACKED", 45, 45, collection4, javaType4);
        SFIXED64_LIST_PACKED = new FieldType("SFIXED64_LIST_PACKED", 46, 46, collection4, javaType3);
        SINT32_LIST_PACKED = new FieldType("SINT32_LIST_PACKED", 47, 47, collection4, javaType4);
        SINT64_LIST_PACKED = new FieldType("SINT64_LIST_PACKED", 48, 48, collection4, javaType3);
        GROUP_LIST = new FieldType("GROUP_LIST", 49, 49, collection3, javaType7);
        MAP = new FieldType("MAP", 50, 50, Collection.MAP, JavaType.VOID);
        f22124monoploid = attabal();
        f22122arytenoidectomy = new Type[0];
        FieldType[] fieldTypeArrValues = values();
        f22123kowloon = new FieldType[fieldTypeArrValues.length];
        for (FieldType fieldType : fieldTypeArrValues) {
            f22123kowloon[fieldType.id] = fieldType;
        }
    }

    public FieldType(String str, int i, int i2, Collection collection2, JavaType javaType) {
        int i3;
        super(str, i);
        this.id = i2;
        this.f22125collection = collection2;
        this.javaType = javaType;
        int iOrdinal = collection2.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            this.elementType = javaType.getBoxedType();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (collection2 != Collection.SCALAR || (i3 = attabal.f22127attabal[javaType.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static /* synthetic */ FieldType[] attabal() {
        return new FieldType[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    public static Type dern(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    public static FieldType forId(int i) {
        if (i < 0) {
            return null;
        }
        FieldType[] fieldTypeArr = f22123kowloon;
        if (i >= fieldTypeArr.length) {
            return null;
        }
        return fieldTypeArr[i];
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) f22124monoploid.clone();
    }

    public static Type wireman(Class<?> cls, Type[] typeArr) {
        while (true) {
            int i = 0;
            if (cls == List.class) {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
            Type typeDern = dern(cls);
            if (!(typeDern instanceof ParameterizedType)) {
                typeArr = f22122arytenoidectomy;
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                while (true) {
                    if (i >= length) {
                        cls = cls.getSuperclass();
                        break;
                    }
                    Class<?> cls2 = interfaces[i];
                    if (List.class.isAssignableFrom(cls2)) {
                        cls = cls2;
                        break;
                    }
                    i++;
                }
            } else {
                ParameterizedType parameterizedType = (ParameterizedType) typeDern;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    Type type = actualTypeArguments[i2];
                    if (type instanceof TypeVariable) {
                        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                        if (typeArr.length != typeParameters.length) {
                            throw new RuntimeException("Type array mismatch");
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= typeParameters.length) {
                                throw new RuntimeException("Unable to find replacement for " + type);
                            }
                            if (type == typeParameters[i3]) {
                                actualTypeArguments[i2] = typeArr[i3];
                                break;
                            }
                            i3++;
                        }
                    }
                }
                cls = (Class) parameterizedType.getRawType();
                typeArr = actualTypeArguments;
            }
        }
    }

    public JavaType getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.f22125collection.isList();
    }

    public boolean isMap() {
        return this.f22125collection == Collection.MAP;
    }

    public boolean isPacked() {
        return Collection.PACKED_VECTOR.equals(this.f22125collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.f22125collection == Collection.SCALAR;
    }

    public boolean isValidForField(Field field) {
        return Collection.VECTOR.equals(this.f22125collection) ? marial(field) : this.javaType.getType().isAssignableFrom(field.getType());
    }

    public final boolean marial(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] actualTypeArguments = f22122arytenoidectomy;
        if (field.getGenericType() instanceof ParameterizedType) {
            actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type typeWireman = wireman(type, actualTypeArguments);
        if (typeWireman instanceof Class) {
            return this.elementType.isAssignableFrom((Class) typeWireman);
        }
        return true;
    }
}
