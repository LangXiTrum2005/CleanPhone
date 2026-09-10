package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cutely extends sealless.marial.attabal.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4195attabal;

    @Override // amount.sealless.marial.attabal.saneness
    public String attabal() {
        return this.f4195attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.attabal.saneness) {
            return this.f4195attabal.equals(((sealless.marial.attabal.saneness) obj).attabal());
        }
        return false;
    }

    public int hashCode() {
        return this.f4195attabal.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f4195attabal + "}";
    }
}
