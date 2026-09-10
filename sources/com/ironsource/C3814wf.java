package com.ironsource;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3814wf implements LevelPlayBannerAdViewListener {
    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdClicked(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C3818x2.a().b(Lf.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C3818x2.a().f(Lf.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLeftApplication(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C3818x2.a().c(Lf.a.a(adInfo));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        C3818x2.a().a(Lf.a.a(error));
    }

    @Override // com.unity3d.mediation.banner.LevelPlayBannerAdViewListener
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C3818x2.a().d(Lf.a.a(adInfo));
    }
}
