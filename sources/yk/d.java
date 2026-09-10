package yk;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f54447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f54448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f54449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f54450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final yl.b f54451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final yl.c f54452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final yl.b f54453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f54454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f54455i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f54456j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f54457k;
    public static final HashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f54458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f54459n;

    static {
        StringBuilder sb2 = new StringBuilder();
        xk.e eVar = xk.e.f53888d;
        sb2.append(eVar.f53893a.f54505a.toString());
        sb2.append('.');
        sb2.append(eVar.f53894b);
        f54447a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        xk.e eVar2 = xk.e.f53890f;
        sb3.append(eVar2.f53893a.f54505a.toString());
        sb3.append('.');
        sb3.append(eVar2.f53894b);
        f54448b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        xk.e eVar3 = xk.e.f53889e;
        sb4.append(eVar3.f53893a.f54505a.toString());
        sb4.append('.');
        sb4.append(eVar3.f53894b);
        f54449c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        xk.e eVar4 = xk.e.f53891g;
        sb5.append(eVar4.f53893a.f54505a.toString());
        sb5.append('.');
        sb5.append(eVar4.f53894b);
        f54450d = sb5.toString();
        yl.b bVarJ = yl.b.j(new yl.c("kotlin.jvm.functions.FunctionN"));
        f54451e = bVarJ;
        f54452f = bVarJ.b();
        f54453g = yl.i.f54536n;
        d(Class.class);
        f54454h = new HashMap();
        f54455i = new HashMap();
        f54456j = new HashMap();
        f54457k = new HashMap();
        l = new HashMap();
        f54458m = new HashMap();
        yl.b bVarJ2 = yl.b.j(wk.l.A);
        yl.c cVar = wk.l.I;
        yl.c cVarG = bVarJ2.g();
        yl.c cVarG2 = bVarJ2.g();
        kotlin.jvm.internal.n.e(cVarG2, "kotlinReadOnly.packageFqName");
        yl.c cVarY = t9.e.y(cVar, cVarG2);
        c cVar2 = new c(d(Iterable.class), bVarJ2, new yl.b(cVarG, cVarY, false));
        yl.b bVarJ3 = yl.b.j(wk.l.f53362z);
        yl.c cVar3 = wk.l.H;
        yl.c cVarG3 = bVarJ3.g();
        yl.c cVarG4 = bVarJ3.g();
        kotlin.jvm.internal.n.e(cVarG4, "kotlinReadOnly.packageFqName");
        c cVar4 = new c(d(Iterator.class), bVarJ3, new yl.b(cVarG3, t9.e.y(cVar3, cVarG4), false));
        yl.b bVarJ4 = yl.b.j(wk.l.B);
        yl.c cVar5 = wk.l.J;
        yl.c cVarG5 = bVarJ4.g();
        yl.c cVarG6 = bVarJ4.g();
        kotlin.jvm.internal.n.e(cVarG6, "kotlinReadOnly.packageFqName");
        c cVar6 = new c(d(Collection.class), bVarJ4, new yl.b(cVarG5, t9.e.y(cVar5, cVarG6), false));
        yl.b bVarJ5 = yl.b.j(wk.l.C);
        yl.c cVar7 = wk.l.K;
        yl.c cVarG7 = bVarJ5.g();
        yl.c cVarG8 = bVarJ5.g();
        kotlin.jvm.internal.n.e(cVarG8, "kotlinReadOnly.packageFqName");
        c cVar8 = new c(d(List.class), bVarJ5, new yl.b(cVarG7, t9.e.y(cVar7, cVarG8), false));
        yl.b bVarJ6 = yl.b.j(wk.l.E);
        yl.c cVar9 = wk.l.M;
        yl.c cVarG9 = bVarJ6.g();
        yl.c cVarG10 = bVarJ6.g();
        kotlin.jvm.internal.n.e(cVarG10, "kotlinReadOnly.packageFqName");
        c cVar10 = new c(d(Set.class), bVarJ6, new yl.b(cVarG9, t9.e.y(cVar9, cVarG10), false));
        yl.b bVarJ7 = yl.b.j(wk.l.D);
        yl.c cVar11 = wk.l.L;
        yl.c cVarG11 = bVarJ7.g();
        yl.c cVarG12 = bVarJ7.g();
        kotlin.jvm.internal.n.e(cVarG12, "kotlinReadOnly.packageFqName");
        c cVar12 = new c(d(ListIterator.class), bVarJ7, new yl.b(cVarG11, t9.e.y(cVar11, cVarG12), false));
        yl.c cVar13 = wk.l.F;
        yl.b bVarJ8 = yl.b.j(cVar13);
        yl.c cVar14 = wk.l.N;
        yl.c cVarG13 = bVarJ8.g();
        yl.c cVarG14 = bVarJ8.g();
        kotlin.jvm.internal.n.e(cVarG14, "kotlinReadOnly.packageFqName");
        c cVar15 = new c(d(Map.class), bVarJ8, new yl.b(cVarG13, t9.e.y(cVar14, cVarG14), false));
        yl.b bVarD = yl.b.j(cVar13).d(wk.l.G.f());
        yl.c cVar16 = wk.l.O;
        yl.c cVarG15 = bVarD.g();
        yl.c cVarG16 = bVarD.g();
        kotlin.jvm.internal.n.e(cVarG16, "kotlinReadOnly.packageFqName");
        List<c> listQ = o.Q(cVar2, cVar4, cVar6, cVar8, cVar10, cVar12, cVar15, new c(d(Map.Entry.class), bVarD, new yl.b(cVarG15, t9.e.y(cVar16, cVarG16), false)));
        f54459n = listQ;
        c(Object.class, wk.l.f53335a);
        c(String.class, wk.l.f53343f);
        c(CharSequence.class, wk.l.f53342e);
        a(d(Throwable.class), yl.b.j(wk.l.f53348k));
        c(Cloneable.class, wk.l.f53339c);
        c(Number.class, wk.l.f53346i);
        a(d(Comparable.class), yl.b.j(wk.l.l));
        c(Enum.class, wk.l.f53347j);
        a(d(Annotation.class), yl.b.j(wk.l.f53355s));
        for (c cVar17 : listQ) {
            yl.b bVar = cVar17.f54444a;
            yl.b bVar2 = cVar17.f54445b;
            yl.b bVar3 = cVar17.f54446c;
            a(bVar, bVar2);
            b(bVar3.b(), bVar);
            l.put(bVar3, bVar2);
            f54458m.put(bVar2, bVar3);
            yl.c cVarB = bVar2.b();
            yl.c cVarB2 = bVar3.b();
            HashMap map = f54456j;
            yl.e eVarI = bVar3.b().i();
            kotlin.jvm.internal.n.e(eVarI, "mutableClassId.asSingleFqName().toUnsafe()");
            map.put(eVarI, cVarB);
            HashMap map2 = f54457k;
            yl.e eVarI2 = cVarB.i();
            kotlin.jvm.internal.n.e(eVarI2, "readOnlyFqName.toUnsafe()");
            map2.put(eVarI2, cVarB2);
        }
        for (gm.c cVar18 : gm.c.values()) {
            yl.b bVarJ9 = yl.b.j(cVar18.h());
            wk.j jVarG = cVar18.g();
            kotlin.jvm.internal.n.e(jVarG, "jvmType.primitiveType");
            a(bVarJ9, yl.b.j(wk.m.f53373k.c(jVarG.f53326a)));
        }
        for (yl.b bVar4 : wk.d.f53304a) {
            a(yl.b.j(new yl.c("kotlin.jvm.internal." + bVar4.i().b() + "CompanionObject")), bVar4.d(yl.h.f54518b));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            a(yl.b.j(new yl.c(l1.d.e(i10, "kotlin.jvm.functions.Function"))), new yl.b(wk.m.f53373k, yl.f.e("Function" + i10)));
            b(new yl.c(l1.d.k(new StringBuilder(), f54448b, i10)), f54453g);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            xk.e eVar5 = xk.e.f53891g;
            b(new yl.c((eVar5.f53893a.f54505a.toString() + '.' + eVar5.f53894b) + i11), f54453g);
        }
        b(wk.l.f53337b.g(), d(Void.class));
    }

    public static void a(yl.b bVar, yl.b bVar2) {
        yl.e eVarI = bVar.b().i();
        kotlin.jvm.internal.n.e(eVarI, "javaClassId.asSingleFqName().toUnsafe()");
        f54454h.put(eVarI, bVar2);
        b(bVar2.b(), bVar);
    }

    public static void b(yl.c cVar, yl.b bVar) {
        yl.e eVarI = cVar.i();
        kotlin.jvm.internal.n.e(eVarI, "kotlinFqNameUnsafe.toUnsafe()");
        f54455i.put(eVarI, bVar);
    }

    public static void c(Class cls, yl.e eVar) {
        a(d(cls), yl.b.j(eVar.g()));
    }

    public static yl.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? yl.b.j(new yl.c(cls.getCanonicalName())) : d(declaringClass).d(yl.f.e(cls.getSimpleName()));
    }

    public static boolean e(yl.e eVar, String str) {
        Integer numE0;
        String str2 = eVar.f54510a;
        if (str2 != null) {
            String strM0 = an.h.M0(str2, str, "");
            return strM0.length() > 0 && !an.h.K0(strM0, '0') && (numE0 = an.o.e0(strM0)) != null && numE0.intValue() >= 23;
        }
        yl.e.a(4);
        throw null;
    }

    public static yl.b f(yl.e eVar) {
        if (e(eVar, f54447a) || e(eVar, f54449c)) {
            return f54451e;
        }
        return (e(eVar, f54448b) || e(eVar, f54450d)) ? f54453g : (yl.b) f54455i.get(eVar);
    }
}
