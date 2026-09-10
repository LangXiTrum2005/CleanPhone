package com.google.ads.mediation.inmobi;

import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.WatermarkData;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiInterstitialWrapper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final InMobiInterstitial f18886attabal;

    public InMobiInterstitialWrapper(InMobiInterstitial inMobiInterstitial) {
        this.f18886attabal = inMobiInterstitial;
    }

    public InMobiInterstitial getInMobiInterstitial() {
        return this.f18886attabal;
    }

    public Boolean isReady() {
        return Boolean.valueOf(this.f18886attabal.isReady());
    }

    public void load() {
        this.f18886attabal.load();
    }

    public void setExtras(Map<String, String> map) {
        this.f18886attabal.setExtras(map);
    }

    public void setKeywords(String str) {
        this.f18886attabal.setKeywords(str);
    }

    public void setWatermarkData(WatermarkData watermarkData) {
        this.f18886attabal.setWatermarkData(watermarkData);
    }

    public void show() {
        this.f18886attabal.show();
    }

    public void load(byte[] bArr) {
        this.f18886attabal.load(bArr);
    }
}
