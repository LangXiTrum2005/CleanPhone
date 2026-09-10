package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cuirassed extends sealless.marial.beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4193attabal;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    public static final class saneness extends sealless.marial.beachfront.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4194attabal;

        @Override // amount.sealless.marial.beachfront.attabal
        public sealless.marial.beachfront attabal() {
            String str = this.f4194attabal;
            if (str != null) {
                return new cuirassed(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // amount.sealless.marial.beachfront.attabal
        public sealless.marial.beachfront.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f4194attabal = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.beachfront) {
            return this.f4193attabal.equals(((sealless.marial.beachfront) obj).saneness());
        }
        return false;
    }

    public int hashCode() {
        return this.f4193attabal.hashCode() ^ 1000003;
    }

    @Override // amount.sealless.marial.beachfront
    public String saneness() {
        return this.f4193attabal;
    }

    public String toString() {
        return "User{identifier=" + this.f4193attabal + "}";
    }

    public cuirassed(String str) {
        this.f4193attabal = str;
    }
}
