package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaTypeEnhancementState {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Jsr305Settings f30289attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f30290dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Function1<dern, ReportLevel> f30291saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final attabal f30288wireman = new attabal(null);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final JavaTypeEnhancementState f30287marial = new JavaTypeEnhancementState(arytenoidectomy.saneness(null, 1, null), JavaTypeEnhancementState$Companion$DEFAULT$1.INSTANCE);

    /* JADX INFO: compiled from: JavaTypeEnhancementState.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaTypeEnhancementState attabal() {
            return JavaTypeEnhancementState.f30287marial;
        }

        public attabal() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeEnhancementState(Jsr305Settings jsr305, Function1<? super dern, ? extends ReportLevel> getReportLevelForAnnotation) {
        Intrinsics.checkNotNullParameter(jsr305, "jsr305");
        Intrinsics.checkNotNullParameter(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f30289attabal = jsr305;
        this.f30291saneness = getReportLevelForAnnotation;
        this.f30290dern = jsr305.wireman() || getReportLevelForAnnotation.invoke(arytenoidectomy.marial()) == ReportLevel.IGNORE;
    }

    public final Function1<dern, ReportLevel> dern() {
        return this.f30291saneness;
    }

    public final boolean saneness() {
        return this.f30290dern;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f30289attabal + ", getReportLevelForAnnotation=" + this.f30291saneness + ')';
    }

    public final Jsr305Settings wireman() {
        return this.f30289attabal;
    }
}
