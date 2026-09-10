package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* JADX INFO: loaded from: classes3.dex */
public final class molybdenite extends sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f4297attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4298dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f4299marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4300saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f4301wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    public static final class saneness extends sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f4302attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public byte f4303beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f4304dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f4305marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4306saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public long f4307wireman;

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness attabal() {
            String str;
            if (this.f4303beachfront == 7 && (str = this.f4306saneness) != null) {
                return new molybdenite(this.f4302attabal, str, this.f4304dern, this.f4307wireman, this.f4305marial);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f4303beachfront & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f4306saneness == null) {
                sb.append(" symbol");
            }
            if ((this.f4303beachfront & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f4303beachfront & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal beachfront(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f4306saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal dern(int i) {
            this.f4305marial = i;
            this.f4303beachfront = (byte) (this.f4303beachfront | 4);
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal marial(long j) {
            this.f4302attabal = j;
            this.f4303beachfront = (byte) (this.f4303beachfront | 1);
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal saneness(String str) {
            this.f4304dern = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness.AbstractC0019attabal wireman(long j) {
            this.f4307wireman = j;
            this.f4303beachfront = (byte) (this.f4303beachfront | 2);
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness
    public String beachfront() {
        return this.f4300saneness;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness
    public int dern() {
        return this.f4299marial;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness) {
            sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness abstractC0018saneness = (sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness) obj;
            if (this.f4297attabal == abstractC0018saneness.marial() && this.f4300saneness.equals(abstractC0018saneness.beachfront()) && ((str = this.f4298dern) != null ? str.equals(abstractC0018saneness.saneness()) : abstractC0018saneness.saneness() == null) && this.f4301wireman == abstractC0018saneness.wireman() && this.f4299marial == abstractC0018saneness.dern()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4297attabal;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f4300saneness.hashCode()) * 1000003;
        String str = this.f4298dern;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f4301wireman;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f4299marial;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness
    public long marial() {
        return this.f4297attabal;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness
    public String saneness() {
        return this.f4298dern;
    }

    public String toString() {
        return "Frame{pc=" + this.f4297attabal + ", symbol=" + this.f4300saneness + ", file=" + this.f4298dern + ", offset=" + this.f4301wireman + ", importance=" + this.f4299marial + "}";
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness
    public long wireman() {
        return this.f4301wireman;
    }

    public molybdenite(long j, String str, String str2, long j2, int i) {
        this.f4297attabal = j;
        this.f4300saneness = str;
        this.f4298dern = str2;
        this.f4301wireman = j2;
        this.f4299marial = i;
    }
}
