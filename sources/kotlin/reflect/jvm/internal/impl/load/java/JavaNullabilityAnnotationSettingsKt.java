package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaNullabilityAnnotationSettingsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f43749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FqName[] f43750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final NullabilityAnnotationStatesImpl f43751c;
    public static final JavaNullabilityAnnotationsStatus d;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        FqName fqName2 = new FqName("org.jspecify.annotations");
        f43749a = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        String strB = fqName3.b();
        f43750b = new FqName[]{new FqName(strB.concat(".Nullable")), new FqName(strB.concat(".NonNull"))};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = JavaNullabilityAnnotationsStatus.d;
        Pair pair = new Pair(fqName5, javaNullabilityAnnotationsStatus);
        Pair pair2 = new Pair(new FqName("androidx.annotation"), javaNullabilityAnnotationsStatus);
        Pair pair3 = new Pair(new FqName("android.support.annotation"), javaNullabilityAnnotationsStatus);
        Pair pair4 = new Pair(new FqName("android.annotation"), javaNullabilityAnnotationsStatus);
        Pair pair5 = new Pair(new FqName("com.android.annotations"), javaNullabilityAnnotationsStatus);
        Pair pair6 = new Pair(new FqName("org.eclipse.jdt.annotation"), javaNullabilityAnnotationsStatus);
        Pair pair7 = new Pair(new FqName("org.checkerframework.checker.nullness.qual"), javaNullabilityAnnotationsStatus);
        Pair pair8 = new Pair(fqName4, javaNullabilityAnnotationsStatus);
        Pair pair9 = new Pair(new FqName("javax.annotation"), javaNullabilityAnnotationsStatus);
        Pair pair10 = new Pair(new FqName("edu.umd.cs.findbugs.annotations"), javaNullabilityAnnotationsStatus);
        Pair pair11 = new Pair(new FqName("io.reactivex.annotations"), javaNullabilityAnnotationsStatus);
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pair12 = new Pair(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, 4));
        Pair pair13 = new Pair(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, 4));
        Pair pair14 = new Pair(new FqName("lombok"), javaNullabilityAnnotationsStatus);
        KotlinVersion kotlinVersion = new KotlinVersion(1, 9, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f43751c = new NullabilityAnnotationStatesImpl(MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, new Pair(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, kotlinVersion, reportLevel2)), new Pair(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 9, 0), reportLevel2)), new Pair(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new KotlinVersion(1, 8, 0), reportLevel2))));
        d = new JavaNullabilityAnnotationsStatus(reportLevel, 4);
    }
}
