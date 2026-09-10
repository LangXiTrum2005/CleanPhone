package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public final class StandardNames {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Name f43472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Name f43473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Name f43474c;
    public static final Name d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FqName f43475e;
    public static final FqName f;
    public static final FqName g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FqName f43476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f43477i;
    public static final Name j;
    public static final FqName k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final FqName f43478l;
    public static final FqName m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FqName f43479n;
    public static final FqName o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f43480p;

    public static final class FqNames {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final FqName f43481A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final FqName f43482B;
        public static final FqName C;
        public static final FqName D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final FqName f43483E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final FqName f43484F;
        public static final FqName G;
        public static final FqName H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final FqName f43485I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final FqName f43486J;
        public static final FqName K;
        public static final FqName L;
        public static final FqName M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final FqName f43487N;
        public static final FqName O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final FqNameUnsafe f43488P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final ClassId f43489Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final ClassId f43490R;
        public static final ClassId S;
        public static final ClassId T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final ClassId f43491U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public static final FqName f43492V;
        public static final FqName W;
        public static final FqName X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final FqName f43493Y;
        public static final HashSet Z;
        public static final HashSet a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public static final HashMap f43496b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public static final HashMap f43498c0;
        public static final FqNameUnsafe d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FqNameUnsafe f43499e;
        public static final FqNameUnsafe f;
        public static final FqNameUnsafe g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FqNameUnsafe f43500h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FqNameUnsafe f43501i;
        public static final FqNameUnsafe j;
        public static final FqName k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FqName f43502l;
        public static final FqName m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final FqName f43503n;
        public static final FqName o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final FqName f43504p;
        public static final FqName q;
        public static final FqName r;
        public static final FqName s;
        public static final FqName t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final FqName f43505u;
        public static final FqName v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final FqName f43506w;
        public static final FqName x;
        public static final FqName y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final FqName f43507z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FqNameUnsafe f43494a = d("Any");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FqNameUnsafe f43495b = d("Nothing");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FqNameUnsafe f43497c = d("Cloneable");

        static {
            c("Suppress");
            d = d("Unit");
            f43499e = d("CharSequence");
            f = d("String");
            g = d("Array");
            f43500h = d("Boolean");
            d("Char");
            d("Byte");
            d("Short");
            d("Int");
            d("Long");
            d("Float");
            d("Double");
            f43501i = d("Number");
            j = d("Enum");
            d("Function");
            k = c("Throwable");
            f43502l = c("Comparable");
            FqName fqName = StandardNames.f43479n;
            Intrinsics.e(fqName.c(Name.g("IntRange")).i(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            Intrinsics.e(fqName.c(Name.g("LongRange")).i(), "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            m = c("Deprecated");
            c("DeprecatedSinceKotlin");
            f43503n = c("DeprecationLevel");
            o = c("ReplaceWith");
            f43504p = c("ExtensionFunctionType");
            q = c("ContextFunctionTypeParams");
            FqName fqNameC = c("ParameterName");
            r = fqNameC;
            ClassId.j(fqNameC);
            s = c("Annotation");
            FqName fqNameA = a("Target");
            t = fqNameA;
            ClassId.j(fqNameA);
            f43505u = a("AnnotationTarget");
            v = a("AnnotationRetention");
            FqName fqNameA2 = a("Retention");
            f43506w = fqNameA2;
            ClassId.j(fqNameA2);
            ClassId.j(a("Repeatable"));
            x = a("MustBeDocumented");
            y = c("UnsafeVariance");
            c("PublishedApi");
            StandardNames.o.c(Name.g("AccessibleLateinitPropertyLiteral"));
            f43507z = b("Iterator");
            f43481A = b("Iterable");
            f43482B = b("Collection");
            C = b("List");
            D = b("ListIterator");
            f43483E = b("Set");
            FqName fqNameB = b("Map");
            f43484F = fqNameB;
            G = fqNameB.c(Name.g("Entry"));
            H = b("MutableIterator");
            f43485I = b("MutableIterable");
            f43486J = b("MutableCollection");
            K = b("MutableList");
            L = b("MutableListIterator");
            M = b("MutableSet");
            FqName fqNameB2 = b("MutableMap");
            f43487N = fqNameB2;
            O = fqNameB2.c(Name.g("MutableEntry"));
            f43488P = e("KClass");
            e("KCallable");
            e("KProperty0");
            e("KProperty1");
            e("KProperty2");
            e("KMutableProperty0");
            e("KMutableProperty1");
            e("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeE = e("KProperty");
            e("KMutableProperty");
            f43489Q = ClassId.j(fqNameUnsafeE.g());
            e("KDeclarationContainer");
            FqName fqNameC2 = c("UByte");
            FqName fqNameC3 = c("UShort");
            FqName fqNameC4 = c("UInt");
            FqName fqNameC5 = c("ULong");
            f43490R = ClassId.j(fqNameC2);
            S = ClassId.j(fqNameC3);
            T = ClassId.j(fqNameC4);
            f43491U = ClassId.j(fqNameC5);
            f43492V = c("UByteArray");
            W = c("UShortArray");
            X = c("UIntArray");
            f43493Y = c("ULongArray");
            int length = PrimitiveType.values().length;
            HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSet.add(primitiveType.X);
            }
            Z = hashSet;
            int length2 = PrimitiveType.values().length;
            HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSet2.add(primitiveType2.f43467Y);
            }
            a0 = hashSet2;
            int length3 = PrimitiveType.values().length;
            HashMap map = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                String strB = primitiveType3.X.b();
                Intrinsics.e(strB, "primitiveType.typeName.asString()");
                map.put(d(strB), primitiveType3);
            }
            f43496b0 = map;
            int length4 = PrimitiveType.values().length;
            HashMap map2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                String strB2 = primitiveType4.f43467Y.b();
                Intrinsics.e(strB2, "primitiveType.arrayTypeName.asString()");
                map2.put(d(strB2), primitiveType4);
            }
            f43498c0 = map2;
        }

        public static FqName a(String str) {
            return StandardNames.f43478l.c(Name.g(str));
        }

        public static FqName b(String str) {
            return StandardNames.m.c(Name.g(str));
        }

        public static FqName c(String str) {
            return StandardNames.k.c(Name.g(str));
        }

        public static FqNameUnsafe d(String str) {
            FqNameUnsafe fqNameUnsafeI = c(str).i();
            Intrinsics.e(fqNameUnsafeI, "fqName(simpleName).toUnsafe()");
            return fqNameUnsafeI;
        }

        public static final FqNameUnsafe e(String str) {
            FqNameUnsafe fqNameUnsafeI = StandardNames.f43476h.c(Name.g(str)).i();
            Intrinsics.e(fqNameUnsafeI, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return fqNameUnsafeI;
        }
    }

    static {
        Name.g("field");
        Name.g("value");
        f43472a = Name.g("values");
        f43473b = Name.g("entries");
        f43474c = Name.g("valueOf");
        Name.g("copy");
        Name.g("hashCode");
        Name.g("code");
        Name.g("nextChar");
        d = Name.g("count");
        new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        f43475e = fqName;
        new FqName("kotlin.coroutines.jvm.internal");
        new FqName("kotlin.coroutines.intrinsics");
        f = fqName.c(Name.g("Continuation"));
        g = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        f43476h = fqName2;
        f43477i = CollectionsKt.I("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Name nameG = Name.g("kotlin");
        j = nameG;
        FqName fqNameJ = FqName.j(nameG);
        k = fqNameJ;
        FqName fqNameC = fqNameJ.c(Name.g("annotation"));
        f43478l = fqNameC;
        FqName fqNameC2 = fqNameJ.c(Name.g("collections"));
        m = fqNameC2;
        FqName fqNameC3 = fqNameJ.c(Name.g("ranges"));
        f43479n = fqNameC3;
        fqNameJ.c(Name.g("text"));
        FqName fqNameC4 = fqNameJ.c(Name.g("internal"));
        o = fqNameC4;
        new FqName("error.NonExistentClass");
        f43480p = ArraysKt.O(new FqName[]{fqNameJ, fqNameC2, fqNameC3, fqNameC, fqName2, fqNameC4, fqName});
    }
}
