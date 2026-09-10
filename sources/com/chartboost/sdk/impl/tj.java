package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f15238c;
    public final List d;

    public tj(String str, List viewableUrls, List notViewableUrls, List viewUndeterminedUrls) {
        Intrinsics.f(viewableUrls, "viewableUrls");
        Intrinsics.f(notViewableUrls, "notViewableUrls");
        Intrinsics.f(viewUndeterminedUrls, "viewUndeterminedUrls");
        this.f15236a = str;
        this.f15237b = viewableUrls;
        this.f15238c = notViewableUrls;
        this.d = viewUndeterminedUrls;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        return Intrinsics.a(this.f15236a, tjVar.f15236a) && Intrinsics.a(this.f15237b, tjVar.f15237b) && Intrinsics.a(this.f15238c, tjVar.f15238c) && Intrinsics.a(this.d, tjVar.d);
    }

    public int hashCode() {
        String str = this.f15236a;
        return this.d.hashCode() + androidx.media3.extractor.text.ttml.a.c(androidx.media3.extractor.text.ttml.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f15237b), 31, this.f15238c);
    }

    public String toString() {
        return "ViewableImpression(id=" + this.f15236a + ", viewableUrls=" + this.f15237b + ", notViewableUrls=" + this.f15238c + ", viewUndeterminedUrls=" + this.d + ")";
    }
}
