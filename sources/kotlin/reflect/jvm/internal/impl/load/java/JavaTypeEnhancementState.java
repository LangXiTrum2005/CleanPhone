package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaTypeEnhancementState {
    public static final JavaTypeEnhancementState d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jsr305Settings f43755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f43756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43757c;

    public static final class Companion {
    }

    static {
        FqName fqName = JavaNullabilityAnnotationSettingsKt.f43749a;
        KotlinVersion configuredKotlinVersion = KotlinVersion.f0;
        Intrinsics.f(configuredKotlinVersion, "configuredKotlinVersion");
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = JavaNullabilityAnnotationSettingsKt.d;
        KotlinVersion kotlinVersion = javaNullabilityAnnotationsStatus.f43753b;
        ReportLevel globalReportLevel = (kotlinVersion == null || kotlinVersion.e0 - configuredKotlinVersion.e0 > 0) ? javaNullabilityAnnotationsStatus.f43752a : javaNullabilityAnnotationsStatus.f43754c;
        Intrinsics.f(globalReportLevel, "globalReportLevel");
        Jsr305Settings jsr305Settings = new Jsr305Settings(globalReportLevel, globalReportLevel == ReportLevel.WARN ? null : globalReportLevel);
        JavaTypeEnhancementState$Companion$DEFAULT$1 javaTypeEnhancementState$Companion$DEFAULT$1 = JavaTypeEnhancementState$Companion$DEFAULT$1.X;
        d = new JavaTypeEnhancementState(jsr305Settings);
    }

    public JavaTypeEnhancementState(Jsr305Settings jsr305Settings) {
        JavaTypeEnhancementState$Companion$DEFAULT$1 javaTypeEnhancementState$Companion$DEFAULT$1 = JavaTypeEnhancementState$Companion$DEFAULT$1.X;
        this.f43755a = jsr305Settings;
        this.f43756b = javaTypeEnhancementState$Companion$DEFAULT$1;
        this.f43757c = jsr305Settings.f43762e || javaTypeEnhancementState$Companion$DEFAULT$1.invoke(JavaNullabilityAnnotationSettingsKt.f43749a) == ReportLevel.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f43755a + ", getReportLevelForAnnotation=" + this.f43756b + ')';
    }
}
