package com.google.firebase.installations;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20833c;

    public static final class Builder extends InstallationTokenResult.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f20835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f20836c;
    }

    public AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.f20831a = str;
        this.f20832b = j;
        this.f20833c = j2;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final String a() {
        return this.f20831a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long b() {
        return this.f20833c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public final long c() {
        return this.f20832b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        return this.f20831a.equals(installationTokenResult.a()) && this.f20832b == installationTokenResult.c() && this.f20833c == installationTokenResult.b();
    }

    public final int hashCode() {
        int iHashCode = (this.f20831a.hashCode() ^ 1000003) * 1000003;
        long j = this.f20832b;
        long j2 = this.f20833c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f20831a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f20832b);
        sb.append(", tokenCreationTimestamp=");
        return android.support.v4.media.a.j(this.f20833c, "}", sb);
    }
}
