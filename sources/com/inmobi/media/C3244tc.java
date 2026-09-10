package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3244tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24012b;

    public C3244tc(int i2, int i3) {
        this.f24011a = i2;
        this.f24012b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3244tc)) {
            return false;
        }
        C3244tc c3244tc = (C3244tc) obj;
        return this.f24011a == c3244tc.f24011a && this.f24012b == c3244tc.f24012b && Double.compare(1.0d, 1.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(1.0d) + androidx.media3.extractor.text.ttml.a.a(this.f24012b, Integer.hashCode(this.f24011a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RetryPolicy(maxNoOfRetries=");
        sb.append(this.f24011a);
        sb.append(", delayInMillis=");
        return android.support.v4.media.a.i(this.f24012b, ", delayFactor=1.0)", sb);
    }
}
