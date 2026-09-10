package com.startapp.sdk.internal;

import A.C0880a0;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p7 implements h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdUnitConfig f41350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.adsbase.l f41351c;
    public AdManagerInterstitialAd d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RewardedAd f41352e;

    public p7(Context context, AdUnitConfig config) {
        Intrinsics.f(context, "context");
        Intrinsics.f(config, "config");
        this.f41349a = context;
        this.f41350b = config;
    }

    public static final void a(p7 this$0, RewardItem it) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(it, "it");
        com.startapp.sdk.adsbase.l lVar = this$0.f41351c;
        if (lVar != null) {
            lVar.f();
        }
    }

    public final void a(Activity activity) {
        RewardedAd rewardedAd = this.f41352e;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new o7(this));
        }
        RewardedAd rewardedAd2 = this.f41352e;
        if (rewardedAd2 != null) {
            rewardedAd2.show(activity, new C0880a0(this, 27));
        }
    }
}
