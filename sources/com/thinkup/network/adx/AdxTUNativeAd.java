package com.thinkup.network.adx;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.format.SDMNativeAd;
import com.smartdigimkt.sdk.api.format.SDMNativeAdListener;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.nativead.api.TUNativePrepareExInfo;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class AdxTUNativeAd extends CustomNativeAd {
    Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f42521n;
    SDMNativeAd o;
    View o0;
    private WeakReference<AdxTUAdapter> om;
    Object oo;

    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    public AdxTUNativeAd(Context context, SDMNativeAd sDMNativeAd, AdxTUAdapter adxTUAdapter) {
        this.m = context.getApplicationContext();
        this.o = sDMNativeAd;
        this.om = new WeakReference<>(adxTUAdapter);
        this.o.setListener(new SDMNativeAdListener() { // from class: com.thinkup.network.adx.AdxTUNativeAd.1
            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onAdClick() {
                AdxTUNativeAd.this.notifyAdClicked();
            }

            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onAdClosed() {
                AdxTUNativeAd.this.notifyAdDislikeClick();
            }

            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onAdShow() {
                AdxTUNativeAd.this.notifyAdImpression();
            }

            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onDeeplinkCallback(boolean z2) {
                AdxTUNativeAd.this.notifyDeeplinkCallback(z2);
            }

            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onShowFailed(AdError adError) {
            }
        });
        this.f42521n = sDMNativeAd.isTemplateAd();
        int adType = this.o.getAdType();
        if (adType == 1) {
            this.mAdSourceType = "1";
        } else if (adType == 2) {
            this.mAdSourceType = "2";
        }
        if (this.o.isTemplateAd()) {
            return;
        }
        setAdChoiceIconUrl(this.o.getAdChoiceIconUrl());
        setTitle(this.o.getTitle());
        setDescriptionText(this.o.getDescription());
        setIconImageUrl(this.o.getIcon());
        String mainImageUrl = this.o.getMainImageUrl();
        setMainImageUrl(mainImageUrl);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(mainImageUrl)) {
            arrayList.add(mainImageUrl);
        }
        setImageUrlList(arrayList);
        setCallToActionText(this.o.getCallToAction());
        if (this.o.isDownloadApp()) {
            setAdAppInfo(new AdxAppInfo(this.o));
        }
        int interactionType = this.o.getInteractionType();
        if (interactionType == 1) {
            setNativeInteractionType(1);
        } else if (interactionType == 2 || interactionType == 3) {
            setNativeInteractionType(2);
        } else if (interactionType == 4) {
            setNativeInteractionType(1);
        } else if (interactionType == 6 || interactionType == 7) {
            setNativeInteractionType(3);
        }
        setMainImageWidth(this.o.getAdImageWidth());
        setMainImageHeight(this.o.getAdImageHeight());
        setVideoWidth(this.o.getAdVideoWidth());
        setVideoHeight(this.o.getAdVideoHeight());
        setVideoDuration(this.o.getVideoDuration() / 1000.0d);
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void clear(View view) {
        SDMNativeAd sDMNativeAd = this.o;
        if (sDMNativeAd != null) {
            sDMNativeAd.unregisterView();
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void destroy() {
        AdxTUAdapter adxTUAdapter;
        WeakReference<AdxTUAdapter> weakReference = this.om;
        if (weakReference != null && (adxTUAdapter = weakReference.get()) != null) {
            adxTUAdapter.destory();
            this.om.clear();
        }
        SDMNativeAd sDMNativeAd = this.o;
        if (sDMNativeAd != null) {
            sDMNativeAd.setListener(null);
            this.o.destroy();
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.o0 == null) {
            this.o0 = this.o.getMediaView(this.m, new SDMNativeAdMediaViewListener() { // from class: com.thinkup.network.adx.AdxTUNativeAd.2
                @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
                public final void onProgressUpdate(long j, long j2) {
                    if (AdxTUNativeAd.this.getVideoDuration() == 0.0d) {
                        AdxTUNativeAd.this.setVideoDuration(j2 / 1000.0d);
                    }
                    AdxTUNativeAd.this.notifyAdVideoPlayProgress((int) (j / 1000.0d));
                }

                @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
                public final void onVideoAdComplete() {
                    AdxTUNativeAd.this.notifyAdVideoEnd();
                }

                @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
                public final void onVideoAdStartPlay(long j) {
                    AdxTUNativeAd.this.setVideoDuration(j / 1000.0d);
                    AdxTUNativeAd.this.notifyAdVideoStart();
                }

                @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener
                public final void onVideoError(String str, String str2) {
                    AdxTUNativeAd.this.notifyAdVideoVideoPlayFail(str, str2);
                }
            });
        }
        return this.o0;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public ViewGroup getCustomAdContainer() {
        return this.o.getCustomAdContainer();
    }

    @Override // com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public int getDownloadStatus() {
        int downloadStatus;
        SDMNativeAd sDMNativeAd = this.o;
        if (sDMNativeAd == null || (downloadStatus = sDMNativeAd.getDownloadStatus()) < 0) {
            return 0;
        }
        return downloadStatus;
    }

    @Override // com.thinkup.nativead.unitgroup.o
    public Object getObject() {
        return this.oo;
    }

    @Override // com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getShakeView(int i2, int i3, TUShakeViewListener tUShakeViewListener) {
        return this.o.generateShakeViewContainer();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public double getVideoProgress() {
        SDMNativeAd sDMNativeAd = this.o;
        return sDMNativeAd != null ? sDMNativeAd.getVideoCurrentPosition() / 1000.0d : super.getVideoProgress();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public boolean isNativeExpress() {
        return this.o.isTemplateAd();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void onPause() {
        SDMNativeAd sDMNativeAd = this.o;
        if (sDMNativeAd != null) {
            sDMNativeAd.onPause();
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void onResume() {
        SDMNativeAd sDMNativeAd = this.o;
        if (sDMNativeAd != null) {
            sDMNativeAd.onResume();
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void pauseVideo() {
        this.o.pauseVideo();
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        SDMNativeAd sDMNativeAd = this.o;
        if (sDMNativeAd != null) {
            sDMNativeAd.onResume();
        }
        if (this.o != null) {
            this.o.registerAdView(view, tUNativePrepareInfo.getClickViewList(), tUNativePrepareInfo instanceof TUNativePrepareExInfo ? ((TUNativePrepareExInfo) tUNativePrepareInfo).getCreativeClickViewList() : null, tUNativePrepareInfo.getChoiceViewLayoutParams(), tUNativePrepareInfo.getCloseView());
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void resumeVideo() {
        this.o.resumeVideo();
    }

    public void setAdObject(Object obj) {
        this.oo = obj;
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.core.api.BaseAd
    public void setVideoMute(boolean z2) {
        super.setVideoMute(z2);
        SDMNativeAd sDMNativeAd = this.o;
        if (sDMNativeAd != null) {
            sDMNativeAd.setMute(z2);
        }
    }
}
