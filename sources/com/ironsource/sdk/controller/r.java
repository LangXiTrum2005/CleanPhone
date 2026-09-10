package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f30504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f30505b = false;

    public r(s sVar) {
        this.f30504a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f30505b) {
            return "";
        }
        this.f30505b = true;
        return this.f30504a.b();
    }
}
