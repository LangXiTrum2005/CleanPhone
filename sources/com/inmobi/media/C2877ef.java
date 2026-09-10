package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2877ef {
    public final String a;
    public final String b;

    public C2877ef(String hyperId, String spHost) {
        Intrinsics.checkNotNullParameter(hyperId, "hyperId");
        Intrinsics.checkNotNullParameter("i6i", "sspId");
        Intrinsics.checkNotNullParameter(spHost, "spHost");
        Intrinsics.checkNotNullParameter("inmobi", "pubId");
        this.a = hyperId;
        this.b = spHost;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2877ef)) {
            return false;
        }
        C2877ef c2877ef = (C2877ef) obj;
        return Intrinsics.wireman(this.a, c2877ef.a) && Intrinsics.wireman("i6i", "i6i") && Intrinsics.wireman(this.b, c2877ef.b) && Intrinsics.wireman("inmobi", "inmobi");
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (((this.a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098;
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.a + ", sspId=i6i, spHost=" + this.b + ", pubId=inmobi)";
    }
}
