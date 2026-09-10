package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.collections.graveside;
import p002kotlin.collections.seminary;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.beachfront;
import patroclinal.formularize;

/* JADX INFO: compiled from: AnnotationQualifiersFqNames.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Map<dern, formularize> f30352beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Map<dern, formularize> f30353competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Set<dern> f30355impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final List<AnnotationQualifierApplicabilityType> f30356marial;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f30351attabal = new dern("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern f30357saneness = new dern("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final dern f30354dern = new dern("javax.annotation.meta.TypeQualifierDefault");

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final dern f30358wireman = new dern("kotlin.annotations.jvm.UnderMigration");

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> listKowloon = adultoid.kowloon(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f30356marial = listKowloon;
        dern dernVarFormularize = adultoid.formularize();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<dern, formularize> mapImpassible = seminary.impassible(formularize.attabal(dernVarFormularize, new formularize(new beachfront(nullabilityQualifier, false, 2, null), listKowloon, false)), formularize.attabal(adultoid.taiyuan(), new formularize(new beachfront(nullabilityQualifier, false, 2, null), listKowloon, false)));
        f30352beachfront = mapImpassible;
        f30353competently = seminary.monoploid(seminary.impassible(formularize.attabal(new dern("javax.annotation.ParametersAreNullableByDefault"), new formularize(new beachfront(NullabilityQualifier.NULLABLE, false, 2, null), graveside.marial(annotationQualifierApplicabilityType3), false, 4, null)), formularize.attabal(new dern("javax.annotation.ParametersAreNonnullByDefault"), new formularize(new beachfront(nullabilityQualifier, false, 2, null), graveside.marial(annotationQualifierApplicabilityType3), false, 4, null))), mapImpassible);
        f30355impromptu = creditor.impromptu(adultoid.beachfront(), adultoid.marial());
    }

    public static final Map<dern, formularize> attabal() {
        return f30353competently;
    }

    public static final dern beachfront() {
        return f30357saneness;
    }

    public static final dern competently() {
        return f30351attabal;
    }

    public static final Map<dern, formularize> dern() {
        return f30352beachfront;
    }

    public static final dern marial() {
        return f30354dern;
    }

    public static final Set<dern> saneness() {
        return f30355impromptu;
    }

    public static final dern wireman() {
        return f30358wireman;
    }
}
