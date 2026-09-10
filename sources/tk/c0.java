package tk;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 implements kotlin.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final an.g f50957a = new an.g("<v#(\\d+)>");

    public static Method n(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Class clsG;
        Method methodN;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodQ = q(cls, str, clsArr, cls2);
        if (methodQ != null) {
            return methodQ;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodN = n(superclass, str, clsArr, cls2, z10)) != null) {
            return methodN;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.n.e(interfaces, "interfaces");
        for (Class<?> superInterface : interfaces) {
            kotlin.jvm.internal.n.e(superInterface, "superInterface");
            Method methodN2 = n(superInterface, str, clsArr, cls2, z10);
            if (methodN2 != null) {
                return methodN2;
            }
            if (z10 && (clsG = no.b.G(fl.c.d(superInterface), superInterface.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = superInterface;
                Method methodQ2 = q(clsG, str, clsArr, cls2);
                if (methodQ2 != null) {
                    return methodQ2;
                }
            }
        }
        return null;
    }

    public static Constructor p(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method q(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.n.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.n.e(declaredMethods, "declaredMethods");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.n.a(method.getName(), str) && kotlin.jvm.internal.n.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void c(ArrayList arrayList, String str, boolean z10) {
        ArrayList arrayListM = m(str);
        arrayList.addAll(arrayListM);
        int size = (arrayListM.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class TYPE = Integer.TYPE;
            kotlin.jvm.internal.n.e(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        if (!z10) {
            arrayList.add(Object.class);
        } else {
            arrayList.remove(kotlin.jvm.internal.g.class);
            arrayList.add(kotlin.jvm.internal.g.class);
        }
    }

    public final Method e(String name, String desc) throws ClassNotFoundException {
        Method methodN;
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(desc, "desc");
        if (name.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) m(desc).toArray(new Class[0]);
        Class clsO = o(an.h.v0(desc, ')', 0, 6) + 1, desc.length(), desc);
        Method methodN2 = n(k(), name, clsArr, clsO, false);
        if (methodN2 != null) {
            return methodN2;
        }
        if (!k().isInterface() || (methodN = n(Object.class, name, clsArr, clsO, false)) == null) {
            return null;
        }
        return methodN;
    }

    public abstract Collection f();

    public abstract Collection h(yl.f fVar);

    public abstract zk.h0 i(int i10);

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    public final Collection j(im.n scope, int i10) {
        r rVar;
        kotlin.jvm.internal.n.f(scope, "scope");
        d5.u.n(i10, "belonginess");
        b0 b0Var = new b0(this, 11);
        Collection<zk.j> collectionR = a.a.r(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (zk.j jVar : collectionR) {
            if (jVar instanceof zk.c) {
                zk.c cVar = (zk.c) jVar;
                if (kotlin.jvm.internal.n.a(cVar.getVisibility(), zk.n.f54981h)) {
                    rVar = null;
                } else if ((cVar.getKind() != 2) == (i10 == 1)) {
                    rVar = (r) jVar.c0(b0Var, wj.r.f53297a);
                } else {
                    rVar = null;
                }
            } else {
                rVar = null;
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return xj.n.N0(arrayList);
    }

    public Class k() {
        Class clsA = a();
        List list = fl.c.f40980a;
        kotlin.jvm.internal.n.f(clsA, "<this>");
        Class cls = (Class) fl.c.f40982c.get(clsA);
        return cls == null ? a() : cls;
    }

    public abstract Collection l(yl.f fVar);

    public final ArrayList m(String str) {
        int iV0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (str.charAt(i10) != ')') {
            int i11 = i10;
            while (str.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = str.charAt(i11);
            if (an.h.r0("VZCBSIFJD", cCharAt)) {
                iV0 = i11 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new cn.c0("Unknown type prefix in the method signature: ".concat(str), 3);
                }
                iV0 = an.h.v0(str, ';', i10, 4) + 1;
            }
            arrayList.add(o(i10, iV0, str));
            i10 = iV0;
        }
        return arrayList;
    }

    public final Class o(int i10, int i11, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i10);
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = fl.c.d(a());
            String strSubstring = str.substring(i10 + 1, i11 - 1);
            kotlin.jvm.internal.n.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Class<?> clsLoadClass = classLoaderD.loadClass(an.p.m0(strSubstring, '/', '.'));
            kotlin.jvm.internal.n.e(clsLoadClass, "jClass.safeClassLoader.l…d - 1).replace('/', '.'))");
            return clsLoadClass;
        }
        if (cCharAt == '[') {
            Class clsO = o(i10 + 1, i11, str);
            yl.c cVar = v1.f51075a;
            kotlin.jvm.internal.n.f(clsO, "<this>");
            return Array.newInstance((Class<?>) clsO, 0).getClass();
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            kotlin.jvm.internal.n.e(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new cn.c0("Unknown type prefix in the method signature: ".concat(str), 3);
    }
}
