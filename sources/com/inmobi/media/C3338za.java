package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.za, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3338za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f24161c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24162e;
    public final boolean f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f24164i;
    public final Long j;
    public final C3053hc k;

    public C3338za(String url, String id, Map headers, boolean z2, String priority, boolean z3, int i2, String ownerId, long j, Long l2, C3053hc c3053hc) {
        Intrinsics.f(url, "url");
        Intrinsics.f(id, "id");
        Intrinsics.f(headers, "headers");
        Intrinsics.f(priority, "priority");
        Intrinsics.f(ownerId, "ownerId");
        this.f24159a = url;
        this.f24160b = id;
        this.f24161c = headers;
        this.d = z2;
        this.f24162e = priority;
        this.f = z3;
        this.g = i2;
        this.f24163h = ownerId;
        this.f24164i = j;
        this.j = l2;
        this.k = c3053hc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3338za)) {
            return false;
        }
        C3338za c3338za = (C3338za) obj;
        return Intrinsics.a(this.f24159a, c3338za.f24159a) && Intrinsics.a(this.f24160b, c3338za.f24160b) && Intrinsics.a(this.f24161c, c3338za.f24161c) && this.d == c3338za.d && Intrinsics.a(this.f24162e, c3338za.f24162e) && this.f == c3338za.f && this.g == c3338za.g && Intrinsics.a(this.f24163h, c3338za.f24163h) && this.f24164i == c3338za.f24164i && Intrinsics.a(this.j, c3338za.j) && Intrinsics.a(this.k, c3338za.k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final int hashCode() {
        int iHashCode = (this.f24161c.hashCode() + androidx.datastore.preferences.protobuf.a.b(this.f24160b, this.f24159a.hashCode() * 31, 31)) * 31;
        boolean z2 = this.d;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f24162e, (iHashCode + r0) * 31, 31);
        boolean z3 = this.f;
        int iB2 = androidx.media3.extractor.text.ttml.a.b(androidx.datastore.preferences.protobuf.a.b(this.f24163h, androidx.media3.extractor.text.ttml.a.a(this.g, (iB + (z3 ? 1 : z3)) * 31, 31), 31), 31, this.f24164i);
        Long l2 = this.j;
        int iHashCode2 = (iB2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        C3053hc c3053hc = this.k;
        return iHashCode2 + (c3053hc != null ? c3053hc.hashCode() : 0);
    }

    public final String toString() {
        return "Ping(url=" + this.f24159a + ", id=" + this.f24160b + ", headers=" + this.f24161c + ", allowRedirects=" + this.d + ", priority=" + this.f24162e + ", ackRequired=" + this.f + ", retryCount=" + this.g + ", ownerId=" + this.f24163h + ", createdAt=" + this.f24164i + ", retryAfterTimestamp=" + this.j + ", telemetryData=" + this.k + ')';
    }
}
