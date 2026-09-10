package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f20669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20671c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20672e;
    public final long f;

    public static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f20673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f20675c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20676e;
        public long f;
        public byte g;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device a() {
            if (this.g == 31) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.f20673a, this.f20674b, this.f20675c, this.d, this.f20676e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder b(Double d) {
            this.f20673a = d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder c(int i2) {
            this.f20674b = i2;
            this.g = (byte) (this.g | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder d(long j) {
            this.f = j;
            this.g = (byte) (this.g | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder e(int i2) {
            this.d = i2;
            this.g = (byte) (this.g | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder f(boolean z2) {
            this.f20675c = z2;
            this.g = (byte) (this.g | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder
        public final CrashlyticsReport.Session.Event.Device.Builder g(long j) {
            this.f20676e = j;
            this.g = (byte) (this.g | 8);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Device(Double d, int i2, boolean z2, int i3, long j, long j2) {
        this.f20669a = d;
        this.f20670b = i2;
        this.f20671c = z2;
        this.d = i3;
        this.f20672e = j;
        this.f = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final Double b() {
        return this.f20669a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int c() {
        return this.f20670b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
        Double d = this.f20669a;
        if (d == null) {
            if (device.b() != null) {
                return false;
            }
        } else if (!d.equals(device.b())) {
            return false;
        }
        return this.f20670b == device.c() && this.f20671c == device.g() && this.d == device.e() && this.f20672e == device.f() && this.f == device.d();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final long f() {
        return this.f20672e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device
    public final boolean g() {
        return this.f20671c;
    }

    public final int hashCode() {
        Double d = this.f20669a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f20670b) * 1000003) ^ (this.f20671c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.f20672e;
        long j2 = this.f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.f20669a);
        sb.append(", batteryVelocity=");
        sb.append(this.f20670b);
        sb.append(", proximityOn=");
        sb.append(this.f20671c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.f20672e);
        sb.append(", diskUsed=");
        return android.support.v4.media.a.j(this.f, "}", sb);
    }
}
