package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Application f20604c;
    public final CrashlyticsReport.Session.Event.Device d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.Log f20605e;
    public final CrashlyticsReport.Session.Event.RolloutsState f;

    public static final class Builder extends CrashlyticsReport.Session.Event.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Application f20608c;
        public CrashlyticsReport.Session.Event.Device d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.Log f20609e;
        public CrashlyticsReport.Session.Event.RolloutsState f;
        public byte g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event a() {
            String str;
            CrashlyticsReport.Session.Event.Application application;
            CrashlyticsReport.Session.Event.Device device;
            if (this.g == 1 && (str = this.f20607b) != null && (application = this.f20608c) != null && (device = this.d) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.f20606a, str, application, device, this.f20609e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f20607b == null) {
                sb.append(" type");
            }
            if (this.f20608c == null) {
                sb.append(" app");
            }
            if (this.d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder b(CrashlyticsReport.Session.Event.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.f20608c = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder c(CrashlyticsReport.Session.Event.Device device) {
            if (device == null) {
                throw new NullPointerException("Null device");
            }
            this.d = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder d(CrashlyticsReport.Session.Event.Log log) {
            this.f20609e = log;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder e(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.f = rolloutsState;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder f(long j) {
            this.f20606a = j;
            this.g = (byte) (this.g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder
        public final CrashlyticsReport.Session.Event.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f20607b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device, CrashlyticsReport.Session.Event.Log log, CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.f20602a = j;
        this.f20603b = str;
        this.f20604c = application;
        this.d = device;
        this.f20605e = log;
        this.f = rolloutsState;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Application b() {
        return this.f20604c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Device c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Log d() {
        return this.f20605e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.RolloutsState e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.f20602a != event.f() || !this.f20603b.equals(event.g()) || !this.f20604c.equals(event.b()) || !this.d.equals(event.c())) {
            return false;
        }
        CrashlyticsReport.Session.Event.Log log = this.f20605e;
        if (log == null) {
            if (event.d() != null) {
                return false;
            }
        } else if (!log.equals(event.d())) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f;
        if (rolloutsState == null) {
            return event.e() == null;
        }
        return rolloutsState.equals(event.e());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final long f() {
        return this.f20602a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final String g() {
        return this.f20603b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event
    public final CrashlyticsReport.Session.Event.Builder h() {
        Builder builder = new Builder();
        builder.f20606a = this.f20602a;
        builder.f20607b = this.f20603b;
        builder.f20608c = this.f20604c;
        builder.d = this.d;
        builder.f20609e = this.f20605e;
        builder.f = this.f;
        builder.g = (byte) 1;
        return builder;
    }

    public final int hashCode() {
        long j = this.f20602a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f20603b.hashCode()) * 1000003) ^ this.f20604c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        CrashlyticsReport.Session.Event.Log log = this.f20605e;
        int iHashCode2 = (iHashCode ^ (log == null ? 0 : log.hashCode())) * 1000003;
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.f;
        return iHashCode2 ^ (rolloutsState != null ? rolloutsState.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f20602a + ", type=" + this.f20603b + ", app=" + this.f20604c + ", device=" + this.d + ", log=" + this.f20605e + ", rollouts=" + this.f + "}";
    }
}
