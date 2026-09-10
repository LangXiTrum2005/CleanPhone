package p002kotlin.reflect.jvm.internal.impl.load.java;

import byname.dern;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.graveside;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: Jsr305Settings.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Jsr305Settings {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ReportLevel f30292attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<dern, ReportLevel> f30293dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f30294marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ReportLevel f30295saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final taiyuan f30296wireman;

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(ReportLevel globalLevel, ReportLevel reportLevel, Map<dern, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f30292attabal = globalLevel;
        this.f30295saneness = reportLevel;
        this.f30293dern = userDefinedLevelForSpecificAnnotation;
        this.f30296wireman = saneness.saneness(new Function0<String[]>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings$description$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final String[] invoke() {
                Jsr305Settings jsr305Settings = this.this$0;
                List listDern = graveside.dern();
                listDern.add(jsr305Settings.attabal().getDescription());
                ReportLevel reportLevelSaneness = jsr305Settings.saneness();
                if (reportLevelSaneness != null) {
                    listDern.add("under-migration:" + reportLevelSaneness.getDescription());
                }
                for (Map.Entry<dern, ReportLevel> entry : jsr305Settings.dern().entrySet()) {
                    listDern.add('@' + entry.getKey() + ':' + entry.getValue().getDescription());
                }
                return (String[]) graveside.attabal(listDern).toArray(new String[0]);
            }
        });
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        this.f30294marial = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public final ReportLevel attabal() {
        return this.f30292attabal;
    }

    public final Map<dern, ReportLevel> dern() {
        return this.f30293dern;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f30292attabal == jsr305Settings.f30292attabal && this.f30295saneness == jsr305Settings.f30295saneness && Intrinsics.wireman(this.f30293dern, jsr305Settings.f30293dern);
    }

    public int hashCode() {
        int iHashCode = this.f30292attabal.hashCode() * 31;
        ReportLevel reportLevel = this.f30295saneness;
        return ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f30293dern.hashCode();
    }

    public final ReportLevel saneness() {
        return this.f30295saneness;
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f30292attabal + ", migrationLevel=" + this.f30295saneness + ", userDefinedLevelForSpecificAnnotation=" + this.f30293dern + ')';
    }

    public final boolean wireman() {
        return this.f30294marial;
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? seminary.taiyuan() : map);
    }
}
