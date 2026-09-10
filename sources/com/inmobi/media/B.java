package com.inmobi.media;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f22705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f22706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f22707c;
    public final RectF d;

    public B(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.f22705a = rectF;
        this.f22706b = rectF2;
        this.f22707c = rectF3;
        this.d = rectF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b2 = (B) obj;
        return Intrinsics.a(this.f22705a, b2.f22705a) && Intrinsics.a(this.f22706b, b2.f22706b) && Intrinsics.a(this.f22707c, b2.f22707c) && Intrinsics.a(this.d, b2.d);
    }

    public final int hashCode() {
        RectF rectF = this.f22705a;
        int iHashCode = (rectF == null ? 0 : rectF.hashCode()) * 31;
        RectF rectF2 = this.f22706b;
        int iHashCode2 = (iHashCode + (rectF2 == null ? 0 : rectF2.hashCode())) * 31;
        RectF rectF3 = this.f22707c;
        int iHashCode3 = (iHashCode2 + (rectF3 == null ? 0 : rectF3.hashCode())) * 31;
        RectF rectF4 = this.d;
        return iHashCode3 + (rectF4 != null ? rectF4.hashCode() : 0);
    }

    public final String toString() {
        return "CurvedEdges(topLeft=" + this.f22705a + ", topRight=" + this.f22706b + ", bottomLeft=" + this.f22707c + ", bottomRight=" + this.d + ')';
    }
}
