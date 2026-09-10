package fl;

import ea.f2;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import zk.u0;
import zk.x0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends r implements pl.b, pl.c {
    @Override // pl.b
    public final d a(yl.c fqName) {
        kotlin.jvm.internal.n.f(fqName, "fqName");
        Member memberB = b();
        kotlin.jvm.internal.n.d(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return d0.c.j(declaredAnnotations, fqName);
        }
        return null;
    }

    public abstract Member b();

    public final yl.f c() {
        String name = b().getName();
        yl.f fVarE = name != null ? yl.f.e(name) : null;
        return fVarE == null ? yl.h.f54517a : fVarE;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    public final ArrayList d(Type[] typeArr, Annotation[][] annotationArr, boolean z10) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        a0 hVar;
        a0 yVar;
        String str;
        boolean z11;
        f2 f2Var;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        a aVar = a.f40972a;
        Member member = b();
        kotlin.jvm.internal.n.f(member, "member");
        f2 f2Var2 = a.f40973b;
        Object obj = null;
        if (f2Var2 == null) {
            synchronized (aVar) {
                f2Var2 = a.f40973b;
                if (f2Var2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        f2Var = new f2(cls.getMethod("getParameters", null), false, c.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null), 14);
                    } catch (NoSuchMethodException unused) {
                        f2Var = new f2(obj, false, obj, 14);
                    }
                    a.f40973b = f2Var;
                    f2Var2 = f2Var;
                }
            }
        }
        Method method2 = (Method) f2Var2.f39409b;
        if (method2 == null || (method = (Method) f2Var2.f39410c) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(member, null);
            kotlin.jvm.internal.n.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                Object objInvoke2 = method.invoke(obj2, null);
                kotlin.jvm.internal.n.d(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Type type = typeArr[i10];
            kotlin.jvm.internal.n.f(type, "type");
            boolean z12 = type instanceof Class;
            if (z12) {
                Class cls2 = (Class) type;
                if (cls2.isPrimitive()) {
                    yVar = new y(cls2);
                } else {
                    if (!(type instanceof GenericArrayType) || (z12 && ((Class) type).isArray())) {
                        hVar = new h(type);
                    } else {
                        hVar = type instanceof WildcardType ? new d0((WildcardType) type) : new p(type);
                    }
                    yVar = hVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    hVar = new h(type);
                } else {
                    hVar = new h(type);
                }
                yVar = hVar;
            }
            if (arrayList != null) {
                str = (String) xj.n.r0(i10 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + c() + " type=" + yVar + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z10) {
                z11 = true;
                if (i10 != typeArr.length - 1) {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            arrayList2.add(new c0(yVar, annotationArr[i10], str, z11));
        }
        return arrayList2;
    }

    public final n.a e() {
        int modifiers = b().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return x0.f55006d;
        }
        if (Modifier.isPrivate(modifiers)) {
            return u0.f55002d;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? dl.c.f38948d : dl.b.f38947d;
        }
        return dl.a.f38946d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && kotlin.jvm.internal.n.a(b(), ((v) obj).b());
    }

    @Override // pl.b
    public final Collection getAnnotations() {
        Member memberB = b();
        kotlin.jvm.internal.n.d(memberB, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? d0.c.m(declaredAnnotations) : xj.v.f53866a;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
