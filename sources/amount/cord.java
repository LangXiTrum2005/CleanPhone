package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cord extends sealless.marial.AbstractC0010marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f4184attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4185dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4186saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f4187wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    public static final class saneness extends sealless.marial.AbstractC0010marial.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f4188attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f4189dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public byte f4190marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4191saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public boolean f4192wireman;

        @Override // amount.sealless.marial.AbstractC0010marial.attabal
        public sealless.marial.AbstractC0010marial attabal() {
            String str;
            String str2;
            if (this.f4190marial == 3 && (str = this.f4191saneness) != null && (str2 = this.f4189dern) != null) {
                return new cord(this.f4188attabal, str, str2, this.f4192wireman);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f4190marial & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f4191saneness == null) {
                sb.append(" version");
            }
            if (this.f4189dern == null) {
                sb.append(" buildVersion");
            }
            if ((this.f4190marial & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.AbstractC0010marial.attabal
        public sealless.marial.AbstractC0010marial.attabal dern(boolean z) {
            this.f4192wireman = z;
            this.f4190marial = (byte) (this.f4190marial | 2);
            return this;
        }

        @Override // amount.sealless.marial.AbstractC0010marial.attabal
        public sealless.marial.AbstractC0010marial.attabal marial(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f4191saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.AbstractC0010marial.attabal
        public sealless.marial.AbstractC0010marial.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f4189dern = str;
            return this;
        }

        @Override // amount.sealless.marial.AbstractC0010marial.attabal
        public sealless.marial.AbstractC0010marial.attabal wireman(int i) {
            this.f4188attabal = i;
            this.f4190marial = (byte) (this.f4190marial | 1);
            return this;
        }
    }

    @Override // amount.sealless.marial.AbstractC0010marial
    public int dern() {
        return this.f4184attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.AbstractC0010marial) {
            sealless.marial.AbstractC0010marial abstractC0010marial = (sealless.marial.AbstractC0010marial) obj;
            if (this.f4184attabal == abstractC0010marial.dern() && this.f4186saneness.equals(abstractC0010marial.wireman()) && this.f4185dern.equals(abstractC0010marial.saneness()) && this.f4187wireman == abstractC0010marial.marial()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f4184attabal ^ 1000003) * 1000003) ^ this.f4186saneness.hashCode()) * 1000003) ^ this.f4185dern.hashCode()) * 1000003) ^ (this.f4187wireman ? 1231 : 1237);
    }

    @Override // amount.sealless.marial.AbstractC0010marial
    public boolean marial() {
        return this.f4187wireman;
    }

    @Override // amount.sealless.marial.AbstractC0010marial
    public String saneness() {
        return this.f4185dern;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f4184attabal + ", version=" + this.f4186saneness + ", buildVersion=" + this.f4185dern + ", jailbroken=" + this.f4187wireman + "}";
    }

    @Override // amount.sealless.marial.AbstractC0010marial
    public String wireman() {
        return this.f4186saneness;
    }

    public cord(int i, String str, String str2, boolean z) {
        this.f4184attabal = i;
        this.f4186saneness = str;
        this.f4185dern = str2;
        this.f4187wireman = z;
    }
}
