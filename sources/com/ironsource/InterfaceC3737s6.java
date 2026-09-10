package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3737s6 {
    void a();

    void a(IronSourceError ironSourceError);

    void a(LevelPlayAdInfo levelPlayAdInfo);

    void b(LevelPlayAdInfo levelPlayAdInfo);

    void c(IronSourceError ironSourceError);

    default void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
