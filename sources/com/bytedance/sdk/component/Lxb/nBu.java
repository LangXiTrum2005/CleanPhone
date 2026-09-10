package com.bytedance.sdk.component.Lxb;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class nBu {
    boolean IeN;
    Context JXs;
    Lxb LD;
    WebView Lxb;
    boolean OY;
    NXR QAg;
    boolean STP;
    JVA.Lxb VVE;
    OY ZU;
    boolean ebl;
    boolean lc;
    STP nBu;
    String lk = "IESJSBridge";
    String JVA = "host";
    final Set<String> sLN = new LinkedHashSet();
    final Set<String> NXR = new LinkedHashSet();

    public nBu(WebView webView) {
        this.Lxb = webView;
    }

    private void lk() {
        if ((this.Lxb == null && !this.STP && this.LD == null) || ((TextUtils.isEmpty(this.lk) && this.Lxb != null) || this.ZU == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public nBu LD(boolean z) {
        this.ebl = z;
        return this;
    }

    public nBu Lxb(Lxb lxb) {
        this.LD = lxb;
        return this;
    }

    public kqm LD() {
        lk();
        return new kqm(this);
    }

    public nBu Lxb(String str) {
        this.lk = str;
        return this;
    }

    public nBu Lxb(sLN sln) {
        this.ZU = OY.Lxb(sln);
        return this;
    }

    public nBu Lxb(boolean z) {
        this.lc = z;
        return this;
    }

    public nBu Lxb() {
        this.IeN = true;
        return this;
    }

    public nBu() {
    }
}
