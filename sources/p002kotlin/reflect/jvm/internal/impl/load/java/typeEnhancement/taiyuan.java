package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.marial;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.polloi;
import p002kotlin.reflect.jvm.internal.impl.load.java.saneness;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.sayid;
import presbytery.competently;
import presbytery.formularize;
import presbytery.kowloon;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan extends AbstractSignatureParts<dern> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f30652attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f30653dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f30654marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f30655saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AnnotationQualifierApplicabilityType f30656wireman;

    public /* synthetic */ taiyuan(attabal attabalVar, boolean z, wireman wiremanVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(attabalVar, z, wiremanVar, annotationQualifierApplicabilityType, (i & 16) != 0 ? false : z2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean adultoid() {
        return this.f30654marial;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean arytenoidectomy() {
        return this.f30653dern.attabal().monoploid().dern();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean cord(formularize formularizeVar) {
        Intrinsics.checkNotNullParameter(formularizeVar, "<this>");
        return formularizeVar instanceof marial;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean cuirassed(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        return ((oilcan) competentlyVar).homozygous() instanceof marial;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public Iterable<dern> cutely(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        return ((oilcan) competentlyVar).getAnnotations();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public Iterable<dern> formularize() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations;
        attabal attabalVar = this.f30652attabal;
        return (attabalVar == null || (annotations = attabalVar.getAnnotations()) == null) ? adultoid.formularize() : annotations;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean gintrap(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        return beachfront.treadless((oilcan) competentlyVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public AnnotationQualifierApplicabilityType impassible() {
        return this.f30656wireman;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: kattegat, reason: merged with bridge method [inline-methods] */
    public kowloon dovishness() {
        return p002kotlin.reflect.jvm.internal.impl.types.checker.kowloon.f31733attabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean kowloon() {
        attabal attabalVar = this.f30652attabal;
        return (attabalVar instanceof cultivated) && ((cultivated) attabalVar).wostteth() != null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public byname.wireman molybdenite(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarBeachfront = nosophobia.beachfront((oilcan) competentlyVar);
        if (wiremanVarBeachfront != null) {
            return p002kotlin.reflect.jvm.internal.impl.resolve.marial.impassible(wiremanVarBeachfront);
        }
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: oilcan, reason: merged with bridge method [inline-methods] */
    public boolean impromptu(dern dernVar, competently competentlyVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        if ((dernVar instanceof methylmercury.beachfront) && ((methylmercury.beachfront) dernVar).impromptu()) {
            return true;
        }
        if ((dernVar instanceof LazyJavaAnnotationDescriptor) && !arytenoidectomy() && (((LazyJavaAnnotationDescriptor) dernVar).formularize() || impassible() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) {
            return true;
        }
        return competentlyVar != null && beachfront.preterite((oilcan) competentlyVar) && taiyuan().impassible(dernVar) && !this.f30653dern.attabal().monoploid().wireman();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean preprohormone(competently competentlyVar, competently other) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f30653dern.attabal().apical().saneness((oilcan) competentlyVar, (oilcan) other);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public boolean rotuma() {
        return this.f30655saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: sealless, reason: merged with bridge method [inline-methods] */
    public oilcan monoploid(competently competentlyVar) {
        Intrinsics.checkNotNullParameter(competentlyVar, "<this>");
        return sayid.attabal((oilcan) competentlyVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    public polloi triweekly() {
        return this.f30653dern.saneness();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts
    /* JADX INFO: renamed from: yemenite, reason: merged with bridge method [inline-methods] */
    public saneness taiyuan() {
        return this.f30653dern.attabal().attabal();
    }

    public taiyuan(attabal attabalVar, boolean z, wireman containerContext, AnnotationQualifierApplicabilityType containerApplicabilityType, boolean z2) {
        Intrinsics.checkNotNullParameter(containerContext, "containerContext");
        Intrinsics.checkNotNullParameter(containerApplicabilityType, "containerApplicabilityType");
        this.f30652attabal = attabalVar;
        this.f30655saneness = z;
        this.f30653dern = containerContext;
        this.f30656wireman = containerApplicabilityType;
        this.f30654marial = z2;
    }
}
