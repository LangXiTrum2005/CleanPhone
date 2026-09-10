package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc f15628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f15630c;

    public ya(pc multiRenderable, String auctionId, w adMarkupConfig) {
        Intrinsics.f(multiRenderable, "multiRenderable");
        Intrinsics.f(auctionId, "auctionId");
        Intrinsics.f(adMarkupConfig, "adMarkupConfig");
        this.f15628a = multiRenderable;
        this.f15629b = auctionId;
        this.f15630c = adMarkupConfig;
    }

    public final w a() {
        return this.f15630c;
    }

    public final String b() {
        return this.f15629b;
    }

    public final pc c() {
        return this.f15628a;
    }
}
