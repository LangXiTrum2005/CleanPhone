package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3009jl {
    public final int a;
    public final Config b;

    public C3009jl(int i, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = i;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3009jl)) {
            return false;
        }
        C3009jl c3009jl = (C3009jl) obj;
        return this.a == c3009jl.a && Intrinsics.wireman(this.b, c3009jl.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.a + ", config=" + this.b + ")";
    }
}
