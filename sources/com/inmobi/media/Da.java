package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3338za f22779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22781c;
    public final long d;

    public Da(C3338za ping, int i2, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.f(ping, "ping");
        this.f22779a = ping;
        this.f22780b = i2;
        this.f22781c = str;
        this.d = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Da)) {
            return false;
        }
        Da da = (Da) obj;
        return Intrinsics.a(this.f22779a, da.f22779a) && this.f22780b == da.f22780b && Intrinsics.a(this.f22781c, da.f22781c) && this.d == da.d;
    }

    public final int hashCode() {
        int iA = androidx.media3.extractor.text.ttml.a.a(this.f22780b, this.f22779a.hashCode() * 31, 31);
        String str = this.f22781c;
        return Long.hashCode(this.d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PingResult(ping=");
        sb.append(this.f22779a);
        sb.append(", statusCode=");
        sb.append(this.f22780b);
        sb.append(", error=");
        sb.append(this.f22781c);
        sb.append(", timestamp=");
        return androidx.media3.extractor.text.ttml.a.o(sb, this.d, ')');
    }
}
