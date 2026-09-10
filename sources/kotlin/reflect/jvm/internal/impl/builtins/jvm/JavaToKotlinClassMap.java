package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import android.support.v4.media.a;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaToKotlinClassMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f43522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43523c;
    public static final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ClassId f43524e;
    public static final FqName f;
    public static final ClassId g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f43525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f43526i;
    public static final HashMap j;
    public static final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f43527l;
    public static final HashMap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f43528n;

    public static final class PlatformMutabilityMapping {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClassId f43529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClassId f43530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ClassId f43531c;

        public PlatformMutabilityMapping(ClassId classId, ClassId classId2, ClassId classId3) {
            this.f43529a = classId;
            this.f43530b = classId2;
            this.f43531c = classId3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.a(this.f43529a, platformMutabilityMapping.f43529a) && Intrinsics.a(this.f43530b, platformMutabilityMapping.f43530b) && Intrinsics.a(this.f43531c, platformMutabilityMapping.f43531c);
        }

        public final int hashCode() {
            return this.f43531c.hashCode() + ((this.f43530b.hashCode() + (this.f43529a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f43529a + ", kotlinReadOnly=" + this.f43530b + ", kotlinMutable=" + this.f43531c + ')';
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.e0;
        sb.append(functionClassKind.X.f44165a.toString());
        sb.append('.');
        sb.append(functionClassKind.f43517Y);
        f43521a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.g0;
        sb2.append(functionClassKind2.X.f44165a.toString());
        sb2.append('.');
        sb2.append(functionClassKind2.f43517Y);
        f43522b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.f0;
        sb3.append(functionClassKind3.X.f44165a.toString());
        sb3.append('.');
        sb3.append(functionClassKind3.f43517Y);
        f43523c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.h0;
        sb4.append(functionClassKind4.X.f44165a.toString());
        sb4.append('.');
        sb4.append(functionClassKind4.f43517Y);
        d = sb4.toString();
        ClassId classIdJ = ClassId.j(new FqName("kotlin.jvm.functions.FunctionN"));
        f43524e = classIdJ;
        f = classIdJ.b();
        g = StandardClassIds.f44184n;
        d(Class.class);
        f43525h = new HashMap();
        f43526i = new HashMap();
        j = new HashMap();
        k = new HashMap();
        f43527l = new HashMap();
        m = new HashMap();
        ClassId classIdJ2 = ClassId.j(StandardNames.FqNames.f43481A);
        FqName fqName = StandardNames.FqNames.f43485I;
        FqName fqNameG = classIdJ2.g();
        FqName fqNameG2 = classIdJ2.g();
        Intrinsics.e(fqNameG2, "kotlinReadOnly.packageFqName");
        FqName fqNameB = FqNamesUtilKt.b(fqName, fqNameG2);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(d(Iterable.class), classIdJ2, new ClassId(fqNameG, fqNameB, false));
        ClassId classIdJ3 = ClassId.j(StandardNames.FqNames.f43507z);
        FqName fqName2 = StandardNames.FqNames.H;
        FqName fqNameG3 = classIdJ3.g();
        FqName fqNameG4 = classIdJ3.g();
        Intrinsics.e(fqNameG4, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(d(Iterator.class), classIdJ3, new ClassId(fqNameG3, FqNamesUtilKt.b(fqName2, fqNameG4), false));
        ClassId classIdJ4 = ClassId.j(StandardNames.FqNames.f43482B);
        FqName fqName3 = StandardNames.FqNames.f43486J;
        FqName fqNameG5 = classIdJ4.g();
        FqName fqNameG6 = classIdJ4.g();
        Intrinsics.e(fqNameG6, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(d(Collection.class), classIdJ4, new ClassId(fqNameG5, FqNamesUtilKt.b(fqName3, fqNameG6), false));
        ClassId classIdJ5 = ClassId.j(StandardNames.FqNames.C);
        FqName fqName4 = StandardNames.FqNames.K;
        FqName fqNameG7 = classIdJ5.g();
        FqName fqNameG8 = classIdJ5.g();
        Intrinsics.e(fqNameG8, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(d(List.class), classIdJ5, new ClassId(fqNameG7, FqNamesUtilKt.b(fqName4, fqNameG8), false));
        ClassId classIdJ6 = ClassId.j(StandardNames.FqNames.f43483E);
        FqName fqName5 = StandardNames.FqNames.M;
        FqName fqNameG9 = classIdJ6.g();
        FqName fqNameG10 = classIdJ6.g();
        Intrinsics.e(fqNameG10, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(d(Set.class), classIdJ6, new ClassId(fqNameG9, FqNamesUtilKt.b(fqName5, fqNameG10), false));
        ClassId classIdJ7 = ClassId.j(StandardNames.FqNames.D);
        FqName fqName6 = StandardNames.FqNames.L;
        FqName fqNameG11 = classIdJ7.g();
        FqName fqNameG12 = classIdJ7.g();
        Intrinsics.e(fqNameG12, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(d(ListIterator.class), classIdJ7, new ClassId(fqNameG11, FqNamesUtilKt.b(fqName6, fqNameG12), false));
        FqName fqName7 = StandardNames.FqNames.f43484F;
        ClassId classIdJ8 = ClassId.j(fqName7);
        FqName fqName8 = StandardNames.FqNames.f43487N;
        FqName fqNameG13 = classIdJ8.g();
        FqName fqNameG14 = classIdJ8.g();
        Intrinsics.e(fqNameG14, "kotlinReadOnly.packageFqName");
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(d(Map.class), classIdJ8, new ClassId(fqNameG13, FqNamesUtilKt.b(fqName8, fqNameG14), false));
        ClassId classIdD = ClassId.j(fqName7).d(StandardNames.FqNames.G.f());
        FqName fqName9 = StandardNames.FqNames.O;
        FqName fqNameG15 = classIdD.g();
        FqName fqNameG16 = classIdD.g();
        Intrinsics.e(fqNameG16, "kotlinReadOnly.packageFqName");
        List<PlatformMutabilityMapping> listI = CollectionsKt.I(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(d(Map.Entry.class), classIdD, new ClassId(fqNameG15, FqNamesUtilKt.b(fqName9, fqNameG16), false)));
        f43528n = listI;
        c(Object.class, StandardNames.FqNames.f43494a);
        c(String.class, StandardNames.FqNames.f);
        c(CharSequence.class, StandardNames.FqNames.f43499e);
        a(d(Throwable.class), ClassId.j(StandardNames.FqNames.k));
        c(Cloneable.class, StandardNames.FqNames.f43497c);
        c(Number.class, StandardNames.FqNames.f43501i);
        a(d(Comparable.class), ClassId.j(StandardNames.FqNames.f43502l));
        c(Enum.class, StandardNames.FqNames.j);
        a(d(Annotation.class), ClassId.j(StandardNames.FqNames.s));
        for (PlatformMutabilityMapping platformMutabilityMapping8 : listI) {
            ClassId classId = platformMutabilityMapping8.f43529a;
            ClassId classId2 = platformMutabilityMapping8.f43530b;
            a(classId, classId2);
            ClassId classId3 = platformMutabilityMapping8.f43531c;
            b(classId3.b(), classId);
            f43527l.put(classId3, classId2);
            m.put(classId2, classId3);
            FqName fqNameB2 = classId2.b();
            FqName fqNameB3 = classId3.b();
            FqNameUnsafe fqNameUnsafeI = classId3.b().i();
            Intrinsics.e(fqNameUnsafeI, "mutableClassId.asSingleFqName().toUnsafe()");
            j.put(fqNameUnsafeI, fqNameB2);
            FqNameUnsafe fqNameUnsafeI2 = fqNameB2.i();
            Intrinsics.e(fqNameUnsafeI2, "readOnlyFqName.toUnsafe()");
            k.put(fqNameUnsafeI2, fqNameB3);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            ClassId classIdJ9 = ClassId.j(jvmPrimitiveType.h());
            PrimitiveType primitiveTypeG = jvmPrimitiveType.g();
            Intrinsics.e(primitiveTypeG, "jvmType.primitiveType");
            a(classIdJ9, ClassId.j(StandardNames.k.c(primitiveTypeG.X)));
        }
        for (ClassId classId4 : CompanionObjectMapping.f43459a) {
            a(ClassId.j(new FqName("kotlin.jvm.internal." + classId4.i().b() + "CompanionObject")), classId4.d(SpecialNames.f44174b));
        }
        for (int i2 = 0; i2 < 23; i2++) {
            a(ClassId.j(new FqName(a.h(i2, "kotlin.jvm.functions.Function"))), new ClassId(StandardNames.k, Name.g("Function" + i2)));
            b(new FqName(androidx.datastore.preferences.protobuf.a.g(i2, f43522b, new StringBuilder())), g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.h0;
            b(new FqName((functionClassKind5.X.f44165a.toString() + '.' + functionClassKind5.f43517Y) + i3), g);
        }
        FqName fqNameG17 = StandardNames.FqNames.f43495b.g();
        Intrinsics.e(fqNameG17, "nothing.toSafe()");
        b(fqNameG17, d(Void.class));
    }

    public static void a(ClassId classId, ClassId classId2) {
        FqNameUnsafe fqNameUnsafeI = classId.b().i();
        Intrinsics.e(fqNameUnsafeI, "javaClassId.asSingleFqName().toUnsafe()");
        f43525h.put(fqNameUnsafeI, classId2);
        b(classId2.b(), classId);
    }

    public static void b(FqName fqName, ClassId classId) {
        FqNameUnsafe fqNameUnsafeI = fqName.i();
        Intrinsics.e(fqNameUnsafeI, "kotlinFqNameUnsafe.toUnsafe()");
        f43526i.put(fqNameUnsafeI, classId);
    }

    public static void c(Class cls, FqNameUnsafe fqNameUnsafe) {
        FqName fqNameG = fqNameUnsafe.g();
        Intrinsics.e(fqNameG, "kotlinFqName.toSafe()");
        a(d(cls), ClassId.j(fqNameG));
    }

    public static ClassId d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        return declaringClass == null ? ClassId.j(new FqName(cls.getCanonicalName())) : d(declaringClass).d(Name.g(cls.getSimpleName()));
    }

    public static boolean e(FqNameUnsafe fqNameUnsafe, String str) {
        Integer numY;
        String str2 = fqNameUnsafe.f44168a;
        if (str2 != null) {
            String strP = StringsKt.P(str2, str, "");
            return strP.length() > 0 && !StringsKt.N(strP, '0') && (numY = StringsKt.Y(strP)) != null && numY.intValue() >= 23;
        }
        FqNameUnsafe.a(4);
        throw null;
    }

    public static ClassId f(FqNameUnsafe fqNameUnsafe) {
        if (e(fqNameUnsafe, f43521a) || e(fqNameUnsafe, f43523c)) {
            return f43524e;
        }
        return (e(fqNameUnsafe, f43522b) || e(fqNameUnsafe, d)) ? g : (ClassId) f43526i.get(fqNameUnsafe);
    }
}
