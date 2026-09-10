package com.chartboost.sdk.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14790c;

    public og(long j, long j2, long j3) {
        this.f14788a = j;
        this.f14789b = j2;
        this.f14790c = j3;
    }

    public final long a() {
        return this.f14788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og)) {
            return false;
        }
        og ogVar = (og) obj;
        return this.f14788a == ogVar.f14788a && this.f14789b == ogVar.f14789b && this.f14790c == ogVar.f14790c;
    }

    public int hashCode() {
        return Long.hashCode(this.f14790c) + androidx.media3.extractor.text.ttml.a.b(Long.hashCode(this.f14788a) * 31, 31, this.f14789b);
    }

    public String toString() {
        long j = this.f14788a;
        long j2 = this.f14789b;
        long j3 = this.f14790c;
        StringBuilder sbV = android.support.v4.media.a.v(j, "TimeSourceBodyFields(currentTimeMillis=", ", nanoTime=");
        sbV.append(j2);
        sbV.append(", uptimeMillis=");
        sbV.append(j3);
        sbV.append(")");
        return sbV.toString();
    }
}
