package com.inmobi.media.ads.network.common.model;

import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/inmobi/media/ads/network/common/model/AdQualityControl;", "", "<init>", "()V", "takeScreenshot", "", "getTakeScreenshot", "()Z", "setTakeScreenshot", "(Z)V", "enableSdkAdQuality", "getEnableSdkAdQuality", "setEnableSdkAdQuality", "screenshotDelayInSeconds", "", "getScreenshotDelayInSeconds", "()F", "setScreenshotDelayInSeconds", "(F)V", "beacon", "", "getBeacon", "()Ljava/lang/String;", "setBeacon", "(Ljava/lang/String;)V", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdQualityControl {
    private String beacon;
    private boolean enableSdkAdQuality;
    private float screenshotDelayInSeconds;
    private boolean takeScreenshot;

    public final String getBeacon() {
        return this.beacon;
    }

    public final boolean getEnableSdkAdQuality() {
        return this.enableSdkAdQuality;
    }

    public final float getScreenshotDelayInSeconds() {
        return this.screenshotDelayInSeconds;
    }

    public final boolean getTakeScreenshot() {
        return this.takeScreenshot;
    }

    public final void setBeacon(String str) {
        this.beacon = str;
    }

    public final void setEnableSdkAdQuality(boolean z) {
        this.enableSdkAdQuality = z;
    }

    public final void setScreenshotDelayInSeconds(float f) {
        this.screenshotDelayInSeconds = f;
    }

    public final void setTakeScreenshot(boolean z) {
        this.takeScreenshot = z;
    }
}
