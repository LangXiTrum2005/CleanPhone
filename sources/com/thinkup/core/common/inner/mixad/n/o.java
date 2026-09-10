package com.thinkup.core.common.inner.mixad.n;

import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNativeAdInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements TUNativeAdInfo.AdController {
    private BaseAd o;

    public o(BaseAd baseAd) {
        this.o = baseAd;
    }

    @Override // com.thinkup.core.api.TUNativeAdInfo.AdController
    public final void pauseVideo() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            baseAd.pauseVideo();
        }
    }

    @Override // com.thinkup.core.api.TUNativeAdInfo.AdController
    public final void resumeVideo() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            baseAd.resumeVideo();
        }
    }

    @Override // com.thinkup.core.api.TUNativeAdInfo.AdController
    public final void setVideoMute(boolean z2) {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            baseAd.setVideoMute(z2);
        }
    }
}
