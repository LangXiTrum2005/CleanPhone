package com.startapp.sdk.ads.banner;

/* JADX INFO: loaded from: classes6.dex */
public class BannerSize {
    public static final BannerSize ZERO = new BannerSize(0, 0);
    private final int height;
    private final int width;

    public BannerSize(int i2, int i3) {
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
