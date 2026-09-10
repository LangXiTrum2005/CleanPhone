package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");

    public static final HashSet n0 = new HashSet();
    public static final HashMap o0 = new HashMap();
    public static final EnumMap p0 = new EnumMap(PrimitiveType.class);
    public static final HashMap q0 = new HashMap();
    public final PrimitiveType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f44321Y;
    public final String Z;
    public final FqName e0;

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            n0.add(jvmPrimitiveType.h());
            o0.put(jvmPrimitiveType.f44321Y, jvmPrimitiveType);
            p0.put(jvmPrimitiveType.g(), jvmPrimitiveType);
            q0.put(jvmPrimitiveType.d(), jvmPrimitiveType);
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, String str2, String str3) {
        if (primitiveType == null) {
            a(6);
            throw null;
        }
        this.X = primitiveType;
        this.f44321Y = str;
        this.Z = str2;
        this.e0 = new FqName(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        if (i2 != 2 && i2 != 4) {
            switch (i2) {
                case 10:
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 2 && i2 != 4) {
            switch (i2) {
                case 10:
                case 11:
                case 12:
                case 13:
                    i3 = 2;
                    break;
                default:
                    i3 = 3;
                    break;
            }
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 7:
                objArr[0] = "name";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = "type";
                break;
            case 5:
            case 8:
                objArr[0] = "desc";
                break;
            case 6:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "className";
                break;
        }
        if (i2 != 2 && i2 != 4) {
            switch (i2) {
                case 10:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 11:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 12:
                    objArr[1] = "getDesc";
                    break;
                case 13:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i2) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 2 && i2 != 4) {
            switch (i2) {
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static JvmPrimitiveType b(String str) {
        JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) o0.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String d() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }

    public final PrimitiveType g() {
        PrimitiveType primitiveType = this.X;
        if (primitiveType != null) {
            return primitiveType;
        }
        a(10);
        throw null;
    }

    public final FqName h() {
        FqName fqName = this.e0;
        if (fqName != null) {
            return fqName;
        }
        a(13);
        throw null;
    }
}
