package p002kotlin.reflect.jvm.internal.impl.load.java;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.competently;

/* JADX INFO: compiled from: JavaNullabilityAnnotationsStatus.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ReportLevel f30607attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ReportLevel f30608dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f30609saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final attabal f30606wireman = new attabal(null);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final monoploid f30605marial = new monoploid(ReportLevel.STRICT, null, null, 6, null);

    /* JADX INFO: compiled from: JavaNullabilityAnnotationsStatus.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final monoploid attabal() {
            return monoploid.f30605marial;
        }

        public attabal() {
        }
    }

    public monoploid(ReportLevel reportLevelBefore, competently competentlyVar, ReportLevel reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f30607attabal = reportLevelBefore;
        this.f30609saneness = competentlyVar;
        this.f30608dern = reportLevelAfter;
    }

    public final ReportLevel dern() {
        return this.f30607attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof monoploid)) {
            return false;
        }
        monoploid monoploidVar = (monoploid) obj;
        return this.f30607attabal == monoploidVar.f30607attabal && Intrinsics.wireman(this.f30609saneness, monoploidVar.f30609saneness) && this.f30608dern == monoploidVar.f30608dern;
    }

    public int hashCode() {
        int iHashCode = this.f30607attabal.hashCode() * 31;
        competently competentlyVar = this.f30609saneness;
        return ((iHashCode + (competentlyVar == null ? 0 : competentlyVar.getVersion())) * 31) + this.f30608dern.hashCode();
    }

    public final ReportLevel saneness() {
        return this.f30608dern;
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f30607attabal + ", sinceVersion=" + this.f30609saneness + ", reportLevelAfter=" + this.f30608dern + ')';
    }

    public final competently wireman() {
        return this.f30609saneness;
    }

    public /* synthetic */ monoploid(ReportLevel reportLevel, competently competentlyVar, ReportLevel reportLevel2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? new competently(1, 0) : competentlyVar, (i & 4) != 0 ? reportLevel : reportLevel2);
    }
}
