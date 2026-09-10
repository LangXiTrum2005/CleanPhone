package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3158pk {
    public final long a;
    public final long b;
    public final long c;

    public C3158pk(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3158pk)) {
            return false;
        }
        C3158pk c3158pk = (C3158pk) obj;
        return this.a == c3158pk.a && this.b == c3158pk.b && this.c == c3158pk.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "TimeoutConfig(connectTimeoutInSec=" + this.a + ", readTimeoutInSec=" + this.b + ", callTimeoutInSec=" + this.c + ")";
    }
}
