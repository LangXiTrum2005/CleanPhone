package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20570c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f20571e;
    public final boolean f;
    public final CrashlyticsReport.Session.Application g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CrashlyticsReport.Session.User f20572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CrashlyticsReport.Session.OperatingSystem f20573i;
    public final CrashlyticsReport.Session.Device j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20574l;

    public static final class Builder extends CrashlyticsReport.Session.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20577c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f20578e;
        public boolean f;
        public CrashlyticsReport.Session.Application g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CrashlyticsReport.Session.User f20579h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CrashlyticsReport.Session.OperatingSystem f20580i;
        public CrashlyticsReport.Session.Device j;
        public List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f20581l;
        public byte m;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session a() {
            String str;
            String str2;
            CrashlyticsReport.Session.Application application;
            if (this.m == 7 && (str = this.f20575a) != null && (str2 = this.f20576b) != null && (application = this.g) != null) {
                return new AutoValue_CrashlyticsReport_Session(str, str2, this.f20577c, this.d, this.f20578e, this.f, application, this.f20579h, this.f20580i, this.j, this.k, this.f20581l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f20575a == null) {
                sb.append(" generator");
            }
            if (this.f20576b == null) {
                sb.append(" identifier");
            }
            if ((this.m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.g == null) {
                sb.append(" app");
            }
            if ((this.m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder b(CrashlyticsReport.Session.Application application) {
            if (application == null) {
                throw new NullPointerException("Null app");
            }
            this.g = application;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder c(String str) {
            this.f20577c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder d(boolean z2) {
            this.f = z2;
            this.m = (byte) (this.m | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder e(CrashlyticsReport.Session.Device device) {
            this.j = device;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder f(Long l2) {
            this.f20578e = l2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder g(List list) {
            this.k = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f20575a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder i(int i2) {
            this.f20581l = i2;
            this.m = (byte) (this.m | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f20576b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder k(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f20580i = operatingSystem;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder l(long j) {
            this.d = j;
            this.m = (byte) (this.m | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder
        public final CrashlyticsReport.Session.Builder m(CrashlyticsReport.Session.User user) {
            this.f20579h = user;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j, Long l2, boolean z2, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device, List list, int i2) {
        this.f20568a = str;
        this.f20569b = str2;
        this.f20570c = str3;
        this.d = j;
        this.f20571e = l2;
        this.f = z2;
        this.g = application;
        this.f20572h = user;
        this.f20573i = operatingSystem;
        this.j = device;
        this.k = list;
        this.f20574l = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Application b() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String c() {
        return this.f20570c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Device d() {
        return this.j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final Long e() {
        return this.f20571e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (!this.f20568a.equals(session.g()) || !this.f20569b.equals(session.i())) {
            return false;
        }
        String str = this.f20570c;
        if (str == null) {
            if (session.c() != null) {
                return false;
            }
        } else if (!str.equals(session.c())) {
            return false;
        }
        if (this.d != session.k()) {
            return false;
        }
        Long l2 = this.f20571e;
        if (l2 == null) {
            if (session.e() != null) {
                return false;
            }
        } else if (!l2.equals(session.e())) {
            return false;
        }
        if (this.f != session.m() || !this.g.equals(session.b())) {
            return false;
        }
        CrashlyticsReport.Session.User user = this.f20572h;
        if (user == null) {
            if (session.l() != null) {
                return false;
            }
        } else if (!user.equals(session.l())) {
            return false;
        }
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f20573i;
        if (operatingSystem == null) {
            if (session.j() != null) {
                return false;
            }
        } else if (!operatingSystem.equals(session.j())) {
            return false;
        }
        CrashlyticsReport.Session.Device device = this.j;
        if (device == null) {
            if (session.d() != null) {
                return false;
            }
        } else if (!device.equals(session.d())) {
            return false;
        }
        List list = this.k;
        if (list == null) {
            if (session.f() != null) {
                return false;
            }
        } else if (!list.equals(session.f())) {
            return false;
        }
        return this.f20574l == session.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final List f() {
        return this.k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String g() {
        return this.f20568a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final int h() {
        return this.f20574l;
    }

    public final int hashCode() {
        int iHashCode = (((this.f20568a.hashCode() ^ 1000003) * 1000003) ^ this.f20569b.hashCode()) * 1000003;
        String str = this.f20570c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i2 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l2 = this.f20571e;
        int iHashCode3 = (((((i2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        CrashlyticsReport.Session.User user = this.f20572h;
        int iHashCode4 = (iHashCode3 ^ (user == null ? 0 : user.hashCode())) * 1000003;
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f20573i;
        int iHashCode5 = (iHashCode4 ^ (operatingSystem == null ? 0 : operatingSystem.hashCode())) * 1000003;
        CrashlyticsReport.Session.Device device = this.j;
        int iHashCode6 = (iHashCode5 ^ (device == null ? 0 : device.hashCode())) * 1000003;
        List list = this.k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f20574l;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final String i() {
        return this.f20569b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.OperatingSystem j() {
        return this.f20573i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final long k() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.User l() {
        return this.f20572h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final boolean m() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session
    public final CrashlyticsReport.Session.Builder n() {
        Builder builder = new Builder();
        builder.f20575a = g();
        builder.f20576b = i();
        builder.f20577c = c();
        builder.d = k();
        builder.f20578e = e();
        builder.f = m();
        builder.g = b();
        builder.f20579h = l();
        builder.f20580i = j();
        builder.j = d();
        builder.k = f();
        builder.f20581l = h();
        builder.m = (byte) 7;
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.f20568a);
        sb.append(", identifier=");
        sb.append(this.f20569b);
        sb.append(", appQualitySessionId=");
        sb.append(this.f20570c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.f20571e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.f20572h);
        sb.append(", os=");
        sb.append(this.f20573i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return android.support.v4.media.a.i(this.f20574l, "}", sb);
    }
}
