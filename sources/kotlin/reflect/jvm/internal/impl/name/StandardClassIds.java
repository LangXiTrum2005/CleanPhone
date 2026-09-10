package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StandardClassIds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f44177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FqName f44178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FqName f44179c;
    public static final FqName d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FqName f44180e;
    public static final FqName f;
    public static final FqName g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ClassId f44181h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ClassId f44182i;
    public static final ClassId j;
    public static final ClassId k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ClassId f44183l;
    public static final ClassId m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ClassId f44184n;
    public static final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f44185p;
    public static final ClassId q;
    public static final ClassId r;
    public static final ClassId s;
    public static final ClassId t;

    static {
        FqName fqName = new FqName("kotlin");
        f44177a = fqName;
        FqName fqNameC = fqName.c(Name.g("reflect"));
        f44178b = fqNameC;
        FqName fqNameC2 = fqName.c(Name.g("collections"));
        f44179c = fqNameC2;
        FqName fqNameC3 = fqName.c(Name.g("ranges"));
        d = fqNameC3;
        fqName.c(Name.g("jvm")).c(Name.g("internal"));
        FqName fqNameC4 = fqName.c(Name.g("annotation"));
        f44180e = fqNameC4;
        FqName fqNameC5 = fqName.c(Name.g("internal"));
        fqNameC5.c(Name.g("ir"));
        FqName fqNameC6 = fqName.c(Name.g("coroutines"));
        f = fqNameC6;
        g = fqName.c(Name.g("enums"));
        ArraysKt.O(new FqName[]{fqName, fqNameC2, fqNameC3, fqNameC4, fqNameC, fqNameC5, fqNameC6});
        StandardClassIdsKt.a("Nothing");
        StandardClassIdsKt.a("Unit");
        StandardClassIdsKt.a("Any");
        StandardClassIdsKt.a("Enum");
        StandardClassIdsKt.a("Annotation");
        f44181h = StandardClassIdsKt.a("Array");
        ClassId classIdA = StandardClassIdsKt.a("Boolean");
        ClassId classIdA2 = StandardClassIdsKt.a("Char");
        ClassId classIdA3 = StandardClassIdsKt.a("Byte");
        ClassId classIdA4 = StandardClassIdsKt.a("Short");
        ClassId classIdA5 = StandardClassIdsKt.a("Int");
        ClassId classIdA6 = StandardClassIdsKt.a("Long");
        ClassId classIdA7 = StandardClassIdsKt.a("Float");
        ClassId classIdA8 = StandardClassIdsKt.a("Double");
        f44182i = StandardClassIdsKt.f(classIdA3);
        j = StandardClassIdsKt.f(classIdA4);
        k = StandardClassIdsKt.f(classIdA5);
        f44183l = StandardClassIdsKt.f(classIdA6);
        StandardClassIdsKt.a("CharSequence");
        m = StandardClassIdsKt.a("String");
        StandardClassIdsKt.a("Throwable");
        StandardClassIdsKt.a("Cloneable");
        StandardClassIdsKt.e("KProperty");
        StandardClassIdsKt.e("KMutableProperty");
        StandardClassIdsKt.e("KProperty0");
        StandardClassIdsKt.e("KMutableProperty0");
        StandardClassIdsKt.e("KProperty1");
        StandardClassIdsKt.e("KMutableProperty1");
        StandardClassIdsKt.e("KProperty2");
        StandardClassIdsKt.e("KMutableProperty2");
        f44184n = StandardClassIdsKt.e("KFunction");
        StandardClassIdsKt.e("KClass");
        StandardClassIdsKt.e("KCallable");
        StandardClassIdsKt.a("Comparable");
        StandardClassIdsKt.a("Number");
        StandardClassIdsKt.a("Function");
        Set setO = ArraysKt.O(new ClassId[]{classIdA, classIdA2, classIdA3, classIdA4, classIdA5, classIdA6, classIdA7, classIdA8});
        o = setO;
        int iH = MapsKt.h(CollectionsKt.n(setO, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (Object obj : setO) {
            Name nameI = ((ClassId) obj).i();
            Intrinsics.e(nameI, "id.shortClassName");
            linkedHashMap.put(obj, StandardClassIdsKt.d(nameI));
        }
        StandardClassIdsKt.c(linkedHashMap);
        Set setO2 = ArraysKt.O(new ClassId[]{f44182i, j, k, f44183l});
        f44185p = setO2;
        int iH2 = MapsKt.h(CollectionsKt.n(setO2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iH2 >= 16 ? iH2 : 16);
        for (Object obj2 : setO2) {
            Name nameI2 = ((ClassId) obj2).i();
            Intrinsics.e(nameI2, "id.shortClassName");
            linkedHashMap2.put(obj2, StandardClassIdsKt.d(nameI2));
        }
        StandardClassIdsKt.c(linkedHashMap2);
        SetsKt.g(SetsKt.f(o, f44185p), m);
        new ClassId(f, Name.g("Continuation"));
        StandardClassIdsKt.b("Iterator");
        StandardClassIdsKt.b("Iterable");
        StandardClassIdsKt.b("Collection");
        StandardClassIdsKt.b("List");
        StandardClassIdsKt.b("ListIterator");
        StandardClassIdsKt.b("Set");
        ClassId classIdB = StandardClassIdsKt.b("Map");
        StandardClassIdsKt.b("MutableIterator");
        StandardClassIdsKt.b("CharIterator");
        StandardClassIdsKt.b("MutableIterable");
        StandardClassIdsKt.b("MutableCollection");
        q = StandardClassIdsKt.b("MutableList");
        StandardClassIdsKt.b("MutableListIterator");
        r = StandardClassIdsKt.b("MutableSet");
        ClassId classIdB2 = StandardClassIdsKt.b("MutableMap");
        s = classIdB2;
        classIdB.d(Name.g("Entry"));
        classIdB2.d(Name.g("MutableEntry"));
        StandardClassIdsKt.a("Result");
        FqName fqName2 = d;
        new ClassId(fqName2, Name.g("IntRange"));
        new ClassId(fqName2, Name.g("LongRange"));
        new ClassId(fqName2, Name.g("CharRange"));
        FqName fqName3 = f44180e;
        new ClassId(fqName3, Name.g("AnnotationRetention"));
        new ClassId(fqName3, Name.g("AnnotationTarget"));
        t = new ClassId(g, Name.g("EnumEntries"));
    }
}
