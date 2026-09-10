package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ii {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final di f14197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14199c;
    public final List d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f14200e;

    public ii(di vastFetcher, int i2, int i3, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        Intrinsics.f(vastFetcher, "vastFetcher");
        Intrinsics.f(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.f(aggregatedAdVerifications, "aggregatedAdVerifications");
        this.f14197a = vastFetcher;
        this.f14198b = i2;
        this.f14199c = i3;
        this.d = aggregatedTrackingEvents;
        this.f14200e = aggregatedAdVerifications;
    }

    public final ii a(di vastFetcher, int i2, int i3, List aggregatedTrackingEvents, List aggregatedAdVerifications) {
        Intrinsics.f(vastFetcher, "vastFetcher");
        Intrinsics.f(aggregatedTrackingEvents, "aggregatedTrackingEvents");
        Intrinsics.f(aggregatedAdVerifications, "aggregatedAdVerifications");
        return new ii(vastFetcher, i2, i3, aggregatedTrackingEvents, aggregatedAdVerifications);
    }

    public final List b() {
        return this.d;
    }

    public final int c() {
        return this.f14199c;
    }

    public final int d() {
        return this.f14198b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii)) {
            return false;
        }
        ii iiVar = (ii) obj;
        return Intrinsics.a(this.f14197a, iiVar.f14197a) && this.f14198b == iiVar.f14198b && this.f14199c == iiVar.f14199c && Intrinsics.a(this.d, iiVar.d) && Intrinsics.a(this.f14200e, iiVar.f14200e);
    }

    public int hashCode() {
        return this.f14200e.hashCode() + androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.a(this.f14199c, androidx.media3.extractor.text.ttml.a.a(this.f14198b, this.f14197a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public String toString() {
        return "VastParsingContext(vastFetcher=" + this.f14197a + ", maxWrapperDepth=" + this.f14198b + ", currentDepth=" + this.f14199c + ", aggregatedTrackingEvents=" + this.d + ", aggregatedAdVerifications=" + this.f14200e + ")";
    }

    public static /* synthetic */ ii a(ii iiVar, di diVar, int i2, int i3, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            diVar = iiVar.f14197a;
        }
        if ((i4 & 2) != 0) {
            i2 = iiVar.f14198b;
        }
        if ((i4 & 4) != 0) {
            i3 = iiVar.f14199c;
        }
        if ((i4 & 8) != 0) {
            list = iiVar.d;
        }
        if ((i4 & 16) != 0) {
            list2 = iiVar.f14200e;
        }
        List list3 = list2;
        int i5 = i3;
        return iiVar.a(diVar, i2, i5, list, list3);
    }

    public final List a() {
        return this.f14200e;
    }

    public /* synthetic */ ii(di diVar, int i2, int i3, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(diVar, i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new ArrayList() : list, (i4 & 16) != 0 ? new ArrayList() : list2);
    }
}
