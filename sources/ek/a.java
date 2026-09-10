package ek;

import java.lang.reflect.Method;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f40110a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        n.c(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (n.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                n.e(parameterTypes, "getParameterTypes(...)");
                if (n.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f40110a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !n.a(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
