package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaNullabilityAnnotationsStatus {
    public static final JavaNullabilityAnnotationsStatus d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportLevel f43752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinVersion f43753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReportLevel f43754c;

    public static final class Companion {
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2) {
        this.f43752a = reportLevel;
        this.f43753b = kotlinVersion;
        this.f43754c = reportLevel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f43752a == javaNullabilityAnnotationsStatus.f43752a && Intrinsics.a(this.f43753b, javaNullabilityAnnotationsStatus.f43753b) && this.f43754c == javaNullabilityAnnotationsStatus.f43754c;
    }

    public final int hashCode() {
        int iHashCode = this.f43752a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f43753b;
        return this.f43754c.hashCode() + ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.e0)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f43752a + ", sinceVersion=" + this.f43753b + ", reportLevelAfter=" + this.f43754c + ')';
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, int i2) {
        this(reportLevel, (i2 & 2) != 0 ? new KotlinVersion(1, 0, 0) : null, reportLevel);
    }
}
