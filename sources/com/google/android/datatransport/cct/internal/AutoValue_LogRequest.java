package com.google.android.datatransport.cct.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_LogRequest extends LogRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClientInfo f16772c;
    public final Integer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16773e;
    public final ArrayList f;
    public final QosTier g;

    public static final class Builder extends LogRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f16774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f16775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ClientInfo f16776c;
        public Integer d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16777e;
        public ArrayList f;
        public QosTier g;

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest a() {
            String strConcat = this.f16774a == null ? " requestTimeMs" : "";
            if (this.f16775b == null) {
                strConcat = strConcat.concat(" requestUptimeMs");
            }
            if (strConcat.isEmpty()) {
                return new AutoValue_LogRequest(this.f16774a.longValue(), this.f16775b.longValue(), this.f16776c, this.d, this.f16777e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder b(ClientInfo clientInfo) {
            this.f16776c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder c(ArrayList arrayList) {
            this.f = arrayList;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder e(String str) {
            this.f16777e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder f() {
            this.g = QosTier.X;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder g(long j) {
            this.f16774a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public final LogRequest.Builder h(long j) {
            this.f16775b = Long.valueOf(j);
            return this;
        }
    }

    public AutoValue_LogRequest(long j, long j2, ClientInfo clientInfo, Integer num, String str, ArrayList arrayList, QosTier qosTier) {
        this.f16770a = j;
        this.f16771b = j2;
        this.f16772c = clientInfo;
        this.d = num;
        this.f16773e = str;
        this.f = arrayList;
        this.g = qosTier;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final ClientInfo b() {
        return this.f16772c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final List c() {
        return this.f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final Integer d() {
        return this.d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final String e() {
        return this.f16773e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f16770a != logRequest.g() || this.f16771b != logRequest.h()) {
            return false;
        }
        ClientInfo clientInfo = this.f16772c;
        if (clientInfo == null) {
            if (logRequest.b() != null) {
                return false;
            }
        } else if (!clientInfo.equals(logRequest.b())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (logRequest.d() != null) {
                return false;
            }
        } else if (!num.equals(logRequest.d())) {
            return false;
        }
        String str = this.f16773e;
        if (str == null) {
            if (logRequest.e() != null) {
                return false;
            }
        } else if (!str.equals(logRequest.e())) {
            return false;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            if (logRequest.c() != null) {
                return false;
            }
        } else if (!arrayList.equals(logRequest.c())) {
            return false;
        }
        QosTier qosTier = this.g;
        if (qosTier == null) {
            return logRequest.f() == null;
        }
        return qosTier.equals(logRequest.f());
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final QosTier f() {
        return this.g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long g() {
        return this.f16770a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public final long h() {
        return this.f16771b;
    }

    public final int hashCode() {
        long j = this.f16770a;
        long j2 = this.f16771b;
        int i2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f16772c;
        int iHashCode = (i2 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f16773e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f;
        int iHashCode4 = (iHashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        QosTier qosTier = this.g;
        return iHashCode4 ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f16770a + ", requestUptimeMs=" + this.f16771b + ", clientInfo=" + this.f16772c + ", logSource=" + this.d + ", logSourceName=" + this.f16773e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
