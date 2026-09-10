package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.competently;
import patroclinal.formularize;

/* JADX INFO: compiled from: JavaNullabilityAnnotationSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f30343attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final dern[] f30344beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final dovishness<monoploid> f30345competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final dern f30346dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final monoploid f30347impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final String f30348marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final dern f30349saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final dern f30350wireman;

    static {
        dern dernVar = new dern("org.jspecify.nullness");
        f30343attabal = dernVar;
        dern dernVar2 = new dern("org.jspecify.annotations");
        f30349saneness = dernVar2;
        dern dernVar3 = new dern("io.reactivex.rxjava3.annotations");
        f30346dern = dernVar3;
        dern dernVar4 = new dern("org.checkerframework.checker.nullness.compatqual");
        f30350wireman = dernVar4;
        String strSaneness = dernVar3.saneness();
        Intrinsics.checkNotNullExpressionValue(strSaneness, "asString(...)");
        f30348marial = strSaneness;
        f30344beachfront = new dern[]{new dern(strSaneness + ".Nullable"), new dern(strSaneness + ".NonNull")};
        dern dernVar5 = new dern("org.jetbrains.annotations");
        monoploid.attabal attabalVar = monoploid.f30606wireman;
        Pair pairAttabal = formularize.attabal(dernVar5, attabalVar.attabal());
        Pair pairAttabal2 = formularize.attabal(new dern("androidx.annotation"), attabalVar.attabal());
        Pair pairAttabal3 = formularize.attabal(new dern("android.support.annotation"), attabalVar.attabal());
        Pair pairAttabal4 = formularize.attabal(new dern("android.annotation"), attabalVar.attabal());
        Pair pairAttabal5 = formularize.attabal(new dern("com.android.annotations"), attabalVar.attabal());
        Pair pairAttabal6 = formularize.attabal(new dern("org.eclipse.jdt.annotation"), attabalVar.attabal());
        Pair pairAttabal7 = formularize.attabal(new dern("org.checkerframework.checker.nullness.qual"), attabalVar.attabal());
        Pair pairAttabal8 = formularize.attabal(dernVar4, attabalVar.attabal());
        Pair pairAttabal9 = formularize.attabal(new dern("javax.annotation"), attabalVar.attabal());
        Pair pairAttabal10 = formularize.attabal(new dern("edu.umd.cs.findbugs.annotations"), attabalVar.attabal());
        Pair pairAttabal11 = formularize.attabal(new dern("io.reactivex.annotations"), attabalVar.attabal());
        dern dernVar6 = new dern("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair pairAttabal12 = formularize.attabal(dernVar6, new monoploid(reportLevel, null, null, 4, null));
        Pair pairAttabal13 = formularize.attabal(new dern("androidx.annotation.RecentlyNonNull"), new monoploid(reportLevel, null, null, 4, null));
        Pair pairAttabal14 = formularize.attabal(new dern("lombok"), attabalVar.attabal());
        competently competentlyVar = new competently(2, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f30345competently = new NullabilityAnnotationStatesImpl(seminary.impassible(pairAttabal, pairAttabal2, pairAttabal3, pairAttabal4, pairAttabal5, pairAttabal6, pairAttabal7, pairAttabal8, pairAttabal9, pairAttabal10, pairAttabal11, pairAttabal12, pairAttabal13, pairAttabal14, formularize.attabal(dernVar, new monoploid(reportLevel, competentlyVar, reportLevel2)), formularize.attabal(dernVar2, new monoploid(reportLevel, new competently(2, 0), reportLevel2)), formularize.attabal(dernVar3, new monoploid(reportLevel, new competently(1, 8), reportLevel2))));
        f30347impromptu = new monoploid(reportLevel, null, null, 4, null);
    }

    public static final Jsr305Settings attabal(competently configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        monoploid monoploidVar = f30347impromptu;
        ReportLevel reportLevelDern = (monoploidVar.wireman() == null || monoploidVar.wireman().compareTo(configuredKotlinVersion) > 0) ? monoploidVar.dern() : monoploidVar.saneness();
        return new Jsr305Settings(reportLevelDern, dern(reportLevelDern), null, 4, null);
    }

    public static final dern[] beachfront() {
        return f30344beachfront;
    }

    public static final ReportLevel competently(dern annotation, dovishness<? extends ReportLevel> configuredReportLevels, competently configuredKotlinVersion) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(configuredReportLevels, "configuredReportLevels");
        Intrinsics.checkNotNullParameter(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevelAttabal = configuredReportLevels.attabal(annotation);
        if (reportLevelAttabal != null) {
            return reportLevelAttabal;
        }
        monoploid monoploidVarAttabal = f30345competently.attabal(annotation);
        if (monoploidVarAttabal == null) {
            return ReportLevel.IGNORE;
        }
        return (monoploidVarAttabal.wireman() == null || monoploidVarAttabal.wireman().compareTo(configuredKotlinVersion) > 0) ? monoploidVarAttabal.dern() : monoploidVarAttabal.saneness();
    }

    public static final ReportLevel dern(ReportLevel globalReportLevel) {
        Intrinsics.checkNotNullParameter(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    public static /* synthetic */ ReportLevel impromptu(dern dernVar, dovishness dovishnessVar, competently competentlyVar, int i, Object obj) {
        if ((i & 4) != 0) {
            competentlyVar = new competently(1, 7, 20);
        }
        return competently(dernVar, dovishnessVar, competentlyVar);
    }

    public static final dern marial() {
        return f30349saneness;
    }

    public static /* synthetic */ Jsr305Settings saneness(competently competentlyVar, int i, Object obj) {
        if ((i & 1) != 0) {
            competentlyVar = competently.f35077graveside;
        }
        return attabal(competentlyVar);
    }

    public static final ReportLevel wireman(dern annotationFqName) {
        Intrinsics.checkNotNullParameter(annotationFqName, "annotationFqName");
        return impromptu(annotationFqName, dovishness.f30409attabal.attabal(), null, 4, null);
    }
}
