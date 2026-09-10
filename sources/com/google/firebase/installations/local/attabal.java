package com.google.firebase.installations.local;

/* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends com.google.firebase.installations.local.saneness {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final long f22493beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final long f22494competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f22495dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f22496impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f22497marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f22498saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f22499wireman;

    /* JADX INFO: compiled from: AutoValue_PersistedInstallationEntry.java */
    public static final class saneness extends com.google.firebase.installations.local.saneness.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f22500attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public Long f22501beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public String f22502competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f22503dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public Long f22504marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f22505saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f22506wireman;

        @Override // com.google.firebase.installations.local.saneness.attabal
        public com.google.firebase.installations.local.saneness attabal() {
            String str = "";
            if (this.f22505saneness == null) {
                str = " registrationStatus";
            }
            if (this.f22504marial == null) {
                str = str + " expiresInSecs";
            }
            if (this.f22501beachfront == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new attabal(this.f22500attabal, this.f22505saneness, this.f22503dern, this.f22506wireman, this.f22504marial.longValue(), this.f22501beachfront.longValue(), this.f22502competently);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.local.saneness.attabal
        public com.google.firebase.installations.local.saneness.attabal beachfront(String str) {
            this.f22506wireman = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.saneness.attabal
        public com.google.firebase.installations.local.saneness.attabal competently(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f22505saneness = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.saneness.attabal
        public com.google.firebase.installations.local.saneness.attabal dern(long j) {
            this.f22504marial = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.saneness.attabal
        public com.google.firebase.installations.local.saneness.attabal impromptu(long j) {
            this.f22501beachfront = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.local.saneness.attabal
        public com.google.firebase.installations.local.saneness.attabal marial(String str) {
            this.f22502competently = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.saneness.attabal
        public com.google.firebase.installations.local.saneness.attabal saneness(String str) {
            this.f22503dern = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.saneness.attabal
        public com.google.firebase.installations.local.saneness.attabal wireman(String str) {
            this.f22500attabal = str;
            return this;
        }

        public saneness() {
        }

        public saneness(com.google.firebase.installations.local.saneness sanenessVar) {
            this.f22500attabal = sanenessVar.wireman();
            this.f22505saneness = sanenessVar.competently();
            this.f22503dern = sanenessVar.saneness();
            this.f22506wireman = sanenessVar.beachfront();
            this.f22504marial = Long.valueOf(sanenessVar.dern());
            this.f22501beachfront = Long.valueOf(sanenessVar.impromptu());
            this.f22502competently = sanenessVar.marial();
        }
    }

    @Override // com.google.firebase.installations.local.saneness
    public String beachfront() {
        return this.f22497marial;
    }

    @Override // com.google.firebase.installations.local.saneness
    public PersistedInstallation.RegistrationStatus competently() {
        return this.f22495dern;
    }

    @Override // com.google.firebase.installations.local.saneness
    public long dern() {
        return this.f22493beachfront;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.firebase.installations.local.saneness) {
            com.google.firebase.installations.local.saneness sanenessVar = (com.google.firebase.installations.local.saneness) obj;
            String str4 = this.f22498saneness;
            if (str4 != null ? str4.equals(sanenessVar.wireman()) : sanenessVar.wireman() == null) {
                if (this.f22495dern.equals(sanenessVar.competently()) && ((str = this.f22499wireman) != null ? str.equals(sanenessVar.saneness()) : sanenessVar.saneness() == null) && ((str2 = this.f22497marial) != null ? str2.equals(sanenessVar.beachfront()) : sanenessVar.beachfront() == null) && this.f22493beachfront == sanenessVar.dern() && this.f22494competently == sanenessVar.impromptu() && ((str3 = this.f22496impromptu) != null ? str3.equals(sanenessVar.marial()) : sanenessVar.marial() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f22498saneness;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f22495dern.hashCode()) * 1000003;
        String str2 = this.f22499wireman;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22497marial;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f22493beachfront;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f22494competently;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f22496impromptu;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.local.saneness
    public long impromptu() {
        return this.f22494competently;
    }

    @Override // com.google.firebase.installations.local.saneness
    public String marial() {
        return this.f22496impromptu;
    }

    @Override // com.google.firebase.installations.local.saneness
    public String saneness() {
        return this.f22499wireman;
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f22498saneness + ", registrationStatus=" + this.f22495dern + ", authToken=" + this.f22499wireman + ", refreshToken=" + this.f22497marial + ", expiresInSecs=" + this.f22493beachfront + ", tokenCreationEpochInSecs=" + this.f22494competently + ", fisError=" + this.f22496impromptu + "}";
    }

    @Override // com.google.firebase.installations.local.saneness
    public com.google.firebase.installations.local.saneness.attabal triweekly() {
        return new saneness(this);
    }

    @Override // com.google.firebase.installations.local.saneness
    public String wireman() {
        return this.f22498saneness;
    }

    public attabal(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f22498saneness = str;
        this.f22495dern = registrationStatus;
        this.f22499wireman = str2;
        this.f22497marial = str3;
        this.f22493beachfront = j;
        this.f22494competently = j2;
        this.f22496impromptu = str4;
    }
}
