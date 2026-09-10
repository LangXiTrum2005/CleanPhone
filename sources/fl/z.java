package fl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41012a;

    public z(Object recordComponent) {
        kotlin.jvm.internal.n.f(recordComponent, "recordComponent");
        this.f41012a = recordComponent;
    }

    @Override // fl.v
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f41012a;
        kotlin.jvm.internal.n.f(recordComponent, "recordComponent");
        eb.d0 d0Var = com.google.android.gms.internal.auth.o.f22880c;
        Method method = null;
        if (d0Var == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                d0Var = new eb.d0((Object) cls.getMethod("getType", null), false, (Object) cls.getMethod("getAccessor", null), 14);
            } catch (NoSuchMethodException unused) {
                d0Var = new eb.d0((Object) method, false, (Object) method, 14);
            }
            com.google.android.gms.internal.auth.o.f22880c = d0Var;
        }
        Method method2 = (Method) d0Var.f39977c;
        if (method2 != null) {
            Object objInvoke = method2.invoke(recordComponent, null);
            kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final pl.d f() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f41012a;
        kotlin.jvm.internal.n.f(recordComponent, "recordComponent");
        eb.d0 d0Var = com.google.android.gms.internal.auth.o.f22880c;
        Class cls = null;
        if (d0Var == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                d0Var = new eb.d0((Object) cls2.getMethod("getType", null), false, (Object) cls2.getMethod("getAccessor", null), 14);
            } catch (NoSuchMethodException unused) {
                d0Var = new eb.d0((Object) cls, false, (Object) cls, 14);
            }
            com.google.android.gms.internal.auth.o.f22880c = d0Var;
        }
        Method method = (Method) d0Var.f39976b;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, null);
            kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new p(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
