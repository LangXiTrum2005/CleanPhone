package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes3.dex */
public class TTImage {
    private final String lnr;
    private double mml;
    private final int qdl;
    private final int ud;

    public TTImage(int i2, int i3, String str, double d) {
        this.qdl = i2;
        this.ud = i3;
        this.lnr = str;
        this.mml = d;
    }

    public double getDuration() {
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

    public boolean isValid() {
        String str;
        return this.qdl > 0 && this.ud > 0 && (str = this.lnr) != null && str.length() > 0;
    }

    public TTImage(int i2, int i3, String str) {
        this(i2, i3, str, 0.0d);
    }
}
