package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface N0 {
    void a();

    void a(IronSourceError ironSourceError);

    void b(LevelPlayAdInfo levelPlayAdInfo);

    default void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.n.f(adInfo, "adInfo");
    }
}
