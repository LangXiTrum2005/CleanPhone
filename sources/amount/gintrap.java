package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gintrap extends sealless.marial.wireman.AbstractC0023marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final sealless.marial.wireman.AbstractC0023marial.saneness f4230attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4231dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4232saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f4233wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    public static final class saneness extends sealless.marial.wireman.AbstractC0023marial.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public sealless.marial.wireman.AbstractC0023marial.saneness f4234attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f4235dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public byte f4236marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4237saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f4238wireman;

        @Override // amount.sealless.marial.wireman.AbstractC0023marial.attabal
        public sealless.marial.wireman.AbstractC0023marial attabal() {
            sealless.marial.wireman.AbstractC0023marial.saneness sanenessVar;
            String str;
            String str2;
            if (this.f4236marial == 1 && (sanenessVar = this.f4234attabal) != null && (str = this.f4237saneness) != null && (str2 = this.f4235dern) != null) {
                return new gintrap(sanenessVar, str, str2, this.f4238wireman);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4234attabal == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f4237saneness == null) {
                sb.append(" parameterKey");
            }
            if (this.f4235dern == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f4236marial) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.AbstractC0023marial.attabal
        public sealless.marial.wireman.AbstractC0023marial.attabal dern(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f4235dern = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.AbstractC0023marial.attabal
        public sealless.marial.wireman.AbstractC0023marial.attabal marial(long j) {
            this.f4238wireman = j;
            this.f4236marial = (byte) (this.f4236marial | 1);
            return this;
        }

        @Override // amount.sealless.marial.wireman.AbstractC0023marial.attabal
        public sealless.marial.wireman.AbstractC0023marial.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f4237saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.AbstractC0023marial.attabal
        public sealless.marial.wireman.AbstractC0023marial.attabal wireman(sealless.marial.wireman.AbstractC0023marial.saneness sanenessVar) {
            if (sanenessVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f4234attabal = sanenessVar;
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.AbstractC0023marial
    public String dern() {
        return this.f4231dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.AbstractC0023marial) {
            sealless.marial.wireman.AbstractC0023marial abstractC0023marial = (sealless.marial.wireman.AbstractC0023marial) obj;
            if (this.f4230attabal.equals(abstractC0023marial.wireman()) && this.f4232saneness.equals(abstractC0023marial.saneness()) && this.f4231dern.equals(abstractC0023marial.dern()) && this.f4233wireman == abstractC0023marial.marial()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f4230attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4232saneness.hashCode()) * 1000003) ^ this.f4231dern.hashCode()) * 1000003;
        long j = this.f4233wireman;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // amount.sealless.marial.wireman.AbstractC0023marial
    public long marial() {
        return this.f4233wireman;
    }

    @Override // amount.sealless.marial.wireman.AbstractC0023marial
    public String saneness() {
        return this.f4232saneness;
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f4230attabal + ", parameterKey=" + this.f4232saneness + ", parameterValue=" + this.f4231dern + ", templateVersion=" + this.f4233wireman + "}";
    }

    @Override // amount.sealless.marial.wireman.AbstractC0023marial
    public sealless.marial.wireman.AbstractC0023marial.saneness wireman() {
        return this.f4230attabal;
    }

    public gintrap(sealless.marial.wireman.AbstractC0023marial.saneness sanenessVar, String str, String str2, long j) {
        this.f4230attabal = sanenessVar;
        this.f4232saneness = str;
        this.f4231dern = str2;
        this.f4233wireman = j;
    }
}
