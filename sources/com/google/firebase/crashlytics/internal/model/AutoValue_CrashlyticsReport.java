package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport extends CrashlyticsReport {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20526c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20527e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20529i;
    public final String j;
    public final CrashlyticsReport.Session k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CrashlyticsReport.FilesPayload f20530l;
    public final CrashlyticsReport.ApplicationExitInfo m;

    public static final class Builder extends CrashlyticsReport.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20533c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20534e;
        public String f;
        public String g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f20535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f20536i;
        public CrashlyticsReport.Session j;
        public CrashlyticsReport.FilesPayload k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CrashlyticsReport.ApplicationExitInfo f20537l;
        public byte m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport a() {
            if (this.m == 1 && this.f20531a != null && this.f20532b != null && this.d != null && this.f20535h != null && this.f20536i != null) {
                return new AutoValue_CrashlyticsReport(this.f20531a, this.f20532b, this.f20533c, this.d, this.f20534e, this.f, this.g, this.f20535h, this.f20536i, this.j, this.k, this.f20537l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20531a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f20532b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.m) == 0) {
                sb.append(" platform");
            }
            if (this.d == null) {
                sb.append(" installationUuid");
            }
            if (this.f20535h == null) {
                sb.append(" buildVersion");
            }
            if (this.f20536i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder b(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.f20537l = applicationExitInfo;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder c(String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f20535h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f20536i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder f(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder g(String str) {
            this.f20534e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f20532b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder j(CrashlyticsReport.FilesPayload filesPayload) {
            this.k = filesPayload;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder k(int i2) {
            this.f20533c = i2;
            this.m = (byte) (this.m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f20531a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder
        public final CrashlyticsReport.Builder m(CrashlyticsReport.Session session) {
            this.j = session;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, CrashlyticsReport.Session session, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.f20525b = str;
        this.f20526c = str2;
        this.d = i2;
        this.f20527e = str3;
        this.f = str4;
        this.g = str5;
        this.f20528h = str6;
        this.f20529i = str7;
        this.j = str8;
        this.k = session;
        this.f20530l = filesPayload;
        this.m = applicationExitInfo;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.ApplicationExitInfo b() {
        return this.m;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String c() {
        return this.f20528h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String d() {
        return this.f20529i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (!this.f20525b.equals(crashlyticsReport.l()) || !this.f20526c.equals(crashlyticsReport.h()) || this.d != crashlyticsReport.k() || !this.f20527e.equals(crashlyticsReport.i())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (crashlyticsReport.g() != null) {
                return false;
            }
        } else if (!str.equals(crashlyticsReport.g())) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (crashlyticsReport.f() != null) {
                return false;
            }
        } else if (!str2.equals(crashlyticsReport.f())) {
            return false;
        }
        String str3 = this.f20528h;
        if (str3 == null) {
            if (crashlyticsReport.c() != null) {
                return false;
            }
        } else if (!str3.equals(crashlyticsReport.c())) {
            return false;
        }
        if (!this.f20529i.equals(crashlyticsReport.d()) || !this.j.equals(crashlyticsReport.e())) {
            return false;
        }
        CrashlyticsReport.Session session = this.k;
        if (session == null) {
            if (crashlyticsReport.m() != null) {
                return false;
            }
        } else if (!session.equals(crashlyticsReport.m())) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = this.f20530l;
        if (filesPayload == null) {
            if (crashlyticsReport.j() != null) {
                return false;
            }
        } else if (!filesPayload.equals(crashlyticsReport.j())) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.m;
        if (applicationExitInfo == null) {
            return crashlyticsReport.b() == null;
        }
        return applicationExitInfo.equals(crashlyticsReport.b());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String f() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String g() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String h() {
        return this.f20526c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f20525b.hashCode() ^ 1000003) * 1000003) ^ this.f20526c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f20527e.hashCode()) * 1000003;
        String str = this.f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20528h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f20529i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        CrashlyticsReport.Session session = this.k;
        int iHashCode5 = (iHashCode4 ^ (session == null ? 0 : session.hashCode())) * 1000003;
        CrashlyticsReport.FilesPayload filesPayload = this.f20530l;
        int iHashCode6 = (iHashCode5 ^ (filesPayload == null ? 0 : filesPayload.hashCode())) * 1000003;
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.m;
        return iHashCode6 ^ (applicationExitInfo != null ? applicationExitInfo.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String i() {
        return this.f20527e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.FilesPayload j() {
        return this.f20530l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final int k() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final String l() {
        return this.f20525b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Session m() {
        return this.k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public final CrashlyticsReport.Builder n() {
        Builder builder = new Builder();
        builder.f20531a = l();
        builder.f20532b = h();
        builder.f20533c = k();
        builder.d = i();
        builder.f20534e = g();
        builder.f = f();
        builder.g = c();
        builder.f20535h = d();
        builder.f20536i = e();
        builder.j = m();
        builder.k = j();
        builder.f20537l = b();
        builder.m = (byte) 1;
        return builder;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f20525b + ", gmpAppId=" + this.f20526c + ", platform=" + this.d + ", installationUuid=" + this.f20527e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.f20528h + ", buildVersion=" + this.f20529i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.f20530l + ", appExitInfo=" + this.m + "}";
    }
}
