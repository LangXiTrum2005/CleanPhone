package com.thinkup.core.common.inner.mixad.n;

import android.graphics.Bitmap;
import android.view.View;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ITUAdvertiserInfoOperate;
import com.thinkup.core.api.ITUThirdPartyMaterial;
import com.thinkup.core.api.TUAdAppInfo;
import com.thinkup.core.api.TUCompViewListener;
import com.thinkup.core.api.TUCustomVideo;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.core.common.mn.oo.o.on;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements ITUThirdPartyMaterial {
    private final on m;
    private final BaseAd o;

    public o0(BaseAd baseAd, on onVar) {
        this.o = baseAd;
        this.m = onVar;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final TUAdAppInfo getAdAppInfo() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getAdAppInfo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getAdChoiceIconUrl() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdFrom() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getAdFrom() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdIconView() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getAdIconView();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Bitmap getAdLogo() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getAdLogo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdLogoView() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getAdLogoView();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getAdMediaView(objArr);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdType() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getAdType() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final ITUAdvertiserInfoOperate getAdvertiserInfoOperate() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getAdvertiserInfoOperate();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdvertiserName() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getAdvertiserName() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getAppCommentNum() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getAppCommentNum();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getAppPrice() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getAppPrice();
        }
        return 0.0d;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getCallToActionButton() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getCallToActionButton();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getCallToActionText() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getCallToActionText() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getDescriptionText() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getDescriptionText() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getDomain() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getDomain() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getDownloadProgress() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getDownloadProgress();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getDownloadStatus() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getDownloadStatus();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getIconImageUrl() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getIconImageUrl() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final List<String> getImageUrlList() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getImageUrlList();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getMainImageHeight() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getMainImageHeight();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getMainImageUrl() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getMainImageUrl() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getMainImageWidth() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getMainImageWidth();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getNativeAdInteractionType();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final TUCustomVideo getNativeCustomVideo() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getNativeCustomVideo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeExpressHeight() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getNativeExpressHeight();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeExpressWidth() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getNativeExpressWidth();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeType() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getNativeType();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getNetworkInfoMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getRoateView(Map<String, Object> map, TUCompViewListener tUCompViewListener) {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getRoateView(map, tUCompViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getShakeView(int i2, int i3, TUShakeViewListener tUShakeViewListener) {
        on onVar = this.m;
        if (onVar != null) {
            return onVar.o(i2, i3, tUShakeViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getSlideView(int i2, int i3, int i4, TUShakeViewListener tUShakeViewListener) {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getSlideView(i2, i3, i4, tUShakeViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Double getStarRating() {
        BaseAd baseAd = this.o;
        return (baseAd == null || baseAd.getStarRating() == null) ? Double.valueOf(0.0d) : this.o.getStarRating();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getTitle() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getTitle() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getVideoDuration() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getVideoDuration();
        }
        return 0.0d;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getVideoHeight() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getVideoHeight();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getVideoProgress() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getVideoProgress();
        }
        return 0.0d;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getVideoUrl() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getVideoUrl() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getVideoWidth() {
        BaseAd baseAd = this.o;
        if (baseAd != null) {
            return baseAd.getVideoWidth();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getWarning() {
        BaseAd baseAd = this.o;
        return baseAd != null ? baseAd.getWarning() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final boolean supportSetPermissionClickViewList() {
        BaseAd baseAd = this.o;
        return baseAd != null && baseAd.supportSetPermissionClickViewList();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final boolean supportSetPrivacyClickViewList() {
        BaseAd baseAd = this.o;
        return baseAd != null && baseAd.supportSetPrivacyClickViewList();
    }
}
