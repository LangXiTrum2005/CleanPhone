package fl;

import com.google.android.gms.internal.play_billing.q1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends r implements pl.b, pl.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f41001a;

    public n(Class klass) {
        kotlin.jvm.internal.n.f(klass, "klass");
        this.f41001a = klass;
    }

    @Override // pl.b
    public final d a(yl.c fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.n.f(fqName, "fqName");
        Class cls = this.f41001a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return d0.c.j(declaredAnnotations, fqName);
    }

    public final Collection b() {
        Field[] declaredFields = this.f41001a.getDeclaredFields();
        kotlin.jvm.internal.n.e(declaredFields, "klass.declaredFields");
        return zm.l.W(zm.l.U(new zm.f(xj.k.b0(declaredFields), false, k.f40998b), l.f40999b));
    }

    public final yl.c c() {
        return c.a(this.f41001a).b();
    }

    public final Collection d() {
        Method[] declaredMethods = this.f41001a.getDeclaredMethods();
        kotlin.jvm.internal.n.e(declaredMethods, "klass.declaredMethods");
        return zm.l.W(zm.l.U(zm.l.P(xj.k.b0(declaredMethods), new al.f(this, 9)), m.f41000b));
    }

    public final ArrayList e() {
        Class clazz = this.f41001a;
        kotlin.jvm.internal.n.f(clazz, "clazz");
        zc.u uVar = q1.f24451a;
        Object[] objArr = null;
        if (uVar == null) {
            try {
                uVar = new zc.u(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 6);
            } catch (NoSuchMethodException unused) {
                uVar = new zc.u(objArr, objArr, objArr, objArr, 6);
            }
            q1.f24451a = uVar;
        }
        Method method = (Method) uVar.f54882e;
        objArr = method != null ? (Object[]) method.invoke(clazz, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new z(obj));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return kotlin.jvm.internal.n.a(this.f41001a, ((n) obj).f41001a);
        }
        return false;
    }

    public final boolean f() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f41001a;
        kotlin.jvm.internal.n.f(clazz, "clazz");
        zc.u uVar = q1.f24451a;
        Boolean bool = null;
        if (uVar == null) {
            try {
                uVar = new zc.u(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 6);
            } catch (NoSuchMethodException unused) {
                uVar = new zc.u(bool, bool, bool, bool, 6);
            }
            q1.f24451a = uVar;
        }
        Method method = (Method) uVar.f54881d;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f41001a;
        kotlin.jvm.internal.n.f(clazz, "clazz");
        zc.u uVar = q1.f24451a;
        Boolean bool = null;
        if (uVar == null) {
            try {
                uVar = new zc.u(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 6);
            } catch (NoSuchMethodException unused) {
                uVar = new zc.u(bool, bool, bool, bool, 6);
            }
            q1.f24451a = uVar;
        }
        Method method = (Method) uVar.f54879b;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // pl.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f41001a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? xj.v.f53866a : d0.c.m(declaredAnnotations);
    }

    @Override // pl.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f41001a.getTypeParameters();
        kotlin.jvm.internal.n.e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new b0(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f41001a.hashCode();
    }

    public final String toString() {
        return n.class.getName() + ": " + this.f41001a;
    }
}
