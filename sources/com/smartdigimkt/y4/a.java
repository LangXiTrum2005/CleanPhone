package com.smartdigimkt.y4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    void a(int i2, int i3);

    void a(com.smartdigimkt.f5.a aVar);

    void a(JSONArray jSONArray);

    boolean a(boolean z2, boolean z3);

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

    com.smartdigimkt.w6.f getBaseAdContent();

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

    boolean isDownloadApp();

    boolean isTemplateAd();

    void onPause();

    void onResume();

    void pauseVideo();

    void registerAdView(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2);

    void resumeVideo();

    void setAutoPlay(String str);

    void setMute(boolean z2);

    void unregisterView();
}
