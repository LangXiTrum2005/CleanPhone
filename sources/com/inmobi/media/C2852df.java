package com.inmobi.media;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2852df {
    public final Map a;

    public C2852df(Map requestParams) {
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2852df) && Intrinsics.wireman(this.a, ((C2852df) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.a + ")";
    }
}
