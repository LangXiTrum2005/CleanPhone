package gm;

import com.adjust.sdk.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import wk.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum c {
    BOOLEAN(j.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(j.CHAR, "char", "C", "java.lang.Character"),
    BYTE(j.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(j.SHORT, "short", "S", "java.lang.Short"),
    INT(j.INT, "int", "I", "java.lang.Integer"),
    FLOAT(j.FLOAT, "float", "F", "java.lang.Float"),
    LONG(j.LONG, Constants.LONG, "J", "java.lang.Long"),
    DOUBLE(j.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashSet f41968m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final HashMap f41969n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumMap f41970o = new EnumMap(j.class);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final HashMap f41971p = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f41973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f41975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yl.c f41976d;

    static {
        for (c cVar : values()) {
            f41968m.add(cVar.h());
            f41969n.put(cVar.f41974b, cVar);
            f41970o.put(cVar.g(), cVar);
            f41971p.put(cVar.d(), cVar);
        }
    }

    c(j jVar, String str, String str2, String str3) {
        if (jVar == null) {
            a(6);
            throw null;
        }
        this.f41973a = jVar;
        this.f41974b = str;
        this.f41975c = str2;
        this.f41976d = new yl.c(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
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
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
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
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
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
        switch (i10) {
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
        if (i10 != 2 && i10 != 4) {
            switch (i10) {
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

    public static c b(String str) {
        c cVar = (c) f41969n.get(str);
        if (cVar != null) {
            return cVar;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    public final String d() {
        String str = this.f41975c;
        if (str != null) {
            return str;
        }
        a(12);
        throw null;
    }

    public final j g() {
        j jVar = this.f41973a;
        if (jVar != null) {
            return jVar;
        }
        a(10);
        throw null;
    }

    public final yl.c h() {
        yl.c cVar = this.f41976d;
        if (cVar != null) {
            return cVar;
        }
        a(13);
        throw null;
    }
}
