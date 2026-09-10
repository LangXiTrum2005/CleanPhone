package com.thinkup.nativead.o;

import android.graphics.Bitmap;
import android.view.View;
import com.thinkup.core.api.ITUAdvertiserInfoOperate;
import com.thinkup.core.api.TUAdAppInfo;
import com.thinkup.core.api.TUCompViewListener;
import com.thinkup.core.api.TUCustomVideo;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.nativead.api.TUNativeMaterial;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements TUNativeMaterial {
    boolean m;
    CustomNativeAd o;

    public m(CustomNativeAd customNativeAd, boolean z2) {
        this.o = customNativeAd;
        this.m = z2;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final TUAdAppInfo getAdAppInfo() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getAdAppInfo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getAdChoiceIconUrl() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdFrom() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getAdFrom() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdIconView() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getAdIconView();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Bitmap getAdLogo() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getAdLogo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdLogoView() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getAdLogoView();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        CustomNativeAd customNativeAd;
        if (this.m || this.o.isNativeExpress() || (customNativeAd = this.o) == null) {
            return null;
        }
        return customNativeAd.getAdMediaView(objArr);
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdType() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getAdType() : "0";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final ITUAdvertiserInfoOperate getAdvertiserInfoOperate() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getAdvertiserInfoOperate();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdvertiserName() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getAdvertiserName() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getAppCommentNum() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getAppCommentNum();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getAppPrice() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getAppPrice();
        }
        return 0.0d;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getCallToActionButton() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getCallToActionButton();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getCallToActionText() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getCallToActionText() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getDescriptionText() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getDescriptionText() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getDomain() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getDomain() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getDownloadProgress() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getDownloadProgress();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getDownloadStatus() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getDownloadStatus();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getIconImageUrl() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getIconImageUrl() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final List<String> getImageUrlList() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getImageUrlList();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getMainImageHeight() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getMainImageHeight();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getMainImageUrl() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getMainImageUrl() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getMainImageWidth() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getMainImageWidth();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getNativeAdInteractionType();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final TUCustomVideo getNativeCustomVideo() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getNativeCustomVideo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeExpressHeight() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getNativeExpressHeight();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeExpressWidth() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getNativeExpressWidth();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeType() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getNativeType();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getNetworkInfoMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getRoateView(Map<String, Object> map, TUCompViewListener tUCompViewListener) {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getRoateView(map, tUCompViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getShakeView(int i2, int i3, TUShakeViewListener tUShakeViewListener) {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getShakeView(i2, i3, tUShakeViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getSlideView(int i2, int i3, int i4, TUShakeViewListener tUShakeViewListener) {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getSlideView(i2, i3, i4, tUShakeViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Double getStarRating() {
        CustomNativeAd customNativeAd = this.o;
        double dDoubleValue = 0.0d;
        if (customNativeAd != null && customNativeAd.getStarRating() != null) {
            dDoubleValue = this.o.getStarRating().doubleValue();
        }
        return Double.valueOf(dDoubleValue);
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getTitle() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getTitle() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getVideoDuration() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getVideoDuration();
        }
        return 0.0d;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getVideoHeight() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getVideoHeight();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getVideoProgress() {
        return this.o.getVideoProgress();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getVideoUrl() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getVideoUrl() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getVideoWidth() {
        CustomNativeAd customNativeAd = this.o;
        if (customNativeAd != null) {
            return customNativeAd.getVideoWidth();
        }
        return 0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getWarning() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null ? customNativeAd.getWarning() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final boolean supportSetPermissionClickViewList() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null && customNativeAd.supportSetPermissionClickViewList();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final boolean supportSetPrivacyClickViewList() {
        CustomNativeAd customNativeAd = this.o;
        return customNativeAd != null && customNativeAd.supportSetPrivacyClickViewList();
    }
}
