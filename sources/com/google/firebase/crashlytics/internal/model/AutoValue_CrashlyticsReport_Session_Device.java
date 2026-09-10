package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Device extends CrashlyticsReport.Session.Device {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20592c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20593e;
    public final boolean f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20595i;

    public static final class Builder extends CrashlyticsReport.Session.Device.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20598c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20599e;
        public boolean f;
        public int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f20600h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f20601i;
        public byte j;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device a() {
            String str;
            String str2;
            String str3;
            if (this.j == 63 && (str = this.f20597b) != null && (str2 = this.f20600h) != null && (str3 = this.f20601i) != null) {
                return new AutoValue_CrashlyticsReport_Session_Device(this.f20596a, str, this.f20598c, this.d, this.f20599e, this.f, this.g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f20597b == null) {
                sb.append(" model");
            }
            if ((this.j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f20600h == null) {
                sb.append(" manufacturer");
            }
            if (this.f20601i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder b(int i2) {
            this.f20596a = i2;
            this.j = (byte) (this.j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder c(int i2) {
            this.f20598c = i2;
            this.j = (byte) (this.j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder d(long j) {
            this.f20599e = j;
            this.j = (byte) (this.j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f20600h = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f20597b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f20601i = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder h(long j) {
            this.d = j;
            this.j = (byte) (this.j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder i(boolean z2) {
            this.f = z2;
            this.j = (byte) (this.j | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder
        public final CrashlyticsReport.Session.Device.Builder j(int i2) {
            this.g = i2;
            this.j = (byte) (this.j | 32);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Device(int i2, String str, int i3, long j, long j2, boolean z2, int i4, String str2, String str3) {
        this.f20590a = i2;
        this.f20591b = str;
        this.f20592c = i3;
        this.d = j;
        this.f20593e = j2;
        this.f = z2;
        this.g = i4;
        this.f20594h = str2;
        this.f20595i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int b() {
        return this.f20590a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int c() {
        return this.f20592c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final long d() {
        return this.f20593e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String e() {
        return this.f20594h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        return this.f20590a == device.b() && this.f20591b.equals(device.f()) && this.f20592c == device.c() && this.d == device.h() && this.f20593e == device.d() && this.f == device.j() && this.g == device.i() && this.f20594h.equals(device.e()) && this.f20595i.equals(device.g());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String f() {
        return this.f20591b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final String g() {
        return this.f20595i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final long h() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f20590a ^ 1000003) * 1000003) ^ this.f20591b.hashCode()) * 1000003) ^ this.f20592c) * 1000003;
        long j = this.d;
        int i2 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f20593e;
        return ((((((((i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.f20594h.hashCode()) * 1000003) ^ this.f20595i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final int i() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f20590a);
        sb.append(", model=");
        sb.append(this.f20591b);
        sb.append(", cores=");
        sb.append(this.f20592c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.f20593e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.f20594h);
        sb.append(", modelClass=");
        return android.support.v4.media.a.r(sb, this.f20595i, "}");
    }
}
