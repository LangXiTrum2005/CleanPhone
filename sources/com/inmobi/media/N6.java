package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class N6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23003c;
    public final boolean d;

    public N6(boolean z2, String landingScheme, boolean z3, boolean z4) {
        Intrinsics.f(landingScheme, "landingScheme");
        this.f23001a = z2;
        this.f23002b = landingScheme;
        this.f23003c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N6)) {
            return false;
        }
        N6 n6 = (N6) obj;
        return this.f23001a == n6.f23001a && Intrinsics.a(this.f23002b, n6.f23002b) && this.f23003c == n6.f23003c && this.d == n6.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int hashCode() {
        boolean z2 = this.f23001a;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f23002b, r0 * 31, 31);
        boolean z3 = this.f23003c;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i2 = (iB + r3) * 31;
        boolean z4 = this.d;
        return i2 + (z4 ? 1 : z4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LandingPageState(isInAppBrowser=");
        sb.append(this.f23001a);
        sb.append(", landingScheme=");
        sb.append(this.f23002b);
        sb.append(", isCCTEnabled=");
        sb.append(this.f23003c);
        sb.append(", isPartialTabsEnabled=");
        return androidx.media3.extractor.text.ttml.a.r(sb, this.d, ')');
    }
}
