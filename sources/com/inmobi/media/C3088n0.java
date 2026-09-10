package com.inmobi.media;

import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3088n0 {
    public final String a;
    public final Map b;
    public final long c;
    public final String d;
    public final String e;
    public final Map f;
    public final String g;
    public final boolean h;

    public C3088n0(String clientRequestId, Map map, long j, String monetizationContext, String str, Map map2, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(clientRequestId, "clientRequestId");
        Intrinsics.checkNotNullParameter("im", "integrationTypeString");
        Intrinsics.checkNotNullParameter(monetizationContext, "monetizationContext");
        Intrinsics.checkNotNullParameter("unifiedSdkJson", "adFormat");
        this.a = clientRequestId;
        this.b = map;
        this.c = j;
        this.d = monetizationContext;
        this.e = str;
        this.f = map2;
        this.g = str2;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3088n0)) {
            return false;
        }
        C3088n0 c3088n0 = (C3088n0) obj;
        return Intrinsics.wireman(this.a, c3088n0.a) && Intrinsics.wireman("im", "im") && Intrinsics.wireman(this.b, c3088n0.b) && this.c == c3088n0.c && Intrinsics.wireman(this.d, c3088n0.d) && Intrinsics.wireman(this.e, c3088n0.e) && Intrinsics.wireman("unifiedSdkJson", "unifiedSdkJson") && Intrinsics.wireman(this.f, c3088n0.f) && Intrinsics.wireman(this.g, c3088n0.g) && this.h == c3088n0.h && Intrinsics.wireman(null, null);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + 3364) * 31;
        Map map = this.b;
        int iHashCode2 = (this.d.hashCode() + ((Long.hashCode(this.c) + ((iHashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31;
        String str = this.e;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + 1309392464) * 31;
        Map map2 = this.f;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str2 = this.g;
        return (Boolean.hashCode(this.h) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        return "AdMetaData(clientRequestId=" + this.a + ", integrationTypeString=im, extras=" + this.b + ", imPlacementId=" + this.c + ", monetizationContext=" + this.d + ", adType=" + this.e + ", adFormat=unifiedSdkJson, adSpecificRequestParams=" + this.f + ", keywords=" + this.g + ", isApplicationMutedByPub=" + this.h + ", extraInfo=" + ((Object) null) + ")";
    }
}
