package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan extends sealless.marial.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4362attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f4363beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final String f4364competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4365dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f4366marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4367saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final sealless.marial.attabal.saneness f4368wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    public static final class saneness extends sealless.marial.attabal.AbstractC0009attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4369attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public String f4370beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public String f4371competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f4372dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public String f4373marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4374saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public sealless.marial.attabal.saneness f4375wireman;

        @Override // amount.sealless.marial.attabal.AbstractC0009attabal
        public sealless.marial.attabal attabal() {
            String str;
            String str2 = this.f4369attabal;
            if (str2 != null && (str = this.f4374saneness) != null) {
                return new taiyuan(str2, str, this.f4372dern, this.f4375wireman, this.f4373marial, this.f4370beachfront, this.f4371competently);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4369attabal == null) {
                sb.append(" identifier");
            }
            if (this.f4374saneness == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.attabal.AbstractC0009attabal
        public sealless.marial.attabal.AbstractC0009attabal beachfront(String str) {
            this.f4373marial = str;
            return this;
        }

        @Override // amount.sealless.marial.attabal.AbstractC0009attabal
        public sealless.marial.attabal.AbstractC0009attabal competently(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f4374saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.attabal.AbstractC0009attabal
        public sealless.marial.attabal.AbstractC0009attabal dern(String str) {
            this.f4371competently = str;
            return this;
        }

        @Override // amount.sealless.marial.attabal.AbstractC0009attabal
        public sealless.marial.attabal.AbstractC0009attabal marial(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f4369attabal = str;
            return this;
        }

        @Override // amount.sealless.marial.attabal.AbstractC0009attabal
        public sealless.marial.attabal.AbstractC0009attabal saneness(String str) {
            this.f4370beachfront = str;
            return this;
        }

        @Override // amount.sealless.marial.attabal.AbstractC0009attabal
        public sealless.marial.attabal.AbstractC0009attabal wireman(String str) {
            this.f4372dern = str;
            return this;
        }
    }

    @Override // amount.sealless.marial.attabal
    public String beachfront() {
        return this.f4366marial;
    }

    @Override // amount.sealless.marial.attabal
    public sealless.marial.attabal.saneness competently() {
        return this.f4368wireman;
    }

    @Override // amount.sealless.marial.attabal
    public String dern() {
        return this.f4364competently;
    }

    public boolean equals(Object obj) {
        String str;
        sealless.marial.attabal.saneness sanenessVar;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.attabal) {
            sealless.marial.attabal attabalVar = (sealless.marial.attabal) obj;
            if (this.f4362attabal.equals(attabalVar.marial()) && this.f4367saneness.equals(attabalVar.impromptu()) && ((str = this.f4365dern) != null ? str.equals(attabalVar.wireman()) : attabalVar.wireman() == null) && ((sanenessVar = this.f4368wireman) != null ? sanenessVar.equals(attabalVar.competently()) : attabalVar.competently() == null) && ((str2 = this.f4366marial) != null ? str2.equals(attabalVar.beachfront()) : attabalVar.beachfront() == null) && ((str3 = this.f4363beachfront) != null ? str3.equals(attabalVar.saneness()) : attabalVar.saneness() == null) && ((str4 = this.f4364competently) != null ? str4.equals(attabalVar.dern()) : attabalVar.dern() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f4362attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4367saneness.hashCode()) * 1000003;
        String str = this.f4365dern;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        sealless.marial.attabal.saneness sanenessVar = this.f4368wireman;
        int iHashCode3 = (iHashCode2 ^ (sanenessVar == null ? 0 : sanenessVar.hashCode())) * 1000003;
        String str2 = this.f4366marial;
        int iHashCode4 = (iHashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f4363beachfront;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f4364competently;
        return iHashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // amount.sealless.marial.attabal
    public String impromptu() {
        return this.f4367saneness;
    }

    @Override // amount.sealless.marial.attabal
    public String marial() {
        return this.f4362attabal;
    }

    @Override // amount.sealless.marial.attabal
    public String saneness() {
        return this.f4363beachfront;
    }

    public String toString() {
        return "Application{identifier=" + this.f4362attabal + ", version=" + this.f4367saneness + ", displayVersion=" + this.f4365dern + ", organization=" + this.f4368wireman + ", installationUuid=" + this.f4366marial + ", developmentPlatform=" + this.f4363beachfront + ", developmentPlatformVersion=" + this.f4364competently + "}";
    }

    @Override // amount.sealless.marial.attabal
    public String wireman() {
        return this.f4365dern;
    }

    public taiyuan(String str, String str2, String str3, sealless.marial.attabal.saneness sanenessVar, String str4, String str5, String str6) {
        this.f4362attabal = str;
        this.f4367saneness = str2;
        this.f4365dern = str3;
        this.f4368wireman = sanenessVar;
        this.f4366marial = str4;
        this.f4363beachfront = str5;
        this.f4364competently = str6;
    }
}
