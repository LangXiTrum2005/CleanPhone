package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3067m4 {
    public final String a;
    public final Config b;

    public C3067m4(String url, Config availableConfig) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(availableConfig, "availableConfig");
        this.a = url;
        this.b = availableConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3067m4) && Intrinsics.wireman(this.b.getType(), ((C3067m4) obj).b.getType());
    }

    public final int hashCode() {
        return this.b.getType().hashCode();
    }
}
