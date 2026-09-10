package com.mbridge.msdk.interstitialvideo.out;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;

/* JADX INFO: loaded from: classes2.dex */
public class InterstitialVideoListenerWrapper implements RewardVideoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterstitialVideoListener f1346a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public InterstitialVideoListenerWrapper(InterstitialVideoListener interstitialVideoListener) {
        this.f1346a = interstitialVideoListener;
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdClose(final MBridgeIds mBridgeIds, final RewardInfo rewardInfo) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onAdClose(mBridgeIds, rewardInfo);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdCloseWithIVReward(final MBridgeIds mBridgeIds, final boolean z, final int i) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.10
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onAdCloseWithIVReward(mBridgeIds, new RewardInfo(z, i));
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onAdShow(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onAdShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onEndcardShow(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onEndcardShow(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onLoadSuccess(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onLoadSuccess(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onShowFail(final MBridgeIds mBridgeIds, final String str) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onShowFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoAdClicked(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onVideoAdClicked(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoComplete(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onVideoComplete(mBridgeIds);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadFail(final MBridgeIds mBridgeIds, final String str) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onVideoLoadFail(mBridgeIds, str);
                }
            }
        });
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public void onVideoLoadSuccess(final MBridgeIds mBridgeIds) {
        this.b.post(new Runnable() { // from class: com.mbridge.msdk.interstitialvideo.out.InterstitialVideoListenerWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                if (InterstitialVideoListenerWrapper.this.f1346a != null) {
                    InterstitialVideoListenerWrapper.this.f1346a.onVideoLoadSuccess(mBridgeIds);
                }
            }
        });
    }
}
