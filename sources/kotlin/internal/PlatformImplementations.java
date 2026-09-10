package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class PlatformImplementations {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReflectThrowable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f43299a;

        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.c(methods);
            int length = methods.length;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    break;
                }
                Method method2 = methods[i2];
                if (Intrinsics.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.e(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        method = method2;
                        break;
                    }
                }
                i2++;
            }
            f43299a = method;
            int length2 = methods.length;
            for (int i3 = 0; i3 < length2 && !Intrinsics.a(methods[i3].getName(), "getSuppressed"); i3++) {
            }
        }
    }

    public void a(Throwable cause, Throwable exception) {
        Intrinsics.f(cause, "cause");
        Intrinsics.f(exception, "exception");
        Method method = ReflectThrowable.f43299a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }
}
