package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14992c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14993e;
    public final Float f;
    public final Float g;

    public r4(String location, String adId, String cgn, int i2, String rewardCurrency, Float f, Float f2) {
        Intrinsics.f(location, "location");
        Intrinsics.f(adId, "adId");
        Intrinsics.f(cgn, "cgn");
        Intrinsics.f(rewardCurrency, "rewardCurrency");
        this.f14990a = location;
        this.f14991b = adId;
        this.f14992c = cgn;
        this.d = i2;
        this.f14993e = rewardCurrency;
        this.f = f;
        this.g = f2;
    }

    public final String a() {
        return this.f14991b;
    }

    public final String b() {
        return this.f14992c;
    }

    public final String c() {
        return this.f14990a;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.f14993e;
    }

    public final Float f() {
        return this.g;
    }

    public final Float g() {
        return this.f;
    }
}
