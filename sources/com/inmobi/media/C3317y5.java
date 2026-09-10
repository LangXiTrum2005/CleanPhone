package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3317y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2932a7 f24118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f24119b;

    public C3317y5(EnumC2932a7 logLevel, double d) {
        Intrinsics.f(logLevel, "logLevel");
        this.f24118a = logLevel;
        this.f24119b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3317y5)) {
            return false;
        }
        C3317y5 c3317y5 = (C3317y5) obj;
        return this.f24118a == c3317y5.f24118a && Double.compare(this.f24119b, c3317y5.f24119b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f24119b) + (this.f24118a.hashCode() * 31);
    }

    public final String toString() {
        return "LoggerConfiguration(logLevel=" + this.f24118a + ", samplingFactor=" + this.f24119b + ')';
    }
}
