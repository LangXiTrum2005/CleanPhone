package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class Sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23184c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23185e;
    public final List f;
    public final double g;

    public Sd(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List priorityEventsList, double d) {
        Intrinsics.f(priorityEventsList, "priorityEventsList");
        this.f23182a = z2;
        this.f23183b = z3;
        this.f23184c = z4;
        this.d = z5;
        this.f23185e = z6;
        this.f = priorityEventsList;
        this.g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sd)) {
            return false;
        }
        Sd sd = (Sd) obj;
        return this.f23182a == sd.f23182a && this.f23183b == sd.f23183b && this.f23184c == sd.f23184c && this.d == sd.d && this.f23185e == sd.f23185e && Intrinsics.a(this.f, sd.f) && Double.compare(this.g, sd.g) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final int hashCode() {
        boolean z2 = this.f23182a;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        boolean z3 = this.f23183b;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.f23184c;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.d;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.f23185e;
        return Double.hashCode(this.g) + androidx.media3.extractor.text.ttml.a.c((i5 + (z6 ? 1 : z6)) * 31, 31, this.f);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f23182a + ", isImageEnabled=" + this.f23183b + ", isGIFEnabled=" + this.f23184c + ", isVideoEnabled=" + this.d + ", isGeneralEventsDisabled=" + this.f23185e + ", priorityEventsList=" + this.f + ", samplingFactor=" + this.g + ')';
    }
}
