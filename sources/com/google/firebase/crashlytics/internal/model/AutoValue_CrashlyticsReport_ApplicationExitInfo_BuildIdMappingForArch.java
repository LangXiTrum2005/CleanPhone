package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20552c;

    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20555c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch a() {
            String str;
            String str2;
            String str3 = this.f20553a;
            if (str3 != null && (str = this.f20554b) != null && (str2 = this.f20555c) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20553a == null) {
                sb.append(" arch");
            }
            if (this.f20554b == null) {
                sb.append(" libraryName");
            }
            if (this.f20555c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f20553a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f20555c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f20554b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String str, String str2, String str3) {
        this.f20550a = str;
        this.f20551b = str2;
        this.f20552c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String b() {
        return this.f20550a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String c() {
        return this.f20552c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String d() {
        return this.f20551b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        return this.f20550a.equals(buildIdMappingForArch.b()) && this.f20551b.equals(buildIdMappingForArch.d()) && this.f20552c.equals(buildIdMappingForArch.c());
    }

    public final int hashCode() {
        return ((((this.f20550a.hashCode() ^ 1000003) * 1000003) ^ this.f20551b.hashCode()) * 1000003) ^ this.f20552c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f20550a);
        sb.append(", libraryName=");
        sb.append(this.f20551b);
        sb.append(", buildId=");
        return android.support.v4.media.a.r(sb, this.f20552c, "}");
    }
}
