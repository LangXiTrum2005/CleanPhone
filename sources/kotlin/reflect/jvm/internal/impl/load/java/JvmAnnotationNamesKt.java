package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class JvmAnnotationNamesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f43774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FqName f43775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FqName f43776c;
    public static final FqName d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FqName f43777e;
    public static final FqName f;
    public static final List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FqName f43778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FqName f43779i;
    public static final List j;
    public static final FqName k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final FqName f43780l;
    public static final FqName m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final FqName f43781n;
    public static final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f43782p;
    public static final Object q;

    static {
        FqName fqName = new FqName("org.jspecify.nullness.Nullable");
        f43774a = fqName;
        f43775b = new FqName("org.jspecify.nullness.NullnessUnspecified");
        FqName fqName2 = new FqName("org.jspecify.nullness.NullMarked");
        f43776c = fqName2;
        FqName fqName3 = new FqName("org.jspecify.annotations.Nullable");
        d = fqName3;
        f43777e = new FqName("org.jspecify.annotations.NullnessUnspecified");
        FqName fqName4 = new FqName("org.jspecify.annotations.NullMarked");
        f = fqName4;
        List listI = CollectionsKt.I(JvmAnnotationNames.f43770i, new FqName("androidx.annotation.Nullable"), new FqName("androidx.annotation.Nullable"), new FqName("android.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("javax.annotation.Nullable"), new FqName("javax.annotation.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("io.reactivex.annotations.Nullable"), new FqName("io.reactivex.rxjava3.annotations.Nullable"));
        g = listI;
        FqName fqName5 = new FqName("javax.annotation.Nonnull");
        f43778h = fqName5;
        f43779i = new FqName("javax.annotation.CheckForNull");
        List listI2 = CollectionsKt.I(JvmAnnotationNames.f43769h, new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("androidx.annotation.NonNull"), new FqName("android.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("lombok.NonNull"), new FqName("io.reactivex.annotations.NonNull"), new FqName("io.reactivex.rxjava3.annotations.NonNull"));
        j = listI2;
        FqName fqName6 = new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        k = fqName6;
        FqName fqName7 = new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        f43780l = fqName7;
        FqName fqName8 = new FqName("androidx.annotation.RecentlyNullable");
        m = fqName8;
        FqName fqName9 = new FqName("androidx.annotation.RecentlyNonNull");
        f43781n = fqName9;
        SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.g(SetsKt.f(SetsKt.g(SetsKt.f(new LinkedHashSet(), listI), fqName5), listI2), fqName6), fqName7), fqName8), fqName9), fqName), fqName2), fqName3), fqName4);
        o = ArraysKt.O(new FqName[]{JvmAnnotationNames.k, JvmAnnotationNames.f43771l});
        f43782p = ArraysKt.O(new FqName[]{JvmAnnotationNames.j, JvmAnnotationNames.m});
        q = MapsKt.j(new Pair(JvmAnnotationNames.f43767c, StandardNames.FqNames.t), new Pair(JvmAnnotationNames.d, StandardNames.FqNames.f43506w), new Pair(JvmAnnotationNames.f43768e, StandardNames.FqNames.m), new Pair(JvmAnnotationNames.f, StandardNames.FqNames.x));
    }
}
