package com.p004ironsource;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes5.dex */
public class fh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ih f25022a;

    public fh(ih ihVar) {
        this.f25022a = ihVar;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f25022a.handleMessageFromAd(str);
    }
}
