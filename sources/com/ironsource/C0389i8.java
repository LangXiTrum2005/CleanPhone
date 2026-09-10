package com.ironsource;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: com.ironsource.i8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0389i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0442l8 f28897a;

    public C0389i8(C0442l8 c0442l8) {
        this.f28897a = c0442l8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f28897a.handleMessageFromAd(str);
    }
}
