package com.inmobi.media;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Yj {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final double g;

    public Yj(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List priorityEventsList, double d) {
        Intrinsics.checkNotNullParameter(priorityEventsList, "priorityEventsList");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = priorityEventsList;
        this.g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yj)) {
            return false;
        }
        Yj yj = (Yj) obj;
        return this.a == yj.a && this.b == yj.b && this.c == yj.c && this.d == yj.d && this.e == yj.e && Intrinsics.wireman(this.f, yj.f) && Double.compare(this.g, yj.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + ((this.f.hashCode() + ((Boolean.hashCode(this.e) + ((Boolean.hashCode(this.d) + ((Boolean.hashCode(this.c) + ((Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.a + ", isImageEnabled=" + this.b + ", isGIFEnabled=" + this.c + ", isVideoEnabled=" + this.d + ", isGeneralEventsDisabled=" + this.e + ", priorityEventsList=" + this.f + ", samplingFactor=" + this.g + ")";
    }
}
