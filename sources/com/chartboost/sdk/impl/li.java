package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class li extends v2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(String url) {
        super(v2.c.GET, url, ae.LOW, null);
        Intrinsics.f(url, "url");
    }
}
