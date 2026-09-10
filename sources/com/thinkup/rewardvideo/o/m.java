package com.thinkup.rewardvideo.o;

import android.content.Context;
import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.rewardvideo.api.TURewardVideoAutoEventListener;
import com.thinkup.rewardvideo.api.TURewardVideoExListener;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements TURewardVideoExListener {
    TUAdRevenueListener m;
    TURewardVideoAutoEventListener o;

    public m(TURewardVideoAutoEventListener tURewardVideoAutoEventListener, TUAdRevenueListener tUAdRevenueListener) {
        this.o = tURewardVideoAutoEventListener;
        this.m = tUAdRevenueListener;
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onAgainReward(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.13
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onAgainReward(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onAgainRewardFailed(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.14
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                    if (tURewardVideoAutoEventListener != null) {
                        tURewardVideoAutoEventListener.onAgainRewardFailed(tUAdInfo);
                    }
                } catch (Throwable th) {
                    Log.w(mo.oo0, "onAgainRewardFailed: " + th.getMessage());
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onDeeplinkCallback(final TUAdInfo tUAdInfo, final boolean z2) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.1
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onDeeplinkCallback(tUAdInfo, z2);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onDownloadConfirm(final Context context, final TUAdInfo tUAdInfo, final TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.8
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onDownloadConfirm(context, tUAdInfo, tUNetworkConfirmInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
    public final void onReward(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.7
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onReward(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onRewardFailed(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.15
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                    if (tURewardVideoAutoEventListener != null) {
                        tURewardVideoAutoEventListener.onRewardFailed(tUAdInfo);
                    }
                } catch (Throwable th) {
                    Log.w(mo.oo0, "onRewardFailed: " + th.getMessage());
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onRewardedVideoAdAgainPlayClicked(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.12
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdAgainPlayClicked(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onRewardedVideoAdAgainPlayEnd(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.10
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdAgainPlayEnd(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onRewardedVideoAdAgainPlayFailed(final AdError adError, final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.11
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdAgainPlayFailed(adError, tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoExListener
    public final void onRewardedVideoAdAgainPlayStart(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.9
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdAgainPlayStart(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
    public final void onRewardedVideoAdClosed(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.5
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdClosed(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
    public final void onRewardedVideoAdFailed(AdError adError) {
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
    public final void onRewardedVideoAdLoaded() {
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
    public final void onRewardedVideoAdPlayClicked(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.6
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdPlayClicked(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
    public final void onRewardedVideoAdPlayEnd(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.3
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdPlayEnd(tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
    public final void onRewardedVideoAdPlayFailed(final AdError adError, final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.4
            @Override // java.lang.Runnable
            public final void run() {
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(adError, tUAdInfo);
                }
            }
        });
    }

    @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
    public final void onRewardedVideoAdPlayStart(final TUAdInfo tUAdInfo) {
        o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.m.2
            @Override // java.lang.Runnable
            public final void run() {
                TUAdRevenueListener tUAdRevenueListener = m.this.m;
                if (tUAdRevenueListener != null) {
                    tUAdRevenueListener.onAdRevenuePaid(tUAdInfo);
                }
                TURewardVideoAutoEventListener tURewardVideoAutoEventListener = m.this.o;
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdPlayStart(tUAdInfo);
                }
            }
        });
    }
}
