package com.google.ads.mediation.vungle;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements VungleInitializer.VungleInitializationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f792a;
    public final /* synthetic */ String b;
    public final /* synthetic */ VungleMediationAdapter c;

    public b(VungleMediationAdapter vungleMediationAdapter, Context context, String str) {
        this.c = vungleMediationAdapter;
        this.f792a = context;
        this.b = str;
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeError(AdError adError) {
        adError.toString();
        this.c.mediationAdLoadCallback.onFailure(adError);
    }

    @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
    public final void onInitializeSuccess() {
        VungleMediationAdapter vungleMediationAdapter = this.c;
        vungleMediationAdapter.rewardedAd = vungleMediationAdapter.vungleFactory.createRewardedAd(this.f792a, this.b, vungleMediationAdapter.adConfig);
        vungleMediationAdapter.rewardedAd.setAdListener(vungleMediationAdapter);
        if (!TextUtils.isEmpty(vungleMediationAdapter.userId)) {
            vungleMediationAdapter.rewardedAd.setUserId(vungleMediationAdapter.userId);
        }
        vungleMediationAdapter.rewardedAd.load(null);
    }
}
