package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_OperatingSystem extends CrashlyticsReport.Session.OperatingSystem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20694c;
    public final boolean d;

    public static final class Builder extends CrashlyticsReport.Session.OperatingSystem.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20697c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f20698e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem a() {
            String str;
            String str2;
            if (this.f20698e == 3 && (str = this.f20696b) != null && (str2 = this.f20697c) != null) {
                return new AutoValue_CrashlyticsReport_Session_OperatingSystem(str, this.f20695a, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f20698e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f20696b == null) {
                sb.append(" version");
            }
            if (this.f20697c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f20698e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f20697c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder c(boolean z2) {
            this.d = z2;
            this.f20698e = (byte) (this.f20698e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder d(int i2) {
            this.f20695a = i2;
            this.f20698e = (byte) (this.f20698e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder
        public final CrashlyticsReport.Session.OperatingSystem.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f20696b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_OperatingSystem(String str, int i2, String str2, boolean z2) {
        this.f20692a = i2;
        this.f20693b = str;
        this.f20694c = str2;
        this.d = z2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final String b() {
        return this.f20694c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final int c() {
        return this.f20692a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final String d() {
        return this.f20693b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.OperatingSystem)) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
        return this.f20692a == operatingSystem.c() && this.f20693b.equals(operatingSystem.d()) && this.f20694c.equals(operatingSystem.b()) && this.d == operatingSystem.e();
    }

    public final int hashCode() {
        return ((((((this.f20692a ^ 1000003) * 1000003) ^ this.f20693b.hashCode()) * 1000003) ^ this.f20694c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.f20692a);
        sb.append(", version=");
        sb.append(this.f20693b);
        sb.append(", buildVersion=");
        sb.append(this.f20694c);
        sb.append(", jailbroken=");
        return android.support.v4.media.a.t(sb, this.d, "}");
    }
}
