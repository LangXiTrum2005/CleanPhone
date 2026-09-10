package ingathering;

/* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f28849attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f28850dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f28851saneness;

    /* JADX INFO: compiled from: AutoValue_InstallationTokenResult.java */
    public static final class saneness extends apical.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f28852attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Long f28853dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Long f28854saneness;

        @Override // ingathering.apical.attabal
        public apical attabal() {
            String str = "";
            if (this.f28852attabal == null) {
                str = " token";
            }
            if (this.f28854saneness == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f28853dern == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new attabal(this.f28852attabal, this.f28854saneness.longValue(), this.f28853dern.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ingathering.apical.attabal
        public apical.attabal dern(long j) {
            this.f28853dern = Long.valueOf(j);
            return this;
        }

        @Override // ingathering.apical.attabal
        public apical.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f28852attabal = str;
            return this;
        }

        @Override // ingathering.apical.attabal
        public apical.attabal wireman(long j) {
            this.f28854saneness = Long.valueOf(j);
            return this;
        }
    }

    @Override // ingathering.apical
    public long dern() {
        return this.f28850dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof apical) {
            apical apicalVar = (apical) obj;
            if (this.f28849attabal.equals(apicalVar.saneness()) && this.f28851saneness == apicalVar.wireman() && this.f28850dern == apicalVar.dern()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f28849attabal.hashCode() ^ 1000003) * 1000003;
        long j = this.f28851saneness;
        long j2 = this.f28850dern;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // ingathering.apical
    public String saneness() {
        return this.f28849attabal;
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f28849attabal + ", tokenExpirationTimestamp=" + this.f28851saneness + ", tokenCreationTimestamp=" + this.f28850dern + "}";
    }

    @Override // ingathering.apical
    public long wireman() {
        return this.f28851saneness;
    }

    public attabal(String str, long j, long j2) {
        this.f28849attabal = str;
        this.f28851saneness = j;
        this.f28850dern = j2;
    }
}
