package com.bytedance.sdk.openadsdk.core.widget.Lxb;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.kqm;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class LD implements Lxb {
    private final boolean JXs;
    private com.bytedance.sdk.component.QAg.ZU LD;
    Ivz Lxb;
    private final MessageQueue ZU;
    private final AtomicInteger lk;

    public LD(int i, boolean z, MessageQueue messageQueue) {
        this.lk = new AtomicInteger(i);
        this.JXs = z;
        this.ZU = messageQueue;
    }

    private void Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        if (zu == null || zu.getWebView() == null) {
            return;
        }
        try {
            lk.Lxb(kqm.Lxb()).Lxb(false).Lxb(zu.getWebView());
            zu.setVerticalScrollBarEnabled(false);
            zu.setHorizontalScrollBarEnabled(false);
            lk.Lxb(zu);
            zu.nBu();
            zu.setUserAgentString(com.bytedance.sdk.openadsdk.utils.kqm.Lxb(zu.getWebView(), BuildConfig.VERSION_CODE));
            zu.setMixedContentMode(0);
            zu.setJavaScriptEnabled(true);
            zu.setJavaScriptCanOpenWindowsAutomatically(true);
            zu.setDomStorageEnabled(true);
            zu.setDatabaseEnabled(true);
            zu.setCacheMode(-1);
            zu.setAllowFileAccess(false);
            zu.setSupportZoom(true);
            zu.setBuiltInZoomControls(true);
            zu.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            zu.setUseWideViewPort(true);
        } catch (Throwable th) {
            sLN.Lxb("WebViewPool", th.toString());
        }
    }

    public void LD() {
        if (this.lk.get() <= 0) {
            return;
        }
        Objects.toString(this.lk);
        String strZU = com.bytedance.sdk.component.adexpress.Lxb.LD.LD.ZU(null);
        if (this.JXs) {
            String strZU2 = com.bytedance.sdk.component.adexpress.Lxb.LD.LD.ZU("v3");
            if (strZU != null && strZU.equals(strZU2)) {
                return;
            } else {
                strZU = strZU2;
            }
        }
        if (TextUtils.isEmpty(strZU)) {
            return;
        }
        try {
            com.bytedance.sdk.component.QAg.ZU zu = new com.bytedance.sdk.component.QAg.ZU(new MutableContextWrapper(kqm.Lxb()));
            this.LD = zu;
            if (zu.getWebView() == null) {
                return;
            }
            this.LD.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.Lxb.LD.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            Lxb(this.LD);
            Uri uriBuild = Uri.parse(strZU).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            Ivz ivz = new Ivz(this.LD.getContext());
            this.Lxb = ivz;
            ivz.LD(this.LD).Lxb(this).Lxb(this.LD);
            com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().Lxb(this.LD, this.Lxb);
            this.LD.a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.Lxb
    public void Lxb() {
        MessageQueue messageQueue;
        if (this.JXs) {
            com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().LD(this.LD);
        } else {
            com.bytedance.sdk.component.adexpress.JXs.JXs.Lxb().lk(this.LD);
        }
        try {
            this.lk.get();
            this.lk.decrementAndGet();
            if (this.lk.get() <= 0 || (messageQueue = this.ZU) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.Lxb.LD.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new LD(LD.this.lk.get(), LD.this.JXs, LD.this.ZU).LD();
                    return false;
                }
            });
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
