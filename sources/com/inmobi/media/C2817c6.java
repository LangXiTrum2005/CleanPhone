package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2817c6 {
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final long j;
    public String k;

    public C2817c6(int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, long j4, long j5) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2817c6)) {
            return false;
        }
        C2817c6 c2817c6 = (C2817c6) obj;
        return this.a == c2817c6.a && this.b == c2817c6.b && this.c == c2817c6.c && this.d == c2817c6.d && this.e == c2817c6.e && this.f == c2817c6.f && this.g == c2817c6.g && this.h == c2817c6.h && this.i == c2817c6.i && this.j == c2817c6.j;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((Long.hashCode(this.i) + AbstractC2906fi.a(this.h, AbstractC2906fi.a(this.g, AbstractC2906fi.a(this.f, AbstractC2906fi.a(this.e, (Long.hashCode(this.d) + ((Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.a + ", timeToLiveInSec=" + this.b + ", processingInterval=" + this.c + ", ingestionLatencyInSec=" + this.d + ", minBatchSizeWifi=" + this.e + ", maxBatchSizeWifi=" + this.f + ", minBatchSizeMobile=" + this.g + ", maxBatchSizeMobile=" + this.h + ", retryIntervalWifi=" + this.i + ", retryIntervalMobile=" + this.j + ")";
    }
}
