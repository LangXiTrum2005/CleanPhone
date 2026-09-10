package yl;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.n;
import xj.b0;
import xj.g0;
import xj.k;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f54524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f54525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f54526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f54527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f54528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f54529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f54530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f54531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f54532i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f54533j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f54534k;
    public static final b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f54535m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f54536n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Set f54537o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f54538p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f54539q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f54540r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f54541s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f54542t;

    static {
        c cVar = new c("kotlin");
        f54524a = cVar;
        c cVarC = cVar.c(f.e("reflect"));
        f54525b = cVarC;
        c cVarC2 = cVar.c(f.e("collections"));
        f54526c = cVarC2;
        c cVarC3 = cVar.c(f.e("ranges"));
        f54527d = cVarC3;
        cVar.c(f.e("jvm")).c(f.e("internal"));
        c cVarC4 = cVar.c(f.e("annotation"));
        f54528e = cVarC4;
        c cVarC5 = cVar.c(f.e("internal"));
        cVarC5.c(f.e("ir"));
        c cVarC6 = cVar.c(f.e("coroutines"));
        f54529f = cVarC6;
        f54530g = cVar.c(f.e("enums"));
        k.E0(new c[]{cVar, cVarC2, cVarC3, cVarC4, cVarC, cVarC5, cVarC6});
        j.a("Nothing");
        j.a("Unit");
        j.a("Any");
        j.a("Enum");
        j.a("Annotation");
        f54531h = j.a("Array");
        b bVarA = j.a("Boolean");
        b bVarA2 = j.a("Char");
        b bVarA3 = j.a("Byte");
        b bVarA4 = j.a("Short");
        b bVarA5 = j.a("Int");
        b bVarA6 = j.a("Long");
        b bVarA7 = j.a("Float");
        b bVarA8 = j.a("Double");
        f54532i = j.f(bVarA3);
        f54533j = j.f(bVarA4);
        f54534k = j.f(bVarA5);
        l = j.f(bVarA6);
        j.a("CharSequence");
        f54535m = j.a("String");
        j.a("Throwable");
        j.a("Cloneable");
        j.e("KProperty");
        j.e("KMutableProperty");
        j.e("KProperty0");
        j.e("KMutableProperty0");
        j.e("KProperty1");
        j.e("KMutableProperty1");
        j.e("KProperty2");
        j.e("KMutableProperty2");
        f54536n = j.e("KFunction");
        j.e("KClass");
        j.e("KCallable");
        j.a("Comparable");
        j.a("Number");
        j.a("Function");
        Set setE0 = k.E0(new b[]{bVarA, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, bVarA7, bVarA8});
        f54537o = setE0;
        int iO = b0.O(p.W(setE0, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        for (Object obj : setE0) {
            f fVarI = ((b) obj).i();
            n.e(fVarI, "id.shortClassName");
            linkedHashMap.put(obj, j.d(fVarI));
        }
        j.c(linkedHashMap);
        Set setE1 = k.E0(new b[]{f54532i, f54533j, f54534k, l});
        f54538p = setE1;
        int iO2 = b0.O(p.W(setE1, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iO2 >= 16 ? iO2 : 16);
        for (Object obj2 : setE1) {
            f fVarI2 = ((b) obj2).i();
            n.e(fVarI2, "id.shortClassName");
            linkedHashMap2.put(obj2, j.d(fVarI2));
        }
        j.c(linkedHashMap2);
        g0.w0(g0.v0(f54538p, f54537o), f54535m);
        c cVar2 = f54529f;
        f fVarE = f.e("Continuation");
        if (cVar2 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarE);
        j.b("Iterator");
        j.b("Iterable");
        j.b("Collection");
        j.b("List");
        j.b("ListIterator");
        j.b("Set");
        b bVarB = j.b("Map");
        j.b("MutableIterator");
        j.b("CharIterator");
        j.b("MutableIterable");
        j.b("MutableCollection");
        f54539q = j.b("MutableList");
        j.b("MutableListIterator");
        f54540r = j.b("MutableSet");
        b bVarB2 = j.b("MutableMap");
        f54541s = bVarB2;
        bVarB.d(f.e("Entry"));
        bVarB2.d(f.e("MutableEntry"));
        j.a("Result");
        c cVar3 = f54527d;
        f fVarE2 = f.e("IntRange");
        if (cVar3 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarE2);
        c.j(f.e("LongRange"));
        c.j(f.e("CharRange"));
        c cVar4 = f54528e;
        f fVarE3 = f.e("AnnotationRetention");
        if (cVar4 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarE3);
        c.j(f.e("AnnotationTarget"));
        f54542t = new b(f54530g, f.e("EnumEntries"));
    }
}
