package com.thinkup.core.api;

import android.graphics.Bitmap;
import android.view.View;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface ITUThirdPartyMaterial {
    TUAdAppInfo getAdAppInfo();

    String getAdChoiceIconUrl();

    String getAdFrom();

    View getAdIconView();

    Bitmap getAdLogo();

    View getAdLogoView();

    View getAdMediaView(Object... objArr);

    String getAdType();

    ITUAdvertiserInfoOperate getAdvertiserInfoOperate();

    String getAdvertiserName();

    int getAppCommentNum();

    double getAppPrice();

    View getCallToActionButton();

    String getCallToActionText();

    String getDescriptionText();

    String getDomain();

    int getDownloadProgress();

    int getDownloadStatus();

    String getIconImageUrl();

    List<String> getImageUrlList();

    int getMainImageHeight();

    String getMainImageUrl();

    int getMainImageWidth();

    int getNativeAdInteractionType();

    TUCustomVideo getNativeCustomVideo();

    int getNativeExpressHeight();

    int getNativeExpressWidth();

    int getNativeType();

    Map<String, Object> getNetworkInfoMap();

    View getRoateView(Map<String, Object> map, TUCompViewListener tUCompViewListener);

    View getShakeView(int i2, int i3, TUShakeViewListener tUShakeViewListener);

    View getSlideView(int i2, int i3, int i4, TUShakeViewListener tUShakeViewListener);

    Double getStarRating();

    String getTitle();

    double getVideoDuration();

    int getVideoHeight();

    double getVideoProgress();

    String getVideoUrl();

    int getVideoWidth();

    String getWarning();

    boolean supportSetPermissionClickViewList();

    boolean supportSetPrivacyClickViewList();
}
