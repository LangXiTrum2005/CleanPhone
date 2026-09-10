package com.ironsource;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: com.ironsource.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3528g8 {
    private C3581j8 a;

    public C3528g8(C3581j8 c3581j8) {
        this.a = c3581j8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.a.handleMessageFromAd(str);
    }
}
