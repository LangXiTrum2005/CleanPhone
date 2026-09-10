package kotlin.reflect.jvm.internal.impl.builtins.functions;

import android.support.v4.media.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
public final class FunctionClassKind {
    public static final Companion Z;
    public static final FunctionClassKind e0;
    public static final FunctionClassKind f0;
    public static final FunctionClassKind g0;
    public static final FunctionClassKind h0;
    public static final /* synthetic */ FunctionClassKind[] i0;
    public final FqName X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f43517Y;

    public static final class Companion {

        public static final class KindWithArity {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final FunctionClassKind f43518a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f43519b;

            public KindWithArity(FunctionClassKind functionClassKind, int i2) {
                this.f43518a = functionClassKind;
                this.f43519b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof KindWithArity)) {
                    return false;
                }
                KindWithArity kindWithArity = (KindWithArity) obj;
                return this.f43518a == kindWithArity.f43518a && this.f43519b == kindWithArity.f43519b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f43519b) + (this.f43518a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("KindWithArity(kind=");
                sb.append(this.f43518a);
                sb.append(", arity=");
                return a.p(sb, this.f43519b, ')');
            }
        }

        public static KindWithArity a(String str, FqName packageFqName) {
            FunctionClassKind functionClassKind;
            Integer numValueOf;
            Intrinsics.f(packageFqName, "packageFqName");
            FunctionClassKind[] functionClassKindArrValues = FunctionClassKind.values();
            int length = functionClassKindArrValues.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    functionClassKind = null;
                    break;
                }
                functionClassKind = functionClassKindArrValues[i3];
                if (Intrinsics.a(functionClassKind.X, packageFqName) && StringsKt.M(str, functionClassKind.f43517Y, false)) {
                    break;
                }
                i3++;
            }
            if (functionClassKind != null) {
                String strSubstring = str.substring(functionClassKind.f43517Y.length());
                Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (strSubstring.length() == 0) {
                    numValueOf = null;
                    break;
                }
                int length2 = strSubstring.length();
                int i4 = 0;
                while (true) {
                    if (i2 >= length2) {
                        numValueOf = Integer.valueOf(i4);
                        break;
                    }
                    int iCharAt = strSubstring.charAt(i2) - '0';
                    if (iCharAt < 0 || iCharAt >= 10) {
                        numValueOf = null;
                        break;
                    }
                    i4 = (i4 * 10) + iCharAt;
                    i2++;
                }
                if (numValueOf != null) {
                    return new KindWithArity(functionClassKind, numValueOf.intValue());
                }
            }
            return null;
        }
    }

    static {
        FunctionClassKind functionClassKind = new FunctionClassKind("Function", 0, StandardNames.k, "Function");
        e0 = functionClassKind;
        FunctionClassKind functionClassKind2 = new FunctionClassKind("SuspendFunction", 1, StandardNames.f43475e, "SuspendFunction");
        f0 = functionClassKind2;
        FqName fqName = StandardNames.f43476h;
        FunctionClassKind functionClassKind3 = new FunctionClassKind("KFunction", 2, fqName, "KFunction");
        g0 = functionClassKind3;
        FunctionClassKind functionClassKind4 = new FunctionClassKind("KSuspendFunction", 3, fqName, "KSuspendFunction");
        h0 = functionClassKind4;
        i0 = new FunctionClassKind[]{functionClassKind, functionClassKind2, functionClassKind3, functionClassKind4};
        Z = new Companion();
    }

    public FunctionClassKind(String str, int i2, FqName fqName, String str2) {
        super(str, i2);
        this.X = fqName;
        this.f43517Y = str2;
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) i0.clone();
    }

    public final Name a(int i2) {
        return Name.g(this.f43517Y + i2);
    }
}
