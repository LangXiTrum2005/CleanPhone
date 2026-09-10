package com.google.android.datatransport.cct.internal;

import android.support.v4.media.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_LogEvent extends LogEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f16759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComplianceData f16760c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f16761e;
    public final String f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NetworkConnectionInfo f16762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExperimentIds f16763i;

    public static final class Builder extends LogEvent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f16764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f16765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ComplianceData f16766c;
        public Long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f16767e;
        public String f;
        public Long g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public NetworkConnectionInfo f16768h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ExperimentIds f16769i;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent a() {
            String strM = this.f16764a == null ? " eventTimeMs" : "";
            if (this.d == null) {
                strM = strM.concat(" eventUptimeMs");
            }
            if (this.g == null) {
                strM = a.m(strM, " timezoneOffsetSeconds");
            }
            if (strM.isEmpty()) {
                return new AutoValue_LogEvent(this.f16764a.longValue(), this.f16765b, this.f16766c, this.d.longValue(), this.f16767e, this.f, this.g.longValue(), this.f16768h, this.f16769i);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder b(ComplianceData complianceData) {
            this.f16766c = complianceData;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder c(Integer num) {
            this.f16765b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder d(long j) {
            this.f16764a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder e(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder f(ExperimentIds experimentIds) {
            this.f16769i = experimentIds;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder g(NetworkConnectionInfo networkConnectionInfo) {
            this.f16768h = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public final LogEvent.Builder h(long j) {
            this.g = Long.valueOf(j);
            return this;
        }
    }

    public AutoValue_LogEvent(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, ExperimentIds experimentIds) {
        this.f16758a = j;
        this.f16759b = num;
        this.f16760c = complianceData;
        this.d = j2;
        this.f16761e = bArr;
        this.f = str;
        this.g = j3;
        this.f16762h = networkConnectionInfo;
        this.f16763i = experimentIds;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final ComplianceData a() {
        return this.f16760c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final Integer b() {
        return this.f16759b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long c() {
        return this.f16758a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final ExperimentIds e() {
        return this.f16763i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f16758a != logEvent.c()) {
            return false;
        }
        Integer num = this.f16759b;
        if (num == null) {
            if (logEvent.b() != null) {
                return false;
            }
        } else if (!num.equals(logEvent.b())) {
            return false;
        }
        ComplianceData complianceData = this.f16760c;
        if (complianceData == null) {
            if (logEvent.a() != null) {
                return false;
            }
        } else if (!complianceData.equals(logEvent.a())) {
            return false;
        }
        if (this.d != logEvent.d()) {
            return false;
        }
        if (!Arrays.equals(this.f16761e, logEvent instanceof AutoValue_LogEvent ? ((AutoValue_LogEvent) logEvent).f16761e : logEvent.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (logEvent.h() != null) {
                return false;
            }
        } else if (!str.equals(logEvent.h())) {
            return false;
        }
        if (this.g != logEvent.i()) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = this.f16762h;
        if (networkConnectionInfo == null) {
            if (logEvent.f() != null) {
                return false;
            }
        } else if (!networkConnectionInfo.equals(logEvent.f())) {
            return false;
        }
        ExperimentIds experimentIds = this.f16763i;
        if (experimentIds == null) {
            return logEvent.e() == null;
        }
        return experimentIds.equals(logEvent.e());
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final NetworkConnectionInfo f() {
        return this.f16762h;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final byte[] g() {
        return this.f16761e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.f16758a;
        int i2 = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f16759b;
        int iHashCode = (i2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        ComplianceData complianceData = this.f16760c;
        int iHashCode2 = (iHashCode ^ (complianceData == null ? 0 : complianceData.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f16761e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i3 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f16762h;
        int iHashCode5 = (i3 ^ (networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode())) * 1000003;
        ExperimentIds experimentIds = this.f16763i;
        return iHashCode5 ^ (experimentIds != null ? experimentIds.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public final long i() {
        return this.g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f16758a + ", eventCode=" + this.f16759b + ", complianceData=" + this.f16760c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.f16761e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.f16762h + ", experimentIds=" + this.f16763i + "}";
    }
}
