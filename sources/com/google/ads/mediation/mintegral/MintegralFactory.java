package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.view.ViewGroup;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import org.json.JSONObject;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lcom/google/ads/mediation/mintegral/MintegralFactory;", "", "<init>", "()V", "createSplashAdWrapper", "Lcom/google/ads/mediation/mintegral/MintegralSplashAdWrapper;", "createInterstitialHandler", "Lcom/google/ads/mediation/mintegral/MintegralNewInterstitialAdWrapper;", "createBidInterstitialHandler", "Lcom/google/ads/mediation/mintegral/MintegralBidNewInterstitialAdWrapper;", "createMBBannerView", "Lcom/mbridge/msdk/out/MBBannerView;", "context", "Landroid/content/Context;", "createMintegralRewardedAdWrapper", "Lcom/google/ads/mediation/mintegral/MintegralRewardedAdWrapper;", "createMintegralBidRewardedAdWrapper", "Lcom/google/ads/mediation/mintegral/MintegralBidRewardedAdWrapper;", "mintegral_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MintegralFactory {
    public static final MintegralFactory INSTANCE = new MintegralFactory();

    public static final MintegralBidNewInterstitialAdWrapper createBidInterstitialHandler() {
        return new MintegralBidNewInterstitialAdWrapper() { // from class: com.google.ads.mediation.mintegral.MintegralFactory.createBidInterstitialHandler.1

            /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
            public MBBidNewInterstitialHandler instance;

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void createAd(Context context, String placementId, String adUnitId) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                this.instance = new MBBidNewInterstitialHandler(context, placementId, adUnitId);
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void loadFromBid(String bidToken) {
                Intrinsics.checkNotNullParameter(bidToken, "bidToken");
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.loadFromBid(bidToken);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void playVideoMute(int muteConstant) {
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.playVideoMute(muteConstant);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void setExtraInfo(JSONObject jsonObject) {
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.setExtraInfo(jsonObject);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void setInterstitialVideoListener(NewInterstitialWithCodeListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.setInterstitialVideoListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
            public void showFromBid() {
                MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.instance;
                if (mBBidNewInterstitialHandler != null) {
                    mBBidNewInterstitialHandler.showFromBid();
                }
            }
        };
    }

    public static final MintegralNewInterstitialAdWrapper createInterstitialHandler() {
        return new MintegralNewInterstitialAdWrapper() { // from class: com.google.ads.mediation.mintegral.MintegralFactory.createInterstitialHandler.1

            /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
            public MBNewInterstitialHandler instance;

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void createAd(Context context, String placementId, String adUnitId) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                this.instance = new MBNewInterstitialHandler(context, placementId, adUnitId);
            }

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void load() {
                MBNewInterstitialHandler mBNewInterstitialHandler = this.instance;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.load();
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void playVideoMute(int muteConstant) {
                MBNewInterstitialHandler mBNewInterstitialHandler = this.instance;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.playVideoMute(muteConstant);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void setInterstitialVideoListener(NewInterstitialWithCodeListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBNewInterstitialHandler mBNewInterstitialHandler = this.instance;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.setInterstitialVideoListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
            public void show() {
                MBNewInterstitialHandler mBNewInterstitialHandler = this.instance;
                if (mBNewInterstitialHandler != null) {
                    mBNewInterstitialHandler.show();
                }
            }
        };
    }

    public static final MBBannerView createMBBannerView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new MBBannerView(context);
    }

    public static final MintegralBidRewardedAdWrapper createMintegralBidRewardedAdWrapper() {
        return new MintegralBidRewardedAdWrapper() { // from class: com.google.ads.mediation.mintegral.MintegralFactory.createMintegralBidRewardedAdWrapper.1

            /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
            public MBBidRewardVideoHandler instance;

            @Override // com.google.ads.mediation.mintegral.MintegralBidRewardedAdWrapper
            public void createAd(Context context, String placementId, String adUnitId) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                this.instance = new MBBidRewardVideoHandler(context, placementId, adUnitId);
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidRewardedAdWrapper
            public void loadFromBid(String bidToken) {
                Intrinsics.checkNotNullParameter(bidToken, "bidToken");
                MBBidRewardVideoHandler mBBidRewardVideoHandler = this.instance;
                if (mBBidRewardVideoHandler != null) {
                    mBBidRewardVideoHandler.loadFromBid(bidToken);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidRewardedAdWrapper
            public void playVideoMute(int muteConstant) {
                MBBidRewardVideoHandler mBBidRewardVideoHandler = this.instance;
                if (mBBidRewardVideoHandler != null) {
                    mBBidRewardVideoHandler.playVideoMute(muteConstant);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidRewardedAdWrapper
            public void setExtraInfo(JSONObject jsonObject) {
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                MBBidRewardVideoHandler mBBidRewardVideoHandler = this.instance;
                if (mBBidRewardVideoHandler != null) {
                    mBBidRewardVideoHandler.setExtraInfo(jsonObject);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidRewardedAdWrapper
            public void setRewardVideoListener(RewardVideoWithCodeListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBBidRewardVideoHandler mBBidRewardVideoHandler = this.instance;
                if (mBBidRewardVideoHandler != null) {
                    mBBidRewardVideoHandler.setRewardVideoListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralBidRewardedAdWrapper
            public void showFromBid() {
                MBBidRewardVideoHandler mBBidRewardVideoHandler = this.instance;
                if (mBBidRewardVideoHandler != null) {
                    mBBidRewardVideoHandler.showFromBid();
                }
            }
        };
    }

    public static final MintegralRewardedAdWrapper createMintegralRewardedAdWrapper() {
        return new MintegralRewardedAdWrapper() { // from class: com.google.ads.mediation.mintegral.MintegralFactory.createMintegralRewardedAdWrapper.1

            /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
            public MBRewardVideoHandler instance;

            @Override // com.google.ads.mediation.mintegral.MintegralRewardedAdWrapper
            public void createAd(Context context, String placementId, String adUnitId) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                this.instance = new MBRewardVideoHandler(context, placementId, adUnitId);
            }

            @Override // com.google.ads.mediation.mintegral.MintegralRewardedAdWrapper
            public void load() {
                MBRewardVideoHandler mBRewardVideoHandler = this.instance;
                if (mBRewardVideoHandler != null) {
                    mBRewardVideoHandler.load();
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralRewardedAdWrapper
            public void playVideoMute(int muteConstant) {
                MBRewardVideoHandler mBRewardVideoHandler = this.instance;
                if (mBRewardVideoHandler != null) {
                    mBRewardVideoHandler.playVideoMute(muteConstant);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralRewardedAdWrapper
            public void setRewardVideoListener(RewardVideoWithCodeListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBRewardVideoHandler mBRewardVideoHandler = this.instance;
                if (mBRewardVideoHandler != null) {
                    mBRewardVideoHandler.setRewardVideoListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralRewardedAdWrapper
            public void show() {
                MBRewardVideoHandler mBRewardVideoHandler = this.instance;
                if (mBRewardVideoHandler != null) {
                    mBRewardVideoHandler.show();
                }
            }
        };
    }

    public static final MintegralSplashAdWrapper createSplashAdWrapper() {
        return new MintegralSplashAdWrapper() { // from class: com.google.ads.mediation.mintegral.MintegralFactory.createSplashAdWrapper.1

            /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
            public MBSplashHandler instance;

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void createAd(String placementId, String adUnitId) {
                Intrinsics.checkNotNullParameter(placementId, "placementId");
                Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
                this.instance = new MBSplashHandler(placementId, adUnitId, true, 5);
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void onDestroy() {
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.onDestroy();
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void preLoad() {
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.preLoad();
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void preLoadByToken(String token) {
                Intrinsics.checkNotNullParameter(token, "token");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.preLoadByToken(token);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void setExtraInfo(JSONObject jsonObject) {
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setExtraInfo(jsonObject);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void setSplashLoadListener(MBSplashLoadWithCodeListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setSplashLoadListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void setSplashShowListener(MBSplashShowListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.setSplashShowListener(listener);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void show(ViewGroup group) {
                Intrinsics.checkNotNullParameter(group, "group");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.show(group);
                }
            }

            @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
            public void show(ViewGroup group, String bidToken) {
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(bidToken, "bidToken");
                MBSplashHandler mBSplashHandler = this.instance;
                if (mBSplashHandler != null) {
                    mBSplashHandler.show(group, bidToken);
                }
            }
        };
    }
}
