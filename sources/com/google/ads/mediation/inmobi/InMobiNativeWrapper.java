package com.google.ads.mediation.inmobi;

import android.view.View;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiNativeWrapper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final InMobiNative f18892attabal;

    public InMobiNativeWrapper(InMobiNative inMobiNative) {
        this.f18892attabal = inMobiNative;
    }

    public void destroy() {
        this.f18892attabal.destroy();
    }

    public View getAdChoiceIcon() {
        return this.f18892attabal.getAdChoiceIcon();
    }

    public String getAdCtaText() {
        return this.f18892attabal.getCtaText();
    }

    public String getAdDescription() {
        return this.f18892attabal.getAdDescription();
    }

    public String getAdIconUrl() {
        InMobiNativeImage adIcon = this.f18892attabal.getAdIcon();
        if (adIcon == null) {
            return null;
        }
        return adIcon.getUrl();
    }

    public float getAdRating() {
        return this.f18892attabal.getAdRating();
    }

    public String getAdTitle() {
        return this.f18892attabal.getAdTitle();
    }

    public String getAdvertiserName() {
        return this.f18892attabal.getAdvertiserName();
    }

    public JSONObject getCustomAdContent() {
        return this.f18892attabal.getAdContent();
    }

    public InMobiNative getInMobiNative() {
        return this.f18892attabal;
    }

    public MediaView getMediaView() {
        return this.f18892attabal.getMediaView();
    }

    public Boolean isVideo() {
        return Boolean.valueOf(this.f18892attabal.isVideo());
    }

    public void load() {
        this.f18892attabal.load();
    }

    public void registerForTracking(InMobiNativeViewData inMobiNativeViewData) {
        this.f18892attabal.registerViewForTracking(inMobiNativeViewData);
    }

    public void setExtras(Map<String, String> map) {
        this.f18892attabal.setExtras(map);
    }

    public void setKeywords(String str) {
        this.f18892attabal.setKeywords(str);
    }

    public void setVideoEventListener(VideoEventListener videoEventListener) {
        this.f18892attabal.setVideoEventListener(videoEventListener);
    }

    public void unTrackViews() {
        this.f18892attabal.unTrackViews();
    }

    public void load(byte[] bArr) {
        this.f18892attabal.load(bArr);
    }
}
