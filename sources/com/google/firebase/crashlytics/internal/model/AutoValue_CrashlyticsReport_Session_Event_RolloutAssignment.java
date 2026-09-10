package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f20679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20681c;
    public final long d;

    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f20682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20684c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f20685e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment a() {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
            String str;
            String str2;
            if (this.f20685e == 1 && (rolloutVariant = this.f20682a) != null && (str = this.f20683b) != null && (str2 = this.f20684c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(rolloutVariant, str, str2, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20682a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f20683b == null) {
                sb.append(" parameterKey");
            }
            if (this.f20684c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f20685e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f20683b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f20684c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder d(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f20682a = rolloutVariant;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder e(long j) {
            this.d = j;
            this.f20685e = (byte) (this.f20685e | 1);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j) {
        this.f20679a = rolloutVariant;
        this.f20680b = str;
        this.f20681c = str2;
        this.d = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final String b() {
        return this.f20680b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final String c() {
        return this.f20681c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant d() {
        return this.f20679a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        return this.f20679a.equals(rolloutAssignment.d()) && this.f20680b.equals(rolloutAssignment.b()) && this.f20681c.equals(rolloutAssignment.c()) && this.d == rolloutAssignment.e();
    }

    public final int hashCode() {
        int iHashCode = (((((this.f20679a.hashCode() ^ 1000003) * 1000003) ^ this.f20680b.hashCode()) * 1000003) ^ this.f20681c.hashCode()) * 1000003;
        long j = this.d;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f20679a);
        sb.append(", parameterKey=");
        sb.append(this.f20680b);
        sb.append(", parameterValue=");
        sb.append(this.f20681c);
        sb.append(", templateVersion=");
        return android.support.v4.media.a.j(this.d, "}", sb);
    }
}
