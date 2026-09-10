package buttstock;

/* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends wireman {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f15209beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f15210dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f15211marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f15212saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f15213wireman;

    /* JADX INFO: renamed from: buttstock.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
    public static final class C0135saneness extends wireman.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f15214attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public byte f15215beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f15216dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public long f15217marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f15218saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f15219wireman;

        @Override // buttstock.wireman.attabal
        public wireman attabal() {
            if (this.f15215beachfront == 1 && this.f15214attabal != null && this.f15218saneness != null && this.f15216dern != null && this.f15219wireman != null) {
                return new saneness(this.f15214attabal, this.f15218saneness, this.f15216dern, this.f15219wireman, this.f15217marial);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f15214attabal == null) {
                sb.append(" rolloutId");
            }
            if (this.f15218saneness == null) {
                sb.append(" variantId");
            }
            if (this.f15216dern == null) {
                sb.append(" parameterKey");
            }
            if (this.f15219wireman == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f15215beachfront) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // buttstock.wireman.attabal
        public wireman.attabal beachfront(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f15218saneness = str;
            return this;
        }

        @Override // buttstock.wireman.attabal
        public wireman.attabal dern(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f15219wireman = str;
            return this;
        }

        @Override // buttstock.wireman.attabal
        public wireman.attabal marial(long j) {
            this.f15217marial = j;
            this.f15215beachfront = (byte) (this.f15215beachfront | 1);
            return this;
        }

        @Override // buttstock.wireman.attabal
        public wireman.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f15216dern = str;
            return this;
        }

        @Override // buttstock.wireman.attabal
        public wireman.attabal wireman(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f15214attabal = str;
            return this;
        }
    }

    @Override // buttstock.wireman
    public String beachfront() {
        return this.f15210dern;
    }

    @Override // buttstock.wireman
    public String dern() {
        return this.f15211marial;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wireman) {
            wireman wiremanVar = (wireman) obj;
            if (this.f15212saneness.equals(wiremanVar.wireman()) && this.f15210dern.equals(wiremanVar.beachfront()) && this.f15213wireman.equals(wiremanVar.saneness()) && this.f15211marial.equals(wiremanVar.dern()) && this.f15209beachfront == wiremanVar.marial()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f15212saneness.hashCode() ^ 1000003) * 1000003) ^ this.f15210dern.hashCode()) * 1000003) ^ this.f15213wireman.hashCode()) * 1000003) ^ this.f15211marial.hashCode()) * 1000003;
        long j = this.f15209beachfront;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // buttstock.wireman
    public long marial() {
        return this.f15209beachfront;
    }

    @Override // buttstock.wireman
    public String saneness() {
        return this.f15213wireman;
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f15212saneness + ", variantId=" + this.f15210dern + ", parameterKey=" + this.f15213wireman + ", parameterValue=" + this.f15211marial + ", templateVersion=" + this.f15209beachfront + "}";
    }

    @Override // buttstock.wireman
    public String wireman() {
        return this.f15212saneness;
    }

    public saneness(String str, String str2, String str3, String str4, long j) {
        this.f15212saneness = str;
        this.f15210dern = str2;
        this.f15213wireman = str3;
        this.f15211marial = str4;
        this.f15209beachfront = j;
    }
}
