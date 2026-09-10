package com.inmobi.media;

import com.inmobi.commons.core.configs.SignalsConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2935aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SignalsConfig.NovatiqConfig f23442c;

    public C2935aa(String hyperId, String spHost, SignalsConfig.NovatiqConfig novatiqConfig) {
        Intrinsics.f(hyperId, "hyperId");
        Intrinsics.f(spHost, "spHost");
        Intrinsics.f(novatiqConfig, "novatiqConfig");
        this.f23440a = hyperId;
        this.f23441b = spHost;
        this.f23442c = novatiqConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2935aa)) {
            return false;
        }
        C2935aa c2935aa = (C2935aa) obj;
        return Intrinsics.a(this.f23440a, c2935aa.f23440a) && Intrinsics.a(this.f23441b, c2935aa.f23441b) && Intrinsics.a(this.f23442c, c2935aa.f23442c);
    }

    public final int hashCode() {
        return this.f23442c.hashCode() + ((((this.f23441b.hashCode() + (((this.f23440a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098) * 31);
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f23440a + ", sspId=i6i, spHost=" + this.f23441b + ", pubId=inmobi, novatiqConfig=" + this.f23442c + ')';
    }
}
