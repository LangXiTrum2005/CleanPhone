package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo extends CrashlyticsReport.ApplicationExitInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20540c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20541e;
    public final long f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f20543i;

    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20546c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20547e;
        public long f;
        public long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f20548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f20549i;
        public byte j;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo a() {
            String str;
            if (this.j == 63 && (str = this.f20545b) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo(this.f20544a, str, this.f20546c, this.d, this.f20547e, this.f, this.g, this.f20548h, this.f20549i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f20545b == null) {
                sb.append(" processName");
            }
            if ((this.j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException(a.m(sb, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder b(List list) {
            this.f20549i = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder c(int i2) {
            this.d = i2;
            this.j = (byte) (this.j | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder d(int i2) {
            this.f20544a = i2;
            this.j = (byte) (this.j | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f20545b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder f(long j) {
            this.f20547e = j;
            this.j = (byte) (this.j | 8);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder g(int i2) {
            this.f20546c = i2;
            this.j = (byte) (this.j | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder h(long j) {
            this.f = j;
            this.j = (byte) (this.j | 16);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder i(long j) {
            this.g = j;
            this.j = (byte) (this.j | 32);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder
        public final CrashlyticsReport.ApplicationExitInfo.Builder j(String str) {
            this.f20548h = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo(int i2, String str, int i3, int i4, long j, long j2, long j3, String str2, List list) {
        this.f20538a = i2;
        this.f20539b = str;
        this.f20540c = i3;
        this.d = i4;
        this.f20541e = j;
        this.f = j2;
        this.g = j3;
        this.f20542h = str2;
        this.f20543i = list;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final List b() {
        return this.f20543i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int d() {
        return this.f20538a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final String e() {
        return this.f20539b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        if (this.f20538a != applicationExitInfo.d() || !this.f20539b.equals(applicationExitInfo.e()) || this.f20540c != applicationExitInfo.g() || this.d != applicationExitInfo.c() || this.f20541e != applicationExitInfo.f() || this.f != applicationExitInfo.h() || this.g != applicationExitInfo.i()) {
            return false;
        }
        String str = this.f20542h;
        if (str == null) {
            if (applicationExitInfo.j() != null) {
                return false;
            }
        } else if (!str.equals(applicationExitInfo.j())) {
            return false;
        }
        List list = this.f20543i;
        if (list == null) {
            return applicationExitInfo.b() == null;
        }
        return list.equals(applicationExitInfo.b());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long f() {
        return this.f20541e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final int g() {
        return this.f20540c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long h() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f20538a ^ 1000003) * 1000003) ^ this.f20539b.hashCode()) * 1000003) ^ this.f20540c) * 1000003) ^ this.d) * 1000003;
        long j = this.f20541e;
        int i2 = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i4 = (i3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f20542h;
        int iHashCode2 = (i4 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f20543i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final long i() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo
    public final String j() {
        return this.f20542h;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f20538a + ", processName=" + this.f20539b + ", reasonCode=" + this.f20540c + ", importance=" + this.d + ", pss=" + this.f20541e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.f20542h + ", buildIdMappingForArch=" + this.f20543i + "}";
    }
}
