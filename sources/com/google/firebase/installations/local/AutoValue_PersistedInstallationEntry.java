package com.google.firebase.installations.local;

import com.google.firebase.crashlytics.internal.model.a;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PersistedInstallation.RegistrationStatus f20859c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20860e;
    public final long f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20861h;

    public static final class Builder extends PersistedInstallationEntry.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PersistedInstallation.RegistrationStatus f20863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20864c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20865e;
        public long f;
        public String g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f20866h;

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry a() {
            if (this.f20866h == 3 && this.f20863b != null) {
                return new AutoValue_PersistedInstallationEntry(this.f20862a, this.f20863b, this.f20864c, this.d, this.f20865e, this.f, this.g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20863b == null) {
                sb.append(" registrationStatus");
            }
            if ((this.f20866h & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((this.f20866h & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder b(String str) {
            this.f20864c = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder c(long j) {
            this.f20865e = j;
            this.f20866h = (byte) (this.f20866h | 1);
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder d(String str) {
            this.f20862a = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder e(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder f(PersistedInstallation.RegistrationStatus registrationStatus) {
            if (registrationStatus == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f20863b = registrationStatus;
            return this;
        }

        @Override // com.google.firebase.installations.local.PersistedInstallationEntry.Builder
        public final PersistedInstallationEntry.Builder g(long j) {
            this.f = j;
            this.f20866h = (byte) (this.f20866h | 2);
            return this;
        }
    }

    public AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.f20858b = str;
        this.f20859c = registrationStatus;
        this.d = str2;
        this.f20860e = str3;
        this.f = j;
        this.g = j2;
        this.f20861h = str4;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String a() {
        return this.d;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long b() {
        return this.f;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String c() {
        return this.f20858b;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String d() {
        return this.f20861h;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final String e() {
        return this.f20860e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str = this.f20858b;
        if (str == null) {
            if (persistedInstallationEntry.c() != null) {
                return false;
            }
        } else if (!str.equals(persistedInstallationEntry.c())) {
            return false;
        }
        if (!this.f20859c.equals(persistedInstallationEntry.f())) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (persistedInstallationEntry.a() != null) {
                return false;
            }
        } else if (!str2.equals(persistedInstallationEntry.a())) {
            return false;
        }
        String str3 = this.f20860e;
        if (str3 == null) {
            if (persistedInstallationEntry.e() != null) {
                return false;
            }
        } else if (!str3.equals(persistedInstallationEntry.e())) {
            return false;
        }
        if (this.f != persistedInstallationEntry.b() || this.g != persistedInstallationEntry.g()) {
            return false;
        }
        String str4 = this.f20861h;
        if (str4 == null) {
            return persistedInstallationEntry.d() == null;
        }
        return str4.equals(persistedInstallationEntry.d());
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallation.RegistrationStatus f() {
        return this.f20859c;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final long g() {
        return this.g;
    }

    @Override // com.google.firebase.installations.local.PersistedInstallationEntry
    public final PersistedInstallationEntry.Builder h() {
        Builder builder = new Builder();
        builder.f20862a = c();
        builder.f20863b = f();
        builder.f20864c = a();
        builder.d = e();
        builder.f20865e = b();
        builder.f = g();
        builder.g = d();
        builder.f20866h = (byte) 3;
        return builder;
    }

    public final int hashCode() {
        String str = this.f20858b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f20859c.hashCode()) * 1000003;
        String str2 = this.d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20860e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int i2 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f20861h;
        return (str4 != null ? str4.hashCode() : 0) ^ i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f20858b);
        sb.append(", registrationStatus=");
        sb.append(this.f20859c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", refreshToken=");
        sb.append(this.f20860e);
        sb.append(", expiresInSecs=");
        sb.append(this.f);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.g);
        sb.append(", fisError=");
        return android.support.v4.media.a.r(sb, this.f20861h, "}");
    }
}
