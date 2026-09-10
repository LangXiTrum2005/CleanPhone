package com.vungle.ads.internal.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.MBridgeConstans;
import cutwater.trm;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: WebViewAPI.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u001d\u001eJ?\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/vungle/ads/internal/ui/view/formularize;", "", "", "collectedConsent", "", "title", PglCryptUtils.KEY_MESSAGE, "accept", "deny", "", "setConsentStatus", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/vungle/ads/internal/ui/view/formularize$attabal;", "mraidDelegate", "setMraidDelegate", "(Lcom/vungle/ads/internal/ui/view/formularize$attabal;)V", "skipCmdQueue", "notifyPropertiesChange", "(Z)V", X3.i.o, "setAdVisibility", "Lcom/vungle/ads/internal/ui/view/formularize$saneness;", "errorHandler", "setErrorHandler", "(Lcom/vungle/ads/internal/ui/view/formularize$saneness;)V", "Lwebby/wireman;", "webViewObserver", "setWebViewObserver", "(Lwebby/wireman;)V", "attabal", "saneness", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface formularize {

    /* JADX INFO: compiled from: WebViewAPI.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/ui/view/formularize$attabal;", "", "", f.b.g, "Lcutwater/trm;", "arguments", "", "processCommand", "(Ljava/lang/String;Lcutwater/trm;)Z", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface attabal {
        boolean processCommand(String command, trm arguments);
    }

    /* JADX INFO: compiled from: WebViewAPI.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/ui/view/formularize$saneness;", "", "", "errorDesc", "", "didCrash", "", "onReceivedError", "(Ljava/lang/String;Z)V", "Landroid/webkit/WebView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onWebRenderingProcessGone", "(Landroid/webkit/WebView;Ljava/lang/Boolean;)Z", "webView", "Landroid/webkit/WebViewRenderProcess;", "webViewRenderProcess", "onRenderProcessUnresponsive", "(Landroid/webkit/WebView;Landroid/webkit/WebViewRenderProcess;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface saneness {
        void onReceivedError(String errorDesc, boolean didCrash);

        void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(WebView view, Boolean didCrash);
    }

    void notifyPropertiesChange(boolean skipCmdQueue);

    void setAdVisibility(boolean isViewable);

    void setConsentStatus(boolean collectedConsent, String title, String message, String accept, String deny);

    void setErrorHandler(saneness errorHandler);

    void setMraidDelegate(attabal mraidDelegate);

    void setWebViewObserver(webby.wireman webViewObserver);
}
