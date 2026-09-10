package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid extends sealless.marial.wireman.attabal.saneness.AbstractC0021wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4308attabal;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f4309saneness;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    public static final class saneness extends sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4310attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public byte f4311dern;
        private String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f4312saneness;

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0021wireman attabal() {
            String str;
            String str2;
            if (this.f4311dern == 1 && (str = this.name) != null && (str2 = this.f4310attabal) != null) {
                return new monoploid(str, str2, this.f4312saneness);
            }
            StringBuilder sb = new StringBuilder();
            if (this.name == null) {
                sb.append(" name");
            }
            if (this.f4310attabal == null) {
                sb.append(" code");
            }
            if ((1 & this.f4311dern) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal dern(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f4310attabal = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal saneness(long j) {
            this.f4312saneness = j;
            this.f4311dern = (byte) (this.f4311dern | 1);
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0021wireman.AbstractC0022attabal wireman(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.name = str;
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman
    public String dern() {
        return this.f4308attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.attabal.saneness.AbstractC0021wireman) {
            sealless.marial.wireman.attabal.saneness.AbstractC0021wireman abstractC0021wireman = (sealless.marial.wireman.attabal.saneness.AbstractC0021wireman) obj;
            if (this.name.equals(abstractC0021wireman.wireman()) && this.f4308attabal.equals(abstractC0021wireman.dern()) && this.f4309saneness == abstractC0021wireman.saneness()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.name.hashCode() ^ 1000003) * 1000003) ^ this.f4308attabal.hashCode()) * 1000003;
        long j = this.f4309saneness;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman
    public long saneness() {
        return this.f4309saneness;
    }

    public String toString() {
        return "Signal{name=" + this.name + ", code=" + this.f4308attabal + ", address=" + this.f4309saneness + "}";
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0021wireman
    public String wireman() {
        return this.name;
    }

    public monoploid(String str, String str2, long j) {
        this.name = str;
        this.f4308attabal = str2;
        this.f4309saneness = j;
    }
}
