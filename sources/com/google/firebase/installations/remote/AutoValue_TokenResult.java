package com.google.firebase.installations.remote;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TokenResult extends TokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TokenResult.ResponseCode f20883c;

    public static final class Builder extends TokenResult.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TokenResult.ResponseCode f20886c;
        public byte d;

        public final TokenResult a() {
            if (this.d == 1) {
                return new AutoValue_TokenResult(this.f20884a, this.f20885b, this.f20886c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }
    }

    public AutoValue_TokenResult(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f20881a = str;
        this.f20882b = j;
        this.f20883c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final TokenResult.ResponseCode a() {
        return this.f20883c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final String b() {
        return this.f20881a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public final long c() {
        return this.f20882b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f20881a;
        if (str == null) {
            if (tokenResult.b() != null) {
                return false;
            }
        } else if (!str.equals(tokenResult.b())) {
            return false;
        }
        if (this.f20882b != tokenResult.c()) {
            return false;
        }
        TokenResult.ResponseCode responseCode = this.f20883c;
        if (responseCode == null) {
            return tokenResult.a() == null;
        }
        return responseCode.equals(tokenResult.a());
    }

    public final int hashCode() {
        String str = this.f20881a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f20882b;
        int i2 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f20883c;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f20881a + ", tokenExpirationTimestamp=" + this.f20882b + ", responseCode=" + this.f20883c + "}";
    }
}
