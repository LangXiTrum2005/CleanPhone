package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3809wa {
    void b(IronSourceError ironSourceError);

    void d(IronSourceError ironSourceError);

    void i();

    void k();

    void onAdClicked();

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication();

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
