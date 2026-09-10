package kotlin.reflect.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ReflectJvmMapping {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                LinkedHashMap linkedHashMap = KotlinClassHeader.Kind.f44025Y;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LinkedHashMap linkedHashMap2 = KotlinClassHeader.Kind.f44025Y;
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LinkedHashMap linkedHashMap3 = KotlinClassHeader.Kind.f44025Y;
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public static final Field a(KProperty kProperty) {
        Intrinsics.f(kProperty, "<this>");
        KPropertyImpl kPropertyImplC = UtilKt.c(kProperty);
        if (kPropertyImplC != null) {
            return (Field) kPropertyImplC.k0.getX();
        }
        return null;
    }

    public static final Method b(KFunction kFunction) {
        Caller callerC;
        Intrinsics.f(kFunction, "<this>");
        KCallableImpl kCallableImplA = UtilKt.a(kFunction);
        Member f43435a = (kCallableImplA == null || (callerC = kCallableImplA.c()) == null) ? null : callerC.getF43435a();
        if (f43435a instanceof Method) {
            return (Method) f43435a;
        }
        return null;
    }
}
