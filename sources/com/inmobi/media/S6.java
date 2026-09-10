package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class S6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23172c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23173e;
    public final String f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f23175i;

    public S6(long j, String impressionId, String placementType, String adType, String markupType, String creativeType, String metaDataBlob, boolean z2, String landingScheme) {
        Intrinsics.f(impressionId, "impressionId");
        Intrinsics.f(placementType, "placementType");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(markupType, "markupType");
        Intrinsics.f(creativeType, "creativeType");
        Intrinsics.f(metaDataBlob, "metaDataBlob");
        Intrinsics.f(landingScheme, "landingScheme");
        this.f23170a = j;
        this.f23171b = impressionId;
        this.f23172c = placementType;
        this.d = adType;
        this.f23173e = markupType;
        this.f = creativeType;
        this.g = metaDataBlob;
        this.f23174h = z2;
        this.f23175i = landingScheme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S6)) {
            return false;
        }
        S6 s6 = (S6) obj;
        return this.f23170a == s6.f23170a && Intrinsics.a(this.f23171b, s6.f23171b) && Intrinsics.a(this.f23172c, s6.f23172c) && Intrinsics.a(this.d, s6.d) && Intrinsics.a(this.f23173e, s6.f23173e) && Intrinsics.a(this.f, s6.f) && Intrinsics.a(this.g, s6.g) && this.f23174h == s6.f23174h && Intrinsics.a(this.f23175i, s6.f23175i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.g, androidx.datastore.preferences.protobuf.a.b(this.f, androidx.datastore.preferences.protobuf.a.b(this.f23173e, androidx.datastore.preferences.protobuf.a.b(this.d, androidx.datastore.preferences.protobuf.a.b(this.f23172c, androidx.datastore.preferences.protobuf.a.b(this.f23171b, Long.hashCode(this.f23170a) * 31, 31), 31), 31), 31), 31), 31);
        boolean z2 = this.f23174h;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        return this.f23175i.hashCode() + ((iB + r2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LandingPageTelemetryMetaData(placementId=");
        sb.append(this.f23170a);
        sb.append(", impressionId=");
        sb.append(this.f23171b);
        sb.append(", placementType=");
        sb.append(this.f23172c);
        sb.append(", adType=");
        sb.append(this.d);
        sb.append(", markupType=");
        sb.append(this.f23173e);
        sb.append(", creativeType=");
        sb.append(this.f);
        sb.append(", metaDataBlob=");
        sb.append(this.g);
        sb.append(", isRewarded=");
        sb.append(this.f23174h);
        sb.append(", landingScheme=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.f23175i, ')');
    }
}
