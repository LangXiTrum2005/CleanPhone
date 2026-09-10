package com.smartdigimkt.q8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.sdk.api.format.SDMAd;
import com.smartdigimkt.sdk.api.format.SDMLossInfo;
import com.smartdigimkt.sdk.api.format.SDMNativeAd;
import com.smartdigimkt.sdk.api.format.SDMNativeAdListener;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.sdk.api.format.SDMWinInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class n implements SDMNativeAd {
    com.smartdigimkt.h5.e X;

    public class a implements com.smartdigimkt.f5.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SDMNativeAdListener f37965a;

        public a(SDMNativeAdListener sDMNativeAdListener) {
            this.f37965a = sDMNativeAdListener;
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(com.smartdigimkt.f5.j jVar) {
            SDMNativeAdListener sDMNativeAdListener = this.f37965a;
            if (sDMNativeAdListener != null) {
                sDMNativeAdListener.onAdClick();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(com.smartdigimkt.f5.j jVar) {
            SDMNativeAdListener sDMNativeAdListener = this.f37965a;
            if (sDMNativeAdListener != null) {
                sDMNativeAdListener.onAdShow();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(com.smartdigimkt.v3.h hVar) {
        }
    }

    public n(com.smartdigimkt.h5.e eVar) {
        this.X = eVar;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void destroy() {
        this.X.c();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public View generateShakeViewContainer() {
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getAdChoiceIconUrl() {
        return this.X.i();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdImageHeight() {
        return this.X.j();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdImageWidth() {
        return this.X.k();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdType() {
        return 0;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdVideoHeight() {
        return 0;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getAdVideoWidth() {
        return 0;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getAppName() {
        return "";
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getAppVersion() {
        return "";
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getCallToAction() {
        return this.X.l();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public ViewGroup getCustomAdContainer() {
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getDescription() {
        return this.X.m();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getDownloadStatus() {
        return this.X.n();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getFunctionUrl() {
        return "";
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getIcon() {
        return this.X.o();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public int getInteractionType() {
        return this.X.p();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getMainImageUrl() {
        return this.X.r();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public View getMediaView(Context context, SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
        return this.X.t();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getPermissionUrl() {
        return "";
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getPrivacyUrl() {
        return "";
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getPublisher() {
        return "";
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public SDMAd getSDMAd() {
        return null;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public String getTitle() {
        return this.X.u();
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public long getVideoCurrentPosition() {
        return 0L;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public long getVideoDuration() {
        return 0L;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public boolean isAdReady() {
        com.smartdigimkt.h5.e eVar = this.X;
        if (eVar != null) {
            return eVar.isReady();
        }
        return false;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public boolean isDownloadApp() {
        return false;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public boolean isTemplateAd() {
        return false;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public void notifyLoss(SDMLossInfo sDMLossInfo) {
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public void notifyWin(SDMWinInfo sDMWinInfo) {
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void onPause() {
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void onResume() {
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void pauseVideo() {
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void registerAdView(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
        com.smartdigimkt.h5.e eVar = this.X;
        if (eVar != null) {
            eVar.a(view, list, list2);
        }
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void resumeVideo() {
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void setAutoPlay(String str) {
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void setListener(SDMNativeAdListener sDMNativeAdListener) {
        this.X.a(new a(sDMNativeAdListener));
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void setMute(boolean z2) {
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMNativeAd
    public void unregisterView() {
        this.X.x();
    }
}
