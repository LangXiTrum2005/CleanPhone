package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20664c;
    public final boolean d;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20667c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f20668e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails a() {
            String str;
            if (this.f20668e == 7 && (str = this.f20665a) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(str, this.f20666b, this.f20667c, this.d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20665a == null) {
                sb.append(" processName");
            }
            if ((this.f20668e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f20668e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f20668e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder b(boolean z2) {
            this.d = z2;
            this.f20668e = (byte) (this.f20668e | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder c(int i2) {
            this.f20667c = i2;
            this.f20668e = (byte) (this.f20668e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder d(int i2) {
            this.f20666b = i2;
            this.f20668e = (byte) (this.f20668e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder
        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f20665a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String str, int i2, int i3, boolean z2) {
        this.f20662a = str;
        this.f20663b = i2;
        this.f20664c = i3;
        this.d = z2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final int b() {
        return this.f20664c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final int c() {
        return this.f20663b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final String d() {
        return this.f20662a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        return this.f20662a.equals(processDetails.d()) && this.f20663b == processDetails.c() && this.f20664c == processDetails.b() && this.d == processDetails.e();
    }

    public final int hashCode() {
        return ((((((this.f20662a.hashCode() ^ 1000003) * 1000003) ^ this.f20663b) * 1000003) ^ this.f20664c) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.f20662a);
        sb.append(", pid=");
        sb.append(this.f20663b);
        sb.append(", importance=");
        sb.append(this.f20664c);
        sb.append(", defaultProcess=");
        return android.support.v4.media.a.t(sb, this.d, "}");
    }
}
