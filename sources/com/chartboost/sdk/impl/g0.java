package com.chartboost.sdk.impl;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f13971a = new g0();

    public final Pair a(l1 appRequest, wa params, Function2 loadOpenRTBAd, Function2 loadAdGet) {
        Intrinsics.f(appRequest, "appRequest");
        Intrinsics.f(params, "params");
        Intrinsics.f(loadOpenRTBAd, "loadOpenRTBAd");
        Intrinsics.f(loadAdGet, "loadAdGet");
        return appRequest.c() != null ? new Pair(loadOpenRTBAd, params) : new Pair(loadAdGet, params);
    }
}
