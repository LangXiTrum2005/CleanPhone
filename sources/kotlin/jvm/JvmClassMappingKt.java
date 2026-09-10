package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class JvmClassMappingKt {
    public static final KClass a(Annotation annotation) {
        Intrinsics.f(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Intrinsics.e(clsAnnotationType, "annotationType(...)");
        return e(clsAnnotationType);
    }

    public static final Class b(KClass kClass) {
        Intrinsics.f(kClass, "<this>");
        Class x = ((ClassBasedDeclarationContainer) kClass).getX();
        Intrinsics.d(x, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return x;
    }

    public static final Class c(KClass kClass) {
        Intrinsics.f(kClass, "<this>");
        Class x = ((ClassBasedDeclarationContainer) kClass).getX();
        if (!x.isPrimitive()) {
            return x;
        }
        String name = x.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? x : Double.class;
            case 104431:
                return !name.equals("int") ? x : Integer.class;
            case 3039496:
                return !name.equals("byte") ? x : Byte.class;
            case 3052374:
                return !name.equals("char") ? x : Character.class;
            case 3327612:
                return !name.equals("long") ? x : Long.class;
            case 3625364:
                return !name.equals("void") ? x : Void.class;
            case 64711720:
                return !name.equals("boolean") ? x : Boolean.class;
            case 97526364:
                return !name.equals("float") ? x : Float.class;
            case 109413500:
                return !name.equals("short") ? x : Short.class;
            default:
                return x;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class d(KClass kClass) {
        Intrinsics.f(kClass, "<this>");
        Class x = ((ClassBasedDeclarationContainer) kClass).getX();
        if (x.isPrimitive()) {
            return x;
        }
        String name = x.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final KClass e(Class cls) {
        Intrinsics.f(cls, "<this>");
        return Reflection.f43333a.b(cls);
    }
}
