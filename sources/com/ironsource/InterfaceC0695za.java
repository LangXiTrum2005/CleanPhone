package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.za, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0695za {
    void b(IronSourceError ironSourceError);

    void d(IronSourceError ironSourceError);

    void i();

    void k();

    void onAdClicked();

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication();

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
