package com.thinkup.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class FacebookTUBaseNativeAd<T extends NativeAdBase> extends CustomNativeAd implements NativeAdListener {
    Context m;
    MediaView m0;
    private final String mo = "FacebookTUBaseNativeAd";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42550n;
    T o;
    o o0;
    NativeAdLayout om;
    MediaView on;
    Map<String, Object> oo;

    public interface o {
        void onLoadFail(String str, String str2);

        void onLoadSuccess();
    }

    public FacebookTUBaseNativeAd(Context context, T t, boolean z2) {
        this.m = context.getApplicationContext();
        this.o = t;
        this.f42550n = z2;
    }

    private void o(View view, FrameLayout.LayoutParams layoutParams) {
        AdOptionsView adOptionsView = new AdOptionsView(view.getContext(), this.o, this.om);
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 53;
        }
        if (layoutParams.height > 0) {
            adOptionsView.setIconSizeDp((int) ((layoutParams.height / this.m.getResources().getDisplayMetrics().density) + 0.5f));
        }
        this.om.addView(adOptionsView, layoutParams);
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
        T t = this.o;
        if (t != null) {
            t.unregisterView();
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        T t = this.o;
        if (t != null) {
            t.unregisterView();
            this.o.destroy();
            this.o = null;
        }
        MediaView mediaView = this.on;
        if (mediaView != null) {
            mediaView.setListener(null);
            this.on.destroy();
            this.on = null;
        }
        this.m = null;
        MediaView mediaView2 = this.m0;
        if (mediaView2 != null) {
            mediaView2.destroy();
            this.m0 = null;
        }
        this.om = null;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public String getAdFrom() {
        T t;
        return (this.f42550n || (t = this.o) == null) ? "" : t.getSponsoredTranslation();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdIconView() {
        if (this.f42550n) {
            return null;
        }
        try {
            MediaView mediaView = this.m0;
            if (mediaView != null) {
                mediaView.destroy();
                this.m0 = null;
            }
            MediaView mediaView2 = new MediaView(this.m);
            this.m0 = mediaView2;
            return mediaView2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        try {
            if (this.on == null) {
                MediaView mediaView = new MediaView(this.m);
                this.on = mediaView;
                mediaView.setListener(new MediaViewListener() { // from class: com.thinkup.network.facebook.FacebookTUBaseNativeAd.1
                    @Override // com.facebook.ads.MediaViewListener
                    public final void onComplete(MediaView mediaView2) {
                        FacebookTUBaseNativeAd.this.notifyAdVideoEnd();
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onEnterFullscreen(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onExitFullscreen(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onFullscreenBackground(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onFullscreenForeground(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onPause(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onPlay(MediaView mediaView2) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public final void onVolumeChange(MediaView mediaView2, float f) {
                    }
                });
            }
            return this.on;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public String getAdvertiserName() {
        T t;
        return (this.f42550n || (t = this.o) == null) ? "" : t.getAdvertiserName();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public String getCallToActionText() {
        T t;
        return (this.f42550n || (t = this.o) == null) ? "" : t.getAdCallToAction();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        if (this.f42550n) {
            return null;
        }
        NativeAdLayout nativeAdLayout = new NativeAdLayout(this.m);
        this.om = nativeAdLayout;
        return nativeAdLayout;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public String getDescriptionText() {
        T t;
        return (this.f42550n || (t = this.o) == null) ? "" : t.getAdBodyText();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public int getMainImageHeight() {
        T t;
        NativeAdBase.Image adCoverImage;
        if (this.f42550n || (t = this.o) == null || (adCoverImage = t.getAdCoverImage()) == null) {
            return 0;
        }
        return adCoverImage.getHeight();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public int getMainImageWidth() {
        T t;
        NativeAdBase.Image adCoverImage;
        if (this.f42550n || (t = this.o) == null || (adCoverImage = t.getAdCoverImage()) == null) {
            return 0;
        }
        return adCoverImage.getWidth();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public String getTitle() {
        T t;
        return (this.f42550n || (t = this.o) == null) ? "" : t.getAdHeadline();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public boolean isNativeExpress() {
        return this.f42550n;
    }

    public void loadAd(String str, o oVar) {
        this.o0 = oVar;
        if (TextUtils.isEmpty(str)) {
            this.o.loadAd(this.o.buildLoadAdConfig().withAdListener(this).build());
            return;
        }
        HashMap map = new HashMap();
        this.oo = map;
        FacebookTUInitManager.getInstance();
        map.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookTUInitManager.o(str));
        setNetworkInfoMap(this.oo);
        this.o.loadAd(this.o.buildLoadAdConfig().withAdListener(this).withBid(str).build());
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        notifyAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        o oVar = this.o0;
        if (oVar != null) {
            oVar.onLoadSuccess();
        }
        this.o0 = null;
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        o oVar = this.o0;
        if (oVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(adError.getErrorCode());
            oVar.onLoadFail(sb.toString(), adError.getErrorMessage());
        }
        this.o0 = null;
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        notifyAdImpression();
    }

    @Override // com.facebook.ads.NativeAdListener
    public void onMediaDownloaded(Ad ad) {
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        if (this.f42550n || view == null) {
            return;
        }
        try {
            List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
            FrameLayout.LayoutParams choiceViewLayoutParams = tUNativePrepareInfo.getChoiceViewLayoutParams();
            T t = this.o;
            if (t instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) t;
                if (clickViewList == null || clickViewList.size() <= 0) {
                    NativeAdLayout nativeAdLayout = this.om;
                    if (nativeAdLayout != null) {
                        nativeAd.registerViewForInteraction(nativeAdLayout, this.on, this.m0);
                    } else {
                        nativeAd.registerViewForInteraction(view, this.on, this.m0);
                    }
                } else {
                    NativeAdLayout nativeAdLayout2 = this.om;
                    if (nativeAdLayout2 != null) {
                        nativeAd.registerViewForInteraction(nativeAdLayout2, this.on, this.m0, clickViewList);
                    } else {
                        nativeAd.registerViewForInteraction(view, this.on, this.m0, clickViewList);
                    }
                }
            } else if (t instanceof NativeBannerAd) {
                NativeBannerAd nativeBannerAd = (NativeBannerAd) t;
                if (clickViewList == null || clickViewList.size() <= 0) {
                    NativeAdLayout nativeAdLayout3 = this.om;
                    if (nativeAdLayout3 != null) {
                        nativeBannerAd.registerViewForInteraction(nativeAdLayout3, this.m0);
                    } else {
                        nativeBannerAd.registerViewForInteraction(view, this.m0);
                    }
                } else {
                    NativeAdLayout nativeAdLayout4 = this.om;
                    if (nativeAdLayout4 != null) {
                        nativeBannerAd.registerViewForInteraction(nativeAdLayout4, this.m0, clickViewList);
                    } else {
                        nativeBannerAd.registerViewForInteraction(view, this.m0, clickViewList);
                    }
                }
            }
            AdOptionsView adOptionsView = new AdOptionsView(view.getContext(), this.o, this.om);
            if (choiceViewLayoutParams == null) {
                choiceViewLayoutParams = new FrameLayout.LayoutParams(-2, -2);
                choiceViewLayoutParams.gravity = 53;
            }
            if (choiceViewLayoutParams.height > 0) {
                adOptionsView.setIconSizeDp((int) ((choiceViewLayoutParams.height / this.m.getResources().getDisplayMetrics().density) + 0.5f));
            }
            this.om.addView(adOptionsView, choiceViewLayoutParams);
        } catch (Throwable unused) {
        }
    }
}
