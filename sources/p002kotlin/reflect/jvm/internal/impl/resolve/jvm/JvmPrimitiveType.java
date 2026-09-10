package p002kotlin.reflect.jvm.internal.impl.resolve.jvm;

import byname.dern;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes5.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");

    private final String desc;
    private final String name;
    private final PrimitiveType primitiveType;
    private final dern wrapperFqName;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final Set<dern> f31351kowloon = new HashSet();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final Map<String, JvmPrimitiveType> f31350arytenoidectomy = new HashMap();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final Map<PrimitiveType, JvmPrimitiveType> f31353monoploid = new EnumMap(PrimitiveType.class);

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final Map<String, JvmPrimitiveType> f31354polloi = new HashMap();

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            f31351kowloon.add(jvmPrimitiveType.getWrapperFqName());
            f31350arytenoidectomy.put(jvmPrimitiveType.getJavaKeywordName(), jvmPrimitiveType);
            f31353monoploid.put(jvmPrimitiveType.getPrimitiveType(), jvmPrimitiveType);
            f31354polloi.put(jvmPrimitiveType.getDesc(), jvmPrimitiveType);
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, String str2, String str3) {
        if (primitiveType == null) {
            attabal(6);
        }
        if (str == null) {
            attabal(7);
        }
        if (str2 == null) {
            attabal(8);
        }
        if (str3 == null) {
            attabal(9);
        }
        this.primitiveType = primitiveType;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new dern(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        if (i != 2 && i != 4) {
            switch (i) {
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
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
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
                objArr[0] = CampaignEx.JSON_KEY_DESC;
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
        if (i != 2 && i != 4) {
            switch (i) {
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
        switch (i) {
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
        if (i != 2 && i != 4) {
            switch (i) {
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

    public static JvmPrimitiveType get(String str) {
        if (str == null) {
            attabal(1);
        }
        JvmPrimitiveType jvmPrimitiveType = f31350arytenoidectomy.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String getDesc() {
        String str = this.desc;
        if (str == null) {
            attabal(12);
        }
        return str;
    }

    public String getJavaKeywordName() {
        String str = this.name;
        if (str == null) {
            attabal(11);
        }
        return str;
    }

    public PrimitiveType getPrimitiveType() {
        PrimitiveType primitiveType = this.primitiveType;
        if (primitiveType == null) {
            attabal(10);
        }
        return primitiveType;
    }

    public dern getWrapperFqName() {
        dern dernVar = this.wrapperFqName;
        if (dernVar == null) {
            attabal(13);
        }
        return dernVar;
    }

    public static JvmPrimitiveType get(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            attabal(3);
        }
        JvmPrimitiveType jvmPrimitiveType = f31353monoploid.get(primitiveType);
        if (jvmPrimitiveType == null) {
            attabal(4);
        }
        return jvmPrimitiveType;
    }
}
