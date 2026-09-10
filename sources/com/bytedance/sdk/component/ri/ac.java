package com.bytedance.sdk.component.ri;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends ri {
    static final /* synthetic */ boolean qt = true;
    protected WebView jbs;
    protected String mj;

    public void ik() {
        if (!qt && this.jbs == null) {
            throw new AssertionError();
        }
        this.jbs.addJavascriptInterface(this, this.mj);
    }

    @Override // com.bytedance.sdk.component.ri.ri
    @JavascriptInterface
    public void invokeMethod(String str) {
        super.invokeMethod(str);
    }

    public void ka() {
        this.jbs.removeJavascriptInterface(this.mj);
    }

    @Override // com.bytedance.sdk.component.ri.ri
    public void lr(jbs jbsVar) {
        this.jbs = jbsVar.ri;
        this.mj = jbsVar.ik;
        if (jbsVar.aw) {
            return;
        }
        ik();
    }

    @Override // com.bytedance.sdk.component.ri.ri
    public Context ri(jbs jbsVar) {
        Context context = jbsVar.fi;
        if (context != null) {
            return context;
        }
        WebView webView = jbsVar.ri;
        if (webView != null) {
            return webView.getContext();
        }
        throw new IllegalStateException("WebView cannot be null!");
    }

    @Override // com.bytedance.sdk.component.ri.ri
    public void lr() {
        super.lr();
        ka();
    }

    @Override // com.bytedance.sdk.component.ri.ri
    public String ri() {
        return this.jbs.getUrl();
    }

    @Override // com.bytedance.sdk.component.ri.ri
    public void ri(String str, bgr bgrVar) {
        if (bgrVar != null && !TextUtils.isEmpty(bgrVar.mj)) {
            String str2 = bgrVar.mj;
            ri(str, String.format("javascript:(function(){   const iframe = document.querySelector(atob('%s'));   if (iframe && iframe.contentWindow) {        iframe.contentWindow.postMessage(%s, atob('%s'));   }})()", Base64.encodeToString(String.format("iframe[src=\"%s\"", str2).getBytes(), 2), str, Base64.encodeToString(str2.getBytes(), 2)));
            return;
        }
        super.ri(str, bgrVar);
    }

    @Override // com.bytedance.sdk.component.ri.ri
    public void ri(String str) {
        ri(str, "javascript:" + this.mj + "._handleMessageFromToutiao(" + str + ")");
    }

    private void ri(String str, final String str2) {
        if (this.di || TextUtils.isEmpty(str2)) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.ri.ac.1
            @Override // java.lang.Runnable
            public void run() {
                if (ac.this.di) {
                    return;
                }
                try {
                    ac.this.jbs.evaluateJavascript(str2, null);
                } catch (Throwable unused) {
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.ka.post(runnable);
        } else {
            runnable.run();
        }
    }
}
