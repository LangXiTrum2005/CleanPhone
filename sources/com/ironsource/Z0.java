package com.ironsource;

import com.unity3d.mediation.LevelPlay;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z0 {
    public final X0 a(String adUnitId, LevelPlay.AdFormat adFormat, I8 sdkConfigService) {
        kotlin.jvm.internal.n.f(adUnitId, "adUnitId");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        kotlin.jvm.internal.n.f(sdkConfigService, "sdkConfigService");
        if (adUnitId.length() == 0) {
            return new X0.a(Y0.f27950a);
        }
        if (!sdkConfigService.c()) {
            return new X0.a(Y0.f27951b);
        }
        Va vaA = sdkConfigService.a();
        return (vaA == null || !vaA.a(adUnitId, adFormat)) ? new X0.a(Y0.f27952c) : X0.b.f27620a;
    }
}
