package p002kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JavaTypeQualifiersByElementType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final EnumMap<AnnotationQualifierApplicabilityType, formularize> f30610attabal;

    public polloi(EnumMap<AnnotationQualifierApplicabilityType, formularize> defaultQualifiers) {
        Intrinsics.checkNotNullParameter(defaultQualifiers, "defaultQualifiers");
        this.f30610attabal = defaultQualifiers;
    }

    public final formularize attabal(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f30610attabal.get(annotationQualifierApplicabilityType);
    }

    public final EnumMap<AnnotationQualifierApplicabilityType, formularize> saneness() {
        return this.f30610attabal;
    }
}
