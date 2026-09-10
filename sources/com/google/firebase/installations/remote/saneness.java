package com.google.firebase.installations.remote;

/* JADX INFO: compiled from: AutoValue_TokenResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends TokenResult {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f22525attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final TokenResult.ResponseCode f22526dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f22527saneness;

    /* JADX INFO: renamed from: com.google.firebase.installations.remote.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_TokenResult.java */
    public static final class C0326saneness extends TokenResult.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f22528attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public TokenResult.ResponseCode f22529dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Long f22530saneness;

        @Override // com.google.firebase.installations.remote.TokenResult.attabal
        public TokenResult attabal() {
            String str = "";
            if (this.f22530saneness == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new saneness(this.f22528attabal, this.f22530saneness.longValue(), this.f22529dern);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.attabal
        public TokenResult.attabal dern(String str) {
            this.f22528attabal = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.attabal
        public TokenResult.attabal saneness(TokenResult.ResponseCode responseCode) {
            this.f22529dern = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.attabal
        public TokenResult.attabal wireman(long j) {
            this.f22530saneness = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String dern() {
        return this.f22525attabal;
    }

    public boolean equals(Object obj) {
        TokenResult.ResponseCode responseCode;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TokenResult) {
            TokenResult tokenResult = (TokenResult) obj;
            String str = this.f22525attabal;
            if (str != null ? str.equals(tokenResult.dern()) : tokenResult.dern() == null) {
                if (this.f22527saneness == tokenResult.wireman() && ((responseCode = this.f22526dern) != null ? responseCode.equals(tokenResult.saneness()) : tokenResult.saneness() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f22525attabal;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f22527saneness;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f22526dern;
        return i ^ (responseCode != null ? responseCode.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.ResponseCode saneness() {
        return this.f22526dern;
    }

    public String toString() {
        return "TokenResult{token=" + this.f22525attabal + ", tokenExpirationTimestamp=" + this.f22527saneness + ", responseCode=" + this.f22526dern + "}";
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long wireman() {
        return this.f22527saneness;
    }

    public saneness(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f22525attabal = str;
        this.f22527saneness = j;
        this.f22526dern = responseCode;
    }
}
