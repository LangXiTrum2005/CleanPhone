package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Config f23150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N2 f23151b;

    public S2(Config config, N2 n2) {
        Intrinsics.f(config, "config");
        this.f23150a = config;
        this.f23151b = n2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S2)) {
            return false;
        }
        S2 s2 = (S2) obj;
        return Intrinsics.a(this.f23150a, s2.f23150a) && Intrinsics.a(this.f23151b, s2.f23151b);
    }

    public final int hashCode() {
        int iHashCode = this.f23150a.hashCode() * 31;
        N2 n2 = this.f23151b;
        return iHashCode + (n2 == null ? 0 : n2.hashCode());
    }

    public final String toString() {
        return "ConfigFetchInputs(config=" + this.f23150a + ", listener=" + this.f23151b + ')';
    }
}
