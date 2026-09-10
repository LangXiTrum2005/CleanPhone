package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal extends CrashlyticsReport.Session.Event.Application.Execution.Signal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20644c;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f20647c;
        public byte d;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal a() {
            String str;
            String str2;
            if (this.d == 1 && (str = this.f20645a) != null && (str2 = this.f20646b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(str, str2, this.f20647c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20645a == null) {
                sb.append(" name");
            }
            if (this.f20646b == null) {
                sb.append(" code");
            }
            if ((1 & this.d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder b(long j) {
            this.f20647c = j;
            this.d = (byte) (this.d | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f20646b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f20645a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal(String str, String str2, long j) {
        this.f20642a = str;
        this.f20643b = str2;
        this.f20644c = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final long b() {
        return this.f20644c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final String c() {
        return this.f20643b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal
    public final String d() {
        return this.f20642a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Signal)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        return this.f20642a.equals(signal.d()) && this.f20643b.equals(signal.c()) && this.f20644c == signal.b();
    }

    public final int hashCode() {
        int iHashCode = (((this.f20642a.hashCode() ^ 1000003) * 1000003) ^ this.f20643b.hashCode()) * 1000003;
        long j = this.f20644c;
        return iHashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f20642a);
        sb.append(", code=");
        sb.append(this.f20643b);
        sb.append(", address=");
        return android.support.v4.media.a.j(this.f20644c, "}", sb);
    }
}
