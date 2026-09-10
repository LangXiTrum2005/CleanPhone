package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xg {
    public static final g4 a(String adType, String location, Mediation mediation, z6 eventTracker) {
        Intrinsics.f(adType, "adType");
        Intrinsics.f(location, "location");
        Intrinsics.f(eventTracker, "eventTracker");
        return new h4(adType, location, mediation, eventTracker);
    }

    public static final z6 a() {
        return w3.f15454b.b().a();
    }
}
