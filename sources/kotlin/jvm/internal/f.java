package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements qk.d, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f44762b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f44763a;

    static {
        List listQ = xj.o.Q(jk.a.class, jk.b.class, jk.c.class, jk.d.class, tk.e.class, jk.e.class, jk.f.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class);
        ArrayList arrayList = new ArrayList(xj.p.W(listQ, 10));
        int i10 = 0;
        for (Object obj : listQ) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xj.o.V();
                throw null;
            }
            arrayList.add(new wj.f((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f44762b = xj.b0.W(arrayList);
    }

    public f(Class jClass) {
        n.f(jClass, "jClass");
        this.f44763a = jClass;
    }

    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f44763a;
    }

    @Override // qk.d
    public final boolean b(Object obj) {
        Class jClass = this.f44763a;
        n.f(jClass, "jClass");
        Map map = f44762b;
        n.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return h0.e(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = d0.c.q(d0.c.s(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override // qk.d
    public final String d() {
        String strG;
        Class jClass = this.f44763a;
        n.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strG2 = n.g(jClass.getName());
            return strG2 == null ? jClass.getCanonicalName() : strG2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strG = n.g(componentType.getName())) != null) {
            strConcat = strG.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && d0.c.q(this).equals(d0.c.q((qk.d) obj));
    }

    @Override // qk.d
    public final String g() {
        String strJ;
        Class jClass = this.f44763a;
        n.f(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strJ2 = n.j(jClass.getName());
                return strJ2 == null ? jClass.getSimpleName() : strJ2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strJ = n.j(componentType.getName())) != null) {
                strConcat = strJ.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return an.h.M0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return an.h.M0(simpleName, enclosingConstructor.getName() + '$', simpleName);
        }
        int iV0 = an.h.v0(simpleName, '$', 0, 6);
        if (iV0 == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iV0 + 1, simpleName.length());
        n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final int hashCode() {
        return d0.c.q(this).hashCode();
    }

    public final String toString() {
        return this.f44763a.toString() + " (Kotlin reflection is not available)";
    }
}
