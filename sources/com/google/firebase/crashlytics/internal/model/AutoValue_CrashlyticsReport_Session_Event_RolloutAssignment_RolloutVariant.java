package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20687b;

    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20689b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant a() {
            String str;
            String str2 = this.f20688a;
            if (str2 != null && (str = this.f20689b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20688a == null) {
                sb.append(" rolloutId");
            }
            if (this.f20689b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f20688a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f20689b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String str, String str2) {
        this.f20686a = str;
        this.f20687b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    public final String b() {
        return this.f20686a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    public final String c() {
        return this.f20687b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
        return this.f20686a.equals(rolloutVariant.b()) && this.f20687b.equals(rolloutVariant.c());
    }

    public final int hashCode() {
        return ((this.f20686a.hashCode() ^ 1000003) * 1000003) ^ this.f20687b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f20686a);
        sb.append(", variantId=");
        return android.support.v4.media.a.r(sb, this.f20687b, "}");
    }
}
