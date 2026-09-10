package com.thinkup.interstitial.o;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.interstitial.api.TUInterstitialAutoEventListener;
import com.thinkup.interstitial.api.TUInterstitialExListener;

/* JADX INFO: loaded from: classes6.dex */
public final class oo implements TUInterstitialExListener {
    TUAdRevenueListener m;
    TUInterstitialAutoEventListener o;

    public oo(TUInterstitialAutoEventListener tUInterstitialAutoEventListener, TUAdRevenueListener tUAdRevenueListener) {
        this.o = tUInterstitialAutoEventListener;
        this.m = tUAdRevenueListener;
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialExListener
    public final void onDeeplinkCallback(final TUAdInfo tUAdInfo, final boolean z2) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.oo.1
            @Override // java.lang.Runnable
            public final void run() {
                TUInterstitialAutoEventListener tUInterstitialAutoEventListener = oo.this.o;
                if (tUInterstitialAutoEventListener != null) {
                    tUInterstitialAutoEventListener.onDeeplinkCallback(tUAdInfo, z2);
                }
            }
        });
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialExListener
    public final void onDownloadConfirm(final Context context, final TUAdInfo tUAdInfo, final TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.oo.2
            @Override // java.lang.Runnable
            public final void run() {
                TUInterstitialAutoEventListener tUInterstitialAutoEventListener = oo.this.o;
                if (tUInterstitialAutoEventListener != null) {
                    Context contextMm0 = context;
                    if (contextMm0 == null) {
                        contextMm0 = o0n.m().mm0();
                    }
                    tUInterstitialAutoEventListener.onDownloadConfirm(contextMm0, tUAdInfo, tUNetworkConfirmInfo);
                }
            }
        });
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialListener
    public final void onInterstitialAdClicked(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.oo.7
            @Override // java.lang.Runnable
            public final void run() {
                TUInterstitialAutoEventListener tUInterstitialAutoEventListener = oo.this.o;
                if (tUInterstitialAutoEventListener != null) {
                    tUInterstitialAutoEventListener.onInterstitialAdClicked(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialListener
    public final void onInterstitialAdClose(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.oo.6
            @Override // java.lang.Runnable
            public final void run() {
                TUInterstitialAutoEventListener tUInterstitialAutoEventListener = oo.this.o;
                if (tUInterstitialAutoEventListener != null) {
                    tUInterstitialAutoEventListener.onInterstitialAdClose(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialListener
    public final void onInterstitialAdLoadFail(AdError adError) {
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialListener
    public final void onInterstitialAdLoaded() {
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialListener
    public final void onInterstitialAdShow(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.oo.8
            @Override // java.lang.Runnable
            public final void run() {
                TUAdRevenueListener tUAdRevenueListener = oo.this.m;
                if (tUAdRevenueListener != null) {
                    tUAdRevenueListener.onAdRevenuePaid(tUAdInfo);
                }
                TUInterstitialAutoEventListener tUInterstitialAutoEventListener = oo.this.o;
                if (tUInterstitialAutoEventListener != null) {
                    tUInterstitialAutoEventListener.onInterstitialAdShow(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialListener
    public final void onInterstitialAdVideoEnd(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.oo.4
            @Override // java.lang.Runnable
            public final void run() {
                TUInterstitialAutoEventListener tUInterstitialAutoEventListener = oo.this.o;
                if (tUInterstitialAutoEventListener != null) {
                    tUInterstitialAutoEventListener.onInterstitialAdVideoEnd(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialListener
    public final void onInterstitialAdVideoError(final AdError adError) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.oo.5
            @Override // java.lang.Runnable
            public final void run() {
                TUInterstitialAutoEventListener tUInterstitialAutoEventListener = oo.this.o;
                if (tUInterstitialAutoEventListener != null) {
                    tUInterstitialAutoEventListener.onInterstitialAdVideoError(adError);
                }
            }
        });
    }

    @Override // com.thinkup.interstitial.api.TUInterstitialListener
    public final void onInterstitialAdVideoStart(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.oo.3
            @Override // java.lang.Runnable
            public final void run() {
                TUInterstitialAutoEventListener tUInterstitialAutoEventListener = oo.this.o;
                if (tUInterstitialAutoEventListener != null) {
                    tUInterstitialAutoEventListener.onInterstitialAdVideoStart(tUAdInfo);
                }
            }
        });
    }
}
