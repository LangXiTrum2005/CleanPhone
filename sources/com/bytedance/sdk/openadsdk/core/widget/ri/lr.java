package com.bytedance.sdk.openadsdk.core.widget.ri;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.tan;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements ri {
    private final boolean fi;
    private final AtomicInteger ik;
    private final MessageQueue ka;
    private com.bytedance.sdk.component.jbs.di lr;
    dzy ri;

    public lr(int i, boolean z, MessageQueue messageQueue) {
        this.ik = new AtomicInteger(i);
        this.fi = z;
        this.ka = messageQueue;
    }

    private void ri(com.bytedance.sdk.component.jbs.di diVar) {
        if (diVar == null || diVar.getWebView() == null) {
            return;
        }
        try {
            ik.ri(nr.ri()).ri(false).ri(diVar.getWebView());
            diVar.setVerticalScrollBarEnabled(false);
            diVar.setHorizontalScrollBarEnabled(false);
            ik.ri(diVar);
            diVar.bgr();
            diVar.setUserAgentString(tan.ri(diVar.getWebView(), BuildConfig.VERSION_CODE));
            diVar.setMixedContentMode(0);
            diVar.setJavaScriptEnabled(true);
            diVar.setJavaScriptCanOpenWindowsAutomatically(true);
            diVar.setDomStorageEnabled(true);
            diVar.setDatabaseEnabled(true);
            diVar.setCacheMode(-1);
            diVar.setAllowFileAccess(false);
            diVar.setSupportZoom(true);
            diVar.setBuiltInZoomControls(true);
            diVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            diVar.setUseWideViewPort(true);
        } catch (Throwable th) {
            ac.ik("WebViewPool", th.toString());
        }
    }

    public void lr() {
        if (this.ik.get() <= 0) {
            return;
        }
        Objects.toString(this.ik);
        String strKa = com.bytedance.sdk.component.adexpress.ri.lr.lr.ka(null);
        if (this.fi) {
            String strKa2 = com.bytedance.sdk.component.adexpress.ri.lr.lr.ka("v3");
            if (strKa != null && strKa.equals(strKa2)) {
                return;
            } else {
                strKa = strKa2;
            }
        }
        if (TextUtils.isEmpty(strKa)) {
            return;
        }
        try {
            com.bytedance.sdk.component.jbs.di diVar = new com.bytedance.sdk.component.jbs.di(new MutableContextWrapper(nr.ri()), this.fi ? com.bytedance.sdk.component.jbs.di.ik.ADS_V3 : com.bytedance.sdk.component.jbs.di.ik.ADS);
            this.lr = diVar;
            if (diVar.getWebView() == null) {
                return;
            }
            this.lr.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.lr.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            ri(this.lr);
            Uri uriBuild = Uri.parse(strKa).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            dzy dzyVar = new dzy(this.lr.getContext());
            this.ri = dzyVar;
            dzyVar.lr(this.lr).ri(this).ri(this.lr);
            com.bytedance.sdk.component.adexpress.fi.fi.ri().ri(this.lr, this.ri);
            this.lr.a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ri.ri
    public void ri() {
        MessageQueue messageQueue;
        if (this.fi) {
            com.bytedance.sdk.component.adexpress.fi.fi.ri().lr(this.lr);
        } else {
            com.bytedance.sdk.component.adexpress.fi.fi.ri().ik(this.lr);
        }
        try {
            this.ik.get();
            this.ik.decrementAndGet();
            if (this.ik.get() <= 0 || (messageQueue = this.ka) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.ri.lr.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new lr(lr.this.ik.get(), lr.this.fi, lr.this.ka).lr();
                    return false;
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
