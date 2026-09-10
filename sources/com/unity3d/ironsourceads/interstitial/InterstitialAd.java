package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C0640w9;
import com.ironsource.InterfaceC0658x9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class InterstitialAd implements InterfaceC0658x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0640w9 f38466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterstitialAdListener f38467b;

    public InterstitialAd(C0640w9 interstitialAdInternal) {
        n.f(interstitialAdInternal, "interstitialAdInternal");
        this.f38466a = interstitialAdInternal;
        interstitialAdInternal.a(this);
    }

    public final InterstitialAdInfo getAdInfo() {
        return this.f38466a.b();
    }

    public final InterstitialAdListener getListener() {
        return this.f38467b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f38466a.d();
    }

    @Override // com.ironsource.InterfaceC0658x9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f38467b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC0658x9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f38467b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC0658x9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f38467b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC0658x9
    public void onAdInstanceDidFailedToShow(IronSourceError error) {
        n.f(error, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + error + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f38467b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC0658x9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f38467b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(InterstitialAdListener interstitialAdListener) {
        this.f38467b = interstitialAdListener;
    }

    public final void show(Activity activity) {
        n.f(activity, "activity");
        IronLog.API.info();
        this.f38466a.a(activity);
    }

    @Override // com.ironsource.InterfaceC0658x9
    public void onAdInstanceDidReward(String str, int i10) {
    }
}
