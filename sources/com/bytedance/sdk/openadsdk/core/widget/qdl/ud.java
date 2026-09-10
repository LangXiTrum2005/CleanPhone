package com.bytedance.sdk.openadsdk.core.widget.qdl;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.exc;
import com.smartdigimkt.b0.a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ud implements qdl {
    private final AtomicInteger lnr;
    private final MessageQueue mml;
    private final boolean mzz;
    hkc qdl;
    private com.bytedance.sdk.component.tvp.mo ud;

    public ud(int i2, boolean z2, MessageQueue messageQueue) {
        this.lnr = new AtomicInteger(i2);
        this.mzz = z2;
        this.mml = messageQueue;
    }

    private void qdl(com.bytedance.sdk.component.tvp.mo moVar) {
        if (moVar == null || moVar.getWebView() == null) {
            return;
        }
        try {
            lnr.qdl(yt.qdl()).qdl(false).qdl(moVar.getWebView());
            moVar.setVerticalScrollBarEnabled(false);
            moVar.setHorizontalScrollBarEnabled(false);
            lnr.qdl(moVar);
            moVar.rdp();
            moVar.setUserAgentString(exc.qdl(moVar.getWebView(), BuildConfig.VERSION_CODE));
            moVar.setMixedContentMode(0);
            moVar.setJavaScriptEnabled(true);
            moVar.setJavaScriptCanOpenWindowsAutomatically(true);
            moVar.setDomStorageEnabled(true);
            moVar.setDatabaseEnabled(true);
            moVar.setCacheMode(-1);
            moVar.setAllowFileAccess(false);
            moVar.setSupportZoom(true);
            moVar.setBuiltInZoomControls(true);
            moVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            moVar.setUseWideViewPort(true);
        } catch (Throwable th) {
            aaj.lnr("WebViewPool", th.toString());
        }
    }

    public void ud() {
        if (this.lnr.get() <= 0) {
            return;
        }
        Objects.toString(this.lnr);
        String strMml = com.bytedance.sdk.component.adexpress.qdl.ud.ud.mml(null);
        if (this.mzz) {
            String strMml2 = com.bytedance.sdk.component.adexpress.qdl.ud.ud.mml(a.k);
            if (strMml != null && strMml.equals(strMml2)) {
                return;
            } else {
                strMml = strMml2;
            }
        }
        if (TextUtils.isEmpty(strMml)) {
            return;
        }
        try {
            com.bytedance.sdk.component.tvp.mo moVar = new com.bytedance.sdk.component.tvp.mo(new MutableContextWrapper(yt.qdl()), this.mzz ? com.bytedance.sdk.component.tvp.mo.lnr.ADS_V3 : com.bytedance.sdk.component.tvp.mo.lnr.ADS);
            this.ud = moVar;
            if (moVar.getWebView() == null) {
                return;
            }
            this.ud.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.qdl.ud.1
                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    return true;
                }
            });
            qdl(this.ud);
            Uri uriBuild = Uri.parse(strMml).buildUpon().appendQueryParameter("isPreLoad", "1").build();
            hkc hkcVar = new hkc(this.ud.getContext());
            this.qdl = hkcVar;
            hkcVar.ud(this.ud).qdl(this).qdl(this.ud);
            com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().qdl(this.ud, this.qdl);
            this.ud.a_(uriBuild.toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.qdl
    public void qdl() {
        MessageQueue messageQueue;
        if (this.mzz) {
            com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().ud(this.ud);
        } else {
            com.bytedance.sdk.component.adexpress.mzz.mzz.qdl().lnr(this.ud);
        }
        try {
            this.lnr.get();
            this.lnr.decrementAndGet();
            if (this.lnr.get() <= 0 || (messageQueue = this.mml) == null) {
                return;
            }
            messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.widget.qdl.ud.2
                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    new ud(ud.this.lnr.get(), ud.this.mzz, ud.this.mml).ud();
                    return false;
                }
            });
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
