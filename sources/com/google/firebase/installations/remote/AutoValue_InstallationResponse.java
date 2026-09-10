package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_InstallationResponse extends InstallationResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20876c;
    public final TokenResult d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InstallationResponse.ResponseCode f20877e;

    public static final class Builder extends InstallationResponse.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20879b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20880c;
        public TokenResult d;
    }

    public AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f20874a = str;
        this.f20875b = str2;
        this.f20876c = str3;
        this.d = tokenResult;
        this.f20877e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final TokenResult a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String b() {
        return this.f20875b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String c() {
        return this.f20876c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final InstallationResponse.ResponseCode d() {
        return this.f20877e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public final String e() {
        return this.f20874a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f20874a;
        if (str == null) {
            if (installationResponse.e() != null) {
                return false;
            }
        } else if (!str.equals(installationResponse.e())) {
            return false;
        }
        String str2 = this.f20875b;
        if (str2 == null) {
            if (installationResponse.b() != null) {
                return false;
            }
        } else if (!str2.equals(installationResponse.b())) {
            return false;
        }
        String str3 = this.f20876c;
        if (str3 == null) {
            if (installationResponse.c() != null) {
                return false;
            }
        } else if (!str3.equals(installationResponse.c())) {
            return false;
        }
        TokenResult tokenResult = this.d;
        if (tokenResult == null) {
            if (installationResponse.a() != null) {
                return false;
            }
        } else if (!tokenResult.equals(installationResponse.a())) {
            return false;
        }
        InstallationResponse.ResponseCode responseCode = this.f20877e;
        if (responseCode == null) {
            return installationResponse.d() == null;
        }
        return responseCode.equals(installationResponse.d());
    }

    public final int hashCode() {
        String str = this.f20874a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f20875b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20876c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.d;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f20877e;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f20874a + ", fid=" + this.f20875b + ", refreshToken=" + this.f20876c + ", authToken=" + this.d + ", responseCode=" + this.f20877e + "}";
    }
}
