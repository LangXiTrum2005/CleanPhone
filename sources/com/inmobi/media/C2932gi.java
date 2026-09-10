package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.InlineParams;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.gi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2932gi {
    public final C3287v0 a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final C3164q1 j;
    public final C3056li k;
    public final String l;
    public final InlineParams m;

    public C2932gi(C3287v0 placement, String markupType, String impressionId, String telemetryMetadataBlob, int i, String creativeType, String creativeId, boolean z, int i2, C3164q1 c3164q1, C3056li c3056li, String str, InlineParams inlineParams) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(telemetryMetadataBlob, "telemetryMetadataBlob");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        this.a = placement;
        this.b = markupType;
        this.c = impressionId;
        this.d = telemetryMetadataBlob;
        this.e = i;
        this.f = creativeType;
        this.g = creativeId;
        this.h = z;
        this.i = i2;
        this.j = c3164q1;
        this.k = c3056li;
        this.l = str;
        this.m = inlineParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2932gi)) {
            return false;
        }
        C2932gi c2932gi = (C2932gi) obj;
        return Intrinsics.wireman(this.a, c2932gi.a) && Intrinsics.wireman(this.b, c2932gi.b) && Intrinsics.wireman(this.c, c2932gi.c) && Intrinsics.wireman(this.d, c2932gi.d) && this.e == c2932gi.e && Intrinsics.wireman(this.f, c2932gi.f) && Intrinsics.wireman(this.g, c2932gi.g) && this.h == c2932gi.h && this.i == c2932gi.i && Intrinsics.wireman(this.j, c2932gi.j) && Intrinsics.wireman(this.k, c2932gi.k) && Intrinsics.wireman(this.l, c2932gi.l) && Intrinsics.wireman(this.m, c2932gi.m);
    }

    public final int hashCode() {
        int iA = AbstractC2906fi.a(this.i, (Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + AbstractC2906fi.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31, 31);
        C3164q1 c3164q1 = this.j;
        int iHashCode = (iA + (c3164q1 == null ? 0 : c3164q1.hashCode())) * 31;
        C3056li c3056li = this.k;
        int iHashCode2 = (iHashCode + (c3056li == null ? 0 : Integer.hashCode(c3056li.a))) * 31;
        String str = this.l;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        InlineParams inlineParams = this.m;
        return iHashCode3 + (inlineParams != null ? inlineParams.hashCode() : 0);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.a + ", markupType=" + this.b + ", impressionId=" + this.c + ", telemetryMetadataBlob=" + this.d + ", internetAvailabilityAdRetryCount=" + this.e + ", creativeType=" + this.f + ", creativeId=" + this.g + ", isRewarded=" + this.h + ", adIndex=" + this.i + ", adUnitTelemetryData=" + this.j + ", renderViewTelemetryData=" + this.k + ", renderViewId=" + this.l + ", inlineParams=" + this.m + ")";
    }
}
