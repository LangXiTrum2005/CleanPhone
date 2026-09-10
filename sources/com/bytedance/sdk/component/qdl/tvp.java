package com.bytedance.sdk.component.qdl;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class tvp {
    boolean exu;
    rq jpc;
    wd mml;
    boolean mo;
    Context mzz;
    WebView qdl;
    fs tvp;
    qdl ud;
    boolean wd;
    String lnr = "IESJSBridge";
    String to = "host";
    final Set<String> rq = new LinkedHashSet();
    final Set<String> fs = new LinkedHashSet();

    public tvp(WebView webView) {
        this.qdl = webView;
    }

    public tvp qdl(qdl qdlVar) {
        this.ud = qdlVar;
        return this;
    }

    public tvp ud(boolean z2) {
        this.wd = z2;
        return this;
    }

    private void ud() {
        if ((this.qdl == null && !this.exu && this.ud == null) || ((TextUtils.isEmpty(this.lnr) && this.qdl != null) || this.mml == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public tvp qdl(String str) {
        this.lnr = str;
        return this;
    }

    public tvp qdl(to toVar) {
        this.mml = wd.qdl(toVar);
        return this;
    }

    public tvp qdl(boolean z2) {
        this.mo = z2;
        return this;
    }

    public bjy qdl() {
        ud();
        return new bjy(this);
    }

    public tvp() {
    }
}
