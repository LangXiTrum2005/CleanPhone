package fl;

import com.adjust.sdk.Constants;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f40980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f40981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f40982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f40983d;

    static {
        e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        int i10 = 0;
        List listQ = xj.o.Q(e0Var.b(Boolean.TYPE), e0Var.b(Byte.TYPE), e0Var.b(Character.TYPE), e0Var.b(Double.TYPE), e0Var.b(Float.TYPE), e0Var.b(Integer.TYPE), e0Var.b(Long.TYPE), e0Var.b(Short.TYPE));
        f40980a = listQ;
        List<qk.d> list = listQ;
        ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
        for (qk.d dVar : list) {
            arrayList.add(new wj.f(d0.c.q(dVar), d0.c.r(dVar)));
        }
        f40981b = xj.b0.W(arrayList);
        List<qk.d> list2 = f40980a;
        ArrayList arrayList2 = new ArrayList(xj.p.W(list2, 10));
        for (qk.d dVar2 : list2) {
            arrayList2.add(new wj.f(d0.c.r(dVar2), d0.c.q(dVar2)));
        }
        f40982c = xj.b0.W(arrayList2);
        List listQ2 = xj.o.Q(jk.a.class, jk.b.class, jk.c.class, jk.d.class, tk.e.class, jk.e.class, jk.f.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class, tk.e.class);
        ArrayList arrayList3 = new ArrayList(xj.p.W(listQ2, 10));
        for (Object obj : listQ2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xj.o.V();
                throw null;
            }
            arrayList3.add(new wj.f((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f40983d = xj.b0.W(arrayList3);
    }

    public static final yl.b a(Class cls) {
        kotlin.jvm.internal.n.f(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(defpackage.e.l(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(defpackage.e.l(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return declaringClass != null ? a(declaringClass).d(yl.f.e(cls.getSimpleName())) : yl.b.j(new yl.c(cls.getName()));
        }
        yl.c cVar = new yl.c(cls.getName());
        return new yl.b(cVar.e(), yl.c.j(cVar.f()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        kotlin.jvm.internal.n.f(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return an.p.m0(cls.getName(), '.', '/');
            }
            return "L" + an.p.m0(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(defpackage.e.l(cls, "Unsupported primitive type: "));
    }

    public static final List c(Type type) {
        kotlin.jvm.internal.n.f(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return xj.v.f53866a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return zm.l.W(new zm.g(zm.l.R(type, b.f40974f), b.f40975g, zm.o.f55118b));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.n.e(actualTypeArguments, "actualTypeArguments");
        return xj.k.C0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        kotlin.jvm.internal.n.f(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.n.e(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
