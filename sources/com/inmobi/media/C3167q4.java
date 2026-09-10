package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3167q4 extends AbstractC3142p4 {
    public final int a;
    public final Config b;

    public C3167q4(int i, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a = i;
        this.b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3167q4)) {
            return false;
        }
        C3167q4 c3167q4 = (C3167q4) obj;
        return this.a == c3167q4.a && Intrinsics.wireman(this.b, c3167q4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.a + ", config=" + this.b + ")";
    }
}
