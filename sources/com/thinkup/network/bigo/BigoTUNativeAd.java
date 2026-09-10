package com.thinkup.network.bigo;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.NativeAdView;
import sg.bigo.ads.api.VideoController;

/* JADX INFO: loaded from: classes6.dex */
public class BigoTUNativeAd extends CustomNativeAd implements AdInteractionListener, VideoController.VideoLifeCallback {
    private NativeAd m;
    private Boolean m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private NativeAdView f42534n;
    private final Context o;
    private MediaView o0;
    private VideoController om;
    private boolean on;
    private ImageView oo;

    public BigoTUNativeAd(Context context, NativeAd nativeAd) {
        this.o = context;
        this.m = nativeAd;
        setTitle(nativeAd.getTitle());
        setDescriptionText(this.m.getDescription());
        setCallToActionText(this.m.getCallToAction());
        setAdvertiserName(this.m.getAdvertiser());
        this.m.setAdInteractionListener(this);
        if (this.m.getCreativeType() == NativeAd.CreativeType.VIDEO) {
            this.mAdSourceType = "1";
        } else {
            this.mAdSourceType = "2";
        }
    }

    private void o() {
        setTitle(this.m.getTitle());
        setDescriptionText(this.m.getDescription());
        setCallToActionText(this.m.getCallToAction());
        setAdvertiserName(this.m.getAdvertiser());
        this.m.setAdInteractionListener(this);
        if (this.m.getCreativeType() == NativeAd.CreativeType.VIDEO) {
            this.mAdSourceType = "1";
        } else {
            this.mAdSourceType = "2";
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
        super.clear(view);
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        super.destroy();
        NativeAd nativeAd = this.m;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.m = null;
        }
        if (this.o0 != null) {
            this.o0 = null;
        }
        if (this.oo != null) {
            this.oo = null;
        }
        VideoController videoController = this.om;
        if (videoController != null) {
            videoController.setVideoLifeCallback(null);
            this.om = null;
        }
        NativeAdView nativeAdView = this.f42534n;
        if (nativeAdView != null) {
            nativeAdView.removeAllViews();
            this.f42534n = null;
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdIconView() {
        NativeAd nativeAd = this.m;
        if (nativeAd == null || !nativeAd.hasIcon()) {
            return null;
        }
        if (this.oo == null) {
            this.oo = new ImageView(this.o);
        }
        return this.oo;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.o0 == null) {
            this.o0 = new MediaView(this.o);
        }
        return this.o0;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        NativeAdView nativeAdView = new NativeAdView(this.o);
        this.f42534n = nativeAdView;
        return nativeAdView;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        notifyAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(AdError adError) {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdImpression() {
        notifyAdImpression();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdOpened() {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public void onMuteChange(boolean z2) {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public void onVideoEnd() {
        this.on = true;
        notifyAdVideoEnd();
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public void onVideoPause() {
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public void onVideoPlay() {
        if (this.on) {
            notifyAdVideoStart();
            this.on = false;
        }
    }

    @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
    public void onVideoStart() {
        notifyAdVideoStart();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void pauseVideo() {
        VideoController videoController = this.om;
        if (videoController == null || !videoController.isPlaying()) {
            return;
        }
        this.om.pause();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        ViewGroup viewGroup;
        try {
            ViewGroup viewGroup2 = this.f42534n;
            AdOptionsView adOptionsView = null;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else if (view instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) view;
                viewGroup = viewGroup2;
            } else {
                viewGroup = null;
            }
            if (viewGroup == null) {
                return;
            }
            FrameLayout.LayoutParams choiceViewLayoutParams = tUNativePrepareInfo.getChoiceViewLayoutParams();
            if (choiceViewLayoutParams != null) {
                adOptionsView = new AdOptionsView(this.o);
                adOptionsView.setTag(4);
                viewGroup.addView(adOptionsView, choiceViewLayoutParams);
            }
            AdOptionsView adOptionsView2 = adOptionsView;
            View titleView = tUNativePrepareInfo.getTitleView();
            View descView = tUNativePrepareInfo.getDescView();
            View ctaView = tUNativePrepareInfo.getCtaView();
            if (titleView != null) {
                titleView.setTag(2);
            }
            if (descView != null) {
                descView.setTag(6);
            }
            ImageView imageView = this.oo;
            if (imageView != null) {
                imageView.setTag(1);
            }
            if (ctaView != null) {
                ctaView.setTag(7);
            }
            MediaView mediaView = this.o0;
            if (mediaView != null) {
                mediaView.setTag(5);
            }
            viewGroup.setTag(11);
            try {
                this.m.registerViewForInteraction(viewGroup, this.o0, this.oo, adOptionsView2, tUNativePrepareInfo.getClickViewList());
            } catch (Throwable th) {
                Log.e("BigoTUNativeAd", "prepare() >>> registerViewForInteraction() failed: " + th.getMessage());
            }
            VideoController videoController = this.m.getVideoController();
            this.om = videoController;
            if (videoController != null) {
                videoController.setVideoLifeCallback(this);
                Boolean bool = this.m0;
                if (bool != null) {
                    setVideoMute(bool.booleanValue());
                    return;
                }
                Boolean bool2 = TUSDKGlobalSetting.isGlobalMute;
                if (bool2 != null) {
                    this.om.mute(bool2.booleanValue());
                }
            }
        } catch (Throwable th2) {
            Log.e("BigoTUNativeAd", "prepare() failed: " + th2.getMessage());
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void resumeVideo() {
        VideoController videoController = this.om;
        if (videoController == null || !videoController.isPaused()) {
            return;
        }
        this.om.play();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void setVideoMute(boolean z2) {
        this.m0 = Boolean.valueOf(z2);
        VideoController videoController = this.om;
        if (videoController == null || videoController.isMuted() == z2) {
            return;
        }
        this.om.mute(z2);
    }
}
