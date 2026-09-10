package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3053hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f23664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23666c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23667e;
    public final String f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final T0 f23669i;
    public final C3133mc j;
    public final String k;

    public C3053hc(Z placement, String markupType, String telemetryMetadataBlob, int i2, String creativeType, String creativeId, boolean z2, int i3, T0 t0, C3133mc c3133mc, String str) {
        Intrinsics.f(placement, "placement");
        Intrinsics.f(markupType, "markupType");
        Intrinsics.f(telemetryMetadataBlob, "telemetryMetadataBlob");
        Intrinsics.f(creativeType, "creativeType");
        Intrinsics.f(creativeId, "creativeId");
        this.f23664a = placement;
        this.f23665b = markupType;
        this.f23666c = telemetryMetadataBlob;
        this.d = i2;
        this.f23667e = creativeType;
        this.f = creativeId;
        this.g = z2;
        this.f23668h = i3;
        this.f23669i = t0;
        this.j = c3133mc;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3053hc)) {
            return false;
        }
        C3053hc c3053hc = (C3053hc) obj;
        return Intrinsics.a(this.f23664a, c3053hc.f23664a) && Intrinsics.a(this.f23665b, c3053hc.f23665b) && Intrinsics.a(this.f23666c, c3053hc.f23666c) && this.d == c3053hc.d && Intrinsics.a(this.f23667e, c3053hc.f23667e) && Intrinsics.a(this.f, c3053hc.f) && this.g == c3053hc.g && this.f23668h == c3053hc.f23668h && Intrinsics.a(this.f23669i, c3053hc.f23669i) && Intrinsics.a(this.j, c3053hc.j) && Intrinsics.a(this.k, c3053hc.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    public final int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f, androidx.datastore.preferences.protobuf.a.b(this.f23667e, androidx.media3.extractor.text.ttml.a.a(this.d, androidx.datastore.preferences.protobuf.a.b(this.f23666c, androidx.datastore.preferences.protobuf.a.b(this.f23665b, this.f23664a.hashCode() * 31, 31), 31), 31), 31), 31);
        boolean z2 = this.g;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iA = androidx.media3.extractor.text.ttml.a.a(this.f23668h, (iB + r2) * 31, 31);
        T0 t0 = this.f23669i;
        int iHashCode = (iA + (t0 == null ? 0 : t0.hashCode())) * 31;
        C3133mc c3133mc = this.j;
        int iHashCode2 = (iHashCode + (c3133mc == null ? 0 : Integer.hashCode(c3133mc.f23821a))) * 31;
        String str = this.k;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RenderViewMetaData(placement=");
        sb.append(this.f23664a);
        sb.append(", markupType=");
        sb.append(this.f23665b);
        sb.append(", telemetryMetadataBlob=");
        sb.append(this.f23666c);
        sb.append(", internetAvailabilityAdRetryCount=");
        sb.append(this.d);
        sb.append(", creativeType=");
        sb.append(this.f23667e);
        sb.append(", creativeId=");
        sb.append(this.f);
        sb.append(", isRewarded=");
        sb.append(this.g);
        sb.append(", adIndex=");
        sb.append(this.f23668h);
        sb.append(", adUnitTelemetryData=");
        sb.append(this.f23669i);
        sb.append(", renderViewTelemetryData=");
        sb.append(this.j);
        sb.append(", renderViewId=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.k, ')');
    }
}
