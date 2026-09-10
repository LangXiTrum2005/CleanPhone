package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dovishness extends sealless.marial.wireman.AbstractC0024wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4215attabal;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    public static final class saneness extends sealless.marial.wireman.AbstractC0024wireman.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4216attabal;

        @Override // amount.sealless.marial.wireman.AbstractC0024wireman.attabal
        public sealless.marial.wireman.AbstractC0024wireman attabal() {
            String str = this.f4216attabal;
            if (str != null) {
                return new dovishness(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // amount.sealless.marial.wireman.AbstractC0024wireman.attabal
        public sealless.marial.wireman.AbstractC0024wireman.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f4216attabal = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.AbstractC0024wireman) {
            return this.f4215attabal.equals(((sealless.marial.wireman.AbstractC0024wireman) obj).saneness());
        }
        return false;
    }

    public int hashCode() {
        return this.f4215attabal.hashCode() ^ 1000003;
    }

    @Override // amount.sealless.marial.wireman.AbstractC0024wireman
    public String saneness() {
        return this.f4215attabal;
    }

    public String toString() {
        return "Log{content=" + this.f4215attabal + "}";
    }

    public dovishness(String str) {
        this.f4215attabal = str;
    }
}
