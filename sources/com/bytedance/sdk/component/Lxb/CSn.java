package com.bytedance.sdk.component.Lxb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class CSn extends Lxb {
    static final /* synthetic */ boolean nBu = true;
    protected String OY;
    protected WebView QAg;

    @Override // com.bytedance.sdk.component.Lxb.Lxb
    @SuppressLint({"JavascriptInterface", "AddJavascriptInterface"})
    public void LD(nBu nbu) {
        this.QAg = nbu.Lxb;
        this.OY = nbu.lk;
        if (nbu.STP) {
            return;
        }
        lk();
    }

    @Override // com.bytedance.sdk.component.Lxb.Lxb
    public Context Lxb(nBu nbu) {
        Context context = nbu.JXs;
        if (context != null) {
            return context;
        }
        WebView webView = nbu.Lxb;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    public void ZU() {
        this.QAg.removeJavascriptInterface(this.OY);
    }

    @Override // com.bytedance.sdk.component.Lxb.Lxb
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    @SuppressLint({"AddJavascriptInterface"})
    public void lk() {
        if (!nBu && this.QAg == null) {
            throw new AssertionError();
        }
        this.QAg.addJavascriptInterface(this, this.OY);
    }

    @Override // com.bytedance.sdk.component.Lxb.Lxb
    public void LD() {
        super.LD();
        ZU();
    }

    @Override // com.bytedance.sdk.component.Lxb.Lxb
    public String Lxb() {
        return this.QAg.getUrl();
    }

    @Override // com.bytedance.sdk.component.Lxb.Lxb
    public void Lxb(String str, VVE vve) {
        if (vve != null && !TextUtils.isEmpty(vve.OY)) {
            String str2 = vve.OY;
            Lxb(str, DM.m(DM.r("javascript:(function(){   const iframe = document.querySelector(atob('", Base64.encodeToString(("iframe[src=\"" + str2 + "\"").getBytes(), 2), "'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(", str, ", atob('"), Base64.encodeToString(str2.getBytes(), 2), "'));   }})()"));
            return;
        }
        super.Lxb(str, vve);
    }

    @Override // com.bytedance.sdk.component.Lxb.Lxb
    public void Lxb(String str) {
        Lxb(str, DM.n(new StringBuilder("javascript:"), this.OY, "._handleMessageFromToutiao(", str, ")"));
    }

    private void Lxb(String str, final String str2) {
        if (this.lc || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.Lxb.CSn.1
            @Override // java.lang.Runnable
            public void run() {
                if (CSn.this.lc) {
                    return;
                }
                try {
                    CSn.this.QAg.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.ZU.post(runnable);
        } else {
            runnable.run();
        }
    }
}
