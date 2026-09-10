package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15396c;

    public v8(String str, List iconClickTracking, List iconClickFallbackImages) {
        Intrinsics.f(iconClickTracking, "iconClickTracking");
        Intrinsics.f(iconClickFallbackImages, "iconClickFallbackImages");
        this.f15394a = str;
        this.f15395b = iconClickTracking;
        this.f15396c = iconClickFallbackImages;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return Intrinsics.a(this.f15394a, v8Var.f15394a) && Intrinsics.a(this.f15395b, v8Var.f15395b) && Intrinsics.a(this.f15396c, v8Var.f15396c);
    }

    public int hashCode() {
        String str = this.f15394a;
        return this.f15396c.hashCode() + androidx.media3.extractor.text.ttml.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f15395b);
    }

    public String toString() {
        return "IconClicks(iconClickThrough=" + this.f15394a + ", iconClickTracking=" + this.f15395b + ", iconClickFallbackImages=" + this.f15396c + ")";
    }
}
