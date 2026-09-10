package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Application extends CrashlyticsReport.Session.Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20584c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20585e;
    public final String f;

    public static final class Builder extends CrashlyticsReport.Session.Application.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20588c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20589e;
        public String f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application a() {
            String str;
            String str2 = this.f20586a;
            if (str2 != null && (str = this.f20587b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Application(str2, str, this.f20588c, this.d, this.f20589e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20586a == null) {
                sb.append(" identifier");
            }
            if (this.f20587b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder b(String str) {
            this.f20589e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder c(String str) {
            this.f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder d(String str) {
            this.f20588c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f20586a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder
        public final CrashlyticsReport.Session.Application.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f20587b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Application(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f20582a = str;
        this.f20583b = str2;
        this.f20584c = str3;
        this.d = str4;
        this.f20585e = str5;
        this.f = str6;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String b() {
        return this.f20585e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String c() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String d() {
        return this.f20584c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String e() {
        return this.f20582a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
        if (!this.f20582a.equals(application.e()) || !this.f20583b.equals(application.h())) {
            return false;
        }
        String str = this.f20584c;
        if (str == null) {
            if (application.d() != null) {
                return false;
            }
        } else if (!str.equals(application.d())) {
            return false;
        }
        if (application.g() != null) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (application.f() != null) {
                return false;
            }
        } else if (!str2.equals(application.f())) {
            return false;
        }
        String str3 = this.f20585e;
        if (str3 == null) {
            if (application.b() != null) {
                return false;
            }
        } else if (!str3.equals(application.b())) {
            return false;
        }
        String str4 = this.f;
        if (str4 == null) {
            return application.c() == null;
        }
        return str4.equals(application.c());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String f() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final CrashlyticsReport.Session.Application.Organization g() {
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application
    public final String h() {
        return this.f20583b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f20582a.hashCode() ^ 1000003) * 1000003) ^ this.f20583b.hashCode()) * 1000003;
        String str = this.f20584c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20585e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f20582a);
        sb.append(", version=");
        sb.append(this.f20583b);
        sb.append(", displayVersion=");
        sb.append(this.f20584c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.f20585e);
        sb.append(", developmentPlatformVersion=");
        return android.support.v4.media.a.r(sb, this.f, "}");
    }
}
