package com.adcolony.sdk;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes.dex */
public class AdColonyAdSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f8892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8893b;
    public static final AdColonyAdSize MEDIUM_RECTANGLE = new AdColonyAdSize(300, 250);
    public static final AdColonyAdSize BANNER = new AdColonyAdSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final AdColonyAdSize LEADERBOARD = new AdColonyAdSize(728, 90);
    public static final AdColonyAdSize SKYSCRAPER = new AdColonyAdSize(160, 600);

    public AdColonyAdSize(int i2, int i3) {
        this.f8892a = i2;
        this.f8893b = i3;
    }

    public int getHeight() {
        return this.f8893b;
    }

    public int getWidth() {
        return this.f8892a;
    }
}
