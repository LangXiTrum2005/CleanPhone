package com.inmobi.media;

import kotlinx.coroutines.saran;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Dn {
    public final saran a;
    public final int b;

    public Dn(saran coroutineScope, int i) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dn)) {
            return false;
        }
        Dn dn = (Dn) obj;
        return Intrinsics.wireman(this.a, dn.a) && this.b == dn.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.a + ", impressionMinDuration=" + this.b + ")";
    }
}
