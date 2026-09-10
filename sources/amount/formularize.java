package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* JADX INFO: loaded from: classes3.dex */
public final class formularize extends sealless.marial.wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final long f4217attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final sealless.marial.wireman.beachfront f4218beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final sealless.marial.wireman.attabal f4219dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final sealless.marial.wireman.AbstractC0024wireman f4220marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4221saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final sealless.marial.wireman.dern f4222wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    public static final class saneness extends sealless.marial.wireman.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public long f4223attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public sealless.marial.wireman.beachfront f4224beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public byte f4225competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public sealless.marial.wireman.attabal f4226dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public sealless.marial.wireman.AbstractC0024wireman f4227marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4228saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public sealless.marial.wireman.dern f4229wireman;

        @Override // amount.sealless.marial.wireman.saneness
        public sealless.marial.wireman attabal() {
            String str;
            sealless.marial.wireman.attabal attabalVar;
            sealless.marial.wireman.dern dernVar;
            if (this.f4225competently == 1 && (str = this.f4228saneness) != null && (attabalVar = this.f4226dern) != null && (dernVar = this.f4229wireman) != null) {
                return new formularize(this.f4223attabal, str, attabalVar, dernVar, this.f4227marial, this.f4224beachfront);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f4225competently) == 0) {
                sb.append(" timestamp");
            }
            if (this.f4228saneness == null) {
                sb.append(" type");
            }
            if (this.f4226dern == null) {
                sb.append(" app");
            }
            if (this.f4229wireman == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.saneness
        public sealless.marial.wireman.saneness beachfront(long j) {
            this.f4223attabal = j;
            this.f4225competently = (byte) (this.f4225competently | 1);
            return this;
        }

        @Override // amount.sealless.marial.wireman.saneness
        public sealless.marial.wireman.saneness competently(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f4228saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.saneness
        public sealless.marial.wireman.saneness dern(sealless.marial.wireman.dern dernVar) {
            if (dernVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f4229wireman = dernVar;
            return this;
        }

        @Override // amount.sealless.marial.wireman.saneness
        public sealless.marial.wireman.saneness marial(sealless.marial.wireman.beachfront beachfrontVar) {
            this.f4224beachfront = beachfrontVar;
            return this;
        }

        @Override // amount.sealless.marial.wireman.saneness
        public sealless.marial.wireman.saneness saneness(sealless.marial.wireman.attabal attabalVar) {
            if (attabalVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f4226dern = attabalVar;
            return this;
        }

        @Override // amount.sealless.marial.wireman.saneness
        public sealless.marial.wireman.saneness wireman(sealless.marial.wireman.AbstractC0024wireman abstractC0024wireman) {
            this.f4227marial = abstractC0024wireman;
            return this;
        }

        public saneness() {
        }

        public saneness(sealless.marial.wireman wiremanVar) {
            this.f4223attabal = wiremanVar.beachfront();
            this.f4228saneness = wiremanVar.competently();
            this.f4226dern = wiremanVar.saneness();
            this.f4229wireman = wiremanVar.dern();
            this.f4227marial = wiremanVar.wireman();
            this.f4224beachfront = wiremanVar.marial();
            this.f4225competently = (byte) 1;
        }
    }

    @Override // amount.sealless.marial.wireman
    public long beachfront() {
        return this.f4217attabal;
    }

    @Override // amount.sealless.marial.wireman
    public String competently() {
        return this.f4221saneness;
    }

    @Override // amount.sealless.marial.wireman
    public sealless.marial.wireman.dern dern() {
        return this.f4222wireman;
    }

    public boolean equals(Object obj) {
        sealless.marial.wireman.AbstractC0024wireman abstractC0024wireman;
        sealless.marial.wireman.beachfront beachfrontVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman) {
            sealless.marial.wireman wiremanVar = (sealless.marial.wireman) obj;
            if (this.f4217attabal == wiremanVar.beachfront() && this.f4221saneness.equals(wiremanVar.competently()) && this.f4219dern.equals(wiremanVar.saneness()) && this.f4222wireman.equals(wiremanVar.dern()) && ((abstractC0024wireman = this.f4220marial) != null ? abstractC0024wireman.equals(wiremanVar.wireman()) : wiremanVar.wireman() == null) && ((beachfrontVar = this.f4218beachfront) != null ? beachfrontVar.equals(wiremanVar.marial()) : wiremanVar.marial() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4217attabal;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f4221saneness.hashCode()) * 1000003) ^ this.f4219dern.hashCode()) * 1000003) ^ this.f4222wireman.hashCode()) * 1000003;
        sealless.marial.wireman.AbstractC0024wireman abstractC0024wireman = this.f4220marial;
        int iHashCode2 = (iHashCode ^ (abstractC0024wireman == null ? 0 : abstractC0024wireman.hashCode())) * 1000003;
        sealless.marial.wireman.beachfront beachfrontVar = this.f4218beachfront;
        return iHashCode2 ^ (beachfrontVar != null ? beachfrontVar.hashCode() : 0);
    }

    @Override // amount.sealless.marial.wireman
    public sealless.marial.wireman.saneness impromptu() {
        return new saneness(this);
    }

    @Override // amount.sealless.marial.wireman
    public sealless.marial.wireman.beachfront marial() {
        return this.f4218beachfront;
    }

    @Override // amount.sealless.marial.wireman
    public sealless.marial.wireman.attabal saneness() {
        return this.f4219dern;
    }

    public String toString() {
        return "Event{timestamp=" + this.f4217attabal + ", type=" + this.f4221saneness + ", app=" + this.f4219dern + ", device=" + this.f4222wireman + ", log=" + this.f4220marial + ", rollouts=" + this.f4218beachfront + "}";
    }

    @Override // amount.sealless.marial.wireman
    public sealless.marial.wireman.AbstractC0024wireman wireman() {
        return this.f4220marial;
    }

    public formularize(long j, String str, sealless.marial.wireman.attabal attabalVar, sealless.marial.wireman.dern dernVar, sealless.marial.wireman.AbstractC0024wireman abstractC0024wireman, sealless.marial.wireman.beachfront beachfrontVar) {
        this.f4217attabal = j;
        this.f4221saneness = str;
        this.f4219dern = attabalVar;
        this.f4222wireman = dernVar;
        this.f4220marial = abstractC0024wireman;
        this.f4218beachfront = beachfrontVar;
    }
}
