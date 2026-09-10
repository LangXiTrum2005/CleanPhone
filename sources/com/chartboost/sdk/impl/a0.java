package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f13382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13384c;

    public a0(ViewGroup bannerView, int i2, int i3) {
        Intrinsics.f(bannerView, "bannerView");
        this.f13382a = bannerView;
        this.f13383b = i2;
        this.f13384c = i3;
    }

    public final int a() {
        return this.f13384c;
    }

    public final ViewGroup b() {
        return this.f13382a;
    }

    public final int c() {
        return this.f13383b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.a(this.f13382a, a0Var.f13382a) && this.f13383b == a0Var.f13383b && this.f13384c == a0Var.f13384c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f13384c) + androidx.media3.extractor.text.ttml.a.a(this.f13383b, this.f13382a.hashCode() * 31, 31);
    }

    public String toString() {
        ViewGroup viewGroup = this.f13382a;
        int i2 = this.f13383b;
        int i3 = this.f13384c;
        StringBuilder sb = new StringBuilder("AdUnitBannerData(bannerView=");
        sb.append(viewGroup);
        sb.append(", bannerWidth=");
        sb.append(i2);
        sb.append(", bannerHeight=");
        return android.support.v4.media.a.i(i3, ")", sb);
    }
}
