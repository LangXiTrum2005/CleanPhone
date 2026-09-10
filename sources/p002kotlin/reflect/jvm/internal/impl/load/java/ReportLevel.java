package p002kotlin.reflect.jvm.internal.impl.load.java;

import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ReportLevel.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");

    private final String description;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final /* synthetic */ pussyfooter.attabal f30300arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());
    public static final attabal Companion = new attabal(null);

    /* JADX INFO: compiled from: ReportLevel.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    ReportLevel(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
