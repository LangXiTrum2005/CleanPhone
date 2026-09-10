package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3055he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23672c;

    public C3055he(long j, long j2, long j3) {
        this.f23670a = j;
        this.f23671b = j2;
        this.f23672c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3055he)) {
            return false;
        }
        C3055he c3055he = (C3055he) obj;
        return this.f23670a == c3055he.f23670a && this.f23671b == c3055he.f23671b && this.f23672c == c3055he.f23672c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23672c) + androidx.media3.extractor.text.ttml.a.b(Long.hashCode(this.f23670a) * 31, 31, this.f23671b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeoutConfig(connectTimeoutInSec=");
        sb.append(this.f23670a);
        sb.append(", readTimeoutInSec=");
        sb.append(this.f23671b);
        sb.append(", callTimeoutInSec=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.f23672c, ')');
    }
}
