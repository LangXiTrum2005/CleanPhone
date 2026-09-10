package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class X9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23346a;

    public X9(Map requestParams) {
        Intrinsics.f(requestParams, "requestParams");
        this.f23346a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X9) && Intrinsics.a(this.f23346a, ((X9) obj).f23346a);
    }

    public final int hashCode() {
        return this.f23346a.hashCode();
    }

    public final String toString() {
        return com.applovin.impl.Z.o(new StringBuilder("NovatiqAdData(requestParams="), this.f23346a, ')');
    }
}
