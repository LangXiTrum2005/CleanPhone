package com.chartboost.sdk.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ai {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13467c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f13468e;

    public ai(String str, List ads, List aggregatedTrackingEvents, List aggregatedAdVerifications, Set viewabilityVendors) {
        Intrinsics.f(ads, "ads");
        Intrinsics.f(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.f(aggregatedAdVerifications, "aggregatedAdVerifications");
        Intrinsics.f(viewabilityVendors, "viewabilityVendors");
        this.f13465a = str;
        this.f13466b = ads;
        this.f13467c = aggregatedTrackingEvents;
        this.d = aggregatedAdVerifications;
        this.f13468e = viewabilityVendors;
    }

    public final List a() {
        return this.f13466b;
    }

    public final List b() {
        return this.f13467c;
    }

    public final Set c() {
        return this.f13468e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai)) {
            return false;
        }
        ai aiVar = (ai) obj;
        return Intrinsics.a(this.f13465a, aiVar.f13465a) && Intrinsics.a(this.f13466b, aiVar.f13466b) && Intrinsics.a(this.f13467c, aiVar.f13467c) && Intrinsics.a(this.d, aiVar.d) && Intrinsics.a(this.f13468e, aiVar.f13468e);
    }

    public int hashCode() {
        String str = this.f13465a;
        return this.f13468e.hashCode() + androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f13466b), 31, this.f13467c), 31, this.d);
    }

    public String toString() {
        return "Vast(version=" + this.f13465a + ", ads=" + this.f13466b + ", aggregatedTrackingEvents=" + this.f13467c + ", aggregatedAdVerifications=" + this.d + ", viewabilityVendors=" + this.f13468e + ")";
    }

    public /* synthetic */ ai(String str, List list, List list2, List list3, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, list3, (i2 & 16) != 0 ? sj.f15149e.a(list3) : set);
    }
}
