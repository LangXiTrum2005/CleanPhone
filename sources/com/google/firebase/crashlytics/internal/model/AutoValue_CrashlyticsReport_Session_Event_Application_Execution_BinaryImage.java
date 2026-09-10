package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20629c;
    public final String d;

    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f20631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20632c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f20633e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage a() {
            String str;
            if (this.f20633e == 3 && (str = this.f20632c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(str, this.d, this.f20630a, this.f20631b);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f20633e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f20633e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f20632c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder b(long j) {
            this.f20630a = j;
            this.f20633e = (byte) (this.f20633e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f20632c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder d(long j) {
            this.f20631b = j;
            this.f20633e = (byte) (this.f20633e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder e(String str) {
            this.d = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(String str, String str2, long j, long j2) {
        this.f20627a = j;
        this.f20628b = j2;
        this.f20629c = str;
        this.d = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long b() {
        return this.f20627a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final String c() {
        return this.f20629c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long d() {
        return this.f20628b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.f20627a != binaryImage.b() || this.f20628b != binaryImage.d() || !this.f20629c.equals(binaryImage.c())) {
            return false;
        }
        String str = this.d;
        if (str == null) {
            return binaryImage.e() == null;
        }
        return str.equals(binaryImage.e());
    }

    public final int hashCode() {
        long j = this.f20627a;
        long j2 = this.f20628b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f20629c.hashCode()) * 1000003;
        String str = this.d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f20627a);
        sb.append(", size=");
        sb.append(this.f20628b);
        sb.append(", name=");
        sb.append(this.f20629c);
        sb.append(", uuid=");
        return android.support.v4.media.a.r(sb, this.d, "}");
    }
}
