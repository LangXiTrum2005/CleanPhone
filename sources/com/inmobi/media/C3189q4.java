package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3189q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23917c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23918e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23920i;
    public final long j;
    public String k;

    public C3189q4(int i2, long j, long j2, long j3, int i3, int i4, int i5, int i6, long j4, long j5) {
        this.f23915a = i2;
        this.f23916b = j;
        this.f23917c = j2;
        this.d = j3;
        this.f23918e = i3;
        this.f = i4;
        this.g = i5;
        this.f23919h = i6;
        this.f23920i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3189q4)) {
            return false;
        }
        C3189q4 c3189q4 = (C3189q4) obj;
        return this.f23915a == c3189q4.f23915a && this.f23916b == c3189q4.f23916b && this.f23917c == c3189q4.f23917c && this.d == c3189q4.d && this.f23918e == c3189q4.f23918e && this.f == c3189q4.f && this.g == c3189q4.g && this.f23919h == c3189q4.f23919h && this.f23920i == c3189q4.f23920i && this.j == c3189q4.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.a(this.f23919h, androidx.media3.extractor.text.ttml.a.a(this.g, androidx.media3.extractor.text.ttml.a.a(this.f, androidx.media3.extractor.text.ttml.a.a(this.f23918e, androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.b(androidx.media3.extractor.text.ttml.a.b(Integer.hashCode(this.f23915a) * 31, 31, this.f23916b), 31, this.f23917c), 31, this.d), 31), 31), 31), 31), 31, this.f23920i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventConfig(maxRetryCount=");
        sb.append(this.f23915a);
        sb.append(", timeToLiveInSec=");
        sb.append(this.f23916b);
        sb.append(", processingInterval=");
        sb.append(this.f23917c);
        sb.append(", ingestionLatencyInSec=");
        sb.append(this.d);
        sb.append(", minBatchSizeWifi=");
        sb.append(this.f23918e);
        sb.append(", maxBatchSizeWifi=");
        sb.append(this.f);
        sb.append(", minBatchSizeMobile=");
        sb.append(this.g);
        sb.append(", maxBatchSizeMobile=");
        sb.append(this.f23919h);
        sb.append(", retryIntervalWifi=");
        sb.append(this.f23920i);
        sb.append(", retryIntervalMobile=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.j, ')');
    }
}
