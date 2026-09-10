package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.d9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JvmTypeFactoryImpl f44008a = new JvmTypeFactoryImpl();

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static JvmType a(String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        Intrinsics.f(representation, "representation");
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i2];
            if (jvmPrimitiveType.d().charAt(0) == cCharAt) {
                break;
            }
            i2++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
            return new JvmType.Array(a(strSubstring));
        }
        if (cCharAt == 'L') {
            StringsKt.q(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return new JvmType.Object(strSubstring2);
    }

    public static String c(JvmType type) {
        String strD;
        Intrinsics.f(type, "type");
        if (type instanceof JvmType.Array) {
            return d9.i.d + c(((JvmType.Array) type).f44005i);
        }
        if (type instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveType = ((JvmType.Primitive) type).f44007i;
            return (jvmPrimitiveType == null || (strD = jvmPrimitiveType.d()) == null) ? "V" : strD;
        }
        if (type instanceof JvmType.Object) {
            return a.p(new StringBuilder("L"), ((JvmType.Object) type).f44006i, ';');
        }
        throw new NoWhenBranchMatchedException();
    }

    public final JvmType.Object b(String internalName) {
        Intrinsics.f(internalName, "internalName");
        return new JvmType.Object(internalName);
    }
}
