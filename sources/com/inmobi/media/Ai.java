package com.inmobi.media;

/* JADX INFO: loaded from: classes3.dex */
public final class Ai {
    public final int a;
    public final long b;

    public Ai(int i, long j, int i2) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ai)) {
            return false;
        }
        Ai ai = (Ai) obj;
        return this.a == ai.a && this.b == ai.b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + ((Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "RetryPolicy(maxRetries=" + this.a + ", retryInterval=" + this.b + ", delayFactor=1.0)";
    }

    public Ai(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
