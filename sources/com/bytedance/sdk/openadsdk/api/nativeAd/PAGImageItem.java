package com.bytedance.sdk.openadsdk.api.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class PAGImageItem {
    private final String lnr;
    private float mml;
    private final int qdl;
    private final int ud;

    public PAGImageItem(int i2, int i3, String str, float f) {
        this.qdl = i2;
        this.ud = i3;
        this.lnr = str;
        this.mml = f;
    }

    public float getDuration() {
        return this.mml;
    }

    public int getHeight() {
        return this.qdl;
    }

    public String getImageUrl() {
        return this.lnr;
    }

    public int getWidth() {
        return this.ud;
    }

    public PAGImageItem(int i2, int i3, String str) {
        this(i2, i3, str, 0.0f);
    }
}
