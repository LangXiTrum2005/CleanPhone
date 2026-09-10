package com.inmobi.media;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B4 f22680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22681c;

    public A4(float f, B4 b4, ArrayList arrayList) {
        this.f22679a = f;
        this.f22680b = b4;
        this.f22681c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A4)) {
            return false;
        }
        A4 a4 = (A4) obj;
        return Float.compare(this.f22679a, a4.f22679a) == 0 && Intrinsics.a(this.f22680b, a4.f22680b) && Intrinsics.a(this.f22681c, a4.f22681c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f22679a) * 31;
        B4 b4 = this.f22680b;
        int iHashCode2 = (iHashCode + (b4 == null ? 0 : b4.hashCode())) * 31;
        ArrayList arrayList = this.f22681c;
        return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "ExposureMetrics(exposedPercentage=" + this.f22679a + ", visibleRectangle=" + this.f22680b + ", occlusionRectangles=" + this.f22681c + ')';
    }
}
