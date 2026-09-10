package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final NullabilityQualifier f30630attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f30631saneness;

    public beachfront(NullabilityQualifier qualifier, boolean z) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.f30630attabal = qualifier;
        this.f30631saneness = z;
    }

    public static /* synthetic */ beachfront saneness(beachfront beachfrontVar, NullabilityQualifier nullabilityQualifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = beachfrontVar.f30630attabal;
        }
        if ((i & 2) != 0) {
            z = beachfrontVar.f30631saneness;
        }
        return beachfrontVar.attabal(nullabilityQualifier, z);
    }

    public final beachfront attabal(NullabilityQualifier qualifier, boolean z) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new beachfront(qualifier, z);
    }

    public final NullabilityQualifier dern() {
        return this.f30630attabal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beachfront)) {
            return false;
        }
        beachfront beachfrontVar = (beachfront) obj;
        return this.f30630attabal == beachfrontVar.f30630attabal && this.f30631saneness == beachfrontVar.f30631saneness;
    }

    public int hashCode() {
        return (this.f30630attabal.hashCode() * 31) + Boolean.hashCode(this.f30631saneness);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f30630attabal + ", isForWarningOnly=" + this.f30631saneness + ')';
    }

    public final boolean wireman() {
        return this.f30631saneness;
    }

    public /* synthetic */ beachfront(NullabilityQualifier nullabilityQualifier, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z);
    }
}
