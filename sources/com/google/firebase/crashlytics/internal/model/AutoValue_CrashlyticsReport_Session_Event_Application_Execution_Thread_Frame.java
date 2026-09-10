package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20656c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20657e;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20660c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20661e;
        public byte f;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame a() {
            String str;
            if (this.f == 7 && (str = this.f20659b) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(this.f20661e, this.f20658a, this.d, str, this.f20660c);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f20659b == null) {
                sb.append(" symbol");
            }
            if ((this.f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder b(String str) {
            this.f20660c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder c(int i2) {
            this.f20661e = i2;
            this.f = (byte) (this.f | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder d(long j) {
            this.d = j;
            this.f = (byte) (this.f | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder e(long j) {
            this.f20658a = j;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f20659b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(int i2, long j, long j2, String str, String str2) {
        this.f20654a = j;
        this.f20655b = str;
        this.f20656c = str2;
        this.d = j2;
        this.f20657e = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final String b() {
        return this.f20656c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final int c() {
        return this.f20657e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final long e() {
        return this.f20654a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (this.f20654a != frame.e() || !this.f20655b.equals(frame.f())) {
            return false;
        }
        String str = this.f20656c;
        if (str == null) {
            if (frame.b() != null) {
                return false;
            }
        } else if (!str.equals(frame.b())) {
            return false;
        }
        return this.d == frame.d() && this.f20657e == frame.c();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame
    public final String f() {
        return this.f20655b;
    }

    public final int hashCode() {
        long j = this.f20654a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f20655b.hashCode()) * 1000003;
        String str = this.f20656c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f20657e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f20654a);
        sb.append(", symbol=");
        sb.append(this.f20655b);
        sb.append(", file=");
        sb.append(this.f20656c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        return android.support.v4.media.a.i(this.f20657e, "}", sb);
    }
}
