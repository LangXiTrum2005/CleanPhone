package com.adcolony.sdk;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdColonyAdViewListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f8906a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    AdColonyAdSize f8907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    p0 f8908c;

    public AdColonyAdSize a() {
        return this.f8907b;
    }

    public p0 b() {
        return this.f8908c;
    }

    public String c() {
        return this.f8906a;
    }

    public void onClicked(AdColonyAdView adColonyAdView) {
    }

    public void onClosed(AdColonyAdView adColonyAdView) {
    }

    public void onLeftApplication(AdColonyAdView adColonyAdView) {
    }

    public void onOpened(AdColonyAdView adColonyAdView) {
    }

    public abstract void onRequestFilled(AdColonyAdView adColonyAdView);

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
    }

    public void onShow(AdColonyAdView adColonyAdView) {
    }

    public void a(p0 p0Var) {
        this.f8908c = p0Var;
    }

    public void a(String str) {
        this.f8906a = str;
    }

    public void a(AdColonyAdSize adColonyAdSize) {
        this.f8907b = adColonyAdSize;
    }
}
