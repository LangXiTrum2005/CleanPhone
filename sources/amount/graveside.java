package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside extends sealless.marial.wireman.attabal.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4239attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f4240dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f4241saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f4242wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    public static final class saneness extends sealless.marial.wireman.attabal.dern.AbstractC0012attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4243attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f4244dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public byte f4245marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f4246saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f4247wireman;

        @Override // amount.sealless.marial.wireman.attabal.dern.AbstractC0012attabal
        public sealless.marial.wireman.attabal.dern attabal() {
            String str;
            if (this.f4245marial == 7 && (str = this.f4243attabal) != null) {
                return new graveside(str, this.f4246saneness, this.f4244dern, this.f4247wireman);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4243attabal == null) {
                sb.append(" processName");
            }
            if ((this.f4245marial & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f4245marial & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f4245marial & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.attabal.dern.AbstractC0012attabal
        public sealless.marial.wireman.attabal.dern.AbstractC0012attabal dern(int i) {
            this.f4244dern = i;
            this.f4245marial = (byte) (this.f4245marial | 2);
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.dern.AbstractC0012attabal
        public sealless.marial.wireman.attabal.dern.AbstractC0012attabal marial(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f4243attabal = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.dern.AbstractC0012attabal
        public sealless.marial.wireman.attabal.dern.AbstractC0012attabal saneness(boolean z) {
            this.f4247wireman = z;
            this.f4245marial = (byte) (this.f4245marial | 4);
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.dern.AbstractC0012attabal
        public sealless.marial.wireman.attabal.dern.AbstractC0012attabal wireman(int i) {
            this.f4246saneness = i;
            this.f4245marial = (byte) (this.f4245marial | 1);
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.attabal.dern
    public int dern() {
        return this.f4241saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.attabal.dern) {
            sealless.marial.wireman.attabal.dern dernVar = (sealless.marial.wireman.attabal.dern) obj;
            if (this.f4239attabal.equals(dernVar.wireman()) && this.f4241saneness == dernVar.dern() && this.f4240dern == dernVar.saneness() && this.f4242wireman == dernVar.marial()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f4239attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4241saneness) * 1000003) ^ this.f4240dern) * 1000003) ^ (this.f4242wireman ? 1231 : 1237);
    }

    @Override // amount.sealless.marial.wireman.attabal.dern
    public boolean marial() {
        return this.f4242wireman;
    }

    @Override // amount.sealless.marial.wireman.attabal.dern
    public int saneness() {
        return this.f4240dern;
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f4239attabal + ", pid=" + this.f4241saneness + ", importance=" + this.f4240dern + ", defaultProcess=" + this.f4242wireman + "}";
    }

    @Override // amount.sealless.marial.wireman.attabal.dern
    public String wireman() {
        return this.f4239attabal;
    }

    public graveside(String str, int i, int i2, boolean z) {
        this.f4239attabal = str;
        this.f4241saneness = i;
        this.f4240dern = i2;
        this.f4242wireman = z;
    }
}
