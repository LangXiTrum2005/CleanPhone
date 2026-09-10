package p002kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.beachfront;

/* JADX INFO: compiled from: AnnotationQualifiersFqNames.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f30412attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f30413dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Collection<AnnotationQualifierApplicabilityType> f30414saneness;

    /* JADX WARN: Multi-variable type inference failed */
    public formularize(beachfront nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f30412attabal = nullabilityQualifier;
        this.f30414saneness = qualifierApplicabilityTypes;
        this.f30413dern = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ formularize saneness(formularize formularizeVar, beachfront beachfrontVar, Collection collection2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            beachfrontVar = formularizeVar.f30412attabal;
        }
        if ((i & 2) != 0) {
            collection2 = formularizeVar.f30414saneness;
        }
        if ((i & 4) != 0) {
            z = formularizeVar.f30413dern;
        }
        return formularizeVar.attabal(beachfrontVar, collection2, z);
    }

    public final formularize attabal(beachfront nullabilityQualifier, Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new formularize(nullabilityQualifier, qualifierApplicabilityTypes, z);
    }

    public final boolean dern() {
        return this.f30413dern;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof formularize)) {
            return false;
        }
        formularize formularizeVar = (formularize) obj;
        return Intrinsics.wireman(this.f30412attabal, formularizeVar.f30412attabal) && Intrinsics.wireman(this.f30414saneness, formularizeVar.f30414saneness) && this.f30413dern == formularizeVar.f30413dern;
    }

    public int hashCode() {
        return (((this.f30412attabal.hashCode() * 31) + this.f30414saneness.hashCode()) * 31) + Boolean.hashCode(this.f30413dern);
    }

    public final Collection<AnnotationQualifierApplicabilityType> marial() {
        return this.f30414saneness;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f30412attabal + ", qualifierApplicabilityTypes=" + this.f30414saneness + ", definitelyNotNull=" + this.f30413dern + ')';
    }

    public final beachfront wireman() {
        return this.f30412attabal;
    }

    public /* synthetic */ formularize(beachfront beachfrontVar, Collection collection2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(beachfrontVar, collection2, (i & 4) != 0 ? beachfrontVar.dern() == NullabilityQualifier.NOT_NULL : z);
    }
}
