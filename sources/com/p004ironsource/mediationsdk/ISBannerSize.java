package com.p004ironsource.mediationsdk;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes5.dex */
public class ISBannerSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25711c;
    public ISContainerParams containerParams;
    private boolean d;
    public static final ISBannerSize BANNER = l.a("BANNER", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final ISBannerSize LARGE = l.a(l.f25925b, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.f25926c, 300, 250);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final ISBannerSize f25708e = l.a();
    public static final ISBannerSize SMART = l.a(l.f25927e, 0, 0);

    public ISBannerSize(int i2, int i3) {
        this(l.f, i2, i3);
    }

    public static int getMaximalAdaptiveHeight(int i2) {
        return l.b(i2);
    }

    public String getDescription() {
        return this.f25711c;
    }

    public int getHeight() {
        return this.f25710b;
    }

    public int getWidth() {
        return this.f25709a;
    }

    public boolean isAdaptive() {
        return this.d;
    }

    public boolean isSmart() {
        return this.f25711c.equals(l.f25927e);
    }

    public void setAdaptive(boolean z2) {
        this.d = z2;
    }

    public void setContainerParams(ISContainerParams iSContainerParams) {
        if (l.a(iSContainerParams, this.f25709a, this.f25710b)) {
            this.containerParams = iSContainerParams;
        }
    }

    public ISBannerSize(String str, int i2, int i3) {
        this.f25711c = str;
        this.f25709a = i2;
        this.f25710b = i3;
        this.containerParams = new ISContainerParams(i2, i3);
    }
}
