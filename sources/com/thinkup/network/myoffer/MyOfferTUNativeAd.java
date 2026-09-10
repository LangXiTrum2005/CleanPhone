package com.thinkup.network.myoffer;

import android.content.Context;
import android.view.View;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.format.SDMNativeAd;
import com.smartdigimkt.sdk.api.format.SDMNativeAdListener;
import com.thinkup.nativead.api.TUNativePrepareExInfo;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;

/* JADX INFO: loaded from: classes6.dex */
public class MyOfferTUNativeAd extends CustomNativeAd {
    Context m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    View f42603n;
    SDMNativeAd o;

    /* JADX WARN: Code duplicated, block: B:17:0x0068  */
    public MyOfferTUNativeAd(Context context, SDMNativeAd sDMNativeAd) {
        this.m = context.getApplicationContext();
        this.o = sDMNativeAd;
        sDMNativeAd.setListener(new SDMNativeAdListener() { // from class: com.thinkup.network.myoffer.MyOfferTUNativeAd.1
            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onAdClick() {
                MyOfferTUNativeAd.this.notifyAdClicked();
            }

            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onAdClosed() {
                MyOfferTUNativeAd.this.notifyAdDislikeClick();
            }

            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onAdShow() {
                MyOfferTUNativeAd.this.notifyAdImpression();
            }

            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onDeeplinkCallback(boolean z2) {
                MyOfferTUNativeAd.this.notifyDeeplinkCallback(z2);
            }

            @Override // com.smartdigimkt.sdk.api.format.SDMNativeAdListener
            public final void onShowFailed(AdError adError) {
            }
        });
        setAdChoiceIconUrl(this.o.getAdChoiceIconUrl());
        setTitle(this.o.getTitle());
        setDescriptionText(this.o.getDescription());
        setIconImageUrl(this.o.getIcon());
        setMainImageUrl(this.o.getMainImageUrl());
        setCallToActionText(this.o.getCallToAction());
        int interactionType = sDMNativeAd.getInteractionType();
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
        SDMNativeAd sDMNativeAd = this.o;
        if (sDMNativeAd != null) {
            sDMNativeAd.setListener(null);
            this.o.destroy();
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o, com.thinkup.core.api.ITUThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        if (this.f42603n == null) {
            this.f42603n = this.o.getMediaView(this.m, null);
        }
        return this.f42603n;
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

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        if (this.o != null) {
            this.o.registerAdView(view, tUNativePrepareInfo.getClickViewList(), tUNativePrepareInfo instanceof TUNativePrepareExInfo ? ((TUNativePrepareExInfo) tUNativePrepareInfo).getCreativeClickViewList() : null, null, null);
        }
    }
}
