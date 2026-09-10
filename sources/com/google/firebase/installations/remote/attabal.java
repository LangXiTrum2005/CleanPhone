package com.google.firebase.installations.remote;

/* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends InstallationResponse {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f22510attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f22511dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final InstallationResponse.ResponseCode f22512marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f22513saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final TokenResult f22514wireman;

    /* JADX INFO: compiled from: AutoValue_InstallationResponse.java */
    public static final class saneness extends InstallationResponse.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f22515attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f22516dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public InstallationResponse.ResponseCode f22517marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f22518saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public TokenResult f22519wireman;

        @Override // com.google.firebase.installations.remote.InstallationResponse.attabal
        public InstallationResponse attabal() {
            return new attabal(this.f22515attabal, this.f22518saneness, this.f22516dern, this.f22519wireman, this.f22517marial);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.attabal
        public InstallationResponse.attabal beachfront(String str) {
            this.f22515attabal = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.attabal
        public InstallationResponse.attabal dern(String str) {
            this.f22518saneness = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.attabal
        public InstallationResponse.attabal marial(InstallationResponse.ResponseCode responseCode) {
            this.f22517marial = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.attabal
        public InstallationResponse.attabal saneness(TokenResult tokenResult) {
            this.f22519wireman = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.attabal
        public InstallationResponse.attabal wireman(String str) {
            this.f22516dern = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String beachfront() {
        return this.f22510attabal;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String dern() {
        return this.f22513saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationResponse) {
            InstallationResponse installationResponse = (InstallationResponse) obj;
            String str = this.f22510attabal;
            if (str != null ? str.equals(installationResponse.beachfront()) : installationResponse.beachfront() == null) {
                String str2 = this.f22513saneness;
                if (str2 != null ? str2.equals(installationResponse.dern()) : installationResponse.dern() == null) {
                    String str3 = this.f22511dern;
                    if (str3 != null ? str3.equals(installationResponse.wireman()) : installationResponse.wireman() == null) {
                        TokenResult tokenResult = this.f22514wireman;
                        if (tokenResult != null ? tokenResult.equals(installationResponse.saneness()) : installationResponse.saneness() == null) {
                            InstallationResponse.ResponseCode responseCode = this.f22512marial;
                            if (responseCode != null ? responseCode.equals(installationResponse.marial()) : installationResponse.marial() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f22510attabal;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f22513saneness;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f22511dern;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f22514wireman;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f22512marial;
        return iHashCode4 ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.ResponseCode marial() {
        return this.f22512marial;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public TokenResult saneness() {
        return this.f22514wireman;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f22510attabal + ", fid=" + this.f22513saneness + ", refreshToken=" + this.f22511dern + ", authToken=" + this.f22514wireman + ", responseCode=" + this.f22512marial + "}";
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String wireman() {
        return this.f22511dern;
    }

    public attabal(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f22510attabal = str;
        this.f22513saneness = str2;
        this.f22511dern = str3;
        this.f22514wireman = tokenResult;
        this.f22512marial = responseCode;
    }
}
