package com.google.ads.mediation.inmobi;

import android.view.ViewGroup;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiBannerWrapper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final InMobiBanner f18878attabal;

    public InMobiBannerWrapper(InMobiBanner inMobiBanner) {
        this.f18878attabal = inMobiBanner;
    }

    public InMobiBanner getInMobiBanner() {
        return this.f18878attabal;
    }

    public void load() {
        this.f18878attabal.load();
    }

    public void setAnimationType(InMobiBanner.AnimationType animationType) {
        this.f18878attabal.setAnimationType(animationType);
    }

    public void setEnableAutoRefresh(Boolean bool) {
        this.f18878attabal.setEnableAutoRefresh(bool.booleanValue());
    }

    public void setExtras(Map<String, String> map) {
        this.f18878attabal.setExtras(map);
    }

    public void setKeywords(String str) {
        this.f18878attabal.setKeywords(str);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        this.f18878attabal.setLayoutParams(layoutParams);
    }

    public void setListener(BannerAdEventListener bannerAdEventListener) {
        this.f18878attabal.setListener(bannerAdEventListener);
    }

    public void setWatermarkData(WatermarkData watermarkData) {
        this.f18878attabal.setWatermarkData(watermarkData);
    }

    public void load(byte[] bArr) {
        this.f18878attabal.load(bArr);
    }
}
