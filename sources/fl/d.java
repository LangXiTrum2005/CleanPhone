package fl;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Annotation f40988a;

    public d(Annotation annotation) {
        kotlin.jvm.internal.n.f(annotation, "annotation");
        this.f40988a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        e oVar;
        Annotation annotation = this.f40988a;
        Method[] declaredMethods = d0.c.p(d0.c.l(annotation)).getDeclaredMethods();
        kotlin.jvm.internal.n.e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            kotlin.jvm.internal.n.e(objInvoke, "method.invoke(annotation)");
            yl.f fVarE = yl.f.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = c.f40980a;
            if (Enum.class.isAssignableFrom(cls)) {
                oVar = new s(fVarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                oVar = new f(fVarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                oVar = new g(fVarE, (Object[]) objInvoke);
            } else {
                oVar = objInvoke instanceof Class ? new o(fVarE, (Class) objInvoke) : new u(fVarE, objInvoke);
            }
            arrayList.add(oVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f40988a == ((d) obj).f40988a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f40988a);
    }

    public final String toString() {
        return d.class.getName() + ": " + this.f40988a;
    }
}
