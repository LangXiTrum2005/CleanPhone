package com.startapp.sdk.internal;

import android.view.View;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l7 extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p7 f41204a;

    public l7(p7 p7Var) {
        this.f41204a = p7Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError adError) {
        Intrinsics.f(adError, "adError");
        p7 p7Var = this.f41204a;
        p7Var.f41352e = null;
        p7Var.d = null;
        com.startapp.sdk.adsbase.l lVar = p7Var.f41351c;
        if (lVar != null) {
            lVar.a(adError.toString());
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        RewardedAd rewardedAd2 = rewardedAd;
        Intrinsics.f(rewardedAd2, "rewardedAd");
        p7 p7Var = this.f41204a;
        p7Var.d = null;
        p7Var.f41352e = rewardedAd2;
        com.startapp.sdk.adsbase.l lVar = p7Var.f41351c;
        if (lVar != null) {
            lVar.a((View) null);
        }
    }
}
