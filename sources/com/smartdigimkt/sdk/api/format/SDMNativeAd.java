package com.smartdigimkt.sdk.api.format;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface SDMNativeAd extends SDMAdHandler {
    void destroy();

    View generateShakeViewContainer();

    String getAdChoiceIconUrl();

    int getAdImageHeight();

    int getAdImageWidth();

    int getAdType();

    int getAdVideoHeight();

    int getAdVideoWidth();

    String getAppName();

    String getAppVersion();

    String getCallToAction();

    ViewGroup getCustomAdContainer();

    String getDescription();

    int getDownloadStatus();

    String getFunctionUrl();

    String getIcon();

    int getInteractionType();

    String getMainImageUrl();

    View getMediaView(Context context, SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener);

    String getPermissionUrl();

    String getPrivacyUrl();

    String getPublisher();

    String getTitle();

    long getVideoCurrentPosition();

    long getVideoDuration();

    boolean isAdReady();

    boolean isDownloadApp();

    boolean isTemplateAd();

    void onPause();

    void onResume();

    void pauseVideo();

    void registerAdView(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2);

    void resumeVideo();

    void setAutoPlay(String str);

    void setListener(SDMNativeAdListener sDMNativeAdListener);

    void setMute(boolean z2);

    void unregisterView();
}
