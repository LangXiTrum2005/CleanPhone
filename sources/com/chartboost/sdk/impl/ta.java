package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ti f15197c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f15198e;

    public ta(String str, List trackingEvents, ti tiVar, List mediaFiles, List icons) {
        Intrinsics.f(trackingEvents, "trackingEvents");
        Intrinsics.f(mediaFiles, "mediaFiles");
        Intrinsics.f(icons, "icons");
        this.f15195a = str;
        this.f15196b = trackingEvents;
        this.f15197c = tiVar;
        this.d = mediaFiles;
        this.f15198e = icons;
    }

    public final List a() {
        return this.d;
    }

    public final List b() {
        return this.f15196b;
    }

    public final ti c() {
        return this.f15197c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return Intrinsics.a(this.f15195a, taVar.f15195a) && Intrinsics.a(this.f15196b, taVar.f15196b) && Intrinsics.a(this.f15197c, taVar.f15197c) && Intrinsics.a(this.d, taVar.d) && Intrinsics.a(this.f15198e, taVar.f15198e);
    }

    public int hashCode() {
        String str = this.f15195a;
        int iC = androidx.media3.extractor.text.ttml.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f15196b);
        ti tiVar = this.f15197c;
        return this.f15198e.hashCode() + androidx.media3.extractor.text.ttml.a.c((iC + (tiVar != null ? tiVar.hashCode() : 0)) * 31, 31, this.d);
    }

    public String toString() {
        return "Linear(duration=" + this.f15195a + ", trackingEvents=" + this.f15196b + ", videoClicks=" + this.f15197c + ", mediaFiles=" + this.d + ", icons=" + this.f15198e + ")";
    }
}
