package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes6.dex */
public class NativeAdPreferences extends AdPreferences {
    private static final int DEFAULT_ADS_NUMBER = 1;
    private static final boolean DEFAULT_AUTO_DOWNLOAD_BITMAP = false;
    private static final boolean DEFAULT_IS_CONTENT_AD = false;
    private static final boolean DEFAULT_USE_SIMPLE_TOKEN = true;
    private static final long serialVersionUID = 4908967312868830516L;
    private int adsNumber;
    private boolean autoBitmapDownload;
    private NativeAdBitmapSize bitmapSize;
    private boolean isContentAd;
    private int moreImage;
    private int primaryImage;
    private boolean useSimpleToken;

    public enum NativeAdBitmapSize {
        SIZE72X72(72, 72),
        SIZE100X100(100, 100),
        SIZE150X150(150, 150),
        SIZE340X340(340, 340);

        final int height;
        final int width;

        NativeAdBitmapSize(int i2, int i3) {
            this.width = i2;
            this.height = i3;
        }

        public int getHeight() {
            return this.height;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public NativeAdPreferences() {
        this.adsNumber = 1;
        this.autoBitmapDownload = false;
        this.primaryImage = -1;
        this.moreImage = -1;
        this.isContentAd = false;
        this.useSimpleToken = true;
    }

    public int getAdsNumber() {
        return this.adsNumber;
    }

    public NativeAdBitmapSize getImageSize() {
        return this.bitmapSize;
    }

    public int getPrimaryImageSize() {
        return this.primaryImage;
    }

    public int getSecondaryImageSize() {
        return this.moreImage;
    }

    public boolean isAutoBitmapDownload() {
        return this.autoBitmapDownload;
    }

    public boolean isContentAd() {
        return this.isContentAd;
    }

    @Override // com.startapp.sdk.adsbase.model.AdPreferences
    public boolean isSimpleToken() {
        return this.useSimpleToken;
    }

    public NativeAdPreferences setAdsNumber(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException(String.valueOf(i2));
        }
        this.adsNumber = i2;
        return this;
    }

    public NativeAdPreferences setAutoBitmapDownload(boolean z2) {
        this.autoBitmapDownload = z2;
        return this;
    }

    public NativeAdPreferences setContentAd(boolean z2) {
        this.isContentAd = z2;
        return this;
    }

    public NativeAdPreferences setImageSize(NativeAdBitmapSize nativeAdBitmapSize) {
        this.bitmapSize = nativeAdBitmapSize;
        return this;
    }

    public NativeAdPreferences setPrimaryImageSize(int i2) {
        this.primaryImage = i2;
        return this;
    }

    public NativeAdPreferences setSecondaryImageSize(int i2) {
        this.moreImage = i2;
        return this;
    }

    public String toString() {
        return super.toString();
    }

    public NativeAdPreferences useSimpleToken(boolean z2) {
        this.useSimpleToken = z2;
        return this;
    }

    public NativeAdPreferences(NativeAdPreferences nativeAdPreferences) {
        super(nativeAdPreferences);
        this.adsNumber = 1;
        this.autoBitmapDownload = false;
        this.primaryImage = -1;
        this.moreImage = -1;
        this.isContentAd = false;
        this.useSimpleToken = true;
        this.adsNumber = nativeAdPreferences.adsNumber;
        this.autoBitmapDownload = nativeAdPreferences.autoBitmapDownload;
        this.bitmapSize = nativeAdPreferences.bitmapSize;
        this.primaryImage = nativeAdPreferences.primaryImage;
        this.moreImage = nativeAdPreferences.moreImage;
        this.isContentAd = nativeAdPreferences.isContentAd;
        this.useSimpleToken = nativeAdPreferences.useSimpleToken;
    }
}
