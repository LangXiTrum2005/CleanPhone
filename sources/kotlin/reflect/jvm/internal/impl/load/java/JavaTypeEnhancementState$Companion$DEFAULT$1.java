package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends FunctionReference implements Function1<FqName, ReportLevel> {
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 X = new JavaTypeEnhancementState$Companion$DEFAULT$1(1);

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.f43333a.c(JavaNullabilityAnnotationSettingsKt.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FqName p0 = (FqName) obj;
        Intrinsics.f(p0, "p0");
        FqName fqName = JavaNullabilityAnnotationSettingsKt.f43749a;
        NullabilityAnnotationStates.f43783a.getClass();
        NullabilityAnnotationStatesImpl configuredReportLevels = NullabilityAnnotationStates.Companion.f43785b;
        KotlinVersion kotlinVersion = new KotlinVersion(1, 7, 20);
        Intrinsics.f(configuredReportLevels, "configuredReportLevels");
        ReportLevel reportLevel = (ReportLevel) configuredReportLevels.f43787c.invoke(p0);
        if (reportLevel != null) {
            return reportLevel;
        }
        NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl = JavaNullabilityAnnotationSettingsKt.f43751c;
        nullabilityAnnotationStatesImpl.getClass();
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) nullabilityAnnotationStatesImpl.f43787c.invoke(p0);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        KotlinVersion kotlinVersion2 = javaNullabilityAnnotationsStatus.f43753b;
        return (kotlinVersion2 == null || kotlinVersion2.e0 - kotlinVersion.e0 > 0) ? javaNullabilityAnnotationsStatus.f43752a : javaNullabilityAnnotationsStatus.f43754c;
    }
}
