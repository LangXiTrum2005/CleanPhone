package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20557b;

    public static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20559b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute a() {
            String str;
            String str2 = this.f20558a;
            if (str2 != null && (str = this.f20559b) != null) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20558a == null) {
                sb.append(" key");
            }
            if (this.f20559b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f20558a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f20559b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.f20556a = str;
        this.f20557b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public final String b() {
        return this.f20556a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public final String c() {
        return this.f20557b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        return this.f20556a.equals(customAttribute.b()) && this.f20557b.equals(customAttribute.c());
    }

    public final int hashCode() {
        return ((this.f20556a.hashCode() ^ 1000003) * 1000003) ^ this.f20557b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f20556a);
        sb.append(", value=");
        return android.support.v4.media.a.r(sb, this.f20557b, "}");
    }
}
