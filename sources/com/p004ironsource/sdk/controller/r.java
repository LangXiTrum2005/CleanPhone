package com.p004ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes5.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f27016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27017b = false;

    public r(s sVar) {
        this.f27016a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f27017b) {
            return "";
        }
        this.f27017b = true;
        return this.f27016a.b();
    }
}
