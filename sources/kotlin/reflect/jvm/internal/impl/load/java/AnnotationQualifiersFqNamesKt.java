package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class AnnotationQualifiersFqNamesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f43726a = new FqName("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FqName f43727b = new FqName("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FqName f43728c = new FqName("javax.annotation.meta.TypeQualifierDefault");
    public static final FqName d = new FqName("kotlin.annotations.jvm.UnderMigration");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f43729e;
    public static final Object f;
    public static final LinkedHashMap g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f43730h;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List listI = CollectionsKt.I(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f43729e = listI;
        FqName fqName = JvmAnnotationNamesKt.f43776c;
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.Z;
        List list = listI;
        Map mapJ = MapsKt.j(new Pair(fqName, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier), list, false)), new Pair(JvmAnnotationNamesKt.f, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier), list, false)));
        f = mapJ;
        g = MapsKt.m(MapsKt.j(new Pair(new FqName("javax.annotation.ParametersAreNullableByDefault"), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.f43930Y), CollectionsKt.H(annotationQualifierApplicabilityType3))), new Pair(new FqName("javax.annotation.ParametersAreNonnullByDefault"), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier), CollectionsKt.H(annotationQualifierApplicabilityType3)))), mapJ);
        f43730h = ArraysKt.O(new FqName[]{JvmAnnotationNamesKt.f43778h, JvmAnnotationNamesKt.f43779i});
    }
}
