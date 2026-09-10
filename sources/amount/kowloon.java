package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kowloon extends sealless.marial.wireman.attabal.saneness.AbstractC0013attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f4288attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4289dern;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f4290saneness;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    public static final class saneness extends sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f4291attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f4292dern;
        private String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public long f4293saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public byte f4294wireman;

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0013attabal attabal() {
            String str;
            if (this.f4294wireman == 3 && (str = this.name) != null) {
                return new kowloon(this.f4291attabal, this.f4293saneness, str, this.f4292dern);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f4294wireman & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f4294wireman & 2) == 0) {
                sb.append(" size");
            }
            if (this.name == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal dern(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.name = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal marial(String str) {
            this.f4292dern = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal saneness(long j) {
            this.f4291attabal = j;
            this.f4294wireman = (byte) (this.f4294wireman | 1);
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0013attabal.AbstractC0014attabal wireman(long j) {
            this.f4293saneness = j;
            this.f4294wireman = (byte) (this.f4294wireman | 2);
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal
    public String dern() {
        return this.name;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.attabal.saneness.AbstractC0013attabal) {
            sealless.marial.wireman.attabal.saneness.AbstractC0013attabal abstractC0013attabal = (sealless.marial.wireman.attabal.saneness.AbstractC0013attabal) obj;
            if (this.f4288attabal == abstractC0013attabal.saneness() && this.f4290saneness == abstractC0013attabal.wireman() && this.name.equals(abstractC0013attabal.dern()) && ((str = this.f4289dern) != null ? str.equals(abstractC0013attabal.marial()) : abstractC0013attabal.marial() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4288attabal;
        long j2 = this.f4290saneness;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.name.hashCode()) * 1000003;
        String str = this.f4289dern;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal
    public String marial() {
        return this.f4289dern;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal
    public long saneness() {
        return this.f4288attabal;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f4288attabal + ", size=" + this.f4290saneness + ", name=" + this.name + ", uuid=" + this.f4289dern + "}";
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0013attabal
    public long wireman() {
        return this.f4290saneness;
    }

    public kowloon(long j, long j2, String str, String str2) {
        this.f4288attabal = j;
        this.f4290saneness = j2;
        this.name = str;
        this.f4289dern = str2;
    }
}
