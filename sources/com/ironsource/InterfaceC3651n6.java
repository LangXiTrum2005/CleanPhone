package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3651n6 {
    void a();

    void a(Activity activity, String str);

    void a(LevelPlayAdError levelPlayAdError);

    LevelPlayAdInfo b();

    InterfaceC3591k0 c();

    void loadAd();

    void onAdClicked();

    void onAdClosed();

    void onAdDisplayed(LevelPlayAdInfo levelPlayAdInfo);

    void onAdInfoChanged(LevelPlayAdInfo levelPlayAdInfo);

    void onAdLoadFailed(LevelPlayAdError levelPlayAdError);

    void onAdLoaded(LevelPlayAdInfo levelPlayAdInfo);
}
