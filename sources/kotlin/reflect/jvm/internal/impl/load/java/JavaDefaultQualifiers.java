package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.media3.extractor.text.ttml.a;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaDefaultQualifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NullabilityQualifierWithMigrationStatus f43743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f43744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43745c;

    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection qualifierApplicabilityTypes, boolean z2) {
        Intrinsics.f(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f43743a = nullabilityQualifierWithMigrationStatus;
        this.f43744b = qualifierApplicabilityTypes;
        this.f43745c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.a(this.f43743a, javaDefaultQualifiers.f43743a) && Intrinsics.a(this.f43744b, javaDefaultQualifiers.f43744b) && this.f43745c == javaDefaultQualifiers.f43745c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f43744b.hashCode() + (this.f43743a.hashCode() * 31)) * 31;
        boolean z2 = this.f43745c;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f43743a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f43744b);
        sb.append(", definitelyNotNull=");
        return a.r(sb, this.f43745c, ')');
    }

    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection) {
        this(nullabilityQualifierWithMigrationStatus, collection, nullabilityQualifierWithMigrationStatus.f43931a == NullabilityQualifier.Z);
    }
}
