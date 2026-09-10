package com.thinkup.network.startapp;

import android.view.View;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.ads.nativead.NativeAdDisplayListener;
import com.startapp.sdk.ads.nativead.NativeAdInterface;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class StartAppATNAd extends CustomNativeAd {
    NativeAdDetails o;

    public StartAppATNAd(NativeAdDetails nativeAdDetails) {
        this.o = nativeAdDetails;
        initData();
    }

    public void initData() {
        NativeAdDetails nativeAdDetails = this.o;
        if (nativeAdDetails != null) {
            setTitle(nativeAdDetails.getTitle());
            setDescriptionText(this.o.getDescription());
            setStarRating(Double.valueOf(this.o.getRating()));
            if (this.o.getImageBitmap() != null) {
                setMainImageUrl(this.o.getImageUrl());
                setMainImageWidth(this.o.getImageBitmap().getWidth());
                setMainImageHeight(this.o.getImageBitmap().getHeight());
            } else {
                setMainImageUrl(this.o.getImageUrl());
            }
            setIconImageUrl(this.o.getSecondaryImageUrl());
            setCallToActionText(this.o.getCallToAction());
        }
    }

    @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.o
    public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
        List<View> clickViewList = tUNativePrepareInfo.getClickViewList();
        if (clickViewList == null) {
            clickViewList = new ArrayList<>(1);
        }
        this.o.registerViewForInteraction(view, clickViewList, new NativeAdDisplayListener() { // from class: com.thinkup.network.startapp.StartAppATNAd.1
            @Override // com.startapp.sdk.ads.nativead.NativeAdDisplayListener
            public final void adClicked(NativeAdInterface nativeAdInterface) {
                StartAppATNAd.this.notifyAdClicked();
            }

            @Override // com.startapp.sdk.ads.nativead.NativeAdDisplayListener
            public final void adDisplayed(NativeAdInterface nativeAdInterface) {
                StartAppATNAd.this.notifyAdImpression();
            }

            @Override // com.startapp.sdk.ads.nativead.NativeAdDisplayListener
            public final void adHidden(NativeAdInterface nativeAdInterface) {
            }

            @Override // com.startapp.sdk.ads.nativead.NativeAdDisplayListener
            public final void adNotDisplayed(NativeAdInterface nativeAdInterface) {
            }
        });
    }
}
