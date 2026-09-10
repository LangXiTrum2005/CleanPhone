package umbriferous;

import java.io.File;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends cord {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final amount.sealless f39194attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final File f39195dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f39196saneness;

    public saneness(amount.sealless seallessVar, String str, File file) {
        if (seallessVar == null) {
            throw new NullPointerException("Null report");
        }
        this.f39194attabal = seallessVar;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f39196saneness = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f39195dern = file;
    }

    @Override // umbriferous.cord
    public File dern() {
        return this.f39195dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cord) {
            cord cordVar = (cord) obj;
            if (this.f39194attabal.equals(cordVar.saneness()) && this.f39196saneness.equals(cordVar.wireman()) && this.f39195dern.equals(cordVar.dern())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f39194attabal.hashCode() ^ 1000003) * 1000003) ^ this.f39196saneness.hashCode()) * 1000003) ^ this.f39195dern.hashCode();
    }

    @Override // umbriferous.cord
    public amount.sealless saneness() {
        return this.f39194attabal;
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f39194attabal + ", sessionId=" + this.f39196saneness + ", reportFile=" + this.f39195dern + "}";
    }

    @Override // umbriferous.cord
    public String wireman() {
        return this.f39196saneness;
    }
}
