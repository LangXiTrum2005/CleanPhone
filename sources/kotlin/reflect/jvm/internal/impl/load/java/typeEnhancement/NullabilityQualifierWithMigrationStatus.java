package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import androidx.media3.extractor.text.ttml.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NullabilityQualifier f43931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43932b;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier) {
        this.f43931a = nullabilityQualifier;
        this.f43932b = false;
    }

    public static NullabilityQualifierWithMigrationStatus a(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier qualifier, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            qualifier = nullabilityQualifierWithMigrationStatus.f43931a;
        }
        if ((i2 & 2) != 0) {
            z2 = nullabilityQualifierWithMigrationStatus.f43932b;
        }
        nullabilityQualifierWithMigrationStatus.getClass();
        Intrinsics.f(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f43931a == nullabilityQualifierWithMigrationStatus.f43931a && this.f43932b == nullabilityQualifierWithMigrationStatus.f43932b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f43931a.hashCode() * 31;
        boolean z2 = this.f43932b;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.f43931a);
        sb.append(", isForWarningOnly=");
        return a.r(sb, this.f43932b, ')');
    }

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z2) {
        this.f43931a = nullabilityQualifier;
        this.f43932b = z2;
    }
}
