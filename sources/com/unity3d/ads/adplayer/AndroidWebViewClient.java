package com.unity3d.ads.adplayer;

import an.h;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import cn.d0;
import cn.g0;
import cn.q;
import cn.q1;
import cn.r;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.GetCachedAsset;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ViewExtensionsKt;
import fn.a1;
import fn.g;
import fn.n0;
import fn.p0;
import fn.y0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import t9.e;
import wj.f;
import xj.b0;
import xj.v;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u001f¨\u0006/"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidWebViewClient;", "Landroidx/webkit/WebViewClientCompat;", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "getCachedAsset", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/domain/GetCachedAsset;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "Landroid/webkit/WebView;", "view", "", "url", "Lwj/r;", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "", "onRenderProcessGone", "(Landroid/webkit/WebView;Landroid/webkit/RenderProcessGoneDetail;)Z", "Lcom/unity3d/ads/core/domain/GetCachedAsset;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lfn/n0;", "", "Lcom/unity3d/ads/adplayer/model/WebViewClientError;", "loadErrors", "Lfn/n0;", "Lcn/q;", "_onLoadFinished", "Lcn/q;", "Lcn/g0;", "onLoadFinished", "Lcn/g0;", "getOnLoadFinished", "()Lcn/g0;", "_isRenderProcessGone", "Lfn/y0;", "isRenderProcessGone", "Lfn/y0;", "()Lfn/y0;", "webviewType", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AndroidWebViewClient extends WebViewClientCompat {
    public static final String BLANK_PAGE = "about:blank";
    private final n0 _isRenderProcessGone;
    private final q _onLoadFinished;
    private final GetCachedAsset getCachedAsset;
    private final y0 isRenderProcessGone;
    private final n0 loadErrors;
    private final g0 onLoadFinished;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final n0 webviewType;

    public AndroidWebViewClient(GetCachedAsset getCachedAsset, SendDiagnosticEvent sendDiagnosticEvent) {
        n.f(getCachedAsset, "getCachedAsset");
        n.f(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getCachedAsset = getCachedAsset;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.loadErrors = g.c(v.f53866a);
        r rVarA = d0.a();
        this._onLoadFinished = rVarA;
        this.onLoadFinished = rVarA;
        a1 a1VarC = g.c(Boolean.FALSE);
        this._isRenderProcessGone = a1VarC;
        this.isRenderProcessGone = new p0(a1VarC);
        this.webviewType = g.c("");
    }

    public final g0 getOnLoadFinished() {
        return this.onLoadFinished;
    }

    /* JADX INFO: renamed from: isRenderProcessGone, reason: from getter */
    public final y0 getIsRenderProcessGone() {
        return this.isRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        String str;
        n.f(view, "view");
        n.f(url, "url");
        if (url.equals(BLANK_PAGE)) {
            n0 n0Var = this.loadErrors;
            while (true) {
                a1 a1Var = (a1) n0Var;
                Object value = a1Var.getValue();
                str = url;
                if (a1Var.c0(value, xj.n.D0((List) value, new WebViewClientError(str, ErrorReason.REASON_WEB_BLANK, null, 4, null)))) {
                    break;
                } else {
                    url = str;
                }
            }
        } else {
            str = url;
        }
        super.onPageFinished(view, str);
        ((r) this._onLoadFinished).O(((a1) this.loadErrors).getValue());
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        a1 a1Var;
        Object value;
        n.f(view, "view");
        n.f(detail, "detail");
        ViewExtensionsKt.removeViewFromParent(view);
        view.destroy();
        if (((q1) this._onLoadFinished).L()) {
            n0 n0Var = this._isRenderProcessGone;
            Boolean bool = Boolean.TRUE;
            a1 a1Var2 = (a1) n0Var;
            a1Var2.getClass();
            a1Var2.e0(null, bool);
            return true;
        }
        n0 n0Var2 = this.loadErrors;
        do {
            a1Var = (a1) n0Var2;
            value = a1Var.getValue();
        } while (!a1Var.c0(value, xj.n.D0((List) value, new WebViewClientError(String.valueOf(view.getUrl()), ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null))));
        ((r) this._onLoadFinished).O(((a1) this.loadErrors).getValue());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        Object objC;
        n.f(view, "view");
        n.f(request, "request");
        Uri url = request.getUrl();
        if (url == null) {
            return super.shouldInterceptRequest(view, request);
        }
        try {
            try {
                objC = url.getQueryParameter("webviewType");
            } catch (Throwable th2) {
                objC = e.c(th2);
            }
            if (objC instanceof wj.g) {
                objC = null;
            }
            String str = (String) objC;
            if (str != null && !h.y0(str)) {
                a1 a1Var = (a1) this.webviewType;
                a1Var.getClass();
                a1Var.e0(null, str);
            }
            if (n.a(url.getLastPathSegment(), "favicon.ico")) {
                return new WebResourceResponse("image/png", null, null);
            }
            GetCachedAsset getCachedAsset = this.getCachedAsset;
            Uri url2 = request.getUrl();
            n.e(url2, "request.url");
            return getCachedAsset.invoke(url2, (String) ((a1) this.webviewType).getValue());
        } catch (Throwable th3) {
            String message = th3.getMessage();
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_could_not_handle_intercepted_url", (Double) null, message != null ? b0.P(new f("reason", message)) : w.f53867a, (Map) null, (AdObject) null, (Integer) null, 58, (Object) null);
            return super.shouldInterceptRequest(view, request);
        }
    }
}
